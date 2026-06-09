//###Test START##
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

public class Neo4jRealmSearchDAOFewShotTest {

    private Neo4jRealmSearchDAO searchDAO;

    private RealmDAO realmDAO;

    private PlainSchemaDAO plainSchemaDAO;

    private RealmUtils realmUtils;

    private Neo4jClient neo4jClient;

    private Neo4jTemplate neo4jTemplate;

    private static class DummyFields {

        public String name;
    }

    @BeforeEach
    public void setup() {
        realmDAO = mock(RealmDAO.class);
        plainSchemaDAO = mock(PlainSchemaDAO.class);
        realmUtils = mock(RealmUtils.class);
        neo4jClient = mock(Neo4jClient.class, RETURNS_DEEP_STUBS);
        neo4jTemplate = mock(Neo4jTemplate.class);

        searchDAO = new TestNeo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                mock(UserDAO.class),
                mock(GroupDAO.class),
                mock(EntityFactory.class),
                null,
                realmUtils,
                neo4jTemplate,
                neo4jClient);
    }

    private Field mockField() {
        try {
            return DummyFields.class.getDeclaredField("name");
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private PlainSchema mockSchema(
            final String key,
            final AttrSchemaType type,
            final boolean unique) {

        PlainSchema schema = mock(PlainSchema.class);

        when(schema.getKey()).thenReturn(key);
        when(schema.getType()).thenReturn(type);
        when(schema.isUniqueConstraint()).thenReturn(unique);

        return schema;
    }

    /**
     * Helper subclass exposing protected methods for testing purposes.
     */
    private static class TestNeo4jRealmSearchDAO extends Neo4jRealmSearchDAO {

        TestNeo4jRealmSearchDAO(
                final RealmDAO realmDAO,
                final PlainSchemaDAO plainSchemaDAO,
                final UserDAO userDAO,
                final GroupDAO groupDAO,
                final EntityFactory entityFactory,
                final org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager validator,
                final RealmUtils realmUtils,
                final Neo4jTemplate neo4jTemplate,
                final Neo4jClient neo4jClient) {

            super(
                    realmDAO,
                    plainSchemaDAO,
                    userDAO,
                    groupDAO,
                    entityFactory,
                    validator,
                    realmUtils,
                    neo4jTemplate,
                    neo4jClient);
        }

        public List<String> callParseOrderBy(final Streamable<Sort.Order> orderBy) {
            return parseOrderBy(orderBy);
        }

        public long callDoCount(final Set<String> bases, final SearchCond cond) {
            return doCount(bases, cond);
        }

        public List<Realm> callDoSearch(
                final Set<String> bases,
                final SearchCond cond,
                final PageRequest pageRequest) {

            return doSearch(bases, cond, pageRequest);
        }
    }

    @Test
    @DisplayName("TC1: findByFullPath returns existing realm")
    public void testTC1_findByFullPath() {
        Realm realm = mock(Realm.class);

        when(neo4jClient.query(anyString())
                .bindAll(Map.of("fullPath", "/even"))
                .fetch()
                .one())
                .thenReturn(Optional.of(Map.of("n.id", "realm-id")));

        doReturn(Optional.of(realm))
                .when(realmDAO).findById("realm-id");

        Optional<Realm> result = searchDAO.findByFullPath("/even");

        assertTrue(result.isPresent());
        assertEquals(realm, result.get());
    }

    @Test
    @DisplayName("TC2: malformed path throws exception")
    public void testTC2_findByFullPath_Invalid() {
        assertThrows(
                MalformedPathException.class,
                () -> searchDAO.findByFullPath("invalid/path"));
    }

    @Test
    @DisplayName("TC3: findByName resolves all realms")
    public void testTC3_findByName() {
        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);

        when(neo4jClient.query(anyString())
                .bindAll(Map.of("name", "finance"))
                .fetch()
                .all())
                .thenReturn(List.of(
                        Map.of("n.id", "id1"),
                        Map.of("n.id", "id2")));

        doReturn(Optional.of(realm1))
                .when(realmDAO).findById("id1");

        doReturn(Optional.of(realm2))
                .when(realmDAO).findById("id2");

        List<Realm> result = searchDAO.findByName("finance");

        assertEquals(2, result.size());
    }

    @Test
    @DisplayName("TC4: findChildren returns children")
    public void testTC4_findChildren() {
        Realm parent = mock(Realm.class);
        Realm child = mock(Realm.class);

        when(parent.getKey()).thenReturn("parent-id");

        when(neo4jClient.query(anyString())
                .bindAll(Map.of("id", "parent-id"))
                .fetch()
                .all())
                .thenReturn(List.of(Map.of("c.id", "child-id")));

        doReturn(Optional.of(child))
                .when(realmDAO).findById("child-id");

        List<Realm> result = searchDAO.findChildren(parent);

        assertEquals(1, result.size());
        assertEquals(child, result.get(0));
    }

    @Test
    @DisplayName("TC5: findDescendants with prefix")
    public void testTC5_findDescendants_WithPrefix() {

        when(neo4jClient.query(anyString())
                .bindAll(argThat((Map<String, Object> map) ->
                        "/base".equals(map.get("base"))
                                && "/base/.*".equals(map.get("like"))
                                && "/base/test".equals(map.get("prefix"))
                                && "/base/test/.*".equals(map.get("likePrefix"))))
                .fetch()
                .all())
                .thenReturn(List.of());

        List<Realm> result = searchDAO.findDescendants("/base", "/base/test");

        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("TC6: parseOrderBy with realm field")
    public void testTC6_parseOrderBy_Field() {

        when(realmUtils.getField("name"))
                .thenReturn(Optional.of(mockField()));

        List<String> result =
                ((TestNeo4jRealmSearchDAO) searchDAO)
                        .callParseOrderBy(Streamable.of(Sort.Order.asc("name")));

        assertEquals(1, result.size());
        assertEquals("name ASC", result.get(0));
    }

    @Test
    @DisplayName("TC7: parseOrderBy with multiple unique schemas throws exception")
    public void testTC7_parseOrderBy_Invalid() {

        PlainSchema schema1 = mockSchema("code1", AttrSchemaType.String, true);
        PlainSchema schema2 = mockSchema("code2", AttrSchemaType.String, true);

        when(realmUtils.getField(anyString()))
                .thenReturn(Optional.empty());

        doReturn(Optional.of(schema1))
                .when(plainSchemaDAO).findById("code1");

        doReturn(Optional.of(schema2))
                .when(plainSchemaDAO).findById("code2");

        assertThrows(
                SyncopeClientException.class,
                () -> ((TestNeo4jRealmSearchDAO) searchDAO).callParseOrderBy(
                        Streamable.of(
                                Sort.Order.asc("code1"),
                                Sort.Order.asc("code2"))));
    }

    @Test
    @DisplayName("TC8: doCount returns Neo4j count")
    public void testTC8_doCount() {

        searchDAO = new TestNeo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                null,
                null,
                null,
                null,
                realmUtils,
                neo4jTemplate,
                neo4jClient) {

            @Override
            protected QueryInfo getQuery(
                    final SearchCond cond,
                    final Map<String, Object> parameters) {

                parameters.put("param0", "demo");

                return new QueryInfo(
                        new TextStringBuilder("MATCH (n) WHERE n.name=$param0 "),
                        new HashSet<>(),
                        new HashSet<>());
            }
        };

        when(neo4jTemplate.count(anyString(), anyMap()))
                .thenReturn(5L);

        long result = ((TestNeo4jRealmSearchDAO) searchDAO)
                .callDoCount(Set.of("/"), mock(SearchCond.class));

        assertEquals(5L, result);
    }

    @Test
    @DisplayName("TC9: doSearch applies pagination")
    public void testTC9_doSearch() {

        searchDAO = new TestNeo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                null,
                null,
                null,
                null,
                realmUtils,
                neo4jTemplate,
                neo4jClient) {

            @Override
            protected QueryInfo getQuery(
                    final SearchCond cond,
                    final Map<String, Object> parameters) {

                parameters.put("param0", "realm");

                return new QueryInfo(
                        new TextStringBuilder("MATCH (n) WHERE n.name=$param0 "),
                        new HashSet<>(Set.of("name")),
                        new HashSet<>());
            }
        };

        Realm realm = mock(Realm.class);

        when(realmUtils.getField("name"))
                .thenReturn(Optional.of(mockField()));

        when(neo4jClient.query(argThat((String query) ->
                query.contains("SKIP 10")
                        && query.contains("LIMIT 10")))
                .bindAll(anyMap())
                .fetch()
                .all())
                .thenReturn(List.of(Map.of("id", "realm-id")));

        doReturn(Optional.of(realm))
                .when(realmDAO).findById("realm-id");

        List<Realm> result =
                ((TestNeo4jRealmSearchDAO) searchDAO).callDoSearch(
                        Set.of("/"),
                        mock(SearchCond.class),
                        PageRequest.of(1, 10, Sort.by("name")));

        assertEquals(1, result.size());
        assertEquals(realm, result.get(0));
    }
}
//###Test END##
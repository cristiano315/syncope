//###Test START##
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.apache.syncope.core.persistence.neo4j.entity.Neo4jRealm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

class Neo4jRealmSearchDAO2LLMTest {

    private RealmDAO realmDAO;

    private PlainSchemaDAO plainSchemaDAO;

    private UserDAO userDAO;

    private GroupDAO groupDAO;

    private EntityFactory entityFactory;

    private PlainAttrValidationManager validator;

    private RealmUtils realmUtils;

    private Neo4jTemplate neo4jTemplate;

    private Neo4jClient neo4jClient;

    private TestableNeo4jRealmSearchDAO2 dao;

    /*
     * Fixture used only to provide real java.lang.reflect.Field instances.
     * RealmUtils#getField returns Optional<Field>, not Optional<String>.
     */
    private static final class RealmFieldFixture {

        private String name;

        private String id;
    }

    private static class TestableNeo4jRealmSearchDAO2 extends Neo4jRealmSearchDAO2 {

        TestableNeo4jRealmSearchDAO2(
                final RealmDAO realmDAO,
                final PlainSchemaDAO plainSchemaDAO,
                final UserDAO userDAO,
                final GroupDAO groupDAO,
                final EntityFactory entityFactory,
                final PlainAttrValidationManager validator,
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

        List<String> exposedParseOrderBy(final Streamable<Sort.Order> orderBy) {
            return parseOrderBy(orderBy);
        }

        List<Realm> exposedToList(
                final Collection<Map<String, Object>> result,
                final String property) {

            return toList(result, property);
        }
    }

    @BeforeEach
    void setup() {
        realmDAO = mock(RealmDAO.class);
        plainSchemaDAO = mock(PlainSchemaDAO.class);
        userDAO = mock(UserDAO.class);
        groupDAO = mock(GroupDAO.class);
        entityFactory = mock(EntityFactory.class);
        validator = mock(PlainAttrValidationManager.class);
        realmUtils = mock(RealmUtils.class);
        neo4jTemplate = mock(Neo4jTemplate.class);
        neo4jClient = mock(Neo4jClient.class, RETURNS_DEEP_STUBS);

        dao = new TestableNeo4jRealmSearchDAO2(
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

    private static Realm realm(final String key) {
        Realm realm = mock(Realm.class);
        when(realm.getKey()).thenReturn(key);
        return realm;
    }

    private static PlainSchema schema(
            final String key,
            final AttrSchemaType type,
            final boolean uniqueConstraint) {

        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn(key);
        when(schema.getType()).thenReturn(type);
        when(schema.isUniqueConstraint()).thenReturn(uniqueConstraint);
        return schema;
    }

    private static Optional<Field> fixtureField(final String name) {
        try {
            return Optional.of(RealmFieldFixture.class.getDeclaredField(name));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    @Test
    @DisplayName("TC-001 findByFullPath returns realm when full path exists")
    void findByFullPathReturnsRealm() {
        Realm expected = realm("realm-1");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.of(Map.of("n.id", "realm-1")));
        doReturn(Optional.of(expected)).when(realmDAO).findById("realm-1");

        Optional<Realm> actual = dao.findByFullPath("/even/two");

        assertTrue(actual.isPresent());
        assertSame(expected, actual.orElseThrow());
    }

    @Test
    @DisplayName("TC-002 findByFullPath accepts root realm")
    void findByFullPathAcceptsRootRealm() {
        Realm root = realm("root");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.of(Map.of("n.id", "root")));
        doReturn(Optional.of(root)).when(realmDAO).findById("root");

        Optional<Realm> actual = dao.findByFullPath(SyncopeConstants.ROOT_REALM);

        assertTrue(actual.isPresent());
        assertSame(root, actual.orElseThrow());
    }

    @Test
    @DisplayName("TC-003 findByFullPath returns empty when Neo4j returns no node")
    void findByFullPathReturnsEmptyWhenNeo4jReturnsNoNode() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.empty());

        Optional<Realm> actual = dao.findByFullPath("/missing");

        assertFalse(actual.isPresent());
    }

    @Test
    @DisplayName("TC-004 findByFullPath returns empty when DAO cannot resolve returned id")
    void findByFullPathReturnsEmptyWhenRealmIsNotResolved() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.of(Map.of("n.id", "stale")));
        doReturn(Optional.empty()).when(realmDAO).findById("stale");

        Optional<Realm> actual = dao.findByFullPath("/stale");

        assertFalse(actual.isPresent());
    }

    @Test
    @DisplayName("TC-005 findByFullPath rejects blank path")
    void findByFullPathRejectsBlankPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath("   "));
    }

    @Test
    @DisplayName("TC-006 findByFullPath rejects malformed path")
    void findByFullPathRejectsMalformedPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath("invalid-path"));
    }

    @Test
    @DisplayName("TC-007 findByName returns resolved realms")
    void findByNameReturnsResolvedRealms() {
        Realm first = realm("id-1");
        Realm second = realm("id-2");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "id-1"), Map.of("n.id", "id-2")));
        doReturn(Optional.of(first)).when(realmDAO).findById("id-1");
        doReturn(Optional.of(second)).when(realmDAO).findById("id-2");

        List<Realm> actual = dao.findByName("engineering");

        assertEquals(List.of(first, second), actual);
    }

    @Test
    @DisplayName("TC-008 findByName filters ids not resolved by RealmDAO")
    void findByNameFiltersUnresolvedIds() {
        Realm resolved = realm("id-1");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "id-1"), Map.of("n.id", "missing")));
        doReturn(Optional.of(resolved)).when(realmDAO).findById("id-1");
        doReturn(Optional.empty()).when(realmDAO).findById("missing");

        List<Realm> actual = dao.findByName("engineering");

        assertEquals(List.of(resolved), actual);
    }

    @Test
    @DisplayName("TC-009 findByName returns empty list when query has no rows")
    void findByNameReturnsEmptyList() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of());

        List<Realm> actual = dao.findByName("unknown");

        assertTrue(actual.isEmpty());
    }

    @Test
    @DisplayName("TC-010 findChildren returns direct children")
    void findChildrenReturnsDirectChildren() {
        Realm parent = realm("parent");
        Realm child = realm("child");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("c.id", "child")));
        doReturn(Optional.of(child)).when(realmDAO).findById("child");

        List<Realm> actual = dao.findChildren(parent);

        assertEquals(List.of(child), actual);
    }

    @Test
    @DisplayName("TC-011 findChildren returns empty list for leaf realm")
    void findChildrenReturnsEmptyForLeafRealm() {
        Realm parent = realm("leaf");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of());

        List<Realm> actual = dao.findChildren(parent);

        assertTrue(actual.isEmpty());
    }

    @Test
    @DisplayName("TC-012 findDescendants returns base and descendants without prefix")
    void findDescendantsWithoutPrefix() {
        Realm base = realm("base");
        Realm child = realm("child");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "base"), Map.of("n.id", "child")));
        doReturn(Optional.of(base)).when(realmDAO).findById("base");
        doReturn(Optional.of(child)).when(realmDAO).findById("child");

        List<Realm> actual = dao.findDescendants("/even", null);

        assertEquals(List.of(base, child), actual);
    }

    @Test
    @DisplayName("TC-013 findDescendants applies prefix restriction")
    void findDescendantsWithPrefix() {
        Realm prefixed = realm("prefixed");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "prefixed")));
        doReturn(Optional.of(prefixed)).when(realmDAO).findById("prefixed");

        List<Realm> actual = dao.findDescendants("/even", "/even/two");

        assertEquals(List.of(prefixed), actual);
    }

    @Test
    @DisplayName("TC-014 findDescendants supports root realm wildcard")
    void findDescendantsRootWildcard() {
        Realm root = realm("root");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "root")));
        doReturn(Optional.of(root)).when(realmDAO).findById("root");

        List<Realm> actual = dao.findDescendants(SyncopeConstants.ROOT_REALM, null);

        assertEquals(List.of(root), actual);
    }

    @Test
    @DisplayName("TC-015 setParameter stores generated parameter names incrementally")
    void setParameterStoresGeneratedParameterNames() {
        Map<String, Object> parameters = new HashMap<>();

        String first = Neo4jRealmSearchDAO2.setParameter(parameters, "one");
        String second = Neo4jRealmSearchDAO2.setParameter(parameters, 2);

        assertEquals("param0", first);
        assertEquals("param1", second);
        assertEquals("one", parameters.get("param0"));
        assertEquals(2, parameters.get("param1"));
    }

    @Test
    @DisplayName("TC-016 escapeIfString quotes only string values")
    void escapeIfStringQuotesOnlyWhenRequested() {
        assertEquals("\"abc\"", Neo4jRealmSearchDAO2.escapeIfString("abc", true));
        assertEquals("123", Neo4jRealmSearchDAO2.escapeIfString("123", false));
    }

    @Test
    @DisplayName("TC-017 appendPlainAttrCond uses direct schema property for unique schema")
    void appendPlainAttrCondUsesDirectPropertyForUniqueSchema() {
        PlainSchema email = schema("email", AttrSchemaType.String, true);
        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO2.appendPlainAttrCond(query, email, "=$param0");

        assertTrue(query.toString().contains("email."));
        assertTrue(query.toString().contains("=$param0"));
        assertFalse(query.toString().contains("any(k IN"));
    }

    @Test
    @DisplayName("TC-018 appendPlainAttrCond uses any() expression for multivalue schema")
    void appendPlainAttrCondUsesAnyForMultivalueSchema() {
        PlainSchema tags = schema("tags", AttrSchemaType.String, false);
        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO2.appendPlainAttrCond(query, tags, "=$param0");

        assertTrue(query.toString().contains("any(k IN tags WHERE k."));
        assertTrue(query.toString().contains("=$param0"));
    }

    @Test
    @DisplayName("TC-019 queryOp combines subqueries with EXISTS and boolean operator")
    void queryOpCombinesSubqueries() {
        Neo4jRealmSearchDAO2.QueryInfo left = new Neo4jRealmSearchDAO2.QueryInfo(
                new TextStringBuilder("WHERE n.name = $param0"),
                new LinkedHashSet<>(),
                new LinkedHashSet<>());

        Neo4jRealmSearchDAO2.QueryInfo right = new Neo4jRealmSearchDAO2.QueryInfo(
                new TextStringBuilder("MATCH (n) WHERE n.fullPath = $param1"),
                new LinkedHashSet<>(),
                new LinkedHashSet<>());

        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO2.queryOp(query, "AND", left, right);

        assertTrue(query.toString().contains("WHERE EXISTS"));
        assertTrue(query.toString().contains("AND EXISTS"));
        assertTrue(query.toString().contains("MATCH (n) WHERE n.name = $param0"));
        assertTrue(query.toString().contains("MATCH (n) WHERE n.fullPath = $param1"));
    }

    @Test
    @DisplayName("TC-020 toList converts Neo4j rows to resolved Realm instances")
    void toListConvertsRowsToRealms() {
        Realm resolved = realm("resolved");

        doReturn(Optional.of(resolved)).when(realmDAO).findById("resolved");
        doReturn(Optional.empty()).when(realmDAO).findById("missing");

        List<Realm> actual = dao.exposedToList(
                List.of(Map.of("id", "resolved"), Map.of("id", "missing")),
                "id");

        assertEquals(List.of(resolved), actual);
    }

    @Test
    @DisplayName("TC-021 parseOrderBy accepts Realm field order")
    void parseOrderByAcceptsRealmFieldOrder() {
        when(realmUtils.getField("name")).thenReturn(fixtureField("name"));

        List<String> actual = dao.exposedParseOrderBy(Streamable.of(Sort.Order.asc("name")));

        assertEquals(List.of("name ASC"), actual);
    }

    @Test
    @DisplayName("TC-022 parseOrderBy accepts one unique plain schema")
    void parseOrderByAcceptsOneUniquePlainSchema() {
        PlainSchema email = schema("email", AttrSchemaType.String, true);

        when(realmUtils.getField("email")).thenReturn(Optional.empty());
        doReturn(Optional.of(email)).when(plainSchemaDAO).findById("email");

        List<String> actual = dao.exposedParseOrderBy(Streamable.of(Sort.Order.desc("email")));

        assertEquals(List.of("email DESC"), actual);
    }

    @Test
    @DisplayName("TC-023 parseOrderBy accepts one non-unique plain schema")
    void parseOrderByAcceptsOneNonUniquePlainSchema() {
        PlainSchema tags = schema("tags", AttrSchemaType.String, false);

        when(realmUtils.getField("tags")).thenReturn(Optional.empty());
        doReturn(Optional.of(tags)).when(plainSchemaDAO).findById("tags");

        List<String> actual = dao.exposedParseOrderBy(Streamable.of(Sort.Order.asc("tags")));

        assertEquals(List.of("tags ASC"), actual);
    }

    @Test
    @DisplayName("TC-024 parseOrderBy ignores unknown non-field non-schema property")
    void parseOrderByIgnoresUnknownProperty() {
        when(realmUtils.getField("unknown")).thenReturn(Optional.empty());
        doReturn(Optional.empty()).when(plainSchemaDAO).findById("unknown");

        List<String> actual = dao.exposedParseOrderBy(Streamable.of(Sort.Order.asc("unknown")));

        assertTrue(actual.isEmpty());
    }

    @Test
    @DisplayName("TC-025 parseOrderBy rejects more than one unique plain schema")
    void parseOrderByRejectsMoreThanOneUniquePlainSchema() {
        PlainSchema email = schema("email", AttrSchemaType.String, true);
        PlainSchema code = schema("code", AttrSchemaType.String, true);

        when(realmUtils.getField("email")).thenReturn(Optional.empty());
        when(realmUtils.getField("code")).thenReturn(Optional.empty());
        doReturn(Optional.of(email)).when(plainSchemaDAO).findById("email");
        doReturn(Optional.of(code)).when(plainSchemaDAO).findById("code");

        SyncopeClientException ex = assertThrows(
                SyncopeClientException.class,
                () -> dao.exposedParseOrderBy(Streamable.of(
                        Sort.Order.asc("email"),
                        Sort.Order.asc("code"))));

        assertInstanceOf(SyncopeClientException.class, ex);
        assertTrue(ex.getElements().stream().anyMatch(
                element -> element.contains("Order by more than one attribute is not allowed")));
    }

    @Test
    @DisplayName("TC-026 parseOrderBy rejects more than one non-unique plain schema")
    void parseOrderByRejectsMoreThanOneNonUniquePlainSchema() {
        PlainSchema tags = schema("tags", AttrSchemaType.String, false);
        PlainSchema aliases = schema("aliases", AttrSchemaType.String, false);

        when(realmUtils.getField("tags")).thenReturn(Optional.empty());
        when(realmUtils.getField("aliases")).thenReturn(Optional.empty());
        doReturn(Optional.of(tags)).when(plainSchemaDAO).findById("tags");
        doReturn(Optional.of(aliases)).when(plainSchemaDAO).findById("aliases");

        SyncopeClientException ex = assertThrows(
                SyncopeClientException.class,
                () -> dao.exposedParseOrderBy(Streamable.of(
                        Sort.Order.asc("tags"),
                        Sort.Order.desc("aliases"))));

        assertInstanceOf(SyncopeClientException.class, ex);
        assertTrue(ex.getElements().stream().anyMatch(
                element -> element.contains("Order by more than one attribute is not allowed")));
    }
}
//###Test END##
//###Test START##
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

@ExtendWith(MockitoExtension.class)
class Neo4jRealmSearchDAO3LLMTest {

    @Mock
    private RealmDAO realmDAO;

    @Mock
    private PlainSchemaDAO plainSchemaDAO;

    @Mock
    private UserDAO userDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private EntityFactory entityFactory;

    @Mock
    private PlainAttrValidationManager validator;

    @Mock
    private RealmUtils realmUtils;

    @Mock
    private Neo4jTemplate neo4jTemplate;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private Neo4jClient neo4jClient;

    private TestableNeo4jRealmSearchDAO dao;

    private static class RealmSearchFields {

        private String id;

        private String name;

        private String fullPath;
    }

    private static Field field(final String name) {
        try {
            return RealmSearchFields.class.getDeclaredField(name);
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }

    private static class TestableNeo4jRealmSearchDAO extends Neo4jRealmSearchDAO3 {

        TestableNeo4jRealmSearchDAO(
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

        List<Realm> exposedToList(final Collection<Map<String, Object>> result, final String property) {
            return toList(result, property);
        }

        List<String> exposedParseOrderBy(final Streamable<Sort.Order> orderBy) {
            return parseOrderBy(orderBy);
        }

        void exposedWrapQuery(
                final Set<String> bases,
                final QueryInfo queryInfo,
                final Streamable<Sort.Order> orderBy,
                final Map<String, Object> parameters) {

            wrapQuery(bases, queryInfo, orderBy, parameters);
        }
    }

    @BeforeEach
    void setUp() {
        dao = new TestableNeo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                userDAO,
                groupDAO,
                entityFactory,
                validator,
                realmUtils,
                neo4jTemplate,
                neo4jClient);

        lenient().when(realmUtils.getField("name")).thenReturn(Optional.of(field("name")));
        lenient().when(realmUtils.getField("fullPath")).thenReturn(Optional.of(field("fullPath")));
        lenient().when(realmUtils.getField("id")).thenReturn(Optional.of(field("id")));
    }

    @Test
    void constructorWithExplicitDependenciesShouldCreateDAO() {
        Neo4jRealmSearchDAO3 created = new Neo4jRealmSearchDAO3(
                realmDAO,
                plainSchemaDAO,
                userDAO,
                groupDAO,
                entityFactory,
                validator,
                realmUtils,
                neo4jTemplate,
                neo4jClient);

        assertNotNull(created);
    }

    @Test
    void constructorWithDependencyRecordShouldCreateDAO() {
        Neo4jRealmSearchDAO3.DAODependencies deps = new Neo4jRealmSearchDAO3.DAODependencies(
                realmDAO,
                plainSchemaDAO,
                userDAO,
                groupDAO,
                entityFactory,
                validator,
                realmUtils,
                neo4jTemplate,
                neo4jClient);

        Neo4jRealmSearchDAO3 created = new Neo4jRealmSearchDAO3(deps);

        assertNotNull(created);
    }

    @Test
    void findByFullPathShouldReturnRealmWhenPathExists() {
        Realm realm = mock(Realm.class);

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.of(Map.of("n.id", "realm-1")));
        doReturn(Optional.of(realm)).when(realmDAO).findById("realm-1");

        Optional<Realm> result = dao.findByFullPath("/even/two");

        assertTrue(result.isPresent());
        assertEquals(realm, result.get());
    }

    @Test
    void findByFullPathShouldReturnEmptyWhenNeo4jDoesNotFindRealm() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.empty());

        Optional<Realm> result = dao.findByFullPath("/missing");

        assertTrue(result.isEmpty());
    }

    @Test
    void findByFullPathShouldReturnEmptyWhenIdCannotBeResolvedByDAO() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.of(Map.of("n.id", "ghost")));
        doReturn(Optional.empty()).when(realmDAO).findById("ghost");

        Optional<Realm> result = dao.findByFullPath("/ghost");

        assertTrue(result.isEmpty());
    }

    @Test
    void findByFullPathShouldAcceptRootRealm() {
        Realm root = mock(Realm.class);

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.of(Map.of("n.id", "root")));
        doReturn(Optional.of(root)).when(realmDAO).findById("root");

        Optional<Realm> result = dao.findByFullPath(SyncopeConstants.ROOT_REALM);

        assertTrue(result.isPresent());
        assertEquals(root, result.get());
    }

    @Test
    void findByFullPathShouldRejectBlankPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath(" "));
    }

    @Test
    void findByFullPathShouldRejectNullPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath(null));
    }

    @Test
    void findByFullPathShouldRejectMalformedPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath("invalid/path"));
    }

    @Test
    void findByNameShouldReturnResolvedRealmsOnly() {
        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(
                        Map.of("n.id", "realm-1"),
                        Map.of("n.id", "realm-2"),
                        Map.of("n.id", "missing")));

        doReturn(Optional.of(realm1)).when(realmDAO).findById("realm-1");
        doReturn(Optional.of(realm2)).when(realmDAO).findById("realm-2");
        doReturn(Optional.empty()).when(realmDAO).findById("missing");

        List<Realm> result = dao.findByName("two");

        assertEquals(List.of(realm1, realm2), result);
    }

    @Test
    void findByNameShouldReturnEmptyListWhenNothingMatches() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of());

        List<Realm> result = dao.findByName("unknown");

        assertTrue(result.isEmpty());
    }

    @Test
    void findChildrenShouldReturnResolvedChildrenOnly() {
        Realm parent = mock(Realm.class);
        Realm child = mock(Realm.class);

        when(parent.getKey()).thenReturn("parent-key");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(
                        Map.of("c.id", "child-1"),
                        Map.of("c.id", "missing-child")));

        doReturn(Optional.of(child)).when(realmDAO).findById("child-1");
        doReturn(Optional.empty()).when(realmDAO).findById("missing-child");

        List<Realm> result = dao.findChildren(parent);

        assertEquals(List.of(child), result);
    }

    @Test
    void findChildrenShouldBindParentKey() {
        Realm parent = mock(Realm.class);
        when(parent.getKey()).thenReturn("parent-key");

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of());

        dao.findChildren(parent);

        verify(parent).getKey();
    }

    @Test
    void findChildrenShouldThrowWhenRealmIsNull() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> dao.findChildren(null));

        assertInstanceOf(NullPointerException.class, exception);
    }

    @Test
    void findDescendantsShouldSearchBaseOnlyWhenPrefixIsNull() {
        Realm base = mock(Realm.class);

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "base")));
        doReturn(Optional.of(base)).when(realmDAO).findById("base");

        List<Realm> result = dao.findDescendants("/even", null);

        assertEquals(List.of(base), result);
    }

    @Test
    void findDescendantsShouldSearchBaseAndPrefixWhenPrefixIsProvided() {
        Realm prefixed = mock(Realm.class);

        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of(Map.of("n.id", "prefixed")));
        doReturn(Optional.of(prefixed)).when(realmDAO).findById("prefixed");

        List<Realm> result = dao.findDescendants("/even", "/even/two");

        assertEquals(List.of(prefixed), result);
    }

    @Test
    void findDescendantsShouldUseRootLikeExpressionForRootBase() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().all()).
                thenReturn(List.of());

        dao.findDescendants(SyncopeConstants.ROOT_REALM, null);

        ArgumentCaptor<Map<String, Object>> parametersCaptor = ArgumentCaptor.forClass(Map.class);
        verify(neo4jClient.query(anyString()), atLeastOnce()).bindAll(parametersCaptor.capture());

        Map<String, Object> actualParameters = parametersCaptor.getAllValues().
                get(parametersCaptor.getAllValues().size() - 1);

        assertEquals(SyncopeConstants.ROOT_REALM, actualParameters.get("base"));
        assertEquals("/.*", actualParameters.get("like"));
    }

    @Test
    void toListShouldResolveExistingIdsAndSkipMissingIds() {
        Realm realm = mock(Realm.class);

        doReturn(Optional.of(realm)).when(realmDAO).findById("existing");
        doReturn(Optional.empty()).when(realmDAO).findById("missing");

        List<Realm> result = dao.exposedToList(
                List.of(
                        Map.of("id", "existing"),
                        Map.of("id", "missing")),
                "id");

        assertEquals(List.of(realm), result);
    }

    @Test
    void setParameterShouldGenerateIncrementalParameterNames() {
        Map<String, Object> parameters = new HashMap<>();

        String first = Neo4jRealmSearchDAO3.setParameter(parameters, "alpha");
        String second = Neo4jRealmSearchDAO3.setParameter(parameters, "beta");

        assertEquals("param0", first);
        assertEquals("param1", second);
        assertEquals("alpha", parameters.get("param0"));
        assertEquals("beta", parameters.get("param1"));
    }

    @Test
    void escapeIfStringShouldQuoteOnlyStringValues() {
        assertEquals("\"hello\"", Neo4jRealmSearchDAO3.escapeIfString("hello", true));
        assertEquals("42", Neo4jRealmSearchDAO3.escapeIfString("42", false));
    }

    @Test
    void appendPlainAttrCondShouldUseDirectPropertyForUniqueSchema() {
        PlainSchema schema = mock(PlainSchema.class);
        when(schema.isUniqueConstraint()).thenReturn(true);
        when(schema.getKey()).thenReturn("email");
        when(schema.getType()).thenReturn(AttrSchemaType.String);

        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO3.appendPlainAttrCond(query, schema, " = \"a@syncope.apache.org\"");

        assertTrue(query.toString().startsWith("email."));
        assertTrue(query.toString().contains(" = \"a@syncope.apache.org\""));
    }

    @Test
    void appendPlainAttrCondShouldUseAnyPredicateForNonUniqueSchema() {
        PlainSchema schema = mock(PlainSchema.class);
        when(schema.isUniqueConstraint()).thenReturn(false);
        when(schema.getKey()).thenReturn("nickname");
        when(schema.getType()).thenReturn(AttrSchemaType.String);

        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO3.appendPlainAttrCond(query, schema, " = \"neo\"");

        assertTrue(query.toString().startsWith("any(k IN nickname WHERE k."));
        assertTrue(query.toString().contains(" = \"neo\""));
        assertTrue(query.toString().endsWith(")"));
    }

    @Test
    void queryOpShouldCombineLeftAndRightQueriesWithExistsClauses() {
        TextStringBuilder target = new TextStringBuilder();

        Neo4jRealmSearchDAO3.QueryInfo left = new Neo4jRealmSearchDAO3.QueryInfo(
                new TextStringBuilder("WHERE n.name = $param0"),
                Set.of("name"),
                Set.of());

        Neo4jRealmSearchDAO3.QueryInfo right = new Neo4jRealmSearchDAO3.QueryInfo(
                new TextStringBuilder("MATCH (n) WHERE n.fullPath = $param1"),
                Set.of("fullPath"),
                Set.of());

        Neo4jRealmSearchDAO3.queryOp(target, "AND", left, right);

        String query = target.toString();

        assertTrue(query.contains("WHERE EXISTS"));
        assertTrue(query.contains("AND EXISTS"));
        assertTrue(query.contains("MATCH (n) WHERE n.name = $param0"));
        assertTrue(query.contains("MATCH (n) WHERE n.fullPath = $param1"));
    }

    @Test
    void parseOrderByShouldAcceptRealmFieldOrdering() {
        List<String> clauses = dao.exposedParseOrderBy(Sort.by(Sort.Order.asc("name")));

        assertEquals(List.of("name ASC"), clauses);
    }

    @Test
    void parseOrderByShouldAcceptSingleUniquePlainSchemaOrdering() {
        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn("email");
        when(schema.isUniqueConstraint()).thenReturn(true);

        when(realmUtils.getField("email")).thenReturn(Optional.empty());
        doReturn(Optional.of(schema)).when(plainSchemaDAO).findById("email");

        List<String> clauses = dao.exposedParseOrderBy(Sort.by(Sort.Order.desc("email")));

        assertEquals(List.of("email DESC"), clauses);
    }

    @Test
    void parseOrderByShouldAcceptSingleNonUniquePlainSchemaOrdering() {
        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn("nickname");
        when(schema.isUniqueConstraint()).thenReturn(false);

        when(realmUtils.getField("nickname")).thenReturn(Optional.empty());
        doReturn(Optional.of(schema)).when(plainSchemaDAO).findById("nickname");

        List<String> clauses = dao.exposedParseOrderBy(Sort.by(Sort.Order.asc("nickname")));

        assertEquals(List.of("nickname ASC"), clauses);
    }

    @Test
    void parseOrderByShouldRejectMoreThanOneUniquePlainSchemaOrdering() {
        PlainSchema schema1 = mock(PlainSchema.class);
        PlainSchema schema2 = mock(PlainSchema.class);

        when(schema1.getKey()).thenReturn("email");
        when(schema1.isUniqueConstraint()).thenReturn(true);

        when(schema2.getKey()).thenReturn("code");
        when(schema2.isUniqueConstraint()).thenReturn(true);

        when(realmUtils.getField("email")).thenReturn(Optional.empty());
        when(realmUtils.getField("code")).thenReturn(Optional.empty());

        doReturn(Optional.of(schema1)).when(plainSchemaDAO).findById("email");
        doReturn(Optional.of(schema2)).when(plainSchemaDAO).findById("code");

        SyncopeClientException exception = assertThrows(
                SyncopeClientException.class,
                () -> dao.exposedParseOrderBy(Sort.by(Sort.Order.asc("email"), Sort.Order.desc("code"))));

        assertFalse(exception.getElements().isEmpty());
        assertTrue(exception.getElements().stream().
                anyMatch(element -> element.contains("Order by more than one attribute is not allowed")));
    }

    @Test
    void parseOrderByShouldRejectMoreThanOneNonUniquePlainSchemaOrdering() {
        PlainSchema schema1 = mock(PlainSchema.class);
        PlainSchema schema2 = mock(PlainSchema.class);

        when(schema1.getKey()).thenReturn("nickname");
        when(schema1.isUniqueConstraint()).thenReturn(false);

        when(schema2.getKey()).thenReturn("tag");
        when(schema2.isUniqueConstraint()).thenReturn(false);

        when(realmUtils.getField("nickname")).thenReturn(Optional.empty());
        when(realmUtils.getField("tag")).thenReturn(Optional.empty());

        doReturn(Optional.of(schema1)).when(plainSchemaDAO).findById("nickname");
        doReturn(Optional.of(schema2)).when(plainSchemaDAO).findById("tag");

        SyncopeClientException exception = assertThrows(
                SyncopeClientException.class,
                () -> dao.exposedParseOrderBy(Sort.by(Sort.Order.asc("nickname"), Sort.Order.asc("tag"))));

        assertFalse(exception.getElements().isEmpty());
        assertTrue(exception.getElements().stream().
                anyMatch(element -> element.contains("Order by more than one attribute is not allowed")));
    }

    @Test
    void parseOrderByShouldIgnoreUnknownOrderingProperty() {
        when(realmUtils.getField("unknown")).thenReturn(Optional.empty());
        doReturn(Optional.empty()).when(plainSchemaDAO).findById("unknown");

        List<String> clauses = dao.exposedParseOrderBy(Sort.by(Sort.Order.asc("unknown")));

        assertTrue(clauses.isEmpty());
    }

    @Test
    void wrapQueryShouldAddBaseClausesAndParameters() {
        Map<String, Object> parameters = new HashMap<>();
        TextStringBuilder baseQuery = new TextStringBuilder("WHERE EXISTS { MATCH (n) WHERE n.name = $param0 }");

        Neo4jRealmSearchDAO3.QueryInfo queryInfo = new Neo4jRealmSearchDAO3.QueryInfo(
                baseQuery,
                new HashSet<>(Set.of("name", "id")),
                new HashSet<>());

        dao.exposedWrapQuery(
                Set.of("/even"),
                queryInfo,
                Streamable.empty(),
                parameters);

        String query = queryInfo.query().toString();

        assertTrue(query.contains("MATCH (n:" + Neo4jRealm.NODE + ")"));
        assertTrue(query.contains("n.fullPath = $base1 OR n.fullPath =~ $like1"));
        assertEquals("/even", parameters.get("base1"));
        assertEquals("/even/.*", parameters.get("like1"));
    }

    @Test
    void wrapQueryShouldUseRootLikeExpressionForRootBase() {
        Map<String, Object> parameters = new HashMap<>();
        TextStringBuilder baseQuery = new TextStringBuilder("WHERE EXISTS { MATCH (n) WHERE n.name = $param0 }");

        Neo4jRealmSearchDAO3.QueryInfo queryInfo = new Neo4jRealmSearchDAO3.QueryInfo(
                baseQuery,
                new HashSet<>(Set.of("name")),
                new HashSet<>());

        dao.exposedWrapQuery(
                Set.of(SyncopeConstants.ROOT_REALM),
                queryInfo,
                Streamable.empty(),
                parameters);

        assertEquals(SyncopeConstants.ROOT_REALM, parameters.get("base1"));
        assertEquals("/.*", parameters.get("like1"));
    }

    @Test
    void wrapQueryShouldSupportQueriesStartingWithMatchN() {
        Map<String, Object> parameters = new HashMap<>();
        TextStringBuilder baseQuery = new TextStringBuilder("MATCH (n) WHERE n.name = $param0");

        Neo4jRealmSearchDAO3.QueryInfo queryInfo = new Neo4jRealmSearchDAO3.QueryInfo(
                baseQuery,
                new HashSet<>(Set.of("name")),
                new HashSet<>());

        assertDoesNotThrow(() -> dao.exposedWrapQuery(
                Set.of("/even"),
                queryInfo,
                Streamable.empty(),
                parameters));

        assertTrue(queryInfo.query().toString().contains("WHERE (EXISTS { MATCH (n)"));
        assertEquals("/even", parameters.get("base1"));
    }

    @Test
    void publicMethodsShouldUseExpectedNeo4jQueryFragments() {
        when(neo4jClient.query(anyString()).bindAll(anyMap()).fetch().one()).
                thenReturn(Optional.empty());

        dao.findByFullPath("/even");

        ArgumentCaptor<String> queryCaptor = ArgumentCaptor.forClass(String.class);
        verify(neo4jClient, atLeastOnce()).query(queryCaptor.capture());

        String query = queryCaptor.getAllValues().
                get(queryCaptor.getAllValues().size() - 1);

        assertTrue(query.contains("MATCH (n:" + Neo4jRealm.NODE + ")"));
        assertTrue(query.contains("WHERE n.fullPath = $fullPath"));
        assertTrue(query.contains("RETURN n.id"));
    }
}
//###Test END##

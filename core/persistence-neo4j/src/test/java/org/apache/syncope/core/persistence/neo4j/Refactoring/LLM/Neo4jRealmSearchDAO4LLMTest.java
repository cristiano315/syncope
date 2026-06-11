//###Test START##
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

class Neo4jRealmSearchDAO4LLMTest {

    private RealmDAO realmDAO;

    private PlainSchemaDAO plainSchemaDAO;

    private UserDAO userDAO;

    private GroupDAO groupDAO;

    private EntityFactory entityFactory;

    private PlainAttrValidationManager validator;

    private RealmUtils realmUtils;

    private Neo4jTemplate neo4jTemplate;

    private Neo4jClient neo4jClient;

    private Neo4jRealmSearchDAO4 dao;

    private Neo4jClient.UnboundRunnableSpec unboundSpec;

    private Neo4jClient.RunnableSpec runnableSpec;

    private Neo4jClient.RecordFetchSpec<Map<String, Object>> fetchSpec;

    private static final class RealmFieldHolder {

        @SuppressWarnings("unused")
        private String name;
    }

    @BeforeEach
    void setUp() {
        realmDAO = mock(RealmDAO.class);
        plainSchemaDAO = mock(PlainSchemaDAO.class);
        userDAO = mock(UserDAO.class);
        groupDAO = mock(GroupDAO.class);
        entityFactory = mock(EntityFactory.class);
        validator = mock(PlainAttrValidationManager.class);
        realmUtils = mock(RealmUtils.class);
        neo4jTemplate = mock(Neo4jTemplate.class);
        neo4jClient = mock(Neo4jClient.class);

        unboundSpec = mock(Neo4jClient.UnboundRunnableSpec.class);
        runnableSpec = mock(Neo4jClient.RunnableSpec.class);
        fetchSpec = mock(Neo4jClient.RecordFetchSpec.class);

        when(neo4jClient.query(anyString())).thenReturn(unboundSpec);
        when(unboundSpec.bindAll(anyMap())).thenReturn(runnableSpec);
        when(runnableSpec.fetch()).thenReturn(fetchSpec);

        dao = new Neo4jRealmSearchDAO4(
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

    private static Map<String, Object> row(final String key, final Object value) {
        Map<String, Object> row = new HashMap<>();
        row.put(key, value);
        return row;
    }

    private void mockRealmById(final String key, final Realm realm) {
        doReturn(Optional.of(realm)).when(realmDAO).findById(key);
    }

    private void mockMissingRealmById(final String key) {
        doReturn(Optional.empty()).when(realmDAO).findById(key);
    }

    private void mockPlainSchemaById(final String key, final PlainSchema schema) {
        doReturn(Optional.of(schema)).when(plainSchemaDAO).findById(key);
    }

    private static Field testField(final String name) {
        try {
            Field field = RealmFieldHolder.class.getDeclaredField(name);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    @Test
    void tc001ConstructorShouldCreateDaoInstance() {
        assertNotNull(dao);
    }

    @Test
    void tc002FindByFullPathShouldReturnRealmWhenNeo4jFindsId() {
        Realm realm = mock(Realm.class);

        when(fetchSpec.one()).thenReturn(Optional.of(row("n.id", "realm-key")));
        mockRealmById("realm-key", realm);

        Optional<Realm> actual = dao.findByFullPath("/engineering");

        assertTrue(actual.isPresent());
        assertSame(realm, actual.orElseThrow());
    }

    @Test
    void tc003FindByFullPathShouldReturnEmptyWhenNeo4jReturnsNoResult() {
        when(fetchSpec.one()).thenReturn(Optional.empty());

        Optional<Realm> actual = dao.findByFullPath("/missing");

        assertTrue(actual.isEmpty());
    }

    @Test
    void tc004FindByFullPathShouldReturnEmptyWhenRealmIdCannotBeResolved() {
        when(fetchSpec.one()).thenReturn(Optional.of(row("n.id", "missing-key")));
        mockMissingRealmById("missing-key");

        Optional<Realm> actual = dao.findByFullPath("/missing");

        assertTrue(actual.isEmpty());
    }

    @Test
    void tc005FindByFullPathShouldAcceptRootRealm() {
        Realm root = mock(Realm.class);

        when(fetchSpec.one()).thenReturn(Optional.of(row("n.id", "root-key")));
        mockRealmById("root-key", root);

        Optional<Realm> actual = dao.findByFullPath(SyncopeConstants.ROOT_REALM);

        assertTrue(actual.isPresent());
        assertSame(root, actual.orElseThrow());
    }

    @Test
    void tc006FindByFullPathShouldThrowForBlankPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath(" "));
    }

    @Test
    void tc007FindByFullPathShouldThrowForMalformedPath() {
        assertThrows(MalformedPathException.class, () -> dao.findByFullPath("not-a-full-path"));
    }

    @Test
    void tc008FindByNameShouldReturnResolvedRealms() {
        Realm realmOne = mock(Realm.class);
        Realm realmTwo = mock(Realm.class);

        when(fetchSpec.all()).thenReturn(List.of(
                row("n.id", "realm-1"),
                row("n.id", "realm-2")));

        mockRealmById("realm-1", realmOne);
        mockRealmById("realm-2", realmTwo);

        List<Realm> actual = dao.findByName("engineering");

        assertEquals(2, actual.size());
        assertSame(realmOne, actual.get(0));
        assertSame(realmTwo, actual.get(1));
    }

    @Test
    void tc009FindByNameShouldSkipUnresolvedRealmIds() {
        Realm realm = mock(Realm.class);

        when(fetchSpec.all()).thenReturn(List.of(
                row("n.id", "existing"),
                row("n.id", "missing")));

        mockRealmById("existing", realm);
        mockMissingRealmById("missing");

        List<Realm> actual = dao.findByName("engineering");

        assertEquals(1, actual.size());
        assertSame(realm, actual.get(0));
    }

    @Test
    void tc010FindByNameShouldReturnEmptyListWhenNeo4jReturnsNothing() {
        when(fetchSpec.all()).thenReturn(List.of());

        List<Realm> actual = dao.findByName("missing");

        assertTrue(actual.isEmpty());
    }

    @Test
    void tc011FindChildrenShouldReturnResolvedChildren() {
        Realm parent = mock(Realm.class);
        Realm child = mock(Realm.class);

        when(parent.getKey()).thenReturn("parent-key");
        when(fetchSpec.all()).thenReturn(List.of(row("c.id", "child-key")));
        mockRealmById("child-key", child);

        List<Realm> actual = dao.findChildren(parent);

        assertEquals(1, actual.size());
        assertSame(child, actual.get(0));
    }

    @Test
    void tc012FindChildrenShouldReturnEmptyListWhenNoChildrenExist() {
        Realm parent = mock(Realm.class);

        when(parent.getKey()).thenReturn("parent-key");
        when(fetchSpec.all()).thenReturn(List.of());

        List<Realm> actual = dao.findChildren(parent);

        assertTrue(actual.isEmpty());
    }

    @Test
    void tc013FindDescendantsShouldReturnDescendantsForBaseWithoutPrefix() {
        Realm base = mock(Realm.class);
        Realm child = mock(Realm.class);

        when(fetchSpec.all()).thenReturn(List.of(
                row("n.id", "base-key"),
                row("n.id", "child-key")));

        mockRealmById("base-key", base);
        mockRealmById("child-key", child);

        List<Realm> actual = dao.findDescendants("/engineering", null);

        assertEquals(2, actual.size());
        assertSame(base, actual.get(0));
        assertSame(child, actual.get(1));
    }

    @Test
    void tc014FindDescendantsShouldReturnDescendantsForBaseWithPrefix() {
        Realm prefixed = mock(Realm.class);

        when(fetchSpec.all()).thenReturn(List.of(row("n.id", "prefixed-key")));
        mockRealmById("prefixed-key", prefixed);

        List<Realm> actual = dao.findDescendants("/engineering", "/engineering/platform");

        assertEquals(1, actual.size());
        assertSame(prefixed, actual.get(0));
    }

    @Test
    void tc015FindDescendantsShouldHandleRootBase() {
        Realm root = mock(Realm.class);

        when(fetchSpec.all()).thenReturn(List.of(row("n.id", "root-key")));
        mockRealmById("root-key", root);

        List<Realm> actual = dao.findDescendants(SyncopeConstants.ROOT_REALM, null);

        assertEquals(1, actual.size());
        assertSame(root, actual.get(0));
    }

    @Test
    void tc016ToListShouldConvertRowsToResolvedRealmsOnly() {
        Realm realm = mock(Realm.class);

        mockRealmById("existing", realm);
        mockMissingRealmById("missing");

        List<Realm> actual = dao.toList(List.of(
                row("id", "existing"),
                row("id", "missing")), "id");

        assertEquals(1, actual.size());
        assertSame(realm, actual.get(0));
    }

    @Test
    void tc017SetParameterShouldStoreParameterWithIncrementalName() {
        Map<String, Object> parameters = new LinkedHashMap<>();

        String first = Neo4jRealmSearchDAO4.setParameter(parameters, "alpha");
        String second = Neo4jRealmSearchDAO4.setParameter(parameters, 10);

        assertEquals("param0", first);
        assertEquals("param1", second);
        assertEquals("alpha", parameters.get("param0"));
        assertEquals(10, parameters.get("param1"));
    }

    @Test
    void tc018EscapeIfStringShouldWrapStringValuesInDoubleQuotes() {
        assertEquals("\"hello\"", Neo4jRealmSearchDAO4.escapeIfString("hello", true));
    }

    @Test
    void tc019EscapeIfStringShouldNotWrapNonStringValues() {
        assertEquals("42", Neo4jRealmSearchDAO4.escapeIfString("42", false));
    }

    @Test
    void tc020IsParsableNonStringValueShouldAcceptValidLong() {
        assertTrue(dao.isParsableNonStringValue(AttrSchemaType.Long, "123"));
    }

    @Test
    void tc021IsParsableNonStringValueShouldRejectInvalidLong() {
        assertFalse(dao.isParsableNonStringValue(AttrSchemaType.Long, "abc"));
    }

    @Test
    void tc022IsParsableNonStringValueShouldAcceptValidDouble() {
        assertTrue(dao.isParsableNonStringValue(AttrSchemaType.Double, "123.45"));
    }

    @Test
    void tc023IsParsableNonStringValueShouldRejectInvalidDouble() {
        assertFalse(dao.isParsableNonStringValue(AttrSchemaType.Double, "not-double"));
    }

    @Test
    void tc024IsParsableNonStringValueShouldAcceptValidBoolean() {
        assertTrue(dao.isParsableNonStringValue(AttrSchemaType.Boolean, "true"));
        assertTrue(dao.isParsableNonStringValue(AttrSchemaType.Boolean, "FALSE"));
    }

    @Test
    void tc025IsParsableNonStringValueShouldRejectInvalidBoolean() {
        assertFalse(dao.isParsableNonStringValue(AttrSchemaType.Boolean, "yes"));
    }

    @Test
    void tc026AppendPlainAttrCondShouldUseDirectPropertyForUniqueSchema() {
        PlainSchema schema = mock(PlainSchema.class);

        when(schema.getKey()).thenReturn("email");
        when(schema.getType()).thenReturn(AttrSchemaType.String);
        when(schema.isUniqueConstraint()).thenReturn(true);

        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO4.appendPlainAttrCond(query, schema, " = \"a@b.com\"");

        assertTrue(query.toString().contains("email."));
        assertTrue(query.toString().contains(" = \"a@b.com\""));
    }

    @Test
    void tc027AppendPlainAttrCondShouldUseAnyForNonUniqueSchema() {
        PlainSchema schema = mock(PlainSchema.class);

        when(schema.getKey()).thenReturn("tags");
        when(schema.getType()).thenReturn(AttrSchemaType.String);
        when(schema.isUniqueConstraint()).thenReturn(false);

        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO4.appendPlainAttrCond(query, schema, " = \"blue\"");

        assertTrue(query.toString().startsWith("any(k IN tags WHERE k."));
        assertTrue(query.toString().contains(" = \"blue\""));
    }

    @Test
    void tc028AppendAttrLikeCondShouldCreateRegexForStringSchema() {
        PlainSchema schema = mock(PlainSchema.class);

        when(schema.getKey()).thenReturn("name");
        when(schema.getType()).thenReturn(AttrSchemaType.String);
        when(schema.isUniqueConstraint()).thenReturn(true);

        TextStringBuilder query = new TextStringBuilder();
        Neo4jRealmSearchDAO4.AttrCondValue value =
                new Neo4jRealmSearchDAO4.AttrCondValue("adm%", true, false);

        dao.appendAttrLikeCond(query, schema, value);

        assertTrue(query.toString().contains("=~"));
        assertTrue(query.toString().contains("adm.*"));
    }

    @Test
    void tc029AppendAnyEqCondShouldBindParameter() {
        PlainAttrValue attrValue = mock(PlainAttrValue.class);

        when(attrValue.getValue()).thenReturn("engineering");

        Map<String, Object> parameters = new HashMap<>();
        TextStringBuilder query = new TextStringBuilder();

        dao.appendAnyEqCond(query, attrValue, parameters, "n.name", false);

        assertEquals("n.name=$param0", query.toString());
        assertEquals("engineering", parameters.get("param0"));
    }

    @Test
    void tc030AppendAnyComparisonCondShouldBindParameterWithOperator() {
        PlainAttrValue attrValue = mock(PlainAttrValue.class);

        when(attrValue.getValue()).thenReturn(100L);

        Map<String, Object> parameters = new HashMap<>();
        TextStringBuilder query = new TextStringBuilder();

        dao.appendAnyComparisonCond(query, attrValue, parameters, "n.size", ">=");

        assertEquals("n.size>=$param0", query.toString());
        assertEquals(100L, parameters.get("param0"));
    }

    @Test
    void tc031ParseOrderByShouldReturnFieldOrderClause() {
        when(realmUtils.getField("name")).thenReturn(Optional.of(testField("name")));

        List<String> actual = dao.parseOrderBy(Streamable.of(Sort.Order.asc("name")));

        assertEquals(List.of("name ASC"), actual);
    }

    @Test
    void tc032ParseOrderByShouldReturnPlainSchemaOrderClause() {
        PlainSchema schema = mock(PlainSchema.class);

        when(realmUtils.getField("loginDate")).thenReturn(Optional.empty());
        mockPlainSchemaById("loginDate", schema);
        when(schema.getKey()).thenReturn("loginDate");
        when(schema.isUniqueConstraint()).thenReturn(true);

        List<String> actual = dao.parseOrderBy(Streamable.of(Sort.Order.desc("loginDate")));

        assertEquals(List.of("loginDate DESC"), actual);
    }

    @Test
    void tc033ValidatePlainSchemaOrderByShouldThrowForMoreThanOneUniquePlainSchema() {
        SyncopeClientException ex = assertThrows(
                SyncopeClientException.class,
                () -> dao.validatePlainSchemaOrderBy(Set.of("email", "code"), Set.of()));

        assertTrue(ex.getElements().stream()
                .anyMatch(element -> element.contains("Order by more than one attribute is not allowed")));
    }

    @Test
    void tc034ValidatePlainSchemaOrderByShouldThrowForMoreThanOneNonUniquePlainSchema() {
        SyncopeClientException ex = assertThrows(
                SyncopeClientException.class,
                () -> dao.validatePlainSchemaOrderBy(Set.of(), Set.of("tag", "level")));

        assertTrue(ex.getElements().stream()
                .anyMatch(element -> element.contains("Order by more than one attribute is not allowed")));
    }

    @Test
    void tc035ValidatePlainSchemaOrderByShouldAllowOneUniqueAndOneNonUniquePlainSchema() {
        dao.validatePlainSchemaOrderBy(Set.of("email"), Set.of("tag"));
    }

    @Test
    void tc036AppendPlainSchemaOrderByClauseShouldAddUniqueSchemaClause() {
        PlainSchema schema = mock(PlainSchema.class);
        List<String> clauses = new java.util.ArrayList<>();
        Set<String> uniqueSchemas = new java.util.HashSet<>();
        Set<String> nonUniqueSchemas = new java.util.HashSet<>();

        when(schema.getKey()).thenReturn("email");
        when(schema.isUniqueConstraint()).thenReturn(true);

        dao.appendPlainSchemaOrderByClause(
                schema,
                Sort.Order.asc("email"),
                clauses,
                uniqueSchemas,
                nonUniqueSchemas);

        assertEquals(List.of("email ASC"), clauses);
        assertTrue(uniqueSchemas.contains("email"));
        assertTrue(nonUniqueSchemas.isEmpty());
    }

    @Test
    void tc037AppendPlainSchemaOrderByClauseShouldAddNonUniqueSchemaClause() {
        PlainSchema schema = mock(PlainSchema.class);
        List<String> clauses = new java.util.ArrayList<>();
        Set<String> uniqueSchemas = new java.util.HashSet<>();
        Set<String> nonUniqueSchemas = new java.util.HashSet<>();

        when(schema.getKey()).thenReturn("tags");
        when(schema.isUniqueConstraint()).thenReturn(false);

        dao.appendPlainSchemaOrderByClause(
                schema,
                Sort.Order.desc("tags"),
                clauses,
                uniqueSchemas,
                nonUniqueSchemas);

        assertEquals(List.of("tags DESC"), clauses);
        assertTrue(nonUniqueSchemas.contains("tags"));
        assertTrue(uniqueSchemas.isEmpty());
    }

    @Test
    void tc038AppendOrderByClauseShouldIgnoreUnknownProperty() {
        List<String> clauses = new java.util.ArrayList<>();

        when(realmUtils.getField("unknown")).thenReturn(Optional.empty());
        doReturn(Optional.empty()).when(plainSchemaDAO).findById("unknown");

        dao.appendOrderByClause(
                Sort.Order.asc("unknown"),
                clauses,
                new java.util.HashSet<>(),
                new java.util.HashSet<>());

        assertTrue(clauses.isEmpty());
    }

    @Test
    void tc039QueryOpShouldCombineQueriesWithExistsAndOperator() {
        TextStringBuilder query = new TextStringBuilder();

        Neo4jRealmSearchDAO4.QueryInfo left =
                new Neo4jRealmSearchDAO4.QueryInfo(
                        new TextStringBuilder("WHERE n.name = 'left'"),
                        new java.util.HashSet<>(),
                        new java.util.HashSet<>());

        Neo4jRealmSearchDAO4.QueryInfo right =
                new Neo4jRealmSearchDAO4.QueryInfo(
                        new TextStringBuilder("MATCH (n) WHERE n.name = 'right'"),
                        new java.util.HashSet<>(),
                        new java.util.HashSet<>());

        Neo4jRealmSearchDAO4.queryOp(query, "AND", left, right);

        assertTrue(query.toString().contains("WHERE EXISTS"));
        assertTrue(query.toString().contains("AND EXISTS"));
        assertTrue(query.toString().contains("MATCH (n) WHERE n.name = 'left'"));
        assertTrue(query.toString().contains("MATCH (n) WHERE n.name = 'right'"));
    }

    @Test
    void tc040WrapQueryShouldAddBaseParametersAndBaseExistsClause() {
        TextStringBuilder rawQuery = new TextStringBuilder("MATCH (n) WHERE n.name = $param0");

        Neo4jRealmSearchDAO4.QueryInfo queryInfo =
                new Neo4jRealmSearchDAO4.QueryInfo(
                        rawQuery,
                        new java.util.HashSet<>(),
                        new java.util.HashSet<>());

        Map<String, Object> parameters = new HashMap<>();

        dao.wrapQuery(
                Set.of("/engineering"),
                queryInfo,
                Streamable.empty(),
                parameters);

        assertTrue(queryInfo.query().toString().contains("base1"));
        assertTrue(queryInfo.query().toString().contains("like1"));
        assertEquals("/engineering", parameters.get("base1"));
        assertEquals("/engineering/.*", parameters.get("like1"));
    }

    @Test
    void tc041WrapQueryShouldUseRootLikePatternForRootBase() {
        TextStringBuilder rawQuery = new TextStringBuilder("MATCH (n) WHERE n.name = $param0");

        Neo4jRealmSearchDAO4.QueryInfo queryInfo =
                new Neo4jRealmSearchDAO4.QueryInfo(
                        rawQuery,
                        new java.util.HashSet<>(),
                        new java.util.HashSet<>());

        Map<String, Object> parameters = new HashMap<>();

        dao.wrapQuery(
                Set.of(SyncopeConstants.ROOT_REALM),
                queryInfo,
                Streamable.empty(),
                parameters);

        assertEquals(SyncopeConstants.ROOT_REALM, parameters.get("base1"));
        assertEquals("/.*", parameters.get("like1"));
    }
}
//###Test END##
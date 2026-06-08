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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.SyncopeClientException;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.AuxClassCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
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

public class Neo4jRealmSearchDAOTest {

    private Neo4jRealmSearchDAO searchDAO;

    private Map<String, Object> parameters;

    private RealmDAO realmDAO;

    private PlainSchemaDAO plainSchemaDAO;

    private RealmUtils realmUtils;

    private Neo4jClient neo4jClient;

    private Neo4jTemplate neo4jTemplate;

    /*
     * This small dummy class is only used to obtain a real Field instance.
     * RealmUtils.getField() returns Optional<Field>, therefore a simple String
     * would not be enough for the pagination test.
     */
    private static class DummyRealmFields {

        public String name;
    }

    @BeforeEach
    public void setUp() {
        realmDAO = mock(RealmDAO.class);
        plainSchemaDAO = mock(PlainSchemaDAO.class);
        realmUtils = mock(RealmUtils.class);
        neo4jClient = mock(Neo4jClient.class, RETURNS_DEEP_STUBS);
        neo4jTemplate = mock(Neo4jTemplate.class);

        /*
         * The DAO is created once before each test with mocked dependencies.
         * This keeps the tests focused on the behavior of Neo4jRealmSearchDAO
         * without requiring a real Neo4j instance or real persistence objects.
         */
        searchDAO = new Neo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                null,
                null,
                null,
                null,
                realmUtils,
                neo4jTemplate,
                neo4jClient);

        parameters = new HashMap<>();
    }

    /*
     * Helper methods used to keep the single test cases readable.
     * They create the minimum mocked objects needed by fillAttrQuery()
     * and by the query-building methods.
     */
    private PlainSchema mockSchema(final String key, final AttrSchemaType type, final boolean isUnique) {
        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn(key);
        when(schema.getType()).thenReturn(type);
        when(schema.isUniqueConstraint()).thenReturn(isUnique);
        return schema;
    }

    private PlainAttrValue mockValue(final String stringValue, final OffsetDateTime dateValue) {
        PlainAttrValue attrValue = mock(PlainAttrValue.class);
        when(attrValue.getValue()).thenReturn(stringValue);
        when(attrValue.getDateValue()).thenReturn(dateValue);
        return attrValue;
    }

    private AnyCond mockCond(final AnyCond.Type type, final String schemaName, final String expression) {
        AnyCond cond = mock(AnyCond.class);
        when(cond.getType()).thenReturn(type);
        when(cond.getSchema()).thenReturn(schemaName);
        when(cond.getExpression()).thenReturn(expression);
        return cond;
    }

    private Field mockRealmField() {
        try {
            return DummyRealmFields.class.getDeclaredField("name");
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }

    private SearchCond mockLeafAttrCond(final AttrCond attrCond) {
        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);
        when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(ResourceCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.of(attrCond));

        return searchCond;
    }

    private SearchCond mockLeafAuxClassCond(final String auxClass) {
        AuxClassCond auxClassCond = mock(AuxClassCond.class);
        when(auxClassCond.getAuxClass()).thenReturn(auxClass);

        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);
        when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(Optional.of(auxClassCond));
        when(searchCond.asLeaf(ResourceCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.empty());

        return searchCond;
    }

    private SearchCond mockLeafResourceCond(final String resource) {
        ResourceCond resourceCond = mock(ResourceCond.class);
        when(resourceCond.getResource()).thenReturn(resource);

        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);
        when(searchCond.asLeaf(AuxClassCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(ResourceCond.class)).thenReturn(Optional.of(resourceCond));
        when(searchCond.asLeaf(AnyCond.class)).thenReturn(Optional.empty());
        when(searchCond.asLeaf(AttrCond.class)).thenReturn(Optional.empty());

        return searchCond;
    }

    private SearchCond mockAndCond(final SearchCond left, final SearchCond right) {
        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.AND);
        when(searchCond.getLeft()).thenReturn(left);
        when(searchCond.getRight()).thenReturn(right);

        return searchCond;
    }

    private SearchCond mockOrCond(final SearchCond left, final SearchCond right) {
        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.OR);
        when(searchCond.getLeft()).thenReturn(left);
        when(searchCond.getRight()).thenReturn(right);

        return searchCond;
    }

    /*
     * TC1-TC9 focus on fillAttrQuery().
     * This method is the most variable part of the class because its output
     * depends on the operator, the schema type, the uniqueness constraint,
     * the input value and the negation flag.
     */

    @Test
    @DisplayName("TC1: Simple Equality (EQ), String, Unique Value, Not=False")
    public void testTC1_EQ_String_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "city", "Rome");
        PlainAttrValue value = mockValue("Rome", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * This is the nominal case: equality on a unique string field.
         * The expected Cypher condition is a direct property comparison.
         */
        assertTrue(query.toString().contains("n.city=$param0"),
                "TC1 failed: Basic EQ translation didn't work. Actual query: " + query);
        assertEquals("Rome", parameters.get("param0"),
                "TC1 failed: Parameter map does not contain the correct value.");
    }

    @Test
    @DisplayName("TC2: Case-Insensitive Equality (IEQ), String, Unique Value, Not=False")
    public void testTC2_EQ_WithRegex_String_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.IEQ, "city", "Rome");
        PlainAttrValue value = mockValue("Rome", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * IEQ belongs to the equality category, but it also requires
         * case-insensitive comparison. For this reason both sides of the
         * comparison must be converted with toLower().
         */
        assertTrue(query.toString().contains("toLower (n.city)=toLower($param0)"),
                "TC2 failed: System didn't apply case-insensitive logic. Actual query: " + query);
        assertEquals("Rome", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC3: Greater Than (GT), Long, Multivalued, Not=False")
    public void testTC3_GT_Long_Multivalued() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, false);
        AnyCond cond = mockCond(AnyCond.Type.GT, "age", "150");
        PlainAttrValue value = mockValue("150", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * This test covers a relational operator on a numeric schema.
         * The value must be handled as a parameter and the operator must be
         * translated into the corresponding Cypher comparison.
         */
        assertTrue(query.toString().contains("n.age>$param0"),
                "TC3 failed: Greater-than operator translation is broken. Actual query: " + query);
        assertEquals("150", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC4: Null Check (ISNULL), Multivalued, Not=True")
    public void testTC4_ISNULL_Multivalued_NotTrue() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, false);
        AnyCond cond = mockCond(AnyCond.Type.ISNULL, "city", null);

        /*
         * The method changes ISNULL into ISNOTNULL during the recursive
         * handling of negation. The mock is configured to reproduce this
         * sequence of calls.
         */
        when(cond.getType()).thenReturn(
                AnyCond.Type.ISNULL,
                AnyCond.Type.ISNOTNULL,
                AnyCond.Type.ISNOTNULL);

        PlainAttrValue value = mockValue(null, null);

        searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

        /*
         * This checks the behavior of the negation category for null checks.
         */
        assertTrue(query.toString().contains("NOT (n.city IS NOT NULL)"),
                "TC4 failed: Recursive inversion of NOT on ISNULL is broken. Actual query: " + query);
    }

    @Test
    @DisplayName("TC5: Less Than/Equal (LE), Date, Unique Value, Not=False")
    public void testTC5_LE_Date_Unique() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("expirationDate", AttrSchemaType.Date, true);
        AnyCond cond = mockCond(AnyCond.Type.LE, "expirationDate", null);

        OffsetDateTime mockDate = OffsetDateTime.now();
        PlainAttrValue value = mockValue(null, mockDate);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * Date values follow a specific path because the value comes from
         * getDateValue() and is formatted before being inserted into the query.
         */
        assertTrue(query.toString().contains("n.expirationDate<=") && query.toString().contains("param"),
                "TC5 failed: ISO date formatting didn't work as expected. Actual query: " + query);
    }

    @Test
    @DisplayName("TC6: Equality (EQ), Long, Invalid Value")
    public void testTC6_EQ_Long_InvalidParsingFallback() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "age", "abc");
        PlainAttrValue value = mockValue("abc", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * This is a robustness test. The schema is numeric, but the value
         * cannot be parsed as a Long. The method must not fail and must keep
         * the raw value as query parameter.
         */
        assertTrue(query.toString().contains("n.age=$param0"),
                "TC6 failed: Fallback property check is broken. Actual query: " + query);
        assertEquals("abc", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC7: Equality (EQ), Boolean, Unique Value, Not=True")
    public void testTC7_EQ_Boolean_Unique_NotTrue() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("isActive", AttrSchemaType.Boolean, true);
        AnyCond cond = mockCond(AnyCond.Type.EQ, "isActive", "true");
        PlainAttrValue value = mockValue("true", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, true, parameters);

        /*
         * This case verifies the negation of a normal equality condition
         * on a unique boolean attribute.
         */
        assertTrue(query.toString().contains("NOT (n.isActive=$param0)"),
                "TC7 failed: NOT clause wasn't applied correctly. Actual query: " + query);
        assertEquals("true", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC8: Case-Insensitive Pattern Matching (ILIKE), String with Wildcard")
    public void testTC8_ILIKE_String_WithWildcard() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("city", AttrSchemaType.String, true);
        AnyCond cond = mockCond(AnyCond.Type.ILIKE, "city", "rome%");
        PlainAttrValue value = mockValue("rome%", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * ILIKE combines pattern matching and case-insensitive comparison.
         * The wildcard symbol is translated into a regular expression pattern.
         */
        assertTrue(query.toString().contains("toLower (n.city) =~"),
                "TC8 failed: ILIKE translation is broken. Actual query: " + query);
        assertEquals("rome.*", parameters.get("param0"));
    }

    @Test
    @DisplayName("TC9: LIKE on Long")
    public void testTC9_LIKE_Long_IncompatibleTypeError() {
        TextStringBuilder query = new TextStringBuilder();
        PlainSchema schema = mockSchema("age", AttrSchemaType.Long, true);
        AnyCond cond = mockCond(AnyCond.Type.LIKE, "age", "10%");
        PlainAttrValue value = mockValue("10%", null);

        searchDAO.fillAttrQuery(query, value, schema, cond, false, parameters);

        /*
         * LIKE is meaningful only for textual schemas. With a numeric schema
         * the method must generate the always-false condition instead of
         * producing an invalid search.
         */
        assertTrue(query.toString().contains("1=2"),
                "TC9 failed: System didn't inject the ALWAYS_FALSE_CLAUSE. Actual query: " + query);
    }

    /*
     * TC10-TC15 cover the public lookup methods of the DAO.
     * These tests verify how the class validates paths, calls Neo4j and maps
     * returned identifiers back to Realm objects through RealmDAO.
     */

    @Test
    @DisplayName("TC10: findByFullPath - Root Realm Exists")
    public void testTC10_findByFullPath_RootValid() {
        Realm rootRealm = mock(Realm.class);

        when(neo4jClient.query(anyString())
                .bindAll(Map.of("fullPath", "/"))
                .fetch()
                .one())
                .thenReturn(Optional.of(Map.of("n.id", "root-id")));

        doReturn(Optional.of(rootRealm))
                .when(realmDAO).findById("root-id");

        Optional<Realm> result = searchDAO.findByFullPath("/");

        /*
         * The root path is a valid special case and must be accepted.
         */
        assertTrue(result.isPresent(),
                "TC10 failed: findByFullPath('/') should return a present Optional.");
        assertEquals(rootRealm, result.get(),
                "TC10 failed: Returned Realm is not the expected root Realm.");
    }

    @Test
    @DisplayName("TC11: findByFullPath - Malformed Path Throws Exception")
    public void testTC11_findByFullPath_MalformedPath() {
        /*
         * A malformed path must be rejected before querying the database.
         */
        assertThrows(MalformedPathException.class,
                () -> searchDAO.findByFullPath("odd/even"),
                "TC11 failed: malformed path should throw MalformedPathException.");
    }

    @Test
    @DisplayName("TC12: findByName - Multiple Matching Realms")
    public void testTC12_findByName_MultipleResults() {
        Realm realm1 = mock(Realm.class);
        Realm realm2 = mock(Realm.class);

        when(neo4jClient.query(anyString())
                .bindAll(Map.of("name", "finance"))
                .fetch()
                .all())
                .thenReturn(List.of(
                        Map.of("n.id", "id-1"),
                        Map.of("n.id", "id-2")));

        doReturn(Optional.of(realm1))
                .when(realmDAO).findById("id-1");

        doReturn(Optional.of(realm2))
                .when(realmDAO).findById("id-2");

        List<Realm> result = searchDAO.findByName("finance");

        /*
         * This test checks the mapping from Neo4j result rows to Realm objects.
         */
        assertEquals(2, result.size(),
                "TC12 failed: findByName should return two resolved realms.");
        assertTrue(result.contains(realm1),
                "TC12 failed: result does not contain first Realm.");
        assertTrue(result.contains(realm2),
                "TC12 failed: result does not contain second Realm.");
    }

    @Test
    @DisplayName("TC13: findChildren - Multiple Children")
    public void testTC13_findChildren_MultipleChildren() {
        Realm parent = mock(Realm.class);
        Realm child1 = mock(Realm.class);
        Realm child2 = mock(Realm.class);

        when(parent.getKey()).thenReturn("parent-id");

        when(neo4jClient.query(anyString())
                .bindAll(Map.of("id", "parent-id"))
                .fetch()
                .all())
                .thenReturn(List.of(
                        Map.of("c.id", "child-1"),
                        Map.of("c.id", "child-2")));

        doReturn(Optional.of(child1))
                .when(realmDAO).findById("child-1");

        doReturn(Optional.of(child2))
                .when(realmDAO).findById("child-2");

        List<Realm> result = searchDAO.findChildren(parent);

        /*
         * This verifies the direct parent-child navigation query.
         */
        assertEquals(2, result.size(),
                "TC13 failed: findChildren should return two children.");
        assertTrue(result.contains(child1),
                "TC13 failed: result does not contain first child.");
        assertTrue(result.contains(child2),
                "TC13 failed: result does not contain second child.");
    }

    @Test
    @DisplayName("TC14: findDescendants - Root Base Without Prefix")
    public void testTC14_findDescendants_RootWithoutPrefix() {
        when(neo4jClient.query(anyString())
                .bindAll(argThat((Map<String, Object> params) ->
                        "/".equals(params.get("base"))
                                && "/.*".equals(params.get("like"))
                                && !params.containsKey("prefix")
                                && !params.containsKey("likePrefix")))
                .fetch()
                .all())
                .thenReturn(List.of());

        List<Realm> result = searchDAO.findDescendants("/", null);

        /*
         * The root realm uses a specific descendant pattern.
         */
        assertTrue(result.isEmpty(),
                "TC14 failed: root descendants query should return an empty list in this mocked scenario.");
    }

    @Test
    @DisplayName("TC15: findDescendants - Non Root Base With Prefix")
    public void testTC15_findDescendants_WithPrefix() {
        when(neo4jClient.query(anyString())
                .bindAll(argThat((Map<String, Object> params) ->
                        "/odd".equals(params.get("base"))
                                && "/odd/.*".equals(params.get("like"))
                                && "/odd/two".equals(params.get("prefix"))
                                && "/odd/two/.*".equals(params.get("likePrefix"))))
                .fetch()
                .all())
                .thenReturn(List.of());

        List<Realm> result = searchDAO.findDescendants("/odd", "/odd/two");

        /*
         * This covers the case where both base and prefix restrict the search.
         */
        assertTrue(result.isEmpty(),
                "TC15 failed: descendants with prefix should return an empty list in this mocked scenario.");
    }

    /*
     * TC16 and TC17 cover compound SearchCond objects.
     * The objective is to check that the generated query combines the two
     * leaf conditions with the expected boolean operator.
     */

    @Test
    @DisplayName("TC16: SearchCond AND - Combines Two Leaf Conditions")
    public void testTC16_SearchCond_AND() {
        SearchCond left = mockLeafAuxClassCond("classA");
        SearchCond right = mockLeafResourceCond("resource-db");
        SearchCond andCond = mockAndCond(left, right);

        Map<String, Object> params = new HashMap<>();

        Neo4jRealmSearchDAO.QueryInfo queryInfo = searchDAO.getQuery(andCond, params);

        assertTrue(queryInfo.query().toString().contains(" AND EXISTS"),
                "TC16 failed: AND condition was not translated into AND EXISTS. Actual query: "
                        + queryInfo.query());
        assertEquals(2, params.size(),
                "TC16 failed: AND condition should generate two query parameters.");
    }

    @Test
    @DisplayName("TC17: SearchCond OR - Combines Two Leaf Conditions")
    public void testTC17_SearchCond_OR() {
        SearchCond left = mockLeafAuxClassCond("classA");
        SearchCond right = mockLeafResourceCond("resource-db");
        SearchCond orCond = mockOrCond(left, right);

        Map<String, Object> params = new HashMap<>();

        Neo4jRealmSearchDAO.QueryInfo queryInfo = searchDAO.getQuery(orCond, params);

        assertTrue(queryInfo.query().toString().contains(" OR EXISTS"),
                "TC17 failed: OR condition was not translated into OR EXISTS. Actual query: "
                        + queryInfo.query());
        assertEquals(2, params.size(),
                "TC17 failed: OR condition should generate two query parameters.");
    }

    /*
     * TC18 and TC19 cover two final aspects of the search operation:
     * ordering validation and pagination.
     */

    @Test
    @DisplayName("TC18: parseOrderBy - Multiple Unique Plain Schemas Are Invalid")
    public void testTC18_parseOrderBy_MultipleUniqueSchemasInvalid() {
        PlainSchema schema1 = mockSchema("code1", AttrSchemaType.String, true);
        PlainSchema schema2 = mockSchema("code2", AttrSchemaType.String, true);

        when(realmUtils.getField(anyString())).thenReturn(Optional.empty());

        doReturn(Optional.of(schema1))
                .when(plainSchemaDAO).findById("code1");

        doReturn(Optional.of(schema2))
                .when(plainSchemaDAO).findById("code2");

        /*
         * The DAO does not allow ordering by more than one unique plain
         * attribute. This test covers the invalid search parameter path.
         */
        assertThrows(SyncopeClientException.class,
                () -> searchDAO.parseOrderBy(
                        Streamable.of(
                                Sort.Order.asc("code1"),
                                Sort.Order.asc("code2"))),
                "TC18 failed: ordering by more than one unique plain schema should throw SyncopeClientException.");
    }

    @Test
    @DisplayName("TC19: doSearch - Paged Search Adds SKIP and LIMIT")
    public void testTC19_doSearch_Paginated() {
        searchDAO = new Neo4jRealmSearchDAO(
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
            protected QueryInfo getQuery(final SearchCond cond, final Map<String, Object> parameters) {
                parameters.put("param0", "odd");

                TextStringBuilder query =
                        new TextStringBuilder("MATCH (n) WHERE n.name=$param0 ");

                return new QueryInfo(
                        query,
                        new HashSet<>(Set.of("name")),
                        new HashSet<>());
            }
        };

        SearchCond cond = mock(SearchCond.class);
        Realm realm = mock(Realm.class);

        when(realmUtils.getField("name")).thenReturn(Optional.of(mockRealmField()));

        doReturn(Optional.empty())
                .when(plainSchemaDAO).findById("name");

        when(neo4jClient.query(argThat((String query) ->
                query.contains("SKIP 20")
                        && query.contains("LIMIT 10")))
                .bindAll(anyMap())
                .fetch()
                .all())
                .thenReturn(List.of(Map.of("id", "realm-id")));

        doReturn(Optional.of(realm))
                .when(realmDAO).findById("realm-id");

        List<Realm> result = searchDAO.doSearch(
                Set.of("/"),
                cond,
                PageRequest.of(2, 10, Sort.by(Sort.Order.asc("name"))));

        /*
         * Page number 2 with size 10 must produce SKIP 20 and LIMIT 10.
         */
        assertEquals(1, result.size(),
                "TC19 failed: paginated search should return one resolved realm.");
        assertEquals(realm, result.get(0),
                "TC19 failed: returned realm is not the expected one.");
    }
}
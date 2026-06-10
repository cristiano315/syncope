/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License. Version 2.0.
 */
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.AuxClassCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

public class Neo4jRealmSearchDAOMutationTest {

    private Neo4jRealmSearchDAO searchDAO;

    private RealmDAO realmDAO;

    private PlainSchemaDAO plainSchemaDAO;

    private RealmUtils realmUtils;

    private Neo4jClient neo4jClient;

    private Neo4jTemplate neo4jTemplate;

    /*
     * Dummy class used only to obtain concrete Field instances.
     */
    private static class DummyRealmFields {

        public String name;

        public String email;
    }

    /*
     * Lightweight subclass used to bypass the heavy validation
     * logic inside AbstractSearchDAO.check().
     *
     * These tests focus on mutation testing of query generation
     * and QueryInfo semantic correctness.
     */
    private static class TestableNeo4jRealmSearchDAO
            extends Neo4jRealmSearchDAO {

        TestableNeo4jRealmSearchDAO(
                final RealmDAO realmDAO,
                final PlainSchemaDAO plainSchemaDAO,
                final RealmUtils realmUtils,
                final Neo4jTemplate neo4jTemplate,
                final Neo4jClient neo4jClient) {

            super(
                    realmDAO,
                    plainSchemaDAO,
                    null,
                    null,
                    null,
                    null,
                    realmUtils,
                    neo4jTemplate,
                    neo4jClient);
        }

        @Override
        protected CheckResult<AnyCond> check(
                final AnyCond cond,
                final Field field,
                final Set<String> relationshipFields) {

            String schemaName = cond.getSchema();
            String expression = cond.getExpression();

            PlainSchema schema = mock(PlainSchema.class);

            when(schema.getKey()).thenReturn(schemaName);
            when(schema.getType()).thenReturn(AttrSchemaType.String);
            when(schema.isUniqueConstraint()).thenReturn(true);

            PlainAttrValue value = mock(PlainAttrValue.class);

            when(value.getValue()).thenReturn(expression);

            return new CheckResult<>(schema, value, cond);
        }

        @Override
        protected CheckResult<AttrCond> check(final AttrCond cond) {

            String schemaName = cond.getSchema();
            String expression = cond.getExpression();

            PlainSchema schema = mock(PlainSchema.class);

            when(schema.getKey()).thenReturn(schemaName);
            when(schema.getType()).thenReturn(AttrSchemaType.String);
            when(schema.isUniqueConstraint()).thenReturn(true);

            PlainAttrValue value = mock(PlainAttrValue.class);

            when(value.getValue()).thenReturn(expression);

            return new CheckResult<>(schema, value, cond);
        }
    }

    @BeforeEach
    public void setUp() {

        realmDAO = mock(RealmDAO.class);
        plainSchemaDAO = mock(PlainSchemaDAO.class);
        realmUtils = mock(RealmUtils.class);
        neo4jClient = mock(Neo4jClient.class);
        neo4jTemplate = mock(Neo4jTemplate.class);

        searchDAO = new TestableNeo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                realmUtils,
                neo4jTemplate,
                neo4jClient);
    }

    private Field mockRealmField(final String fieldName) {

        try {
            return DummyRealmFields.class.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
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

    private AttrCond mockAttrCond(
            final AttrCond.Type type,
            final String schema,
            final String expression) {

        AttrCond cond = mock(AttrCond.class);

        when(cond.getType()).thenReturn(type);
        when(cond.getSchema()).thenReturn(schema);
        when(cond.getExpression()).thenReturn(expression);

        return cond;
    }

    private SearchCond mockLeafAttrCond(final AttrCond attrCond) {

        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);

        when(searchCond.asLeaf(AuxClassCond.class))
                .thenReturn(Optional.empty());

        when(searchCond.asLeaf(ResourceCond.class))
                .thenReturn(Optional.empty());

        when(searchCond.asLeaf(AnyCond.class))
                .thenReturn(Optional.empty());

        when(searchCond.asLeaf(AttrCond.class))
                .thenReturn(Optional.of(attrCond));

        return searchCond;
    }

    @Test
    @DisplayName("MT1: AnyCond leaf populates query and involved fields")
    public void testMT1_GetQuery_AnyCondPopulatesFields() {

        AnyCond anyCond = mock(AnyCond.class);

        when(anyCond.getSchema()).thenReturn("name");
        when(anyCond.getType()).thenReturn(AnyCond.Type.EQ);
        when(anyCond.getExpression()).thenReturn("admin");

        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);

        when(searchCond.asLeaf(AuxClassCond.class))
                .thenReturn(Optional.empty());

        when(searchCond.asLeaf(ResourceCond.class))
                .thenReturn(Optional.empty());

        when(searchCond.asLeaf(AttrCond.class))
                .thenReturn(Optional.empty());

        when(searchCond.asLeaf(AnyCond.class))
                .thenReturn(Optional.of(anyCond));

        when(realmUtils.getField("name"))
                .thenReturn(Optional.of(mockRealmField("name")));

        Map<String, Object> params = new HashMap<>();

        Neo4jRealmSearchDAO.QueryInfo queryInfo =
                searchDAO.getQuery(searchCond, params);

        assertTrue(
                queryInfo.query().toString().contains("MATCH (n) WHERE"),
                "MT1 failed: AnyCond query was not generated.");

        assertTrue(
                queryInfo.fields().contains("name"),
                "MT1 failed: involved field was not tracked.");

        assertEquals(
                "admin",
                params.get("param0"),
                "MT1 failed: parameter value was not propagated.");
    }

    @Test
    @DisplayName("MT2: AttrCond leaf populates plain schemas")
    public void testMT2_GetQuery_AttrCondPopulatesPlainSchemas() {

        AttrCond attrCond =
                mockAttrCond(
                        AttrCond.Type.EQ,
                        "city",
                        "Rome");

        PlainSchema schema =
                mockSchema(
                        "city",
                        AttrSchemaType.String,
                        true);

        doReturn(Optional.of(schema))
                .when(plainSchemaDAO).findById("city");

        SearchCond cond = mockLeafAttrCond(attrCond);

        Map<String, Object> params = new HashMap<>();

        Neo4jRealmSearchDAO.QueryInfo queryInfo =
                searchDAO.getQuery(cond, params);

        assertFalse(
                queryInfo.plainSchemas().isEmpty(),
                "MT2 failed: plain schema tracking is empty.");

        assertEquals(
                "city",
                queryInfo.plainSchemas().iterator().next().getKey(),
                "MT2 failed: incorrect plain schema collected.");
    }

    @Test
    @DisplayName("MT3: queryOp builds both EXISTS clauses")
    public void testMT3_QueryOp_BuildsExistsClauses() {

        TextStringBuilder result = new TextStringBuilder();

        Neo4jRealmSearchDAO.QueryInfo left =
                new Neo4jRealmSearchDAO.QueryInfo(
                        new TextStringBuilder(
                                "MATCH (n) WHERE n.name=$param0 "),
                        Set.of(),
                        Set.of());

        Neo4jRealmSearchDAO.QueryInfo right =
                new Neo4jRealmSearchDAO.QueryInfo(
                        new TextStringBuilder(
                                "MATCH (n) WHERE n.age>$param1 "),
                        Set.of(),
                        Set.of());

        Neo4jRealmSearchDAO.queryOp(
                result,
                "AND",
                left,
                right);

        String query = result.toString();

        assertTrue(
                query.contains("EXISTS"),
                "MT3 failed: EXISTS clause missing.");

        assertTrue(
                query.contains("AND"),
                "MT3 failed: boolean operator missing.");

        assertTrue(
                query.contains("n.name"),
                "MT3 failed: left query fragment missing.");

        assertTrue(
                query.contains("n.age"),
                "MT3 failed: right query fragment missing.");
    }

    @Test
    @DisplayName("MT4: wrapQuery removes redundant id field")
    public void testMT4_WrapQuery_RemovesIdField() {

        Map<String, Object> params = new HashMap<>();

        Set<String> fields = new HashSet<>();
        fields.add("id");

        Neo4jRealmSearchDAO.QueryInfo queryInfo =
                new Neo4jRealmSearchDAO.QueryInfo(
                        new TextStringBuilder(
                                "MATCH (n) WHERE n.name=$param0 "),
                        fields,
                        new HashSet<>());

        searchDAO.wrapQuery(
                Set.of("/"),
                queryInfo,
                Streamable.empty(),
                params);

        assertFalse(
                queryInfo.query().toString().contains(", n.id AS id"),
                "MT4 failed: duplicated id field detected.");
    }

    @Test
    @DisplayName("MT5: parseOrderBy returns expected clause")
    public void testMT5_ParseOrderBy_ReturnsClause() {

        when(realmUtils.getField("name"))
                .thenReturn(Optional.of(mockRealmField("name")));

        List<String> result =
                searchDAO.parseOrderBy(
                        Streamable.of(Sort.Order.desc("name")));

        assertEquals(
                1,
                result.size(),
                "MT5 failed: expected exactly one ORDER BY clause.");

        assertEquals(
                "name DESC",
                result.get(0),
                "MT5 failed: incorrect ORDER BY clause.");
    }

    @Test
    @DisplayName("MT6: Nested AND conditions collect all fields")
    public void testMT6_GetQuery_AndCollectsFields() {

        AnyCond leftAnyCond = mock(AnyCond.class);

        when(leftAnyCond.getSchema()).thenReturn("name");
        when(leftAnyCond.getType()).thenReturn(AnyCond.Type.EQ);
        when(leftAnyCond.getExpression()).thenReturn("admin");

        AnyCond rightAnyCond = mock(AnyCond.class);

        when(rightAnyCond.getSchema()).thenReturn("email");
        when(rightAnyCond.getType()).thenReturn(AnyCond.Type.EQ);
        when(rightAnyCond.getExpression()).thenReturn("admin@apache.org");

        SearchCond left = mock(SearchCond.class);

        when(left.getType()).thenReturn(SearchCond.Type.LEAF);

        when(left.asLeaf(AuxClassCond.class))
                .thenReturn(Optional.empty());

        when(left.asLeaf(ResourceCond.class))
                .thenReturn(Optional.empty());

        when(left.asLeaf(AttrCond.class))
                .thenReturn(Optional.empty());

        when(left.asLeaf(AnyCond.class))
                .thenReturn(Optional.of(leftAnyCond));

        SearchCond right = mock(SearchCond.class);

        when(right.getType()).thenReturn(SearchCond.Type.LEAF);

        when(right.asLeaf(AuxClassCond.class))
                .thenReturn(Optional.empty());

        when(right.asLeaf(ResourceCond.class))
                .thenReturn(Optional.empty());

        when(right.asLeaf(AttrCond.class))
                .thenReturn(Optional.empty());

        when(right.asLeaf(AnyCond.class))
                .thenReturn(Optional.of(rightAnyCond));

        SearchCond andCond = mock(SearchCond.class);

        when(andCond.getType()).thenReturn(SearchCond.Type.AND);
        when(andCond.getLeft()).thenReturn(left);
        when(andCond.getRight()).thenReturn(right);

        when(realmUtils.getField("name"))
                .thenReturn(Optional.of(mockRealmField("name")));

        when(realmUtils.getField("email"))
                .thenReturn(Optional.of(mockRealmField("email")));

        Map<String, Object> params = new HashMap<>();

        Neo4jRealmSearchDAO.QueryInfo queryInfo =
                searchDAO.getQuery(andCond, params);

        assertTrue(
                queryInfo.fields().contains("name"),
                "MT6 failed: left field missing.");

        assertTrue(
                queryInfo.fields().contains("email"),
                "MT6 failed: right field missing.");

        assertTrue(
                queryInfo.query().toString().contains("AND"),
                "MT6 failed: boolean composition missing.");
    }

    @Test
    @DisplayName("MT7: parseOrderBy accepts plain schema ordering")
    public void testMT7_ParseOrderBy_PlainSchema() {

        PlainSchema schema =
                mockSchema(
                        "city",
                        AttrSchemaType.String,
                        true);

        when(realmUtils.getField("city"))
                .thenReturn(Optional.empty());

        doReturn(Optional.of(schema))
                .when(plainSchemaDAO).findById("city");

        List<String> clauses =
                searchDAO.parseOrderBy(
                        Streamable.of(Sort.Order.asc("city")));

        assertEquals(
                1,
                clauses.size(),
                "MT7 failed: expected one ORDER BY clause.");

        assertEquals(
                "city ASC",
                clauses.get(0),
                "MT7 failed: incorrect ORDER BY clause.");
    }

    @Test
@DisplayName("MT8: getQuery invokes custom condition hook")
public void testMT8_GetQuery_CustomCondHookInvoked() {

    Neo4jRealmSearchDAO customDAO =
            new TestableNeo4jRealmSearchDAO(
                    realmDAO,
                    plainSchemaDAO,
                    realmUtils,
                    neo4jTemplate,
                    neo4jClient) {

        @Override
        protected void getQueryForCustomConds(
                final SearchCond cond,
                final Map<String, Object> parameters,
                final boolean not,
                final TextStringBuilder query) {

            query.append(" CUSTOM_HOOK ");
        }
    };

    SearchCond cond = mock(SearchCond.class);

    when(cond.getType()).thenReturn(SearchCond.Type.LEAF);

    when(cond.asLeaf(AuxClassCond.class))
            .thenReturn(Optional.empty());

    when(cond.asLeaf(ResourceCond.class))
            .thenReturn(Optional.empty());

    when(cond.asLeaf(AnyCond.class))
            .thenReturn(Optional.empty());

    when(cond.asLeaf(AttrCond.class))
            .thenReturn(Optional.empty());

    Neo4jRealmSearchDAO.QueryInfo queryInfo =
            customDAO.getQuery(cond, new HashMap<>());

    assertTrue(
            queryInfo.query().toString().contains("CUSTOM_HOOK"),
            "MT8 failed: custom hook was not invoked.");
}

@Test
@DisplayName("MT9: wrapQuery adds realm fields and schema fields")
public void testMT9_WrapQuery_AddsFieldsToWithClause() {

    Map<String, Object> params = new HashMap<>();

    Set<String> fields = new HashSet<>();
    fields.add("name");

    PlainSchema schema =
            mockSchema(
                    "city",
                    AttrSchemaType.String,
                    true);

    Neo4jRealmSearchDAO.QueryInfo queryInfo =
            new Neo4jRealmSearchDAO.QueryInfo(
                    new TextStringBuilder(
                            "MATCH (n) WHERE n.name=$param0 "),
                    fields,
                    new HashSet<>(Set.of(schema)));

    when(realmUtils.getField("name"))
            .thenReturn(Optional.of(mockRealmField("name")));

    searchDAO.wrapQuery(
            Set.of("/"),
            queryInfo,
            Streamable.empty(),
            params);

    String query = queryInfo.query().toString();

    assertTrue(
            query.contains("n.name AS name"),
            "MT9 failed: realm field missing from WITH clause.");

    assertTrue(
            query.contains("plainAttrs.city"),
            "MT9 failed: plain schema projection missing.");
}

@Test
@DisplayName("MT10: AttrCond query generation is not empty")
public void testMT10_AttrCondGeneratedQueryNotEmpty() {

    AttrCond cond =
            mockAttrCond(
                    AttrCond.Type.EQ,
                    "city",
                    "Rome");

    Neo4jRealmSearchDAO.QueryInfo queryInfo =
            searchDAO.getQuery(
                    mockLeafAttrCond(cond),
                    new HashMap<>());

    assertFalse(
            queryInfo.query().toString().isBlank(),
            "MT10 failed: generated AttrCond query is empty.");

    assertTrue(
            queryInfo.query().toString().contains("WHERE"),
            "MT10 failed: generated WHERE clause missing.");
}


@Test
@DisplayName("MT11: doSearch uses wrapQuery generated filters")
@SuppressWarnings("unchecked")
public void testMT11_DoSearch_UsesWrapQuery() {

    SearchCond cond = mock(SearchCond.class);

    when(cond.getType()).thenReturn(SearchCond.Type.LEAF);

    when(cond.asLeaf(AuxClassCond.class))
            .thenReturn(Optional.empty());

    when(cond.asLeaf(ResourceCond.class))
            .thenReturn(Optional.empty());

    when(cond.asLeaf(AnyCond.class))
            .thenReturn(Optional.empty());

    when(cond.asLeaf(AttrCond.class))
            .thenReturn(Optional.empty());

    Neo4jClient.UnboundRunnableSpec spec =
            mock(
                    Neo4jClient.UnboundRunnableSpec.class,
                    org.mockito.Mockito.RETURNS_DEEP_STUBS);

    when(neo4jClient.query(
            org.mockito.ArgumentMatchers.argThat(
                    (String query) -> query.contains("n.fullPath"))))
            .thenReturn(spec);

    when(spec.bindAll(org.mockito.ArgumentMatchers.anyMap())
            .fetch()
            .all())
            .thenReturn(List.of());

    List<?> result = searchDAO.doSearch(
            Set.of("/root"),
            cond,
            org.springframework.data.domain.Pageable.unpaged());

    assertTrue(
            result.isEmpty(),
            "MT11 failed: mocked wrapped search should return empty list.");
}

}
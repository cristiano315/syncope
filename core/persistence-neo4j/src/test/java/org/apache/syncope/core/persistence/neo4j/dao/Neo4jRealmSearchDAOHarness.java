/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.search.AnyCond;
import org.apache.syncope.core.persistence.api.dao.search.AttrCond;
import org.apache.syncope.core.persistence.api.dao.search.AuxClassCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainAttrValue;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

/**
 * Randoop-friendly harness for Neo4jRealmSearchDAO.
 *
 * The goal of this class is to expose protected query-building methods through
 * public scenario methods that use internally consistent mocked Syncope objects.
 *
 * The harness intentionally avoids real Neo4j access.
 */
public class Neo4jRealmSearchDAOHarness extends Neo4jRealmSearchDAO {

    private boolean syntheticQueryMode;

    public Neo4jRealmSearchDAOHarness() {
        super(
                mock(RealmDAO.class),
                mock(PlainSchemaDAO.class),
                mock(UserDAO.class),
                mock(GroupDAO.class),
                mock(EntityFactory.class),
                mock(PlainAttrValidationManager.class),
                mock(RealmUtils.class),
                mock(Neo4jTemplate.class),
                mock(Neo4jClient.class));
    }

    public Neo4jRealmSearchDAOHarness(
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

    @Override
    protected QueryInfo getQuery(final SearchCond cond, final Map<String, Object> parameters) {
        if (syntheticQueryMode) {
            Set<String> fields = new HashSet<>();
            fields.add("id");
            fields.add("name");

            Set<PlainSchema> schemas = new HashSet<>();
            schemas.add(schema("email", AttrSchemaType.String, true));
            schemas.add(schema("surname", AttrSchemaType.String, false));

            return new QueryInfo(
                    new TextStringBuilder("MATCH (n) WHERE n.name = $name "),
                    fields,
                    schemas);
        }

        return super.getQuery(cond, parameters);
    }

    public static Neo4jRealmSearchDAOHarness create() {
        return new Neo4jRealmSearchDAOHarness();
    }

    public static AttrCond.Type[] attrCondTypes() {
        return AttrCond.Type.values();
    }

    public static AttrSchemaType[] attrSchemaTypes() {
        return AttrSchemaType.values();
    }

    public static Sort.Direction[] sortDirections() {
        return Sort.Direction.values();
    }

    public static OffsetDateTime fixedDate() {
        return OffsetDateTime.parse("2024-01-02T03:04:05Z");
    }

    public static Collection<Map<String, Object>> emptyResult() {
        return List.of();
    }

    public String publicSetParameter(final Object value) {
        Map<String, Object> parameters = new HashMap<>();
        return setParameter(parameters, value) + "=" + parameters.get("param0");
    }

    public String publicSetTwoParameters(final Object first, final Object second) {
        Map<String, Object> parameters = new HashMap<>();
        String firstName = setParameter(parameters, first);
        String secondName = setParameter(parameters, second);
        return firstName + "," + secondName + "," + parameters.size();
    }

    public String publicEscapeIfString(final String value, final boolean isString) {
        return escapeIfString(value, isString);
    }

    public String publicAppendPlainAttrCond(
            final String schemaKey,
            final AttrSchemaType type,
            final boolean unique,
            final String condition) {

        TextStringBuilder query = new TextStringBuilder();
        appendPlainAttrCond(query, schema(schemaKey, type, unique), condition);
        return query.toString();
    }

    public int publicCoverAppendPlainAttrCondAllBranches() {
        List<String> queries = new ArrayList<>();

        for (AttrSchemaType type : AttrSchemaType.values()) {
            TextStringBuilder uniqueQuery = new TextStringBuilder();
            appendPlainAttrCond(uniqueQuery, schema("unique_" + type.name(), type, true), " = 1");
            queries.add(uniqueQuery.toString());

            TextStringBuilder nonUniqueQuery = new TextStringBuilder();
            appendPlainAttrCond(nonUniqueQuery, schema("multi_" + type.name(), type, false), " = 1");
            queries.add(nonUniqueQuery.toString());
        }

        return queries.stream().mapToInt(String::length).sum();
    }

    public String publicQueryOp(
            final String leftQuery,
            final String operator,
            final String rightQuery) {

        TextStringBuilder output = new TextStringBuilder();

        QueryInfo leftInfo = new QueryInfo(
                new TextStringBuilder(leftQuery),
                new HashSet<>(),
                new HashSet<>());

        QueryInfo rightInfo = new QueryInfo(
                new TextStringBuilder(rightQuery),
                new HashSet<>(),
                new HashSet<>());

        queryOp(output, operator, leftInfo, rightInfo);
        return output.toString();
    }

    public String publicAuxClassQuery(final String auxClass, final boolean not) {
        Map<String, Object> parameters = new HashMap<>();

        AuxClassCond cond = new AuxClassCond();
        cond.setAuxClass(auxClass);

        return getQuery(cond, not, parameters) + " PARAMS=" + parameters;
    }

    public String publicResourceQuery(final String resource, final boolean not) {
        Map<String, Object> parameters = new HashMap<>();

        ResourceCond cond = new ResourceCond();
        cond.setResource(resource);

        return getQuery(cond, not, parameters) + " PARAMS=" + parameters;
    }

    public String publicFillAttrQuery(
            final String schemaKey,
            final AttrSchemaType schemaType,
            final boolean unique,
            final AttrCond.Type conditionType,
            final String expression,
            final boolean not) {

        return executeAttrCondFill(
                schemaKey,
                schemaType,
                unique,
                conditionType,
                expression,
                expression,
                null,
                not);
    }

    public String publicFillAttrQueryWithDate(
            final String schemaKey,
            final boolean unique,
            final AttrCond.Type conditionType,
            final String expression,
            final boolean not,
            final OffsetDateTime dateValue) {

        return executeAttrCondFill(
                schemaKey,
                AttrSchemaType.Date,
                unique,
                conditionType,
                expression,
                null,
                dateValue,
                not);
    }

    public int publicCoverAttrCondFillAllBranches() {
        List<String> queries = new ArrayList<>();

        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.EQ, "alice", "alice", null, false));
        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.EQ, "a.b", "a.b", null, false));
        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.IEQ, "ALICE", "ALICE", null, false));
        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.LIKE, "%ali%", "%ali%", null, false));
        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.ILIKE, "%ALI%", "%ALI%", null, false));

        queries.add(executeAttrCondFill("nickname", AttrSchemaType.String, false,
                AttrCond.Type.EQ, "bob", "bob", null, false));
        queries.add(executeAttrCondFill("nickname", AttrSchemaType.String, false,
                AttrCond.Type.LIKE, "%bo%", "%bo%", null, false));
        queries.add(executeAttrCondFill("nickname", AttrSchemaType.String, false,
                AttrCond.Type.EQ, "bob", "bob", null, true));
        queries.add(executeAttrCondFill("nickname", AttrSchemaType.String, false,
                AttrCond.Type.LIKE, "%bo%", "%bo%", null, true));

        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.ISNULL, "", "", null, false));
        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.ISNOTNULL, "", "", null, false));
        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.ISNULL, "", "", null, true));

        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, true,
                AttrCond.Type.EQ, "10", 10L, null, false));
        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, false,
                AttrCond.Type.GE, "10", 10L, null, false));
        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, false,
                AttrCond.Type.GT, "10", 10L, null, false));
        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, false,
                AttrCond.Type.LE, "10", 10L, null, false));
        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, false,
                AttrCond.Type.LT, "10", 10L, null, false));

        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, true,
                AttrCond.Type.EQ, "notALong", "notALong", null, false));

        queries.add(executeAttrCondFill("score", AttrSchemaType.Double, true,
                AttrCond.Type.EQ, "12.5", 12.5D, null, false));
        queries.add(executeAttrCondFill("score", AttrSchemaType.Double, true,
                AttrCond.Type.EQ, "notADouble", "notADouble", null, false));

        queries.add(executeAttrCondFill("active", AttrSchemaType.Boolean, true,
                AttrCond.Type.EQ, "true", Boolean.TRUE, null, false));
        queries.add(executeAttrCondFill("active", AttrSchemaType.Boolean, true,
                AttrCond.Type.EQ, "notABoolean", "notABoolean", null, false));

        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, true,
                AttrCond.Type.LIKE, "%10%", 10L, null, false));
        queries.add(executeAttrCondFill("active", AttrSchemaType.Boolean, false,
                AttrCond.Type.ILIKE, "%true%", Boolean.TRUE, null, false));

        queries.add(executeAttrCondFill("creationDate", AttrSchemaType.Date, true,
                AttrCond.Type.GE, "ignored", null, fixedDate(), false));
        queries.add(executeAttrCondFill("creationDate", AttrSchemaType.Date, false,
                AttrCond.Type.LT, "ignored", null, fixedDate(), false));

        queries.add(executeAttrCondFill("username", AttrSchemaType.String, true,
                AttrCond.Type.EQ, "charlie", "charlie", null, true));
        queries.add(executeAttrCondFill("loginCount", AttrSchemaType.Long, true,
                AttrCond.Type.GT, "5", 5L, null, true));

        return queries.stream().mapToInt(String::length).sum();
    }

    public String publicFillAnyCondQuery(
            final String schemaKey,
            final AttrSchemaType schemaType,
            final AttrCond.Type conditionType,
            final String expression,
            final Object typedValue,
            final boolean not) {

        return executeAnyCondFill(
                schemaKey,
                schemaType,
                conditionType,
                expression,
                typedValue,
                not);
    }

    public String publicFillAnyCondQueryWithStringValue(
            final String schemaKey,
            final AttrCond.Type conditionType,
            final String expression,
            final boolean not) {

        return executeAnyCondFill(
                schemaKey,
                AttrSchemaType.String,
                conditionType,
                expression,
                expression,
                not);
    }

    public int publicCoverAnyCondFillAllBranches() {
        List<String> queries = new ArrayList<>();

        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.ISNULL, "", "", false));
        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.ISNOTNULL, "", "", false));

        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.EQ, "alice", "alice", false));
        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.IEQ, "ALICE", "ALICE", false));
        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.LIKE, "%ali%", "alice", false));
        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.ILIKE, "%ALI%", "ALICE", false));

        queries.add(executeAnyCondFill("loginCount", AttrSchemaType.Long,
                AttrCond.Type.GE, "10", 10L, false));
        queries.add(executeAnyCondFill("loginCount", AttrSchemaType.Long,
                AttrCond.Type.GT, "10", 10L, false));
        queries.add(executeAnyCondFill("loginCount", AttrSchemaType.Long,
                AttrCond.Type.LE, "10", 10L, false));
        queries.add(executeAnyCondFill("loginCount", AttrSchemaType.Long,
                AttrCond.Type.LT, "10", 10L, false));

        queries.add(executeAnyCondFill("loginCount", AttrSchemaType.Long,
                AttrCond.Type.LIKE, "%10%", 10L, false));

        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.EQ, "bob", "bob", true));
        queries.add(executeAnyCondFill("name", AttrSchemaType.String,
                AttrCond.Type.ISNULL, "", "", true));
        queries.add(executeAnyCondFill("loginCount", AttrSchemaType.Long,
                AttrCond.Type.GT, "5", 5L, true));

        return queries.stream().mapToInt(String::length).sum();
    }

    public String publicWrapQueryStartingWithMatch(
            final String base,
            final String extraBase,
            final String field,
            final String schemaKey,
            final AttrSchemaType schemaType,
            final boolean uniqueSchema) {

        Map<String, Object> parameters = new HashMap<>();

        Set<String> bases = new HashSet<>();
        bases.add(base);
        bases.add(extraBase);

        Set<String> fields = new HashSet<>();
        fields.add("id");
        fields.add(field);

        Set<PlainSchema> schemas = new HashSet<>();
        schemas.add(schema(schemaKey, schemaType, uniqueSchema));

        QueryInfo queryInfo = new QueryInfo(
                new TextStringBuilder("MATCH (n) WHERE n.name = $name "),
                fields,
                schemas);

        Sort.Order order = Sort.Order.asc(field);
        doReturn(Optional.of(new Object())).when(realmUtils).getField(field);

        wrapQuery(bases, queryInfo, Streamable.of(order), parameters);

        return queryInfo.query().toString() + " PARAMS=" + parameters;
    }

    public String publicWrapQueryStartingWithExists(
            final String base,
            final String field,
            final String schemaKey,
            final AttrSchemaType schemaType,
            final boolean uniqueSchema) {

        Map<String, Object> parameters = new HashMap<>();

        Set<String> bases = new HashSet<>();
        bases.add(base);

        Set<String> fields = new HashSet<>();
        fields.add(field);

        PlainSchema schema = schema(schemaKey, schemaType, uniqueSchema);
        Set<PlainSchema> schemas = new HashSet<>();
        schemas.add(schema);

        QueryInfo queryInfo = new QueryInfo(
                new TextStringBuilder("WHERE EXISTS { MATCH (n) WHERE n.name = $name } "),
                fields,
                schemas);

        doReturn(Optional.empty()).when(realmUtils).getField(schemaKey);
        doReturn(Optional.of(schema)).when(plainSchemaDAO).findById(schemaKey);

        Sort.Order order = Sort.Order.desc(schemaKey);

        wrapQuery(bases, queryInfo, Streamable.of(order), parameters);

        return queryInfo.query().toString() + " PARAMS=" + parameters;
    }

    public String publicRootLikeValue() {
        Map<String, Object> parameters = new HashMap<>();

        Set<String> bases = new HashSet<>();
        bases.add(SyncopeConstants.ROOT_REALM);

        QueryInfo queryInfo = new QueryInfo(
                new TextStringBuilder("MATCH (n) WHERE n.name = $name "),
                new HashSet<>(),
                new HashSet<>());

        wrapQuery(bases, queryInfo, Streamable.empty(), parameters);

        return queryInfo.query().toString() + " PARAMS=" + parameters;
    }

    public List<String> publicParseOrderByField(
            final String field,
            final Sort.Direction direction) {

        doReturn(Optional.of(new Object())).when(realmUtils).getField(field);

        return parseOrderBy(Streamable.of(new Sort.Order(direction, field)));
    }

    public List<String> publicParseOrderByUniqueSchema(
            final String schemaKey,
            final AttrSchemaType schemaType,
            final Sort.Direction direction) {

        doReturn(Optional.empty()).when(realmUtils).getField(schemaKey);
        doReturn(Optional.of(schema(schemaKey, schemaType, true))).when(plainSchemaDAO).findById(schemaKey);

        return parseOrderBy(Streamable.of(new Sort.Order(direction, schemaKey)));
    }

    public List<String> publicParseOrderByNonUniqueSchema(
            final String schemaKey,
            final AttrSchemaType schemaType,
            final Sort.Direction direction) {

        doReturn(Optional.empty()).when(realmUtils).getField(schemaKey);
        doReturn(Optional.of(schema(schemaKey, schemaType, false))).when(plainSchemaDAO).findById(schemaKey);

        return parseOrderBy(Streamable.of(new Sort.Order(direction, schemaKey)));
    }

    public List<String> publicParseOrderByTwoUniqueSchemas(
            final String firstSchemaKey,
            final String secondSchemaKey) {

        PlainSchema first = schema(firstSchemaKey, AttrSchemaType.String, true);
        PlainSchema second = schema(secondSchemaKey, AttrSchemaType.String, true);

        doReturn(Optional.empty()).when(realmUtils).getField(anyString());
        doReturn(Optional.of(first)).when(plainSchemaDAO).findById(firstSchemaKey);
        doReturn(Optional.of(second)).when(plainSchemaDAO).findById(secondSchemaKey);

        return parseOrderBy(Streamable.of(
                Sort.Order.asc(firstSchemaKey),
                Sort.Order.desc(secondSchemaKey)));
    }

    public List<String> publicParseOrderByTwoNonUniqueSchemas(
            final String firstSchemaKey,
            final String secondSchemaKey) {

        PlainSchema first = schema(firstSchemaKey, AttrSchemaType.String, false);
        PlainSchema second = schema(secondSchemaKey, AttrSchemaType.String, false);

        doReturn(Optional.empty()).when(realmUtils).getField(anyString());
        doReturn(Optional.of(first)).when(plainSchemaDAO).findById(firstSchemaKey);
        doReturn(Optional.of(second)).when(plainSchemaDAO).findById(secondSchemaKey);

        return parseOrderBy(Streamable.of(
                Sort.Order.asc(firstSchemaKey),
                Sort.Order.desc(secondSchemaKey)));
    }

    public int publicToListSize(
            final String property,
            final String firstId,
            final boolean firstFound,
            final String secondId,
            final boolean secondFound) {

        Realm firstRealm = mock(Realm.class);
        Realm secondRealm = mock(Realm.class);

        when(firstRealm.getKey()).thenReturn(firstId);
        when(secondRealm.getKey()).thenReturn(secondId);

        doReturn(firstFound ? Optional.of(firstRealm) : Optional.empty()).when(realmDAO).findById(firstId);
        doReturn(secondFound ? Optional.of(secondRealm) : Optional.empty()).when(realmDAO).findById(secondId);

        List<Map<String, Object>> result = new ArrayList<>();

        Map<String, Object> first = new HashMap<>();
        first.put(property, firstId);
        result.add(first);

        Map<String, Object> second = new HashMap<>();
        second.put(property, secondId);
        result.add(second);

        return toList(result, property).size();
    }

    public long publicCoverDoCountWithSyntheticQuery() {
        when(neo4jTemplate.count(anyString(), anyMap())).thenReturn(123L);

        syntheticQueryMode = true;
        try {
            Set<String> bases = new HashSet<>();
            bases.add(SyncopeConstants.ROOT_REALM);
            bases.add("/even/two");

            return doCount(bases, null);
        } finally {
            syntheticQueryMode = false;
        }
    }

    public String publicCoverAnyCondQueryInvalidSchema() {
        AnyCond cond = new AnyCond();
        cond.setSchema("missingField");
        cond.setType(AttrCond.Type.EQ);
        cond.setExpression("value");

        doReturn(Optional.empty()).when(realmUtils).getField("missingField");

        try {
            return getQuery(cond, false, new HashMap<>()).query();
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    public String publicCoverAttrCondQueryInvalidSchema() {
        AttrCond cond = new AttrCond();
        cond.setSchema("missingPlainSchema");
        cond.setType(AttrCond.Type.EQ);
        cond.setExpression("value");

        doReturn(Optional.empty()).when(plainSchemaDAO).findById("missingPlainSchema");

        try {
            AttrCondQuery result = getQuery(cond, false, new HashMap<>());
            return result.query();
        } catch (RuntimeException e) {
            return e.getClass().getName();
        }
    }

    public int publicCoverageBooster() {
        int score = 0;

        score += publicCoverAppendPlainAttrCondAllBranches();
        score += publicCoverAttrCondFillAllBranches();
        score += publicCoverAnyCondFillAllBranches();

        String anyCondResult = publicCoverAnyCondQueryInvalidSchema();
        if (anyCondResult != null) {
            score += anyCondResult.length();
        }

        String attrCondResult = publicCoverAttrCondQueryInvalidSchema();
        if (attrCondResult != null) {
            score += attrCondResult.length();
        }

        score += Long.toString(publicCoverDoCountWithSyntheticQuery()).length();

        return score;
    }

    private String executeAttrCondFill(
            final String schemaKey,
            final AttrSchemaType schemaType,
            final boolean unique,
            final AttrCond.Type conditionType,
            final String expression,
            final Object rawValue,
            final OffsetDateTime dateValue,
            final boolean not) {

        TextStringBuilder query = new TextStringBuilder();

        AttrCond cond = new AttrCond();
        cond.setSchema(schemaKey);
        cond.setType(conditionType);
        cond.setExpression(expression);

        PlainSchema schema = schema(schemaKey, schemaType, unique);
        PlainAttrValue value = attrValue(rawValue == null ? expression : rawValue, dateValue);

        Map<String, Object> parameters = new HashMap<>();
        fillAttrQuery(query, value, schema, cond, not, parameters);

        return query.toString();
    }

    private String executeAnyCondFill(
            final String schemaKey,
            final AttrSchemaType schemaType,
            final AttrCond.Type conditionType,
            final String expression,
            final Object rawValue,
            final boolean not) {

        TextStringBuilder query = new TextStringBuilder();

        AnyCond cond = new AnyCond();
        cond.setSchema(schemaKey);
        cond.setType(conditionType);
        cond.setExpression(expression);

        PlainSchema schema = schema(schemaKey, schemaType, false);
        PlainAttrValue value = attrValue(rawValue, null);

        Map<String, Object> parameters = new HashMap<>();
        fillAttrQuery(query, value, schema, cond, not, parameters);

        return query + " PARAMS=" + parameters;
    }

    private static PlainSchema schema(
            final String key,
            final AttrSchemaType type,
            final boolean unique) {

        PlainSchema schema = mock(PlainSchema.class);
        when(schema.getKey()).thenReturn(key);
        when(schema.getType()).thenReturn(type);
        when(schema.isUniqueConstraint()).thenReturn(unique);
        return schema;
    }

    private static PlainAttrValue attrValue(
            final Object value,
            final OffsetDateTime dateValue) {

        PlainAttrValue attrValue = mock(PlainAttrValue.class);
        when(attrValue.getValue()).thenReturn(value);
        when(attrValue.getDateValue()).thenReturn(dateValue);
        return attrValue;
    }
}
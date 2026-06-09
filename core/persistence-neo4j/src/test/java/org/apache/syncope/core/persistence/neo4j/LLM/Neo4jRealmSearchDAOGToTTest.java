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
//###Test START##
package org.apache.syncope.core.persistence.neo4j.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.data.util.Streamable;

class Neo4jRealmSearchDAOGToTTest {

    static class TestableNeo4jRealmSearchDAO extends Neo4jRealmSearchDAO {

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

        static String callSetParameter(
                final Map<String, Object> parameters,
                final Object parameter) {

            return setParameter(parameters, parameter);
        }

        static String callEscapeIfString(
                final String value,
                final boolean isStr) {

            return escapeIfString(value, isStr);
        }

        static void callAppendPlainAttrCond(
                final TextStringBuilder query,
                final PlainSchema schema,
                final String cond) {

            appendPlainAttrCond(query, schema, cond);
        }

        List<Realm> callToList(
                final Collection<Map<String, Object>> result,
                final String property) {

            return toList(result, property);
        }

        String callGetQuery(
                final AuxClassCond cond,
                final boolean not,
                final Map<String, Object> parameters) {

            return getQuery(cond, not, parameters);
        }

        String callGetQuery(
                final ResourceCond cond,
                final boolean not,
                final Map<String, Object> parameters) {

            return getQuery(cond, not, parameters);
        }

        void callFillAttrQuery(
                final TextStringBuilder query,
                final PlainAttrValue attrValue,
                final PlainSchema schema,
                final AttrCond cond,
                final boolean not,
                final Map<String, Object> parameters) {

            fillAttrQuery(query, attrValue, schema, cond, not, parameters);
        }

        List<String> callParseOrderBy(
                final Streamable<Sort.Order> orderBy) {

            return parseOrderBy(orderBy);
        }

        long callDoCount(
                final Set<String> bases,
                final SearchCond cond) {

            return doCount(bases, cond);
        }

        List<Realm> callDoSearch(
                final Set<String> bases,
                final SearchCond cond,
                final Pageable pageable) {

            return doSearch(bases, cond, pageable);
        }
    }

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

    @Mock
    private Neo4jClient neo4jClient;

    @Mock
    private Neo4jClient.UnboundRunnableSpec unboundRunnableSpec;

    @Mock
    private Neo4jClient.RunnableSpec runnableSpec;

    @Mock
    private Neo4jClient.RecordFetchSpec<Map<String, Object>> fetchSpec;

    private TestableNeo4jRealmSearchDAO dao;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);

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

        when(neo4jClient.query(anyString())).thenReturn(unboundRunnableSpec);
        when(unboundRunnableSpec.bindAll(anyMap())).thenReturn(runnableSpec);
        when(runnableSpec.fetch()).thenReturn(fetchSpec);
    }

    @Test
    void testSetParameter() {
        Map<String, Object> parameters = new HashMap<>();

        String result =
                TestableNeo4jRealmSearchDAO.callSetParameter(parameters, "value");

        assertEquals("param0", result);
        assertEquals("value", parameters.get("param0"));
    }

    @Test
    void testEscapeIfStringTrue() {
        String result =
                TestableNeo4jRealmSearchDAO.callEscapeIfString("abc", true);

        assertEquals("\"abc\"", result);
    }

    @Test
    void testEscapeIfStringFalse() {
        String result =
                TestableNeo4jRealmSearchDAO.callEscapeIfString("123", false);

        assertEquals("123", result);
    }

    @Test
    void testAppendPlainAttrCondUnique() {
        PlainSchema schema = mock(PlainSchema.class);

        when(schema.isUniqueConstraint()).thenReturn(true);
        when(schema.getKey()).thenReturn("email");
        when(schema.getType()).thenReturn(AttrSchemaType.String);

        TextStringBuilder builder = new TextStringBuilder();

        TestableNeo4jRealmSearchDAO.callAppendPlainAttrCond(
                builder,
                schema,
                " = \"value\"");

        assertTrue(builder.toString().contains("email"));
    }

    @Test
    void testToList() {
        Realm realm = mock(Realm.class);

        Map<String, Object> row = new HashMap<>();
        row.put("id", "100");

        when(realmDAO.findById("100"))
                .thenAnswer(invocation -> Optional.of(realm));

        List<Realm> result = dao.callToList(List.of(row), "id");

        assertEquals(1, result.size());
    }

    @Test
    void testFindByFullPath() {
        Realm realm = mock(Realm.class);

        Map<String, Object> row = new HashMap<>();
        row.put("n.id", "123");

        when(fetchSpec.one()).thenReturn(Optional.of(row));

        when(realmDAO.findById("123"))
                .thenAnswer(invocation -> Optional.of(realm));

        Optional<Realm> result = dao.findByFullPath("/");

        assertTrue(result.isPresent());
    }

    @Test
    void testFindByFullPathMalformed() {
        assertThrows(
                MalformedPathException.class,
                () -> dao.findByFullPath("invalid"));
    }

    @Test
    void testFindByName() {
        Realm realm = mock(Realm.class);

        Map<String, Object> row = new HashMap<>();
        row.put("n.id", "10");

        when(fetchSpec.all()).thenReturn(List.of(row));

        when(realmDAO.findById("10"))
                .thenAnswer(invocation -> Optional.of(realm));

        List<Realm> result = dao.findByName("master");

        assertEquals(1, result.size());
    }

    @Test
    void testFindChildren() {
        Realm parent = mock(Realm.class);
        Realm child = mock(Realm.class);

        when(parent.getKey()).thenReturn("parent");

        Map<String, Object> row = new HashMap<>();
        row.put("c.id", "child");

        when(fetchSpec.all()).thenReturn(List.of(row));

        when(realmDAO.findById("child"))
                .thenAnswer(invocation -> Optional.of(child));

        List<Realm> result = dao.findChildren(parent);

        assertEquals(1, result.size());
    }

    @Test
    void testFindDescendants() {
        Realm realm = mock(Realm.class);

        Map<String, Object> row = new HashMap<>();
        row.put("n.id", "1");

        when(fetchSpec.all()).thenReturn(List.of(row));

        when(realmDAO.findById("1"))
                .thenAnswer(invocation -> Optional.of(realm));

        List<Realm> result = dao.findDescendants("/", null);

        assertEquals(1, result.size());
    }

    @Test
    void testGetQueryAuxClassCond() {
        AuxClassCond cond = new AuxClassCond();
        cond.setAuxClass("aux");

        Map<String, Object> parameters = new HashMap<>();

        String result = dao.callGetQuery(cond, false, parameters);

        assertTrue(result.contains("MATCH"));
    }

    @Test
    void testGetQueryResourceCond() {
        ResourceCond cond = new ResourceCond();
        cond.setResource("resource");

        Map<String, Object> parameters = new HashMap<>();

        String result = dao.callGetQuery(cond, false, parameters);

        assertTrue(result.contains("MATCH"));
    }

    @Test
    void testParseOrderBy() {
        Field field = String.class.getDeclaredFields()[0];

        when(realmUtils.getField("name")).thenReturn(Optional.of(field));

        List<String> result = dao.callParseOrderBy(
                Streamable.of(Sort.Order.asc("name")));

        assertEquals(1, result.size());
    }

    @Test
    void testFillAttrQuery() {
        PlainSchema schema = mock(PlainSchema.class);
        PlainAttrValue value = mock(PlainAttrValue.class);

        when(schema.getType()).thenReturn(AttrSchemaType.String);
        when(schema.isUniqueConstraint()).thenReturn(true);
        when(schema.getKey()).thenReturn("username");

        AttrCond cond = new AttrCond();
        cond.setType(AttrCond.Type.LIKE);
        cond.setExpression("%admin%");

        TextStringBuilder query = new TextStringBuilder();

        dao.callFillAttrQuery(
                query,
                value,
                schema,
                cond,
                false,
                new HashMap<>());

        assertTrue(query.toString().contains("WHERE"));
    }

    @Test
    void testDoCount() {
        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);

        when(neo4jTemplate.count(anyString(), anyMap())).thenReturn(5L);

        long result = dao.callDoCount(Set.of("/"), searchCond);

        assertEquals(5L, result);
    }

    @Test
    void testDoSearch() {
        Realm realm = mock(Realm.class);

        SearchCond searchCond = mock(SearchCond.class);

        when(searchCond.getType()).thenReturn(SearchCond.Type.LEAF);

        Map<String, Object> row = new HashMap<>();
        row.put("id", "200");

        when(fetchSpec.all()).thenReturn(List.of(row));

        when(realmDAO.findById("200"))
                .thenAnswer(invocation -> Optional.of(realm));

        List<Realm> result = dao.callDoSearch(
                Set.of("/"),
                searchCond,
                PageRequest.of(0, 10, Sort.by("name")));

        assertEquals(1, result.size());
    }
}
//###Test END##
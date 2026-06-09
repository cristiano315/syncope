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

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.commons.text.TextStringBuilder;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.search.AuxClassCond;
import org.apache.syncope.core.persistence.api.dao.search.ResourceCond;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.PlainSchema;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;

@ExtendWith(MockitoExtension.class)
class Neo4jRealmSearchDAOZeroShotTest {

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
    private Neo4jClient.UnboundRunnableSpec runnableSpec;

    @Mock
    private Neo4jClient.RunnableSpec runnableBindSpec;

    @Mock
    private Neo4jClient.RecordFetchSpec<Map<String, Object>> fetchSpec;

    private Neo4jRealmSearchDAO dao;

    @BeforeEach
    void setup() {
        dao = new Neo4jRealmSearchDAO(
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

    @Test
    void TC1_findByFullPathInvalid() {
        assertThrows(MalformedPathException.class,
                () -> dao.findByFullPath("invalid path"));
    }

    @Test
    void TC2_findByFullPathFound() {
        Map<String, Object> row = new HashMap<>();
        row.put("n.id", "realm1");

        Realm realm = mock(Realm.class);

        when(neo4jClient.query(anyString())).thenReturn(runnableSpec);
        when(runnableSpec.bindAll(anyMap())).thenReturn(runnableBindSpec);
        when(runnableBindSpec.fetch()).thenReturn(fetchSpec);
        when(fetchSpec.one()).thenReturn(Optional.of(row));

        doReturn(Optional.of(realm)).when(realmDAO).findById("realm1");

        Optional<Realm> result = dao.findByFullPath("/");

        assertTrue(result.isPresent());
    }

    @Test
    void TC3_findByName() {
        Map<String, Object> row = new HashMap<>();
        row.put("n.id", "realm1");

        Realm realm = mock(Realm.class);

        when(neo4jClient.query(anyString())).thenReturn(runnableSpec);
        when(runnableSpec.bindAll(anyMap())).thenReturn(runnableBindSpec);
        when(runnableBindSpec.fetch()).thenReturn(fetchSpec);
        when(fetchSpec.all()).thenReturn(List.of(row));

        doReturn(Optional.of(realm)).when(realmDAO).findById("realm1");

        List<Realm> result = dao.findByName("root");

        assertEquals(1, result.size());
    }

    @Test
    void TC4_findChildren() {
        Realm parent = mock(Realm.class);
        when(parent.getKey()).thenReturn("parent");

        Realm child = mock(Realm.class);

        Map<String, Object> row = new HashMap<>();
        row.put("c.id", "child");

        when(neo4jClient.query(anyString())).thenReturn(runnableSpec);
        when(runnableSpec.bindAll(anyMap())).thenReturn(runnableBindSpec);
        when(runnableBindSpec.fetch()).thenReturn(fetchSpec);
        when(fetchSpec.all()).thenReturn(List.of(row));

        doReturn(Optional.of(child)).when(realmDAO).findById("child");

        List<Realm> result = dao.findChildren(parent);

        assertEquals(1, result.size());
    }

    @Test
    void TC5_setParameterViaReflection() throws Exception {
        Method method = Neo4jRealmSearchDAO.class.getDeclaredMethod(
                "setParameter",
                Map.class,
                Object.class);

        method.setAccessible(true);

        Map<String, Object> params = new HashMap<>();

        String result = (String) method.invoke(null, params, "value");

        assertEquals("param0", result);
        assertEquals("value", params.get("param0"));
    }

    @Test
    void TC6_escapeIfStringViaReflection() throws Exception {
        Method method = Neo4jRealmSearchDAO.class.getDeclaredMethod(
                "escapeIfString",
                String.class,
                boolean.class);

        method.setAccessible(true);

        String result1 = (String) method.invoke(null, "abc", true);
        String result2 = (String) method.invoke(null, "123", false);

        assertEquals("\"abc\"", result1);
        assertEquals("123", result2);
    }

    @Test
    void TC7_appendPlainAttrCondViaReflection() throws Exception {
        PlainSchema schema = mock(PlainSchema.class);

        when(schema.isUniqueConstraint()).thenReturn(true);
        when(schema.getKey()).thenReturn("email");
        when(schema.getType()).thenReturn(AttrSchemaType.String);

        Method method = Neo4jRealmSearchDAO.class.getDeclaredMethod(
                "appendPlainAttrCond",
                TextStringBuilder.class,
                PlainSchema.class,
                String.class);

        method.setAccessible(true);

        TextStringBuilder builder = new TextStringBuilder();

        method.invoke(null, builder, schema, " = \"mail@test.com\"");

        assertTrue(builder.toString().contains("email"));
    }

    @Test
    void TC8_getQueryAuxClass() throws Exception {
        AuxClassCond cond = new AuxClassCond();
        cond.setAuxClass("aux");

        Method method = Neo4jRealmSearchDAO.class.getDeclaredMethod(
                "getQuery",
                AuxClassCond.class,
                boolean.class,
                Map.class);

        method.setAccessible(true);

        Map<String, Object> params = new HashMap<>();

        String result = (String) method.invoke(dao, cond, false, params);

        assertTrue(result.contains("MATCH"));
        assertFalse(params.isEmpty());
    }

    @Test
    void TC9_getQueryResource() throws Exception {
        ResourceCond cond = new ResourceCond();
        cond.setResource("resource");

        Method method = Neo4jRealmSearchDAO.class.getDeclaredMethod(
                "getQuery",
                ResourceCond.class,
                boolean.class,
                Map.class);

        method.setAccessible(true);

        Map<String, Object> params = new HashMap<>();

        String result = (String) method.invoke(dao, cond, false, params);

        assertTrue(result.contains("MATCH"));
    }
}
//###Test END##
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
package org.apache.syncope.core.persistence.neo4j.dao.randoop;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.syncope.common.lib.types.AttrSchemaType;
import org.apache.syncope.core.persistence.api.attrvalue.PlainAttrValidationManager;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.MalformedPathException;
import org.apache.syncope.core.persistence.api.dao.PlainSchemaDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.UserDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.EntityFactory;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.utils.RealmUtils;
import org.apache.syncope.core.persistence.common.dao.AbstractSearchDAO;
import org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.Neo4jTemplate;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Neo4jRealmSearchDAORegressionTest0 {

    public static boolean debug = false;

    private Neo4jRealmSearchDAO newDAO() {
        RealmDAO realmDAO = null;
        PlainSchemaDAO plainSchemaDAO = null;
        UserDAO userDAO = null;
        GroupDAO groupDAO = null;
        EntityFactory entityFactory = null;
        PlainAttrValidationManager plainAttrValidationManager = null;
        RealmUtils realmUtils = null;
        Neo4jTemplate neo4jTemplate = null;
        Neo4jClient neo4jClient = null;

        return new Neo4jRealmSearchDAO(
                realmDAO,
                plainSchemaDAO,
                userDAO,
                groupDAO,
                entityFactory,
                plainAttrValidationManager,
                realmUtils,
                neo4jTemplate,
                neo4jClient);
    }

    @Test
    public void test001() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test001");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        try {
            dao.findByFullPath("");
            Assert.fail("Expected MalformedPathException");
        } catch (MalformedPathException e) {
            // Expected exception.
        }

        try {
            dao.findByFullPath("hi!");
            Assert.fail("Expected MalformedPathException");
        } catch (MalformedPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test002");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        Realm realm = null;

        try {
            dao.findChildren(realm);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }

        try {
            dao.findAncestors(realm);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test003");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        try {
            dao.findDescendants("hi!", "");
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }

        try {
            dao.findByName("hi!");
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test004");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        try {
            dao.findByDerAttrValue("hi!", "", true);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test005");
        }

        try {
            AbstractSearchDAO.key((AttrSchemaType) null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test006");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        Set<String> realms = new LinkedHashSet<>();
        boolean added = Collections.addAll(realms, "hi!");

        long count = dao.count(realms, null);
        SearchCond cond = dao.getAllMatchingCond();

        Assert.assertTrue(added);
        Assert.assertEquals(0L, count);
        Assert.assertNotNull(cond);
    }

    @Test
    public void test007() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test007");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        List<Realm> realms1 = dao.findByDerAttrValue("", "", true);
        List<Realm> realms2 = dao.findByDerAttrValue("", "", false);
        List<Realm> realms3 = dao.findByDerAttrValue("", "hi!", true);

        Assert.assertNotNull(realms1);
        Assert.assertNotNull(realms2);
        Assert.assertNotNull(realms3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test008");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        SearchCond cond = dao.getAllMatchingCond();

        Assert.assertNotNull(cond);
        Assert.assertNotNull(dao.getClass());
    }

    @Test
    public void test009() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test009");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        Set<String> realms = new LinkedHashSet<>();
        Collections.addAll(realms, "");

        Pageable pageable = null;

        try {
            dao.search(realms, dao.getAllMatchingCond(), pageable);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAORegressionTest0.test010");
        }

        Neo4jRealmSearchDAO dao = newDAO();

        List<Realm> ancestorList = List.of();
        Realm realm = null;

        try {
            dao.findAncestors(ancestorList, realm);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }
}
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

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Neo4jRealmSearchDAOHarnessRegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError(
                    "Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }

        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError(
                        "Arrays differ at index " + i + ": "
                        + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAOHarnessRegressionTest0.test001");
        }

        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness harness =
                org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();

        String rootLike = harness.publicRootLikeValue();
        String anyCond = harness.publicCoverAnyCondQueryInvalidSchema();
        String attrCond = harness.publicCoverAttrCondQueryInvalidSchema();

        org.junit.Assert.assertNotNull(harness);
        org.junit.Assert.assertEquals(
                "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) "
                + "AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  "
                + "PARAMS={base1=/, like1=/.*}",
                rootLike);

        org.junit.Assert.assertEquals(
                "Invalid schema missingField",
                anyCond);

        org.junit.Assert.assertEquals(
                "java.lang.IllegalArgumentException",
                attrCond);
    }

    @Test
    public void test002() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAOHarnessRegressionTest0.test002");
        }

        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness harness =
                org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();

        int anyCondBranches = harness.publicCoverAnyCondFillAllBranches();
        int attrCondBranches = harness.publicCoverAttrCondFillAllBranches();
        int appendPlainAttr = harness.publicCoverAppendPlainAttrCondAllBranches();
        int booster = harness.publicCoverageBooster();

        org.junit.Assert.assertNotNull(harness);
        org.junit.Assert.assertTrue(anyCondBranches == 534);
        org.junit.Assert.assertTrue(attrCondBranches == 1159);
        org.junit.Assert.assertTrue(appendPlainAttr == 669);
        org.junit.Assert.assertTrue(booster == 2426);
    }

    @Test
    public void test003() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n",
                    "Neo4jRealmSearchDAOHarnessRegressionTest0.test003");
        }

        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness harness =
                org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();

        long count = harness.publicCoverDoCountWithSyntheticQuery();

        org.junit.Assert.assertNotNull(harness);
        org.junit.Assert.assertTrue(count == 123L);
    }
}
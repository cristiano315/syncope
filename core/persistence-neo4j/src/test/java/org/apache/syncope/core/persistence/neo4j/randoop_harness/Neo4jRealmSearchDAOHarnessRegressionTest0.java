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
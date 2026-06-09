package org.apache.syncope.core.persistence.neo4j.dao.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Neo4jRealmSearchDAOHarnessRegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test501");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid schema missingField" + "'", str7, "Invalid schema missingField");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test502");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        long long9 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 123L + "'", long9 == 123L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 534 + "'", int10 == 534);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid schema missingField" + "'", str11, "Invalid schema missingField");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test503");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long8 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long10 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        long long11 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int12 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int13 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str3, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid schema missingField" + "'", str4, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid schema missingField" + "'", str7, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 123L + "'", long8 == 123L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 534 + "'", int9 == 534);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 123L + "'", long10 == 123L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 123L + "'", long11 == 123L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2426 + "'", int12 == 2426);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 534 + "'", int13 == 534);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test504");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid schema missingField" + "'", str2, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid schema missingField" + "'", str4, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2426 + "'", int6 == 2426);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1159 + "'", int7 == 1159);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test505");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.IllegalArgumentException" + "'", str5, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test506");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str5, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2426 + "'", int7 == 2426);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test507");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str9 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1159 + "'", int7 == 1159);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str8, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str9, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1159 + "'", int10 == 1159);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test508");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.IllegalArgumentException" + "'", str4, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str8, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test509");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.IllegalArgumentException" + "'", str5, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test510");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        long long8 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1159 + "'", int7 == 1159);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 123L + "'", long8 == 123L);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test511");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test512");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str10 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 669 + "'", int8 == 669);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid schema missingField" + "'", str9, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str10, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.IllegalArgumentException" + "'", str11, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test513");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        long long5 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str2, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 123L + "'", long5 == 123L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid schema missingField" + "'", str6, "Invalid schema missingField");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test514");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long8 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str10 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str3, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid schema missingField" + "'", str4, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid schema missingField" + "'", str7, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 123L + "'", long8 == 123L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid schema missingField" + "'", str10, "Invalid schema missingField");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test515");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int11 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid schema missingField" + "'", str8, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1159 + "'", int10 == 1159);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2426 + "'", int11 == 2426);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test516");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 534 + "'", int5 == 534);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test517");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid schema missingField" + "'", str9, "Invalid schema missingField");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test518");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str3, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test519");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        long long7 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        long long10 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int12 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid schema missingField" + "'", str4, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 123L + "'", long7 == 123L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2426 + "'", int8 == 2426);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 123L + "'", long10 == 123L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.IllegalArgumentException" + "'", str11, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 669 + "'", int12 == 669);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test520");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test521");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 534 + "'", int5 == 534);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1159 + "'", int6 == 1159);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test522");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int12 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid schema missingField" + "'", str8, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 534 + "'", int10 == 534);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Invalid schema missingField" + "'", str11, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 534 + "'", int12 == 534);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test523");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test524");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str2, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.IllegalArgumentException" + "'", str5, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 669 + "'", int6 == 669);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2426 + "'", int7 == 2426);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test525");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        long long7 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.IllegalArgumentException" + "'", str5, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 123L + "'", long7 == 123L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test526");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long10 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int11 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str12 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.IllegalArgumentException" + "'", str5, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1159 + "'", int7 == 1159);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 534 + "'", int8 == 534);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Invalid schema missingField" + "'", str9, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 123L + "'", long10 == 123L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2426 + "'", int11 == 2426);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Invalid schema missingField" + "'", str12, "Invalid schema missingField");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test527");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 669 + "'", int4 == 669);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test528");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long9 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str12 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int13 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 534 + "'", int8 == 534);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 123L + "'", long9 == 123L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1159 + "'", int10 == 1159);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.IllegalArgumentException" + "'", str11, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str12, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 669 + "'", int13 == 669);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test529");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str2, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.IllegalArgumentException" + "'", str5, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 669 + "'", int6 == 669);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2426 + "'", int7 == 2426);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 669 + "'", int8 == 669);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test530");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long8 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str9 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 123L + "'", long8 == 123L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.IllegalArgumentException" + "'", str9, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test531");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int12 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str13 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 534 + "'", int7 == 534);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2426 + "'", int8 == 2426);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1159 + "'", int9 == 1159);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.IllegalArgumentException" + "'", str10, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str11, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 669 + "'", int12 == 669);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid schema missingField" + "'", str13, "Invalid schema missingField");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test532");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid schema missingField" + "'", str2, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 669 + "'", int3 == 669);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test533");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 534 + "'", int7 == 534);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 669 + "'", int8 == 669);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 669 + "'", int9 == 669);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2426 + "'", int10 == 2426);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test534");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        long long5 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 669 + "'", int2 == 669);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1159 + "'", int3 == 1159);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1159 + "'", int4 == 1159);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 123L + "'", long5 == 123L);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test535");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str3, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid schema missingField" + "'", str4, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 534 + "'", int7 == 534);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1159 + "'", int10 == 1159);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str11, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test536");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long9 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long12 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int13 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str14 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 534 + "'", int8 == 534);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 123L + "'", long9 == 123L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1159 + "'", int10 == 1159);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.IllegalArgumentException" + "'", str11, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 123L + "'", long12 == 123L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 669 + "'", int13 == 669);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.IllegalArgumentException" + "'", str14, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test537");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid schema missingField" + "'", str8, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 669 + "'", int9 == 669);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.IllegalArgumentException" + "'", str10, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test538");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long5 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long7 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.IllegalArgumentException" + "'", str4, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 123L + "'", long5 == 123L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 123L + "'", long7 == 123L);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test539");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str5, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test540");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Invalid schema missingField" + "'", str2, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1159 + "'", int3 == 1159);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2426 + "'", int7 == 2426);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 534 + "'", int8 == 534);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test541");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 534 + "'", int7 == 534);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 669 + "'", int8 == 669);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test542");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long9 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str11 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long12 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str13 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 534 + "'", int8 == 534);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 123L + "'", long9 == 123L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1159 + "'", int10 == 1159);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.IllegalArgumentException" + "'", str11, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 123L + "'", long12 == 123L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Invalid schema missingField" + "'", str13, "Invalid schema missingField");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test543");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.IllegalArgumentException" + "'", str4, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 534 + "'", int7 == 534);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test544");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 669 + "'", int2 == 669);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Invalid schema missingField" + "'", str4, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test545");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str10 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.IllegalArgumentException" + "'", str7, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Invalid schema missingField" + "'", str8, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2426 + "'", int9 == 2426);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Invalid schema missingField" + "'", str10, "Invalid schema missingField");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test546");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 534 + "'", int4 == 534);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1159 + "'", int5 == 1159);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2426 + "'", int8 == 2426);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test547");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test548");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str6, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str7, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.IllegalArgumentException" + "'", str8, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 534 + "'", int9 == 534);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test549");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        long long4 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 123L + "'", long4 == 123L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str5, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid schema missingField" + "'", str7, "Invalid schema missingField");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test550");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1159 + "'", int7 == 1159);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 534 + "'", int9 == 534);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test551");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.IllegalArgumentException" + "'", str3, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 669 + "'", int5 == 669);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 669 + "'", int6 == 669);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid schema missingField" + "'", str7, "Invalid schema missingField");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test552");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        long long5 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        long long7 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 669 + "'", int4 == 669);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 123L + "'", long5 == 123L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 123L + "'", long7 == 123L);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test553");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test554");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str9 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int11 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int12 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str13 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 669 + "'", int7 == 669);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2426 + "'", int8 == 2426);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str9, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2426 + "'", int10 == 2426);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 534 + "'", int11 == 534);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 534 + "'", int12 == 534);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.IllegalArgumentException" + "'", str13, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test555");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAppendPlainAttrCondAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Invalid schema missingField" + "'", str3, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2426 + "'", int5 == 2426);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 669 + "'", int6 == 669);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test556");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str2 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str7 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        java.lang.String str8 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int10 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long11 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str12 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        java.lang.String str13 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str1, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str2, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 534 + "'", int5 == 534);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Invalid schema missingField" + "'", str6, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Invalid schema missingField" + "'", str7, "Invalid schema missingField");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str8, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 534 + "'", int9 == 534);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 534 + "'", int10 == 534);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 123L + "'", long11 == 123L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str12, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.IllegalArgumentException" + "'", str13, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test557");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        int int4 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        long long6 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int8 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondFillAllBranches();
        int int9 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2426 + "'", int3 == 2426);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2426 + "'", int4 == 2426);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 123L + "'", long6 == 123L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1159 + "'", int7 == 1159);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1159 + "'", int8 == 1159);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 534 + "'", int9 == 534);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test558");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int2 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        long long3 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicRootLikeValue();
        int int5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str6 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Invalid schema missingField" + "'", str1, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 534 + "'", int2 == 534);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 123L + "'", long3 == 123L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}" + "'", str4, "MATCH (n:Realm) WITH n.id AS id WHERE (EXISTS { MATCH (n) WHERE n.name = $name } ) AND EXISTS { (n) WHERE (n.fullPath = $base1 OR n.fullPath =~ $like1) }  PARAMS={base1=/, like1=/.*}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 534 + "'", int5 == 534);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.IllegalArgumentException" + "'", str6, "java.lang.IllegalArgumentException");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Neo4jRealmSearchDAOHarnessRegressionTest1.test559");
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness neo4jRealmSearchDAOHarness0 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAOHarness.create();
        java.lang.String str1 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        long long2 = neo4jRealmSearchDAOHarness0.publicCoverDoCountWithSyntheticQuery();
        int int3 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        java.lang.String str4 = neo4jRealmSearchDAOHarness0.publicCoverAttrCondQueryInvalidSchema();
        java.lang.String str5 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondQueryInvalidSchema();
        int int6 = neo4jRealmSearchDAOHarness0.publicCoverAnyCondFillAllBranches();
        int int7 = neo4jRealmSearchDAOHarness0.publicCoverageBooster();
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAOHarness0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang.IllegalArgumentException" + "'", str1, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 123L + "'", long2 == 123L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.IllegalArgumentException" + "'", str4, "java.lang.IllegalArgumentException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Invalid schema missingField" + "'", str5, "Invalid schema missingField");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 534 + "'", int6 == 534);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2426 + "'", int7 == 2426);
    }
}


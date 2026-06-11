package org.apache.syncope.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionHarnessTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=hi!;size=1", "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: ");
        java.lang.String str21 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\";size=1", "param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1;size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1;size=1");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1;size=1\"" + "'", str2, "\"param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1;size=1\"");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1;size=1");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" } }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" } }" + "'", str2, "WHERE EXISTS { MATCH (n) param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" } }");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1", "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "\"\"param0=100;size=1\"\"", "\"EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1\"");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1;size=1", "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 }");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1" + "'", str2, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: hi!", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: hi!" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: hi!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1", "\"\"param0=100;size=1\"\"", "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) \"\"param0=100;size=1\"\" } EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) \"\"param0=100;size=1\"\" } EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1 }");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, ";params={}", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } EXISTS { MATCH (n) param0=;size=1 }");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("param0=param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1;size=1");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\";size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\";size=1");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1" + "'", str1, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, ";params={}", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }", "EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.Class<?> wildcardClass16 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1 EXISTS { MATCH (n)  }" + "'", str3, "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1 EXISTS { MATCH (n)  }");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=param0=100;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=class java.lang.Object;size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=param0=param0=100;size=1;size=1;size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str16, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } EXISTS { MATCH (n)  }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } EXISTS { MATCH (n)  }");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1", "WHERE EXISTS { MATCH (n) param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 }", "param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 } } param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1 EXISTS { MATCH (n) param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 } } param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1 EXISTS { MATCH (n) param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1 }");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"", "WHERE EXISTS { MATCH (n) param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 }");
        java.lang.Class<?> wildcardClass3 = realmList2.getClass();
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1" + "'", str2, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=;params={};size=1", "param0=10;size=1");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "param0=param0=a;size=1;size=1");
        java.lang.Class<?> wildcardClass23 = strSet9.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str16, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("", "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1", "\"\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1 }  EXISTS { MATCH (n) \"\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"\" }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1 }  EXISTS { MATCH (n) \"\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"\" }");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1", "\"param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Set<java.lang.String> strSet0 = null;
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery(strSet0, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }\" } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } EXISTS { MATCH (n) param0=-1;size=1 }", "\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("\"\"param0=param0=100.0;size=1;size=1\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("\"param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("\"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\"");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=10;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 };size=1" + "'", str1, "param0=WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 };size=1");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=a;size=1 } param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1 }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) param0=a;size=1 } param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1 }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) param0=a;size=1 } param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1 }\"");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("param0=param0=-1;size=1;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=-1;size=1;size=1" + "'", str2, "param0=param0=-1;size=1;size=1");
    }
}


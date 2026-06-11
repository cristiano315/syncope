package org.apache.syncope.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionHarnessTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("param0=#;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "\"\"param0=100;size=1\"\"");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=param0=false;size=1;size=1", "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=param0= ;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1" + "'", str2, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1", "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str25, "EX:IllegalArgumentException:Property must not be null or empty");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }", "param0=-1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\";size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }" + "'", str2, "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap(obj0);
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) str1);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=param0=param0=-1;size=1;size=1;size=1", "");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" }", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1");
        java.lang.Class<?> wildcardClass16 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "EX:MalformedPathException:The provided realm path is malformed: ");
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "\"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str16, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1\"", "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1;size=1" + "'", str1, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1;size=1");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=param0=10.0;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } EXISTS { MATCH (n) param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1 }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) param0=param0=10.0;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } EXISTS { MATCH (n) param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1 }" + "'", str2, "WHERE EXISTS { MATCH (n) param0=param0=10.0;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } EXISTS { MATCH (n) param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1 }");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "param0=class java.lang.Object;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=class java.lang.Object;size=1;size=1" + "'", str1, "param0=param0=class java.lang.Object;size=1;size=1");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("param0=10;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=10;size=1" + "'", str2, "param0=10;size=1");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1" + "'", str1, "param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=true;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=true;size=1;size=1" + "'", str1, "param0=param0=true;size=1;size=1");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=null;size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: " + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: ");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1" + "'", str2, "param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "param0=10.0;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=10.0;size=1;size=1" + "'", str1, "param0=param0=10.0;size=1;size=1");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: ;params={}");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 } } EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi! }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=param0=false;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.lang.String[] strArray5 = new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "\"\"param0=100;size=1\"\"");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "param0=param0=param0=100;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1", "param0=param0=10.0;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 }  EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 }  EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=\"param0=null;size=1\";size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList3);
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=[];size=1" + "'", str4, "param0=[];size=1");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }" + "'", str2, "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\"" + "'", str2, "\"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\"");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=1;size=1;size=1" + "'", str2, "param0=param0=1;size=1;size=1");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1" + "'", str3, "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "hi!", "param0=false;size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=10;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet3);
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "\"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\"", "param0=true;size=1");
        java.lang.String str20 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "", "param0=param0=-1;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1" + "'", str14, "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) (-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=-1.0;size=1" + "'", str2, "param0=-1.0;size=1");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1", "param0=true;size=1", "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=true;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\" }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=true;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\" }");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"", "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=#;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"", ";params={}");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=param0=param0=100;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }" + "'", str2, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1", "param0=param0=class java.util.Collections$EmptyList;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, ";params={}", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }", "EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet3);
        java.lang.Class<?> wildcardClass18 = strSet3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1" + "'", str17, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"", "\"param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }", "param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1 } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\" }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1 } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\" }");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1", "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! };size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! };size=1");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=param0=class java.util.Collections$EmptyList;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 }  EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1;size=1" + "'", str3, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1;size=1");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap(obj1);
        java.lang.Class<?> wildcardClass3 = obj1.getClass();
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) wildcardClass3);
        java.lang.String str5 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) strMap0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=class java.lang.Object;size=1" + "'", str4, "param0=class java.lang.Object;size=1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "param0=null;size=1" + "'", str5, "param0=null;size=1");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "", "");
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str20 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        java.lang.Class<?> wildcardClass21 = strSet10.getClass();
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str14, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1" + "'", str22, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=;params={};size=1", "param0=10;size=1");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "WHERE EXISTS { MATCH (n) param0=a;size=1 } param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1 }", "param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str16, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1" + "'", str2, "param0=param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1;size=1");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"" + "'", str2, "\"\"");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\";size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=0;size=1" + "'", str2, "param0=0;size=1");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=1;size=1" + "'", str1, "param0=1;size=1");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) realmList1);
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1" + "'", str1, "param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("\"WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }\"", "WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        java.lang.String str8 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet4, "hi!", "param0=false;size=1");
        java.lang.String str11 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet4, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet4, "param0=10;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap1, (java.lang.Object) strSet4);
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet4, "\"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\"", "param0=true;size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) str18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1" + "'", str15, "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str19, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=100.0;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=param0=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str45, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str51, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 };size=1" + "'", str1, "param0=WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 };size=1");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1", "param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1 }");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "hi!", "param0=false;size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"", "param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=param0=a;size=1;size=1", "param0= ;size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "", "\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
        java.lang.String str20 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "param0=;size=1" + "'", str20, "param0=;size=1");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("param0=param0=class java.util.Collections$EmptyList;size=1;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=class java.util.Collections$EmptyList;size=1;size=1" + "'", str2, "param0=param0=class java.util.Collections$EmptyList;size=1;size=1");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("", ";params={}");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) ";params={}");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=;params={};size=1" + "'", str4, "param0=;params={};size=1");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=1;size=1", "");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) realmList2);
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) str3);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=param0=[];size=1;size=1" + "'", str4, "param0=param0=[];size=1;size=1");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=100;size=1 EXISTS { MATCH (n) param0=param0=param0=100;size=1;size=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 } } EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi! }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=param0=param0=-1;size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1", "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }", "\"param0=100;size=1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null } } param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) \"param0=100;size=1\" }" + "'", str3, "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null } } param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) \"param0=100;size=1\" }");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=param0=-1;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=1;size=1", "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "", "");
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str20 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        java.lang.String str23 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1", "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.String str24 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet10);
        java.lang.String str27 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null", "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str14, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1" + "'", str24, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str27, "EX:IllegalArgumentException:Property must not be null or empty");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=param0=param0=100;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1" + "'", str1, "param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 }", "WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } } WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } } WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1 }");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) \"param0= ;size=1\" } WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=param0=1;size=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=param0=true;size=1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str4, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1", "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1", "param0=param0=false;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 EXISTS { MATCH (n) param0=param0=false;size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 EXISTS { MATCH (n) param0=param0=false;size=1;size=1 }");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1" + "'", str2, "param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"", "param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=param0=a;size=1;size=1", "param0= ;size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "", "\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
        java.lang.Class<?> wildcardClass19 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=-1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "", "");
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str20 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=;params={};size=1", "param0=10;size=1");
        java.lang.String str21 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=;params={};size=1");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str14, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str17, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "param0=param0=;params={};size=1;size=1" + "'", str21, "param0=param0=;params={};size=1;size=1");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) \"param0= ;size=1\" } WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=param0=1;size=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=WHERE EXISTS { MATCH (n) \"param0= ;size=1\" } WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=param0=1;size=1;size=1 };size=1" + "'", str1, "param0=WHERE EXISTS { MATCH (n) \"param0= ;size=1\" } WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) param0=param0=1;size=1;size=1 };size=1");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=;size=1" + "'", str4, "param0=;size=1");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) realmList2);
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) str3);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=param0=[];size=1;size=1" + "'", str4, "param0=param0=[];size=1;size=1");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 EXISTS { MATCH (n) param0=-1;size=1 }", "");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str45, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str51, "EX:IllegalArgumentException:Property must not be null or empty");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String[] strArray5 = new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "\"\"param0=100;size=1\"\"");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "param0=param0=param0=100;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "param0=WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 };size=1", "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 };size=1", "param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }\"");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"\"" + "'", str2, "\"\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"\"");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=param0=class java.util.Collections$EmptyList;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=param0=class java.util.Collections$EmptyList;size=1;size=1;size=1" + "'", str2, "param0=param0=param0=class java.util.Collections$EmptyList;size=1;size=1;size=1");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }\" } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } EXISTS { MATCH (n) param0=-1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1" + "'", str1, "param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.Class<?> wildcardClass10 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.Class<?> wildcardClass20 = strSet9.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: ");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }" + "'", str2, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 }");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("param0=param0=100.0;size=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=param0=100.0;size=1;size=1\"" + "'", str2, "\"param0=param0=100.0;size=1;size=1\"");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "param0=1;size=1");
        java.lang.Class<?> wildcardClass3 = realmList2.getClass();
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\" };size=1", "EX:MalformedPathException:The provided realm path is malformed: ;params={}");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: ;params={}");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: ;params={};size=1" + "'", str4, "param0=EX:MalformedPathException:The provided realm path is malformed: ;params={};size=1");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1" + "'", str2, "param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=null;size=1");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }", "EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1", "param0=WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=param0=a;size=1;size=1", "param0=a;size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null", "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String[] strArray20 = new java.lang.String[] { "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1", "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"", "param0=100.0;size=1", "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }", "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=10;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "param0=10;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }", "EX:MalformedPathException:The provided realm path is malformed: param0=1.0;size=1", "param0=\"param0=null;size=1\";size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } EXISTS { MATCH (n) param0=;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet21, "EX:MalformedPathException:The provided realm path is malformed: hi!", "EX:MalformedPathException:The provided realm path is malformed: param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1", "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"", "param0=100.0;size=1", "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }", "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=10;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "param0=10;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }", "EX:MalformedPathException:The provided realm path is malformed: param0=1.0;size=1", "param0=\"param0=null;size=1\";size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } EXISTS { MATCH (n) param0=;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1" });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=true;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\" }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1", "");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1" + "'", str3, "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=EX:MalformedPathException:The provided realm path is malformed: ;params={};size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: ;params={};size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: ;params={};size=1");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 }", "param0=10;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=10;size=1 } WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=10;size=1 } WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty }");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=param0=100;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=param0=100;size=1;size=1;size=1" + "'", str1, "param0=param0=param0=100;size=1;size=1;size=1");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\";size=1" + "'", str2, "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\";size=1");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("\"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\"", "param0=null;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("param0=-1.0;size=1", "\"\"", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) \"\" } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null }" + "'", str3, "WHERE EXISTS { MATCH (n) \"\" } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null }");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }", "EX:MalformedPathException:The provided realm path is malformed: param0=param0=class java.util.Collections$EmptyList;size=1;size=1", "param0=false;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=class java.util.Collections$EmptyList;size=1;size=1 } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=false;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=class java.util.Collections$EmptyList;size=1;size=1 } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=false;size=1 }");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"" + "'", str2, "\"param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", "");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str45, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str51, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("\"param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1\"", "param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1 } \"param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1 } \"param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" }");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("param0=;params={};size=1", "param0= ;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=;params={};size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } }" + "'", str3, "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=;params={};size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } }");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=0;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=0;size=1\"" + "'", str2, "\"param0=0;size=1\"");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "\"param0=100;size=1\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=\"param0=100;size=1\";size=1" + "'", str2, "param0=\"param0=100;size=1\";size=1");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1" + "'", str1, "param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=hi!;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=hi!;size=1;size=1" + "'", str1, "param0=param0=hi!;size=1;size=1");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        java.lang.String str34 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet30, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str37 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet30, "", "param0=;size=1");
        java.lang.String str40 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet30, "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1;size=1");
        java.lang.String str41 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) str40);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str34, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str37, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str40, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str41, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } EXISTS { MATCH (n) param0=;size=1 }", "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"");
        java.lang.Class<?> wildcardClass3 = realmList2.getClass();
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1;size=1");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=class java.lang.Object;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=class java.lang.Object;size=1;size=1" + "'", str2, "param0=param0=class java.lang.Object;size=1;size=1");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1 } param0=10.0;size=1 EXISTS { MATCH (n) param0=;size=1 }", "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 } WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1 } param0=10.0;size=1 EXISTS { MATCH (n) param0=;size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 } WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1 } param0=10.0;size=1 EXISTS { MATCH (n) param0=;size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" }");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList3);
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=[];size=1" + "'", str4, "param0=[];size=1");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("\"param0=100;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } } \"param0=100;size=1\" EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } } \"param0=100;size=1\" EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 }");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: hi!");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1" + "'", str4, "param0=WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=param0=true;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: " + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: ");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\" }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\" };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\" };size=1");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" }", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "", "param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n)  } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n)  } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 }");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1;size=1" + "'", str1, "param0=param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1;size=1");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1;size=1" + "'", str2, "param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1;size=1");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("param0=param0=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=class org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2;size=1", "param0=null;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("WHERE EXISTS { MATCH (n) \"\" } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=param0=class java.util.Collections$EmptyList;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1", "param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 } \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" EXISTS { MATCH (n) param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 } \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" EXISTS { MATCH (n) param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1 }");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"" + "'", str2, "\"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"param0=100;size=1\"", "param0=false;size=1");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1", "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"", "param0=1;size=1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str51, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"\"" + "'", str2, "\"\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"\"");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! };size=1");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) realmList1);
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=[];size=1" + "'", str2, "param0=[];size=1");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "WHERE EXISTS { MATCH (n) param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1 } param0=class java.lang.Object;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\"");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("param0=a;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=a;size=1" + "'", str2, "param0=a;size=1");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=hi!;size=1", "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 }", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        java.lang.String str20 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1" + "'", str20, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=param0=param0= ;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("\"param0= ;size=1\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"", "\"param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=100;size=1" + "'", str1, "param0=100;size=1");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"\"" + "'", str2, "\"\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"\"");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, ";params={}", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1" + "'", str13, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.Class<?> wildcardClass13 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1 } param0=10.0;size=1 EXISTS { MATCH (n) param0=;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1", "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" } }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" } }");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String[] strArray5 = new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "\"\"param0=100;size=1\"\"");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "param0=param0=param0=100;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "param0=WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 };size=1", "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet6, "\"param0= ;size=1\"", "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }\" } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } EXISTS { MATCH (n) param0=-1;size=1 };size=1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.util.Set<java.lang.String> strSet0 = null;
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery(strSet0, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str3, "EX:IllegalArgumentException:Property must not be null or empty");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", "hi!", "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) hi! } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 EXISTS { MATCH (n) EX:IllegalArgumentException:Property must not be null or empty }" + "'", str3, "WHERE EXISTS { MATCH (n) hi! } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1 EXISTS { MATCH (n) EX:IllegalArgumentException:Property must not be null or empty }");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"", "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\"", "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"", "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\" } \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } }" + "'", str3, "WHERE EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\" } \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } }");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=EX:MalformedPathException:The provided realm path is malformed: ;params={};size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=param0=param0=-1;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=-1;size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=-1;size=1;size=1;size=1");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=100.0;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=100.0;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=100.0;size=1");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1;size=1" + "'", str3, "param0=param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1;size=1");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1", "param0=10.0;size=1");
        java.lang.Class<?> wildcardClass3 = realmList2.getClass();
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, ";params={}", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ", "WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!", "EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\"");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str12, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  }");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1" + "'", str4, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null;size=1");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=10;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=10;size=1;size=1" + "'", str2, "param0=param0=10;size=1;size=1");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }\" } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } EXISTS { MATCH (n) param0=-1;size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1" + "'", str2, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("param0=param0=hi!;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"EX:IllegalArgumentException:Property must not be null or empty\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1;size=1");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" }");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "\"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"", "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.lang.String str11 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet7, "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "\"\"param0=100;size=1\"\"");
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet7, "param0=param0=param0=100;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "param0=1;size=1" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "param0=[param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1, param0=param0=a;size=1;size=1, WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }, WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }, param0=1;size=1];size=1" + "'", str15, "param0=[param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1, param0=param0=a;size=1;size=1, WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }, WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }, param0=1;size=1];size=1");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "hi!", "param0=false;size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" }", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }");
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) str13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str14, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=class java.util.Collections$EmptyList;size=1;size=1 } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=false;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("\"EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null\"");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=class java.util.Collections$EmptyList;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=class java.util.Collections$EmptyList;size=1" + "'", str2, "param0=class java.util.Collections$EmptyList;size=1");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1;size=1" + "'", str1, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1;size=1");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=0;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"", "param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: hi!", "param0=;params={};size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 }");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=class java.util.Collections$EmptyList;size=1", "WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=class java.util.Collections$EmptyList;size=1");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=param0=class java.util.Collections$EmptyList;size=1;size=1" + "'", str3, "param0=param0=class java.util.Collections$EmptyList;size=1;size=1");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"", "\"param0=0;size=1\"", "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\";size=1" + "'", str2, "param0=\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\";size=1");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=10;size=1" + "'", str1, "param0=10;size=1");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" }", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" }");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" };size=1" + "'", str13, "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" };size=1");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1\"");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str46 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) str45);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str45, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1" + "'", str46, "param0=EX:IllegalArgumentException:Property must not be null or empty;size=1");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: ;params={}", "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"", "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\" } EX:MalformedPathException:The provided realm path is malformed: ;params={} EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\" } EX:MalformedPathException:The provided realm path is malformed: ;params={} EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1 }");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=param0=-1;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 }", "param0=a;size=1");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } }");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1", "\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\"");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("", "");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty\"");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=0;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1", "");
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }", "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str22, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "", "");
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet10, "param0=0;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str14, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1" + "'", str18, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=-1.0;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1;size=1");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" } }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1;size=1" + "'", str1, "param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1;size=1");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1;size=1" + "'", str2, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1;size=1");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 }", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } } \"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\" EXISTS { MATCH (n)  }" + "'", str3, "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } } \"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\" EXISTS { MATCH (n)  }");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ;size=1");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0= ;size=1" + "'", str1, "param0= ;size=1");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=;params={};size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! };size=1");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } \"param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1\" EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } }");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:MalformedPathException:The provided realm path is malformed: ;params={}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: ;params={} }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: ;params={} }");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("\"param0= ;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"param0= ;size=1\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"param0= ;size=1\"");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "hi!", "param0=false;size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=10;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.String str14 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) strSet3);
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1", "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\" };size=1");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1" + "'", str14, "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null } WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } EXISTS { MATCH (n) param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null } WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } EXISTS { MATCH (n) param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1 }");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("param0=false;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=false;size=1\"" + "'", str2, "\"param0=false;size=1\"");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=#;size=1" + "'", str2, "param0=#;size=1");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"" + "'", str2, "\"param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1" + "'", str1, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=#;size=1", "param0=\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\";size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=;size=1" + "'", str3, "param0=;size=1");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1", "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1\"");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\"", "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\" };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("\"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 }");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 };size=1");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.Class<?> wildcardClass7 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("\"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\"");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=hi!;size=1", "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 }", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }");
        java.lang.String str21 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"", "WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("WHERE EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1 EXISTS { MATCH (n) param0=param0=false;size=1;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3 neo4jRealmSearchDAO3_1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.newDaoWithNullDependencies();
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) neo4jRealmSearchDAO3_1);
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) neo4jRealmSearchDAO3_1);
        org.junit.Assert.assertNotNull(neo4jRealmSearchDAO3_1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.Set<java.lang.String> strSet0 = null;
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery(strSet0, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }", "param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=param0=true;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\"", "\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\"", "param0=;params={};size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 }");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) realmList1);
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) realmList1);
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=[];size=1" + "'", str2, "param0=[];size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) param0=param0= ;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } }", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: \"param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1;size=1\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=10;size=1 } WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:IllegalArgumentException:Property must not be null or empty }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=100;size=1", "param0=;params={};size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 } param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 EXISTS { MATCH (n) \"param0=null;size=1\" }", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } }");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) str18);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1" + "'", str19, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1;size=1" + "'", str2, "param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1;size=1");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  }");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }" + "'", str2, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("\"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet11, "", "");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet11, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str21 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet11, "param0=param0=a;size=1;size=1", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) strSet11);
        java.lang.String str23 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap1, (java.lang.Object) strSet11);
        java.lang.String str24 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) strMap1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str15, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1" + "'", str22, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1" + "'", str23, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "param0=null;size=1" + "'", str24, "param0=null;size=1");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("param0=param0=param0= ;size=1;size=1;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=param0= ;size=1;size=1;size=1" + "'", str2, "param0=param0=param0= ;size=1;size=1;size=1");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=100;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Set<java.lang.String> strSet0 = null;
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery(strSet0, "param0=param0=true;size=1;size=1", "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:IllegalArgumentException:Property must not be null or empty", "WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 } } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 } } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 }");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1", "\"\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1" + "'", str2, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 };size=1;size=1");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) \"\" } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null }", "WHERE EXISTS { MATCH (n) \"param0=0;size=1\" } \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\" EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } } WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" } EXISTS { MATCH (n) param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0= ;size=1" + "'", str2, "param0= ;size=1");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }\"");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\"");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: param0=-1;size=1\"");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\";size=1;size=1" + "'", str1, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\";size=1;size=1");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=param0=100.0;size=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=param0=100.0;size=1;size=1\"" + "'", str2, "\"param0=param0=100.0;size=1;size=1\"");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) ;params={} } EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null EXISTS { MATCH (n) \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\" }", "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"\"" + "'", str2, "\"\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"\"");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"param0=param0=100.0;size=1;size=1\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"param0=param0=100.0;size=1;size=1\"\"" + "'", str2, "\"\"param0=param0=100.0;size=1;size=1\"\"");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0= ;size=1;size=1;size=1\"");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=10;size=1\";size=1");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1", "param0=param0=10;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } }");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("param0=-1.0;size=1", "EX:MalformedPathException:The provided realm path is malformed: hi!", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: hi! } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  } }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: hi! } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  } }");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"param0=param0=false;size=1;size=1\"");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1", "WHERE EXISTS { MATCH (n) param0=param0=10.0;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } EXISTS { MATCH (n) param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1 }");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=param0=10.0;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } EXISTS { MATCH (n) param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1 } }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=param0=10.0;size=1;size=1 } WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) param0=1;size=1 } EXISTS { MATCH (n) param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1 } }");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=hi!;size=1", "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: ");
        java.lang.String str21 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "EX:MalformedPathException:The provided realm path is malformed: ");
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "\"WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }\"", "EX:MalformedPathException:The provided realm path is malformed: \"\"param0=100;size=1\"\"");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str16, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: ");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: ");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1" + "'", str3, "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
        java.lang.String str54 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: param0=100.0;size=1", "WHERE EXISTS { MATCH (n) \"\" } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null }");
        java.lang.Class<?> wildcardClass55 = strSet29.getClass();
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str45, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str51, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str54, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1\"");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=a;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=a;size=1;size=1" + "'", str2, "param0=param0=a;size=1;size=1");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "param0=0;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" } param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1 EXISTS { MATCH (n) param0=0;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" } param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1 EXISTS { MATCH (n) param0=0;size=1 }");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("param0=WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=param0=WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1;size=1" + "'", str3, "param0=param0=WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=param0=EX:IllegalArgumentException:Property must not be null or empty;size=1;size=1 EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1;size=1");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindDescendants("param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1;size=1", "");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) realmList2);
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=[];size=1" + "'", str3, "param0=[];size=1");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("param0=\"param0=null;size=1\";size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } param0=\"param0=null;size=1\";size=1 EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } param0=\"param0=null;size=1\";size=1 EXISTS { MATCH (n) param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1 }");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1;size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1 } param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\" }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } param0=-1.0;size=1 EXISTS { MATCH (n) param0=false;size=1 };size=1;size=1;size=1 } param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\" }");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("WHERE EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }\" } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null } EXISTS { MATCH (n) param0=-1;size=1 }", "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }" + "'", str2, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } } WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } } WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1 };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } } WHERE EXISTS { MATCH (n) hi! } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1 } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1 };size=1");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String str7 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str10 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null");
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet3, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 }", "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1");
        java.lang.String str17 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str7, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1;size=1" + "'", str17, "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1;size=1");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("param0=\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=-1;size=1" + "'", str1, "param0=-1;size=1");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("\"param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"param0=\"EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByFullPath("\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1" + "'", str1, "param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: hi! } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n)  } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n)  } }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1", "param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\"", "param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"\"" + "'", str2, "\"\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"\"");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=param0=param0=-1;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=-1;size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=-1;size=1;size=1;size=1");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "\"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=\"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\";size=1" + "'", str1, "param0=\"\"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1\"\";size=1");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"param0=100;size=1\"", "param0=false;size=1");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"param0=100;size=1\"", "param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=true;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, ";params={}", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.queryOp("\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\"", "param0=param0=true;size=1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=param0=true;size=1;size=1 } \"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\" EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=param0=true;size=1;size=1 } \"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\" EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null }");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("param0=WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1", "param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1", "param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1 } \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\" EXISTS { MATCH (n) param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1 } \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1\" EXISTS { MATCH (n) param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1;size=1 }");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 }" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) \"param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\";size=1\" } \"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\" EXISTS { MATCH (n) param0=;params={};size=1 }");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("\"param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1;size=1;size=1" + "'", str2, "param0=param0=param0=WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed:  } WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! } EXISTS { MATCH (n) \"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\" };size=1;size=1;size=1");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.appendPlainAttrCond("WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=100;size=1 EXISTS { MATCH (n) param0=param0=param0=100;size=1;size=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\";size=1" + "'", str2, "param0=EX:MalformedPathException:The provided realm path is malformed: \"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }\";size=1");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.appendPlainAttrCond("\"param0=\"param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1\";size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } } \"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\" EXISTS { MATCH (n)  }", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } } \"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\" EXISTS { MATCH (n)  }\"" + "'", str2, "\"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=false;size=1 } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1 EXISTS { MATCH (n) param0=param0=100;size=1;size=1 } } \"WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\" EXISTS { MATCH (n)  }\"");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("hi!", "WHERE EXISTS { MATCH (n) param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1 } \"param0=param0=[WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }];size=1;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("\"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\"");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1" + "'", str1, "param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null;size=1");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1", "\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }\"");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1", "", "EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n)  } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n)  } EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 }");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String[] strArray29 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        java.lang.String str34 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet30, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str37 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet30, "", "\"\"param0=100;size=1\"\"");
        java.lang.String str40 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet30, "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=1;size=1");
        java.lang.String str41 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=1;size=1");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str34, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str37, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str40, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "param0=param0=1;size=1;size=1" + "'", str41, "param0=param0=1;size=1;size=1");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1;size=1" + "'", str1, "param0=param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1;size=1");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 }");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 }");
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.escapeIfString("\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"" + "'", str2, "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: hi!\"");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"", "");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null, hi!, param0=a;size=1, EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null, WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }, param0=true;size=1];size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } };size=1 } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1 }", "EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1");
        java.lang.String str54 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: param0=100.0;size=1", "WHERE EXISTS { MATCH (n) \"\" } param0=-1.0;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null }");
        java.lang.String str57 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" }", "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1 } param0=null;size=1 EXISTS { MATCH (n) \"EX:IllegalArgumentException:Property must not be null or empty\" };size=1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str45, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str51, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str54, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str57, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "param0=100;size=1");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"");
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1" + "'", str3, "param0=EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\";size=1");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("\"param0=param0=false;size=1;size=1\"");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) realmList1);
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=[];size=1" + "'", str2, "param0=[];size=1");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "WHERE EXISTS { MATCH (n) param0=null;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) param0=;size=1 }", "WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=\"\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"\";size=1");
        java.lang.Class<?> wildcardClass2 = realmList1.getClass();
        org.junit.Assert.assertNotNull(realmList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" }");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" };size=1" + "'", str2, "param0=WHERE EXISTS { MATCH (n) param0= ;size=1 } param0=1;size=1 EXISTS { MATCH (n) \"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\" };size=1");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1", "param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }\"", "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\"");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }", ";params={}");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AttrCond.getSchema()\" because \"cond\" is null", "param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }\";size=1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str48, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.setParameterOnNewMap((java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null };size=1" + "'", str1, "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null };size=1");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindByName("param0=\"WHERE EXISTS { MATCH (n) param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1 }  EXISTS { MATCH (n) param0=[];size=1 }\";size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1" + "'", str4, "param0=EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1;size=1");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("\"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: param0=10;size=1\"");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=null;size=1", "WHERE EXISTS { MATCH (n)  } EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) param0=param0=[EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null];size=1;size=1 }");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("", "param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null };size=1");
        org.junit.Assert.assertNotNull(realmList2);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=100;size=1\"");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1\"" + "'", str2, "\"param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1\"");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=param0=param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1;size=1;size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnNewMap((java.lang.Object) "WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 };size=1" + "'", str1, "param0=WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 };size=1");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\";size=1;size=1");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.escapeIfString("param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1", false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1" + "'", str2, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1;size=1");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.lang.String[] strArray8 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String str13 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "");
        java.lang.String str16 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "");
        java.lang.String str19 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1", "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"");
        java.lang.String str22 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "", "EX:MalformedPathException:The provided realm path is malformed: ");
        java.lang.String str25 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet9, "\"EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1\"", "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "hi!", "param0=a;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }", "param0=true;size=1" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str13, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str16, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByFullPath("param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: param0=param0=EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: hi!;size=1;size=1;size=1");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.safeFindDescendants("EX:MalformedPathException:The provided realm path is malformed: param0=param0=class java.util.Collections$EmptyList;size=1;size=1", "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\"");
        java.lang.Class<?> wildcardClass3 = realmList2.getClass();
        org.junit.Assert.assertNotNull(realmList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.String str3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.queryOp("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "param0=param0=10;size=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "WHERE EXISTS { MATCH (n) param0=param0=10;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 }" + "'", str3, "WHERE EXISTS { MATCH (n) param0=param0=10;size=1;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=[];size=1 } WHERE EXISTS { MATCH (n) param0=1;size=1 } \"param0=10;size=1\" EXISTS { MATCH (n) param0=-1;size=1 } EXISTS { MATCH (n)  } } \"param0= ;size=1\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1 }");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.String[] strArray1 = new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" };
        java.util.LinkedHashSet<java.lang.String> strSet2 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.String str6 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "hi!", "param0=false;size=1");
        java.lang.String str9 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } }", "EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1");
        java.lang.String str12 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=100;size=1", "param0=WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 };size=1");
        java.lang.String str15 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0= ;size=1", "EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }");
        java.lang.String str18 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "param0=1;size=1", "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } } WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } EX:IllegalArgumentException:Property must not be null or empty EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=true;size=1 EXISTS { MATCH (n) hi! } } EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }");
        java.lang.String str21 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet2, "EX:MalformedPathException:The provided realm path is malformed: param0=10.0;size=1", "param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null };size=1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByFullPath("\"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"" + "'", str1, "EX:MalformedPathException:The provided realm path is malformed: \"EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null }\"");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindByName("param0=WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnNewMap((java.lang.Object) "param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1" + "'", str1, "param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList3 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.safeFindDescendants("\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\"", "param0=EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1;size=1");
        java.lang.String str4 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.setParameterOnMap(strMap0, (java.lang.Object) "\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\"");
        org.junit.Assert.assertNotNull(realmList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "param0=\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\";size=1" + "'", str4, "param0=\"WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null }\";size=1");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        java.lang.String str2 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.setParameterOnMap(strMap0, (java.lang.Object) "param0=param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1;size=1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "param0=param0=param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1;size=1;size=1" + "'", str2, "param0=param0=param0=WHERE EXISTS { MATCH (n) param0=1.0;size=1 } param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1 EXISTS { MATCH (n) param0=100;size=1 };size=1;size=1;size=1");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("EX:MalformedPathException:The provided realm path is malformed: param0=param0=param0=EX:MalformedPathException:The provided realm path is malformed: ;size=1;size=1;size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.List<org.apache.syncope.core.persistence.api.entity.Realm> realmList1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.safeFindByName("EX:MalformedPathException:The provided realm path is malformed: EX:MalformedPathException:The provided realm path is malformed: param0=EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null } hi! EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null };size=1");
        org.junit.Assert.assertNotNull(realmList1);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.String str1 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.appendPlainAttrCond("param0=WHERE EXISTS { MATCH (n) \"param0=10;size=1\" } WHERE EXISTS { MATCH (n) param0=true;size=1 } \"EX:IllegalArgumentException:Property must not be null or empty\" EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1 } EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } param0=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null } };size=1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.PlainSchema.isUniqueConstraint()\" because \"schema\" is null");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }\"", "WHERE EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null } WHERE EXISTS { MATCH (n)  }  EXISTS { MATCH (n) WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  } } EXISTS { MATCH (n) param0=-1.0;size=1 }", "param0=-1.0;size=1", "param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1", "WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }", "\"param0=null;size=1\"", "WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! }", "EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "param0=-1;size=1", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.ResourceCond.getResource()\" because \"cond\" is null", "param0=-1;size=1", "WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "param0=0;size=1", "param0=param0=a;size=1;size=1", "\"param0=null;size=1\"", "param0=-1;size=1", "EX:MalformedPathException:The provided realm path is malformed: \"param0=null;size=1\"", "EX:MalformedPathException:The provided realm path is malformed: param0=-1.0;size=1", "param0=-1.0;size=1", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AuxClassCond.getAuxClass()\" because \"cond\" is null", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.AnyCond.getSchema()\" because \"cond\" is null", "hi!", "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "param0=null;size=1", "param0=true;size=1" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        java.lang.String str33 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  }", "\"param0=null;size=1\"");
        java.lang.String str36 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "", "param0=;size=1");
        java.lang.String str39 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "param0=100.0;size=1", "\"param0= ;size=1\"");
        java.lang.String str42 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO2Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"param0=100;size=1\"", "param0=false;size=1");
        java.lang.String str45 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"param0=100;size=1\"", "param0=WHERE EXISTS { MATCH (n) param0=-1.0;size=1 } EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null EXISTS { MATCH (n) hi! };size=1");
        java.lang.String str48 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO4Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "EX:MalformedPathException:The provided realm path is malformed: WHERE EXISTS { MATCH (n) WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 } } param0=param0=WHERE EXISTS { MATCH (n)  } hi! EXISTS { MATCH (n)  };size=1;size=1 EXISTS { MATCH (n) EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.search.SearchCond.getType()\" because \"cond\" is null }", "");
        java.lang.String str51 = org.apache.syncope.core.persistence.neo4j.dao.Neo4jRealmSearchDAO3Harness.wrapQuery((java.util.Set<java.lang.String>) strSet29, "\"WHERE EXISTS { MATCH (n) param0=EX:MalformedPathException:The provided realm path is malformed: EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 } param0=param0=1;size=1;size=1 EXISTS { MATCH (n) EX:MalformedPathException:The provided realm path is malformed: param0=1;size=1 }\"", "\"WHERE EXISTS { MATCH (n) param0=null;size=1 } param0=EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null;size=1 EXISTS { MATCH (n) param0=true;size=1 }\"");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str39, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str42, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str45, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "EX:IllegalArgumentException:Property must not be null or empty" + "'", str48, "EX:IllegalArgumentException:Property must not be null or empty");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null" + "'", str51, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.utils.RealmUtils.getField(String)\" because \"this.realmUtils\" is null");
    }
}


package org.apache.syncope.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionHarnessTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("hi!", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction0 = null;
        boolean boolean1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.isDeprovision(provisionAction0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("1", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        java.lang.Class<?> wildcardClass9 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.syncope.core.persistence.api.entity.group.Group group0 = null;
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeInitResult(group0, provisionAction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.syncope.core.persistence.api.entity.group.Group group0 = null;
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeInitResult(group0, provisionAction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.groupKeyJobDetailKey();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupKey" + "'", str0, "groupKey");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "1", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeDoExecuteAfterStop(jobExecutionContext0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetAction(provisionAction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetAction(provisionAction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "hi!", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeDoExecute(jobExecutionContext0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.syncope.core.persistence.api.dao.RealmDAO realmDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO2 = null;
        org.apache.syncope.core.provisioning.api.UserProvisioningManager userProvisioningManager3 = null;
        org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager anyObjectProvisioningManager4 = null;
        java.lang.String str5 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setDependencies(realmDAO0, groupDAO1, anySearchDAO2, userProvisioningManager3, anyObjectProvisioningManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.actionJobDetailKey();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.groupKeyJobDetailKey();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupKey" + "'", str0, "groupKey");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("groupKey", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("OK", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        boolean boolean0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.stopSetsStopRequested();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        boolean boolean0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.stopSetsStopRequested();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.syncope.core.persistence.api.entity.group.Group group0 = null;
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeInitResult(group0, provisionAction1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "hi!", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond0 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeCount(searchCond0, anyTypeKind1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.newDelegate();
        org.junit.Assert.assertNotNull(groupMemberProvisionTaskJobDelegate4_0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction0 = null;
        boolean boolean1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.isDeprovision(provisionAction0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("OK", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.actionJobDetailKey();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.isDeprovision(provisionAction0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.isDeprovision()");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("OK", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("groupKey", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.newDelegate();
        org.junit.Assert.assertNotNull(groupMemberProvisionTaskJobDelegate2_0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.syncope.core.persistence.api.dao.RealmDAO realmDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO2 = null;
        org.apache.syncope.core.provisioning.api.UserProvisioningManager userProvisioningManager3 = null;
        org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager anyObjectProvisioningManager4 = null;
        java.lang.String str5 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setDependencies(realmDAO0, groupDAO1, anySearchDAO2, userProvisioningManager3, anyObjectProvisioningManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond0 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeCount(searchCond0, anyTypeKind1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.groupKeyJobDetailKey();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupKey" + "'", str0, "groupKey");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        boolean boolean0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.stopSetsStopRequested();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.syncope.core.persistence.api.dao.RealmDAO realmDAO0 = null;
        org.apache.syncope.core.persistence.api.dao.GroupDAO groupDAO1 = null;
        org.apache.syncope.core.persistence.api.dao.AnySearchDAO anySearchDAO2 = null;
        org.apache.syncope.core.provisioning.api.UserProvisioningManager userProvisioningManager3 = null;
        org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager anyObjectProvisioningManager4 = null;
        java.lang.String str5 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setDependencies(realmDAO0, groupDAO1, anySearchDAO2, userProvisioningManager3, anyObjectProvisioningManager4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OK" + "'", str5, "OK");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.actionJobDetailKey();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.List<?> wildcardList0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.emptyListForRandoop();
        org.junit.Assert.assertNotNull(wildcardList0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("groupKey");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "groupKey" + "'", str1, "groupKey");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeDoExecute(jobExecutionContext0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("groupKey", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.syncope.common.lib.types.ProvisionAction provisionAction0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetAction(provisionAction0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond0 = null;
        org.apache.syncope.common.lib.types.AnyTypeKind anyTypeKind1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeCount(searchCond0, anyTypeKind1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "action", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("hi!", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "OK", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        java.lang.Class<?> wildcardClass12 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("OK", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        java.lang.Class<?> wildcardClass15 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("OK", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeDoExecuteAfterStop(jobExecutionContext0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeDoExecute(jobExecutionContext0);
        org.junit.Assert.assertTrue(str1.startsWith("EX:NullPointerException"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("groupKey", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Collection<java.lang.String> strCollection0 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = null;
        org.springframework.data.domain.Sort sort2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers(strCollection0, searchCond1, sort2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        java.lang.Class<?> wildcardClass13 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("OK", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond16 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond16, searchCond17, sort18);
        java.lang.Class<?> wildcardClass20 = strList8.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("hi!", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext0 = null;
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeDoExecuteAfterStop(jobExecutionContext0);
        org.junit.Assert.assertTrue(str1.startsWith("EX:NullPointerException"));    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("action", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null" + "'", str1, "null");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("hi!", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("OK", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        java.lang.Class<?> wildcardClass19 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("groupKey", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("action");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "action" + "'", str1, "action");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("action", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("OK", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "groupKey", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "action", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Collection<java.lang.String> strCollection0 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond1 = null;
        org.springframework.data.domain.Sort sort2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers(strCollection0, searchCond1, sort2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("hi!", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("1", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("action", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("1", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        java.lang.Class<?> wildcardClass16 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("groupKey", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        java.lang.Class<?> wildcardClass19 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond15, sort16);
        java.lang.Class<?> wildcardClass18 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("groupKey", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("1", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.List<?> wildcardList0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.emptyListForRandoop();
        java.lang.Class<?> wildcardClass1 = wildcardList0.getClass();
        org.junit.Assert.assertNotNull(wildcardList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("hi!", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        java.lang.Class<?> wildcardClass16 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.Collection<java.lang.String> strCollection0 = null;
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond1 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond2 = null;
        org.springframework.data.domain.Sort sort3 = null;
        java.lang.String str4 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects(strCollection0, membershipCond1, searchCond2, sort3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str4, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        java.lang.Class<?> wildcardClass10 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond19, searchCond20, sort21);
        java.lang.Class<?> wildcardClass23 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        java.lang.Class<?> wildcardClass16 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond16 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond16, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond20 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond20, searchCond21, sort22);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond24, sort25);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "OK", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "action", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.List<?> wildcardList0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.emptyListForRandoop();
        java.lang.Class<?> wildcardClass1 = wildcardList0.getClass();
        org.junit.Assert.assertNotNull(wildcardList0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("OK", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "hi!", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("action", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("hi!", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        java.lang.Class<?> wildcardClass11 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("1", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("1", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("OK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OK" + "'", str1, "OK");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond23, sort24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("hi!", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond14 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond14, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond18, searchCond19, sort20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("hi!", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond16, sort17);
        java.lang.Class<?> wildcardClass19 = strList8.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond16 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond16, searchCond17, sort18);
        java.lang.Class<?> wildcardClass20 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "1", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        java.lang.Class<?> wildcardClass23 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond26 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond27 = null;
        org.springframework.data.domain.Sort sort28 = null;
        java.lang.String str29 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond26, searchCond27, sort28);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond30 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond31 = null;
        org.springframework.data.domain.Sort sort32 = null;
        java.lang.String str33 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond30, searchCond31, sort32);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond34 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond35 = null;
        org.springframework.data.domain.Sort sort36 = null;
        java.lang.String str37 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond34, searchCond35, sort36);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond38 = null;
        org.springframework.data.domain.Sort sort39 = null;
        java.lang.String str40 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond38, sort39);
        java.lang.Class<?> wildcardClass41 = strList17.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str37, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str40, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond17, sort18);
        java.lang.Class<?> wildcardClass20 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages(100L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond15, sort16);
        java.lang.Class<?> wildcardClass18 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("action");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "action" + "'", str1, "action");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        java.lang.Class<?> wildcardClass21 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "OK", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond23, searchCond24, sort25);
        java.lang.Class<?> wildcardClass27 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("groupKey");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "groupKey" + "'", str1, "groupKey");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.Collection<java.lang.String> strCollection0 = null;
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond1 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond2 = null;
        org.springframework.data.domain.Sort sort3 = null;
        java.lang.String str4 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects(strCollection0, membershipCond1, searchCond2, sort3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str4, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("action", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        java.lang.Class<?> wildcardClass13 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("OK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OK" + "'", str1, "OK");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond16 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond16, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond20, sort21);
        java.lang.Class<?> wildcardClass23 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond29 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond30 = null;
        org.springframework.data.domain.Sort sort31 = null;
        java.lang.String str32 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond29, searchCond30, sort31);
        java.lang.Class<?> wildcardClass33 = strList17.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str32, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.setAndGetGroupKey("groupKey");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "groupKey" + "'", str1, "groupKey");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "1", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond18, searchCond19, sort20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond19, sort20);
        java.lang.Class<?> wildcardClass22 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("action", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        java.lang.Class<?> wildcardClass17 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond19, sort20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond18, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond22, sort23);
        java.lang.Class<?> wildcardClass25 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        java.lang.Class<?> wildcardClass26 = strList17.getClass();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond20, sort21);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("OK");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OK" + "'", str1, "OK");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond23, searchCond24, sort25);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond27 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond28 = null;
        org.springframework.data.domain.Sort sort29 = null;
        java.lang.String str30 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond27, searchCond28, sort29);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond31 = null;
        org.springframework.data.domain.Sort sort32 = null;
        java.lang.String str33 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond31, sort32);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str30, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)" + "'", str1, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        java.lang.Class<?> wildcardClass23 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond19, sort20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.newDelegate();
        java.lang.Class<?> wildcardClass1 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(groupMemberProvisionTaskJobDelegate1_0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond21 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond21, searchCond22, sort23);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond19, searchCond20, sort21);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        java.lang.Class<?> wildcardClass17 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond21, sort22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond21, sort22);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond24, sort25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond17, sort18);
        java.lang.Class<?> wildcardClass20 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("1", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond18, searchCond19, sort20);
        java.lang.Class<?> wildcardClass22 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond29 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond30 = null;
        org.springframework.data.domain.Sort sort31 = null;
        java.lang.String str32 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond29, searchCond30, sort31);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str32, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond21 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond21, searchCond22, sort23);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages(0L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond20 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond20, searchCond21, sort22);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond24 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = null;
        org.springframework.data.domain.Sort sort26 = null;
        java.lang.String str27 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond24, searchCond25, sort26);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond28 = null;
        org.springframework.data.domain.Sort sort29 = null;
        java.lang.String str30 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond28, sort29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str27, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str30, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond20 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond20, searchCond21, sort22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond14 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond14, searchCond15, sort16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str2, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond29 = null;
        org.springframework.data.domain.Sort sort30 = null;
        java.lang.String str31 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond29, sort30);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond32 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond33 = null;
        org.springframework.data.domain.Sort sort34 = null;
        java.lang.String str35 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond32, searchCond33, sort34);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str31, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str35, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond26 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond27 = null;
        org.springframework.data.domain.Sort sort28 = null;
        java.lang.String str29 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond26, searchCond27, sort28);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond30 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond31 = null;
        org.springframework.data.domain.Sort sort32 = null;
        java.lang.String str33 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond30, searchCond31, sort32);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond34 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond35 = null;
        org.springframework.data.domain.Sort sort36 = null;
        java.lang.String str37 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond34, searchCond35, sort36);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond38 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond39 = null;
        org.springframework.data.domain.Sort sort40 = null;
        java.lang.String str41 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond38, searchCond39, sort40);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond42 = null;
        org.springframework.data.domain.Sort sort43 = null;
        java.lang.String str44 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond42, sort43);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str37, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str41, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str44, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond18, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond29 = null;
        org.springframework.data.domain.Sort sort30 = null;
        java.lang.String str31 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond29, sort30);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond32 = null;
        org.springframework.data.domain.Sort sort33 = null;
        java.lang.String str34 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond32, sort33);
        java.lang.Class<?> wildcardClass35 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str31, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str34, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "groupKey", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond26 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond27 = null;
        org.springframework.data.domain.Sort sort28 = null;
        java.lang.String str29 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond26, searchCond27, sort28);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond30 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond31 = null;
        org.springframework.data.domain.Sort sort32 = null;
        java.lang.String str33 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond30, searchCond31, sort32);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond34 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond35 = null;
        org.springframework.data.domain.Sort sort36 = null;
        java.lang.String str37 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond34, searchCond35, sort36);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond38 = null;
        org.springframework.data.domain.Sort sort39 = null;
        java.lang.String str40 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond38, sort39);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond41 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond42 = null;
        org.springframework.data.domain.Sort sort43 = null;
        java.lang.String str44 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond41, searchCond42, sort43);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str37, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str40, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str44, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safePages((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond21, sort22);
        java.lang.Class<?> wildcardClass24 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond16 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond16, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond20 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond20, searchCond21, sort22);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.setAndGetGroupKey("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("1", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond19, sort20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond29 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond30 = null;
        org.springframework.data.domain.Sort sort31 = null;
        java.lang.String str32 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond29, searchCond30, sort31);
        java.lang.Class<?> wildcardClass33 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str32, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond22, searchCond23, sort24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond22, searchCond23, sort24);
        java.lang.Class<?> wildcardClass26 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond23, searchCond24, sort25);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond27 = null;
        org.springframework.data.domain.Sort sort28 = null;
        java.lang.String str29 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond27, sort28);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond29 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond30 = null;
        org.springframework.data.domain.Sort sort31 = null;
        java.lang.String str32 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond29, searchCond30, sort31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str32, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond21, sort22);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond24 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = null;
        org.springframework.data.domain.Sort sort26 = null;
        java.lang.String str27 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond24, searchCond25, sort26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str27, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("action", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond16, sort17);
        java.lang.Class<?> wildcardClass19 = strList8.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond18, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond22, sort23);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = null;
        org.springframework.data.domain.Sort sort26 = null;
        java.lang.String str27 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond25, sort26);
        java.lang.Class<?> wildcardClass28 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str27, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond22, sort23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond12 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond12, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond23, searchCond24, sort25);
        java.lang.Class<?> wildcardClass27 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safePages((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        java.lang.Class<?> wildcardClass19 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safePages((long) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond17, searchCond18, sort19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond21, sort22);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendAnyObjectPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject.getType()\" because \"anyObject\" is null");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        java.lang.Class<?> wildcardClass23 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.lang.String str1 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.setAndGetGroupKey("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str1, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond9 = null;
        org.springframework.data.domain.Sort sort10 = null;
        java.lang.String str11 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond9, sort10);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond18 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond18, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond26 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond27 = null;
        org.springframework.data.domain.Sort sort28 = null;
        java.lang.String str29 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond26, searchCond27, sort28);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond30 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond31 = null;
        org.springframework.data.domain.Sort sort32 = null;
        java.lang.String str33 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond30, searchCond31, sort32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str11, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond19, searchCond20, sort21);
        java.lang.Class<?> wildcardClass23 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus1 = null;
        java.lang.String str2 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendPropagationStatus("action", propagationStatus1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null" + "'", str2, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.common.lib.to.PropagationStatus.getResource()\" because \"propagationStatus\" is null");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond20 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond21 = null;
        org.springframework.data.domain.Sort sort22 = null;
        java.lang.String str23 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond20, searchCond21, sort22);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond24 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond25 = null;
        org.springframework.data.domain.Sort sort26 = null;
        java.lang.String str27 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond24, searchCond25, sort26);
        java.lang.Class<?> wildcardClass28 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str23, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str27, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond17 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond17, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond21 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond21, searchCond22, sort23);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond25 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond25, searchCond26, sort27);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond7 = null;
        org.springframework.data.domain.Sort sort8 = null;
        java.lang.String str9 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond7, sort8);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond10 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond11 = null;
        org.springframework.data.domain.Sort sort12 = null;
        java.lang.String str13 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond10, searchCond11, sort12);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond20, sort21);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str9, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str13, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond26, sort27);
        java.lang.Class<?> wildcardClass29 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.syncope.common.lib.types.TaskType taskType0 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeExecute(taskType0, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.GroupDAO.authFind(String)\" because \"this.groupDAO\" is null", jobExecutionContext2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond23, searchCond24, sort25);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond27 = null;
        org.springframework.data.domain.Sort sort28 = null;
        java.lang.String str29 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond27, sort28);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond30 = null;
        org.springframework.data.domain.Sort sort31 = null;
        java.lang.String str32 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond30, sort31);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str29, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str32, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.syncope.core.persistence.api.entity.user.User user1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.appendUserPropagationStatus("EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", user1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" + "'", str3, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond13 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond14 = null;
        org.springframework.data.domain.Sort sort15 = null;
        java.lang.String str16 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond13, searchCond14, sort15);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond17 = null;
        org.springframework.data.domain.Sort sort18 = null;
        java.lang.String str19 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond17, sort18);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond20, sort21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str16, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str19, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.lang.String[] strArray7 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond13, sort14);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond23, searchCond24, sort25);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond27 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond28 = null;
        org.springframework.data.domain.Sort sort29 = null;
        java.lang.String str30 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList8, membershipCond27, searchCond28, sort29);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond31 = null;
        org.springframework.data.domain.Sort sort32 = null;
        java.lang.String str33 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList8, searchCond31, sort32);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "hi!", "OK", "groupKey", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str30, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str33, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond15 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond16 = null;
        org.springframework.data.domain.Sort sort17 = null;
        java.lang.String str18 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond15, searchCond16, sort17);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond19 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond20 = null;
        org.springframework.data.domain.Sort sort21 = null;
        java.lang.String str22 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond19, searchCond20, sort21);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond23 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond24 = null;
        org.springframework.data.domain.Sort sort25 = null;
        java.lang.String str26 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond23, searchCond24, sort25);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str18, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str22, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str26, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.lang.String[] strArray16 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond19 = null;
        org.springframework.data.domain.Sort sort20 = null;
        java.lang.String str21 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond19, sort20);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond22 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond23 = null;
        org.springframework.data.domain.Sort sort24 = null;
        java.lang.String str25 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond22, searchCond23, sort24);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond26 = null;
        org.springframework.data.domain.Sort sort27 = null;
        java.lang.String str28 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList17, searchCond26, sort27);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond29 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond30 = null;
        org.springframework.data.domain.Sort sort31 = null;
        java.lang.String str32 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond29, searchCond30, sort31);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond33 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond34 = null;
        org.springframework.data.domain.Sort sort35 = null;
        java.lang.String str36 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond33, searchCond34, sort35);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond37 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond38 = null;
        org.springframework.data.domain.Sort sort39 = null;
        java.lang.String str40 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList17, membershipCond37, searchCond38, sort39);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.initResult(org.apache.syncope.core.persistence.api.entity.group.Group)", "action", "null", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "groupKey", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.count(org.apache.syncope.core.persistence.api.dao.search.SearchCond,org.apache.syncope.common.lib.types.AnyTypeKind)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendPropagationStatus(java.lang.StringBuilder,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendUserPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.user.User,org.apache.syncope.common.lib.to.PropagationStatus)", "", "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.group.Group.getName()\" because \"group\" is null", "OK" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str21, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str25, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str28, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str32, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str36, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str40, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.lang.String[] strArray3 = new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" };
        java.util.ArrayList<java.lang.String> strList4 = new java.util.ArrayList<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList4, strArray3);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond6 = null;
        org.springframework.data.domain.Sort sort7 = null;
        java.lang.String str8 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond6, sort7);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond9 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond10 = null;
        org.springframework.data.domain.Sort sort11 = null;
        java.lang.String str12 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList4, membershipCond9, searchCond10, sort11);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond13 = null;
        org.springframework.data.domain.Sort sort14 = null;
        java.lang.String str15 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList4, searchCond13, sort14);
        java.lang.Class<?> wildcardClass16 = strList4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str8, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str12, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str15, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject anyObject1 = null;
        org.apache.syncope.common.lib.to.PropagationStatus propagationStatus2 = null;
        java.lang.String str3 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.appendAnyObjectPropagationStatus("EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.entity.user.User.getKey()\" because \"user\" is null", anyObject1, propagationStatus2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" + "'", str3, "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String[] strArray1 = new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond4 = null;
        org.springframework.data.domain.Sort sort5 = null;
        java.lang.String str6 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond4, sort5);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond7 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond8 = null;
        org.springframework.data.domain.Sort sort9 = null;
        java.lang.String str10 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond7, searchCond8, sort9);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond11 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond12 = null;
        org.springframework.data.domain.Sort sort13 = null;
        java.lang.String str14 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond11, searchCond12, sort13);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond15 = null;
        org.springframework.data.domain.Sort sort16 = null;
        java.lang.String str17 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond15, sort16);
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond18 = null;
        org.springframework.data.domain.Sort sort19 = null;
        java.lang.String str20 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4Harness.safeProcessUsers((java.util.Collection<java.lang.String>) strList2, searchCond18, sort19);
        org.apache.syncope.core.persistence.api.dao.search.MembershipCond membershipCond21 = null;
        org.apache.syncope.core.persistence.api.dao.search.SearchCond searchCond22 = null;
        org.springframework.data.domain.Sort sort23 = null;
        java.lang.String str24 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1Harness.safeProcessAnyObjects((java.util.Collection<java.lang.String>) strList2, membershipCond21, searchCond22, sort23);
        java.lang.Class<?> wildcardClass25 = strList2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "EX:IllegalStateException:java.lang.NoSuchMethodException: org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.appendAnyObjectPropagationStatus(java.lang.StringBuilder,org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject,org.apache.syncope.common.lib.to.PropagationStatus)" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str6, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str10, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str14, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str17, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str20, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null" + "'", str24, "EX:NullPointerException:Cannot invoke \"org.apache.syncope.core.persistence.api.dao.RealmDAO.getRoot()\" because \"this.realmDAO\" is null");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}


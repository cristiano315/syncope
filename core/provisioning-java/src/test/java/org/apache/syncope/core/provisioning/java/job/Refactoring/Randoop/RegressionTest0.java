package org.apache.syncope.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1.GROUP_KEY_JOBDETAIL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupKey" + "'", str0, "groupKey");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.ACTION_JOBDETAIL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1.ACTION_JOBDETAIL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2.GROUP_KEY_JOBDETAIL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupKey" + "'", str0, "groupKey");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType1, "", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.ACTION_JOBDETAIL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "action" + "'", str0, "action");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4.GROUP_KEY_JOBDETAIL_KEY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "groupKey" + "'", str0, "groupKey");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        java.lang.Class<?> wildcardClass1 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType2, "", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType2, "", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType2, "groupKey", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        java.lang.Class<?> wildcardClass1 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType1, "", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType1, "hi!", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType2, "", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass3 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType3, "", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType3, "action", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType4, "groupKey", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType2, "action", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType3, "hi!", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass4 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType1, "groupKey", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType3, "", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType3, "action", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType3, "groupKey", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType4, "action", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass4 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType5, "groupKey", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType1, "hi!", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass2 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType4, "groupKey", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType4, "hi!", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass2 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType5, "hi!", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType4, "", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType4, "", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType3, "action", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType2, "hi!", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType3, "groupKey", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType3, "groupKey", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType4, "hi!", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType1, "groupKey", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType2, "groupKey", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType4, "", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType3, "hi!", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass7 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType5, "hi!", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass4 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType4, "action", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType2, "hi!", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType1, "", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType6, "", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType3, "", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType5, "", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType4, "action", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType6, "groupKey", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass5 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType6, "hi!", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType4, "hi!", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType7, "", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass6 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType2, "groupKey", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType7, "groupKey", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass3 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType5, "", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType7, "action", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass3 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType5, "hi!", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass8 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType8, "hi!", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType2, "action", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType9, "action", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType6, "action", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType9, "", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass7 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType7, "", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType6, "", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType7, "hi!", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType7, "action", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType1, "action", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType2, "action", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass5 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType7, "groupKey", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType7, "groupKey", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass9 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass10 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass9 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType1, "hi!", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType8, "", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType5, "action", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType6, "hi!", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType1, "action", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType10, "action", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass8 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType9, "hi!", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType6, "groupKey", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType6, "action", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType1, "action", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass2 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType2 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType2, "hi!", jobExecutionContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType8, "groupKey", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType10, "groupKey", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType3 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType3, "hi!", jobExecutionContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType5, "", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType8, "", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType8, "action", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass6 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        java.lang.Class<?> wildcardClass1 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType7, "", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType7, "action", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType10, "groupKey", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType10, "action", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType6, "hi!", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass7 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType8, "hi!", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType10, "", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType8, "", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass9 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType5, "action", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType9, "groupKey", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType8, "action", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType9, "hi!", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType10, "", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType10, "hi!", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType12, "action", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass10 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass6 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType7, "hi!", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType9, "groupKey", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType8, "groupKey", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType11, "", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType15, "groupKey", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType8, "groupKey", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass8 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType8, "hi!", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType16, "", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType9, "", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType9, "action", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType10, "groupKey", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass5 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType6, "groupKey", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType7 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType7, "hi!", jobExecutionContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType11, "groupKey", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass15 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType10, "hi!", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType4 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType4, "groupKey", jobExecutionContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType11, "hi!", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass16 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType11, "action", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType11, "action", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType12, "hi!", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType12, "groupKey", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        org.apache.syncope.common.lib.types.TaskType taskType1 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType1, "groupKey", jobExecutionContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType10, "", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType11, "action", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass11 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType12, "", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType16, "groupKey", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType13, "groupKey", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType14, "hi!", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType8 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType8, "action", jobExecutionContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass12 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType17, "hi!", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass11 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType12, "", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType11, "groupKey", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType12, "hi!", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass17 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType12, "action", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType10, "hi!", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType19, "", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType11, "", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType18, "groupKey", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType13, "hi!", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType17, "", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType13, "action", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType11, "groupKey", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType9, "hi!", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass12 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass11 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass10 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType12, "groupKey", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType9, "", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType13, "groupKey", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass12 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType20, "action", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType12, "action", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass18 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType12, "hi!", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass14 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType5, "groupKey", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass13 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType17, "groupKey", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass19 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType16, "hi!", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType22, "", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType6, "", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType17, "action", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType14, "groupKey", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass13 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType14, "hi!", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType14, "", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType16, "", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType18, "", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType19, "action", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType14, "hi!", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType13, "", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass18 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType15, "action", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType16, "action", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass17 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType15, "groupKey", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType12, "", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType13, "action", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType15, "", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType21, "", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType17, "groupKey", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType21, "groupKey", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass23 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass14 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType13, "groupKey", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType14, "", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass15 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType15, "action", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType11, "hi!", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType17, "action", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType14, "", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType18, "action", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType16, "hi!", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType15, "", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType9, "groupKey", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType13, "", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType22, "action", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType11, "hi!", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType15, "", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType15, "action", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType14, "groupKey", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType16, "", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType15, "hi!", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass20 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType16, "hi!", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType19, "action", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType19, "groupKey", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass21 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType17, "hi!", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType14, "action", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType14, "action", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType5, "groupKey", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType19, "hi!", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType20, "", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass14 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType18, "groupKey", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass15 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType18, "", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType19, "groupKey", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType17, "groupKey", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType20, "groupKey", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType13, "action", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType22, "groupKey", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType16, "action", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType22, "hi!", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType18, "hi!", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType5 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType5, "action", jobExecutionContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType21, "action", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType18, "", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType21, "groupKey", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType21, "action", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType11 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext13 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType11, "", jobExecutionContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType20, "action", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType22, "groupKey", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass19 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType20, "", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType23, "groupKey", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType18, "action", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType22, "action", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType20, "groupKey", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType24, "groupKey", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType19, "", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType20, "groupKey", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType20, "", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass23 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType20, "hi!", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass22 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType17, "", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType18, "action", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass17 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType6 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType6, "action", jobExecutionContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType21, "", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass21 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType9 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType9, "action", jobExecutionContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType24, "", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass25 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType22, "", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType13, "", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType17, "", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass16 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass22 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType25, "hi!", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass25 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType20, "action", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass24 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType26, "", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType19, "hi!", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType23, "", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType22, "groupKey", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType22, "hi!", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType23, "hi!", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass16 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType25, "groupKey", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType23, "action", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass18 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass28 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType21, "groupKey", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType22, "action", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType24, "groupKey", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType24, "hi!", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType27, "action", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType26, "hi!", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType27, "", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType12 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType12, "groupKey", jobExecutionContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass22 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType10 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType10, "action", jobExecutionContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType23, "hi!", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType22, "", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType24, "hi!", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType20, "hi!", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType15, "groupKey", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass24 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType21, "action", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType19, "action", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType23, "", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType18, "groupKey", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType18, "hi!", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType26, "groupKey", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType24, "", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass27 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType17, "hi!", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType13, "hi!", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType27, "groupKey", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType28, "action", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType27, "hi!", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass20 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType20 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType20, "hi!", jobExecutionContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType19, "groupKey", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType28, "", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType19, "", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType26, "action", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType26, "action", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType23, "hi!", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass28 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType28, "action", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType25, "", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType14 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType14, "groupKey", jobExecutionContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass20 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType16, "groupKey", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType28, "hi!", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass26 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType25, "", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType25, "groupKey", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType18 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType18, "hi!", jobExecutionContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType28, "hi!", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType28, "groupKey", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType21, "hi!", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType23, "action", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType25, "action", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType23, "groupKey", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass24 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType31, "", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType32, "hi!", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType19 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext21 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType19, "hi!", jobExecutionContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass32 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass23 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType26, "action", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType28, "", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType24, "action", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass21 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType25, "hi!", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType29, "", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass25 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType24, "hi!", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType26, "groupKey", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass29 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType15, "hi!", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass28 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType22 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType22, "hi!", jobExecutionContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType28, "groupKey", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType21, "", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass31 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType24, "groupKey", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType21, "hi!", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType30, "hi!", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType23, "action", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType25, "action", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType29, "groupKey", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass27 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType28, "", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass29 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType27, "groupKey", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType16, "action", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass26 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType28, "action", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType25, "", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType16 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext18 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType16, "groupKey", jobExecutionContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType25 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType25, "groupKey", jobExecutionContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType29, "", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType26, "hi!", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass26 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType29, "action", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass31 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass33 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType21 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType21, "hi!", jobExecutionContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType31, "groupKey", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType29, "hi!", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType32, "", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType13 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType13, "hi!", jobExecutionContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType24 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType24, "", jobExecutionContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType30, "groupKey", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType31, "action", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType27, "hi!", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass27 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType27, "groupKey", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType28, "groupKey", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType29, "hi!", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass19 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType15 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType15, "hi!", jobExecutionContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass29 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType31, "hi!", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType30, "action", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType26, "hi!", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType29, "action", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass30 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType33, "", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType30, "hi!", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType31, "hi!", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType28 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext30 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType28, "hi!", jobExecutionContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType26, "", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType35 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType35, "action", jobExecutionContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType27, "", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType34, "action", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType30, "groupKey", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType26, "", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType29, "", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType32, "hi!", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType33, "action", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass32 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType31, "hi!", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass30 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType32, "groupKey", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType31, "", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType31, "action", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType30, "action", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType35 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType35, "groupKey", jobExecutionContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType32, "groupKey", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType27, "action", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType26 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType26, "groupKey", jobExecutionContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType33, "", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType29, "hi!", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType27, "action", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType27 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext29 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType27, "hi!", jobExecutionContext29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType34, "hi!", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType29 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType29, "groupKey", jobExecutionContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType33, "groupKey", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType32, "action", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType30, "groupKey", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType30, "", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass36 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType30 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType30, "action", jobExecutionContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass33 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType33, "hi!", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType17 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType17, "action", jobExecutionContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType33, "", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass30 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType34, "", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType33, "groupKey", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType32, "", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType31 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType31, "action", jobExecutionContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType38 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType38, "", jobExecutionContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType33, "hi!", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        java.lang.Class<?> wildcardClass35 = groupMemberProvisionTaskJobDelegate1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType35 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType35, "", jobExecutionContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType35 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType35, "action", jobExecutionContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType34, "hi!", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType34, "", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass31 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType34, "action", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass34 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType32, "action", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        java.lang.Class<?> wildcardClass13 = groupMemberProvisionTaskJobDelegate4_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType34, "", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType23 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType23, "", jobExecutionContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType34 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType34, "groupKey", jobExecutionContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass35 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType35 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType35, "hi!", jobExecutionContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        java.lang.Class<?> wildcardClass34 = groupMemberProvisionTaskJobDelegate2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType32 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType32, "action", jobExecutionContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1 groupMemberProvisionTaskJobDelegate1_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate1();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        groupMemberProvisionTaskJobDelegate1_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType33 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext35 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate1_0.execute(taskType33, "groupKey", jobExecutionContext35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2 groupMemberProvisionTaskJobDelegate2_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate2();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        groupMemberProvisionTaskJobDelegate2_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType35 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext37 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate2_0.execute(taskType35, "groupKey", jobExecutionContext37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4 groupMemberProvisionTaskJobDelegate4_0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate4();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        groupMemberProvisionTaskJobDelegate4_0.stop();
        org.apache.syncope.common.lib.types.TaskType taskType37 = null;
        org.apache.syncope.core.provisioning.api.job.JobExecutionContext jobExecutionContext39 = null;
        // The following exception was thrown during execution in test generation
        try {
            groupMemberProvisionTaskJobDelegate4_0.execute(taskType37, "", jobExecutionContext39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.apache.syncope.core.provisioning.api.job.JobExecutionContext.getData()\" because \"context\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}


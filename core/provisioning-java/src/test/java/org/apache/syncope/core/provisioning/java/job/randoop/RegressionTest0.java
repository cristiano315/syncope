package org.apache.syncope.core.provisioning.java.job.randoop;

import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegate;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    /**
     * TC001 - Verify ACTION_JOBDETAIL_KEY constant.
     */
    @Test
    public void test001() {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test001");
        }

        Assert.assertEquals(
                "action",
                GroupMemberProvisionTaskJobDelegate.ACTION_JOBDETAIL_KEY);
    }

    /**
     * TC002 - Verify GROUP_KEY_JOBDETAIL_KEY constant.
     */
    @Test
    public void test002() {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test002");
        }

        Assert.assertEquals(
                "groupKey",
                GroupMemberProvisionTaskJobDelegate.GROUP_KEY_JOBDETAIL_KEY);
    }

    /**
     * TC003 - Verify delegate instantiation.
     */
    @Test
    public void test003() {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test003");
        }

        GroupMemberProvisionTaskJobDelegate delegate =
                new GroupMemberProvisionTaskJobDelegate();

        Assert.assertNotNull(delegate);
    }

    /**
     * TC004 - Verify stop() can be invoked safely.
     */
    @Test
    public void test004() {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test004");
        }

        GroupMemberProvisionTaskJobDelegate delegate =
                new GroupMemberProvisionTaskJobDelegate();

        delegate.stop();

        Assert.assertNotNull(delegate);
    }

    /**
     * TC005 - execute() with "action" and null context must throw NPE.
     */
    @Test(expected = NullPointerException.class)
    public void test005() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test005");
        }

        GroupMemberProvisionTaskJobDelegate delegate =
                new GroupMemberProvisionTaskJobDelegate();

        TaskType taskType = null;
        JobExecutionContext context = null;

        delegate.execute(taskType, "action", context);
    }

    /**
     * TC006 - execute() with "groupKey" and null context must throw NPE.
     */
    @Test(expected = NullPointerException.class)
    public void test006() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test006");
        }

        GroupMemberProvisionTaskJobDelegate delegate =
                new GroupMemberProvisionTaskJobDelegate();

        TaskType taskType = null;
        JobExecutionContext context = null;

        delegate.execute(taskType, "groupKey", context);
    }

    /**
     * TC007 - execute() with empty string and null context must throw NPE.
     */
    @Test(expected = NullPointerException.class)
    public void test007() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test007");
        }

        GroupMemberProvisionTaskJobDelegate delegate =
                new GroupMemberProvisionTaskJobDelegate();

        TaskType taskType = null;
        JobExecutionContext context = null;

        delegate.execute(taskType, "", context);
    }

    /**
     * TC008 - execute() with generic value and null context must throw NPE.
     */
    @Test(expected = NullPointerException.class)
    public void test008() throws Throwable {
        if (debug) {
            System.out.format("%n%s%n", "RegressionTest0.test008");
        }

        GroupMemberProvisionTaskJobDelegate delegate =
                new GroupMemberProvisionTaskJobDelegate();

        TaskType taskType = null;
        JobExecutionContext context = null;

        delegate.execute(taskType, "hi!", context);
    }
}
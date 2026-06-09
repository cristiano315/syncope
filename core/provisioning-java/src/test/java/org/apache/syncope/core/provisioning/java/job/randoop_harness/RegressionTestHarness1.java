import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestHarness1 {

    public static boolean debug = false;

    @Test
    public void test501_uniqueBooleanChecks() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        h.deprovisionUserAndAnyObject();

        org.junit.Assert.assertTrue(h.resultContainsUserKey());
        org.junit.Assert.assertTrue(h.resultContainsAnyObjectKey());
        org.junit.Assert.assertTrue(h.resultContainsGroupHeader());
        org.junit.Assert.assertTrue(h.resultContainsFailureReason());
    }

    @Test
    public void test502_uniqueDeprovisionFailure() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n",
            h.deprovisionOneAnyObjectWithFailureReason());
    }

    @Test
    public void test503_uniqueProvisionUserFailure() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n",
            h.provisionOneUserWithFailureReason());
    }

    @Test
    public void test504_uniqueEmptyDeprovisionGroup() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members deprovision\n\n",
            h.deprovisionEmptyGroup());
    }
}

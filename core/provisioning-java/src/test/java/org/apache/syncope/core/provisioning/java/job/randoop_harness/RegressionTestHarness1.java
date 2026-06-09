import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestHarness1 {

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
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        java.lang.String str15 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        boolean boolean16 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        boolean boolean17 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str13, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str14, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str15, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str18, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str19, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        java.lang.String str4 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        java.lang.String str5 = groupMemberProvisionTaskJobDelegateHarness0.provisionUserAndAnyObject();
        java.lang.String str6 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str7 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str3, "Group randoopGroup members deprovision\n\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str4, "Group randoopGroup members deprovision\n\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str5, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str6, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str7, "Group randoopGroup members provision\n\n\nStop was requested");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str2 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        boolean boolean3 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str2, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        java.lang.String str4 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        java.lang.String str5 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str6 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str7 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str3, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str4, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str5, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str6, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str7, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        java.lang.String str4 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str3, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str4, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        boolean boolean15 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str16 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str13, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str14, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str16, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        boolean boolean4 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str5 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        boolean boolean6 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str3, "Group randoopGroup members deprovision\n\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str5, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        boolean boolean3 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.provisionUserAndAnyObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str1, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str3, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        java.lang.String str15 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        boolean boolean16 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        boolean boolean17 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str13, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str14, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str15, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str18, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str19, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str2 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str4 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        boolean boolean5 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str6 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean7 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsDeprovisionHeader();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.provisionUserAndAnyObject();
        boolean boolean9 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsDeprovisionHeader();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str2, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str3, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str4, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str6, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        boolean boolean11 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsDeprovisionHeader();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str15 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str22 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, false, true, true, true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str13, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str14, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str15, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str22, "Group randoopGroup members deprovision\n\n\nStop was requested");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        boolean boolean12 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        boolean boolean15 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str13, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str14, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUserWithFailureReason();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str12, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str13, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str14, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, false, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str17 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, true, false, true);
        boolean boolean18 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str21 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str17, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str19, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str20, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str21, "Group randoopGroup members provision\n\n\nStop was requested");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, false, true);
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        boolean boolean11 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUserWithFailureReason();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str15 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str10, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str12, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str13, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str14, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str15, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, true, true, false);
        boolean boolean19 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        boolean boolean20 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str11, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str18, "Group randoopGroup members deprovision\n\n\nStop was requested");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, false, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        boolean boolean11 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        boolean boolean15 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str16 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str13, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str14, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str16, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUserWithFailureReason();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        boolean boolean12 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str9, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str11, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str13, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str14, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str2 = groupMemberProvisionTaskJobDelegateHarness0.provisionEmptyGroup();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str4 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str5 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str6 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        boolean boolean7 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsDeprovisionHeader();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Group randoopGroup members provision\n\n" + "'", str2, "Group randoopGroup members provision\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str3, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str4, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str5, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str6, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean2 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, false, true);
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        boolean boolean13 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str10, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str16 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, false, false, true, false);
        java.lang.String str17 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str16, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str17, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str18, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str19, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        boolean boolean14 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str15 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str13, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str15, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, true, false);
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        boolean boolean20 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        java.lang.String str21 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str22 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        boolean boolean23 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str18, "Group randoopGroup members deprovision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str19, "Group randoopGroup members deprovision\n\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str21, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str22, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean10 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        boolean boolean12 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.provisionUserAndAnyObject();
        java.lang.String str14 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str13, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str14, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str16 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, false, false, true, false);
        java.lang.String str17 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        java.lang.String str21 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str16, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str17, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str18, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str19, "Group randoopGroup members deprovision\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str20, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str21, "Group randoopGroup members provision\n\n\nStop was requested");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str12 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str13 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean14 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        java.lang.String str15 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str12, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str13, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str15, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, true, false);
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionUserAndAnyObject();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObject();
        java.lang.String str21 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        boolean boolean22 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str23 = groupMemberProvisionTaskJobDelegateHarness0.stopBeforeProcessing();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str18, "Group randoopGroup members deprovision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str19, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str20, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str21, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str23, "Group randoopGroup members provision\n\n\nStop was requested");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str16 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, false, false, true, false);
        java.lang.String str17 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str27 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, false, false, true, true, false);
        java.lang.String str28 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str29 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str30 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean31 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsDeprovisionHeader();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str16, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str17, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str18, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str19, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str20, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str27, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str28, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str29, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str30, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str2 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str1, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str2, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str3, "Group randoopGroup members deprovision\n\n");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, true, false);
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.provisionWithEmptyResources();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str21 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str22 = groupMemberProvisionTaskJobDelegateHarness0.provisionUserAndAnyObject();
        java.lang.String str23 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        boolean boolean24 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        java.lang.String str31 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, false, true, true, false, false);
        java.lang.String str32 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str18, "Group randoopGroup members deprovision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str19, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str20, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str21, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str22, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str23, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str31, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str32, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str16 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, false, false, true, false);
        java.lang.String str17 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUser();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        boolean boolean21 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str22 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObject();
        boolean boolean23 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsAnyObjectKey();
        java.lang.String str30 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, true, false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Group randoopGroup members provision\n\n\nStop was requested" + "'", str16, "Group randoopGroup members provision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str17, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str18, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str19, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str20, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str22, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str30, "Group randoopGroup members deprovision\n\n\nStop was requested");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(false, true, true, false, false, false);
        java.lang.String str9 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str11 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObjectWithFailureReason();
        java.lang.String str18 = groupMemberProvisionTaskJobDelegateHarness0.runScenario(true, true, true, false, true, false);
        java.lang.String str19 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionEmptyGroup();
        java.lang.String str20 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        boolean boolean21 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsStopMessage();
        boolean boolean22 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsFailureReason();
        java.lang.String str23 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUserWithFailureReason();
        boolean boolean24 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsGroupHeader();
        java.lang.String str25 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneUserWithFailureReason();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str9, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str11, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Group randoopGroup members deprovision\n\n\nStop was requested" + "'", str18, "Group randoopGroup members deprovision\n\n\nStop was requested");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Group randoopGroup members deprovision\n\n" + "'", str19, "Group randoopGroup members deprovision\n\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str20, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str23, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str25, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\nUser user-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness groupMemberProvisionTaskJobDelegateHarness0 = new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();
        java.lang.String str1 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        java.lang.String str2 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        java.lang.String str3 = groupMemberProvisionTaskJobDelegateHarness0.provisionOneAnyObject();
        java.lang.String str4 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneAnyObjectWithFailureReason();
        boolean boolean5 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str6 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionOneUser();
        boolean boolean7 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsDeprovisionHeader();
        java.lang.String str8 = groupMemberProvisionTaskJobDelegateHarness0.provisionUserAndAnyObject();
        boolean boolean9 = groupMemberProvisionTaskJobDelegateHarness0.resultContainsUserKey();
        java.lang.String str10 = groupMemberProvisionTaskJobDelegateHarness0.deprovisionWithEmptyResources();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str1, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str2, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str3, "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n" + "'", str4, "Group randoopGroup members deprovision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n" + "'", str6, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str8, "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n" + "'", str10, "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n");
    }
}


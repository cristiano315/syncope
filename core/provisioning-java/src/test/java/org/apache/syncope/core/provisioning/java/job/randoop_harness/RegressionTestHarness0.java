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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestHarness0 {

    public static boolean debug = false;

    @Test
    public void test001_uniqueProvisionScenario() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        String result = h.runScenario(false, true, true, false, false, false);

        org.junit.Assert.assertEquals(
            "Group randoopGroup members provision\n\nUser user-1\tResource resource-1\tnull\n\nPRINTER printer-1\tResource resource-1\tnull\n\n",
            result);
    }

    @Test
    public void test002_uniqueDeprovisionUser() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members deprovision\n\nUser user-1\tResource resource-1\tnull\n\n",
            h.deprovisionOneUser());
    }

    @Test
    public void test003_uniqueAnyObjectFailure() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members provision\n\nPRINTER printer-1\tResource resource-1\tnull\nPRINTER printer-1\tResource resource-2\tnull\nsimulated failure reason\n\n\n",
            h.provisionOneAnyObjectWithFailureReason());
    }

    @Test
    public void test004_uniqueStopScenario() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members provision\n\n\nStop was requested",
            h.stopBeforeProcessing());
    }

    @Test
    public void test005_uniqueEmptyGroup() throws Throwable {
        org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness h =
            new org.apache.syncope.core.provisioning.java.job.GroupMemberProvisionTaskJobDelegateHarness();

        org.junit.Assert.assertEquals(
            "Group randoopGroup members provision\n\n",
            h.provisionEmptyGroup());
    }
}

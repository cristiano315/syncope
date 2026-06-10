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
package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;


import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager;
import org.apache.syncope.core.provisioning.api.UserProvisioningManager;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.springframework.data.domain.Pageable;

public class GroupMemberProvisionTaskJobDelegateMutationTest {

    private static final String GROUP_KEY = "group-1";

    private GroupMemberProvisionTaskJobDelegateTestable delegate;

    private RealmDAO realmDAO;

    private GroupDAO groupDAO;

    private AnySearchDAO anySearchDAO;

    private Realm rootRealm;

    @BeforeEach
    public void setUp() throws Exception {

        realmDAO = mock(RealmDAO.class);
        groupDAO = mock(GroupDAO.class);
        anySearchDAO = mock(AnySearchDAO.class);

        UserProvisioningManager userProvisioningManager =
                mock(UserProvisioningManager.class);

        AnyObjectProvisioningManager anyObjectProvisioningManager =
                mock(AnyObjectProvisioningManager.class);

        rootRealm = mock(Realm.class);

        Group group = mock(Group.class);

        delegate = new GroupMemberProvisionTaskJobDelegateTestable();

        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", ProvisionAction.PROVISION);

        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn("engineering");
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(List.of("resource-1"));

        when(realmDAO.getRoot()).thenReturn(rootRealm);

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(0L);

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(0L);
    }

    @Test
    @DisplayName("MT1: Search condition contains the expected group key")
    public void testMT1_SearchConditionContainsGroupKey() {

        delegate.runDoExecute();

        ArgumentCaptor<SearchCond> condCaptor =
                ArgumentCaptor.forClass(SearchCond.class);

        verify(anySearchDAO).count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                condCaptor.capture(),
                eq(AnyTypeKind.USER));

        SearchCond captured = condCaptor.getValue();

        assertNotNull(captured,
                "MT1 failed: SearchCond should not be null.");

        /*
         * The string representation contains the group identifier used
         * to build the membership condition.
         *
         * If membershipCond.setGroup(groupKey) is removed by PIT,
         * this assertion fails and the mutant is killed.
         */
        assertTrue(
                captured.toString().contains(GROUP_KEY),
                "MT1 failed: SearchCond does not contain the expected group key.");
    }

    private static void setField(
            final Object target,
            final String fieldName,
            final Object value) throws Exception {

        Class<?> current = target.getClass();

        while (current != null) {
            try {
                Field field = current.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(target, value);
                return;
            } catch (NoSuchFieldException e) {
                current = current.getSuperclass();
            }
        }

        throw new NoSuchFieldException(fieldName);
    }


private static class GroupMemberProvisionTaskJobDelegateTestable
        extends GroupMemberProvisionTaskJobDelegate {

    private final List<String> statuses = new ArrayList<>();

    private String runDoExecute() {
        return doExecute(mock(JobExecutionContext.class));
    }

    @Override
    protected void setStatus(final String status) {
        statuses.add(status);
    }
}

}
//###Test START##
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.entity.task.TaskExec;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager;
import org.apache.syncope.core.provisioning.api.UserProvisioningManager;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class GroupMemberProvisionTaskJobDelegateFewShotTest {

    private static final String GROUP_KEY = "group-1";

    private static final String GROUP_NAME = "engineering";

    private static final String USER_KEY = "user-1";

    private static final String USER_KEY_2 = "user-2";

    private static final String ANY_OBJECT_KEY = "printer-1";

    private static final String ANY_OBJECT_KEY_2 = "scanner-1";

    private TestableGroupMemberProvisionTaskJobDelegate delegate;

    private RealmDAO realmDAO;

    private GroupDAO groupDAO;

    private AnySearchDAO anySearchDAO;

    private UserProvisioningManager userProvisioningManager;

    private AnyObjectProvisioningManager anyObjectProvisioningManager;

    private Realm rootRealm;

    private Group group;

    private Collection<String> resources;

    @BeforeEach
    public void setUp() throws Exception {
        realmDAO = mock(RealmDAO.class);
        groupDAO = mock(GroupDAO.class);
        anySearchDAO = mock(AnySearchDAO.class);
        userProvisioningManager = mock(UserProvisioningManager.class);
        anyObjectProvisioningManager = mock(AnyObjectProvisioningManager.class);

        rootRealm = mock(Realm.class);
        group = mock(Group.class);
        resources = List.of("resource-1");

        /*
         * The production class receives its dependencies through Spring
         * injection. These unit tests inject mocks through reflection so that
         * doExecute() can be tested without starting the Spring container.
         */
        delegate = new TestableGroupMemberProvisionTaskJobDelegate();

        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        /*
         * execute() normally initializes these fields from JobExecutionContext.
         * Since these tests focus on doExecute(), they set them directly.
         */
        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", ProvisionAction.PROVISION);

        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn(GROUP_NAME);
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(resources);
        when(realmDAO.getRoot()).thenReturn(rootRealm);

        /*
         * Default search behavior: the group has no members.
         * Individual tests override these stubbings only when they need
         * specific members or counts.
         */
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

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of());

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of());
    }

    @Test
    @DisplayName("TC1: PROVISION with no members")
    public void testTC1_DoExecute_ProvisionNoMembers() {
        String result = delegate.runDoExecute();

        /*
         * Minimal happy path. The group exists, but it has no user members and
         * no any object members. No provisioning manager must be called.
         */
        assertTrue(result.contains("Group engineering members provision"),
                "TC1 failed: initial provision report is missing. Actual result: " + result);

        verifyNoInteractions(userProvisioningManager, anyObjectProvisioningManager);

        assertTrue(delegate.statuses.stream().anyMatch(status -> status.contains("About to provision 0 users")),
                "TC1 failed: user preparation status was not recorded.");

        assertTrue(delegate.statuses.stream().anyMatch(status -> status.contains("About to provision 0 any objects")),
                "TC1 failed: any object preparation status was not recorded.");
    }

    @Test
    @DisplayName("TC2: PROVISION of one user without failure reason")
    public void testTC2_DoExecute_ProvisionUserWithoutFailureReason() {
        User user = mockUser(USER_KEY);
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user));

        when(userProvisioningManager.provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        String result = delegate.runDoExecute();

        /*
         * Standard user provisioning path. Since the failure reason is blank,
         * the report must include the user and resource but no extra failure
         * detail.
         */
        assertTrue(result.contains("User user-1"),
                "TC2 failed: user key is missing from the report. Actual result: " + result);

        assertTrue(result.contains("Resource resource-1"),
                "TC2 failed: resource key is missing from the report. Actual result: " + result);

        verify(userProvisioningManager).provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull());

        verify(userProvisioningManager, never()).deprovision(
                any(),
                any(),
                anyBoolean(),
                any());
    }

    @Test
    @DisplayName("TC3: PROVISION of one user with failure reason")
    public void testTC3_DoExecute_ProvisionUserWithFailureReason() {
        User user = mockUser(USER_KEY);
        PropagationStatus status = mockPropagationStatus("resource-1", "Connection refused");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user));

        when(userProvisioningManager.provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        String result = delegate.runDoExecute();

        /*
         * A non-blank failure reason is appended to the report. This covers the
         * StringUtils.isNotBlank() branch for user propagation statuses.
         */
        assertTrue(result.contains("User user-1"),
                "TC3 failed: user key is missing from the report. Actual result: " + result);

        assertTrue(result.contains("Connection refused"),
                "TC3 failed: failure reason was not appended to the report. Actual result: " + result);
    }

    @Test
    @DisplayName("TC4: DEPROVISION of one user")
    public void testTC4_DoExecute_DeprovisionUser() throws Exception {
        setField(delegate, "action", ProvisionAction.DEPROVISION);

        User user = mockUser(USER_KEY);
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user));

        when(userProvisioningManager.deprovision(
                eq(USER_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        String result = delegate.runDoExecute();

        /*
         * With DEPROVISION action, the user deprovision method must be used and
         * the provision method must not be invoked.
         */
        assertTrue(result.contains("Group engineering members deprovision"),
                "TC4 failed: deprovision heading is missing. Actual result: " + result);

        verify(userProvisioningManager).deprovision(
                eq(USER_KEY),
                eq(resources),
                eq(false),
                isNull());

        verify(userProvisioningManager, never()).provision(
                any(),
                anyBoolean(),
                any(),
                any(),
                anyBoolean(),
                any());

        assertTrue(delegate.statuses.stream().anyMatch(statusMessage ->
                statusMessage.contains("About to deprovision 1 users from [resource-1]")),
                "TC4 failed: deprovision user status was not recorded.");
    }

    @Test
    @DisplayName("TC5: User pagination when count equals AnyDAO.DEFAULT_PAGE_SIZE")
    public void testTC5_DoExecute_UserPaginationAtDefaultPageSize() {
        User user = mockUser(USER_KEY);
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn((long) AnyDAO.DEFAULT_PAGE_SIZE);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user), List.of());

        when(userProvisioningManager.provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        delegate.runDoExecute();

        /*
         * The production code computes pages as count / pageSize + 1. When the
         * count exactly equals the page size, pages 0 and 1 are requested.
         */
        ArgumentCaptor<Pageable> pageableCaptor = ArgumentCaptor.forClass(Pageable.class);

        verify(anySearchDAO, times(2)).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                pageableCaptor.capture(),
                eq(AnyTypeKind.USER));

        assertEquals(0, pageableCaptor.getAllValues().get(0).getPageNumber(),
                "TC5 failed: first requested user page should be 0.");

        assertEquals(1, pageableCaptor.getAllValues().get(1).getPageNumber(),
                "TC5 failed: second requested user page should be 1.");

        assertEquals(AnyDAO.DEFAULT_PAGE_SIZE, pageableCaptor.getAllValues().get(0).getPageSize(),
                "TC5 failed: user page size should match AnyDAO.DEFAULT_PAGE_SIZE.");
    }

    @Test
    @DisplayName("TC6: User search uses ascending creationDate sort")
    public void testTC6_DoExecute_UserSearchUsesCreationDateAscendingSort() {
        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        delegate.runDoExecute();

        /*
         * Members are searched using a stable creationDate ascending ordering.
         * This captures the Pageable and verifies its sort contract.
         */
        ArgumentCaptor<Pageable> pageableCaptor = ArgumentCaptor.forClass(Pageable.class);

        verify(anySearchDAO).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                pageableCaptor.capture(),
                eq(AnyTypeKind.USER));

        Sort.Order order = pageableCaptor.getValue().getSort().getOrderFor("creationDate");

        assertNotNull(order,
                "TC6 failed: user search should contain a sort order for creationDate.");

        assertTrue(order.isAscending(),
                "TC6 failed: user search should be sorted by creationDate ascending.");
    }

    @Test
    @DisplayName("TC7: PROVISION of one any object")
    public void testTC7_DoExecute_ProvisionAnyObject() {
        AnyObject anyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of(anyObject));

        when(anyObjectProvisioningManager.provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        String result = delegate.runDoExecute();

        /*
         * Any objects are processed after users. The report contains the any
         * object type key followed by the any object key.
         */
        assertTrue(result.contains("PRINTER printer-1"),
                "TC7 failed: any object type and key are missing from the report. Actual result: " + result);

        assertTrue(result.contains("Resource resource-1"),
                "TC7 failed: resource information is missing from the report. Actual result: " + result);

        verify(anyObjectProvisioningManager).provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull());

        verify(anyObjectProvisioningManager, never()).deprovision(
                any(),
                any(),
                anyBoolean(),
                any());
    }

    @Test
    @DisplayName("TC8: PROVISION of one any object with failure reason")
    public void testTC8_DoExecute_ProvisionAnyObjectWithFailureReason() {
        AnyObject anyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");
        PropagationStatus status = mockPropagationStatus("resource-1", "Timeout while writing object");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of(anyObject));

        when(anyObjectProvisioningManager.provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        String result = delegate.runDoExecute();

        /*
         * This covers the StringUtils.isNotBlank() branch for any object
         * propagation statuses.
         */
        assertTrue(result.contains("PRINTER printer-1"),
                "TC8 failed: any object information is missing from the report. Actual result: " + result);

        assertTrue(result.contains("Timeout while writing object"),
                "TC8 failed: any object failure reason is missing. Actual result: " + result);
    }

    @Test
    @DisplayName("TC9: DEPROVISION of one any object")
    public void testTC9_DoExecute_DeprovisionAnyObject() throws Exception {
        setField(delegate, "action", ProvisionAction.DEPROVISION);

        AnyObject anyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of(anyObject));

        when(anyObjectProvisioningManager.deprovision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        String result = delegate.runDoExecute();

        /*
         * Mirrors any object provisioning but verifies that DEPROVISION selects
         * the correct manager method.
         */
        assertTrue(result.contains("Group engineering members deprovision"),
                "TC9 failed: deprovision heading is missing. Actual result: " + result);

        assertTrue(result.contains("PRINTER printer-1"),
                "TC9 failed: any object information is missing from the report. Actual result: " + result);

        verify(anyObjectProvisioningManager).deprovision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull());

        verify(anyObjectProvisioningManager, never()).provision(
                any(),
                any(),
                anyBoolean(),
                any());
    }

    @Test
    @DisplayName("TC10: Any object pagination when count equals AnyDAO.DEFAULT_PAGE_SIZE")
    public void testTC10_DoExecute_AnyObjectPaginationAtDefaultPageSize() {
        AnyObject anyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn((long) AnyDAO.DEFAULT_PAGE_SIZE);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of(anyObject), List.of());

        when(anyObjectProvisioningManager.provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(status));

        delegate.runDoExecute();

        /*
         * The same page calculation is used for any objects.
         */
        ArgumentCaptor<Pageable> pageableCaptor = ArgumentCaptor.forClass(Pageable.class);

        verify(anySearchDAO, times(2)).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                pageableCaptor.capture(),
                eq(AnyTypeKind.ANY_OBJECT));

        assertEquals(0, pageableCaptor.getAllValues().get(0).getPageNumber(),
                "TC10 failed: first requested any object page should be 0.");

        assertEquals(1, pageableCaptor.getAllValues().get(1).getPageNumber(),
                "TC10 failed: second requested any object page should be 1.");

        assertEquals(AnyDAO.DEFAULT_PAGE_SIZE, pageableCaptor.getAllValues().get(0).getPageSize(),
                "TC10 failed: any object page size should match AnyDAO.DEFAULT_PAGE_SIZE.");
    }

    @Test
    @DisplayName("TC11: PROVISION with both user and any object members")
    public void testTC11_DoExecute_ProcessUsersBeforeAnyObjects() {
        User user = mockUser(USER_KEY);
        AnyObject anyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");

        PropagationStatus userStatus = mockPropagationStatus("resource-1", "");
        PropagationStatus anyObjectStatus = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user));

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of(anyObject));

        when(userProvisioningManager.provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(userStatus));

        when(anyObjectProvisioningManager.provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenReturn(List.of(anyObjectStatus));

        String result = delegate.runDoExecute();

        /*
         * The implementation processes users first and any objects afterwards.
         */
        assertTrue(result.contains("User user-1"),
                "TC11 failed: user member is missing from the report. Actual result: " + result);

        assertTrue(result.contains("PRINTER printer-1"),
                "TC11 failed: any object member is missing from the report. Actual result: " + result);

        InOrder order = inOrder(userProvisioningManager, anyObjectProvisioningManager);

        order.verify(userProvisioningManager).provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull());

        order.verify(anyObjectProvisioningManager).provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull());
    }

    @Test
    @DisplayName("TC12: Multiple propagation statuses are fully reported")
    public void testTC12_DoExecute_MultiplePropagationStatusesForSameUser() {
        User user = mockUser(USER_KEY);

        PropagationStatus firstStatus = mockPropagationStatus("resource-1", "");
        PropagationStatus secondStatus = mockPropagationStatus("resource-2", "Second resource failed");

        Collection<String> multipleResources = List.of("resource-1", "resource-2");
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(multipleResources);

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user));

        when(userProvisioningManager.provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(multipleResources),
                eq(false),
                isNull())).
                thenReturn(List.of(firstStatus, secondStatus));

        String result = delegate.runDoExecute();

        /*
         * A single member can return multiple propagation statuses. Each one
         * must be present in the final report.
         */
        assertTrue(result.contains("Resource resource-1"),
                "TC12 failed: first propagation status is missing. Actual result: " + result);

        assertTrue(result.contains("Resource resource-2"),
                "TC12 failed: second propagation status is missing. Actual result: " + result);

        assertTrue(result.contains("Second resource failed"),
                "TC12 failed: failure reason for second status is missing. Actual result: " + result);
    }

    @Test
    @DisplayName("TC13: Stop requested before member processing")
    public void testTC13_DoExecute_StopBeforeProcessingMembers() {
        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(1L);

        delegate.stop();

        String result = delegate.runDoExecute();

        /*
         * If stop is requested before entering the user loop, searches are not
         * performed and the any object phase is skipped.
         */
        assertTrue(result.contains("Stop was requested"),
                "TC13 failed: stop message is missing. Actual result: " + result);

        verify(anySearchDAO, never()).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        verify(anySearchDAO, never()).count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT));

        verifyNoInteractions(userProvisioningManager, anyObjectProvisioningManager);
    }

    @Test
    @DisplayName("TC14: Stop requested during user processing")
    public void testTC14_DoExecute_StopDuringUserProcessing() {
        User user = mockUser(USER_KEY);
        User secondUser = mockUser(USER_KEY_2);
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.USER))).
                thenReturn(2L);

        /*
         * The second mocked user is created before the stubbing below.
         * Creating it inside thenReturn(List.of(...)) would start another
         * Mockito stubbing while this one is still unfinished.
         */
        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.USER))).
                thenReturn(List.of(user, secondUser));

        when(userProvisioningManager.provision(
                eq(USER_KEY),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull())).
                thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(status);
                });

        String result = delegate.runDoExecute();

        /*
         * A stop request raised during user provisioning is observed after the
         * current user has been reported. Remaining users and any objects are
         * skipped.
         */
        assertTrue(result.contains("User user-1"),
                "TC14 failed: current user should still be reported. Actual result: " + result);

        assertTrue(result.contains("Stop was requested"),
                "TC14 failed: stop message is missing. Actual result: " + result);

        verify(userProvisioningManager, never()).provision(
                eq(USER_KEY_2),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                isNull());

        verify(anySearchDAO, never()).count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT));

        verifyNoInteractions(anyObjectProvisioningManager);
    }

    @Test
    @DisplayName("TC15: Stop requested during any object processing")
    public void testTC15_DoExecute_StopDuringAnyObjectProcessing() {
        AnyObject firstAnyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");
        AnyObject secondAnyObject = mockAnyObject(ANY_OBJECT_KEY_2, "SCANNER");
        PropagationStatus status = mockPropagationStatus("resource-1", "");

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(2L);

        when(anySearchDAO.search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(List.of(firstAnyObject, secondAnyObject));

        when(anyObjectProvisioningManager.provision(
                eq(ANY_OBJECT_KEY),
                eq(resources),
                eq(false),
                isNull())).
                thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(status);
                });

        String result = delegate.runDoExecute();

        /*
         * The stop request is detected after the current any object is
         * reported. Remaining any objects are skipped.
         */
        assertTrue(result.contains("PRINTER printer-1"),
                "TC15 failed: current any object should be reported. Actual result: " + result);

        assertTrue(result.contains("Stop was requested"),
                "TC15 failed: stop message is missing. Actual result: " + result);

        verify(anyObjectProvisioningManager, never()).provision(
                eq(ANY_OBJECT_KEY_2),
                eq(resources),
                eq(false),
                isNull());
    }

    @Test
    @DisplayName("TC16: hasToBeRegistered always returns true")
    public void testTC16_HasToBeRegistered_AlwaysTrue() {
        TaskExec<?> execution = mock(TaskExec.class);

        /*
         * The method does not depend on the execution object. It must return
         * true both for a real execution object and for null.
         */
        assertTrue(delegate.callHasToBeRegistered(execution),
                "TC16 failed: hasToBeRegistered should return true for a non-null execution.");

        assertTrue(delegate.callHasToBeRegistered(null),
                "TC16 failed: hasToBeRegistered should return true for a null execution.");
    }

    /*
     * Helper methods used to keep the test cases readable. They create the
     * minimum mocked domain objects needed by doExecute().
     */

    private static User mockUser(final String key) {
        User user = mock(User.class);
        when(user.getKey()).thenReturn(key);
        return user;
    }

    private static AnyObject mockAnyObject(final String key, final String typeKey) {
        AnyType type = mock(AnyType.class);
        when(type.getKey()).thenReturn(typeKey);

        AnyObject anyObject = mock(AnyObject.class);
        when(anyObject.getKey()).thenReturn(key);
        when(anyObject.getType()).thenReturn(type);

        return anyObject;
    }

    private static PropagationStatus mockPropagationStatus(final String resource, final String failureReason) {
        PropagationStatus status = mock(PropagationStatus.class);

        when(status.getResource()).thenReturn(resource);

        /*
         * The exact enum returned by getStatus() is not relevant for these
         * tests. The production code appends it to the report, and null is a
         * valid mocked value for verifying the surrounding formatting logic.
         */
        when(status.getStatus()).thenReturn(null);
        when(status.getFailureReason()).thenReturn(failureReason);

        return status;
    }

    private static void setField(final Object target, final String fieldName, final Object value) throws Exception {
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

    /*
     * Test subclass used to expose protected methods and collect status
     * messages without relying on the real task execution infrastructure.
     */
    private static class TestableGroupMemberProvisionTaskJobDelegate extends GroupMemberProvisionTaskJobDelegate {

        private final List<String> statuses = new ArrayList<>();

        private String runDoExecute() {
            return doExecute(mock(JobExecutionContext.class));
        }

        private boolean callHasToBeRegistered(final TaskExec<?> execution) {
            return hasToBeRegistered(execution);
        }

        @Override
        protected void setStatus(final String status) {
            statuses.add(status);
        }
    }
}
//###Test END##
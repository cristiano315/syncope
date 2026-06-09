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
//###Test START##
package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.ExecStatus;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.data.domain.Pageable;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class GroupMemberProvisionTaskJobDelegateGToTTest {

    private static final String GROUP_KEY = "group-1";

    private static final Collection<String> RESOURCE_KEYS = new LinkedHashSet<>(List.of("resource-a", "resource-b"));

    @Mock
    private RealmDAO realmDAO;

    @Mock
    private GroupDAO groupDAO;

    @Mock
    private AnySearchDAO anySearchDAO;

    @Mock
    private UserProvisioningManager userProvisioningManager;

    @Mock
    private AnyObjectProvisioningManager anyObjectProvisioningManager;

    @Mock
    private Realm realm;

    @Mock
    private Group group;

    @Mock
    private JobExecutionContext context;

    private TestableGroupMemberProvisionTaskJobDelegate delegate;

    @BeforeEach
    void setUp() {
        delegate = new TestableGroupMemberProvisionTaskJobDelegate();

        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);
        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", ProvisionAction.PROVISION);
    }

    @Test
    void tc01StopShouldMarkTheDelegateAsStopped() {
        delegate.stop();

        assertEquals(Boolean.TRUE, getField(delegate, "stopRequested"));
    }

    @Test
    void tc02ExecuteShouldReadGroupKeyAndActionFromJobContextData() throws Exception {
        when(context.getData()).thenReturn(Map.of(
                GroupMemberProvisionTaskJobDelegate.GROUP_KEY_JOBDETAIL_KEY, "ctx-group",
                GroupMemberProvisionTaskJobDelegate.ACTION_JOBDETAIL_KEY, ProvisionAction.DEPROVISION));

        /*
         * This public method stores values from the job context before delegating to the superclass.
         * The superclass execution path is intentionally ignored here because it belongs to another unit.
         */
        try {
            delegate.execute(TaskType.SCHEDULED, "task-1", context);
        } catch (Exception ignored) {
            // Superclass dependencies are not configured in this isolated unit test.
        }

        assertEquals("ctx-group", getField(delegate, "groupKey"));
        assertEquals(ProvisionAction.DEPROVISION, getField(delegate, "action"));
    }

    @Test
    void tc03DoExecuteShouldProvisionUsersAndAnyObjects() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        User user = mock(User.class);
        when(user.getKey()).thenReturn("user-1");

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn("PRINTER");

        AnyObject anyObject = mock(AnyObject.class);
        when(anyObject.getKey()).thenReturn("any-object-1");
        when(anyObject.getType()).thenReturn(anyType);

        whenUserCountIs(1L);
        whenAnyObjectCountIs(1L);

        doReturn(List.of(user)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doReturn(List.of(anyObject)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        when(userProvisioningManager.provision(
                eq("user-1"),
                eq(true),
                isNull(),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull())).
                thenReturn(List.of(status("resource-a", ExecStatus.SUCCESS, null)));

        when(anyObjectProvisioningManager.provision(
                eq("any-object-1"),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull())).
                thenReturn(List.of(status("resource-b", ExecStatus.SUCCESS, null)));

        String result = delegate.run(context);

        assertTrue(result.contains("Group engineering members provision"));
        assertTrue(result.contains("User user-1"));
        assertTrue(result.contains("Resource resource-a"));
        assertTrue(result.contains("SUCCESS"));
        assertTrue(result.contains("PRINTER any-object-1"));
        assertTrue(result.contains("Resource resource-b"));

        verify(userProvisioningManager).provision(
                eq("user-1"),
                eq(true),
                isNull(),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull());
        verify(anyObjectProvisioningManager).provision(
                eq("any-object-1"),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull());
    }

    @Test
    void tc04DoExecuteShouldDeprovisionUsersAndAnyObjects() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.DEPROVISION);

        User user = mock(User.class);
        when(user.getKey()).thenReturn("user-2");

        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn("DEVICE");

        AnyObject anyObject = mock(AnyObject.class);
        when(anyObject.getKey()).thenReturn("any-object-2");
        when(anyObject.getType()).thenReturn(anyType);

        whenUserCountIs(1L);
        whenAnyObjectCountIs(1L);

        doReturn(List.of(user)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doReturn(List.of(anyObject)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        when(userProvisioningManager.deprovision(
                eq("user-2"),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull())).
                thenReturn(List.of(status("resource-a", ExecStatus.SUCCESS, null)));

        when(anyObjectProvisioningManager.deprovision(
                eq("any-object-2"),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull())).
                thenReturn(List.of(status("resource-b", ExecStatus.SUCCESS, null)));

        String result = delegate.run(context);

        assertTrue(result.contains("Group engineering members deprovision"));
        assertTrue(result.contains("User user-2"));
        assertTrue(result.contains("DEVICE any-object-2"));
        assertTrue(result.contains("SUCCESS"));

        verify(userProvisioningManager).deprovision(
                eq("user-2"),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull());
        verify(anyObjectProvisioningManager).deprovision(
                eq("any-object-2"),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull());
    }

    @Test
    void tc05DoExecuteShouldRenderFailureReasonsWhenPresent() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        User user = mock(User.class);
        when(user.getKey()).thenReturn("user-failure");

        whenUserCountIs(1L);
        whenAnyObjectCountIs(0L);

        doReturn(List.of(user)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doReturn(List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        when(userProvisioningManager.provision(
                eq("user-failure"),
                eq(true),
                isNull(),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull())).
                thenReturn(List.of(status(
                        "resource-a",
                        ExecStatus.FAILURE,
                        "Remote connector failure")));

        String result = delegate.run(context);

        assertTrue(result.contains("User user-failure"));
        assertTrue(result.contains("Resource resource-a"));
        assertTrue(result.contains("FAILURE"));
        assertTrue(result.contains("Remote connector failure"));
    }

    @Test
    void tc06DoExecuteShouldHandleEmptySearchResults() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        whenUserCountIs(0L);
        whenAnyObjectCountIs(0L);

        doReturn(List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doReturn(List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        String result = delegate.run(context);

        assertTrue(result.contains("Group engineering members provision"));

        verify(userProvisioningManager, never()).provision(
                anyString(),
                anyBoolean(),
                any(),
                anyCollection(),
                anyBoolean(),
                any());
        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                anyBoolean(),
                any());
    }

    @Test
    void tc07DoExecuteShouldProcessTwoPagesWhenCountIsExactPageSizeMultiple() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        whenUserCountIs((long) AnyDAO.DEFAULT_PAGE_SIZE);
        whenAnyObjectCountIs(0L);

        doReturn(List.of(), List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doReturn(List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        String result = delegate.run(context);

        assertTrue(result.contains("Group engineering members provision"));

        verify(anySearchDAO, org.mockito.Mockito.times(2)).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));
    }

    @Test
    void tc08DoExecuteShouldStopBeforeSearchingMembersWhenStopWasAlreadyRequested() {
        stubCommonGroup();
        delegate.stop();

        whenUserCountIs(1L);

        String result = delegate.run(context);

        assertTrue(result.contains("Stop was requested"));

        verify(anySearchDAO, never()).search(
                any(Realm.class),
                anyBoolean(),
                any(),
                any(SearchCond.class),
                any(Pageable.class),
                any(AnyTypeKind.class));
        verify(userProvisioningManager, never()).provision(
                anyString(),
                anyBoolean(),
                any(),
                anyCollection(),
                anyBoolean(),
                any());
        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                anyBoolean(),
                any());
    }

    @Test
    void tc09DoExecuteShouldStopDuringUserProcessingAndSkipAnyObjectPhase() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        User user = mock(User.class);
        when(user.getKey()).thenReturn("user-stop");

        whenUserCountIs(1L);

        doReturn(List.of(user)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doAnswer(invocation -> {
            delegate.stop();
            return List.of(status("resource-a", ExecStatus.SUCCESS, null));
        }).when(userProvisioningManager).provision(
                eq("user-stop"),
                eq(true),
                isNull(),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull());

        String result = delegate.run(context);

        assertTrue(result.contains("User user-stop"));
        assertTrue(result.contains("Stop was requested"));

        verify(anySearchDAO, never()).count(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));
    }

    @Test
    void tc10DoExecuteShouldPropagateGroupLookupFailures() {
        when(groupDAO.authFind(GROUP_KEY)).thenThrow(new IllegalStateException("Group not found"));

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> delegate.run(context));

        assertEquals("Group not found", exception.getMessage());
    }

    @Test
    void tc11DoExecuteShouldPropagateProvisioningManagerFailures() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        User user = mock(User.class);
        when(user.getKey()).thenReturn("user-exception");

        whenUserCountIs(1L);

        doReturn(List.of(user)).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        when(userProvisioningManager.provision(
                eq("user-exception"),
                eq(true),
                isNull(),
                eq(RESOURCE_KEYS),
                eq(false),
                isNull())).
                thenThrow(new IllegalStateException("Provisioning failed"));

        IllegalStateException exception = assertThrows(
                IllegalStateException.class,
                () -> delegate.run(context));

        assertEquals("Provisioning failed", exception.getMessage());
    }

    @Test
    void tc12HasToBeRegisteredShouldAlwaysReturnTrue() {
        TaskExec<?> execution = mock(TaskExec.class);

        assertTrue(delegate.callHasToBeRegistered(execution));
        assertTrue(delegate.callHasToBeRegistered(null));
    }

    @Test
    void tc13DoExecuteShouldStoreHumanReadableStatuses() {
        stubCommonGroup();
        setField(delegate, "action", ProvisionAction.PROVISION);

        whenUserCountIs(0L);
        whenAnyObjectCountIs(0L);

        doReturn(List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        doReturn(List.of()).when(anySearchDAO).search(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        delegate.run(context);

        assertTrue(delegate.statuses.stream().anyMatch(status -> status.contains("Group engineering members provision")));
        assertTrue(delegate.statuses.stream().anyMatch(status -> status.contains("About to provision 0 users")));
        assertTrue(delegate.statuses.stream().anyMatch(status -> status.contains("About to provision 0 any objects")));
    }

    private void stubCommonGroup() {
        when(realmDAO.getRoot()).thenReturn(realm);
        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn("engineering");
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(RESOURCE_KEYS);
    }

    private void whenUserCountIs(final long count) {
        when(anySearchDAO.count(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.USER))).
                thenReturn(count);
    }

    private void whenAnyObjectCountIs(final long count) {
        when(anySearchDAO.count(
                eq(realm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(count);
    }

    private static PropagationStatus status(
            final String resource,
            final ExecStatus execStatus,
            final String failureReason) {

        PropagationStatus status = new PropagationStatus();
        status.setResource(resource);
        status.setStatus(execStatus);
        status.setFailureReason(failureReason);
        return status;
    }

    private static void setField(final Object target, final String fieldName, final Object value) {
        try {
            Field field = findField(target.getClass(), fieldName);
            field.setAccessible(true);
            field.set(target, value);
        } catch (ReflectiveOperationException e) {
            throw new AssertionError("Could not set field " + fieldName, e);
        }
    }

    private static Object getField(final Object target, final String fieldName) {
        try {
            Field field = findField(target.getClass(), fieldName);
            field.setAccessible(true);
            return field.get(target);
        } catch (ReflectiveOperationException e) {
            throw new AssertionError("Could not read field " + fieldName, e);
        }
    }

    private static Field findField(final Class<?> startClass, final String fieldName) throws NoSuchFieldException {
        Class<?> current = startClass;
        while (current != null) {
            try {
                return current.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                current = current.getSuperclass();
            }
        }

        throw new NoSuchFieldException(fieldName);
    }

    private static final class TestableGroupMemberProvisionTaskJobDelegate
            extends GroupMemberProvisionTaskJobDelegate {

        private final List<String> statuses = new ArrayList<>();

        private String run(final JobExecutionContext context) {
            return super.doExecute(context);
        }

        private boolean callHasToBeRegistered(final TaskExec<?> execution) {
            return super.hasToBeRegistered(execution);
        }

        @Override
        protected void setStatus(final String status) {
            statuses.add(status);
        }
    }
}
//###Test END##

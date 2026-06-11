//###Test START##
/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0.
 */
package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.apache.syncope.core.provisioning.api.job.JobExecutionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Pageable;

/**
 * Tests for {@link GroupMemberProvisionTaskJobDelegate4}.
 */
@ExtendWith(MockitoExtension.class)
class GroupMemberProvisionTaskJobDelegate4LLMTest {

    private static final String GROUP_KEY = "group-key";

    private static final String GROUP_NAME = "testGroup";

    private static final String USER_KEY = "user-key";

    private static final String ANY_OBJECT_KEY = "any-object-key";

    private static final String ANY_OBJECT_TYPE = "PRINTER";

    private static final String RESOURCE_ONE = "resource-one";

    private static final String RESOURCE_TWO = "resource-two";

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
    private Realm rootRealm;

    @Mock
    private Group group;

    @Mock
    private User user;

    @Mock
    private AnyObject anyObject;

    @Mock
    private AnyType anyType;

    @Mock
    private JobExecutionContext context;

    private TestableGroupMemberProvisionTaskJobDelegate4 delegate;

    private Set<String> groupResources;

    @BeforeEach
    void setup() throws Exception {
        delegate = spy(new TestableGroupMemberProvisionTaskJobDelegate4());

        inject(delegate, "realmDAO", realmDAO);
        inject(delegate, "groupDAO", groupDAO);
        inject(delegate, "anySearchDAO", anySearchDAO);
        inject(delegate, "userProvisioningManager", userProvisioningManager);
        inject(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        groupResources = Set.of(RESOURCE_ONE, RESOURCE_TWO);

        lenient().when(realmDAO.getRoot()).thenReturn(rootRealm);
        lenient().when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        lenient().when(group.getName()).thenReturn(GROUP_NAME);
        lenient().when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(groupResources);

        lenient().when(user.getKey()).thenReturn(USER_KEY);

        lenient().when(anyObject.getKey()).thenReturn(ANY_OBJECT_KEY);
        lenient().when(anyObject.getType()).thenReturn(anyType);
        lenient().when(anyType.getKey()).thenReturn(ANY_OBJECT_TYPE);
    }

    @Test
    void tc01DoExecuteShouldProvisionUsersAndAnyObjectsSuccessfully() throws Exception {
        // TC01: provision action processes users and any objects, appending successful statuses.
        prepareExecution(ProvisionAction.PROVISION);

        PropagationStatus userStatus = propagationStatus(RESOURCE_ONE, ExecStatus.SUCCESS, null);
        PropagationStatus anyObjectStatus = propagationStatus(RESOURCE_TWO, ExecStatus.SUCCESS, null);

        stubUserCount(1L);
        stubAnyObjectCount(1L);
        stubUserSearch(List.of(user));
        stubAnyObjectSearch(List.of(anyObject));

        when(userProvisioningManager.provision(eq(USER_KEY), eq(true), isNull(), eq(groupResources), eq(false), any())).
                thenReturn(List.of(userStatus));
        when(anyObjectProvisioningManager.provision(eq(ANY_OBJECT_KEY), eq(groupResources), eq(false), any())).
                thenReturn(List.of(anyObjectStatus));

        String result = delegate.callDoExecute(context);

        assertTrue(result.startsWith("Group " + GROUP_NAME + " members provision"));
        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_ONE + "\tSUCCESS"));
        assertTrue(result.contains(ANY_OBJECT_TYPE + " " + ANY_OBJECT_KEY + "\tResource " + RESOURCE_TWO + "\tSUCCESS"));

        verify(userProvisioningManager).provision(eq(USER_KEY), eq(true), isNull(), eq(groupResources), eq(false), any());
        verify(userProvisioningManager, never()).deprovision(any(), anyCollection(), anyBoolean(), any());
        verify(anyObjectProvisioningManager).provision(eq(ANY_OBJECT_KEY), eq(groupResources), eq(false), any());
        verify(anyObjectProvisioningManager, never()).deprovision(any(), anyCollection(), anyBoolean(), any());
    }

    @Test
    void tc02DoExecuteShouldDeprovisionUsersAndAnyObjectsSuccessfully() throws Exception {
        // TC02: deprovision action uses deprovision managers and the expected heading.
        prepareExecution(ProvisionAction.DEPROVISION);

        PropagationStatus userStatus = propagationStatus(RESOURCE_ONE, ExecStatus.SUCCESS, null);
        PropagationStatus anyObjectStatus = propagationStatus(RESOURCE_TWO, ExecStatus.SUCCESS, null);

        stubUserCount(1L);
        stubAnyObjectCount(1L);
        stubUserSearch(List.of(user));
        stubAnyObjectSearch(List.of(anyObject));

        when(userProvisioningManager.deprovision(eq(USER_KEY), eq(groupResources), eq(false), any())).
                thenReturn(List.of(userStatus));
        when(anyObjectProvisioningManager.deprovision(eq(ANY_OBJECT_KEY), eq(groupResources), eq(false), any())).
                thenReturn(List.of(anyObjectStatus));

        String result = delegate.callDoExecute(context);

        assertTrue(result.startsWith("Group " + GROUP_NAME + " members deprovision"));
        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_ONE + "\tSUCCESS"));
        assertTrue(result.contains(ANY_OBJECT_TYPE + " " + ANY_OBJECT_KEY + "\tResource " + RESOURCE_TWO + "\tSUCCESS"));

        verify(userProvisioningManager).deprovision(eq(USER_KEY), eq(groupResources), eq(false), any());
        verify(userProvisioningManager, never()).provision(any(), anyBoolean(), any(), anyCollection(), anyBoolean(), any());
        verify(anyObjectProvisioningManager).deprovision(eq(ANY_OBJECT_KEY), eq(groupResources), eq(false), any());
        verify(anyObjectProvisioningManager, never()).provision(any(), anyCollection(), anyBoolean(), any());
    }

    @Test
    void tc03DoExecuteShouldAppendFailureReasonWhenStatusHasNonBlankReason() throws Exception {
        // TC03: failure reasons are appended only when non-blank.
        prepareExecution(ProvisionAction.PROVISION);

        PropagationStatus userFailure = propagationStatus(
                RESOURCE_ONE,
                ExecStatus.FAILURE,
                "Connection refused");
        PropagationStatus anyObjectFailure = propagationStatus(
                RESOURCE_TWO,
                ExecStatus.FAILURE,
                "Timeout while contacting resource");

        stubUserCount(1L);
        stubAnyObjectCount(1L);
        stubUserSearch(List.of(user));
        stubAnyObjectSearch(List.of(anyObject));

        when(userProvisioningManager.provision(eq(USER_KEY), eq(true), isNull(), eq(groupResources), eq(false), any())).
                thenReturn(List.of(userFailure));
        when(anyObjectProvisioningManager.provision(eq(ANY_OBJECT_KEY), eq(groupResources), eq(false), any())).
                thenReturn(List.of(anyObjectFailure));

        String result = delegate.callDoExecute(context);

        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_ONE + "\tFAILURE\n"
                + "Connection refused\n"));
        assertTrue(result.contains(ANY_OBJECT_TYPE + " " + ANY_OBJECT_KEY + "\tResource " + RESOURCE_TWO + "\tFAILURE\n"
                + "Timeout while contacting resource\n"));
    }

    @Test
    void tc04DoExecuteShouldNotAppendBlankFailureReason() throws Exception {
        // TC04: blank failure reasons are ignored.
        prepareExecution(ProvisionAction.PROVISION);

        PropagationStatus userFailure = propagationStatus(RESOURCE_ONE, ExecStatus.FAILURE, "   ");

        stubUserCount(1L);
        stubAnyObjectCount(0L);
        stubUserSearch(List.of(user));
        stubAnyObjectSearch(List.of());

        when(userProvisioningManager.provision(eq(USER_KEY), eq(true), isNull(), eq(groupResources), eq(false), any())).
                thenReturn(List.of(userFailure));

        String result = delegate.callDoExecute(context);

        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_ONE + "\tFAILURE\n\n"));
        assertTrue(!result.contains("\n   \n"));
    }

    @Test
    void tc05DoExecuteShouldStopBeforeProcessingAnyObjectsWhenStopRequested() throws Exception {
        // TC05: stop requested before execution skips page processing and appends the stop message.
        prepareExecution(ProvisionAction.PROVISION);
        delegate.stop();

        stubUserCount(1L);

        String result = delegate.callDoExecute(context);

        assertTrue(result.contains("Stop was requested"));
        verify(anySearchDAO, never()).search(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class),
                any(Pageable.class), eq(AnyTypeKind.USER));
        verify(anySearchDAO, never()).count(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));
        verify(userProvisioningManager, never()).provision(any(), anyBoolean(), any(), anyCollection(), anyBoolean(), any());
        verify(anyObjectProvisioningManager, never()).provision(any(), anyCollection(), anyBoolean(), any());
    }

    @Test
    void tc06DoExecuteShouldStopAfterUserProcessingWhenStopIsRequestedByUserProvisioning() throws Exception {
        // TC06: if stop is requested during user processing, any-object processing is not started.
        prepareExecution(ProvisionAction.PROVISION);

        PropagationStatus userStatus = propagationStatus(RESOURCE_ONE, ExecStatus.SUCCESS, null);

        stubUserCount(1L);
        stubUserSearch(List.of(user));

        when(userProvisioningManager.provision(eq(USER_KEY), eq(true), isNull(), eq(groupResources), eq(false), any())).
                thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(userStatus);
                });

        String result = delegate.callDoExecute(context);

        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_ONE + "\tSUCCESS"));
        assertTrue(result.contains("Stop was requested"));
        verify(anySearchDAO, never()).count(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));
        verify(anyObjectProvisioningManager, never()).provision(any(), anyCollection(), anyBoolean(), any());
    }

    @Test
    void tc07DoExecuteShouldUsePaginationForUsersAndAnyObjects() throws Exception {
        // TC07: pages are computed as count / DEFAULT_PAGE_SIZE + 1.
        prepareExecution(ProvisionAction.PROVISION);

        long countRequiringTwoPages = AnyDAO.DEFAULT_PAGE_SIZE;

        stubUserCount(countRequiringTwoPages);
        stubAnyObjectCount(countRequiringTwoPages);
        stubUserSearch(List.of());
        stubAnyObjectSearch(List.of());

        String result = delegate.callDoExecute(context);

        assertNotNull(result);

        ArgumentCaptor<Pageable> userPageCaptor = ArgumentCaptor.forClass(Pageable.class);
        verify(anySearchDAO, times(2)).search(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class),
                userPageCaptor.capture(), eq(AnyTypeKind.USER));

        assertEquals(0, userPageCaptor.getAllValues().get(0).getPageNumber());
        assertEquals(1, userPageCaptor.getAllValues().get(1).getPageNumber());
        assertEquals(AnyDAO.DEFAULT_PAGE_SIZE, userPageCaptor.getAllValues().get(0).getPageSize());

        ArgumentCaptor<Pageable> anyObjectPageCaptor = ArgumentCaptor.forClass(Pageable.class);
        verify(anySearchDAO, times(2)).search(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class),
                anyObjectPageCaptor.capture(), eq(AnyTypeKind.ANY_OBJECT));

        assertEquals(0, anyObjectPageCaptor.getAllValues().get(0).getPageNumber());
        assertEquals(1, anyObjectPageCaptor.getAllValues().get(1).getPageNumber());
        assertEquals(AnyDAO.DEFAULT_PAGE_SIZE, anyObjectPageCaptor.getAllValues().get(0).getPageSize());
    }

    @Test
    void tc08DoExecuteShouldHandleMultipleStatusesForSameUserAndAnyObject() throws Exception {
        // TC08: all returned propagation statuses are appended in order.
        prepareExecution(ProvisionAction.PROVISION);

        PropagationStatus userStatusOne = propagationStatus(RESOURCE_ONE, ExecStatus.SUCCESS, null);
        PropagationStatus userStatusTwo = propagationStatus(RESOURCE_TWO, ExecStatus.FAILURE, "Denied");
        PropagationStatus anyObjectStatusOne = propagationStatus(RESOURCE_ONE, ExecStatus.SUCCESS, null);
        PropagationStatus anyObjectStatusTwo = propagationStatus(RESOURCE_TWO, ExecStatus.SUCCESS, null);

        stubUserCount(1L);
        stubAnyObjectCount(1L);
        stubUserSearch(List.of(user));
        stubAnyObjectSearch(List.of(anyObject));

        when(userProvisioningManager.provision(eq(USER_KEY), eq(true), isNull(), eq(groupResources), eq(false), any())).
                thenReturn(List.of(userStatusOne, userStatusTwo));
        when(anyObjectProvisioningManager.provision(eq(ANY_OBJECT_KEY), eq(groupResources), eq(false), any())).
                thenReturn(List.of(anyObjectStatusOne, anyObjectStatusTwo));

        String result = delegate.callDoExecute(context);

        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_ONE + "\tSUCCESS"));
        assertTrue(result.contains("User " + USER_KEY + "\tResource " + RESOURCE_TWO + "\tFAILURE\nDenied\n"));
        assertTrue(result.contains(ANY_OBJECT_TYPE + " " + ANY_OBJECT_KEY + "\tResource " + RESOURCE_ONE + "\tSUCCESS"));
        assertTrue(result.contains(ANY_OBJECT_TYPE + " " + ANY_OBJECT_KEY + "\tResource " + RESOURCE_TWO + "\tSUCCESS"));
    }

    @Test
    void tc09ExecuteShouldReadJobDataAndDelegateToSuperExecution() throws Exception {
        // TC09: execute reads the group key and action from the job data map before calling the superclass.
        Map<String, Object> data = Map.of(
                GroupMemberProvisionTaskJobDelegate4.GROUP_KEY_JOBDETAIL_KEY, GROUP_KEY,
                GroupMemberProvisionTaskJobDelegate4.ACTION_JOBDETAIL_KEY, ProvisionAction.PROVISION);

        when(context.getData()).thenReturn(data);

        try {
            delegate.execute(TaskType.SCHEDULED, "task-key", context);
        } catch (JobExecutionException | RuntimeException e) {
            // The superclass execution path depends on Syncope scheduling infrastructure.
            // For this unit test, only the field assignment performed by this class is relevant.
        }

        assertEquals(GROUP_KEY, getPrivate(delegate, "groupKey"));
        assertEquals(ProvisionAction.PROVISION, getPrivate(delegate, "action"));
    }

    @Test
    void tc10HasToBeRegisteredShouldAlwaysReturnTrue() {
        // TC10: execution results are always registered, regardless of the execution argument.
        assertTrue(delegate.callHasToBeRegistered(null));
    }

    @Test
    void tc11DoExecuteShouldSetExpectedProgressStatuses() throws Exception {
        // TC11: observable calls to setStatus describe initial, user, and any-object phases.
        prepareExecution(ProvisionAction.DEPROVISION);

        stubUserCount(0L);
        stubAnyObjectCount(0L);
        stubUserSearch(List.of());
        stubAnyObjectSearch(List.of());

        String result = delegate.callDoExecute(context);

        assertTrue(result.startsWith("Group " + GROUP_NAME + " members deprovision"));

        assertTrue(delegate.statuses.contains("Group " + GROUP_NAME + " members deprovision\n\n"));
        assertTrue(delegate.statuses.contains("About to deprovision 0 users from " + groupResources));
        assertTrue(delegate.statuses.contains("Processing 0 users: page 0 of 1"));
        assertTrue(delegate.statuses.contains("About to deprovision 0 any objects from " + groupResources));
        assertTrue(delegate.statuses.contains("Processing 0 anyObjects: page 0 of 1"));
    }

    private void prepareExecution(final ProvisionAction action) throws Exception {
        setPrivate(delegate, "groupKey", GROUP_KEY);
        setPrivate(delegate, "action", action);
    }

    private void stubUserCount(final long count) {
        when(anySearchDAO.count(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class), eq(AnyTypeKind.USER))).
                thenReturn(count);
    }

    private void stubAnyObjectCount(final long count) {
        when(anySearchDAO.count(any(Realm.class), anyBoolean(), anySet(), any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT))).thenReturn(count);
    }

    private void stubUserSearch(final List<User> users) {
        doReturn(users).when(anySearchDAO).search(
                any(Realm.class),
                anyBoolean(),
                anySet(),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));
    }

    private void stubAnyObjectSearch(final List<AnyObject> anyObjects) {
        doReturn(anyObjects).when(anySearchDAO).search(
                any(Realm.class),
                anyBoolean(),
                anySet(),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));
    }

    private static PropagationStatus propagationStatus(
            final String resource,
            final ExecStatus status,
            final String failureReason) {

        PropagationStatus propagationStatus = new PropagationStatus();
        propagationStatus.setResource(resource);
        propagationStatus.setStatus(status);
        propagationStatus.setFailureReason(failureReason);
        return propagationStatus;
    }

    private static void inject(final Object target, final String fieldName, final Object value) throws Exception {
        setPrivate(target, fieldName, value);
    }

    private static void setPrivate(final Object target, final String fieldName, final Object value) throws Exception {
        Field field = findField(target.getClass(), fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    private static Object getPrivate(final Object target, final String fieldName) throws Exception {
        Field field = findField(target.getClass(), fieldName);
        field.setAccessible(true);
        return field.get(target);
    }

    private static Field findField(final Class<?> sourceClass, final String fieldName) throws NoSuchFieldException {
        Class<?> current = sourceClass;
        while (current != null) {
            try {
                return current.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                current = current.getSuperclass();
            }
        }

        throw new NoSuchFieldException(fieldName);
    }

    private static class TestableGroupMemberProvisionTaskJobDelegate4 extends GroupMemberProvisionTaskJobDelegate4 {

        private final List<String> statuses = new ArrayList<>();

        String callDoExecute(final JobExecutionContext context) {
            return doExecute(context);
        }

        boolean callHasToBeRegistered(final TaskExec<?> execution) {
            return hasToBeRegistered(execution);
        }

        @Override
        public void setStatus(final String status) {
            // Do not call super.setStatus(status): AbstractSchedTaskJobDelegate expects an initialized task.
            statuses.add(status);
        }
    }
}
//###Test END##
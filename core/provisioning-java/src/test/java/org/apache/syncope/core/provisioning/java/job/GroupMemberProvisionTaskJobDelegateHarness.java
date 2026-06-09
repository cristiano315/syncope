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

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager;
import org.apache.syncope.core.provisioning.api.UserProvisioningManager;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.mockito.stubbing.Answer;
import org.springframework.data.domain.PageRequest;

public class GroupMemberProvisionTaskJobDelegateHarness {

    private static final String GROUP_KEY = "group-1";

    private static final String GROUP_NAME = "randoopGroup";

    private static final Collection<String> DEFAULT_RESOURCES = List.of("resource-1", "resource-2");

    private static class TestableDelegate extends GroupMemberProvisionTaskJobDelegate {

        private final List<String> statuses = new ArrayList<>();

        String invokeDoExecute() {
            return super.doExecute(mock(JobExecutionContext.class));
        }

        /*
         * This is the key point for Randoop.
         * In production, setStatus is managed by the job infrastructure.
         * In this harness, we just record the status messages to avoid NPEs.
         */
        @Override
        protected void setStatus(final String status) {
            statuses.add(status);
        }

        List<String> getStatuses() {
            return statuses;
        }
    }

    public String provisionEmptyGroup() {
        return runScenario(false, false, false, false, false, false);
    }

    public String deprovisionEmptyGroup() {
        return runScenario(true, false, false, false, false, false);
    }

    public String provisionOneUser() {
        return runScenario(false, true, false, false, false, false);
    }

    public String deprovisionOneUser() {
        return runScenario(true, true, false, false, false, false);
    }

    public String provisionOneAnyObject() {
        return runScenario(false, false, true, false, false, false);
    }

    public String deprovisionOneAnyObject() {
        return runScenario(true, false, true, false, false, false);
    }

    public String provisionUserAndAnyObject() {
        return runScenario(false, true, true, false, false, false);
    }

    public String deprovisionUserAndAnyObject() {
        return runScenario(true, true, true, false, false, false);
    }

    public String provisionOneUserWithFailureReason() {
        return runScenario(false, true, false, true, false, false);
    }

    public String deprovisionOneUserWithFailureReason() {
        return runScenario(true, true, false, true, false, false);
    }

    public String provisionOneAnyObjectWithFailureReason() {
        return runScenario(false, false, true, true, false, false);
    }

    public String deprovisionOneAnyObjectWithFailureReason() {
        return runScenario(true, false, true, true, false, false);
    }

    public String stopBeforeProcessing() {
        return runScenario(false, true, true, false, true, false);
    }

    public String provisionWithEmptyResources() {
        return runScenario(false, true, true, false, false, true);
    }

    public String deprovisionWithEmptyResources() {
        return runScenario(true, true, true, false, false, true);
    }

    /*
     * Parametric entry point for Randoop.
     * Booleans are intentionally used because Randoop can combine them safely.
     */
    public String runScenario(
            final boolean deprovision,
            final boolean withUser,
            final boolean withAnyObject,
            final boolean withFailureReason,
            final boolean stopBeforeExecution,
            final boolean emptyResources) {

        ProvisionAction action = deprovision
                ? ProvisionAction.DEPROVISION
                : ProvisionAction.PROVISION;

        List<User> users = withUser
                ? List.of(mockUser("user-1"))
                : List.of();

        List<AnyObject> anyObjects = withAnyObject
                ? List.of(mockAnyObject("PRINTER", "printer-1"))
                : List.of();

        Collection<String> resources = emptyResources
                ? List.of()
                : DEFAULT_RESOURCES;

        TestableDelegate delegate = newDelegate(action, users, anyObjects, resources, withFailureReason);

        if (stopBeforeExecution) {
            delegate.stop();
        }

        String result = delegate.invokeDoExecute();

        if (result == null) {
            throw new AssertionError("Harness produced a null result");
        }

        return result;
    }

    /*
     * Extra deterministic methods useful for Randoop and for quick manual checks.
     */
    public boolean resultContainsGroupHeader() {
        return provisionEmptyGroup().contains("Group " + GROUP_NAME + " members provision");
    }

    public boolean resultContainsDeprovisionHeader() {
        return deprovisionEmptyGroup().contains("members deprovision");
    }

    public boolean resultContainsUserKey() {
        return provisionOneUser().contains("User user-1");
    }

    public boolean resultContainsAnyObjectKey() {
        return provisionOneAnyObject().contains("PRINTER printer-1");
    }

    public boolean resultContainsFailureReason() {
        return provisionOneUserWithFailureReason().contains("simulated failure reason");
    }

    public boolean resultContainsStopMessage() {
        return stopBeforeProcessing().contains("Stop was requested");
    }

    private static TestableDelegate newDelegate(
            final ProvisionAction action,
            final List<User> users,
            final List<AnyObject> anyObjects,
            final Collection<String> resources,
            final boolean withFailureReason) {

        TestableDelegate delegate = new TestableDelegate();

        RealmDAO realmDAO = mock(RealmDAO.class);
        GroupDAO groupDAO = mock(GroupDAO.class);
        AnySearchDAO anySearchDAO = mock(AnySearchDAO.class);
        UserProvisioningManager userProvisioningManager = mock(UserProvisioningManager.class);
        AnyObjectProvisioningManager anyObjectProvisioningManager = mock(AnyObjectProvisioningManager.class);

        Realm root = mock(Realm.class);
        when(realmDAO.getRoot()).thenReturn(root);

        Group group = mock(Group.class);
        when(group.getName()).thenReturn(GROUP_NAME);
        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(resources);

        when(anySearchDAO.count(
                any(),
                eq(true),
                any(),
                any(SearchCond.class),
                eq(AnyTypeKind.USER))).
                thenReturn((long) users.size());

        when(anySearchDAO.count(
                any(),
                eq(true),
                any(),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn((long) anyObjects.size());

        /*
         * Important: the production code always executes at least one page because:
         *
         * pages = (count / AnyDAO.DEFAULT_PAGE_SIZE) + 1
         *
         * So even with count = 0, search() is called once.
         */
        when(anySearchDAO.search(
                any(),
                eq(true),
                any(),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.USER))).
                thenAnswer(pageAwareAnswer(users));

        when(anySearchDAO.search(
                any(),
                eq(true),
                any(),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenAnswer(pageAwareAnswer(anyObjects));

        PropagationStatus okStatus = propagationStatus("resource-1", null);
        PropagationStatus failureStatus = propagationStatus(
                "resource-2",
                withFailureReason ? "simulated failure reason" : null);

        List<PropagationStatus> statuses = withFailureReason
                ? List.of(okStatus, failureStatus)
                : List.of(okStatus);

        when(userProvisioningManager.provision(
                any(),
                eq(true),
                any(),
                any(),
                eq(false),
                any())).
                thenReturn(statuses);

        when(userProvisioningManager.deprovision(
                any(),
                any(),
                eq(false),
                any())).
                thenReturn(statuses);

        when(anyObjectProvisioningManager.provision(
                any(),
                any(),
                eq(false),
                any())).
                thenReturn(statuses);

        when(anyObjectProvisioningManager.deprovision(
                any(),
                any(),
                eq(false),
                any())).
                thenReturn(statuses);

        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", action);
        setField(delegate, "stopRequested", false);

        return delegate;
    }

    private static User mockUser(final String key) {
        User user = mock(User.class);
        when(user.getKey()).thenReturn(key);
        return user;
    }

    private static AnyObject mockAnyObject(final String typeKey, final String key) {
        AnyType type = mock(AnyType.class);
        when(type.getKey()).thenReturn(typeKey);

        AnyObject anyObject = mock(AnyObject.class);
        when(anyObject.getKey()).thenReturn(key);
        when(anyObject.getType()).thenReturn(type);

        return anyObject;
    }

    private static PropagationStatus propagationStatus(
            final String resource,
            final String failureReason) {

        PropagationStatus status = mock(PropagationStatus.class);
        when(status.getResource()).thenReturn(resource);
        when(status.getFailureReason()).thenReturn(failureReason);

        /*
         * Avoid importing a specific status enum from Syncope.
         * StringBuilder.append(Object) accepts null safely.
         */
        when(status.getStatus()).thenReturn(null);

        return status;
    }

    private static <T> Answer<List<T>> pageAwareAnswer(final List<T> values) {
        return invocation -> {
            PageRequest pageRequest = invocation.getArgument(4);

            int page = pageRequest.getPageNumber();
            int pageSize = pageRequest.getPageSize();

            int fromIndex = page * pageSize;
            if (fromIndex >= values.size()) {
                return List.of();
            }

            int toIndex = Math.min(fromIndex + pageSize, values.size());
            return values.subList(fromIndex, toIndex);
        };
    }

    private static void setField(
            final Object target,
            final String fieldName,
            final Object value) {

        Class<?> current = target.getClass();

        while (current != null) {
            try {
                Field field = current.getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(target, value);
                return;
            } catch (NoSuchFieldException e) {
                current = current.getSuperclass();
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Cannot set field " + fieldName, e);
            }
        }

        throw new IllegalArgumentException("Field not found: " + fieldName);
    }
}
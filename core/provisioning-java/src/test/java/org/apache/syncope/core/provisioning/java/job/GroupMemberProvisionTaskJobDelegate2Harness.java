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

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.MembershipCond;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.entity.task.TaskExec;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager;
import org.apache.syncope.core.provisioning.api.UserProvisioningManager;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.springframework.data.domain.Sort;

/**
 * Randoop harness for {@link GroupMemberProvisionTaskJobDelegate2}.
 *
 * <p>The production delegate is a Spring-managed job. This harness keeps the
 * generated tests independent from Spring and persistence infrastructure by
 * exposing deterministic wrapper methods and by converting expected wiring
 * failures into strings.</p>
 */
public final class GroupMemberProvisionTaskJobDelegate2Harness {

    private GroupMemberProvisionTaskJobDelegate2Harness() {
        // Utility class for Randoop: do not instantiate.
    }

    public static GroupMemberProvisionTaskJobDelegate2 newDelegate() {
        return new GroupMemberProvisionTaskJobDelegate2();
    }

    public static String actionJobDetailKey() {
        return GroupMemberProvisionTaskJobDelegate2.ACTION_JOBDETAIL_KEY;
    }

    public static String groupKeyJobDetailKey() {
        return GroupMemberProvisionTaskJobDelegate2.GROUP_KEY_JOBDETAIL_KEY;
    }

    public static boolean stopSetsStopRequested() {
        GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
        delegate.stop();
        return Boolean.TRUE.equals(readField(delegate, "stopRequested"));
    }

    public static String setAndGetGroupKey(final String groupKey) {
        GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
        setField(delegate, "groupKey", groupKey);
        return String.valueOf(readField(delegate, "groupKey"));
    }

    public static String setAndGetAction(final ProvisionAction action) {
        GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
        setField(delegate, "action", action);
        return String.valueOf(readField(delegate, "action"));
    }

    public static String setDependencies(
            final RealmDAO realmDAO,
            final GroupDAO groupDAO,
            final AnySearchDAO anySearchDAO,
            final UserProvisioningManager userProvisioningManager,
            final AnyObjectProvisioningManager anyObjectProvisioningManager) {

        try {
            GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
            setField(delegate, "realmDAO", realmDAO);
            setField(delegate, "groupDAO", groupDAO);
            setField(delegate, "anySearchDAO", anySearchDAO);
            setField(delegate, "userProvisioningManager", userProvisioningManager);
            setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);
            return "OK";
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeExecute(
            final TaskType taskType,
            final String taskKey,
            final JobExecutionContext context) {

        try {
            newDelegate().execute(taskType, taskKey, context);
            return "OK";
        } catch (Exception e) {
            return failure(e);
        }
    }

    public static String safeDoExecute(final JobExecutionContext context) {
        try {
            return String.valueOf(newDelegate().doExecute(context));
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeDoExecuteAfterStop(final JobExecutionContext context) {
        try {
            GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
            delegate.stop();
            return String.valueOf(delegate.doExecute(context));
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeInitResult(final Group group, final ProvisionAction action) {
        try {
            GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
            setField(delegate, "action", action);
            return String.valueOf(invoke(delegate, "initResult", new Class<?>[] { Group.class }, group));
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static boolean isDeprovision(final ProvisionAction action) {
        GroupMemberProvisionTaskJobDelegate2 delegate = newDelegate();
        setField(delegate, "action", action);
        return Boolean.TRUE.equals(invoke(delegate, "isDeprovision", new Class<?>[0]));
    }

    public static String safePages(final long count) {
        try {
            return String.valueOf(invoke(newDelegate(), "pages", new Class<?>[] { long.class }, count));
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeCount(final SearchCond cond, final AnyTypeKind anyTypeKind) {
        try {
            return String.valueOf(invoke(
                    newDelegate(),
                    "count",
                    new Class<?>[] { SearchCond.class, AnyTypeKind.class },
                    cond,
                    anyTypeKind));
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static boolean safeHasToBeRegistered(final TaskExec<?> execution) {
        try {
            return newDelegate().hasToBeRegistered(execution);
        } catch (RuntimeException e) {
            return false;
        }
    }

    public static String appendPropagationStatus(final String prefix, final PropagationStatus status) {
        try {
            StringBuilder result = new StringBuilder(prefix == null ? "" : prefix);
            invoke(
                    newDelegate(),
                    "appendPropagationStatus",
                    new Class<?>[] { StringBuilder.class, PropagationStatus.class },
                    result,
                    status);
            return result.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String appendUserPropagationStatus(
            final String prefix,
            final User user,
            final PropagationStatus status) {

        try {
            StringBuilder result = new StringBuilder(prefix == null ? "" : prefix);
            invoke(
                    newDelegate(),
                    "appendUserPropagationStatus",
                    new Class<?>[] { StringBuilder.class, User.class, PropagationStatus.class },
                    result,
                    user,
                    status);
            return result.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String appendAnyObjectPropagationStatus(
            final String prefix,
            final AnyObject anyObject,
            final PropagationStatus status) {

        try {
            StringBuilder result = new StringBuilder(prefix == null ? "" : prefix);
            invoke(
                    newDelegate(),
                    "appendAnyObjectPropagationStatus",
                    new Class<?>[] { StringBuilder.class, AnyObject.class, PropagationStatus.class },
                    result,
                    anyObject,
                    status);
            return result.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeProcessUsers(
            final Collection<String> resourceKeys,
            final SearchCond cond,
            final Sort sort) {

        try {
            StringBuilder result = new StringBuilder();
            invoke(
                    newDelegate(),
                    "processUsers",
                    new Class<?>[] { StringBuilder.class, Collection.class, SearchCond.class, Sort.class },
                    result,
                    resourceKeys == null ? Collections.emptyList() : resourceKeys,
                    cond,
                    sort);
            return result.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static String safeProcessAnyObjects(
            final Collection<String> resourceKeys,
            final MembershipCond membershipCond,
            final SearchCond cond,
            final Sort sort) {

        try {
            StringBuilder result = new StringBuilder();
            invoke(
                    newDelegate(),
                    "processAnyObjects",
                    new Class<?>[] {
                        StringBuilder.class,
                        Collection.class,
                        MembershipCond.class,
                        SearchCond.class,
                        Sort.class
                    },
                    result,
                    resourceKeys == null ? Collections.emptyList() : resourceKeys,
                    membershipCond,
                    cond,
                    sort);
            return result.toString();
        } catch (RuntimeException e) {
            return failure(e);
        }
    }

    public static List<?> emptyListForRandoop() {
        return Collections.emptyList();
    }

    private static Object readField(final GroupMemberProvisionTaskJobDelegate2 delegate, final String fieldName) {
        try {
            Field field = GroupMemberProvisionTaskJobDelegate2.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(delegate);
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void setField(
            final GroupMemberProvisionTaskJobDelegate2 delegate,
            final String fieldName,
            final Object value) {

        try {
            Field field = GroupMemberProvisionTaskJobDelegate2.class.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(delegate, value);
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static Object invoke(
            final GroupMemberProvisionTaskJobDelegate2 delegate,
            final String methodName,
            final Class<?>[] parameterTypes,
            final Object... args) {

        try {
            Method method = GroupMemberProvisionTaskJobDelegate2.class.getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);
            return method.invoke(delegate, args);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException) cause;
            }
            if (cause instanceof Error) {
                throw (Error) cause;
            }
            throw new IllegalStateException(cause);
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String failure(final Throwable e) {
        Throwable cause = e instanceof InvocationTargetException && e.getCause() != null
                ? e.getCause()
                : e;
        return "EX:" + cause.getClass().getSimpleName()
                + (cause.getMessage() == null ? "" : ":" + cause.getMessage());
    }
}

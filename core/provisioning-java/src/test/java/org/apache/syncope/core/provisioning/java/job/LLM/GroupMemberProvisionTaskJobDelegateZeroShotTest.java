//###Test START##
package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.ExecStatus;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.entity.task.TaskExec;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager;
import org.apache.syncope.core.provisioning.api.UserProvisioningManager;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;

@ExtendWith(MockitoExtension.class)
class GroupMemberProvisionTaskJobDelegateZeroShotTest {

    private static final String GROUP_KEY = "group-key";

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

    private TestableGroupMemberProvisionTaskJobDelegate newDelegate() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = new TestableGroupMemberProvisionTaskJobDelegate();
        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);
        return delegate;
    }

    private void prepareGroup(
            final TestableGroupMemberProvisionTaskJobDelegate delegate,
            final ProvisionAction action,
            final Collection<String> resources) {

        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", action);

        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn("test-group");
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(resources);
        when(realmDAO.getRoot()).thenReturn(rootRealm);
    }

    private void stubCounts(final long userCount, final long anyObjectCount) {
        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.USER))).
                thenReturn(userCount);

        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT))).
                thenReturn(anyObjectCount);
    }

    private void stubUserCountOnly(final long userCount) {
        when(anySearchDAO.count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.USER))).
                thenReturn(userCount);
    }

    private void stubUsers(final List<User> users) {
        doReturn(users).when(anySearchDAO).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.USER));
    }

    private void stubAnyObjects(final List<AnyObject> anyObjects) {
        doReturn(anyObjects).when(anySearchDAO).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.ANY_OBJECT));
    }

    private static User user(final String key) {
        User user = mock(User.class);
        lenient().when(user.getKey()).thenReturn(key);
        return user;
    }

    private static AnyObject anyObject(final String key, final String typeKey) {
        AnyObject anyObject = mock(AnyObject.class, RETURNS_DEEP_STUBS);
        lenient().when(anyObject.getKey()).thenReturn(key);
        lenient().when(anyObject.getType().getKey()).thenReturn(typeKey);
        return anyObject;
    }

    private static PropagationStatus status(
            final String resource,
            final ExecStatus status,
            final String failureReason) {

        PropagationStatus propagationStatus = new PropagationStatus();
        propagationStatus.setResource(resource);
        propagationStatus.setStatus(status);
        propagationStatus.setFailureReason(failureReason);
        return propagationStatus;
    }

    @Test
    void tc01ExecuteCopiesJobDetailDataBeforeDelegatingToParentImplementation() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();

        Map<String, Object> data = new LinkedHashMap<>();
        data.put(GroupMemberProvisionTaskJobDelegate.GROUP_KEY_JOBDETAIL_KEY, "group-from-context");
        data.put(GroupMemberProvisionTaskJobDelegate.ACTION_JOBDETAIL_KEY, ProvisionAction.DEPROVISION);

        JobExecutionContext context = mock(JobExecutionContext.class);
        when(context.getData()).thenReturn(data);

        // The superclass requires wider job infrastructure; this test focuses on this class' execute pre-processing.
        try {
            delegate.execute(null, "task-key", context);
        } catch (Throwable ignored) {
            // Expected in an isolated unit test when the superclass infrastructure is not initialized.
        }

        assertEquals("group-from-context", getField(delegate, "groupKey"));
        assertSame(ProvisionAction.DEPROVISION, getField(delegate, "action"));
    }

    @Test
    void tc02HasToBeRegisteredAlwaysReturnsTrue() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();

        assertTrue(delegate.hasToBeRegisteredFor(null));
        assertTrue(delegate.hasToBeRegisteredFor(mock(TaskExec.class)));
    }

    @Test
    void tc03DoExecuteProvisionProcessesUsersAndAnyObjectsAndReportsFailures() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-a", "resource-b");
        prepareGroup(delegate, ProvisionAction.PROVISION, resources);

        User userOne = user("user-1");
        User userTwo = user("user-2");
        AnyObject anyObject = anyObject("printer-1", "PRINTER");

        stubCounts(2L, 1L);
        stubUsers(List.of(userOne, userTwo));
        stubAnyObjects(List.of(anyObject));

        when(userProvisioningManager.provision(
                eq("user-1"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-a", ExecStatus.SUCCESS, null)));

        when(userProvisioningManager.provision(
                eq("user-2"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-b", ExecStatus.FAILURE, "user failure")));

        when(anyObjectProvisioningManager.provision(
                eq("printer-1"),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-a", ExecStatus.SUCCESS, "")));

        String result = delegate.run(mock(JobExecutionContext.class));

        assertTrue(result.startsWith("Group test-group members provision\n\n"));
        assertTrue(result.contains("User user-1\tResource resource-a\tSUCCESS"));
        assertTrue(result.contains("User user-2\tResource resource-b\tFAILURE\nuser failure"));
        assertTrue(result.contains("PRINTER printer-1\tResource resource-a\tSUCCESS"));

        assertTrue(delegate.statuses().contains("About to provision 2 users to [resource-a, resource-b]"));
        assertTrue(delegate.statuses().contains("Processing 2 users: page 0 of 1"));
        assertTrue(delegate.statuses().contains("About to provision 1 any objects from [resource-a, resource-b]"));
        assertTrue(delegate.statuses().contains("Processing 1 anyObjects: page 0 of 1"));

        verify(userProvisioningManager).provision(
                eq("user-1"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull());
        verify(userProvisioningManager).provision(
                eq("user-2"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull());
        verify(anyObjectProvisioningManager).provision(
                eq("printer-1"),
                eq(resources),
                eq(false),
                (String) isNull());

        verify(userProvisioningManager, never()).deprovision(
                any(),
                any(),
                eq(false),
                (String) isNull());
        verify(anyObjectProvisioningManager, never()).deprovision(
                any(),
                any(),
                eq(false),
                (String) isNull());
    }

    @Test
    void tc04DoExecuteDeprovisionProcessesUsersAndAnyObjects() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-x");
        prepareGroup(delegate, ProvisionAction.DEPROVISION, resources);

        User user = user("user-9");
        AnyObject anyObject = anyObject("device-7", "DEVICE");

        stubCounts(1L, 1L);
        stubUsers(List.of(user));
        stubAnyObjects(List.of(anyObject));

        when(userProvisioningManager.deprovision(
                eq("user-9"),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-x", ExecStatus.SUCCESS, null)));

        when(anyObjectProvisioningManager.deprovision(
                eq("device-7"),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-x", ExecStatus.FAILURE, "anyObject failure")));

        String result = delegate.run(mock(JobExecutionContext.class));

        assertTrue(result.startsWith("Group test-group members deprovision\n\n"));
        assertTrue(result.contains("User user-9\tResource resource-x\tSUCCESS"));
        assertTrue(result.contains("DEVICE device-7\tResource resource-x\tFAILURE\nanyObject failure"));

        assertTrue(delegate.statuses().contains("About to deprovision 1 users from [resource-x]"));
        assertTrue(delegate.statuses().contains("About to deprovision 1 any objects from [resource-x]"));

        verify(userProvisioningManager).deprovision(
                eq("user-9"),
                eq(resources),
                eq(false),
                (String) isNull());
        verify(anyObjectProvisioningManager).deprovision(
                eq("device-7"),
                eq(resources),
                eq(false),
                (String) isNull());

        verify(userProvisioningManager, never()).provision(
                any(),
                eq(true),
                isNull(),
                any(),
                eq(false),
                (String) isNull());
        verify(anyObjectProvisioningManager, never()).provision(
                any(),
                any(),
                eq(false),
                (String) isNull());
    }

    @Test
    void tc05StopBeforeUserLoopSkipsAllProvisioningAndAnyObjectLookup() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-a");
        prepareGroup(delegate, ProvisionAction.PROVISION, resources);
        stubUserCountOnly(3L);

        delegate.stop();

        String result = delegate.run(mock(JobExecutionContext.class));

        assertTrue(result.contains("Group test-group members provision"));
        assertTrue(result.endsWith("Stop was requested"));
        assertTrue(delegate.statuses().contains("About to provision 3 users to [resource-a]"));

        verify(anySearchDAO, never()).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.USER));
        verify(anySearchDAO, never()).count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));
        verifyNoInteractions(userProvisioningManager, anyObjectProvisioningManager);
    }

    @Test
    void tc06StopRequestedDuringUserProcessingSkipsRemainingUsersAndAnyObjects() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-a");
        prepareGroup(delegate, ProvisionAction.PROVISION, resources);

        User first = user("user-first");
        User second = user("user-second");

        stubUserCountOnly(2L);
        stubUsers(List.of(first, second));

        doAnswer(invocation -> {
            delegate.stop();
            return List.of(status("resource-a", ExecStatus.SUCCESS, null));
        }).when(userProvisioningManager).provision(
                eq("user-first"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull());

        String result = delegate.run(mock(JobExecutionContext.class));

        assertTrue(result.contains("User user-first\tResource resource-a\tSUCCESS"));
        assertTrue(result.endsWith("Stop was requested"));

        verify(userProvisioningManager).provision(
                eq("user-first"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull());
        verify(userProvisioningManager, never()).provision(
                eq("user-second"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull());
        verify(anySearchDAO, never()).count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));
        verifyNoInteractions(anyObjectProvisioningManager);
    }

    @Test
    void tc07StopRequestedDuringAnyObjectProcessingSkipsRemainingAnyObjects() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-a");
        prepareGroup(delegate, ProvisionAction.PROVISION, resources);

        AnyObject first = anyObject("object-first", "DEVICE");
        AnyObject second = anyObject("object-second", "DEVICE");

        stubCounts(0L, 2L);
        stubUsers(List.of());
        stubAnyObjects(List.of(first, second));

        doAnswer(invocation -> {
            delegate.stop();
            return List.of(status("resource-a", ExecStatus.SUCCESS, null));
        }).when(anyObjectProvisioningManager).provision(
                eq("object-first"),
                eq(resources),
                eq(false),
                (String) isNull());

        String result = delegate.run(mock(JobExecutionContext.class));

        assertTrue(result.contains("DEVICE object-first\tResource resource-a\tSUCCESS"));
        assertTrue(result.endsWith("Stop was requested"));

        verify(anyObjectProvisioningManager).provision(
                eq("object-first"),
                eq(resources),
                eq(false),
                (String) isNull());
        verify(anyObjectProvisioningManager, never()).provision(
                eq("object-second"),
                eq(resources),
                eq(false),
                (String) isNull());
        verifyNoInteractions(userProvisioningManager);
    }

    @Test
    void tc08DoExecuteWithZeroMembersStillSearchesFirstPageAndProducesOnlyHeader() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-empty");
        prepareGroup(delegate, ProvisionAction.PROVISION, resources);

        stubCounts(0L, 0L);
        stubUsers(List.of());
        stubAnyObjects(List.of());

        String result = delegate.run(mock(JobExecutionContext.class));

        assertEquals("Group test-group members provision\n\n", result);
        assertTrue(delegate.statuses().contains("Processing 0 users: page 0 of 1"));
        assertTrue(delegate.statuses().contains("Processing 0 anyObjects: page 0 of 1"));

        verify(anySearchDAO).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.USER));
        verify(anySearchDAO).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.ANY_OBJECT));
        verifyNoInteractions(userProvisioningManager, anyObjectProvisioningManager);
    }

    @Test
    void tc09DoExecuteUsesDefaultPageSizeToProcessMultiplePages() {
        TestableGroupMemberProvisionTaskJobDelegate delegate = newDelegate();
        Collection<String> resources = List.of("resource-a");
        prepareGroup(delegate, ProvisionAction.PROVISION, resources);

        long usersAcrossTwoPages = AnyDAO.DEFAULT_PAGE_SIZE + 1L;
        stubCounts(usersAcrossTwoPages, 0L);

        User pageZeroUser = user("page-zero-user");
        User pageOneUser = user("page-one-user");

        doReturn(List.of(pageZeroUser), List.of(pageOneUser)).when(anySearchDAO).search(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(PageRequest.class),
                eq(AnyTypeKind.USER));
        stubAnyObjects(List.of());

        when(userProvisioningManager.provision(
                eq("page-zero-user"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-a", ExecStatus.SUCCESS, null)));
        when(userProvisioningManager.provision(
                eq("page-one-user"),
                eq(true),
                isNull(),
                eq(resources),
                eq(false),
                (String) isNull())).
                thenReturn(List.of(status("resource-a", ExecStatus.SUCCESS, null)));

        String result = delegate.run(mock(JobExecutionContext.class));

        assertTrue(result.contains("User page-zero-user\tResource resource-a\tSUCCESS"));
        assertTrue(result.contains("User page-one-user\tResource resource-a\tSUCCESS"));
        assertTrue(delegate.statuses().contains("Processing " + usersAcrossTwoPages + " users: page 0 of 2"));
        assertTrue(delegate.statuses().contains("Processing " + usersAcrossTwoPages + " users: page 1 of 2"));
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

    private static Field findField(final Class<?> type, final String fieldName) throws NoSuchFieldException {
        Class<?> current = type;
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
            return doExecute(context);
        }

        private boolean hasToBeRegisteredFor(final TaskExec<?> execution) {
            return hasToBeRegistered(execution);
        }

        private List<String> statuses() {
            return statuses;
        }

        @Override
        protected void setStatus(final String status) {
            statuses.add(status);
        }
    }
}
//###Test END##
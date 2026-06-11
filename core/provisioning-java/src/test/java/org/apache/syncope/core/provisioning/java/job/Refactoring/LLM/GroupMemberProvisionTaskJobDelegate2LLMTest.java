//###Test START##
package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
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
import org.mockito.ArgumentCaptor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.util.ReflectionTestUtils;

class GroupMemberProvisionTaskJobDelegate2Test {

    private static final String GROUP_KEY = "group-key";

    private TestableGroupMemberProvisionTaskJobDelegate2 delegate;

    private RealmDAO realmDAO;

    private GroupDAO groupDAO;

    private AnySearchDAO anySearchDAO;

    private UserProvisioningManager userProvisioningManager;

    private AnyObjectProvisioningManager anyObjectProvisioningManager;

    private Realm rootRealm;

    private Group group;

    private Collection<String> groupResources;

    @BeforeEach
    void setUp() {
        delegate = new TestableGroupMemberProvisionTaskJobDelegate2();

        realmDAO = mock(RealmDAO.class);
        groupDAO = mock(GroupDAO.class);
        anySearchDAO = mock(AnySearchDAO.class);
        userProvisioningManager = mock(UserProvisioningManager.class);
        anyObjectProvisioningManager = mock(AnyObjectProvisioningManager.class);

        rootRealm = mock(Realm.class);
        group = mock(Group.class);
        groupResources = List.of("resource-a", "resource-b");

        ReflectionTestUtils.setField(delegate, "realmDAO", realmDAO);
        ReflectionTestUtils.setField(delegate, "groupDAO", groupDAO);
        ReflectionTestUtils.setField(delegate, "anySearchDAO", anySearchDAO);
        ReflectionTestUtils.setField(delegate, "userProvisioningManager", userProvisioningManager);
        ReflectionTestUtils.setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        when(realmDAO.getRoot()).thenReturn(rootRealm);
        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn("engineering");
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(groupResources);
    }

    @Test
    void tc01ProvisionUsersAndAnyObjectsAppendsAllPropagationStatuses() {
        setJobData(ProvisionAction.PROVISION);

        User user = user("user-1");
        AnyObject anyObject = anyObject("PRINTER", "printer-1");

        PropagationStatus userStatus = propagationStatus("resource-a", "user failure");
        PropagationStatus anyObjectStatus = propagationStatus("resource-b", "");

        stubCount(AnyTypeKind.USER, 1L);
        stubCount(AnyTypeKind.ANY_OBJECT, 1L);
        stubUserSearch(0, List.of(user));
        stubAnyObjectSearch(0, List.of(anyObject));

        when(userProvisioningManager.provision(
                eq("user-1"),
                eq(true),
                isNull(),
                same(groupResources),
                eq(false),
                isNull()))
                .thenReturn(List.of(userStatus));

        when(anyObjectProvisioningManager.provision(
                eq("printer-1"),
                same(groupResources),
                eq(false),
                isNull()))
                .thenReturn(List.of(anyObjectStatus));

        String result = delegate.run();

        assertTrue(result.startsWith("Group engineering members provision\n\n"));
        assertTrue(result.contains("User user-1\tResource resource-a\tnull\nuser failure\n"));
        assertTrue(result.contains("PRINTER printer-1\tResource resource-b\tnull\n"));
        assertTrue(result.endsWith("\n"));

        verify(userProvisioningManager).provision(
                eq("user-1"),
                eq(true),
                isNull(),
                same(groupResources),
                eq(false),
                isNull());

        verify(userProvisioningManager, never()).deprovision(
                anyString(),
                anyCollection(),
                eq(false),
                any());

        verify(anyObjectProvisioningManager).provision(
                eq("printer-1"),
                same(groupResources),
                eq(false),
                isNull());

        verify(anyObjectProvisioningManager, never()).deprovision(
                anyString(),
                anyCollection(),
                eq(false),
                any());
    }

    @Test
    void tc02DeprovisionUsersAndAnyObjectsUsesDeprovisionManagersAndHeader() {
        setJobData(ProvisionAction.DEPROVISION);

        User user = user("user-2");
        AnyObject anyObject = anyObject("DEVICE", "device-1");

        PropagationStatus userStatus = propagationStatus("resource-a", null);
        PropagationStatus anyObjectStatus = propagationStatus("resource-b", null);

        stubCount(AnyTypeKind.USER, 1L);
        stubCount(AnyTypeKind.ANY_OBJECT, 1L);
        stubUserSearch(0, List.of(user));
        stubAnyObjectSearch(0, List.of(anyObject));

        when(userProvisioningManager.deprovision(
                eq("user-2"),
                same(groupResources),
                eq(false),
                isNull()))
                .thenReturn(List.of(userStatus));

        when(anyObjectProvisioningManager.deprovision(
                eq("device-1"),
                same(groupResources),
                eq(false),
                isNull()))
                .thenReturn(List.of(anyObjectStatus));

        String result = delegate.run();

        assertTrue(result.startsWith("Group engineering members deprovision\n\n"));
        assertTrue(result.contains("User user-2\tResource resource-a\tnull\n"));
        assertTrue(result.contains("DEVICE device-1\tResource resource-b\tnull\n"));

        verify(userProvisioningManager).deprovision(
                eq("user-2"),
                same(groupResources),
                eq(false),
                isNull());

        verify(userProvisioningManager, never()).provision(
                anyString(),
                eq(true),
                isNull(),
                anyCollection(),
                eq(false),
                any());

        verify(anyObjectProvisioningManager).deprovision(
                eq("device-1"),
                same(groupResources),
                eq(false),
                isNull());

        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                eq(false),
                any());
    }

    @Test
    void tc03StopBeforeExecutionSkipsSearchesAndReturnsStopMessageAfterUserPhase() {
        setJobData(ProvisionAction.PROVISION);
        delegate.stop();

        stubCount(AnyTypeKind.USER, 3L);

        String result = delegate.run();

        assertEquals("Group engineering members provision\n\n\nStop was requested", result);

        verify(anySearchDAO, never()).search(
                any(),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        verify(anySearchDAO, never()).count(
                any(),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));

        verify(userProvisioningManager, never()).provision(
                anyString(),
                eq(true),
                isNull(),
                anyCollection(),
                eq(false),
                any());

        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                eq(false),
                any());
    }

    @Test
    void tc04StopDuringUserProcessingStopsBeforeAnyObjectPhase() {
        setJobData(ProvisionAction.PROVISION);

        User user1 = user("user-1");
        User user2 = user("user-2");
        PropagationStatus userStatus = propagationStatus("resource-a", null);

        stubCount(AnyTypeKind.USER, 2L);
        stubUserSearch(0, List.of(user1, user2));

        when(userProvisioningManager.provision(
                eq("user-1"),
                eq(true),
                isNull(),
                same(groupResources),
                eq(false),
                isNull()))
                .thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(userStatus);
                });

        String result = delegate.run();

        assertTrue(result.contains("User user-1\tResource resource-a\tnull\n"));
        assertTrue(result.endsWith("\nStop was requested"));

        verify(userProvisioningManager).provision(
                eq("user-1"),
                eq(true),
                isNull(),
                same(groupResources),
                eq(false),
                isNull());

        verify(userProvisioningManager, never()).provision(
                eq("user-2"),
                eq(true),
                isNull(),
                same(groupResources),
                eq(false),
                isNull());

        verify(anySearchDAO, never()).count(
                any(),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT));

        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                eq(false),
                any());
    }

    @Test
    void tc05StopDuringAnyObjectProcessingStillAppendsStopMessage() {
        setJobData(ProvisionAction.PROVISION);

        AnyObject anyObject1 = anyObject("PRINTER", "printer-1");
        AnyObject anyObject2 = anyObject("PRINTER", "printer-2");
        PropagationStatus anyObjectStatus = propagationStatus("resource-a", null);

        stubCount(AnyTypeKind.USER, 0L);
        stubCount(AnyTypeKind.ANY_OBJECT, 2L);
        stubUserSearch(0, List.of());
        stubAnyObjectSearch(0, List.of(anyObject1, anyObject2));

        when(anyObjectProvisioningManager.provision(
                eq("printer-1"),
                same(groupResources),
                eq(false),
                isNull()))
                .thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(anyObjectStatus);
                });

        String result = delegate.run();

        assertTrue(result.contains("PRINTER printer-1\tResource resource-a\tnull\n"));
        assertTrue(result.endsWith("\nStop was requested"));

        verify(anyObjectProvisioningManager).provision(
                eq("printer-1"),
                same(groupResources),
                eq(false),
                isNull());

        verify(anyObjectProvisioningManager, never()).provision(
                eq("printer-2"),
                same(groupResources),
                eq(false),
                isNull());
    }

    @Test
    void tc06PaginationUsesDefaultPageSizeAndCreationDateAscendingSort() {
        setJobData(ProvisionAction.PROVISION);

        long userCount = AnyDAO.DEFAULT_PAGE_SIZE + 1L;
        PropagationStatus status = propagationStatus("resource-a", null);

        stubCount(AnyTypeKind.USER, userCount);
        stubCount(AnyTypeKind.ANY_OBJECT, 0L);
        stubUserSearch(0, List.of(user("user-page-0")));
        stubUserSearch(1, List.of(user("user-page-1")));
        stubAnyObjectSearch(0, List.of());

        when(userProvisioningManager.provision(
                anyString(),
                eq(true),
                isNull(),
                same(groupResources),
                eq(false),
                isNull()))
                .thenReturn(List.of(status));

        delegate.run();

        ArgumentCaptor<Pageable> pageableCaptor = ArgumentCaptor.forClass(Pageable.class);

        verify(anySearchDAO, times(2)).search(
                same(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                pageableCaptor.capture(),
                eq(AnyTypeKind.USER));

        List<Pageable> pageables = pageableCaptor.getAllValues();

        assertEquals(0, pageables.get(0).getPageNumber());
        assertEquals(AnyDAO.DEFAULT_PAGE_SIZE, pageables.get(0).getPageSize());

        assertEquals(1, pageables.get(1).getPageNumber());
        assertEquals(AnyDAO.DEFAULT_PAGE_SIZE, pageables.get(1).getPageSize());

        assertNotNull(pageables.get(0).getSort().getOrderFor("creationDate"));
        assertEquals("creationDate", pageables.get(0).getSort().getOrderFor("creationDate").getProperty());
        assertTrue(pageables.get(0).getSort().getOrderFor("creationDate").isAscending());
    }

    @Test
    void tc07HasToBeRegisteredAlwaysReturnsTrue() {
        TaskExec<?> execution = mock(TaskExec.class);

        assertTrue(delegate.registered(execution));
        assertTrue(delegate.registered(null));
    }

    @Test
    void tc08ExecuteReadsActionAndGroupKeyFromJobContextBeforeDelegatingToSuperclass() throws Exception {
        JobExecutionContext context = mock(JobExecutionContext.class);

        when(context.getData()).thenReturn(Map.of(
                GroupMemberProvisionTaskJobDelegate2.GROUP_KEY_JOBDETAIL_KEY,
                GROUP_KEY,
                GroupMemberProvisionTaskJobDelegate2.ACTION_JOBDETAIL_KEY,
                ProvisionAction.PROVISION));

        try {
            delegate.execute(TaskType.SCHEDULED, "task-key", context);
        } catch (Exception e) {
            // The superclass needs task infrastructure that is intentionally outside this focused unit test.
            // The fields below are set by this class before the superclass execution path is entered.
        }

        assertEquals(GROUP_KEY, ReflectionTestUtils.getField(delegate, "groupKey"));
        assertEquals(ProvisionAction.PROVISION, ReflectionTestUtils.getField(delegate, "action"));
    }

    @Test
    void tc09StatusMessagesDescribeHeaderCountsPagesAndResources() {
        setJobData(ProvisionAction.PROVISION);

        stubCount(AnyTypeKind.USER, 0L);
        stubCount(AnyTypeKind.ANY_OBJECT, 0L);
        stubUserSearch(0, List.of());
        stubAnyObjectSearch(0, List.of());

        delegate.run();

        List<String> statuses = delegate.statuses();

        assertEquals("Group engineering members provision\n\n", statuses.get(0));
        assertEquals("About to provision 0 users to [resource-a, resource-b]", statuses.get(1));
        assertEquals("Processing 0 users: page 0 of 1", statuses.get(2));
        assertEquals("About to provision 0 any objects from [resource-a, resource-b]", statuses.get(3));
        assertEquals("Processing 0 anyObjects: page 0 of 1", statuses.get(4));
    }

    private void setJobData(final ProvisionAction action) {
        ReflectionTestUtils.setField(delegate, "groupKey", GROUP_KEY);
        ReflectionTestUtils.setField(delegate, "action", action);
    }

    private User user(final String key) {
        User user = mock(User.class);
        when(user.getKey()).thenReturn(key);
        return user;
    }

    private AnyObject anyObject(final String type, final String key) {
        AnyType anyType = mock(AnyType.class);
        when(anyType.getKey()).thenReturn(type);

        AnyObject anyObject = mock(AnyObject.class);
        when(anyObject.getKey()).thenReturn(key);
        when(anyObject.getType()).thenReturn(anyType);

        return anyObject;
    }

    private PropagationStatus propagationStatus(final String resource, final String failureReason) {
        PropagationStatus status = new PropagationStatus();
        status.setResource(resource);
        status.setStatus(null);
        status.setFailureReason(failureReason);

        return status;
    }

    private void stubCount(final AnyTypeKind anyTypeKind, final long count) {
        when(anySearchDAO.count(
                same(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(anyTypeKind)))
                .thenReturn(count);
    }

    private void stubUserSearch(final int page, final List<User> users) {
        doReturn(users).when(anySearchDAO).search(
                same(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(PageRequest.of(
                        page,
                        AnyDAO.DEFAULT_PAGE_SIZE,
                        Sort.by(Sort.Direction.ASC, "creationDate"))),
                eq(AnyTypeKind.USER));
    }

    private void stubAnyObjectSearch(final int page, final List<AnyObject> anyObjects) {
        doReturn(anyObjects).when(anySearchDAO).search(
                same(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(SearchCond.class),
                eq(PageRequest.of(
                        page,
                        AnyDAO.DEFAULT_PAGE_SIZE,
                        Sort.by(Sort.Direction.ASC, "creationDate"))),
                eq(AnyTypeKind.ANY_OBJECT));
    }

    private static class TestableGroupMemberProvisionTaskJobDelegate2
            extends GroupMemberProvisionTaskJobDelegate2 {

        private final List<String> statuses = new ArrayList<>();

        String run() {
            return doExecute(mock(JobExecutionContext.class));
        }

        boolean registered(final TaskExec<?> execution) {
            return hasToBeRegistered(execution);
        }

        List<String> statuses() {
            return statuses;
        }

        @Override
        protected void setStatus(final String status) {
            statuses.add(status);
        }
    }
}
//###Test END##
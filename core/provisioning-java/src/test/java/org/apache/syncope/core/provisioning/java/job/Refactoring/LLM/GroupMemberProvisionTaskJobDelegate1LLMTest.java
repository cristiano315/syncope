//###Test START##
package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
import org.apache.syncope.core.persistence.api.dao.TaskDAO;
import org.apache.syncope.core.persistence.api.dao.TaskExecDAO;
import org.apache.syncope.core.persistence.api.dao.search.SearchCond;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
import org.apache.syncope.core.persistence.api.entity.task.TaskExec;
import org.apache.syncope.core.persistence.api.entity.task.TaskUtilsFactory;
import org.apache.syncope.core.persistence.api.entity.user.User;
import org.apache.syncope.core.provisioning.api.AnyObjectProvisioningManager;
import org.apache.syncope.core.provisioning.api.AuditManager;
import org.apache.syncope.core.provisioning.api.UserProvisioningManager;
import org.apache.syncope.core.provisioning.api.job.JobExecutionContext;
import org.apache.syncope.core.provisioning.api.notification.NotificationManager;
import org.apache.syncope.core.spring.security.SecurityProperties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Pageable;

@ExtendWith(MockitoExtension.class)
class GroupMemberProvisionTaskJobDelegate1Test {

    private static final String TASK_KEY = "task-1";

    private static final String GROUP_KEY = "group-1";

    private static final String GROUP_NAME = "engineering";

    private static final String EXECUTOR = "test-executor";

    private static final String RESOURCE_LDAP = "resource-ldap";

    private static final String RESOURCE_DB = "resource-db";

    private GroupMemberProvisionTaskJobDelegate1 delegate;

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
    private TaskDAO taskDAO;

    @Mock
    private TaskExecDAO taskExecDAO;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private TaskUtilsFactory taskUtilsFactory;

    @Mock
    private NotificationManager notificationManager;

    @Mock
    private AuditManager auditManager;

    @Mock
    private ApplicationEventPublisher publisher;

    @Mock
    private SecurityProperties securityProperties;

    @Mock
    private Realm rootRealm;

    @Mock
    private Group group;

    @Mock
    private SchedTask schedTask;

    @Mock
    private TaskExec<SchedTask> taskExec;

    @BeforeEach
    void setUp() {
        delegate = new GroupMemberProvisionTaskJobDelegate1();

        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        setField(delegate, "taskDAO", taskDAO);
        setField(delegate, "taskExecDAO", taskExecDAO);
        setField(delegate, "taskUtilsFactory", taskUtilsFactory);
        setField(delegate, "notificationManager", notificationManager);
        setField(delegate, "auditManager", auditManager);
        setField(delegate, "publisher", publisher);
        setField(delegate, "securityProperties", securityProperties);
        setField(delegate, "task", schedTask);
        setField(delegate, "taskType", TaskType.SCHEDULED);
        setField(delegate, "executor", EXECUTOR);
    }

    @Test
    void tc001ExecuteReadsJobDataDelegatesAndRegistersExecution() throws Exception {
        setupGroup();
        selectJobData(ProvisionAction.PROVISION);
        mockCounts(0L, 0L);
        mockUserSearch(List.of());
        mockAnyObjectSearch(List.of());

        JobExecutionContext context = mock(JobExecutionContext.class);
        when(context.getData()).thenReturn(Map.of(
                GroupMemberProvisionTaskJobDelegate1.GROUP_KEY_JOBDETAIL_KEY, GROUP_KEY,
                GroupMemberProvisionTaskJobDelegate1.ACTION_JOBDETAIL_KEY, ProvisionAction.PROVISION));
        when(context.getExecutor()).thenReturn(EXECUTOR);

        doReturn(Optional.of(schedTask)).when(taskDAO).findById(TaskType.SCHEDULED, TASK_KEY);
        when(schedTask.isActive()).thenReturn(true);
        when(schedTask.getKey()).thenReturn(TASK_KEY);
        when(taskUtilsFactory.getInstance(TaskType.SCHEDULED).newTaskExec()).thenReturn(taskExec);
        when(taskDAO.save(schedTask)).thenReturn(schedTask);

        delegate.execute(TaskType.SCHEDULED, TASK_KEY, context);

        assertEquals(GROUP_KEY, getField(delegate, "groupKey"));
        assertEquals(ProvisionAction.PROVISION, getField(delegate, "action"));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(taskExec).setMessage(messageCaptor.capture());

        assertTrue(messageCaptor.getValue().contains("Group " + GROUP_NAME + " members provision"));

        verify(taskExec).setStatus("SUCCESS");
        verify(taskExecDAO).saveAndAdd(TaskType.SCHEDULED, TASK_KEY, taskExec);
    }

    @Test
    void tc002DoExecuteProvisionsUsersAndAnyObjectsAndFormatsSuccessfulAndFailedStatuses() {
        Collection<String> resources = setupGroup();
        selectJobData(ProvisionAction.PROVISION);

        User user = user("user-1");
        AnyObject anyObject = anyObject("any-1", "PRINTER");

        mockCounts(1L, 1L);
        mockUserSearch(List.of(user));
        mockAnyObjectSearch(List.of(anyObject));

        when(userProvisioningManager.provision(
                eq("user-1"),
                eq(true),
                isNull(),
                same(resources),
                eq(false),
                nullable(String.class)))
                .thenReturn(List.of(
                        propagationStatus(RESOURCE_LDAP, ExecStatus.SUCCESS, ""),
                        propagationStatus(RESOURCE_DB, ExecStatus.FAILURE, "connection refused")));

        when(anyObjectProvisioningManager.provision(
                eq("any-1"),
                same(resources),
                eq(false),
                nullable(String.class)))
                .thenReturn(List.of(propagationStatus(RESOURCE_LDAP, ExecStatus.SUCCESS, null)));

        String result = delegate.doExecute(mock(JobExecutionContext.class));

        assertTrue(result.startsWith("Group " + GROUP_NAME + " members provision"));
        assertTrue(result.contains("User user-1\tResource " + RESOURCE_LDAP + "\tSUCCESS"));
        assertTrue(result.contains("Resource " + RESOURCE_DB + "\tFAILURE connection refused"));
        assertTrue(result.contains("PRINTER any-1\tResource " + RESOURCE_LDAP + "\tSUCCESS"));

        verify(userProvisioningManager).provision(
                eq("user-1"),
                eq(true),
                isNull(),
                same(resources),
                eq(false),
                nullable(String.class));

        verify(anyObjectProvisioningManager).provision(
                eq("any-1"),
                same(resources),
                eq(false),
                nullable(String.class));
    }

    @Test
    void tc003DoExecuteDeprovisionsUsersAndAnyObjectsWhenActionIsDeprovision() {
        Collection<String> resources = setupGroup();
        selectJobData(ProvisionAction.DEPROVISION);

        User user = user("user-2");
        AnyObject anyObject = anyObject("any-2", "DEVICE");

        mockCounts(1L, 1L);
        mockUserSearch(List.of(user));
        mockAnyObjectSearch(List.of(anyObject));

        when(userProvisioningManager.deprovision(
                eq("user-2"),
                same(resources),
                eq(false),
                nullable(String.class)))
                .thenReturn(List.of(propagationStatus(RESOURCE_LDAP, ExecStatus.SUCCESS, null)));

        when(anyObjectProvisioningManager.deprovision(
                eq("any-2"),
                same(resources),
                eq(false),
                nullable(String.class)))
                .thenReturn(List.of(propagationStatus(RESOURCE_DB, ExecStatus.SUCCESS, "")));

        String result = delegate.doExecute(mock(JobExecutionContext.class));

        assertTrue(result.startsWith("Group " + GROUP_NAME + " members deprovision"));
        assertTrue(result.contains("User user-2\tResource " + RESOURCE_LDAP + "\tSUCCESS"));
        assertTrue(result.contains("DEVICE any-2\tResource " + RESOURCE_DB + "\tSUCCESS"));

        verify(userProvisioningManager).deprovision(
                eq("user-2"),
                same(resources),
                eq(false),
                nullable(String.class));

        verify(anyObjectProvisioningManager).deprovision(
                eq("any-2"),
                same(resources),
                eq(false),
                nullable(String.class));

        verify(userProvisioningManager, never()).provision(
                anyString(),
                anyBoolean(),
                nullable(String.class),
                anyCollection(),
                anyBoolean(),
                nullable(String.class));

        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                anyBoolean(),
                nullable(String.class));
    }

    @Test
    void tc004StopRequestedDuringUserProcessingPreventsAnyObjectProcessing() {
        Collection<String> resources = setupGroup();
        selectJobData(ProvisionAction.PROVISION);

        User user = user("user-stop");

        mockUserCount(1L);
        mockUserSearch(List.of(user));

        when(userProvisioningManager.provision(
                eq("user-stop"),
                eq(true),
                isNull(),
                same(resources),
                eq(false),
                nullable(String.class)))
                .thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(propagationStatus(RESOURCE_LDAP, ExecStatus.SUCCESS, null));
                });

        String result = delegate.doExecute(mock(JobExecutionContext.class));

        assertTrue(result.contains("User user-stop\tResource " + RESOURCE_LDAP + "\tSUCCESS"));
        assertTrue(result.endsWith("Stop was requested"));

        verify(anyObjectProvisioningManager, never()).provision(
                anyString(),
                anyCollection(),
                anyBoolean(),
                nullable(String.class));

        verify(anyObjectProvisioningManager, never()).deprovision(
                anyString(),
                anyCollection(),
                anyBoolean(),
                nullable(String.class));
    }

    @Test
    void tc005StopRequestedDuringAnyObjectProcessingIsReportedAfterAnyObjects() {
        Collection<String> resources = setupGroup();
        selectJobData(ProvisionAction.PROVISION);

        AnyObject anyObject = anyObject("any-stop", "SERVICE");

        mockCounts(0L, 1L);
        mockUserSearch(List.of());
        mockAnyObjectSearch(List.of(anyObject));

        when(anyObjectProvisioningManager.provision(
                eq("any-stop"),
                same(resources),
                eq(false),
                nullable(String.class)))
                .thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(propagationStatus(RESOURCE_DB, ExecStatus.SUCCESS, null));
                });

        String result = delegate.doExecute(mock(JobExecutionContext.class));

        assertTrue(result.contains("SERVICE any-stop\tResource " + RESOURCE_DB + "\tSUCCESS"));
        assertTrue(result.endsWith("Stop was requested"));
    }

    @Test
    void tc006DoExecuteUsesCurrentPageCalculationAndRequestsExpectedPages() {
        setupGroup();
        selectJobData(ProvisionAction.PROVISION);
        mockCounts(AnyDAO.DEFAULT_PAGE_SIZE, 0L);

        List<Integer> userPages = new java.util.ArrayList<>();
        doAnswer(invocation -> {
            Pageable pageable = invocation.getArgument(4, Pageable.class);
            userPages.add(pageable.getPageNumber());
            return List.of();
        }).when(anySearchDAO).search(
                any(Realm.class),
                eq(true),
                anySet(),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));

        List<Integer> anyObjectPages = new java.util.ArrayList<>();
        doAnswer(invocation -> {
            Pageable pageable = invocation.getArgument(4, Pageable.class);
            anyObjectPages.add(pageable.getPageNumber());
            return List.of();
        }).when(anySearchDAO).search(
                any(Realm.class),
                eq(true),
                anySet(),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));

        String result = delegate.doExecute(mock(JobExecutionContext.class));

        assertTrue(result.startsWith("Group " + GROUP_NAME + " members provision"));
        assertEquals(List.of(0, 1), userPages);
        assertEquals(List.of(0), anyObjectPages);
    }

    @Test
    void tc007HasToBeRegisteredAlwaysReturnsTrue() {
        assertTrue(delegate.hasToBeRegistered(mock(TaskExec.class)));
    }

    private Collection<String> setupGroup() {
        Collection<String> resources = new LinkedHashSet<>(List.of(RESOURCE_LDAP, RESOURCE_DB));

        when(realmDAO.getRoot()).thenReturn(rootRealm);
        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn(GROUP_NAME);
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(resources);

        return resources;
    }

    private void selectJobData(final ProvisionAction action) {
        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", action);
    }

    private void mockCounts(final long userCount, final long anyObjectCount) {
        mockUserCount(userCount);
        mockAnyObjectCount(anyObjectCount);
    }

    private void mockUserCount(final long userCount) {
        when(anySearchDAO.count(
                any(Realm.class),
                eq(true),
                anySet(),
                any(SearchCond.class),
                eq(AnyTypeKind.USER)))
                .thenReturn(userCount);
    }

    private void mockAnyObjectCount(final long anyObjectCount) {
        when(anySearchDAO.count(
                any(Realm.class),
                eq(true),
                anySet(),
                any(SearchCond.class),
                eq(AnyTypeKind.ANY_OBJECT)))
                .thenReturn(anyObjectCount);
    }

    private void mockUserSearch(final List<User> users) {
        doReturn(users).when(anySearchDAO).search(
                any(Realm.class),
                eq(true),
                anySet(),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.USER));
    }

    private void mockAnyObjectSearch(final List<AnyObject> anyObjects) {
        doReturn(anyObjects).when(anySearchDAO).search(
                any(Realm.class),
                eq(true),
                anySet(),
                any(SearchCond.class),
                any(Pageable.class),
                eq(AnyTypeKind.ANY_OBJECT));
    }

    private User user(final String key) {
        User user = mock(User.class);
        when(user.getKey()).thenReturn(key);
        return user;
    }

    private AnyObject anyObject(final String key, final String typeKey) {
        AnyObject anyObject = mock(AnyObject.class, Answers.RETURNS_DEEP_STUBS);

        when(anyObject.getKey()).thenReturn(key);
        when(anyObject.getType().getKey()).thenReturn(typeKey);

        return anyObject;
    }

    private PropagationStatus propagationStatus(
            final String resource,
            final ExecStatus status,
            final String failureReason) {

        PropagationStatus propagationStatus = new PropagationStatus();
        propagationStatus.setResource(resource);
        propagationStatus.setStatus(status);
        propagationStatus.setFailureReason(failureReason);

        return propagationStatus;
    }

    private static void setField(final Object target, final String fieldName, final Object value) {
        Field field = findField(target.getClass(), fieldName);

        try {
            field.setAccessible(true);
            field.set(target, value);
        } catch (IllegalAccessException e) {
            fail("Could not set field " + fieldName + ": " + e.getMessage());
        }
    }

    private static Object getField(final Object target, final String fieldName) {
        Field field = findField(target.getClass(), fieldName);

        try {
            field.setAccessible(true);
            return field.get(target);
        } catch (IllegalAccessException e) {
            fail("Could not get field " + fieldName + ": " + e.getMessage());
            return null;
        }
    }

    private static Field findField(final Class<?> initialType, final String fieldName) {
        Class<?> type = initialType;

        while (type != null) {
            try {
                return type.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                type = type.getSuperclass();
            }
        }

        throw new IllegalArgumentException("Field not found: " + fieldName);
    }

    @SuppressWarnings("unchecked")
    private static Set<String> anySet() {
        return any(Set.class);
    }
}
//###Test END##
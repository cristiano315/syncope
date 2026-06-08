package org.apache.syncope.core.provisioning.java.job;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
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

public class GroupMemberProvisionTaskJobDelegateTest {

    private static final String GROUP_KEY = "group-1";

    private static final String GROUP_NAME = "engineering";

    private static final String USER_KEY = "user-1";

    private static final String ANY_OBJECT_KEY = "printer-1";

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
         * The delegate is created once before each test and receives mocked
         * dependencies through reflection, because the production class relies
         * on Spring @Autowired fields.
         *
         * This keeps the tests unit-level and focused on the behavior of
         * GroupMemberProvisionTaskJobDelegate, without starting the Spring
         * container or using a real persistence layer.
         */
        delegate = new TestableGroupMemberProvisionTaskJobDelegate();

        setField(delegate, "realmDAO", realmDAO);
        setField(delegate, "groupDAO", groupDAO);
        setField(delegate, "anySearchDAO", anySearchDAO);
        setField(delegate, "userProvisioningManager", userProvisioningManager);
        setField(delegate, "anyObjectProvisioningManager", anyObjectProvisioningManager);

        /*
         * execute() normally initializes these fields from JobExecutionContext.
         * Since these tests focus on doExecute(), we set them directly.
         */
        setField(delegate, "groupKey", GROUP_KEY);
        setField(delegate, "action", ProvisionAction.PROVISION);

        when(groupDAO.authFind(GROUP_KEY)).thenReturn(group);
        when(group.getName()).thenReturn(GROUP_NAME);
        when(groupDAO.findAllResourceKeys(GROUP_KEY)).thenReturn(resources);

        when(realmDAO.getRoot()).thenReturn(rootRealm);

        /*
         * Default search behavior: no users and no any objects.
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

    /*
     * TC1-TC11 focus on doExecute().
     * This is the central method of the class because it retrieves the group,
     * finds group members, chooses between provision and deprovision, handles
     * pagination, manages stop requests and builds the final execution report.
     */

    @Test
    @DisplayName("TC1: PROVISION with no members")
    public void testTC1_DoExecute_ProvisionNoMembers() {
        String result = delegate.runDoExecute();

        /*
         * This is the minimal happy path. The group exists, but it has no user
         * members and no any object members. The job must produce the initial
         * report and must not call any provisioning manager.
         */
        assertTrue(result.contains("Group engineering members provision"),
                "TC1 failed: the initial provision report is missing. Actual result: " + result);

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
         * This test checks the standard user provisioning path. Since the
         * failure reason is blank, the report must contain the user and
         * resource information, but no additional failure detail.
         */
        assertTrue(result.contains("User user-1"),
                "TC2 failed: the user key is missing from the report. Actual result: " + result);

        assertTrue(result.contains("Resource resource-1"),
                "TC2 failed: the resource key is missing from the report. Actual result: " + result);

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
         * A non-blank failure reason is part of the observable report. This
         * covers the branch guarded by StringUtils.isNotBlank().
         */
        assertTrue(result.contains("User user-1"),
                "TC3 failed: the user key is missing from the report. Actual result: " + result);

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
         * With DEPROVISION action, the delegate must select the deprovision
         * method for users and must not call the provision method.
         */
        assertTrue(result.contains("Group engineering members deprovision"),
                "TC4 failed: the report does not describe a deprovision operation. Actual result: " + result);

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
         * The production code computes pages as count / pageSize + 1.
         * Therefore, when the count is exactly equal to the default page size,
         * two pages are requested: page 0 and page 1.
         */
        ArgumentCaptor<Pageable> pageableCaptor = ArgumentCaptor.forClass(Pageable.class);

        verify(anySearchDAO, org.mockito.Mockito.times(2)).search(
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
                "TC5 failed: the page size should match AnyDAO.DEFAULT_PAGE_SIZE.");
    }

    @Test
    @DisplayName("TC6: PROVISION of one any object")
    public void testTC6_DoExecute_ProvisionAnyObject() {
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
         * Any objects are processed after users. The report contains the
         * any object type key followed by the any object key.
         */
        assertTrue(result.contains("PRINTER printer-1"),
                "TC6 failed: any object type and key are missing from the report. Actual result: " + result);

        assertTrue(result.contains("Resource resource-1"),
                "TC6 failed: resource information is missing from the report. Actual result: " + result);

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
    @DisplayName("TC7: DEPROVISION of one any object")
    public void testTC7_DoExecute_DeprovisionAnyObject() throws Exception {
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
         * This test mirrors TC6 but with DEPROVISION. It checks that the
         * any object manager uses the correct deprovision method.
         */
        assertTrue(result.contains("Group engineering members deprovision"),
                "TC7 failed: the report does not describe a deprovision operation. Actual result: " + result);

        assertTrue(result.contains("PRINTER printer-1"),
                "TC7 failed: any object information is missing from the report. Actual result: " + result);

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
    @DisplayName("TC8: PROVISION with both user and any object members")
    public void testTC8_DoExecute_ProcessUsersBeforeAnyObjects() {
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
         * This test verifies the complete flow with both member categories.
         */
        assertTrue(result.contains("User user-1"),
                "TC8 failed: user member is missing from the report. Actual result: " + result);

        assertTrue(result.contains("PRINTER printer-1"),
                "TC8 failed: any object member is missing from the report. Actual result: " + result);

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
    @DisplayName("TC9: Stop requested before member processing")
    public void testTC9_DoExecute_StopBeforeProcessingMembers() {
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
         * If stop is requested before entering the user loop, the delegate
         * must skip the searches and must not start any object processing.
         */
        assertTrue(result.contains("Stop was requested"),
                "TC9 failed: stop message is missing from the report. Actual result: " + result);

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
    @DisplayName("TC10: Stop requested during user processing")
    public void testTC10_DoExecute_StopDuringUserProcessing() {
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
                thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(status);
                });

        String result = delegate.runDoExecute();

        /*
         * A stop request raised during user provisioning is observed after the
         * current user has been reported. The any object phase must not start.
         */
        assertTrue(result.contains("User user-1"),
                "TC10 failed: the current user should still be reported. Actual result: " + result);

        assertTrue(result.contains("Stop was requested"),
                "TC10 failed: stop message is missing from the report. Actual result: " + result);

        verify(anySearchDAO, never()).count(
                eq(rootRealm),
                eq(true),
                eq(SyncopeConstants.FULL_ADMIN_REALMS),
                any(),
                eq(AnyTypeKind.ANY_OBJECT));

        verifyNoInteractions(anyObjectProvisioningManager);
    }

    @Test
    @DisplayName("TC11: Stop requested during any object processing")
    public void testTC11_DoExecute_StopDuringAnyObjectProcessing() {
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
                thenAnswer(invocation -> {
                    delegate.stop();
                    return List.of(status);
                });

        String result = delegate.runDoExecute();

        /*
         * In this case the user phase is completed normally, then the stop is
         * requested while processing an any object. The final report must still
         * contain the current any object and the stop message.
         */
        assertTrue(result.contains("PRINTER printer-1"),
                "TC11 failed: the current any object should be reported. Actual result: " + result);

        assertTrue(result.contains("Stop was requested"),
                "TC11 failed: stop message is missing from the report. Actual result: " + result);
    }

    /*
     * TC12 covers hasToBeRegistered().
     * The method is simple, but it represents the class contract that every
     * execution result must be recorded.
     */

    @Test
    @DisplayName("TC12: hasToBeRegistered always returns true")
    public void testTC12_HasToBeRegistered_AlwaysTrue() {
        TaskExec<?> execution = mock(TaskExec.class);

        /*
         * The method does not depend on the execution object. It must return
         * true both for a real execution object and for null.
         */
        assertTrue(delegate.callHasToBeRegistered(execution),
                "TC12 failed: hasToBeRegistered should return true for a non-null execution.");

        assertTrue(delegate.callHasToBeRegistered(null),
                "TC12 failed: hasToBeRegistered should return true for a null execution.");
    }

    /*
     * Helper methods used to keep the test cases readable.
     * They create the minimum mocked domain objects needed by doExecute().
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
     * Test subclass used to expose protected methods and to collect status
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
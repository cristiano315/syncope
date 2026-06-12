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
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import java.util.Map;
import org.apache.syncope.common.lib.SyncopeConstants;
import org.apache.syncope.common.lib.to.PropagationStatus;
import org.apache.syncope.common.lib.types.AnyTypeKind;
import org.apache.syncope.common.lib.types.OpEvent;
import org.apache.syncope.common.lib.types.ProvisionAction;
import org.apache.syncope.common.lib.types.TaskType;
import org.apache.syncope.core.persistence.api.dao.AnyDAO;
import org.apache.syncope.core.persistence.api.dao.AnySearchDAO;
import org.apache.syncope.core.persistence.api.dao.GroupDAO;
import org.apache.syncope.core.persistence.api.dao.RealmDAO;
import org.apache.syncope.core.persistence.api.entity.AnyType;
import org.apache.syncope.core.persistence.api.entity.Realm;
import org.apache.syncope.core.persistence.api.entity.anyobject.AnyObject;
import org.apache.syncope.core.persistence.api.entity.group.Group;
import org.apache.syncope.core.persistence.api.entity.task.SchedTask;
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

public class GroupMemberProvisionTaskJobDelegateCFTest {

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
    setField(
      delegate,
      "anyObjectProvisioningManager",
      anyObjectProvisioningManager
    );

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
    when(
      anySearchDAO.count(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        eq(AnyTypeKind.USER)
      )
    ).thenReturn(0L);

    when(
      anySearchDAO.count(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        eq(AnyTypeKind.ANY_OBJECT)
      )
    ).thenReturn(0L);

    when(
      anySearchDAO.search(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        any(Pageable.class),
        eq(AnyTypeKind.USER)
      )
    ).thenReturn(List.of());

    when(
      anySearchDAO.search(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        any(Pageable.class),
        eq(AnyTypeKind.ANY_OBJECT)
      )
    ).thenReturn(List.of());
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

  private static AnyObject mockAnyObject(
    final String key,
    final String typeKey
  ) {
    AnyType type = mock(AnyType.class);
    when(type.getKey()).thenReturn(typeKey);

    AnyObject anyObject = mock(AnyObject.class);
    when(anyObject.getKey()).thenReturn(key);
    when(anyObject.getType()).thenReturn(type);

    return anyObject;
  }

  private static PropagationStatus mockPropagationStatus(
    final String resource,
    final String failureReason
  ) {
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

  private static void setField(
    final Object target,
    final String fieldName,
    final Object value
  ) throws Exception {
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
  private static class TestableGroupMemberProvisionTaskJobDelegate
    extends GroupMemberProvisionTaskJobDelegate
  {

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

  private static Object getFieldValue(
    final Object target,
    final String fieldName
  ) {
    Class<?> current = target.getClass();

    while (current != null) {
      try {
        Field field = current.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(target);
      } catch (NoSuchFieldException e) {
        current = current.getSuperclass();
      } catch (IllegalAccessException e) {
        throw new AssertionError("Could not read field " + fieldName, e);
      }
    }

    throw new AssertionError("Field not found: " + fieldName);
  }

  private static class ExecuteOnlyGroupMemberProvisionTaskJobDelegate
    extends GroupMemberProvisionTaskJobDelegate
  {

    private final List<String> statuses = new ArrayList<>();

    private TaskType initializedTaskType;

    private String initializedTaskKey;

    private boolean initExecutionCalled;

    private boolean endExecutionCalled;

    private boolean endCalled;

    private String observedGroupKey;

    private ProvisionAction observedAction;

    private String executionMessage;

    private String executionStatus;

    private OpEvent.Outcome executionResult;

    @Override
    protected void init(
      final TaskType taskType,
      final String taskKey,
      final JobExecutionContext context
    ) {
      this.initializedTaskType = taskType;
      this.initializedTaskKey = taskKey;

      /*
       * The parent execute() template expects init() to populate the task field.
       * Since this test bypasses the real DAO-based initialization, we provide
       * an active mocked task here.
       */
      this.task = mock(SchedTask.class);
      when(this.task.isActive()).thenReturn(true);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected TaskExec<SchedTask> initExecution() {
      initExecutionCalled = true;
      return (TaskExec<SchedTask>) mock(TaskExec.class);
    }

    @Override
    protected String doExecute(final JobExecutionContext context) {
      observedGroupKey = (String) getFieldValue(this, "groupKey");
      observedAction = (ProvisionAction) getFieldValue(this, "action");
      return "execute-only-result";
    }

    @Override
    protected void endExecution(
      final TaskExec<SchedTask> execution,
      final String message,
      final String status,
      final OpEvent.Outcome result
    ) {
      endExecutionCalled = true;
      executionMessage = message;
      executionStatus = status;
      executionResult = result;
    }

    @Override
    protected void end() {
      endCalled = true;
    }

    @Override
    protected void setStatus(final String status) {
      statuses.add(status);
    }
  }

  // New Control Flow test cases for execute() and doExecute() methods

  @Test
  @DisplayName("TC13: execute reads job data and delegates execution")
  public void testTC13_Execute_ReadsJobDataAndDelegatesExecution()
    throws Exception {
    ExecuteOnlyGroupMemberProvisionTaskJobDelegate executeDelegate =
      new ExecuteOnlyGroupMemberProvisionTaskJobDelegate();

    JobExecutionContext context = mock(JobExecutionContext.class);
    when(context.getData()).thenReturn(
      Map.of(
        GroupMemberProvisionTaskJobDelegate.GROUP_KEY_JOBDETAIL_KEY,
        "group-from-context",
        GroupMemberProvisionTaskJobDelegate.ACTION_JOBDETAIL_KEY,
        ProvisionAction.DEPROVISION
      )
    );

    executeDelegate.execute(TaskType.SCHEDULED, "task-13", context);

    /*
     * execute() must copy the job data into the delegate state before calling
     * the parent template method. The overridden doExecute() observes those
     * fields without running the real provisioning logic.
     */
    assertEquals(
      "group-from-context",
      executeDelegate.observedGroupKey,
      "TC13 failed: execute should read the group key from the job context."
    );

    assertEquals(
      ProvisionAction.DEPROVISION,
      executeDelegate.observedAction,
      "TC13 failed: execute should read the provision action from the job context."
    );

    assertEquals(
      TaskType.SCHEDULED,
      executeDelegate.initializedTaskType,
      "TC13 failed: the task type should be delegated to the parent execution flow."
    );

    assertEquals(
      "task-13",
      executeDelegate.initializedTaskKey,
      "TC13 failed: the task key should be delegated to the parent execution flow."
    );

    assertTrue(
      executeDelegate.statuses.contains("Initialization completed"),
      "TC13 failed: the parent execution flow should publish the initialization status."
    );

    assertTrue(
      executeDelegate.initExecutionCalled,
      "TC13 failed: the parent execution flow should initialize a task execution."
    );

    assertTrue(
      executeDelegate.endExecutionCalled,
      "TC13 failed: the parent execution flow should complete the task execution."
    );

    assertTrue(
      executeDelegate.endCalled,
      "TC13 failed: the parent execution flow should call end()."
    );

    assertEquals(
      "execute-only-result",
      executeDelegate.executionMessage,
      "TC13 failed: the result returned by doExecute() should be passed to endExecution()."
    );

    assertEquals(
      "SUCCESS",
      executeDelegate.executionStatus,
      "TC13 failed: a successful doExecute() should produce SUCCESS status."
    );

    assertEquals(
      OpEvent.Outcome.SUCCESS,
      executeDelegate.executionResult,
      "TC13 failed: a successful doExecute() should produce SUCCESS outcome."
    );
  }

  @Test
  @DisplayName("TC14: Stop requested before the second user is processed")
  public void testTC14_DoExecute_StopBeforeSecondUserIsProcessed() {
    User firstUser = mockUser(USER_KEY);
    User secondUser = mockUser("user-2");
    PropagationStatus status = mockPropagationStatus("resource-1", "");

    when(
      anySearchDAO.count(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        eq(AnyTypeKind.USER)
      )
    ).thenReturn(2L);

    when(
      anySearchDAO.search(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        any(Pageable.class),
        eq(AnyTypeKind.USER)
      )
    ).thenReturn(List.of(firstUser, secondUser));

    when(
      userProvisioningManager.provision(
        eq(USER_KEY),
        eq(true),
        isNull(),
        eq(resources),
        eq(false),
        isNull()
      )
    ).thenAnswer(invocation -> {
      delegate.stop();
      return List.of(status);
    });

    String result = delegate.runDoExecute();

    /*
     * The first user is processed, then the stop request prevents the second
     * user from entering the provisioning branch of the inner loop.
     */
    assertTrue(
      result.contains("User user-1"),
      "TC14 failed: the first user should be reported. Actual result: " + result
    );

    assertFalse(
      result.contains("User user-2"),
      "TC14 failed: the second user should not be reported. Actual result: " +
        result
    );

    assertTrue(
      result.contains("Stop was requested"),
      "TC14 failed: the stop message should be present. Actual result: " +
        result
    );

    verify(userProvisioningManager, never()).provision(
      eq("user-2"),
      anyBoolean(),
      isNull(),
      eq(resources),
      eq(false),
      isNull()
    );

    verifyNoInteractions(anyObjectProvisioningManager);
  }

  @Test
  @DisplayName(
    "TC15: Stop requested during any object processing with failure reason"
  )
  public void testTC15_DoExecute_StopDuringAnyObjectProcessingWithFailureReason() {
    AnyObject firstAnyObject = mockAnyObject(ANY_OBJECT_KEY, "PRINTER");
    AnyObject secondAnyObject = mockAnyObject("printer-2", "PRINTER");
    PropagationStatus status = mockPropagationStatus(
      "resource-1",
      "any object failure"
    );

    when(
      anySearchDAO.count(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        eq(AnyTypeKind.ANY_OBJECT)
      )
    ).thenReturn((long) AnyDAO.DEFAULT_PAGE_SIZE + 1L);

    when(
      anySearchDAO.search(
        eq(rootRealm),
        eq(true),
        eq(SyncopeConstants.FULL_ADMIN_REALMS),
        any(),
        any(Pageable.class),
        eq(AnyTypeKind.ANY_OBJECT)
      )
    ).thenReturn(List.of(firstAnyObject, secondAnyObject));

    when(
      anyObjectProvisioningManager.provision(
        eq(ANY_OBJECT_KEY),
        eq(resources),
        eq(false),
        isNull()
      )
    ).thenAnswer(invocation -> {
      delegate.stop();
      return List.of(status);
    });

    String result = delegate.runDoExecute();

    /*
     * The first any object is processed and reports its failure reason. The stop
     * request then prevents both the second any object and the next logical page
     * from being processed.
     */
    assertTrue(
      result.contains("PRINTER printer-1"),
      "TC15 failed: the first any object should be reported. Actual result: " +
        result
    );

    assertTrue(
      result.contains("any object failure"),
      "TC15 failed: the any object failure reason should be reported. Actual result: " +
        result
    );

    assertFalse(
      result.contains("PRINTER printer-2"),
      "TC15 failed: the second any object should not be reported. Actual result: " +
        result
    );

    assertTrue(
      result.contains("Stop was requested"),
      "TC15 failed: the stop message should be present. Actual result: " +
        result
    );

    verify(anyObjectProvisioningManager, never()).provision(
      eq("printer-2"),
      eq(resources),
      eq(false),
      isNull()
    );
  }
}

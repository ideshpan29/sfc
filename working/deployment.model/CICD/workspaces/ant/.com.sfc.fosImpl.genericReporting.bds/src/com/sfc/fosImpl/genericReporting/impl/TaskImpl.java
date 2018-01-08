
package com.sfc.fosImpl.genericReporting.impl;

import com.sfc.fosImpl.genericReporting.GenericReportingPackage;
import com.sfc.fosImpl.genericReporting.Task;

import com.sfc.fosImpl.genericReporting.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getFirstOfferTime <em>First Offer Time</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getTaskDuration <em>Task Duration</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getWaitDuration <em>Wait Duration</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getWorkDuration <em>Work Duration</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class TaskImpl extends EObjectImpl implements Task
{
  /**
   * The default value of the '{@link #getProcessInstance() <em>Process Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessInstance()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_INSTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessInstance() <em>Process Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessInstance()
   * @generated
   * @ordered
   */
  protected String processInstance = PROCESS_INSTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstOfferTime() <em>First Offer Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstOfferTime()
   * @generated
   * @ordered
   */
  protected static final String FIRST_OFFER_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstOfferTime() <em>First Offer Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstOfferTime()
   * @generated
   * @ordered
   */
  protected String firstOfferTime = FIRST_OFFER_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskName()
   * @generated
   * @ordered
   */
  protected static final String TASK_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaskName() <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskName()
   * @generated
   * @ordered
   */
  protected String taskName = TASK_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTaskDuration() <em>Task Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDuration()
   * @generated
   * @ordered
   */
  protected static final String TASK_DURATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaskDuration() <em>Task Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskDuration()
   * @generated
   * @ordered
   */
  protected String taskDuration = TASK_DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getWaitDuration() <em>Wait Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaitDuration()
   * @generated
   * @ordered
   */
  protected static final String WAIT_DURATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWaitDuration() <em>Wait Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaitDuration()
   * @generated
   * @ordered
   */
  protected String waitDuration = WAIT_DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getWorkDuration() <em>Work Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkDuration()
   * @generated
   * @ordered
   */
  protected static final String WORK_DURATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWorkDuration() <em>Work Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkDuration()
   * @generated
   * @ordered
   */
  protected String workDuration = WORK_DURATION_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GenericReportingPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessInstance()
  {
    return processInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessInstance(String newProcessInstance)
  {
    String oldProcessInstance = processInstance;
    processInstance = newProcessInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__PROCESS_INSTANCE, oldProcessInstance, processInstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstOfferTime()
  {
    return firstOfferTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstOfferTime(String newFirstOfferTime)
  {
    String oldFirstOfferTime = firstOfferTime;
    firstOfferTime = newFirstOfferTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__FIRST_OFFER_TIME, oldFirstOfferTime, firstOfferTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTaskName()
  {
    return taskName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskName(String newTaskName)
  {
    String oldTaskName = taskName;
    taskName = newTaskName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__TASK_NAME, oldTaskName, taskName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTaskDuration()
  {
    return taskDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskDuration(String newTaskDuration)
  {
    String oldTaskDuration = taskDuration;
    taskDuration = newTaskDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__TASK_DURATION, oldTaskDuration, taskDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWaitDuration()
  {
    return waitDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWaitDuration(String newWaitDuration)
  {
    String oldWaitDuration = waitDuration;
    waitDuration = newWaitDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__WAIT_DURATION, oldWaitDuration, waitDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWorkDuration()
  {
    return workDuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkDuration(String newWorkDuration)
  {
    String oldWorkDuration = workDuration;
    workDuration = newWorkDuration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__WORK_DURATION, oldWorkDuration, workDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.TASK__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GenericReportingPackage.TASK__PROCESS_INSTANCE:
        return getProcessInstance();
      case GenericReportingPackage.TASK__FIRST_OFFER_TIME:
        return getFirstOfferTime();
      case GenericReportingPackage.TASK__TASK_NAME:
        return getTaskName();
      case GenericReportingPackage.TASK__TASK_DURATION:
        return getTaskDuration();
      case GenericReportingPackage.TASK__WAIT_DURATION:
        return getWaitDuration();
      case GenericReportingPackage.TASK__WORK_DURATION:
        return getWorkDuration();
      case GenericReportingPackage.TASK__STATUS:
        return getStatus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GenericReportingPackage.TASK__PROCESS_INSTANCE:
        setProcessInstance((String)newValue);
        return;
      case GenericReportingPackage.TASK__FIRST_OFFER_TIME:
        setFirstOfferTime((String)newValue);
        return;
      case GenericReportingPackage.TASK__TASK_NAME:
        setTaskName((String)newValue);
        return;
      case GenericReportingPackage.TASK__TASK_DURATION:
        setTaskDuration((String)newValue);
        return;
      case GenericReportingPackage.TASK__WAIT_DURATION:
        setWaitDuration((String)newValue);
        return;
      case GenericReportingPackage.TASK__WORK_DURATION:
        setWorkDuration((String)newValue);
        return;
      case GenericReportingPackage.TASK__STATUS:
        setStatus((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GenericReportingPackage.TASK__PROCESS_INSTANCE:
        setProcessInstance(PROCESS_INSTANCE_EDEFAULT);
        return;
      case GenericReportingPackage.TASK__FIRST_OFFER_TIME:
        setFirstOfferTime(FIRST_OFFER_TIME_EDEFAULT);
        return;
      case GenericReportingPackage.TASK__TASK_NAME:
        setTaskName(TASK_NAME_EDEFAULT);
        return;
      case GenericReportingPackage.TASK__TASK_DURATION:
        setTaskDuration(TASK_DURATION_EDEFAULT);
        return;
      case GenericReportingPackage.TASK__WAIT_DURATION:
        setWaitDuration(WAIT_DURATION_EDEFAULT);
        return;
      case GenericReportingPackage.TASK__WORK_DURATION:
        setWorkDuration(WORK_DURATION_EDEFAULT);
        return;
      case GenericReportingPackage.TASK__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GenericReportingPackage.TASK__PROCESS_INSTANCE:
        return PROCESS_INSTANCE_EDEFAULT == null ? processInstance != null : !PROCESS_INSTANCE_EDEFAULT.equals(processInstance);
      case GenericReportingPackage.TASK__FIRST_OFFER_TIME:
        return FIRST_OFFER_TIME_EDEFAULT == null ? firstOfferTime != null : !FIRST_OFFER_TIME_EDEFAULT.equals(firstOfferTime);
      case GenericReportingPackage.TASK__TASK_NAME:
        return TASK_NAME_EDEFAULT == null ? taskName != null : !TASK_NAME_EDEFAULT.equals(taskName);
      case GenericReportingPackage.TASK__TASK_DURATION:
        return TASK_DURATION_EDEFAULT == null ? taskDuration != null : !TASK_DURATION_EDEFAULT.equals(taskDuration);
      case GenericReportingPackage.TASK__WAIT_DURATION:
        return WAIT_DURATION_EDEFAULT == null ? waitDuration != null : !WAIT_DURATION_EDEFAULT.equals(waitDuration);
      case GenericReportingPackage.TASK__WORK_DURATION:
        return WORK_DURATION_EDEFAULT == null ? workDuration != null : !WORK_DURATION_EDEFAULT.equals(workDuration);
      case GenericReportingPackage.TASK__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (processInstance: ");
    result.append(processInstance);
    result.append(", firstOfferTime: ");
    result.append(firstOfferTime);
    result.append(", taskName: ");
    result.append(taskName);
    result.append(", taskDuration: ");
    result.append(taskDuration);
    result.append(", waitDuration: ");
    result.append(waitDuration);
    result.append(", workDuration: ");
    result.append(workDuration);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setProcessInstance(Object value)
  {
    // Call the default set, passing in the converted value
    setProcessInstance(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setFirstOfferTime(Object value)
  {
    // Call the default set, passing in the converted value
    setFirstOfferTime(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setTaskName(Object value)
  {
    // Call the default set, passing in the converted value
    setTaskName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setTaskDuration(Object value)
  {
    // Call the default set, passing in the converted value
    setTaskDuration(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setWaitDuration(Object value)
  {
    // Call the default set, passing in the converted value
    setWaitDuration(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setWorkDuration(Object value)
  {
    // Call the default set, passing in the converted value
    setWorkDuration(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setStatus(Object value)
  {
    // Call the default set, passing in the converted value
    setStatus(BDSTypeConversions.convertToString(value));
  }
} //TaskImpl

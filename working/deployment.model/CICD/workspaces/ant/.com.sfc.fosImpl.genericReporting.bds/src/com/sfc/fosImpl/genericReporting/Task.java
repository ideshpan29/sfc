package com.sfc.fosImpl.genericReporting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getFirstOfferTime <em>First Offer Time</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getTaskDuration <em>Task Duration</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getWaitDuration <em>Wait Duration</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getWorkDuration <em>Work Duration</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Task#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Process Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Instance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Instance</em>' attribute.
   * @see #setProcessInstance(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_ProcessInstance()
   * @model dataType="com.sfc.fosImpl.genericReporting.processInstance_TaskType"
   *        extendedMetaData="kind='element' name='processInstance'"
   * @generated
   */
  String getProcessInstance();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getProcessInstance <em>Process Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Instance</em>' attribute.
   * @see #getProcessInstance()
   * @generated
   */
  void setProcessInstance(String value);

  /**
   * Returns the value of the '<em><b>First Offer Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Offer Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Offer Time</em>' attribute.
   * @see #setFirstOfferTime(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_FirstOfferTime()
   * @model dataType="com.sfc.fosImpl.genericReporting.firstOfferTime_TaskType"
   *        extendedMetaData="kind='element' name='firstOfferTime'"
   * @generated
   */
  String getFirstOfferTime();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getFirstOfferTime <em>First Offer Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Offer Time</em>' attribute.
   * @see #getFirstOfferTime()
   * @generated
   */
  void setFirstOfferTime(String value);

  /**
   * Returns the value of the '<em><b>Task Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Name</em>' attribute.
   * @see #setTaskName(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_TaskName()
   * @model dataType="com.sfc.fosImpl.genericReporting.taskName_TaskType"
   *        extendedMetaData="kind='element' name='taskName'"
   * @generated
   */
  String getTaskName();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getTaskName <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Name</em>' attribute.
   * @see #getTaskName()
   * @generated
   */
  void setTaskName(String value);

  /**
   * Returns the value of the '<em><b>Task Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Duration</em>' attribute.
   * @see #setTaskDuration(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_TaskDuration()
   * @model dataType="com.sfc.fosImpl.genericReporting.taskDuration_TaskType"
   *        extendedMetaData="kind='element' name='taskDuration'"
   * @generated
   */
  String getTaskDuration();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getTaskDuration <em>Task Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Duration</em>' attribute.
   * @see #getTaskDuration()
   * @generated
   */
  void setTaskDuration(String value);

  /**
   * Returns the value of the '<em><b>Wait Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wait Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wait Duration</em>' attribute.
   * @see #setWaitDuration(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_WaitDuration()
   * @model dataType="com.sfc.fosImpl.genericReporting.waitDuration_TaskType"
   *        extendedMetaData="kind='element' name='waitDuration'"
   * @generated
   */
  String getWaitDuration();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getWaitDuration <em>Wait Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wait Duration</em>' attribute.
   * @see #getWaitDuration()
   * @generated
   */
  void setWaitDuration(String value);

  /**
   * Returns the value of the '<em><b>Work Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Work Duration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Work Duration</em>' attribute.
   * @see #setWorkDuration(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_WorkDuration()
   * @model dataType="com.sfc.fosImpl.genericReporting.workDuration_TaskType"
   *        extendedMetaData="kind='element' name='workDuration'"
   * @generated
   */
  String getWorkDuration();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getWorkDuration <em>Work Duration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Work Duration</em>' attribute.
   * @see #getWorkDuration()
   * @generated
   */
  void setWorkDuration(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getTask_Status()
   * @model dataType="com.sfc.fosImpl.genericReporting.status_TaskType"
   *        extendedMetaData="kind='element' name='status'"
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Task#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getProcessInstance()
   * @generated
   */
  void setProcessInstance(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getFirstOfferTime()
   * @generated
   */
  void setFirstOfferTime(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getTaskName()
   * @generated
   */
  void setTaskName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getTaskDuration()
   * @generated
   */
  void setTaskDuration(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getWaitDuration()
   * @generated
   */
  void setWaitDuration(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getWorkDuration()
   * @generated
   */
  void setWorkDuration(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getStatus()
   * @generated
   */
  void setStatus(Object value);

} // Task

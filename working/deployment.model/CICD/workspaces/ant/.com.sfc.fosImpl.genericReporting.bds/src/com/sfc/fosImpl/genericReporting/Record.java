package com.sfc.fosImpl.genericReporting;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getProcessTemplate <em>Process Template</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getStatus <em>Status</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getTime <em>Time</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getSiebelCircuitID <em>Siebel Circuit ID</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getClientName <em>Client Name</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.Record#getCurrentActivity <em>Current Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord()
 * @model extendedMetaData="name='Record' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface Record extends EObject
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
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_ProcessInstance()
   * @model dataType="com.sfc.fosImpl.genericReporting.processInstance_RecordType"
   *        extendedMetaData="kind='element' name='processInstance'"
   * @generated
   */
  String getProcessInstance();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getProcessInstance <em>Process Instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Instance</em>' attribute.
   * @see #getProcessInstance()
   * @generated
   */
  void setProcessInstance(String value);

  /**
   * Returns the value of the '<em><b>Process Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Template</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Template</em>' attribute.
   * @see #setProcessTemplate(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_ProcessTemplate()
   * @model dataType="com.sfc.fosImpl.genericReporting.processTemplate_RecordType"
   *        extendedMetaData="kind='element' name='processTemplate'"
   * @generated
   */
  String getProcessTemplate();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getProcessTemplate <em>Process Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Template</em>' attribute.
   * @see #getProcessTemplate()
   * @generated
   */
  void setProcessTemplate(String value);

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
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_Status()
   * @model dataType="com.sfc.fosImpl.genericReporting.status_RecordType"
   *        extendedMetaData="kind='element' name='status'"
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_Time()
   * @model dataType="com.sfc.fosImpl.genericReporting.time_RecordType"
   *        extendedMetaData="kind='element' name='time'"
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Returns the value of the '<em><b>Siebel Circuit ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Siebel Circuit ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Siebel Circuit ID</em>' attribute.
   * @see #setSiebelCircuitID(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_SiebelCircuitID()
   * @model dataType="com.sfc.fosImpl.genericReporting.siebelCircuitID_RecordType"
   *        extendedMetaData="kind='element' name='siebelCircuitID'"
   * @generated
   */
  String getSiebelCircuitID();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getSiebelCircuitID <em>Siebel Circuit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Siebel Circuit ID</em>' attribute.
   * @see #getSiebelCircuitID()
   * @generated
   */
  void setSiebelCircuitID(String value);

  /**
   * Returns the value of the '<em><b>Client Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client Name</em>' attribute.
   * @see #setClientName(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_ClientName()
   * @model dataType="com.sfc.fosImpl.genericReporting.clientName_RecordType"
   *        extendedMetaData="kind='element' name='clientName'"
   * @generated
   */
  String getClientName();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getClientName <em>Client Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client Name</em>' attribute.
   * @see #getClientName()
   * @generated
   */
  void setClientName(String value);

  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_ProjectName()
   * @model dataType="com.sfc.fosImpl.genericReporting.projectName_RecordType"
   *        extendedMetaData="kind='element' name='projectName'"
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

  /**
   * Returns the value of the '<em><b>Current Activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Activity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Activity</em>' attribute.
   * @see #setCurrentActivity(String)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getRecord_CurrentActivity()
   * @model dataType="com.sfc.fosImpl.genericReporting.currentActivity_RecordType"
   *        extendedMetaData="kind='element' name='currentActivity'"
   * @generated
   */
  String getCurrentActivity();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.Record#getCurrentActivity <em>Current Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Activity</em>' attribute.
   * @see #getCurrentActivity()
   * @generated
   */
  void setCurrentActivity(String value);

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
   * @see #getProcessTemplate()
   * @generated
   */
  void setProcessTemplate(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getStatus()
   * @generated
   */
  void setStatus(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getTime()
   * @generated
   */
  void setTime(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSiebelCircuitID()
   * @generated
   */
  void setSiebelCircuitID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getClientName()
   * @generated
   */
  void setClientName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getCurrentActivity()
   * @generated
   */
  void setCurrentActivity(Object value);

} // Record


package com.sfc.fosImpl.genericReporting.impl;

import com.sfc.fosImpl.genericReporting.GenericReportingPackage;
import com.sfc.fosImpl.genericReporting.Record;

import com.sfc.fosImpl.genericReporting.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getProcessInstance <em>Process Instance</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getProcessTemplate <em>Process Template</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getTime <em>Time</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getSiebelCircuitID <em>Siebel Circuit ID</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getClientName <em>Client Name</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl#getCurrentActivity <em>Current Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class RecordImpl extends EObjectImpl implements Record
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
   * The default value of the '{@link #getProcessTemplate() <em>Process Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessTemplate()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_TEMPLATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessTemplate() <em>Process Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessTemplate()
   * @generated
   * @ordered
   */
  protected String processTemplate = PROCESS_TEMPLATE_EDEFAULT;

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
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final String TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected String time = TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getSiebelCircuitID() <em>Siebel Circuit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiebelCircuitID()
   * @generated
   * @ordered
   */
  protected static final String SIEBEL_CIRCUIT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSiebelCircuitID() <em>Siebel Circuit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiebelCircuitID()
   * @generated
   * @ordered
   */
  protected String siebelCircuitID = SIEBEL_CIRCUIT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getClientName() <em>Client Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientName()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientName() <em>Client Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientName()
   * @generated
   * @ordered
   */
  protected String clientName = CLIENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected String projectName = PROJECT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrentActivity() <em>Current Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentActivity()
   * @generated
   * @ordered
   */
  protected static final String CURRENT_ACTIVITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCurrentActivity() <em>Current Activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentActivity()
   * @generated
   * @ordered
   */
  protected String currentActivity = CURRENT_ACTIVITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecordImpl()
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
    return GenericReportingPackage.Literals.RECORD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__PROCESS_INSTANCE, oldProcessInstance, processInstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessTemplate()
  {
    return processTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessTemplate(String newProcessTemplate)
  {
    String oldProcessTemplate = processTemplate;
    processTemplate = newProcessTemplate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__PROCESS_TEMPLATE, oldProcessTemplate, processTemplate));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(String newTime)
  {
    String oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSiebelCircuitID()
  {
    return siebelCircuitID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSiebelCircuitID(String newSiebelCircuitID)
  {
    String oldSiebelCircuitID = siebelCircuitID;
    siebelCircuitID = newSiebelCircuitID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__SIEBEL_CIRCUIT_ID, oldSiebelCircuitID, siebelCircuitID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClientName()
  {
    return clientName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientName(String newClientName)
  {
    String oldClientName = clientName;
    clientName = newClientName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__CLIENT_NAME, oldClientName, clientName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectName()
  {
    return projectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectName(String newProjectName)
  {
    String oldProjectName = projectName;
    projectName = newProjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__PROJECT_NAME, oldProjectName, projectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCurrentActivity()
  {
    return currentActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentActivity(String newCurrentActivity)
  {
    String oldCurrentActivity = currentActivity;
    currentActivity = newCurrentActivity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenericReportingPackage.RECORD__CURRENT_ACTIVITY, oldCurrentActivity, currentActivity));
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
      case GenericReportingPackage.RECORD__PROCESS_INSTANCE:
        return getProcessInstance();
      case GenericReportingPackage.RECORD__PROCESS_TEMPLATE:
        return getProcessTemplate();
      case GenericReportingPackage.RECORD__STATUS:
        return getStatus();
      case GenericReportingPackage.RECORD__TIME:
        return getTime();
      case GenericReportingPackage.RECORD__SIEBEL_CIRCUIT_ID:
        return getSiebelCircuitID();
      case GenericReportingPackage.RECORD__CLIENT_NAME:
        return getClientName();
      case GenericReportingPackage.RECORD__PROJECT_NAME:
        return getProjectName();
      case GenericReportingPackage.RECORD__CURRENT_ACTIVITY:
        return getCurrentActivity();
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
      case GenericReportingPackage.RECORD__PROCESS_INSTANCE:
        setProcessInstance((String)newValue);
        return;
      case GenericReportingPackage.RECORD__PROCESS_TEMPLATE:
        setProcessTemplate((String)newValue);
        return;
      case GenericReportingPackage.RECORD__STATUS:
        setStatus((String)newValue);
        return;
      case GenericReportingPackage.RECORD__TIME:
        setTime((String)newValue);
        return;
      case GenericReportingPackage.RECORD__SIEBEL_CIRCUIT_ID:
        setSiebelCircuitID((String)newValue);
        return;
      case GenericReportingPackage.RECORD__CLIENT_NAME:
        setClientName((String)newValue);
        return;
      case GenericReportingPackage.RECORD__PROJECT_NAME:
        setProjectName((String)newValue);
        return;
      case GenericReportingPackage.RECORD__CURRENT_ACTIVITY:
        setCurrentActivity((String)newValue);
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
      case GenericReportingPackage.RECORD__PROCESS_INSTANCE:
        setProcessInstance(PROCESS_INSTANCE_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__PROCESS_TEMPLATE:
        setProcessTemplate(PROCESS_TEMPLATE_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__SIEBEL_CIRCUIT_ID:
        setSiebelCircuitID(SIEBEL_CIRCUIT_ID_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__CLIENT_NAME:
        setClientName(CLIENT_NAME_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__PROJECT_NAME:
        setProjectName(PROJECT_NAME_EDEFAULT);
        return;
      case GenericReportingPackage.RECORD__CURRENT_ACTIVITY:
        setCurrentActivity(CURRENT_ACTIVITY_EDEFAULT);
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
      case GenericReportingPackage.RECORD__PROCESS_INSTANCE:
        return PROCESS_INSTANCE_EDEFAULT == null ? processInstance != null : !PROCESS_INSTANCE_EDEFAULT.equals(processInstance);
      case GenericReportingPackage.RECORD__PROCESS_TEMPLATE:
        return PROCESS_TEMPLATE_EDEFAULT == null ? processTemplate != null : !PROCESS_TEMPLATE_EDEFAULT.equals(processTemplate);
      case GenericReportingPackage.RECORD__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case GenericReportingPackage.RECORD__TIME:
        return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
      case GenericReportingPackage.RECORD__SIEBEL_CIRCUIT_ID:
        return SIEBEL_CIRCUIT_ID_EDEFAULT == null ? siebelCircuitID != null : !SIEBEL_CIRCUIT_ID_EDEFAULT.equals(siebelCircuitID);
      case GenericReportingPackage.RECORD__CLIENT_NAME:
        return CLIENT_NAME_EDEFAULT == null ? clientName != null : !CLIENT_NAME_EDEFAULT.equals(clientName);
      case GenericReportingPackage.RECORD__PROJECT_NAME:
        return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
      case GenericReportingPackage.RECORD__CURRENT_ACTIVITY:
        return CURRENT_ACTIVITY_EDEFAULT == null ? currentActivity != null : !CURRENT_ACTIVITY_EDEFAULT.equals(currentActivity);
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
    result.append(", processTemplate: ");
    result.append(processTemplate);
    result.append(", status: ");
    result.append(status);
    result.append(", time: ");
    result.append(time);
    result.append(", siebelCircuitID: ");
    result.append(siebelCircuitID);
    result.append(", clientName: ");
    result.append(clientName);
    result.append(", projectName: ");
    result.append(projectName);
    result.append(", currentActivity: ");
    result.append(currentActivity);
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
  public void setProcessTemplate(Object value)
  {
    // Call the default set, passing in the converted value
    setProcessTemplate(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setStatus(Object value)
  {
    // Call the default set, passing in the converted value
    setStatus(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setTime(Object value)
  {
    // Call the default set, passing in the converted value
    setTime(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setSiebelCircuitID(Object value)
  {
    // Call the default set, passing in the converted value
    setSiebelCircuitID(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setClientName(Object value)
  {
    // Call the default set, passing in the converted value
    setClientName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setProjectName(Object value)
  {
    // Call the default set, passing in the converted value
    setProjectName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setCurrentActivity(Object value)
  {
    // Call the default set, passing in the converted value
    setCurrentActivity(BDSTypeConversions.convertToString(value));
  }
} //RecordImpl

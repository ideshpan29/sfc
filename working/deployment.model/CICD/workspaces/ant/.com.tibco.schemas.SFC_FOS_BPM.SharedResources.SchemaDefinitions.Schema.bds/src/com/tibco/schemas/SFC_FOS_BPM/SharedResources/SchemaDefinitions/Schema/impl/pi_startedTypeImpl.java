
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>pi started Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getProcess_instance <em>Process instance</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getCustomer_name <em>Customer name</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getSibelcircuit_id <em>Sibelcircuit id</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getProjectmanager <em>Projectmanager</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getCur_activity <em>Cur activity</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl#getExec_mills <em>Exec mills</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class pi_startedTypeImpl extends EObjectImpl implements pi_startedType
{
  /**
   * The default value of the '{@link #getProcess_instance() <em>Process instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess_instance()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_INSTANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcess_instance() <em>Process instance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess_instance()
   * @generated
   * @ordered
   */
  protected String process_instance = PROCESS_INSTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getCustomer_name() <em>Customer name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer_name()
   * @generated
   * @ordered
   */
  protected static final String CUSTOMER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCustomer_name() <em>Customer name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomer_name()
   * @generated
   * @ordered
   */
  protected String customer_name = CUSTOMER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSibelcircuit_id() <em>Sibelcircuit id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSibelcircuit_id()
   * @generated
   * @ordered
   */
  protected static final String SIBELCIRCUIT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSibelcircuit_id() <em>Sibelcircuit id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSibelcircuit_id()
   * @generated
   * @ordered
   */
  protected String sibelcircuit_id = SIBELCIRCUIT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getProjectmanager() <em>Projectmanager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectmanager()
   * @generated
   * @ordered
   */
  protected static final String PROJECTMANAGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectmanager() <em>Projectmanager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectmanager()
   * @generated
   * @ordered
   */
  protected String projectmanager = PROJECTMANAGER_EDEFAULT;

  /**
   * The default value of the '{@link #getCur_activity() <em>Cur activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCur_activity()
   * @generated
   * @ordered
   */
  protected static final String CUR_ACTIVITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCur_activity() <em>Cur activity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCur_activity()
   * @generated
   * @ordered
   */
  protected String cur_activity = CUR_ACTIVITY_EDEFAULT;

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
   * The default value of the '{@link #getExec_mills() <em>Exec mills</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExec_mills()
   * @generated
   * @ordered
   */
  protected static final String EXEC_MILLS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExec_mills() <em>Exec mills</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExec_mills()
   * @generated
   * @ordered
   */
  protected String exec_mills = EXEC_MILLS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected pi_startedTypeImpl()
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
    return SchemaPackage.Literals.PI_STARTED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcess_instance()
  {
    return process_instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess_instance(String newProcess_instance)
  {
    String oldProcess_instance = process_instance;
    process_instance = newProcess_instance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__PROCESS_INSTANCE, oldProcess_instance, process_instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCustomer_name()
  {
    return customer_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustomer_name(String newCustomer_name)
  {
    String oldCustomer_name = customer_name;
    customer_name = newCustomer_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__CUSTOMER_NAME, oldCustomer_name, customer_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSibelcircuit_id()
  {
    return sibelcircuit_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSibelcircuit_id(String newSibelcircuit_id)
  {
    String oldSibelcircuit_id = sibelcircuit_id;
    sibelcircuit_id = newSibelcircuit_id;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__SIBELCIRCUIT_ID, oldSibelcircuit_id, sibelcircuit_id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectmanager()
  {
    return projectmanager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectmanager(String newProjectmanager)
  {
    String oldProjectmanager = projectmanager;
    projectmanager = newProjectmanager;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__PROJECTMANAGER, oldProjectmanager, projectmanager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCur_activity()
  {
    return cur_activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCur_activity(String newCur_activity)
  {
    String oldCur_activity = cur_activity;
    cur_activity = newCur_activity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__CUR_ACTIVITY, oldCur_activity, cur_activity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExec_mills()
  {
    return exec_mills;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExec_mills(String newExec_mills)
  {
    String oldExec_mills = exec_mills;
    exec_mills = newExec_mills;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.PI_STARTED_TYPE__EXEC_MILLS, oldExec_mills, exec_mills));
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
      case SchemaPackage.PI_STARTED_TYPE__PROCESS_INSTANCE:
        return getProcess_instance();
      case SchemaPackage.PI_STARTED_TYPE__CUSTOMER_NAME:
        return getCustomer_name();
      case SchemaPackage.PI_STARTED_TYPE__SIBELCIRCUIT_ID:
        return getSibelcircuit_id();
      case SchemaPackage.PI_STARTED_TYPE__PROJECTMANAGER:
        return getProjectmanager();
      case SchemaPackage.PI_STARTED_TYPE__CUR_ACTIVITY:
        return getCur_activity();
      case SchemaPackage.PI_STARTED_TYPE__STATUS:
        return getStatus();
      case SchemaPackage.PI_STARTED_TYPE__EXEC_MILLS:
        return getExec_mills();
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
      case SchemaPackage.PI_STARTED_TYPE__PROCESS_INSTANCE:
        setProcess_instance((String)newValue);
        return;
      case SchemaPackage.PI_STARTED_TYPE__CUSTOMER_NAME:
        setCustomer_name((String)newValue);
        return;
      case SchemaPackage.PI_STARTED_TYPE__SIBELCIRCUIT_ID:
        setSibelcircuit_id((String)newValue);
        return;
      case SchemaPackage.PI_STARTED_TYPE__PROJECTMANAGER:
        setProjectmanager((String)newValue);
        return;
      case SchemaPackage.PI_STARTED_TYPE__CUR_ACTIVITY:
        setCur_activity((String)newValue);
        return;
      case SchemaPackage.PI_STARTED_TYPE__STATUS:
        setStatus((String)newValue);
        return;
      case SchemaPackage.PI_STARTED_TYPE__EXEC_MILLS:
        setExec_mills((String)newValue);
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
      case SchemaPackage.PI_STARTED_TYPE__PROCESS_INSTANCE:
        setProcess_instance(PROCESS_INSTANCE_EDEFAULT);
        return;
      case SchemaPackage.PI_STARTED_TYPE__CUSTOMER_NAME:
        setCustomer_name(CUSTOMER_NAME_EDEFAULT);
        return;
      case SchemaPackage.PI_STARTED_TYPE__SIBELCIRCUIT_ID:
        setSibelcircuit_id(SIBELCIRCUIT_ID_EDEFAULT);
        return;
      case SchemaPackage.PI_STARTED_TYPE__PROJECTMANAGER:
        setProjectmanager(PROJECTMANAGER_EDEFAULT);
        return;
      case SchemaPackage.PI_STARTED_TYPE__CUR_ACTIVITY:
        setCur_activity(CUR_ACTIVITY_EDEFAULT);
        return;
      case SchemaPackage.PI_STARTED_TYPE__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case SchemaPackage.PI_STARTED_TYPE__EXEC_MILLS:
        setExec_mills(EXEC_MILLS_EDEFAULT);
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
      case SchemaPackage.PI_STARTED_TYPE__PROCESS_INSTANCE:
        return PROCESS_INSTANCE_EDEFAULT == null ? process_instance != null : !PROCESS_INSTANCE_EDEFAULT.equals(process_instance);
      case SchemaPackage.PI_STARTED_TYPE__CUSTOMER_NAME:
        return CUSTOMER_NAME_EDEFAULT == null ? customer_name != null : !CUSTOMER_NAME_EDEFAULT.equals(customer_name);
      case SchemaPackage.PI_STARTED_TYPE__SIBELCIRCUIT_ID:
        return SIBELCIRCUIT_ID_EDEFAULT == null ? sibelcircuit_id != null : !SIBELCIRCUIT_ID_EDEFAULT.equals(sibelcircuit_id);
      case SchemaPackage.PI_STARTED_TYPE__PROJECTMANAGER:
        return PROJECTMANAGER_EDEFAULT == null ? projectmanager != null : !PROJECTMANAGER_EDEFAULT.equals(projectmanager);
      case SchemaPackage.PI_STARTED_TYPE__CUR_ACTIVITY:
        return CUR_ACTIVITY_EDEFAULT == null ? cur_activity != null : !CUR_ACTIVITY_EDEFAULT.equals(cur_activity);
      case SchemaPackage.PI_STARTED_TYPE__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case SchemaPackage.PI_STARTED_TYPE__EXEC_MILLS:
        return EXEC_MILLS_EDEFAULT == null ? exec_mills != null : !EXEC_MILLS_EDEFAULT.equals(exec_mills);
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
    result.append(" (process_instance: ");
    result.append(process_instance);
    result.append(", customer_name: ");
    result.append(customer_name);
    result.append(", sibelcircuit_id: ");
    result.append(sibelcircuit_id);
    result.append(", projectmanager: ");
    result.append(projectmanager);
    result.append(", cur_activity: ");
    result.append(cur_activity);
    result.append(", status: ");
    result.append(status);
    result.append(", exec_mills: ");
    result.append(exec_mills);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setProcess_instance(Object value)
  {
    // Call the default set, passing in the converted value
    setProcess_instance(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setCustomer_name(Object value)
  {
    // Call the default set, passing in the converted value
    setCustomer_name(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setSibelcircuit_id(Object value)
  {
    // Call the default set, passing in the converted value
    setSibelcircuit_id(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setProjectmanager(Object value)
  {
    // Call the default set, passing in the converted value
    setProjectmanager(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setCur_activity(Object value)
  {
    // Call the default set, passing in the converted value
    setCur_activity(BDSTypeConversions.convertToString(value));
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
  public void setExec_mills(Object value)
  {
    // Call the default set, passing in the converted value
    setExec_mills(BDSTypeConversions.convertToString(value));
  }
} //pi_startedTypeImpl

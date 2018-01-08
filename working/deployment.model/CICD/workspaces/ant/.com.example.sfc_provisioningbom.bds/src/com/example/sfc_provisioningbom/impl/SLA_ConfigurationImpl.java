
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.EmailRecipient;
import com.example.sfc_provisioningbom.EnableDisable;
import com.example.sfc_provisioningbom.SLA_Configuration;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;
import com.example.sfc_provisioningbom.TaskRecipient;

import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SLA Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getSLALevel <em>SLA Level</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getProcessName <em>Process Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getSLA_Deadline <em>SLA Deadline</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getEmailTo <em>Email To</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getTaskTo <em>Task To</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getEmailConfig <em>Email Config</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getTaskConfig <em>Task Config</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getEnableDisableFlag <em>Enable Disable Flag</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class SLA_ConfigurationImpl extends EObjectImpl implements SLA_Configuration
{
  /**
   * The default value of the '{@link #getSLALevel() <em>SLA Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSLALevel()
   * @generated
   * @ordered
   */
  protected static final BigInteger SLA_LEVEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSLALevel() <em>SLA Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSLALevel()
   * @generated
   * @ordered
   */
  protected BigInteger slaLevel = SLA_LEVEL_EDEFAULT;

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
   * The default value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessName()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessName()
   * @generated
   * @ordered
   */
  protected String processName = PROCESS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getSLA_Deadline() <em>SLA Deadline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSLA_Deadline()
   * @generated
   * @ordered
   */
  protected static final String SLA_DEADLINE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSLA_Deadline() <em>SLA Deadline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSLA_Deadline()
   * @generated
   * @ordered
   */
  protected String slA_Deadline = SLA_DEADLINE_EDEFAULT;

  /**
   * The default value of the '{@link #getEmailTo() <em>Email To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailTo()
   * @generated
   * @ordered
   */
  protected static final EmailRecipient EMAIL_TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmailTo() <em>Email To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailTo()
   * @generated
   * @ordered
   */
  protected EmailRecipient emailTo = EMAIL_TO_EDEFAULT;

  /**
   * The default value of the '{@link #getTaskTo() <em>Task To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskTo()
   * @generated
   * @ordered
   */
  protected static final TaskRecipient TASK_TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaskTo() <em>Task To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskTo()
   * @generated
   * @ordered
   */
  protected TaskRecipient taskTo = TASK_TO_EDEFAULT;

  /**
   * The default value of the '{@link #getEmailConfig() <em>Email Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailConfig()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_CONFIG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmailConfig() <em>Email Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailConfig()
   * @generated
   * @ordered
   */
  protected String emailConfig = EMAIL_CONFIG_EDEFAULT;

  /**
   * The default value of the '{@link #getTaskConfig() <em>Task Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskConfig()
   * @generated
   * @ordered
   */
  protected static final String TASK_CONFIG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaskConfig() <em>Task Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskConfig()
   * @generated
   * @ordered
   */
  protected String taskConfig = TASK_CONFIG_EDEFAULT;

  /**
   * The default value of the '{@link #getEnableDisableFlag() <em>Enable Disable Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnableDisableFlag()
   * @generated
   * @ordered
   */
  protected static final EnableDisable ENABLE_DISABLE_FLAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnableDisableFlag() <em>Enable Disable Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnableDisableFlag()
   * @generated
   * @ordered
   */
  protected EnableDisable enableDisableFlag = ENABLE_DISABLE_FLAG_EDEFAULT;

  /**
   * The default value of the '{@link #getBdsId() <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsId()
   * @generated
   * @ordered
   */
  protected static final Long BDS_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBdsId() <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsId()
   * @generated
   * @ordered
   */
  protected Long bdsId = BDS_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsVersion()
   * @generated
   * @ordered
   */
  protected static final Long BDS_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsVersion()
   * @generated
   * @ordered
   */
  protected Long bdsVersion = BDS_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SLA_ConfigurationImpl()
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
    return Sfc_provisioningbomPackage.Literals.SLA_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getSLALevel()
  {
    return slaLevel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSLALevel(BigInteger newSLALevel)
  {
    BigInteger oldSLALevel = slaLevel;
    slaLevel = newSLALevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_LEVEL, oldSLALevel, slaLevel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_NAME, oldTaskName, taskName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcessName()
  {
    return processName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessName(String newProcessName)
  {
    String oldProcessName = processName;
    processName = newProcessName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__PROCESS_NAME, oldProcessName, processName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSLA_Deadline()
  {
    return slA_Deadline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSLA_Deadline(String newSLA_Deadline)
  {
    String oldSLA_Deadline = slA_Deadline;
    slA_Deadline = newSLA_Deadline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_DEADLINE, oldSLA_Deadline, slA_Deadline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmailRecipient getEmailTo()
  {
    return emailTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmailTo(EmailRecipient newEmailTo)
  {
    EmailRecipient oldEmailTo = emailTo;
    emailTo = newEmailTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_TO, oldEmailTo, emailTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRecipient getTaskTo()
  {
    return taskTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskTo(TaskRecipient newTaskTo)
  {
    TaskRecipient oldTaskTo = taskTo;
    taskTo = newTaskTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_TO, oldTaskTo, taskTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmailConfig()
  {
    return emailConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmailConfig(String newEmailConfig)
  {
    String oldEmailConfig = emailConfig;
    emailConfig = newEmailConfig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_CONFIG, oldEmailConfig, emailConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTaskConfig()
  {
    return taskConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskConfig(String newTaskConfig)
  {
    String oldTaskConfig = taskConfig;
    taskConfig = newTaskConfig;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_CONFIG, oldTaskConfig, taskConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnableDisable getEnableDisableFlag()
  {
    return enableDisableFlag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnableDisableFlag(EnableDisable newEnableDisableFlag)
  {
    EnableDisable oldEnableDisableFlag = enableDisableFlag;
    enableDisableFlag = newEnableDisableFlag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__ENABLE_DISABLE_FLAG, oldEnableDisableFlag, enableDisableFlag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Long getBdsId()
  {
    return bdsId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBdsId(Long newBdsId)
  {
    Long oldBdsId = bdsId;
    bdsId = newBdsId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_ID, oldBdsId, bdsId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Long getBdsVersion()
  {
    return bdsVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBdsVersion(Long newBdsVersion)
  {
    Long oldBdsVersion = bdsVersion;
    bdsVersion = newBdsVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_VERSION, oldBdsVersion, bdsVersion));
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
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_LEVEL:
        return getSLALevel();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_NAME:
        return getTaskName();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__PROCESS_NAME:
        return getProcessName();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_DEADLINE:
        return getSLA_Deadline();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_TO:
        return getEmailTo();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_TO:
        return getTaskTo();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_CONFIG:
        return getEmailConfig();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_CONFIG:
        return getTaskConfig();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__ENABLE_DISABLE_FLAG:
        return getEnableDisableFlag();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_ID:
        return getBdsId();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_VERSION:
        return getBdsVersion();
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
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_LEVEL:
        setSLALevel((BigInteger)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_NAME:
        setTaskName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__PROCESS_NAME:
        setProcessName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_DEADLINE:
        setSLA_Deadline((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_TO:
        setEmailTo((EmailRecipient)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_TO:
        setTaskTo((TaskRecipient)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_CONFIG:
        setEmailConfig((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_CONFIG:
        setTaskConfig((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__ENABLE_DISABLE_FLAG:
        setEnableDisableFlag((EnableDisable)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_ID:
        setBdsId((Long)newValue);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_VERSION:
        setBdsVersion((Long)newValue);
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
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_LEVEL:
        setSLALevel(SLA_LEVEL_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_NAME:
        setTaskName(TASK_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__PROCESS_NAME:
        setProcessName(PROCESS_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_DEADLINE:
        setSLA_Deadline(SLA_DEADLINE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_TO:
        setEmailTo(EMAIL_TO_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_TO:
        setTaskTo(TASK_TO_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_CONFIG:
        setEmailConfig(EMAIL_CONFIG_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_CONFIG:
        setTaskConfig(TASK_CONFIG_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__ENABLE_DISABLE_FLAG:
        setEnableDisableFlag(ENABLE_DISABLE_FLAG_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_ID:
        setBdsId(BDS_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_VERSION:
        setBdsVersion(BDS_VERSION_EDEFAULT);
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
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_LEVEL:
        return SLA_LEVEL_EDEFAULT == null ? slaLevel != null : !SLA_LEVEL_EDEFAULT.equals(slaLevel);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_NAME:
        return TASK_NAME_EDEFAULT == null ? taskName != null : !TASK_NAME_EDEFAULT.equals(taskName);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__PROCESS_NAME:
        return PROCESS_NAME_EDEFAULT == null ? processName != null : !PROCESS_NAME_EDEFAULT.equals(processName);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__SLA_DEADLINE:
        return SLA_DEADLINE_EDEFAULT == null ? slA_Deadline != null : !SLA_DEADLINE_EDEFAULT.equals(slA_Deadline);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_TO:
        return EMAIL_TO_EDEFAULT == null ? emailTo != null : !EMAIL_TO_EDEFAULT.equals(emailTo);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_TO:
        return TASK_TO_EDEFAULT == null ? taskTo != null : !TASK_TO_EDEFAULT.equals(taskTo);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__EMAIL_CONFIG:
        return EMAIL_CONFIG_EDEFAULT == null ? emailConfig != null : !EMAIL_CONFIG_EDEFAULT.equals(emailConfig);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__TASK_CONFIG:
        return TASK_CONFIG_EDEFAULT == null ? taskConfig != null : !TASK_CONFIG_EDEFAULT.equals(taskConfig);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__ENABLE_DISABLE_FLAG:
        return ENABLE_DISABLE_FLAG_EDEFAULT == null ? enableDisableFlag != null : !ENABLE_DISABLE_FLAG_EDEFAULT.equals(enableDisableFlag);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_ID:
        return BDS_ID_EDEFAULT == null ? bdsId != null : !BDS_ID_EDEFAULT.equals(bdsId);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION__BDS_VERSION:
        return BDS_VERSION_EDEFAULT == null ? bdsVersion != null : !BDS_VERSION_EDEFAULT.equals(bdsVersion);
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
    result.append(" (SLALevel: ");
    result.append(slaLevel);
    result.append(", taskName: ");
    result.append(taskName);
    result.append(", processName: ");
    result.append(processName);
    result.append(", SLA_Deadline: ");
    result.append(slA_Deadline);
    result.append(", emailTo: ");
    result.append(emailTo);
    result.append(", taskTo: ");
    result.append(taskTo);
    result.append(", emailConfig: ");
    result.append(emailConfig);
    result.append(", taskConfig: ");
    result.append(taskConfig);
    result.append(", enableDisableFlag: ");
    result.append(enableDisableFlag);
    result.append(", bdsId: ");
    result.append(bdsId);
    result.append(", bdsVersion: ");
    result.append(bdsVersion);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setSLALevel(Object value)
  {
    // Call the default set, passing in the converted value
    setSLALevel(BDSTypeConversions.convertToBigInteger(value));
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
  public void setProcessName(Object value)
  {
    // Call the default set, passing in the converted value
    setProcessName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setSLA_Deadline(Object value)
  {
    // Call the default set, passing in the converted value
    setSLA_Deadline(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setEmailConfig(Object value)
  {
    // Call the default set, passing in the converted value
    setEmailConfig(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setTaskConfig(Object value)
  {
    // Call the default set, passing in the converted value
    setTaskConfig(BDSTypeConversions.convertToString(value));
  }
} //SLA_ConfigurationImpl

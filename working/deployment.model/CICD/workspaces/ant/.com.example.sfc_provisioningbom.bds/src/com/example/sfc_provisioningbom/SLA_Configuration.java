package com.example.sfc_provisioningbom;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getSLALevel <em>SLA Level</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getProcessName <em>Process Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getSLA_Deadline <em>SLA Deadline</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getEmailTo <em>Email To</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskTo <em>Task To</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getEmailConfig <em>Email Config</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskConfig <em>Task Config</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getEnableDisableFlag <em>Enable Disable Flag</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SLA_Configuration#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration()
 * @model extendedMetaData="name='SLA_Configuration' kind='elementOnly'"
 *        annotation="bds isCase='true' summary='SLALevel taskName SLA_Deadline emailTo taskTo emailConfig taskConfig processName enableDisableFlag' label='SLA_Configuration'"
 *        annotation="teneo.jpa value='@Table(uniqueConstraints={@UniqueConstraint(columnNames={\"SLALEVEL\", \"TASKNAME\", \"PROCESSNAME\"})}, name=\"SFC_PROVISIONINGBOM_SLA_CONFIGURATION\")\n@DiscriminatorValue(\"com.example.sfc_provisioningbom.SLA_Configuration\")'"
 * @generated
 */
@SuppressWarnings("all")
public interface SLA_Configuration extends EObject
{
  /**
   * Returns the value of the '<em><b>SLA Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SLA Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SLA Level</em>' attribute.
   * @see #setSLALevel(BigInteger)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_SLALevel()
   * @model dataType="com.example.sfc_provisioningbom.SLALevel_SLA_ConfigurationType" required="true"
   *        extendedMetaData="kind='element' name='SLALevel'"
   *        annotation="bds isCID='true' bomBaseType='Integer' isCompositeCaseIdentifier='true' label='SLALevel'"
   *        annotation="teneo.jpa value='@Column(scale=\"0\", precision=\"31\", name=\"SLALEVEL\", nullable=\"false\")'"
   * @generated
   */
  BigInteger getSLALevel();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getSLALevel <em>SLA Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SLA Level</em>' attribute.
   * @see #getSLALevel()
   * @generated
   */
  void setSLALevel(BigInteger value);

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
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_TaskName()
   * @model dataType="com.example.sfc_provisioningbom.taskName_SLA_ConfigurationType" required="true"
   *        extendedMetaData="kind='element' name='taskName'"
   *        annotation="bds isCID='true' bomBaseType='Text' isCompositeCaseIdentifier='true' label='Task Name'"
   *        annotation="teneo.jpa value='@Column(name=\"TASKNAME\", length=\"400\", nullable=\"false\")'"
   * @generated
   */
  String getTaskName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskName <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Name</em>' attribute.
   * @see #getTaskName()
   * @generated
   */
  void setTaskName(String value);

  /**
   * Returns the value of the '<em><b>Process Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Name</em>' attribute.
   * @see #setProcessName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_ProcessName()
   * @model dataType="com.example.sfc_provisioningbom.processName_SLA_ConfigurationType" required="true"
   *        extendedMetaData="kind='element' name='processName'"
   *        annotation="bds isCID='true' bomBaseType='Text' isCompositeCaseIdentifier='true' label='ProcessName'"
   *        annotation="teneo.jpa value='@Column(name=\"PROCESSNAME\", length=\"400\", nullable=\"false\")'"
   * @generated
   */
  String getProcessName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getProcessName <em>Process Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Name</em>' attribute.
   * @see #getProcessName()
   * @generated
   */
  void setProcessName(String value);

  /**
   * Returns the value of the '<em><b>SLA Deadline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SLA Deadline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SLA Deadline</em>' attribute.
   * @see #setSLA_Deadline(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_SLA_Deadline()
   * @model dataType="com.example.sfc_provisioningbom.SLA_Deadline_SLA_ConfigurationType"
   *        extendedMetaData="kind='element' name='SLA_Deadline'"
   *        annotation="bds bomBaseType='Text' label='SLA_Deadline'"
   *        annotation="teneo.jpa value='@Column(name=\"SLA_DEADLINE\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getSLA_Deadline();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getSLA_Deadline <em>SLA Deadline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SLA Deadline</em>' attribute.
   * @see #getSLA_Deadline()
   * @generated
   */
  void setSLA_Deadline(String value);

  /**
   * Returns the value of the '<em><b>Email To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email To</em>' attribute.
   * @see #setEmailTo(EmailRecipient)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_EmailTo()
   * @model dataType="com.example.sfc_provisioningbom.EmailRecipientObject"
   *        extendedMetaData="kind='element' name='emailTo'"
   *        annotation="bds label='EmailTo'"
   *        annotation="teneo.jpa value='@Column(name=\"EMAILTO\", nullable=\"true\")'"
   * @generated
   */
  EmailRecipient getEmailTo();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getEmailTo <em>Email To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email To</em>' attribute.
   * @see #getEmailTo()
   * @generated
   */
  void setEmailTo(EmailRecipient value);

  /**
   * Returns the value of the '<em><b>Task To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task To</em>' attribute.
   * @see #setTaskTo(TaskRecipient)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_TaskTo()
   * @model dataType="com.example.sfc_provisioningbom.TaskRecipientObject"
   *        extendedMetaData="kind='element' name='taskTo'"
   *        annotation="bds label='TaskTo'"
   *        annotation="teneo.jpa value='@Column(name=\"TASKTO\", nullable=\"true\")'"
   * @generated
   */
  TaskRecipient getTaskTo();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskTo <em>Task To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task To</em>' attribute.
   * @see #getTaskTo()
   * @generated
   */
  void setTaskTo(TaskRecipient value);

  /**
   * Returns the value of the '<em><b>Email Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email Config</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email Config</em>' attribute.
   * @see #setEmailConfig(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_EmailConfig()
   * @model dataType="com.example.sfc_provisioningbom.emailConfig_SLA_ConfigurationType"
   *        extendedMetaData="kind='element' name='emailConfig'"
   *        annotation="bds bomBaseType='Text' label='EmailConfig'"
   *        annotation="teneo.jpa value='@Column(name=\"EMAILCONFIG\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getEmailConfig();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getEmailConfig <em>Email Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email Config</em>' attribute.
   * @see #getEmailConfig()
   * @generated
   */
  void setEmailConfig(String value);

  /**
   * Returns the value of the '<em><b>Task Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Config</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Config</em>' attribute.
   * @see #setTaskConfig(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_TaskConfig()
   * @model dataType="com.example.sfc_provisioningbom.taskConfig_SLA_ConfigurationType"
   *        extendedMetaData="kind='element' name='taskConfig'"
   *        annotation="bds bomBaseType='Text' label='TaskConfig'"
   *        annotation="teneo.jpa value='@Column(name=\"TASKCONFIG\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getTaskConfig();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskConfig <em>Task Config</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Config</em>' attribute.
   * @see #getTaskConfig()
   * @generated
   */
  void setTaskConfig(String value);

  /**
   * Returns the value of the '<em><b>Enable Disable Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enable Disable Flag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable Disable Flag</em>' attribute.
   * @see #setEnableDisableFlag(EnableDisable)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_EnableDisableFlag()
   * @model dataType="com.example.sfc_provisioningbom.EnableDisableObject"
   *        extendedMetaData="kind='element' name='enableDisableFlag'"
   *        annotation="bds isSearchable='true' label='EnableDisableFlag'"
   *        annotation="teneo.jpa value='@Column(name=\"ENABLEDISABLEFLAG\", nullable=\"true\")'"
   * @generated
   */
  EnableDisable getEnableDisableFlag();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getEnableDisableFlag <em>Enable Disable Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable Disable Flag</em>' attribute.
   * @see #getEnableDisableFlag()
   * @generated
   */
  void setEnableDisableFlag(EnableDisable value);

  /**
   * Returns the value of the '<em><b>Bds Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bds Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bds Id</em>' attribute.
   * @see #setBdsId(Long)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_BdsId()
   * @model annotation="teneo.jpa value='@Id\n@Column(name=\"BDS_ID\", nullable=\"false\")\n@GeneratedValue(generator=\"bdsIdGenerator\")'"
   *        annotation="bds isId='true'"
   * @generated
   */
  Long getBdsId();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getBdsId <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bds Id</em>' attribute.
   * @see #getBdsId()
   * @generated
   */
  void setBdsId(Long value);

  /**
   * Returns the value of the '<em><b>Bds Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bds Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bds Version</em>' attribute.
   * @see #setBdsVersion(Long)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSLA_Configuration_BdsVersion()
   * @model annotation="teneo.jpa value='@Column(name=\"BDS_VERSION\")\n@Version'"
   *        annotation="bds isVersion='true'"
   * @generated
   */
  Long getBdsVersion();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SLA_Configuration#getBdsVersion <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bds Version</em>' attribute.
   * @see #getBdsVersion()
   * @generated
   */
  void setBdsVersion(Long value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSLALevel()
   * @generated
   */
  void setSLALevel(Object value);

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
   * @see #getProcessName()
   * @generated
   */
  void setProcessName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSLA_Deadline()
   * @generated
   */
  void setSLA_Deadline(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getEmailConfig()
   * @generated
   */
  void setEmailConfig(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getTaskConfig()
   * @generated
   */
  void setTaskConfig(Object value);

} // SLA_Configuration

package com.example.sfc_provisioningbom;

import com.example.sfc_provisioningbom.bdsutil.BDSFeatureMap;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getAccountTypeElement <em>Account Type Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getBandwidthElement <em>Bandwidth Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getCommentDataElement <em>Comment Data Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsElement <em>Contractor Groups Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getEmailRecipientElement <em>Email Recipient Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getEnableDisableElement <em>Enable Disable Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsElement <em>Equipment Details Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getProcessNameElement <em>Process Name Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelElement <em>Provisioning Data Model Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getServiceStatusElement <em>Service Status Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getServiceTypeElement <em>Service Type Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getSLAConfigurationElement <em>SLA Configuration Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersElement <em>System Parameters Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getTaskRecipientElement <em>Task Recipient Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getTechnologyListElement <em>Technology List Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationElement <em>Tehnical Information Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getCommentDataBDSInternalSerializationElement <em>Comment Data BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsBDSInternalSerializationElement <em>Contractor Groups BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsBDSInternalSerializationElement <em>Equipment Details BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelBDSInternalSerializationElement <em>Provisioning Data Model BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getSLA_ConfigurationBDSInternalSerializationElement <em>SLA Configuration BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersBDSInternalSerializationElement <em>System Parameters BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationBDSInternalSerializationElement <em>Tehnical Information BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@SuppressWarnings("all")
public interface DocumentRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  BDSFeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   * @generated
   */
  EMap<String, String> getXMLNSPrefixMap();

  /**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Account Type Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Type Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Type Element</em>' attribute.
   * @see #setAccountTypeElement(AccountType)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_AccountTypeElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.accountTypeElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='AccountTypeElement' namespace='##targetNamespace'"
   * @generated
   */
  AccountType getAccountTypeElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getAccountTypeElement <em>Account Type Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account Type Element</em>' attribute.
   * @see #getAccountTypeElement()
   * @generated
   */
  void setAccountTypeElement(AccountType value);

  /**
   * Returns the value of the '<em><b>Bandwidth Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bandwidth Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bandwidth Element</em>' attribute.
   * @see #setBandwidthElement(Bandwidth)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_BandwidthElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.bandwidthElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='BandwidthElement' namespace='##targetNamespace'"
   * @generated
   */
  Bandwidth getBandwidthElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getBandwidthElement <em>Bandwidth Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bandwidth Element</em>' attribute.
   * @see #getBandwidthElement()
   * @generated
   */
  void setBandwidthElement(Bandwidth value);

  /**
   * Returns the value of the '<em><b>Comment Data Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment Data Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment Data Element</em>' containment reference.
   * @see #setCommentDataElement(CommentData)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_CommentDataElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CommentDataElement' namespace='##targetNamespace'"
   * @generated
   */
  CommentData getCommentDataElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getCommentDataElement <em>Comment Data Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment Data Element</em>' containment reference.
   * @see #getCommentDataElement()
   * @generated
   */
  void setCommentDataElement(CommentData value);

  /**
   * Returns the value of the '<em><b>Contractor Groups Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contractor Groups Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contractor Groups Element</em>' containment reference.
   * @see #setContractorGroupsElement(ContractorGroups)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ContractorGroupsElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ContractorGroupsElement' namespace='##targetNamespace'"
   * @generated
   */
  ContractorGroups getContractorGroupsElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsElement <em>Contractor Groups Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contractor Groups Element</em>' containment reference.
   * @see #getContractorGroupsElement()
   * @generated
   */
  void setContractorGroupsElement(ContractorGroups value);

  /**
   * Returns the value of the '<em><b>Email Recipient Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email Recipient Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email Recipient Element</em>' attribute.
   * @see #setEmailRecipientElement(EmailRecipient)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_EmailRecipientElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.emailRecipientElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EmailRecipientElement' namespace='##targetNamespace'"
   * @generated
   */
  EmailRecipient getEmailRecipientElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getEmailRecipientElement <em>Email Recipient Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email Recipient Element</em>' attribute.
   * @see #getEmailRecipientElement()
   * @generated
   */
  void setEmailRecipientElement(EmailRecipient value);

  /**
   * Returns the value of the '<em><b>Enable Disable Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enable Disable Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enable Disable Element</em>' attribute.
   * @see #setEnableDisableElement(EnableDisable)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_EnableDisableElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.enableDisableElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EnableDisableElement' namespace='##targetNamespace'"
   * @generated
   */
  EnableDisable getEnableDisableElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getEnableDisableElement <em>Enable Disable Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enable Disable Element</em>' attribute.
   * @see #getEnableDisableElement()
   * @generated
   */
  void setEnableDisableElement(EnableDisable value);

  /**
   * Returns the value of the '<em><b>Equipment Details Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equipment Details Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipment Details Element</em>' containment reference.
   * @see #setEquipmentDetailsElement(EquipmentDetails)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_EquipmentDetailsElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EquipmentDetailsElement' namespace='##targetNamespace'"
   * @generated
   */
  EquipmentDetails getEquipmentDetailsElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsElement <em>Equipment Details Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equipment Details Element</em>' containment reference.
   * @see #getEquipmentDetailsElement()
   * @generated
   */
  void setEquipmentDetailsElement(EquipmentDetails value);

  /**
   * Returns the value of the '<em><b>Process Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process Name Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process Name Element</em>' attribute.
   * @see #setProcessNameElement(ProcessName)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ProcessNameElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.processNameElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ProcessNameElement' namespace='##targetNamespace'"
   * @generated
   */
  ProcessName getProcessNameElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getProcessNameElement <em>Process Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process Name Element</em>' attribute.
   * @see #getProcessNameElement()
   * @generated
   */
  void setProcessNameElement(ProcessName value);

  /**
   * Returns the value of the '<em><b>Provisioning Data Model Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provisioning Data Model Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provisioning Data Model Element</em>' containment reference.
   * @see #setProvisioningDataModelElement(ProvisioningDataModel)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ProvisioningDataModelElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ProvisioningDataModelElement' namespace='##targetNamespace'"
   * @generated
   */
  ProvisioningDataModel getProvisioningDataModelElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelElement <em>Provisioning Data Model Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provisioning Data Model Element</em>' containment reference.
   * @see #getProvisioningDataModelElement()
   * @generated
   */
  void setProvisioningDataModelElement(ProvisioningDataModel value);

  /**
   * Returns the value of the '<em><b>Service Status Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Status Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Status Element</em>' attribute.
   * @see #setServiceStatusElement(ServiceStatus)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ServiceStatusElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.serviceStatusElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ServiceStatusElement' namespace='##targetNamespace'"
   * @generated
   */
  ServiceStatus getServiceStatusElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getServiceStatusElement <em>Service Status Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Status Element</em>' attribute.
   * @see #getServiceStatusElement()
   * @generated
   */
  void setServiceStatusElement(ServiceStatus value);

  /**
   * Returns the value of the '<em><b>Service Type Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Type Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Type Element</em>' attribute.
   * @see #setServiceTypeElement(ServiceType)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ServiceTypeElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.serviceTypeElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ServiceTypeElement' namespace='##targetNamespace'"
   * @generated
   */
  ServiceType getServiceTypeElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getServiceTypeElement <em>Service Type Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Type Element</em>' attribute.
   * @see #getServiceTypeElement()
   * @generated
   */
  void setServiceTypeElement(ServiceType value);

  /**
   * Returns the value of the '<em><b>SLA Configuration Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SLA Configuration Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SLA Configuration Element</em>' containment reference.
   * @see #setSLAConfigurationElement(SLA_Configuration)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_SLAConfigurationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SLA_ConfigurationElement' namespace='##targetNamespace'"
   * @generated
   */
  SLA_Configuration getSLAConfigurationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getSLAConfigurationElement <em>SLA Configuration Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SLA Configuration Element</em>' containment reference.
   * @see #getSLAConfigurationElement()
   * @generated
   */
  void setSLAConfigurationElement(SLA_Configuration value);

  /**
   * Returns the value of the '<em><b>System Parameters Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Parameters Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Parameters Element</em>' containment reference.
   * @see #setSystemParametersElement(SystemParameters)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_SystemParametersElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SystemParametersElement' namespace='##targetNamespace'"
   * @generated
   */
  SystemParameters getSystemParametersElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersElement <em>System Parameters Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Parameters Element</em>' containment reference.
   * @see #getSystemParametersElement()
   * @generated
   */
  void setSystemParametersElement(SystemParameters value);

  /**
   * Returns the value of the '<em><b>Task Recipient Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Recipient Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Recipient Element</em>' attribute.
   * @see #setTaskRecipientElement(TaskRecipient)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_TaskRecipientElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.taskRecipientElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='TaskRecipientElement' namespace='##targetNamespace'"
   * @generated
   */
  TaskRecipient getTaskRecipientElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getTaskRecipientElement <em>Task Recipient Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Recipient Element</em>' attribute.
   * @see #getTaskRecipientElement()
   * @generated
   */
  void setTaskRecipientElement(TaskRecipient value);

  /**
   * Returns the value of the '<em><b>Technology List Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Technology List Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Technology List Element</em>' attribute.
   * @see #setTechnologyListElement(TechnologyList)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_TechnologyListElement()
   * @model unique="false" dataType="com.example.sfc_provisioningbom.technologyListElementType" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='TechnologyListElement' namespace='##targetNamespace'"
   * @generated
   */
  TechnologyList getTechnologyListElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getTechnologyListElement <em>Technology List Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technology List Element</em>' attribute.
   * @see #getTechnologyListElement()
   * @generated
   */
  void setTechnologyListElement(TechnologyList value);

  /**
   * Returns the value of the '<em><b>Tehnical Information Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tehnical Information Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tehnical Information Element</em>' containment reference.
   * @see #setTehnicalInformationElement(TehnicalInformation)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_TehnicalInformationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='TehnicalInformationElement' namespace='##targetNamespace'"
   * @generated
   */
  TehnicalInformation getTehnicalInformationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationElement <em>Tehnical Information Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tehnical Information Element</em>' containment reference.
   * @see #getTehnicalInformationElement()
   * @generated
   */
  void setTehnicalInformationElement(TehnicalInformation value);

  /**
   * Returns the value of the '<em><b>Comment Data BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment Data BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment Data BDS Internal Serialization Element</em>' containment reference.
   * @see #setCommentDataBDSInternalSerializationElement(CommentData)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_CommentDataBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CommentData' namespace='##targetNamespace'"
   * @generated
   */
  CommentData getCommentDataBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getCommentDataBDSInternalSerializationElement <em>Comment Data BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment Data BDS Internal Serialization Element</em>' containment reference.
   * @see #getCommentDataBDSInternalSerializationElement()
   * @generated
   */
  void setCommentDataBDSInternalSerializationElement(CommentData value);

  /**
   * Returns the value of the '<em><b>Contractor Groups BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contractor Groups BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contractor Groups BDS Internal Serialization Element</em>' containment reference.
   * @see #setContractorGroupsBDSInternalSerializationElement(ContractorGroups)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ContractorGroupsBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ContractorGroups' namespace='##targetNamespace'"
   * @generated
   */
  ContractorGroups getContractorGroupsBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsBDSInternalSerializationElement <em>Contractor Groups BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contractor Groups BDS Internal Serialization Element</em>' containment reference.
   * @see #getContractorGroupsBDSInternalSerializationElement()
   * @generated
   */
  void setContractorGroupsBDSInternalSerializationElement(ContractorGroups value);

  /**
   * Returns the value of the '<em><b>Equipment Details BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equipment Details BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipment Details BDS Internal Serialization Element</em>' containment reference.
   * @see #setEquipmentDetailsBDSInternalSerializationElement(EquipmentDetails)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_EquipmentDetailsBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='EquipmentDetails' namespace='##targetNamespace'"
   * @generated
   */
  EquipmentDetails getEquipmentDetailsBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsBDSInternalSerializationElement <em>Equipment Details BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equipment Details BDS Internal Serialization Element</em>' containment reference.
   * @see #getEquipmentDetailsBDSInternalSerializationElement()
   * @generated
   */
  void setEquipmentDetailsBDSInternalSerializationElement(EquipmentDetails value);

  /**
   * Returns the value of the '<em><b>Provisioning Data Model BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Provisioning Data Model BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Provisioning Data Model BDS Internal Serialization Element</em>' containment reference.
   * @see #setProvisioningDataModelBDSInternalSerializationElement(ProvisioningDataModel)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_ProvisioningDataModelBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='ProvisioningDataModel' namespace='##targetNamespace'"
   * @generated
   */
  ProvisioningDataModel getProvisioningDataModelBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelBDSInternalSerializationElement <em>Provisioning Data Model BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Provisioning Data Model BDS Internal Serialization Element</em>' containment reference.
   * @see #getProvisioningDataModelBDSInternalSerializationElement()
   * @generated
   */
  void setProvisioningDataModelBDSInternalSerializationElement(ProvisioningDataModel value);

  /**
   * Returns the value of the '<em><b>SLA Configuration BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SLA Configuration BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SLA Configuration BDS Internal Serialization Element</em>' containment reference.
   * @see #setSLA_ConfigurationBDSInternalSerializationElement(SLA_Configuration)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_SLA_ConfigurationBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SLA_Configuration' namespace='##targetNamespace'"
   * @generated
   */
  SLA_Configuration getSLA_ConfigurationBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getSLA_ConfigurationBDSInternalSerializationElement <em>SLA Configuration BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SLA Configuration BDS Internal Serialization Element</em>' containment reference.
   * @see #getSLA_ConfigurationBDSInternalSerializationElement()
   * @generated
   */
  void setSLA_ConfigurationBDSInternalSerializationElement(SLA_Configuration value);

  /**
   * Returns the value of the '<em><b>System Parameters BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Parameters BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Parameters BDS Internal Serialization Element</em>' containment reference.
   * @see #setSystemParametersBDSInternalSerializationElement(SystemParameters)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_SystemParametersBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SystemParameters' namespace='##targetNamespace'"
   * @generated
   */
  SystemParameters getSystemParametersBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersBDSInternalSerializationElement <em>System Parameters BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System Parameters BDS Internal Serialization Element</em>' containment reference.
   * @see #getSystemParametersBDSInternalSerializationElement()
   * @generated
   */
  void setSystemParametersBDSInternalSerializationElement(SystemParameters value);

  /**
   * Returns the value of the '<em><b>Tehnical Information BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tehnical Information BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tehnical Information BDS Internal Serialization Element</em>' containment reference.
   * @see #setTehnicalInformationBDSInternalSerializationElement(TehnicalInformation)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getDocumentRoot_TehnicalInformationBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='TehnicalInformation' namespace='##targetNamespace'"
   * @generated
   */
  TehnicalInformation getTehnicalInformationBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationBDSInternalSerializationElement <em>Tehnical Information BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tehnical Information BDS Internal Serialization Element</em>' containment reference.
   * @see #getTehnicalInformationBDSInternalSerializationElement()
   * @generated
   */
  void setTehnicalInformationBDSInternalSerializationElement(TehnicalInformation value);

} // DocumentRoot

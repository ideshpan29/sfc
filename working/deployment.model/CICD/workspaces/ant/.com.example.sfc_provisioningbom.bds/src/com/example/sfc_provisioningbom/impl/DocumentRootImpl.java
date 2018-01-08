
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.AccountType;
import com.example.sfc_provisioningbom.Bandwidth;
import com.example.sfc_provisioningbom.CommentData;
import com.example.sfc_provisioningbom.ContractorGroups;
import com.example.sfc_provisioningbom.DocumentRoot;
import com.example.sfc_provisioningbom.EmailRecipient;
import com.example.sfc_provisioningbom.EnableDisable;
import com.example.sfc_provisioningbom.EquipmentDetails;
import com.example.sfc_provisioningbom.ProcessName;
import com.example.sfc_provisioningbom.ProvisioningDataModel;
import com.example.sfc_provisioningbom.SLA_Configuration;
import com.example.sfc_provisioningbom.ServiceStatus;
import com.example.sfc_provisioningbom.ServiceType;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;
import com.example.sfc_provisioningbom.SystemParameters;
import com.example.sfc_provisioningbom.TaskRecipient;
import com.example.sfc_provisioningbom.TechnologyList;
import com.example.sfc_provisioningbom.TehnicalInformation;

import com.example.sfc_provisioningbom.bdsutil.BDSFeatureMap;
import com.example.sfc_provisioningbom.bdsutil.BDSFeatureMapImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getAccountTypeElement <em>Account Type Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getBandwidthElement <em>Bandwidth Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getCommentDataElement <em>Comment Data Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getContractorGroupsElement <em>Contractor Groups Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getEmailRecipientElement <em>Email Recipient Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getEnableDisableElement <em>Enable Disable Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getEquipmentDetailsElement <em>Equipment Details Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getProcessNameElement <em>Process Name Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getProvisioningDataModelElement <em>Provisioning Data Model Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getServiceStatusElement <em>Service Status Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getServiceTypeElement <em>Service Type Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getSLAConfigurationElement <em>SLA Configuration Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getSystemParametersElement <em>System Parameters Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getTaskRecipientElement <em>Task Recipient Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getTechnologyListElement <em>Technology List Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getTehnicalInformationElement <em>Tehnical Information Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getCommentDataBDSInternalSerializationElement <em>Comment Data BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getContractorGroupsBDSInternalSerializationElement <em>Contractor Groups BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getEquipmentDetailsBDSInternalSerializationElement <em>Equipment Details BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getProvisioningDataModelBDSInternalSerializationElement <em>Provisioning Data Model BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getSLA_ConfigurationBDSInternalSerializationElement <em>SLA Configuration BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getSystemParametersBDSInternalSerializationElement <em>System Parameters BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl#getTehnicalInformationBDSInternalSerializationElement <em>Tehnical Information BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * The default value of the '{@link #getAccountTypeElement() <em>Account Type Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountTypeElement()
   * @generated
   * @ordered
   */
  protected static final AccountType ACCOUNT_TYPE_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getBandwidthElement() <em>Bandwidth Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBandwidthElement()
   * @generated
   * @ordered
   */
  protected static final Bandwidth BANDWIDTH_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getEmailRecipientElement() <em>Email Recipient Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailRecipientElement()
   * @generated
   * @ordered
   */
  protected static final EmailRecipient EMAIL_RECIPIENT_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getEnableDisableElement() <em>Enable Disable Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnableDisableElement()
   * @generated
   * @ordered
   */
  protected static final EnableDisable ENABLE_DISABLE_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getProcessNameElement() <em>Process Name Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessNameElement()
   * @generated
   * @ordered
   */
  protected static final ProcessName PROCESS_NAME_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getServiceStatusElement() <em>Service Status Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceStatusElement()
   * @generated
   * @ordered
   */
  protected static final ServiceStatus SERVICE_STATUS_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getServiceTypeElement() <em>Service Type Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceTypeElement()
   * @generated
   * @ordered
   */
  protected static final ServiceType SERVICE_TYPE_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getTaskRecipientElement() <em>Task Recipient Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskRecipientElement()
   * @generated
   * @ordered
   */
  protected static final TaskRecipient TASK_RECIPIENT_ELEMENT_EDEFAULT = null;

  /**
   * The default value of the '{@link #getTechnologyListElement() <em>Technology List Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTechnologyListElement()
   * @generated
   * @ordered
   */
  protected static final TechnologyList TECHNOLOGY_LIST_ELEMENT_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
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
    return Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, Sfc_provisioningbomPackage.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Sfc_provisioningbomPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Sfc_provisioningbomPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountType getAccountTypeElement()
  {
    return (AccountType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccountTypeElement(AccountType newAccountTypeElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT, newAccountTypeElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bandwidth getBandwidthElement()
  {
    return (Bandwidth)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__BANDWIDTH_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBandwidthElement(Bandwidth newBandwidthElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__BANDWIDTH_ELEMENT, newBandwidthElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentData getCommentDataElement()
  {
    return (CommentData)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommentDataElement(CommentData newCommentDataElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT, newCommentDataElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommentDataElement(CommentData newCommentDataElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT, newCommentDataElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractorGroups getContractorGroupsElement()
  {
    return (ContractorGroups)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContractorGroupsElement(ContractorGroups newContractorGroupsElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT, newContractorGroupsElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContractorGroupsElement(ContractorGroups newContractorGroupsElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT, newContractorGroupsElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmailRecipient getEmailRecipientElement()
  {
    return (EmailRecipient)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmailRecipientElement(EmailRecipient newEmailRecipientElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT, newEmailRecipientElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnableDisable getEnableDisableElement()
  {
    return (EnableDisable)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnableDisableElement(EnableDisable newEnableDisableElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT, newEnableDisableElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquipmentDetails getEquipmentDetailsElement()
  {
    return (EquipmentDetails)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEquipmentDetailsElement(EquipmentDetails newEquipmentDetailsElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT, newEquipmentDetailsElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquipmentDetailsElement(EquipmentDetails newEquipmentDetailsElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT, newEquipmentDetailsElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessName getProcessNameElement()
  {
    return (ProcessName)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROCESS_NAME_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessNameElement(ProcessName newProcessNameElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROCESS_NAME_ELEMENT, newProcessNameElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvisioningDataModel getProvisioningDataModelElement()
  {
    return (ProvisioningDataModel)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvisioningDataModelElement(ProvisioningDataModel newProvisioningDataModelElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT, newProvisioningDataModelElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvisioningDataModelElement(ProvisioningDataModel newProvisioningDataModelElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT, newProvisioningDataModelElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceStatus getServiceStatusElement()
  {
    return (ServiceStatus)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceStatusElement(ServiceStatus newServiceStatusElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT, newServiceStatusElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType getServiceTypeElement()
  {
    return (ServiceType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceTypeElement(ServiceType newServiceTypeElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT, newServiceTypeElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLA_Configuration getSLAConfigurationElement()
  {
    return (SLA_Configuration)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSLAConfigurationElement(SLA_Configuration newSLAConfigurationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT, newSLAConfigurationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSLAConfigurationElement(SLA_Configuration newSLAConfigurationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT, newSLAConfigurationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemParameters getSystemParametersElement()
  {
    return (SystemParameters)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystemParametersElement(SystemParameters newSystemParametersElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT, newSystemParametersElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystemParametersElement(SystemParameters newSystemParametersElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT, newSystemParametersElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRecipient getTaskRecipientElement()
  {
    return (TaskRecipient)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskRecipientElement(TaskRecipient newTaskRecipientElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT, newTaskRecipientElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnologyList getTechnologyListElement()
  {
    return (TechnologyList)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTechnologyListElement(TechnologyList newTechnologyListElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT, newTechnologyListElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TehnicalInformation getTehnicalInformationElement()
  {
    return (TehnicalInformation)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTehnicalInformationElement(TehnicalInformation newTehnicalInformationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT, newTehnicalInformationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTehnicalInformationElement(TehnicalInformation newTehnicalInformationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT, newTehnicalInformationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentData getCommentDataBDSInternalSerializationElement()
  {
    return (CommentData)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCommentDataBDSInternalSerializationElement(CommentData newCommentDataBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCommentDataBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommentDataBDSInternalSerializationElement(CommentData newCommentDataBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCommentDataBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractorGroups getContractorGroupsBDSInternalSerializationElement()
  {
    return (ContractorGroups)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContractorGroupsBDSInternalSerializationElement(ContractorGroups newContractorGroupsBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newContractorGroupsBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContractorGroupsBDSInternalSerializationElement(ContractorGroups newContractorGroupsBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newContractorGroupsBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquipmentDetails getEquipmentDetailsBDSInternalSerializationElement()
  {
    return (EquipmentDetails)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEquipmentDetailsBDSInternalSerializationElement(EquipmentDetails newEquipmentDetailsBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newEquipmentDetailsBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEquipmentDetailsBDSInternalSerializationElement(EquipmentDetails newEquipmentDetailsBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newEquipmentDetailsBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvisioningDataModel getProvisioningDataModelBDSInternalSerializationElement()
  {
    return (ProvisioningDataModel)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProvisioningDataModelBDSInternalSerializationElement(ProvisioningDataModel newProvisioningDataModelBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT, newProvisioningDataModelBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvisioningDataModelBDSInternalSerializationElement(ProvisioningDataModel newProvisioningDataModelBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT, newProvisioningDataModelBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLA_Configuration getSLA_ConfigurationBDSInternalSerializationElement()
  {
    return (SLA_Configuration)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSLA_ConfigurationBDSInternalSerializationElement(SLA_Configuration newSLA_ConfigurationBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSLA_ConfigurationBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSLA_ConfigurationBDSInternalSerializationElement(SLA_Configuration newSLA_ConfigurationBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSLA_ConfigurationBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemParameters getSystemParametersBDSInternalSerializationElement()
  {
    return (SystemParameters)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystemParametersBDSInternalSerializationElement(SystemParameters newSystemParametersBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSystemParametersBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystemParametersBDSInternalSerializationElement(SystemParameters newSystemParametersBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSystemParametersBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TehnicalInformation getTehnicalInformationBDSInternalSerializationElement()
  {
    return (TehnicalInformation)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTehnicalInformationBDSInternalSerializationElement(TehnicalInformation newTehnicalInformationBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT, newTehnicalInformationBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTehnicalInformationBDSInternalSerializationElement(TehnicalInformation newTehnicalInformationBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Sfc_provisioningbomPackage.Literals.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT, newTehnicalInformationBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT:
        return basicSetCommentDataElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT:
        return basicSetContractorGroupsElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT:
        return basicSetEquipmentDetailsElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT:
        return basicSetProvisioningDataModelElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT:
        return basicSetSLAConfigurationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT:
        return basicSetSystemParametersElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT:
        return basicSetTehnicalInformationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCommentDataBDSInternalSerializationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetContractorGroupsBDSInternalSerializationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetEquipmentDetailsBDSInternalSerializationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetProvisioningDataModelBDSInternalSerializationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSLA_ConfigurationBDSInternalSerializationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSystemParametersBDSInternalSerializationElement(null, msgs);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetTehnicalInformationBDSInternalSerializationElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT:
        return getAccountTypeElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__BANDWIDTH_ELEMENT:
        return getBandwidthElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT:
        return getCommentDataElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT:
        return getContractorGroupsElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT:
        return getEmailRecipientElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT:
        return getEnableDisableElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT:
        return getEquipmentDetailsElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROCESS_NAME_ELEMENT:
        return getProcessNameElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT:
        return getProvisioningDataModelElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT:
        return getServiceStatusElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT:
        return getServiceTypeElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT:
        return getSLAConfigurationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT:
        return getSystemParametersElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT:
        return getTaskRecipientElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT:
        return getTechnologyListElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT:
        return getTehnicalInformationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCommentDataBDSInternalSerializationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getContractorGroupsBDSInternalSerializationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getEquipmentDetailsBDSInternalSerializationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getProvisioningDataModelBDSInternalSerializationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSLA_ConfigurationBDSInternalSerializationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSystemParametersBDSInternalSerializationElement();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getTehnicalInformationBDSInternalSerializationElement();
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
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT:
        setAccountTypeElement((AccountType)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__BANDWIDTH_ELEMENT:
        setBandwidthElement((Bandwidth)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT:
        setCommentDataElement((CommentData)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT:
        setContractorGroupsElement((ContractorGroups)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT:
        setEmailRecipientElement((EmailRecipient)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT:
        setEnableDisableElement((EnableDisable)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT:
        setEquipmentDetailsElement((EquipmentDetails)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROCESS_NAME_ELEMENT:
        setProcessNameElement((ProcessName)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT:
        setProvisioningDataModelElement((ProvisioningDataModel)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT:
        setServiceStatusElement((ServiceStatus)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT:
        setServiceTypeElement((ServiceType)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT:
        setSLAConfigurationElement((SLA_Configuration)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT:
        setSystemParametersElement((SystemParameters)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT:
        setTaskRecipientElement((TaskRecipient)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT:
        setTechnologyListElement((TechnologyList)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT:
        setTehnicalInformationElement((TehnicalInformation)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCommentDataBDSInternalSerializationElement((CommentData)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setContractorGroupsBDSInternalSerializationElement((ContractorGroups)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setEquipmentDetailsBDSInternalSerializationElement((EquipmentDetails)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setProvisioningDataModelBDSInternalSerializationElement((ProvisioningDataModel)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSLA_ConfigurationBDSInternalSerializationElement((SLA_Configuration)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSystemParametersBDSInternalSerializationElement((SystemParameters)newValue);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setTehnicalInformationBDSInternalSerializationElement((TehnicalInformation)newValue);
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
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT:
        setAccountTypeElement(ACCOUNT_TYPE_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__BANDWIDTH_ELEMENT:
        setBandwidthElement(BANDWIDTH_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT:
        setCommentDataElement((CommentData)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT:
        setContractorGroupsElement((ContractorGroups)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT:
        setEmailRecipientElement(EMAIL_RECIPIENT_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT:
        setEnableDisableElement(ENABLE_DISABLE_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT:
        setEquipmentDetailsElement((EquipmentDetails)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROCESS_NAME_ELEMENT:
        setProcessNameElement(PROCESS_NAME_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT:
        setProvisioningDataModelElement((ProvisioningDataModel)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT:
        setServiceStatusElement(SERVICE_STATUS_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT:
        setServiceTypeElement(SERVICE_TYPE_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT:
        setSLAConfigurationElement((SLA_Configuration)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT:
        setSystemParametersElement((SystemParameters)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT:
        setTaskRecipientElement(TASK_RECIPIENT_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT:
        setTechnologyListElement(TECHNOLOGY_LIST_ELEMENT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT:
        setTehnicalInformationElement((TehnicalInformation)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCommentDataBDSInternalSerializationElement((CommentData)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setContractorGroupsBDSInternalSerializationElement((ContractorGroups)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setEquipmentDetailsBDSInternalSerializationElement((EquipmentDetails)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setProvisioningDataModelBDSInternalSerializationElement((ProvisioningDataModel)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSLA_ConfigurationBDSInternalSerializationElement((SLA_Configuration)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSystemParametersBDSInternalSerializationElement((SystemParameters)null);
        return;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setTehnicalInformationBDSInternalSerializationElement((TehnicalInformation)null);
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
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT:
        return ACCOUNT_TYPE_ELEMENT_EDEFAULT == null ? getAccountTypeElement() != null : !ACCOUNT_TYPE_ELEMENT_EDEFAULT.equals(getAccountTypeElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__BANDWIDTH_ELEMENT:
        return BANDWIDTH_ELEMENT_EDEFAULT == null ? getBandwidthElement() != null : !BANDWIDTH_ELEMENT_EDEFAULT.equals(getBandwidthElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_ELEMENT:
        return getCommentDataElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT:
        return getContractorGroupsElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT:
        return EMAIL_RECIPIENT_ELEMENT_EDEFAULT == null ? getEmailRecipientElement() != null : !EMAIL_RECIPIENT_ELEMENT_EDEFAULT.equals(getEmailRecipientElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT:
        return ENABLE_DISABLE_ELEMENT_EDEFAULT == null ? getEnableDisableElement() != null : !ENABLE_DISABLE_ELEMENT_EDEFAULT.equals(getEnableDisableElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT:
        return getEquipmentDetailsElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROCESS_NAME_ELEMENT:
        return PROCESS_NAME_ELEMENT_EDEFAULT == null ? getProcessNameElement() != null : !PROCESS_NAME_ELEMENT_EDEFAULT.equals(getProcessNameElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT:
        return getProvisioningDataModelElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT:
        return SERVICE_STATUS_ELEMENT_EDEFAULT == null ? getServiceStatusElement() != null : !SERVICE_STATUS_ELEMENT_EDEFAULT.equals(getServiceStatusElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT:
        return SERVICE_TYPE_ELEMENT_EDEFAULT == null ? getServiceTypeElement() != null : !SERVICE_TYPE_ELEMENT_EDEFAULT.equals(getServiceTypeElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT:
        return getSLAConfigurationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT:
        return getSystemParametersElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT:
        return TASK_RECIPIENT_ELEMENT_EDEFAULT == null ? getTaskRecipientElement() != null : !TASK_RECIPIENT_ELEMENT_EDEFAULT.equals(getTaskRecipientElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT:
        return TECHNOLOGY_LIST_ELEMENT_EDEFAULT == null ? getTechnologyListElement() != null : !TECHNOLOGY_LIST_ELEMENT_EDEFAULT.equals(getTechnologyListElement());
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT:
        return getTehnicalInformationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCommentDataBDSInternalSerializationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getContractorGroupsBDSInternalSerializationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getEquipmentDetailsBDSInternalSerializationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getProvisioningDataModelBDSInternalSerializationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSLA_ConfigurationBDSInternalSerializationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSystemParametersBDSInternalSerializationElement() != null;
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getTehnicalInformationBDSInternalSerializationElement() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl

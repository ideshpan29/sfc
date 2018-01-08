

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.sfc_provisioningbom.util;

import com.example.sfc_provisioningbom.*;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage
 * @generated
 */
public class Sfc_provisioningbomValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final Sfc_provisioningbomValidator INSTANCE = new Sfc_provisioningbomValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.example.sfc_provisioningbom";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sfc_provisioningbomValidator()
  {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return Sfc_provisioningbomPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case Sfc_provisioningbomPackage.COMMENT_DATA:
        return validateCommentData((CommentData)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS:
        return validateContractorGroups((ContractorGroups)value, diagnostics, context);
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS:
        return validateEquipmentDetails((EquipmentDetails)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL:
        return validateProvisioningDataModel((ProvisioningDataModel)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION:
        return validateSLA_Configuration((SLA_Configuration)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS:
        return validateSystemParameters((SystemParameters)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION:
        return validateTehnicalInformation((TehnicalInformation)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE:
        return validateAccountType((AccountType)value, diagnostics, context);
      case Sfc_provisioningbomPackage.BANDWIDTH:
        return validateBandwidth((Bandwidth)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT:
        return validateEmailRecipient((EmailRecipient)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE:
        return validateEnableDisable((EnableDisable)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROCESS_NAME:
        return validateProcessName((ProcessName)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_STATUS:
        return validateServiceStatus((ServiceStatus)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_TYPE:
        return validateServiceType((ServiceType)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT:
        return validateTaskRecipient((TaskRecipient)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST:
        return validateTechnologyList((TechnologyList)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE:
        return validateaccountManager_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE_ELEMENT_TYPE:
        return validateaccountTypeElementType((AccountType)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE_OBJECT:
        return validateAccountTypeObject((AccountType)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ADDEDBY_COMMENT_DATA_TYPE:
        return validateaddedby_CommentDataType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ADDRESS_EQUIPMENT_DETAILS_TYPE:
        return validateaddress_EquipmentDetailsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.AGG_POINT_TEHNICAL_INFORMATION_TYPE:
        return validateaggPoint_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.BANDWIDTH_ELEMENT_TYPE:
        return validatebandwidthElementType((Bandwidth)value, diagnostics, context);
      case Sfc_provisioningbomPackage.BANDWIDTH_OBJECT:
        return validateBandwidthObject((Bandwidth)value, diagnostics, context);
      case Sfc_provisioningbomPackage.BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE:
        return validatebuildingID_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE:
        return validatebuildingName_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CARRIER_IP_TEHNICAL_INFORMATION_TYPE:
        return validatecarrierIP_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE:
        return validatecarrierVLAN_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE:
        return validateclientID_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CLIENT_IP_TEHNICAL_INFORMATION_TYPE:
        return validateclientIP_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE:
        return validateclientName_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE:
        return validateclientVLAN_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.COMMENTS_COMMENT_DATA_TYPE:
        return validatecomments_CommentDataType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE:
        return validatecontactPerson_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE:
        return validatecontractorGroupName_ContractorGroupsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE:
        return validatecontractor_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EMAIL_CONFIG_SLA_CONFIGURATION_TYPE:
        return validateemailConfig_SLA_ConfigurationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EMAIL_ID_CONTRACTOR_GROUPS_TYPE:
        return validateemailID_ContractorGroupsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT_ELEMENT_TYPE:
        return validateemailRecipientElementType((EmailRecipient)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT_OBJECT:
        return validateEmailRecipientObject((EmailRecipient)value, diagnostics, context);
      case Sfc_provisioningbomPackage.EMAIL_PROVISIONING_DATA_MODEL_TYPE:
        return validateemail_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE_ELEMENT_TYPE:
        return validateenableDisableElementType((EnableDisable)value, diagnostics, context);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE_OBJECT:
        return validateEnableDisableObject((EnableDisable)value, diagnostics, context);
      case Sfc_provisioningbomPackage.FIRST_NAME_CONTRACTOR_GROUPS_TYPE:
        return validatefirstName_ContractorGroupsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.FLOOR_PROVISIONING_DATA_MODEL_TYPE:
        return validatefloor_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE:
        return validateGPSCoordinates_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.LAST_NAME_CONTRACTOR_GROUPS_TYPE:
        return validatelastName_ContractorGroupsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.LOCATION_PROVISIONING_DATA_MODEL_TYPE:
        return validatelocation_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.LOGIN_NAME_CONTRACTOR_GROUPS_TYPE:
        return validateloginName_ContractorGroupsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.MASTER_USER_CONTRACTOR_GROUPS_TYPE:
        return validatemasterUser_ContractorGroupsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.MOBILE_PROVISIONING_DATA_MODEL_TYPE:
        return validatemobile_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.MODIFIED_BY_TEHNICAL_INFORMATION_TYPE:
        return validatemodifiedBy_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE:
        return validatenotesComments_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PORT_TEHNICAL_INFORMATION_TYPE:
        return validateport_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PORT_TYPE_TEHNICAL_INFORMATION_TYPE:
        return validateportType_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROCESS_NAME_ELEMENT_TYPE:
        return validateprocessNameElementType((ProcessName)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROCESS_NAME_OBJECT:
        return validateProcessNameObject((ProcessName)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROCESS_NAME_SLA_CONFIGURATION_TYPE:
        return validateprocessName_SLA_ConfigurationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE:
        return validateprojectManager_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE:
        return validatepropertyName_SystemParametersType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE:
        return validatepropertyValue_SystemParametersType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE:
        return validateregionView_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SECTOR_PROVISIONING_DATA_MODEL_TYPE:
        return validatesector_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_ELEMENT_TYPE:
        return validateserviceStatusElementType((ServiceStatus)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_OBJECT:
        return validateServiceStatusObject((ServiceStatus)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE:
        return validateserviceStatus_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_TYPE_ELEMENT_TYPE:
        return validateserviceTypeElementType((ServiceType)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SERVICE_TYPE_OBJECT:
        return validateServiceTypeObject((ServiceType)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SFCPOPPE_TEHNICAL_INFORMATION_TYPE:
        return validateSFCPOPPE_TehnicalInformationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE:
        return validatesiebelCircuitID_ProvisioningDataModelType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SLA_DEADLINE_SLA_CONFIGURATION_TYPE:
        return validateSLA_Deadline_SLA_ConfigurationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.SLA_LEVEL_SLA_CONFIGURATION_TYPE:
        return validateSLALevel_SLA_ConfigurationType((BigInteger)value, diagnostics, context);
      case Sfc_provisioningbomPackage.STEP_NAME_COMMENT_DATA_TYPE:
        return validatestepName_CommentDataType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TASK_CONFIG_SLA_CONFIGURATION_TYPE:
        return validatetaskConfig_SLA_ConfigurationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TASK_NAME_SLA_CONFIGURATION_TYPE:
        return validatetaskName_SLA_ConfigurationType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT_ELEMENT_TYPE:
        return validatetaskRecipientElementType((TaskRecipient)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT_OBJECT:
        return validateTaskRecipientObject((TaskRecipient)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST_ELEMENT_TYPE:
        return validatetechnologyListElementType((TechnologyList)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST_OBJECT:
        return validateTechnologyListObject((TechnologyList)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TIME_COMMENT_DATA_TYPE:
        return validatetime_CommentDataType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.TYPE_EQUIPMENT_DETAILS_TYPE:
        return validatetype_EquipmentDetailsType((String)value, diagnostics, context);
      case Sfc_provisioningbomPackage.VLAN_EQUIPMENT_DETAILS_TYPE:
        return validateVLAN_EquipmentDetailsType((String)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateCommentData(CommentData commentData, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(commentData, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateContractorGroups(ContractorGroups contractorGroups, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(contractorGroups, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEquipmentDetails(EquipmentDetails equipmentDetails, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(equipmentDetails, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProvisioningDataModel(ProvisioningDataModel provisioningDataModel, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(provisioningDataModel, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSLA_Configuration(SLA_Configuration slA_Configuration, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(slA_Configuration, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSystemParameters(SystemParameters systemParameters, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(systemParameters, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTehnicalInformation(TehnicalInformation tehnicalInformation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(tehnicalInformation, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccountType(AccountType accountType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBandwidth(Bandwidth bandwidth, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmailRecipient(EmailRecipient emailRecipient, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEnableDisable(EnableDisable enableDisable, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcessName(ProcessName processName, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateServiceStatus(ServiceStatus serviceStatus, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateServiceType(ServiceType serviceType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTaskRecipient(TaskRecipient taskRecipient, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTechnologyList(TechnologyList technologyList, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaccountManager_ProvisioningDataModelType(String accountManager_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateaccountManager_ProvisioningDataModelType_MaxLength(accountManager_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>account Manager Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaccountManager_ProvisioningDataModelType_MaxLength(String accountManager_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = accountManager_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE, accountManager_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaccountTypeElementType(AccountType accountTypeElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAccountTypeObject(AccountType accountTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaddedby_CommentDataType(String addedby_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateaddedby_CommentDataType_MaxLength(addedby_CommentDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>addedby Comment Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaddedby_CommentDataType_MaxLength(String addedby_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = addedby_CommentDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.ADDEDBY_COMMENT_DATA_TYPE, addedby_CommentDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaddress_EquipmentDetailsType(String address_EquipmentDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateaddress_EquipmentDetailsType_MaxLength(address_EquipmentDetailsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>address Equipment Details Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaddress_EquipmentDetailsType_MaxLength(String address_EquipmentDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = address_EquipmentDetailsType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.ADDRESS_EQUIPMENT_DETAILS_TYPE, address_EquipmentDetailsType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaggPoint_TehnicalInformationType(String aggPoint_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateaggPoint_TehnicalInformationType_MaxLength(aggPoint_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>agg Point Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateaggPoint_TehnicalInformationType_MaxLength(String aggPoint_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = aggPoint_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.AGG_POINT_TEHNICAL_INFORMATION_TYPE, aggPoint_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatebandwidthElementType(Bandwidth bandwidthElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBandwidthObject(Bandwidth bandwidthObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatebuildingID_ProvisioningDataModelType(String buildingID_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatebuildingID_ProvisioningDataModelType_MaxLength(buildingID_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>building ID Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatebuildingID_ProvisioningDataModelType_MaxLength(String buildingID_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = buildingID_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE, buildingID_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatebuildingName_ProvisioningDataModelType(String buildingName_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatebuildingName_ProvisioningDataModelType_MaxLength(buildingName_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>building Name Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatebuildingName_ProvisioningDataModelType_MaxLength(String buildingName_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = buildingName_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE, buildingName_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecarrierIP_TehnicalInformationType(String carrierIP_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecarrierIP_TehnicalInformationType_MaxLength(carrierIP_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>carrier IP Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecarrierIP_TehnicalInformationType_MaxLength(String carrierIP_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = carrierIP_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CARRIER_IP_TEHNICAL_INFORMATION_TYPE, carrierIP_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecarrierVLAN_TehnicalInformationType(String carrierVLAN_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecarrierVLAN_TehnicalInformationType_MaxLength(carrierVLAN_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>carrier VLAN Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecarrierVLAN_TehnicalInformationType_MaxLength(String carrierVLAN_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = carrierVLAN_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE, carrierVLAN_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientID_ProvisioningDataModelType(String clientID_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateclientID_ProvisioningDataModelType_MaxLength(clientID_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>client ID Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientID_ProvisioningDataModelType_MaxLength(String clientID_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = clientID_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE, clientID_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientIP_TehnicalInformationType(String clientIP_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateclientIP_TehnicalInformationType_MaxLength(clientIP_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>client IP Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientIP_TehnicalInformationType_MaxLength(String clientIP_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = clientIP_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CLIENT_IP_TEHNICAL_INFORMATION_TYPE, clientIP_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientName_ProvisioningDataModelType(String clientName_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateclientName_ProvisioningDataModelType_MaxLength(clientName_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>client Name Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientName_ProvisioningDataModelType_MaxLength(String clientName_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = clientName_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE, clientName_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientVLAN_TehnicalInformationType(String clientVLAN_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateclientVLAN_TehnicalInformationType_MaxLength(clientVLAN_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>client VLAN Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientVLAN_TehnicalInformationType_MaxLength(String clientVLAN_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = clientVLAN_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE, clientVLAN_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecomments_CommentDataType(String comments_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecomments_CommentDataType_MaxLength(comments_CommentDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>comments Comment Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecomments_CommentDataType_MaxLength(String comments_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = comments_CommentDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.COMMENTS_COMMENT_DATA_TYPE, comments_CommentDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecontactPerson_ProvisioningDataModelType(String contactPerson_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecontactPerson_ProvisioningDataModelType_MaxLength(contactPerson_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>contact Person Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecontactPerson_ProvisioningDataModelType_MaxLength(String contactPerson_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = contactPerson_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE, contactPerson_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecontractorGroupName_ContractorGroupsType(String contractorGroupName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecontractorGroupName_ContractorGroupsType_MaxLength(contractorGroupName_ContractorGroupsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>contractor Group Name Contractor Groups Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecontractorGroupName_ContractorGroupsType_MaxLength(String contractorGroupName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = contractorGroupName_ContractorGroupsType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE, contractorGroupName_ContractorGroupsType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecontractor_ProvisioningDataModelType(String contractor_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecontractor_ProvisioningDataModelType_MaxLength(contractor_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>contractor Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecontractor_ProvisioningDataModelType_MaxLength(String contractor_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = contractor_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE, contractor_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemailConfig_SLA_ConfigurationType(String emailConfig_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateemailConfig_SLA_ConfigurationType_MaxLength(emailConfig_SLA_ConfigurationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>email Config SLA Configuration Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemailConfig_SLA_ConfigurationType_MaxLength(String emailConfig_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = emailConfig_SLA_ConfigurationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.EMAIL_CONFIG_SLA_CONFIGURATION_TYPE, emailConfig_SLA_ConfigurationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemailID_ContractorGroupsType(String emailID_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateemailID_ContractorGroupsType_MaxLength(emailID_ContractorGroupsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>email ID Contractor Groups Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemailID_ContractorGroupsType_MaxLength(String emailID_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = emailID_ContractorGroupsType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.EMAIL_ID_CONTRACTOR_GROUPS_TYPE, emailID_ContractorGroupsType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemailRecipientElementType(EmailRecipient emailRecipientElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEmailRecipientObject(EmailRecipient emailRecipientObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemail_ProvisioningDataModelType(String email_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateemail_ProvisioningDataModelType_MaxLength(email_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>email Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateemail_ProvisioningDataModelType_MaxLength(String email_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = email_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.EMAIL_PROVISIONING_DATA_MODEL_TYPE, email_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateenableDisableElementType(EnableDisable enableDisableElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEnableDisableObject(EnableDisable enableDisableObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefirstName_ContractorGroupsType(String firstName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatefirstName_ContractorGroupsType_MaxLength(firstName_ContractorGroupsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>first Name Contractor Groups Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefirstName_ContractorGroupsType_MaxLength(String firstName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = firstName_ContractorGroupsType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.FIRST_NAME_CONTRACTOR_GROUPS_TYPE, firstName_ContractorGroupsType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefloor_ProvisioningDataModelType(String floor_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatefloor_ProvisioningDataModelType_MaxLength(floor_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>floor Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefloor_ProvisioningDataModelType_MaxLength(String floor_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = floor_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.FLOOR_PROVISIONING_DATA_MODEL_TYPE, floor_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGPSCoordinates_ProvisioningDataModelType(String gpsCoordinates_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateGPSCoordinates_ProvisioningDataModelType_MaxLength(gpsCoordinates_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>GPS Coordinates Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateGPSCoordinates_ProvisioningDataModelType_MaxLength(String gpsCoordinates_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = gpsCoordinates_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE, gpsCoordinates_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatelastName_ContractorGroupsType(String lastName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatelastName_ContractorGroupsType_MaxLength(lastName_ContractorGroupsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>last Name Contractor Groups Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatelastName_ContractorGroupsType_MaxLength(String lastName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = lastName_ContractorGroupsType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.LAST_NAME_CONTRACTOR_GROUPS_TYPE, lastName_ContractorGroupsType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatelocation_ProvisioningDataModelType(String location_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatelocation_ProvisioningDataModelType_MaxLength(location_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>location Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatelocation_ProvisioningDataModelType_MaxLength(String location_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = location_ProvisioningDataModelType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.LOCATION_PROVISIONING_DATA_MODEL_TYPE, location_ProvisioningDataModelType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateloginName_ContractorGroupsType(String loginName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateloginName_ContractorGroupsType_MaxLength(loginName_ContractorGroupsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>login Name Contractor Groups Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateloginName_ContractorGroupsType_MaxLength(String loginName_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = loginName_ContractorGroupsType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.LOGIN_NAME_CONTRACTOR_GROUPS_TYPE, loginName_ContractorGroupsType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemasterUser_ContractorGroupsType(String masterUser_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatemasterUser_ContractorGroupsType_MaxLength(masterUser_ContractorGroupsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>master User Contractor Groups Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemasterUser_ContractorGroupsType_MaxLength(String masterUser_ContractorGroupsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = masterUser_ContractorGroupsType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.MASTER_USER_CONTRACTOR_GROUPS_TYPE, masterUser_ContractorGroupsType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemobile_ProvisioningDataModelType(String mobile_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatemobile_ProvisioningDataModelType_MaxLength(mobile_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>mobile Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemobile_ProvisioningDataModelType_MaxLength(String mobile_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = mobile_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.MOBILE_PROVISIONING_DATA_MODEL_TYPE, mobile_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemodifiedBy_TehnicalInformationType(String modifiedBy_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatemodifiedBy_TehnicalInformationType_MaxLength(modifiedBy_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>modified By Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatemodifiedBy_TehnicalInformationType_MaxLength(String modifiedBy_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = modifiedBy_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.MODIFIED_BY_TEHNICAL_INFORMATION_TYPE, modifiedBy_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatenotesComments_ProvisioningDataModelType(String notesComments_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatenotesComments_ProvisioningDataModelType_MaxLength(notesComments_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>notes Comments Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatenotesComments_ProvisioningDataModelType_MaxLength(String notesComments_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = notesComments_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE, notesComments_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateport_TehnicalInformationType(String port_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateport_TehnicalInformationType_MaxLength(port_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>port Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateport_TehnicalInformationType_MaxLength(String port_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = port_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.PORT_TEHNICAL_INFORMATION_TYPE, port_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateportType_TehnicalInformationType(String portType_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateportType_TehnicalInformationType_MaxLength(portType_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>port Type Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateportType_TehnicalInformationType_MaxLength(String portType_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = portType_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.PORT_TYPE_TEHNICAL_INFORMATION_TYPE, portType_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessNameElementType(ProcessName processNameElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateProcessNameObject(ProcessName processNameObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessName_SLA_ConfigurationType(String processName_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateprocessName_SLA_ConfigurationType_MaxLength(processName_SLA_ConfigurationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>process Name SLA Configuration Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessName_SLA_ConfigurationType_MaxLength(String processName_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = processName_SLA_ConfigurationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.PROCESS_NAME_SLA_CONFIGURATION_TYPE, processName_SLA_ConfigurationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprojectManager_ProvisioningDataModelType(String projectManager_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateprojectManager_ProvisioningDataModelType_MaxLength(projectManager_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>project Manager Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprojectManager_ProvisioningDataModelType_MaxLength(String projectManager_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = projectManager_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE, projectManager_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepropertyName_SystemParametersType(String propertyName_SystemParametersType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatepropertyName_SystemParametersType_MaxLength(propertyName_SystemParametersType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>property Name System Parameters Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepropertyName_SystemParametersType_MaxLength(String propertyName_SystemParametersType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = propertyName_SystemParametersType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE, propertyName_SystemParametersType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepropertyValue_SystemParametersType(String propertyValue_SystemParametersType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatepropertyValue_SystemParametersType_MaxLength(propertyValue_SystemParametersType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>property Value System Parameters Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepropertyValue_SystemParametersType_MaxLength(String propertyValue_SystemParametersType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = propertyValue_SystemParametersType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE, propertyValue_SystemParametersType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateregionView_ProvisioningDataModelType(String regionView_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateregionView_ProvisioningDataModelType_MaxLength(regionView_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>region View Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateregionView_ProvisioningDataModelType_MaxLength(String regionView_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = regionView_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE, regionView_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatesector_ProvisioningDataModelType(String sector_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatesector_ProvisioningDataModelType_MaxLength(sector_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>sector Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatesector_ProvisioningDataModelType_MaxLength(String sector_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = sector_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.SECTOR_PROVISIONING_DATA_MODEL_TYPE, sector_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateserviceStatusElementType(ServiceStatus serviceStatusElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateServiceStatusObject(ServiceStatus serviceStatusObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateserviceStatus_ProvisioningDataModelType(String serviceStatus_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateserviceStatus_ProvisioningDataModelType_MaxLength(serviceStatus_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>service Status Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateserviceStatus_ProvisioningDataModelType_MaxLength(String serviceStatus_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = serviceStatus_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE, serviceStatus_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateserviceTypeElementType(ServiceType serviceTypeElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateServiceTypeObject(ServiceType serviceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSFCPOPPE_TehnicalInformationType(String sfcpoppE_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateSFCPOPPE_TehnicalInformationType_MaxLength(sfcpoppE_TehnicalInformationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>SFCPOPPE Tehnical Information Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSFCPOPPE_TehnicalInformationType_MaxLength(String sfcpoppE_TehnicalInformationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = sfcpoppE_TehnicalInformationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.SFCPOPPE_TEHNICAL_INFORMATION_TYPE, sfcpoppE_TehnicalInformationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatesiebelCircuitID_ProvisioningDataModelType(String siebelCircuitID_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatesiebelCircuitID_ProvisioningDataModelType_MaxLength(siebelCircuitID_ProvisioningDataModelType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>siebel Circuit ID Provisioning Data Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatesiebelCircuitID_ProvisioningDataModelType_MaxLength(String siebelCircuitID_ProvisioningDataModelType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = siebelCircuitID_ProvisioningDataModelType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE, siebelCircuitID_ProvisioningDataModelType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSLA_Deadline_SLA_ConfigurationType(String slA_Deadline_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateSLA_Deadline_SLA_ConfigurationType_MaxLength(slA_Deadline_SLA_ConfigurationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>SLA Deadline SLA Configuration Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSLA_Deadline_SLA_ConfigurationType_MaxLength(String slA_Deadline_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = slA_Deadline_SLA_ConfigurationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.SLA_DEADLINE_SLA_CONFIGURATION_TYPE, slA_Deadline_SLA_ConfigurationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSLALevel_SLA_ConfigurationType(BigInteger slaLevel_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateSLALevel_SLA_ConfigurationType_TotalDigits(slaLevel_SLA_ConfigurationType, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateSLALevel_SLA_ConfigurationType_TotalDigits
   */
  public static final BigInteger SLA_LEVEL_SLA_CONFIGURATION_TYPE__TOTAL_DIGITS__UPPER_BOUND = new BigInteger("10000000000000000000");

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @see #validateSLALevel_SLA_ConfigurationType_TotalDigits
   */
  public static final BigInteger SLA_LEVEL_SLA_CONFIGURATION_TYPE__TOTAL_DIGITS__LOWER_BOUND = new BigInteger("-10000000000000000000");

  /**
   * Validates the TotalDigits constraint of '<em>SLA Level SLA Configuration Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSLALevel_SLA_ConfigurationType_TotalDigits(BigInteger slaLevel_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = slaLevel_SLA_ConfigurationType.compareTo(SLA_LEVEL_SLA_CONFIGURATION_TYPE__TOTAL_DIGITS__LOWER_BOUND) > 0 && slaLevel_SLA_ConfigurationType.compareTo(SLA_LEVEL_SLA_CONFIGURATION_TYPE__TOTAL_DIGITS__UPPER_BOUND) < 0;
    if (!result && diagnostics != null)
      reportTotalDigitsViolation(Sfc_provisioningbomPackage.Literals.SLA_LEVEL_SLA_CONFIGURATION_TYPE, slaLevel_SLA_ConfigurationType, 19, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatestepName_CommentDataType(String stepName_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatestepName_CommentDataType_MaxLength(stepName_CommentDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>step Name Comment Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatestepName_CommentDataType_MaxLength(String stepName_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = stepName_CommentDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.STEP_NAME_COMMENT_DATA_TYPE, stepName_CommentDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskConfig_SLA_ConfigurationType(String taskConfig_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetaskConfig_SLA_ConfigurationType_MaxLength(taskConfig_SLA_ConfigurationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>task Config SLA Configuration Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskConfig_SLA_ConfigurationType_MaxLength(String taskConfig_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = taskConfig_SLA_ConfigurationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.TASK_CONFIG_SLA_CONFIGURATION_TYPE, taskConfig_SLA_ConfigurationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskName_SLA_ConfigurationType(String taskName_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetaskName_SLA_ConfigurationType_MaxLength(taskName_SLA_ConfigurationType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>task Name SLA Configuration Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskName_SLA_ConfigurationType_MaxLength(String taskName_SLA_ConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = taskName_SLA_ConfigurationType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.TASK_NAME_SLA_CONFIGURATION_TYPE, taskName_SLA_ConfigurationType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskRecipientElementType(TaskRecipient taskRecipientElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTaskRecipientObject(TaskRecipient taskRecipientObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetechnologyListElementType(TechnologyList technologyListElementType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTechnologyListObject(TechnologyList technologyListObject, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetime_CommentDataType(String time_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetime_CommentDataType_MaxLength(time_CommentDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>time Comment Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetime_CommentDataType_MaxLength(String time_CommentDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = time_CommentDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.TIME_COMMENT_DATA_TYPE, time_CommentDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetype_EquipmentDetailsType(String type_EquipmentDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetype_EquipmentDetailsType_MaxLength(type_EquipmentDetailsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>type Equipment Details Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetype_EquipmentDetailsType_MaxLength(String type_EquipmentDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = type_EquipmentDetailsType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.TYPE_EQUIPMENT_DETAILS_TYPE, type_EquipmentDetailsType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVLAN_EquipmentDetailsType(String vlaN_EquipmentDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateVLAN_EquipmentDetailsType_MaxLength(vlaN_EquipmentDetailsType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>VLAN Equipment Details Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVLAN_EquipmentDetailsType_MaxLength(String vlaN_EquipmentDetailsType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = vlaN_EquipmentDetailsType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Sfc_provisioningbomPackage.Literals.VLAN_EQUIPMENT_DETAILS_TYPE, vlaN_EquipmentDetailsType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //Sfc_provisioningbomValidator

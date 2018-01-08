

package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.*;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sfc_provisioningbomFactoryImpl extends EFactoryImpl implements Sfc_provisioningbomFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Sfc_provisioningbomFactory init()
  {
    try
    {
      Sfc_provisioningbomFactory theSfc_provisioningbomFactory = (Sfc_provisioningbomFactory)EPackage.Registry.INSTANCE.getEFactory("http://example.com/sfc_provisioningbom"); 
      if (theSfc_provisioningbomFactory != null)
      {
        return theSfc_provisioningbomFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Sfc_provisioningbomFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sfc_provisioningbomFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Sfc_provisioningbomPackage.COMMENT_DATA: return createCommentData();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS: return createContractorGroups();
      case Sfc_provisioningbomPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS: return createEquipmentDetails();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL: return createProvisioningDataModel();
      case Sfc_provisioningbomPackage.SLA_CONFIGURATION: return createSLA_Configuration();
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS: return createSystemParameters();
      case Sfc_provisioningbomPackage.TEHNICAL_INFORMATION: return createTehnicalInformation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE:
        return createAccountTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.BANDWIDTH:
        return createBandwidthFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT:
        return createEmailRecipientFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE:
        return createEnableDisableFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME:
        return createProcessNameFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS:
        return createServiceStatusFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_TYPE:
        return createServiceTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT:
        return createTaskRecipientFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST:
        return createTechnologyListFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE:
        return createaccountManager_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE_ELEMENT_TYPE:
        return createaccountTypeElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE_OBJECT:
        return createAccountTypeObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ADDEDBY_COMMENT_DATA_TYPE:
        return createaddedby_CommentDataTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ADDRESS_EQUIPMENT_DETAILS_TYPE:
        return createaddress_EquipmentDetailsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.AGG_POINT_TEHNICAL_INFORMATION_TYPE:
        return createaggPoint_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.BANDWIDTH_ELEMENT_TYPE:
        return createbandwidthElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.BANDWIDTH_OBJECT:
        return createBandwidthObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE:
        return createbuildingID_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE:
        return createbuildingName_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CARRIER_IP_TEHNICAL_INFORMATION_TYPE:
        return createcarrierIP_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE:
        return createcarrierVLAN_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE:
        return createclientID_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CLIENT_IP_TEHNICAL_INFORMATION_TYPE:
        return createclientIP_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE:
        return createclientName_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE:
        return createclientVLAN_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.COMMENTS_COMMENT_DATA_TYPE:
        return createcomments_CommentDataTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE:
        return createcontactPerson_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE:
        return createcontractorGroupName_ContractorGroupsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE:
        return createcontractor_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.EMAIL_CONFIG_SLA_CONFIGURATION_TYPE:
        return createemailConfig_SLA_ConfigurationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.EMAIL_ID_CONTRACTOR_GROUPS_TYPE:
        return createemailID_ContractorGroupsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT_ELEMENT_TYPE:
        return createemailRecipientElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT_OBJECT:
        return createEmailRecipientObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.EMAIL_PROVISIONING_DATA_MODEL_TYPE:
        return createemail_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE_ELEMENT_TYPE:
        return createenableDisableElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE_OBJECT:
        return createEnableDisableObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.FIRST_NAME_CONTRACTOR_GROUPS_TYPE:
        return createfirstName_ContractorGroupsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.FLOOR_PROVISIONING_DATA_MODEL_TYPE:
        return createfloor_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE:
        return createGPSCoordinates_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.LAST_NAME_CONTRACTOR_GROUPS_TYPE:
        return createlastName_ContractorGroupsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.LOCATION_PROVISIONING_DATA_MODEL_TYPE:
        return createlocation_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.LOGIN_NAME_CONTRACTOR_GROUPS_TYPE:
        return createloginName_ContractorGroupsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.MASTER_USER_CONTRACTOR_GROUPS_TYPE:
        return createmasterUser_ContractorGroupsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.MOBILE_PROVISIONING_DATA_MODEL_TYPE:
        return createmobile_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.MODIFIED_BY_TEHNICAL_INFORMATION_TYPE:
        return createmodifiedBy_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE:
        return createnotesComments_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PORT_TEHNICAL_INFORMATION_TYPE:
        return createport_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PORT_TYPE_TEHNICAL_INFORMATION_TYPE:
        return createportType_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME_ELEMENT_TYPE:
        return createprocessNameElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME_OBJECT:
        return createProcessNameObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME_SLA_CONFIGURATION_TYPE:
        return createprocessName_SLA_ConfigurationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE:
        return createprojectManager_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE:
        return createpropertyName_SystemParametersTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE:
        return createpropertyValue_SystemParametersTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE:
        return createregionView_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SECTOR_PROVISIONING_DATA_MODEL_TYPE:
        return createsector_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_ELEMENT_TYPE:
        return createserviceStatusElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_OBJECT:
        return createServiceStatusObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE:
        return createserviceStatus_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_TYPE_ELEMENT_TYPE:
        return createserviceTypeElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SERVICE_TYPE_OBJECT:
        return createServiceTypeObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SFCPOPPE_TEHNICAL_INFORMATION_TYPE:
        return createSFCPOPPE_TehnicalInformationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE:
        return createsiebelCircuitID_ProvisioningDataModelTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SLA_DEADLINE_SLA_CONFIGURATION_TYPE:
        return createSLA_Deadline_SLA_ConfigurationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.SLA_LEVEL_SLA_CONFIGURATION_TYPE:
        return createSLALevel_SLA_ConfigurationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.STEP_NAME_COMMENT_DATA_TYPE:
        return createstepName_CommentDataTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TASK_CONFIG_SLA_CONFIGURATION_TYPE:
        return createtaskConfig_SLA_ConfigurationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TASK_NAME_SLA_CONFIGURATION_TYPE:
        return createtaskName_SLA_ConfigurationTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT_ELEMENT_TYPE:
        return createtaskRecipientElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT_OBJECT:
        return createTaskRecipientObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST_ELEMENT_TYPE:
        return createtechnologyListElementTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST_OBJECT:
        return createTechnologyListObjectFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TIME_COMMENT_DATA_TYPE:
        return createtime_CommentDataTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.TYPE_EQUIPMENT_DETAILS_TYPE:
        return createtype_EquipmentDetailsTypeFromString(eDataType, initialValue);
      case Sfc_provisioningbomPackage.VLAN_EQUIPMENT_DETAILS_TYPE:
        return createVLAN_EquipmentDetailsTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE:
        return convertAccountTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.BANDWIDTH:
        return convertBandwidthToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT:
        return convertEmailRecipientToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE:
        return convertEnableDisableToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME:
        return convertProcessNameToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS:
        return convertServiceStatusToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_TYPE:
        return convertServiceTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT:
        return convertTaskRecipientToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST:
        return convertTechnologyListToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE:
        return convertaccountManager_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE_ELEMENT_TYPE:
        return convertaccountTypeElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ACCOUNT_TYPE_OBJECT:
        return convertAccountTypeObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ADDEDBY_COMMENT_DATA_TYPE:
        return convertaddedby_CommentDataTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ADDRESS_EQUIPMENT_DETAILS_TYPE:
        return convertaddress_EquipmentDetailsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.AGG_POINT_TEHNICAL_INFORMATION_TYPE:
        return convertaggPoint_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.BANDWIDTH_ELEMENT_TYPE:
        return convertbandwidthElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.BANDWIDTH_OBJECT:
        return convertBandwidthObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE:
        return convertbuildingID_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE:
        return convertbuildingName_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CARRIER_IP_TEHNICAL_INFORMATION_TYPE:
        return convertcarrierIP_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE:
        return convertcarrierVLAN_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE:
        return convertclientID_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CLIENT_IP_TEHNICAL_INFORMATION_TYPE:
        return convertclientIP_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE:
        return convertclientName_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE:
        return convertclientVLAN_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.COMMENTS_COMMENT_DATA_TYPE:
        return convertcomments_CommentDataTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE:
        return convertcontactPerson_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE:
        return convertcontractorGroupName_ContractorGroupsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE:
        return convertcontractor_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.EMAIL_CONFIG_SLA_CONFIGURATION_TYPE:
        return convertemailConfig_SLA_ConfigurationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.EMAIL_ID_CONTRACTOR_GROUPS_TYPE:
        return convertemailID_ContractorGroupsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT_ELEMENT_TYPE:
        return convertemailRecipientElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.EMAIL_RECIPIENT_OBJECT:
        return convertEmailRecipientObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.EMAIL_PROVISIONING_DATA_MODEL_TYPE:
        return convertemail_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE_ELEMENT_TYPE:
        return convertenableDisableElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.ENABLE_DISABLE_OBJECT:
        return convertEnableDisableObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.FIRST_NAME_CONTRACTOR_GROUPS_TYPE:
        return convertfirstName_ContractorGroupsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.FLOOR_PROVISIONING_DATA_MODEL_TYPE:
        return convertfloor_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE:
        return convertGPSCoordinates_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.LAST_NAME_CONTRACTOR_GROUPS_TYPE:
        return convertlastName_ContractorGroupsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.LOCATION_PROVISIONING_DATA_MODEL_TYPE:
        return convertlocation_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.LOGIN_NAME_CONTRACTOR_GROUPS_TYPE:
        return convertloginName_ContractorGroupsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.MASTER_USER_CONTRACTOR_GROUPS_TYPE:
        return convertmasterUser_ContractorGroupsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.MOBILE_PROVISIONING_DATA_MODEL_TYPE:
        return convertmobile_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.MODIFIED_BY_TEHNICAL_INFORMATION_TYPE:
        return convertmodifiedBy_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE:
        return convertnotesComments_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PORT_TEHNICAL_INFORMATION_TYPE:
        return convertport_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PORT_TYPE_TEHNICAL_INFORMATION_TYPE:
        return convertportType_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME_ELEMENT_TYPE:
        return convertprocessNameElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME_OBJECT:
        return convertProcessNameObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROCESS_NAME_SLA_CONFIGURATION_TYPE:
        return convertprocessName_SLA_ConfigurationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE:
        return convertprojectManager_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE:
        return convertpropertyName_SystemParametersTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE:
        return convertpropertyValue_SystemParametersTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE:
        return convertregionView_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SECTOR_PROVISIONING_DATA_MODEL_TYPE:
        return convertsector_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_ELEMENT_TYPE:
        return convertserviceStatusElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_OBJECT:
        return convertServiceStatusObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE:
        return convertserviceStatus_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_TYPE_ELEMENT_TYPE:
        return convertserviceTypeElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SERVICE_TYPE_OBJECT:
        return convertServiceTypeObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SFCPOPPE_TEHNICAL_INFORMATION_TYPE:
        return convertSFCPOPPE_TehnicalInformationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE:
        return convertsiebelCircuitID_ProvisioningDataModelTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SLA_DEADLINE_SLA_CONFIGURATION_TYPE:
        return convertSLA_Deadline_SLA_ConfigurationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.SLA_LEVEL_SLA_CONFIGURATION_TYPE:
        return convertSLALevel_SLA_ConfigurationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.STEP_NAME_COMMENT_DATA_TYPE:
        return convertstepName_CommentDataTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TASK_CONFIG_SLA_CONFIGURATION_TYPE:
        return converttaskConfig_SLA_ConfigurationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TASK_NAME_SLA_CONFIGURATION_TYPE:
        return converttaskName_SLA_ConfigurationTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT_ELEMENT_TYPE:
        return converttaskRecipientElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TASK_RECIPIENT_OBJECT:
        return convertTaskRecipientObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST_ELEMENT_TYPE:
        return converttechnologyListElementTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TECHNOLOGY_LIST_OBJECT:
        return convertTechnologyListObjectToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TIME_COMMENT_DATA_TYPE:
        return converttime_CommentDataTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.TYPE_EQUIPMENT_DETAILS_TYPE:
        return converttype_EquipmentDetailsTypeToString(eDataType, instanceValue);
      case Sfc_provisioningbomPackage.VLAN_EQUIPMENT_DETAILS_TYPE:
        return convertVLAN_EquipmentDetailsTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommentData createCommentData()
  {
    CommentDataImpl commentData = new CommentDataImpl();
    return commentData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractorGroups createContractorGroups()
  {
    ContractorGroupsImpl contractorGroups = new ContractorGroupsImpl();
    return contractorGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EquipmentDetails createEquipmentDetails()
  {
    EquipmentDetailsImpl equipmentDetails = new EquipmentDetailsImpl();
    return equipmentDetails;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvisioningDataModel createProvisioningDataModel()
  {
    ProvisioningDataModelImpl provisioningDataModel = new ProvisioningDataModelImpl();
    return provisioningDataModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SLA_Configuration createSLA_Configuration()
  {
    SLA_ConfigurationImpl slA_Configuration = new SLA_ConfigurationImpl();
    return slA_Configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemParameters createSystemParameters()
  {
    SystemParametersImpl systemParameters = new SystemParametersImpl();
    return systemParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TehnicalInformation createTehnicalInformation()
  {
    TehnicalInformationImpl tehnicalInformation = new TehnicalInformationImpl();
    return tehnicalInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountType createAccountTypeFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    AccountType result = AccountType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccountTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bandwidth createBandwidthFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    Bandwidth result = Bandwidth.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBandwidthToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmailRecipient createEmailRecipientFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    EmailRecipient result = EmailRecipient.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEmailRecipientToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnableDisable createEnableDisableFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    EnableDisable result = EnableDisable.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnableDisableToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessName createProcessNameFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    ProcessName result = ProcessName.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProcessNameToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceStatus createServiceStatusFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    ServiceStatus result = ServiceStatus.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertServiceStatusToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    ServiceType result = ServiceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertServiceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRecipient createTaskRecipientFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    TaskRecipient result = TaskRecipient.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTaskRecipientToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnologyList createTechnologyListFromString(EDataType eDataType, String initialValue)
  {
    // If the argument passed in is null, return null
    if( initialValue == null )
    {
      return null;
    }
    TechnologyList result = TechnologyList.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTechnologyListToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createaccountManager_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertaccountManager_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountType createaccountTypeElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createAccountTypeFromString(Sfc_provisioningbomPackage.Literals.ACCOUNT_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertaccountTypeElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertAccountTypeToString(Sfc_provisioningbomPackage.Literals.ACCOUNT_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountType createAccountTypeObjectFromString(EDataType eDataType, String initialValue)
  {
    return createAccountTypeFromString(Sfc_provisioningbomPackage.Literals.ACCOUNT_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccountTypeObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertAccountTypeToString(Sfc_provisioningbomPackage.Literals.ACCOUNT_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createaddedby_CommentDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertaddedby_CommentDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createaddress_EquipmentDetailsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertaddress_EquipmentDetailsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createaggPoint_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertaggPoint_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bandwidth createbandwidthElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createBandwidthFromString(Sfc_provisioningbomPackage.Literals.BANDWIDTH, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertbandwidthElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertBandwidthToString(Sfc_provisioningbomPackage.Literals.BANDWIDTH, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bandwidth createBandwidthObjectFromString(EDataType eDataType, String initialValue)
  {
    return createBandwidthFromString(Sfc_provisioningbomPackage.Literals.BANDWIDTH, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBandwidthObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertBandwidthToString(Sfc_provisioningbomPackage.Literals.BANDWIDTH, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createbuildingID_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertbuildingID_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createbuildingName_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertbuildingName_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcarrierIP_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcarrierIP_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcarrierVLAN_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcarrierVLAN_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createclientID_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertclientID_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createclientIP_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertclientIP_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createclientName_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertclientName_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createclientVLAN_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertclientVLAN_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcomments_CommentDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcomments_CommentDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcontactPerson_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcontactPerson_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcontractorGroupName_ContractorGroupsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcontractorGroupName_ContractorGroupsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcontractor_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcontractor_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createemailConfig_SLA_ConfigurationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertemailConfig_SLA_ConfigurationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createemailID_ContractorGroupsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertemailID_ContractorGroupsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmailRecipient createemailRecipientElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createEmailRecipientFromString(Sfc_provisioningbomPackage.Literals.EMAIL_RECIPIENT, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertemailRecipientElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertEmailRecipientToString(Sfc_provisioningbomPackage.Literals.EMAIL_RECIPIENT, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmailRecipient createEmailRecipientObjectFromString(EDataType eDataType, String initialValue)
  {
    return createEmailRecipientFromString(Sfc_provisioningbomPackage.Literals.EMAIL_RECIPIENT, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEmailRecipientObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertEmailRecipientToString(Sfc_provisioningbomPackage.Literals.EMAIL_RECIPIENT, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createemail_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertemail_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnableDisable createenableDisableElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createEnableDisableFromString(Sfc_provisioningbomPackage.Literals.ENABLE_DISABLE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertenableDisableElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertEnableDisableToString(Sfc_provisioningbomPackage.Literals.ENABLE_DISABLE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnableDisable createEnableDisableObjectFromString(EDataType eDataType, String initialValue)
  {
    return createEnableDisableFromString(Sfc_provisioningbomPackage.Literals.ENABLE_DISABLE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnableDisableObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertEnableDisableToString(Sfc_provisioningbomPackage.Literals.ENABLE_DISABLE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createfirstName_ContractorGroupsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertfirstName_ContractorGroupsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createfloor_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertfloor_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createGPSCoordinates_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGPSCoordinates_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createlastName_ContractorGroupsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertlastName_ContractorGroupsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createlocation_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertlocation_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createloginName_ContractorGroupsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertloginName_ContractorGroupsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createmasterUser_ContractorGroupsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertmasterUser_ContractorGroupsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createmobile_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertmobile_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createmodifiedBy_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertmodifiedBy_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createnotesComments_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertnotesComments_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createport_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertport_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createportType_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertportType_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessName createprocessNameElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createProcessNameFromString(Sfc_provisioningbomPackage.Literals.PROCESS_NAME, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprocessNameElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertProcessNameToString(Sfc_provisioningbomPackage.Literals.PROCESS_NAME, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessName createProcessNameObjectFromString(EDataType eDataType, String initialValue)
  {
    return createProcessNameFromString(Sfc_provisioningbomPackage.Literals.PROCESS_NAME, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertProcessNameObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertProcessNameToString(Sfc_provisioningbomPackage.Literals.PROCESS_NAME, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createprocessName_SLA_ConfigurationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprocessName_SLA_ConfigurationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createprojectManager_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprojectManager_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createpropertyName_SystemParametersTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertpropertyName_SystemParametersTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createpropertyValue_SystemParametersTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertpropertyValue_SystemParametersTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createregionView_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertregionView_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createsector_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertsector_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceStatus createserviceStatusElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createServiceStatusFromString(Sfc_provisioningbomPackage.Literals.SERVICE_STATUS, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertserviceStatusElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertServiceStatusToString(Sfc_provisioningbomPackage.Literals.SERVICE_STATUS, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceStatus createServiceStatusObjectFromString(EDataType eDataType, String initialValue)
  {
    return createServiceStatusFromString(Sfc_provisioningbomPackage.Literals.SERVICE_STATUS, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertServiceStatusObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertServiceStatusToString(Sfc_provisioningbomPackage.Literals.SERVICE_STATUS, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createserviceStatus_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertserviceStatus_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType createserviceTypeElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createServiceTypeFromString(Sfc_provisioningbomPackage.Literals.SERVICE_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertserviceTypeElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertServiceTypeToString(Sfc_provisioningbomPackage.Literals.SERVICE_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType createServiceTypeObjectFromString(EDataType eDataType, String initialValue)
  {
    return createServiceTypeFromString(Sfc_provisioningbomPackage.Literals.SERVICE_TYPE, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertServiceTypeObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertServiceTypeToString(Sfc_provisioningbomPackage.Literals.SERVICE_TYPE, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createSFCPOPPE_TehnicalInformationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSFCPOPPE_TehnicalInformationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createsiebelCircuitID_ProvisioningDataModelTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertsiebelCircuitID_ProvisioningDataModelTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createSLA_Deadline_SLA_ConfigurationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSLA_Deadline_SLA_ConfigurationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger createSLALevel_SLA_ConfigurationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSLALevel_SLA_ConfigurationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createstepName_CommentDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertstepName_CommentDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtaskConfig_SLA_ConfigurationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttaskConfig_SLA_ConfigurationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtaskName_SLA_ConfigurationTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttaskName_SLA_ConfigurationTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRecipient createtaskRecipientElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createTaskRecipientFromString(Sfc_provisioningbomPackage.Literals.TASK_RECIPIENT, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttaskRecipientElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertTaskRecipientToString(Sfc_provisioningbomPackage.Literals.TASK_RECIPIENT, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskRecipient createTaskRecipientObjectFromString(EDataType eDataType, String initialValue)
  {
    return createTaskRecipientFromString(Sfc_provisioningbomPackage.Literals.TASK_RECIPIENT, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTaskRecipientObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertTaskRecipientToString(Sfc_provisioningbomPackage.Literals.TASK_RECIPIENT, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnologyList createtechnologyListElementTypeFromString(EDataType eDataType, String initialValue)
  {
    return createTechnologyListFromString(Sfc_provisioningbomPackage.Literals.TECHNOLOGY_LIST, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttechnologyListElementTypeToString(EDataType eDataType, Object instanceValue)
  {
    return convertTechnologyListToString(Sfc_provisioningbomPackage.Literals.TECHNOLOGY_LIST, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnologyList createTechnologyListObjectFromString(EDataType eDataType, String initialValue)
  {
    return createTechnologyListFromString(Sfc_provisioningbomPackage.Literals.TECHNOLOGY_LIST, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTechnologyListObjectToString(EDataType eDataType, Object instanceValue)
  {
    return convertTechnologyListToString(Sfc_provisioningbomPackage.Literals.TECHNOLOGY_LIST, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtime_CommentDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttime_CommentDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtype_EquipmentDetailsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttype_EquipmentDetailsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createVLAN_EquipmentDetailsTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVLAN_EquipmentDetailsTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sfc_provisioningbomPackage getSfc_provisioningbomPackage()
  {
    return (Sfc_provisioningbomPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Sfc_provisioningbomPackage getPackage()
  {
    return Sfc_provisioningbomPackage.eINSTANCE;
  }

} //Sfc_provisioningbomFactoryImpl

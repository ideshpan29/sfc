
package com.example.sfc_provisioningbom;

import com.example.sfc_provisioningbom.bdsutil.BDSValidationUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BOMORIGIN::/com.sfc.fosImpl.dataModel/Business Objects/SFC_ProvisioningBOM.bom
 * <!-- end-model-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomFactory
 * @model kind="package"
 *        annotation="bds BomFileName='L/com.sfc.fosImpl.dataModel/Business Objects/SFC_ProvisioningBOM.bom' majorVersion='2' ecoreFormat='1' label='com.example.sfc_provisioningbom'"
 *        annotation="teneo.jpa value='@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")'"
 * @generated
 */
public interface Sfc_provisioningbomPackage extends EPackage
{
  /**
  * Static Member variable that points to the BDS Validation Class
  * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
  * @generated
  */
  BDSValidationUtils bdsValidationUtils = BDSValidationUtils.init();

  /** 
    * Exposes bundle version number, or null if not instantiated via OSGi
    * @generated
    */
  public String getBundleVersion();
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sfc_provisioningbom";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://example.com/sfc_provisioningbom";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sfcProvisioningbom";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Sfc_provisioningbomPackage eINSTANCE = com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl.init();

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.CommentDataImpl <em>Comment Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.CommentDataImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getCommentData()
   * @generated
   */
  int COMMENT_DATA = 0;

  /**
   * The feature id for the '<em><b>Addedby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_DATA__ADDEDBY = 0;

  /**
   * The feature id for the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_DATA__COMMENTS = 1;

  /**
   * The feature id for the '<em><b>Step Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_DATA__STEP_NAME = 2;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_DATA__TIME = 3;

  /**
   * The number of structural features of the '<em>Comment Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_DATA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl <em>Contractor Groups</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.ContractorGroupsImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getContractorGroups()
   * @generated
   */
  int CONTRACTOR_GROUPS = 1;

  /**
   * The feature id for the '<em><b>Login Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__LOGIN_NAME = 0;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__FIRST_NAME = 1;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__LAST_NAME = 2;

  /**
   * The feature id for the '<em><b>Contractor Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME = 3;

  /**
   * The feature id for the '<em><b>Master User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__MASTER_USER = 4;

  /**
   * The feature id for the '<em><b>Email ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__EMAIL_ID = 5;

  /**
   * The feature id for the '<em><b>Bds Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__BDS_ID = 6;

  /**
   * The feature id for the '<em><b>Bds Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS__BDS_VERSION = 7;

  /**
   * The number of structural features of the '<em>Contractor Groups</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTOR_GROUPS_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.DocumentRootImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 2;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Account Type Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Bandwidth Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__BANDWIDTH_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Comment Data Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__COMMENT_DATA_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Contractor Groups Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Email Recipient Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT = 7;

  /**
   * The feature id for the '<em><b>Enable Disable Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Equipment Details Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Process Name Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROCESS_NAME_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Provisioning Data Model Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Service Status Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Service Type Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>SLA Configuration Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>System Parameters Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Task Recipient Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Technology List Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Tehnical Information Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Comment Data BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT = 19;

  /**
   * The feature id for the '<em><b>Contractor Groups BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT = 20;

  /**
   * The feature id for the '<em><b>Equipment Details BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT = 21;

  /**
   * The feature id for the '<em><b>Provisioning Data Model BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT = 22;

  /**
   * The feature id for the '<em><b>SLA Configuration BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT = 23;

  /**
   * The feature id for the '<em><b>System Parameters BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT = 24;

  /**
   * The feature id for the '<em><b>Tehnical Information BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT = 25;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 26;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl <em>Equipment Details</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEquipmentDetails()
   * @generated
   */
  int EQUIPMENT_DETAILS = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_DETAILS__TYPE = 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_DETAILS__ADDRESS = 1;

  /**
   * The feature id for the '<em><b>VLAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_DETAILS__VLAN = 2;

  /**
   * The number of structural features of the '<em>Equipment Details</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIPMENT_DETAILS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl <em>Provisioning Data Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getProvisioningDataModel()
   * @generated
   */
  int PROVISIONING_DATA_MODEL = 4;

  /**
   * The feature id for the '<em><b>Siebel Circuit ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID = 0;

  /**
   * The feature id for the '<em><b>Project Manager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__PROJECT_MANAGER = 1;

  /**
   * The feature id for the '<em><b>Client Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__CLIENT_NAME = 2;

  /**
   * The feature id for the '<em><b>Account Manager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER = 3;

  /**
   * The feature id for the '<em><b>Account</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__ACCOUNT = 4;

  /**
   * The feature id for the '<em><b>Contractor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__CONTRACTOR = 5;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__LOCATION = 6;

  /**
   * The feature id for the '<em><b>Region View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__REGION_VIEW = 7;

  /**
   * The feature id for the '<em><b>Floor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__FLOOR = 8;

  /**
   * The feature id for the '<em><b>Client ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__CLIENT_ID = 9;

  /**
   * The feature id for the '<em><b>Service Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__SERVICE_TYPE = 10;

  /**
   * The feature id for the '<em><b>GPS Coordinates</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__GPS_COORDINATES = 11;

  /**
   * The feature id for the '<em><b>Bandwidthupdown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN = 12;

  /**
   * The feature id for the '<em><b>Technology</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__TECHNOLOGY = 13;

  /**
   * The feature id for the '<em><b>Service Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__SERVICE_STATUS = 14;

  /**
   * The feature id for the '<em><b>Building Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__BUILDING_NAME = 15;

  /**
   * The feature id for the '<em><b>Building ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__BUILDING_ID = 16;

  /**
   * The feature id for the '<em><b>Contact Person</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__CONTACT_PERSON = 17;

  /**
   * The feature id for the '<em><b>Mobile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__MOBILE = 18;

  /**
   * The feature id for the '<em><b>Sector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__SECTOR = 19;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__EMAIL = 20;

  /**
   * The feature id for the '<em><b>Service Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__SERVICE_START = 21;

  /**
   * The feature id for the '<em><b>Service End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__SERVICE_END = 22;

  /**
   * The feature id for the '<em><b>Request Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__REQUEST_DATE = 23;

  /**
   * The feature id for the '<em><b>Install Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__INSTALL_DATE = 24;

  /**
   * The feature id for the '<em><b>Notes Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL__NOTES_COMMENTS = 25;

  /**
   * The number of structural features of the '<em>Provisioning Data Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVISIONING_DATA_MODEL_FEATURE_COUNT = 26;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl <em>SLA Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSLA_Configuration()
   * @generated
   */
  int SLA_CONFIGURATION = 5;

  /**
   * The feature id for the '<em><b>SLA Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__SLA_LEVEL = 0;

  /**
   * The feature id for the '<em><b>Task Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__TASK_NAME = 1;

  /**
   * The feature id for the '<em><b>Process Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__PROCESS_NAME = 2;

  /**
   * The feature id for the '<em><b>SLA Deadline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__SLA_DEADLINE = 3;

  /**
   * The feature id for the '<em><b>Email To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__EMAIL_TO = 4;

  /**
   * The feature id for the '<em><b>Task To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__TASK_TO = 5;

  /**
   * The feature id for the '<em><b>Email Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__EMAIL_CONFIG = 6;

  /**
   * The feature id for the '<em><b>Task Config</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__TASK_CONFIG = 7;

  /**
   * The feature id for the '<em><b>Enable Disable Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__ENABLE_DISABLE_FLAG = 8;

  /**
   * The feature id for the '<em><b>Bds Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__BDS_ID = 9;

  /**
   * The feature id for the '<em><b>Bds Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION__BDS_VERSION = 10;

  /**
   * The number of structural features of the '<em>SLA Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SLA_CONFIGURATION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.SystemParametersImpl <em>System Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.SystemParametersImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSystemParameters()
   * @generated
   */
  int SYSTEM_PARAMETERS = 6;

  /**
   * The feature id for the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PARAMETERS__PROPERTY_NAME = 0;

  /**
   * The feature id for the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PARAMETERS__PROPERTY_VALUE = 1;

  /**
   * The feature id for the '<em><b>Bds Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PARAMETERS__BDS_ID = 2;

  /**
   * The feature id for the '<em><b>Bds Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PARAMETERS__BDS_VERSION = 3;

  /**
   * The number of structural features of the '<em>System Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_PARAMETERS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl <em>Tehnical Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.impl.TehnicalInformationImpl
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTehnicalInformation()
   * @generated
   */
  int TEHNICAL_INFORMATION = 7;

  /**
   * The feature id for the '<em><b>Carrier VLAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__CARRIER_VLAN = 0;

  /**
   * The feature id for the '<em><b>Carrier IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__CARRIER_IP = 1;

  /**
   * The feature id for the '<em><b>Agg Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__AGG_POINT = 2;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__PORT = 3;

  /**
   * The feature id for the '<em><b>Client VLAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__CLIENT_VLAN = 4;

  /**
   * The feature id for the '<em><b>Client IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__CLIENT_IP = 5;

  /**
   * The feature id for the '<em><b>SFCPOPPE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__SFCPOPPE = 6;

  /**
   * The feature id for the '<em><b>Port Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__PORT_TYPE = 7;

  /**
   * The feature id for the '<em><b>Equipment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__EQUIPMENT = 8;

  /**
   * The feature id for the '<em><b>Modified By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__MODIFIED_BY = 9;

  /**
   * The feature id for the '<em><b>Modified Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION__MODIFIED_DATE = 10;

  /**
   * The number of structural features of the '<em>Tehnical Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEHNICAL_INFORMATION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.AccountType <em>Account Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.AccountType
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getAccountType()
   * @generated
   */
  int ACCOUNT_TYPE = 8;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.Bandwidth <em>Bandwidth</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.Bandwidth
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getBandwidth()
   * @generated
   */
  int BANDWIDTH = 9;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.EmailRecipient <em>Email Recipient</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.EmailRecipient
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEmailRecipient()
   * @generated
   */
  int EMAIL_RECIPIENT = 10;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.EnableDisable <em>Enable Disable</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.EnableDisable
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEnableDisable()
   * @generated
   */
  int ENABLE_DISABLE = 11;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.ProcessName <em>Process Name</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ProcessName
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getProcessName()
   * @generated
   */
  int PROCESS_NAME = 12;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.ServiceStatus <em>Service Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ServiceStatus
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceStatus()
   * @generated
   */
  int SERVICE_STATUS = 13;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.ServiceType <em>Service Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ServiceType
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceType()
   * @generated
   */
  int SERVICE_TYPE = 14;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.TaskRecipient <em>Task Recipient</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.TaskRecipient
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTaskRecipient()
   * @generated
   */
  int TASK_RECIPIENT = 15;

  /**
   * The meta object id for the '{@link com.example.sfc_provisioningbom.TechnologyList <em>Technology List</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.TechnologyList
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTechnologyList()
   * @generated
   */
  int TECHNOLOGY_LIST = 16;

  /**
   * The meta object id for the '<em>account Manager Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaccountManager_ProvisioningDataModelType()
   * @generated
   */
  int ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE = 17;

  /**
   * The meta object id for the '<em>account Type Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.AccountType
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaccountTypeElementType()
   * @generated
   */
  int ACCOUNT_TYPE_ELEMENT_TYPE = 18;

  /**
   * The meta object id for the '<em>Account Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.AccountType
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getAccountTypeObject()
   * @generated
   */
  int ACCOUNT_TYPE_OBJECT = 19;

  /**
   * The meta object id for the '<em>addedby Comment Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaddedby_CommentDataType()
   * @generated
   */
  int ADDEDBY_COMMENT_DATA_TYPE = 20;

  /**
   * The meta object id for the '<em>address Equipment Details Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaddress_EquipmentDetailsType()
   * @generated
   */
  int ADDRESS_EQUIPMENT_DETAILS_TYPE = 21;

  /**
   * The meta object id for the '<em>agg Point Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaggPoint_TehnicalInformationType()
   * @generated
   */
  int AGG_POINT_TEHNICAL_INFORMATION_TYPE = 22;

  /**
   * The meta object id for the '<em>bandwidth Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.Bandwidth
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getbandwidthElementType()
   * @generated
   */
  int BANDWIDTH_ELEMENT_TYPE = 23;

  /**
   * The meta object id for the '<em>Bandwidth Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.Bandwidth
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getBandwidthObject()
   * @generated
   */
  int BANDWIDTH_OBJECT = 24;

  /**
   * The meta object id for the '<em>building ID Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getbuildingID_ProvisioningDataModelType()
   * @generated
   */
  int BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE = 25;

  /**
   * The meta object id for the '<em>building Name Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getbuildingName_ProvisioningDataModelType()
   * @generated
   */
  int BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE = 26;

  /**
   * The meta object id for the '<em>carrier IP Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcarrierIP_TehnicalInformationType()
   * @generated
   */
  int CARRIER_IP_TEHNICAL_INFORMATION_TYPE = 27;

  /**
   * The meta object id for the '<em>carrier VLAN Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcarrierVLAN_TehnicalInformationType()
   * @generated
   */
  int CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE = 28;

  /**
   * The meta object id for the '<em>client ID Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientID_ProvisioningDataModelType()
   * @generated
   */
  int CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE = 29;

  /**
   * The meta object id for the '<em>client IP Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientIP_TehnicalInformationType()
   * @generated
   */
  int CLIENT_IP_TEHNICAL_INFORMATION_TYPE = 30;

  /**
   * The meta object id for the '<em>client Name Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientName_ProvisioningDataModelType()
   * @generated
   */
  int CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE = 31;

  /**
   * The meta object id for the '<em>client VLAN Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientVLAN_TehnicalInformationType()
   * @generated
   */
  int CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE = 32;

  /**
   * The meta object id for the '<em>comments Comment Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcomments_CommentDataType()
   * @generated
   */
  int COMMENTS_COMMENT_DATA_TYPE = 33;

  /**
   * The meta object id for the '<em>contact Person Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcontactPerson_ProvisioningDataModelType()
   * @generated
   */
  int CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE = 34;

  /**
   * The meta object id for the '<em>contractor Group Name Contractor Groups Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcontractorGroupName_ContractorGroupsType()
   * @generated
   */
  int CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE = 35;

  /**
   * The meta object id for the '<em>contractor Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcontractor_ProvisioningDataModelType()
   * @generated
   */
  int CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE = 36;

  /**
   * The meta object id for the '<em>email Config SLA Configuration Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemailConfig_SLA_ConfigurationType()
   * @generated
   */
  int EMAIL_CONFIG_SLA_CONFIGURATION_TYPE = 37;

  /**
   * The meta object id for the '<em>email ID Contractor Groups Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemailID_ContractorGroupsType()
   * @generated
   */
  int EMAIL_ID_CONTRACTOR_GROUPS_TYPE = 38;

  /**
   * The meta object id for the '<em>email Recipient Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.EmailRecipient
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemailRecipientElementType()
   * @generated
   */
  int EMAIL_RECIPIENT_ELEMENT_TYPE = 39;

  /**
   * The meta object id for the '<em>Email Recipient Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.EmailRecipient
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEmailRecipientObject()
   * @generated
   */
  int EMAIL_RECIPIENT_OBJECT = 40;

  /**
   * The meta object id for the '<em>email Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemail_ProvisioningDataModelType()
   * @generated
   */
  int EMAIL_PROVISIONING_DATA_MODEL_TYPE = 41;

  /**
   * The meta object id for the '<em>enable Disable Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.EnableDisable
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getenableDisableElementType()
   * @generated
   */
  int ENABLE_DISABLE_ELEMENT_TYPE = 42;

  /**
   * The meta object id for the '<em>Enable Disable Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.EnableDisable
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEnableDisableObject()
   * @generated
   */
  int ENABLE_DISABLE_OBJECT = 43;

  /**
   * The meta object id for the '<em>first Name Contractor Groups Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getfirstName_ContractorGroupsType()
   * @generated
   */
  int FIRST_NAME_CONTRACTOR_GROUPS_TYPE = 44;

  /**
   * The meta object id for the '<em>floor Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getfloor_ProvisioningDataModelType()
   * @generated
   */
  int FLOOR_PROVISIONING_DATA_MODEL_TYPE = 45;

  /**
   * The meta object id for the '<em>GPS Coordinates Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getGPSCoordinates_ProvisioningDataModelType()
   * @generated
   */
  int GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE = 46;

  /**
   * The meta object id for the '<em>last Name Contractor Groups Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getlastName_ContractorGroupsType()
   * @generated
   */
  int LAST_NAME_CONTRACTOR_GROUPS_TYPE = 47;

  /**
   * The meta object id for the '<em>location Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getlocation_ProvisioningDataModelType()
   * @generated
   */
  int LOCATION_PROVISIONING_DATA_MODEL_TYPE = 48;

  /**
   * The meta object id for the '<em>login Name Contractor Groups Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getloginName_ContractorGroupsType()
   * @generated
   */
  int LOGIN_NAME_CONTRACTOR_GROUPS_TYPE = 49;

  /**
   * The meta object id for the '<em>master User Contractor Groups Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getmasterUser_ContractorGroupsType()
   * @generated
   */
  int MASTER_USER_CONTRACTOR_GROUPS_TYPE = 50;

  /**
   * The meta object id for the '<em>mobile Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getmobile_ProvisioningDataModelType()
   * @generated
   */
  int MOBILE_PROVISIONING_DATA_MODEL_TYPE = 51;

  /**
   * The meta object id for the '<em>modified By Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getmodifiedBy_TehnicalInformationType()
   * @generated
   */
  int MODIFIED_BY_TEHNICAL_INFORMATION_TYPE = 52;

  /**
   * The meta object id for the '<em>notes Comments Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getnotesComments_ProvisioningDataModelType()
   * @generated
   */
  int NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE = 53;

  /**
   * The meta object id for the '<em>port Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getport_TehnicalInformationType()
   * @generated
   */
  int PORT_TEHNICAL_INFORMATION_TYPE = 54;

  /**
   * The meta object id for the '<em>port Type Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getportType_TehnicalInformationType()
   * @generated
   */
  int PORT_TYPE_TEHNICAL_INFORMATION_TYPE = 55;

  /**
   * The meta object id for the '<em>process Name Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ProcessName
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getprocessNameElementType()
   * @generated
   */
  int PROCESS_NAME_ELEMENT_TYPE = 56;

  /**
   * The meta object id for the '<em>Process Name Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ProcessName
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getProcessNameObject()
   * @generated
   */
  int PROCESS_NAME_OBJECT = 57;

  /**
   * The meta object id for the '<em>process Name SLA Configuration Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getprocessName_SLA_ConfigurationType()
   * @generated
   */
  int PROCESS_NAME_SLA_CONFIGURATION_TYPE = 58;

  /**
   * The meta object id for the '<em>project Manager Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getprojectManager_ProvisioningDataModelType()
   * @generated
   */
  int PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE = 59;

  /**
   * The meta object id for the '<em>property Name System Parameters Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getpropertyName_SystemParametersType()
   * @generated
   */
  int PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE = 60;

  /**
   * The meta object id for the '<em>property Value System Parameters Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getpropertyValue_SystemParametersType()
   * @generated
   */
  int PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE = 61;

  /**
   * The meta object id for the '<em>region View Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getregionView_ProvisioningDataModelType()
   * @generated
   */
  int REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE = 62;

  /**
   * The meta object id for the '<em>sector Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getsector_ProvisioningDataModelType()
   * @generated
   */
  int SECTOR_PROVISIONING_DATA_MODEL_TYPE = 63;

  /**
   * The meta object id for the '<em>service Status Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ServiceStatus
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getserviceStatusElementType()
   * @generated
   */
  int SERVICE_STATUS_ELEMENT_TYPE = 64;

  /**
   * The meta object id for the '<em>Service Status Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ServiceStatus
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceStatusObject()
   * @generated
   */
  int SERVICE_STATUS_OBJECT = 65;

  /**
   * The meta object id for the '<em>service Status Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getserviceStatus_ProvisioningDataModelType()
   * @generated
   */
  int SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE = 66;

  /**
   * The meta object id for the '<em>service Type Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ServiceType
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getserviceTypeElementType()
   * @generated
   */
  int SERVICE_TYPE_ELEMENT_TYPE = 67;

  /**
   * The meta object id for the '<em>Service Type Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.ServiceType
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceTypeObject()
   * @generated
   */
  int SERVICE_TYPE_OBJECT = 68;

  /**
   * The meta object id for the '<em>SFCPOPPE Tehnical Information Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSFCPOPPE_TehnicalInformationType()
   * @generated
   */
  int SFCPOPPE_TEHNICAL_INFORMATION_TYPE = 69;

  /**
   * The meta object id for the '<em>siebel Circuit ID Provisioning Data Model Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getsiebelCircuitID_ProvisioningDataModelType()
   * @generated
   */
  int SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE = 70;

  /**
   * The meta object id for the '<em>SLA Deadline SLA Configuration Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSLA_Deadline_SLA_ConfigurationType()
   * @generated
   */
  int SLA_DEADLINE_SLA_CONFIGURATION_TYPE = 71;

  /**
   * The meta object id for the '<em>SLA Level SLA Configuration Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSLALevel_SLA_ConfigurationType()
   * @generated
   */
  int SLA_LEVEL_SLA_CONFIGURATION_TYPE = 72;

  /**
   * The meta object id for the '<em>step Name Comment Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getstepName_CommentDataType()
   * @generated
   */
  int STEP_NAME_COMMENT_DATA_TYPE = 73;

  /**
   * The meta object id for the '<em>task Config SLA Configuration Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettaskConfig_SLA_ConfigurationType()
   * @generated
   */
  int TASK_CONFIG_SLA_CONFIGURATION_TYPE = 74;

  /**
   * The meta object id for the '<em>task Name SLA Configuration Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettaskName_SLA_ConfigurationType()
   * @generated
   */
  int TASK_NAME_SLA_CONFIGURATION_TYPE = 75;

  /**
   * The meta object id for the '<em>task Recipient Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.TaskRecipient
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettaskRecipientElementType()
   * @generated
   */
  int TASK_RECIPIENT_ELEMENT_TYPE = 76;

  /**
   * The meta object id for the '<em>Task Recipient Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.TaskRecipient
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTaskRecipientObject()
   * @generated
   */
  int TASK_RECIPIENT_OBJECT = 77;

  /**
   * The meta object id for the '<em>technology List Element Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.TechnologyList
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettechnologyListElementType()
   * @generated
   */
  int TECHNOLOGY_LIST_ELEMENT_TYPE = 78;

  /**
   * The meta object id for the '<em>Technology List Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.sfc_provisioningbom.TechnologyList
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTechnologyListObject()
   * @generated
   */
  int TECHNOLOGY_LIST_OBJECT = 79;

  /**
   * The meta object id for the '<em>time Comment Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettime_CommentDataType()
   * @generated
   */
  int TIME_COMMENT_DATA_TYPE = 80;

  /**
   * The meta object id for the '<em>type Equipment Details Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettype_EquipmentDetailsType()
   * @generated
   */
  int TYPE_EQUIPMENT_DETAILS_TYPE = 81;

  /**
   * The meta object id for the '<em>VLAN Equipment Details Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getVLAN_EquipmentDetailsType()
   * @generated
   */
  int VLAN_EQUIPMENT_DETAILS_TYPE = 82;


  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.CommentData <em>Comment Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment Data</em>'.
   * @see com.example.sfc_provisioningbom.CommentData
   * @generated
   */
  EClass getCommentData();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.CommentData#getAddedby <em>Addedby</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addedby</em>'.
   * @see com.example.sfc_provisioningbom.CommentData#getAddedby()
   * @see #getCommentData()
   * @generated
   */
  EAttribute getCommentData_Addedby();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.CommentData#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comments</em>'.
   * @see com.example.sfc_provisioningbom.CommentData#getComments()
   * @see #getCommentData()
   * @generated
   */
  EAttribute getCommentData_Comments();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.CommentData#getStepName <em>Step Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Step Name</em>'.
   * @see com.example.sfc_provisioningbom.CommentData#getStepName()
   * @see #getCommentData()
   * @generated
   */
  EAttribute getCommentData_StepName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.CommentData#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see com.example.sfc_provisioningbom.CommentData#getTime()
   * @see #getCommentData()
   * @generated
   */
  EAttribute getCommentData_Time();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.ContractorGroups <em>Contractor Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contractor Groups</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups
   * @generated
   */
  EClass getContractorGroups();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getLoginName <em>Login Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Login Name</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getLoginName()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_LoginName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getFirstName()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_FirstName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getLastName()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_LastName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getContractorGroupName <em>Contractor Group Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contractor Group Name</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getContractorGroupName()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_ContractorGroupName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getMasterUser <em>Master User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Master User</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getMasterUser()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_MasterUser();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getEmailID <em>Email ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email ID</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getEmailID()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_EmailID();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getBdsId <em>Bds Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bds Id</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getBdsId()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_BdsId();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ContractorGroups#getBdsVersion <em>Bds Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bds Version</em>'.
   * @see com.example.sfc_provisioningbom.ContractorGroups#getBdsVersion()
   * @see #getContractorGroups()
   * @generated
   */
  EAttribute getContractorGroups_BdsVersion();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.example.sfc_provisioningbom.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.example.sfc_provisioningbom.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.example.sfc_provisioningbom.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getAccountTypeElement <em>Account Type Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Account Type Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getAccountTypeElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_AccountTypeElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getBandwidthElement <em>Bandwidth Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bandwidth Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getBandwidthElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_BandwidthElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getCommentDataElement <em>Comment Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment Data Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getCommentDataElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CommentDataElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsElement <em>Contractor Groups Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contractor Groups Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ContractorGroupsElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getEmailRecipientElement <em>Email Recipient Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email Recipient Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getEmailRecipientElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_EmailRecipientElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getEnableDisableElement <em>Enable Disable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enable Disable Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getEnableDisableElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_EnableDisableElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsElement <em>Equipment Details Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Equipment Details Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EquipmentDetailsElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getProcessNameElement <em>Process Name Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Name Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getProcessNameElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_ProcessNameElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelElement <em>Provisioning Data Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provisioning Data Model Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ProvisioningDataModelElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getServiceStatusElement <em>Service Status Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Status Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getServiceStatusElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_ServiceStatusElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getServiceTypeElement <em>Service Type Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Type Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getServiceTypeElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_ServiceTypeElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getSLAConfigurationElement <em>SLA Configuration Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SLA Configuration Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getSLAConfigurationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SLAConfigurationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersElement <em>System Parameters Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System Parameters Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SystemParametersElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getTaskRecipientElement <em>Task Recipient Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Recipient Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getTaskRecipientElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_TaskRecipientElement();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.DocumentRoot#getTechnologyListElement <em>Technology List Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Technology List Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getTechnologyListElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_TechnologyListElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationElement <em>Tehnical Information Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tehnical Information Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_TehnicalInformationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getCommentDataBDSInternalSerializationElement <em>Comment Data BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comment Data BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getCommentDataBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CommentDataBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsBDSInternalSerializationElement <em>Contractor Groups BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contractor Groups BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getContractorGroupsBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ContractorGroupsBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsBDSInternalSerializationElement <em>Equipment Details BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Equipment Details BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getEquipmentDetailsBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EquipmentDetailsBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelBDSInternalSerializationElement <em>Provisioning Data Model BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Provisioning Data Model BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getProvisioningDataModelBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ProvisioningDataModelBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getSLA_ConfigurationBDSInternalSerializationElement <em>SLA Configuration BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>SLA Configuration BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getSLA_ConfigurationBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SLA_ConfigurationBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersBDSInternalSerializationElement <em>System Parameters BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System Parameters BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getSystemParametersBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SystemParametersBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationBDSInternalSerializationElement <em>Tehnical Information BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tehnical Information BDS Internal Serialization Element</em>'.
   * @see com.example.sfc_provisioningbom.DocumentRoot#getTehnicalInformationBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_TehnicalInformationBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.EquipmentDetails <em>Equipment Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equipment Details</em>'.
   * @see com.example.sfc_provisioningbom.EquipmentDetails
   * @generated
   */
  EClass getEquipmentDetails();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.EquipmentDetails#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.example.sfc_provisioningbom.EquipmentDetails#getType()
   * @see #getEquipmentDetails()
   * @generated
   */
  EAttribute getEquipmentDetails_Type();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.EquipmentDetails#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see com.example.sfc_provisioningbom.EquipmentDetails#getAddress()
   * @see #getEquipmentDetails()
   * @generated
   */
  EAttribute getEquipmentDetails_Address();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.EquipmentDetails#getVLAN <em>VLAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>VLAN</em>'.
   * @see com.example.sfc_provisioningbom.EquipmentDetails#getVLAN()
   * @see #getEquipmentDetails()
   * @generated
   */
  EAttribute getEquipmentDetails_VLAN();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.ProvisioningDataModel <em>Provisioning Data Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provisioning Data Model</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel
   * @generated
   */
  EClass getProvisioningDataModel();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getSiebelCircuitID <em>Siebel Circuit ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Siebel Circuit ID</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getSiebelCircuitID()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_SiebelCircuitID();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getProjectManager <em>Project Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Manager</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getProjectManager()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ProjectManager();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getClientName <em>Client Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client Name</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getClientName()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ClientName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getAccountManager <em>Account Manager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Account Manager</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getAccountManager()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_AccountManager();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getAccount <em>Account</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Account</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getAccount()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Account();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getContractor <em>Contractor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contractor</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getContractor()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Contractor();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getLocation()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Location();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getRegionView <em>Region View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Region View</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getRegionView()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_RegionView();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getFloor <em>Floor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Floor</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getFloor()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Floor();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getClientID <em>Client ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client ID</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getClientID()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ClientID();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Type</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceType()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ServiceType();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getGPSCoordinates <em>GPS Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>GPS Coordinates</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getGPSCoordinates()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_GPSCoordinates();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBandwidthupdown <em>Bandwidthupdown</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bandwidthupdown</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getBandwidthupdown()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Bandwidthupdown();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getTechnology <em>Technology</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Technology</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getTechnology()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Technology();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStatus <em>Service Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Status</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStatus()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ServiceStatus();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingName <em>Building Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Building Name</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingName()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_BuildingName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingID <em>Building ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Building ID</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingID()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_BuildingID();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getContactPerson <em>Contact Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contact Person</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getContactPerson()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ContactPerson();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getMobile <em>Mobile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mobile</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getMobile()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Mobile();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getSector <em>Sector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sector</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getSector()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Sector();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getEmail()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_Email();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStart <em>Service Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service Start</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStart()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ServiceStart();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceEnd <em>Service End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Service End</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceEnd()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_ServiceEnd();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getRequestDate <em>Request Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Request Date</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getRequestDate()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_RequestDate();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getInstallDate <em>Install Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Install Date</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getInstallDate()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_InstallDate();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getNotesComments <em>Notes Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Notes Comments</em>'.
   * @see com.example.sfc_provisioningbom.ProvisioningDataModel#getNotesComments()
   * @see #getProvisioningDataModel()
   * @generated
   */
  EAttribute getProvisioningDataModel_NotesComments();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.SLA_Configuration <em>SLA Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SLA Configuration</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration
   * @generated
   */
  EClass getSLA_Configuration();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getSLALevel <em>SLA Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>SLA Level</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getSLALevel()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_SLALevel();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskName <em>Task Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Name</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getTaskName()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_TaskName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getProcessName <em>Process Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Name</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getProcessName()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_ProcessName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getSLA_Deadline <em>SLA Deadline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>SLA Deadline</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getSLA_Deadline()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_SLA_Deadline();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getEmailTo <em>Email To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email To</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getEmailTo()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_EmailTo();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskTo <em>Task To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task To</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getTaskTo()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_TaskTo();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getEmailConfig <em>Email Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email Config</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getEmailConfig()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_EmailConfig();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getTaskConfig <em>Task Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Config</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getTaskConfig()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_TaskConfig();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getEnableDisableFlag <em>Enable Disable Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enable Disable Flag</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getEnableDisableFlag()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_EnableDisableFlag();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getBdsId <em>Bds Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bds Id</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getBdsId()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_BdsId();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SLA_Configuration#getBdsVersion <em>Bds Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bds Version</em>'.
   * @see com.example.sfc_provisioningbom.SLA_Configuration#getBdsVersion()
   * @see #getSLA_Configuration()
   * @generated
   */
  EAttribute getSLA_Configuration_BdsVersion();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.SystemParameters <em>System Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Parameters</em>'.
   * @see com.example.sfc_provisioningbom.SystemParameters
   * @generated
   */
  EClass getSystemParameters();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SystemParameters#getPropertyName <em>Property Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Name</em>'.
   * @see com.example.sfc_provisioningbom.SystemParameters#getPropertyName()
   * @see #getSystemParameters()
   * @generated
   */
  EAttribute getSystemParameters_PropertyName();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SystemParameters#getPropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property Value</em>'.
   * @see com.example.sfc_provisioningbom.SystemParameters#getPropertyValue()
   * @see #getSystemParameters()
   * @generated
   */
  EAttribute getSystemParameters_PropertyValue();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SystemParameters#getBdsId <em>Bds Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bds Id</em>'.
   * @see com.example.sfc_provisioningbom.SystemParameters#getBdsId()
   * @see #getSystemParameters()
   * @generated
   */
  EAttribute getSystemParameters_BdsId();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.SystemParameters#getBdsVersion <em>Bds Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bds Version</em>'.
   * @see com.example.sfc_provisioningbom.SystemParameters#getBdsVersion()
   * @see #getSystemParameters()
   * @generated
   */
  EAttribute getSystemParameters_BdsVersion();

  /**
   * Returns the meta object for class '{@link com.example.sfc_provisioningbom.TehnicalInformation <em>Tehnical Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tehnical Information</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation
   * @generated
   */
  EClass getTehnicalInformation();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getCarrierVLAN <em>Carrier VLAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carrier VLAN</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getCarrierVLAN()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_CarrierVLAN();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getCarrierIP <em>Carrier IP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carrier IP</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getCarrierIP()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_CarrierIP();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getAggPoint <em>Agg Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Agg Point</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getAggPoint()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_AggPoint();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getPort()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_Port();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getClientVLAN <em>Client VLAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client VLAN</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getClientVLAN()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_ClientVLAN();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getClientIP <em>Client IP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client IP</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getClientIP()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_ClientIP();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getSFCPOPPE <em>SFCPOPPE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>SFCPOPPE</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getSFCPOPPE()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_SFCPOPPE();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getPortType <em>Port Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port Type</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getPortType()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_PortType();

  /**
   * Returns the meta object for the containment reference list '{@link com.example.sfc_provisioningbom.TehnicalInformation#getEquipment <em>Equipment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Equipment</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getEquipment()
   * @see #getTehnicalInformation()
   * @generated
   */
  EReference getTehnicalInformation_Equipment();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getModifiedBy <em>Modified By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modified By</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getModifiedBy()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_ModifiedBy();

  /**
   * Returns the meta object for the attribute '{@link com.example.sfc_provisioningbom.TehnicalInformation#getModifiedDate <em>Modified Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modified Date</em>'.
   * @see com.example.sfc_provisioningbom.TehnicalInformation#getModifiedDate()
   * @see #getTehnicalInformation()
   * @generated
   */
  EAttribute getTehnicalInformation_ModifiedDate();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.AccountType <em>Account Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Account Type</em>'.
   * @see com.example.sfc_provisioningbom.AccountType
   * @generated
   */
  EEnum getAccountType();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.Bandwidth <em>Bandwidth</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Bandwidth</em>'.
   * @see com.example.sfc_provisioningbom.Bandwidth
   * @generated
   */
  EEnum getBandwidth();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.EmailRecipient <em>Email Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Email Recipient</em>'.
   * @see com.example.sfc_provisioningbom.EmailRecipient
   * @generated
   */
  EEnum getEmailRecipient();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.EnableDisable <em>Enable Disable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enable Disable</em>'.
   * @see com.example.sfc_provisioningbom.EnableDisable
   * @generated
   */
  EEnum getEnableDisable();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.ProcessName <em>Process Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Process Name</em>'.
   * @see com.example.sfc_provisioningbom.ProcessName
   * @generated
   */
  EEnum getProcessName();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.ServiceStatus <em>Service Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Service Status</em>'.
   * @see com.example.sfc_provisioningbom.ServiceStatus
   * @generated
   */
  EEnum getServiceStatus();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.ServiceType <em>Service Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Service Type</em>'.
   * @see com.example.sfc_provisioningbom.ServiceType
   * @generated
   */
  EEnum getServiceType();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.TaskRecipient <em>Task Recipient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Task Recipient</em>'.
   * @see com.example.sfc_provisioningbom.TaskRecipient
   * @generated
   */
  EEnum getTaskRecipient();

  /**
   * Returns the meta object for enum '{@link com.example.sfc_provisioningbom.TechnologyList <em>Technology List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Technology List</em>'.
   * @see com.example.sfc_provisioningbom.TechnologyList
   * @generated
   */
  EEnum getTechnologyList();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>account Manager Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>account Manager Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='accountManager_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getaccountManager_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.AccountType <em>account Type Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>account Type Element Type</em>'.
   * @see com.example.sfc_provisioningbom.AccountType
   * @model instanceClass="com.example.sfc_provisioningbom.AccountType"
   *        extendedMetaData="name='accountTypeElement_._type' baseType='AccountType'"
   * @generated
   */
  EDataType getaccountTypeElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.AccountType <em>Account Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Account Type Object</em>'.
   * @see com.example.sfc_provisioningbom.AccountType
   * @model instanceClass="com.example.sfc_provisioningbom.AccountType"
   *        extendedMetaData="name='AccountType:Object' baseType='AccountType'"
   * @generated
   */
  EDataType getAccountTypeObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>addedby Comment Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>addedby Comment Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='addedby_CommentData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getaddedby_CommentDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>address Equipment Details Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>address Equipment Details Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='address_EquipmentDetails_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getaddress_EquipmentDetailsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>agg Point Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>agg Point Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='aggPoint_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getaggPoint_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.Bandwidth <em>bandwidth Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>bandwidth Element Type</em>'.
   * @see com.example.sfc_provisioningbom.Bandwidth
   * @model instanceClass="com.example.sfc_provisioningbom.Bandwidth"
   *        extendedMetaData="name='bandwidthElement_._type' baseType='Bandwidth'"
   * @generated
   */
  EDataType getbandwidthElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.Bandwidth <em>Bandwidth Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Bandwidth Object</em>'.
   * @see com.example.sfc_provisioningbom.Bandwidth
   * @model instanceClass="com.example.sfc_provisioningbom.Bandwidth"
   *        extendedMetaData="name='Bandwidth:Object' baseType='Bandwidth'"
   * @generated
   */
  EDataType getBandwidthObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>building ID Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>building ID Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='buildingID_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getbuildingID_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>building Name Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>building Name Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='buildingName_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getbuildingName_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>carrier IP Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>carrier IP Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='carrierIP_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getcarrierIP_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>carrier VLAN Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>carrier VLAN Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='carrierVLAN_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getcarrierVLAN_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>client ID Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>client ID Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='clientID_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getclientID_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>client IP Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>client IP Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='clientIP_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getclientIP_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>client Name Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>client Name Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='clientName_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getclientName_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>client VLAN Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>client VLAN Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='clientVLAN_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getclientVLAN_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>comments Comment Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>comments Comment Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='comments_CommentData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getcomments_CommentDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>contact Person Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>contact Person Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='contactPerson_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getcontactPerson_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>contractor Group Name Contractor Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>contractor Group Name Contractor Groups Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='contractorGroupName_ContractorGroups_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getcontractorGroupName_ContractorGroupsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>contractor Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>contractor Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='contractor_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getcontractor_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>email Config SLA Configuration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>email Config SLA Configuration Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='emailConfig_SLA_Configuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getemailConfig_SLA_ConfigurationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>email ID Contractor Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>email ID Contractor Groups Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='emailID_ContractorGroups_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getemailID_ContractorGroupsType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.EmailRecipient <em>email Recipient Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>email Recipient Element Type</em>'.
   * @see com.example.sfc_provisioningbom.EmailRecipient
   * @model instanceClass="com.example.sfc_provisioningbom.EmailRecipient"
   *        extendedMetaData="name='emailRecipientElement_._type' baseType='EmailRecipient'"
   * @generated
   */
  EDataType getemailRecipientElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.EmailRecipient <em>Email Recipient Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Email Recipient Object</em>'.
   * @see com.example.sfc_provisioningbom.EmailRecipient
   * @model instanceClass="com.example.sfc_provisioningbom.EmailRecipient"
   *        extendedMetaData="name='EmailRecipient:Object' baseType='EmailRecipient'"
   * @generated
   */
  EDataType getEmailRecipientObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>email Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>email Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='email_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getemail_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.EnableDisable <em>enable Disable Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>enable Disable Element Type</em>'.
   * @see com.example.sfc_provisioningbom.EnableDisable
   * @model instanceClass="com.example.sfc_provisioningbom.EnableDisable"
   *        extendedMetaData="name='enableDisableElement_._type' baseType='EnableDisable'"
   * @generated
   */
  EDataType getenableDisableElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.EnableDisable <em>Enable Disable Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Enable Disable Object</em>'.
   * @see com.example.sfc_provisioningbom.EnableDisable
   * @model instanceClass="com.example.sfc_provisioningbom.EnableDisable"
   *        extendedMetaData="name='EnableDisable:Object' baseType='EnableDisable'"
   * @generated
   */
  EDataType getEnableDisableObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>first Name Contractor Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>first Name Contractor Groups Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='firstName_ContractorGroups_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getfirstName_ContractorGroupsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>floor Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>floor Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='floor_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getfloor_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>GPS Coordinates Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>GPS Coordinates Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='GPSCoordinates_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getGPSCoordinates_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>last Name Contractor Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>last Name Contractor Groups Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='lastName_ContractorGroups_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getlastName_ContractorGroupsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>location Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>location Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='location_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getlocation_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>login Name Contractor Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>login Name Contractor Groups Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='loginName_ContractorGroups_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getloginName_ContractorGroupsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>master User Contractor Groups Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>master User Contractor Groups Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='masterUser_ContractorGroups_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getmasterUser_ContractorGroupsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>mobile Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>mobile Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='mobile_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getmobile_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>modified By Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>modified By Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='modifiedBy_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getmodifiedBy_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>notes Comments Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>notes Comments Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='notesComments_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getnotesComments_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>port Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>port Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='port_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getport_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>port Type Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>port Type Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='portType_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getportType_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.ProcessName <em>process Name Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>process Name Element Type</em>'.
   * @see com.example.sfc_provisioningbom.ProcessName
   * @model instanceClass="com.example.sfc_provisioningbom.ProcessName"
   *        extendedMetaData="name='processNameElement_._type' baseType='ProcessName'"
   * @generated
   */
  EDataType getprocessNameElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.ProcessName <em>Process Name Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Process Name Object</em>'.
   * @see com.example.sfc_provisioningbom.ProcessName
   * @model instanceClass="com.example.sfc_provisioningbom.ProcessName"
   *        extendedMetaData="name='ProcessName:Object' baseType='ProcessName'"
   * @generated
   */
  EDataType getProcessNameObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>process Name SLA Configuration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>process Name SLA Configuration Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='processName_SLA_Configuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getprocessName_SLA_ConfigurationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>project Manager Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>project Manager Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='projectManager_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getprojectManager_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>property Name System Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>property Name System Parameters Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='propertyName_SystemParameters_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getpropertyName_SystemParametersType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>property Value System Parameters Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>property Value System Parameters Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='propertyValue_SystemParameters_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getpropertyValue_SystemParametersType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>region View Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>region View Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='regionView_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getregionView_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>sector Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>sector Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='sector_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getsector_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.ServiceStatus <em>service Status Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>service Status Element Type</em>'.
   * @see com.example.sfc_provisioningbom.ServiceStatus
   * @model instanceClass="com.example.sfc_provisioningbom.ServiceStatus"
   *        extendedMetaData="name='serviceStatusElement_._type' baseType='ServiceStatus'"
   * @generated
   */
  EDataType getserviceStatusElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.ServiceStatus <em>Service Status Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Service Status Object</em>'.
   * @see com.example.sfc_provisioningbom.ServiceStatus
   * @model instanceClass="com.example.sfc_provisioningbom.ServiceStatus"
   *        extendedMetaData="name='ServiceStatus:Object' baseType='ServiceStatus'"
   * @generated
   */
  EDataType getServiceStatusObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>service Status Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>service Status Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='serviceStatus_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getserviceStatus_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.ServiceType <em>service Type Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>service Type Element Type</em>'.
   * @see com.example.sfc_provisioningbom.ServiceType
   * @model instanceClass="com.example.sfc_provisioningbom.ServiceType"
   *        extendedMetaData="name='serviceTypeElement_._type' baseType='ServiceType'"
   * @generated
   */
  EDataType getserviceTypeElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.ServiceType <em>Service Type Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Service Type Object</em>'.
   * @see com.example.sfc_provisioningbom.ServiceType
   * @model instanceClass="com.example.sfc_provisioningbom.ServiceType"
   *        extendedMetaData="name='ServiceType:Object' baseType='ServiceType'"
   * @generated
   */
  EDataType getServiceTypeObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>SFCPOPPE Tehnical Information Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>SFCPOPPE Tehnical Information Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='SFCPOPPE_TehnicalInformation_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getSFCPOPPE_TehnicalInformationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>siebel Circuit ID Provisioning Data Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>siebel Circuit ID Provisioning Data Model Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='siebelCircuitID_ProvisioningDataModel_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getsiebelCircuitID_ProvisioningDataModelType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>SLA Deadline SLA Configuration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>SLA Deadline SLA Configuration Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='SLA_Deadline_SLA_Configuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getSLA_Deadline_SLA_ConfigurationType();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>SLA Level SLA Configuration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>SLA Level SLA Configuration Type</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   *        extendedMetaData="name='SLALevel_SLA_Configuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' totalDigits='19'"
   * @generated
   */
  EDataType getSLALevel_SLA_ConfigurationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>step Name Comment Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>step Name Comment Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='stepName_CommentData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getstepName_CommentDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>task Config SLA Configuration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>task Config SLA Configuration Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='taskConfig_SLA_Configuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType gettaskConfig_SLA_ConfigurationType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>task Name SLA Configuration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>task Name SLA Configuration Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='taskName_SLA_Configuration_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType gettaskName_SLA_ConfigurationType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.TaskRecipient <em>task Recipient Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>task Recipient Element Type</em>'.
   * @see com.example.sfc_provisioningbom.TaskRecipient
   * @model instanceClass="com.example.sfc_provisioningbom.TaskRecipient"
   *        extendedMetaData="name='taskRecipientElement_._type' baseType='TaskRecipient'"
   * @generated
   */
  EDataType gettaskRecipientElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.TaskRecipient <em>Task Recipient Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Task Recipient Object</em>'.
   * @see com.example.sfc_provisioningbom.TaskRecipient
   * @model instanceClass="com.example.sfc_provisioningbom.TaskRecipient"
   *        extendedMetaData="name='TaskRecipient:Object' baseType='TaskRecipient'"
   * @generated
   */
  EDataType getTaskRecipientObject();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.TechnologyList <em>technology List Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>technology List Element Type</em>'.
   * @see com.example.sfc_provisioningbom.TechnologyList
   * @model instanceClass="com.example.sfc_provisioningbom.TechnologyList"
   *        extendedMetaData="name='technologyListElement_._type' baseType='TechnologyList'"
   * @generated
   */
  EDataType gettechnologyListElementType();

  /**
   * Returns the meta object for data type '{@link com.example.sfc_provisioningbom.TechnologyList <em>Technology List Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Technology List Object</em>'.
   * @see com.example.sfc_provisioningbom.TechnologyList
   * @model instanceClass="com.example.sfc_provisioningbom.TechnologyList"
   *        extendedMetaData="name='TechnologyList:Object' baseType='TechnologyList'"
   * @generated
   */
  EDataType getTechnologyListObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>time Comment Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>time Comment Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='time_CommentData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType gettime_CommentDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>type Equipment Details Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>type Equipment Details Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='type_EquipmentDetails_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType gettype_EquipmentDetailsType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>VLAN Equipment Details Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>VLAN Equipment Details Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='VLAN_EquipmentDetails_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getVLAN_EquipmentDetailsType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Sfc_provisioningbomFactory getSfc_provisioningbomFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.CommentDataImpl <em>Comment Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.CommentDataImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getCommentData()
     * @generated
     */
    EClass COMMENT_DATA = eINSTANCE.getCommentData();

    /**
     * The meta object literal for the '<em><b>Addedby</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT_DATA__ADDEDBY = eINSTANCE.getCommentData_Addedby();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT_DATA__COMMENTS = eINSTANCE.getCommentData_Comments();

    /**
     * The meta object literal for the '<em><b>Step Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT_DATA__STEP_NAME = eINSTANCE.getCommentData_StepName();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT_DATA__TIME = eINSTANCE.getCommentData_Time();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl <em>Contractor Groups</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.ContractorGroupsImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getContractorGroups()
     * @generated
     */
    EClass CONTRACTOR_GROUPS = eINSTANCE.getContractorGroups();

    /**
     * The meta object literal for the '<em><b>Login Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__LOGIN_NAME = eINSTANCE.getContractorGroups_LoginName();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__FIRST_NAME = eINSTANCE.getContractorGroups_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__LAST_NAME = eINSTANCE.getContractorGroups_LastName();

    /**
     * The meta object literal for the '<em><b>Contractor Group Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME = eINSTANCE.getContractorGroups_ContractorGroupName();

    /**
     * The meta object literal for the '<em><b>Master User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__MASTER_USER = eINSTANCE.getContractorGroups_MasterUser();

    /**
     * The meta object literal for the '<em><b>Email ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__EMAIL_ID = eINSTANCE.getContractorGroups_EmailID();

    /**
     * The meta object literal for the '<em><b>Bds Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__BDS_ID = eINSTANCE.getContractorGroups_BdsId();

    /**
     * The meta object literal for the '<em><b>Bds Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTOR_GROUPS__BDS_VERSION = eINSTANCE.getContractorGroups_BdsVersion();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.DocumentRootImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getDocumentRoot()
     * @generated
     */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Account Type Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT = eINSTANCE.getDocumentRoot_AccountTypeElement();

    /**
     * The meta object literal for the '<em><b>Bandwidth Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__BANDWIDTH_ELEMENT = eINSTANCE.getDocumentRoot_BandwidthElement();

    /**
     * The meta object literal for the '<em><b>Comment Data Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__COMMENT_DATA_ELEMENT = eINSTANCE.getDocumentRoot_CommentDataElement();

    /**
     * The meta object literal for the '<em><b>Contractor Groups Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT = eINSTANCE.getDocumentRoot_ContractorGroupsElement();

    /**
     * The meta object literal for the '<em><b>Email Recipient Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT = eINSTANCE.getDocumentRoot_EmailRecipientElement();

    /**
     * The meta object literal for the '<em><b>Enable Disable Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT = eINSTANCE.getDocumentRoot_EnableDisableElement();

    /**
     * The meta object literal for the '<em><b>Equipment Details Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT = eINSTANCE.getDocumentRoot_EquipmentDetailsElement();

    /**
     * The meta object literal for the '<em><b>Process Name Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__PROCESS_NAME_ELEMENT = eINSTANCE.getDocumentRoot_ProcessNameElement();

    /**
     * The meta object literal for the '<em><b>Provisioning Data Model Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT = eINSTANCE.getDocumentRoot_ProvisioningDataModelElement();

    /**
     * The meta object literal for the '<em><b>Service Status Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT = eINSTANCE.getDocumentRoot_ServiceStatusElement();

    /**
     * The meta object literal for the '<em><b>Service Type Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT = eINSTANCE.getDocumentRoot_ServiceTypeElement();

    /**
     * The meta object literal for the '<em><b>SLA Configuration Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT = eINSTANCE.getDocumentRoot_SLAConfigurationElement();

    /**
     * The meta object literal for the '<em><b>System Parameters Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT = eINSTANCE.getDocumentRoot_SystemParametersElement();

    /**
     * The meta object literal for the '<em><b>Task Recipient Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT = eINSTANCE.getDocumentRoot_TaskRecipientElement();

    /**
     * The meta object literal for the '<em><b>Technology List Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT = eINSTANCE.getDocumentRoot_TechnologyListElement();

    /**
     * The meta object literal for the '<em><b>Tehnical Information Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT = eINSTANCE.getDocumentRoot_TehnicalInformationElement();

    /**
     * The meta object literal for the '<em><b>Comment Data BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CommentDataBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Contractor Groups BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ContractorGroupsBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Equipment Details BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_EquipmentDetailsBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Provisioning Data Model BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ProvisioningDataModelBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>SLA Configuration BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SLA_ConfigurationBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>System Parameters BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SystemParametersBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Tehnical Information BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_TehnicalInformationBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl <em>Equipment Details</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEquipmentDetails()
     * @generated
     */
    EClass EQUIPMENT_DETAILS = eINSTANCE.getEquipmentDetails();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUIPMENT_DETAILS__TYPE = eINSTANCE.getEquipmentDetails_Type();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUIPMENT_DETAILS__ADDRESS = eINSTANCE.getEquipmentDetails_Address();

    /**
     * The meta object literal for the '<em><b>VLAN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUIPMENT_DETAILS__VLAN = eINSTANCE.getEquipmentDetails_VLAN();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl <em>Provisioning Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getProvisioningDataModel()
     * @generated
     */
    EClass PROVISIONING_DATA_MODEL = eINSTANCE.getProvisioningDataModel();

    /**
     * The meta object literal for the '<em><b>Siebel Circuit ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID = eINSTANCE.getProvisioningDataModel_SiebelCircuitID();

    /**
     * The meta object literal for the '<em><b>Project Manager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__PROJECT_MANAGER = eINSTANCE.getProvisioningDataModel_ProjectManager();

    /**
     * The meta object literal for the '<em><b>Client Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__CLIENT_NAME = eINSTANCE.getProvisioningDataModel_ClientName();

    /**
     * The meta object literal for the '<em><b>Account Manager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER = eINSTANCE.getProvisioningDataModel_AccountManager();

    /**
     * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__ACCOUNT = eINSTANCE.getProvisioningDataModel_Account();

    /**
     * The meta object literal for the '<em><b>Contractor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__CONTRACTOR = eINSTANCE.getProvisioningDataModel_Contractor();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__LOCATION = eINSTANCE.getProvisioningDataModel_Location();

    /**
     * The meta object literal for the '<em><b>Region View</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__REGION_VIEW = eINSTANCE.getProvisioningDataModel_RegionView();

    /**
     * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__FLOOR = eINSTANCE.getProvisioningDataModel_Floor();

    /**
     * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__CLIENT_ID = eINSTANCE.getProvisioningDataModel_ClientID();

    /**
     * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__SERVICE_TYPE = eINSTANCE.getProvisioningDataModel_ServiceType();

    /**
     * The meta object literal for the '<em><b>GPS Coordinates</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__GPS_COORDINATES = eINSTANCE.getProvisioningDataModel_GPSCoordinates();

    /**
     * The meta object literal for the '<em><b>Bandwidthupdown</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN = eINSTANCE.getProvisioningDataModel_Bandwidthupdown();

    /**
     * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__TECHNOLOGY = eINSTANCE.getProvisioningDataModel_Technology();

    /**
     * The meta object literal for the '<em><b>Service Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__SERVICE_STATUS = eINSTANCE.getProvisioningDataModel_ServiceStatus();

    /**
     * The meta object literal for the '<em><b>Building Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__BUILDING_NAME = eINSTANCE.getProvisioningDataModel_BuildingName();

    /**
     * The meta object literal for the '<em><b>Building ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__BUILDING_ID = eINSTANCE.getProvisioningDataModel_BuildingID();

    /**
     * The meta object literal for the '<em><b>Contact Person</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__CONTACT_PERSON = eINSTANCE.getProvisioningDataModel_ContactPerson();

    /**
     * The meta object literal for the '<em><b>Mobile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__MOBILE = eINSTANCE.getProvisioningDataModel_Mobile();

    /**
     * The meta object literal for the '<em><b>Sector</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__SECTOR = eINSTANCE.getProvisioningDataModel_Sector();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__EMAIL = eINSTANCE.getProvisioningDataModel_Email();

    /**
     * The meta object literal for the '<em><b>Service Start</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__SERVICE_START = eINSTANCE.getProvisioningDataModel_ServiceStart();

    /**
     * The meta object literal for the '<em><b>Service End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__SERVICE_END = eINSTANCE.getProvisioningDataModel_ServiceEnd();

    /**
     * The meta object literal for the '<em><b>Request Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__REQUEST_DATE = eINSTANCE.getProvisioningDataModel_RequestDate();

    /**
     * The meta object literal for the '<em><b>Install Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__INSTALL_DATE = eINSTANCE.getProvisioningDataModel_InstallDate();

    /**
     * The meta object literal for the '<em><b>Notes Comments</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROVISIONING_DATA_MODEL__NOTES_COMMENTS = eINSTANCE.getProvisioningDataModel_NotesComments();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl <em>SLA Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.SLA_ConfigurationImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSLA_Configuration()
     * @generated
     */
    EClass SLA_CONFIGURATION = eINSTANCE.getSLA_Configuration();

    /**
     * The meta object literal for the '<em><b>SLA Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__SLA_LEVEL = eINSTANCE.getSLA_Configuration_SLALevel();

    /**
     * The meta object literal for the '<em><b>Task Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__TASK_NAME = eINSTANCE.getSLA_Configuration_TaskName();

    /**
     * The meta object literal for the '<em><b>Process Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__PROCESS_NAME = eINSTANCE.getSLA_Configuration_ProcessName();

    /**
     * The meta object literal for the '<em><b>SLA Deadline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__SLA_DEADLINE = eINSTANCE.getSLA_Configuration_SLA_Deadline();

    /**
     * The meta object literal for the '<em><b>Email To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__EMAIL_TO = eINSTANCE.getSLA_Configuration_EmailTo();

    /**
     * The meta object literal for the '<em><b>Task To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__TASK_TO = eINSTANCE.getSLA_Configuration_TaskTo();

    /**
     * The meta object literal for the '<em><b>Email Config</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__EMAIL_CONFIG = eINSTANCE.getSLA_Configuration_EmailConfig();

    /**
     * The meta object literal for the '<em><b>Task Config</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__TASK_CONFIG = eINSTANCE.getSLA_Configuration_TaskConfig();

    /**
     * The meta object literal for the '<em><b>Enable Disable Flag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__ENABLE_DISABLE_FLAG = eINSTANCE.getSLA_Configuration_EnableDisableFlag();

    /**
     * The meta object literal for the '<em><b>Bds Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__BDS_ID = eINSTANCE.getSLA_Configuration_BdsId();

    /**
     * The meta object literal for the '<em><b>Bds Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SLA_CONFIGURATION__BDS_VERSION = eINSTANCE.getSLA_Configuration_BdsVersion();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.SystemParametersImpl <em>System Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.SystemParametersImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSystemParameters()
     * @generated
     */
    EClass SYSTEM_PARAMETERS = eINSTANCE.getSystemParameters();

    /**
     * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_PARAMETERS__PROPERTY_NAME = eINSTANCE.getSystemParameters_PropertyName();

    /**
     * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_PARAMETERS__PROPERTY_VALUE = eINSTANCE.getSystemParameters_PropertyValue();

    /**
     * The meta object literal for the '<em><b>Bds Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_PARAMETERS__BDS_ID = eINSTANCE.getSystemParameters_BdsId();

    /**
     * The meta object literal for the '<em><b>Bds Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_PARAMETERS__BDS_VERSION = eINSTANCE.getSystemParameters_BdsVersion();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.impl.TehnicalInformationImpl <em>Tehnical Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.impl.TehnicalInformationImpl
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTehnicalInformation()
     * @generated
     */
    EClass TEHNICAL_INFORMATION = eINSTANCE.getTehnicalInformation();

    /**
     * The meta object literal for the '<em><b>Carrier VLAN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__CARRIER_VLAN = eINSTANCE.getTehnicalInformation_CarrierVLAN();

    /**
     * The meta object literal for the '<em><b>Carrier IP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__CARRIER_IP = eINSTANCE.getTehnicalInformation_CarrierIP();

    /**
     * The meta object literal for the '<em><b>Agg Point</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__AGG_POINT = eINSTANCE.getTehnicalInformation_AggPoint();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__PORT = eINSTANCE.getTehnicalInformation_Port();

    /**
     * The meta object literal for the '<em><b>Client VLAN</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__CLIENT_VLAN = eINSTANCE.getTehnicalInformation_ClientVLAN();

    /**
     * The meta object literal for the '<em><b>Client IP</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__CLIENT_IP = eINSTANCE.getTehnicalInformation_ClientIP();

    /**
     * The meta object literal for the '<em><b>SFCPOPPE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__SFCPOPPE = eINSTANCE.getTehnicalInformation_SFCPOPPE();

    /**
     * The meta object literal for the '<em><b>Port Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__PORT_TYPE = eINSTANCE.getTehnicalInformation_PortType();

    /**
     * The meta object literal for the '<em><b>Equipment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEHNICAL_INFORMATION__EQUIPMENT = eINSTANCE.getTehnicalInformation_Equipment();

    /**
     * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__MODIFIED_BY = eINSTANCE.getTehnicalInformation_ModifiedBy();

    /**
     * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEHNICAL_INFORMATION__MODIFIED_DATE = eINSTANCE.getTehnicalInformation_ModifiedDate();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.AccountType <em>Account Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.AccountType
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getAccountType()
     * @generated
     */
    EEnum ACCOUNT_TYPE = eINSTANCE.getAccountType();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.Bandwidth <em>Bandwidth</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.Bandwidth
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getBandwidth()
     * @generated
     */
    EEnum BANDWIDTH = eINSTANCE.getBandwidth();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.EmailRecipient <em>Email Recipient</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.EmailRecipient
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEmailRecipient()
     * @generated
     */
    EEnum EMAIL_RECIPIENT = eINSTANCE.getEmailRecipient();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.EnableDisable <em>Enable Disable</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.EnableDisable
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEnableDisable()
     * @generated
     */
    EEnum ENABLE_DISABLE = eINSTANCE.getEnableDisable();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.ProcessName <em>Process Name</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ProcessName
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getProcessName()
     * @generated
     */
    EEnum PROCESS_NAME = eINSTANCE.getProcessName();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.ServiceStatus <em>Service Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ServiceStatus
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceStatus()
     * @generated
     */
    EEnum SERVICE_STATUS = eINSTANCE.getServiceStatus();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.ServiceType <em>Service Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ServiceType
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceType()
     * @generated
     */
    EEnum SERVICE_TYPE = eINSTANCE.getServiceType();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.TaskRecipient <em>Task Recipient</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.TaskRecipient
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTaskRecipient()
     * @generated
     */
    EEnum TASK_RECIPIENT = eINSTANCE.getTaskRecipient();

    /**
     * The meta object literal for the '{@link com.example.sfc_provisioningbom.TechnologyList <em>Technology List</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.TechnologyList
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTechnologyList()
     * @generated
     */
    EEnum TECHNOLOGY_LIST = eINSTANCE.getTechnologyList();

    /**
     * The meta object literal for the '<em>account Manager Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaccountManager_ProvisioningDataModelType()
     * @generated
     */
    EDataType ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getaccountManager_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>account Type Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.AccountType
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaccountTypeElementType()
     * @generated
     */
    EDataType ACCOUNT_TYPE_ELEMENT_TYPE = eINSTANCE.getaccountTypeElementType();

    /**
     * The meta object literal for the '<em>Account Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.AccountType
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getAccountTypeObject()
     * @generated
     */
    EDataType ACCOUNT_TYPE_OBJECT = eINSTANCE.getAccountTypeObject();

    /**
     * The meta object literal for the '<em>addedby Comment Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaddedby_CommentDataType()
     * @generated
     */
    EDataType ADDEDBY_COMMENT_DATA_TYPE = eINSTANCE.getaddedby_CommentDataType();

    /**
     * The meta object literal for the '<em>address Equipment Details Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaddress_EquipmentDetailsType()
     * @generated
     */
    EDataType ADDRESS_EQUIPMENT_DETAILS_TYPE = eINSTANCE.getaddress_EquipmentDetailsType();

    /**
     * The meta object literal for the '<em>agg Point Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getaggPoint_TehnicalInformationType()
     * @generated
     */
    EDataType AGG_POINT_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getaggPoint_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>bandwidth Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.Bandwidth
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getbandwidthElementType()
     * @generated
     */
    EDataType BANDWIDTH_ELEMENT_TYPE = eINSTANCE.getbandwidthElementType();

    /**
     * The meta object literal for the '<em>Bandwidth Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.Bandwidth
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getBandwidthObject()
     * @generated
     */
    EDataType BANDWIDTH_OBJECT = eINSTANCE.getBandwidthObject();

    /**
     * The meta object literal for the '<em>building ID Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getbuildingID_ProvisioningDataModelType()
     * @generated
     */
    EDataType BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getbuildingID_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>building Name Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getbuildingName_ProvisioningDataModelType()
     * @generated
     */
    EDataType BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getbuildingName_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>carrier IP Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcarrierIP_TehnicalInformationType()
     * @generated
     */
    EDataType CARRIER_IP_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getcarrierIP_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>carrier VLAN Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcarrierVLAN_TehnicalInformationType()
     * @generated
     */
    EDataType CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getcarrierVLAN_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>client ID Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientID_ProvisioningDataModelType()
     * @generated
     */
    EDataType CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getclientID_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>client IP Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientIP_TehnicalInformationType()
     * @generated
     */
    EDataType CLIENT_IP_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getclientIP_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>client Name Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientName_ProvisioningDataModelType()
     * @generated
     */
    EDataType CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getclientName_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>client VLAN Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getclientVLAN_TehnicalInformationType()
     * @generated
     */
    EDataType CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getclientVLAN_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>comments Comment Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcomments_CommentDataType()
     * @generated
     */
    EDataType COMMENTS_COMMENT_DATA_TYPE = eINSTANCE.getcomments_CommentDataType();

    /**
     * The meta object literal for the '<em>contact Person Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcontactPerson_ProvisioningDataModelType()
     * @generated
     */
    EDataType CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getcontactPerson_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>contractor Group Name Contractor Groups Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcontractorGroupName_ContractorGroupsType()
     * @generated
     */
    EDataType CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE = eINSTANCE.getcontractorGroupName_ContractorGroupsType();

    /**
     * The meta object literal for the '<em>contractor Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getcontractor_ProvisioningDataModelType()
     * @generated
     */
    EDataType CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getcontractor_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>email Config SLA Configuration Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemailConfig_SLA_ConfigurationType()
     * @generated
     */
    EDataType EMAIL_CONFIG_SLA_CONFIGURATION_TYPE = eINSTANCE.getemailConfig_SLA_ConfigurationType();

    /**
     * The meta object literal for the '<em>email ID Contractor Groups Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemailID_ContractorGroupsType()
     * @generated
     */
    EDataType EMAIL_ID_CONTRACTOR_GROUPS_TYPE = eINSTANCE.getemailID_ContractorGroupsType();

    /**
     * The meta object literal for the '<em>email Recipient Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.EmailRecipient
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemailRecipientElementType()
     * @generated
     */
    EDataType EMAIL_RECIPIENT_ELEMENT_TYPE = eINSTANCE.getemailRecipientElementType();

    /**
     * The meta object literal for the '<em>Email Recipient Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.EmailRecipient
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEmailRecipientObject()
     * @generated
     */
    EDataType EMAIL_RECIPIENT_OBJECT = eINSTANCE.getEmailRecipientObject();

    /**
     * The meta object literal for the '<em>email Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getemail_ProvisioningDataModelType()
     * @generated
     */
    EDataType EMAIL_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getemail_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>enable Disable Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.EnableDisable
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getenableDisableElementType()
     * @generated
     */
    EDataType ENABLE_DISABLE_ELEMENT_TYPE = eINSTANCE.getenableDisableElementType();

    /**
     * The meta object literal for the '<em>Enable Disable Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.EnableDisable
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getEnableDisableObject()
     * @generated
     */
    EDataType ENABLE_DISABLE_OBJECT = eINSTANCE.getEnableDisableObject();

    /**
     * The meta object literal for the '<em>first Name Contractor Groups Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getfirstName_ContractorGroupsType()
     * @generated
     */
    EDataType FIRST_NAME_CONTRACTOR_GROUPS_TYPE = eINSTANCE.getfirstName_ContractorGroupsType();

    /**
     * The meta object literal for the '<em>floor Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getfloor_ProvisioningDataModelType()
     * @generated
     */
    EDataType FLOOR_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getfloor_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>GPS Coordinates Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getGPSCoordinates_ProvisioningDataModelType()
     * @generated
     */
    EDataType GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getGPSCoordinates_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>last Name Contractor Groups Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getlastName_ContractorGroupsType()
     * @generated
     */
    EDataType LAST_NAME_CONTRACTOR_GROUPS_TYPE = eINSTANCE.getlastName_ContractorGroupsType();

    /**
     * The meta object literal for the '<em>location Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getlocation_ProvisioningDataModelType()
     * @generated
     */
    EDataType LOCATION_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getlocation_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>login Name Contractor Groups Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getloginName_ContractorGroupsType()
     * @generated
     */
    EDataType LOGIN_NAME_CONTRACTOR_GROUPS_TYPE = eINSTANCE.getloginName_ContractorGroupsType();

    /**
     * The meta object literal for the '<em>master User Contractor Groups Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getmasterUser_ContractorGroupsType()
     * @generated
     */
    EDataType MASTER_USER_CONTRACTOR_GROUPS_TYPE = eINSTANCE.getmasterUser_ContractorGroupsType();

    /**
     * The meta object literal for the '<em>mobile Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getmobile_ProvisioningDataModelType()
     * @generated
     */
    EDataType MOBILE_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getmobile_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>modified By Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getmodifiedBy_TehnicalInformationType()
     * @generated
     */
    EDataType MODIFIED_BY_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getmodifiedBy_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>notes Comments Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getnotesComments_ProvisioningDataModelType()
     * @generated
     */
    EDataType NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getnotesComments_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>port Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getport_TehnicalInformationType()
     * @generated
     */
    EDataType PORT_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getport_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>port Type Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getportType_TehnicalInformationType()
     * @generated
     */
    EDataType PORT_TYPE_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getportType_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>process Name Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ProcessName
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getprocessNameElementType()
     * @generated
     */
    EDataType PROCESS_NAME_ELEMENT_TYPE = eINSTANCE.getprocessNameElementType();

    /**
     * The meta object literal for the '<em>Process Name Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ProcessName
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getProcessNameObject()
     * @generated
     */
    EDataType PROCESS_NAME_OBJECT = eINSTANCE.getProcessNameObject();

    /**
     * The meta object literal for the '<em>process Name SLA Configuration Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getprocessName_SLA_ConfigurationType()
     * @generated
     */
    EDataType PROCESS_NAME_SLA_CONFIGURATION_TYPE = eINSTANCE.getprocessName_SLA_ConfigurationType();

    /**
     * The meta object literal for the '<em>project Manager Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getprojectManager_ProvisioningDataModelType()
     * @generated
     */
    EDataType PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getprojectManager_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>property Name System Parameters Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getpropertyName_SystemParametersType()
     * @generated
     */
    EDataType PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE = eINSTANCE.getpropertyName_SystemParametersType();

    /**
     * The meta object literal for the '<em>property Value System Parameters Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getpropertyValue_SystemParametersType()
     * @generated
     */
    EDataType PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE = eINSTANCE.getpropertyValue_SystemParametersType();

    /**
     * The meta object literal for the '<em>region View Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getregionView_ProvisioningDataModelType()
     * @generated
     */
    EDataType REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getregionView_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>sector Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getsector_ProvisioningDataModelType()
     * @generated
     */
    EDataType SECTOR_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getsector_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>service Status Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ServiceStatus
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getserviceStatusElementType()
     * @generated
     */
    EDataType SERVICE_STATUS_ELEMENT_TYPE = eINSTANCE.getserviceStatusElementType();

    /**
     * The meta object literal for the '<em>Service Status Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ServiceStatus
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceStatusObject()
     * @generated
     */
    EDataType SERVICE_STATUS_OBJECT = eINSTANCE.getServiceStatusObject();

    /**
     * The meta object literal for the '<em>service Status Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getserviceStatus_ProvisioningDataModelType()
     * @generated
     */
    EDataType SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getserviceStatus_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>service Type Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ServiceType
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getserviceTypeElementType()
     * @generated
     */
    EDataType SERVICE_TYPE_ELEMENT_TYPE = eINSTANCE.getserviceTypeElementType();

    /**
     * The meta object literal for the '<em>Service Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.ServiceType
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getServiceTypeObject()
     * @generated
     */
    EDataType SERVICE_TYPE_OBJECT = eINSTANCE.getServiceTypeObject();

    /**
     * The meta object literal for the '<em>SFCPOPPE Tehnical Information Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSFCPOPPE_TehnicalInformationType()
     * @generated
     */
    EDataType SFCPOPPE_TEHNICAL_INFORMATION_TYPE = eINSTANCE.getSFCPOPPE_TehnicalInformationType();

    /**
     * The meta object literal for the '<em>siebel Circuit ID Provisioning Data Model Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getsiebelCircuitID_ProvisioningDataModelType()
     * @generated
     */
    EDataType SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE = eINSTANCE.getsiebelCircuitID_ProvisioningDataModelType();

    /**
     * The meta object literal for the '<em>SLA Deadline SLA Configuration Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSLA_Deadline_SLA_ConfigurationType()
     * @generated
     */
    EDataType SLA_DEADLINE_SLA_CONFIGURATION_TYPE = eINSTANCE.getSLA_Deadline_SLA_ConfigurationType();

    /**
     * The meta object literal for the '<em>SLA Level SLA Configuration Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.math.BigInteger
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getSLALevel_SLA_ConfigurationType()
     * @generated
     */
    EDataType SLA_LEVEL_SLA_CONFIGURATION_TYPE = eINSTANCE.getSLALevel_SLA_ConfigurationType();

    /**
     * The meta object literal for the '<em>step Name Comment Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getstepName_CommentDataType()
     * @generated
     */
    EDataType STEP_NAME_COMMENT_DATA_TYPE = eINSTANCE.getstepName_CommentDataType();

    /**
     * The meta object literal for the '<em>task Config SLA Configuration Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettaskConfig_SLA_ConfigurationType()
     * @generated
     */
    EDataType TASK_CONFIG_SLA_CONFIGURATION_TYPE = eINSTANCE.gettaskConfig_SLA_ConfigurationType();

    /**
     * The meta object literal for the '<em>task Name SLA Configuration Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettaskName_SLA_ConfigurationType()
     * @generated
     */
    EDataType TASK_NAME_SLA_CONFIGURATION_TYPE = eINSTANCE.gettaskName_SLA_ConfigurationType();

    /**
     * The meta object literal for the '<em>task Recipient Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.TaskRecipient
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettaskRecipientElementType()
     * @generated
     */
    EDataType TASK_RECIPIENT_ELEMENT_TYPE = eINSTANCE.gettaskRecipientElementType();

    /**
     * The meta object literal for the '<em>Task Recipient Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.TaskRecipient
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTaskRecipientObject()
     * @generated
     */
    EDataType TASK_RECIPIENT_OBJECT = eINSTANCE.getTaskRecipientObject();

    /**
     * The meta object literal for the '<em>technology List Element Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.TechnologyList
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettechnologyListElementType()
     * @generated
     */
    EDataType TECHNOLOGY_LIST_ELEMENT_TYPE = eINSTANCE.gettechnologyListElementType();

    /**
     * The meta object literal for the '<em>Technology List Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.sfc_provisioningbom.TechnologyList
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getTechnologyListObject()
     * @generated
     */
    EDataType TECHNOLOGY_LIST_OBJECT = eINSTANCE.getTechnologyListObject();

    /**
     * The meta object literal for the '<em>time Comment Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettime_CommentDataType()
     * @generated
     */
    EDataType TIME_COMMENT_DATA_TYPE = eINSTANCE.gettime_CommentDataType();

    /**
     * The meta object literal for the '<em>type Equipment Details Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#gettype_EquipmentDetailsType()
     * @generated
     */
    EDataType TYPE_EQUIPMENT_DETAILS_TYPE = eINSTANCE.gettype_EquipmentDetailsType();

    /**
     * The meta object literal for the '<em>VLAN Equipment Details Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.sfc_provisioningbom.impl.Sfc_provisioningbomPackageImpl#getVLAN_EquipmentDetailsType()
     * @generated
     */
    EDataType VLAN_EQUIPMENT_DETAILS_TYPE = eINSTANCE.getVLAN_EquipmentDetailsType();

  }

} //Sfc_provisioningbomPackage

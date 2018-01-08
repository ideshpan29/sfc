
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSValidationUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * BOMORIGIN::/com.sfc.fosImpl.genericReporting/Generated Business Objects/com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bom
 * <!-- end-model-doc -->
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory
 * @model kind="package"
 * @generated
 */
public interface SchemaPackage extends EPackage
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
  String eNAME = "Schema";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tibco.com/schemas/SFC_FOS_BPM/SharedResources/SchemaDefinitions/Schema.xsd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "schema";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SchemaPackage eINSTANCE = com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl.init();

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl <em>createresourceinput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getcreateresourceinputType()
   * @generated
   */
  int CREATERESOURCEINPUT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEINPUT_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Orgname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEINPUT_TYPE__ORGNAME = 1;

  /**
   * The feature id for the '<em><b>Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEINPUT_TYPE__FLAG = 2;

  /**
   * The feature id for the '<em><b>Entityname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEINPUT_TYPE__ENTITYNAME = 3;

  /**
   * The number of structural features of the '<em>createresourceinput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEINPUT_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceoutputTypeImpl <em>createresourceoutput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceoutputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getcreateresourceoutputType()
   * @generated
   */
  int CREATERESOURCEOUTPUT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Outputmessage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEOUTPUT_TYPE__OUTPUTMESSAGE = 0;

  /**
   * The number of structural features of the '<em>createresourceoutput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCEOUTPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceTypeImpl <em>createresource Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getcreateresourceType()
   * @generated
   */
  int CREATERESOURCE_TYPE = 2;

  /**
   * The feature id for the '<em><b>Createresourceinput</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCE_TYPE__CREATERESOURCEINPUT = 0;

  /**
   * The feature id for the '<em><b>Createresourceoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT = 1;

  /**
   * The number of structural features of the '<em>createresource Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATERESOURCE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 3;

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
   * The feature id for the '<em><b>Createresource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATERESOURCE = 3;

  /**
   * The feature id for the '<em><b>Createresourceinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATERESOURCEINPUT = 4;

  /**
   * The feature id for the '<em><b>Createresourceoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATERESOURCEOUTPUT = 5;

  /**
   * The feature id for the '<em><b>Fault</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FAULT = 6;

  /**
   * The feature id for the '<em><b>Fetchresource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FETCHRESOURCE = 7;

  /**
   * The feature id for the '<em><b>Fetchresourceinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FETCHRESOURCEINPUT = 8;

  /**
   * The feature id for the '<em><b>Fetchresourceoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FETCHRESOURCEOUTPUT = 9;

  /**
   * The feature id for the '<em><b>Getprocessinstances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GETPROCESSINSTANCES = 10;

  /**
   * The feature id for the '<em><b>Getprocessinstancesinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT = 11;

  /**
   * The feature id for the '<em><b>Getprocessinstancesoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT = 12;

  /**
   * The feature id for the '<em><b>Ldapentry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRY = 13;

  /**
   * The feature id for the '<em><b>Ldapentryinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRYINPUT = 14;

  /**
   * The feature id for the '<em><b>Ldapentryinputrepeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT = 15;

  /**
   * The feature id for the '<em><b>Ldapentryoutput</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRYOUTPUT = 16;

  /**
   * The feature id for the '<em><b>Parsecsv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PARSECSV = 17;

  /**
   * The feature id for the '<em><b>Reesourcecreationandmapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING = 18;

  /**
   * The feature id for the '<em><b>Reportgeneration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REPORTGENERATION = 19;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ROOT = 20;

  /**
   * The feature id for the '<em><b>Searchprocessinstances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHPROCESSINSTANCES = 21;

  /**
   * The feature id for the '<em><b>Searchprocessinstancesinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT = 22;

  /**
   * The feature id for the '<em><b>Searchprocessinstancesoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT = 23;

  /**
   * The feature id for the '<em><b>Workitemcompletion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WORKITEMCOMPLETION = 24;

  /**
   * The feature id for the '<em><b>Workitemcompletioninput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT = 25;

  /**
   * The feature id for the '<em><b>Workitemcompletionoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT = 26;

  /**
   * The feature id for the '<em><b>Createresourceinput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 27;

  /**
   * The feature id for the '<em><b>Createresourceoutput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 28;

  /**
   * The feature id for the '<em><b>Createresource Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 29;

  /**
   * The feature id for the '<em><b>Fault Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 30;

  /**
   * The feature id for the '<em><b>Fetchresourceinput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 31;

  /**
   * The feature id for the '<em><b>Fetchresourceoutput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 32;

  /**
   * The feature id for the '<em><b>Fetchresource Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 33;

  /**
   * The feature id for the '<em><b>Getprocessinstancesinput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 34;

  /**
   * The feature id for the '<em><b>Getprocessinstancesoutput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 35;

  /**
   * The feature id for the '<em><b>Getprocessinstances Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 36;

  /**
   * The feature id for the '<em><b>Input Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 37;

  /**
   * The feature id for the '<em><b>Ldapentryinputrepeat Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 38;

  /**
   * The feature id for the '<em><b>Ldapentryinput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 39;

  /**
   * The feature id for the '<em><b>Ldapentry Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 40;

  /**
   * The feature id for the '<em><b>Parsecsv Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 41;

  /**
   * The feature id for the '<em><b>Pi cancelled Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 42;

  /**
   * The feature id for the '<em><b>Pi complete Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 43;

  /**
   * The feature id for the '<em><b>Pi halted Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 44;

  /**
   * The feature id for the '<em><b>Pi started Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 45;

  /**
   * The feature id for the '<em><b>Reesourcecreationandmapping Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 46;

  /**
   * The feature id for the '<em><b>Reportgeneration Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 47;

  /**
   * The feature id for the '<em><b>Resource Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 48;

  /**
   * The feature id for the '<em><b>Root Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 49;

  /**
   * The feature id for the '<em><b>Searchprocessinstancesinput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 50;

  /**
   * The feature id for the '<em><b>Searchprocessinstancesoutput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 51;

  /**
   * The feature id for the '<em><b>Searchprocessinstances Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 52;

  /**
   * The feature id for the '<em><b>Searchrecord Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 53;

  /**
   * The feature id for the '<em><b>Users Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 54;

  /**
   * The feature id for the '<em><b>Workitemcompletioninput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 55;

  /**
   * The feature id for the '<em><b>Workitemcompletionoutput Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 56;

  /**
   * The feature id for the '<em><b>Workitemcompletion Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 57;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 58;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.faultTypeImpl <em>fault Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.faultTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfaultType()
   * @generated
   */
  int FAULT_TYPE = 4;

  /**
   * The feature id for the '<em><b>Faultmessage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAULT_TYPE__FAULTMESSAGE = 0;

  /**
   * The number of structural features of the '<em>fault Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAULT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceinputTypeImpl <em>fetchresourceinput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceinputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfetchresourceinputType()
   * @generated
   */
  int FETCHRESOURCEINPUT_TYPE = 5;

  /**
   * The feature id for the '<em><b>Processname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCEINPUT_TYPE__PROCESSNAME = 0;

  /**
   * The number of structural features of the '<em>fetchresourceinput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCEINPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceoutputTypeImpl <em>fetchresourceoutput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceoutputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfetchresourceoutputType()
   * @generated
   */
  int FETCHRESOURCEOUTPUT_TYPE = 6;

  /**
   * The feature id for the '<em><b>Resource</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCEOUTPUT_TYPE__RESOURCE = 0;

  /**
   * The number of structural features of the '<em>fetchresourceoutput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCEOUTPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceTypeImpl <em>fetchresource Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfetchresourceType()
   * @generated
   */
  int FETCHRESOURCE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Fetchresourceinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT = 0;

  /**
   * The feature id for the '<em><b>Fetchresourceoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT = 1;

  /**
   * The number of structural features of the '<em>fetchresource Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FETCHRESOURCE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesinputTypeImpl <em>getprocessinstancesinput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesinputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getgetprocessinstancesinputType()
   * @generated
   */
  int GETPROCESSINSTANCESINPUT_TYPE = 8;

  /**
   * The feature id for the '<em><b>Processname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESINPUT_TYPE__PROCESSNAME = 0;

  /**
   * The number of structural features of the '<em>getprocessinstancesinput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESINPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl <em>getprocessinstancesoutput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getgetprocessinstancesoutputType()
   * @generated
   */
  int GETPROCESSINSTANCESOUTPUT_TYPE = 9;

  /**
   * The feature id for the '<em><b>Pi complete</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE = 0;

  /**
   * The feature id for the '<em><b>Pi started</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED = 1;

  /**
   * The feature id for the '<em><b>Pi halted</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED = 2;

  /**
   * The feature id for the '<em><b>Pi cancelled</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED = 3;

  /**
   * The number of structural features of the '<em>getprocessinstancesoutput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCESOUTPUT_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesTypeImpl <em>getprocessinstances Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getgetprocessinstancesType()
   * @generated
   */
  int GETPROCESSINSTANCES_TYPE = 10;

  /**
   * The feature id for the '<em><b>Getprocessinstancesinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT = 0;

  /**
   * The feature id for the '<em><b>Getprocessinstancesoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT = 1;

  /**
   * The number of structural features of the '<em>getprocessinstances Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GETPROCESSINSTANCES_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.inputTypeImpl <em>input Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.inputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getinputType()
   * @generated
   */
  int INPUT_TYPE = 11;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__FIRSTNAME = 0;

  /**
   * The feature id for the '<em><b>Lastname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__LASTNAME = 1;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__EMAIL = 2;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__PASSWORD = 3;

  /**
   * The feature id for the '<em><b>Orgmodelname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__ORGMODELNAME = 4;

  /**
   * The feature id for the '<em><b>Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__FLAG = 5;

  /**
   * The feature id for the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__ENTITY = 6;

  /**
   * The number of structural features of the '<em>input Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputrepeatTypeImpl <em>ldapentryinputrepeat Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputrepeatTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getldapentryinputrepeatType()
   * @generated
   */
  int LDAPENTRYINPUTREPEAT_TYPE = 12;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUTREPEAT_TYPE__INPUT = 0;

  /**
   * The number of structural features of the '<em>ldapentryinputrepeat Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUTREPEAT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl <em>ldapentryinput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getldapentryinputType()
   * @generated
   */
  int LDAPENTRYINPUT_TYPE = 13;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__FIRSTNAME = 0;

  /**
   * The feature id for the '<em><b>Lastname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__LASTNAME = 1;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__EMAIL = 2;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__PASSWORD = 3;

  /**
   * The feature id for the '<em><b>Orgmodelname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__ORGMODELNAME = 4;

  /**
   * The feature id for the '<em><b>Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__FLAG = 5;

  /**
   * The feature id for the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE__ENTITY = 6;

  /**
   * The number of structural features of the '<em>ldapentryinput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRYINPUT_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl <em>ldapentry Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getldapentryType()
   * @generated
   */
  int LDAPENTRY_TYPE = 14;

  /**
   * The feature id for the '<em><b>Ldapentryinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRY_TYPE__LDAPENTRYINPUT = 0;

  /**
   * The feature id for the '<em><b>Ldapentryoutput</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRY_TYPE__LDAPENTRYOUTPUT = 1;

  /**
   * The feature id for the '<em><b>Ldapentryinputrepeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT = 2;

  /**
   * The number of structural features of the '<em>ldapentry Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LDAPENTRY_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.parsecsvTypeImpl <em>parsecsv Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.parsecsvTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getparsecsvType()
   * @generated
   */
  int PARSECSV_TYPE = 15;

  /**
   * The feature id for the '<em><b>Users</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSECSV_TYPE__USERS = 0;

  /**
   * The number of structural features of the '<em>parsecsv Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSECSV_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_cancelledTypeImpl <em>pi cancelled Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_cancelledTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_cancelledType()
   * @generated
   */
  int PI_CANCELLED_TYPE = 16;

  /**
   * The feature id for the '<em><b>Process instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Customer name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__CUSTOMER_NAME = 1;

  /**
   * The feature id for the '<em><b>Sibelcircuit id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__SIBELCIRCUIT_ID = 2;

  /**
   * The feature id for the '<em><b>Projectmanager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__PROJECTMANAGER = 3;

  /**
   * The feature id for the '<em><b>Cur activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__CUR_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__STATUS = 5;

  /**
   * The feature id for the '<em><b>Exec mills</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE__EXEC_MILLS = 6;

  /**
   * The number of structural features of the '<em>pi cancelled Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_CANCELLED_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_completeTypeImpl <em>pi complete Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_completeTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_completeType()
   * @generated
   */
  int PI_COMPLETE_TYPE = 17;

  /**
   * The feature id for the '<em><b>Process instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Customer name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__CUSTOMER_NAME = 1;

  /**
   * The feature id for the '<em><b>Sibelcircuit id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__SIBELCIRCUIT_ID = 2;

  /**
   * The feature id for the '<em><b>Projectmanager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__PROJECTMANAGER = 3;

  /**
   * The feature id for the '<em><b>Cur activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__CUR_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__STATUS = 5;

  /**
   * The feature id for the '<em><b>Exec mills</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE__EXEC_MILLS = 6;

  /**
   * The number of structural features of the '<em>pi complete Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_COMPLETE_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_haltedTypeImpl <em>pi halted Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_haltedTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_haltedType()
   * @generated
   */
  int PI_HALTED_TYPE = 18;

  /**
   * The feature id for the '<em><b>Process instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Customer name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__CUSTOMER_NAME = 1;

  /**
   * The feature id for the '<em><b>Sibelcircuit id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__SIBELCIRCUIT_ID = 2;

  /**
   * The feature id for the '<em><b>Projectmanager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__PROJECTMANAGER = 3;

  /**
   * The feature id for the '<em><b>Cur activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__CUR_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__STATUS = 5;

  /**
   * The feature id for the '<em><b>Exec mills</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE__EXEC_MILLS = 6;

  /**
   * The number of structural features of the '<em>pi halted Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_HALTED_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl <em>pi started Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_startedType()
   * @generated
   */
  int PI_STARTED_TYPE = 19;

  /**
   * The feature id for the '<em><b>Process instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Customer name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__CUSTOMER_NAME = 1;

  /**
   * The feature id for the '<em><b>Sibelcircuit id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__SIBELCIRCUIT_ID = 2;

  /**
   * The feature id for the '<em><b>Projectmanager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__PROJECTMANAGER = 3;

  /**
   * The feature id for the '<em><b>Cur activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__CUR_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__STATUS = 5;

  /**
   * The feature id for the '<em><b>Exec mills</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE__EXEC_MILLS = 6;

  /**
   * The number of structural features of the '<em>pi started Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PI_STARTED_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl <em>reesourcecreationandmapping Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getreesourcecreationandmappingType()
   * @generated
   */
  int REESOURCECREATIONANDMAPPING_TYPE = 20;

  /**
   * The feature id for the '<em><b>Createresource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE = 0;

  /**
   * The feature id for the '<em><b>Ldapentry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY = 1;

  /**
   * The feature id for the '<em><b>Parsecsv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REESOURCECREATIONANDMAPPING_TYPE__PARSECSV = 2;

  /**
   * The number of structural features of the '<em>reesourcecreationandmapping Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REESOURCECREATIONANDMAPPING_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reportgenerationTypeImpl <em>reportgeneration Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reportgenerationTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getreportgenerationType()
   * @generated
   */
  int REPORTGENERATION_TYPE = 21;

  /**
   * The feature id for the '<em><b>Getprocessinstances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORTGENERATION_TYPE__GETPROCESSINSTANCES = 0;

  /**
   * The feature id for the '<em><b>Searchprocessinstances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES = 1;

  /**
   * The number of structural features of the '<em>reportgeneration Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORTGENERATION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl <em>resource Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getresourceType()
   * @generated
   */
  int RESOURCE_TYPE = 22;

  /**
   * The feature id for the '<em><b>Guid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TYPE__GUID = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TYPE__LABEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TYPE__NAME = 2;

  /**
   * The number of structural features of the '<em>resource Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl <em>root Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getrootType()
   * @generated
   */
  int ROOT_TYPE = 23;

  /**
   * The feature id for the '<em><b>Fetchresource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE__FETCHRESOURCE = 0;

  /**
   * The feature id for the '<em><b>Reportgeneration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE__REPORTGENERATION = 1;

  /**
   * The feature id for the '<em><b>Reesourcecreationandmapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE__REESOURCECREATIONANDMAPPING = 2;

  /**
   * The feature id for the '<em><b>Workitemcompletion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE__WORKITEMCOMPLETION = 3;

  /**
   * The feature id for the '<em><b>Fault</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE__FAULT = 4;

  /**
   * The number of structural features of the '<em>root Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesinputTypeImpl <em>searchprocessinstancesinput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesinputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchprocessinstancesinputType()
   * @generated
   */
  int SEARCHPROCESSINSTANCESINPUT_TYPE = 24;

  /**
   * The feature id for the '<em><b>Searchkey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY = 0;

  /**
   * The feature id for the '<em><b>Searchvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE = 1;

  /**
   * The number of structural features of the '<em>searchprocessinstancesinput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCESINPUT_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesoutputTypeImpl <em>searchprocessinstancesoutput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesoutputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchprocessinstancesoutputType()
   * @generated
   */
  int SEARCHPROCESSINSTANCESOUTPUT_TYPE = 25;

  /**
   * The feature id for the '<em><b>Searchrecord</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD = 0;

  /**
   * The number of structural features of the '<em>searchprocessinstancesoutput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCESOUTPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesTypeImpl <em>searchprocessinstances Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchprocessinstancesType()
   * @generated
   */
  int SEARCHPROCESSINSTANCES_TYPE = 26;

  /**
   * The feature id for the '<em><b>Searchprocessinstancesinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT = 0;

  /**
   * The feature id for the '<em><b>Searchprocessinstancesoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT = 1;

  /**
   * The number of structural features of the '<em>searchprocessinstances Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHPROCESSINSTANCES_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchrecordTypeImpl <em>searchrecord Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchrecordTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchrecordType()
   * @generated
   */
  int SEARCHRECORD_TYPE = 27;

  /**
   * The feature id for the '<em><b>Process instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Customer name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__CUSTOMER_NAME = 1;

  /**
   * The feature id for the '<em><b>Sibelcircuit id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__SIBELCIRCUIT_ID = 2;

  /**
   * The feature id for the '<em><b>Projectmanager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__PROJECTMANAGER = 3;

  /**
   * The feature id for the '<em><b>Cur activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__CUR_ACTIVITY = 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__STATUS = 5;

  /**
   * The feature id for the '<em><b>Exec mills</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE__EXEC_MILLS = 6;

  /**
   * The number of structural features of the '<em>searchrecord Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCHRECORD_TYPE_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl <em>users Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getusersType()
   * @generated
   */
  int USERS_TYPE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USERS_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Flag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USERS_TYPE__FLAG = 1;

  /**
   * The feature id for the '<em><b>Entityvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USERS_TYPE__ENTITYVALUE = 2;

  /**
   * The feature id for the '<em><b>Orgmodelname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USERS_TYPE__ORGMODELNAME = 3;

  /**
   * The number of structural features of the '<em>users Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USERS_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletioninputTypeImpl <em>workitemcompletioninput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletioninputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getworkitemcompletioninputType()
   * @generated
   */
  int WORKITEMCOMPLETIONINPUT_TYPE = 29;

  /**
   * The feature id for the '<em><b>Sibelcircuitid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID = 0;

  /**
   * The number of structural features of the '<em>workitemcompletioninput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETIONINPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionoutputTypeImpl <em>workitemcompletionoutput Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionoutputTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getworkitemcompletionoutputType()
   * @generated
   */
  int WORKITEMCOMPLETIONOUTPUT_TYPE = 30;

  /**
   * The feature id for the '<em><b>Outputmessage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE = 0;

  /**
   * The number of structural features of the '<em>workitemcompletionoutput Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETIONOUTPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionTypeImpl <em>workitemcompletion Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionTypeImpl
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getworkitemcompletionType()
   * @generated
   */
  int WORKITEMCOMPLETION_TYPE = 31;

  /**
   * The feature id for the '<em><b>Workitemcompletioninput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT = 0;

  /**
   * The feature id for the '<em><b>Workitemcompletionoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT = 1;

  /**
   * The number of structural features of the '<em>workitemcompletion Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKITEMCOMPLETION_TYPE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType <em>createresourceinput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>createresourceinput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType
   * @generated
   */
  EClass getcreateresourceinputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getName()
   * @see #getcreateresourceinputType()
   * @generated
   */
  EAttribute getcreateresourceinputType_Name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getOrgname <em>Orgname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orgname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getOrgname()
   * @see #getcreateresourceinputType()
   * @generated
   */
  EAttribute getcreateresourceinputType_Orgname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getFlag <em>Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flag</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getFlag()
   * @see #getcreateresourceinputType()
   * @generated
   */
  EAttribute getcreateresourceinputType_Flag();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getEntityname <em>Entityname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entityname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType#getEntityname()
   * @see #getcreateresourceinputType()
   * @generated
   */
  EAttribute getcreateresourceinputType_Entityname();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType <em>createresourceoutput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>createresourceoutput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType
   * @generated
   */
  EClass getcreateresourceoutputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType#getOutputmessage <em>Outputmessage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Outputmessage</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType#getOutputmessage()
   * @see #getcreateresourceoutputType()
   * @generated
   */
  EAttribute getcreateresourceoutputType_Outputmessage();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType <em>createresource Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>createresource Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType
   * @generated
   */
  EClass getcreateresourceType();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceinput <em>Createresourceinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Createresourceinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceinput()
   * @see #getcreateresourceType()
   * @generated
   */
  EReference getcreateresourceType_Createresourceinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceoutput <em>Createresourceoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresourceoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceoutput()
   * @see #getcreateresourceType()
   * @generated
   */
  EReference getcreateresourceType_Createresourceoutput();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresource <em>Createresource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresource</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresource()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Createresource();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceinput <em>Createresourceinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresourceinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceinput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Createresourceinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceoutput <em>Createresourceoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresourceoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceoutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Createresourceoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFault <em>Fault</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fault</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFault()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Fault();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresource <em>Fetchresource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresource</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresource()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Fetchresource();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceinput <em>Fetchresourceinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresourceinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceinput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Fetchresourceinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceoutput <em>Fetchresourceoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresourceoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceoutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Fetchresourceoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstances <em>Getprocessinstances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstances</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstances()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Getprocessinstances();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesinput <em>Getprocessinstancesinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstancesinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesinput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Getprocessinstancesinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesoutput <em>Getprocessinstancesoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstancesoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesoutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Getprocessinstancesoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentry <em>Ldapentry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentry</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentry()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Ldapentry();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinput <em>Ldapentryinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentryinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Ldapentryinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinputrepeat <em>Ldapentryinputrepeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentryinputrepeat</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinputrepeat()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Ldapentryinputrepeat();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryoutput <em>Ldapentryoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ldapentryoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryoutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Ldapentryoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getParsecsv <em>Parsecsv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parsecsv</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getParsecsv()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Parsecsv();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReesourcecreationandmapping <em>Reesourcecreationandmapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reesourcecreationandmapping</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReesourcecreationandmapping()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Reesourcecreationandmapping();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReportgeneration <em>Reportgeneration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reportgeneration</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReportgeneration()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Reportgeneration();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getRoot()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Root();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstances <em>Searchprocessinstances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstances</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstances()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Searchprocessinstances();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesinput <em>Searchprocessinstancesinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstancesinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesinput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Searchprocessinstancesinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesoutput <em>Searchprocessinstancesoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstancesoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesoutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Searchprocessinstancesoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletion <em>Workitemcompletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletion</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletion()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Workitemcompletion();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletioninput <em>Workitemcompletioninput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletioninput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletioninput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Workitemcompletioninput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletionoutput <em>Workitemcompletionoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletionoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletionoutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Workitemcompletionoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceinputTypeBDSInternalSerializationElement <em>Createresourceinput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresourceinput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceinputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateresourceinputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceoutputTypeBDSInternalSerializationElement <em>Createresourceoutput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresourceoutput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceoutputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateresourceoutputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceTypeBDSInternalSerializationElement <em>Createresource Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresource Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getCreateresourceTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateresourceTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFaultTypeBDSInternalSerializationElement <em>Fault Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fault Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFaultTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_FaultTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceinputTypeBDSInternalSerializationElement <em>Fetchresourceinput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresourceinput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceinputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_FetchresourceinputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceoutputTypeBDSInternalSerializationElement <em>Fetchresourceoutput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresourceoutput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceoutputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_FetchresourceoutputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceTypeBDSInternalSerializationElement <em>Fetchresource Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresource Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getFetchresourceTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_FetchresourceTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesinputTypeBDSInternalSerializationElement <em>Getprocessinstancesinput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstancesinput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesinputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetprocessinstancesinputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesoutputTypeBDSInternalSerializationElement <em>Getprocessinstancesoutput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstancesoutput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesoutputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetprocessinstancesoutputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesTypeBDSInternalSerializationElement <em>Getprocessinstances Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstances Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getGetprocessinstancesTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetprocessinstancesTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getInputTypeBDSInternalSerializationElement <em>Input Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getInputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_InputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinputrepeatTypeBDSInternalSerializationElement <em>Ldapentryinputrepeat Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentryinputrepeat Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinputrepeatTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_LdapentryinputrepeatTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinputTypeBDSInternalSerializationElement <em>Ldapentryinput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentryinput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryinputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_LdapentryinputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryTypeBDSInternalSerializationElement <em>Ldapentry Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentry Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getLdapentryTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_LdapentryTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getParsecsvTypeBDSInternalSerializationElement <em>Parsecsv Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parsecsv Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getParsecsvTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ParsecsvTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_cancelledTypeBDSInternalSerializationElement <em>Pi cancelled Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pi cancelled Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_cancelledTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Pi_cancelledTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_completeTypeBDSInternalSerializationElement <em>Pi complete Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pi complete Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_completeTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Pi_completeTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_haltedTypeBDSInternalSerializationElement <em>Pi halted Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pi halted Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_haltedTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Pi_haltedTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_startedTypeBDSInternalSerializationElement <em>Pi started Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pi started Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getPi_startedTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Pi_startedTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReesourcecreationandmappingTypeBDSInternalSerializationElement <em>Reesourcecreationandmapping Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reesourcecreationandmapping Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReesourcecreationandmappingTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ReesourcecreationandmappingTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReportgenerationTypeBDSInternalSerializationElement <em>Reportgeneration Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reportgeneration Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getReportgenerationTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ReportgenerationTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getResourceTypeBDSInternalSerializationElement <em>Resource Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getResourceTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_ResourceTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getRootTypeBDSInternalSerializationElement <em>Root Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getRootTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_RootTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesinputTypeBDSInternalSerializationElement <em>Searchprocessinstancesinput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstancesinput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesinputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchprocessinstancesinputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesoutputTypeBDSInternalSerializationElement <em>Searchprocessinstancesoutput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstancesoutput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesoutputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchprocessinstancesoutputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesTypeBDSInternalSerializationElement <em>Searchprocessinstances Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstances Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchprocessinstancesTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchprocessinstancesTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchrecordTypeBDSInternalSerializationElement <em>Searchrecord Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchrecord Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getSearchrecordTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchrecordTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getUsersTypeBDSInternalSerializationElement <em>Users Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Users Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getUsersTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_UsersTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletioninputTypeBDSInternalSerializationElement <em>Workitemcompletioninput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletioninput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletioninputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_WorkitemcompletioninputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletionoutputTypeBDSInternalSerializationElement <em>Workitemcompletionoutput Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletionoutput Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletionoutputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_WorkitemcompletionoutputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletionTypeBDSInternalSerializationElement <em>Workitemcompletion Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletion Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot#getWorkitemcompletionTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_WorkitemcompletionTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType <em>fault Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fault Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType
   * @generated
   */
  EClass getfaultType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType#getFaultmessage <em>Faultmessage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Faultmessage</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType#getFaultmessage()
   * @see #getfaultType()
   * @generated
   */
  EAttribute getfaultType_Faultmessage();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType <em>fetchresourceinput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fetchresourceinput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType
   * @generated
   */
  EClass getfetchresourceinputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType#getProcessname <em>Processname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType#getProcessname()
   * @see #getfetchresourceinputType()
   * @generated
   */
  EAttribute getfetchresourceinputType_Processname();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType <em>fetchresourceoutput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fetchresourceoutput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType
   * @generated
   */
  EClass getfetchresourceoutputType();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resource</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType#getResource()
   * @see #getfetchresourceoutputType()
   * @generated
   */
  EReference getfetchresourceoutputType_Resource();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType <em>fetchresource Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fetchresource Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType
   * @generated
   */
  EClass getfetchresourceType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceinput <em>Fetchresourceinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresourceinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceinput()
   * @see #getfetchresourceType()
   * @generated
   */
  EReference getfetchresourceType_Fetchresourceinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceoutput <em>Fetchresourceoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresourceoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceoutput()
   * @see #getfetchresourceType()
   * @generated
   */
  EReference getfetchresourceType_Fetchresourceoutput();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType <em>getprocessinstancesinput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>getprocessinstancesinput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType
   * @generated
   */
  EClass getgetprocessinstancesinputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType#getProcessname <em>Processname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType#getProcessname()
   * @see #getgetprocessinstancesinputType()
   * @generated
   */
  EAttribute getgetprocessinstancesinputType_Processname();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType <em>getprocessinstancesoutput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>getprocessinstancesoutput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType
   * @generated
   */
  EClass getgetprocessinstancesoutputType();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_complete <em>Pi complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pi complete</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_complete()
   * @see #getgetprocessinstancesoutputType()
   * @generated
   */
  EReference getgetprocessinstancesoutputType_Pi_complete();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_started <em>Pi started</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pi started</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_started()
   * @see #getgetprocessinstancesoutputType()
   * @generated
   */
  EReference getgetprocessinstancesoutputType_Pi_started();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_halted <em>Pi halted</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pi halted</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_halted()
   * @see #getgetprocessinstancesoutputType()
   * @generated
   */
  EReference getgetprocessinstancesoutputType_Pi_halted();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_cancelled <em>Pi cancelled</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pi cancelled</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_cancelled()
   * @see #getgetprocessinstancesoutputType()
   * @generated
   */
  EReference getgetprocessinstancesoutputType_Pi_cancelled();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType <em>getprocessinstances Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>getprocessinstances Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType
   * @generated
   */
  EClass getgetprocessinstancesType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesinput <em>Getprocessinstancesinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstancesinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesinput()
   * @see #getgetprocessinstancesType()
   * @generated
   */
  EReference getgetprocessinstancesType_Getprocessinstancesinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesoutput <em>Getprocessinstancesoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstancesoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesoutput()
   * @see #getgetprocessinstancesType()
   * @generated
   */
  EReference getgetprocessinstancesType_Getprocessinstancesoutput();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType <em>input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>input Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType
   * @generated
   */
  EClass getinputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getFirstname()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Firstname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getLastname <em>Lastname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lastname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getLastname()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Lastname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getEmail()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Email();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getPassword()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Password();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getOrgmodelname <em>Orgmodelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orgmodelname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getOrgmodelname()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Orgmodelname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getFlag <em>Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flag</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getFlag()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Flag();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType#getEntity()
   * @see #getinputType()
   * @generated
   */
  EAttribute getinputType_Entity();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType <em>ldapentryinputrepeat Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldapentryinputrepeat Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType
   * @generated
   */
  EClass getldapentryinputrepeatType();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Input</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType#getInput()
   * @see #getldapentryinputrepeatType()
   * @generated
   */
  EReference getldapentryinputrepeatType_Input();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType <em>ldapentryinput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldapentryinput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType
   * @generated
   */
  EClass getldapentryinputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getFirstname()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Firstname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getLastname <em>Lastname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lastname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getLastname()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Lastname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getEmail()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Email();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getPassword()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Password();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getOrgmodelname <em>Orgmodelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orgmodelname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getOrgmodelname()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Orgmodelname();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getFlag <em>Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flag</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getFlag()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Flag();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType#getEntity()
   * @see #getldapentryinputType()
   * @generated
   */
  EAttribute getldapentryinputType_Entity();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType <em>ldapentry Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ldapentry Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType
   * @generated
   */
  EClass getldapentryType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinput <em>Ldapentryinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentryinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinput()
   * @see #getldapentryType()
   * @generated
   */
  EReference getldapentryType_Ldapentryinput();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryoutput <em>Ldapentryoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ldapentryoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryoutput()
   * @see #getldapentryType()
   * @generated
   */
  EAttribute getldapentryType_Ldapentryoutput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinputrepeat <em>Ldapentryinputrepeat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentryinputrepeat</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinputrepeat()
   * @see #getldapentryType()
   * @generated
   */
  EReference getldapentryType_Ldapentryinputrepeat();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType <em>parsecsv Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>parsecsv Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType
   * @generated
   */
  EClass getparsecsvType();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType#getUsers <em>Users</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Users</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType#getUsers()
   * @see #getparsecsvType()
   * @generated
   */
  EReference getparsecsvType_Users();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType <em>pi cancelled Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pi cancelled Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType
   * @generated
   */
  EClass getpi_cancelledType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getProcess_instance <em>Process instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process instance</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getProcess_instance()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Process_instance();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getCustomer_name <em>Customer name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getCustomer_name()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Customer_name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getSibelcircuit_id <em>Sibelcircuit id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sibelcircuit id</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getSibelcircuit_id()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Sibelcircuit_id();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getProjectmanager <em>Projectmanager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectmanager</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getProjectmanager()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Projectmanager();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getCur_activity <em>Cur activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cur activity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getCur_activity()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Cur_activity();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getStatus()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Status();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getExec_mills <em>Exec mills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exec mills</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType#getExec_mills()
   * @see #getpi_cancelledType()
   * @generated
   */
  EAttribute getpi_cancelledType_Exec_mills();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType <em>pi complete Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pi complete Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType
   * @generated
   */
  EClass getpi_completeType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getProcess_instance <em>Process instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process instance</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getProcess_instance()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Process_instance();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getCustomer_name <em>Customer name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getCustomer_name()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Customer_name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getSibelcircuit_id <em>Sibelcircuit id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sibelcircuit id</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getSibelcircuit_id()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Sibelcircuit_id();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getProjectmanager <em>Projectmanager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectmanager</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getProjectmanager()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Projectmanager();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getCur_activity <em>Cur activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cur activity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getCur_activity()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Cur_activity();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getStatus()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Status();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getExec_mills <em>Exec mills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exec mills</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType#getExec_mills()
   * @see #getpi_completeType()
   * @generated
   */
  EAttribute getpi_completeType_Exec_mills();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType <em>pi halted Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pi halted Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType
   * @generated
   */
  EClass getpi_haltedType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getProcess_instance <em>Process instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process instance</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getProcess_instance()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Process_instance();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getCustomer_name <em>Customer name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getCustomer_name()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Customer_name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getSibelcircuit_id <em>Sibelcircuit id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sibelcircuit id</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getSibelcircuit_id()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Sibelcircuit_id();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getProjectmanager <em>Projectmanager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectmanager</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getProjectmanager()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Projectmanager();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getCur_activity <em>Cur activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cur activity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getCur_activity()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Cur_activity();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getStatus()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Status();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getExec_mills <em>Exec mills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exec mills</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType#getExec_mills()
   * @see #getpi_haltedType()
   * @generated
   */
  EAttribute getpi_haltedType_Exec_mills();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType <em>pi started Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pi started Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType
   * @generated
   */
  EClass getpi_startedType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getProcess_instance <em>Process instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process instance</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getProcess_instance()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Process_instance();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getCustomer_name <em>Customer name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getCustomer_name()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Customer_name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getSibelcircuit_id <em>Sibelcircuit id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sibelcircuit id</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getSibelcircuit_id()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Sibelcircuit_id();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getProjectmanager <em>Projectmanager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectmanager</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getProjectmanager()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Projectmanager();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getCur_activity <em>Cur activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cur activity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getCur_activity()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Cur_activity();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getStatus()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Status();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getExec_mills <em>Exec mills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exec mills</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType#getExec_mills()
   * @see #getpi_startedType()
   * @generated
   */
  EAttribute getpi_startedType_Exec_mills();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType <em>reesourcecreationandmapping Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>reesourcecreationandmapping Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType
   * @generated
   */
  EClass getreesourcecreationandmappingType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getCreateresource <em>Createresource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Createresource</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getCreateresource()
   * @see #getreesourcecreationandmappingType()
   * @generated
   */
  EReference getreesourcecreationandmappingType_Createresource();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getLdapentry <em>Ldapentry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ldapentry</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getLdapentry()
   * @see #getreesourcecreationandmappingType()
   * @generated
   */
  EReference getreesourcecreationandmappingType_Ldapentry();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getParsecsv <em>Parsecsv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parsecsv</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getParsecsv()
   * @see #getreesourcecreationandmappingType()
   * @generated
   */
  EReference getreesourcecreationandmappingType_Parsecsv();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType <em>reportgeneration Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>reportgeneration Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType
   * @generated
   */
  EClass getreportgenerationType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getGetprocessinstances <em>Getprocessinstances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Getprocessinstances</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getGetprocessinstances()
   * @see #getreportgenerationType()
   * @generated
   */
  EReference getreportgenerationType_Getprocessinstances();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getSearchprocessinstances <em>Searchprocessinstances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstances</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getSearchprocessinstances()
   * @see #getreportgenerationType()
   * @generated
   */
  EReference getreportgenerationType_Searchprocessinstances();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType <em>resource Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>resource Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType
   * @generated
   */
  EClass getresourceType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType#getGuid <em>Guid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guid</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType#getGuid()
   * @see #getresourceType()
   * @generated
   */
  EAttribute getresourceType_Guid();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType#getLabel()
   * @see #getresourceType()
   * @generated
   */
  EAttribute getresourceType_Label();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType#getName()
   * @see #getresourceType()
   * @generated
   */
  EAttribute getresourceType_Name();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType <em>root Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>root Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType
   * @generated
   */
  EClass getrootType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFetchresource <em>Fetchresource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fetchresource</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFetchresource()
   * @see #getrootType()
   * @generated
   */
  EReference getrootType_Fetchresource();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReportgeneration <em>Reportgeneration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reportgeneration</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReportgeneration()
   * @see #getrootType()
   * @generated
   */
  EReference getrootType_Reportgeneration();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReesourcecreationandmapping <em>Reesourcecreationandmapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reesourcecreationandmapping</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReesourcecreationandmapping()
   * @see #getrootType()
   * @generated
   */
  EReference getrootType_Reesourcecreationandmapping();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getWorkitemcompletion <em>Workitemcompletion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletion</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getWorkitemcompletion()
   * @see #getrootType()
   * @generated
   */
  EReference getrootType_Workitemcompletion();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFault <em>Fault</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fault</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFault()
   * @see #getrootType()
   * @generated
   */
  EReference getrootType_Fault();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType <em>searchprocessinstancesinput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>searchprocessinstancesinput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType
   * @generated
   */
  EClass getsearchprocessinstancesinputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchkey <em>Searchkey</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Searchkey</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchkey()
   * @see #getsearchprocessinstancesinputType()
   * @generated
   */
  EAttribute getsearchprocessinstancesinputType_Searchkey();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchvalue <em>Searchvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Searchvalue</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchvalue()
   * @see #getsearchprocessinstancesinputType()
   * @generated
   */
  EAttribute getsearchprocessinstancesinputType_Searchvalue();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType <em>searchprocessinstancesoutput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>searchprocessinstancesoutput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType
   * @generated
   */
  EClass getsearchprocessinstancesoutputType();

  /**
   * Returns the meta object for the containment reference list '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType#getSearchrecord <em>Searchrecord</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Searchrecord</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType#getSearchrecord()
   * @see #getsearchprocessinstancesoutputType()
   * @generated
   */
  EReference getsearchprocessinstancesoutputType_Searchrecord();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType <em>searchprocessinstances Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>searchprocessinstances Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType
   * @generated
   */
  EClass getsearchprocessinstancesType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesinput <em>Searchprocessinstancesinput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstancesinput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesinput()
   * @see #getsearchprocessinstancesType()
   * @generated
   */
  EReference getsearchprocessinstancesType_Searchprocessinstancesinput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesoutput <em>Searchprocessinstancesoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Searchprocessinstancesoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesoutput()
   * @see #getsearchprocessinstancesType()
   * @generated
   */
  EReference getsearchprocessinstancesType_Searchprocessinstancesoutput();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType <em>searchrecord Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>searchrecord Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType
   * @generated
   */
  EClass getsearchrecordType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getProcess_instance <em>Process instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process instance</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getProcess_instance()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Process_instance();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getCustomer_name <em>Customer name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Customer name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getCustomer_name()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Customer_name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getSibelcircuit_id <em>Sibelcircuit id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sibelcircuit id</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getSibelcircuit_id()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Sibelcircuit_id();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getProjectmanager <em>Projectmanager</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Projectmanager</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getProjectmanager()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Projectmanager();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getCur_activity <em>Cur activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cur activity</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getCur_activity()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Cur_activity();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getStatus()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Status();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getExec_mills <em>Exec mills</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exec mills</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType#getExec_mills()
   * @see #getsearchrecordType()
   * @generated
   */
  EAttribute getsearchrecordType_Exec_mills();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType <em>users Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>users Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType
   * @generated
   */
  EClass getusersType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getName()
   * @see #getusersType()
   * @generated
   */
  EAttribute getusersType_Name();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getFlag <em>Flag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Flag</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getFlag()
   * @see #getusersType()
   * @generated
   */
  EAttribute getusersType_Flag();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getEntityvalue <em>Entityvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entityvalue</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getEntityvalue()
   * @see #getusersType()
   * @generated
   */
  EAttribute getusersType_Entityvalue();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getOrgmodelname <em>Orgmodelname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orgmodelname</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType#getOrgmodelname()
   * @see #getusersType()
   * @generated
   */
  EAttribute getusersType_Orgmodelname();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType <em>workitemcompletioninput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>workitemcompletioninput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType
   * @generated
   */
  EClass getworkitemcompletioninputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType#getSibelcircuitid <em>Sibelcircuitid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sibelcircuitid</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType#getSibelcircuitid()
   * @see #getworkitemcompletioninputType()
   * @generated
   */
  EAttribute getworkitemcompletioninputType_Sibelcircuitid();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType <em>workitemcompletionoutput Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>workitemcompletionoutput Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType
   * @generated
   */
  EClass getworkitemcompletionoutputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType#getOutputmessage <em>Outputmessage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Outputmessage</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType#getOutputmessage()
   * @see #getworkitemcompletionoutputType()
   * @generated
   */
  EAttribute getworkitemcompletionoutputType_Outputmessage();

  /**
   * Returns the meta object for class '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType <em>workitemcompletion Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>workitemcompletion Type</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType
   * @generated
   */
  EClass getworkitemcompletionType();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletioninput <em>Workitemcompletioninput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletioninput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletioninput()
   * @see #getworkitemcompletionType()
   * @generated
   */
  EReference getworkitemcompletionType_Workitemcompletioninput();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletionoutput <em>Workitemcompletionoutput</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Workitemcompletionoutput</em>'.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletionoutput()
   * @see #getworkitemcompletionType()
   * @generated
   */
  EReference getworkitemcompletionType_Workitemcompletionoutput();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SchemaFactory getSchemaFactory();

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
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl <em>createresourceinput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getcreateresourceinputType()
     * @generated
     */
    EClass CREATERESOURCEINPUT_TYPE = eINSTANCE.getcreateresourceinputType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATERESOURCEINPUT_TYPE__NAME = eINSTANCE.getcreateresourceinputType_Name();

    /**
     * The meta object literal for the '<em><b>Orgname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATERESOURCEINPUT_TYPE__ORGNAME = eINSTANCE.getcreateresourceinputType_Orgname();

    /**
     * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATERESOURCEINPUT_TYPE__FLAG = eINSTANCE.getcreateresourceinputType_Flag();

    /**
     * The meta object literal for the '<em><b>Entityname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATERESOURCEINPUT_TYPE__ENTITYNAME = eINSTANCE.getcreateresourceinputType_Entityname();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceoutputTypeImpl <em>createresourceoutput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceoutputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getcreateresourceoutputType()
     * @generated
     */
    EClass CREATERESOURCEOUTPUT_TYPE = eINSTANCE.getcreateresourceoutputType();

    /**
     * The meta object literal for the '<em><b>Outputmessage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATERESOURCEOUTPUT_TYPE__OUTPUTMESSAGE = eINSTANCE.getcreateresourceoutputType_Outputmessage();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceTypeImpl <em>createresource Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getcreateresourceType()
     * @generated
     */
    EClass CREATERESOURCE_TYPE = eINSTANCE.getcreateresourceType();

    /**
     * The meta object literal for the '<em><b>Createresourceinput</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATERESOURCE_TYPE__CREATERESOURCEINPUT = eINSTANCE.getcreateresourceType_Createresourceinput();

    /**
     * The meta object literal for the '<em><b>Createresourceoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT = eINSTANCE.getcreateresourceType_Createresourceoutput();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.DocumentRootImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Createresource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATERESOURCE = eINSTANCE.getDocumentRoot_Createresource();

    /**
     * The meta object literal for the '<em><b>Createresourceinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATERESOURCEINPUT = eINSTANCE.getDocumentRoot_Createresourceinput();

    /**
     * The meta object literal for the '<em><b>Createresourceoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATERESOURCEOUTPUT = eINSTANCE.getDocumentRoot_Createresourceoutput();

    /**
     * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FAULT = eINSTANCE.getDocumentRoot_Fault();

    /**
     * The meta object literal for the '<em><b>Fetchresource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FETCHRESOURCE = eINSTANCE.getDocumentRoot_Fetchresource();

    /**
     * The meta object literal for the '<em><b>Fetchresourceinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FETCHRESOURCEINPUT = eINSTANCE.getDocumentRoot_Fetchresourceinput();

    /**
     * The meta object literal for the '<em><b>Fetchresourceoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FETCHRESOURCEOUTPUT = eINSTANCE.getDocumentRoot_Fetchresourceoutput();

    /**
     * The meta object literal for the '<em><b>Getprocessinstances</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GETPROCESSINSTANCES = eINSTANCE.getDocumentRoot_Getprocessinstances();

    /**
     * The meta object literal for the '<em><b>Getprocessinstancesinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT = eINSTANCE.getDocumentRoot_Getprocessinstancesinput();

    /**
     * The meta object literal for the '<em><b>Getprocessinstancesoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT = eINSTANCE.getDocumentRoot_Getprocessinstancesoutput();

    /**
     * The meta object literal for the '<em><b>Ldapentry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LDAPENTRY = eINSTANCE.getDocumentRoot_Ldapentry();

    /**
     * The meta object literal for the '<em><b>Ldapentryinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LDAPENTRYINPUT = eINSTANCE.getDocumentRoot_Ldapentryinput();

    /**
     * The meta object literal for the '<em><b>Ldapentryinputrepeat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT = eINSTANCE.getDocumentRoot_Ldapentryinputrepeat();

    /**
     * The meta object literal for the '<em><b>Ldapentryoutput</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__LDAPENTRYOUTPUT = eINSTANCE.getDocumentRoot_Ldapentryoutput();

    /**
     * The meta object literal for the '<em><b>Parsecsv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PARSECSV = eINSTANCE.getDocumentRoot_Parsecsv();

    /**
     * The meta object literal for the '<em><b>Reesourcecreationandmapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING = eINSTANCE.getDocumentRoot_Reesourcecreationandmapping();

    /**
     * The meta object literal for the '<em><b>Reportgeneration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REPORTGENERATION = eINSTANCE.getDocumentRoot_Reportgeneration();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ROOT = eINSTANCE.getDocumentRoot_Root();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstances</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHPROCESSINSTANCES = eINSTANCE.getDocumentRoot_Searchprocessinstances();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstancesinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT = eINSTANCE.getDocumentRoot_Searchprocessinstancesinput();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstancesoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT = eINSTANCE.getDocumentRoot_Searchprocessinstancesoutput();

    /**
     * The meta object literal for the '<em><b>Workitemcompletion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WORKITEMCOMPLETION = eINSTANCE.getDocumentRoot_Workitemcompletion();

    /**
     * The meta object literal for the '<em><b>Workitemcompletioninput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT = eINSTANCE.getDocumentRoot_Workitemcompletioninput();

    /**
     * The meta object literal for the '<em><b>Workitemcompletionoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT = eINSTANCE.getDocumentRoot_Workitemcompletionoutput();

    /**
     * The meta object literal for the '<em><b>Createresourceinput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateresourceinputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Createresourceoutput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateresourceoutputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Createresource Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateresourceTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Fault Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_FaultTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Fetchresourceinput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_FetchresourceinputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Fetchresourceoutput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_FetchresourceoutputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Fetchresource Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_FetchresourceTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Getprocessinstancesinput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GetprocessinstancesinputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Getprocessinstancesoutput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GetprocessinstancesoutputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Getprocessinstances Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GetprocessinstancesTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Input Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_InputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Ldapentryinputrepeat Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_LdapentryinputrepeatTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Ldapentryinput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_LdapentryinputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Ldapentry Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_LdapentryTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Parsecsv Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ParsecsvTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Pi cancelled Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_Pi_cancelledTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Pi complete Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_Pi_completeTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Pi halted Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_Pi_haltedTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Pi started Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_Pi_startedTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Reesourcecreationandmapping Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ReesourcecreationandmappingTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Reportgeneration Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ReportgenerationTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Resource Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_ResourceTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Root Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_RootTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstancesinput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchprocessinstancesinputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstancesoutput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchprocessinstancesoutputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstances Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchprocessinstancesTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Searchrecord Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchrecordTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Users Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_UsersTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Workitemcompletioninput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_WorkitemcompletioninputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Workitemcompletionoutput Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_WorkitemcompletionoutputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Workitemcompletion Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_WorkitemcompletionTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.faultTypeImpl <em>fault Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.faultTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfaultType()
     * @generated
     */
    EClass FAULT_TYPE = eINSTANCE.getfaultType();

    /**
     * The meta object literal for the '<em><b>Faultmessage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FAULT_TYPE__FAULTMESSAGE = eINSTANCE.getfaultType_Faultmessage();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceinputTypeImpl <em>fetchresourceinput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceinputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfetchresourceinputType()
     * @generated
     */
    EClass FETCHRESOURCEINPUT_TYPE = eINSTANCE.getfetchresourceinputType();

    /**
     * The meta object literal for the '<em><b>Processname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FETCHRESOURCEINPUT_TYPE__PROCESSNAME = eINSTANCE.getfetchresourceinputType_Processname();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceoutputTypeImpl <em>fetchresourceoutput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceoutputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfetchresourceoutputType()
     * @generated
     */
    EClass FETCHRESOURCEOUTPUT_TYPE = eINSTANCE.getfetchresourceoutputType();

    /**
     * The meta object literal for the '<em><b>Resource</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCHRESOURCEOUTPUT_TYPE__RESOURCE = eINSTANCE.getfetchresourceoutputType_Resource();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceTypeImpl <em>fetchresource Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getfetchresourceType()
     * @generated
     */
    EClass FETCHRESOURCE_TYPE = eINSTANCE.getfetchresourceType();

    /**
     * The meta object literal for the '<em><b>Fetchresourceinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT = eINSTANCE.getfetchresourceType_Fetchresourceinput();

    /**
     * The meta object literal for the '<em><b>Fetchresourceoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT = eINSTANCE.getfetchresourceType_Fetchresourceoutput();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesinputTypeImpl <em>getprocessinstancesinput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesinputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getgetprocessinstancesinputType()
     * @generated
     */
    EClass GETPROCESSINSTANCESINPUT_TYPE = eINSTANCE.getgetprocessinstancesinputType();

    /**
     * The meta object literal for the '<em><b>Processname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GETPROCESSINSTANCESINPUT_TYPE__PROCESSNAME = eINSTANCE.getgetprocessinstancesinputType_Processname();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl <em>getprocessinstancesoutput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getgetprocessinstancesoutputType()
     * @generated
     */
    EClass GETPROCESSINSTANCESOUTPUT_TYPE = eINSTANCE.getgetprocessinstancesoutputType();

    /**
     * The meta object literal for the '<em><b>Pi complete</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE = eINSTANCE.getgetprocessinstancesoutputType_Pi_complete();

    /**
     * The meta object literal for the '<em><b>Pi started</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED = eINSTANCE.getgetprocessinstancesoutputType_Pi_started();

    /**
     * The meta object literal for the '<em><b>Pi halted</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED = eINSTANCE.getgetprocessinstancesoutputType_Pi_halted();

    /**
     * The meta object literal for the '<em><b>Pi cancelled</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED = eINSTANCE.getgetprocessinstancesoutputType_Pi_cancelled();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesTypeImpl <em>getprocessinstances Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getgetprocessinstancesType()
     * @generated
     */
    EClass GETPROCESSINSTANCES_TYPE = eINSTANCE.getgetprocessinstancesType();

    /**
     * The meta object literal for the '<em><b>Getprocessinstancesinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT = eINSTANCE.getgetprocessinstancesType_Getprocessinstancesinput();

    /**
     * The meta object literal for the '<em><b>Getprocessinstancesoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT = eINSTANCE.getgetprocessinstancesType_Getprocessinstancesoutput();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.inputTypeImpl <em>input Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.inputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getinputType()
     * @generated
     */
    EClass INPUT_TYPE = eINSTANCE.getinputType();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__FIRSTNAME = eINSTANCE.getinputType_Firstname();

    /**
     * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__LASTNAME = eINSTANCE.getinputType_Lastname();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__EMAIL = eINSTANCE.getinputType_Email();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__PASSWORD = eINSTANCE.getinputType_Password();

    /**
     * The meta object literal for the '<em><b>Orgmodelname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__ORGMODELNAME = eINSTANCE.getinputType_Orgmodelname();

    /**
     * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__FLAG = eINSTANCE.getinputType_Flag();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__ENTITY = eINSTANCE.getinputType_Entity();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputrepeatTypeImpl <em>ldapentryinputrepeat Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputrepeatTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getldapentryinputrepeatType()
     * @generated
     */
    EClass LDAPENTRYINPUTREPEAT_TYPE = eINSTANCE.getldapentryinputrepeatType();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDAPENTRYINPUTREPEAT_TYPE__INPUT = eINSTANCE.getldapentryinputrepeatType_Input();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl <em>ldapentryinput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getldapentryinputType()
     * @generated
     */
    EClass LDAPENTRYINPUT_TYPE = eINSTANCE.getldapentryinputType();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__FIRSTNAME = eINSTANCE.getldapentryinputType_Firstname();

    /**
     * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__LASTNAME = eINSTANCE.getldapentryinputType_Lastname();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__EMAIL = eINSTANCE.getldapentryinputType_Email();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__PASSWORD = eINSTANCE.getldapentryinputType_Password();

    /**
     * The meta object literal for the '<em><b>Orgmodelname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__ORGMODELNAME = eINSTANCE.getldapentryinputType_Orgmodelname();

    /**
     * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__FLAG = eINSTANCE.getldapentryinputType_Flag();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRYINPUT_TYPE__ENTITY = eINSTANCE.getldapentryinputType_Entity();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl <em>ldapentry Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getldapentryType()
     * @generated
     */
    EClass LDAPENTRY_TYPE = eINSTANCE.getldapentryType();

    /**
     * The meta object literal for the '<em><b>Ldapentryinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDAPENTRY_TYPE__LDAPENTRYINPUT = eINSTANCE.getldapentryType_Ldapentryinput();

    /**
     * The meta object literal for the '<em><b>Ldapentryoutput</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LDAPENTRY_TYPE__LDAPENTRYOUTPUT = eINSTANCE.getldapentryType_Ldapentryoutput();

    /**
     * The meta object literal for the '<em><b>Ldapentryinputrepeat</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT = eINSTANCE.getldapentryType_Ldapentryinputrepeat();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.parsecsvTypeImpl <em>parsecsv Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.parsecsvTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getparsecsvType()
     * @generated
     */
    EClass PARSECSV_TYPE = eINSTANCE.getparsecsvType();

    /**
     * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSECSV_TYPE__USERS = eINSTANCE.getparsecsvType_Users();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_cancelledTypeImpl <em>pi cancelled Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_cancelledTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_cancelledType()
     * @generated
     */
    EClass PI_CANCELLED_TYPE = eINSTANCE.getpi_cancelledType();

    /**
     * The meta object literal for the '<em><b>Process instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__PROCESS_INSTANCE = eINSTANCE.getpi_cancelledType_Process_instance();

    /**
     * The meta object literal for the '<em><b>Customer name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__CUSTOMER_NAME = eINSTANCE.getpi_cancelledType_Customer_name();

    /**
     * The meta object literal for the '<em><b>Sibelcircuit id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__SIBELCIRCUIT_ID = eINSTANCE.getpi_cancelledType_Sibelcircuit_id();

    /**
     * The meta object literal for the '<em><b>Projectmanager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__PROJECTMANAGER = eINSTANCE.getpi_cancelledType_Projectmanager();

    /**
     * The meta object literal for the '<em><b>Cur activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__CUR_ACTIVITY = eINSTANCE.getpi_cancelledType_Cur_activity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__STATUS = eINSTANCE.getpi_cancelledType_Status();

    /**
     * The meta object literal for the '<em><b>Exec mills</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_CANCELLED_TYPE__EXEC_MILLS = eINSTANCE.getpi_cancelledType_Exec_mills();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_completeTypeImpl <em>pi complete Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_completeTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_completeType()
     * @generated
     */
    EClass PI_COMPLETE_TYPE = eINSTANCE.getpi_completeType();

    /**
     * The meta object literal for the '<em><b>Process instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__PROCESS_INSTANCE = eINSTANCE.getpi_completeType_Process_instance();

    /**
     * The meta object literal for the '<em><b>Customer name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__CUSTOMER_NAME = eINSTANCE.getpi_completeType_Customer_name();

    /**
     * The meta object literal for the '<em><b>Sibelcircuit id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__SIBELCIRCUIT_ID = eINSTANCE.getpi_completeType_Sibelcircuit_id();

    /**
     * The meta object literal for the '<em><b>Projectmanager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__PROJECTMANAGER = eINSTANCE.getpi_completeType_Projectmanager();

    /**
     * The meta object literal for the '<em><b>Cur activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__CUR_ACTIVITY = eINSTANCE.getpi_completeType_Cur_activity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__STATUS = eINSTANCE.getpi_completeType_Status();

    /**
     * The meta object literal for the '<em><b>Exec mills</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_COMPLETE_TYPE__EXEC_MILLS = eINSTANCE.getpi_completeType_Exec_mills();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_haltedTypeImpl <em>pi halted Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_haltedTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_haltedType()
     * @generated
     */
    EClass PI_HALTED_TYPE = eINSTANCE.getpi_haltedType();

    /**
     * The meta object literal for the '<em><b>Process instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__PROCESS_INSTANCE = eINSTANCE.getpi_haltedType_Process_instance();

    /**
     * The meta object literal for the '<em><b>Customer name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__CUSTOMER_NAME = eINSTANCE.getpi_haltedType_Customer_name();

    /**
     * The meta object literal for the '<em><b>Sibelcircuit id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__SIBELCIRCUIT_ID = eINSTANCE.getpi_haltedType_Sibelcircuit_id();

    /**
     * The meta object literal for the '<em><b>Projectmanager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__PROJECTMANAGER = eINSTANCE.getpi_haltedType_Projectmanager();

    /**
     * The meta object literal for the '<em><b>Cur activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__CUR_ACTIVITY = eINSTANCE.getpi_haltedType_Cur_activity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__STATUS = eINSTANCE.getpi_haltedType_Status();

    /**
     * The meta object literal for the '<em><b>Exec mills</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_HALTED_TYPE__EXEC_MILLS = eINSTANCE.getpi_haltedType_Exec_mills();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl <em>pi started Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.pi_startedTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getpi_startedType()
     * @generated
     */
    EClass PI_STARTED_TYPE = eINSTANCE.getpi_startedType();

    /**
     * The meta object literal for the '<em><b>Process instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__PROCESS_INSTANCE = eINSTANCE.getpi_startedType_Process_instance();

    /**
     * The meta object literal for the '<em><b>Customer name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__CUSTOMER_NAME = eINSTANCE.getpi_startedType_Customer_name();

    /**
     * The meta object literal for the '<em><b>Sibelcircuit id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__SIBELCIRCUIT_ID = eINSTANCE.getpi_startedType_Sibelcircuit_id();

    /**
     * The meta object literal for the '<em><b>Projectmanager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__PROJECTMANAGER = eINSTANCE.getpi_startedType_Projectmanager();

    /**
     * The meta object literal for the '<em><b>Cur activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__CUR_ACTIVITY = eINSTANCE.getpi_startedType_Cur_activity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__STATUS = eINSTANCE.getpi_startedType_Status();

    /**
     * The meta object literal for the '<em><b>Exec mills</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PI_STARTED_TYPE__EXEC_MILLS = eINSTANCE.getpi_startedType_Exec_mills();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl <em>reesourcecreationandmapping Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getreesourcecreationandmappingType()
     * @generated
     */
    EClass REESOURCECREATIONANDMAPPING_TYPE = eINSTANCE.getreesourcecreationandmappingType();

    /**
     * The meta object literal for the '<em><b>Createresource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE = eINSTANCE.getreesourcecreationandmappingType_Createresource();

    /**
     * The meta object literal for the '<em><b>Ldapentry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY = eINSTANCE.getreesourcecreationandmappingType_Ldapentry();

    /**
     * The meta object literal for the '<em><b>Parsecsv</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REESOURCECREATIONANDMAPPING_TYPE__PARSECSV = eINSTANCE.getreesourcecreationandmappingType_Parsecsv();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reportgenerationTypeImpl <em>reportgeneration Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reportgenerationTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getreportgenerationType()
     * @generated
     */
    EClass REPORTGENERATION_TYPE = eINSTANCE.getreportgenerationType();

    /**
     * The meta object literal for the '<em><b>Getprocessinstances</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPORTGENERATION_TYPE__GETPROCESSINSTANCES = eINSTANCE.getreportgenerationType_Getprocessinstances();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstances</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES = eINSTANCE.getreportgenerationType_Searchprocessinstances();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl <em>resource Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.resourceTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getresourceType()
     * @generated
     */
    EClass RESOURCE_TYPE = eINSTANCE.getresourceType();

    /**
     * The meta object literal for the '<em><b>Guid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_TYPE__GUID = eINSTANCE.getresourceType_Guid();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_TYPE__LABEL = eINSTANCE.getresourceType_Label();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_TYPE__NAME = eINSTANCE.getresourceType_Name();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl <em>root Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getrootType()
     * @generated
     */
    EClass ROOT_TYPE = eINSTANCE.getrootType();

    /**
     * The meta object literal for the '<em><b>Fetchresource</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_TYPE__FETCHRESOURCE = eINSTANCE.getrootType_Fetchresource();

    /**
     * The meta object literal for the '<em><b>Reportgeneration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_TYPE__REPORTGENERATION = eINSTANCE.getrootType_Reportgeneration();

    /**
     * The meta object literal for the '<em><b>Reesourcecreationandmapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_TYPE__REESOURCECREATIONANDMAPPING = eINSTANCE.getrootType_Reesourcecreationandmapping();

    /**
     * The meta object literal for the '<em><b>Workitemcompletion</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_TYPE__WORKITEMCOMPLETION = eINSTANCE.getrootType_Workitemcompletion();

    /**
     * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT_TYPE__FAULT = eINSTANCE.getrootType_Fault();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesinputTypeImpl <em>searchprocessinstancesinput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesinputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchprocessinstancesinputType()
     * @generated
     */
    EClass SEARCHPROCESSINSTANCESINPUT_TYPE = eINSTANCE.getsearchprocessinstancesinputType();

    /**
     * The meta object literal for the '<em><b>Searchkey</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY = eINSTANCE.getsearchprocessinstancesinputType_Searchkey();

    /**
     * The meta object literal for the '<em><b>Searchvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE = eINSTANCE.getsearchprocessinstancesinputType_Searchvalue();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesoutputTypeImpl <em>searchprocessinstancesoutput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesoutputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchprocessinstancesoutputType()
     * @generated
     */
    EClass SEARCHPROCESSINSTANCESOUTPUT_TYPE = eINSTANCE.getsearchprocessinstancesoutputType();

    /**
     * The meta object literal for the '<em><b>Searchrecord</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD = eINSTANCE.getsearchprocessinstancesoutputType_Searchrecord();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesTypeImpl <em>searchprocessinstances Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchprocessinstancesType()
     * @generated
     */
    EClass SEARCHPROCESSINSTANCES_TYPE = eINSTANCE.getsearchprocessinstancesType();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstancesinput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT = eINSTANCE.getsearchprocessinstancesType_Searchprocessinstancesinput();

    /**
     * The meta object literal for the '<em><b>Searchprocessinstancesoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT = eINSTANCE.getsearchprocessinstancesType_Searchprocessinstancesoutput();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchrecordTypeImpl <em>searchrecord Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchrecordTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getsearchrecordType()
     * @generated
     */
    EClass SEARCHRECORD_TYPE = eINSTANCE.getsearchrecordType();

    /**
     * The meta object literal for the '<em><b>Process instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__PROCESS_INSTANCE = eINSTANCE.getsearchrecordType_Process_instance();

    /**
     * The meta object literal for the '<em><b>Customer name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__CUSTOMER_NAME = eINSTANCE.getsearchrecordType_Customer_name();

    /**
     * The meta object literal for the '<em><b>Sibelcircuit id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__SIBELCIRCUIT_ID = eINSTANCE.getsearchrecordType_Sibelcircuit_id();

    /**
     * The meta object literal for the '<em><b>Projectmanager</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__PROJECTMANAGER = eINSTANCE.getsearchrecordType_Projectmanager();

    /**
     * The meta object literal for the '<em><b>Cur activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__CUR_ACTIVITY = eINSTANCE.getsearchrecordType_Cur_activity();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__STATUS = eINSTANCE.getsearchrecordType_Status();

    /**
     * The meta object literal for the '<em><b>Exec mills</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCHRECORD_TYPE__EXEC_MILLS = eINSTANCE.getsearchrecordType_Exec_mills();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl <em>users Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getusersType()
     * @generated
     */
    EClass USERS_TYPE = eINSTANCE.getusersType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USERS_TYPE__NAME = eINSTANCE.getusersType_Name();

    /**
     * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USERS_TYPE__FLAG = eINSTANCE.getusersType_Flag();

    /**
     * The meta object literal for the '<em><b>Entityvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USERS_TYPE__ENTITYVALUE = eINSTANCE.getusersType_Entityvalue();

    /**
     * The meta object literal for the '<em><b>Orgmodelname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USERS_TYPE__ORGMODELNAME = eINSTANCE.getusersType_Orgmodelname();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletioninputTypeImpl <em>workitemcompletioninput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletioninputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getworkitemcompletioninputType()
     * @generated
     */
    EClass WORKITEMCOMPLETIONINPUT_TYPE = eINSTANCE.getworkitemcompletioninputType();

    /**
     * The meta object literal for the '<em><b>Sibelcircuitid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID = eINSTANCE.getworkitemcompletioninputType_Sibelcircuitid();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionoutputTypeImpl <em>workitemcompletionoutput Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionoutputTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getworkitemcompletionoutputType()
     * @generated
     */
    EClass WORKITEMCOMPLETIONOUTPUT_TYPE = eINSTANCE.getworkitemcompletionoutputType();

    /**
     * The meta object literal for the '<em><b>Outputmessage</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE = eINSTANCE.getworkitemcompletionoutputType_Outputmessage();

    /**
     * The meta object literal for the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionTypeImpl <em>workitemcompletion Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionTypeImpl
     * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.SchemaPackageImpl#getworkitemcompletionType()
     * @generated
     */
    EClass WORKITEMCOMPLETION_TYPE = eINSTANCE.getworkitemcompletionType();

    /**
     * The meta object literal for the '<em><b>Workitemcompletioninput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT = eINSTANCE.getworkitemcompletionType_Workitemcompletioninput();

    /**
     * The meta object literal for the '<em><b>Workitemcompletionoutput</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT = eINSTANCE.getworkitemcompletionType_Workitemcompletionoutput();

  }

} //SchemaPackage

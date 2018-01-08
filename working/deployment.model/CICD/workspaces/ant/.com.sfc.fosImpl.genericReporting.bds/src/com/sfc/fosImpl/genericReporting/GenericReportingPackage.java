
package com.sfc.fosImpl.genericReporting;

import com.sfc.fosImpl.genericReporting.bdsutil.BDSValidationUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * BOMORIGIN::/com.sfc.fosImpl.genericReporting/Business Objects/GenericReporting.bom
 * <!-- end-model-doc -->
 * @see com.sfc.fosImpl.genericReporting.GenericReportingFactory
 * @model kind="package"
 * @generated
 */
public interface GenericReportingPackage extends EPackage
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
  String eNAME = "genericReporting";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://fosImpl.sfc.com/genericReporting";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "reporting";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenericReportingPackage eINSTANCE = com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 0;

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
   * The feature id for the '<em><b>Record Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RECORD_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Task Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TASK_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Record BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Task BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl <em>Record</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sfc.fosImpl.genericReporting.impl.RecordImpl
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getRecord()
   * @generated
   */
  int RECORD = 1;

  /**
   * The feature id for the '<em><b>Process Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Process Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__PROCESS_TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__STATUS = 2;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__TIME = 3;

  /**
   * The feature id for the '<em><b>Siebel Circuit ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__SIEBEL_CIRCUIT_ID = 4;

  /**
   * The feature id for the '<em><b>Client Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__CLIENT_NAME = 5;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__PROJECT_NAME = 6;

  /**
   * The feature id for the '<em><b>Current Activity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD__CURRENT_ACTIVITY = 7;

  /**
   * The number of structural features of the '<em>Record</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sfc.fosImpl.genericReporting.impl.TaskImpl
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getTask()
   * @generated
   */
  int TASK = 2;

  /**
   * The feature id for the '<em><b>Process Instance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PROCESS_INSTANCE = 0;

  /**
   * The feature id for the '<em><b>First Offer Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__FIRST_OFFER_TIME = 1;

  /**
   * The feature id for the '<em><b>Task Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_NAME = 2;

  /**
   * The feature id for the '<em><b>Task Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_DURATION = 3;

  /**
   * The feature id for the '<em><b>Wait Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__WAIT_DURATION = 4;

  /**
   * The feature id for the '<em><b>Work Duration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__WORK_DURATION = 5;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STATUS = 6;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '<em>client Name Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getclientName_RecordType()
   * @generated
   */
  int CLIENT_NAME_RECORD_TYPE = 3;

  /**
   * The meta object id for the '<em>current Activity Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getcurrentActivity_RecordType()
   * @generated
   */
  int CURRENT_ACTIVITY_RECORD_TYPE = 4;

  /**
   * The meta object id for the '<em>first Offer Time Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getfirstOfferTime_TaskType()
   * @generated
   */
  int FIRST_OFFER_TIME_TASK_TYPE = 5;

  /**
   * The meta object id for the '<em>process Instance Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprocessInstance_TaskType()
   * @generated
   */
  int PROCESS_INSTANCE_TASK_TYPE = 6;

  /**
   * The meta object id for the '<em>process Instance Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprocessInstance_RecordType()
   * @generated
   */
  int PROCESS_INSTANCE_RECORD_TYPE = 7;

  /**
   * The meta object id for the '<em>process Template Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprocessTemplate_RecordType()
   * @generated
   */
  int PROCESS_TEMPLATE_RECORD_TYPE = 8;

  /**
   * The meta object id for the '<em>project Name Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprojectName_RecordType()
   * @generated
   */
  int PROJECT_NAME_RECORD_TYPE = 9;

  /**
   * The meta object id for the '<em>siebel Circuit ID Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getsiebelCircuitID_RecordType()
   * @generated
   */
  int SIEBEL_CIRCUIT_ID_RECORD_TYPE = 10;

  /**
   * The meta object id for the '<em>status Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getstatus_TaskType()
   * @generated
   */
  int STATUS_TASK_TYPE = 11;

  /**
   * The meta object id for the '<em>status Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getstatus_RecordType()
   * @generated
   */
  int STATUS_RECORD_TYPE = 12;

  /**
   * The meta object id for the '<em>task Duration Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#gettaskDuration_TaskType()
   * @generated
   */
  int TASK_DURATION_TASK_TYPE = 13;

  /**
   * The meta object id for the '<em>task Name Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#gettaskName_TaskType()
   * @generated
   */
  int TASK_NAME_TASK_TYPE = 14;

  /**
   * The meta object id for the '<em>time Record Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#gettime_RecordType()
   * @generated
   */
  int TIME_RECORD_TYPE = 15;

  /**
   * The meta object id for the '<em>wait Duration Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getwaitDuration_TaskType()
   * @generated
   */
  int WAIT_DURATION_TASK_TYPE = 16;

  /**
   * The meta object id for the '<em>work Duration Task Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getworkDuration_TaskType()
   * @generated
   */
  int WORK_DURATION_TASK_TYPE = 17;


  /**
   * Returns the meta object for class '{@link com.sfc.fosImpl.genericReporting.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordElement <em>Record Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record Element</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_RecordElement();

  /**
   * Returns the meta object for the containment reference '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskElement <em>Task Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Task Element</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_TaskElement();

  /**
   * Returns the meta object for the containment reference '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordBDSInternalSerializationElement <em>Record BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Record BDS Internal Serialization Element</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_RecordBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskBDSInternalSerializationElement <em>Task BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Task BDS Internal Serialization Element</em>'.
   * @see com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_TaskBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.sfc.fosImpl.genericReporting.Record <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record
   * @generated
   */
  EClass getRecord();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getProcessInstance <em>Process Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Instance</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getProcessInstance()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_ProcessInstance();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getProcessTemplate <em>Process Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Template</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getProcessTemplate()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_ProcessTemplate();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getStatus()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_Status();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getTime()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_Time();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getSiebelCircuitID <em>Siebel Circuit ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Siebel Circuit ID</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getSiebelCircuitID()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_SiebelCircuitID();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getClientName <em>Client Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Client Name</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getClientName()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_ClientName();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getProjectName()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_ProjectName();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Record#getCurrentActivity <em>Current Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Activity</em>'.
   * @see com.sfc.fosImpl.genericReporting.Record#getCurrentActivity()
   * @see #getRecord()
   * @generated
   */
  EAttribute getRecord_CurrentActivity();

  /**
   * Returns the meta object for class '{@link com.sfc.fosImpl.genericReporting.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getProcessInstance <em>Process Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Process Instance</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getProcessInstance()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_ProcessInstance();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getFirstOfferTime <em>First Offer Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Offer Time</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getFirstOfferTime()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_FirstOfferTime();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getTaskName <em>Task Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Name</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getTaskName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_TaskName();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getTaskDuration <em>Task Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Duration</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getTaskDuration()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_TaskDuration();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getWaitDuration <em>Wait Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wait Duration</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getWaitDuration()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_WaitDuration();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getWorkDuration <em>Work Duration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Work Duration</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getWorkDuration()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_WorkDuration();

  /**
   * Returns the meta object for the attribute '{@link com.sfc.fosImpl.genericReporting.Task#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see com.sfc.fosImpl.genericReporting.Task#getStatus()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Status();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>client Name Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>client Name Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='clientName_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getclientName_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>current Activity Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>current Activity Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='currentActivity_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getcurrentActivity_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>first Offer Time Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>first Offer Time Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='firstOfferTime_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150'"
   * @generated
   */
  EDataType getfirstOfferTime_TaskType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>process Instance Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>process Instance Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='processInstance_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='100'"
   * @generated
   */
  EDataType getprocessInstance_TaskType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>process Instance Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>process Instance Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='processInstance_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getprocessInstance_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>process Template Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>process Template Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='processTemplate_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getprocessTemplate_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>project Name Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>project Name Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='projectName_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getprojectName_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>siebel Circuit ID Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>siebel Circuit ID Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='siebelCircuitID_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getsiebelCircuitID_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>status Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>status Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='status_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150'"
   * @generated
   */
  EDataType getstatus_TaskType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>status Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>status Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='status_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getstatus_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>task Duration Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>task Duration Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='taskDuration_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150'"
   * @generated
   */
  EDataType gettaskDuration_TaskType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>task Name Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>task Name Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='taskName_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150'"
   * @generated
   */
  EDataType gettaskName_TaskType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>time Record Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>time Record Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='time_Record_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType gettime_RecordType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>wait Duration Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>wait Duration Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='waitDuration_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150'"
   * @generated
   */
  EDataType getwaitDuration_TaskType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>work Duration Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>work Duration Task Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='workDuration_Task_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='150'"
   * @generated
   */
  EDataType getworkDuration_TaskType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GenericReportingFactory getGenericReportingFactory();

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
     * The meta object literal for the '{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Record Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__RECORD_ELEMENT = eINSTANCE.getDocumentRoot_RecordElement();

    /**
     * The meta object literal for the '<em><b>Task Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TASK_ELEMENT = eINSTANCE.getDocumentRoot_TaskElement();

    /**
     * The meta object literal for the '<em><b>Record BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_RecordBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Task BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_TaskBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.sfc.fosImpl.genericReporting.impl.RecordImpl <em>Record</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sfc.fosImpl.genericReporting.impl.RecordImpl
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getRecord()
     * @generated
     */
    EClass RECORD = eINSTANCE.getRecord();

    /**
     * The meta object literal for the '<em><b>Process Instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__PROCESS_INSTANCE = eINSTANCE.getRecord_ProcessInstance();

    /**
     * The meta object literal for the '<em><b>Process Template</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__PROCESS_TEMPLATE = eINSTANCE.getRecord_ProcessTemplate();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__STATUS = eINSTANCE.getRecord_Status();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__TIME = eINSTANCE.getRecord_Time();

    /**
     * The meta object literal for the '<em><b>Siebel Circuit ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__SIEBEL_CIRCUIT_ID = eINSTANCE.getRecord_SiebelCircuitID();

    /**
     * The meta object literal for the '<em><b>Client Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__CLIENT_NAME = eINSTANCE.getRecord_ClientName();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__PROJECT_NAME = eINSTANCE.getRecord_ProjectName();

    /**
     * The meta object literal for the '<em><b>Current Activity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD__CURRENT_ACTIVITY = eINSTANCE.getRecord_CurrentActivity();

    /**
     * The meta object literal for the '{@link com.sfc.fosImpl.genericReporting.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sfc.fosImpl.genericReporting.impl.TaskImpl
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Process Instance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__PROCESS_INSTANCE = eINSTANCE.getTask_ProcessInstance();

    /**
     * The meta object literal for the '<em><b>First Offer Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__FIRST_OFFER_TIME = eINSTANCE.getTask_FirstOfferTime();

    /**
     * The meta object literal for the '<em><b>Task Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TASK_NAME = eINSTANCE.getTask_TaskName();

    /**
     * The meta object literal for the '<em><b>Task Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TASK_DURATION = eINSTANCE.getTask_TaskDuration();

    /**
     * The meta object literal for the '<em><b>Wait Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__WAIT_DURATION = eINSTANCE.getTask_WaitDuration();

    /**
     * The meta object literal for the '<em><b>Work Duration</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__WORK_DURATION = eINSTANCE.getTask_WorkDuration();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__STATUS = eINSTANCE.getTask_Status();

    /**
     * The meta object literal for the '<em>client Name Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getclientName_RecordType()
     * @generated
     */
    EDataType CLIENT_NAME_RECORD_TYPE = eINSTANCE.getclientName_RecordType();

    /**
     * The meta object literal for the '<em>current Activity Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getcurrentActivity_RecordType()
     * @generated
     */
    EDataType CURRENT_ACTIVITY_RECORD_TYPE = eINSTANCE.getcurrentActivity_RecordType();

    /**
     * The meta object literal for the '<em>first Offer Time Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getfirstOfferTime_TaskType()
     * @generated
     */
    EDataType FIRST_OFFER_TIME_TASK_TYPE = eINSTANCE.getfirstOfferTime_TaskType();

    /**
     * The meta object literal for the '<em>process Instance Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprocessInstance_TaskType()
     * @generated
     */
    EDataType PROCESS_INSTANCE_TASK_TYPE = eINSTANCE.getprocessInstance_TaskType();

    /**
     * The meta object literal for the '<em>process Instance Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprocessInstance_RecordType()
     * @generated
     */
    EDataType PROCESS_INSTANCE_RECORD_TYPE = eINSTANCE.getprocessInstance_RecordType();

    /**
     * The meta object literal for the '<em>process Template Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprocessTemplate_RecordType()
     * @generated
     */
    EDataType PROCESS_TEMPLATE_RECORD_TYPE = eINSTANCE.getprocessTemplate_RecordType();

    /**
     * The meta object literal for the '<em>project Name Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getprojectName_RecordType()
     * @generated
     */
    EDataType PROJECT_NAME_RECORD_TYPE = eINSTANCE.getprojectName_RecordType();

    /**
     * The meta object literal for the '<em>siebel Circuit ID Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getsiebelCircuitID_RecordType()
     * @generated
     */
    EDataType SIEBEL_CIRCUIT_ID_RECORD_TYPE = eINSTANCE.getsiebelCircuitID_RecordType();

    /**
     * The meta object literal for the '<em>status Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getstatus_TaskType()
     * @generated
     */
    EDataType STATUS_TASK_TYPE = eINSTANCE.getstatus_TaskType();

    /**
     * The meta object literal for the '<em>status Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getstatus_RecordType()
     * @generated
     */
    EDataType STATUS_RECORD_TYPE = eINSTANCE.getstatus_RecordType();

    /**
     * The meta object literal for the '<em>task Duration Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#gettaskDuration_TaskType()
     * @generated
     */
    EDataType TASK_DURATION_TASK_TYPE = eINSTANCE.gettaskDuration_TaskType();

    /**
     * The meta object literal for the '<em>task Name Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#gettaskName_TaskType()
     * @generated
     */
    EDataType TASK_NAME_TASK_TYPE = eINSTANCE.gettaskName_TaskType();

    /**
     * The meta object literal for the '<em>time Record Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#gettime_RecordType()
     * @generated
     */
    EDataType TIME_RECORD_TYPE = eINSTANCE.gettime_RecordType();

    /**
     * The meta object literal for the '<em>wait Duration Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getwaitDuration_TaskType()
     * @generated
     */
    EDataType WAIT_DURATION_TASK_TYPE = eINSTANCE.getwaitDuration_TaskType();

    /**
     * The meta object literal for the '<em>work Duration Task Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.sfc.fosImpl.genericReporting.impl.GenericReportingPackageImpl#getworkDuration_TaskType()
     * @generated
     */
    EDataType WORK_DURATION_TASK_TYPE = eINSTANCE.getworkDuration_TaskType();

  }

} //GenericReportingPackage

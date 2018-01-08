package com.sfc.fosImpl.genericReporting.impl;

import com.sfc.fosImpl.genericReporting.DocumentRoot;
import com.sfc.fosImpl.genericReporting.GenericReportingFactory;
import com.sfc.fosImpl.genericReporting.GenericReportingPackage;
import com.sfc.fosImpl.genericReporting.Record;
import com.sfc.fosImpl.genericReporting.Task;

import com.sfc.fosImpl.genericReporting.bdsutil.BDSActivator;

import com.sfc.fosImpl.genericReporting.util.GenericReportingValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericReportingPackageImpl extends EPackageImpl implements GenericReportingPackage
{

  /** 
    * Exposes bundle version number, or null if not instantiated via OSGi
    * @generated
    */
  public String getBundleVersion()
  {
    String result = BDSActivator.getBundleVersion();
    return result;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType clientName_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType currentActivity_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType firstOfferTime_TaskTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType processInstance_TaskTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType processInstance_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType processTemplate_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType projectName_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType siebelCircuitID_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType status_TaskTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType status_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType taskDuration_TaskTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType taskName_TaskTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType time_RecordTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType waitDuration_TaskTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType workDuration_TaskTypeEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GenericReportingPackageImpl()
  {
    super(eNS_URI, GenericReportingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GenericReportingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GenericReportingPackage init()
  {
    if (isInited) return (GenericReportingPackage)EPackage.Registry.INSTANCE.getEPackage(GenericReportingPackage.eNS_URI);

    // Obtain or create and register package
    GenericReportingPackageImpl theGenericReportingPackage = (GenericReportingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenericReportingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenericReportingPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGenericReportingPackage.createPackageContents();

    // Initialize created meta-data
    theGenericReportingPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theGenericReportingPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return GenericReportingValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theGenericReportingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GenericReportingPackage.eNS_URI, theGenericReportingPackage);
    return theGenericReportingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_RecordElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_TaskElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_RecordBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_TaskBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecord()
  {
    return recordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_ProcessInstance()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_ProcessTemplate()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_Status()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_Time()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_SiebelCircuitID()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_ClientName()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_ProjectName()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecord_CurrentActivity()
  {
    return (EAttribute)recordEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_ProcessInstance()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_FirstOfferTime()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_TaskName()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_TaskDuration()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_WaitDuration()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_WorkDuration()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Status()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getclientName_RecordType()
  {
    return clientName_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcurrentActivity_RecordType()
  {
    return currentActivity_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getfirstOfferTime_TaskType()
  {
    return firstOfferTime_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprocessInstance_TaskType()
  {
    return processInstance_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprocessInstance_RecordType()
  {
    return processInstance_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprocessTemplate_RecordType()
  {
    return processTemplate_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprojectName_RecordType()
  {
    return projectName_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getsiebelCircuitID_RecordType()
  {
    return siebelCircuitID_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getstatus_TaskType()
  {
    return status_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getstatus_RecordType()
  {
    return status_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettaskDuration_TaskType()
  {
    return taskDuration_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettaskName_TaskType()
  {
    return taskName_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettime_RecordType()
  {
    return time_RecordTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getwaitDuration_TaskType()
  {
    return waitDuration_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getworkDuration_TaskType()
  {
    return workDuration_TaskTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericReportingFactory getGenericReportingFactory()
  {
    return (GenericReportingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RECORD_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TASK_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    recordEClass = createEClass(RECORD);
    createEAttribute(recordEClass, RECORD__PROCESS_INSTANCE);
    createEAttribute(recordEClass, RECORD__PROCESS_TEMPLATE);
    createEAttribute(recordEClass, RECORD__STATUS);
    createEAttribute(recordEClass, RECORD__TIME);
    createEAttribute(recordEClass, RECORD__SIEBEL_CIRCUIT_ID);
    createEAttribute(recordEClass, RECORD__CLIENT_NAME);
    createEAttribute(recordEClass, RECORD__PROJECT_NAME);
    createEAttribute(recordEClass, RECORD__CURRENT_ACTIVITY);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__PROCESS_INSTANCE);
    createEAttribute(taskEClass, TASK__FIRST_OFFER_TIME);
    createEAttribute(taskEClass, TASK__TASK_NAME);
    createEAttribute(taskEClass, TASK__TASK_DURATION);
    createEAttribute(taskEClass, TASK__WAIT_DURATION);
    createEAttribute(taskEClass, TASK__WORK_DURATION);
    createEAttribute(taskEClass, TASK__STATUS);

    // Create data types
    clientName_RecordTypeEDataType = createEDataType(CLIENT_NAME_RECORD_TYPE);
    currentActivity_RecordTypeEDataType = createEDataType(CURRENT_ACTIVITY_RECORD_TYPE);
    firstOfferTime_TaskTypeEDataType = createEDataType(FIRST_OFFER_TIME_TASK_TYPE);
    processInstance_TaskTypeEDataType = createEDataType(PROCESS_INSTANCE_TASK_TYPE);
    processInstance_RecordTypeEDataType = createEDataType(PROCESS_INSTANCE_RECORD_TYPE);
    processTemplate_RecordTypeEDataType = createEDataType(PROCESS_TEMPLATE_RECORD_TYPE);
    projectName_RecordTypeEDataType = createEDataType(PROJECT_NAME_RECORD_TYPE);
    siebelCircuitID_RecordTypeEDataType = createEDataType(SIEBEL_CIRCUIT_ID_RECORD_TYPE);
    status_TaskTypeEDataType = createEDataType(STATUS_TASK_TYPE);
    status_RecordTypeEDataType = createEDataType(STATUS_RECORD_TYPE);
    taskDuration_TaskTypeEDataType = createEDataType(TASK_DURATION_TASK_TYPE);
    taskName_TaskTypeEDataType = createEDataType(TASK_NAME_TASK_TYPE);
    time_RecordTypeEDataType = createEDataType(TIME_RECORD_TYPE);
    waitDuration_TaskTypeEDataType = createEDataType(WAIT_DURATION_TASK_TYPE);
    workDuration_TaskTypeEDataType = createEDataType(WORK_DURATION_TASK_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RecordElement(), this.getRecord(), null, "recordElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_TaskElement(), this.getTask(), null, "taskElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RecordBDSInternalSerializationElement(), this.getRecord(), null, "recordBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_TaskBDSInternalSerializationElement(), this.getTask(), null, "taskBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(recordEClass, Record.class, "Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecord_ProcessInstance(), this.getprocessInstance_RecordType(), "processInstance", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_ProcessTemplate(), this.getprocessTemplate_RecordType(), "processTemplate", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_Status(), this.getstatus_RecordType(), "status", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_Time(), this.gettime_RecordType(), "time", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_SiebelCircuitID(), this.getsiebelCircuitID_RecordType(), "siebelCircuitID", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_ClientName(), this.getclientName_RecordType(), "clientName", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_ProjectName(), this.getprojectName_RecordType(), "projectName", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRecord_CurrentActivity(), this.getcurrentActivity_RecordType(), "currentActivity", null, 0, 1, Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_ProcessInstance(), this.getprocessInstance_TaskType(), "processInstance", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_FirstOfferTime(), this.getfirstOfferTime_TaskType(), "firstOfferTime", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_TaskName(), this.gettaskName_TaskType(), "taskName", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_TaskDuration(), this.gettaskDuration_TaskType(), "taskDuration", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_WaitDuration(), this.getwaitDuration_TaskType(), "waitDuration", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_WorkDuration(), this.getworkDuration_TaskType(), "workDuration", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Status(), this.getstatus_TaskType(), "status", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(clientName_RecordTypeEDataType, String.class, "clientName_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(currentActivity_RecordTypeEDataType, String.class, "currentActivity_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(firstOfferTime_TaskTypeEDataType, String.class, "firstOfferTime_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(processInstance_TaskTypeEDataType, String.class, "processInstance_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(processInstance_RecordTypeEDataType, String.class, "processInstance_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(processTemplate_RecordTypeEDataType, String.class, "processTemplate_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(projectName_RecordTypeEDataType, String.class, "projectName_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(siebelCircuitID_RecordTypeEDataType, String.class, "siebelCircuitID_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(status_TaskTypeEDataType, String.class, "status_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(status_RecordTypeEDataType, String.class, "status_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(taskDuration_TaskTypeEDataType, String.class, "taskDuration_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(taskName_TaskTypeEDataType, String.class, "taskName_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(time_RecordTypeEDataType, String.class, "time_RecordType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(waitDuration_TaskTypeEDataType, String.class, "waitDuration_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(workDuration_TaskTypeEDataType, String.class, "workDuration_TaskType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
    addAnnotation
      (clientName_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "clientName_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (currentActivity_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "currentActivity_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });		
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });		
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });		
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });		
    addAnnotation
      (getDocumentRoot_RecordElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "RecordElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_TaskElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TaskElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_RecordBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Record",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_TaskBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Task",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (firstOfferTime_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "firstOfferTime_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "150"
       });		
    addAnnotation
      (processInstance_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "processInstance_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (processInstance_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "processInstance_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (processTemplate_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "processTemplate_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (projectName_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "projectName_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (recordEClass, 
       source, 
       new String[] 
       {
       "name", "Record",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getRecord_ProcessInstance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processInstance"
       });		
    addAnnotation
      (getRecord_ProcessTemplate(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processTemplate"
       });		
    addAnnotation
      (getRecord_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status"
       });		
    addAnnotation
      (getRecord_Time(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "time"
       });		
    addAnnotation
      (getRecord_SiebelCircuitID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "siebelCircuitID"
       });		
    addAnnotation
      (getRecord_ClientName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "clientName"
       });		
    addAnnotation
      (getRecord_ProjectName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectName"
       });		
    addAnnotation
      (getRecord_CurrentActivity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "currentActivity"
       });		
    addAnnotation
      (siebelCircuitID_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "siebelCircuitID_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (status_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "status_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "150"
       });		
    addAnnotation
      (status_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "status_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (taskEClass, 
       source, 
       new String[] 
       {
       "name", "Task",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getTask_ProcessInstance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processInstance"
       });		
    addAnnotation
      (getTask_FirstOfferTime(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "firstOfferTime"
       });		
    addAnnotation
      (getTask_TaskName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "taskName"
       });		
    addAnnotation
      (getTask_TaskDuration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "taskDuration"
       });		
    addAnnotation
      (getTask_WaitDuration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "waitDuration"
       });		
    addAnnotation
      (getTask_WorkDuration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workDuration"
       });		
    addAnnotation
      (getTask_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status"
       });		
    addAnnotation
      (taskDuration_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "taskDuration_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "150"
       });		
    addAnnotation
      (taskName_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "taskName_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "150"
       });		
    addAnnotation
      (time_RecordTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "time_Record_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (waitDuration_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "waitDuration_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "150"
       });		
    addAnnotation
      (workDuration_TaskTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "workDuration_Task_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "150"
       });
  }

} //GenericReportingPackageImpl

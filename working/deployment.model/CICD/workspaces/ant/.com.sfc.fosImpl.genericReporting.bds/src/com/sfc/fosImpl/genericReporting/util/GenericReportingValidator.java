

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sfc.fosImpl.genericReporting.util;

import com.sfc.fosImpl.genericReporting.*;

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
 * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage
 * @generated
 */
public class GenericReportingValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final GenericReportingValidator INSTANCE = new GenericReportingValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.sfc.fosImpl.genericReporting";

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
  public GenericReportingValidator()
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
    return GenericReportingPackage.eINSTANCE;
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
      case GenericReportingPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case GenericReportingPackage.RECORD:
        return validateRecord((Record)value, diagnostics, context);
      case GenericReportingPackage.TASK:
        return validateTask((Task)value, diagnostics, context);
      case GenericReportingPackage.CLIENT_NAME_RECORD_TYPE:
        return validateclientName_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.CURRENT_ACTIVITY_RECORD_TYPE:
        return validatecurrentActivity_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.FIRST_OFFER_TIME_TASK_TYPE:
        return validatefirstOfferTime_TaskType((String)value, diagnostics, context);
      case GenericReportingPackage.PROCESS_INSTANCE_TASK_TYPE:
        return validateprocessInstance_TaskType((String)value, diagnostics, context);
      case GenericReportingPackage.PROCESS_INSTANCE_RECORD_TYPE:
        return validateprocessInstance_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.PROCESS_TEMPLATE_RECORD_TYPE:
        return validateprocessTemplate_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.PROJECT_NAME_RECORD_TYPE:
        return validateprojectName_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.SIEBEL_CIRCUIT_ID_RECORD_TYPE:
        return validatesiebelCircuitID_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.STATUS_TASK_TYPE:
        return validatestatus_TaskType((String)value, diagnostics, context);
      case GenericReportingPackage.STATUS_RECORD_TYPE:
        return validatestatus_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.TASK_DURATION_TASK_TYPE:
        return validatetaskDuration_TaskType((String)value, diagnostics, context);
      case GenericReportingPackage.TASK_NAME_TASK_TYPE:
        return validatetaskName_TaskType((String)value, diagnostics, context);
      case GenericReportingPackage.TIME_RECORD_TYPE:
        return validatetime_RecordType((String)value, diagnostics, context);
      case GenericReportingPackage.WAIT_DURATION_TASK_TYPE:
        return validatewaitDuration_TaskType((String)value, diagnostics, context);
      case GenericReportingPackage.WORK_DURATION_TASK_TYPE:
        return validateworkDuration_TaskType((String)value, diagnostics, context);
      default:
        return true;
    }
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
  public boolean validateRecord(Record record, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(record, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(task, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientName_RecordType(String clientName_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateclientName_RecordType_MaxLength(clientName_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>client Name Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateclientName_RecordType_MaxLength(String clientName_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = clientName_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.CLIENT_NAME_RECORD_TYPE, clientName_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecurrentActivity_RecordType(String currentActivity_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatecurrentActivity_RecordType_MaxLength(currentActivity_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>current Activity Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatecurrentActivity_RecordType_MaxLength(String currentActivity_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = currentActivity_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.CURRENT_ACTIVITY_RECORD_TYPE, currentActivity_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefirstOfferTime_TaskType(String firstOfferTime_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatefirstOfferTime_TaskType_MaxLength(firstOfferTime_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>first Offer Time Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatefirstOfferTime_TaskType_MaxLength(String firstOfferTime_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = firstOfferTime_TaskType.length();
    boolean result = length <= 150;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.FIRST_OFFER_TIME_TASK_TYPE, firstOfferTime_TaskType, length, 150, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessInstance_TaskType(String processInstance_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateprocessInstance_TaskType_MaxLength(processInstance_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>process Instance Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessInstance_TaskType_MaxLength(String processInstance_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = processInstance_TaskType.length();
    boolean result = length <= 100;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.PROCESS_INSTANCE_TASK_TYPE, processInstance_TaskType, length, 100, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessInstance_RecordType(String processInstance_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateprocessInstance_RecordType_MaxLength(processInstance_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>process Instance Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessInstance_RecordType_MaxLength(String processInstance_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = processInstance_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.PROCESS_INSTANCE_RECORD_TYPE, processInstance_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessTemplate_RecordType(String processTemplate_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateprocessTemplate_RecordType_MaxLength(processTemplate_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>process Template Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprocessTemplate_RecordType_MaxLength(String processTemplate_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = processTemplate_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.PROCESS_TEMPLATE_RECORD_TYPE, processTemplate_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprojectName_RecordType(String projectName_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateprojectName_RecordType_MaxLength(projectName_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>project Name Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateprojectName_RecordType_MaxLength(String projectName_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = projectName_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.PROJECT_NAME_RECORD_TYPE, projectName_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatesiebelCircuitID_RecordType(String siebelCircuitID_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatesiebelCircuitID_RecordType_MaxLength(siebelCircuitID_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>siebel Circuit ID Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatesiebelCircuitID_RecordType_MaxLength(String siebelCircuitID_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = siebelCircuitID_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.SIEBEL_CIRCUIT_ID_RECORD_TYPE, siebelCircuitID_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatestatus_TaskType(String status_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatestatus_TaskType_MaxLength(status_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>status Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatestatus_TaskType_MaxLength(String status_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = status_TaskType.length();
    boolean result = length <= 150;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.STATUS_TASK_TYPE, status_TaskType, length, 150, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatestatus_RecordType(String status_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatestatus_RecordType_MaxLength(status_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>status Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatestatus_RecordType_MaxLength(String status_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = status_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.STATUS_RECORD_TYPE, status_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskDuration_TaskType(String taskDuration_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetaskDuration_TaskType_MaxLength(taskDuration_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>task Duration Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskDuration_TaskType_MaxLength(String taskDuration_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = taskDuration_TaskType.length();
    boolean result = length <= 150;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.TASK_DURATION_TASK_TYPE, taskDuration_TaskType, length, 150, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskName_TaskType(String taskName_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetaskName_TaskType_MaxLength(taskName_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>task Name Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetaskName_TaskType_MaxLength(String taskName_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = taskName_TaskType.length();
    boolean result = length <= 150;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.TASK_NAME_TASK_TYPE, taskName_TaskType, length, 150, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetime_RecordType(String time_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetime_RecordType_MaxLength(time_RecordType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>time Record Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetime_RecordType_MaxLength(String time_RecordType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = time_RecordType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.TIME_RECORD_TYPE, time_RecordType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatewaitDuration_TaskType(String waitDuration_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatewaitDuration_TaskType_MaxLength(waitDuration_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>wait Duration Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatewaitDuration_TaskType_MaxLength(String waitDuration_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = waitDuration_TaskType.length();
    boolean result = length <= 150;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.WAIT_DURATION_TASK_TYPE, waitDuration_TaskType, length, 150, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateworkDuration_TaskType(String workDuration_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateworkDuration_TaskType_MaxLength(workDuration_TaskType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>work Duration Task Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateworkDuration_TaskType_MaxLength(String workDuration_TaskType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = workDuration_TaskType.length();
    boolean result = length <= 150;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(GenericReportingPackage.Literals.WORK_DURATION_TASK_TYPE, workDuration_TaskType, length, 150, diagnostics, context);
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

} //GenericReportingValidator

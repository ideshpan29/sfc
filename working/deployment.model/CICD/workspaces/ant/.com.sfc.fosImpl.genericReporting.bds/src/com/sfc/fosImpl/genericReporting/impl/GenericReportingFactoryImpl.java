

package com.sfc.fosImpl.genericReporting.impl;

import com.sfc.fosImpl.genericReporting.*;

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
public class GenericReportingFactoryImpl extends EFactoryImpl implements GenericReportingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenericReportingFactory init()
  {
    try
    {
      GenericReportingFactory theGenericReportingFactory = (GenericReportingFactory)EPackage.Registry.INSTANCE.getEFactory("http://fosImpl.sfc.com/genericReporting"); 
      if (theGenericReportingFactory != null)
      {
        return theGenericReportingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GenericReportingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericReportingFactoryImpl()
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
      case GenericReportingPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case GenericReportingPackage.RECORD: return createRecord();
      case GenericReportingPackage.TASK: return createTask();
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
      case GenericReportingPackage.CLIENT_NAME_RECORD_TYPE:
        return createclientName_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.CURRENT_ACTIVITY_RECORD_TYPE:
        return createcurrentActivity_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.FIRST_OFFER_TIME_TASK_TYPE:
        return createfirstOfferTime_TaskTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.PROCESS_INSTANCE_TASK_TYPE:
        return createprocessInstance_TaskTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.PROCESS_INSTANCE_RECORD_TYPE:
        return createprocessInstance_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.PROCESS_TEMPLATE_RECORD_TYPE:
        return createprocessTemplate_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.PROJECT_NAME_RECORD_TYPE:
        return createprojectName_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.SIEBEL_CIRCUIT_ID_RECORD_TYPE:
        return createsiebelCircuitID_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.STATUS_TASK_TYPE:
        return createstatus_TaskTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.STATUS_RECORD_TYPE:
        return createstatus_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.TASK_DURATION_TASK_TYPE:
        return createtaskDuration_TaskTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.TASK_NAME_TASK_TYPE:
        return createtaskName_TaskTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.TIME_RECORD_TYPE:
        return createtime_RecordTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.WAIT_DURATION_TASK_TYPE:
        return createwaitDuration_TaskTypeFromString(eDataType, initialValue);
      case GenericReportingPackage.WORK_DURATION_TASK_TYPE:
        return createworkDuration_TaskTypeFromString(eDataType, initialValue);
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
      case GenericReportingPackage.CLIENT_NAME_RECORD_TYPE:
        return convertclientName_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.CURRENT_ACTIVITY_RECORD_TYPE:
        return convertcurrentActivity_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.FIRST_OFFER_TIME_TASK_TYPE:
        return convertfirstOfferTime_TaskTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.PROCESS_INSTANCE_TASK_TYPE:
        return convertprocessInstance_TaskTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.PROCESS_INSTANCE_RECORD_TYPE:
        return convertprocessInstance_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.PROCESS_TEMPLATE_RECORD_TYPE:
        return convertprocessTemplate_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.PROJECT_NAME_RECORD_TYPE:
        return convertprojectName_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.SIEBEL_CIRCUIT_ID_RECORD_TYPE:
        return convertsiebelCircuitID_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.STATUS_TASK_TYPE:
        return convertstatus_TaskTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.STATUS_RECORD_TYPE:
        return convertstatus_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.TASK_DURATION_TASK_TYPE:
        return converttaskDuration_TaskTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.TASK_NAME_TASK_TYPE:
        return converttaskName_TaskTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.TIME_RECORD_TYPE:
        return converttime_RecordTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.WAIT_DURATION_TASK_TYPE:
        return convertwaitDuration_TaskTypeToString(eDataType, instanceValue);
      case GenericReportingPackage.WORK_DURATION_TASK_TYPE:
        return convertworkDuration_TaskTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
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
  public Record createRecord()
  {
    RecordImpl record = new RecordImpl();
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createclientName_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertclientName_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createcurrentActivity_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertcurrentActivity_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createfirstOfferTime_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertfirstOfferTime_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createprocessInstance_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprocessInstance_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createprocessInstance_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprocessInstance_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createprocessTemplate_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprocessTemplate_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createprojectName_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertprojectName_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createsiebelCircuitID_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertsiebelCircuitID_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createstatus_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertstatus_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createstatus_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertstatus_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtaskDuration_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttaskDuration_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtaskName_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttaskName_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createtime_RecordTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String converttime_RecordTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createwaitDuration_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertwaitDuration_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createworkDuration_TaskTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertworkDuration_TaskTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericReportingPackage getGenericReportingPackage()
  {
    return (GenericReportingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GenericReportingPackage getPackage()
  {
    return GenericReportingPackage.eINSTANCE;
  }

} //GenericReportingFactoryImpl

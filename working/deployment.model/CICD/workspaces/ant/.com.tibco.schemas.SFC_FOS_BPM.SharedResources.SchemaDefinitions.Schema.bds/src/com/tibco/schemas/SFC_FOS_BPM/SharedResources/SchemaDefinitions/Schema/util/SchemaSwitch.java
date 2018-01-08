/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.util;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage
 * @generated
 */
public class SchemaSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SchemaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SchemaPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SchemaPackage.CREATERESOURCEINPUT_TYPE:
      {
        createresourceinputType createresourceinputType = (createresourceinputType)theEObject;
        T result = casecreateresourceinputType(createresourceinputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.CREATERESOURCEOUTPUT_TYPE:
      {
        createresourceoutputType createresourceoutputType = (createresourceoutputType)theEObject;
        T result = casecreateresourceoutputType(createresourceoutputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.CREATERESOURCE_TYPE:
      {
        createresourceType createresourceType = (createresourceType)theEObject;
        T result = casecreateresourceType(createresourceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.FAULT_TYPE:
      {
        faultType faultType = (faultType)theEObject;
        T result = casefaultType(faultType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.FETCHRESOURCEINPUT_TYPE:
      {
        fetchresourceinputType fetchresourceinputType = (fetchresourceinputType)theEObject;
        T result = casefetchresourceinputType(fetchresourceinputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.FETCHRESOURCEOUTPUT_TYPE:
      {
        fetchresourceoutputType fetchresourceoutputType = (fetchresourceoutputType)theEObject;
        T result = casefetchresourceoutputType(fetchresourceoutputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.FETCHRESOURCE_TYPE:
      {
        fetchresourceType fetchresourceType = (fetchresourceType)theEObject;
        T result = casefetchresourceType(fetchresourceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.GETPROCESSINSTANCESINPUT_TYPE:
      {
        getprocessinstancesinputType getprocessinstancesinputType = (getprocessinstancesinputType)theEObject;
        T result = casegetprocessinstancesinputType(getprocessinstancesinputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE:
      {
        getprocessinstancesoutputType getprocessinstancesoutputType = (getprocessinstancesoutputType)theEObject;
        T result = casegetprocessinstancesoutputType(getprocessinstancesoutputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.GETPROCESSINSTANCES_TYPE:
      {
        getprocessinstancesType getprocessinstancesType = (getprocessinstancesType)theEObject;
        T result = casegetprocessinstancesType(getprocessinstancesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.INPUT_TYPE:
      {
        inputType inputType = (inputType)theEObject;
        T result = caseinputType(inputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.LDAPENTRYINPUTREPEAT_TYPE:
      {
        ldapentryinputrepeatType ldapentryinputrepeatType = (ldapentryinputrepeatType)theEObject;
        T result = caseldapentryinputrepeatType(ldapentryinputrepeatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.LDAPENTRYINPUT_TYPE:
      {
        ldapentryinputType ldapentryinputType = (ldapentryinputType)theEObject;
        T result = caseldapentryinputType(ldapentryinputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.LDAPENTRY_TYPE:
      {
        ldapentryType ldapentryType = (ldapentryType)theEObject;
        T result = caseldapentryType(ldapentryType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.PARSECSV_TYPE:
      {
        parsecsvType parsecsvType = (parsecsvType)theEObject;
        T result = caseparsecsvType(parsecsvType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.PI_CANCELLED_TYPE:
      {
        pi_cancelledType pi_cancelledType = (pi_cancelledType)theEObject;
        T result = casepi_cancelledType(pi_cancelledType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.PI_COMPLETE_TYPE:
      {
        pi_completeType pi_completeType = (pi_completeType)theEObject;
        T result = casepi_completeType(pi_completeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.PI_HALTED_TYPE:
      {
        pi_haltedType pi_haltedType = (pi_haltedType)theEObject;
        T result = casepi_haltedType(pi_haltedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.PI_STARTED_TYPE:
      {
        pi_startedType pi_startedType = (pi_startedType)theEObject;
        T result = casepi_startedType(pi_startedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE:
      {
        reesourcecreationandmappingType reesourcecreationandmappingType = (reesourcecreationandmappingType)theEObject;
        T result = casereesourcecreationandmappingType(reesourcecreationandmappingType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.REPORTGENERATION_TYPE:
      {
        reportgenerationType reportgenerationType = (reportgenerationType)theEObject;
        T result = casereportgenerationType(reportgenerationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.RESOURCE_TYPE:
      {
        resourceType resourceType = (resourceType)theEObject;
        T result = caseresourceType(resourceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.ROOT_TYPE:
      {
        rootType rootType = (rootType)theEObject;
        T result = caserootType(rootType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE:
      {
        searchprocessinstancesinputType searchprocessinstancesinputType = (searchprocessinstancesinputType)theEObject;
        T result = casesearchprocessinstancesinputType(searchprocessinstancesinputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE:
      {
        searchprocessinstancesoutputType searchprocessinstancesoutputType = (searchprocessinstancesoutputType)theEObject;
        T result = casesearchprocessinstancesoutputType(searchprocessinstancesoutputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE:
      {
        searchprocessinstancesType searchprocessinstancesType = (searchprocessinstancesType)theEObject;
        T result = casesearchprocessinstancesType(searchprocessinstancesType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.SEARCHRECORD_TYPE:
      {
        searchrecordType searchrecordType = (searchrecordType)theEObject;
        T result = casesearchrecordType(searchrecordType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.USERS_TYPE:
      {
        usersType usersType = (usersType)theEObject;
        T result = caseusersType(usersType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE:
      {
        workitemcompletioninputType workitemcompletioninputType = (workitemcompletioninputType)theEObject;
        T result = caseworkitemcompletioninputType(workitemcompletioninputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE:
      {
        workitemcompletionoutputType workitemcompletionoutputType = (workitemcompletionoutputType)theEObject;
        T result = caseworkitemcompletionoutputType(workitemcompletionoutputType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SchemaPackage.WORKITEMCOMPLETION_TYPE:
      {
        workitemcompletionType workitemcompletionType = (workitemcompletionType)theEObject;
        T result = caseworkitemcompletionType(workitemcompletionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>createresourceinput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>createresourceinput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecreateresourceinputType(createresourceinputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>createresourceoutput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>createresourceoutput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecreateresourceoutputType(createresourceoutputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>createresource Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>createresource Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecreateresourceType(createresourceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fault Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fault Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefaultType(faultType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fetchresourceinput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fetchresourceinput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefetchresourceinputType(fetchresourceinputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fetchresourceoutput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fetchresourceoutput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefetchresourceoutputType(fetchresourceoutputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fetchresource Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fetchresource Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefetchresourceType(fetchresourceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>getprocessinstancesinput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>getprocessinstancesinput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegetprocessinstancesinputType(getprocessinstancesinputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>getprocessinstancesoutput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>getprocessinstancesoutput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegetprocessinstancesoutputType(getprocessinstancesoutputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>getprocessinstances Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>getprocessinstances Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegetprocessinstancesType(getprocessinstancesType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>input Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>input Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseinputType(inputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldapentryinputrepeat Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldapentryinputrepeat Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldapentryinputrepeatType(ldapentryinputrepeatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldapentryinput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldapentryinput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldapentryinputType(ldapentryinputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ldapentry Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ldapentry Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseldapentryType(ldapentryType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>parsecsv Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>parsecsv Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparsecsvType(parsecsvType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pi cancelled Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pi cancelled Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepi_cancelledType(pi_cancelledType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pi complete Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pi complete Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepi_completeType(pi_completeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pi halted Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pi halted Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepi_haltedType(pi_haltedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pi started Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pi started Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepi_startedType(pi_startedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>reesourcecreationandmapping Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>reesourcecreationandmapping Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casereesourcecreationandmappingType(reesourcecreationandmappingType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>reportgeneration Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>reportgeneration Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casereportgenerationType(reportgenerationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>resource Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>resource Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseresourceType(resourceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>root Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>root Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserootType(rootType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>searchprocessinstancesinput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>searchprocessinstancesinput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesearchprocessinstancesinputType(searchprocessinstancesinputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>searchprocessinstancesoutput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>searchprocessinstancesoutput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesearchprocessinstancesoutputType(searchprocessinstancesoutputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>searchprocessinstances Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>searchprocessinstances Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesearchprocessinstancesType(searchprocessinstancesType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>searchrecord Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>searchrecord Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesearchrecordType(searchrecordType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>users Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>users Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseusersType(usersType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>workitemcompletioninput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>workitemcompletioninput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseworkitemcompletioninputType(workitemcompletioninputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>workitemcompletionoutput Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>workitemcompletionoutput Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseworkitemcompletionoutputType(workitemcompletionoutputType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>workitemcompletion Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>workitemcompletion Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseworkitemcompletionType(workitemcompletionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SchemaSwitch

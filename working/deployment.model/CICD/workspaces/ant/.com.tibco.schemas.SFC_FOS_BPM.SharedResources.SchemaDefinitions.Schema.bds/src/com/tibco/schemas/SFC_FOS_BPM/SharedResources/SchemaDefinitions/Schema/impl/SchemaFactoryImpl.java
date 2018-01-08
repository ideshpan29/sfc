

package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaFactoryImpl extends EFactoryImpl implements SchemaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SchemaFactory init()
  {
    try
    {
      SchemaFactory theSchemaFactory = (SchemaFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tibco.com/schemas/SFC_FOS_BPM/SharedResources/SchemaDefinitions/Schema.xsd"); 
      if (theSchemaFactory != null)
      {
        return theSchemaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SchemaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaFactoryImpl()
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
      case SchemaPackage.CREATERESOURCEINPUT_TYPE: return createcreateresourceinputType();
      case SchemaPackage.CREATERESOURCEOUTPUT_TYPE: return createcreateresourceoutputType();
      case SchemaPackage.CREATERESOURCE_TYPE: return createcreateresourceType();
      case SchemaPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case SchemaPackage.FAULT_TYPE: return createfaultType();
      case SchemaPackage.FETCHRESOURCEINPUT_TYPE: return createfetchresourceinputType();
      case SchemaPackage.FETCHRESOURCEOUTPUT_TYPE: return createfetchresourceoutputType();
      case SchemaPackage.FETCHRESOURCE_TYPE: return createfetchresourceType();
      case SchemaPackage.GETPROCESSINSTANCESINPUT_TYPE: return creategetprocessinstancesinputType();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE: return creategetprocessinstancesoutputType();
      case SchemaPackage.GETPROCESSINSTANCES_TYPE: return creategetprocessinstancesType();
      case SchemaPackage.INPUT_TYPE: return createinputType();
      case SchemaPackage.LDAPENTRYINPUTREPEAT_TYPE: return createldapentryinputrepeatType();
      case SchemaPackage.LDAPENTRYINPUT_TYPE: return createldapentryinputType();
      case SchemaPackage.LDAPENTRY_TYPE: return createldapentryType();
      case SchemaPackage.PARSECSV_TYPE: return createparsecsvType();
      case SchemaPackage.PI_CANCELLED_TYPE: return createpi_cancelledType();
      case SchemaPackage.PI_COMPLETE_TYPE: return createpi_completeType();
      case SchemaPackage.PI_HALTED_TYPE: return createpi_haltedType();
      case SchemaPackage.PI_STARTED_TYPE: return createpi_startedType();
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE: return createreesourcecreationandmappingType();
      case SchemaPackage.REPORTGENERATION_TYPE: return createreportgenerationType();
      case SchemaPackage.RESOURCE_TYPE: return createresourceType();
      case SchemaPackage.ROOT_TYPE: return createrootType();
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE: return createsearchprocessinstancesinputType();
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE: return createsearchprocessinstancesoutputType();
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE: return createsearchprocessinstancesType();
      case SchemaPackage.SEARCHRECORD_TYPE: return createsearchrecordType();
      case SchemaPackage.USERS_TYPE: return createusersType();
      case SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE: return createworkitemcompletioninputType();
      case SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE: return createworkitemcompletionoutputType();
      case SchemaPackage.WORKITEMCOMPLETION_TYPE: return createworkitemcompletionType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceinputType createcreateresourceinputType()
  {
    createresourceinputTypeImpl createresourceinputType = new createresourceinputTypeImpl();
    return createresourceinputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceoutputType createcreateresourceoutputType()
  {
    createresourceoutputTypeImpl createresourceoutputType = new createresourceoutputTypeImpl();
    return createresourceoutputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceType createcreateresourceType()
  {
    createresourceTypeImpl createresourceType = new createresourceTypeImpl();
    return createresourceType;
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
  public faultType createfaultType()
  {
    faultTypeImpl faultType = new faultTypeImpl();
    return faultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceinputType createfetchresourceinputType()
  {
    fetchresourceinputTypeImpl fetchresourceinputType = new fetchresourceinputTypeImpl();
    return fetchresourceinputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceoutputType createfetchresourceoutputType()
  {
    fetchresourceoutputTypeImpl fetchresourceoutputType = new fetchresourceoutputTypeImpl();
    return fetchresourceoutputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceType createfetchresourceType()
  {
    fetchresourceTypeImpl fetchresourceType = new fetchresourceTypeImpl();
    return fetchresourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesinputType creategetprocessinstancesinputType()
  {
    getprocessinstancesinputTypeImpl getprocessinstancesinputType = new getprocessinstancesinputTypeImpl();
    return getprocessinstancesinputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesoutputType creategetprocessinstancesoutputType()
  {
    getprocessinstancesoutputTypeImpl getprocessinstancesoutputType = new getprocessinstancesoutputTypeImpl();
    return getprocessinstancesoutputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesType creategetprocessinstancesType()
  {
    getprocessinstancesTypeImpl getprocessinstancesType = new getprocessinstancesTypeImpl();
    return getprocessinstancesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inputType createinputType()
  {
    inputTypeImpl inputType = new inputTypeImpl();
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputrepeatType createldapentryinputrepeatType()
  {
    ldapentryinputrepeatTypeImpl ldapentryinputrepeatType = new ldapentryinputrepeatTypeImpl();
    return ldapentryinputrepeatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputType createldapentryinputType()
  {
    ldapentryinputTypeImpl ldapentryinputType = new ldapentryinputTypeImpl();
    return ldapentryinputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryType createldapentryType()
  {
    ldapentryTypeImpl ldapentryType = new ldapentryTypeImpl();
    return ldapentryType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parsecsvType createparsecsvType()
  {
    parsecsvTypeImpl parsecsvType = new parsecsvTypeImpl();
    return parsecsvType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_cancelledType createpi_cancelledType()
  {
    pi_cancelledTypeImpl pi_cancelledType = new pi_cancelledTypeImpl();
    return pi_cancelledType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_completeType createpi_completeType()
  {
    pi_completeTypeImpl pi_completeType = new pi_completeTypeImpl();
    return pi_completeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_haltedType createpi_haltedType()
  {
    pi_haltedTypeImpl pi_haltedType = new pi_haltedTypeImpl();
    return pi_haltedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pi_startedType createpi_startedType()
  {
    pi_startedTypeImpl pi_startedType = new pi_startedTypeImpl();
    return pi_startedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reesourcecreationandmappingType createreesourcecreationandmappingType()
  {
    reesourcecreationandmappingTypeImpl reesourcecreationandmappingType = new reesourcecreationandmappingTypeImpl();
    return reesourcecreationandmappingType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reportgenerationType createreportgenerationType()
  {
    reportgenerationTypeImpl reportgenerationType = new reportgenerationTypeImpl();
    return reportgenerationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public resourceType createresourceType()
  {
    resourceTypeImpl resourceType = new resourceTypeImpl();
    return resourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rootType createrootType()
  {
    rootTypeImpl rootType = new rootTypeImpl();
    return rootType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesinputType createsearchprocessinstancesinputType()
  {
    searchprocessinstancesinputTypeImpl searchprocessinstancesinputType = new searchprocessinstancesinputTypeImpl();
    return searchprocessinstancesinputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesoutputType createsearchprocessinstancesoutputType()
  {
    searchprocessinstancesoutputTypeImpl searchprocessinstancesoutputType = new searchprocessinstancesoutputTypeImpl();
    return searchprocessinstancesoutputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesType createsearchprocessinstancesType()
  {
    searchprocessinstancesTypeImpl searchprocessinstancesType = new searchprocessinstancesTypeImpl();
    return searchprocessinstancesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchrecordType createsearchrecordType()
  {
    searchrecordTypeImpl searchrecordType = new searchrecordTypeImpl();
    return searchrecordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public usersType createusersType()
  {
    usersTypeImpl usersType = new usersTypeImpl();
    return usersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletioninputType createworkitemcompletioninputType()
  {
    workitemcompletioninputTypeImpl workitemcompletioninputType = new workitemcompletioninputTypeImpl();
    return workitemcompletioninputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionoutputType createworkitemcompletionoutputType()
  {
    workitemcompletionoutputTypeImpl workitemcompletionoutputType = new workitemcompletionoutputTypeImpl();
    return workitemcompletionoutputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionType createworkitemcompletionType()
  {
    workitemcompletionTypeImpl workitemcompletionType = new workitemcompletionTypeImpl();
    return workitemcompletionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaPackage getSchemaPackage()
  {
    return (SchemaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SchemaPackage getPackage()
  {
    return SchemaPackage.eINSTANCE;
  }

} //SchemaFactoryImpl

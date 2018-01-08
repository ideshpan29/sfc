package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.DocumentRoot;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaFactory;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSActivator;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.inputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.resourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaPackageImpl extends EPackageImpl implements SchemaPackage
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
  private EClass createresourceinputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createresourceoutputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createresourceTypeEClass = null;

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
  private EClass faultTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchresourceinputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchresourceoutputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fetchresourceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getprocessinstancesinputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getprocessinstancesoutputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getprocessinstancesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldapentryinputrepeatTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldapentryinputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ldapentryTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parsecsvTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pi_cancelledTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pi_completeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pi_haltedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pi_startedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reesourcecreationandmappingTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportgenerationTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchprocessinstancesinputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchprocessinstancesoutputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchprocessinstancesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchrecordTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usersTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workitemcompletioninputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workitemcompletionoutputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workitemcompletionTypeEClass = null;

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
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SchemaPackageImpl()
  {
    super(eNS_URI, SchemaFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SchemaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SchemaPackage init()
  {
    if (isInited) return (SchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);

    // Obtain or create and register package
    SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchemaPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSchemaPackage.createPackageContents();

    // Initialize created meta-data
    theSchemaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSchemaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SchemaPackage.eNS_URI, theSchemaPackage);
    return theSchemaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcreateresourceinputType()
  {
    return createresourceinputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcreateresourceinputType_Name()
  {
    return (EAttribute)createresourceinputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcreateresourceinputType_Orgname()
  {
    return (EAttribute)createresourceinputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcreateresourceinputType_Flag()
  {
    return (EAttribute)createresourceinputTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcreateresourceinputType_Entityname()
  {
    return (EAttribute)createresourceinputTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcreateresourceoutputType()
  {
    return createresourceoutputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcreateresourceoutputType_Outputmessage()
  {
    return (EAttribute)createresourceoutputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcreateresourceType()
  {
    return createresourceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreateresourceType_Createresourceinput()
  {
    return (EReference)createresourceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcreateresourceType_Createresourceoutput()
  {
    return (EReference)createresourceTypeEClass.getEStructuralFeatures().get(1);
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
  public EReference getDocumentRoot_Createresource()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Createresourceinput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Createresourceoutput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Fault()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Fetchresource()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Fetchresourceinput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Fetchresourceoutput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Getprocessinstances()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Getprocessinstancesinput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Getprocessinstancesoutput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Ldapentry()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Ldapentryinput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Ldapentryinputrepeat()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Ldapentryoutput()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Parsecsv()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Reesourcecreationandmapping()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Reportgeneration()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Root()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Searchprocessinstances()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Searchprocessinstancesinput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Searchprocessinstancesoutput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Workitemcompletion()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Workitemcompletioninput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Workitemcompletionoutput()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateresourceinputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateresourceoutputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateresourceTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_FaultTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_FetchresourceinputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_FetchresourceoutputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_FetchresourceTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetprocessinstancesinputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetprocessinstancesoutputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetprocessinstancesTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_InputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_LdapentryinputrepeatTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_LdapentryinputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_LdapentryTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ParsecsvTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Pi_cancelledTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Pi_completeTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Pi_haltedTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Pi_startedTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ReesourcecreationandmappingTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ReportgenerationTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ResourceTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_RootTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchprocessinstancesinputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchprocessinstancesoutputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchprocessinstancesTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchrecordTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_UsersTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_WorkitemcompletioninputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_WorkitemcompletionoutputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_WorkitemcompletionTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfaultType()
  {
    return faultTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfaultType_Faultmessage()
  {
    return (EAttribute)faultTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfetchresourceinputType()
  {
    return fetchresourceinputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfetchresourceinputType_Processname()
  {
    return (EAttribute)fetchresourceinputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfetchresourceoutputType()
  {
    return fetchresourceoutputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfetchresourceoutputType_Resource()
  {
    return (EReference)fetchresourceoutputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfetchresourceType()
  {
    return fetchresourceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfetchresourceType_Fetchresourceinput()
  {
    return (EReference)fetchresourceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfetchresourceType_Fetchresourceoutput()
  {
    return (EReference)fetchresourceTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgetprocessinstancesinputType()
  {
    return getprocessinstancesinputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getgetprocessinstancesinputType_Processname()
  {
    return (EAttribute)getprocessinstancesinputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgetprocessinstancesoutputType()
  {
    return getprocessinstancesoutputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgetprocessinstancesoutputType_Pi_complete()
  {
    return (EReference)getprocessinstancesoutputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgetprocessinstancesoutputType_Pi_started()
  {
    return (EReference)getprocessinstancesoutputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgetprocessinstancesoutputType_Pi_halted()
  {
    return (EReference)getprocessinstancesoutputTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgetprocessinstancesoutputType_Pi_cancelled()
  {
    return (EReference)getprocessinstancesoutputTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgetprocessinstancesType()
  {
    return getprocessinstancesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgetprocessinstancesType_Getprocessinstancesinput()
  {
    return (EReference)getprocessinstancesTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgetprocessinstancesType_Getprocessinstancesoutput()
  {
    return (EReference)getprocessinstancesTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getinputType()
  {
    return inputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Firstname()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Lastname()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Email()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Password()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Orgmodelname()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Flag()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getinputType_Entity()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldapentryinputrepeatType()
  {
    return ldapentryinputrepeatTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getldapentryinputrepeatType_Input()
  {
    return (EReference)ldapentryinputrepeatTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldapentryinputType()
  {
    return ldapentryinputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Firstname()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Lastname()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Email()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Password()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Orgmodelname()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Flag()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryinputType_Entity()
  {
    return (EAttribute)ldapentryinputTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getldapentryType()
  {
    return ldapentryTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getldapentryType_Ldapentryinput()
  {
    return (EReference)ldapentryTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getldapentryType_Ldapentryoutput()
  {
    return (EAttribute)ldapentryTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getldapentryType_Ldapentryinputrepeat()
  {
    return (EReference)ldapentryTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getparsecsvType()
  {
    return parsecsvTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getparsecsvType_Users()
  {
    return (EReference)parsecsvTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpi_cancelledType()
  {
    return pi_cancelledTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Process_instance()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Customer_name()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Sibelcircuit_id()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Projectmanager()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Cur_activity()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Status()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_cancelledType_Exec_mills()
  {
    return (EAttribute)pi_cancelledTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpi_completeType()
  {
    return pi_completeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Process_instance()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Customer_name()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Sibelcircuit_id()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Projectmanager()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Cur_activity()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Status()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_completeType_Exec_mills()
  {
    return (EAttribute)pi_completeTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpi_haltedType()
  {
    return pi_haltedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Process_instance()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Customer_name()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Sibelcircuit_id()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Projectmanager()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Cur_activity()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Status()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_haltedType_Exec_mills()
  {
    return (EAttribute)pi_haltedTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpi_startedType()
  {
    return pi_startedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Process_instance()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Customer_name()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Sibelcircuit_id()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Projectmanager()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Cur_activity()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Status()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpi_startedType_Exec_mills()
  {
    return (EAttribute)pi_startedTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getreesourcecreationandmappingType()
  {
    return reesourcecreationandmappingTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreesourcecreationandmappingType_Createresource()
  {
    return (EReference)reesourcecreationandmappingTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreesourcecreationandmappingType_Ldapentry()
  {
    return (EReference)reesourcecreationandmappingTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreesourcecreationandmappingType_Parsecsv()
  {
    return (EReference)reesourcecreationandmappingTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getreportgenerationType()
  {
    return reportgenerationTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreportgenerationType_Getprocessinstances()
  {
    return (EReference)reportgenerationTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreportgenerationType_Searchprocessinstances()
  {
    return (EReference)reportgenerationTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getresourceType()
  {
    return resourceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getresourceType_Guid()
  {
    return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getresourceType_Label()
  {
    return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getresourceType_Name()
  {
    return (EAttribute)resourceTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrootType()
  {
    return rootTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrootType_Fetchresource()
  {
    return (EReference)rootTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrootType_Reportgeneration()
  {
    return (EReference)rootTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrootType_Reesourcecreationandmapping()
  {
    return (EReference)rootTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrootType_Workitemcompletion()
  {
    return (EReference)rootTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrootType_Fault()
  {
    return (EReference)rootTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsearchprocessinstancesinputType()
  {
    return searchprocessinstancesinputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchprocessinstancesinputType_Searchkey()
  {
    return (EAttribute)searchprocessinstancesinputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchprocessinstancesinputType_Searchvalue()
  {
    return (EAttribute)searchprocessinstancesinputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsearchprocessinstancesoutputType()
  {
    return searchprocessinstancesoutputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsearchprocessinstancesoutputType_Searchrecord()
  {
    return (EReference)searchprocessinstancesoutputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsearchprocessinstancesType()
  {
    return searchprocessinstancesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsearchprocessinstancesType_Searchprocessinstancesinput()
  {
    return (EReference)searchprocessinstancesTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsearchprocessinstancesType_Searchprocessinstancesoutput()
  {
    return (EReference)searchprocessinstancesTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsearchrecordType()
  {
    return searchrecordTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Process_instance()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Customer_name()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Sibelcircuit_id()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Projectmanager()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Cur_activity()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Status()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsearchrecordType_Exec_mills()
  {
    return (EAttribute)searchrecordTypeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getusersType()
  {
    return usersTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getusersType_Name()
  {
    return (EAttribute)usersTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getusersType_Flag()
  {
    return (EAttribute)usersTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getusersType_Entityvalue()
  {
    return (EAttribute)usersTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getusersType_Orgmodelname()
  {
    return (EAttribute)usersTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getworkitemcompletioninputType()
  {
    return workitemcompletioninputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getworkitemcompletioninputType_Sibelcircuitid()
  {
    return (EAttribute)workitemcompletioninputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getworkitemcompletionoutputType()
  {
    return workitemcompletionoutputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getworkitemcompletionoutputType_Outputmessage()
  {
    return (EAttribute)workitemcompletionoutputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getworkitemcompletionType()
  {
    return workitemcompletionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getworkitemcompletionType_Workitemcompletioninput()
  {
    return (EReference)workitemcompletionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getworkitemcompletionType_Workitemcompletionoutput()
  {
    return (EReference)workitemcompletionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SchemaFactory getSchemaFactory()
  {
    return (SchemaFactory)getEFactoryInstance();
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
    createresourceinputTypeEClass = createEClass(CREATERESOURCEINPUT_TYPE);
    createEAttribute(createresourceinputTypeEClass, CREATERESOURCEINPUT_TYPE__NAME);
    createEAttribute(createresourceinputTypeEClass, CREATERESOURCEINPUT_TYPE__ORGNAME);
    createEAttribute(createresourceinputTypeEClass, CREATERESOURCEINPUT_TYPE__FLAG);
    createEAttribute(createresourceinputTypeEClass, CREATERESOURCEINPUT_TYPE__ENTITYNAME);

    createresourceoutputTypeEClass = createEClass(CREATERESOURCEOUTPUT_TYPE);
    createEAttribute(createresourceoutputTypeEClass, CREATERESOURCEOUTPUT_TYPE__OUTPUTMESSAGE);

    createresourceTypeEClass = createEClass(CREATERESOURCE_TYPE);
    createEReference(createresourceTypeEClass, CREATERESOURCE_TYPE__CREATERESOURCEINPUT);
    createEReference(createresourceTypeEClass, CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATERESOURCE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATERESOURCEINPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATERESOURCEOUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FETCHRESOURCE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FETCHRESOURCEINPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FETCHRESOURCEOUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GETPROCESSINSTANCES);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LDAPENTRY);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LDAPENTRYINPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__LDAPENTRYOUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PARSECSV);
    createEReference(documentRootEClass, DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING);
    createEReference(documentRootEClass, DOCUMENT_ROOT__REPORTGENERATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHPROCESSINSTANCES);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WORKITEMCOMPLETION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATERESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATERESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATERESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FAULT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FETCHRESOURCEINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FETCHRESOURCEOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__FETCHRESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GETPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GETPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GETPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LDAPENTRYINPUTREPEAT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LDAPENTRYINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__LDAPENTRY_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PARSECSV_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PI_CANCELLED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PI_COMPLETE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PI_HALTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PI_STARTED_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__REESOURCECREATIONANDMAPPING_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__REPORTGENERATION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__RESOURCE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__ROOT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHPROCESSINSTANCESINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHPROCESSINSTANCESOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHPROCESSINSTANCES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCHRECORD_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__USERS_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WORKITEMCOMPLETIONINPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WORKITEMCOMPLETIONOUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WORKITEMCOMPLETION_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    faultTypeEClass = createEClass(FAULT_TYPE);
    createEAttribute(faultTypeEClass, FAULT_TYPE__FAULTMESSAGE);

    fetchresourceinputTypeEClass = createEClass(FETCHRESOURCEINPUT_TYPE);
    createEAttribute(fetchresourceinputTypeEClass, FETCHRESOURCEINPUT_TYPE__PROCESSNAME);

    fetchresourceoutputTypeEClass = createEClass(FETCHRESOURCEOUTPUT_TYPE);
    createEReference(fetchresourceoutputTypeEClass, FETCHRESOURCEOUTPUT_TYPE__RESOURCE);

    fetchresourceTypeEClass = createEClass(FETCHRESOURCE_TYPE);
    createEReference(fetchresourceTypeEClass, FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT);
    createEReference(fetchresourceTypeEClass, FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT);

    getprocessinstancesinputTypeEClass = createEClass(GETPROCESSINSTANCESINPUT_TYPE);
    createEAttribute(getprocessinstancesinputTypeEClass, GETPROCESSINSTANCESINPUT_TYPE__PROCESSNAME);

    getprocessinstancesoutputTypeEClass = createEClass(GETPROCESSINSTANCESOUTPUT_TYPE);
    createEReference(getprocessinstancesoutputTypeEClass, GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE);
    createEReference(getprocessinstancesoutputTypeEClass, GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED);
    createEReference(getprocessinstancesoutputTypeEClass, GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED);
    createEReference(getprocessinstancesoutputTypeEClass, GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED);

    getprocessinstancesTypeEClass = createEClass(GETPROCESSINSTANCES_TYPE);
    createEReference(getprocessinstancesTypeEClass, GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT);
    createEReference(getprocessinstancesTypeEClass, GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT);

    inputTypeEClass = createEClass(INPUT_TYPE);
    createEAttribute(inputTypeEClass, INPUT_TYPE__FIRSTNAME);
    createEAttribute(inputTypeEClass, INPUT_TYPE__LASTNAME);
    createEAttribute(inputTypeEClass, INPUT_TYPE__EMAIL);
    createEAttribute(inputTypeEClass, INPUT_TYPE__PASSWORD);
    createEAttribute(inputTypeEClass, INPUT_TYPE__ORGMODELNAME);
    createEAttribute(inputTypeEClass, INPUT_TYPE__FLAG);
    createEAttribute(inputTypeEClass, INPUT_TYPE__ENTITY);

    ldapentryinputrepeatTypeEClass = createEClass(LDAPENTRYINPUTREPEAT_TYPE);
    createEReference(ldapentryinputrepeatTypeEClass, LDAPENTRYINPUTREPEAT_TYPE__INPUT);

    ldapentryinputTypeEClass = createEClass(LDAPENTRYINPUT_TYPE);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__FIRSTNAME);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__LASTNAME);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__EMAIL);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__PASSWORD);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__ORGMODELNAME);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__FLAG);
    createEAttribute(ldapentryinputTypeEClass, LDAPENTRYINPUT_TYPE__ENTITY);

    ldapentryTypeEClass = createEClass(LDAPENTRY_TYPE);
    createEReference(ldapentryTypeEClass, LDAPENTRY_TYPE__LDAPENTRYINPUT);
    createEAttribute(ldapentryTypeEClass, LDAPENTRY_TYPE__LDAPENTRYOUTPUT);
    createEReference(ldapentryTypeEClass, LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT);

    parsecsvTypeEClass = createEClass(PARSECSV_TYPE);
    createEReference(parsecsvTypeEClass, PARSECSV_TYPE__USERS);

    pi_cancelledTypeEClass = createEClass(PI_CANCELLED_TYPE);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__PROCESS_INSTANCE);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__CUSTOMER_NAME);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__SIBELCIRCUIT_ID);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__PROJECTMANAGER);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__CUR_ACTIVITY);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__STATUS);
    createEAttribute(pi_cancelledTypeEClass, PI_CANCELLED_TYPE__EXEC_MILLS);

    pi_completeTypeEClass = createEClass(PI_COMPLETE_TYPE);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__PROCESS_INSTANCE);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__CUSTOMER_NAME);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__SIBELCIRCUIT_ID);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__PROJECTMANAGER);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__CUR_ACTIVITY);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__STATUS);
    createEAttribute(pi_completeTypeEClass, PI_COMPLETE_TYPE__EXEC_MILLS);

    pi_haltedTypeEClass = createEClass(PI_HALTED_TYPE);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__PROCESS_INSTANCE);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__CUSTOMER_NAME);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__SIBELCIRCUIT_ID);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__PROJECTMANAGER);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__CUR_ACTIVITY);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__STATUS);
    createEAttribute(pi_haltedTypeEClass, PI_HALTED_TYPE__EXEC_MILLS);

    pi_startedTypeEClass = createEClass(PI_STARTED_TYPE);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__PROCESS_INSTANCE);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__CUSTOMER_NAME);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__SIBELCIRCUIT_ID);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__PROJECTMANAGER);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__CUR_ACTIVITY);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__STATUS);
    createEAttribute(pi_startedTypeEClass, PI_STARTED_TYPE__EXEC_MILLS);

    reesourcecreationandmappingTypeEClass = createEClass(REESOURCECREATIONANDMAPPING_TYPE);
    createEReference(reesourcecreationandmappingTypeEClass, REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE);
    createEReference(reesourcecreationandmappingTypeEClass, REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY);
    createEReference(reesourcecreationandmappingTypeEClass, REESOURCECREATIONANDMAPPING_TYPE__PARSECSV);

    reportgenerationTypeEClass = createEClass(REPORTGENERATION_TYPE);
    createEReference(reportgenerationTypeEClass, REPORTGENERATION_TYPE__GETPROCESSINSTANCES);
    createEReference(reportgenerationTypeEClass, REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES);

    resourceTypeEClass = createEClass(RESOURCE_TYPE);
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__GUID);
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__LABEL);
    createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);

    rootTypeEClass = createEClass(ROOT_TYPE);
    createEReference(rootTypeEClass, ROOT_TYPE__FETCHRESOURCE);
    createEReference(rootTypeEClass, ROOT_TYPE__REPORTGENERATION);
    createEReference(rootTypeEClass, ROOT_TYPE__REESOURCECREATIONANDMAPPING);
    createEReference(rootTypeEClass, ROOT_TYPE__WORKITEMCOMPLETION);
    createEReference(rootTypeEClass, ROOT_TYPE__FAULT);

    searchprocessinstancesinputTypeEClass = createEClass(SEARCHPROCESSINSTANCESINPUT_TYPE);
    createEAttribute(searchprocessinstancesinputTypeEClass, SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY);
    createEAttribute(searchprocessinstancesinputTypeEClass, SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE);

    searchprocessinstancesoutputTypeEClass = createEClass(SEARCHPROCESSINSTANCESOUTPUT_TYPE);
    createEReference(searchprocessinstancesoutputTypeEClass, SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD);

    searchprocessinstancesTypeEClass = createEClass(SEARCHPROCESSINSTANCES_TYPE);
    createEReference(searchprocessinstancesTypeEClass, SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT);
    createEReference(searchprocessinstancesTypeEClass, SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT);

    searchrecordTypeEClass = createEClass(SEARCHRECORD_TYPE);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__PROCESS_INSTANCE);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__CUSTOMER_NAME);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__SIBELCIRCUIT_ID);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__PROJECTMANAGER);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__CUR_ACTIVITY);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__STATUS);
    createEAttribute(searchrecordTypeEClass, SEARCHRECORD_TYPE__EXEC_MILLS);

    usersTypeEClass = createEClass(USERS_TYPE);
    createEAttribute(usersTypeEClass, USERS_TYPE__NAME);
    createEAttribute(usersTypeEClass, USERS_TYPE__FLAG);
    createEAttribute(usersTypeEClass, USERS_TYPE__ENTITYVALUE);
    createEAttribute(usersTypeEClass, USERS_TYPE__ORGMODELNAME);

    workitemcompletioninputTypeEClass = createEClass(WORKITEMCOMPLETIONINPUT_TYPE);
    createEAttribute(workitemcompletioninputTypeEClass, WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID);

    workitemcompletionoutputTypeEClass = createEClass(WORKITEMCOMPLETIONOUTPUT_TYPE);
    createEAttribute(workitemcompletionoutputTypeEClass, WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE);

    workitemcompletionTypeEClass = createEClass(WORKITEMCOMPLETION_TYPE);
    createEReference(workitemcompletionTypeEClass, WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT);
    createEReference(workitemcompletionTypeEClass, WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT);
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

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(createresourceinputTypeEClass, createresourceinputType.class, "createresourceinputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcreateresourceinputType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, createresourceinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcreateresourceinputType_Orgname(), theXMLTypePackage.getString(), "orgname", null, 1, 1, createresourceinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcreateresourceinputType_Flag(), theXMLTypePackage.getString(), "flag", null, 1, 1, createresourceinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcreateresourceinputType_Entityname(), theXMLTypePackage.getString(), "entityname", null, 1, 1, createresourceinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createresourceoutputTypeEClass, createresourceoutputType.class, "createresourceoutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcreateresourceoutputType_Outputmessage(), theXMLTypePackage.getString(), "outputmessage", null, 1, 1, createresourceoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createresourceTypeEClass, createresourceType.class, "createresourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcreateresourceType_Createresourceinput(), this.getcreateresourceinputType(), null, "createresourceinput", null, 0, -1, createresourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcreateresourceType_Createresourceoutput(), this.getcreateresourceoutputType(), null, "createresourceoutput", null, 1, 1, createresourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Createresource(), this.getcreateresourceType(), null, "createresource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Createresourceinput(), this.getcreateresourceinputType(), null, "createresourceinput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Createresourceoutput(), this.getcreateresourceoutputType(), null, "createresourceoutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Fault(), this.getfaultType(), null, "fault", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Fetchresource(), this.getfetchresourceType(), null, "fetchresource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Fetchresourceinput(), this.getfetchresourceinputType(), null, "fetchresourceinput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Fetchresourceoutput(), this.getfetchresourceoutputType(), null, "fetchresourceoutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Getprocessinstances(), this.getgetprocessinstancesType(), null, "getprocessinstances", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Getprocessinstancesinput(), this.getgetprocessinstancesinputType(), null, "getprocessinstancesinput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Getprocessinstancesoutput(), this.getgetprocessinstancesoutputType(), null, "getprocessinstancesoutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Ldapentry(), this.getldapentryType(), null, "ldapentry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Ldapentryinput(), this.getldapentryinputType(), null, "ldapentryinput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Ldapentryinputrepeat(), this.getldapentryinputrepeatType(), null, "ldapentryinputrepeat", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_Ldapentryoutput(), theXMLTypePackage.getString(), "ldapentryoutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Parsecsv(), this.getparsecsvType(), null, "parsecsv", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Reesourcecreationandmapping(), this.getreesourcecreationandmappingType(), null, "reesourcecreationandmapping", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Reportgeneration(), this.getreportgenerationType(), null, "reportgeneration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Root(), this.getrootType(), null, "root", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Searchprocessinstances(), this.getsearchprocessinstancesType(), null, "searchprocessinstances", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Searchprocessinstancesinput(), this.getsearchprocessinstancesinputType(), null, "searchprocessinstancesinput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Searchprocessinstancesoutput(), this.getsearchprocessinstancesoutputType(), null, "searchprocessinstancesoutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Workitemcompletion(), this.getworkitemcompletionType(), null, "workitemcompletion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Workitemcompletioninput(), this.getworkitemcompletioninputType(), null, "workitemcompletioninput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Workitemcompletionoutput(), this.getworkitemcompletionoutputType(), null, "workitemcompletionoutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateresourceinputTypeBDSInternalSerializationElement(), this.getcreateresourceinputType(), null, "createresourceinputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateresourceoutputTypeBDSInternalSerializationElement(), this.getcreateresourceoutputType(), null, "createresourceoutputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateresourceTypeBDSInternalSerializationElement(), this.getcreateresourceType(), null, "createresourceTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_FaultTypeBDSInternalSerializationElement(), this.getfaultType(), null, "faultTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_FetchresourceinputTypeBDSInternalSerializationElement(), this.getfetchresourceinputType(), null, "fetchresourceinputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_FetchresourceoutputTypeBDSInternalSerializationElement(), this.getfetchresourceoutputType(), null, "fetchresourceoutputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_FetchresourceTypeBDSInternalSerializationElement(), this.getfetchresourceType(), null, "fetchresourceTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetprocessinstancesinputTypeBDSInternalSerializationElement(), this.getgetprocessinstancesinputType(), null, "getprocessinstancesinputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetprocessinstancesoutputTypeBDSInternalSerializationElement(), this.getgetprocessinstancesoutputType(), null, "getprocessinstancesoutputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetprocessinstancesTypeBDSInternalSerializationElement(), this.getgetprocessinstancesType(), null, "getprocessinstancesTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_InputTypeBDSInternalSerializationElement(), this.getinputType(), null, "inputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_LdapentryinputrepeatTypeBDSInternalSerializationElement(), this.getldapentryinputrepeatType(), null, "ldapentryinputrepeatTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_LdapentryinputTypeBDSInternalSerializationElement(), this.getldapentryinputType(), null, "ldapentryinputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_LdapentryTypeBDSInternalSerializationElement(), this.getldapentryType(), null, "ldapentryTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ParsecsvTypeBDSInternalSerializationElement(), this.getparsecsvType(), null, "parsecsvTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Pi_cancelledTypeBDSInternalSerializationElement(), this.getpi_cancelledType(), null, "pi_cancelledTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Pi_completeTypeBDSInternalSerializationElement(), this.getpi_completeType(), null, "pi_completeTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Pi_haltedTypeBDSInternalSerializationElement(), this.getpi_haltedType(), null, "pi_haltedTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Pi_startedTypeBDSInternalSerializationElement(), this.getpi_startedType(), null, "pi_startedTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ReesourcecreationandmappingTypeBDSInternalSerializationElement(), this.getreesourcecreationandmappingType(), null, "reesourcecreationandmappingTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ReportgenerationTypeBDSInternalSerializationElement(), this.getreportgenerationType(), null, "reportgenerationTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ResourceTypeBDSInternalSerializationElement(), this.getresourceType(), null, "resourceTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_RootTypeBDSInternalSerializationElement(), this.getrootType(), null, "rootTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchprocessinstancesinputTypeBDSInternalSerializationElement(), this.getsearchprocessinstancesinputType(), null, "searchprocessinstancesinputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchprocessinstancesoutputTypeBDSInternalSerializationElement(), this.getsearchprocessinstancesoutputType(), null, "searchprocessinstancesoutputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchprocessinstancesTypeBDSInternalSerializationElement(), this.getsearchprocessinstancesType(), null, "searchprocessinstancesTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchrecordTypeBDSInternalSerializationElement(), this.getsearchrecordType(), null, "searchrecordTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_UsersTypeBDSInternalSerializationElement(), this.getusersType(), null, "usersTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_WorkitemcompletioninputTypeBDSInternalSerializationElement(), this.getworkitemcompletioninputType(), null, "workitemcompletioninputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_WorkitemcompletionoutputTypeBDSInternalSerializationElement(), this.getworkitemcompletionoutputType(), null, "workitemcompletionoutputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_WorkitemcompletionTypeBDSInternalSerializationElement(), this.getworkitemcompletionType(), null, "workitemcompletionTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(faultTypeEClass, faultType.class, "faultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfaultType_Faultmessage(), theXMLTypePackage.getString(), "faultmessage", null, 1, 1, faultType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchresourceinputTypeEClass, fetchresourceinputType.class, "fetchresourceinputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfetchresourceinputType_Processname(), theXMLTypePackage.getString(), "processname", null, 1, 1, fetchresourceinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchresourceoutputTypeEClass, fetchresourceoutputType.class, "fetchresourceoutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfetchresourceoutputType_Resource(), this.getresourceType(), null, "resource", null, 0, -1, fetchresourceoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fetchresourceTypeEClass, fetchresourceType.class, "fetchresourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfetchresourceType_Fetchresourceinput(), this.getfetchresourceinputType(), null, "fetchresourceinput", null, 1, 1, fetchresourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfetchresourceType_Fetchresourceoutput(), this.getfetchresourceoutputType(), null, "fetchresourceoutput", null, 1, 1, fetchresourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getprocessinstancesinputTypeEClass, getprocessinstancesinputType.class, "getprocessinstancesinputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getgetprocessinstancesinputType_Processname(), theXMLTypePackage.getString(), "processname", null, 1, 1, getprocessinstancesinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getprocessinstancesoutputTypeEClass, getprocessinstancesoutputType.class, "getprocessinstancesoutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgetprocessinstancesoutputType_Pi_complete(), this.getpi_completeType(), null, "pi_complete", null, 0, -1, getprocessinstancesoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgetprocessinstancesoutputType_Pi_started(), this.getpi_startedType(), null, "pi_started", null, 0, -1, getprocessinstancesoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgetprocessinstancesoutputType_Pi_halted(), this.getpi_haltedType(), null, "pi_halted", null, 0, -1, getprocessinstancesoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgetprocessinstancesoutputType_Pi_cancelled(), this.getpi_cancelledType(), null, "pi_cancelled", null, 0, -1, getprocessinstancesoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getprocessinstancesTypeEClass, getprocessinstancesType.class, "getprocessinstancesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgetprocessinstancesType_Getprocessinstancesinput(), this.getgetprocessinstancesinputType(), null, "getprocessinstancesinput", null, 1, 1, getprocessinstancesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getgetprocessinstancesType_Getprocessinstancesoutput(), this.getgetprocessinstancesoutputType(), null, "getprocessinstancesoutput", null, 1, 1, getprocessinstancesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputTypeEClass, inputType.class, "inputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getinputType_Firstname(), theXMLTypePackage.getString(), "firstname", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinputType_Lastname(), theXMLTypePackage.getString(), "lastname", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinputType_Email(), theXMLTypePackage.getString(), "email", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinputType_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinputType_Orgmodelname(), theXMLTypePackage.getString(), "orgmodelname", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinputType_Flag(), theXMLTypePackage.getString(), "flag", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getinputType_Entity(), theXMLTypePackage.getString(), "entity", null, 1, 1, inputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldapentryinputrepeatTypeEClass, ldapentryinputrepeatType.class, "ldapentryinputrepeatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getldapentryinputrepeatType_Input(), this.getinputType(), null, "input", null, 0, -1, ldapentryinputrepeatType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldapentryinputTypeEClass, ldapentryinputType.class, "ldapentryinputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getldapentryinputType_Firstname(), theXMLTypePackage.getString(), "firstname", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryinputType_Lastname(), theXMLTypePackage.getString(), "lastname", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryinputType_Email(), theXMLTypePackage.getString(), "email", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryinputType_Password(), theXMLTypePackage.getString(), "password", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryinputType_Orgmodelname(), theXMLTypePackage.getString(), "orgmodelname", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryinputType_Flag(), theXMLTypePackage.getString(), "flag", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryinputType_Entity(), theXMLTypePackage.getString(), "entity", null, 1, 1, ldapentryinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ldapentryTypeEClass, ldapentryType.class, "ldapentryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getldapentryType_Ldapentryinput(), this.getldapentryinputType(), null, "ldapentryinput", null, 1, 1, ldapentryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getldapentryType_Ldapentryoutput(), theXMLTypePackage.getString(), "ldapentryoutput", null, 1, 1, ldapentryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getldapentryType_Ldapentryinputrepeat(), this.getldapentryinputrepeatType(), null, "ldapentryinputrepeat", null, 1, 1, ldapentryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parsecsvTypeEClass, parsecsvType.class, "parsecsvType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getparsecsvType_Users(), this.getusersType(), null, "users", null, 0, -1, parsecsvType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pi_cancelledTypeEClass, pi_cancelledType.class, "pi_cancelledType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpi_cancelledType_Process_instance(), theXMLTypePackage.getString(), "process_instance", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_cancelledType_Customer_name(), theXMLTypePackage.getString(), "customer_name", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_cancelledType_Sibelcircuit_id(), theXMLTypePackage.getString(), "sibelcircuit_id", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_cancelledType_Projectmanager(), theXMLTypePackage.getString(), "projectmanager", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_cancelledType_Cur_activity(), theXMLTypePackage.getString(), "cur_activity", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_cancelledType_Status(), theXMLTypePackage.getString(), "status", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_cancelledType_Exec_mills(), theXMLTypePackage.getString(), "exec_mills", null, 1, 1, pi_cancelledType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pi_completeTypeEClass, pi_completeType.class, "pi_completeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpi_completeType_Process_instance(), theXMLTypePackage.getString(), "process_instance", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_completeType_Customer_name(), theXMLTypePackage.getString(), "customer_name", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_completeType_Sibelcircuit_id(), theXMLTypePackage.getString(), "sibelcircuit_id", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_completeType_Projectmanager(), theXMLTypePackage.getString(), "projectmanager", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_completeType_Cur_activity(), theXMLTypePackage.getString(), "cur_activity", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_completeType_Status(), theXMLTypePackage.getString(), "status", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_completeType_Exec_mills(), theXMLTypePackage.getString(), "exec_mills", null, 1, 1, pi_completeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pi_haltedTypeEClass, pi_haltedType.class, "pi_haltedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpi_haltedType_Process_instance(), theXMLTypePackage.getString(), "process_instance", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_haltedType_Customer_name(), theXMLTypePackage.getString(), "customer_name", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_haltedType_Sibelcircuit_id(), theXMLTypePackage.getString(), "sibelcircuit_id", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_haltedType_Projectmanager(), theXMLTypePackage.getString(), "projectmanager", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_haltedType_Cur_activity(), theXMLTypePackage.getString(), "cur_activity", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_haltedType_Status(), theXMLTypePackage.getString(), "status", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_haltedType_Exec_mills(), theXMLTypePackage.getString(), "exec_mills", null, 1, 1, pi_haltedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pi_startedTypeEClass, pi_startedType.class, "pi_startedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpi_startedType_Process_instance(), theXMLTypePackage.getString(), "process_instance", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_startedType_Customer_name(), theXMLTypePackage.getString(), "customer_name", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_startedType_Sibelcircuit_id(), theXMLTypePackage.getString(), "sibelcircuit_id", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_startedType_Projectmanager(), theXMLTypePackage.getString(), "projectmanager", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_startedType_Cur_activity(), theXMLTypePackage.getString(), "cur_activity", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_startedType_Status(), theXMLTypePackage.getString(), "status", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpi_startedType_Exec_mills(), theXMLTypePackage.getString(), "exec_mills", null, 1, 1, pi_startedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reesourcecreationandmappingTypeEClass, reesourcecreationandmappingType.class, "reesourcecreationandmappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getreesourcecreationandmappingType_Createresource(), this.getcreateresourceType(), null, "createresource", null, 1, 1, reesourcecreationandmappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getreesourcecreationandmappingType_Ldapentry(), this.getldapentryType(), null, "ldapentry", null, 1, 1, reesourcecreationandmappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getreesourcecreationandmappingType_Parsecsv(), this.getparsecsvType(), null, "parsecsv", null, 1, 1, reesourcecreationandmappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reportgenerationTypeEClass, reportgenerationType.class, "reportgenerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getreportgenerationType_Getprocessinstances(), this.getgetprocessinstancesType(), null, "getprocessinstances", null, 1, 1, reportgenerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getreportgenerationType_Searchprocessinstances(), this.getsearchprocessinstancesType(), null, "searchprocessinstances", null, 1, 1, reportgenerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceTypeEClass, resourceType.class, "resourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getresourceType_Guid(), theXMLTypePackage.getString(), "guid", null, 1, 1, resourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getresourceType_Label(), theXMLTypePackage.getString(), "label", null, 1, 1, resourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getresourceType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, resourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rootTypeEClass, rootType.class, "rootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrootType_Fetchresource(), this.getfetchresourceType(), null, "fetchresource", null, 1, 1, rootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrootType_Reportgeneration(), this.getreportgenerationType(), null, "reportgeneration", null, 1, 1, rootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrootType_Reesourcecreationandmapping(), this.getreesourcecreationandmappingType(), null, "reesourcecreationandmapping", null, 1, 1, rootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrootType_Workitemcompletion(), this.getworkitemcompletionType(), null, "workitemcompletion", null, 1, 1, rootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrootType_Fault(), this.getfaultType(), null, "fault", null, 1, 1, rootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchprocessinstancesinputTypeEClass, searchprocessinstancesinputType.class, "searchprocessinstancesinputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsearchprocessinstancesinputType_Searchkey(), theXMLTypePackage.getString(), "searchkey", null, 1, 1, searchprocessinstancesinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchprocessinstancesinputType_Searchvalue(), theXMLTypePackage.getString(), "searchvalue", null, 1, 1, searchprocessinstancesinputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchprocessinstancesoutputTypeEClass, searchprocessinstancesoutputType.class, "searchprocessinstancesoutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsearchprocessinstancesoutputType_Searchrecord(), this.getsearchrecordType(), null, "searchrecord", null, 0, -1, searchprocessinstancesoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchprocessinstancesTypeEClass, searchprocessinstancesType.class, "searchprocessinstancesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsearchprocessinstancesType_Searchprocessinstancesinput(), this.getsearchprocessinstancesinputType(), null, "searchprocessinstancesinput", null, 1, 1, searchprocessinstancesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsearchprocessinstancesType_Searchprocessinstancesoutput(), this.getsearchprocessinstancesoutputType(), null, "searchprocessinstancesoutput", null, 1, 1, searchprocessinstancesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchrecordTypeEClass, searchrecordType.class, "searchrecordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsearchrecordType_Process_instance(), theXMLTypePackage.getString(), "process_instance", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchrecordType_Customer_name(), theXMLTypePackage.getString(), "customer_name", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchrecordType_Sibelcircuit_id(), theXMLTypePackage.getString(), "sibelcircuit_id", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchrecordType_Projectmanager(), theXMLTypePackage.getString(), "projectmanager", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchrecordType_Cur_activity(), theXMLTypePackage.getString(), "cur_activity", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchrecordType_Status(), theXMLTypePackage.getString(), "status", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsearchrecordType_Exec_mills(), theXMLTypePackage.getString(), "exec_mills", null, 1, 1, searchrecordType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usersTypeEClass, usersType.class, "usersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getusersType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, usersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getusersType_Flag(), theXMLTypePackage.getString(), "flag", null, 1, 1, usersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getusersType_Entityvalue(), theXMLTypePackage.getString(), "entityvalue", null, 1, 1, usersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getusersType_Orgmodelname(), theXMLTypePackage.getString(), "orgmodelname", null, 1, 1, usersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workitemcompletioninputTypeEClass, workitemcompletioninputType.class, "workitemcompletioninputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getworkitemcompletioninputType_Sibelcircuitid(), theXMLTypePackage.getString(), "sibelcircuitid", null, 1, 1, workitemcompletioninputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workitemcompletionoutputTypeEClass, workitemcompletionoutputType.class, "workitemcompletionoutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getworkitemcompletionoutputType_Outputmessage(), theXMLTypePackage.getString(), "outputmessage", null, 1, 1, workitemcompletionoutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(workitemcompletionTypeEClass, workitemcompletionType.class, "workitemcompletionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getworkitemcompletionType_Workitemcompletioninput(), this.getworkitemcompletioninputType(), null, "workitemcompletioninput", null, 1, 1, workitemcompletionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getworkitemcompletionType_Workitemcompletionoutput(), this.getworkitemcompletionoutputType(), null, "workitemcompletionoutput", null, 1, 1, workitemcompletionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (createresourceinputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "createresourceinput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getcreateresourceinputType_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getcreateresourceinputType_Orgname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "orgname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getcreateresourceinputType_Flag(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "flag",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getcreateresourceinputType_Entityname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "entityname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (createresourceoutputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "createresourceoutput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getcreateresourceoutputType_Outputmessage(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "outputmessage",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (createresourceTypeEClass, 
       source, 
       new String[] 
       {
       "name", "createresource_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getcreateresourceType_Createresourceinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresourceinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getcreateresourceType_Createresourceoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresourceoutput",
       "namespace", "##targetNamespace"
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
      (getDocumentRoot_Createresource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresource",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Createresourceinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresourceinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Createresourceoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresourceoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Fault(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fault",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Fetchresource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresource",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Fetchresourceinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresourceinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Fetchresourceoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresourceoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Getprocessinstances(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstances",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Getprocessinstancesinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstancesinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Getprocessinstancesoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstancesoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Ldapentry(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentry",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Ldapentryinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Ldapentryinputrepeat(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryinputrepeat",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Ldapentryoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Parsecsv(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "parsecsv",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Reesourcecreationandmapping(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reesourcecreationandmapping",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Reportgeneration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reportgeneration",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Root(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "root",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Searchprocessinstances(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstances",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Searchprocessinstancesinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstancesinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Searchprocessinstancesoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstancesoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Workitemcompletion(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletion",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Workitemcompletioninput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletioninput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Workitemcompletionoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletionoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateresourceinputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresourceinput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateresourceoutputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresourceoutput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateresourceTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresource_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_FaultTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fault_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_FetchresourceinputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresourceinput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_FetchresourceoutputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresourceoutput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_FetchresourceTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresource_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetprocessinstancesinputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstancesinput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetprocessinstancesoutputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstancesoutput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetprocessinstancesTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstances_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_InputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "input_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_LdapentryinputrepeatTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryinputrepeat_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_LdapentryinputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryinput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_LdapentryTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentry_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ParsecsvTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "parsecsv_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Pi_cancelledTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_cancelled_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Pi_completeTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_complete_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Pi_haltedTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_halted_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Pi_startedTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_started_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ReesourcecreationandmappingTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reesourcecreationandmapping_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ReportgenerationTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reportgeneration_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ResourceTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "resource_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_RootTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "root_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchprocessinstancesinputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstancesinput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchprocessinstancesoutputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstancesoutput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchprocessinstancesTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstances_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchrecordTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchrecord_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_UsersTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "users_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_WorkitemcompletioninputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletioninput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_WorkitemcompletionoutputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletionoutput_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_WorkitemcompletionTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletion_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (faultTypeEClass, 
       source, 
       new String[] 
       {
       "name", "fault_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getfaultType_Faultmessage(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "faultmessage",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (fetchresourceinputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "fetchresourceinput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getfetchresourceinputType_Processname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (fetchresourceoutputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "fetchresourceoutput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getfetchresourceoutputType_Resource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "resource",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (fetchresourceTypeEClass, 
       source, 
       new String[] 
       {
       "name", "fetchresource_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getfetchresourceType_Fetchresourceinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresourceinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getfetchresourceType_Fetchresourceoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresourceoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getprocessinstancesinputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "getprocessinstancesinput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getgetprocessinstancesinputType_Processname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getprocessinstancesoutputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "getprocessinstancesoutput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getgetprocessinstancesoutputType_Pi_complete(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_complete",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getgetprocessinstancesoutputType_Pi_started(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_started",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getgetprocessinstancesoutputType_Pi_halted(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_halted",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getgetprocessinstancesoutputType_Pi_cancelled(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pi_cancelled",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getprocessinstancesTypeEClass, 
       source, 
       new String[] 
       {
       "name", "getprocessinstances_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getgetprocessinstancesType_Getprocessinstancesinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstancesinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getgetprocessinstancesType_Getprocessinstancesoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstancesoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (inputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "input_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getinputType_Firstname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "firstname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getinputType_Lastname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "lastname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getinputType_Email(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "email",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getinputType_Password(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "password",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getinputType_Orgmodelname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "orgmodelname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getinputType_Flag(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "flag",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getinputType_Entity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "entity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (ldapentryinputrepeatTypeEClass, 
       source, 
       new String[] 
       {
       "name", "ldapentryinputrepeat_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getldapentryinputrepeatType_Input(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "input",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (ldapentryinputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "ldapentryinput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getldapentryinputType_Firstname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "firstname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryinputType_Lastname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "lastname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryinputType_Email(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "email",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryinputType_Password(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "password",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryinputType_Orgmodelname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "orgmodelname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryinputType_Flag(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "flag",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryinputType_Entity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "entity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (ldapentryTypeEClass, 
       source, 
       new String[] 
       {
       "name", "ldapentry_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getldapentryType_Ldapentryinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryType_Ldapentryoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getldapentryType_Ldapentryinputrepeat(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentryinputrepeat",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (parsecsvTypeEClass, 
       source, 
       new String[] 
       {
       "name", "parsecsv_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getparsecsvType_Users(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "users",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (pi_cancelledTypeEClass, 
       source, 
       new String[] 
       {
       "name", "pi_cancelled_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getpi_cancelledType_Process_instance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "process_instance",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_cancelledType_Customer_name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customer_name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_cancelledType_Sibelcircuit_id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sibelcircuit_id",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_cancelledType_Projectmanager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectmanager",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_cancelledType_Cur_activity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cur_activity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_cancelledType_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_cancelledType_Exec_mills(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "exec_mills",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (pi_completeTypeEClass, 
       source, 
       new String[] 
       {
       "name", "pi_complete_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getpi_completeType_Process_instance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "process_instance",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_completeType_Customer_name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customer_name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_completeType_Sibelcircuit_id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sibelcircuit_id",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_completeType_Projectmanager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectmanager",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_completeType_Cur_activity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cur_activity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_completeType_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_completeType_Exec_mills(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "exec_mills",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (pi_haltedTypeEClass, 
       source, 
       new String[] 
       {
       "name", "pi_halted_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getpi_haltedType_Process_instance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "process_instance",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_haltedType_Customer_name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customer_name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_haltedType_Sibelcircuit_id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sibelcircuit_id",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_haltedType_Projectmanager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectmanager",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_haltedType_Cur_activity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cur_activity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_haltedType_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_haltedType_Exec_mills(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "exec_mills",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (pi_startedTypeEClass, 
       source, 
       new String[] 
       {
       "name", "pi_started_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getpi_startedType_Process_instance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "process_instance",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_startedType_Customer_name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customer_name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_startedType_Sibelcircuit_id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sibelcircuit_id",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_startedType_Projectmanager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectmanager",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_startedType_Cur_activity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cur_activity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_startedType_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getpi_startedType_Exec_mills(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "exec_mills",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (reesourcecreationandmappingTypeEClass, 
       source, 
       new String[] 
       {
       "name", "reesourcecreationandmapping_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getreesourcecreationandmappingType_Createresource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "createresource",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getreesourcecreationandmappingType_Ldapentry(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ldapentry",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getreesourcecreationandmappingType_Parsecsv(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "parsecsv",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (reportgenerationTypeEClass, 
       source, 
       new String[] 
       {
       "name", "reportgeneration_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getreportgenerationType_Getprocessinstances(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "getprocessinstances",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getreportgenerationType_Searchprocessinstances(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstances",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (resourceTypeEClass, 
       source, 
       new String[] 
       {
       "name", "resource_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getresourceType_Guid(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "guid",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getresourceType_Label(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "label",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getresourceType_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (rootTypeEClass, 
       source, 
       new String[] 
       {
       "name", "root_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getrootType_Fetchresource(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fetchresource",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getrootType_Reportgeneration(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reportgeneration",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getrootType_Reesourcecreationandmapping(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "reesourcecreationandmapping",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getrootType_Workitemcompletion(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletion",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getrootType_Fault(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "fault",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (searchprocessinstancesinputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "searchprocessinstancesinput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getsearchprocessinstancesinputType_Searchkey(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchkey",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchprocessinstancesinputType_Searchvalue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchvalue",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (searchprocessinstancesoutputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "searchprocessinstancesoutput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getsearchprocessinstancesoutputType_Searchrecord(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchrecord",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (searchprocessinstancesTypeEClass, 
       source, 
       new String[] 
       {
       "name", "searchprocessinstances_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getsearchprocessinstancesType_Searchprocessinstancesinput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstancesinput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchprocessinstancesType_Searchprocessinstancesoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "searchprocessinstancesoutput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (searchrecordTypeEClass, 
       source, 
       new String[] 
       {
       "name", "searchrecord_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getsearchrecordType_Process_instance(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "process_instance",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchrecordType_Customer_name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "customer_name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchrecordType_Sibelcircuit_id(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sibelcircuit_id",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchrecordType_Projectmanager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectmanager",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchrecordType_Cur_activity(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "cur_activity",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchrecordType_Status(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "status",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getsearchrecordType_Exec_mills(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "exec_mills",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (usersTypeEClass, 
       source, 
       new String[] 
       {
       "name", "users_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getusersType_Name(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "name",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getusersType_Flag(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "flag",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getusersType_Entityvalue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "entityvalue",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getusersType_Orgmodelname(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "orgmodelname",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (workitemcompletioninputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "workitemcompletioninput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getworkitemcompletioninputType_Sibelcircuitid(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sibelcircuitid",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (workitemcompletionoutputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "workitemcompletionoutput_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getworkitemcompletionoutputType_Outputmessage(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "outputmessage",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (workitemcompletionTypeEClass, 
       source, 
       new String[] 
       {
       "name", "workitemcompletion_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getworkitemcompletionType_Workitemcompletioninput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletioninput",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getworkitemcompletionType_Workitemcompletionoutput(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "workitemcompletionoutput",
       "namespace", "##targetNamespace"
       });
  }

} //SchemaPackageImpl

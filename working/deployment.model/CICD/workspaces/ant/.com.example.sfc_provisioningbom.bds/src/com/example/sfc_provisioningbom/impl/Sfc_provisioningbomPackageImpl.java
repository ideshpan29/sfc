package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.AccountType;
import com.example.sfc_provisioningbom.Bandwidth;
import com.example.sfc_provisioningbom.CommentData;
import com.example.sfc_provisioningbom.ContractorGroups;
import com.example.sfc_provisioningbom.DocumentRoot;
import com.example.sfc_provisioningbom.EmailRecipient;
import com.example.sfc_provisioningbom.EnableDisable;
import com.example.sfc_provisioningbom.EquipmentDetails;
import com.example.sfc_provisioningbom.ProcessName;
import com.example.sfc_provisioningbom.ProvisioningDataModel;
import com.example.sfc_provisioningbom.SLA_Configuration;
import com.example.sfc_provisioningbom.ServiceStatus;
import com.example.sfc_provisioningbom.ServiceType;
import com.example.sfc_provisioningbom.Sfc_provisioningbomFactory;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;
import com.example.sfc_provisioningbom.SystemParameters;
import com.example.sfc_provisioningbom.TaskRecipient;
import com.example.sfc_provisioningbom.TechnologyList;
import com.example.sfc_provisioningbom.TehnicalInformation;

import com.example.sfc_provisioningbom.bdsutil.BDSActivator;

import com.example.sfc_provisioningbom.util.Sfc_provisioningbomValidator;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sfc_provisioningbomPackageImpl extends EPackageImpl implements Sfc_provisioningbomPackage
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
  private EClass commentDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contractorGroupsEClass = null;

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
  private EClass equipmentDetailsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass provisioningDataModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass slA_ConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tehnicalInformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum accountTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum bandwidthEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum emailRecipientEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enableDisableEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum processNameEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum serviceStatusEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum serviceTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum taskRecipientEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum technologyListEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accountManager_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accountTypeElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType accountTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType addedby_CommentDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType address_EquipmentDetailsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType aggPoint_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType bandwidthElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType bandwidthObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType buildingID_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType buildingName_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType carrierIP_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType carrierVLAN_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType clientID_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType clientIP_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType clientName_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType clientVLAN_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType comments_CommentDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType contactPerson_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType contractorGroupName_ContractorGroupsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType contractor_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType emailConfig_SLA_ConfigurationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType emailID_ContractorGroupsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType emailRecipientElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType emailRecipientObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType email_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType enableDisableElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType enableDisableObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType firstName_ContractorGroupsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType floor_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType gpsCoordinates_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType lastName_ContractorGroupsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType location_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType loginName_ContractorGroupsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType masterUser_ContractorGroupsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType mobile_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType modifiedBy_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType notesComments_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType port_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType portType_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType processNameElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType processNameObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType processName_SLA_ConfigurationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType projectManager_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType propertyName_SystemParametersTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType propertyValue_SystemParametersTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType regionView_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType sector_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType serviceStatusElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType serviceStatusObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType serviceStatus_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType serviceTypeElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType serviceTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType sfcpoppE_TehnicalInformationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType siebelCircuitID_ProvisioningDataModelTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType slA_Deadline_SLA_ConfigurationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType slaLevel_SLA_ConfigurationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType stepName_CommentDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType taskConfig_SLA_ConfigurationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType taskName_SLA_ConfigurationTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType taskRecipientElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType taskRecipientObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType technologyListElementTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType technologyListObjectEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType time_CommentDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType type_EquipmentDetailsTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType vlaN_EquipmentDetailsTypeEDataType = null;

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
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Sfc_provisioningbomPackageImpl()
  {
    super(eNS_URI, Sfc_provisioningbomFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link Sfc_provisioningbomPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Sfc_provisioningbomPackage init()
  {
    if (isInited) return (Sfc_provisioningbomPackage)EPackage.Registry.INSTANCE.getEPackage(Sfc_provisioningbomPackage.eNS_URI);

    // Obtain or create and register package
    Sfc_provisioningbomPackageImpl theSfc_provisioningbomPackage = (Sfc_provisioningbomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Sfc_provisioningbomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Sfc_provisioningbomPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSfc_provisioningbomPackage.createPackageContents();

    // Initialize created meta-data
    theSfc_provisioningbomPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theSfc_provisioningbomPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return Sfc_provisioningbomValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theSfc_provisioningbomPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Sfc_provisioningbomPackage.eNS_URI, theSfc_provisioningbomPackage);
    return theSfc_provisioningbomPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommentData()
  {
    return commentDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommentData_Addedby()
  {
    return (EAttribute)commentDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommentData_Comments()
  {
    return (EAttribute)commentDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommentData_StepName()
  {
    return (EAttribute)commentDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommentData_Time()
  {
    return (EAttribute)commentDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContractorGroups()
  {
    return contractorGroupsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_LoginName()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_FirstName()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_LastName()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_ContractorGroupName()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_MasterUser()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_EmailID()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_BdsId()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractorGroups_BdsVersion()
  {
    return (EAttribute)contractorGroupsEClass.getEStructuralFeatures().get(7);
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
  public EAttribute getDocumentRoot_AccountTypeElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_BandwidthElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CommentDataElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ContractorGroupsElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_EmailRecipientElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_EnableDisableElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EquipmentDetailsElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_ProcessNameElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ProvisioningDataModelElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_ServiceStatusElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_ServiceTypeElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SLAConfigurationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SystemParametersElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_TaskRecipientElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_TechnologyListElement()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_TehnicalInformationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CommentDataBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ContractorGroupsBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_EquipmentDetailsBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_ProvisioningDataModelBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SLA_ConfigurationBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SystemParametersBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_TehnicalInformationBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquipmentDetails()
  {
    return equipmentDetailsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquipmentDetails_Type()
  {
    return (EAttribute)equipmentDetailsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquipmentDetails_Address()
  {
    return (EAttribute)equipmentDetailsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEquipmentDetails_VLAN()
  {
    return (EAttribute)equipmentDetailsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvisioningDataModel()
  {
    return provisioningDataModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_SiebelCircuitID()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ProjectManager()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ClientName()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_AccountManager()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Account()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Contractor()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Location()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_RegionView()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Floor()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ClientID()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ServiceType()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_GPSCoordinates()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Bandwidthupdown()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Technology()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ServiceStatus()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_BuildingName()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_BuildingID()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ContactPerson()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Mobile()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Sector()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_Email()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ServiceStart()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_ServiceEnd()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_RequestDate()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_InstallDate()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProvisioningDataModel_NotesComments()
  {
    return (EAttribute)provisioningDataModelEClass.getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSLA_Configuration()
  {
    return slA_ConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_SLALevel()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_TaskName()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_ProcessName()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_SLA_Deadline()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_EmailTo()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_TaskTo()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_EmailConfig()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_TaskConfig()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_EnableDisableFlag()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_BdsId()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSLA_Configuration_BdsVersion()
  {
    return (EAttribute)slA_ConfigurationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemParameters()
  {
    return systemParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemParameters_PropertyName()
  {
    return (EAttribute)systemParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemParameters_PropertyValue()
  {
    return (EAttribute)systemParametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemParameters_BdsId()
  {
    return (EAttribute)systemParametersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemParameters_BdsVersion()
  {
    return (EAttribute)systemParametersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTehnicalInformation()
  {
    return tehnicalInformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_CarrierVLAN()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_CarrierIP()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_AggPoint()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_Port()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_ClientVLAN()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_ClientIP()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_SFCPOPPE()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_PortType()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTehnicalInformation_Equipment()
  {
    return (EReference)tehnicalInformationEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_ModifiedBy()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTehnicalInformation_ModifiedDate()
  {
    return (EAttribute)tehnicalInformationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAccountType()
  {
    return accountTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBandwidth()
  {
    return bandwidthEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEmailRecipient()
  {
    return emailRecipientEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnableDisable()
  {
    return enableDisableEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getProcessName()
  {
    return processNameEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getServiceStatus()
  {
    return serviceStatusEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getServiceType()
  {
    return serviceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTaskRecipient()
  {
    return taskRecipientEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTechnologyList()
  {
    return technologyListEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getaccountManager_ProvisioningDataModelType()
  {
    return accountManager_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getaccountTypeElementType()
  {
    return accountTypeElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAccountTypeObject()
  {
    return accountTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getaddedby_CommentDataType()
  {
    return addedby_CommentDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getaddress_EquipmentDetailsType()
  {
    return address_EquipmentDetailsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getaggPoint_TehnicalInformationType()
  {
    return aggPoint_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getbandwidthElementType()
  {
    return bandwidthElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBandwidthObject()
  {
    return bandwidthObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getbuildingID_ProvisioningDataModelType()
  {
    return buildingID_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getbuildingName_ProvisioningDataModelType()
  {
    return buildingName_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcarrierIP_TehnicalInformationType()
  {
    return carrierIP_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcarrierVLAN_TehnicalInformationType()
  {
    return carrierVLAN_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getclientID_ProvisioningDataModelType()
  {
    return clientID_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getclientIP_TehnicalInformationType()
  {
    return clientIP_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getclientName_ProvisioningDataModelType()
  {
    return clientName_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getclientVLAN_TehnicalInformationType()
  {
    return clientVLAN_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcomments_CommentDataType()
  {
    return comments_CommentDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcontactPerson_ProvisioningDataModelType()
  {
    return contactPerson_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcontractorGroupName_ContractorGroupsType()
  {
    return contractorGroupName_ContractorGroupsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getcontractor_ProvisioningDataModelType()
  {
    return contractor_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getemailConfig_SLA_ConfigurationType()
  {
    return emailConfig_SLA_ConfigurationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getemailID_ContractorGroupsType()
  {
    return emailID_ContractorGroupsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getemailRecipientElementType()
  {
    return emailRecipientElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEmailRecipientObject()
  {
    return emailRecipientObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getemail_ProvisioningDataModelType()
  {
    return email_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getenableDisableElementType()
  {
    return enableDisableElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEnableDisableObject()
  {
    return enableDisableObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getfirstName_ContractorGroupsType()
  {
    return firstName_ContractorGroupsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getfloor_ProvisioningDataModelType()
  {
    return floor_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getGPSCoordinates_ProvisioningDataModelType()
  {
    return gpsCoordinates_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getlastName_ContractorGroupsType()
  {
    return lastName_ContractorGroupsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getlocation_ProvisioningDataModelType()
  {
    return location_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getloginName_ContractorGroupsType()
  {
    return loginName_ContractorGroupsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getmasterUser_ContractorGroupsType()
  {
    return masterUser_ContractorGroupsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getmobile_ProvisioningDataModelType()
  {
    return mobile_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getmodifiedBy_TehnicalInformationType()
  {
    return modifiedBy_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getnotesComments_ProvisioningDataModelType()
  {
    return notesComments_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getport_TehnicalInformationType()
  {
    return port_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getportType_TehnicalInformationType()
  {
    return portType_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprocessNameElementType()
  {
    return processNameElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getProcessNameObject()
  {
    return processNameObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprocessName_SLA_ConfigurationType()
  {
    return processName_SLA_ConfigurationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getprojectManager_ProvisioningDataModelType()
  {
    return projectManager_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getpropertyName_SystemParametersType()
  {
    return propertyName_SystemParametersTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getpropertyValue_SystemParametersType()
  {
    return propertyValue_SystemParametersTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getregionView_ProvisioningDataModelType()
  {
    return regionView_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getsector_ProvisioningDataModelType()
  {
    return sector_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getserviceStatusElementType()
  {
    return serviceStatusElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getServiceStatusObject()
  {
    return serviceStatusObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getserviceStatus_ProvisioningDataModelType()
  {
    return serviceStatus_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getserviceTypeElementType()
  {
    return serviceTypeElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getServiceTypeObject()
  {
    return serviceTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSFCPOPPE_TehnicalInformationType()
  {
    return sfcpoppE_TehnicalInformationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getsiebelCircuitID_ProvisioningDataModelType()
  {
    return siebelCircuitID_ProvisioningDataModelTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSLA_Deadline_SLA_ConfigurationType()
  {
    return slA_Deadline_SLA_ConfigurationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getSLALevel_SLA_ConfigurationType()
  {
    return slaLevel_SLA_ConfigurationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getstepName_CommentDataType()
  {
    return stepName_CommentDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettaskConfig_SLA_ConfigurationType()
  {
    return taskConfig_SLA_ConfigurationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettaskName_SLA_ConfigurationType()
  {
    return taskName_SLA_ConfigurationTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettaskRecipientElementType()
  {
    return taskRecipientElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTaskRecipientObject()
  {
    return taskRecipientObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettechnologyListElementType()
  {
    return technologyListElementTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getTechnologyListObject()
  {
    return technologyListObjectEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettime_CommentDataType()
  {
    return time_CommentDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType gettype_EquipmentDetailsType()
  {
    return type_EquipmentDetailsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVLAN_EquipmentDetailsType()
  {
    return vlaN_EquipmentDetailsTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sfc_provisioningbomFactory getSfc_provisioningbomFactory()
  {
    return (Sfc_provisioningbomFactory)getEFactoryInstance();
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
    commentDataEClass = createEClass(COMMENT_DATA);
    createEAttribute(commentDataEClass, COMMENT_DATA__ADDEDBY);
    createEAttribute(commentDataEClass, COMMENT_DATA__COMMENTS);
    createEAttribute(commentDataEClass, COMMENT_DATA__STEP_NAME);
    createEAttribute(commentDataEClass, COMMENT_DATA__TIME);

    contractorGroupsEClass = createEClass(CONTRACTOR_GROUPS);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__LOGIN_NAME);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__FIRST_NAME);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__LAST_NAME);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__MASTER_USER);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__EMAIL_ID);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__BDS_ID);
    createEAttribute(contractorGroupsEClass, CONTRACTOR_GROUPS__BDS_VERSION);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__ACCOUNT_TYPE_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__BANDWIDTH_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COMMENT_DATA_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CONTRACTOR_GROUPS_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__EMAIL_RECIPIENT_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__ENABLE_DISABLE_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EQUIPMENT_DETAILS_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__PROCESS_NAME_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_STATUS_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__SERVICE_TYPE_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SLA_CONFIGURATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM_PARAMETERS_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__TASK_RECIPIENT_ELEMENT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__TECHNOLOGY_LIST_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TEHNICAL_INFORMATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__COMMENT_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CONTRACTOR_GROUPS_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__EQUIPMENT_DETAILS_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__PROVISIONING_DATA_MODEL_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SLA_CONFIGURATION_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM_PARAMETERS_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__TEHNICAL_INFORMATION_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    equipmentDetailsEClass = createEClass(EQUIPMENT_DETAILS);
    createEAttribute(equipmentDetailsEClass, EQUIPMENT_DETAILS__TYPE);
    createEAttribute(equipmentDetailsEClass, EQUIPMENT_DETAILS__ADDRESS);
    createEAttribute(equipmentDetailsEClass, EQUIPMENT_DETAILS__VLAN);

    provisioningDataModelEClass = createEClass(PROVISIONING_DATA_MODEL);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__PROJECT_MANAGER);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__CLIENT_NAME);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__ACCOUNT);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__CONTRACTOR);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__LOCATION);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__REGION_VIEW);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__FLOOR);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__CLIENT_ID);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__SERVICE_TYPE);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__GPS_COORDINATES);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__TECHNOLOGY);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__SERVICE_STATUS);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__BUILDING_NAME);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__BUILDING_ID);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__CONTACT_PERSON);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__MOBILE);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__SECTOR);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__EMAIL);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__SERVICE_START);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__SERVICE_END);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__REQUEST_DATE);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__INSTALL_DATE);
    createEAttribute(provisioningDataModelEClass, PROVISIONING_DATA_MODEL__NOTES_COMMENTS);

    slA_ConfigurationEClass = createEClass(SLA_CONFIGURATION);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__SLA_LEVEL);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__TASK_NAME);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__PROCESS_NAME);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__SLA_DEADLINE);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__EMAIL_TO);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__TASK_TO);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__EMAIL_CONFIG);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__TASK_CONFIG);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__ENABLE_DISABLE_FLAG);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__BDS_ID);
    createEAttribute(slA_ConfigurationEClass, SLA_CONFIGURATION__BDS_VERSION);

    systemParametersEClass = createEClass(SYSTEM_PARAMETERS);
    createEAttribute(systemParametersEClass, SYSTEM_PARAMETERS__PROPERTY_NAME);
    createEAttribute(systemParametersEClass, SYSTEM_PARAMETERS__PROPERTY_VALUE);
    createEAttribute(systemParametersEClass, SYSTEM_PARAMETERS__BDS_ID);
    createEAttribute(systemParametersEClass, SYSTEM_PARAMETERS__BDS_VERSION);

    tehnicalInformationEClass = createEClass(TEHNICAL_INFORMATION);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__CARRIER_VLAN);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__CARRIER_IP);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__AGG_POINT);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__PORT);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__CLIENT_VLAN);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__CLIENT_IP);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__SFCPOPPE);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__PORT_TYPE);
    createEReference(tehnicalInformationEClass, TEHNICAL_INFORMATION__EQUIPMENT);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__MODIFIED_BY);
    createEAttribute(tehnicalInformationEClass, TEHNICAL_INFORMATION__MODIFIED_DATE);

    // Create enums
    accountTypeEEnum = createEEnum(ACCOUNT_TYPE);
    bandwidthEEnum = createEEnum(BANDWIDTH);
    emailRecipientEEnum = createEEnum(EMAIL_RECIPIENT);
    enableDisableEEnum = createEEnum(ENABLE_DISABLE);
    processNameEEnum = createEEnum(PROCESS_NAME);
    serviceStatusEEnum = createEEnum(SERVICE_STATUS);
    serviceTypeEEnum = createEEnum(SERVICE_TYPE);
    taskRecipientEEnum = createEEnum(TASK_RECIPIENT);
    technologyListEEnum = createEEnum(TECHNOLOGY_LIST);

    // Create data types
    accountManager_ProvisioningDataModelTypeEDataType = createEDataType(ACCOUNT_MANAGER_PROVISIONING_DATA_MODEL_TYPE);
    accountTypeElementTypeEDataType = createEDataType(ACCOUNT_TYPE_ELEMENT_TYPE);
    accountTypeObjectEDataType = createEDataType(ACCOUNT_TYPE_OBJECT);
    addedby_CommentDataTypeEDataType = createEDataType(ADDEDBY_COMMENT_DATA_TYPE);
    address_EquipmentDetailsTypeEDataType = createEDataType(ADDRESS_EQUIPMENT_DETAILS_TYPE);
    aggPoint_TehnicalInformationTypeEDataType = createEDataType(AGG_POINT_TEHNICAL_INFORMATION_TYPE);
    bandwidthElementTypeEDataType = createEDataType(BANDWIDTH_ELEMENT_TYPE);
    bandwidthObjectEDataType = createEDataType(BANDWIDTH_OBJECT);
    buildingID_ProvisioningDataModelTypeEDataType = createEDataType(BUILDING_ID_PROVISIONING_DATA_MODEL_TYPE);
    buildingName_ProvisioningDataModelTypeEDataType = createEDataType(BUILDING_NAME_PROVISIONING_DATA_MODEL_TYPE);
    carrierIP_TehnicalInformationTypeEDataType = createEDataType(CARRIER_IP_TEHNICAL_INFORMATION_TYPE);
    carrierVLAN_TehnicalInformationTypeEDataType = createEDataType(CARRIER_VLAN_TEHNICAL_INFORMATION_TYPE);
    clientID_ProvisioningDataModelTypeEDataType = createEDataType(CLIENT_ID_PROVISIONING_DATA_MODEL_TYPE);
    clientIP_TehnicalInformationTypeEDataType = createEDataType(CLIENT_IP_TEHNICAL_INFORMATION_TYPE);
    clientName_ProvisioningDataModelTypeEDataType = createEDataType(CLIENT_NAME_PROVISIONING_DATA_MODEL_TYPE);
    clientVLAN_TehnicalInformationTypeEDataType = createEDataType(CLIENT_VLAN_TEHNICAL_INFORMATION_TYPE);
    comments_CommentDataTypeEDataType = createEDataType(COMMENTS_COMMENT_DATA_TYPE);
    contactPerson_ProvisioningDataModelTypeEDataType = createEDataType(CONTACT_PERSON_PROVISIONING_DATA_MODEL_TYPE);
    contractorGroupName_ContractorGroupsTypeEDataType = createEDataType(CONTRACTOR_GROUP_NAME_CONTRACTOR_GROUPS_TYPE);
    contractor_ProvisioningDataModelTypeEDataType = createEDataType(CONTRACTOR_PROVISIONING_DATA_MODEL_TYPE);
    emailConfig_SLA_ConfigurationTypeEDataType = createEDataType(EMAIL_CONFIG_SLA_CONFIGURATION_TYPE);
    emailID_ContractorGroupsTypeEDataType = createEDataType(EMAIL_ID_CONTRACTOR_GROUPS_TYPE);
    emailRecipientElementTypeEDataType = createEDataType(EMAIL_RECIPIENT_ELEMENT_TYPE);
    emailRecipientObjectEDataType = createEDataType(EMAIL_RECIPIENT_OBJECT);
    email_ProvisioningDataModelTypeEDataType = createEDataType(EMAIL_PROVISIONING_DATA_MODEL_TYPE);
    enableDisableElementTypeEDataType = createEDataType(ENABLE_DISABLE_ELEMENT_TYPE);
    enableDisableObjectEDataType = createEDataType(ENABLE_DISABLE_OBJECT);
    firstName_ContractorGroupsTypeEDataType = createEDataType(FIRST_NAME_CONTRACTOR_GROUPS_TYPE);
    floor_ProvisioningDataModelTypeEDataType = createEDataType(FLOOR_PROVISIONING_DATA_MODEL_TYPE);
    gpsCoordinates_ProvisioningDataModelTypeEDataType = createEDataType(GPS_COORDINATES_PROVISIONING_DATA_MODEL_TYPE);
    lastName_ContractorGroupsTypeEDataType = createEDataType(LAST_NAME_CONTRACTOR_GROUPS_TYPE);
    location_ProvisioningDataModelTypeEDataType = createEDataType(LOCATION_PROVISIONING_DATA_MODEL_TYPE);
    loginName_ContractorGroupsTypeEDataType = createEDataType(LOGIN_NAME_CONTRACTOR_GROUPS_TYPE);
    masterUser_ContractorGroupsTypeEDataType = createEDataType(MASTER_USER_CONTRACTOR_GROUPS_TYPE);
    mobile_ProvisioningDataModelTypeEDataType = createEDataType(MOBILE_PROVISIONING_DATA_MODEL_TYPE);
    modifiedBy_TehnicalInformationTypeEDataType = createEDataType(MODIFIED_BY_TEHNICAL_INFORMATION_TYPE);
    notesComments_ProvisioningDataModelTypeEDataType = createEDataType(NOTES_COMMENTS_PROVISIONING_DATA_MODEL_TYPE);
    port_TehnicalInformationTypeEDataType = createEDataType(PORT_TEHNICAL_INFORMATION_TYPE);
    portType_TehnicalInformationTypeEDataType = createEDataType(PORT_TYPE_TEHNICAL_INFORMATION_TYPE);
    processNameElementTypeEDataType = createEDataType(PROCESS_NAME_ELEMENT_TYPE);
    processNameObjectEDataType = createEDataType(PROCESS_NAME_OBJECT);
    processName_SLA_ConfigurationTypeEDataType = createEDataType(PROCESS_NAME_SLA_CONFIGURATION_TYPE);
    projectManager_ProvisioningDataModelTypeEDataType = createEDataType(PROJECT_MANAGER_PROVISIONING_DATA_MODEL_TYPE);
    propertyName_SystemParametersTypeEDataType = createEDataType(PROPERTY_NAME_SYSTEM_PARAMETERS_TYPE);
    propertyValue_SystemParametersTypeEDataType = createEDataType(PROPERTY_VALUE_SYSTEM_PARAMETERS_TYPE);
    regionView_ProvisioningDataModelTypeEDataType = createEDataType(REGION_VIEW_PROVISIONING_DATA_MODEL_TYPE);
    sector_ProvisioningDataModelTypeEDataType = createEDataType(SECTOR_PROVISIONING_DATA_MODEL_TYPE);
    serviceStatusElementTypeEDataType = createEDataType(SERVICE_STATUS_ELEMENT_TYPE);
    serviceStatusObjectEDataType = createEDataType(SERVICE_STATUS_OBJECT);
    serviceStatus_ProvisioningDataModelTypeEDataType = createEDataType(SERVICE_STATUS_PROVISIONING_DATA_MODEL_TYPE);
    serviceTypeElementTypeEDataType = createEDataType(SERVICE_TYPE_ELEMENT_TYPE);
    serviceTypeObjectEDataType = createEDataType(SERVICE_TYPE_OBJECT);
    sfcpoppE_TehnicalInformationTypeEDataType = createEDataType(SFCPOPPE_TEHNICAL_INFORMATION_TYPE);
    siebelCircuitID_ProvisioningDataModelTypeEDataType = createEDataType(SIEBEL_CIRCUIT_ID_PROVISIONING_DATA_MODEL_TYPE);
    slA_Deadline_SLA_ConfigurationTypeEDataType = createEDataType(SLA_DEADLINE_SLA_CONFIGURATION_TYPE);
    slaLevel_SLA_ConfigurationTypeEDataType = createEDataType(SLA_LEVEL_SLA_CONFIGURATION_TYPE);
    stepName_CommentDataTypeEDataType = createEDataType(STEP_NAME_COMMENT_DATA_TYPE);
    taskConfig_SLA_ConfigurationTypeEDataType = createEDataType(TASK_CONFIG_SLA_CONFIGURATION_TYPE);
    taskName_SLA_ConfigurationTypeEDataType = createEDataType(TASK_NAME_SLA_CONFIGURATION_TYPE);
    taskRecipientElementTypeEDataType = createEDataType(TASK_RECIPIENT_ELEMENT_TYPE);
    taskRecipientObjectEDataType = createEDataType(TASK_RECIPIENT_OBJECT);
    technologyListElementTypeEDataType = createEDataType(TECHNOLOGY_LIST_ELEMENT_TYPE);
    technologyListObjectEDataType = createEDataType(TECHNOLOGY_LIST_OBJECT);
    time_CommentDataTypeEDataType = createEDataType(TIME_COMMENT_DATA_TYPE);
    type_EquipmentDetailsTypeEDataType = createEDataType(TYPE_EQUIPMENT_DETAILS_TYPE);
    vlaN_EquipmentDetailsTypeEDataType = createEDataType(VLAN_EQUIPMENT_DETAILS_TYPE);
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
    initEClass(commentDataEClass, CommentData.class, "CommentData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommentData_Addedby(), this.getaddedby_CommentDataType(), "addedby", null, 0, 1, CommentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommentData_Comments(), this.getcomments_CommentDataType(), "comments", null, 0, 1, CommentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommentData_StepName(), this.getstepName_CommentDataType(), "stepName", null, 0, 1, CommentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommentData_Time(), this.gettime_CommentDataType(), "time", null, 0, 1, CommentData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contractorGroupsEClass, ContractorGroups.class, "ContractorGroups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContractorGroups_LoginName(), this.getloginName_ContractorGroupsType(), "loginName", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_FirstName(), this.getfirstName_ContractorGroupsType(), "firstName", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_LastName(), this.getlastName_ContractorGroupsType(), "lastName", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_ContractorGroupName(), this.getcontractorGroupName_ContractorGroupsType(), "contractorGroupName", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_MasterUser(), this.getmasterUser_ContractorGroupsType(), "masterUser", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_EmailID(), this.getemailID_ContractorGroupsType(), "emailID", null, 1, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_BdsId(), ecorePackage.getELongObject(), "bdsId", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractorGroups_BdsVersion(), ecorePackage.getELongObject(), "bdsVersion", null, 0, 1, ContractorGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_AccountTypeElement(), this.getaccountTypeElementType(), "accountTypeElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_BandwidthElement(), this.getbandwidthElementType(), "bandwidthElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CommentDataElement(), this.getCommentData(), null, "commentDataElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ContractorGroupsElement(), this.getContractorGroups(), null, "contractorGroupsElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_EmailRecipientElement(), this.getemailRecipientElementType(), "emailRecipientElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_EnableDisableElement(), this.getenableDisableElementType(), "enableDisableElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_EquipmentDetailsElement(), this.getEquipmentDetails(), null, "equipmentDetailsElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_ProcessNameElement(), this.getprocessNameElementType(), "processNameElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ProvisioningDataModelElement(), this.getProvisioningDataModel(), null, "provisioningDataModelElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_ServiceStatusElement(), this.getserviceStatusElementType(), "serviceStatusElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_ServiceTypeElement(), this.getserviceTypeElementType(), "serviceTypeElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SLAConfigurationElement(), this.getSLA_Configuration(), null, "sLAConfigurationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SystemParametersElement(), this.getSystemParameters(), null, "systemParametersElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_TaskRecipientElement(), this.gettaskRecipientElementType(), "taskRecipientElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocumentRoot_TechnologyListElement(), this.gettechnologyListElementType(), "technologyListElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_TehnicalInformationElement(), this.getTehnicalInformation(), null, "tehnicalInformationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CommentDataBDSInternalSerializationElement(), this.getCommentData(), null, "commentDataBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ContractorGroupsBDSInternalSerializationElement(), this.getContractorGroups(), null, "contractorGroupsBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_EquipmentDetailsBDSInternalSerializationElement(), this.getEquipmentDetails(), null, "equipmentDetailsBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_ProvisioningDataModelBDSInternalSerializationElement(), this.getProvisioningDataModel(), null, "provisioningDataModelBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SLA_ConfigurationBDSInternalSerializationElement(), this.getSLA_Configuration(), null, "sLA_ConfigurationBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SystemParametersBDSInternalSerializationElement(), this.getSystemParameters(), null, "systemParametersBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_TehnicalInformationBDSInternalSerializationElement(), this.getTehnicalInformation(), null, "tehnicalInformationBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(equipmentDetailsEClass, EquipmentDetails.class, "EquipmentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEquipmentDetails_Type(), this.gettype_EquipmentDetailsType(), "type", null, 0, 1, EquipmentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquipmentDetails_Address(), this.getaddress_EquipmentDetailsType(), "address", null, 0, 1, EquipmentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEquipmentDetails_VLAN(), this.getVLAN_EquipmentDetailsType(), "VLAN", null, 0, 1, EquipmentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(provisioningDataModelEClass, ProvisioningDataModel.class, "ProvisioningDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProvisioningDataModel_SiebelCircuitID(), this.getsiebelCircuitID_ProvisioningDataModelType(), "siebelCircuitID", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ProjectManager(), this.getprojectManager_ProvisioningDataModelType(), "projectManager", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ClientName(), this.getclientName_ProvisioningDataModelType(), "clientName", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_AccountManager(), this.getaccountManager_ProvisioningDataModelType(), "accountManager", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Account(), this.getAccountTypeObject(), "account", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Contractor(), this.getcontractor_ProvisioningDataModelType(), "contractor", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Location(), this.getlocation_ProvisioningDataModelType(), "location", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_RegionView(), this.getregionView_ProvisioningDataModelType(), "regionView", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Floor(), this.getfloor_ProvisioningDataModelType(), "floor", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ClientID(), this.getclientID_ProvisioningDataModelType(), "clientID", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ServiceType(), this.getServiceTypeObject(), "serviceType", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_GPSCoordinates(), this.getGPSCoordinates_ProvisioningDataModelType(), "GPSCoordinates", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Bandwidthupdown(), this.getBandwidthObject(), "bandwidthupdown", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Technology(), this.getTechnologyListObject(), "technology", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ServiceStatus(), this.getserviceStatus_ProvisioningDataModelType(), "serviceStatus", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_BuildingName(), this.getbuildingName_ProvisioningDataModelType(), "buildingName", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_BuildingID(), this.getbuildingID_ProvisioningDataModelType(), "buildingID", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ContactPerson(), this.getcontactPerson_ProvisioningDataModelType(), "contactPerson", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Mobile(), this.getmobile_ProvisioningDataModelType(), "mobile", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Sector(), this.getsector_ProvisioningDataModelType(), "sector", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_Email(), this.getemail_ProvisioningDataModelType(), "email", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ServiceStart(), theXMLTypePackage.getDateTime(), "serviceStart", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_ServiceEnd(), theXMLTypePackage.getDateTime(), "serviceEnd", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_RequestDate(), theXMLTypePackage.getDateTime(), "requestDate", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_InstallDate(), theXMLTypePackage.getDateTime(), "installDate", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProvisioningDataModel_NotesComments(), this.getnotesComments_ProvisioningDataModelType(), "notesComments", null, 0, 1, ProvisioningDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(slA_ConfigurationEClass, SLA_Configuration.class, "SLA_Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSLA_Configuration_SLALevel(), this.getSLALevel_SLA_ConfigurationType(), "SLALevel", null, 1, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_TaskName(), this.gettaskName_SLA_ConfigurationType(), "taskName", null, 1, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_ProcessName(), this.getprocessName_SLA_ConfigurationType(), "processName", null, 1, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_SLA_Deadline(), this.getSLA_Deadline_SLA_ConfigurationType(), "SLA_Deadline", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_EmailTo(), this.getEmailRecipientObject(), "emailTo", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_TaskTo(), this.getTaskRecipientObject(), "taskTo", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_EmailConfig(), this.getemailConfig_SLA_ConfigurationType(), "emailConfig", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_TaskConfig(), this.gettaskConfig_SLA_ConfigurationType(), "taskConfig", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_EnableDisableFlag(), this.getEnableDisableObject(), "enableDisableFlag", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_BdsId(), ecorePackage.getELongObject(), "bdsId", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSLA_Configuration_BdsVersion(), ecorePackage.getELongObject(), "bdsVersion", null, 0, 1, SLA_Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemParametersEClass, SystemParameters.class, "SystemParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemParameters_PropertyName(), this.getpropertyName_SystemParametersType(), "propertyName", null, 1, 1, SystemParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemParameters_PropertyValue(), this.getpropertyValue_SystemParametersType(), "propertyValue", null, 0, 1, SystemParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemParameters_BdsId(), ecorePackage.getELongObject(), "bdsId", null, 0, 1, SystemParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSystemParameters_BdsVersion(), ecorePackage.getELongObject(), "bdsVersion", null, 0, 1, SystemParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tehnicalInformationEClass, TehnicalInformation.class, "TehnicalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTehnicalInformation_CarrierVLAN(), this.getcarrierVLAN_TehnicalInformationType(), "carrierVLAN", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_CarrierIP(), this.getcarrierIP_TehnicalInformationType(), "carrierIP", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_AggPoint(), this.getaggPoint_TehnicalInformationType(), "aggPoint", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_Port(), this.getport_TehnicalInformationType(), "port", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_ClientVLAN(), this.getclientVLAN_TehnicalInformationType(), "clientVLAN", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_ClientIP(), this.getclientIP_TehnicalInformationType(), "clientIP", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_SFCPOPPE(), this.getSFCPOPPE_TehnicalInformationType(), "SFCPOPPE", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_PortType(), this.getportType_TehnicalInformationType(), "portType", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTehnicalInformation_Equipment(), this.getEquipmentDetails(), null, "equipment", null, 1, -1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_ModifiedBy(), this.getmodifiedBy_TehnicalInformationType(), "modifiedBy", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTehnicalInformation_ModifiedDate(), theXMLTypePackage.getDate(), "modifiedDate", null, 0, 1, TehnicalInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(accountTypeEEnum, AccountType.class, "AccountType");
    addEEnumLiteral(accountTypeEEnum, AccountType.NEW);
    addEEnumLiteral(accountTypeEEnum, AccountType.MIGRATION);

    initEEnum(bandwidthEEnum, Bandwidth.class, "Bandwidth");
    addEEnumLiteral(bandwidthEEnum, Bandwidth.FFB5);

    initEEnum(emailRecipientEEnum, EmailRecipient.class, "EmailRecipient");
    addEEnumLiteral(emailRecipientEEnum, EmailRecipient.NONE);
    addEEnumLiteral(emailRecipientEEnum, EmailRecipient.SPECIFIC);
    addEEnumLiteral(emailRecipientEEnum, EmailRecipient.PM);

    initEEnum(enableDisableEEnum, EnableDisable.class, "EnableDisable");
    addEEnumLiteral(enableDisableEEnum, EnableDisable.ENABLE);
    addEEnumLiteral(enableDisableEEnum, EnableDisable.DISABLE);

    initEEnum(processNameEEnum, ProcessName.class, "ProcessName");
    addEEnumLiteral(processNameEEnum, ProcessName.PROVISIONING);
    addEEnumLiteral(processNameEEnum, ProcessName.DECOMISSIONING);

    initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
    addEEnumLiteral(serviceStatusEEnum, ServiceStatus.REGISTERED);
    addEEnumLiteral(serviceStatusEEnum, ServiceStatus.VERIFIED);
    addEEnumLiteral(serviceStatusEEnum, ServiceStatus.APPROVED);
    addEEnumLiteral(serviceStatusEEnum, ServiceStatus.COMPLETED);

    initEEnum(serviceTypeEEnum, ServiceType.class, "ServiceType");
    addEEnumLiteral(serviceTypeEEnum, ServiceType.INTERNET);
    addEEnumLiteral(serviceTypeEEnum, ServiceType.FIBER);
    addEEnumLiteral(serviceTypeEEnum, ServiceType.WIMAX);

    initEEnum(taskRecipientEEnum, TaskRecipient.class, "TaskRecipient");
    addEEnumLiteral(taskRecipientEEnum, TaskRecipient.NONE);
    addEEnumLiteral(taskRecipientEEnum, TaskRecipient.SPECIFIC);
    addEEnumLiteral(taskRecipientEEnum, TaskRecipient.PM);

    initEEnum(technologyListEEnum, TechnologyList.class, "TechnologyList");
    addEEnumLiteral(technologyListEEnum, TechnologyList.FIBER);

    // Initialize data types
    initEDataType(accountManager_ProvisioningDataModelTypeEDataType, String.class, "accountManager_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(accountTypeElementTypeEDataType, AccountType.class, "accountTypeElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(accountTypeObjectEDataType, AccountType.class, "AccountTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(addedby_CommentDataTypeEDataType, String.class, "addedby_CommentDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(address_EquipmentDetailsTypeEDataType, String.class, "address_EquipmentDetailsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(aggPoint_TehnicalInformationTypeEDataType, String.class, "aggPoint_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(bandwidthElementTypeEDataType, Bandwidth.class, "bandwidthElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(bandwidthObjectEDataType, Bandwidth.class, "BandwidthObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(buildingID_ProvisioningDataModelTypeEDataType, String.class, "buildingID_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(buildingName_ProvisioningDataModelTypeEDataType, String.class, "buildingName_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(carrierIP_TehnicalInformationTypeEDataType, String.class, "carrierIP_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(carrierVLAN_TehnicalInformationTypeEDataType, String.class, "carrierVLAN_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(clientID_ProvisioningDataModelTypeEDataType, String.class, "clientID_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(clientIP_TehnicalInformationTypeEDataType, String.class, "clientIP_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(clientName_ProvisioningDataModelTypeEDataType, String.class, "clientName_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(clientVLAN_TehnicalInformationTypeEDataType, String.class, "clientVLAN_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(comments_CommentDataTypeEDataType, String.class, "comments_CommentDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(contactPerson_ProvisioningDataModelTypeEDataType, String.class, "contactPerson_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(contractorGroupName_ContractorGroupsTypeEDataType, String.class, "contractorGroupName_ContractorGroupsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(contractor_ProvisioningDataModelTypeEDataType, String.class, "contractor_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(emailConfig_SLA_ConfigurationTypeEDataType, String.class, "emailConfig_SLA_ConfigurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(emailID_ContractorGroupsTypeEDataType, String.class, "emailID_ContractorGroupsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(emailRecipientElementTypeEDataType, EmailRecipient.class, "emailRecipientElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(emailRecipientObjectEDataType, EmailRecipient.class, "EmailRecipientObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(email_ProvisioningDataModelTypeEDataType, String.class, "email_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(enableDisableElementTypeEDataType, EnableDisable.class, "enableDisableElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(enableDisableObjectEDataType, EnableDisable.class, "EnableDisableObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(firstName_ContractorGroupsTypeEDataType, String.class, "firstName_ContractorGroupsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(floor_ProvisioningDataModelTypeEDataType, String.class, "floor_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(gpsCoordinates_ProvisioningDataModelTypeEDataType, String.class, "GPSCoordinates_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(lastName_ContractorGroupsTypeEDataType, String.class, "lastName_ContractorGroupsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(location_ProvisioningDataModelTypeEDataType, String.class, "location_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(loginName_ContractorGroupsTypeEDataType, String.class, "loginName_ContractorGroupsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(masterUser_ContractorGroupsTypeEDataType, String.class, "masterUser_ContractorGroupsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(mobile_ProvisioningDataModelTypeEDataType, String.class, "mobile_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(modifiedBy_TehnicalInformationTypeEDataType, String.class, "modifiedBy_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(notesComments_ProvisioningDataModelTypeEDataType, String.class, "notesComments_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(port_TehnicalInformationTypeEDataType, String.class, "port_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(portType_TehnicalInformationTypeEDataType, String.class, "portType_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(processNameElementTypeEDataType, ProcessName.class, "processNameElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(processNameObjectEDataType, ProcessName.class, "ProcessNameObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(processName_SLA_ConfigurationTypeEDataType, String.class, "processName_SLA_ConfigurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(projectManager_ProvisioningDataModelTypeEDataType, String.class, "projectManager_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(propertyName_SystemParametersTypeEDataType, String.class, "propertyName_SystemParametersType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(propertyValue_SystemParametersTypeEDataType, String.class, "propertyValue_SystemParametersType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(regionView_ProvisioningDataModelTypeEDataType, String.class, "regionView_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(sector_ProvisioningDataModelTypeEDataType, String.class, "sector_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(serviceStatusElementTypeEDataType, ServiceStatus.class, "serviceStatusElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(serviceStatusObjectEDataType, ServiceStatus.class, "ServiceStatusObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(serviceStatus_ProvisioningDataModelTypeEDataType, String.class, "serviceStatus_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(serviceTypeElementTypeEDataType, ServiceType.class, "serviceTypeElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(serviceTypeObjectEDataType, ServiceType.class, "ServiceTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(sfcpoppE_TehnicalInformationTypeEDataType, String.class, "SFCPOPPE_TehnicalInformationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(siebelCircuitID_ProvisioningDataModelTypeEDataType, String.class, "siebelCircuitID_ProvisioningDataModelType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(slA_Deadline_SLA_ConfigurationTypeEDataType, String.class, "SLA_Deadline_SLA_ConfigurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(slaLevel_SLA_ConfigurationTypeEDataType, BigInteger.class, "SLALevel_SLA_ConfigurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(stepName_CommentDataTypeEDataType, String.class, "stepName_CommentDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(taskConfig_SLA_ConfigurationTypeEDataType, String.class, "taskConfig_SLA_ConfigurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(taskName_SLA_ConfigurationTypeEDataType, String.class, "taskName_SLA_ConfigurationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(taskRecipientElementTypeEDataType, TaskRecipient.class, "taskRecipientElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(taskRecipientObjectEDataType, TaskRecipient.class, "TaskRecipientObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(technologyListElementTypeEDataType, TechnologyList.class, "technologyListElementType", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(technologyListObjectEDataType, TechnologyList.class, "TechnologyListObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
    initEDataType(time_CommentDataTypeEDataType, String.class, "time_CommentDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(type_EquipmentDetailsTypeEDataType, String.class, "type_EquipmentDetailsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(vlaN_EquipmentDetailsTypeEDataType, String.class, "VLAN_EquipmentDetailsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // bds
    createBdsAnnotations();
    // teneo.jpa
    createTeneoAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>bds</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createBdsAnnotations()
  {
    String source = "bds";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "BomFileName", "L/com.sfc.fosImpl.dataModel/Business Objects/SFC_ProvisioningBOM.bom",
       "majorVersion", "2",
       "ecoreFormat", "1",
       "label", "com.example.sfc_provisioningbom"
       });					
    addAnnotation
      (accountTypeEEnum, 
       source, 
       new String[] 
       {
       "label", "AccountType"
       });		
    addAnnotation
      (accountTypeEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "New"
       });		
    addAnnotation
      (accountTypeEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Migration"
       });								
    addAnnotation
      (bandwidthEEnum, 
       source, 
       new String[] 
       {
       "label", "Bandwidth"
       });		
    addAnnotation
      (bandwidthEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "FFB5"
       });													
    addAnnotation
      (commentDataEClass, 
       source, 
       new String[] 
       {
       "label", "CommentData"
       });											
    addAnnotation
      (contractorGroupsEClass, 
       source, 
       new String[] 
       {
       "isCase", "true",
       "summary", "firstName lastName loginName emailID contractorGroupName masterUser",
       "label", "Contractor Groups"
       });				
    addAnnotation
      (getContractorGroups_LoginName(), 
       source, 
       new String[] 
       {
       "isSearchable", "true",
       "bomBaseType", "Text",
       "label", "login Name"
       });				
    addAnnotation
      (getContractorGroups_FirstName(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "first Name"
       });				
    addAnnotation
      (getContractorGroups_LastName(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "last Name"
       });				
    addAnnotation
      (getContractorGroups_ContractorGroupName(), 
       source, 
       new String[] 
       {
       "isSearchable", "true",
       "bomBaseType", "Text",
       "label", "Contractor Group Name"
       });				
    addAnnotation
      (getContractorGroups_MasterUser(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "Master User"
       });				
    addAnnotation
      (getContractorGroups_EmailID(), 
       source, 
       new String[] 
       {
       "isCID", "true",
       "bomBaseType", "Text",
       "label", "email ID"
       });				
    addAnnotation
      (getContractorGroups_BdsId(), 
       source, 
       new String[] 
       {
       "isId", "true"
       });			
    addAnnotation
      (getContractorGroups_BdsVersion(), 
       source, 
       new String[] 
       {
       "isVersion", "true"
       });																																	
    addAnnotation
      (emailRecipientEEnum, 
       source, 
       new String[] 
       {
       "label", "EmailRecipient"
       });		
    addAnnotation
      (emailRecipientEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "None"
       });		
    addAnnotation
      (emailRecipientEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Specific"
       });		
    addAnnotation
      (emailRecipientEEnum.getELiterals().get(2), 
       source, 
       new String[] 
       {
       "label", "PM"
       });						
    addAnnotation
      (enableDisableEEnum, 
       source, 
       new String[] 
       {
       "label", "EnableDisable"
       });		
    addAnnotation
      (enableDisableEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "Enable"
       });		
    addAnnotation
      (enableDisableEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Disable"
       });					
    addAnnotation
      (equipmentDetailsEClass, 
       source, 
       new String[] 
       {
       "label", "EquipmentDetails"
       });																			
    addAnnotation
      (processNameEEnum, 
       source, 
       new String[] 
       {
       "label", "ProcessName"
       });		
    addAnnotation
      (processNameEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "Provisioning"
       });		
    addAnnotation
      (processNameEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Decomissioning"
       });									
    addAnnotation
      (provisioningDataModelEClass, 
       source, 
       new String[] 
       {
       "label", "ProvisioningDataModel"
       });																																
    addAnnotation
      (serviceStatusEEnum, 
       source, 
       new String[] 
       {
       "label", "ServiceStatus"
       });		
    addAnnotation
      (serviceStatusEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "Registered"
       });		
    addAnnotation
      (serviceStatusEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Verified"
       });		
    addAnnotation
      (serviceStatusEEnum.getELiterals().get(2), 
       source, 
       new String[] 
       {
       "label", "Approved"
       });		
    addAnnotation
      (serviceStatusEEnum.getELiterals().get(3), 
       source, 
       new String[] 
       {
       "label", "Completed"
       });						
    addAnnotation
      (serviceTypeEEnum, 
       source, 
       new String[] 
       {
       "label", "ServiceType"
       });		
    addAnnotation
      (serviceTypeEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "Internet"
       });		
    addAnnotation
      (serviceTypeEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Fiber"
       });		
    addAnnotation
      (serviceTypeEEnum.getELiterals().get(2), 
       source, 
       new String[] 
       {
       "label", "WiMAX"
       });							
    addAnnotation
      (slA_ConfigurationEClass, 
       source, 
       new String[] 
       {
       "isCase", "true",
       "summary", "SLALevel taskName SLA_Deadline emailTo taskTo emailConfig taskConfig processName enableDisableFlag",
       "label", "SLA_Configuration"
       });				
    addAnnotation
      (getSLA_Configuration_SLALevel(), 
       source, 
       new String[] 
       {
       "isCID", "true",
       "bomBaseType", "Integer",
       "isCompositeCaseIdentifier", "true",
       "label", "SLALevel"
       });				
    addAnnotation
      (getSLA_Configuration_TaskName(), 
       source, 
       new String[] 
       {
       "isCID", "true",
       "bomBaseType", "Text",
       "isCompositeCaseIdentifier", "true",
       "label", "Task Name"
       });				
    addAnnotation
      (getSLA_Configuration_ProcessName(), 
       source, 
       new String[] 
       {
       "isCID", "true",
       "bomBaseType", "Text",
       "isCompositeCaseIdentifier", "true",
       "label", "ProcessName"
       });				
    addAnnotation
      (getSLA_Configuration_SLA_Deadline(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "SLA_Deadline"
       });				
    addAnnotation
      (getSLA_Configuration_EmailTo(), 
       source, 
       new String[] 
       {
       "label", "EmailTo"
       });				
    addAnnotation
      (getSLA_Configuration_TaskTo(), 
       source, 
       new String[] 
       {
       "label", "TaskTo"
       });				
    addAnnotation
      (getSLA_Configuration_EmailConfig(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "EmailConfig"
       });				
    addAnnotation
      (getSLA_Configuration_TaskConfig(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "TaskConfig"
       });				
    addAnnotation
      (getSLA_Configuration_EnableDisableFlag(), 
       source, 
       new String[] 
       {
       "isSearchable", "true",
       "label", "EnableDisableFlag"
       });				
    addAnnotation
      (getSLA_Configuration_BdsId(), 
       source, 
       new String[] 
       {
       "isId", "true"
       });			
    addAnnotation
      (getSLA_Configuration_BdsVersion(), 
       source, 
       new String[] 
       {
       "isVersion", "true"
       });						
    addAnnotation
      (systemParametersEClass, 
       source, 
       new String[] 
       {
       "isCase", "true",
       "summary", "propertyName propertyValue",
       "label", "SystemParameters"
       });				
    addAnnotation
      (getSystemParameters_PropertyName(), 
       source, 
       new String[] 
       {
       "isCID", "true",
       "bomBaseType", "Text",
       "label", "PropertyName"
       });				
    addAnnotation
      (getSystemParameters_PropertyValue(), 
       source, 
       new String[] 
       {
       "bomBaseType", "Text",
       "label", "PropertyValue"
       });				
    addAnnotation
      (getSystemParameters_BdsId(), 
       source, 
       new String[] 
       {
       "isId", "true"
       });			
    addAnnotation
      (getSystemParameters_BdsVersion(), 
       source, 
       new String[] 
       {
       "isVersion", "true"
       });					
    addAnnotation
      (taskRecipientEEnum, 
       source, 
       new String[] 
       {
       "label", "TaskRecipient"
       });		
    addAnnotation
      (taskRecipientEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "None"
       });		
    addAnnotation
      (taskRecipientEEnum.getELiterals().get(1), 
       source, 
       new String[] 
       {
       "label", "Specific"
       });		
    addAnnotation
      (taskRecipientEEnum.getELiterals().get(2), 
       source, 
       new String[] 
       {
       "label", "PM"
       });					
    addAnnotation
      (technologyListEEnum, 
       source, 
       new String[] 
       {
       "label", "TechnologyList"
       });		
    addAnnotation
      (technologyListEEnum.getELiterals().get(0), 
       source, 
       new String[] 
       {
       "label", "Fiber"
       });					
    addAnnotation
      (tehnicalInformationEClass, 
       source, 
       new String[] 
       {
       "label", "Tehnical Information"
       });															
  }

  /**
   * Initializes the annotations for <b>teneo.jpa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createTeneoAnnotations()
  {
    String source = "teneo.jpa";				
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "value", "@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")"
       });																											
    addAnnotation
      (commentDataEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });											
    addAnnotation
      (contractorGroupsEClass, 
       source, 
       new String[] 
       {
       "value", "@Table(name=\"SFC_PROVISIONINGBOM_CONTRACTORGROUPS\")\n@DiscriminatorValue(\"com.example.sfc_provisioningbom.ContractorGroups\")"
       });				
    addAnnotation
      (getContractorGroups_LoginName(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"LOGINNAME\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getContractorGroups_FirstName(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"FIRSTNAME\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getContractorGroups_LastName(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"LASTNAME\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getContractorGroups_ContractorGroupName(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"CONTRACTORGROUPNAME\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getContractorGroups_MasterUser(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"MASTERUSER\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getContractorGroups_EmailID(), 
       source, 
       new String[] 
       {
       "value", "@Column(unique=\"true\", name=\"EMAILID\", length=\"400\", nullable=\"false\")"
       });		
    addAnnotation
      (getContractorGroups_BdsId(), 
       source, 
       new String[] 
       {
       "value", "@Id\n@Column(name=\"BDS_ID\", nullable=\"false\")\n@GeneratedValue(generator=\"bdsIdGenerator\")"
       });			
    addAnnotation
      (getContractorGroups_BdsVersion(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"BDS_VERSION\")\n@Version"
       });																																																	
    addAnnotation
      (equipmentDetailsEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });																													
    addAnnotation
      (provisioningDataModelEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });																																																		
    addAnnotation
      (slA_ConfigurationEClass, 
       source, 
       new String[] 
       {
       "value", "@Table(uniqueConstraints={@UniqueConstraint(columnNames={\"SLALEVEL\", \"TASKNAME\", \"PROCESSNAME\"})}, name=\"SFC_PROVISIONINGBOM_SLA_CONFIGURATION\")\n@DiscriminatorValue(\"com.example.sfc_provisioningbom.SLA_Configuration\")"
       });				
    addAnnotation
      (getSLA_Configuration_SLALevel(), 
       source, 
       new String[] 
       {
       "value", "@Column(scale=\"0\", precision=\"31\", name=\"SLALEVEL\", nullable=\"false\")"
       });				
    addAnnotation
      (getSLA_Configuration_TaskName(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"TASKNAME\", length=\"400\", nullable=\"false\")"
       });				
    addAnnotation
      (getSLA_Configuration_ProcessName(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"PROCESSNAME\", length=\"400\", nullable=\"false\")"
       });				
    addAnnotation
      (getSLA_Configuration_SLA_Deadline(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"SLA_DEADLINE\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getSLA_Configuration_EmailTo(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"EMAILTO\", nullable=\"true\")"
       });				
    addAnnotation
      (getSLA_Configuration_TaskTo(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"TASKTO\", nullable=\"true\")"
       });				
    addAnnotation
      (getSLA_Configuration_EmailConfig(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"EMAILCONFIG\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getSLA_Configuration_TaskConfig(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"TASKCONFIG\", length=\"400\", nullable=\"true\")"
       });				
    addAnnotation
      (getSLA_Configuration_EnableDisableFlag(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"ENABLEDISABLEFLAG\", nullable=\"true\")"
       });		
    addAnnotation
      (getSLA_Configuration_BdsId(), 
       source, 
       new String[] 
       {
       "value", "@Id\n@Column(name=\"BDS_ID\", nullable=\"false\")\n@GeneratedValue(generator=\"bdsIdGenerator\")"
       });			
    addAnnotation
      (getSLA_Configuration_BdsVersion(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"BDS_VERSION\")\n@Version"
       });								
    addAnnotation
      (systemParametersEClass, 
       source, 
       new String[] 
       {
       "value", "@Table(name=\"SFC_PROVISIONINGBOM_SYSTEMPARAMETERS\")\n@DiscriminatorValue(\"com.example.sfc_provisioningbom.SystemParameters\")"
       });				
    addAnnotation
      (getSystemParameters_PropertyName(), 
       source, 
       new String[] 
       {
       "value", "@Column(unique=\"true\", name=\"PROPERTYNAME\", length=\"400\", nullable=\"false\")"
       });				
    addAnnotation
      (getSystemParameters_PropertyValue(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"PROPERTYVALUE\", length=\"400\", nullable=\"true\")"
       });		
    addAnnotation
      (getSystemParameters_BdsId(), 
       source, 
       new String[] 
       {
       "value", "@Id\n@Column(name=\"BDS_ID\", nullable=\"false\")\n@GeneratedValue(generator=\"bdsIdGenerator\")"
       });			
    addAnnotation
      (getSystemParameters_BdsVersion(), 
       source, 
       new String[] 
       {
       "value", "@Column(name=\"BDS_VERSION\")\n@Version"
       });																			
    addAnnotation
      (tehnicalInformationEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });														
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
      (accountManager_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "accountManager_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (accountTypeEEnum, 
       source, 
       new String[] 
       {
       "name", "AccountType"
       });					
    addAnnotation
      (accountTypeElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "accountTypeElement_._type",
       "baseType", "AccountType"
       });		
    addAnnotation
      (accountTypeObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "AccountType:Object",
       "baseType", "AccountType"
       });		
    addAnnotation
      (addedby_CommentDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "addedby_CommentData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (address_EquipmentDetailsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "address_EquipmentDetails_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (aggPoint_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "aggPoint_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (bandwidthEEnum, 
       source, 
       new String[] 
       {
       "name", "Bandwidth"
       });				
    addAnnotation
      (bandwidthElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "bandwidthElement_._type",
       "baseType", "Bandwidth"
       });		
    addAnnotation
      (bandwidthObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "Bandwidth:Object",
       "baseType", "Bandwidth"
       });		
    addAnnotation
      (buildingID_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "buildingID_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (buildingName_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "buildingName_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (carrierIP_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "carrierIP_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (carrierVLAN_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "carrierVLAN_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (clientID_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "clientID_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (clientIP_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "clientIP_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (clientName_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "clientName_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (clientVLAN_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "clientVLAN_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (commentDataEClass, 
       source, 
       new String[] 
       {
       "name", "CommentData",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getCommentData_Addedby(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "addedby"
       });		
    addAnnotation
      (getCommentData_Comments(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "comments"
       });		
    addAnnotation
      (getCommentData_StepName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "stepName"
       });		
    addAnnotation
      (getCommentData_Time(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "time"
       });		
    addAnnotation
      (comments_CommentDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "comments_CommentData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (contactPerson_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "contactPerson_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (contractorGroupName_ContractorGroupsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "contractorGroupName_ContractorGroups_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (contractorGroupsEClass, 
       source, 
       new String[] 
       {
       "name", "ContractorGroups",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getContractorGroups_LoginName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "loginName"
       });				
    addAnnotation
      (getContractorGroups_FirstName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "firstName"
       });				
    addAnnotation
      (getContractorGroups_LastName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "lastName"
       });				
    addAnnotation
      (getContractorGroups_ContractorGroupName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "contractorGroupName"
       });				
    addAnnotation
      (getContractorGroups_MasterUser(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "masterUser"
       });				
    addAnnotation
      (getContractorGroups_EmailID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "emailID"
       });								
    addAnnotation
      (contractor_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "contractor_ProvisioningDataModel_._type",
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
      (getDocumentRoot_AccountTypeElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AccountTypeElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_BandwidthElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "BandwidthElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CommentDataElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CommentDataElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ContractorGroupsElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ContractorGroupsElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_EmailRecipientElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EmailRecipientElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_EnableDisableElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EnableDisableElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_EquipmentDetailsElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EquipmentDetailsElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ProcessNameElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ProcessNameElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ProvisioningDataModelElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ProvisioningDataModelElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ServiceStatusElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ServiceStatusElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ServiceTypeElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ServiceTypeElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SLAConfigurationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SLA_ConfigurationElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SystemParametersElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SystemParametersElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_TaskRecipientElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TaskRecipientElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_TechnologyListElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TechnologyListElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_TehnicalInformationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TehnicalInformationElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CommentDataBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CommentData",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ContractorGroupsBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ContractorGroups",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_EquipmentDetailsBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EquipmentDetails",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_ProvisioningDataModelBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "ProvisioningDataModel",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SLA_ConfigurationBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SLA_Configuration",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SystemParametersBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SystemParameters",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_TehnicalInformationBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "TehnicalInformation",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (emailConfig_SLA_ConfigurationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "emailConfig_SLA_Configuration_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (emailID_ContractorGroupsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "emailID_ContractorGroups_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (emailRecipientEEnum, 
       source, 
       new String[] 
       {
       "name", "EmailRecipient"
       });						
    addAnnotation
      (emailRecipientElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "emailRecipientElement_._type",
       "baseType", "EmailRecipient"
       });		
    addAnnotation
      (emailRecipientObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "EmailRecipient:Object",
       "baseType", "EmailRecipient"
       });		
    addAnnotation
      (email_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "email_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (enableDisableEEnum, 
       source, 
       new String[] 
       {
       "name", "EnableDisable"
       });					
    addAnnotation
      (enableDisableElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "enableDisableElement_._type",
       "baseType", "EnableDisable"
       });		
    addAnnotation
      (enableDisableObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "EnableDisable:Object",
       "baseType", "EnableDisable"
       });		
    addAnnotation
      (equipmentDetailsEClass, 
       source, 
       new String[] 
       {
       "name", "EquipmentDetails",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getEquipmentDetails_Type(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "type"
       });		
    addAnnotation
      (getEquipmentDetails_Address(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "address"
       });		
    addAnnotation
      (getEquipmentDetails_VLAN(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "VLAN"
       });		
    addAnnotation
      (firstName_ContractorGroupsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "firstName_ContractorGroups_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (floor_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "floor_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (gpsCoordinates_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "GPSCoordinates_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (lastName_ContractorGroupsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "lastName_ContractorGroups_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (location_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "location_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (loginName_ContractorGroupsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "loginName_ContractorGroups_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (masterUser_ContractorGroupsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "masterUser_ContractorGroups_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "100"
       });		
    addAnnotation
      (mobile_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "mobile_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (modifiedBy_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "modifiedBy_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (notesComments_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "notesComments_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (port_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "port_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (portType_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "portType_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (processNameEEnum, 
       source, 
       new String[] 
       {
       "name", "ProcessName"
       });					
    addAnnotation
      (processNameElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "processNameElement_._type",
       "baseType", "ProcessName"
       });		
    addAnnotation
      (processNameObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ProcessName:Object",
       "baseType", "ProcessName"
       });		
    addAnnotation
      (processName_SLA_ConfigurationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "processName_SLA_Configuration_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (projectManager_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "projectManager_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (propertyName_SystemParametersTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "propertyName_SystemParameters_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (propertyValue_SystemParametersTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "propertyValue_SystemParameters_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (provisioningDataModelEClass, 
       source, 
       new String[] 
       {
       "name", "ProvisioningDataModel",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getProvisioningDataModel_SiebelCircuitID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "siebelCircuitID"
       });		
    addAnnotation
      (getProvisioningDataModel_ProjectManager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "projectManager"
       });		
    addAnnotation
      (getProvisioningDataModel_ClientName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "clientName"
       });		
    addAnnotation
      (getProvisioningDataModel_AccountManager(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "accountManager"
       });		
    addAnnotation
      (getProvisioningDataModel_Account(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "account"
       });		
    addAnnotation
      (getProvisioningDataModel_Contractor(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "contractor"
       });		
    addAnnotation
      (getProvisioningDataModel_Location(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "location"
       });		
    addAnnotation
      (getProvisioningDataModel_RegionView(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "regionView"
       });		
    addAnnotation
      (getProvisioningDataModel_Floor(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "floor"
       });		
    addAnnotation
      (getProvisioningDataModel_ClientID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "clientID"
       });		
    addAnnotation
      (getProvisioningDataModel_ServiceType(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "serviceType"
       });		
    addAnnotation
      (getProvisioningDataModel_GPSCoordinates(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GPSCoordinates"
       });		
    addAnnotation
      (getProvisioningDataModel_Bandwidthupdown(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "bandwidthupdown"
       });		
    addAnnotation
      (getProvisioningDataModel_Technology(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "technology"
       });		
    addAnnotation
      (getProvisioningDataModel_ServiceStatus(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "serviceStatus"
       });		
    addAnnotation
      (getProvisioningDataModel_BuildingName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "buildingName"
       });		
    addAnnotation
      (getProvisioningDataModel_BuildingID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "buildingID"
       });		
    addAnnotation
      (getProvisioningDataModel_ContactPerson(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "contactPerson"
       });		
    addAnnotation
      (getProvisioningDataModel_Mobile(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "mobile"
       });		
    addAnnotation
      (getProvisioningDataModel_Sector(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "sector"
       });		
    addAnnotation
      (getProvisioningDataModel_Email(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "email"
       });		
    addAnnotation
      (getProvisioningDataModel_ServiceStart(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "serviceStart"
       });		
    addAnnotation
      (getProvisioningDataModel_ServiceEnd(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "serviceEnd"
       });		
    addAnnotation
      (getProvisioningDataModel_RequestDate(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "requestDate"
       });		
    addAnnotation
      (getProvisioningDataModel_InstallDate(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "installDate"
       });		
    addAnnotation
      (getProvisioningDataModel_NotesComments(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "notesComments"
       });		
    addAnnotation
      (regionView_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "regionView_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (sector_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "sector_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (serviceStatusEEnum, 
       source, 
       new String[] 
       {
       "name", "ServiceStatus"
       });							
    addAnnotation
      (serviceStatusElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "serviceStatusElement_._type",
       "baseType", "ServiceStatus"
       });		
    addAnnotation
      (serviceStatusObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ServiceStatus:Object",
       "baseType", "ServiceStatus"
       });		
    addAnnotation
      (serviceStatus_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "serviceStatus_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (serviceTypeEEnum, 
       source, 
       new String[] 
       {
       "name", "ServiceType"
       });						
    addAnnotation
      (serviceTypeElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "serviceTypeElement_._type",
       "baseType", "ServiceType"
       });		
    addAnnotation
      (serviceTypeObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "ServiceType:Object",
       "baseType", "ServiceType"
       });		
    addAnnotation
      (sfcpoppE_TehnicalInformationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "SFCPOPPE_TehnicalInformation_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (siebelCircuitID_ProvisioningDataModelTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "siebelCircuitID_ProvisioningDataModel_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (slA_ConfigurationEClass, 
       source, 
       new String[] 
       {
       "name", "SLA_Configuration",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getSLA_Configuration_SLALevel(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SLALevel"
       });				
    addAnnotation
      (getSLA_Configuration_TaskName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "taskName"
       });				
    addAnnotation
      (getSLA_Configuration_ProcessName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "processName"
       });				
    addAnnotation
      (getSLA_Configuration_SLA_Deadline(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SLA_Deadline"
       });				
    addAnnotation
      (getSLA_Configuration_EmailTo(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "emailTo"
       });				
    addAnnotation
      (getSLA_Configuration_TaskTo(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "taskTo"
       });				
    addAnnotation
      (getSLA_Configuration_EmailConfig(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "emailConfig"
       });				
    addAnnotation
      (getSLA_Configuration_TaskConfig(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "taskConfig"
       });				
    addAnnotation
      (getSLA_Configuration_EnableDisableFlag(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "enableDisableFlag"
       });								
    addAnnotation
      (slA_Deadline_SLA_ConfigurationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "SLA_Deadline_SLA_Configuration_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (slaLevel_SLA_ConfigurationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "SLALevel_SLA_Configuration_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
       "totalDigits", "19"
       });		
    addAnnotation
      (stepName_CommentDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "stepName_CommentData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (systemParametersEClass, 
       source, 
       new String[] 
       {
       "name", "SystemParameters",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getSystemParameters_PropertyName(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "propertyName"
       });				
    addAnnotation
      (getSystemParameters_PropertyValue(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "propertyValue"
       });								
    addAnnotation
      (taskConfig_SLA_ConfigurationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "taskConfig_SLA_Configuration_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (taskName_SLA_ConfigurationTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "taskName_SLA_Configuration_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (taskRecipientEEnum, 
       source, 
       new String[] 
       {
       "name", "TaskRecipient"
       });						
    addAnnotation
      (taskRecipientElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "taskRecipientElement_._type",
       "baseType", "TaskRecipient"
       });		
    addAnnotation
      (taskRecipientObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "TaskRecipient:Object",
       "baseType", "TaskRecipient"
       });		
    addAnnotation
      (technologyListEEnum, 
       source, 
       new String[] 
       {
       "name", "TechnologyList"
       });				
    addAnnotation
      (technologyListElementTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "technologyListElement_._type",
       "baseType", "TechnologyList"
       });		
    addAnnotation
      (technologyListObjectEDataType, 
       source, 
       new String[] 
       {
       "name", "TechnologyList:Object",
       "baseType", "TechnologyList"
       });		
    addAnnotation
      (tehnicalInformationEClass, 
       source, 
       new String[] 
       {
       "name", "TehnicalInformation",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getTehnicalInformation_CarrierVLAN(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "carrierVLAN"
       });		
    addAnnotation
      (getTehnicalInformation_CarrierIP(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "carrierIP"
       });		
    addAnnotation
      (getTehnicalInformation_AggPoint(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "aggPoint"
       });		
    addAnnotation
      (getTehnicalInformation_Port(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "port"
       });		
    addAnnotation
      (getTehnicalInformation_ClientVLAN(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "clientVLAN"
       });		
    addAnnotation
      (getTehnicalInformation_ClientIP(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "clientIP"
       });		
    addAnnotation
      (getTehnicalInformation_SFCPOPPE(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SFCPOPPE"
       });		
    addAnnotation
      (getTehnicalInformation_PortType(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "portType"
       });		
    addAnnotation
      (getTehnicalInformation_Equipment(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "equipment"
       });		
    addAnnotation
      (getTehnicalInformation_ModifiedBy(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "modifiedBy"
       });		
    addAnnotation
      (getTehnicalInformation_ModifiedDate(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "modifiedDate"
       });		
    addAnnotation
      (time_CommentDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "time_CommentData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (type_EquipmentDetailsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "type_EquipmentDetails_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (vlaN_EquipmentDetailsTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "VLAN_EquipmentDetails_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });
  }

} //Sfc_provisioningbomPackageImpl

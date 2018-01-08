package com.example.sfc_provisioningbom;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provisioning Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getSiebelCircuitID <em>Siebel Circuit ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getProjectManager <em>Project Manager</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getClientName <em>Client Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getAccountManager <em>Account Manager</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getAccount <em>Account</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getContractor <em>Contractor</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getLocation <em>Location</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getRegionView <em>Region View</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getFloor <em>Floor</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getClientID <em>Client ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getGPSCoordinates <em>GPS Coordinates</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBandwidthupdown <em>Bandwidthupdown</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getTechnology <em>Technology</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStatus <em>Service Status</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingID <em>Building ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getContactPerson <em>Contact Person</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getMobile <em>Mobile</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getSector <em>Sector</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getEmail <em>Email</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStart <em>Service Start</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceEnd <em>Service End</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getRequestDate <em>Request Date</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getNotesComments <em>Notes Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel()
 * @model extendedMetaData="name='ProvisioningDataModel' kind='elementOnly'"
 *        annotation="bds label='ProvisioningDataModel'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface ProvisioningDataModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Siebel Circuit ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Siebel Circuit ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Siebel Circuit ID</em>' attribute.
   * @see #setSiebelCircuitID(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_SiebelCircuitID()
   * @model dataType="com.example.sfc_provisioningbom.siebelCircuitID_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='siebelCircuitID'"
   * @generated
   */
  String getSiebelCircuitID();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getSiebelCircuitID <em>Siebel Circuit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Siebel Circuit ID</em>' attribute.
   * @see #getSiebelCircuitID()
   * @generated
   */
  void setSiebelCircuitID(String value);

  /**
   * Returns the value of the '<em><b>Project Manager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Manager</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Manager</em>' attribute.
   * @see #setProjectManager(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ProjectManager()
   * @model dataType="com.example.sfc_provisioningbom.projectManager_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='projectManager'"
   * @generated
   */
  String getProjectManager();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getProjectManager <em>Project Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Manager</em>' attribute.
   * @see #getProjectManager()
   * @generated
   */
  void setProjectManager(String value);

  /**
   * Returns the value of the '<em><b>Client Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client Name</em>' attribute.
   * @see #setClientName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ClientName()
   * @model dataType="com.example.sfc_provisioningbom.clientName_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='clientName'"
   * @generated
   */
  String getClientName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getClientName <em>Client Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client Name</em>' attribute.
   * @see #getClientName()
   * @generated
   */
  void setClientName(String value);

  /**
   * Returns the value of the '<em><b>Account Manager</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account Manager</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account Manager</em>' attribute.
   * @see #setAccountManager(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_AccountManager()
   * @model dataType="com.example.sfc_provisioningbom.accountManager_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='accountManager'"
   * @generated
   */
  String getAccountManager();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getAccountManager <em>Account Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account Manager</em>' attribute.
   * @see #getAccountManager()
   * @generated
   */
  void setAccountManager(String value);

  /**
   * Returns the value of the '<em><b>Account</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Account</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Account</em>' attribute.
   * @see #setAccount(AccountType)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Account()
   * @model dataType="com.example.sfc_provisioningbom.AccountTypeObject"
   *        extendedMetaData="kind='element' name='account'"
   * @generated
   */
  AccountType getAccount();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getAccount <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Account</em>' attribute.
   * @see #getAccount()
   * @generated
   */
  void setAccount(AccountType value);

  /**
   * Returns the value of the '<em><b>Contractor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contractor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contractor</em>' attribute.
   * @see #setContractor(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Contractor()
   * @model dataType="com.example.sfc_provisioningbom.contractor_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='contractor'"
   * @generated
   */
  String getContractor();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getContractor <em>Contractor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contractor</em>' attribute.
   * @see #getContractor()
   * @generated
   */
  void setContractor(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Location()
   * @model dataType="com.example.sfc_provisioningbom.location_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='location'"
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Region View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region View</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region View</em>' attribute.
   * @see #setRegionView(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_RegionView()
   * @model dataType="com.example.sfc_provisioningbom.regionView_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='regionView'"
   * @generated
   */
  String getRegionView();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getRegionView <em>Region View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region View</em>' attribute.
   * @see #getRegionView()
   * @generated
   */
  void setRegionView(String value);

  /**
   * Returns the value of the '<em><b>Floor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Floor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Floor</em>' attribute.
   * @see #setFloor(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Floor()
   * @model dataType="com.example.sfc_provisioningbom.floor_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='floor'"
   * @generated
   */
  String getFloor();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getFloor <em>Floor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Floor</em>' attribute.
   * @see #getFloor()
   * @generated
   */
  void setFloor(String value);

  /**
   * Returns the value of the '<em><b>Client ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client ID</em>' attribute.
   * @see #setClientID(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ClientID()
   * @model dataType="com.example.sfc_provisioningbom.clientID_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='clientID'"
   * @generated
   */
  String getClientID();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getClientID <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client ID</em>' attribute.
   * @see #getClientID()
   * @generated
   */
  void setClientID(String value);

  /**
   * Returns the value of the '<em><b>Service Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Type</em>' attribute.
   * @see #setServiceType(ServiceType)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ServiceType()
   * @model dataType="com.example.sfc_provisioningbom.ServiceTypeObject"
   *        extendedMetaData="kind='element' name='serviceType'"
   * @generated
   */
  ServiceType getServiceType();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceType <em>Service Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Type</em>' attribute.
   * @see #getServiceType()
   * @generated
   */
  void setServiceType(ServiceType value);

  /**
   * Returns the value of the '<em><b>GPS Coordinates</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>GPS Coordinates</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>GPS Coordinates</em>' attribute.
   * @see #setGPSCoordinates(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_GPSCoordinates()
   * @model dataType="com.example.sfc_provisioningbom.GPSCoordinates_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='GPSCoordinates'"
   * @generated
   */
  String getGPSCoordinates();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getGPSCoordinates <em>GPS Coordinates</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>GPS Coordinates</em>' attribute.
   * @see #getGPSCoordinates()
   * @generated
   */
  void setGPSCoordinates(String value);

  /**
   * Returns the value of the '<em><b>Bandwidthupdown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bandwidthupdown</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bandwidthupdown</em>' attribute.
   * @see #setBandwidthupdown(Bandwidth)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Bandwidthupdown()
   * @model dataType="com.example.sfc_provisioningbom.BandwidthObject"
   *        extendedMetaData="kind='element' name='bandwidthupdown'"
   * @generated
   */
  Bandwidth getBandwidthupdown();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBandwidthupdown <em>Bandwidthupdown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bandwidthupdown</em>' attribute.
   * @see #getBandwidthupdown()
   * @generated
   */
  void setBandwidthupdown(Bandwidth value);

  /**
   * Returns the value of the '<em><b>Technology</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Technology</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Technology</em>' attribute.
   * @see #setTechnology(TechnologyList)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Technology()
   * @model dataType="com.example.sfc_provisioningbom.TechnologyListObject"
   *        extendedMetaData="kind='element' name='technology'"
   * @generated
   */
  TechnologyList getTechnology();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getTechnology <em>Technology</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Technology</em>' attribute.
   * @see #getTechnology()
   * @generated
   */
  void setTechnology(TechnologyList value);

  /**
   * Returns the value of the '<em><b>Service Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Status</em>' attribute.
   * @see #setServiceStatus(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ServiceStatus()
   * @model dataType="com.example.sfc_provisioningbom.serviceStatus_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='serviceStatus'"
   * @generated
   */
  String getServiceStatus();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStatus <em>Service Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Status</em>' attribute.
   * @see #getServiceStatus()
   * @generated
   */
  void setServiceStatus(String value);

  /**
   * Returns the value of the '<em><b>Building Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Building Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Building Name</em>' attribute.
   * @see #setBuildingName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_BuildingName()
   * @model dataType="com.example.sfc_provisioningbom.buildingName_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='buildingName'"
   * @generated
   */
  String getBuildingName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingName <em>Building Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Building Name</em>' attribute.
   * @see #getBuildingName()
   * @generated
   */
  void setBuildingName(String value);

  /**
   * Returns the value of the '<em><b>Building ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Building ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Building ID</em>' attribute.
   * @see #setBuildingID(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_BuildingID()
   * @model dataType="com.example.sfc_provisioningbom.buildingID_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='buildingID'"
   * @generated
   */
  String getBuildingID();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getBuildingID <em>Building ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Building ID</em>' attribute.
   * @see #getBuildingID()
   * @generated
   */
  void setBuildingID(String value);

  /**
   * Returns the value of the '<em><b>Contact Person</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contact Person</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contact Person</em>' attribute.
   * @see #setContactPerson(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ContactPerson()
   * @model dataType="com.example.sfc_provisioningbom.contactPerson_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='contactPerson'"
   * @generated
   */
  String getContactPerson();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getContactPerson <em>Contact Person</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contact Person</em>' attribute.
   * @see #getContactPerson()
   * @generated
   */
  void setContactPerson(String value);

  /**
   * Returns the value of the '<em><b>Mobile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mobile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mobile</em>' attribute.
   * @see #setMobile(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Mobile()
   * @model dataType="com.example.sfc_provisioningbom.mobile_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='mobile'"
   * @generated
   */
  String getMobile();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getMobile <em>Mobile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mobile</em>' attribute.
   * @see #getMobile()
   * @generated
   */
  void setMobile(String value);

  /**
   * Returns the value of the '<em><b>Sector</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sector</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sector</em>' attribute.
   * @see #setSector(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Sector()
   * @model dataType="com.example.sfc_provisioningbom.sector_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='sector'"
   * @generated
   */
  String getSector();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getSector <em>Sector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sector</em>' attribute.
   * @see #getSector()
   * @generated
   */
  void setSector(String value);

  /**
   * Returns the value of the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' attribute.
   * @see #setEmail(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_Email()
   * @model dataType="com.example.sfc_provisioningbom.email_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='email'"
   * @generated
   */
  String getEmail();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getEmail <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email</em>' attribute.
   * @see #getEmail()
   * @generated
   */
  void setEmail(String value);

  /**
   * Returns the value of the '<em><b>Service Start</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Start</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Start</em>' attribute.
   * @see #setServiceStart(XMLGregorianCalendar)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ServiceStart()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
   *        extendedMetaData="kind='element' name='serviceStart'"
   * @generated
   */
  XMLGregorianCalendar getServiceStart();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceStart <em>Service Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service Start</em>' attribute.
   * @see #getServiceStart()
   * @generated
   */
  void setServiceStart(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>Service End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service End</em>' attribute.
   * @see #setServiceEnd(XMLGregorianCalendar)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_ServiceEnd()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
   *        extendedMetaData="kind='element' name='serviceEnd'"
   * @generated
   */
  XMLGregorianCalendar getServiceEnd();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getServiceEnd <em>Service End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Service End</em>' attribute.
   * @see #getServiceEnd()
   * @generated
   */
  void setServiceEnd(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>Request Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Date</em>' attribute.
   * @see #setRequestDate(XMLGregorianCalendar)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_RequestDate()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
   *        extendedMetaData="kind='element' name='requestDate'"
   * @generated
   */
  XMLGregorianCalendar getRequestDate();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getRequestDate <em>Request Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Date</em>' attribute.
   * @see #getRequestDate()
   * @generated
   */
  void setRequestDate(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>Install Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Install Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Install Date</em>' attribute.
   * @see #setInstallDate(XMLGregorianCalendar)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_InstallDate()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
   *        extendedMetaData="kind='element' name='installDate'"
   * @generated
   */
  XMLGregorianCalendar getInstallDate();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getInstallDate <em>Install Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Install Date</em>' attribute.
   * @see #getInstallDate()
   * @generated
   */
  void setInstallDate(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>Notes Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes Comments</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes Comments</em>' attribute.
   * @see #setNotesComments(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProvisioningDataModel_NotesComments()
   * @model dataType="com.example.sfc_provisioningbom.notesComments_ProvisioningDataModelType"
   *        extendedMetaData="kind='element' name='notesComments'"
   * @generated
   */
  String getNotesComments();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ProvisioningDataModel#getNotesComments <em>Notes Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notes Comments</em>' attribute.
   * @see #getNotesComments()
   * @generated
   */
  void setNotesComments(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSiebelCircuitID()
   * @generated
   */
  void setSiebelCircuitID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getProjectManager()
   * @generated
   */
  void setProjectManager(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getClientName()
   * @generated
   */
  void setClientName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAccountManager()
   * @generated
   */
  void setAccountManager(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getContractor()
   * @generated
   */
  void setContractor(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getLocation()
   * @generated
   */
  void setLocation(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getRegionView()
   * @generated
   */
  void setRegionView(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getFloor()
   * @generated
   */
  void setFloor(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getClientID()
   * @generated
   */
  void setClientID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getGPSCoordinates()
   * @generated
   */
  void setGPSCoordinates(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getServiceStatus()
   * @generated
   */
  void setServiceStatus(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getBuildingName()
   * @generated
   */
  void setBuildingName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getBuildingID()
   * @generated
   */
  void setBuildingID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getContactPerson()
   * @generated
   */
  void setContactPerson(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getMobile()
   * @generated
   */
  void setMobile(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSector()
   * @generated
   */
  void setSector(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getEmail()
   * @generated
   */
  void setEmail(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getNotesComments()
   * @generated
   */
  void setNotesComments(Object value);

} // ProvisioningDataModel

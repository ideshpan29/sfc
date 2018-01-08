
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.AccountType;
import com.example.sfc_provisioningbom.Bandwidth;
import com.example.sfc_provisioningbom.ProvisioningDataModel;
import com.example.sfc_provisioningbom.ServiceType;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;
import com.example.sfc_provisioningbom.TechnologyList;

import com.example.sfc_provisioningbom.bdsutil.BDSCopyUtil;
import com.example.sfc_provisioningbom.bdsutil.BDSNotifyingCalendar;
import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provisioning Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getSiebelCircuitID <em>Siebel Circuit ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getProjectManager <em>Project Manager</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getClientName <em>Client Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getAccountManager <em>Account Manager</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getContractor <em>Contractor</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getRegionView <em>Region View</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getClientID <em>Client ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getGPSCoordinates <em>GPS Coordinates</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getBandwidthupdown <em>Bandwidthupdown</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getServiceStatus <em>Service Status</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getBuildingName <em>Building Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getBuildingID <em>Building ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getContactPerson <em>Contact Person</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getSector <em>Sector</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getServiceStart <em>Service Start</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getServiceEnd <em>Service End</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getRequestDate <em>Request Date</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getInstallDate <em>Install Date</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ProvisioningDataModelImpl#getNotesComments <em>Notes Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ProvisioningDataModelImpl extends EObjectImpl implements ProvisioningDataModel
{
  /**
   * The default value of the '{@link #getSiebelCircuitID() <em>Siebel Circuit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiebelCircuitID()
   * @generated
   * @ordered
   */
  protected static final String SIEBEL_CIRCUIT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSiebelCircuitID() <em>Siebel Circuit ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiebelCircuitID()
   * @generated
   * @ordered
   */
  protected String siebelCircuitID = SIEBEL_CIRCUIT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getProjectManager() <em>Project Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectManager()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_MANAGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectManager() <em>Project Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectManager()
   * @generated
   * @ordered
   */
  protected String projectManager = PROJECT_MANAGER_EDEFAULT;

  /**
   * The default value of the '{@link #getClientName() <em>Client Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientName()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientName() <em>Client Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientName()
   * @generated
   * @ordered
   */
  protected String clientName = CLIENT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAccountManager() <em>Account Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountManager()
   * @generated
   * @ordered
   */
  protected static final String ACCOUNT_MANAGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccountManager() <em>Account Manager</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccountManager()
   * @generated
   * @ordered
   */
  protected String accountManager = ACCOUNT_MANAGER_EDEFAULT;

  /**
   * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected static final AccountType ACCOUNT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccount()
   * @generated
   * @ordered
   */
  protected AccountType account = ACCOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getContractor() <em>Contractor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractor()
   * @generated
   * @ordered
   */
  protected static final String CONTRACTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContractor() <em>Contractor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractor()
   * @generated
   * @ordered
   */
  protected String contractor = CONTRACTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getRegionView() <em>Region View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionView()
   * @generated
   * @ordered
   */
  protected static final String REGION_VIEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRegionView() <em>Region View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegionView()
   * @generated
   * @ordered
   */
  protected String regionView = REGION_VIEW_EDEFAULT;

  /**
   * The default value of the '{@link #getFloor() <em>Floor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloor()
   * @generated
   * @ordered
   */
  protected static final String FLOOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloor() <em>Floor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloor()
   * @generated
   * @ordered
   */
  protected String floor = FLOOR_EDEFAULT;

  /**
   * The default value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientID()
   * @generated
   * @ordered
   */
  protected static final String CLIENT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientID()
   * @generated
   * @ordered
   */
  protected String clientID = CLIENT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceType()
   * @generated
   * @ordered
   */
  protected static final ServiceType SERVICE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceType()
   * @generated
   * @ordered
   */
  protected ServiceType serviceType = SERVICE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getGPSCoordinates() <em>GPS Coordinates</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGPSCoordinates()
   * @generated
   * @ordered
   */
  protected static final String GPS_COORDINATES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGPSCoordinates() <em>GPS Coordinates</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGPSCoordinates()
   * @generated
   * @ordered
   */
  protected String gpsCoordinates = GPS_COORDINATES_EDEFAULT;

  /**
   * The default value of the '{@link #getBandwidthupdown() <em>Bandwidthupdown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBandwidthupdown()
   * @generated
   * @ordered
   */
  protected static final Bandwidth BANDWIDTHUPDOWN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBandwidthupdown() <em>Bandwidthupdown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBandwidthupdown()
   * @generated
   * @ordered
   */
  protected Bandwidth bandwidthupdown = BANDWIDTHUPDOWN_EDEFAULT;

  /**
   * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTechnology()
   * @generated
   * @ordered
   */
  protected static final TechnologyList TECHNOLOGY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTechnology()
   * @generated
   * @ordered
   */
  protected TechnologyList technology = TECHNOLOGY_EDEFAULT;

  /**
   * The default value of the '{@link #getServiceStatus() <em>Service Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceStatus()
   * @generated
   * @ordered
   */
  protected static final String SERVICE_STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceStatus() <em>Service Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceStatus()
   * @generated
   * @ordered
   */
  protected String serviceStatus = SERVICE_STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildingName()
   * @generated
   * @ordered
   */
  protected static final String BUILDING_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuildingName() <em>Building Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildingName()
   * @generated
   * @ordered
   */
  protected String buildingName = BUILDING_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBuildingID() <em>Building ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildingID()
   * @generated
   * @ordered
   */
  protected static final String BUILDING_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuildingID() <em>Building ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuildingID()
   * @generated
   * @ordered
   */
  protected String buildingID = BUILDING_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getContactPerson() <em>Contact Person</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContactPerson()
   * @generated
   * @ordered
   */
  protected static final String CONTACT_PERSON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContactPerson() <em>Contact Person</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContactPerson()
   * @generated
   * @ordered
   */
  protected String contactPerson = CONTACT_PERSON_EDEFAULT;

  /**
   * The default value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMobile()
   * @generated
   * @ordered
   */
  protected static final String MOBILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMobile()
   * @generated
   * @ordered
   */
  protected String mobile = MOBILE_EDEFAULT;

  /**
   * The default value of the '{@link #getSector() <em>Sector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSector()
   * @generated
   * @ordered
   */
  protected static final String SECTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSector() <em>Sector</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSector()
   * @generated
   * @ordered
   */
  protected String sector = SECTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
  protected String email = EMAIL_EDEFAULT;

  /**
   * The default value of the '{@link #getServiceStart() <em>Service Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceStart()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar SERVICE_START_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceStart() <em>Service Start</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceStart()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar serviceStart = SERVICE_START_EDEFAULT;

  /**
   * The default value of the '{@link #getServiceEnd() <em>Service End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceEnd()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar SERVICE_END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServiceEnd() <em>Service End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceEnd()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar serviceEnd = SERVICE_END_EDEFAULT;

  /**
   * The default value of the '{@link #getRequestDate() <em>Request Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestDate()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar REQUEST_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequestDate() <em>Request Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestDate()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar requestDate = REQUEST_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getInstallDate() <em>Install Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallDate()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar INSTALL_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstallDate() <em>Install Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstallDate()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar installDate = INSTALL_DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getNotesComments() <em>Notes Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotesComments()
   * @generated
   * @ordered
   */
  protected static final String NOTES_COMMENTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNotesComments() <em>Notes Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotesComments()
   * @generated
   * @ordered
   */
  protected String notesComments = NOTES_COMMENTS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvisioningDataModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Sfc_provisioningbomPackage.Literals.PROVISIONING_DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSiebelCircuitID()
  {
    return siebelCircuitID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSiebelCircuitID(String newSiebelCircuitID)
  {
    String oldSiebelCircuitID = siebelCircuitID;
    siebelCircuitID = newSiebelCircuitID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID, oldSiebelCircuitID, siebelCircuitID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectManager()
  {
    return projectManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectManager(String newProjectManager)
  {
    String oldProjectManager = projectManager;
    projectManager = newProjectManager;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__PROJECT_MANAGER, oldProjectManager, projectManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClientName()
  {
    return clientName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientName(String newClientName)
  {
    String oldClientName = clientName;
    clientName = newClientName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_NAME, oldClientName, clientName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAccountManager()
  {
    return accountManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccountManager(String newAccountManager)
  {
    String oldAccountManager = accountManager;
    accountManager = newAccountManager;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER, oldAccountManager, accountManager));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccountType getAccount()
  {
    return account;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccount(AccountType newAccount)
  {
    AccountType oldAccount = account;
    account = newAccount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT, oldAccount, account));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContractor()
  {
    return contractor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContractor(String newContractor)
  {
    String oldContractor = contractor;
    contractor = newContractor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTRACTOR, oldContractor, contractor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegionView()
  {
    return regionView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegionView(String newRegionView)
  {
    String oldRegionView = regionView;
    regionView = newRegionView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REGION_VIEW, oldRegionView, regionView));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFloor()
  {
    return floor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloor(String newFloor)
  {
    String oldFloor = floor;
    floor = newFloor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__FLOOR, oldFloor, floor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClientID()
  {
    return clientID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientID(String newClientID)
  {
    String oldClientID = clientID;
    clientID = newClientID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_ID, oldClientID, clientID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType getServiceType()
  {
    return serviceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceType(ServiceType newServiceType)
  {
    ServiceType oldServiceType = serviceType;
    serviceType = newServiceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_TYPE, oldServiceType, serviceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGPSCoordinates()
  {
    return gpsCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGPSCoordinates(String newGPSCoordinates)
  {
    String oldGPSCoordinates = gpsCoordinates;
    gpsCoordinates = newGPSCoordinates;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__GPS_COORDINATES, oldGPSCoordinates, gpsCoordinates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bandwidth getBandwidthupdown()
  {
    return bandwidthupdown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBandwidthupdown(Bandwidth newBandwidthupdown)
  {
    Bandwidth oldBandwidthupdown = bandwidthupdown;
    bandwidthupdown = newBandwidthupdown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN, oldBandwidthupdown, bandwidthupdown));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TechnologyList getTechnology()
  {
    return technology;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTechnology(TechnologyList newTechnology)
  {
    TechnologyList oldTechnology = technology;
    technology = newTechnology;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__TECHNOLOGY, oldTechnology, technology));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServiceStatus()
  {
    return serviceStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceStatus(String newServiceStatus)
  {
    String oldServiceStatus = serviceStatus;
    serviceStatus = newServiceStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_STATUS, oldServiceStatus, serviceStatus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuildingName()
  {
    return buildingName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuildingName(String newBuildingName)
  {
    String oldBuildingName = buildingName;
    buildingName = newBuildingName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_NAME, oldBuildingName, buildingName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuildingID()
  {
    return buildingID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuildingID(String newBuildingID)
  {
    String oldBuildingID = buildingID;
    buildingID = newBuildingID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_ID, oldBuildingID, buildingID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContactPerson()
  {
    return contactPerson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContactPerson(String newContactPerson)
  {
    String oldContactPerson = contactPerson;
    contactPerson = newContactPerson;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTACT_PERSON, oldContactPerson, contactPerson));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMobile()
  {
    return mobile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMobile(String newMobile)
  {
    String oldMobile = mobile;
    mobile = newMobile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__MOBILE, oldMobile, mobile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSector()
  {
    return sector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSector(String newSector)
  {
    String oldSector = sector;
    sector = newSector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SECTOR, oldSector, sector));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmail()
  {
    return email;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmail(String newEmail)
  {
    String oldEmail = email;
    email = newEmail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__EMAIL, oldEmail, email));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getServiceStart()
  {
    return serviceStart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceStart(XMLGregorianCalendar newServiceStart)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newServiceStart != serviceStart)
    { 
      if (serviceStart instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)serviceStart).cancelNotification();
      }
      if (newServiceStart != null)
      {
        newServiceStart = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newServiceStart), this, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_START);
      }
    }
    XMLGregorianCalendar oldServiceStart = serviceStart;
    serviceStart = newServiceStart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_START, oldServiceStart, serviceStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getServiceEnd()
  {
    return serviceEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServiceEnd(XMLGregorianCalendar newServiceEnd)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newServiceEnd != serviceEnd)
    { 
      if (serviceEnd instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)serviceEnd).cancelNotification();
      }
      if (newServiceEnd != null)
      {
        newServiceEnd = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newServiceEnd), this, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_END);
      }
    }
    XMLGregorianCalendar oldServiceEnd = serviceEnd;
    serviceEnd = newServiceEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_END, oldServiceEnd, serviceEnd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getRequestDate()
  {
    return requestDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestDate(XMLGregorianCalendar newRequestDate)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newRequestDate != requestDate)
    { 
      if (requestDate instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)requestDate).cancelNotification();
      }
      if (newRequestDate != null)
      {
        newRequestDate = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newRequestDate), this, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REQUEST_DATE);
      }
    }
    XMLGregorianCalendar oldRequestDate = requestDate;
    requestDate = newRequestDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REQUEST_DATE, oldRequestDate, requestDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getInstallDate()
  {
    return installDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstallDate(XMLGregorianCalendar newInstallDate)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newInstallDate != installDate)
    { 
      if (installDate instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)installDate).cancelNotification();
      }
      if (newInstallDate != null)
      {
        newInstallDate = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newInstallDate), this, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__INSTALL_DATE);
      }
    }
    XMLGregorianCalendar oldInstallDate = installDate;
    installDate = newInstallDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__INSTALL_DATE, oldInstallDate, installDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNotesComments()
  {
    return notesComments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotesComments(String newNotesComments)
  {
    String oldNotesComments = notesComments;
    notesComments = newNotesComments;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__NOTES_COMMENTS, oldNotesComments, notesComments));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID:
        return getSiebelCircuitID();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__PROJECT_MANAGER:
        return getProjectManager();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_NAME:
        return getClientName();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER:
        return getAccountManager();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT:
        return getAccount();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTRACTOR:
        return getContractor();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__LOCATION:
        return getLocation();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REGION_VIEW:
        return getRegionView();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__FLOOR:
        return getFloor();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_ID:
        return getClientID();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_TYPE:
        return getServiceType();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__GPS_COORDINATES:
        return getGPSCoordinates();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN:
        return getBandwidthupdown();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__TECHNOLOGY:
        return getTechnology();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_STATUS:
        return getServiceStatus();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_NAME:
        return getBuildingName();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_ID:
        return getBuildingID();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTACT_PERSON:
        return getContactPerson();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__MOBILE:
        return getMobile();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SECTOR:
        return getSector();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__EMAIL:
        return getEmail();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_START:
        return getServiceStart();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_END:
        return getServiceEnd();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REQUEST_DATE:
        return getRequestDate();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__INSTALL_DATE:
        return getInstallDate();
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__NOTES_COMMENTS:
        return getNotesComments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID:
        setSiebelCircuitID((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__PROJECT_MANAGER:
        setProjectManager((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_NAME:
        setClientName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER:
        setAccountManager((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT:
        setAccount((AccountType)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTRACTOR:
        setContractor((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__LOCATION:
        setLocation((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REGION_VIEW:
        setRegionView((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__FLOOR:
        setFloor((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_ID:
        setClientID((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_TYPE:
        setServiceType((ServiceType)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__GPS_COORDINATES:
        setGPSCoordinates((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN:
        setBandwidthupdown((Bandwidth)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__TECHNOLOGY:
        setTechnology((TechnologyList)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_STATUS:
        setServiceStatus((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_NAME:
        setBuildingName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_ID:
        setBuildingID((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTACT_PERSON:
        setContactPerson((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__MOBILE:
        setMobile((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SECTOR:
        setSector((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__EMAIL:
        setEmail((String)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_START:
        setServiceStart((XMLGregorianCalendar)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_END:
        setServiceEnd((XMLGregorianCalendar)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REQUEST_DATE:
        setRequestDate((XMLGregorianCalendar)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__INSTALL_DATE:
        setInstallDate((XMLGregorianCalendar)newValue);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__NOTES_COMMENTS:
        setNotesComments((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID:
        setSiebelCircuitID(SIEBEL_CIRCUIT_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__PROJECT_MANAGER:
        setProjectManager(PROJECT_MANAGER_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_NAME:
        setClientName(CLIENT_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER:
        setAccountManager(ACCOUNT_MANAGER_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT:
        setAccount(ACCOUNT_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTRACTOR:
        setContractor(CONTRACTOR_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REGION_VIEW:
        setRegionView(REGION_VIEW_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__FLOOR:
        setFloor(FLOOR_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_ID:
        setClientID(CLIENT_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_TYPE:
        setServiceType(SERVICE_TYPE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__GPS_COORDINATES:
        setGPSCoordinates(GPS_COORDINATES_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN:
        setBandwidthupdown(BANDWIDTHUPDOWN_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__TECHNOLOGY:
        setTechnology(TECHNOLOGY_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_STATUS:
        setServiceStatus(SERVICE_STATUS_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_NAME:
        setBuildingName(BUILDING_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_ID:
        setBuildingID(BUILDING_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTACT_PERSON:
        setContactPerson(CONTACT_PERSON_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__MOBILE:
        setMobile(MOBILE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SECTOR:
        setSector(SECTOR_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__EMAIL:
        setEmail(EMAIL_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_START:
        setServiceStart(SERVICE_START_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_END:
        setServiceEnd(SERVICE_END_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REQUEST_DATE:
        setRequestDate(REQUEST_DATE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__INSTALL_DATE:
        setInstallDate(INSTALL_DATE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__NOTES_COMMENTS:
        setNotesComments(NOTES_COMMENTS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SIEBEL_CIRCUIT_ID:
        return SIEBEL_CIRCUIT_ID_EDEFAULT == null ? siebelCircuitID != null : !SIEBEL_CIRCUIT_ID_EDEFAULT.equals(siebelCircuitID);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__PROJECT_MANAGER:
        return PROJECT_MANAGER_EDEFAULT == null ? projectManager != null : !PROJECT_MANAGER_EDEFAULT.equals(projectManager);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_NAME:
        return CLIENT_NAME_EDEFAULT == null ? clientName != null : !CLIENT_NAME_EDEFAULT.equals(clientName);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT_MANAGER:
        return ACCOUNT_MANAGER_EDEFAULT == null ? accountManager != null : !ACCOUNT_MANAGER_EDEFAULT.equals(accountManager);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__ACCOUNT:
        return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTRACTOR:
        return CONTRACTOR_EDEFAULT == null ? contractor != null : !CONTRACTOR_EDEFAULT.equals(contractor);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REGION_VIEW:
        return REGION_VIEW_EDEFAULT == null ? regionView != null : !REGION_VIEW_EDEFAULT.equals(regionView);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__FLOOR:
        return FLOOR_EDEFAULT == null ? floor != null : !FLOOR_EDEFAULT.equals(floor);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CLIENT_ID:
        return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_TYPE:
        return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__GPS_COORDINATES:
        return GPS_COORDINATES_EDEFAULT == null ? gpsCoordinates != null : !GPS_COORDINATES_EDEFAULT.equals(gpsCoordinates);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BANDWIDTHUPDOWN:
        return BANDWIDTHUPDOWN_EDEFAULT == null ? bandwidthupdown != null : !BANDWIDTHUPDOWN_EDEFAULT.equals(bandwidthupdown);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__TECHNOLOGY:
        return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_STATUS:
        return SERVICE_STATUS_EDEFAULT == null ? serviceStatus != null : !SERVICE_STATUS_EDEFAULT.equals(serviceStatus);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_NAME:
        return BUILDING_NAME_EDEFAULT == null ? buildingName != null : !BUILDING_NAME_EDEFAULT.equals(buildingName);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__BUILDING_ID:
        return BUILDING_ID_EDEFAULT == null ? buildingID != null : !BUILDING_ID_EDEFAULT.equals(buildingID);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__CONTACT_PERSON:
        return CONTACT_PERSON_EDEFAULT == null ? contactPerson != null : !CONTACT_PERSON_EDEFAULT.equals(contactPerson);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__MOBILE:
        return MOBILE_EDEFAULT == null ? mobile != null : !MOBILE_EDEFAULT.equals(mobile);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SECTOR:
        return SECTOR_EDEFAULT == null ? sector != null : !SECTOR_EDEFAULT.equals(sector);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__EMAIL:
        return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_START:
        return SERVICE_START_EDEFAULT == null ? serviceStart != null : !SERVICE_START_EDEFAULT.equals(serviceStart);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__SERVICE_END:
        return SERVICE_END_EDEFAULT == null ? serviceEnd != null : !SERVICE_END_EDEFAULT.equals(serviceEnd);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__REQUEST_DATE:
        return REQUEST_DATE_EDEFAULT == null ? requestDate != null : !REQUEST_DATE_EDEFAULT.equals(requestDate);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__INSTALL_DATE:
        return INSTALL_DATE_EDEFAULT == null ? installDate != null : !INSTALL_DATE_EDEFAULT.equals(installDate);
      case Sfc_provisioningbomPackage.PROVISIONING_DATA_MODEL__NOTES_COMMENTS:
        return NOTES_COMMENTS_EDEFAULT == null ? notesComments != null : !NOTES_COMMENTS_EDEFAULT.equals(notesComments);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (siebelCircuitID: ");
    result.append(siebelCircuitID);
    result.append(", projectManager: ");
    result.append(projectManager);
    result.append(", clientName: ");
    result.append(clientName);
    result.append(", accountManager: ");
    result.append(accountManager);
    result.append(", account: ");
    result.append(account);
    result.append(", contractor: ");
    result.append(contractor);
    result.append(", location: ");
    result.append(location);
    result.append(", regionView: ");
    result.append(regionView);
    result.append(", floor: ");
    result.append(floor);
    result.append(", clientID: ");
    result.append(clientID);
    result.append(", serviceType: ");
    result.append(serviceType);
    result.append(", GPSCoordinates: ");
    result.append(gpsCoordinates);
    result.append(", bandwidthupdown: ");
    result.append(bandwidthupdown);
    result.append(", technology: ");
    result.append(technology);
    result.append(", serviceStatus: ");
    result.append(serviceStatus);
    result.append(", buildingName: ");
    result.append(buildingName);
    result.append(", buildingID: ");
    result.append(buildingID);
    result.append(", contactPerson: ");
    result.append(contactPerson);
    result.append(", mobile: ");
    result.append(mobile);
    result.append(", sector: ");
    result.append(sector);
    result.append(", email: ");
    result.append(email);
    result.append(", serviceStart: ");
    result.append(serviceStart);
    result.append(", serviceEnd: ");
    result.append(serviceEnd);
    result.append(", requestDate: ");
    result.append(requestDate);
    result.append(", installDate: ");
    result.append(installDate);
    result.append(", notesComments: ");
    result.append(notesComments);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setSiebelCircuitID(Object value)
  {
    // Call the default set, passing in the converted value
    setSiebelCircuitID(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setProjectManager(Object value)
  {
    // Call the default set, passing in the converted value
    setProjectManager(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setClientName(Object value)
  {
    // Call the default set, passing in the converted value
    setClientName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setAccountManager(Object value)
  {
    // Call the default set, passing in the converted value
    setAccountManager(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setContractor(Object value)
  {
    // Call the default set, passing in the converted value
    setContractor(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setLocation(Object value)
  {
    // Call the default set, passing in the converted value
    setLocation(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setRegionView(Object value)
  {
    // Call the default set, passing in the converted value
    setRegionView(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setFloor(Object value)
  {
    // Call the default set, passing in the converted value
    setFloor(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setClientID(Object value)
  {
    // Call the default set, passing in the converted value
    setClientID(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setGPSCoordinates(Object value)
  {
    // Call the default set, passing in the converted value
    setGPSCoordinates(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setServiceStatus(Object value)
  {
    // Call the default set, passing in the converted value
    setServiceStatus(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setBuildingName(Object value)
  {
    // Call the default set, passing in the converted value
    setBuildingName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setBuildingID(Object value)
  {
    // Call the default set, passing in the converted value
    setBuildingID(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setContactPerson(Object value)
  {
    // Call the default set, passing in the converted value
    setContactPerson(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setMobile(Object value)
  {
    // Call the default set, passing in the converted value
    setMobile(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setSector(Object value)
  {
    // Call the default set, passing in the converted value
    setSector(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setEmail(Object value)
  {
    // Call the default set, passing in the converted value
    setEmail(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setNotesComments(Object value)
  {
    // Call the default set, passing in the converted value
    setNotesComments(BDSTypeConversions.convertToString(value));
  }
} //ProvisioningDataModelImpl

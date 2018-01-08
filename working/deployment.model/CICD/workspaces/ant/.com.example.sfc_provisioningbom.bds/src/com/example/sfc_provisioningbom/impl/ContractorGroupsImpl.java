
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.ContractorGroups;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;

import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contractor Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getLoginName <em>Login Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getContractorGroupName <em>Contractor Group Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getMasterUser <em>Master User</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getEmailID <em>Email ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.ContractorGroupsImpl#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ContractorGroupsImpl extends EObjectImpl implements ContractorGroups
{
  /**
   * The default value of the '{@link #getLoginName() <em>Login Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoginName()
   * @generated
   * @ordered
   */
  protected static final String LOGIN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLoginName() <em>Login Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoginName()
   * @generated
   * @ordered
   */
  protected String loginName = LOGIN_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getContractorGroupName() <em>Contractor Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractorGroupName()
   * @generated
   * @ordered
   */
  protected static final String CONTRACTOR_GROUP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContractorGroupName() <em>Contractor Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContractorGroupName()
   * @generated
   * @ordered
   */
  protected String contractorGroupName = CONTRACTOR_GROUP_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMasterUser() <em>Master User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasterUser()
   * @generated
   * @ordered
   */
  protected static final String MASTER_USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMasterUser() <em>Master User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMasterUser()
   * @generated
   * @ordered
   */
  protected String masterUser = MASTER_USER_EDEFAULT;

  /**
   * The default value of the '{@link #getEmailID() <em>Email ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailID()
   * @generated
   * @ordered
   */
  protected static final String EMAIL_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEmailID() <em>Email ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEmailID()
   * @generated
   * @ordered
   */
  protected String emailID = EMAIL_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getBdsId() <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsId()
   * @generated
   * @ordered
   */
  protected static final Long BDS_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBdsId() <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsId()
   * @generated
   * @ordered
   */
  protected Long bdsId = BDS_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsVersion()
   * @generated
   * @ordered
   */
  protected static final Long BDS_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBdsVersion() <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBdsVersion()
   * @generated
   * @ordered
   */
  protected Long bdsVersion = BDS_VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractorGroupsImpl()
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
    return Sfc_provisioningbomPackage.Literals.CONTRACTOR_GROUPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLoginName()
  {
    return loginName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoginName(String newLoginName)
  {
    String oldLoginName = loginName;
    loginName = newLoginName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LOGIN_NAME, oldLoginName, loginName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContractorGroupName()
  {
    return contractorGroupName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContractorGroupName(String newContractorGroupName)
  {
    String oldContractorGroupName = contractorGroupName;
    contractorGroupName = newContractorGroupName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME, oldContractorGroupName, contractorGroupName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMasterUser()
  {
    return masterUser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMasterUser(String newMasterUser)
  {
    String oldMasterUser = masterUser;
    masterUser = newMasterUser;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__MASTER_USER, oldMasterUser, masterUser));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEmailID()
  {
    return emailID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmailID(String newEmailID)
  {
    String oldEmailID = emailID;
    emailID = newEmailID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__EMAIL_ID, oldEmailID, emailID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Long getBdsId()
  {
    return bdsId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBdsId(Long newBdsId)
  {
    Long oldBdsId = bdsId;
    bdsId = newBdsId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_ID, oldBdsId, bdsId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Long getBdsVersion()
  {
    return bdsVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBdsVersion(Long newBdsVersion)
  {
    Long oldBdsVersion = bdsVersion;
    bdsVersion = newBdsVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_VERSION, oldBdsVersion, bdsVersion));
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
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LOGIN_NAME:
        return getLoginName();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__FIRST_NAME:
        return getFirstName();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LAST_NAME:
        return getLastName();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME:
        return getContractorGroupName();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__MASTER_USER:
        return getMasterUser();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__EMAIL_ID:
        return getEmailID();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_ID:
        return getBdsId();
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_VERSION:
        return getBdsVersion();
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
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LOGIN_NAME:
        setLoginName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LAST_NAME:
        setLastName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME:
        setContractorGroupName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__MASTER_USER:
        setMasterUser((String)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__EMAIL_ID:
        setEmailID((String)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_ID:
        setBdsId((Long)newValue);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_VERSION:
        setBdsVersion((Long)newValue);
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
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LOGIN_NAME:
        setLoginName(LOGIN_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME:
        setContractorGroupName(CONTRACTOR_GROUP_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__MASTER_USER:
        setMasterUser(MASTER_USER_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__EMAIL_ID:
        setEmailID(EMAIL_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_ID:
        setBdsId(BDS_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_VERSION:
        setBdsVersion(BDS_VERSION_EDEFAULT);
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
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LOGIN_NAME:
        return LOGIN_NAME_EDEFAULT == null ? loginName != null : !LOGIN_NAME_EDEFAULT.equals(loginName);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__CONTRACTOR_GROUP_NAME:
        return CONTRACTOR_GROUP_NAME_EDEFAULT == null ? contractorGroupName != null : !CONTRACTOR_GROUP_NAME_EDEFAULT.equals(contractorGroupName);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__MASTER_USER:
        return MASTER_USER_EDEFAULT == null ? masterUser != null : !MASTER_USER_EDEFAULT.equals(masterUser);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__EMAIL_ID:
        return EMAIL_ID_EDEFAULT == null ? emailID != null : !EMAIL_ID_EDEFAULT.equals(emailID);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_ID:
        return BDS_ID_EDEFAULT == null ? bdsId != null : !BDS_ID_EDEFAULT.equals(bdsId);
      case Sfc_provisioningbomPackage.CONTRACTOR_GROUPS__BDS_VERSION:
        return BDS_VERSION_EDEFAULT == null ? bdsVersion != null : !BDS_VERSION_EDEFAULT.equals(bdsVersion);
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
    result.append(" (loginName: ");
    result.append(loginName);
    result.append(", firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(", contractorGroupName: ");
    result.append(contractorGroupName);
    result.append(", masterUser: ");
    result.append(masterUser);
    result.append(", emailID: ");
    result.append(emailID);
    result.append(", bdsId: ");
    result.append(bdsId);
    result.append(", bdsVersion: ");
    result.append(bdsVersion);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setLoginName(Object value)
  {
    // Call the default set, passing in the converted value
    setLoginName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setFirstName(Object value)
  {
    // Call the default set, passing in the converted value
    setFirstName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setLastName(Object value)
  {
    // Call the default set, passing in the converted value
    setLastName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setContractorGroupName(Object value)
  {
    // Call the default set, passing in the converted value
    setContractorGroupName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setMasterUser(Object value)
  {
    // Call the default set, passing in the converted value
    setMasterUser(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setEmailID(Object value)
  {
    // Call the default set, passing in the converted value
    setEmailID(BDSTypeConversions.convertToString(value));
  }
} //ContractorGroupsImpl

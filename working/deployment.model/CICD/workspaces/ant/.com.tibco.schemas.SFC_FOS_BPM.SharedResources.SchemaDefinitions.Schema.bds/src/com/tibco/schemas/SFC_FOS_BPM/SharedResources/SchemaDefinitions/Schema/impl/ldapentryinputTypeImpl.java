
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ldapentryinput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getOrgmodelname <em>Orgmodelname</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryinputTypeImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ldapentryinputTypeImpl extends EObjectImpl implements ldapentryinputType
{
  /**
   * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected static final String FIRSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected String firstname = FIRSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastname()
   * @generated
   * @ordered
   */
  protected static final String LASTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastname()
   * @generated
   * @ordered
   */
  protected String lastname = LASTNAME_EDEFAULT;

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
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected String password = PASSWORD_EDEFAULT;

  /**
   * The default value of the '{@link #getOrgmodelname() <em>Orgmodelname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrgmodelname()
   * @generated
   * @ordered
   */
  protected static final String ORGMODELNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrgmodelname() <em>Orgmodelname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrgmodelname()
   * @generated
   * @ordered
   */
  protected String orgmodelname = ORGMODELNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFlag() <em>Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlag()
   * @generated
   * @ordered
   */
  protected static final String FLAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFlag() <em>Flag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlag()
   * @generated
   * @ordered
   */
  protected String flag = FLAG_EDEFAULT;

  /**
   * The default value of the '{@link #getEntity() <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected static final String ENTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected String entity = ENTITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ldapentryinputTypeImpl()
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
    return SchemaPackage.Literals.LDAPENTRYINPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstname()
  {
    return firstname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstname(String newFirstname)
  {
    String oldFirstname = firstname;
    firstname = newFirstname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__FIRSTNAME, oldFirstname, firstname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastname()
  {
    return lastname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastname(String newLastname)
  {
    String oldLastname = lastname;
    lastname = newLastname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__LASTNAME, oldLastname, lastname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__EMAIL, oldEmail, email));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(String newPassword)
  {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__PASSWORD, oldPassword, password));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrgmodelname()
  {
    return orgmodelname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrgmodelname(String newOrgmodelname)
  {
    String oldOrgmodelname = orgmodelname;
    orgmodelname = newOrgmodelname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__ORGMODELNAME, oldOrgmodelname, orgmodelname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFlag()
  {
    return flag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFlag(String newFlag)
  {
    String oldFlag = flag;
    flag = newFlag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__FLAG, oldFlag, flag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(String newEntity)
  {
    String oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRYINPUT_TYPE__ENTITY, oldEntity, entity));
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
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FIRSTNAME:
        return getFirstname();
      case SchemaPackage.LDAPENTRYINPUT_TYPE__LASTNAME:
        return getLastname();
      case SchemaPackage.LDAPENTRYINPUT_TYPE__EMAIL:
        return getEmail();
      case SchemaPackage.LDAPENTRYINPUT_TYPE__PASSWORD:
        return getPassword();
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ORGMODELNAME:
        return getOrgmodelname();
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FLAG:
        return getFlag();
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ENTITY:
        return getEntity();
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
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FIRSTNAME:
        setFirstname((String)newValue);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__LASTNAME:
        setLastname((String)newValue);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__EMAIL:
        setEmail((String)newValue);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__PASSWORD:
        setPassword((String)newValue);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ORGMODELNAME:
        setOrgmodelname((String)newValue);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FLAG:
        setFlag((String)newValue);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ENTITY:
        setEntity((String)newValue);
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
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FIRSTNAME:
        setFirstname(FIRSTNAME_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__LASTNAME:
        setLastname(LASTNAME_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__EMAIL:
        setEmail(EMAIL_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ORGMODELNAME:
        setOrgmodelname(ORGMODELNAME_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FLAG:
        setFlag(FLAG_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ENTITY:
        setEntity(ENTITY_EDEFAULT);
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
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FIRSTNAME:
        return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
      case SchemaPackage.LDAPENTRYINPUT_TYPE__LASTNAME:
        return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
      case SchemaPackage.LDAPENTRYINPUT_TYPE__EMAIL:
        return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
      case SchemaPackage.LDAPENTRYINPUT_TYPE__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ORGMODELNAME:
        return ORGMODELNAME_EDEFAULT == null ? orgmodelname != null : !ORGMODELNAME_EDEFAULT.equals(orgmodelname);
      case SchemaPackage.LDAPENTRYINPUT_TYPE__FLAG:
        return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
      case SchemaPackage.LDAPENTRYINPUT_TYPE__ENTITY:
        return ENTITY_EDEFAULT == null ? entity != null : !ENTITY_EDEFAULT.equals(entity);
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
    result.append(" (firstname: ");
    result.append(firstname);
    result.append(", lastname: ");
    result.append(lastname);
    result.append(", email: ");
    result.append(email);
    result.append(", password: ");
    result.append(password);
    result.append(", orgmodelname: ");
    result.append(orgmodelname);
    result.append(", flag: ");
    result.append(flag);
    result.append(", entity: ");
    result.append(entity);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setFirstname(Object value)
  {
    // Call the default set, passing in the converted value
    setFirstname(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setLastname(Object value)
  {
    // Call the default set, passing in the converted value
    setLastname(BDSTypeConversions.convertToString(value));
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
  public void setPassword(Object value)
  {
    // Call the default set, passing in the converted value
    setPassword(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setOrgmodelname(Object value)
  {
    // Call the default set, passing in the converted value
    setOrgmodelname(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setFlag(Object value)
  {
    // Call the default set, passing in the converted value
    setFlag(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setEntity(Object value)
  {
    // Call the default set, passing in the converted value
    setEntity(BDSTypeConversions.convertToString(value));
  }
} //ldapentryinputTypeImpl

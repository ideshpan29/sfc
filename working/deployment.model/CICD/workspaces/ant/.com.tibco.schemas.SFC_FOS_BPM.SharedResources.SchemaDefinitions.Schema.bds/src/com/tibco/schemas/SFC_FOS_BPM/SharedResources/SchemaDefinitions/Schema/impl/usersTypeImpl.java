
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>users Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl#getEntityvalue <em>Entityvalue</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.usersTypeImpl#getOrgmodelname <em>Orgmodelname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class usersTypeImpl extends EObjectImpl implements usersType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getEntityvalue() <em>Entityvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityvalue()
   * @generated
   * @ordered
   */
  protected static final String ENTITYVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntityvalue() <em>Entityvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityvalue()
   * @generated
   * @ordered
   */
  protected String entityvalue = ENTITYVALUE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected usersTypeImpl()
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
    return SchemaPackage.Literals.USERS_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.USERS_TYPE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.USERS_TYPE__FLAG, oldFlag, flag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntityvalue()
  {
    return entityvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityvalue(String newEntityvalue)
  {
    String oldEntityvalue = entityvalue;
    entityvalue = newEntityvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.USERS_TYPE__ENTITYVALUE, oldEntityvalue, entityvalue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.USERS_TYPE__ORGMODELNAME, oldOrgmodelname, orgmodelname));
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
      case SchemaPackage.USERS_TYPE__NAME:
        return getName();
      case SchemaPackage.USERS_TYPE__FLAG:
        return getFlag();
      case SchemaPackage.USERS_TYPE__ENTITYVALUE:
        return getEntityvalue();
      case SchemaPackage.USERS_TYPE__ORGMODELNAME:
        return getOrgmodelname();
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
      case SchemaPackage.USERS_TYPE__NAME:
        setName((String)newValue);
        return;
      case SchemaPackage.USERS_TYPE__FLAG:
        setFlag((String)newValue);
        return;
      case SchemaPackage.USERS_TYPE__ENTITYVALUE:
        setEntityvalue((String)newValue);
        return;
      case SchemaPackage.USERS_TYPE__ORGMODELNAME:
        setOrgmodelname((String)newValue);
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
      case SchemaPackage.USERS_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SchemaPackage.USERS_TYPE__FLAG:
        setFlag(FLAG_EDEFAULT);
        return;
      case SchemaPackage.USERS_TYPE__ENTITYVALUE:
        setEntityvalue(ENTITYVALUE_EDEFAULT);
        return;
      case SchemaPackage.USERS_TYPE__ORGMODELNAME:
        setOrgmodelname(ORGMODELNAME_EDEFAULT);
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
      case SchemaPackage.USERS_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SchemaPackage.USERS_TYPE__FLAG:
        return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
      case SchemaPackage.USERS_TYPE__ENTITYVALUE:
        return ENTITYVALUE_EDEFAULT == null ? entityvalue != null : !ENTITYVALUE_EDEFAULT.equals(entityvalue);
      case SchemaPackage.USERS_TYPE__ORGMODELNAME:
        return ORGMODELNAME_EDEFAULT == null ? orgmodelname != null : !ORGMODELNAME_EDEFAULT.equals(orgmodelname);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", flag: ");
    result.append(flag);
    result.append(", entityvalue: ");
    result.append(entityvalue);
    result.append(", orgmodelname: ");
    result.append(orgmodelname);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setName(Object value)
  {
    // Call the default set, passing in the converted value
    setName(BDSTypeConversions.convertToString(value));
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
  public void setEntityvalue(Object value)
  {
    // Call the default set, passing in the converted value
    setEntityvalue(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setOrgmodelname(Object value)
  {
    // Call the default set, passing in the converted value
    setOrgmodelname(BDSTypeConversions.convertToString(value));
  }
} //usersTypeImpl

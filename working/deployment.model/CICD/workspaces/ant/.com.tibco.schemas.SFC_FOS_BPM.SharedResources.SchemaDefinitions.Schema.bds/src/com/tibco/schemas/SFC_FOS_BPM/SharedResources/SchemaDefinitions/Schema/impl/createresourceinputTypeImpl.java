
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>createresourceinput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl#getOrgname <em>Orgname</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceinputTypeImpl#getEntityname <em>Entityname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class createresourceinputTypeImpl extends EObjectImpl implements createresourceinputType
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
   * The default value of the '{@link #getOrgname() <em>Orgname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrgname()
   * @generated
   * @ordered
   */
  protected static final String ORGNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrgname() <em>Orgname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrgname()
   * @generated
   * @ordered
   */
  protected String orgname = ORGNAME_EDEFAULT;

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
   * The default value of the '{@link #getEntityname() <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityname()
   * @generated
   * @ordered
   */
  protected static final String ENTITYNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntityname() <em>Entityname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityname()
   * @generated
   * @ordered
   */
  protected String entityname = ENTITYNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected createresourceinputTypeImpl()
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
    return SchemaPackage.Literals.CREATERESOURCEINPUT_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CREATERESOURCEINPUT_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrgname()
  {
    return orgname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrgname(String newOrgname)
  {
    String oldOrgname = orgname;
    orgname = newOrgname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CREATERESOURCEINPUT_TYPE__ORGNAME, oldOrgname, orgname));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CREATERESOURCEINPUT_TYPE__FLAG, oldFlag, flag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntityname()
  {
    return entityname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityname(String newEntityname)
  {
    String oldEntityname = entityname;
    entityname = newEntityname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CREATERESOURCEINPUT_TYPE__ENTITYNAME, oldEntityname, entityname));
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
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__NAME:
        return getName();
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ORGNAME:
        return getOrgname();
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__FLAG:
        return getFlag();
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ENTITYNAME:
        return getEntityname();
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
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__NAME:
        setName((String)newValue);
        return;
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ORGNAME:
        setOrgname((String)newValue);
        return;
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__FLAG:
        setFlag((String)newValue);
        return;
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ENTITYNAME:
        setEntityname((String)newValue);
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
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ORGNAME:
        setOrgname(ORGNAME_EDEFAULT);
        return;
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__FLAG:
        setFlag(FLAG_EDEFAULT);
        return;
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ENTITYNAME:
        setEntityname(ENTITYNAME_EDEFAULT);
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
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ORGNAME:
        return ORGNAME_EDEFAULT == null ? orgname != null : !ORGNAME_EDEFAULT.equals(orgname);
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__FLAG:
        return FLAG_EDEFAULT == null ? flag != null : !FLAG_EDEFAULT.equals(flag);
      case SchemaPackage.CREATERESOURCEINPUT_TYPE__ENTITYNAME:
        return ENTITYNAME_EDEFAULT == null ? entityname != null : !ENTITYNAME_EDEFAULT.equals(entityname);
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
    result.append(", orgname: ");
    result.append(orgname);
    result.append(", flag: ");
    result.append(flag);
    result.append(", entityname: ");
    result.append(entityname);
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
  public void setOrgname(Object value)
  {
    // Call the default set, passing in the converted value
    setOrgname(BDSTypeConversions.convertToString(value));
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
  public void setEntityname(Object value)
  {
    // Call the default set, passing in the converted value
    setEntityname(BDSTypeConversions.convertToString(value));
  }
} //createresourceinputTypeImpl


package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>searchprocessinstancesinput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesinputTypeImpl#getSearchkey <em>Searchkey</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesinputTypeImpl#getSearchvalue <em>Searchvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class searchprocessinstancesinputTypeImpl extends EObjectImpl implements searchprocessinstancesinputType
{
  /**
   * The default value of the '{@link #getSearchkey() <em>Searchkey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchkey()
   * @generated
   * @ordered
   */
  protected static final String SEARCHKEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSearchkey() <em>Searchkey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchkey()
   * @generated
   * @ordered
   */
  protected String searchkey = SEARCHKEY_EDEFAULT;

  /**
   * The default value of the '{@link #getSearchvalue() <em>Searchvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchvalue()
   * @generated
   * @ordered
   */
  protected static final String SEARCHVALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSearchvalue() <em>Searchvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchvalue()
   * @generated
   * @ordered
   */
  protected String searchvalue = SEARCHVALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected searchprocessinstancesinputTypeImpl()
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
    return SchemaPackage.Literals.SEARCHPROCESSINSTANCESINPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSearchkey()
  {
    return searchkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchkey(String newSearchkey)
  {
    String oldSearchkey = searchkey;
    searchkey = newSearchkey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY, oldSearchkey, searchkey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSearchvalue()
  {
    return searchvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchvalue(String newSearchvalue)
  {
    String oldSearchvalue = searchvalue;
    searchvalue = newSearchvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE, oldSearchvalue, searchvalue));
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
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY:
        return getSearchkey();
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE:
        return getSearchvalue();
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
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY:
        setSearchkey((String)newValue);
        return;
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE:
        setSearchvalue((String)newValue);
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
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY:
        setSearchkey(SEARCHKEY_EDEFAULT);
        return;
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE:
        setSearchvalue(SEARCHVALUE_EDEFAULT);
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
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHKEY:
        return SEARCHKEY_EDEFAULT == null ? searchkey != null : !SEARCHKEY_EDEFAULT.equals(searchkey);
      case SchemaPackage.SEARCHPROCESSINSTANCESINPUT_TYPE__SEARCHVALUE:
        return SEARCHVALUE_EDEFAULT == null ? searchvalue != null : !SEARCHVALUE_EDEFAULT.equals(searchvalue);
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
    result.append(" (searchkey: ");
    result.append(searchkey);
    result.append(", searchvalue: ");
    result.append(searchvalue);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setSearchkey(Object value)
  {
    // Call the default set, passing in the converted value
    setSearchkey(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setSearchvalue(Object value)
  {
    // Call the default set, passing in the converted value
    setSearchvalue(BDSTypeConversions.convertToString(value));
  }
} //searchprocessinstancesinputTypeImpl

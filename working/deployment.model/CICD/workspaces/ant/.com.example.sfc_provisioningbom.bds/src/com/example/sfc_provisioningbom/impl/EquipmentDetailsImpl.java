
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.EquipmentDetails;
import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;

import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.EquipmentDetailsImpl#getVLAN <em>VLAN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class EquipmentDetailsImpl extends EObjectImpl implements EquipmentDetails
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected String address = ADDRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getVLAN() <em>VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVLAN()
   * @generated
   * @ordered
   */
  protected static final String VLAN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVLAN() <em>VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVLAN()
   * @generated
   * @ordered
   */
  protected String vlan = VLAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EquipmentDetailsImpl()
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
    return Sfc_provisioningbomPackage.Literals.EQUIPMENT_DETAILS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(String newAddress)
  {
    String oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__ADDRESS, oldAddress, address));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVLAN()
  {
    return vlan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVLAN(String newVLAN)
  {
    String oldVLAN = vlan;
    vlan = newVLAN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__VLAN, oldVLAN, vlan));
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
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__TYPE:
        return getType();
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__ADDRESS:
        return getAddress();
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__VLAN:
        return getVLAN();
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
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__TYPE:
        setType((String)newValue);
        return;
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__ADDRESS:
        setAddress((String)newValue);
        return;
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__VLAN:
        setVLAN((String)newValue);
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
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__ADDRESS:
        setAddress(ADDRESS_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__VLAN:
        setVLAN(VLAN_EDEFAULT);
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
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__ADDRESS:
        return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
      case Sfc_provisioningbomPackage.EQUIPMENT_DETAILS__VLAN:
        return VLAN_EDEFAULT == null ? vlan != null : !VLAN_EDEFAULT.equals(vlan);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", address: ");
    result.append(address);
    result.append(", VLAN: ");
    result.append(vlan);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setType(Object value)
  {
    // Call the default set, passing in the converted value
    setType(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setAddress(Object value)
  {
    // Call the default set, passing in the converted value
    setAddress(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setVLAN(Object value)
  {
    // Call the default set, passing in the converted value
    setVLAN(BDSTypeConversions.convertToString(value));
  }
} //EquipmentDetailsImpl

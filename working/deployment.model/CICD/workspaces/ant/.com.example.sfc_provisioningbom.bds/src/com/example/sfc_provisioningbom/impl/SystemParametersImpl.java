
package com.example.sfc_provisioningbom.impl;

import com.example.sfc_provisioningbom.Sfc_provisioningbomPackage;
import com.example.sfc_provisioningbom.SystemParameters;

import com.example.sfc_provisioningbom.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SystemParametersImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SystemParametersImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SystemParametersImpl#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.impl.SystemParametersImpl#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class SystemParametersImpl extends EObjectImpl implements SystemParameters
{
  /**
   * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyName()
   * @generated
   * @ordered
   */
  protected String propertyName = PROPERTY_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

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
  protected SystemParametersImpl()
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
    return Sfc_provisioningbomPackage.Literals.SYSTEM_PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyName()
  {
    return propertyName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyName(String newPropertyName)
  {
    String oldPropertyName = propertyName;
    propertyName = newPropertyName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_NAME, oldPropertyName, propertyName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPropertyValue()
  {
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyValue(String newPropertyValue)
  {
    String oldPropertyValue = propertyValue;
    propertyValue = newPropertyValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_VALUE, oldPropertyValue, propertyValue));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_ID, oldBdsId, bdsId));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_VERSION, oldBdsVersion, bdsVersion));
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
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_NAME:
        return getPropertyName();
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_VALUE:
        return getPropertyValue();
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_ID:
        return getBdsId();
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_VERSION:
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
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_NAME:
        setPropertyName((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_VALUE:
        setPropertyValue((String)newValue);
        return;
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_ID:
        setBdsId((Long)newValue);
        return;
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_VERSION:
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
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_NAME:
        setPropertyName(PROPERTY_NAME_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_VALUE:
        setPropertyValue(PROPERTY_VALUE_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_ID:
        setBdsId(BDS_ID_EDEFAULT);
        return;
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_VERSION:
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
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_NAME:
        return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__PROPERTY_VALUE:
        return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_ID:
        return BDS_ID_EDEFAULT == null ? bdsId != null : !BDS_ID_EDEFAULT.equals(bdsId);
      case Sfc_provisioningbomPackage.SYSTEM_PARAMETERS__BDS_VERSION:
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
    result.append(" (propertyName: ");
    result.append(propertyName);
    result.append(", propertyValue: ");
    result.append(propertyValue);
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
  public void setPropertyName(Object value)
  {
    // Call the default set, passing in the converted value
    setPropertyName(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setPropertyValue(Object value)
  {
    // Call the default set, passing in the converted value
    setPropertyValue(BDSTypeConversions.convertToString(value));
  }
} //SystemParametersImpl


package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>workitemcompletioninput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletioninputTypeImpl#getSibelcircuitid <em>Sibelcircuitid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class workitemcompletioninputTypeImpl extends EObjectImpl implements workitemcompletioninputType
{
  /**
   * The default value of the '{@link #getSibelcircuitid() <em>Sibelcircuitid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSibelcircuitid()
   * @generated
   * @ordered
   */
  protected static final String SIBELCIRCUITID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSibelcircuitid() <em>Sibelcircuitid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSibelcircuitid()
   * @generated
   * @ordered
   */
  protected String sibelcircuitid = SIBELCIRCUITID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected workitemcompletioninputTypeImpl()
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
    return SchemaPackage.Literals.WORKITEMCOMPLETIONINPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSibelcircuitid()
  {
    return sibelcircuitid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSibelcircuitid(String newSibelcircuitid)
  {
    String oldSibelcircuitid = sibelcircuitid;
    sibelcircuitid = newSibelcircuitid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID, oldSibelcircuitid, sibelcircuitid));
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
      case SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID:
        return getSibelcircuitid();
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
      case SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID:
        setSibelcircuitid((String)newValue);
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
      case SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID:
        setSibelcircuitid(SIBELCIRCUITID_EDEFAULT);
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
      case SchemaPackage.WORKITEMCOMPLETIONINPUT_TYPE__SIBELCIRCUITID:
        return SIBELCIRCUITID_EDEFAULT == null ? sibelcircuitid != null : !SIBELCIRCUITID_EDEFAULT.equals(sibelcircuitid);
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
    result.append(" (sibelcircuitid: ");
    result.append(sibelcircuitid);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setSibelcircuitid(Object value)
  {
    // Call the default set, passing in the converted value
    setSibelcircuitid(BDSTypeConversions.convertToString(value));
  }
} //workitemcompletioninputTypeImpl

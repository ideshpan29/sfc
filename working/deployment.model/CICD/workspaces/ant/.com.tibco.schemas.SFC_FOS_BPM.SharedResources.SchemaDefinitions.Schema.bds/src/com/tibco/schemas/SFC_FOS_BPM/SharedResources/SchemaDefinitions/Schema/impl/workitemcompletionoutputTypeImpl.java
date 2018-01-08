
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>workitemcompletionoutput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionoutputTypeImpl#getOutputmessage <em>Outputmessage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class workitemcompletionoutputTypeImpl extends EObjectImpl implements workitemcompletionoutputType
{
  /**
   * The default value of the '{@link #getOutputmessage() <em>Outputmessage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputmessage()
   * @generated
   * @ordered
   */
  protected static final String OUTPUTMESSAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOutputmessage() <em>Outputmessage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputmessage()
   * @generated
   * @ordered
   */
  protected String outputmessage = OUTPUTMESSAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected workitemcompletionoutputTypeImpl()
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
    return SchemaPackage.Literals.WORKITEMCOMPLETIONOUTPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOutputmessage()
  {
    return outputmessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputmessage(String newOutputmessage)
  {
    String oldOutputmessage = outputmessage;
    outputmessage = newOutputmessage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE, oldOutputmessage, outputmessage));
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
      case SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE:
        return getOutputmessage();
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
      case SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE:
        setOutputmessage((String)newValue);
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
      case SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE:
        setOutputmessage(OUTPUTMESSAGE_EDEFAULT);
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
      case SchemaPackage.WORKITEMCOMPLETIONOUTPUT_TYPE__OUTPUTMESSAGE:
        return OUTPUTMESSAGE_EDEFAULT == null ? outputmessage != null : !OUTPUTMESSAGE_EDEFAULT.equals(outputmessage);
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
    result.append(" (outputmessage: ");
    result.append(outputmessage);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setOutputmessage(Object value)
  {
    // Call the default set, passing in the converted value
    setOutputmessage(BDSTypeConversions.convertToString(value));
  }
} //workitemcompletionoutputTypeImpl

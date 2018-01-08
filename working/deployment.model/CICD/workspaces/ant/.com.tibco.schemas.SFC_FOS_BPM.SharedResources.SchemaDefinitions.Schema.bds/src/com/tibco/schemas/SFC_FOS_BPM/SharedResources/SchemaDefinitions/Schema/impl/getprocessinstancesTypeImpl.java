
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>getprocessinstances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesTypeImpl#getGetprocessinstancesinput <em>Getprocessinstancesinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesTypeImpl#getGetprocessinstancesoutput <em>Getprocessinstancesoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class getprocessinstancesTypeImpl extends EObjectImpl implements getprocessinstancesType
{
  /**
   * The cached value of the '{@link #getGetprocessinstancesinput() <em>Getprocessinstancesinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetprocessinstancesinput()
   * @generated
   * @ordered
   */
  protected getprocessinstancesinputType getprocessinstancesinput;

  /**
   * The cached value of the '{@link #getGetprocessinstancesoutput() <em>Getprocessinstancesoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetprocessinstancesoutput()
   * @generated
   * @ordered
   */
  protected getprocessinstancesoutputType getprocessinstancesoutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected getprocessinstancesTypeImpl()
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
    return SchemaPackage.Literals.GETPROCESSINSTANCES_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesinputType getGetprocessinstancesinput()
  {
    return getprocessinstancesinput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesinput(getprocessinstancesinputType newGetprocessinstancesinput, NotificationChain msgs)
  {
    getprocessinstancesinputType oldGetprocessinstancesinput = getprocessinstancesinput;
    getprocessinstancesinput = newGetprocessinstancesinput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT, oldGetprocessinstancesinput, newGetprocessinstancesinput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesinput(getprocessinstancesinputType newGetprocessinstancesinput)
  {
    if (newGetprocessinstancesinput != getprocessinstancesinput)
    {
      NotificationChain msgs = null;
      if (getprocessinstancesinput != null)
        msgs = ((InternalEObject)getprocessinstancesinput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT, null, msgs);
      if (newGetprocessinstancesinput != null)
        msgs = ((InternalEObject)newGetprocessinstancesinput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT, null, msgs);
      msgs = basicSetGetprocessinstancesinput(newGetprocessinstancesinput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT, newGetprocessinstancesinput, newGetprocessinstancesinput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesoutputType getGetprocessinstancesoutput()
  {
    return getprocessinstancesoutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstancesoutput(getprocessinstancesoutputType newGetprocessinstancesoutput, NotificationChain msgs)
  {
    getprocessinstancesoutputType oldGetprocessinstancesoutput = getprocessinstancesoutput;
    getprocessinstancesoutput = newGetprocessinstancesoutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT, oldGetprocessinstancesoutput, newGetprocessinstancesoutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstancesoutput(getprocessinstancesoutputType newGetprocessinstancesoutput)
  {
    if (newGetprocessinstancesoutput != getprocessinstancesoutput)
    {
      NotificationChain msgs = null;
      if (getprocessinstancesoutput != null)
        msgs = ((InternalEObject)getprocessinstancesoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT, null, msgs);
      if (newGetprocessinstancesoutput != null)
        msgs = ((InternalEObject)newGetprocessinstancesoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT, null, msgs);
      msgs = basicSetGetprocessinstancesoutput(newGetprocessinstancesoutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT, newGetprocessinstancesoutput, newGetprocessinstancesoutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT:
        return basicSetGetprocessinstancesinput(null, msgs);
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT:
        return basicSetGetprocessinstancesoutput(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT:
        return getGetprocessinstancesinput();
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT:
        return getGetprocessinstancesoutput();
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
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT:
        setGetprocessinstancesinput((getprocessinstancesinputType)newValue);
        return;
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT:
        setGetprocessinstancesoutput((getprocessinstancesoutputType)newValue);
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
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT:
        setGetprocessinstancesinput((getprocessinstancesinputType)null);
        return;
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT:
        setGetprocessinstancesoutput((getprocessinstancesoutputType)null);
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
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESINPUT:
        return getprocessinstancesinput != null;
      case SchemaPackage.GETPROCESSINSTANCES_TYPE__GETPROCESSINSTANCESOUTPUT:
        return getprocessinstancesoutput != null;
    }
    return super.eIsSet(featureID);
  }

} //getprocessinstancesTypeImpl

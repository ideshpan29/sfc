
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>reportgeneration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reportgenerationTypeImpl#getGetprocessinstances <em>Getprocessinstances</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reportgenerationTypeImpl#getSearchprocessinstances <em>Searchprocessinstances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class reportgenerationTypeImpl extends EObjectImpl implements reportgenerationType
{
  /**
   * The cached value of the '{@link #getGetprocessinstances() <em>Getprocessinstances</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetprocessinstances()
   * @generated
   * @ordered
   */
  protected getprocessinstancesType getprocessinstances;

  /**
   * The cached value of the '{@link #getSearchprocessinstances() <em>Searchprocessinstances</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchprocessinstances()
   * @generated
   * @ordered
   */
  protected searchprocessinstancesType searchprocessinstances;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected reportgenerationTypeImpl()
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
    return SchemaPackage.Literals.REPORTGENERATION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public getprocessinstancesType getGetprocessinstances()
  {
    return getprocessinstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetprocessinstances(getprocessinstancesType newGetprocessinstances, NotificationChain msgs)
  {
    getprocessinstancesType oldGetprocessinstances = getprocessinstances;
    getprocessinstances = newGetprocessinstances;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES, oldGetprocessinstances, newGetprocessinstances);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetprocessinstances(getprocessinstancesType newGetprocessinstances)
  {
    if (newGetprocessinstances != getprocessinstances)
    {
      NotificationChain msgs = null;
      if (getprocessinstances != null)
        msgs = ((InternalEObject)getprocessinstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES, null, msgs);
      if (newGetprocessinstances != null)
        msgs = ((InternalEObject)newGetprocessinstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES, null, msgs);
      msgs = basicSetGetprocessinstances(newGetprocessinstances, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES, newGetprocessinstances, newGetprocessinstances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesType getSearchprocessinstances()
  {
    return searchprocessinstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstances(searchprocessinstancesType newSearchprocessinstances, NotificationChain msgs)
  {
    searchprocessinstancesType oldSearchprocessinstances = searchprocessinstances;
    searchprocessinstances = newSearchprocessinstances;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES, oldSearchprocessinstances, newSearchprocessinstances);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstances(searchprocessinstancesType newSearchprocessinstances)
  {
    if (newSearchprocessinstances != searchprocessinstances)
    {
      NotificationChain msgs = null;
      if (searchprocessinstances != null)
        msgs = ((InternalEObject)searchprocessinstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES, null, msgs);
      if (newSearchprocessinstances != null)
        msgs = ((InternalEObject)newSearchprocessinstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES, null, msgs);
      msgs = basicSetSearchprocessinstances(newSearchprocessinstances, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES, newSearchprocessinstances, newSearchprocessinstances));
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
      case SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES:
        return basicSetGetprocessinstances(null, msgs);
      case SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES:
        return basicSetSearchprocessinstances(null, msgs);
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
      case SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES:
        return getGetprocessinstances();
      case SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES:
        return getSearchprocessinstances();
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
      case SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES:
        setGetprocessinstances((getprocessinstancesType)newValue);
        return;
      case SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES:
        setSearchprocessinstances((searchprocessinstancesType)newValue);
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
      case SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES:
        setGetprocessinstances((getprocessinstancesType)null);
        return;
      case SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES:
        setSearchprocessinstances((searchprocessinstancesType)null);
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
      case SchemaPackage.REPORTGENERATION_TYPE__GETPROCESSINSTANCES:
        return getprocessinstances != null;
      case SchemaPackage.REPORTGENERATION_TYPE__SEARCHPROCESSINSTANCES:
        return searchprocessinstances != null;
    }
    return super.eIsSet(featureID);
  }

} //reportgenerationTypeImpl

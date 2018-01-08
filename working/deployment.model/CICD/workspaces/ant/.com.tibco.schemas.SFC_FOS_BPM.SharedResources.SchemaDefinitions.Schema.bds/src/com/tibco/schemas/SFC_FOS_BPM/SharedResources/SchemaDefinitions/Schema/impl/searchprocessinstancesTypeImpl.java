
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>searchprocessinstances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesTypeImpl#getSearchprocessinstancesinput <em>Searchprocessinstancesinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesTypeImpl#getSearchprocessinstancesoutput <em>Searchprocessinstancesoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class searchprocessinstancesTypeImpl extends EObjectImpl implements searchprocessinstancesType
{
  /**
   * The cached value of the '{@link #getSearchprocessinstancesinput() <em>Searchprocessinstancesinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchprocessinstancesinput()
   * @generated
   * @ordered
   */
  protected searchprocessinstancesinputType searchprocessinstancesinput;

  /**
   * The cached value of the '{@link #getSearchprocessinstancesoutput() <em>Searchprocessinstancesoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchprocessinstancesoutput()
   * @generated
   * @ordered
   */
  protected searchprocessinstancesoutputType searchprocessinstancesoutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected searchprocessinstancesTypeImpl()
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
    return SchemaPackage.Literals.SEARCHPROCESSINSTANCES_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesinputType getSearchprocessinstancesinput()
  {
    return searchprocessinstancesinput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesinput(searchprocessinstancesinputType newSearchprocessinstancesinput, NotificationChain msgs)
  {
    searchprocessinstancesinputType oldSearchprocessinstancesinput = searchprocessinstancesinput;
    searchprocessinstancesinput = newSearchprocessinstancesinput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT, oldSearchprocessinstancesinput, newSearchprocessinstancesinput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesinput(searchprocessinstancesinputType newSearchprocessinstancesinput)
  {
    if (newSearchprocessinstancesinput != searchprocessinstancesinput)
    {
      NotificationChain msgs = null;
      if (searchprocessinstancesinput != null)
        msgs = ((InternalEObject)searchprocessinstancesinput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT, null, msgs);
      if (newSearchprocessinstancesinput != null)
        msgs = ((InternalEObject)newSearchprocessinstancesinput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT, null, msgs);
      msgs = basicSetSearchprocessinstancesinput(newSearchprocessinstancesinput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT, newSearchprocessinstancesinput, newSearchprocessinstancesinput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public searchprocessinstancesoutputType getSearchprocessinstancesoutput()
  {
    return searchprocessinstancesoutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchprocessinstancesoutput(searchprocessinstancesoutputType newSearchprocessinstancesoutput, NotificationChain msgs)
  {
    searchprocessinstancesoutputType oldSearchprocessinstancesoutput = searchprocessinstancesoutput;
    searchprocessinstancesoutput = newSearchprocessinstancesoutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT, oldSearchprocessinstancesoutput, newSearchprocessinstancesoutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchprocessinstancesoutput(searchprocessinstancesoutputType newSearchprocessinstancesoutput)
  {
    if (newSearchprocessinstancesoutput != searchprocessinstancesoutput)
    {
      NotificationChain msgs = null;
      if (searchprocessinstancesoutput != null)
        msgs = ((InternalEObject)searchprocessinstancesoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT, null, msgs);
      if (newSearchprocessinstancesoutput != null)
        msgs = ((InternalEObject)newSearchprocessinstancesoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT, null, msgs);
      msgs = basicSetSearchprocessinstancesoutput(newSearchprocessinstancesoutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT, newSearchprocessinstancesoutput, newSearchprocessinstancesoutput));
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
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT:
        return basicSetSearchprocessinstancesinput(null, msgs);
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT:
        return basicSetSearchprocessinstancesoutput(null, msgs);
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
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT:
        return getSearchprocessinstancesinput();
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT:
        return getSearchprocessinstancesoutput();
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
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT:
        setSearchprocessinstancesinput((searchprocessinstancesinputType)newValue);
        return;
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT:
        setSearchprocessinstancesoutput((searchprocessinstancesoutputType)newValue);
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
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT:
        setSearchprocessinstancesinput((searchprocessinstancesinputType)null);
        return;
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT:
        setSearchprocessinstancesoutput((searchprocessinstancesoutputType)null);
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
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESINPUT:
        return searchprocessinstancesinput != null;
      case SchemaPackage.SEARCHPROCESSINSTANCES_TYPE__SEARCHPROCESSINSTANCESOUTPUT:
        return searchprocessinstancesoutput != null;
    }
    return super.eIsSet(featureID);
  }

} //searchprocessinstancesTypeImpl

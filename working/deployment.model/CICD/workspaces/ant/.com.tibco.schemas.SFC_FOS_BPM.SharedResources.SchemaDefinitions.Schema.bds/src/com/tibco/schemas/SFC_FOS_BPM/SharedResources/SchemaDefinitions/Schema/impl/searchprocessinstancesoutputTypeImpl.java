
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>searchprocessinstancesoutput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.searchprocessinstancesoutputTypeImpl#getSearchrecord <em>Searchrecord</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class searchprocessinstancesoutputTypeImpl extends EObjectImpl implements searchprocessinstancesoutputType
{
  /**
   * The cached value of the '{@link #getSearchrecord() <em>Searchrecord</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSearchrecord()
   * @generated
   * @ordered
   */
  protected EList<searchrecordType> searchrecord;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected searchprocessinstancesoutputTypeImpl()
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
    return SchemaPackage.Literals.SEARCHPROCESSINSTANCESOUTPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<searchrecordType> getSearchrecord()
  {
    if (searchrecord == null)
    {
      searchrecord = new BDSEObjectContainmentEList<searchrecordType>(searchrecordType.class, this, SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD);
    }
    return searchrecord;
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
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD:
        return ((InternalEList<?>)getSearchrecord()).basicRemove(otherEnd, msgs);
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
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD:
        return getSearchrecord();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD:
        getSearchrecord().clear();
        getSearchrecord().addAll((Collection<? extends searchrecordType>)newValue);
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
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD:
        getSearchrecord().clear();
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
      case SchemaPackage.SEARCHPROCESSINSTANCESOUTPUT_TYPE__SEARCHRECORD:
        return searchrecord != null && !searchrecord.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //searchprocessinstancesoutputTypeImpl

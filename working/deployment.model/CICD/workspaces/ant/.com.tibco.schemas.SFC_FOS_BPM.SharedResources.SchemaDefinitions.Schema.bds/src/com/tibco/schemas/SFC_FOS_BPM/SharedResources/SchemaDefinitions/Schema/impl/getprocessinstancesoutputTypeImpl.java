
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType;

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
 * An implementation of the model object '<em><b>getprocessinstancesoutput Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl#getPi_complete <em>Pi complete</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl#getPi_started <em>Pi started</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl#getPi_halted <em>Pi halted</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.getprocessinstancesoutputTypeImpl#getPi_cancelled <em>Pi cancelled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class getprocessinstancesoutputTypeImpl extends EObjectImpl implements getprocessinstancesoutputType
{
  /**
   * The cached value of the '{@link #getPi_complete() <em>Pi complete</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPi_complete()
   * @generated
   * @ordered
   */
  protected EList<pi_completeType> pi_complete;

  /**
   * The cached value of the '{@link #getPi_started() <em>Pi started</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPi_started()
   * @generated
   * @ordered
   */
  protected EList<pi_startedType> pi_started;

  /**
   * The cached value of the '{@link #getPi_halted() <em>Pi halted</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPi_halted()
   * @generated
   * @ordered
   */
  protected EList<pi_haltedType> pi_halted;

  /**
   * The cached value of the '{@link #getPi_cancelled() <em>Pi cancelled</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPi_cancelled()
   * @generated
   * @ordered
   */
  protected EList<pi_cancelledType> pi_cancelled;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected getprocessinstancesoutputTypeImpl()
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
    return SchemaPackage.Literals.GETPROCESSINSTANCESOUTPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<pi_completeType> getPi_complete()
  {
    if (pi_complete == null)
    {
      pi_complete = new BDSEObjectContainmentEList<pi_completeType>(pi_completeType.class, this, SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE);
    }
    return pi_complete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<pi_startedType> getPi_started()
  {
    if (pi_started == null)
    {
      pi_started = new BDSEObjectContainmentEList<pi_startedType>(pi_startedType.class, this, SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED);
    }
    return pi_started;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<pi_haltedType> getPi_halted()
  {
    if (pi_halted == null)
    {
      pi_halted = new BDSEObjectContainmentEList<pi_haltedType>(pi_haltedType.class, this, SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED);
    }
    return pi_halted;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<pi_cancelledType> getPi_cancelled()
  {
    if (pi_cancelled == null)
    {
      pi_cancelled = new BDSEObjectContainmentEList<pi_cancelledType>(pi_cancelledType.class, this, SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED);
    }
    return pi_cancelled;
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
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE:
        return ((InternalEList<?>)getPi_complete()).basicRemove(otherEnd, msgs);
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED:
        return ((InternalEList<?>)getPi_started()).basicRemove(otherEnd, msgs);
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED:
        return ((InternalEList<?>)getPi_halted()).basicRemove(otherEnd, msgs);
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED:
        return ((InternalEList<?>)getPi_cancelled()).basicRemove(otherEnd, msgs);
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
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE:
        return getPi_complete();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED:
        return getPi_started();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED:
        return getPi_halted();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED:
        return getPi_cancelled();
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
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE:
        getPi_complete().clear();
        getPi_complete().addAll((Collection<? extends pi_completeType>)newValue);
        return;
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED:
        getPi_started().clear();
        getPi_started().addAll((Collection<? extends pi_startedType>)newValue);
        return;
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED:
        getPi_halted().clear();
        getPi_halted().addAll((Collection<? extends pi_haltedType>)newValue);
        return;
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED:
        getPi_cancelled().clear();
        getPi_cancelled().addAll((Collection<? extends pi_cancelledType>)newValue);
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
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE:
        getPi_complete().clear();
        return;
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED:
        getPi_started().clear();
        return;
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED:
        getPi_halted().clear();
        return;
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED:
        getPi_cancelled().clear();
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
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_COMPLETE:
        return pi_complete != null && !pi_complete.isEmpty();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_STARTED:
        return pi_started != null && !pi_started.isEmpty();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_HALTED:
        return pi_halted != null && !pi_halted.isEmpty();
      case SchemaPackage.GETPROCESSINSTANCESOUTPUT_TYPE__PI_CANCELLED:
        return pi_cancelled != null && !pi_cancelled.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //getprocessinstancesoutputTypeImpl

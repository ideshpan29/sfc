
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionoutputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>workitemcompletion Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionTypeImpl#getWorkitemcompletioninput <em>Workitemcompletioninput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.workitemcompletionTypeImpl#getWorkitemcompletionoutput <em>Workitemcompletionoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class workitemcompletionTypeImpl extends EObjectImpl implements workitemcompletionType
{
  /**
   * The cached value of the '{@link #getWorkitemcompletioninput() <em>Workitemcompletioninput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkitemcompletioninput()
   * @generated
   * @ordered
   */
  protected workitemcompletioninputType workitemcompletioninput;

  /**
   * The cached value of the '{@link #getWorkitemcompletionoutput() <em>Workitemcompletionoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkitemcompletionoutput()
   * @generated
   * @ordered
   */
  protected workitemcompletionoutputType workitemcompletionoutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected workitemcompletionTypeImpl()
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
    return SchemaPackage.Literals.WORKITEMCOMPLETION_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletioninputType getWorkitemcompletioninput()
  {
    return workitemcompletioninput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletioninput(workitemcompletioninputType newWorkitemcompletioninput, NotificationChain msgs)
  {
    workitemcompletioninputType oldWorkitemcompletioninput = workitemcompletioninput;
    workitemcompletioninput = newWorkitemcompletioninput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT, oldWorkitemcompletioninput, newWorkitemcompletioninput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletioninput(workitemcompletioninputType newWorkitemcompletioninput)
  {
    if (newWorkitemcompletioninput != workitemcompletioninput)
    {
      NotificationChain msgs = null;
      if (workitemcompletioninput != null)
        msgs = ((InternalEObject)workitemcompletioninput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT, null, msgs);
      if (newWorkitemcompletioninput != null)
        msgs = ((InternalEObject)newWorkitemcompletioninput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT, null, msgs);
      msgs = basicSetWorkitemcompletioninput(newWorkitemcompletioninput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT, newWorkitemcompletioninput, newWorkitemcompletioninput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionoutputType getWorkitemcompletionoutput()
  {
    return workitemcompletionoutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletionoutput(workitemcompletionoutputType newWorkitemcompletionoutput, NotificationChain msgs)
  {
    workitemcompletionoutputType oldWorkitemcompletionoutput = workitemcompletionoutput;
    workitemcompletionoutput = newWorkitemcompletionoutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT, oldWorkitemcompletionoutput, newWorkitemcompletionoutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletionoutput(workitemcompletionoutputType newWorkitemcompletionoutput)
  {
    if (newWorkitemcompletionoutput != workitemcompletionoutput)
    {
      NotificationChain msgs = null;
      if (workitemcompletionoutput != null)
        msgs = ((InternalEObject)workitemcompletionoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT, null, msgs);
      if (newWorkitemcompletionoutput != null)
        msgs = ((InternalEObject)newWorkitemcompletionoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT, null, msgs);
      msgs = basicSetWorkitemcompletionoutput(newWorkitemcompletionoutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT, newWorkitemcompletionoutput, newWorkitemcompletionoutput));
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
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT:
        return basicSetWorkitemcompletioninput(null, msgs);
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT:
        return basicSetWorkitemcompletionoutput(null, msgs);
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
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT:
        return getWorkitemcompletioninput();
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT:
        return getWorkitemcompletionoutput();
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
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT:
        setWorkitemcompletioninput((workitemcompletioninputType)newValue);
        return;
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT:
        setWorkitemcompletionoutput((workitemcompletionoutputType)newValue);
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
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT:
        setWorkitemcompletioninput((workitemcompletioninputType)null);
        return;
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT:
        setWorkitemcompletionoutput((workitemcompletionoutputType)null);
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
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONINPUT:
        return workitemcompletioninput != null;
      case SchemaPackage.WORKITEMCOMPLETION_TYPE__WORKITEMCOMPLETIONOUTPUT:
        return workitemcompletionoutput != null;
    }
    return super.eIsSet(featureID);
  }

} //workitemcompletionTypeImpl

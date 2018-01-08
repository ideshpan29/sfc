
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>createresource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceTypeImpl#getCreateresourceinput <em>Createresourceinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.createresourceTypeImpl#getCreateresourceoutput <em>Createresourceoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class createresourceTypeImpl extends EObjectImpl implements createresourceType
{
  /**
   * The cached value of the '{@link #getCreateresourceinput() <em>Createresourceinput</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateresourceinput()
   * @generated
   * @ordered
   */
  protected EList<createresourceinputType> createresourceinput;

  /**
   * The cached value of the '{@link #getCreateresourceoutput() <em>Createresourceoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateresourceoutput()
   * @generated
   * @ordered
   */
  protected createresourceoutputType createresourceoutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected createresourceTypeImpl()
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
    return SchemaPackage.Literals.CREATERESOURCE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<createresourceinputType> getCreateresourceinput()
  {
    if (createresourceinput == null)
    {
      createresourceinput = new BDSEObjectContainmentEList<createresourceinputType>(createresourceinputType.class, this, SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEINPUT);
    }
    return createresourceinput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceoutputType getCreateresourceoutput()
  {
    return createresourceoutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresourceoutput(createresourceoutputType newCreateresourceoutput, NotificationChain msgs)
  {
    createresourceoutputType oldCreateresourceoutput = createresourceoutput;
    createresourceoutput = newCreateresourceoutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT, oldCreateresourceoutput, newCreateresourceoutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresourceoutput(createresourceoutputType newCreateresourceoutput)
  {
    if (newCreateresourceoutput != createresourceoutput)
    {
      NotificationChain msgs = null;
      if (createresourceoutput != null)
        msgs = ((InternalEObject)createresourceoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT, null, msgs);
      if (newCreateresourceoutput != null)
        msgs = ((InternalEObject)newCreateresourceoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT, null, msgs);
      msgs = basicSetCreateresourceoutput(newCreateresourceoutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT, newCreateresourceoutput, newCreateresourceoutput));
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
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEINPUT:
        return ((InternalEList<?>)getCreateresourceinput()).basicRemove(otherEnd, msgs);
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT:
        return basicSetCreateresourceoutput(null, msgs);
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
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEINPUT:
        return getCreateresourceinput();
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT:
        return getCreateresourceoutput();
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
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEINPUT:
        getCreateresourceinput().clear();
        getCreateresourceinput().addAll((Collection<? extends createresourceinputType>)newValue);
        return;
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT:
        setCreateresourceoutput((createresourceoutputType)newValue);
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
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEINPUT:
        getCreateresourceinput().clear();
        return;
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT:
        setCreateresourceoutput((createresourceoutputType)null);
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
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEINPUT:
        return createresourceinput != null && !createresourceinput.isEmpty();
      case SchemaPackage.CREATERESOURCE_TYPE__CREATERESOURCEOUTPUT:
        return createresourceoutput != null;
    }
    return super.eIsSet(featureID);
  }

} //createresourceTypeImpl

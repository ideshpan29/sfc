
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceoutputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>fetchresource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceTypeImpl#getFetchresourceinput <em>Fetchresourceinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.fetchresourceTypeImpl#getFetchresourceoutput <em>Fetchresourceoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class fetchresourceTypeImpl extends EObjectImpl implements fetchresourceType
{
  /**
   * The cached value of the '{@link #getFetchresourceinput() <em>Fetchresourceinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetchresourceinput()
   * @generated
   * @ordered
   */
  protected fetchresourceinputType fetchresourceinput;

  /**
   * The cached value of the '{@link #getFetchresourceoutput() <em>Fetchresourceoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetchresourceoutput()
   * @generated
   * @ordered
   */
  protected fetchresourceoutputType fetchresourceoutput;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected fetchresourceTypeImpl()
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
    return SchemaPackage.Literals.FETCHRESOURCE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceinputType getFetchresourceinput()
  {
    return fetchresourceinput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceinput(fetchresourceinputType newFetchresourceinput, NotificationChain msgs)
  {
    fetchresourceinputType oldFetchresourceinput = fetchresourceinput;
    fetchresourceinput = newFetchresourceinput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT, oldFetchresourceinput, newFetchresourceinput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceinput(fetchresourceinputType newFetchresourceinput)
  {
    if (newFetchresourceinput != fetchresourceinput)
    {
      NotificationChain msgs = null;
      if (fetchresourceinput != null)
        msgs = ((InternalEObject)fetchresourceinput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT, null, msgs);
      if (newFetchresourceinput != null)
        msgs = ((InternalEObject)newFetchresourceinput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT, null, msgs);
      msgs = basicSetFetchresourceinput(newFetchresourceinput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT, newFetchresourceinput, newFetchresourceinput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceoutputType getFetchresourceoutput()
  {
    return fetchresourceoutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresourceoutput(fetchresourceoutputType newFetchresourceoutput, NotificationChain msgs)
  {
    fetchresourceoutputType oldFetchresourceoutput = fetchresourceoutput;
    fetchresourceoutput = newFetchresourceoutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT, oldFetchresourceoutput, newFetchresourceoutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresourceoutput(fetchresourceoutputType newFetchresourceoutput)
  {
    if (newFetchresourceoutput != fetchresourceoutput)
    {
      NotificationChain msgs = null;
      if (fetchresourceoutput != null)
        msgs = ((InternalEObject)fetchresourceoutput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT, null, msgs);
      if (newFetchresourceoutput != null)
        msgs = ((InternalEObject)newFetchresourceoutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT, null, msgs);
      msgs = basicSetFetchresourceoutput(newFetchresourceoutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT, newFetchresourceoutput, newFetchresourceoutput));
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
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT:
        return basicSetFetchresourceinput(null, msgs);
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT:
        return basicSetFetchresourceoutput(null, msgs);
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
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT:
        return getFetchresourceinput();
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT:
        return getFetchresourceoutput();
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
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT:
        setFetchresourceinput((fetchresourceinputType)newValue);
        return;
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT:
        setFetchresourceoutput((fetchresourceoutputType)newValue);
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
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT:
        setFetchresourceinput((fetchresourceinputType)null);
        return;
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT:
        setFetchresourceoutput((fetchresourceoutputType)null);
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
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEINPUT:
        return fetchresourceinput != null;
      case SchemaPackage.FETCHRESOURCE_TYPE__FETCHRESOURCEOUTPUT:
        return fetchresourceoutput != null;
    }
    return super.eIsSet(featureID);
  }

} //fetchresourceTypeImpl


package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>reesourcecreationandmapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl#getCreateresource <em>Createresource</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl#getLdapentry <em>Ldapentry</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.reesourcecreationandmappingTypeImpl#getParsecsv <em>Parsecsv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class reesourcecreationandmappingTypeImpl extends EObjectImpl implements reesourcecreationandmappingType
{
  /**
   * The cached value of the '{@link #getCreateresource() <em>Createresource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateresource()
   * @generated
   * @ordered
   */
  protected createresourceType createresource;

  /**
   * The cached value of the '{@link #getLdapentry() <em>Ldapentry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdapentry()
   * @generated
   * @ordered
   */
  protected ldapentryType ldapentry;

  /**
   * The cached value of the '{@link #getParsecsv() <em>Parsecsv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParsecsv()
   * @generated
   * @ordered
   */
  protected parsecsvType parsecsv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected reesourcecreationandmappingTypeImpl()
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
    return SchemaPackage.Literals.REESOURCECREATIONANDMAPPING_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public createresourceType getCreateresource()
  {
    return createresource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateresource(createresourceType newCreateresource, NotificationChain msgs)
  {
    createresourceType oldCreateresource = createresource;
    createresource = newCreateresource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE, oldCreateresource, newCreateresource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateresource(createresourceType newCreateresource)
  {
    if (newCreateresource != createresource)
    {
      NotificationChain msgs = null;
      if (createresource != null)
        msgs = ((InternalEObject)createresource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE, null, msgs);
      if (newCreateresource != null)
        msgs = ((InternalEObject)newCreateresource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE, null, msgs);
      msgs = basicSetCreateresource(newCreateresource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE, newCreateresource, newCreateresource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryType getLdapentry()
  {
    return ldapentry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentry(ldapentryType newLdapentry, NotificationChain msgs)
  {
    ldapentryType oldLdapentry = ldapentry;
    ldapentry = newLdapentry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY, oldLdapentry, newLdapentry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentry(ldapentryType newLdapentry)
  {
    if (newLdapentry != ldapentry)
    {
      NotificationChain msgs = null;
      if (ldapentry != null)
        msgs = ((InternalEObject)ldapentry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY, null, msgs);
      if (newLdapentry != null)
        msgs = ((InternalEObject)newLdapentry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY, null, msgs);
      msgs = basicSetLdapentry(newLdapentry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY, newLdapentry, newLdapentry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parsecsvType getParsecsv()
  {
    return parsecsv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParsecsv(parsecsvType newParsecsv, NotificationChain msgs)
  {
    parsecsvType oldParsecsv = parsecsv;
    parsecsv = newParsecsv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV, oldParsecsv, newParsecsv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParsecsv(parsecsvType newParsecsv)
  {
    if (newParsecsv != parsecsv)
    {
      NotificationChain msgs = null;
      if (parsecsv != null)
        msgs = ((InternalEObject)parsecsv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV, null, msgs);
      if (newParsecsv != null)
        msgs = ((InternalEObject)newParsecsv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV, null, msgs);
      msgs = basicSetParsecsv(newParsecsv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV, newParsecsv, newParsecsv));
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
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE:
        return basicSetCreateresource(null, msgs);
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY:
        return basicSetLdapentry(null, msgs);
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV:
        return basicSetParsecsv(null, msgs);
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
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE:
        return getCreateresource();
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY:
        return getLdapentry();
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV:
        return getParsecsv();
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
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE:
        setCreateresource((createresourceType)newValue);
        return;
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY:
        setLdapentry((ldapentryType)newValue);
        return;
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV:
        setParsecsv((parsecsvType)newValue);
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
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE:
        setCreateresource((createresourceType)null);
        return;
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY:
        setLdapentry((ldapentryType)null);
        return;
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV:
        setParsecsv((parsecsvType)null);
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
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__CREATERESOURCE:
        return createresource != null;
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__LDAPENTRY:
        return ldapentry != null;
      case SchemaPackage.REESOURCECREATIONANDMAPPING_TYPE__PARSECSV:
        return parsecsv != null;
    }
    return super.eIsSet(featureID);
  }

} //reesourcecreationandmappingTypeImpl

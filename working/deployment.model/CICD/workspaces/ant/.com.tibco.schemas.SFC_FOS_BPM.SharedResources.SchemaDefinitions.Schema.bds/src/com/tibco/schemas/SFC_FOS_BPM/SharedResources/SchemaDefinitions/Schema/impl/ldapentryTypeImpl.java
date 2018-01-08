
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSTypeConversions;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryinputrepeatType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ldapentry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl#getLdapentryinput <em>Ldapentryinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl#getLdapentryoutput <em>Ldapentryoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.ldapentryTypeImpl#getLdapentryinputrepeat <em>Ldapentryinputrepeat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class ldapentryTypeImpl extends EObjectImpl implements ldapentryType
{
  /**
   * The cached value of the '{@link #getLdapentryinput() <em>Ldapentryinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdapentryinput()
   * @generated
   * @ordered
   */
  protected ldapentryinputType ldapentryinput;

  /**
   * The default value of the '{@link #getLdapentryoutput() <em>Ldapentryoutput</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdapentryoutput()
   * @generated
   * @ordered
   */
  protected static final String LDAPENTRYOUTPUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLdapentryoutput() <em>Ldapentryoutput</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdapentryoutput()
   * @generated
   * @ordered
   */
  protected String ldapentryoutput = LDAPENTRYOUTPUT_EDEFAULT;

  /**
   * The cached value of the '{@link #getLdapentryinputrepeat() <em>Ldapentryinputrepeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLdapentryinputrepeat()
   * @generated
   * @ordered
   */
  protected ldapentryinputrepeatType ldapentryinputrepeat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ldapentryTypeImpl()
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
    return SchemaPackage.Literals.LDAPENTRY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputType getLdapentryinput()
  {
    return ldapentryinput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryinput(ldapentryinputType newLdapentryinput, NotificationChain msgs)
  {
    ldapentryinputType oldLdapentryinput = ldapentryinput;
    ldapentryinput = newLdapentryinput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT, oldLdapentryinput, newLdapentryinput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryinput(ldapentryinputType newLdapentryinput)
  {
    if (newLdapentryinput != ldapentryinput)
    {
      NotificationChain msgs = null;
      if (ldapentryinput != null)
        msgs = ((InternalEObject)ldapentryinput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT, null, msgs);
      if (newLdapentryinput != null)
        msgs = ((InternalEObject)newLdapentryinput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT, null, msgs);
      msgs = basicSetLdapentryinput(newLdapentryinput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT, newLdapentryinput, newLdapentryinput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLdapentryoutput()
  {
    return ldapentryoutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryoutput(String newLdapentryoutput)
  {
    String oldLdapentryoutput = ldapentryoutput;
    ldapentryoutput = newLdapentryoutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYOUTPUT, oldLdapentryoutput, ldapentryoutput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ldapentryinputrepeatType getLdapentryinputrepeat()
  {
    return ldapentryinputrepeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLdapentryinputrepeat(ldapentryinputrepeatType newLdapentryinputrepeat, NotificationChain msgs)
  {
    ldapentryinputrepeatType oldLdapentryinputrepeat = ldapentryinputrepeat;
    ldapentryinputrepeat = newLdapentryinputrepeat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT, oldLdapentryinputrepeat, newLdapentryinputrepeat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLdapentryinputrepeat(ldapentryinputrepeatType newLdapentryinputrepeat)
  {
    if (newLdapentryinputrepeat != ldapentryinputrepeat)
    {
      NotificationChain msgs = null;
      if (ldapentryinputrepeat != null)
        msgs = ((InternalEObject)ldapentryinputrepeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT, null, msgs);
      if (newLdapentryinputrepeat != null)
        msgs = ((InternalEObject)newLdapentryinputrepeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT, null, msgs);
      msgs = basicSetLdapentryinputrepeat(newLdapentryinputrepeat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT, newLdapentryinputrepeat, newLdapentryinputrepeat));
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
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT:
        return basicSetLdapentryinput(null, msgs);
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT:
        return basicSetLdapentryinputrepeat(null, msgs);
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
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT:
        return getLdapentryinput();
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYOUTPUT:
        return getLdapentryoutput();
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT:
        return getLdapentryinputrepeat();
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
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT:
        setLdapentryinput((ldapentryinputType)newValue);
        return;
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYOUTPUT:
        setLdapentryoutput((String)newValue);
        return;
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT:
        setLdapentryinputrepeat((ldapentryinputrepeatType)newValue);
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
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT:
        setLdapentryinput((ldapentryinputType)null);
        return;
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYOUTPUT:
        setLdapentryoutput(LDAPENTRYOUTPUT_EDEFAULT);
        return;
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT:
        setLdapentryinputrepeat((ldapentryinputrepeatType)null);
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
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUT:
        return ldapentryinput != null;
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYOUTPUT:
        return LDAPENTRYOUTPUT_EDEFAULT == null ? ldapentryoutput != null : !LDAPENTRYOUTPUT_EDEFAULT.equals(ldapentryoutput);
      case SchemaPackage.LDAPENTRY_TYPE__LDAPENTRYINPUTREPEAT:
        return ldapentryinputrepeat != null;
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
    result.append(" (ldapentryoutput: ");
    result.append(ldapentryoutput);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setLdapentryoutput(Object value)
  {
    // Call the default set, passing in the converted value
    setLdapentryoutput(BDSTypeConversions.convertToString(value));
  }
} //ldapentryTypeImpl

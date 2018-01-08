
package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType;
import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>root Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl#getFetchresource <em>Fetchresource</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl#getReportgeneration <em>Reportgeneration</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl#getReesourcecreationandmapping <em>Reesourcecreationandmapping</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl#getWorkitemcompletion <em>Workitemcompletion</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.impl.rootTypeImpl#getFault <em>Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class rootTypeImpl extends EObjectImpl implements rootType
{
  /**
   * The cached value of the '{@link #getFetchresource() <em>Fetchresource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetchresource()
   * @generated
   * @ordered
   */
  protected fetchresourceType fetchresource;

  /**
   * The cached value of the '{@link #getReportgeneration() <em>Reportgeneration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReportgeneration()
   * @generated
   * @ordered
   */
  protected reportgenerationType reportgeneration;

  /**
   * The cached value of the '{@link #getReesourcecreationandmapping() <em>Reesourcecreationandmapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReesourcecreationandmapping()
   * @generated
   * @ordered
   */
  protected reesourcecreationandmappingType reesourcecreationandmapping;

  /**
   * The cached value of the '{@link #getWorkitemcompletion() <em>Workitemcompletion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkitemcompletion()
   * @generated
   * @ordered
   */
  protected workitemcompletionType workitemcompletion;

  /**
   * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFault()
   * @generated
   * @ordered
   */
  protected faultType fault;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rootTypeImpl()
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
    return SchemaPackage.Literals.ROOT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetchresourceType getFetchresource()
  {
    return fetchresource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetchresource(fetchresourceType newFetchresource, NotificationChain msgs)
  {
    fetchresourceType oldFetchresource = fetchresource;
    fetchresource = newFetchresource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__FETCHRESOURCE, oldFetchresource, newFetchresource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetchresource(fetchresourceType newFetchresource)
  {
    if (newFetchresource != fetchresource)
    {
      NotificationChain msgs = null;
      if (fetchresource != null)
        msgs = ((InternalEObject)fetchresource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__FETCHRESOURCE, null, msgs);
      if (newFetchresource != null)
        msgs = ((InternalEObject)newFetchresource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__FETCHRESOURCE, null, msgs);
      msgs = basicSetFetchresource(newFetchresource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__FETCHRESOURCE, newFetchresource, newFetchresource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reportgenerationType getReportgeneration()
  {
    return reportgeneration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReportgeneration(reportgenerationType newReportgeneration, NotificationChain msgs)
  {
    reportgenerationType oldReportgeneration = reportgeneration;
    reportgeneration = newReportgeneration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__REPORTGENERATION, oldReportgeneration, newReportgeneration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReportgeneration(reportgenerationType newReportgeneration)
  {
    if (newReportgeneration != reportgeneration)
    {
      NotificationChain msgs = null;
      if (reportgeneration != null)
        msgs = ((InternalEObject)reportgeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__REPORTGENERATION, null, msgs);
      if (newReportgeneration != null)
        msgs = ((InternalEObject)newReportgeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__REPORTGENERATION, null, msgs);
      msgs = basicSetReportgeneration(newReportgeneration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__REPORTGENERATION, newReportgeneration, newReportgeneration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public reesourcecreationandmappingType getReesourcecreationandmapping()
  {
    return reesourcecreationandmapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReesourcecreationandmapping(reesourcecreationandmappingType newReesourcecreationandmapping, NotificationChain msgs)
  {
    reesourcecreationandmappingType oldReesourcecreationandmapping = reesourcecreationandmapping;
    reesourcecreationandmapping = newReesourcecreationandmapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING, oldReesourcecreationandmapping, newReesourcecreationandmapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReesourcecreationandmapping(reesourcecreationandmappingType newReesourcecreationandmapping)
  {
    if (newReesourcecreationandmapping != reesourcecreationandmapping)
    {
      NotificationChain msgs = null;
      if (reesourcecreationandmapping != null)
        msgs = ((InternalEObject)reesourcecreationandmapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING, null, msgs);
      if (newReesourcecreationandmapping != null)
        msgs = ((InternalEObject)newReesourcecreationandmapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING, null, msgs);
      msgs = basicSetReesourcecreationandmapping(newReesourcecreationandmapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING, newReesourcecreationandmapping, newReesourcecreationandmapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public workitemcompletionType getWorkitemcompletion()
  {
    return workitemcompletion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWorkitemcompletion(workitemcompletionType newWorkitemcompletion, NotificationChain msgs)
  {
    workitemcompletionType oldWorkitemcompletion = workitemcompletion;
    workitemcompletion = newWorkitemcompletion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION, oldWorkitemcompletion, newWorkitemcompletion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWorkitemcompletion(workitemcompletionType newWorkitemcompletion)
  {
    if (newWorkitemcompletion != workitemcompletion)
    {
      NotificationChain msgs = null;
      if (workitemcompletion != null)
        msgs = ((InternalEObject)workitemcompletion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION, null, msgs);
      if (newWorkitemcompletion != null)
        msgs = ((InternalEObject)newWorkitemcompletion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION, null, msgs);
      msgs = basicSetWorkitemcompletion(newWorkitemcompletion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION, newWorkitemcompletion, newWorkitemcompletion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public faultType getFault()
  {
    return fault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFault(faultType newFault, NotificationChain msgs)
  {
    faultType oldFault = fault;
    fault = newFault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__FAULT, oldFault, newFault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFault(faultType newFault)
  {
    if (newFault != fault)
    {
      NotificationChain msgs = null;
      if (fault != null)
        msgs = ((InternalEObject)fault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__FAULT, null, msgs);
      if (newFault != null)
        msgs = ((InternalEObject)newFault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.ROOT_TYPE__FAULT, null, msgs);
      msgs = basicSetFault(newFault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ROOT_TYPE__FAULT, newFault, newFault));
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
      case SchemaPackage.ROOT_TYPE__FETCHRESOURCE:
        return basicSetFetchresource(null, msgs);
      case SchemaPackage.ROOT_TYPE__REPORTGENERATION:
        return basicSetReportgeneration(null, msgs);
      case SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING:
        return basicSetReesourcecreationandmapping(null, msgs);
      case SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION:
        return basicSetWorkitemcompletion(null, msgs);
      case SchemaPackage.ROOT_TYPE__FAULT:
        return basicSetFault(null, msgs);
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
      case SchemaPackage.ROOT_TYPE__FETCHRESOURCE:
        return getFetchresource();
      case SchemaPackage.ROOT_TYPE__REPORTGENERATION:
        return getReportgeneration();
      case SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING:
        return getReesourcecreationandmapping();
      case SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION:
        return getWorkitemcompletion();
      case SchemaPackage.ROOT_TYPE__FAULT:
        return getFault();
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
      case SchemaPackage.ROOT_TYPE__FETCHRESOURCE:
        setFetchresource((fetchresourceType)newValue);
        return;
      case SchemaPackage.ROOT_TYPE__REPORTGENERATION:
        setReportgeneration((reportgenerationType)newValue);
        return;
      case SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING:
        setReesourcecreationandmapping((reesourcecreationandmappingType)newValue);
        return;
      case SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION:
        setWorkitemcompletion((workitemcompletionType)newValue);
        return;
      case SchemaPackage.ROOT_TYPE__FAULT:
        setFault((faultType)newValue);
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
      case SchemaPackage.ROOT_TYPE__FETCHRESOURCE:
        setFetchresource((fetchresourceType)null);
        return;
      case SchemaPackage.ROOT_TYPE__REPORTGENERATION:
        setReportgeneration((reportgenerationType)null);
        return;
      case SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING:
        setReesourcecreationandmapping((reesourcecreationandmappingType)null);
        return;
      case SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION:
        setWorkitemcompletion((workitemcompletionType)null);
        return;
      case SchemaPackage.ROOT_TYPE__FAULT:
        setFault((faultType)null);
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
      case SchemaPackage.ROOT_TYPE__FETCHRESOURCE:
        return fetchresource != null;
      case SchemaPackage.ROOT_TYPE__REPORTGENERATION:
        return reportgeneration != null;
      case SchemaPackage.ROOT_TYPE__REESOURCECREATIONANDMAPPING:
        return reesourcecreationandmapping != null;
      case SchemaPackage.ROOT_TYPE__WORKITEMCOMPLETION:
        return workitemcompletion != null;
      case SchemaPackage.ROOT_TYPE__FAULT:
        return fault != null;
    }
    return super.eIsSet(featureID);
  }

} //rootTypeImpl


package com.sfc.fosImpl.genericReporting.impl;

import com.sfc.fosImpl.genericReporting.DocumentRoot;
import com.sfc.fosImpl.genericReporting.GenericReportingPackage;
import com.sfc.fosImpl.genericReporting.Record;
import com.sfc.fosImpl.genericReporting.Task;

import com.sfc.fosImpl.genericReporting.bdsutil.BDSFeatureMap;
import com.sfc.fosImpl.genericReporting.bdsutil.BDSFeatureMapImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getRecordElement <em>Record Element</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getTaskElement <em>Task Element</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getRecordBDSInternalSerializationElement <em>Record BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.impl.DocumentRootImpl#getTaskBDSInternalSerializationElement <em>Task BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
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
    return GenericReportingPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, GenericReportingPackage.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GenericReportingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GenericReportingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record getRecordElement()
  {
    return (Record)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(GenericReportingPackage.Literals.DOCUMENT_ROOT__RECORD_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordElement(Record newRecordElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(GenericReportingPackage.Literals.DOCUMENT_ROOT__RECORD_ELEMENT, newRecordElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordElement(Record newRecordElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(GenericReportingPackage.Literals.DOCUMENT_ROOT__RECORD_ELEMENT, newRecordElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTaskElement()
  {
    return (Task)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(GenericReportingPackage.Literals.DOCUMENT_ROOT__TASK_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskElement(Task newTaskElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(GenericReportingPackage.Literals.DOCUMENT_ROOT__TASK_ELEMENT, newTaskElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskElement(Task newTaskElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(GenericReportingPackage.Literals.DOCUMENT_ROOT__TASK_ELEMENT, newTaskElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Record getRecordBDSInternalSerializationElement()
  {
    return (Record)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(GenericReportingPackage.Literals.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordBDSInternalSerializationElement(Record newRecordBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(GenericReportingPackage.Literals.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT, newRecordBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordBDSInternalSerializationElement(Record newRecordBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(GenericReportingPackage.Literals.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT, newRecordBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTaskBDSInternalSerializationElement()
  {
    return (Task)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(GenericReportingPackage.Literals.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTaskBDSInternalSerializationElement(Task newTaskBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(GenericReportingPackage.Literals.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT, newTaskBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskBDSInternalSerializationElement(Task newTaskBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(GenericReportingPackage.Literals.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT, newTaskBDSInternalSerializationElement);
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
      case GenericReportingPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case GenericReportingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case GenericReportingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_ELEMENT:
        return basicSetRecordElement(null, msgs);
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_ELEMENT:
        return basicSetTaskElement(null, msgs);
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetRecordBDSInternalSerializationElement(null, msgs);
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetTaskBDSInternalSerializationElement(null, msgs);
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
      case GenericReportingPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case GenericReportingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case GenericReportingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_ELEMENT:
        return getRecordElement();
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_ELEMENT:
        return getTaskElement();
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getRecordBDSInternalSerializationElement();
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getTaskBDSInternalSerializationElement();
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
      case GenericReportingPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_ELEMENT:
        setRecordElement((Record)newValue);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_ELEMENT:
        setTaskElement((Task)newValue);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setRecordBDSInternalSerializationElement((Record)newValue);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setTaskBDSInternalSerializationElement((Task)newValue);
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
      case GenericReportingPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_ELEMENT:
        setRecordElement((Record)null);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_ELEMENT:
        setTaskElement((Task)null);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setRecordBDSInternalSerializationElement((Record)null);
        return;
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setTaskBDSInternalSerializationElement((Task)null);
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
      case GenericReportingPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case GenericReportingPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case GenericReportingPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_ELEMENT:
        return getRecordElement() != null;
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_ELEMENT:
        return getTaskElement() != null;
      case GenericReportingPackage.DOCUMENT_ROOT__RECORD_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getRecordBDSInternalSerializationElement() != null;
      case GenericReportingPackage.DOCUMENT_ROOT__TASK_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getTaskBDSInternalSerializationElement() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl

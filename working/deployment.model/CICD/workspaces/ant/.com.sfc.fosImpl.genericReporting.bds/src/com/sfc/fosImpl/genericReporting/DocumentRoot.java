package com.sfc.fosImpl.genericReporting;

import com.sfc.fosImpl.genericReporting.bdsutil.BDSFeatureMap;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordElement <em>Record Element</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskElement <em>Task Element</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordBDSInternalSerializationElement <em>Record BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskBDSInternalSerializationElement <em>Task BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@SuppressWarnings("all")
public interface DocumentRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  BDSFeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   * @generated
   */
  EMap<String, String> getXMLNSPrefixMap();

  /**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Record Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Element</em>' containment reference.
   * @see #setRecordElement(Record)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_RecordElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='RecordElement' namespace='##targetNamespace'"
   * @generated
   */
  Record getRecordElement();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordElement <em>Record Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Element</em>' containment reference.
   * @see #getRecordElement()
   * @generated
   */
  void setRecordElement(Record value);

  /**
   * Returns the value of the '<em><b>Task Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Element</em>' containment reference.
   * @see #setTaskElement(Task)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_TaskElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='TaskElement' namespace='##targetNamespace'"
   * @generated
   */
  Task getTaskElement();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskElement <em>Task Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Element</em>' containment reference.
   * @see #getTaskElement()
   * @generated
   */
  void setTaskElement(Task value);

  /**
   * Returns the value of the '<em><b>Record BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record BDS Internal Serialization Element</em>' containment reference.
   * @see #setRecordBDSInternalSerializationElement(Record)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_RecordBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Record' namespace='##targetNamespace'"
   * @generated
   */
  Record getRecordBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getRecordBDSInternalSerializationElement <em>Record BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record BDS Internal Serialization Element</em>' containment reference.
   * @see #getRecordBDSInternalSerializationElement()
   * @generated
   */
  void setRecordBDSInternalSerializationElement(Record value);

  /**
   * Returns the value of the '<em><b>Task BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task BDS Internal Serialization Element</em>' containment reference.
   * @see #setTaskBDSInternalSerializationElement(Task)
   * @see com.sfc.fosImpl.genericReporting.GenericReportingPackage#getDocumentRoot_TaskBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
   * @generated
   */
  Task getTaskBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.sfc.fosImpl.genericReporting.DocumentRoot#getTaskBDSInternalSerializationElement <em>Task BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task BDS Internal Serialization Element</em>' containment reference.
   * @see #getTaskBDSInternalSerializationElement()
   * @generated
   */
  void setTaskBDSInternalSerializationElement(Task value);

} // DocumentRoot

package com.example.sfc_provisioningbom;

import com.example.sfc_provisioningbom.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tehnical Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getCarrierVLAN <em>Carrier VLAN</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getCarrierIP <em>Carrier IP</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getAggPoint <em>Agg Point</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getPort <em>Port</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getClientVLAN <em>Client VLAN</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getClientIP <em>Client IP</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getSFCPOPPE <em>SFCPOPPE</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getPortType <em>Port Type</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getEquipment <em>Equipment</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.TehnicalInformation#getModifiedDate <em>Modified Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation()
 * @model extendedMetaData="name='TehnicalInformation' kind='elementOnly'"
 *        annotation="bds label='Tehnical Information'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface TehnicalInformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Carrier VLAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Carrier VLAN</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Carrier VLAN</em>' attribute.
   * @see #setCarrierVLAN(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_CarrierVLAN()
   * @model dataType="com.example.sfc_provisioningbom.carrierVLAN_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='carrierVLAN'"
   * @generated
   */
  String getCarrierVLAN();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getCarrierVLAN <em>Carrier VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Carrier VLAN</em>' attribute.
   * @see #getCarrierVLAN()
   * @generated
   */
  void setCarrierVLAN(String value);

  /**
   * Returns the value of the '<em><b>Carrier IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Carrier IP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Carrier IP</em>' attribute.
   * @see #setCarrierIP(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_CarrierIP()
   * @model dataType="com.example.sfc_provisioningbom.carrierIP_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='carrierIP'"
   * @generated
   */
  String getCarrierIP();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getCarrierIP <em>Carrier IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Carrier IP</em>' attribute.
   * @see #getCarrierIP()
   * @generated
   */
  void setCarrierIP(String value);

  /**
   * Returns the value of the '<em><b>Agg Point</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agg Point</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agg Point</em>' attribute.
   * @see #setAggPoint(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_AggPoint()
   * @model dataType="com.example.sfc_provisioningbom.aggPoint_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='aggPoint'"
   * @generated
   */
  String getAggPoint();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getAggPoint <em>Agg Point</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agg Point</em>' attribute.
   * @see #getAggPoint()
   * @generated
   */
  void setAggPoint(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_Port()
   * @model dataType="com.example.sfc_provisioningbom.port_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='port'"
   * @generated
   */
  String getPort();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(String value);

  /**
   * Returns the value of the '<em><b>Client VLAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client VLAN</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client VLAN</em>' attribute.
   * @see #setClientVLAN(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_ClientVLAN()
   * @model dataType="com.example.sfc_provisioningbom.clientVLAN_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='clientVLAN'"
   * @generated
   */
  String getClientVLAN();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getClientVLAN <em>Client VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client VLAN</em>' attribute.
   * @see #getClientVLAN()
   * @generated
   */
  void setClientVLAN(String value);

  /**
   * Returns the value of the '<em><b>Client IP</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client IP</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client IP</em>' attribute.
   * @see #setClientIP(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_ClientIP()
   * @model dataType="com.example.sfc_provisioningbom.clientIP_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='clientIP'"
   * @generated
   */
  String getClientIP();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getClientIP <em>Client IP</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client IP</em>' attribute.
   * @see #getClientIP()
   * @generated
   */
  void setClientIP(String value);

  /**
   * Returns the value of the '<em><b>SFCPOPPE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SFCPOPPE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SFCPOPPE</em>' attribute.
   * @see #setSFCPOPPE(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_SFCPOPPE()
   * @model dataType="com.example.sfc_provisioningbom.SFCPOPPE_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='SFCPOPPE'"
   * @generated
   */
  String getSFCPOPPE();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getSFCPOPPE <em>SFCPOPPE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SFCPOPPE</em>' attribute.
   * @see #getSFCPOPPE()
   * @generated
   */
  void setSFCPOPPE(String value);

  /**
   * Returns the value of the '<em><b>Port Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port Type</em>' attribute.
   * @see #setPortType(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_PortType()
   * @model dataType="com.example.sfc_provisioningbom.portType_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='portType'"
   * @generated
   */
  String getPortType();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getPortType <em>Port Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port Type</em>' attribute.
   * @see #getPortType()
   * @generated
   */
  void setPortType(String value);

  /**
   * Returns the value of the '<em><b>Equipment</b></em>' containment reference list.
   * The list contents are of type {@link com.example.sfc_provisioningbom.EquipmentDetails}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equipment</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equipment</em>' containment reference list.
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_Equipment()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='equipment'"
   * @generated
   */
  EList<EquipmentDetails> getEquipment();

  /**
   * Returns the value of the '<em><b>Modified By</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modified By</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modified By</em>' attribute.
   * @see #setModifiedBy(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_ModifiedBy()
   * @model dataType="com.example.sfc_provisioningbom.modifiedBy_TehnicalInformationType"
   *        extendedMetaData="kind='element' name='modifiedBy'"
   * @generated
   */
  String getModifiedBy();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getModifiedBy <em>Modified By</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modified By</em>' attribute.
   * @see #getModifiedBy()
   * @generated
   */
  void setModifiedBy(String value);

  /**
   * Returns the value of the '<em><b>Modified Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modified Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modified Date</em>' attribute.
   * @see #setModifiedDate(XMLGregorianCalendar)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getTehnicalInformation_ModifiedDate()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
   *        extendedMetaData="kind='element' name='modifiedDate'"
   * @generated
   */
  XMLGregorianCalendar getModifiedDate();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.TehnicalInformation#getModifiedDate <em>Modified Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modified Date</em>' attribute.
   * @see #getModifiedDate()
   * @generated
   */
  void setModifiedDate(XMLGregorianCalendar value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getCarrierVLAN()
   * @generated
   */
  void setCarrierVLAN(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getCarrierIP()
   * @generated
   */
  void setCarrierIP(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAggPoint()
   * @generated
   */
  void setAggPoint(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPort()
   * @generated
   */
  void setPort(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getClientVLAN()
   * @generated
   */
  void setClientVLAN(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getClientIP()
   * @generated
   */
  void setClientIP(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSFCPOPPE()
   * @generated
   */
  void setSFCPOPPE(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPortType()
   * @generated
   */
  void setPortType(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getModifiedBy()
   * @generated
   */
  void setModifiedBy(Object value);

} // TehnicalInformation

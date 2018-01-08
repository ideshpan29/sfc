package com.example.sfc_provisioningbom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.EquipmentDetails#getType <em>Type</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.EquipmentDetails#getAddress <em>Address</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.EquipmentDetails#getVLAN <em>VLAN</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getEquipmentDetails()
 * @model extendedMetaData="name='EquipmentDetails' kind='elementOnly'"
 *        annotation="bds label='EquipmentDetails'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface EquipmentDetails extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getEquipmentDetails_Type()
   * @model dataType="com.example.sfc_provisioningbom.type_EquipmentDetailsType"
   *        extendedMetaData="kind='element' name='type'"
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.EquipmentDetails#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' attribute.
   * @see #setAddress(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getEquipmentDetails_Address()
   * @model dataType="com.example.sfc_provisioningbom.address_EquipmentDetailsType"
   *        extendedMetaData="kind='element' name='address'"
   * @generated
   */
  String getAddress();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.EquipmentDetails#getAddress <em>Address</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Address</em>' attribute.
   * @see #getAddress()
   * @generated
   */
  void setAddress(String value);

  /**
   * Returns the value of the '<em><b>VLAN</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VLAN</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VLAN</em>' attribute.
   * @see #setVLAN(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getEquipmentDetails_VLAN()
   * @model dataType="com.example.sfc_provisioningbom.VLAN_EquipmentDetailsType"
   *        extendedMetaData="kind='element' name='VLAN'"
   * @generated
   */
  String getVLAN();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.EquipmentDetails#getVLAN <em>VLAN</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VLAN</em>' attribute.
   * @see #getVLAN()
   * @generated
   */
  void setVLAN(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getType()
   * @generated
   */
  void setType(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAddress()
   * @generated
   */
  void setAddress(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getVLAN()
   * @generated
   */
  void setVLAN(Object value);

} // EquipmentDetails

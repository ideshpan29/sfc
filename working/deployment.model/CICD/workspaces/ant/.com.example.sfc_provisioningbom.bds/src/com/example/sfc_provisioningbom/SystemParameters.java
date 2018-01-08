package com.example.sfc_provisioningbom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.SystemParameters#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SystemParameters#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SystemParameters#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.SystemParameters#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSystemParameters()
 * @model extendedMetaData="name='SystemParameters' kind='elementOnly'"
 *        annotation="bds isCase='true' summary='propertyName propertyValue' label='SystemParameters'"
 *        annotation="teneo.jpa value='@Table(name=\"SFC_PROVISIONINGBOM_SYSTEMPARAMETERS\")\n@DiscriminatorValue(\"com.example.sfc_provisioningbom.SystemParameters\")'"
 * @generated
 */
@SuppressWarnings("all")
public interface SystemParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Property Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Name</em>' attribute.
   * @see #setPropertyName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSystemParameters_PropertyName()
   * @model dataType="com.example.sfc_provisioningbom.propertyName_SystemParametersType" required="true"
   *        extendedMetaData="kind='element' name='propertyName'"
   *        annotation="bds isCID='true' bomBaseType='Text' label='PropertyName'"
   *        annotation="teneo.jpa value='@Column(unique=\"true\", name=\"PROPERTYNAME\", length=\"400\", nullable=\"false\")'"
   * @generated
   */
  String getPropertyName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SystemParameters#getPropertyName <em>Property Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Name</em>' attribute.
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(String value);

  /**
   * Returns the value of the '<em><b>Property Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Value</em>' attribute.
   * @see #setPropertyValue(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSystemParameters_PropertyValue()
   * @model dataType="com.example.sfc_provisioningbom.propertyValue_SystemParametersType"
   *        extendedMetaData="kind='element' name='propertyValue'"
   *        annotation="bds bomBaseType='Text' label='PropertyValue'"
   *        annotation="teneo.jpa value='@Column(name=\"PROPERTYVALUE\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getPropertyValue();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SystemParameters#getPropertyValue <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Value</em>' attribute.
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(String value);

  /**
   * Returns the value of the '<em><b>Bds Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bds Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bds Id</em>' attribute.
   * @see #setBdsId(Long)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSystemParameters_BdsId()
   * @model annotation="teneo.jpa value='@Id\n@Column(name=\"BDS_ID\", nullable=\"false\")\n@GeneratedValue(generator=\"bdsIdGenerator\")'"
   *        annotation="bds isId='true'"
   * @generated
   */
  Long getBdsId();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SystemParameters#getBdsId <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bds Id</em>' attribute.
   * @see #getBdsId()
   * @generated
   */
  void setBdsId(Long value);

  /**
   * Returns the value of the '<em><b>Bds Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bds Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bds Version</em>' attribute.
   * @see #setBdsVersion(Long)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getSystemParameters_BdsVersion()
   * @model annotation="teneo.jpa value='@Column(name=\"BDS_VERSION\")\n@Version'"
   *        annotation="bds isVersion='true'"
   * @generated
   */
  Long getBdsVersion();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.SystemParameters#getBdsVersion <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bds Version</em>' attribute.
   * @see #getBdsVersion()
   * @generated
   */
  void setBdsVersion(Long value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPropertyName()
   * @generated
   */
  void setPropertyName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPropertyValue()
   * @generated
   */
  void setPropertyValue(Object value);

} // SystemParameters

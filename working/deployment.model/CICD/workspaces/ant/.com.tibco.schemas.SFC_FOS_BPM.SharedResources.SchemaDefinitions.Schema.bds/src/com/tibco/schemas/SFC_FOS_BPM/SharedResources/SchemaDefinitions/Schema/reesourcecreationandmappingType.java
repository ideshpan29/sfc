package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reesourcecreationandmapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getCreateresource <em>Createresource</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getLdapentry <em>Ldapentry</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getParsecsv <em>Parsecsv</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreesourcecreationandmappingType()
 * @model extendedMetaData="name='reesourcecreationandmapping_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface reesourcecreationandmappingType extends EObject
{
  /**
   * Returns the value of the '<em><b>Createresource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Createresource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Createresource</em>' containment reference.
   * @see #setCreateresource(createresourceType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreesourcecreationandmappingType_Createresource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='createresource' namespace='##targetNamespace'"
   * @generated
   */
  createresourceType getCreateresource();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getCreateresource <em>Createresource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Createresource</em>' containment reference.
   * @see #getCreateresource()
   * @generated
   */
  void setCreateresource(createresourceType value);

  /**
   * Returns the value of the '<em><b>Ldapentry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ldapentry</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ldapentry</em>' containment reference.
   * @see #setLdapentry(ldapentryType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreesourcecreationandmappingType_Ldapentry()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ldapentry' namespace='##targetNamespace'"
   * @generated
   */
  ldapentryType getLdapentry();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getLdapentry <em>Ldapentry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ldapentry</em>' containment reference.
   * @see #getLdapentry()
   * @generated
   */
  void setLdapentry(ldapentryType value);

  /**
   * Returns the value of the '<em><b>Parsecsv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parsecsv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parsecsv</em>' containment reference.
   * @see #setParsecsv(parsecsvType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreesourcecreationandmappingType_Parsecsv()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='parsecsv' namespace='##targetNamespace'"
   * @generated
   */
  parsecsvType getParsecsv();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reesourcecreationandmappingType#getParsecsv <em>Parsecsv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parsecsv</em>' containment reference.
   * @see #getParsecsv()
   * @generated
   */
  void setParsecsv(parsecsvType value);

} // reesourcecreationandmappingType

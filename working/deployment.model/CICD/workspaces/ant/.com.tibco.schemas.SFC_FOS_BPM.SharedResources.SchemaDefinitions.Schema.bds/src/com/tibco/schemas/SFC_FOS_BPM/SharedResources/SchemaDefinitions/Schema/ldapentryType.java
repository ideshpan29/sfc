package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ldapentry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinput <em>Ldapentryinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryoutput <em>Ldapentryoutput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinputrepeat <em>Ldapentryinputrepeat</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getldapentryType()
 * @model extendedMetaData="name='ldapentry_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface ldapentryType extends EObject
{
  /**
   * Returns the value of the '<em><b>Ldapentryinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ldapentryinput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ldapentryinput</em>' containment reference.
   * @see #setLdapentryinput(ldapentryinputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getldapentryType_Ldapentryinput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ldapentryinput' namespace='##targetNamespace'"
   * @generated
   */
  ldapentryinputType getLdapentryinput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinput <em>Ldapentryinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ldapentryinput</em>' containment reference.
   * @see #getLdapentryinput()
   * @generated
   */
  void setLdapentryinput(ldapentryinputType value);

  /**
   * Returns the value of the '<em><b>Ldapentryoutput</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ldapentryoutput</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ldapentryoutput</em>' attribute.
   * @see #setLdapentryoutput(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getldapentryType_Ldapentryoutput()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='ldapentryoutput' namespace='##targetNamespace'"
   * @generated
   */
  String getLdapentryoutput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryoutput <em>Ldapentryoutput</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ldapentryoutput</em>' attribute.
   * @see #getLdapentryoutput()
   * @generated
   */
  void setLdapentryoutput(String value);

  /**
   * Returns the value of the '<em><b>Ldapentryinputrepeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ldapentryinputrepeat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ldapentryinputrepeat</em>' containment reference.
   * @see #setLdapentryinputrepeat(ldapentryinputrepeatType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getldapentryType_Ldapentryinputrepeat()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='ldapentryinputrepeat' namespace='##targetNamespace'"
   * @generated
   */
  ldapentryinputrepeatType getLdapentryinputrepeat();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.ldapentryType#getLdapentryinputrepeat <em>Ldapentryinputrepeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ldapentryinputrepeat</em>' containment reference.
   * @see #getLdapentryinputrepeat()
   * @generated
   */
  void setLdapentryinputrepeat(ldapentryinputrepeatType value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getLdapentryoutput()
   * @generated
   */
  void setLdapentryoutput(Object value);

} // ldapentryType

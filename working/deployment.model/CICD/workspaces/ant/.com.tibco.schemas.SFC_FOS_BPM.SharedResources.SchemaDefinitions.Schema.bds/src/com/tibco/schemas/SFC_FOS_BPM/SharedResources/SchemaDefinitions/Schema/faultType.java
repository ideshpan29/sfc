package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fault Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType#getFaultmessage <em>Faultmessage</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfaultType()
 * @model extendedMetaData="name='fault_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface faultType extends EObject
{
  /**
   * Returns the value of the '<em><b>Faultmessage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Faultmessage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Faultmessage</em>' attribute.
   * @see #setFaultmessage(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfaultType_Faultmessage()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='faultmessage' namespace='##targetNamespace'"
   * @generated
   */
  String getFaultmessage();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.faultType#getFaultmessage <em>Faultmessage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Faultmessage</em>' attribute.
   * @see #getFaultmessage()
   * @generated
   */
  void setFaultmessage(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getFaultmessage()
   * @generated
   */
  void setFaultmessage(Object value);

} // faultType

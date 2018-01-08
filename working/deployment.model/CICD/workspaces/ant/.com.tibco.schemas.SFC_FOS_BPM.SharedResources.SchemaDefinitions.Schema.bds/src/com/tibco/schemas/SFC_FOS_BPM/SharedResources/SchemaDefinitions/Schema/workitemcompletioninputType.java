package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>workitemcompletioninput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType#getSibelcircuitid <em>Sibelcircuitid</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getworkitemcompletioninputType()
 * @model extendedMetaData="name='workitemcompletioninput_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface workitemcompletioninputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Sibelcircuitid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sibelcircuitid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sibelcircuitid</em>' attribute.
   * @see #setSibelcircuitid(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getworkitemcompletioninputType_Sibelcircuitid()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='sibelcircuitid' namespace='##targetNamespace'"
   * @generated
   */
  String getSibelcircuitid();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletioninputType#getSibelcircuitid <em>Sibelcircuitid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sibelcircuitid</em>' attribute.
   * @see #getSibelcircuitid()
   * @generated
   */
  void setSibelcircuitid(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSibelcircuitid()
   * @generated
   */
  void setSibelcircuitid(Object value);

} // workitemcompletioninputType

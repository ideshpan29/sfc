package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>createresourceoutput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType#getOutputmessage <em>Outputmessage</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getcreateresourceoutputType()
 * @model extendedMetaData="name='createresourceoutput_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface createresourceoutputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Outputmessage</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputmessage</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputmessage</em>' attribute.
   * @see #setOutputmessage(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getcreateresourceoutputType_Outputmessage()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='outputmessage' namespace='##targetNamespace'"
   * @generated
   */
  String getOutputmessage();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceoutputType#getOutputmessage <em>Outputmessage</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outputmessage</em>' attribute.
   * @see #getOutputmessage()
   * @generated
   */
  void setOutputmessage(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getOutputmessage()
   * @generated
   */
  void setOutputmessage(Object value);

} // createresourceoutputType

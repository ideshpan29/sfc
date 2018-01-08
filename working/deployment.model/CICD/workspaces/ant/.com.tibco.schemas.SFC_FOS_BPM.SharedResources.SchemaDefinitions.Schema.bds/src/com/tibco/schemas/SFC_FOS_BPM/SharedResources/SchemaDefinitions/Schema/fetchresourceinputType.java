package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fetchresourceinput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType#getProcessname <em>Processname</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfetchresourceinputType()
 * @model extendedMetaData="name='fetchresourceinput_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface fetchresourceinputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Processname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processname</em>' attribute.
   * @see #setProcessname(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfetchresourceinputType_Processname()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='processname' namespace='##targetNamespace'"
   * @generated
   */
  String getProcessname();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceinputType#getProcessname <em>Processname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Processname</em>' attribute.
   * @see #getProcessname()
   * @generated
   */
  void setProcessname(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getProcessname()
   * @generated
   */
  void setProcessname(Object value);

} // fetchresourceinputType

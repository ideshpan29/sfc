package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>workitemcompletion Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletioninput <em>Workitemcompletioninput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletionoutput <em>Workitemcompletionoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getworkitemcompletionType()
 * @model extendedMetaData="name='workitemcompletion_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface workitemcompletionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Workitemcompletioninput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workitemcompletioninput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workitemcompletioninput</em>' containment reference.
   * @see #setWorkitemcompletioninput(workitemcompletioninputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getworkitemcompletionType_Workitemcompletioninput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='workitemcompletioninput' namespace='##targetNamespace'"
   * @generated
   */
  workitemcompletioninputType getWorkitemcompletioninput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletioninput <em>Workitemcompletioninput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workitemcompletioninput</em>' containment reference.
   * @see #getWorkitemcompletioninput()
   * @generated
   */
  void setWorkitemcompletioninput(workitemcompletioninputType value);

  /**
   * Returns the value of the '<em><b>Workitemcompletionoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workitemcompletionoutput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workitemcompletionoutput</em>' containment reference.
   * @see #setWorkitemcompletionoutput(workitemcompletionoutputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getworkitemcompletionType_Workitemcompletionoutput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='workitemcompletionoutput' namespace='##targetNamespace'"
   * @generated
   */
  workitemcompletionoutputType getWorkitemcompletionoutput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.workitemcompletionType#getWorkitemcompletionoutput <em>Workitemcompletionoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workitemcompletionoutput</em>' containment reference.
   * @see #getWorkitemcompletionoutput()
   * @generated
   */
  void setWorkitemcompletionoutput(workitemcompletionoutputType value);

} // workitemcompletionType

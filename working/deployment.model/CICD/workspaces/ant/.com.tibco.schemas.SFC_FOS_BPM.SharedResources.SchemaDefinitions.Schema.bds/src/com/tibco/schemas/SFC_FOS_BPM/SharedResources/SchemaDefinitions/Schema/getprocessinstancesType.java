package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>getprocessinstances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesinput <em>Getprocessinstancesinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesoutput <em>Getprocessinstancesoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesType()
 * @model extendedMetaData="name='getprocessinstances_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface getprocessinstancesType extends EObject
{
  /**
   * Returns the value of the '<em><b>Getprocessinstancesinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getprocessinstancesinput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getprocessinstancesinput</em>' containment reference.
   * @see #setGetprocessinstancesinput(getprocessinstancesinputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesType_Getprocessinstancesinput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='getprocessinstancesinput' namespace='##targetNamespace'"
   * @generated
   */
  getprocessinstancesinputType getGetprocessinstancesinput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesinput <em>Getprocessinstancesinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Getprocessinstancesinput</em>' containment reference.
   * @see #getGetprocessinstancesinput()
   * @generated
   */
  void setGetprocessinstancesinput(getprocessinstancesinputType value);

  /**
   * Returns the value of the '<em><b>Getprocessinstancesoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getprocessinstancesoutput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getprocessinstancesoutput</em>' containment reference.
   * @see #setGetprocessinstancesoutput(getprocessinstancesoutputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesType_Getprocessinstancesoutput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='getprocessinstancesoutput' namespace='##targetNamespace'"
   * @generated
   */
  getprocessinstancesoutputType getGetprocessinstancesoutput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesType#getGetprocessinstancesoutput <em>Getprocessinstancesoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Getprocessinstancesoutput</em>' containment reference.
   * @see #getGetprocessinstancesoutput()
   * @generated
   */
  void setGetprocessinstancesoutput(getprocessinstancesoutputType value);

} // getprocessinstancesType

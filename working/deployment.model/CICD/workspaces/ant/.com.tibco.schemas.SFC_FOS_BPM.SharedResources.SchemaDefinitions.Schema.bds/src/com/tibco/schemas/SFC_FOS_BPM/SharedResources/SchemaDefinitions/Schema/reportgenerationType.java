package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>reportgeneration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getGetprocessinstances <em>Getprocessinstances</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getSearchprocessinstances <em>Searchprocessinstances</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreportgenerationType()
 * @model extendedMetaData="name='reportgeneration_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface reportgenerationType extends EObject
{
  /**
   * Returns the value of the '<em><b>Getprocessinstances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Getprocessinstances</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Getprocessinstances</em>' containment reference.
   * @see #setGetprocessinstances(getprocessinstancesType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreportgenerationType_Getprocessinstances()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='getprocessinstances' namespace='##targetNamespace'"
   * @generated
   */
  getprocessinstancesType getGetprocessinstances();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getGetprocessinstances <em>Getprocessinstances</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Getprocessinstances</em>' containment reference.
   * @see #getGetprocessinstances()
   * @generated
   */
  void setGetprocessinstances(getprocessinstancesType value);

  /**
   * Returns the value of the '<em><b>Searchprocessinstances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchprocessinstances</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchprocessinstances</em>' containment reference.
   * @see #setSearchprocessinstances(searchprocessinstancesType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getreportgenerationType_Searchprocessinstances()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='searchprocessinstances' namespace='##targetNamespace'"
   * @generated
   */
  searchprocessinstancesType getSearchprocessinstances();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.reportgenerationType#getSearchprocessinstances <em>Searchprocessinstances</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Searchprocessinstances</em>' containment reference.
   * @see #getSearchprocessinstances()
   * @generated
   */
  void setSearchprocessinstances(searchprocessinstancesType value);

} // reportgenerationType

package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>searchprocessinstances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesinput <em>Searchprocessinstancesinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesoutput <em>Searchprocessinstancesoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesType()
 * @model extendedMetaData="name='searchprocessinstances_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface searchprocessinstancesType extends EObject
{
  /**
   * Returns the value of the '<em><b>Searchprocessinstancesinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchprocessinstancesinput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchprocessinstancesinput</em>' containment reference.
   * @see #setSearchprocessinstancesinput(searchprocessinstancesinputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesType_Searchprocessinstancesinput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='searchprocessinstancesinput' namespace='##targetNamespace'"
   * @generated
   */
  searchprocessinstancesinputType getSearchprocessinstancesinput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesinput <em>Searchprocessinstancesinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Searchprocessinstancesinput</em>' containment reference.
   * @see #getSearchprocessinstancesinput()
   * @generated
   */
  void setSearchprocessinstancesinput(searchprocessinstancesinputType value);

  /**
   * Returns the value of the '<em><b>Searchprocessinstancesoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchprocessinstancesoutput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchprocessinstancesoutput</em>' containment reference.
   * @see #setSearchprocessinstancesoutput(searchprocessinstancesoutputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesType_Searchprocessinstancesoutput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='searchprocessinstancesoutput' namespace='##targetNamespace'"
   * @generated
   */
  searchprocessinstancesoutputType getSearchprocessinstancesoutput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesType#getSearchprocessinstancesoutput <em>Searchprocessinstancesoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Searchprocessinstancesoutput</em>' containment reference.
   * @see #getSearchprocessinstancesoutput()
   * @generated
   */
  void setSearchprocessinstancesoutput(searchprocessinstancesoutputType value);

} // searchprocessinstancesType

package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>searchprocessinstancesoutput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesoutputType#getSearchrecord <em>Searchrecord</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesoutputType()
 * @model extendedMetaData="name='searchprocessinstancesoutput_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface searchprocessinstancesoutputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Searchrecord</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchrecordType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchrecord</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchrecord</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesoutputType_Searchrecord()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='searchrecord' namespace='##targetNamespace'"
   * @generated
   */
  EList<searchrecordType> getSearchrecord();

} // searchprocessinstancesoutputType

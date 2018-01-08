package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parsecsv Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.parsecsvType#getUsers <em>Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getparsecsvType()
 * @model extendedMetaData="name='parsecsv_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface parsecsvType extends EObject
{
  /**
   * Returns the value of the '<em><b>Users</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.usersType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Users</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getparsecsvType_Users()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='users' namespace='##targetNamespace'"
   * @generated
   */
  EList<usersType> getUsers();

} // parsecsvType

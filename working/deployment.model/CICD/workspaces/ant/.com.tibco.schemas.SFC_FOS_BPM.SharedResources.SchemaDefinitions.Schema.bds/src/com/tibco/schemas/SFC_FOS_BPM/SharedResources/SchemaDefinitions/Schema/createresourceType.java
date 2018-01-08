package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>createresource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceinput <em>Createresourceinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceoutput <em>Createresourceoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getcreateresourceType()
 * @model extendedMetaData="name='createresource_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface createresourceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Createresourceinput</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceinputType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Createresourceinput</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Createresourceinput</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getcreateresourceType_Createresourceinput()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='createresourceinput' namespace='##targetNamespace'"
   * @generated
   */
  EList<createresourceinputType> getCreateresourceinput();

  /**
   * Returns the value of the '<em><b>Createresourceoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Createresourceoutput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Createresourceoutput</em>' containment reference.
   * @see #setCreateresourceoutput(createresourceoutputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getcreateresourceType_Createresourceoutput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='createresourceoutput' namespace='##targetNamespace'"
   * @generated
   */
  createresourceoutputType getCreateresourceoutput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.createresourceType#getCreateresourceoutput <em>Createresourceoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Createresourceoutput</em>' containment reference.
   * @see #getCreateresourceoutput()
   * @generated
   */
  void setCreateresourceoutput(createresourceoutputType value);

} // createresourceType

package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fetchresource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceinput <em>Fetchresourceinput</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceoutput <em>Fetchresourceoutput</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfetchresourceType()
 * @model extendedMetaData="name='fetchresource_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface fetchresourceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Fetchresourceinput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetchresourceinput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetchresourceinput</em>' containment reference.
   * @see #setFetchresourceinput(fetchresourceinputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfetchresourceType_Fetchresourceinput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fetchresourceinput' namespace='##targetNamespace'"
   * @generated
   */
  fetchresourceinputType getFetchresourceinput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceinput <em>Fetchresourceinput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetchresourceinput</em>' containment reference.
   * @see #getFetchresourceinput()
   * @generated
   */
  void setFetchresourceinput(fetchresourceinputType value);

  /**
   * Returns the value of the '<em><b>Fetchresourceoutput</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetchresourceoutput</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetchresourceoutput</em>' containment reference.
   * @see #setFetchresourceoutput(fetchresourceoutputType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getfetchresourceType_Fetchresourceoutput()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fetchresourceoutput' namespace='##targetNamespace'"
   * @generated
   */
  fetchresourceoutputType getFetchresourceoutput();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.fetchresourceType#getFetchresourceoutput <em>Fetchresourceoutput</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetchresourceoutput</em>' containment reference.
   * @see #getFetchresourceoutput()
   * @generated
   */
  void setFetchresourceoutput(fetchresourceoutputType value);

} // fetchresourceType

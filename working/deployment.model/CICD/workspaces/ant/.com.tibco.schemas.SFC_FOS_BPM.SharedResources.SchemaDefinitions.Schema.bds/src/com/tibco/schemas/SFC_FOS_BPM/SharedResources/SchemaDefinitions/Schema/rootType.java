package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>root Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFetchresource <em>Fetchresource</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReportgeneration <em>Reportgeneration</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReesourcecreationandmapping <em>Reesourcecreationandmapping</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getWorkitemcompletion <em>Workitemcompletion</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFault <em>Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getrootType()
 * @model extendedMetaData="name='root_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface rootType extends EObject
{
  /**
   * Returns the value of the '<em><b>Fetchresource</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetchresource</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetchresource</em>' containment reference.
   * @see #setFetchresource(fetchresourceType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getrootType_Fetchresource()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fetchresource' namespace='##targetNamespace'"
   * @generated
   */
  fetchresourceType getFetchresource();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFetchresource <em>Fetchresource</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetchresource</em>' containment reference.
   * @see #getFetchresource()
   * @generated
   */
  void setFetchresource(fetchresourceType value);

  /**
   * Returns the value of the '<em><b>Reportgeneration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reportgeneration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reportgeneration</em>' containment reference.
   * @see #setReportgeneration(reportgenerationType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getrootType_Reportgeneration()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='reportgeneration' namespace='##targetNamespace'"
   * @generated
   */
  reportgenerationType getReportgeneration();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReportgeneration <em>Reportgeneration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reportgeneration</em>' containment reference.
   * @see #getReportgeneration()
   * @generated
   */
  void setReportgeneration(reportgenerationType value);

  /**
   * Returns the value of the '<em><b>Reesourcecreationandmapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reesourcecreationandmapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reesourcecreationandmapping</em>' containment reference.
   * @see #setReesourcecreationandmapping(reesourcecreationandmappingType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getrootType_Reesourcecreationandmapping()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='reesourcecreationandmapping' namespace='##targetNamespace'"
   * @generated
   */
  reesourcecreationandmappingType getReesourcecreationandmapping();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getReesourcecreationandmapping <em>Reesourcecreationandmapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reesourcecreationandmapping</em>' containment reference.
   * @see #getReesourcecreationandmapping()
   * @generated
   */
  void setReesourcecreationandmapping(reesourcecreationandmappingType value);

  /**
   * Returns the value of the '<em><b>Workitemcompletion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workitemcompletion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workitemcompletion</em>' containment reference.
   * @see #setWorkitemcompletion(workitemcompletionType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getrootType_Workitemcompletion()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='workitemcompletion' namespace='##targetNamespace'"
   * @generated
   */
  workitemcompletionType getWorkitemcompletion();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getWorkitemcompletion <em>Workitemcompletion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workitemcompletion</em>' containment reference.
   * @see #getWorkitemcompletion()
   * @generated
   */
  void setWorkitemcompletion(workitemcompletionType value);

  /**
   * Returns the value of the '<em><b>Fault</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fault</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fault</em>' containment reference.
   * @see #setFault(faultType)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getrootType_Fault()
   * @model containment="true" required="true"
   *        extendedMetaData="kind='element' name='fault' namespace='##targetNamespace'"
   * @generated
   */
  faultType getFault();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.rootType#getFault <em>Fault</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fault</em>' containment reference.
   * @see #getFault()
   * @generated
   */
  void setFault(faultType value);

} // rootType

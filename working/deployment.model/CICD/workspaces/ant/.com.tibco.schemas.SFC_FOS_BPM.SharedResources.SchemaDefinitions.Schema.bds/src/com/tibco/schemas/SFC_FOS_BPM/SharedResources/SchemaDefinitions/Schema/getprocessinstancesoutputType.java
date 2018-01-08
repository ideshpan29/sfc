package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.bdsutil.BDSEObjectLists.BDSEObjectContainmentEList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>getprocessinstancesoutput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_complete <em>Pi complete</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_started <em>Pi started</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_halted <em>Pi halted</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.getprocessinstancesoutputType#getPi_cancelled <em>Pi cancelled</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesoutputType()
 * @model extendedMetaData="name='getprocessinstancesoutput_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface getprocessinstancesoutputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Pi complete</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_completeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pi complete</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pi complete</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesoutputType_Pi_complete()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pi_complete' namespace='##targetNamespace'"
   * @generated
   */
  EList<pi_completeType> getPi_complete();

  /**
   * Returns the value of the '<em><b>Pi started</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_startedType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pi started</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pi started</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesoutputType_Pi_started()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pi_started' namespace='##targetNamespace'"
   * @generated
   */
  EList<pi_startedType> getPi_started();

  /**
   * Returns the value of the '<em><b>Pi halted</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_haltedType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pi halted</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pi halted</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesoutputType_Pi_halted()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pi_halted' namespace='##targetNamespace'"
   * @generated
   */
  EList<pi_haltedType> getPi_halted();

  /**
   * Returns the value of the '<em><b>Pi cancelled</b></em>' containment reference list.
   * The list contents are of type {@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.pi_cancelledType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pi cancelled</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pi cancelled</em>' containment reference list.
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getgetprocessinstancesoutputType_Pi_cancelled()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='pi_cancelled' namespace='##targetNamespace'"
   * @generated
   */
  EList<pi_cancelledType> getPi_cancelled();

} // getprocessinstancesoutputType

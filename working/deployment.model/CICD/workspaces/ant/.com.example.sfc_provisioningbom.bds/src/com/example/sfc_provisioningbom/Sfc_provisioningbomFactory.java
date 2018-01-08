

package com.example.sfc_provisioningbom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage
 * @generated
 */
public interface Sfc_provisioningbomFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Sfc_provisioningbomFactory eINSTANCE = com.example.sfc_provisioningbom.impl.Sfc_provisioningbomFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Comment Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comment Data</em>'.
   * @generated
   */
  CommentData createCommentData();

  /**
   * Returns a new object of class '<em>Contractor Groups</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contractor Groups</em>'.
   * @generated
   */
  ContractorGroups createContractorGroups();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Equipment Details</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equipment Details</em>'.
   * @generated
   */
  EquipmentDetails createEquipmentDetails();

  /**
   * Returns a new object of class '<em>Provisioning Data Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Provisioning Data Model</em>'.
   * @generated
   */
  ProvisioningDataModel createProvisioningDataModel();

  /**
   * Returns a new object of class '<em>SLA Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SLA Configuration</em>'.
   * @generated
   */
  SLA_Configuration createSLA_Configuration();

  /**
   * Returns a new object of class '<em>System Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Parameters</em>'.
   * @generated
   */
  SystemParameters createSystemParameters();

  /**
   * Returns a new object of class '<em>Tehnical Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tehnical Information</em>'.
   * @generated
   */
  TehnicalInformation createTehnicalInformation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Sfc_provisioningbomPackage getSfc_provisioningbomPackage();

} //Sfc_provisioningbomFactory

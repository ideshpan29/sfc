package com.example.sfc_provisioningbom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contractor Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getLoginName <em>Login Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getContractorGroupName <em>Contractor Group Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getMasterUser <em>Master User</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getEmailID <em>Email ID</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getBdsId <em>Bds Id</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.ContractorGroups#getBdsVersion <em>Bds Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups()
 * @model extendedMetaData="name='ContractorGroups' kind='elementOnly'"
 *        annotation="bds isCase='true' summary='firstName lastName loginName emailID contractorGroupName masterUser' label='Contractor Groups'"
 *        annotation="teneo.jpa value='@Table(name=\"SFC_PROVISIONINGBOM_CONTRACTORGROUPS\")\n@DiscriminatorValue(\"com.example.sfc_provisioningbom.ContractorGroups\")'"
 * @generated
 */
@SuppressWarnings("all")
public interface ContractorGroups extends EObject
{
  /**
   * Returns the value of the '<em><b>Login Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Login Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Login Name</em>' attribute.
   * @see #setLoginName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_LoginName()
   * @model dataType="com.example.sfc_provisioningbom.loginName_ContractorGroupsType"
   *        extendedMetaData="kind='element' name='loginName'"
   *        annotation="bds isSearchable='true' bomBaseType='Text' label='login Name'"
   *        annotation="teneo.jpa value='@Column(name=\"LOGINNAME\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getLoginName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getLoginName <em>Login Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Login Name</em>' attribute.
   * @see #getLoginName()
   * @generated
   */
  void setLoginName(String value);

  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_FirstName()
   * @model dataType="com.example.sfc_provisioningbom.firstName_ContractorGroupsType"
   *        extendedMetaData="kind='element' name='firstName'"
   *        annotation="bds bomBaseType='Text' label='first Name'"
   *        annotation="teneo.jpa value='@Column(name=\"FIRSTNAME\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_LastName()
   * @model dataType="com.example.sfc_provisioningbom.lastName_ContractorGroupsType"
   *        extendedMetaData="kind='element' name='lastName'"
   *        annotation="bds bomBaseType='Text' label='last Name'"
   *        annotation="teneo.jpa value='@Column(name=\"LASTNAME\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Returns the value of the '<em><b>Contractor Group Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contractor Group Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contractor Group Name</em>' attribute.
   * @see #setContractorGroupName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_ContractorGroupName()
   * @model dataType="com.example.sfc_provisioningbom.contractorGroupName_ContractorGroupsType"
   *        extendedMetaData="kind='element' name='contractorGroupName'"
   *        annotation="bds isSearchable='true' bomBaseType='Text' label='Contractor Group Name'"
   *        annotation="teneo.jpa value='@Column(name=\"CONTRACTORGROUPNAME\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getContractorGroupName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getContractorGroupName <em>Contractor Group Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contractor Group Name</em>' attribute.
   * @see #getContractorGroupName()
   * @generated
   */
  void setContractorGroupName(String value);

  /**
   * Returns the value of the '<em><b>Master User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master User</em>' attribute.
   * @see #setMasterUser(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_MasterUser()
   * @model dataType="com.example.sfc_provisioningbom.masterUser_ContractorGroupsType"
   *        extendedMetaData="kind='element' name='masterUser'"
   *        annotation="bds bomBaseType='Text' label='Master User'"
   *        annotation="teneo.jpa value='@Column(name=\"MASTERUSER\", length=\"400\", nullable=\"true\")'"
   * @generated
   */
  String getMasterUser();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getMasterUser <em>Master User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master User</em>' attribute.
   * @see #getMasterUser()
   * @generated
   */
  void setMasterUser(String value);

  /**
   * Returns the value of the '<em><b>Email ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Email ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Email ID</em>' attribute.
   * @see #setEmailID(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_EmailID()
   * @model dataType="com.example.sfc_provisioningbom.emailID_ContractorGroupsType" required="true"
   *        extendedMetaData="kind='element' name='emailID'"
   *        annotation="bds isCID='true' bomBaseType='Text' label='email ID'"
   *        annotation="teneo.jpa value='@Column(unique=\"true\", name=\"EMAILID\", length=\"400\", nullable=\"false\")'"
   * @generated
   */
  String getEmailID();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getEmailID <em>Email ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email ID</em>' attribute.
   * @see #getEmailID()
   * @generated
   */
  void setEmailID(String value);

  /**
   * Returns the value of the '<em><b>Bds Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bds Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bds Id</em>' attribute.
   * @see #setBdsId(Long)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_BdsId()
   * @model annotation="teneo.jpa value='@Id\n@Column(name=\"BDS_ID\", nullable=\"false\")\n@GeneratedValue(generator=\"bdsIdGenerator\")'"
   *        annotation="bds isId='true'"
   * @generated
   */
  Long getBdsId();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getBdsId <em>Bds Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bds Id</em>' attribute.
   * @see #getBdsId()
   * @generated
   */
  void setBdsId(Long value);

  /**
   * Returns the value of the '<em><b>Bds Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bds Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bds Version</em>' attribute.
   * @see #setBdsVersion(Long)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getContractorGroups_BdsVersion()
   * @model annotation="teneo.jpa value='@Column(name=\"BDS_VERSION\")\n@Version'"
   *        annotation="bds isVersion='true'"
   * @generated
   */
  Long getBdsVersion();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.ContractorGroups#getBdsVersion <em>Bds Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bds Version</em>' attribute.
   * @see #getBdsVersion()
   * @generated
   */
  void setBdsVersion(Long value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getLoginName()
   * @generated
   */
  void setLoginName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getLastName()
   * @generated
   */
  void setLastName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getContractorGroupName()
   * @generated
   */
  void setContractorGroupName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getMasterUser()
   * @generated
   */
  void setMasterUser(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getEmailID()
   * @generated
   */
  void setEmailID(Object value);

} // ContractorGroups

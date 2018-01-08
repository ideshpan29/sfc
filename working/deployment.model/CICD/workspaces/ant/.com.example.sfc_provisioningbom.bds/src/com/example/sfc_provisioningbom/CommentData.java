package com.example.sfc_provisioningbom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.sfc_provisioningbom.CommentData#getAddedby <em>Addedby</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.CommentData#getComments <em>Comments</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.CommentData#getStepName <em>Step Name</em>}</li>
 *   <li>{@link com.example.sfc_provisioningbom.CommentData#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getCommentData()
 * @model extendedMetaData="name='CommentData' kind='elementOnly'"
 *        annotation="bds label='CommentData'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface CommentData extends EObject
{
  /**
   * Returns the value of the '<em><b>Addedby</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addedby</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addedby</em>' attribute.
   * @see #setAddedby(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getCommentData_Addedby()
   * @model dataType="com.example.sfc_provisioningbom.addedby_CommentDataType"
   *        extendedMetaData="kind='element' name='addedby'"
   * @generated
   */
  String getAddedby();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.CommentData#getAddedby <em>Addedby</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addedby</em>' attribute.
   * @see #getAddedby()
   * @generated
   */
  void setAddedby(String value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' attribute.
   * @see #setComments(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getCommentData_Comments()
   * @model dataType="com.example.sfc_provisioningbom.comments_CommentDataType"
   *        extendedMetaData="kind='element' name='comments'"
   * @generated
   */
  String getComments();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.CommentData#getComments <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comments</em>' attribute.
   * @see #getComments()
   * @generated
   */
  void setComments(String value);

  /**
   * Returns the value of the '<em><b>Step Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step Name</em>' attribute.
   * @see #setStepName(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getCommentData_StepName()
   * @model dataType="com.example.sfc_provisioningbom.stepName_CommentDataType"
   *        extendedMetaData="kind='element' name='stepName'"
   * @generated
   */
  String getStepName();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.CommentData#getStepName <em>Step Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Step Name</em>' attribute.
   * @see #getStepName()
   * @generated
   */
  void setStepName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(String)
   * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getCommentData_Time()
   * @model dataType="com.example.sfc_provisioningbom.time_CommentDataType"
   *        extendedMetaData="kind='element' name='time'"
   * @generated
   */
  String getTime();

  /**
   * Sets the value of the '{@link com.example.sfc_provisioningbom.CommentData#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAddedby()
   * @generated
   */
  void setAddedby(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getComments()
   * @generated
   */
  void setComments(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getStepName()
   * @generated
   */
  void setStepName(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getTime()
   * @generated
   */
  void setTime(Object value);

} // CommentData

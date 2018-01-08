package com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>searchprocessinstancesinput Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchkey <em>Searchkey</em>}</li>
 *   <li>{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchvalue <em>Searchvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesinputType()
 * @model extendedMetaData="name='searchprocessinstancesinput_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface searchprocessinstancesinputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Searchkey</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchkey</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchkey</em>' attribute.
   * @see #setSearchkey(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesinputType_Searchkey()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='searchkey' namespace='##targetNamespace'"
   * @generated
   */
  String getSearchkey();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchkey <em>Searchkey</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Searchkey</em>' attribute.
   * @see #getSearchkey()
   * @generated
   */
  void setSearchkey(String value);

  /**
   * Returns the value of the '<em><b>Searchvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searchvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searchvalue</em>' attribute.
   * @see #setSearchvalue(String)
   * @see com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.SchemaPackage#getsearchprocessinstancesinputType_Searchvalue()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='searchvalue' namespace='##targetNamespace'"
   * @generated
   */
  String getSearchvalue();

  /**
   * Sets the value of the '{@link com.tibco.schemas.SFC_FOS_BPM.SharedResources.SchemaDefinitions.Schema.searchprocessinstancesinputType#getSearchvalue <em>Searchvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Searchvalue</em>' attribute.
   * @see #getSearchvalue()
   * @generated
   */
  void setSearchvalue(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSearchkey()
   * @generated
   */
  void setSearchkey(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getSearchvalue()
   * @generated
   */
  void setSearchvalue(Object value);

} // searchprocessinstancesinputType

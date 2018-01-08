/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.sfc_provisioningbom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Service Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getServiceStatus()
 * @model extendedMetaData="name='ServiceStatus'"
 *        annotation="bds label='ServiceStatus'"
 * @generated
 */
public enum ServiceStatus implements Enumerator
{
  /**
   * The '<em><b>REGISTERED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REGISTERED_VALUE
   * @generated
   * @ordered
   */
  REGISTERED(0, "REGISTERED", "REGISTERED"),

  /**
   * The '<em><b>VERIFIED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERIFIED_VALUE
   * @generated
   * @ordered
   */
  VERIFIED(1, "VERIFIED", "VERIFIED"),

  /**
   * The '<em><b>APPROVED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPROVED_VALUE
   * @generated
   * @ordered
   */
  APPROVED(2, "APPROVED", "APPROVED"),

  /**
   * The '<em><b>COMPLETED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPLETED_VALUE
   * @generated
   * @ordered
   */
  COMPLETED(3, "COMPLETED", "COMPLETED");

  /**
   * The '<em><b>REGISTERED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REGISTERED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REGISTERED
   * @model annotation="bds label='Registered'"
   * @generated
   * @ordered
   */
  public static final int REGISTERED_VALUE = 0;

  /**
   * The '<em><b>VERIFIED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERIFIED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERIFIED
   * @model annotation="bds label='Verified'"
   * @generated
   * @ordered
   */
  public static final int VERIFIED_VALUE = 1;

  /**
   * The '<em><b>APPROVED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>APPROVED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPROVED
   * @model annotation="bds label='Approved'"
   * @generated
   * @ordered
   */
  public static final int APPROVED_VALUE = 2;

  /**
   * The '<em><b>COMPLETED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COMPLETED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPLETED
   * @model annotation="bds label='Completed'"
   * @generated
   * @ordered
   */
  public static final int COMPLETED_VALUE = 3;

  /**
   * An array of all the '<em><b>Service Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ServiceStatus[] VALUES_ARRAY =
    new ServiceStatus[]
    {
      REGISTERED,
      VERIFIED,
      APPROVED,
      COMPLETED,
    };

  /**
   * A public read-only list of all the '<em><b>Service Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ServiceStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Service Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServiceStatus get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ServiceStatus result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    throw new IllegalArgumentException("Not a valid enumeration literal: " + literal);
  }

  /**
   * Returns the '<em><b>Service Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServiceStatus getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ServiceStatus result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Service Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServiceStatus get(int value)
  {
    switch (value)
    {
      case REGISTERED_VALUE: return REGISTERED;
      case VERIFIED_VALUE: return VERIFIED;
      case APPROVED_VALUE: return APPROVED;
      case COMPLETED_VALUE: return COMPLETED;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ServiceStatus(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ServiceStatus

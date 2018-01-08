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
 * A representation of the literals of the enumeration '<em><b>Process Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getProcessName()
 * @model extendedMetaData="name='ProcessName'"
 *        annotation="bds label='ProcessName'"
 * @generated
 */
public enum ProcessName implements Enumerator
{
  /**
   * The '<em><b>PROVISIONING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROVISIONING_VALUE
   * @generated
   * @ordered
   */
  PROVISIONING(0, "PROVISIONING", "PROVISIONING"),

  /**
   * The '<em><b>DECOMISSIONING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECOMISSIONING_VALUE
   * @generated
   * @ordered
   */
  DECOMISSIONING(1, "DECOMISSIONING", "DECOMISSIONING");

  /**
   * The '<em><b>PROVISIONING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROVISIONING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROVISIONING
   * @model annotation="bds label='Provisioning'"
   * @generated
   * @ordered
   */
  public static final int PROVISIONING_VALUE = 0;

  /**
   * The '<em><b>DECOMISSIONING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DECOMISSIONING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECOMISSIONING
   * @model annotation="bds label='Decomissioning'"
   * @generated
   * @ordered
   */
  public static final int DECOMISSIONING_VALUE = 1;

  /**
   * An array of all the '<em><b>Process Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ProcessName[] VALUES_ARRAY =
    new ProcessName[]
    {
      PROVISIONING,
      DECOMISSIONING,
    };

  /**
   * A public read-only list of all the '<em><b>Process Name</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ProcessName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Process Name</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProcessName get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProcessName result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    throw new IllegalArgumentException("Not a valid enumeration literal: " + literal);
  }

  /**
   * Returns the '<em><b>Process Name</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProcessName getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ProcessName result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Process Name</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ProcessName get(int value)
  {
    switch (value)
    {
      case PROVISIONING_VALUE: return PROVISIONING;
      case DECOMISSIONING_VALUE: return DECOMISSIONING;
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
  private ProcessName(int value, String name, String literal)
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
  
} //ProcessName

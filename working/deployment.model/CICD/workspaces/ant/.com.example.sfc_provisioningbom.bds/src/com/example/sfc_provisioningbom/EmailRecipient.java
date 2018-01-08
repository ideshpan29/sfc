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
 * A representation of the literals of the enumeration '<em><b>Email Recipient</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.example.sfc_provisioningbom.Sfc_provisioningbomPackage#getEmailRecipient()
 * @model extendedMetaData="name='EmailRecipient'"
 *        annotation="bds label='EmailRecipient'"
 * @generated
 */
public enum EmailRecipient implements Enumerator
{
  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(0, "NONE", "NONE"),

  /**
   * The '<em><b>SPECIFIC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECIFIC_VALUE
   * @generated
   * @ordered
   */
  SPECIFIC(1, "SPECIFIC", "SPECIFIC"),

  /**
   * The '<em><b>PM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PM_VALUE
   * @generated
   * @ordered
   */
  PM(2, "PM", "PM");

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model annotation="bds label='None'"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 0;

  /**
   * The '<em><b>SPECIFIC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SPECIFIC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPECIFIC
   * @model annotation="bds label='Specific'"
   * @generated
   * @ordered
   */
  public static final int SPECIFIC_VALUE = 1;

  /**
   * The '<em><b>PM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PM
   * @model annotation="bds label='PM'"
   * @generated
   * @ordered
   */
  public static final int PM_VALUE = 2;

  /**
   * An array of all the '<em><b>Email Recipient</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EmailRecipient[] VALUES_ARRAY =
    new EmailRecipient[]
    {
      NONE,
      SPECIFIC,
      PM,
    };

  /**
   * A public read-only list of all the '<em><b>Email Recipient</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EmailRecipient> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Email Recipient</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmailRecipient get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EmailRecipient result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    throw new IllegalArgumentException("Not a valid enumeration literal: " + literal);
  }

  /**
   * Returns the '<em><b>Email Recipient</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmailRecipient getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EmailRecipient result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Email Recipient</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmailRecipient get(int value)
  {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case SPECIFIC_VALUE: return SPECIFIC;
      case PM_VALUE: return PM;
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
  private EmailRecipient(int value, String name, String literal)
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
  
} //EmailRecipient

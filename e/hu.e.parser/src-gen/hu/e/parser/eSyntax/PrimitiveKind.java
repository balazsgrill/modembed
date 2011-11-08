/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getPrimitiveKind()
 * @model
 * @generated
 */
public enum PrimitiveKind implements Enumerator
{
  /**
   * The '<em><b>UNSIGNED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNSIGNED_VALUE
   * @generated
   * @ordered
   */
  UNSIGNED(0, "UNSIGNED", "unsigned"),

  /**
   * The '<em><b>SIGNED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SIGNED_VALUE
   * @generated
   * @ordered
   */
  SIGNED(1, "SIGNED", "signed"),

  /**
   * The '<em><b>REAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REAL_VALUE
   * @generated
   * @ordered
   */
  REAL(2, "REAL", "real");

  /**
   * The '<em><b>UNSIGNED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNSIGNED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNSIGNED
   * @model literal="unsigned"
   * @generated
   * @ordered
   */
  public static final int UNSIGNED_VALUE = 0;

  /**
   * The '<em><b>SIGNED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SIGNED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SIGNED
   * @model literal="signed"
   * @generated
   * @ordered
   */
  public static final int SIGNED_VALUE = 1;

  /**
   * The '<em><b>REAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REAL
   * @model literal="real"
   * @generated
   * @ordered
   */
  public static final int REAL_VALUE = 2;

  /**
   * An array of all the '<em><b>Primitive Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PrimitiveKind[] VALUES_ARRAY =
    new PrimitiveKind[]
    {
      UNSIGNED,
      SIGNED,
      REAL,
    };

  /**
   * A public read-only list of all the '<em><b>Primitive Kind</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PrimitiveKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Primitive Kind</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitiveKind get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PrimitiveKind result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Primitive Kind</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitiveKind getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PrimitiveKind result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Primitive Kind</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrimitiveKind get(int value)
  {
    switch (value)
    {
      case UNSIGNED_VALUE: return UNSIGNED;
      case SIGNED_VALUE: return SIGNED;
      case REAL_VALUE: return REAL;
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
  private PrimitiveKind(int value, String name, String literal)
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
  
} //PrimitiveKind

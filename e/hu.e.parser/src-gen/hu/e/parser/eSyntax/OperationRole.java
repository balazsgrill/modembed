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
 * A representation of the literals of the enumeration '<em><b>Operation Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationRole()
 * @model
 * @generated
 */
public enum OperationRole implements Enumerator
{
  /**
   * The '<em><b>SET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SET_VALUE
   * @generated
   * @ordered
   */
  SET(0, "SET", "SET"),

  /**
   * The '<em><b>ADD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ADD_VALUE
   * @generated
   * @ordered
   */
  ADD(1, "ADD", "ADD"),

  /**
   * The '<em><b>SUBTRACT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBTRACT_VALUE
   * @generated
   * @ordered
   */
  SUBTRACT(2, "SUBTRACT", "SUBTRACT"),

  /**
   * The '<em><b>AND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AND_VALUE
   * @generated
   * @ordered
   */
  AND(3, "AND", "AND"),

  /**
   * The '<em><b>OR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OR_VALUE
   * @generated
   * @ordered
   */
  OR(4, "OR", "OR"),

  /**
   * The '<em><b>XOR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XOR_VALUE
   * @generated
   * @ordered
   */
  XOR(5, "XOR", "XOR"),

  /**
   * The '<em><b>EQUALS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUALS_VALUE
   * @generated
   * @ordered
   */
  EQUALS(6, "EQUALS", "EQUALS"),

  /**
   * The '<em><b>BRANCH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BRANCH_VALUE
   * @generated
   * @ordered
   */
  BRANCH(7, "BRANCH", "BRANCH"),

  /**
   * The '<em><b>UC GOTO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UC_GOTO_VALUE
   * @generated
   * @ordered
   */
  UC_GOTO(8, "UC_GOTO", "UC_GOTO"),

  /**
   * The '<em><b>NOT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_VALUE
   * @generated
   * @ordered
   */
  NOT(9, "NOT", "NOT"),

  /**
   * The '<em><b>INDIRECTION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INDIRECTION_VALUE
   * @generated
   * @ordered
   */
  INDIRECTION(10, "INDIRECTION", "INDIRECTION"),

  /**
   * The '<em><b>CLEAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLEAR_VALUE
   * @generated
   * @ordered
   */
  CLEAR(11, "CLEAR", "CLEAR"),

  /**
   * The '<em><b>INCREMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INCREMENT_VALUE
   * @generated
   * @ordered
   */
  INCREMENT(12, "INCREMENT", "INCREMENT"),

  /**
   * The '<em><b>DECREMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECREMENT_VALUE
   * @generated
   * @ordered
   */
  DECREMENT(13, "DECREMENT", "DECREMENT"),

  /**
   * The '<em><b>DIV</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DIV_VALUE
   * @generated
   * @ordered
   */
  DIV(14, "DIV", "DIV"),

  /**
   * The '<em><b>MOD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOD_VALUE
   * @generated
   * @ordered
   */
  MOD(15, "MOD", "MOD"),

  /**
   * The '<em><b>LT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LT_VALUE
   * @generated
   * @ordered
   */
  LT(16, "LT", "LT"),

  /**
   * The '<em><b>LTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LTE_VALUE
   * @generated
   * @ordered
   */
  LTE(17, "LTE", "LTE"),

  /**
   * The '<em><b>GT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GT_VALUE
   * @generated
   * @ordered
   */
  GT(18, "GT", "GT"),

  /**
   * The '<em><b>GTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GTE_VALUE
   * @generated
   * @ordered
   */
  GTE(19, "GTE", "GTE");

  /**
   * The '<em><b>SET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SET
   * @model
   * @generated
   * @ordered
   */
  public static final int SET_VALUE = 0;

  /**
   * The '<em><b>ADD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ADD
   * @model
   * @generated
   * @ordered
   */
  public static final int ADD_VALUE = 1;

  /**
   * The '<em><b>SUBTRACT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUBTRACT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUBTRACT
   * @model
   * @generated
   * @ordered
   */
  public static final int SUBTRACT_VALUE = 2;

  /**
   * The '<em><b>AND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AND
   * @model
   * @generated
   * @ordered
   */
  public static final int AND_VALUE = 3;

  /**
   * The '<em><b>OR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OR
   * @model
   * @generated
   * @ordered
   */
  public static final int OR_VALUE = 4;

  /**
   * The '<em><b>XOR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XOR
   * @model
   * @generated
   * @ordered
   */
  public static final int XOR_VALUE = 5;

  /**
   * The '<em><b>EQUALS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EQUALS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUALS
   * @model
   * @generated
   * @ordered
   */
  public static final int EQUALS_VALUE = 6;

  /**
   * The '<em><b>BRANCH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BRANCH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BRANCH
   * @model
   * @generated
   * @ordered
   */
  public static final int BRANCH_VALUE = 7;

  /**
   * The '<em><b>UC GOTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UC GOTO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UC_GOTO
   * @model
   * @generated
   * @ordered
   */
  public static final int UC_GOTO_VALUE = 8;

  /**
   * The '<em><b>NOT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT
   * @model
   * @generated
   * @ordered
   */
  public static final int NOT_VALUE = 9;

  /**
   * The '<em><b>INDIRECTION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INDIRECTION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INDIRECTION
   * @model
   * @generated
   * @ordered
   */
  public static final int INDIRECTION_VALUE = 10;

  /**
   * The '<em><b>CLEAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLEAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLEAR
   * @model
   * @generated
   * @ordered
   */
  public static final int CLEAR_VALUE = 11;

  /**
   * The '<em><b>INCREMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INCREMENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INCREMENT
   * @model
   * @generated
   * @ordered
   */
  public static final int INCREMENT_VALUE = 12;

  /**
   * The '<em><b>DECREMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DECREMENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECREMENT
   * @model
   * @generated
   * @ordered
   */
  public static final int DECREMENT_VALUE = 13;

  /**
   * The '<em><b>DIV</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DIV</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DIV
   * @model
   * @generated
   * @ordered
   */
  public static final int DIV_VALUE = 14;

  /**
   * The '<em><b>MOD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOD
   * @model
   * @generated
   * @ordered
   */
  public static final int MOD_VALUE = 15;

  /**
   * The '<em><b>LT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LT
   * @model
   * @generated
   * @ordered
   */
  public static final int LT_VALUE = 16;

  /**
   * The '<em><b>LTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LTE
   * @model
   * @generated
   * @ordered
   */
  public static final int LTE_VALUE = 17;

  /**
   * The '<em><b>GT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GT
   * @model
   * @generated
   * @ordered
   */
  public static final int GT_VALUE = 18;

  /**
   * The '<em><b>GTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GTE
   * @model
   * @generated
   * @ordered
   */
  public static final int GTE_VALUE = 19;

  /**
   * An array of all the '<em><b>Operation Role</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OperationRole[] VALUES_ARRAY =
    new OperationRole[]
    {
      SET,
      ADD,
      SUBTRACT,
      AND,
      OR,
      XOR,
      EQUALS,
      BRANCH,
      UC_GOTO,
      NOT,
      INDIRECTION,
      CLEAR,
      INCREMENT,
      DECREMENT,
      DIV,
      MOD,
      LT,
      LTE,
      GT,
      GTE,
    };

  /**
   * A public read-only list of all the '<em><b>Operation Role</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OperationRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Operation Role</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationRole get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OperationRole result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operation Role</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationRole getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OperationRole result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Operation Role</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OperationRole get(int value)
  {
    switch (value)
    {
      case SET_VALUE: return SET;
      case ADD_VALUE: return ADD;
      case SUBTRACT_VALUE: return SUBTRACT;
      case AND_VALUE: return AND;
      case OR_VALUE: return OR;
      case XOR_VALUE: return XOR;
      case EQUALS_VALUE: return EQUALS;
      case BRANCH_VALUE: return BRANCH;
      case UC_GOTO_VALUE: return UC_GOTO;
      case NOT_VALUE: return NOT;
      case INDIRECTION_VALUE: return INDIRECTION;
      case CLEAR_VALUE: return CLEAR;
      case INCREMENT_VALUE: return INCREMENT;
      case DECREMENT_VALUE: return DECREMENT;
      case DIV_VALUE: return DIV;
      case MOD_VALUE: return MOD;
      case LT_VALUE: return LT;
      case LTE_VALUE: return LTE;
      case GT_VALUE: return GT;
      case GTE_VALUE: return GTE;
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
  private OperationRole(int value, String name, String literal)
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
  
} //OperationRole

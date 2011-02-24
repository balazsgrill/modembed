/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package embedded.assembly;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Field Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see embedded.assembly.AssemblyPackage#getFieldType()
 * @model
 * @generated
 */
public enum FieldType implements Enumerator {
	/**
	 * The '<em><b>Literal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITERAL_VALUE
	 * @generated
	 * @ordered
	 */
	LITERAL(0, "Literal", "Literal"), /**
	 * The '<em><b>Code Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_ADDRESS(1, "CodeAddress", "CodeAddress"), /**
	 * The '<em><b>Relative Code Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_CODE_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE_CODE_ADDRESS(2, "RelativeCodeAddress", "RelativeCodeAddress"), /**
	 * The '<em><b>Mem Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEM_ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	MEM_ADDRESS(3, "MemAddress", "MemAddress"), /**
	 * The '<em><b>Bit Select</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_SELECT(4, "BitSelect", "BitSelect"), /**
	 * The '<em><b>Dont Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DONT_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	DONT_CARE(5, "DontCare", "DontCare"), /**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "Other", "Other")
	;

	/**
	 * The '<em><b>Literal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Literal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITERAL
	 * @model name="Literal"
	 * @generated
	 * @ordered
	 */
	public static final int LITERAL_VALUE = 0;

/**
	 * The '<em><b>Code Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE_ADDRESS
	 * @model name="CodeAddress"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_ADDRESS_VALUE = 1;

/**
	 * The '<em><b>Relative Code Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relative Code Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_CODE_ADDRESS
	 * @model name="RelativeCodeAddress"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_CODE_ADDRESS_VALUE = 2;

/**
	 * The '<em><b>Mem Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mem Address</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEM_ADDRESS
	 * @model name="MemAddress"
	 * @generated
	 * @ordered
	 */
	public static final int MEM_ADDRESS_VALUE = 3;

/**
	 * The '<em><b>Bit Select</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bit Select</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIT_SELECT
	 * @model name="BitSelect"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_SELECT_VALUE = 4;

/**
	 * The '<em><b>Dont Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dont Care</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DONT_CARE
	 * @model name="DontCare"
	 * @generated
	 * @ordered
	 */
	public static final int DONT_CARE_VALUE = 5;

/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FieldType[] VALUES_ARRAY =
		new FieldType[] {
			LITERAL,
			CODE_ADDRESS,
			RELATIVE_CODE_ADDRESS,
			MEM_ADDRESS,
			BIT_SELECT,
			DONT_CARE,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FieldType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Field Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FieldType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FieldType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FieldType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FieldType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Field Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FieldType get(int value) {
		switch (value) {
			case LITERAL_VALUE: return LITERAL;
			case CODE_ADDRESS_VALUE: return CODE_ADDRESS;
			case RELATIVE_CODE_ADDRESS_VALUE: return RELATIVE_CODE_ADDRESS;
			case MEM_ADDRESS_VALUE: return MEM_ADDRESS;
			case BIT_SELECT_VALUE: return BIT_SELECT;
			case DONT_CARE_VALUE: return DONT_CARE;
			case OTHER_VALUE: return OTHER;
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
	private FieldType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FieldType

/**
 */
package hu.modembed.model.architecture.linking;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Target Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.architecture.linking.LinkingPackage#getBinaryTargetType()
 * @model
 * @generated
 */
public enum BinaryTargetType implements Enumerator {
	/**
	 * The '<em><b>Raw</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAW_VALUE
	 * @generated
	 * @ordered
	 */
	RAW(0, "Raw", "Raw"),

	/**
	 * The '<em><b>Intel Hex File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEL_HEX_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	INTEL_HEX_FILE(1, "IntelHexFile", "IntelHexFile"),

	/**
	 * The '<em><b>Motorola Hex File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTOROLA_HEX_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	MOTOROLA_HEX_FILE(2, "MotorolaHexFile", "MotorolaHexFile");

	/**
	 * The '<em><b>Raw</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Raw</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAW
	 * @model name="Raw"
	 * @generated
	 * @ordered
	 */
	public static final int RAW_VALUE = 0;

	/**
	 * The '<em><b>Intel Hex File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intel Hex File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEL_HEX_FILE
	 * @model name="IntelHexFile"
	 * @generated
	 * @ordered
	 */
	public static final int INTEL_HEX_FILE_VALUE = 1;

	/**
	 * The '<em><b>Motorola Hex File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motorola Hex File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTOROLA_HEX_FILE
	 * @model name="MotorolaHexFile"
	 * @generated
	 * @ordered
	 */
	public static final int MOTOROLA_HEX_FILE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Binary Target Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryTargetType[] VALUES_ARRAY =
		new BinaryTargetType[] {
			RAW,
			INTEL_HEX_FILE,
			MOTOROLA_HEX_FILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Binary Target Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BinaryTargetType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Target Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryTargetType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryTargetType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Target Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryTargetType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryTargetType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Target Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryTargetType get(int value) {
		switch (value) {
			case RAW_VALUE: return RAW;
			case INTEL_HEX_FILE_VALUE: return INTEL_HEX_FILE;
			case MOTOROLA_HEX_FILE_VALUE: return MOTOROLA_HEX_FILE;
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
	private BinaryTargetType(int value, String name, String literal) {
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
	
} //BinaryTargetType

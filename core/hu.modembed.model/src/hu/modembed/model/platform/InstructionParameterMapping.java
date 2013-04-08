/**
 */
package hu.modembed.model.platform;

import hu.modembed.model.core.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.InstructionParameterMapping#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.platform.InstructionParameterMapping#getBitOffset <em>Bit Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.platform.PlatformPackage#getInstructionParameterMapping()
 * @model
 * @generated
 */
public interface InstructionParameterMapping extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(OperationArgument)
	 * @see hu.modembed.model.platform.PlatformPackage#getInstructionParameterMapping_Value()
	 * @model
	 * @generated
	 */
	OperationArgument getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.platform.InstructionParameterMapping#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OperationArgument value);

	/**
	 * Returns the value of the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Offset</em>' attribute.
	 * @see #setBitOffset(int)
	 * @see hu.modembed.model.platform.PlatformPackage#getInstructionParameterMapping_BitOffset()
	 * @model
	 * @generated
	 */
	int getBitOffset();

	/**
	 * Sets the value of the '{@link hu.modembed.model.platform.InstructionParameterMapping#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(int value);

} // InstructionParameterMapping

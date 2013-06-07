/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform;

import hu.modembed.model.modembed.infrastructure.AttributeDefinition;
import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValueOffset <em>Value Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getInstructionParameterMapping()
 * @model
 * @generated
 */
public interface InstructionParameterMapping extends InstructionParameterValue {
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
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getInstructionParameterMapping_Value()
	 * @model required="true"
	 * @generated
	 */
	OperationArgument getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(OperationArgument value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeDefinition)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getInstructionParameterMapping_Attribute()
	 * @model
	 * @generated
	 */
	AttributeDefinition getAttribute();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeDefinition value);

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
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getInstructionParameterMapping_BitOffset()
	 * @model
	 * @generated
	 */
	int getBitOffset();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getBitOffset <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Offset</em>' attribute.
	 * @see #getBitOffset()
	 * @generated
	 */
	void setBitOffset(int value);

	/**
	 * Returns the value of the '<em><b>Value Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Offset</em>' attribute.
	 * @see #setValueOffset(int)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getInstructionParameterMapping_ValueOffset()
	 * @model
	 * @generated
	 */
	int getValueOffset();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValueOffset <em>Value Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Offset</em>' attribute.
	 * @see #getValueOffset()
	 * @generated
	 */
	void setValueOffset(int value);

} // InstructionParameterMapping

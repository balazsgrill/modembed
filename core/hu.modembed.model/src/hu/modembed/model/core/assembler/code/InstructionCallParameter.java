/**
 */
package hu.modembed.model.core.assembler.code;

import hu.modembed.model.core.MODembedElement;

import hu.modembed.model.core.assembler.InstructionParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.code.InstructionCallParameter#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.code.InstructionCallParameter#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.assembler.code.CodePackage#getInstructionCallParameter()
 * @model
 * @generated
 */
public interface InstructionCallParameter extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see hu.modembed.model.core.assembler.code.CodePackage#getInstructionCallParameter_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.code.InstructionCallParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(InstructionParameter)
	 * @see hu.modembed.model.core.assembler.code.CodePackage#getInstructionCallParameter_Definition()
	 * @model
	 * @generated
	 */
	InstructionParameter getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.code.InstructionCallParameter#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(InstructionParameter value);

} // InstructionCallParameter

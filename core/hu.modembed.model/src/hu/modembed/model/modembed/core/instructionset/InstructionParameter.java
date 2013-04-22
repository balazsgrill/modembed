/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionParameter()
 * @model
 * @generated
 */
public interface InstructionParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

} // InstructionParameter

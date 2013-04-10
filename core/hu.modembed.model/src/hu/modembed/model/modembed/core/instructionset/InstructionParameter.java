/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getId <em>Id</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionParameter()
 * @model
 * @generated
 */
public interface InstructionParameter extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(char)
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionParameter_Id()
	 * @model required="true"
	 * @generated
	 */
	char getId();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(char value);

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

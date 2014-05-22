/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionParameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionParameter()
 * @model
 * @generated
 */
public interface InstructionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(long)
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionParameter_DefaultValue()
	 * @model
	 * @generated
	 */
	long getDefaultValue();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.InstructionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // InstructionParameter

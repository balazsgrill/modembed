/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.Instruction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.Instruction#getName <em>Name</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.Instruction#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.assembler.instructionset.InstructionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstruction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionParameter> getParameters();

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
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstruction_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.Instruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.assembler.instructionset.InstructionWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstruction_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionWord> getWords();

} // Instruction

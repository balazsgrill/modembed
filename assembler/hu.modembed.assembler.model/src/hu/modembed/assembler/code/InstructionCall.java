/**
 */
package hu.modembed.assembler.code;

import hu.modembed.assembler.instructionset.Instruction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.code.InstructionCall#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.InstructionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.code.CodePackage#getInstructionCall()
 * @model
 * @generated
 */
public interface InstructionCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference.
	 * @see #setInstruction(Instruction)
	 * @see hu.modembed.assembler.code.CodePackage#getInstructionCall_Instruction()
	 * @model required="true"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.code.InstructionCall#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.assembler.code.InstructionCallArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.modembed.assembler.code.CodePackage#getInstructionCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionCallArgument> getArguments();

} // InstructionCall

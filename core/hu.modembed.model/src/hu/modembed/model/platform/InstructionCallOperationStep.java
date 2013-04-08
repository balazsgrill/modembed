/**
 */
package hu.modembed.model.platform;

import hu.modembed.model.core.assembler.Instruction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Call Operation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.InstructionCallOperationStep#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link hu.modembed.model.platform.InstructionCallOperationStep#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.platform.PlatformPackage#getInstructionCallOperationStep()
 * @model
 * @generated
 */
public interface InstructionCallOperationStep extends OperationStep {
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
	 * @see hu.modembed.model.platform.PlatformPackage#getInstructionCallOperationStep_Instruction()
	 * @model
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.platform.InstructionCallOperationStep#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.platform.InstructionParameterMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.modembed.model.platform.PlatformPackage#getInstructionCallOperationStep_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionParameterMapping> getArguments();

} // InstructionCallOperationStep

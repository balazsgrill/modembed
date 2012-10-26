/**
 */
package hu.modembed.model.emodel.expressions;

import hu.modembed.model.core.assembler.Instruction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.expressions.InstructionCall#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getInstructionCall()
 * @model
 * @generated
 */
public interface InstructionCall extends Call {
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
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getInstructionCall_Instruction()
	 * @model required="true"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.expressions.InstructionCall#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

} // InstructionCall

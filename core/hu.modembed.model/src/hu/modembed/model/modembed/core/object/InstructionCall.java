/**
 */
package hu.modembed.model.modembed.core.object;

import hu.modembed.model.modembed.core.instructionset.Instruction;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.InstructionCall#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.InstructionCall#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getInstructionCall()
 * @model
 * @generated
 */
public interface InstructionCall extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.object.InstructionCallParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getInstructionCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionCallParameter> getParameters();

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
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getInstructionCall_Instruction()
	 * @model
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.object.InstructionCall#getInstruction <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

} // InstructionCall

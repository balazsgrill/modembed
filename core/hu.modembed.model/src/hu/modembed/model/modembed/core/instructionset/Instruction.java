/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.Instruction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.Instruction#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.instructionset.InstructionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstruction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.instructionset.InstructionWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstruction_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionWord> getWords();

} // Instruction

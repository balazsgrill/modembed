/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionSet#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionSet#getExtend <em>Extend</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionSet()
 * @model
 * @generated
 */
public interface InstructionSet extends RootElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.instructionset.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionSet_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extend</em>' reference.
	 * @see #setExtend(InstructionSet)
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionSet_Extend()
	 * @model
	 * @generated
	 */
	InstructionSet getExtend();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.instructionset.InstructionSet#getExtend <em>Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extend</em>' reference.
	 * @see #getExtend()
	 * @generated
	 */
	void setExtend(InstructionSet value);

} // InstructionSet

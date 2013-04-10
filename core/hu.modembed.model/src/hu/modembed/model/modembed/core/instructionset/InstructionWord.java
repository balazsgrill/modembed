/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionWord#getSections <em>Sections</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionWord#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionWord()
 * @model
 * @generated
 */
public interface InstructionWord extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.instructionset.InstructionSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionWord_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionSection> getSections();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.instructionset.InstructionWordCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionWord_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionWordCondition> getCondition();

} // InstructionWord

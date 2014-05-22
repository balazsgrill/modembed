/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionWord#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionWord()
 * @model
 * @generated
 */
public interface InstructionWord extends EObject {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.assembler.instructionset.InstructionSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionWord_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionSection> getSections();

} // InstructionWord

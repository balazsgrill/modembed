/**
 */
package hu.modembed.model.core.assembler;

import hu.modembed.model.core.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.Instruction#getSections <em>Sections</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.Instruction#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.core.assembler.InstructionSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstruction_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionSection> getSections();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.core.assembler.InstructionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstruction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionParameter> getParameters();

} // Instruction

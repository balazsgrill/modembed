/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionSet#getName <em>Name</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionSet#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionSet#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSet()
 * @model
 * @generated
 */
public interface InstructionSet extends EObject {
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
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.InstructionSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(InstructionSet)
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSet_Extends()
	 * @model
	 * @generated
	 */
	InstructionSet getExtends();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.InstructionSet#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(InstructionSet value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.assembler.instructionset.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSet_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // InstructionSet

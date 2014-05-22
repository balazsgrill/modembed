/**
 */
package hu.modembed.assembler.code;

import hu.modembed.assembler.instructionset.InstructionSet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembler Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.code.AssemblerObject#getInstructionset <em>Instructionset</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.AssemblerObject#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.AssemblerObject#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.code.CodePackage#getAssemblerObject()
 * @model
 * @generated
 */
public interface AssemblerObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructionset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructionset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructionset</em>' reference.
	 * @see #setInstructionset(InstructionSet)
	 * @see hu.modembed.assembler.code.CodePackage#getAssemblerObject_Instructionset()
	 * @model
	 * @generated
	 */
	InstructionSet getInstructionset();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.code.AssemblerObject#getInstructionset <em>Instructionset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructionset</em>' reference.
	 * @see #getInstructionset()
	 * @generated
	 */
	void setInstructionset(InstructionSet value);

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see hu.modembed.assembler.code.CodePackage#getAssemblerObject_StartAddress()
	 * @model default="0" required="true"
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.code.AssemblerObject#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.assembler.code.InstructionCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see hu.modembed.assembler.code.CodePackage#getAssemblerObject_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionCall> getInstructions();

} // AssemblerObject

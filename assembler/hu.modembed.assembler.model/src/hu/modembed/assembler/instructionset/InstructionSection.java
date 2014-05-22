/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionSection#getSize <em>Size</em>}</li>
 *   <li>{@link hu.modembed.assembler.instructionset.InstructionSection#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSection()
 * @model abstract="true"
 * @generated
 */
public interface InstructionSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSection_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.InstructionSection#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' attribute.
	 * @see #setShift(int)
	 * @see hu.modembed.assembler.instructionset.InstructionsetPackage#getInstructionSection_Shift()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getShift();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.instructionset.InstructionSection#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(int value);

} // InstructionSection

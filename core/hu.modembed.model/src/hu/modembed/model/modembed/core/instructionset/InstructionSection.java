/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getSize <em>Size</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionSection()
 * @model abstract="true"
 * @generated
 */
public interface InstructionSection extends MODembedElement {
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
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionSection_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shift</em>' attribute.
	 * @see #setShift(int)
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#getInstructionSection_Shift()
	 * @model
	 * @generated
	 */
	int getShift();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(int value);

} // InstructionSection

/**
 */
package hu.modembed.model.core.assembler;

import hu.modembed.model.core.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.InstructionSection#getStart <em>Start</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.InstructionSection#getSize <em>Size</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.InstructionSection#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionSection()
 * @model abstract="true"
 * @generated
 */
public interface InstructionSection extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionSection_Start()
	 * @model required="true"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.InstructionSection#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

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
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionSection_Size()
	 * @model required="true"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.InstructionSection#getSize <em>Size</em>}' attribute.
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
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionSection_Shift()
	 * @model required="true"
	 * @generated
	 */
	int getShift();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.InstructionSection#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(int value);

} // InstructionSection

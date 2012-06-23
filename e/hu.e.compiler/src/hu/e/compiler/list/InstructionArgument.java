/**
 */
package hu.e.compiler.list;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.InstructionArgument#getShift <em>Shift</em>}</li>
 *   <li>{@link hu.e.compiler.list.InstructionArgument#getSize <em>Size</em>}</li>
 *   <li>{@link hu.e.compiler.list.InstructionArgument#getStart <em>Start</em>}</li>
 *   <li>{@link hu.e.compiler.list.InstructionArgument#getOffset <em>Offset</em>}</li>
 *   <li>{@link hu.e.compiler.list.InstructionArgument#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getInstructionArgument()
 * @model
 * @generated
 */
public interface InstructionArgument extends EObject {
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
	 * @see hu.e.compiler.list.ListPackage#getInstructionArgument_Shift()
	 * @model
	 * @generated
	 */
	int getShift();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionArgument#getShift <em>Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shift</em>' attribute.
	 * @see #getShift()
	 * @generated
	 */
	void setShift(int value);

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
	 * @see hu.e.compiler.list.ListPackage#getInstructionArgument_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionArgument#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

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
	 * @see hu.e.compiler.list.ListPackage#getInstructionArgument_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionArgument#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see hu.e.compiler.list.ListPackage#getInstructionArgument_Offset()
	 * @model default="0"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionArgument#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(LinkTimeValue)
	 * @see hu.e.compiler.list.ListPackage#getInstructionArgument_Value()
	 * @model containment="true"
	 * @generated
	 */
	LinkTimeValue getValue();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionArgument#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(LinkTimeValue value);

} // InstructionArgument

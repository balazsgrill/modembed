/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.InstructionStep#getCode <em>Code</em>}</li>
 *   <li>{@link hu.e.compiler.list.InstructionStep#getRefs <em>Refs</em>}</li>
 *   <li>{@link hu.e.compiler.list.InstructionStep#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getInstructionStep()
 * @model
 * @generated
 */
public interface InstructionStep extends ProgramStep {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(long)
	 * @see hu.e.compiler.list.ListPackage#getInstructionStep_Code()
	 * @model
	 * @generated
	 */
	long getCode();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionStep#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(long value);

	/**
	 * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
	 * The list contents are of type {@link hu.e.compiler.list.LabelReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refs</em>' containment reference list.
	 * @see hu.e.compiler.list.ListPackage#getInstructionStep_Refs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LabelReference> getRefs();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see hu.e.compiler.list.ListPackage#getInstructionStep_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.InstructionStep#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

} // InstructionStep

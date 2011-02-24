/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package embedded.assembly;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link embedded.assembly.Instruction#getName <em>Name</em>}</li>
 *   <li>{@link embedded.assembly.Instruction#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see embedded.assembly.AssemblyPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
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
	 * @see embedded.assembly.AssemblyPackage#getInstruction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link embedded.assembly.Instruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link embedded.assembly.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see embedded.assembly.AssemblyPackage#getInstruction_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

} // Instruction

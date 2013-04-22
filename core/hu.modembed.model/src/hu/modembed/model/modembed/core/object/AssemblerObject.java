/**
 */
package hu.modembed.model.modembed.core.object;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembler Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.AssemblerObject#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.AssemblerObject#getStartAddress <em>Start Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getAssemblerObject()
 * @model
 * @generated
 */
public interface AssemblerObject extends RootElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.object.InstructionCall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getAssemblerObject_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstructionCall> getInstructions();

	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(long)
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getAssemblerObject_StartAddress()
	 * @model
	 * @generated
	 */
	long getStartAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.core.object.AssemblerObject#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(long value);

} // AssemblerObject

/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.infrastructure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getActions <em>Actions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getLocalSymbols <em>Local Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehavior()
 * @model
 * @generated
 */
public interface SequentialBehavior extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.SequentialAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehavior_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequentialAction> getActions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehavior_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Local Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Symbols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Symbols</em>' containment reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSequentialBehavior_LocalSymbols()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolAssignment> getLocalSymbols();

} // SequentialBehavior

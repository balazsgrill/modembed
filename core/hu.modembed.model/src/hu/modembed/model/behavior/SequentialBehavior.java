/**
 */
package hu.modembed.model.behavior;

import hu.modembed.model.core.RootElement;
import hu.modembed.model.emodel.LibraryElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.behavior.SequentialBehavior#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link hu.modembed.model.behavior.SequentialBehavior#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.behavior.BehaviorPackage#getSequentialBehavior()
 * @model
 * @generated
 */
public interface SequentialBehavior extends RootElement {
	/**
	 * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.behavior.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbols</em>' containment reference list.
	 * @see hu.modembed.model.behavior.BehaviorPackage#getSequentialBehavior_Symbols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbol> getSymbols();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.behavior.SequentialAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see hu.modembed.model.behavior.BehaviorPackage#getSequentialBehavior_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequentialAction> getActions();

} // SequentialBehavior

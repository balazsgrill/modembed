/**
 */
package hu.modembed.model.abstraction.behavior;

import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Value Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.SymbolValueMap#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbolValueMap()
 * @model
 * @generated
 */
public interface SymbolValueMap extends RootElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.abstraction.behavior.SymbolValueAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbolValueMap_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolValueAssignment> getValues();

} // SymbolValueMap

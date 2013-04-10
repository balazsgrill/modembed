/**
 */
package hu.modembed.model.abstraction.behavior;

import hu.modembed.model.abstraction.types.TypeDefinition;

import hu.modembed.model.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.Symbol#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.abstraction.behavior.Symbol#isExternal <em>External</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeDefinition)
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbol_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.behavior.Symbol#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External</em>' attribute.
	 * @see #setExternal(boolean)
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbol_External()
	 * @model
	 * @generated
	 */
	boolean isExternal();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.behavior.Symbol#isExternal <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' attribute.
	 * @see #isExternal()
	 * @generated
	 */
	void setExternal(boolean value);

} // Symbol

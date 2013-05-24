/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolAssignment()
 * @model abstract="true"
 * @generated
 */
public interface SymbolAssignment extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolAssignment_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

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
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolAssignment_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

} // SymbolAssignment

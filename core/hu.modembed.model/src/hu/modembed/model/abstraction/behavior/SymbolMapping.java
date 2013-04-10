/**
 */
package hu.modembed.model.abstraction.behavior;

import hu.modembed.model.core.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.SymbolMapping#getLocal <em>Local</em>}</li>
 *   <li>{@link hu.modembed.model.abstraction.behavior.SymbolMapping#getRemote <em>Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbolMapping()
 * @model
 * @generated
 */
public interface SymbolMapping extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Local</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' reference.
	 * @see #setLocal(Symbol)
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbolMapping_Local()
	 * @model
	 * @generated
	 */
	Symbol getLocal();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.behavior.SymbolMapping#getLocal <em>Local</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(Symbol value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' reference.
	 * @see #setRemote(Symbol)
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getSymbolMapping_Remote()
	 * @model
	 * @generated
	 */
	Symbol getRemote();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.behavior.SymbolMapping#getRemote <em>Remote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(Symbol value);

} // SymbolMapping

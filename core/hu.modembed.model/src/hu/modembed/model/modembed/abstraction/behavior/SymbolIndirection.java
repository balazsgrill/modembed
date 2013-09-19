/**
 */
package hu.modembed.model.modembed.abstraction.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol Indirection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.SymbolIndirection#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolIndirection()
 * @model
 * @generated
 */
public interface SymbolIndirection extends SymbolAssignment {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getSymbolIndirection_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolIndirection#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // SymbolIndirection

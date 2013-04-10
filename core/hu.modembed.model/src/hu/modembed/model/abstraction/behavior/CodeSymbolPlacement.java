/**
 */
package hu.modembed.model.abstraction.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Symbol Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.CodeSymbolPlacement#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getCodeSymbolPlacement()
 * @model
 * @generated
 */
public interface CodeSymbolPlacement extends SequentialAction {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(Symbol)
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getCodeSymbolPlacement_Symbol()
	 * @model
	 * @generated
	 */
	Symbol getSymbol();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.behavior.CodeSymbolPlacement#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(Symbol value);

} // CodeSymbolPlacement

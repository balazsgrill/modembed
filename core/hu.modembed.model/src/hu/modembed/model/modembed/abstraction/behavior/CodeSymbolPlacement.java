/**
 */
package hu.modembed.model.modembed.abstraction.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Symbol Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getCodeSymbolPlacement()
 * @model
 * @generated
 */
public interface CodeSymbolPlacement extends SequentialAction {
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
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getCodeSymbolPlacement_Symbol()
	 * @model required="true"
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // CodeSymbolPlacement

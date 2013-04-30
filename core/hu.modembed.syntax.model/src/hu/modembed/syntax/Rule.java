/**
 */
package hu.modembed.syntax;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.syntax.Rule#getNonTerminal <em>Non Terminal</em>}</li>
 *   <li>{@link hu.modembed.syntax.Rule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.syntax.SyntaxPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Terminal</em>' attribute.
	 * @see #setNonTerminal(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getRule_NonTerminal()
	 * @model required="true"
	 * @generated
	 */
	String getNonTerminal();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Rule#getNonTerminal <em>Non Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Terminal</em>' attribute.
	 * @see #getNonTerminal()
	 * @generated
	 */
	void setNonTerminal(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.syntax.RuleItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see hu.modembed.syntax.SyntaxPackage#getRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleItem> getBody();

} // Rule

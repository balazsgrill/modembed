/**
 */
package hu.modembed.syntax;

import hu.modembed.model.modembed.infrastructure.NamedElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.syntax.Terminal#getRegex <em>Regex</em>}</li>
 *   <li>{@link hu.modembed.syntax.Terminal#isHide <em>Hide</em>}</li>
 *   <li>{@link hu.modembed.syntax.Terminal#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.syntax.SyntaxPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getTerminal_Regex()
	 * @model required="true"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Terminal#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Returns the value of the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide</em>' attribute.
	 * @see #setHide(boolean)
	 * @see hu.modembed.syntax.SyntaxPackage#getTerminal_Hide()
	 * @model
	 * @generated
	 */
	boolean isHide();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Terminal#isHide <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide</em>' attribute.
	 * @see #isHide()
	 * @generated
	 */
	void setHide(boolean value);

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.syntax.Replace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' containment reference list.
	 * @see hu.modembed.syntax.SyntaxPackage#getTerminal_Replace()
	 * @model containment="true"
	 * @generated
	 */
	EList<Replace> getReplace();

} // Terminal

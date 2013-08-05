/**
 */
package hu.modembed.syntax;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.syntax.Replace#getSearch <em>Search</em>}</li>
 *   <li>{@link hu.modembed.syntax.Replace#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.syntax.SyntaxPackage#getReplace()
 * @model
 * @generated
 */
public interface Replace extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' attribute.
	 * @see #setSearch(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getReplace_Search()
	 * @model required="true"
	 * @generated
	 */
	String getSearch();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Replace#getSearch <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' attribute.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(String value);

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' attribute.
	 * @see #setReplace(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getReplace_Replace()
	 * @model required="true"
	 * @generated
	 */
	String getReplace();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Replace#getReplace <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replace</em>' attribute.
	 * @see #getReplace()
	 * @generated
	 */
	void setReplace(String value);

} // Replace

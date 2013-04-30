/**
 */
package hu.modembed.syntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.syntax.Push#getEclassURI <em>Eclass URI</em>}</li>
 *   <li>{@link hu.modembed.syntax.Push#getFeatue <em>Featue</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.syntax.SyntaxPackage#getPush()
 * @model
 * @generated
 */
public interface Push extends RuleItem {
	/**
	 * Returns the value of the '<em><b>Eclass URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclass URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclass URI</em>' attribute.
	 * @see #setEclassURI(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getPush_EclassURI()
	 * @model required="true"
	 * @generated
	 */
	String getEclassURI();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Push#getEclassURI <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass URI</em>' attribute.
	 * @see #getEclassURI()
	 * @generated
	 */
	void setEclassURI(String value);

	/**
	 * Returns the value of the '<em><b>Featue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featue</em>' attribute.
	 * @see #setFeatue(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getPush_Featue()
	 * @model
	 * @generated
	 */
	String getFeatue();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.Push#getFeatue <em>Featue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featue</em>' attribute.
	 * @see #getFeatue()
	 * @generated
	 */
	void setFeatue(String value);

} // Push

/**
 */
package application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationInterface#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationInterface()
 * @model
 * @generated
 */
public interface ApplicationInterface extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ApplicationInterfaceType)
	 * @see application.ApplicationPackage#getApplicationInterface_Type()
	 * @model
	 * @generated
	 */
	ApplicationInterfaceType getType();

	/**
	 * Sets the value of the '{@link application.ApplicationInterface#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ApplicationInterfaceType value);

} // ApplicationInterface

/**
 */
package application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationModule#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationModule()
 * @model
 * @generated
 */
public interface ApplicationModule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' reference.
	 * @see #setImplementation(ApplicationModuleImplementation)
	 * @see application.ApplicationPackage#getApplicationModule_Implementation()
	 * @model
	 * @generated
	 */
	ApplicationModuleImplementation getImplementation();

	/**
	 * Sets the value of the '{@link application.ApplicationModule#getImplementation <em>Implementation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ApplicationModuleImplementation value);

} // ApplicationModule

/**
 */
package application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegated Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.DelegatedImplementation#getOuterInterface <em>Outer Interface</em>}</li>
 *   <li>{@link application.DelegatedImplementation#getInnerInterface <em>Inner Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getDelegatedImplementation()
 * @model
 * @generated
 */
public interface DelegatedImplementation extends InterfaceImplementationMapping {
	/**
	 * Returns the value of the '<em><b>Outer Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Interface</em>' reference.
	 * @see #setOuterInterface(ApplicationInterface)
	 * @see application.ApplicationPackage#getDelegatedImplementation_OuterInterface()
	 * @model
	 * @generated
	 */
	ApplicationInterface getOuterInterface();

	/**
	 * Sets the value of the '{@link application.DelegatedImplementation#getOuterInterface <em>Outer Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Interface</em>' reference.
	 * @see #getOuterInterface()
	 * @generated
	 */
	void setOuterInterface(ApplicationInterface value);

	/**
	 * Returns the value of the '<em><b>Inner Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Interface</em>' containment reference.
	 * @see #setInnerInterface(InterfaceOfModule)
	 * @see application.ApplicationPackage#getDelegatedImplementation_InnerInterface()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceOfModule getInnerInterface();

	/**
	 * Sets the value of the '{@link application.DelegatedImplementation#getInnerInterface <em>Inner Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Interface</em>' containment reference.
	 * @see #getInnerInterface()
	 * @generated
	 */
	void setInnerInterface(InterfaceOfModule value);

} // DelegatedImplementation

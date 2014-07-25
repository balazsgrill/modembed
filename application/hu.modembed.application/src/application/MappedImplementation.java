/**
 */
package application;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.MappedImplementation#getImplementedInterface <em>Implemented Interface</em>}</li>
 *   <li>{@link application.MappedImplementation#getExpectedInterface <em>Expected Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getMappedImplementation()
 * @model
 * @generated
 */
public interface MappedImplementation extends InterfaceImplementationMapping {
	/**
	 * Returns the value of the '<em><b>Implemented Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Interface</em>' containment reference.
	 * @see #setImplementedInterface(InterfaceOfModule)
	 * @see application.ApplicationPackage#getMappedImplementation_ImplementedInterface()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceOfModule getImplementedInterface();

	/**
	 * Sets the value of the '{@link application.MappedImplementation#getImplementedInterface <em>Implemented Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented Interface</em>' containment reference.
	 * @see #getImplementedInterface()
	 * @generated
	 */
	void setImplementedInterface(InterfaceOfModule value);

	/**
	 * Returns the value of the '<em><b>Expected Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Interface</em>' containment reference.
	 * @see #setExpectedInterface(InterfaceOfModule)
	 * @see application.ApplicationPackage#getMappedImplementation_ExpectedInterface()
	 * @model containment="true"
	 * @generated
	 */
	InterfaceOfModule getExpectedInterface();

	/**
	 * Sets the value of the '{@link application.MappedImplementation#getExpectedInterface <em>Expected Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Interface</em>' containment reference.
	 * @see #getExpectedInterface()
	 * @generated
	 */
	void setExpectedInterface(InterfaceOfModule value);

} // MappedImplementation

/**
 */
package application;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see application.ApplicationPackage
 * @generated
 */
public interface ApplicationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationFactory eINSTANCE = application.impl.ApplicationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Interface Type</em>'.
	 * @generated
	 */
	CompositeInterfaceType createCompositeInterfaceType();

	/**
	 * Returns a new object of class '<em>Callable Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callable Interface Type</em>'.
	 * @generated
	 */
	CallableInterfaceType createCallableInterfaceType();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	ApplicationInterface createApplicationInterface();

	/**
	 * Returns a new object of class '<em>Composite Module Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Module Implementation</em>'.
	 * @generated
	 */
	CompositeModuleImplementation createCompositeModuleImplementation();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	ApplicationModule createApplicationModule();

	/**
	 * Returns a new object of class '<em>Code Based Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Based Implementation</em>'.
	 * @generated
	 */
	CodeBasedImplementation createCodeBasedImplementation();

	/**
	 * Returns a new object of class '<em>Delegated Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegated Implementation</em>'.
	 * @generated
	 */
	DelegatedImplementation createDelegatedImplementation();

	/**
	 * Returns a new object of class '<em>Interface Of Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Of Module</em>'.
	 * @generated
	 */
	InterfaceOfModule createInterfaceOfModule();

	/**
	 * Returns a new object of class '<em>Mapped Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Implementation</em>'.
	 * @generated
	 */
	MappedImplementation createMappedImplementation();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	ApplicationLibrary createApplicationLibrary();

	/**
	 * Returns a new object of class '<em>Native Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Native Data Type</em>'.
	 * @generated
	 */
	NativeDataType createNativeDataType();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApplicationPackage getApplicationPackage();

} //ApplicationFactory

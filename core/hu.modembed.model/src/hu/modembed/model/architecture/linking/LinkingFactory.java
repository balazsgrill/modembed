/**
 */
package hu.modembed.model.architecture.linking;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.architecture.linking.LinkingPackage
 * @generated
 */
public interface LinkingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkingFactory eINSTANCE = hu.modembed.model.architecture.linking.impl.LinkingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program Linking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Linking</em>'.
	 * @generated
	 */
	ProgramLinking createProgramLinking();

	/**
	 * Returns a new object of class '<em>Link Raw Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Raw Data</em>'.
	 * @generated
	 */
	LinkRawData createLinkRawData();

	/**
	 * Returns a new object of class '<em>Binary Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Target</em>'.
	 * @generated
	 */
	BinaryTarget createBinaryTarget();

	/**
	 * Returns a new object of class '<em>Binary Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Section</em>'.
	 * @generated
	 */
	BinarySection createBinarySection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinkingPackage getLinkingPackage();

} //LinkingFactory

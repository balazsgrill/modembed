/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.composition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.application.composition.CompositionPackage
 * @generated
 */
public interface CompositionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompositionFactory eINSTANCE = hu.modembed.model.application.composition.impl.CompositionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Component</em>'.
	 * @generated
	 */
	CompositeComponent createCompositeComponent();

	/**
	 * Returns a new object of class '<em>Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Component</em>'.
	 * @generated
	 */
	SubComponent createSubComponent();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompositionPackage getCompositionPackage();

} //CompositionFactory

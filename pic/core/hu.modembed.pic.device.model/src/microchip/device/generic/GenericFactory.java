/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.generic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see microchip.device.generic.GenericPackage
 * @generated
 */
public interface GenericFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericFactory eINSTANCE = microchip.device.generic.impl.GenericFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Range</em>'.
	 * @generated
	 */
	IntRange createIntRange();

	/**
	 * Returns a new object of class '<em>Float Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Range</em>'.
	 * @generated
	 */
	FloatRange createFloatRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericPackage getGenericPackage();

} //GenericFactory

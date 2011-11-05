/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see microchip.device.DevicePackage
 * @generated
 */
public interface DeviceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeviceFactory eINSTANCE = microchip.device.impl.DeviceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vdd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vdd</em>'.
	 * @generated
	 */
	Vdd createVdd();

	/**
	 * Returns a new object of class '<em>Vpp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vpp</em>'.
	 * @generated
	 */
	Vpp createVpp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevicePackage getDevicePackage();

} //DeviceFactory

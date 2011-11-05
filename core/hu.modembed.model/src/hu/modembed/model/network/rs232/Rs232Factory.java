/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network.rs232;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.network.rs232.Rs232Package
 * @generated
 */
public interface Rs232Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rs232Factory eINSTANCE = hu.modembed.model.network.rs232.impl.Rs232FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RS232 Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RS232 Interface</em>'.
	 * @generated
	 */
	RS232Interface createRS232Interface();

	/**
	 * Returns a new object of class '<em>RS232 Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RS232 Connection</em>'.
	 * @generated
	 */
	RS232Connection createRS232Connection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Rs232Package getRs232Package();

} //Rs232Factory

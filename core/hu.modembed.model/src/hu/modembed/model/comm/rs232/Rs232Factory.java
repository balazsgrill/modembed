/**
 */
package hu.modembed.model.comm.rs232;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.comm.rs232.Rs232Package
 * @generated
 */
public interface Rs232Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rs232Factory eINSTANCE = hu.modembed.model.comm.rs232.impl.Rs232FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RS232 Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RS232 Frame</em>'.
	 * @generated
	 */
	RS232Frame createRS232Frame();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>RS232 Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RS232 Protocol</em>'.
	 * @generated
	 */
	RS232Protocol createRS232Protocol();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Rs232Package getRs232Package();

} //Rs232Factory

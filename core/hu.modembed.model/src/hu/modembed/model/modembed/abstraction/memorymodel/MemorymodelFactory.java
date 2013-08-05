/**
 */
package hu.modembed.model.modembed.abstraction.memorymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage
 * @generated
 */
public interface MemorymodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemorymodelFactory eINSTANCE = hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Type</em>'.
	 * @generated
	 */
	MemoryType createMemoryType();

	/**
	 * Returns a new object of class '<em>Memory Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Instance</em>'.
	 * @generated
	 */
	MemoryInstance createMemoryInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MemorymodelPackage getMemorymodelPackage();

} //MemorymodelFactory

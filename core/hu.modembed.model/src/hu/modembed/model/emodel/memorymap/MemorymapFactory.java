/**
 */
package hu.modembed.model.emodel.memorymap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage
 * @generated
 */
public interface MemorymapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemorymapFactory eINSTANCE = hu.modembed.model.emodel.memorymap.impl.MemorymapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Map</em>'.
	 * @generated
	 */
	MemoryMap createMemoryMap();

	/**
	 * Returns a new object of class '<em>Heap Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heap Level</em>'.
	 * @generated
	 */
	HeapLevel createHeapLevel();

	/**
	 * Returns a new object of class '<em>Heap Variable Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heap Variable Mapping</em>'.
	 * @generated
	 */
	HeapVariableMapping createHeapVariableMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MemorymapPackage getMemorymapPackage();

} //MemorymapFactory

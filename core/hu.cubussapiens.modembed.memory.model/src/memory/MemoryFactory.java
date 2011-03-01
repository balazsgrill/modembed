/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see memory.MemoryPackage
 * @generated
 */
public interface MemoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MemoryFactory eINSTANCE = memory.impl.MemoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RAM Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RAM Model</em>'.
	 * @generated
	 */
	RAMModel createRAMModel();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	MemoryModel createMemoryModel();

	/**
	 * Returns a new object of class '<em>Generic RAM Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic RAM Segment</em>'.
	 * @generated
	 */
	GenericRAMSegment createGenericRAMSegment();

	/**
	 * Returns a new object of class '<em>Prog Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prog Model</em>'.
	 * @generated
	 */
	ProgModel createProgModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MemoryPackage getMemoryPackage();

} //MemoryFactory

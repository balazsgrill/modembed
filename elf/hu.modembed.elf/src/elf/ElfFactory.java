/**
 */
package elf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see elf.ElfPackage
 * @generated
 */
public interface ElfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElfFactory eINSTANCE = elf.impl.ElfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ELF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELF</em>'.
	 * @generated
	 */
	ELF createELF();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ElfPackage getElfPackage();

} //ElfFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pic.PicPackage
 * @generated
 */
public interface PicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicFactory eINSTANCE = pic.impl.PicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration Bits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Bits</em>'.
	 * @generated
	 */
	ConfigurationBits createConfigurationBits();

	/**
	 * Returns a new object of class '<em>Configuration Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Word</em>'.
	 * @generated
	 */
	ConfigurationWord createConfigurationWord();

	/**
	 * Returns a new object of class '<em>Configuration Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Field</em>'.
	 * @generated
	 */
	ConfigurationField createConfigurationField();

	/**
	 * Returns a new object of class '<em>CPU Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Type</em>'.
	 * @generated
	 */
	PicCPUType createPicCPUType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PicPackage getPicPackage();

} //PicFactory

/**
 */
package hu.modembed.model.pic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.pic.PicPackage
 * @generated
 */
public interface PicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicFactory eINSTANCE = hu.modembed.model.pic.impl.PicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PIC Configuration Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIC Configuration Model</em>'.
	 * @generated
	 */
	PICConfigurationModel createPICConfigurationModel();

	/**
	 * Returns a new object of class '<em>Config Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Word</em>'.
	 * @generated
	 */
	ConfigWord createConfigWord();

	/**
	 * Returns a new object of class '<em>Config Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Field</em>'.
	 * @generated
	 */
	ConfigField createConfigField();

	/**
	 * Returns a new object of class '<em>Config Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Literal</em>'.
	 * @generated
	 */
	ConfigLiteral createConfigLiteral();

	/**
	 * Returns a new object of class '<em>PIC Configuration Value Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIC Configuration Value Model</em>'.
	 * @generated
	 */
	PICConfigurationValueModel createPICConfigurationValueModel();

	/**
	 * Returns a new object of class '<em>Configuration Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration Selection</em>'.
	 * @generated
	 */
	ConfigurationSelection createConfigurationSelection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PicPackage getPicPackage();

} //PicFactory

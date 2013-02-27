/**
 */
package hu.modembed.model.pic.configValue;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.pic.configValue.ConfigValuePackage
 * @generated
 */
public interface ConfigValueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigValueFactory eINSTANCE = hu.modembed.model.pic.configValue.impl.ConfigValueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PIC Configuration Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIC Configuration Value</em>'.
	 * @generated
	 */
	PICConfigurationValue createPICConfigurationValue();

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
	ConfigValuePackage getConfigValuePackage();

} //ConfigValueFactory

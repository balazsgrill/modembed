/**
 */
package hu.modembed.model.pic.configValue.impl;

import hu.modembed.model.pic.configValue.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigValueFactoryImpl extends EFactoryImpl implements ConfigValueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfigValueFactory init() {
		try {
			ConfigValueFactory theConfigValueFactory = (ConfigValueFactory)EPackage.Registry.INSTANCE.getEFactory("http://hu.modembed/pic/configValue"); 
			if (theConfigValueFactory != null) {
				return theConfigValueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfigValueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigValueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfigValuePackage.PIC_CONFIGURATION_VALUE: return createPICConfigurationValue();
			case ConfigValuePackage.CONFIGURATION_SELECTION: return createConfigurationSelection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICConfigurationValue createPICConfigurationValue() {
		PICConfigurationValueImpl picConfigurationValue = new PICConfigurationValueImpl();
		return picConfigurationValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSelection createConfigurationSelection() {
		ConfigurationSelectionImpl configurationSelection = new ConfigurationSelectionImpl();
		return configurationSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigValuePackage getConfigValuePackage() {
		return (ConfigValuePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfigValuePackage getPackage() {
		return ConfigValuePackage.eINSTANCE;
	}

} //ConfigValueFactoryImpl

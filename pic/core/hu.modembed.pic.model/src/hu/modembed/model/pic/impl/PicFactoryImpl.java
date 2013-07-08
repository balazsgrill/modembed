/**
 */
package hu.modembed.model.pic.impl;

import hu.modembed.model.pic.*;

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
public class PicFactoryImpl extends EFactoryImpl implements PicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PicFactory init() {
		try {
			PicFactory thePicFactory = (PicFactory)EPackage.Registry.INSTANCE.getEFactory(PicPackage.eNS_URI);
			if (thePicFactory != null) {
				return thePicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicFactoryImpl() {
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
			case PicPackage.PIC_CONFIGURATION_MODEL: return createPICConfigurationModel();
			case PicPackage.CONFIG_WORD: return createConfigWord();
			case PicPackage.CONFIG_FIELD: return createConfigField();
			case PicPackage.CONFIG_LITERAL: return createConfigLiteral();
			case PicPackage.PIC_CONFIGURATION_VALUE_MODEL: return createPICConfigurationValueModel();
			case PicPackage.CONFIGURATION_SELECTION: return createConfigurationSelection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICConfigurationModel createPICConfigurationModel() {
		PICConfigurationModelImpl picConfigurationModel = new PICConfigurationModelImpl();
		return picConfigurationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigWord createConfigWord() {
		ConfigWordImpl configWord = new ConfigWordImpl();
		return configWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigField createConfigField() {
		ConfigFieldImpl configField = new ConfigFieldImpl();
		return configField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigLiteral createConfigLiteral() {
		ConfigLiteralImpl configLiteral = new ConfigLiteralImpl();
		return configLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PICConfigurationValueModel createPICConfigurationValueModel() {
		PICConfigurationValueModelImpl picConfigurationValueModel = new PICConfigurationValueModelImpl();
		return picConfigurationValueModel;
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
	public PicPackage getPicPackage() {
		return (PicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PicPackage getPackage() {
		return PicPackage.eINSTANCE;
	}

} //PicFactoryImpl

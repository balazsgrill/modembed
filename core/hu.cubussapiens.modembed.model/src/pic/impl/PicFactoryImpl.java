/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pic.*;

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
			PicFactory thePicFactory = (PicFactory)EPackage.Registry.INSTANCE.getEFactory("http://cubussapiens.hu/modembed/pic"); 
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
			case PicPackage.CONFIGURATION_BITS: return createConfigurationBits();
			case PicPackage.CONFIGURATION_WORD: return createConfigurationWord();
			case PicPackage.CONFIGURATION_FIELD: return createConfigurationField();
			case PicPackage.PIC_CPU_TYPE: return createPicCPUType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationBits createConfigurationBits() {
		ConfigurationBitsImpl configurationBits = new ConfigurationBitsImpl();
		return configurationBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationWord createConfigurationWord() {
		ConfigurationWordImpl configurationWord = new ConfigurationWordImpl();
		return configurationWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationField createConfigurationField() {
		ConfigurationFieldImpl configurationField = new ConfigurationFieldImpl();
		return configurationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicCPUType createPicCPUType() {
		PicCPUTypeImpl picCPUType = new PicCPUTypeImpl();
		return picCPUType;
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

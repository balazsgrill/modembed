/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig.impl;

import modembedconfig.*;

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
public class ModembedconfigFactoryImpl extends EFactoryImpl implements ModembedconfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModembedconfigFactory init() {
		try {
			ModembedconfigFactory theModembedconfigFactory = (ModembedconfigFactory)EPackage.Registry.INSTANCE.getEFactory("http://cubussapiens.hu/modembed/config"); 
			if (theModembedconfigFactory != null) {
				return theModembedconfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModembedconfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModembedconfigFactoryImpl() {
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
			case ModembedconfigPackage.SCHEME: return createScheme();
			case ModembedconfigPackage.ENUM_PARAM: return createEnumParam();
			case ModembedconfigPackage.ENUM_PARAM_LITERAL: return createEnumParamLiteral();
			case ModembedconfigPackage.PARAMETER_SET: return createParameterSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheme createScheme() {
		SchemeImpl scheme = new SchemeImpl();
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumParam createEnumParam() {
		EnumParamImpl enumParam = new EnumParamImpl();
		return enumParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumParamLiteral createEnumParamLiteral() {
		EnumParamLiteralImpl enumParamLiteral = new EnumParamLiteralImpl();
		return enumParamLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createParameterSet() {
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModembedconfigPackage getModembedconfigPackage() {
		return (ModembedconfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModembedconfigPackage getPackage() {
		return ModembedconfigPackage.eINSTANCE;
	}

} //ModembedconfigFactoryImpl

/**
 */
package hu.modembed.model.modembed.abstraction.impl;

import hu.modembed.model.modembed.abstraction.*;

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
public class AbstractionFactoryImpl extends EFactoryImpl implements AbstractionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractionFactory init() {
		try {
			AbstractionFactory theAbstractionFactory = (AbstractionFactory)EPackage.Registry.INSTANCE.getEFactory(AbstractionPackage.eNS_URI);
			if (theAbstractionFactory != null) {
				return theAbstractionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AbstractionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionFactoryImpl() {
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
			case AbstractionPackage.DEVICE_ABSTRACTION: return createDeviceAbstraction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAbstraction createDeviceAbstraction() {
		DeviceAbstractionImpl deviceAbstraction = new DeviceAbstractionImpl();
		return deviceAbstraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionPackage getAbstractionPackage() {
		return (AbstractionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AbstractionPackage getPackage() {
		return AbstractionPackage.eINSTANCE;
	}

} //AbstractionFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network.rs232.impl;

import hu.modembed.model.network.rs232.*;

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
public class Rs232FactoryImpl extends EFactoryImpl implements Rs232Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rs232Factory init() {
		try {
			Rs232Factory theRs232Factory = (Rs232Factory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/network/rs232"); 
			if (theRs232Factory != null) {
				return theRs232Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rs232FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rs232FactoryImpl() {
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
			case Rs232Package.RS232_INTERFACE: return createRS232Interface();
			case Rs232Package.RS232_CONNECTION: return createRS232Connection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RS232Interface createRS232Interface() {
		RS232InterfaceImpl rs232Interface = new RS232InterfaceImpl();
		return rs232Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RS232Connection createRS232Connection() {
		RS232ConnectionImpl rs232Connection = new RS232ConnectionImpl();
		return rs232Connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rs232Package getRs232Package() {
		return (Rs232Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rs232Package getPackage() {
		return Rs232Package.eINSTANCE;
	}

} //Rs232FactoryImpl

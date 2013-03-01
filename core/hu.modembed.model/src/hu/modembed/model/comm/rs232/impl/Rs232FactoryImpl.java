/**
 */
package hu.modembed.model.comm.rs232.impl;

import hu.modembed.model.comm.rs232.*;

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
			Rs232Factory theRs232Factory = (Rs232Factory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/comm/rs232"); 
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
			case Rs232Package.RS232_FRAME: return createRS232Frame();
			case Rs232Package.FIELD: return createField();
			case Rs232Package.RS232_PROTOCOL: return createRS232Protocol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RS232Frame createRS232Frame() {
		RS232FrameImpl rs232Frame = new RS232FrameImpl();
		return rs232Frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RS232Protocol createRS232Protocol() {
		RS232ProtocolImpl rs232Protocol = new RS232ProtocolImpl();
		return rs232Protocol;
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

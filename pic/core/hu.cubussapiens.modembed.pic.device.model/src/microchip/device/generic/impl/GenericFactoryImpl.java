/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.generic.impl;

import microchip.device.generic.*;

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
public class GenericFactoryImpl extends EFactoryImpl implements GenericFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericFactory init() {
		try {
			GenericFactory theGenericFactory = (GenericFactory)EPackage.Registry.INSTANCE.getEFactory("http://microchip.com/device/generic"); 
			if (theGenericFactory != null) {
				return theGenericFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericFactoryImpl() {
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
			case GenericPackage.INT_RANGE: return createIntRange();
			case GenericPackage.FLOAT_RANGE: return createFloatRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntRange createIntRange() {
		IntRangeImpl intRange = new IntRangeImpl();
		return intRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatRange createFloatRange() {
		FloatRangeImpl floatRange = new FloatRangeImpl();
		return floatRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPackage getGenericPackage() {
		return (GenericPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericPackage getPackage() {
		return GenericPackage.eINSTANCE;
	}

} //GenericFactoryImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.generic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see microchip.device.generic.GenericFactory
 * @model kind="package"
 * @generated
 */
public interface GenericPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://microchip.com/device/generic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericPackage eINSTANCE = microchip.device.generic.impl.GenericPackageImpl.init();

	/**
	 * The meta object id for the '{@link microchip.device.generic.impl.IntRangeImpl <em>Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.generic.impl.IntRangeImpl
	 * @see microchip.device.generic.impl.GenericPackageImpl#getIntRange()
	 * @generated
	 */
	int INT_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__END = 1;

	/**
	 * The number of structural features of the '<em>Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link microchip.device.generic.impl.FloatRangeImpl <em>Float Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.generic.impl.FloatRangeImpl
	 * @see microchip.device.generic.impl.GenericPackageImpl#getFloatRange()
	 * @generated
	 */
	int FLOAT_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE__END = 1;

	/**
	 * The number of structural features of the '<em>Float Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_RANGE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link microchip.device.generic.IntRange <em>Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Range</em>'.
	 * @see microchip.device.generic.IntRange
	 * @generated
	 */
	EClass getIntRange();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.generic.IntRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see microchip.device.generic.IntRange#getStart()
	 * @see #getIntRange()
	 * @generated
	 */
	EAttribute getIntRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.generic.IntRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see microchip.device.generic.IntRange#getEnd()
	 * @see #getIntRange()
	 * @generated
	 */
	EAttribute getIntRange_End();

	/**
	 * Returns the meta object for class '{@link microchip.device.generic.FloatRange <em>Float Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Range</em>'.
	 * @see microchip.device.generic.FloatRange
	 * @generated
	 */
	EClass getFloatRange();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.generic.FloatRange#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see microchip.device.generic.FloatRange#getStart()
	 * @see #getFloatRange()
	 * @generated
	 */
	EAttribute getFloatRange_Start();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.generic.FloatRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see microchip.device.generic.FloatRange#getEnd()
	 * @see #getFloatRange()
	 * @generated
	 */
	EAttribute getFloatRange_End();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericFactory getGenericFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link microchip.device.generic.impl.IntRangeImpl <em>Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.generic.impl.IntRangeImpl
		 * @see microchip.device.generic.impl.GenericPackageImpl#getIntRange()
		 * @generated
		 */
		EClass INT_RANGE = eINSTANCE.getIntRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_RANGE__START = eINSTANCE.getIntRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_RANGE__END = eINSTANCE.getIntRange_End();

		/**
		 * The meta object literal for the '{@link microchip.device.generic.impl.FloatRangeImpl <em>Float Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.generic.impl.FloatRangeImpl
		 * @see microchip.device.generic.impl.GenericPackageImpl#getFloatRange()
		 * @generated
		 */
		EClass FLOAT_RANGE = eINSTANCE.getFloatRange();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_RANGE__START = eINSTANCE.getFloatRange_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_RANGE__END = eINSTANCE.getFloatRange_End();

	}

} //GenericPackage

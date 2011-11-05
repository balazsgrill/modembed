/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see microchip.device.DeviceFactory
 * @model kind="package"
 * @generated
 */
public interface DevicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "device";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://microchip.com/device";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dev";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevicePackage eINSTANCE = microchip.device.impl.DevicePackageImpl.init();

	/**
	 * The meta object id for the '{@link microchip.device.impl.VddImpl <em>Vdd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.impl.VddImpl
	 * @see microchip.device.impl.DevicePackageImpl#getVdd()
	 * @generated
	 */
	int VDD = 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD__RANGE = 0;

	/**
	 * The feature id for the '<em><b>Dfltrange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD__DFLTRANGE = 1;

	/**
	 * The feature id for the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD__NOMINAL = 2;

	/**
	 * The number of structural features of the '<em>Vdd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link microchip.device.impl.VppImpl <em>Vpp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see microchip.device.impl.VppImpl
	 * @see microchip.device.impl.DevicePackageImpl#getVpp()
	 * @generated
	 */
	int VPP = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP__RANGE = 0;

	/**
	 * The feature id for the '<em><b>Dflt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP__DFLT = 1;

	/**
	 * The number of structural features of the '<em>Vpp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link microchip.device.Vdd <em>Vdd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vdd</em>'.
	 * @see microchip.device.Vdd
	 * @generated
	 */
	EClass getVdd();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.Vdd#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see microchip.device.Vdd#getRange()
	 * @see #getVdd()
	 * @generated
	 */
	EReference getVdd_Range();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.Vdd#getDfltrange <em>Dfltrange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dfltrange</em>'.
	 * @see microchip.device.Vdd#getDfltrange()
	 * @see #getVdd()
	 * @generated
	 */
	EReference getVdd_Dfltrange();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.Vdd#getNominal <em>Nominal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal</em>'.
	 * @see microchip.device.Vdd#getNominal()
	 * @see #getVdd()
	 * @generated
	 */
	EAttribute getVdd_Nominal();

	/**
	 * Returns the meta object for class '{@link microchip.device.Vpp <em>Vpp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vpp</em>'.
	 * @see microchip.device.Vpp
	 * @generated
	 */
	EClass getVpp();

	/**
	 * Returns the meta object for the containment reference '{@link microchip.device.Vpp#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see microchip.device.Vpp#getRange()
	 * @see #getVpp()
	 * @generated
	 */
	EReference getVpp_Range();

	/**
	 * Returns the meta object for the attribute '{@link microchip.device.Vpp#getDflt <em>Dflt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dflt</em>'.
	 * @see microchip.device.Vpp#getDflt()
	 * @see #getVpp()
	 * @generated
	 */
	EAttribute getVpp_Dflt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeviceFactory getDeviceFactory();

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
		 * The meta object literal for the '{@link microchip.device.impl.VddImpl <em>Vdd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.impl.VddImpl
		 * @see microchip.device.impl.DevicePackageImpl#getVdd()
		 * @generated
		 */
		EClass VDD = eINSTANCE.getVdd();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VDD__RANGE = eINSTANCE.getVdd_Range();

		/**
		 * The meta object literal for the '<em><b>Dfltrange</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VDD__DFLTRANGE = eINSTANCE.getVdd_Dfltrange();

		/**
		 * The meta object literal for the '<em><b>Nominal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VDD__NOMINAL = eINSTANCE.getVdd_Nominal();

		/**
		 * The meta object literal for the '{@link microchip.device.impl.VppImpl <em>Vpp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see microchip.device.impl.VppImpl
		 * @see microchip.device.impl.DevicePackageImpl#getVpp()
		 * @generated
		 */
		EClass VPP = eINSTANCE.getVpp();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPP__RANGE = eINSTANCE.getVpp_Range();

		/**
		 * The meta object literal for the '<em><b>Dflt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPP__DFLT = eINSTANCE.getVpp_Dflt();

	}

} //DevicePackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.pic.simulator.registry.reg;

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
 * @see hu.modembed.pic.simulator.registry.reg.RegFactory
 * @model kind="package"
 * @generated
 */
public interface RegPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cubussapiens.hu/modembed/simulator/registry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegPackage eINSTANCE = hu.modembed.pic.simulator.registry.reg.impl.RegPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.pic.simulator.registry.reg.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.pic.simulator.registry.reg.impl.CategoryImpl
	 * @see hu.modembed.pic.simulator.registry.reg.impl.RegPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORIES = 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DEVICES = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hu.modembed.pic.simulator.registry.reg.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.pic.simulator.registry.reg.impl.DeviceImpl
	 * @see hu.modembed.pic.simulator.registry.reg.impl.RegPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link hu.modembed.pic.simulator.registry.reg.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.pic.simulator.registry.reg.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.pic.simulator.registry.reg.Category#getSubcategories <em>Subcategories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategories</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Category#getSubcategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategories();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.pic.simulator.registry.reg.Category#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Category#getDevices()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Devices();

	/**
	 * Returns the meta object for class '{@link hu.modembed.pic.simulator.registry.reg.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.pic.simulator.registry.reg.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.pic.simulator.registry.reg.Device#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see hu.modembed.pic.simulator.registry.reg.Device#getUnit()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Unit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RegFactory getRegFactory();

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
		 * The meta object literal for the '{@link hu.modembed.pic.simulator.registry.reg.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.pic.simulator.registry.reg.impl.CategoryImpl
		 * @see hu.modembed.pic.simulator.registry.reg.impl.RegPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Subcategories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORIES = eINSTANCE.getCategory_Subcategories();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__DEVICES = eINSTANCE.getCategory_Devices();

		/**
		 * The meta object literal for the '{@link hu.modembed.pic.simulator.registry.reg.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.pic.simulator.registry.reg.impl.DeviceImpl
		 * @see hu.modembed.pic.simulator.registry.reg.impl.RegPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__UNIT = eINSTANCE.getDevice_Unit();

	}

} //RegPackage

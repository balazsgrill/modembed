/**
 */
package hu.modembed.model.modembed.abstraction;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

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
 * @see hu.modembed.model.modembed.abstraction.AbstractionFactory
 * @model kind="package"
 * @generated
 */
public interface AbstractionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abstraction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/abstraction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "abstraction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AbstractionPackage eINSTANCE = hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl <em>Device Abstraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl
	 * @see hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl#getDeviceAbstraction()
	 * @generated
	 */
	int DEVICE_ABSTRACTION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__ANNOTATIONS = InfrastructurePackage.ROOT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__ANCESTOR = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructionset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__INSTRUCTIONSET = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Memory Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__MEMORY_TYPES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Memory Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__MEMORY_INSTANCES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size Of Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__SIZE_OF_POINTER = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION__OPERATION = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Device Abstraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ABSTRACTION_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction <em>Device Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Abstraction</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction
	 * @generated
	 */
	EClass getDeviceAbstraction();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction#getAncestor()
	 * @see #getDeviceAbstraction()
	 * @generated
	 */
	EReference getDeviceAbstraction_Ancestor();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getInstructionset <em>Instructionset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instructionset</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction#getInstructionset()
	 * @see #getDeviceAbstraction()
	 * @generated
	 */
	EReference getDeviceAbstraction_Instructionset();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryTypes <em>Memory Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Types</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryTypes()
	 * @see #getDeviceAbstraction()
	 * @generated
	 */
	EReference getDeviceAbstraction_MemoryTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryInstances <em>Memory Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Instances</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction#getMemoryInstances()
	 * @see #getDeviceAbstraction()
	 * @generated
	 */
	EReference getDeviceAbstraction_MemoryInstances();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getSizeOfPointer <em>Size Of Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Of Pointer</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction#getSizeOfPointer()
	 * @see #getDeviceAbstraction()
	 * @generated
	 */
	EAttribute getDeviceAbstraction_SizeOfPointer();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.DeviceAbstraction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see hu.modembed.model.modembed.abstraction.DeviceAbstraction#getOperation()
	 * @see #getDeviceAbstraction()
	 * @generated
	 */
	EReference getDeviceAbstraction_Operation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AbstractionFactory getAbstractionFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl <em>Device Abstraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl
		 * @see hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl#getDeviceAbstraction()
		 * @generated
		 */
		EClass DEVICE_ABSTRACTION = eINSTANCE.getDeviceAbstraction();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ABSTRACTION__ANCESTOR = eINSTANCE.getDeviceAbstraction_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Instructionset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ABSTRACTION__INSTRUCTIONSET = eINSTANCE.getDeviceAbstraction_Instructionset();

		/**
		 * The meta object literal for the '<em><b>Memory Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ABSTRACTION__MEMORY_TYPES = eINSTANCE.getDeviceAbstraction_MemoryTypes();

		/**
		 * The meta object literal for the '<em><b>Memory Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ABSTRACTION__MEMORY_INSTANCES = eINSTANCE.getDeviceAbstraction_MemoryInstances();

		/**
		 * The meta object literal for the '<em><b>Size Of Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_ABSTRACTION__SIZE_OF_POINTER = eINSTANCE.getDeviceAbstraction_SizeOfPointer();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_ABSTRACTION__OPERATION = eINSTANCE.getDeviceAbstraction_Operation();

	}

} //AbstractionPackage

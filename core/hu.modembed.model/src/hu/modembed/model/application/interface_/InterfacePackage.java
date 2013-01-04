/**
 */
package hu.modembed.model.application.interface_;

import hu.modembed.model.core.CorePackage;

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
 * @see hu.modembed.model.application.interface_.InterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface InterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/application/interface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacePackage eINSTANCE = hu.modembed.model.application.interface_.impl.InterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.interface_.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.interface_.impl.ComponentInterfaceImpl
	 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.interface_.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.interface_.impl.OperationInterfaceImpl
	 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getOperationInterface()
	 * @generated
	 */
	int OPERATION_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE__OPERATIONS = COMPONENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_INTERFACE_FEATURE_COUNT = COMPONENT_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.interface_.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.interface_.impl.OperationImpl
	 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGUMENTS = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.interface_.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.interface_.impl.ArgumentImpl
	 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.interface_.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see hu.modembed.model.application.interface_.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.interface_.OperationInterface <em>Operation Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Interface</em>'.
	 * @see hu.modembed.model.application.interface_.OperationInterface
	 * @generated
	 */
	EClass getOperationInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.application.interface_.OperationInterface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see hu.modembed.model.application.interface_.OperationInterface#getOperations()
	 * @see #getOperationInterface()
	 * @generated
	 */
	EReference getOperationInterface_Operations();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.interface_.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see hu.modembed.model.application.interface_.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.application.interface_.Operation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.application.interface_.Operation#getArguments()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Arguments();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.interface_.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see hu.modembed.model.application.interface_.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceFactory getInterfaceFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.application.interface_.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.interface_.impl.ComponentInterfaceImpl
		 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.interface_.impl.OperationInterfaceImpl <em>Operation Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.interface_.impl.OperationInterfaceImpl
		 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getOperationInterface()
		 * @generated
		 */
		EClass OPERATION_INTERFACE = eINSTANCE.getOperationInterface();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_INTERFACE__OPERATIONS = eINSTANCE.getOperationInterface_Operations();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.interface_.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.interface_.impl.OperationImpl
		 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ARGUMENTS = eINSTANCE.getOperation_Arguments();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.interface_.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.interface_.impl.ArgumentImpl
		 * @see hu.modembed.model.application.interface_.impl.InterfacePackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

	}

} //InterfacePackage

/**
 */
package hu.modembed.model.network.rs232;

import hu.modembed.model.network.NetworkPackage;

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
 * @see hu.modembed.model.network.rs232.Rs232Factory
 * @model kind="package"
 * @generated
 */
public interface Rs232Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rs232";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/network/rs232";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rs232";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rs232Package eINSTANCE = hu.modembed.model.network.rs232.impl.Rs232PackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.network.rs232.impl.RS232InterfaceImpl <em>RS232 Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.network.rs232.impl.RS232InterfaceImpl
	 * @see hu.modembed.model.network.rs232.impl.Rs232PackageImpl#getRS232Interface()
	 * @generated
	 */
	int RS232_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_INTERFACE__ORIGINS = NetworkPackage.NETWORK_INTERFACE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_INTERFACE__DESCRIPTION = NetworkPackage.NETWORK_INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_INTERFACE__NAME = NetworkPackage.NETWORK_INTERFACE__NAME;

	/**
	 * The number of structural features of the '<em>RS232 Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_INTERFACE_FEATURE_COUNT = NetworkPackage.NETWORK_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.network.rs232.impl.RS232ConnectionImpl <em>RS232 Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.network.rs232.impl.RS232ConnectionImpl
	 * @see hu.modembed.model.network.rs232.impl.Rs232PackageImpl#getRS232Connection()
	 * @generated
	 */
	int RS232_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_CONNECTION__ORIGINS = NetworkPackage.CONNECTION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_CONNECTION__DESCRIPTION = NetworkPackage.CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_CONNECTION__NAME = NetworkPackage.CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_CONNECTION__NODES = NetworkPackage.CONNECTION__NODES;

	/**
	 * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_CONNECTION__BAUD_RATE = NetworkPackage.CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RS232 Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RS232_CONNECTION_FEATURE_COUNT = NetworkPackage.CONNECTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.network.rs232.RS232Interface <em>RS232 Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS232 Interface</em>'.
	 * @see hu.modembed.model.network.rs232.RS232Interface
	 * @generated
	 */
	EClass getRS232Interface();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.network.rs232.RS232Connection <em>RS232 Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RS232 Connection</em>'.
	 * @see hu.modembed.model.network.rs232.RS232Connection
	 * @generated
	 */
	EClass getRS232Connection();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.network.rs232.RS232Connection#getBaudRate <em>Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate</em>'.
	 * @see hu.modembed.model.network.rs232.RS232Connection#getBaudRate()
	 * @see #getRS232Connection()
	 * @generated
	 */
	EAttribute getRS232Connection_BaudRate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rs232Factory getRs232Factory();

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
		 * The meta object literal for the '{@link hu.modembed.model.network.rs232.impl.RS232InterfaceImpl <em>RS232 Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.network.rs232.impl.RS232InterfaceImpl
		 * @see hu.modembed.model.network.rs232.impl.Rs232PackageImpl#getRS232Interface()
		 * @generated
		 */
		EClass RS232_INTERFACE = eINSTANCE.getRS232Interface();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.network.rs232.impl.RS232ConnectionImpl <em>RS232 Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.network.rs232.impl.RS232ConnectionImpl
		 * @see hu.modembed.model.network.rs232.impl.Rs232PackageImpl#getRS232Connection()
		 * @generated
		 */
		EClass RS232_CONNECTION = eINSTANCE.getRS232Connection();

		/**
		 * The meta object literal for the '<em><b>Baud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RS232_CONNECTION__BAUD_RATE = eINSTANCE.getRS232Connection_BaudRate();

	}

} //Rs232Package

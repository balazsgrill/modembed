/**
 */
package hu.modembed.model.application;

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
 * @see hu.modembed.model.application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/application";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = hu.modembed.model.application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.impl.ComponentImpl
	 * @see hu.modembed.model.application.impl.ApplicationPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__USES = 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMPLEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.impl.PortImpl
	 * @see hu.modembed.model.application.impl.ApplicationPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INTERFACE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.impl.ApplicationImpl
	 * @see hu.modembed.model.application.impl.ApplicationPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Main Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAIN_COMP = 0;

	/**
	 * The feature id for the '<em><b>Main Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAIN_PORT = 1;

	/**
	 * The feature id for the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MAIN = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see hu.modembed.model.application.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.application.Component#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see hu.modembed.model.application.Component#getUses()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.application.Component#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see hu.modembed.model.application.Component#getImplements()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Implements();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hu.modembed.model.application.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.application.Port#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see hu.modembed.model.application.Port#getInterface()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Interface();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see hu.modembed.model.application.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.application.Application#getMainComp <em>Main Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Comp</em>'.
	 * @see hu.modembed.model.application.Application#getMainComp()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_MainComp();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.application.Application#getMainPort <em>Main Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Port</em>'.
	 * @see hu.modembed.model.application.Application#getMainPort()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_MainPort();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.application.Application#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main</em>'.
	 * @see hu.modembed.model.application.Application#getMain()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Main();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationFactory getApplicationFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.application.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.impl.ComponentImpl
		 * @see hu.modembed.model.application.impl.ApplicationPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__USES = eINSTANCE.getComponent_Uses();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMPLEMENTS = eINSTANCE.getComponent_Implements();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.impl.PortImpl
		 * @see hu.modembed.model.application.impl.ApplicationPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INTERFACE = eINSTANCE.getPort_Interface();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.application.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.impl.ApplicationImpl
		 * @see hu.modembed.model.application.impl.ApplicationPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Main Comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MAIN_COMP = eINSTANCE.getApplication_MainComp();

		/**
		 * The meta object literal for the '<em><b>Main Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MAIN_PORT = eINSTANCE.getApplication_MainPort();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MAIN = eINSTANCE.getApplication_Main();

	}

} //ApplicationPackage

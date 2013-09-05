/**
 */
package hu.modembed.model.modembed.application;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

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
 * @see hu.modembed.model.modembed.application.ApplicationFactory
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
	String eNS_PREFIX = "application";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = hu.modembed.model.modembed.application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.application.impl.ComponentRoleImpl <em>Component Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.application.impl.ComponentRoleImpl
	 * @see hu.modembed.model.modembed.application.impl.ApplicationPackageImpl#getComponentRole()
	 * @generated
	 */
	int COMPONENT_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__ANNOTATIONS = InfrastructurePackage.ROOT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Component Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ROLE_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.application.ComponentRole <em>Component Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Role</em>'.
	 * @see hu.modembed.model.modembed.application.ComponentRole
	 * @generated
	 */
	EClass getComponentRole();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.application.impl.ComponentRoleImpl <em>Component Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.application.impl.ComponentRoleImpl
		 * @see hu.modembed.model.modembed.application.impl.ApplicationPackageImpl#getComponentRole()
		 * @generated
		 */
		EClass COMPONENT_ROLE = eINSTANCE.getComponentRole();

	}

} //ApplicationPackage

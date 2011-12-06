/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.code;

import hu.modembed.model.application.ApplicationPackage;

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
 * @see hu.modembed.model.application.code.CodeFactory
 * @model kind="package"
 * @generated
 */
public interface CodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "code";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/application/code";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "code";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodePackage eINSTANCE = hu.modembed.model.application.code.impl.CodePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.application.code.impl.CodeComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.application.code.impl.CodeComponentImpl
	 * @see hu.modembed.model.application.code.impl.CodePackageImpl#getCodeComponent()
	 * @generated
	 */
	int CODE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPONENT__NAME = ApplicationPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPONENT__USES = ApplicationPackage.COMPONENT__USES;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPONENT__IMPLEMENTS = ApplicationPackage.COMPONENT__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPONENT__QUALIFIED_NAME = ApplicationPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPONENT_FEATURE_COUNT = ApplicationPackage.COMPONENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.application.code.CodeComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see hu.modembed.model.application.code.CodeComponent
	 * @generated
	 */
	EClass getCodeComponent();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.application.code.CodeComponent#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see hu.modembed.model.application.code.CodeComponent#getQualifiedName()
	 * @see #getCodeComponent()
	 * @generated
	 */
	EAttribute getCodeComponent_QualifiedName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeFactory getCodeFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.application.code.impl.CodeComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.application.code.impl.CodeComponentImpl
		 * @see hu.modembed.model.application.code.impl.CodePackageImpl#getCodeComponent()
		 * @generated
		 */
		EClass CODE_COMPONENT = eINSTANCE.getCodeComponent();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_COMPONENT__QUALIFIED_NAME = eINSTANCE.getCodeComponent_QualifiedName();

	}

} //CodePackage

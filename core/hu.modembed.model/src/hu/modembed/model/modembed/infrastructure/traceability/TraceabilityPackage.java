/**
 */
package hu.modembed.model.modembed.infrastructure.traceability;

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
 * @see hu.modembed.model.modembed.infrastructure.traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/infrastructure/traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.infrastructure.traceability.impl.OriginImpl <em>Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.OriginImpl
	 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 0;

	/**
	 * The number of structural features of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.infrastructure.traceability.impl.TextOriginImpl <em>Text Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TextOriginImpl
	 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl#getTextOrigin()
	 * @generated
	 */
	int TEXT_ORIGIN = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN__FILE_NAME = ORIGIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN__LINE = ORIGIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN_FEATURE_COUNT = ORIGIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.infrastructure.traceability.impl.ModelOriginImpl <em>Model Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.ModelOriginImpl
	 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl#getModelOrigin()
	 * @generated
	 */
	int MODEL_ORIGIN = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ORIGIN__ELEMENT = ORIGIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ORIGIN_FEATURE_COUNT = ORIGIN_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.infrastructure.traceability.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.traceability.Origin
	 * @generated
	 */
	EClass getOrigin();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin <em>Text Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Origin</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.traceability.TextOrigin
	 * @generated
	 */
	EClass getTextOrigin();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getFileName()
	 * @see #getTextOrigin()
	 * @generated
	 */
	EAttribute getTextOrigin_FileName();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getLine()
	 * @see #getTextOrigin()
	 * @generated
	 */
	EAttribute getTextOrigin_Line();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.infrastructure.traceability.ModelOrigin <em>Model Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Origin</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.traceability.ModelOrigin
	 * @generated
	 */
	EClass getModelOrigin();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.infrastructure.traceability.ModelOrigin#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.traceability.ModelOrigin#getElement()
	 * @see #getModelOrigin()
	 * @generated
	 */
	EReference getModelOrigin_Element();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.infrastructure.traceability.impl.OriginImpl <em>Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.OriginImpl
		 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl#getOrigin()
		 * @generated
		 */
		EClass ORIGIN = eINSTANCE.getOrigin();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.infrastructure.traceability.impl.TextOriginImpl <em>Text Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TextOriginImpl
		 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl#getTextOrigin()
		 * @generated
		 */
		EClass TEXT_ORIGIN = eINSTANCE.getTextOrigin();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ORIGIN__FILE_NAME = eINSTANCE.getTextOrigin_FileName();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ORIGIN__LINE = eINSTANCE.getTextOrigin_Line();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.infrastructure.traceability.impl.ModelOriginImpl <em>Model Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.ModelOriginImpl
		 * @see hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl#getModelOrigin()
		 * @generated
		 */
		EClass MODEL_ORIGIN = eINSTANCE.getModelOrigin();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ORIGIN__ELEMENT = eINSTANCE.getModelOrigin_Element();

	}

} //TraceabilityPackage

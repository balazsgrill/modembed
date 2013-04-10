/**
 */
package hu.modembed.model.core;

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
 * @see hu.modembed.model.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = hu.modembed.model.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.core.impl.MODembedElementImpl <em>MO Dembed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.core.impl.MODembedElementImpl
	 * @see hu.modembed.model.core.impl.CorePackageImpl#getMODembedElement()
	 * @generated
	 */
	int MO_DEMBED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DEMBED_ELEMENT__ORIGINS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DEMBED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>MO Dembed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MO_DEMBED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.core.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.core.impl.NamedElementImpl
	 * @see hu.modembed.model.core.impl.CorePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ORIGINS = MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.core.impl.RootElementImpl <em>Root Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.core.impl.RootElementImpl
	 * @see hu.modembed.model.core.impl.CorePackageImpl#getRootElement()
	 * @generated
	 */
	int ROOT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__ORIGINS = NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Root Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.core.impl.OriginImpl <em>Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.core.impl.OriginImpl
	 * @see hu.modembed.model.core.impl.CorePackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 3;

	/**
	 * The number of structural features of the '<em>Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGIN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.core.impl.ModelOriginImpl <em>Model Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.core.impl.ModelOriginImpl
	 * @see hu.modembed.model.core.impl.CorePackageImpl#getModelOrigin()
	 * @generated
	 */
	int MODEL_ORIGIN = 4;

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
	 * The meta object id for the '{@link hu.modembed.model.core.impl.TextOriginImpl <em>Text Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.core.impl.TextOriginImpl
	 * @see hu.modembed.model.core.impl.CorePackageImpl#getTextOrigin()
	 * @generated
	 */
	int TEXT_ORIGIN = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN__PATH = ORIGIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN__LINE = ORIGIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN__CHAR_START = ORIGIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN__CHAR_END = ORIGIN_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Text Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ORIGIN_FEATURE_COUNT = ORIGIN_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see hu.modembed.model.core.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.core.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.modembed.model.core.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.core.MODembedElement <em>MO Dembed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MO Dembed Element</em>'.
	 * @see hu.modembed.model.core.MODembedElement
	 * @generated
	 */
	EClass getMODembedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.core.MODembedElement#getOrigins <em>Origins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Origins</em>'.
	 * @see hu.modembed.model.core.MODembedElement#getOrigins()
	 * @see #getMODembedElement()
	 * @generated
	 */
	EReference getMODembedElement_Origins();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.core.MODembedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hu.modembed.model.core.MODembedElement#getDescription()
	 * @see #getMODembedElement()
	 * @generated
	 */
	EAttribute getMODembedElement_Description();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.core.RootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Element</em>'.
	 * @see hu.modembed.model.core.RootElement
	 * @generated
	 */
	EClass getRootElement();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.core.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Origin</em>'.
	 * @see hu.modembed.model.core.Origin
	 * @generated
	 */
	EClass getOrigin();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.core.ModelOrigin <em>Model Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Origin</em>'.
	 * @see hu.modembed.model.core.ModelOrigin
	 * @generated
	 */
	EClass getModelOrigin();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.core.ModelOrigin#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see hu.modembed.model.core.ModelOrigin#getElement()
	 * @see #getModelOrigin()
	 * @generated
	 */
	EReference getModelOrigin_Element();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.core.TextOrigin <em>Text Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Origin</em>'.
	 * @see hu.modembed.model.core.TextOrigin
	 * @generated
	 */
	EClass getTextOrigin();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.core.TextOrigin#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see hu.modembed.model.core.TextOrigin#getPath()
	 * @see #getTextOrigin()
	 * @generated
	 */
	EAttribute getTextOrigin_Path();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.core.TextOrigin#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see hu.modembed.model.core.TextOrigin#getLine()
	 * @see #getTextOrigin()
	 * @generated
	 */
	EAttribute getTextOrigin_Line();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.core.TextOrigin#getCharStart <em>Char Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Start</em>'.
	 * @see hu.modembed.model.core.TextOrigin#getCharStart()
	 * @see #getTextOrigin()
	 * @generated
	 */
	EAttribute getTextOrigin_CharStart();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.core.TextOrigin#getCharEnd <em>Char End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char End</em>'.
	 * @see hu.modembed.model.core.TextOrigin#getCharEnd()
	 * @see #getTextOrigin()
	 * @generated
	 */
	EAttribute getTextOrigin_CharEnd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.core.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.core.impl.NamedElementImpl
		 * @see hu.modembed.model.core.impl.CorePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.core.impl.MODembedElementImpl <em>MO Dembed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.core.impl.MODembedElementImpl
		 * @see hu.modembed.model.core.impl.CorePackageImpl#getMODembedElement()
		 * @generated
		 */
		EClass MO_DEMBED_ELEMENT = eINSTANCE.getMODembedElement();

		/**
		 * The meta object literal for the '<em><b>Origins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MO_DEMBED_ELEMENT__ORIGINS = eINSTANCE.getMODembedElement_Origins();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MO_DEMBED_ELEMENT__DESCRIPTION = eINSTANCE.getMODembedElement_Description();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.core.impl.RootElementImpl <em>Root Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.core.impl.RootElementImpl
		 * @see hu.modembed.model.core.impl.CorePackageImpl#getRootElement()
		 * @generated
		 */
		EClass ROOT_ELEMENT = eINSTANCE.getRootElement();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.core.impl.OriginImpl <em>Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.core.impl.OriginImpl
		 * @see hu.modembed.model.core.impl.CorePackageImpl#getOrigin()
		 * @generated
		 */
		EClass ORIGIN = eINSTANCE.getOrigin();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.core.impl.ModelOriginImpl <em>Model Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.core.impl.ModelOriginImpl
		 * @see hu.modembed.model.core.impl.CorePackageImpl#getModelOrigin()
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

		/**
		 * The meta object literal for the '{@link hu.modembed.model.core.impl.TextOriginImpl <em>Text Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.core.impl.TextOriginImpl
		 * @see hu.modembed.model.core.impl.CorePackageImpl#getTextOrigin()
		 * @generated
		 */
		EClass TEXT_ORIGIN = eINSTANCE.getTextOrigin();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ORIGIN__PATH = eINSTANCE.getTextOrigin_Path();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ORIGIN__LINE = eINSTANCE.getTextOrigin_Line();

		/**
		 * The meta object literal for the '<em><b>Char Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ORIGIN__CHAR_START = eINSTANCE.getTextOrigin_CharStart();

		/**
		 * The meta object literal for the '<em><b>Char End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_ORIGIN__CHAR_END = eINSTANCE.getTextOrigin_CharEnd();

	}

} //CorePackage

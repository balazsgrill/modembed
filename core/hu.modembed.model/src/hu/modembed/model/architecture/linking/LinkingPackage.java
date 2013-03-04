/**
 */
package hu.modembed.model.architecture.linking;

import hu.modembed.model.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.modembed.model.architecture.linking.LinkingFactory
 * @model kind="package"
 * @generated
 */
public interface LinkingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/architecture/linking";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinkingPackage eINSTANCE = hu.modembed.model.architecture.linking.impl.LinkingPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.linking.impl.LinkingElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.linking.impl.LinkingElementImpl
	 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getLinkingElement()
	 * @generated
	 */
	int LINKING_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_ELEMENT__ORIGINS = CorePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_ELEMENT__DESCRIPTION = CorePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_ELEMENT__NAME = CorePackage.ROOT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKING_ELEMENT_FEATURE_COUNT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl <em>Program Linking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl
	 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getProgramLinking()
	 * @generated
	 */
	int PROGRAM_LINKING = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING__ORIGINS = LINKING_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING__DESCRIPTION = LINKING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING__NAME = LINKING_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING__ARCHITECTURE = LINKING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Main Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING__MAIN_FUNCTION = LINKING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING__START_ADDRESS = LINKING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program Linking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LINKING_FEATURE_COUNT = LINKING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.linking.impl.LinkRawDataImpl <em>Link Raw Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.linking.impl.LinkRawDataImpl
	 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getLinkRawData()
	 * @generated
	 */
	int LINK_RAW_DATA = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RAW_DATA__ORIGINS = LINKING_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RAW_DATA__DESCRIPTION = LINKING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RAW_DATA__NAME = LINKING_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Link Raw Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_RAW_DATA_FEATURE_COUNT = LINKING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.linking.impl.BinaryTargetImpl <em>Binary Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.linking.impl.BinaryTargetImpl
	 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getBinaryTarget()
	 * @generated
	 */
	int BINARY_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TARGET__ORIGINS = CorePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TARGET__DESCRIPTION = CorePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TARGET__NAME = CorePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TARGET__TYPE = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TARGET__SECTIONS = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TARGET_FEATURE_COUNT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.linking.impl.BinarySectionImpl <em>Binary Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.linking.impl.BinarySectionImpl
	 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getBinarySection()
	 * @generated
	 */
	int BINARY_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECTION__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECTION__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECTION__ELEMENT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECTION__ADDRESS = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SECTION_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.architecture.linking.BinaryTargetType <em>Binary Target Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.architecture.linking.BinaryTargetType
	 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getBinaryTargetType()
	 * @generated
	 */
	int BINARY_TARGET_TYPE = 5;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.linking.ProgramLinking <em>Program Linking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Linking</em>'.
	 * @see hu.modembed.model.architecture.linking.ProgramLinking
	 * @generated
	 */
	EClass getProgramLinking();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.architecture.linking.ProgramLinking#getArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Architecture</em>'.
	 * @see hu.modembed.model.architecture.linking.ProgramLinking#getArchitecture()
	 * @see #getProgramLinking()
	 * @generated
	 */
	EReference getProgramLinking_Architecture();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.architecture.linking.ProgramLinking#getMainFunction <em>Main Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Function</em>'.
	 * @see hu.modembed.model.architecture.linking.ProgramLinking#getMainFunction()
	 * @see #getProgramLinking()
	 * @generated
	 */
	EReference getProgramLinking_MainFunction();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.architecture.linking.ProgramLinking#getStartAddress <em>Start Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Address</em>'.
	 * @see hu.modembed.model.architecture.linking.ProgramLinking#getStartAddress()
	 * @see #getProgramLinking()
	 * @generated
	 */
	EAttribute getProgramLinking_StartAddress();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.linking.LinkingElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see hu.modembed.model.architecture.linking.LinkingElement
	 * @generated
	 */
	EClass getLinkingElement();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.linking.LinkRawData <em>Link Raw Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Raw Data</em>'.
	 * @see hu.modembed.model.architecture.linking.LinkRawData
	 * @generated
	 */
	EClass getLinkRawData();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.linking.BinaryTarget <em>Binary Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Target</em>'.
	 * @see hu.modembed.model.architecture.linking.BinaryTarget
	 * @generated
	 */
	EClass getBinaryTarget();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.architecture.linking.BinaryTarget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see hu.modembed.model.architecture.linking.BinaryTarget#getType()
	 * @see #getBinaryTarget()
	 * @generated
	 */
	EAttribute getBinaryTarget_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.architecture.linking.BinaryTarget#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.modembed.model.architecture.linking.BinaryTarget#getSections()
	 * @see #getBinaryTarget()
	 * @generated
	 */
	EReference getBinaryTarget_Sections();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.architecture.linking.BinarySection <em>Binary Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Section</em>'.
	 * @see hu.modembed.model.architecture.linking.BinarySection
	 * @generated
	 */
	EClass getBinarySection();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.architecture.linking.BinarySection#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see hu.modembed.model.architecture.linking.BinarySection#getElement()
	 * @see #getBinarySection()
	 * @generated
	 */
	EReference getBinarySection_Element();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.architecture.linking.BinarySection#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see hu.modembed.model.architecture.linking.BinarySection#getAddress()
	 * @see #getBinarySection()
	 * @generated
	 */
	EAttribute getBinarySection_Address();

	/**
	 * Returns the meta object for enum '{@link hu.modembed.model.architecture.linking.BinaryTargetType <em>Binary Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Target Type</em>'.
	 * @see hu.modembed.model.architecture.linking.BinaryTargetType
	 * @generated
	 */
	EEnum getBinaryTargetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinkingFactory getLinkingFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl <em>Program Linking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.linking.impl.ProgramLinkingImpl
		 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getProgramLinking()
		 * @generated
		 */
		EClass PROGRAM_LINKING = eINSTANCE.getProgramLinking();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_LINKING__ARCHITECTURE = eINSTANCE.getProgramLinking_Architecture();

		/**
		 * The meta object literal for the '<em><b>Main Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_LINKING__MAIN_FUNCTION = eINSTANCE.getProgramLinking_MainFunction();

		/**
		 * The meta object literal for the '<em><b>Start Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_LINKING__START_ADDRESS = eINSTANCE.getProgramLinking_StartAddress();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.architecture.linking.impl.LinkingElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.linking.impl.LinkingElementImpl
		 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getLinkingElement()
		 * @generated
		 */
		EClass LINKING_ELEMENT = eINSTANCE.getLinkingElement();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.architecture.linking.impl.LinkRawDataImpl <em>Link Raw Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.linking.impl.LinkRawDataImpl
		 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getLinkRawData()
		 * @generated
		 */
		EClass LINK_RAW_DATA = eINSTANCE.getLinkRawData();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.architecture.linking.impl.BinaryTargetImpl <em>Binary Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.linking.impl.BinaryTargetImpl
		 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getBinaryTarget()
		 * @generated
		 */
		EClass BINARY_TARGET = eINSTANCE.getBinaryTarget();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TARGET__TYPE = eINSTANCE.getBinaryTarget_Type();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_TARGET__SECTIONS = eINSTANCE.getBinaryTarget_Sections();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.architecture.linking.impl.BinarySectionImpl <em>Binary Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.linking.impl.BinarySectionImpl
		 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getBinarySection()
		 * @generated
		 */
		EClass BINARY_SECTION = eINSTANCE.getBinarySection();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SECTION__ELEMENT = eINSTANCE.getBinarySection_Element();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_SECTION__ADDRESS = eINSTANCE.getBinarySection_Address();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.architecture.linking.BinaryTargetType <em>Binary Target Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.architecture.linking.BinaryTargetType
		 * @see hu.modembed.model.architecture.linking.impl.LinkingPackageImpl#getBinaryTargetType()
		 * @generated
		 */
		EEnum BINARY_TARGET_TYPE = eINSTANCE.getBinaryTargetType();

	}

} //LinkingPackage

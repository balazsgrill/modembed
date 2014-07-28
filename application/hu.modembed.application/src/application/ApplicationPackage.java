/**
 */
package application;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see application.ApplicationFactory
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
	ApplicationPackage eINSTANCE = application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link application.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.NamedElementImpl
	 * @see application.impl.ApplicationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.LibraryElementImpl <em>Library Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.LibraryElementImpl
	 * @see application.impl.ApplicationPackageImpl#getLibraryElement()
	 * @generated
	 */
	int LIBRARY_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.ApplicationInterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ApplicationInterfaceTypeImpl
	 * @see application.impl.ApplicationPackageImpl#getApplicationInterfaceType()
	 * @generated
	 */
	int APPLICATION_INTERFACE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_TYPE__NAME = LIBRARY_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_TYPE_FEATURE_COUNT = LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_TYPE_OPERATION_COUNT = LIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.CompositeInterfaceTypeImpl <em>Composite Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.CompositeInterfaceTypeImpl
	 * @see application.impl.ApplicationPackageImpl#getCompositeInterfaceType()
	 * @generated
	 */
	int COMPOSITE_INTERFACE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERFACE_TYPE__NAME = APPLICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Expects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERFACE_TYPE__EXPECTS = APPLICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERFACE_TYPE__IMPLEMENTS = APPLICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERFACE_TYPE_FEATURE_COUNT = APPLICATION_INTERFACE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INTERFACE_TYPE_OPERATION_COUNT = APPLICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.CallableInterfaceTypeImpl <em>Callable Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.CallableInterfaceTypeImpl
	 * @see application.impl.ApplicationPackageImpl#getCallableInterfaceType()
	 * @generated
	 */
	int CALLABLE_INTERFACE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_INTERFACE_TYPE__NAME = APPLICATION_INTERFACE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_INTERFACE_TYPE__ARGUMENTS = APPLICATION_INTERFACE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callable Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_INTERFACE_TYPE_FEATURE_COUNT = APPLICATION_INTERFACE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Callable Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_INTERFACE_TYPE_OPERATION_COUNT = APPLICATION_INTERFACE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.ApplicationInterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ApplicationInterfaceImpl
	 * @see application.impl.ApplicationPackageImpl#getApplicationInterface()
	 * @generated
	 */
	int APPLICATION_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_INTERFACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.ApplicationModuleImplementationImpl <em>Module Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ApplicationModuleImplementationImpl
	 * @see application.impl.ApplicationPackageImpl#getApplicationModuleImplementation()
	 * @generated
	 */
	int APPLICATION_MODULE_IMPLEMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_IMPLEMENTATION__NAME = LIBRARY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_IMPLEMENTATION__TYPE = LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_IMPLEMENTATION_FEATURE_COUNT = LIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_IMPLEMENTATION_OPERATION_COUNT = LIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.CompositeModuleImplementationImpl <em>Composite Module Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.CompositeModuleImplementationImpl
	 * @see application.impl.ApplicationPackageImpl#getCompositeModuleImplementation()
	 * @generated
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION__NAME = APPLICATION_MODULE_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION__TYPE = APPLICATION_MODULE_IMPLEMENTATION__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES = APPLICATION_MODULE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS = APPLICATION_MODULE_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION_FEATURE_COUNT = APPLICATION_MODULE_IMPLEMENTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Module Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_MODULE_IMPLEMENTATION_OPERATION_COUNT = APPLICATION_MODULE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.ApplicationModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ApplicationModuleImpl
	 * @see application.impl.ApplicationPackageImpl#getApplicationModule()
	 * @generated
	 */
	int APPLICATION_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE__IMPLEMENTATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MODULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.CodeBasedImplementationImpl <em>Code Based Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.CodeBasedImplementationImpl
	 * @see application.impl.ApplicationPackageImpl#getCodeBasedImplementation()
	 * @generated
	 */
	int CODE_BASED_IMPLEMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BASED_IMPLEMENTATION__NAME = APPLICATION_MODULE_IMPLEMENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BASED_IMPLEMENTATION__TYPE = APPLICATION_MODULE_IMPLEMENTATION__TYPE;

	/**
	 * The number of structural features of the '<em>Code Based Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BASED_IMPLEMENTATION_FEATURE_COUNT = APPLICATION_MODULE_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Based Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BASED_IMPLEMENTATION_OPERATION_COUNT = APPLICATION_MODULE_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.InterfaceImplementationMappingImpl <em>Interface Implementation Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.InterfaceImplementationMappingImpl
	 * @see application.impl.ApplicationPackageImpl#getInterfaceImplementationMapping()
	 * @generated
	 */
	int INTERFACE_IMPLEMENTATION_MAPPING = 9;

	/**
	 * The number of structural features of the '<em>Interface Implementation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Implementation Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.DelegatedImplementationImpl <em>Delegated Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DelegatedImplementationImpl
	 * @see application.impl.ApplicationPackageImpl#getDelegatedImplementation()
	 * @generated
	 */
	int DELEGATED_IMPLEMENTATION = 10;

	/**
	 * The feature id for the '<em><b>Outer Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_IMPLEMENTATION__OUTER_INTERFACE = INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_IMPLEMENTATION__INNER_INTERFACE = INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegated Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_IMPLEMENTATION_FEATURE_COUNT = INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delegated Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATED_IMPLEMENTATION_OPERATION_COUNT = INTERFACE_IMPLEMENTATION_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.InterfaceOfModuleImpl <em>Interface Of Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.InterfaceOfModuleImpl
	 * @see application.impl.ApplicationPackageImpl#getInterfaceOfModule()
	 * @generated
	 */
	int INTERFACE_OF_MODULE = 11;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_MODULE__MODULE = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_MODULE__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Interface Of Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interface Of Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OF_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.MappedImplementationImpl <em>Mapped Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.MappedImplementationImpl
	 * @see application.impl.ApplicationPackageImpl#getMappedImplementation()
	 * @generated
	 */
	int MAPPED_IMPLEMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Implemented Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE = INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expected Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE = INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapped Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_IMPLEMENTATION_FEATURE_COUNT = INTERFACE_IMPLEMENTATION_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mapped Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_IMPLEMENTATION_OPERATION_COUNT = INTERFACE_IMPLEMENTATION_MAPPING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.ApplicationLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ApplicationLibraryImpl
	 * @see application.impl.ApplicationPackageImpl#getApplicationLibrary()
	 * @generated
	 */
	int APPLICATION_LIBRARY = 13;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LIBRARY__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Qualified Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LIBRARY__QUALIFIED_ID = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link application.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DataTypeImpl
	 * @see application.impl.ApplicationPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = LIBRARY_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = LIBRARY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.NativeDataTypeImpl <em>Native Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.NativeDataTypeImpl
	 * @see application.impl.ApplicationPackageImpl#getNativeDataType()
	 * @generated
	 */
	int NATIVE_DATA_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Native Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Native Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_DATA_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.DataImpl
	 * @see application.impl.ApplicationPackageImpl#getData()
	 * @generated
	 */
	int DATA = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link application.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see application.impl.ArgumentImpl
	 * @see application.impl.ApplicationPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = DATA__TYPE;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link application.ApplicationInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see application.ApplicationInterfaceType
	 * @generated
	 */
	EClass getApplicationInterfaceType();

	/**
	 * Returns the meta object for class '{@link application.CompositeInterfaceType <em>Composite Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Interface Type</em>'.
	 * @see application.CompositeInterfaceType
	 * @generated
	 */
	EClass getCompositeInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.CompositeInterfaceType#getExpects <em>Expects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expects</em>'.
	 * @see application.CompositeInterfaceType#getExpects()
	 * @see #getCompositeInterfaceType()
	 * @generated
	 */
	EReference getCompositeInterfaceType_Expects();

	/**
	 * Returns the meta object for the containment reference list '{@link application.CompositeInterfaceType#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see application.CompositeInterfaceType#getImplements()
	 * @see #getCompositeInterfaceType()
	 * @generated
	 */
	EReference getCompositeInterfaceType_Implements();

	/**
	 * Returns the meta object for class '{@link application.CallableInterfaceType <em>Callable Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Interface Type</em>'.
	 * @see application.CallableInterfaceType
	 * @generated
	 */
	EClass getCallableInterfaceType();

	/**
	 * Returns the meta object for the containment reference list '{@link application.CallableInterfaceType#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see application.CallableInterfaceType#getArguments()
	 * @see #getCallableInterfaceType()
	 * @generated
	 */
	EReference getCallableInterfaceType_Arguments();

	/**
	 * Returns the meta object for class '{@link application.ApplicationInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see application.ApplicationInterface
	 * @generated
	 */
	EClass getApplicationInterface();

	/**
	 * Returns the meta object for the reference '{@link application.ApplicationInterface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see application.ApplicationInterface#getType()
	 * @see #getApplicationInterface()
	 * @generated
	 */
	EReference getApplicationInterface_Type();

	/**
	 * Returns the meta object for class '{@link application.CompositeModuleImplementation <em>Composite Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Module Implementation</em>'.
	 * @see application.CompositeModuleImplementation
	 * @generated
	 */
	EClass getCompositeModuleImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link application.CompositeModuleImplementation#getSubModules <em>Sub Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Modules</em>'.
	 * @see application.CompositeModuleImplementation#getSubModules()
	 * @see #getCompositeModuleImplementation()
	 * @generated
	 */
	EReference getCompositeModuleImplementation_SubModules();

	/**
	 * Returns the meta object for the containment reference list '{@link application.CompositeModuleImplementation#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see application.CompositeModuleImplementation#getMappings()
	 * @see #getCompositeModuleImplementation()
	 * @generated
	 */
	EReference getCompositeModuleImplementation_Mappings();

	/**
	 * Returns the meta object for class '{@link application.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see application.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link application.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see application.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link application.ApplicationModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see application.ApplicationModule
	 * @generated
	 */
	EClass getApplicationModule();

	/**
	 * Returns the meta object for the reference '{@link application.ApplicationModule#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implementation</em>'.
	 * @see application.ApplicationModule#getImplementation()
	 * @see #getApplicationModule()
	 * @generated
	 */
	EReference getApplicationModule_Implementation();

	/**
	 * Returns the meta object for class '{@link application.ApplicationModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Implementation</em>'.
	 * @see application.ApplicationModuleImplementation
	 * @generated
	 */
	EClass getApplicationModuleImplementation();

	/**
	 * Returns the meta object for the reference '{@link application.ApplicationModuleImplementation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see application.ApplicationModuleImplementation#getType()
	 * @see #getApplicationModuleImplementation()
	 * @generated
	 */
	EReference getApplicationModuleImplementation_Type();

	/**
	 * Returns the meta object for class '{@link application.CodeBasedImplementation <em>Code Based Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Based Implementation</em>'.
	 * @see application.CodeBasedImplementation
	 * @generated
	 */
	EClass getCodeBasedImplementation();

	/**
	 * Returns the meta object for class '{@link application.InterfaceImplementationMapping <em>Interface Implementation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Implementation Mapping</em>'.
	 * @see application.InterfaceImplementationMapping
	 * @generated
	 */
	EClass getInterfaceImplementationMapping();

	/**
	 * Returns the meta object for class '{@link application.DelegatedImplementation <em>Delegated Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegated Implementation</em>'.
	 * @see application.DelegatedImplementation
	 * @generated
	 */
	EClass getDelegatedImplementation();

	/**
	 * Returns the meta object for the reference '{@link application.DelegatedImplementation#getOuterInterface <em>Outer Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outer Interface</em>'.
	 * @see application.DelegatedImplementation#getOuterInterface()
	 * @see #getDelegatedImplementation()
	 * @generated
	 */
	EReference getDelegatedImplementation_OuterInterface();

	/**
	 * Returns the meta object for the containment reference '{@link application.DelegatedImplementation#getInnerInterface <em>Inner Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Interface</em>'.
	 * @see application.DelegatedImplementation#getInnerInterface()
	 * @see #getDelegatedImplementation()
	 * @generated
	 */
	EReference getDelegatedImplementation_InnerInterface();

	/**
	 * Returns the meta object for class '{@link application.InterfaceOfModule <em>Interface Of Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Of Module</em>'.
	 * @see application.InterfaceOfModule
	 * @generated
	 */
	EClass getInterfaceOfModule();

	/**
	 * Returns the meta object for the reference '{@link application.InterfaceOfModule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see application.InterfaceOfModule#getModule()
	 * @see #getInterfaceOfModule()
	 * @generated
	 */
	EReference getInterfaceOfModule_Module();

	/**
	 * Returns the meta object for the reference '{@link application.InterfaceOfModule#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see application.InterfaceOfModule#getInterface()
	 * @see #getInterfaceOfModule()
	 * @generated
	 */
	EReference getInterfaceOfModule_Interface();

	/**
	 * Returns the meta object for class '{@link application.MappedImplementation <em>Mapped Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Implementation</em>'.
	 * @see application.MappedImplementation
	 * @generated
	 */
	EClass getMappedImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link application.MappedImplementation#getImplementedInterface <em>Implemented Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implemented Interface</em>'.
	 * @see application.MappedImplementation#getImplementedInterface()
	 * @see #getMappedImplementation()
	 * @generated
	 */
	EReference getMappedImplementation_ImplementedInterface();

	/**
	 * Returns the meta object for the containment reference '{@link application.MappedImplementation#getExpectedInterface <em>Expected Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected Interface</em>'.
	 * @see application.MappedImplementation#getExpectedInterface()
	 * @see #getMappedImplementation()
	 * @generated
	 */
	EReference getMappedImplementation_ExpectedInterface();

	/**
	 * Returns the meta object for class '{@link application.ApplicationLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see application.ApplicationLibrary
	 * @generated
	 */
	EClass getApplicationLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link application.ApplicationLibrary#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see application.ApplicationLibrary#getElements()
	 * @see #getApplicationLibrary()
	 * @generated
	 */
	EReference getApplicationLibrary_Elements();

	/**
	 * Returns the meta object for the attribute '{@link application.ApplicationLibrary#getQualifiedId <em>Qualified Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Id</em>'.
	 * @see application.ApplicationLibrary#getQualifiedId()
	 * @see #getApplicationLibrary()
	 * @generated
	 */
	EAttribute getApplicationLibrary_QualifiedId();

	/**
	 * Returns the meta object for class '{@link application.LibraryElement <em>Library Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Element</em>'.
	 * @see application.LibraryElement
	 * @generated
	 */
	EClass getLibraryElement();

	/**
	 * Returns the meta object for class '{@link application.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see application.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link application.NativeDataType <em>Native Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Data Type</em>'.
	 * @see application.NativeDataType
	 * @generated
	 */
	EClass getNativeDataType();

	/**
	 * Returns the meta object for class '{@link application.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see application.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the reference '{@link application.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see application.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Type();

	/**
	 * Returns the meta object for class '{@link application.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see application.Argument
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
	ApplicationFactory getApplicationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link application.impl.ApplicationInterfaceTypeImpl <em>Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ApplicationInterfaceTypeImpl
		 * @see application.impl.ApplicationPackageImpl#getApplicationInterfaceType()
		 * @generated
		 */
		EClass APPLICATION_INTERFACE_TYPE = eINSTANCE.getApplicationInterfaceType();

		/**
		 * The meta object literal for the '{@link application.impl.CompositeInterfaceTypeImpl <em>Composite Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.CompositeInterfaceTypeImpl
		 * @see application.impl.ApplicationPackageImpl#getCompositeInterfaceType()
		 * @generated
		 */
		EClass COMPOSITE_INTERFACE_TYPE = eINSTANCE.getCompositeInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Expects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INTERFACE_TYPE__EXPECTS = eINSTANCE.getCompositeInterfaceType_Expects();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INTERFACE_TYPE__IMPLEMENTS = eINSTANCE.getCompositeInterfaceType_Implements();

		/**
		 * The meta object literal for the '{@link application.impl.CallableInterfaceTypeImpl <em>Callable Interface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.CallableInterfaceTypeImpl
		 * @see application.impl.ApplicationPackageImpl#getCallableInterfaceType()
		 * @generated
		 */
		EClass CALLABLE_INTERFACE_TYPE = eINSTANCE.getCallableInterfaceType();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE_INTERFACE_TYPE__ARGUMENTS = eINSTANCE.getCallableInterfaceType_Arguments();

		/**
		 * The meta object literal for the '{@link application.impl.ApplicationInterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ApplicationInterfaceImpl
		 * @see application.impl.ApplicationPackageImpl#getApplicationInterface()
		 * @generated
		 */
		EClass APPLICATION_INTERFACE = eINSTANCE.getApplicationInterface();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_INTERFACE__TYPE = eINSTANCE.getApplicationInterface_Type();

		/**
		 * The meta object literal for the '{@link application.impl.CompositeModuleImplementationImpl <em>Composite Module Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.CompositeModuleImplementationImpl
		 * @see application.impl.ApplicationPackageImpl#getCompositeModuleImplementation()
		 * @generated
		 */
		EClass COMPOSITE_MODULE_IMPLEMENTATION = eINSTANCE.getCompositeModuleImplementation();

		/**
		 * The meta object literal for the '<em><b>Sub Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES = eINSTANCE.getCompositeModuleImplementation_SubModules();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS = eINSTANCE.getCompositeModuleImplementation_Mappings();

		/**
		 * The meta object literal for the '{@link application.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.NamedElementImpl
		 * @see application.impl.ApplicationPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link application.impl.ApplicationModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ApplicationModuleImpl
		 * @see application.impl.ApplicationPackageImpl#getApplicationModule()
		 * @generated
		 */
		EClass APPLICATION_MODULE = eINSTANCE.getApplicationModule();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODULE__IMPLEMENTATION = eINSTANCE.getApplicationModule_Implementation();

		/**
		 * The meta object literal for the '{@link application.impl.ApplicationModuleImplementationImpl <em>Module Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ApplicationModuleImplementationImpl
		 * @see application.impl.ApplicationPackageImpl#getApplicationModuleImplementation()
		 * @generated
		 */
		EClass APPLICATION_MODULE_IMPLEMENTATION = eINSTANCE.getApplicationModuleImplementation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MODULE_IMPLEMENTATION__TYPE = eINSTANCE.getApplicationModuleImplementation_Type();

		/**
		 * The meta object literal for the '{@link application.impl.CodeBasedImplementationImpl <em>Code Based Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.CodeBasedImplementationImpl
		 * @see application.impl.ApplicationPackageImpl#getCodeBasedImplementation()
		 * @generated
		 */
		EClass CODE_BASED_IMPLEMENTATION = eINSTANCE.getCodeBasedImplementation();

		/**
		 * The meta object literal for the '{@link application.impl.InterfaceImplementationMappingImpl <em>Interface Implementation Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.InterfaceImplementationMappingImpl
		 * @see application.impl.ApplicationPackageImpl#getInterfaceImplementationMapping()
		 * @generated
		 */
		EClass INTERFACE_IMPLEMENTATION_MAPPING = eINSTANCE.getInterfaceImplementationMapping();

		/**
		 * The meta object literal for the '{@link application.impl.DelegatedImplementationImpl <em>Delegated Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DelegatedImplementationImpl
		 * @see application.impl.ApplicationPackageImpl#getDelegatedImplementation()
		 * @generated
		 */
		EClass DELEGATED_IMPLEMENTATION = eINSTANCE.getDelegatedImplementation();

		/**
		 * The meta object literal for the '<em><b>Outer Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATED_IMPLEMENTATION__OUTER_INTERFACE = eINSTANCE.getDelegatedImplementation_OuterInterface();

		/**
		 * The meta object literal for the '<em><b>Inner Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATED_IMPLEMENTATION__INNER_INTERFACE = eINSTANCE.getDelegatedImplementation_InnerInterface();

		/**
		 * The meta object literal for the '{@link application.impl.InterfaceOfModuleImpl <em>Interface Of Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.InterfaceOfModuleImpl
		 * @see application.impl.ApplicationPackageImpl#getInterfaceOfModule()
		 * @generated
		 */
		EClass INTERFACE_OF_MODULE = eINSTANCE.getInterfaceOfModule();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_OF_MODULE__MODULE = eINSTANCE.getInterfaceOfModule_Module();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_OF_MODULE__INTERFACE = eINSTANCE.getInterfaceOfModule_Interface();

		/**
		 * The meta object literal for the '{@link application.impl.MappedImplementationImpl <em>Mapped Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.MappedImplementationImpl
		 * @see application.impl.ApplicationPackageImpl#getMappedImplementation()
		 * @generated
		 */
		EClass MAPPED_IMPLEMENTATION = eINSTANCE.getMappedImplementation();

		/**
		 * The meta object literal for the '<em><b>Implemented Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_IMPLEMENTATION__IMPLEMENTED_INTERFACE = eINSTANCE.getMappedImplementation_ImplementedInterface();

		/**
		 * The meta object literal for the '<em><b>Expected Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_IMPLEMENTATION__EXPECTED_INTERFACE = eINSTANCE.getMappedImplementation_ExpectedInterface();

		/**
		 * The meta object literal for the '{@link application.impl.ApplicationLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ApplicationLibraryImpl
		 * @see application.impl.ApplicationPackageImpl#getApplicationLibrary()
		 * @generated
		 */
		EClass APPLICATION_LIBRARY = eINSTANCE.getApplicationLibrary();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LIBRARY__ELEMENTS = eINSTANCE.getApplicationLibrary_Elements();

		/**
		 * The meta object literal for the '<em><b>Qualified Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_LIBRARY__QUALIFIED_ID = eINSTANCE.getApplicationLibrary_QualifiedId();

		/**
		 * The meta object literal for the '{@link application.impl.LibraryElementImpl <em>Library Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.LibraryElementImpl
		 * @see application.impl.ApplicationPackageImpl#getLibraryElement()
		 * @generated
		 */
		EClass LIBRARY_ELEMENT = eINSTANCE.getLibraryElement();

		/**
		 * The meta object literal for the '{@link application.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DataTypeImpl
		 * @see application.impl.ApplicationPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link application.impl.NativeDataTypeImpl <em>Native Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.NativeDataTypeImpl
		 * @see application.impl.ApplicationPackageImpl#getNativeDataType()
		 * @generated
		 */
		EClass NATIVE_DATA_TYPE = eINSTANCE.getNativeDataType();

		/**
		 * The meta object literal for the '{@link application.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.DataImpl
		 * @see application.impl.ApplicationPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '{@link application.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see application.impl.ArgumentImpl
		 * @see application.impl.ApplicationPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

	}

} //ApplicationPackage

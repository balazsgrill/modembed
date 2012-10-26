/**
 */
package hu.modembed.model.emodel;

import hu.modembed.model.core.CorePackage;

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
 * @see hu.modembed.model.emodel.EmodelFactory
 * @model kind="package"
 * @generated
 */
public interface EmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "emodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmodelPackage eINSTANCE = hu.modembed.model.emodel.impl.EmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.LibraryImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ORIGINS = CorePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = CorePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = CorePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__USES = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CONTENT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = CorePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.TypeImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DEFINITION = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.LibraryElement <em>Library Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.LibraryElement
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getLibraryElement()
	 * @generated
	 */
	int LIBRARY_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Library Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_ELEMENT_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.FunctionImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ORIGINS = LIBRARY_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DESCRIPTION = LIBRARY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = LIBRARY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ARGUMENTS = LIBRARY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OVERRIDES = LIBRARY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RESULT = LIBRARY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__IMPLEMENTATION = LIBRARY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = LIBRARY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.VariableImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ORIGINS = CorePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = CorePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = CorePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = CorePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.FunctionParameterImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__ORIGINS = VARIABLE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__DESCRIPTION = VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__LAZY = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.FunctionResultImpl <em>Function Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.FunctionResultImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getFunctionResult()
	 * @generated
	 */
	int FUNCTION_RESULT = 5;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Function Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_RESULT_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.ResultBufferImpl <em>Result Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.ResultBufferImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getResultBuffer()
	 * @generated
	 */
	int RESULT_BUFFER = 6;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BUFFER__ORIGINS = FUNCTION_RESULT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BUFFER__DESCRIPTION = FUNCTION_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BUFFER__NAME = FUNCTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BUFFER__TYPE = FUNCTION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Result Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_BUFFER_FEATURE_COUNT = FUNCTION_RESULT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.ResultExpressionImpl <em>Result Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.ResultExpressionImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getResultExpression()
	 * @generated
	 */
	int RESULT_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_EXPRESSION__ORIGINS = FUNCTION_RESULT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_EXPRESSION__DESCRIPTION = FUNCTION_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_EXPRESSION__EXPRESSION = FUNCTION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Result Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_EXPRESSION_FEATURE_COUNT = FUNCTION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.GlobalVariableImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getGlobalVariable()
	 * @generated
	 */
	int GLOBAL_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__ORIGINS = VARIABLE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__DESCRIPTION = VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE__TYPE = VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Global Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.HeapVariableImpl <em>Heap Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.HeapVariableImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getHeapVariable()
	 * @generated
	 */
	int HEAP_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE__ORIGINS = GLOBAL_VARIABLE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE__DESCRIPTION = GLOBAL_VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE__NAME = GLOBAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE__TYPE = GLOBAL_VARIABLE__TYPE;

	/**
	 * The number of structural features of the '<em>Heap Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAP_VARIABLE_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.RegisterVariableImpl <em>Register Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.RegisterVariableImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getRegisterVariable()
	 * @generated
	 */
	int REGISTER_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VARIABLE__ORIGINS = GLOBAL_VARIABLE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VARIABLE__DESCRIPTION = GLOBAL_VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VARIABLE__NAME = GLOBAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VARIABLE__TYPE = GLOBAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VARIABLE__ADDRESS = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Register Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_VARIABLE_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.impl.ConstantVariableImpl <em>Constant Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.impl.ConstantVariableImpl
	 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getConstantVariable()
	 * @generated
	 */
	int CONSTANT_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VARIABLE__ORIGINS = GLOBAL_VARIABLE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VARIABLE__DESCRIPTION = GLOBAL_VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VARIABLE__NAME = GLOBAL_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VARIABLE__TYPE = GLOBAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VARIABLE__VALUE = GLOBAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VARIABLE_FEATURE_COUNT = GLOBAL_VARIABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see hu.modembed.model.emodel.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the reference list '{@link hu.modembed.model.emodel.Library#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see hu.modembed.model.emodel.Library#getUses()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.Library#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see hu.modembed.model.emodel.Library#getContent()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Content();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see hu.modembed.model.emodel.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.Type#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see hu.modembed.model.emodel.Type#getDefinition()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Definition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see hu.modembed.model.emodel.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.Function#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.emodel.Function#getArguments()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Arguments();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.emodel.Function#getOverrides <em>Overrides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overrides</em>'.
	 * @see hu.modembed.model.emodel.Function#getOverrides()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Overrides();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.Function#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see hu.modembed.model.emodel.Function#getResult()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Result();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.Function#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see hu.modembed.model.emodel.Function#getImplementation()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Implementation();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hu.modembed.model.emodel.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.modembed.model.emodel.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see hu.modembed.model.emodel.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.FunctionParameter#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see hu.modembed.model.emodel.FunctionParameter#isLazy()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Lazy();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.FunctionResult <em>Function Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Result</em>'.
	 * @see hu.modembed.model.emodel.FunctionResult
	 * @generated
	 */
	EClass getFunctionResult();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.ResultBuffer <em>Result Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Buffer</em>'.
	 * @see hu.modembed.model.emodel.ResultBuffer
	 * @generated
	 */
	EClass getResultBuffer();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.ResultExpression <em>Result Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Expression</em>'.
	 * @see hu.modembed.model.emodel.ResultExpression
	 * @generated
	 */
	EClass getResultExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.ResultExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.modembed.model.emodel.ResultExpression#getExpression()
	 * @see #getResultExpression()
	 * @generated
	 */
	EReference getResultExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.LibraryElement <em>Library Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Element</em>'.
	 * @see hu.modembed.model.emodel.LibraryElement
	 * @generated
	 */
	EClass getLibraryElement();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.GlobalVariable <em>Global Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Variable</em>'.
	 * @see hu.modembed.model.emodel.GlobalVariable
	 * @generated
	 */
	EClass getGlobalVariable();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.HeapVariable <em>Heap Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heap Variable</em>'.
	 * @see hu.modembed.model.emodel.HeapVariable
	 * @generated
	 */
	EClass getHeapVariable();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.RegisterVariable <em>Register Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Variable</em>'.
	 * @see hu.modembed.model.emodel.RegisterVariable
	 * @generated
	 */
	EClass getRegisterVariable();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.RegisterVariable#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see hu.modembed.model.emodel.RegisterVariable#getAddress()
	 * @see #getRegisterVariable()
	 * @generated
	 */
	EReference getRegisterVariable_Address();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.ConstantVariable <em>Constant Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Variable</em>'.
	 * @see hu.modembed.model.emodel.ConstantVariable
	 * @generated
	 */
	EClass getConstantVariable();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.ConstantVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.modembed.model.emodel.ConstantVariable#getValue()
	 * @see #getConstantVariable()
	 * @generated
	 */
	EReference getConstantVariable_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmodelFactory getEmodelFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.LibraryImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__USES = eINSTANCE.getLibrary_Uses();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__CONTENT = eINSTANCE.getLibrary_Content();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.TypeImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__DEFINITION = eINSTANCE.getType_Definition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.FunctionImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__ARGUMENTS = eINSTANCE.getFunction_Arguments();

		/**
		 * The meta object literal for the '<em><b>Overrides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__OVERRIDES = eINSTANCE.getFunction_Overrides();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RESULT = eINSTANCE.getFunction_Result();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__IMPLEMENTATION = eINSTANCE.getFunction_Implementation();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.VariableImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.FunctionParameterImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__LAZY = eINSTANCE.getFunctionParameter_Lazy();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.FunctionResultImpl <em>Function Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.FunctionResultImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getFunctionResult()
		 * @generated
		 */
		EClass FUNCTION_RESULT = eINSTANCE.getFunctionResult();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.ResultBufferImpl <em>Result Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.ResultBufferImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getResultBuffer()
		 * @generated
		 */
		EClass RESULT_BUFFER = eINSTANCE.getResultBuffer();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.ResultExpressionImpl <em>Result Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.ResultExpressionImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getResultExpression()
		 * @generated
		 */
		EClass RESULT_EXPRESSION = eINSTANCE.getResultExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESULT_EXPRESSION__EXPRESSION = eINSTANCE.getResultExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.LibraryElement <em>Library Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.LibraryElement
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getLibraryElement()
		 * @generated
		 */
		EClass LIBRARY_ELEMENT = eINSTANCE.getLibraryElement();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.GlobalVariableImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getGlobalVariable()
		 * @generated
		 */
		EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.HeapVariableImpl <em>Heap Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.HeapVariableImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getHeapVariable()
		 * @generated
		 */
		EClass HEAP_VARIABLE = eINSTANCE.getHeapVariable();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.RegisterVariableImpl <em>Register Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.RegisterVariableImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getRegisterVariable()
		 * @generated
		 */
		EClass REGISTER_VARIABLE = eINSTANCE.getRegisterVariable();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_VARIABLE__ADDRESS = eINSTANCE.getRegisterVariable_Address();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.impl.ConstantVariableImpl <em>Constant Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.impl.ConstantVariableImpl
		 * @see hu.modembed.model.emodel.impl.EmodelPackageImpl#getConstantVariable()
		 * @generated
		 */
		EClass CONSTANT_VARIABLE = eINSTANCE.getConstantVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_VARIABLE__VALUE = eINSTANCE.getConstantVariable_Value();

	}

} //EmodelPackage

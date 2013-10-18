/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

import hu.modembed.model.modembed.infrastructure.expressions.ExpressionsPackage;
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
 * @see hu.modembed.model.modembed.structured.StructuredFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structured";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/structured";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structured";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredPackage eINSTANCE = hu.modembed.model.modembed.structured.impl.StructuredPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.StructuredModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.StructuredModuleImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getStructuredModule()
	 * @generated
	 */
	int STRUCTURED_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__ANNOTATIONS = InfrastructurePackage.ROOT_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__FUNCTIONS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__VARIABLES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE__USES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_MODULE_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.VariableDeclarationImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ANNOTATIONS = InfrastructurePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__CONST = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__GLOBAL = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INIT_VALUE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getStructuredFunction()
	 * @generated
	 */
	int STRUCTURED_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__ANNOTATIONS = InfrastructurePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__GLOBAL = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__RESULT_TYPE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__PARAMETERS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION__IMPLEMENTATION = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FUNCTION_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.VariableReferenceExpressionImpl <em>Variable Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.VariableReferenceExpressionImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getVariableReferenceExpression()
	 * @generated
	 */
	int VARIABLE_REFERENCE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_EXPRESSION__VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.FunctionCallExpressionImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getFunctionCallExpression()
	 * @generated
	 */
	int FUNCTION_CALL_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__FUNCTION = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION__ARGUMENTS = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.OperationImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATIONS = InfrastructurePackage.MO_DEMBED_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.ReturnOperationImpl <em>Return Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.ReturnOperationImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getReturnOperation()
	 * @generated
	 */
	int RETURN_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION__ORIGINS = OPERATION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION__RESULT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.ExpressionOperationImpl <em>Expression Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.ExpressionOperationImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getExpressionOperation()
	 * @generated
	 */
	int EXPRESSION_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION__ORIGINS = OPERATION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION__EXPRESSION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.OperationBlockImpl <em>Operation Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.OperationBlockImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getOperationBlock()
	 * @generated
	 */
	int OPERATION_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BLOCK__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BLOCK__ORIGINS = OPERATION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BLOCK__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BLOCK__VARIABLES = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BLOCK__STEPS = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BLOCK_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl <em>Conditional Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getConditionalOperation()
	 * @generated
	 */
	int CONDITIONAL_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__ORIGINS = OPERATION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__CONDITION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>True Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__TRUE_BRANCH = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>False Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__FALSE_BRANCH = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.structured.impl.LoopOperationImpl <em>Loop Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.structured.impl.LoopOperationImpl
	 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getLoopOperation()
	 * @generated
	 */
	int LOOP_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__DESCRIPTION = OPERATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__ORIGINS = OPERATION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__ANNOTATIONS = OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Entry Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__ENTRY_CONDITION = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__EXIT_CONDITION = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__BODY = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loop Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.StructuredModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredModule
	 * @generated
	 */
	EClass getStructuredModule();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.structured.StructuredModule#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredModule#getFunctions()
	 * @see #getStructuredModule()
	 * @generated
	 */
	EReference getStructuredModule_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.structured.StructuredModule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredModule#getVariables()
	 * @see #getStructuredModule()
	 * @generated
	 */
	EReference getStructuredModule_Variables();

	/**
	 * Returns the meta object for the reference list '{@link hu.modembed.model.modembed.structured.StructuredModule#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredModule#getUses()
	 * @see #getStructuredModule()
	 * @generated
	 */
	EReference getStructuredModule_Uses();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.structured.VariableDeclaration#isConst <em>Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Const</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableDeclaration#isConst()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Const();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.structured.VariableDeclaration#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableDeclaration#isGlobal()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Global();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.VariableDeclaration#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableDeclaration#getInitValue()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_InitValue();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.StructuredFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredFunction
	 * @generated
	 */
	EClass getStructuredFunction();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.structured.StructuredFunction#isGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredFunction#isGlobal()
	 * @see #getStructuredFunction()
	 * @generated
	 */
	EAttribute getStructuredFunction_Global();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.StructuredFunction#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result Type</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredFunction#getResultType()
	 * @see #getStructuredFunction()
	 * @generated
	 */
	EReference getStructuredFunction_ResultType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.structured.StructuredFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredFunction#getParameters()
	 * @see #getStructuredFunction()
	 * @generated
	 */
	EReference getStructuredFunction_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.StructuredFunction#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see hu.modembed.model.modembed.structured.StructuredFunction#getImplementation()
	 * @see #getStructuredFunction()
	 * @generated
	 */
	EReference getStructuredFunction_Implementation();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.VariableReferenceExpression <em>Variable Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference Expression</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableReferenceExpression
	 * @generated
	 */
	EClass getVariableReferenceExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.structured.VariableReferenceExpression#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.modembed.model.modembed.structured.VariableReferenceExpression#getVariable()
	 * @see #getVariableReferenceExpression()
	 * @generated
	 */
	EReference getVariableReferenceExpression_Variable();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.FunctionCallExpression <em>Function Call Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Expression</em>'.
	 * @see hu.modembed.model.modembed.structured.FunctionCallExpression
	 * @generated
	 */
	EClass getFunctionCallExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.structured.FunctionCallExpression#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see hu.modembed.model.modembed.structured.FunctionCallExpression#getFunction()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.structured.FunctionCallExpression#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.modembed.structured.FunctionCallExpression#getArguments()
	 * @see #getFunctionCallExpression()
	 * @generated
	 */
	EReference getFunctionCallExpression_Arguments();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see hu.modembed.model.modembed.structured.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.ReturnOperation <em>Return Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Operation</em>'.
	 * @see hu.modembed.model.modembed.structured.ReturnOperation
	 * @generated
	 */
	EClass getReturnOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.ReturnOperation#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see hu.modembed.model.modembed.structured.ReturnOperation#getResult()
	 * @see #getReturnOperation()
	 * @generated
	 */
	EReference getReturnOperation_Result();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.ExpressionOperation <em>Expression Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Operation</em>'.
	 * @see hu.modembed.model.modembed.structured.ExpressionOperation
	 * @generated
	 */
	EClass getExpressionOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.ExpressionOperation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.modembed.model.modembed.structured.ExpressionOperation#getExpression()
	 * @see #getExpressionOperation()
	 * @generated
	 */
	EReference getExpressionOperation_Expression();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.OperationBlock <em>Operation Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Block</em>'.
	 * @see hu.modembed.model.modembed.structured.OperationBlock
	 * @generated
	 */
	EClass getOperationBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.structured.OperationBlock#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hu.modembed.model.modembed.structured.OperationBlock#getVariables()
	 * @see #getOperationBlock()
	 * @generated
	 */
	EReference getOperationBlock_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.structured.OperationBlock#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see hu.modembed.model.modembed.structured.OperationBlock#getSteps()
	 * @see #getOperationBlock()
	 * @generated
	 */
	EReference getOperationBlock_Steps();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.ConditionalOperation <em>Conditional Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Operation</em>'.
	 * @see hu.modembed.model.modembed.structured.ConditionalOperation
	 * @generated
	 */
	EClass getConditionalOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.ConditionalOperation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.modembed.model.modembed.structured.ConditionalOperation#getCondition()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EReference getConditionalOperation_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.ConditionalOperation#getTrueBranch <em>True Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>True Branch</em>'.
	 * @see hu.modembed.model.modembed.structured.ConditionalOperation#getTrueBranch()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EReference getConditionalOperation_TrueBranch();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.ConditionalOperation#getFalseBranch <em>False Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>False Branch</em>'.
	 * @see hu.modembed.model.modembed.structured.ConditionalOperation#getFalseBranch()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EReference getConditionalOperation_FalseBranch();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.structured.LoopOperation <em>Loop Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Operation</em>'.
	 * @see hu.modembed.model.modembed.structured.LoopOperation
	 * @generated
	 */
	EClass getLoopOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.LoopOperation#getEntryCondition <em>Entry Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Condition</em>'.
	 * @see hu.modembed.model.modembed.structured.LoopOperation#getEntryCondition()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_EntryCondition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.LoopOperation#getExitCondition <em>Exit Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Condition</em>'.
	 * @see hu.modembed.model.modembed.structured.LoopOperation#getExitCondition()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_ExitCondition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.structured.LoopOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see hu.modembed.model.modembed.structured.LoopOperation#getBody()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredFactory getStructuredFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.StructuredModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.StructuredModuleImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getStructuredModule()
		 * @generated
		 */
		EClass STRUCTURED_MODULE = eINSTANCE.getStructuredModule();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_MODULE__FUNCTIONS = eINSTANCE.getStructuredModule_Functions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_MODULE__VARIABLES = eINSTANCE.getStructuredModule_Variables();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_MODULE__USES = eINSTANCE.getStructuredModule_Uses();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.VariableDeclarationImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__CONST = eINSTANCE.getVariableDeclaration_Const();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__GLOBAL = eINSTANCE.getVariableDeclaration_Global();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__INIT_VALUE = eINSTANCE.getVariableDeclaration_InitValue();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.StructuredFunctionImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getStructuredFunction()
		 * @generated
		 */
		EClass STRUCTURED_FUNCTION = eINSTANCE.getStructuredFunction();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FUNCTION__GLOBAL = eINSTANCE.getStructuredFunction_Global();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FUNCTION__RESULT_TYPE = eINSTANCE.getStructuredFunction_ResultType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FUNCTION__PARAMETERS = eINSTANCE.getStructuredFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_FUNCTION__IMPLEMENTATION = eINSTANCE.getStructuredFunction_Implementation();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.VariableReferenceExpressionImpl <em>Variable Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.VariableReferenceExpressionImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getVariableReferenceExpression()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE_EXPRESSION = eINSTANCE.getVariableReferenceExpression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE_EXPRESSION__VARIABLE = eINSTANCE.getVariableReferenceExpression_Variable();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.FunctionCallExpressionImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getFunctionCallExpression()
		 * @generated
		 */
		EClass FUNCTION_CALL_EXPRESSION = eINSTANCE.getFunctionCallExpression();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__FUNCTION = eINSTANCE.getFunctionCallExpression_Function();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_EXPRESSION__ARGUMENTS = eINSTANCE.getFunctionCallExpression_Arguments();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.OperationImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.ReturnOperationImpl <em>Return Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.ReturnOperationImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getReturnOperation()
		 * @generated
		 */
		EClass RETURN_OPERATION = eINSTANCE.getReturnOperation();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_OPERATION__RESULT = eINSTANCE.getReturnOperation_Result();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.ExpressionOperationImpl <em>Expression Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.ExpressionOperationImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getExpressionOperation()
		 * @generated
		 */
		EClass EXPRESSION_OPERATION = eINSTANCE.getExpressionOperation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OPERATION__EXPRESSION = eINSTANCE.getExpressionOperation_Expression();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.OperationBlockImpl <em>Operation Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.OperationBlockImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getOperationBlock()
		 * @generated
		 */
		EClass OPERATION_BLOCK = eINSTANCE.getOperationBlock();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BLOCK__VARIABLES = eINSTANCE.getOperationBlock_Variables();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BLOCK__STEPS = eINSTANCE.getOperationBlock_Steps();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl <em>Conditional Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.ConditionalOperationImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getConditionalOperation()
		 * @generated
		 */
		EClass CONDITIONAL_OPERATION = eINSTANCE.getConditionalOperation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OPERATION__CONDITION = eINSTANCE.getConditionalOperation_Condition();

		/**
		 * The meta object literal for the '<em><b>True Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OPERATION__TRUE_BRANCH = eINSTANCE.getConditionalOperation_TrueBranch();

		/**
		 * The meta object literal for the '<em><b>False Branch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OPERATION__FALSE_BRANCH = eINSTANCE.getConditionalOperation_FalseBranch();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.structured.impl.LoopOperationImpl <em>Loop Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.structured.impl.LoopOperationImpl
		 * @see hu.modembed.model.modembed.structured.impl.StructuredPackageImpl#getLoopOperation()
		 * @generated
		 */
		EClass LOOP_OPERATION = eINSTANCE.getLoopOperation();

		/**
		 * The meta object literal for the '<em><b>Entry Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__ENTRY_CONDITION = eINSTANCE.getLoopOperation_EntryCondition();

		/**
		 * The meta object literal for the '<em><b>Exit Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__EXIT_CONDITION = eINSTANCE.getLoopOperation_ExitCondition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__BODY = eINSTANCE.getLoopOperation_Body();

	}

} //StructuredPackage

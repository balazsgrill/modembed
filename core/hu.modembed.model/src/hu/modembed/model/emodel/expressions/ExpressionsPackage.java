/**
 */
package hu.modembed.model.emodel.expressions;

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
 * @see hu.modembed.model.emodel.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://emodel/1.0/expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.ExecutionStepImpl <em>Execution Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.ExecutionStepImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getExecutionStep()
	 * @generated
	 */
	int EXECUTION_STEP = 2;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__ORIGINS = CorePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__DESCRIPTION = CorePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Execution Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP_FEATURE_COUNT = CorePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ORIGINS = EXECUTION_STEP__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = EXECUTION_STEP__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.CallImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 5;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ORIGINS = EXPRESSION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.InstructionCallImpl <em>Instruction Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.InstructionCallImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getInstructionCall()
	 * @generated
	 */
	int INSTRUCTION_CALL = 1;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__ORIGINS = CALL__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__DESCRIPTION = CALL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__PARAMETERS = CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL__INSTRUCTION = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.LiteralExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__ORIGINS = EXPRESSION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.ExecutionBlockImpl <em>Execution Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.ExecutionBlockImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getExecutionBlock()
	 * @generated
	 */
	int EXECUTION_BLOCK = 4;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__ORIGINS = EXECUTION_STEP__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__DESCRIPTION = EXECUTION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK__STEPS = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execution Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_BLOCK_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.VariableReferenceImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__ORIGINS = EXPRESSION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.PrimitiveLiteralExpressionImpl <em>Primitive Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.PrimitiveLiteralExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getPrimitiveLiteralExpression()
	 * @generated
	 */
	int PRIMITIVE_LITERAL_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXPRESSION__ORIGINS = LITERAL_EXPRESSION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXPRESSION__DESCRIPTION = LITERAL_EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXPRESSION__TYPE = LITERAL_EXPRESSION__TYPE;

	/**
	 * The number of structural features of the '<em>Primitive Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_LITERAL_EXPRESSION_FEATURE_COUNT = LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.IntegerLiteralExpressionImpl <em>Integer Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.IntegerLiteralExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getIntegerLiteralExpression()
	 * @generated
	 */
	int INTEGER_LITERAL_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION__ORIGINS = PRIMITIVE_LITERAL_EXPRESSION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION__DESCRIPTION = PRIMITIVE_LITERAL_EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION__TYPE = PRIMITIVE_LITERAL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION__VALUE = PRIMITIVE_LITERAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXPRESSION_FEATURE_COUNT = PRIMITIVE_LITERAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.CompilationLogStepImpl <em>Compilation Log Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.CompilationLogStepImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCompilationLogStep()
	 * @generated
	 */
	int COMPILATION_LOG_STEP = 9;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_LOG_STEP__ORIGINS = EXECUTION_STEP__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_LOG_STEP__DESCRIPTION = EXECUTION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_LOG_STEP__SEVERITY = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_LOG_STEP__MESSAGE = EXECUTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compilation Log Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILATION_LOG_STEP_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.FunctionCallImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 10;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ORIGINS = CALL__ORIGINS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__DESCRIPTION = CALL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = CALL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.CompilationLogStepSeverity <em>Compilation Log Step Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStepSeverity
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCompilationLogStepSeverity()
	 * @generated
	 */
	int COMPILATION_LOG_STEP_SEVERITY = 11;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see hu.modembed.model.emodel.expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.InstructionCall <em>Instruction Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Call</em>'.
	 * @see hu.modembed.model.emodel.expressions.InstructionCall
	 * @generated
	 */
	EClass getInstructionCall();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.emodel.expressions.InstructionCall#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see hu.modembed.model.emodel.expressions.InstructionCall#getInstruction()
	 * @see #getInstructionCall()
	 * @generated
	 */
	EReference getInstructionCall_Instruction();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.ExecutionStep <em>Execution Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Step</em>'.
	 * @see hu.modembed.model.emodel.expressions.ExecutionStep
	 * @generated
	 */
	EClass getExecutionStep();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.LiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Expression</em>'.
	 * @see hu.modembed.model.emodel.expressions.LiteralExpression
	 * @generated
	 */
	EClass getLiteralExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.expressions.LiteralExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.modembed.model.emodel.expressions.LiteralExpression#getType()
	 * @see #getLiteralExpression()
	 * @generated
	 */
	EReference getLiteralExpression_Type();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.ExecutionBlock <em>Execution Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Block</em>'.
	 * @see hu.modembed.model.emodel.expressions.ExecutionBlock
	 * @generated
	 */
	EClass getExecutionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.expressions.ExecutionBlock#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see hu.modembed.model.emodel.expressions.ExecutionBlock#getSteps()
	 * @see #getExecutionBlock()
	 * @generated
	 */
	EReference getExecutionBlock_Steps();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see hu.modembed.model.emodel.expressions.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.expressions.Call#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.modembed.model.emodel.expressions.Call#getParameters()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Parameters();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see hu.modembed.model.emodel.expressions.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.emodel.expressions.VariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.modembed.model.emodel.expressions.VariableReference#getVariable()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Variable();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.PrimitiveLiteralExpression <em>Primitive Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Literal Expression</em>'.
	 * @see hu.modembed.model.emodel.expressions.PrimitiveLiteralExpression
	 * @generated
	 */
	EClass getPrimitiveLiteralExpression();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal Expression</em>'.
	 * @see hu.modembed.model.emodel.expressions.IntegerLiteralExpression
	 * @generated
	 */
	EClass getIntegerLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.expressions.IntegerLiteralExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.emodel.expressions.IntegerLiteralExpression#getValue()
	 * @see #getIntegerLiteralExpression()
	 * @generated
	 */
	EAttribute getIntegerLiteralExpression_Value();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.CompilationLogStep <em>Compilation Log Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compilation Log Step</em>'.
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStep
	 * @generated
	 */
	EClass getCompilationLogStep();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.expressions.CompilationLogStep#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStep#getSeverity()
	 * @see #getCompilationLogStep()
	 * @generated
	 */
	EAttribute getCompilationLogStep_Severity();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.expressions.CompilationLogStep#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStep#getMessage()
	 * @see #getCompilationLogStep()
	 * @generated
	 */
	EAttribute getCompilationLogStep_Message();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see hu.modembed.model.emodel.expressions.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.emodel.expressions.FunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see hu.modembed.model.emodel.expressions.FunctionCall#getFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Function();

	/**
	 * Returns the meta object for enum '{@link hu.modembed.model.emodel.expressions.CompilationLogStepSeverity <em>Compilation Log Step Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compilation Log Step Severity</em>'.
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStepSeverity
	 * @generated
	 */
	EEnum getCompilationLogStepSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.InstructionCallImpl <em>Instruction Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.InstructionCallImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getInstructionCall()
		 * @generated
		 */
		EClass INSTRUCTION_CALL = eINSTANCE.getInstructionCall();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL__INSTRUCTION = eINSTANCE.getInstructionCall_Instruction();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.ExecutionStepImpl <em>Execution Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.ExecutionStepImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getExecutionStep()
		 * @generated
		 */
		EClass EXECUTION_STEP = eINSTANCE.getExecutionStep();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.LiteralExpressionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getLiteralExpression()
		 * @generated
		 */
		EClass LITERAL_EXPRESSION = eINSTANCE.getLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_EXPRESSION__TYPE = eINSTANCE.getLiteralExpression_Type();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.ExecutionBlockImpl <em>Execution Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.ExecutionBlockImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getExecutionBlock()
		 * @generated
		 */
		EClass EXECUTION_BLOCK = eINSTANCE.getExecutionBlock();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_BLOCK__STEPS = eINSTANCE.getExecutionBlock_Steps();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.CallImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__PARAMETERS = eINSTANCE.getCall_Parameters();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.VariableReferenceImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getVariableReference_Variable();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.PrimitiveLiteralExpressionImpl <em>Primitive Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.PrimitiveLiteralExpressionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getPrimitiveLiteralExpression()
		 * @generated
		 */
		EClass PRIMITIVE_LITERAL_EXPRESSION = eINSTANCE.getPrimitiveLiteralExpression();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.IntegerLiteralExpressionImpl <em>Integer Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.IntegerLiteralExpressionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getIntegerLiteralExpression()
		 * @generated
		 */
		EClass INTEGER_LITERAL_EXPRESSION = eINSTANCE.getIntegerLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL_EXPRESSION__VALUE = eINSTANCE.getIntegerLiteralExpression_Value();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.CompilationLogStepImpl <em>Compilation Log Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.CompilationLogStepImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCompilationLogStep()
		 * @generated
		 */
		EClass COMPILATION_LOG_STEP = eINSTANCE.getCompilationLogStep();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_LOG_STEP__SEVERITY = eINSTANCE.getCompilationLogStep_Severity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILATION_LOG_STEP__MESSAGE = eINSTANCE.getCompilationLogStep_Message();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.FunctionCallImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.CompilationLogStepSeverity <em>Compilation Log Step Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.CompilationLogStepSeverity
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCompilationLogStepSeverity()
		 * @generated
		 */
		EEnum COMPILATION_LOG_STEP_SEVERITY = eINSTANCE.getCompilationLogStepSeverity();

	}

} //ExpressionsPackage

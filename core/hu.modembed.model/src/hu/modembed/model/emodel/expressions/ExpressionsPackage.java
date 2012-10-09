/**
 */
package hu.modembed.model.emodel.expressions;

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
	 * The number of structural features of the '<em>Execution Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.InstructionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__VALUE = EXECUTION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = EXECUTION_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.BinaryExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.UnaryExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.LiteralExpressionImpl <em>Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.LiteralExpressionImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getLiteralExpression()
	 * @generated
	 */
	int LITERAL_EXPRESSION = 5;

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
	int EXECUTION_BLOCK = 6;

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
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.FunctionCallImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.impl.VariableReferenceImpl
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 8;

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
	int PRIMITIVE_LITERAL_EXPRESSION = 9;

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
	int INTEGER_LITERAL_EXPRESSION = 10;

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
	int COMPILATION_LOG_STEP = 11;

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
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.BinaryOperator
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 12;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.UnaryOperator
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 13;

	/**
	 * The meta object id for the '{@link hu.modembed.model.emodel.expressions.CompilationLogStepSeverity <em>Compilation Log Step Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStepSeverity
	 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getCompilationLogStepSeverity()
	 * @generated
	 */
	int COMPILATION_LOG_STEP_SEVERITY = 14;


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
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see hu.modembed.model.emodel.expressions.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.expressions.Instruction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.modembed.model.emodel.expressions.Instruction#getValue()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Value();

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
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see hu.modembed.model.emodel.expressions.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.expressions.BinaryExpression#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.modembed.model.emodel.expressions.BinaryExpression#getLeftOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.expressions.BinaryExpression#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.modembed.model.emodel.expressions.BinaryExpression#getRightOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightOperand();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.expressions.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.modembed.model.emodel.expressions.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see hu.modembed.model.emodel.expressions.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.emodel.expressions.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see hu.modembed.model.emodel.expressions.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.emodel.expressions.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.modembed.model.emodel.expressions.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

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
	 * Returns the meta object for class '{@link hu.modembed.model.emodel.expressions.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see hu.modembed.model.emodel.expressions.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.emodel.expressions.FunctionCall#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.modembed.model.emodel.expressions.FunctionCall#getParameters()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Parameters();

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
	 * Returns the meta object for enum '{@link hu.modembed.model.emodel.expressions.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see hu.modembed.model.emodel.expressions.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link hu.modembed.model.emodel.expressions.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see hu.modembed.model.emodel.expressions.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.InstructionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__VALUE = eINSTANCE.getInstruction_Value();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.BinaryExpressionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_OPERAND = eINSTANCE.getBinaryExpression_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getBinaryExpression_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.UnaryExpressionImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.impl.FunctionCallImpl
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__PARAMETERS = eINSTANCE.getFunctionCall_Parameters();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

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
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.BinaryOperator
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.emodel.expressions.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.emodel.expressions.UnaryOperator
		 * @see hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

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

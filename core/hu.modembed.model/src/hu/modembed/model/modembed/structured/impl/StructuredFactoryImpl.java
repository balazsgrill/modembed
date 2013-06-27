/**
 */
package hu.modembed.model.modembed.structured.impl;

import hu.modembed.model.modembed.structured.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredFactoryImpl extends EFactoryImpl implements StructuredFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredFactory init() {
		try {
			StructuredFactory theStructuredFactory = (StructuredFactory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/structured"); 
			if (theStructuredFactory != null) {
				return theStructuredFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructuredPackage.STRUCTURED_MODULE: return createStructuredModule();
			case StructuredPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case StructuredPackage.STRUCTURED_FUNCTION: return createStructuredFunction();
			case StructuredPackage.INTEGER_CONST_EXPRESSION: return createIntegerConstExpression();
			case StructuredPackage.VARIABLE_REFERENCE_EXPRESSION: return createVariableReferenceExpression();
			case StructuredPackage.OPERATION_EXPRESSION: return createOperationExpression();
			case StructuredPackage.FUNCTION_CALL_EXPRESSION: return createFunctionCallExpression();
			case StructuredPackage.RETURN_OPERATION: return createReturnOperation();
			case StructuredPackage.EXPRESSION_OPERATION: return createExpressionOperation();
			case StructuredPackage.OPERATION_BLOCK: return createOperationBlock();
			case StructuredPackage.CONDITIONAL_OPERATION: return createConditionalOperation();
			case StructuredPackage.LOOP_OPERATION: return createLoopOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredModule createStructuredModule() {
		StructuredModuleImpl structuredModule = new StructuredModuleImpl();
		return structuredModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredFunction createStructuredFunction() {
		StructuredFunctionImpl structuredFunction = new StructuredFunctionImpl();
		return structuredFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstExpression createIntegerConstExpression() {
		IntegerConstExpressionImpl integerConstExpression = new IntegerConstExpressionImpl();
		return integerConstExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReferenceExpression createVariableReferenceExpression() {
		VariableReferenceExpressionImpl variableReferenceExpression = new VariableReferenceExpressionImpl();
		return variableReferenceExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationExpression createOperationExpression() {
		OperationExpressionImpl operationExpression = new OperationExpressionImpl();
		return operationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCallExpression createFunctionCallExpression() {
		FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
		return functionCallExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnOperation createReturnOperation() {
		ReturnOperationImpl returnOperation = new ReturnOperationImpl();
		return returnOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionOperation createExpressionOperation() {
		ExpressionOperationImpl expressionOperation = new ExpressionOperationImpl();
		return expressionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationBlock createOperationBlock() {
		OperationBlockImpl operationBlock = new OperationBlockImpl();
		return operationBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOperation createConditionalOperation() {
		ConditionalOperationImpl conditionalOperation = new ConditionalOperationImpl();
		return conditionalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOperation createLoopOperation() {
		LoopOperationImpl loopOperation = new LoopOperationImpl();
		return loopOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredPackage getStructuredPackage() {
		return (StructuredPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredPackage getPackage() {
		return StructuredPackage.eINSTANCE;
	}

} //StructuredFactoryImpl

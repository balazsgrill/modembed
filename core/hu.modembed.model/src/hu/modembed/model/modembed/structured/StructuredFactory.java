/**
 */
package hu.modembed.model.modembed.structured;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.structured.StructuredPackage
 * @generated
 */
public interface StructuredFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredFactory eINSTANCE = hu.modembed.model.modembed.structured.impl.StructuredFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	StructuredModule createStructuredModule();

	/**
	 * Returns a new object of class '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Declaration</em>'.
	 * @generated
	 */
	VariableDeclaration createVariableDeclaration();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	StructuredFunction createStructuredFunction();

	/**
	 * Returns a new object of class '<em>Integer Const Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Const Expression</em>'.
	 * @generated
	 */
	IntegerConstExpression createIntegerConstExpression();

	/**
	 * Returns a new object of class '<em>Variable Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Reference Expression</em>'.
	 * @generated
	 */
	VariableReferenceExpression createVariableReferenceExpression();

	/**
	 * Returns a new object of class '<em>Operation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Expression</em>'.
	 * @generated
	 */
	OperationExpression createOperationExpression();

	/**
	 * Returns a new object of class '<em>Function Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call Expression</em>'.
	 * @generated
	 */
	FunctionCallExpression createFunctionCallExpression();

	/**
	 * Returns a new object of class '<em>Return Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Operation</em>'.
	 * @generated
	 */
	ReturnOperation createReturnOperation();

	/**
	 * Returns a new object of class '<em>Expression Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Operation</em>'.
	 * @generated
	 */
	ExpressionOperation createExpressionOperation();

	/**
	 * Returns a new object of class '<em>Operation Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Block</em>'.
	 * @generated
	 */
	OperationBlock createOperationBlock();

	/**
	 * Returns a new object of class '<em>Conditional Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Operation</em>'.
	 * @generated
	 */
	ConditionalOperation createConditionalOperation();

	/**
	 * Returns a new object of class '<em>Loop Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Operation</em>'.
	 * @generated
	 */
	LoopOperation createLoopOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructuredPackage getStructuredPackage();

} //StructuredFactory

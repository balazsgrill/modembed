/**
 */
package hu.modembed.model.modembed.infrastructure.expressions;

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
 * @see hu.modembed.model.modembed.infrastructure.expressions.ExpressionsFactory
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
	String eNS_URI = "http://modembed.hu/infrastructure/expressions";

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
	ExpressionsPackage eINSTANCE = hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionImpl
	 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl#getExpression()
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
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.infrastructure.expressions.impl.IntegerConstantExpressionImpl <em>Integer Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.IntegerConstantExpressionImpl
	 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl#getIntegerConstantExpression()
	 * @generated
	 */
	int INTEGER_CONSTANT_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.infrastructure.expressions.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.OperationExpressionImpl
	 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl#getOperationExpression()
	 * @generated
	 */
	int OPERATION_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION__OPERATION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.infrastructure.expressions.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.expressions.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression <em>Integer Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant Expression</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression
	 * @generated
	 */
	EClass getIntegerConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression#getValue()
	 * @see #getIntegerConstantExpression()
	 * @generated
	 */
	EAttribute getIntegerConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.infrastructure.expressions.OperationExpression <em>Operation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Expression</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.expressions.OperationExpression
	 * @generated
	 */
	EClass getOperationExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.infrastructure.expressions.OperationExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.expressions.OperationExpression#getOperation()
	 * @see #getOperationExpression()
	 * @generated
	 */
	EAttribute getOperationExpression_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.infrastructure.expressions.OperationExpression#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.modembed.infrastructure.expressions.OperationExpression#getArguments()
	 * @see #getOperationExpression()
	 * @generated
	 */
	EReference getOperationExpression_Arguments();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionImpl
		 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.infrastructure.expressions.impl.IntegerConstantExpressionImpl <em>Integer Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.IntegerConstantExpressionImpl
		 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl#getIntegerConstantExpression()
		 * @generated
		 */
		EClass INTEGER_CONSTANT_EXPRESSION = eINSTANCE.getIntegerConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT_EXPRESSION__VALUE = eINSTANCE.getIntegerConstantExpression_Value();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.infrastructure.expressions.impl.OperationExpressionImpl <em>Operation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.OperationExpressionImpl
		 * @see hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl#getOperationExpression()
		 * @generated
		 */
		EClass OPERATION_EXPRESSION = eINSTANCE.getOperationExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_EXPRESSION__OPERATION = eINSTANCE.getOperationExpression_Operation();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_EXPRESSION__ARGUMENTS = eINSTANCE.getOperationExpression_Arguments();

	}

} //ExpressionsPackage

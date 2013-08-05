/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.infrastructure.expressions.Expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.ExpressionOperation#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getExpressionOperation()
 * @model
 * @generated
 */
public interface ExpressionOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getExpressionOperation_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.ExpressionOperation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // ExpressionOperation

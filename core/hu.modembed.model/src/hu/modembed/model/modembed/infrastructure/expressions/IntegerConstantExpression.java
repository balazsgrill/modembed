/**
 */
package hu.modembed.model.modembed.infrastructure.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Constant Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.infrastructure.expressions.ExpressionsPackage#getIntegerConstantExpression()
 * @model
 * @generated
 */
public interface IntegerConstantExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see hu.modembed.model.modembed.infrastructure.expressions.ExpressionsPackage#getIntegerConstantExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.expressions.IntegerConstantExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // IntegerConstantExpression

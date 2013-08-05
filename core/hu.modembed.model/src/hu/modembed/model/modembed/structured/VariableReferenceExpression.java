/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.infrastructure.expressions.Expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.VariableReferenceExpression#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableReferenceExpression()
 * @model
 * @generated
 */
public interface VariableReferenceExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(VariableDeclaration)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableReferenceExpression_Variable()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclaration getVariable();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.VariableReferenceExpression#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableDeclaration value);

} // VariableReferenceExpression

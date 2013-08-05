/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.infrastructure.expressions.Expression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.FunctionCallExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.FunctionCallExpression#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getFunctionCallExpression()
 * @model
 * @generated
 */
public interface FunctionCallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(StructuredFunction)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getFunctionCallExpression_Function()
	 * @model
	 * @generated
	 */
	StructuredFunction getFunction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.FunctionCallExpression#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(StructuredFunction value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.infrastructure.expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getFunctionCallExpression_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // FunctionCallExpression

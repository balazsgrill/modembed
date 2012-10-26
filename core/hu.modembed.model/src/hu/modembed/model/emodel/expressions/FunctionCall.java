/**
 */
package hu.modembed.model.emodel.expressions;

import hu.modembed.model.emodel.Function;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.expressions.FunctionCall#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Call {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getFunctionCall_Function()
	 * @model required="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.expressions.FunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // FunctionCall

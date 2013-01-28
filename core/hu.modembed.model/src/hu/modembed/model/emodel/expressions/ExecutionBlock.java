/**
 */
package hu.modembed.model.emodel.expressions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.expressions.ExecutionBlock#getSteps <em>Steps</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.expressions.ExecutionBlock#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getExecutionBlock()
 * @model
 * @generated
 */
public interface ExecutionBlock extends ExecutionStep {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.expressions.ExecutionStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getExecutionBlock_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Expression)
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getExecutionBlock_Result()
	 * @model containment="true"
	 * @generated
	 */
	Expression getResult();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.expressions.ExecutionBlock#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Expression value);

} // ExecutionBlock

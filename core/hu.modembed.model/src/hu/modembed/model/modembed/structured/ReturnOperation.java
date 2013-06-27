/**
 */
package hu.modembed.model.modembed.structured;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.ReturnOperation#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getReturnOperation()
 * @model
 * @generated
 */
public interface ReturnOperation extends Operation {
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
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getReturnOperation_Result()
	 * @model containment="true"
	 * @generated
	 */
	Expression getResult();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.ReturnOperation#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Expression value);

} // ReturnOperation

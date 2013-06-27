/**
 */
package hu.modembed.model.modembed.structured;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.ConditionalOperation#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.ConditionalOperation#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.ConditionalOperation#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getConditionalOperation()
 * @model
 * @generated
 */
public interface ConditionalOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getConditionalOperation_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.ConditionalOperation#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>True Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Branch</em>' containment reference.
	 * @see #setTrueBranch(Operation)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getConditionalOperation_TrueBranch()
	 * @model containment="true"
	 * @generated
	 */
	Operation getTrueBranch();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.ConditionalOperation#getTrueBranch <em>True Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Branch</em>' containment reference.
	 * @see #getTrueBranch()
	 * @generated
	 */
	void setTrueBranch(Operation value);

	/**
	 * Returns the value of the '<em><b>False Branch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Branch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Branch</em>' containment reference.
	 * @see #setFalseBranch(Operation)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getConditionalOperation_FalseBranch()
	 * @model containment="true"
	 * @generated
	 */
	Operation getFalseBranch();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.ConditionalOperation#getFalseBranch <em>False Branch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Branch</em>' containment reference.
	 * @see #getFalseBranch()
	 * @generated
	 */
	void setFalseBranch(Operation value);

} // ConditionalOperation

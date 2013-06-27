/**
 */
package hu.modembed.model.modembed.structured;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.LoopOperation#getEntryCondition <em>Entry Condition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.LoopOperation#getExitCondition <em>Exit Condition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.LoopOperation#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getLoopOperation()
 * @model
 * @generated
 */
public interface LoopOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Entry Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Condition</em>' containment reference.
	 * @see #setEntryCondition(Expression)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getLoopOperation_EntryCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEntryCondition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.LoopOperation#getEntryCondition <em>Entry Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Condition</em>' containment reference.
	 * @see #getEntryCondition()
	 * @generated
	 */
	void setEntryCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Exit Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Condition</em>' containment reference.
	 * @see #setExitCondition(Expression)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getLoopOperation_ExitCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExitCondition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.LoopOperation#getExitCondition <em>Exit Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Condition</em>' containment reference.
	 * @see #getExitCondition()
	 * @generated
	 */
	void setExitCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Operation)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getLoopOperation_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getBody();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.LoopOperation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Operation value);

} // LoopOperation

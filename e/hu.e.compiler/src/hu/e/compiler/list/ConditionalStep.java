/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.ConditionalStep#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.e.compiler.list.ConditionalStep#getSuccess <em>Success</em>}</li>
 *   <li>{@link hu.e.compiler.list.ConditionalStep#getFail <em>Fail</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getConditionalStep()
 * @model
 * @generated
 */
public interface ConditionalStep extends ProgramStep {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(ScriptStep)
	 * @see hu.e.compiler.list.ListPackage#getConditionalStep_Condition()
	 * @model
	 * @generated
	 */
	ScriptStep getCondition();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.ConditionalStep#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ScriptStep value);

	/**
	 * Returns the value of the '<em><b>Success</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' containment reference.
	 * @see #setSuccess(ProgramStep)
	 * @see hu.e.compiler.list.ListPackage#getConditionalStep_Success()
	 * @model containment="true"
	 * @generated
	 */
	ProgramStep getSuccess();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.ConditionalStep#getSuccess <em>Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' containment reference.
	 * @see #getSuccess()
	 * @generated
	 */
	void setSuccess(ProgramStep value);

	/**
	 * Returns the value of the '<em><b>Fail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail</em>' containment reference.
	 * @see #setFail(ProgramStep)
	 * @see hu.e.compiler.list.ListPackage#getConditionalStep_Fail()
	 * @model containment="true"
	 * @generated
	 */
	ProgramStep getFail();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.ConditionalStep#getFail <em>Fail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail</em>' containment reference.
	 * @see #getFail()
	 * @generated
	 */
	void setFail(ProgramStep value);

} // ConditionalStep

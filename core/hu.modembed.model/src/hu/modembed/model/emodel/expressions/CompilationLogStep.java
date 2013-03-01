/**
 */
package hu.modembed.model.emodel.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compilation Log Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.expressions.CompilationLogStep#getSeverity <em>Severity</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.expressions.CompilationLogStep#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCompilationLogStep()
 * @model
 * @generated
 */
public interface CompilationLogStep extends ExecutionStep {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.modembed.model.emodel.expressions.CompilationLogStepSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStepSeverity
	 * @see #setSeverity(CompilationLogStepSeverity)
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCompilationLogStep_Severity()
	 * @model required="true"
	 * @generated
	 */
	CompilationLogStepSeverity getSeverity();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.expressions.CompilationLogStep#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see hu.modembed.model.emodel.expressions.CompilationLogStepSeverity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(CompilationLogStepSeverity value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCompilationLogStep_Message()
	 * @model required="true"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.expressions.CompilationLogStep#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // CompilationLogStep

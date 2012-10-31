/**
 */
package hu.modembed.model.emodel.expressions;

import hu.modembed.model.emodel.CallableElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.expressions.Call#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.expressions.Call#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.expressions.ExecutionStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCall_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionStep> getParameters();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(CallableElement)
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCall_Function()
	 * @model required="true"
	 * @generated
	 */
	CallableElement getFunction();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.expressions.Call#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(CallableElement value);

} // Call

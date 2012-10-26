/**
 */
package hu.modembed.model.emodel.expressions;

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
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#getCall()
 * @model abstract="true"
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

} // Call

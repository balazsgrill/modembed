/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.OperationExecution#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.OperationExecution#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getOperationExecution()
 * @model
 * @generated
 */
public interface OperationExecution extends SequentialAction {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getOperationExecution_Arguments()
	 * @model
	 * @generated
	 */
	EList<String> getArguments();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getOperationExecution_Operation()
	 * @model required="true"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.OperationExecution#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

} // OperationExecution

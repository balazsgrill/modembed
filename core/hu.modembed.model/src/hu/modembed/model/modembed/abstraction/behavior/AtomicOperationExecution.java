/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Operation Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getAtomicOperationExecution()
 * @model
 * @generated
 */
public interface AtomicOperationExecution extends SequentialAction {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.abstraction.behavior.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference list.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getAtomicOperationExecution_Arguments()
	 * @model
	 * @generated
	 */
	EList<Symbol> getArguments();

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
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#getAtomicOperationExecution_Operation()
	 * @model required="true"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

} // AtomicOperationExecution

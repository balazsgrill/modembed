/**
 */
package hu.modembed.model.modembed.structured;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.OperationBlock#getVariables <em>Variables</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.OperationBlock#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getOperationBlock()
 * @model
 * @generated
 */
public interface OperationBlock extends Operation {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.structured.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getOperationBlock_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariables();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.structured.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getOperationBlock_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getSteps();

} // OperationBlock

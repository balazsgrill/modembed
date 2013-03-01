/**
 */
package hu.modembed.model.core.workflow;

import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.workflow.Workflow#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends RootElement {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.core.workflow.WorkflowTask}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see hu.modembed.model.core.workflow.WorkflowPackage#getWorkflow_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowTask> getTasks();

} // Workflow

/**
 */
package hu.modembed.model.core.workflow;

import hu.modembed.model.core.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.workflow.TaskParameter#getName <em>Name</em>}</li>
 *   <li>{@link hu.modembed.model.core.workflow.TaskParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.workflow.WorkflowPackage#getTaskParameter()
 * @model
 * @generated
 */
public interface TaskParameter extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.modembed.model.core.workflow.WorkflowPackage#getTaskParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.workflow.TaskParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see hu.modembed.model.core.workflow.WorkflowPackage#getTaskParameter_Value()
	 * @model
	 * @generated
	 */
	EList<String> getValue();

} // TaskParameter

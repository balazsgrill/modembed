/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredModule#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredModule#getVariables <em>Variables</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredModule#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredModule()
 * @model
 * @generated
 */
public interface StructuredModule extends RootElement {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.structured.StructuredFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredModule_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuredFunction> getFunctions();

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
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredModule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariables();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.structured.StructuredModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredModule_Uses()
	 * @model
	 * @generated
	 */
	EList<StructuredModule> getUses();

} // StructuredModule

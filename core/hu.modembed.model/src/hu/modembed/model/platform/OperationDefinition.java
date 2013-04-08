/**
 */
package hu.modembed.model.platform;

import hu.modembed.model.core.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.OperationDefinition#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.modembed.model.platform.OperationDefinition#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.platform.PlatformPackage#getOperationDefinition()
 * @model
 * @generated
 */
public interface OperationDefinition extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.platform.OperationArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.modembed.model.platform.PlatformPackage#getOperationDefinition_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationArgument> getArguments();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.platform.OperationStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see hu.modembed.model.platform.PlatformPackage#getOperationDefinition_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationStep> getSteps();

} // OperationDefinition

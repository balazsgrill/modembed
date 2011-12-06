/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.interface_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.interface_.OperationInterface#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.interface_.InterfacePackage#getOperationInterface()
 * @model
 * @generated
 */
public interface OperationInterface extends ComponentInterface {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.application.interface_.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see hu.modembed.model.application.interface_.InterfacePackage#getOperationInterface_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // OperationInterface

/**
 */
package hu.modembed.model.network;

import hu.modembed.model.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.network.NetworkNode#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.network.NetworkPackage#getNetworkNode()
 * @model
 * @generated
 */
public interface NetworkNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.network.NetworkInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see hu.modembed.model.network.NetworkPackage#getNetworkNode_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkInterface> getInterfaces();

} // NetworkNode

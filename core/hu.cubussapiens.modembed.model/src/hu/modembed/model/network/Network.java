/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network;

import hu.modembed.model.core.PackagedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.network.Network#getNodes <em>Nodes</em>}</li>
 *   <li>{@link hu.modembed.model.network.Network#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.network.NetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends PackagedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.network.NetworkNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see hu.modembed.model.network.NetworkPackage#getNetwork_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetworkNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.network.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see hu.modembed.model.network.NetworkPackage#getNetwork_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // Network

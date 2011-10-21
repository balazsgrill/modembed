/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network;

import hu.modembed.model.core.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.network.Connection#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.network.NetworkPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link hu.modembed.model.network.NetworkInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see hu.modembed.model.network.NetworkPackage#getConnection_Nodes()
	 * @model annotation="reference scope='..'"
	 * @generated
	 */
	EList<NetworkInterface> getNodes();

} // Connection

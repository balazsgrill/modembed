/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network.impl;

import hu.modembed.model.core.impl.NamedElementImpl;

import hu.modembed.model.network.NetworkInterface;
import hu.modembed.model.network.NetworkPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class NetworkInterfaceImpl extends NamedElementImpl implements NetworkInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.NETWORK_INTERFACE;
	}

} //NetworkInterfaceImpl

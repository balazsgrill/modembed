/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network.rs232.impl;

import hu.modembed.model.network.impl.ConnectionImpl;

import hu.modembed.model.network.rs232.RS232Connection;
import hu.modembed.model.network.rs232.Rs232Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RS232 Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.network.rs232.impl.RS232ConnectionImpl#getBaudRate <em>Baud Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RS232ConnectionImpl extends ConnectionImpl implements RS232Connection {
	/**
	 * The default value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected static final int BAUD_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected int baudRate = BAUD_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RS232ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rs232Package.Literals.RS232_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBaudRate() {
		return baudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaudRate(int newBaudRate) {
		int oldBaudRate = baudRate;
		baudRate = newBaudRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rs232Package.RS232_CONNECTION__BAUD_RATE, oldBaudRate, baudRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Rs232Package.RS232_CONNECTION__BAUD_RATE:
				return getBaudRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Rs232Package.RS232_CONNECTION__BAUD_RATE:
				setBaudRate((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Rs232Package.RS232_CONNECTION__BAUD_RATE:
				setBaudRate(BAUD_RATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Rs232Package.RS232_CONNECTION__BAUD_RATE:
				return baudRate != BAUD_RATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baudRate: ");
		result.append(baudRate);
		result.append(')');
		return result.toString();
	}

} //RS232ConnectionImpl

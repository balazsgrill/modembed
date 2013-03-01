/**
 */
package hu.modembed.model.comm.rs232.impl;

import hu.modembed.model.comm.impl.CommunicationProtocolImpl;

import hu.modembed.model.comm.rs232.RS232Protocol;
import hu.modembed.model.comm.rs232.Rs232Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RS232 Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.comm.rs232.impl.RS232ProtocolImpl#getIdBitLength <em>Id Bit Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RS232ProtocolImpl extends CommunicationProtocolImpl implements RS232Protocol {
	/**
	 * The default value of the '{@link #getIdBitLength() <em>Id Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBitLength()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_BIT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdBitLength() <em>Id Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdBitLength()
	 * @generated
	 * @ordered
	 */
	protected int idBitLength = ID_BIT_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RS232ProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rs232Package.Literals.RS232_PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdBitLength() {
		return idBitLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdBitLength(int newIdBitLength) {
		int oldIdBitLength = idBitLength;
		idBitLength = newIdBitLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rs232Package.RS232_PROTOCOL__ID_BIT_LENGTH, oldIdBitLength, idBitLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Rs232Package.RS232_PROTOCOL__ID_BIT_LENGTH:
				return getIdBitLength();
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
			case Rs232Package.RS232_PROTOCOL__ID_BIT_LENGTH:
				setIdBitLength((Integer)newValue);
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
			case Rs232Package.RS232_PROTOCOL__ID_BIT_LENGTH:
				setIdBitLength(ID_BIT_LENGTH_EDEFAULT);
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
			case Rs232Package.RS232_PROTOCOL__ID_BIT_LENGTH:
				return idBitLength != ID_BIT_LENGTH_EDEFAULT;
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
		result.append(" (idBitLength: ");
		result.append(idBitLength);
		result.append(')');
		return result.toString();
	}

} //RS232ProtocolImpl

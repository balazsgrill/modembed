/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hexfile.impl;

import hexfile.Entry;
import hexfile.HexfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hexfile.impl.EntryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link hexfile.impl.EntryImpl#getData <em>Data</em>}</li>
 *   <li>{@link hexfile.impl.EntryImpl#getBlocksize <em>Blocksize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryImpl extends EObjectImpl implements Entry {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected int address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocksize() <em>Blocksize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksize()
	 * @generated
	 * @ordered
	 */
	protected static final int BLOCKSIZE_EDEFAULT = 16;

	/**
	 * The cached value of the '{@link #getBlocksize() <em>Blocksize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksize()
	 * @generated
	 * @ordered
	 */
	protected int blocksize = BLOCKSIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HexfilePackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(int newAddress) {
		int oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HexfilePackage.ENTRY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HexfilePackage.ENTRY__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBlocksize() {
		return blocksize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocksize(int newBlocksize) {
		int oldBlocksize = blocksize;
		blocksize = newBlocksize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HexfilePackage.ENTRY__BLOCKSIZE, oldBlocksize, blocksize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HexfilePackage.ENTRY__ADDRESS:
				return getAddress();
			case HexfilePackage.ENTRY__DATA:
				return getData();
			case HexfilePackage.ENTRY__BLOCKSIZE:
				return getBlocksize();
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
			case HexfilePackage.ENTRY__ADDRESS:
				setAddress((Integer)newValue);
				return;
			case HexfilePackage.ENTRY__DATA:
				setData((byte[])newValue);
				return;
			case HexfilePackage.ENTRY__BLOCKSIZE:
				setBlocksize((Integer)newValue);
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
			case HexfilePackage.ENTRY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case HexfilePackage.ENTRY__DATA:
				setData(DATA_EDEFAULT);
				return;
			case HexfilePackage.ENTRY__BLOCKSIZE:
				setBlocksize(BLOCKSIZE_EDEFAULT);
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
			case HexfilePackage.ENTRY__ADDRESS:
				return address != ADDRESS_EDEFAULT;
			case HexfilePackage.ENTRY__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case HexfilePackage.ENTRY__BLOCKSIZE:
				return blocksize != BLOCKSIZE_EDEFAULT;
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
		result.append(" (address: ");
		result.append(address);
		result.append(", data: ");
		result.append(data);
		result.append(", blocksize: ");
		result.append(blocksize);
		result.append(')');
		return result.toString();
	}

} //EntryImpl

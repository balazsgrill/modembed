/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.comm.rs232.impl;

import hu.modembed.model.comm.impl.FrameImpl;

import hu.modembed.model.comm.rs232.Field;
import hu.modembed.model.comm.rs232.RS232Frame;
import hu.modembed.model.comm.rs232.Rs232Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RS232 Frame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.comm.rs232.impl.RS232FrameImpl#getNumOfBytes <em>Num Of Bytes</em>}</li>
 *   <li>{@link hu.modembed.model.comm.rs232.impl.RS232FrameImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link hu.modembed.model.comm.rs232.impl.RS232FrameImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RS232FrameImpl extends FrameImpl implements RS232Frame {
	/**
	 * The default value of the '{@link #getNumOfBytes() <em>Num Of Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfBytes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfBytes() <em>Num Of Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfBytes()
	 * @generated
	 * @ordered
	 */
	protected int numOfBytes = NUM_OF_BYTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RS232FrameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rs232Package.Literals.RS232_FRAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfBytes() {
		return numOfBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfBytes(int newNumOfBytes) {
		int oldNumOfBytes = numOfBytes;
		numOfBytes = newNumOfBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rs232Package.RS232_FRAME__NUM_OF_BYTES, oldNumOfBytes, numOfBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, Rs232Package.RS232_FRAME__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rs232Package.RS232_FRAME__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Rs232Package.RS232_FRAME__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Rs232Package.RS232_FRAME__NUM_OF_BYTES:
				return getNumOfBytes();
			case Rs232Package.RS232_FRAME__FIELDS:
				return getFields();
			case Rs232Package.RS232_FRAME__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Rs232Package.RS232_FRAME__NUM_OF_BYTES:
				setNumOfBytes((Integer)newValue);
				return;
			case Rs232Package.RS232_FRAME__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case Rs232Package.RS232_FRAME__ID:
				setId((Integer)newValue);
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
			case Rs232Package.RS232_FRAME__NUM_OF_BYTES:
				setNumOfBytes(NUM_OF_BYTES_EDEFAULT);
				return;
			case Rs232Package.RS232_FRAME__FIELDS:
				getFields().clear();
				return;
			case Rs232Package.RS232_FRAME__ID:
				setId(ID_EDEFAULT);
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
			case Rs232Package.RS232_FRAME__NUM_OF_BYTES:
				return numOfBytes != NUM_OF_BYTES_EDEFAULT;
			case Rs232Package.RS232_FRAME__FIELDS:
				return fields != null && !fields.isEmpty();
			case Rs232Package.RS232_FRAME__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (numOfBytes: ");
		result.append(numOfBytes);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RS232FrameImpl

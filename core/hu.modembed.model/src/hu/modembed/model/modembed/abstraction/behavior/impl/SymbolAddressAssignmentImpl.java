/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Address Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolAddressAssignmentImpl#getMemoryInstance <em>Memory Instance</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolAddressAssignmentImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolAddressAssignmentImpl extends SymbolAssignmentImpl implements SymbolAddressAssignment {
	/**
	 * The cached value of the '{@link #getMemoryInstance() <em>Memory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryInstance()
	 * @generated
	 * @ordered
	 */
	protected MemoryInstance memoryInstance;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected long address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolAddressAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SYMBOL_ADDRESS_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryInstance getMemoryInstance() {
		if (memoryInstance != null && memoryInstance.eIsProxy()) {
			InternalEObject oldMemoryInstance = (InternalEObject)memoryInstance;
			memoryInstance = (MemoryInstance)eResolveProxy(oldMemoryInstance);
			if (memoryInstance != oldMemoryInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE, oldMemoryInstance, memoryInstance));
			}
		}
		return memoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryInstance basicGetMemoryInstance() {
		return memoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryInstance(MemoryInstance newMemoryInstance) {
		MemoryInstance oldMemoryInstance = memoryInstance;
		memoryInstance = newMemoryInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE, oldMemoryInstance, memoryInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(long newAddress) {
		long oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE:
				if (resolve) return getMemoryInstance();
				return basicGetMemoryInstance();
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__ADDRESS:
				return getAddress();
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
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE:
				setMemoryInstance((MemoryInstance)newValue);
				return;
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__ADDRESS:
				setAddress((Long)newValue);
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
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE:
				setMemoryInstance((MemoryInstance)null);
				return;
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE:
				return memoryInstance != null;
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT__ADDRESS:
				return address != ADDRESS_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //SymbolAddressAssignmentImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory.impl;

import memory.MemoryPackage;
import memory.ProgModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link memory.impl.ProgModelImpl#getStartAddr <em>Start Addr</em>}</li>
 *   <li>{@link memory.impl.ProgModelImpl#getSize <em>Size</em>}</li>
 *   <li>{@link memory.impl.ProgModelImpl#getResetVector <em>Reset Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgModelImpl extends EObjectImpl implements ProgModel {
	/**
	 * The default value of the '{@link #getStartAddr() <em>Start Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddr()
	 * @generated
	 * @ordered
	 */
	protected static final long START_ADDR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartAddr() <em>Start Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddr()
	 * @generated
	 * @ordered
	 */
	protected long startAddr = START_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetVector() <em>Reset Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetVector()
	 * @generated
	 * @ordered
	 */
	protected static final long RESET_VECTOR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getResetVector() <em>Reset Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetVector()
	 * @generated
	 * @ordered
	 */
	protected long resetVector = RESET_VECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.PROG_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartAddr() {
		return startAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddr(long newStartAddr) {
		long oldStartAddr = startAddr;
		startAddr = newStartAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROG_MODEL__START_ADDR, oldStartAddr, startAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROG_MODEL__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getResetVector() {
		return resetVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetVector(long newResetVector) {
		long oldResetVector = resetVector;
		resetVector = newResetVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROG_MODEL__RESET_VECTOR, oldResetVector, resetVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MemoryPackage.PROG_MODEL__START_ADDR:
				return getStartAddr();
			case MemoryPackage.PROG_MODEL__SIZE:
				return getSize();
			case MemoryPackage.PROG_MODEL__RESET_VECTOR:
				return getResetVector();
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
			case MemoryPackage.PROG_MODEL__START_ADDR:
				setStartAddr((Long)newValue);
				return;
			case MemoryPackage.PROG_MODEL__SIZE:
				setSize((Long)newValue);
				return;
			case MemoryPackage.PROG_MODEL__RESET_VECTOR:
				setResetVector((Long)newValue);
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
			case MemoryPackage.PROG_MODEL__START_ADDR:
				setStartAddr(START_ADDR_EDEFAULT);
				return;
			case MemoryPackage.PROG_MODEL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MemoryPackage.PROG_MODEL__RESET_VECTOR:
				setResetVector(RESET_VECTOR_EDEFAULT);
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
			case MemoryPackage.PROG_MODEL__START_ADDR:
				return startAddr != START_ADDR_EDEFAULT;
			case MemoryPackage.PROG_MODEL__SIZE:
				return size != SIZE_EDEFAULT;
			case MemoryPackage.PROG_MODEL__RESET_VECTOR:
				return resetVector != RESET_VECTOR_EDEFAULT;
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
		result.append(" (startAddr: ");
		result.append(startAddr);
		result.append(", size: ");
		result.append(size);
		result.append(", resetVector: ");
		result.append(resetVector);
		result.append(')');
		return result.toString();
	}

} //ProgModelImpl

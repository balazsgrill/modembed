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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link memory.impl.ProgModelImpl#getResetVector <em>Reset Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgModelImpl extends MemSegmentImpl implements ProgModel {
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
		result.append(" (resetVector: ");
		result.append(resetVector);
		result.append(')');
		return result.toString();
	}

} //ProgModelImpl

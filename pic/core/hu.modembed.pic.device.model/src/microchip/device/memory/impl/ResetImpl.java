/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.MemoryPackage;
import microchip.device.memory.Reset;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.ResetImpl#getPor <em>Por</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ResetImpl#getMclr <em>Mclr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResetImpl extends EObjectImpl implements Reset {
	/**
	 * The default value of the '{@link #getPor() <em>Por</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPor()
	 * @generated
	 * @ordered
	 */
	protected static final String POR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPor() <em>Por</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPor()
	 * @generated
	 * @ordered
	 */
	protected String por = POR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMclr() <em>Mclr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMclr()
	 * @generated
	 * @ordered
	 */
	protected static final String MCLR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMclr() <em>Mclr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMclr()
	 * @generated
	 * @ordered
	 */
	protected String mclr = MCLR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.RESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPor() {
		return por;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPor(String newPor) {
		String oldPor = por;
		por = newPor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.RESET__POR, oldPor, por));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMclr() {
		return mclr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMclr(String newMclr) {
		String oldMclr = mclr;
		mclr = newMclr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.RESET__MCLR, oldMclr, mclr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MemoryPackage.RESET__POR:
				return getPor();
			case MemoryPackage.RESET__MCLR:
				return getMclr();
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
			case MemoryPackage.RESET__POR:
				setPor((String)newValue);
				return;
			case MemoryPackage.RESET__MCLR:
				setMclr((String)newValue);
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
			case MemoryPackage.RESET__POR:
				setPor(POR_EDEFAULT);
				return;
			case MemoryPackage.RESET__MCLR:
				setMclr(MCLR_EDEFAULT);
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
			case MemoryPackage.RESET__POR:
				return POR_EDEFAULT == null ? por != null : !POR_EDEFAULT.equals(por);
			case MemoryPackage.RESET__MCLR:
				return MCLR_EDEFAULT == null ? mclr != null : !MCLR_EDEFAULT.equals(mclr);
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
		result.append(" (por: ");
		result.append(por);
		result.append(", mclr: ");
		result.append(mclr);
		result.append(')');
		return result.toString();
	}

} //ResetImpl

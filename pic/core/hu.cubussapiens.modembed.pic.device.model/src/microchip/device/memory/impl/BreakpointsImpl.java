/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.Breakpoints;
import microchip.device.memory.MemoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breakpoints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.BreakpointsImpl#getNumhwbp <em>Numhwbp</em>}</li>
 *   <li>{@link microchip.device.memory.impl.BreakpointsImpl#getDatacapture <em>Datacapture</em>}</li>
 *   <li>{@link microchip.device.memory.impl.BreakpointsImpl#getIdbyte <em>Idbyte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakpointsImpl extends EObjectImpl implements Breakpoints {
	/**
	 * The default value of the '{@link #getNumhwbp() <em>Numhwbp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumhwbp()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMHWBP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumhwbp() <em>Numhwbp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumhwbp()
	 * @generated
	 * @ordered
	 */
	protected int numhwbp = NUMHWBP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatacapture() <em>Datacapture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacapture()
	 * @generated
	 * @ordered
	 */
	protected static final String DATACAPTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatacapture() <em>Datacapture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatacapture()
	 * @generated
	 * @ordered
	 */
	protected String datacapture = DATACAPTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdbyte() <em>Idbyte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdbyte()
	 * @generated
	 * @ordered
	 */
	protected static final String IDBYTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdbyte() <em>Idbyte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdbyte()
	 * @generated
	 * @ordered
	 */
	protected String idbyte = IDBYTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BreakpointsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.BREAKPOINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumhwbp() {
		return numhwbp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumhwbp(int newNumhwbp) {
		int oldNumhwbp = numhwbp;
		numhwbp = newNumhwbp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.BREAKPOINTS__NUMHWBP, oldNumhwbp, numhwbp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatacapture() {
		return datacapture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatacapture(String newDatacapture) {
		String oldDatacapture = datacapture;
		datacapture = newDatacapture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.BREAKPOINTS__DATACAPTURE, oldDatacapture, datacapture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdbyte() {
		return idbyte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdbyte(String newIdbyte) {
		String oldIdbyte = idbyte;
		idbyte = newIdbyte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.BREAKPOINTS__IDBYTE, oldIdbyte, idbyte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MemoryPackage.BREAKPOINTS__NUMHWBP:
				return getNumhwbp();
			case MemoryPackage.BREAKPOINTS__DATACAPTURE:
				return getDatacapture();
			case MemoryPackage.BREAKPOINTS__IDBYTE:
				return getIdbyte();
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
			case MemoryPackage.BREAKPOINTS__NUMHWBP:
				setNumhwbp((Integer)newValue);
				return;
			case MemoryPackage.BREAKPOINTS__DATACAPTURE:
				setDatacapture((String)newValue);
				return;
			case MemoryPackage.BREAKPOINTS__IDBYTE:
				setIdbyte((String)newValue);
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
			case MemoryPackage.BREAKPOINTS__NUMHWBP:
				setNumhwbp(NUMHWBP_EDEFAULT);
				return;
			case MemoryPackage.BREAKPOINTS__DATACAPTURE:
				setDatacapture(DATACAPTURE_EDEFAULT);
				return;
			case MemoryPackage.BREAKPOINTS__IDBYTE:
				setIdbyte(IDBYTE_EDEFAULT);
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
			case MemoryPackage.BREAKPOINTS__NUMHWBP:
				return numhwbp != NUMHWBP_EDEFAULT;
			case MemoryPackage.BREAKPOINTS__DATACAPTURE:
				return DATACAPTURE_EDEFAULT == null ? datacapture != null : !DATACAPTURE_EDEFAULT.equals(datacapture);
			case MemoryPackage.BREAKPOINTS__IDBYTE:
				return IDBYTE_EDEFAULT == null ? idbyte != null : !IDBYTE_EDEFAULT.equals(idbyte);
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
		result.append(" (numhwbp: ");
		result.append(numhwbp);
		result.append(", datacapture: ");
		result.append(datacapture);
		result.append(", idbyte: ");
		result.append(idbyte);
		result.append(')');
		return result.toString();
	}

} //BreakpointsImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.BreakpointsType;
import crownking.edc.EdcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Breakpoints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.BreakpointsTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.BreakpointsTypeImpl#getHasdatacapture <em>Hasdatacapture</em>}</li>
 *   <li>{@link crownking.edc.impl.BreakpointsTypeImpl#getHwbpcount <em>Hwbpcount</em>}</li>
 *   <li>{@link crownking.edc.impl.BreakpointsTypeImpl#getIdbyte <em>Idbyte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BreakpointsTypeImpl extends EObjectImpl implements BreakpointsType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasdatacapture() <em>Hasdatacapture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasdatacapture()
	 * @generated
	 * @ordered
	 */
	protected static final String HASDATACAPTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasdatacapture() <em>Hasdatacapture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasdatacapture()
	 * @generated
	 * @ordered
	 */
	protected String hasdatacapture = HASDATACAPTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHwbpcount() <em>Hwbpcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwbpcount()
	 * @generated
	 * @ordered
	 */
	protected static final byte HWBPCOUNT_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getHwbpcount() <em>Hwbpcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwbpcount()
	 * @generated
	 * @ordered
	 */
	protected byte hwbpcount = HWBPCOUNT_EDEFAULT;

	/**
	 * This is true if the Hwbpcount attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hwbpcountESet;

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
	protected BreakpointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getBreakpointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.BREAKPOINTS_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasdatacapture() {
		return hasdatacapture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasdatacapture(String newHasdatacapture) {
		String oldHasdatacapture = hasdatacapture;
		hasdatacapture = newHasdatacapture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.BREAKPOINTS_TYPE__HASDATACAPTURE, oldHasdatacapture, hasdatacapture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getHwbpcount() {
		return hwbpcount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwbpcount(byte newHwbpcount) {
		byte oldHwbpcount = hwbpcount;
		hwbpcount = newHwbpcount;
		boolean oldHwbpcountESet = hwbpcountESet;
		hwbpcountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.BREAKPOINTS_TYPE__HWBPCOUNT, oldHwbpcount, hwbpcount, !oldHwbpcountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHwbpcount() {
		byte oldHwbpcount = hwbpcount;
		boolean oldHwbpcountESet = hwbpcountESet;
		hwbpcount = HWBPCOUNT_EDEFAULT;
		hwbpcountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.BREAKPOINTS_TYPE__HWBPCOUNT, oldHwbpcount, HWBPCOUNT_EDEFAULT, oldHwbpcountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHwbpcount() {
		return hwbpcountESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.BREAKPOINTS_TYPE__IDBYTE, oldIdbyte, idbyte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.BREAKPOINTS_TYPE__VALUE:
				return getValue();
			case EdcPackage.BREAKPOINTS_TYPE__HASDATACAPTURE:
				return getHasdatacapture();
			case EdcPackage.BREAKPOINTS_TYPE__HWBPCOUNT:
				return getHwbpcount();
			case EdcPackage.BREAKPOINTS_TYPE__IDBYTE:
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
			case EdcPackage.BREAKPOINTS_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.BREAKPOINTS_TYPE__HASDATACAPTURE:
				setHasdatacapture((String)newValue);
				return;
			case EdcPackage.BREAKPOINTS_TYPE__HWBPCOUNT:
				setHwbpcount((Byte)newValue);
				return;
			case EdcPackage.BREAKPOINTS_TYPE__IDBYTE:
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
			case EdcPackage.BREAKPOINTS_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.BREAKPOINTS_TYPE__HASDATACAPTURE:
				setHasdatacapture(HASDATACAPTURE_EDEFAULT);
				return;
			case EdcPackage.BREAKPOINTS_TYPE__HWBPCOUNT:
				unsetHwbpcount();
				return;
			case EdcPackage.BREAKPOINTS_TYPE__IDBYTE:
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
			case EdcPackage.BREAKPOINTS_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.BREAKPOINTS_TYPE__HASDATACAPTURE:
				return HASDATACAPTURE_EDEFAULT == null ? hasdatacapture != null : !HASDATACAPTURE_EDEFAULT.equals(hasdatacapture);
			case EdcPackage.BREAKPOINTS_TYPE__HWBPCOUNT:
				return isSetHwbpcount();
			case EdcPackage.BREAKPOINTS_TYPE__IDBYTE:
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
		result.append(" (value: ");
		result.append(value);
		result.append(", hasdatacapture: ");
		result.append(hasdatacapture);
		result.append(", hwbpcount: ");
		if (hwbpcountESet) result.append(hwbpcount); else result.append("<unset>");
		result.append(", idbyte: ");
		result.append(idbyte);
		result.append(')');
		return result.toString();
	}

} //BreakpointsTypeImpl

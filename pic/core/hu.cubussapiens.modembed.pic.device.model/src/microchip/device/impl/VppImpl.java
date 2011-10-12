/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.impl;

import microchip.device.DevicePackage;
import microchip.device.Vpp;

import microchip.device.generic.FloatRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vpp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.impl.VppImpl#getRange <em>Range</em>}</li>
 *   <li>{@link microchip.device.impl.VppImpl#getDflt <em>Dflt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VppImpl extends EObjectImpl implements Vpp {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected FloatRange range;

	/**
	 * This is true if the Range containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rangeESet;

	/**
	 * The default value of the '{@link #getDflt() <em>Dflt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDflt()
	 * @generated
	 * @ordered
	 */
	protected static final float DFLT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDflt() <em>Dflt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDflt()
	 * @generated
	 * @ordered
	 */
	protected float dflt = DFLT_EDEFAULT;

	/**
	 * This is true if the Dflt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dfltESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicePackage.Literals.VPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatRange getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(FloatRange newRange, NotificationChain msgs) {
		FloatRange oldRange = range;
		range = newRange;
		boolean oldRangeESet = rangeESet;
		rangeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicePackage.VPP__RANGE, oldRange, newRange, !oldRangeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(FloatRange newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VPP__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VPP__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRangeESet = rangeESet;
			rangeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.VPP__RANGE, newRange, newRange, !oldRangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetRange(NotificationChain msgs) {
		FloatRange oldRange = range;
		range = null;
		boolean oldRangeESet = rangeESet;
		rangeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, DevicePackage.VPP__RANGE, oldRange, null, oldRangeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRange() {
		if (range != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VPP__RANGE, null, msgs);
			msgs = basicUnsetRange(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRangeESet = rangeESet;
			rangeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, DevicePackage.VPP__RANGE, null, null, oldRangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRange() {
		return rangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDflt() {
		return dflt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDflt(float newDflt) {
		float oldDflt = dflt;
		dflt = newDflt;
		boolean oldDfltESet = dfltESet;
		dfltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.VPP__DFLT, oldDflt, dflt, !oldDfltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDflt() {
		float oldDflt = dflt;
		boolean oldDfltESet = dfltESet;
		dflt = DFLT_EDEFAULT;
		dfltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicePackage.VPP__DFLT, oldDflt, DFLT_EDEFAULT, oldDfltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDflt() {
		return dfltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicePackage.VPP__RANGE:
				return basicUnsetRange(msgs);
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
			case DevicePackage.VPP__RANGE:
				return getRange();
			case DevicePackage.VPP__DFLT:
				return getDflt();
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
			case DevicePackage.VPP__RANGE:
				setRange((FloatRange)newValue);
				return;
			case DevicePackage.VPP__DFLT:
				setDflt((Float)newValue);
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
			case DevicePackage.VPP__RANGE:
				unsetRange();
				return;
			case DevicePackage.VPP__DFLT:
				unsetDflt();
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
			case DevicePackage.VPP__RANGE:
				return isSetRange();
			case DevicePackage.VPP__DFLT:
				return isSetDflt();
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
		result.append(" (dflt: ");
		if (dfltESet) result.append(dflt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VppImpl

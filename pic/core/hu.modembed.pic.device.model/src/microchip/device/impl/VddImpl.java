/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.impl;

import microchip.device.DevicePackage;
import microchip.device.Vdd;

import microchip.device.generic.FloatRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vdd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.impl.VddImpl#getRange <em>Range</em>}</li>
 *   <li>{@link microchip.device.impl.VddImpl#getDfltrange <em>Dfltrange</em>}</li>
 *   <li>{@link microchip.device.impl.VddImpl#getNominal <em>Nominal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VddImpl extends EObjectImpl implements Vdd {
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
	 * The cached value of the '{@link #getDfltrange() <em>Dfltrange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDfltrange()
	 * @generated
	 * @ordered
	 */
	protected FloatRange dfltrange;

	/**
	 * This is true if the Dfltrange containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dfltrangeESet;

	/**
	 * The default value of the '{@link #getNominal() <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominal() <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominal()
	 * @generated
	 * @ordered
	 */
	protected float nominal = NOMINAL_EDEFAULT;

	/**
	 * This is true if the Nominal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VddImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicePackage.Literals.VDD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicePackage.VDD__RANGE, oldRange, newRange, !oldRangeESet);
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
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VDD__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VDD__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRangeESet = rangeESet;
			rangeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.VDD__RANGE, newRange, newRange, !oldRangeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, DevicePackage.VDD__RANGE, oldRange, null, oldRangeESet);
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
			msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VDD__RANGE, null, msgs);
			msgs = basicUnsetRange(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldRangeESet = rangeESet;
			rangeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, DevicePackage.VDD__RANGE, null, null, oldRangeESet));
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
	public FloatRange getDfltrange() {
		return dfltrange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDfltrange(FloatRange newDfltrange, NotificationChain msgs) {
		FloatRange oldDfltrange = dfltrange;
		dfltrange = newDfltrange;
		boolean oldDfltrangeESet = dfltrangeESet;
		dfltrangeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicePackage.VDD__DFLTRANGE, oldDfltrange, newDfltrange, !oldDfltrangeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDfltrange(FloatRange newDfltrange) {
		if (newDfltrange != dfltrange) {
			NotificationChain msgs = null;
			if (dfltrange != null)
				msgs = ((InternalEObject)dfltrange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VDD__DFLTRANGE, null, msgs);
			if (newDfltrange != null)
				msgs = ((InternalEObject)newDfltrange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VDD__DFLTRANGE, null, msgs);
			msgs = basicSetDfltrange(newDfltrange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDfltrangeESet = dfltrangeESet;
			dfltrangeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.VDD__DFLTRANGE, newDfltrange, newDfltrange, !oldDfltrangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetDfltrange(NotificationChain msgs) {
		FloatRange oldDfltrange = dfltrange;
		dfltrange = null;
		boolean oldDfltrangeESet = dfltrangeESet;
		dfltrangeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, DevicePackage.VDD__DFLTRANGE, oldDfltrange, null, oldDfltrangeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDfltrange() {
		if (dfltrange != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)dfltrange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.VDD__DFLTRANGE, null, msgs);
			msgs = basicUnsetDfltrange(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldDfltrangeESet = dfltrangeESet;
			dfltrangeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, DevicePackage.VDD__DFLTRANGE, null, null, oldDfltrangeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDfltrange() {
		return dfltrangeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getNominal() {
		return nominal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominal(float newNominal) {
		float oldNominal = nominal;
		nominal = newNominal;
		boolean oldNominalESet = nominalESet;
		nominalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.VDD__NOMINAL, oldNominal, nominal, !oldNominalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominal() {
		float oldNominal = nominal;
		boolean oldNominalESet = nominalESet;
		nominal = NOMINAL_EDEFAULT;
		nominalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DevicePackage.VDD__NOMINAL, oldNominal, NOMINAL_EDEFAULT, oldNominalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominal() {
		return nominalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevicePackage.VDD__RANGE:
				return basicUnsetRange(msgs);
			case DevicePackage.VDD__DFLTRANGE:
				return basicUnsetDfltrange(msgs);
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
			case DevicePackage.VDD__RANGE:
				return getRange();
			case DevicePackage.VDD__DFLTRANGE:
				return getDfltrange();
			case DevicePackage.VDD__NOMINAL:
				return getNominal();
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
			case DevicePackage.VDD__RANGE:
				setRange((FloatRange)newValue);
				return;
			case DevicePackage.VDD__DFLTRANGE:
				setDfltrange((FloatRange)newValue);
				return;
			case DevicePackage.VDD__NOMINAL:
				setNominal((Float)newValue);
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
			case DevicePackage.VDD__RANGE:
				unsetRange();
				return;
			case DevicePackage.VDD__DFLTRANGE:
				unsetDfltrange();
				return;
			case DevicePackage.VDD__NOMINAL:
				unsetNominal();
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
			case DevicePackage.VDD__RANGE:
				return isSetRange();
			case DevicePackage.VDD__DFLTRANGE:
				return isSetDfltrange();
			case DevicePackage.VDD__NOMINAL:
				return isSetNominal();
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
		result.append(" (nominal: ");
		if (nominalESet) result.append(nominal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VddImpl

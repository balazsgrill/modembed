/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.PowerType;
import crownking.edc.VDDType;
import crownking.edc.VPPType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.PowerTypeImpl#getVPP <em>VPP</em>}</li>
 *   <li>{@link crownking.edc.impl.PowerTypeImpl#getVDD <em>VDD</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PowerTypeImpl extends EObjectImpl implements PowerType {
	/**
	 * The cached value of the '{@link #getVPP() <em>VPP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVPP()
	 * @generated
	 * @ordered
	 */
	protected VPPType vPP;

	/**
	 * The cached value of the '{@link #getVDD() <em>VDD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVDD()
	 * @generated
	 * @ordered
	 */
	protected VDDType vDD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getPowerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPPType getVPP() {
		return vPP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVPP(VPPType newVPP, NotificationChain msgs) {
		VPPType oldVPP = vPP;
		vPP = newVPP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.POWER_TYPE__VPP, oldVPP, newVPP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVPP(VPPType newVPP) {
		if (newVPP != vPP) {
			NotificationChain msgs = null;
			if (vPP != null)
				msgs = ((InternalEObject)vPP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.POWER_TYPE__VPP, null, msgs);
			if (newVPP != null)
				msgs = ((InternalEObject)newVPP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.POWER_TYPE__VPP, null, msgs);
			msgs = basicSetVPP(newVPP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.POWER_TYPE__VPP, newVPP, newVPP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDDType getVDD() {
		return vDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVDD(VDDType newVDD, NotificationChain msgs) {
		VDDType oldVDD = vDD;
		vDD = newVDD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.POWER_TYPE__VDD, oldVDD, newVDD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVDD(VDDType newVDD) {
		if (newVDD != vDD) {
			NotificationChain msgs = null;
			if (vDD != null)
				msgs = ((InternalEObject)vDD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.POWER_TYPE__VDD, null, msgs);
			if (newVDD != null)
				msgs = ((InternalEObject)newVDD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.POWER_TYPE__VDD, null, msgs);
			msgs = basicSetVDD(newVDD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.POWER_TYPE__VDD, newVDD, newVDD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.POWER_TYPE__VPP:
				return basicSetVPP(null, msgs);
			case EdcPackage.POWER_TYPE__VDD:
				return basicSetVDD(null, msgs);
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
			case EdcPackage.POWER_TYPE__VPP:
				return getVPP();
			case EdcPackage.POWER_TYPE__VDD:
				return getVDD();
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
			case EdcPackage.POWER_TYPE__VPP:
				setVPP((VPPType)newValue);
				return;
			case EdcPackage.POWER_TYPE__VDD:
				setVDD((VDDType)newValue);
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
			case EdcPackage.POWER_TYPE__VPP:
				setVPP((VPPType)null);
				return;
			case EdcPackage.POWER_TYPE__VDD:
				setVDD((VDDType)null);
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
			case EdcPackage.POWER_TYPE__VPP:
				return vPP != null;
			case EdcPackage.POWER_TYPE__VDD:
				return vDD != null;
		}
		return super.eIsSet(featureID);
	}

} //PowerTypeImpl

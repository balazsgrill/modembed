/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.DCRModeListType;
import crownking.edc.DCRModeType;
import crownking.edc.EdcPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DCR Mode List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DCRModeListTypeImpl#getDCRMode <em>DCR Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCRModeListTypeImpl extends EObjectImpl implements DCRModeListType {
	/**
	 * The cached value of the '{@link #getDCRMode() <em>DCR Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCRMode()
	 * @generated
	 * @ordered
	 */
	protected DCRModeType dCRMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DCRModeListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDCRModeListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCRModeType getDCRMode() {
		return dCRMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDCRMode(DCRModeType newDCRMode, NotificationChain msgs) {
		DCRModeType oldDCRMode = dCRMode;
		dCRMode = newDCRMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE, oldDCRMode, newDCRMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDCRMode(DCRModeType newDCRMode) {
		if (newDCRMode != dCRMode) {
			NotificationChain msgs = null;
			if (dCRMode != null)
				msgs = ((InternalEObject)dCRMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE, null, msgs);
			if (newDCRMode != null)
				msgs = ((InternalEObject)newDCRMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE, null, msgs);
			msgs = basicSetDCRMode(newDCRMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE, newDCRMode, newDCRMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE:
				return basicSetDCRMode(null, msgs);
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
			case EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE:
				return getDCRMode();
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
			case EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE:
				setDCRMode((DCRModeType)newValue);
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
			case EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE:
				setDCRMode((DCRModeType)null);
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
			case EdcPackage.DCR_MODE_LIST_TYPE__DCR_MODE:
				return dCRMode != null;
		}
		return super.eIsSet(featureID);
	}

} //DCRModeListTypeImpl

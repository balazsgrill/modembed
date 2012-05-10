/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.SFRDefType;
import crownking.edc.SelectSFRType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select SFR Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.SelectSFRTypeImpl#getSFRDef <em>SFR Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectSFRTypeImpl extends EObjectImpl implements SelectSFRType {
	/**
	 * The cached value of the '{@link #getSFRDef() <em>SFR Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFRDef()
	 * @generated
	 * @ordered
	 */
	protected SFRDefType sFRDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectSFRTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getSelectSFRType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFRDefType getSFRDef() {
		return sFRDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFRDef(SFRDefType newSFRDef, NotificationChain msgs) {
		SFRDefType oldSFRDef = sFRDef;
		sFRDef = newSFRDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.SELECT_SFR_TYPE__SFR_DEF, oldSFRDef, newSFRDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFRDef(SFRDefType newSFRDef) {
		if (newSFRDef != sFRDef) {
			NotificationChain msgs = null;
			if (sFRDef != null)
				msgs = ((InternalEObject)sFRDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.SELECT_SFR_TYPE__SFR_DEF, null, msgs);
			if (newSFRDef != null)
				msgs = ((InternalEObject)newSFRDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.SELECT_SFR_TYPE__SFR_DEF, null, msgs);
			msgs = basicSetSFRDef(newSFRDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SELECT_SFR_TYPE__SFR_DEF, newSFRDef, newSFRDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.SELECT_SFR_TYPE__SFR_DEF:
				return basicSetSFRDef(null, msgs);
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
			case EdcPackage.SELECT_SFR_TYPE__SFR_DEF:
				return getSFRDef();
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
			case EdcPackage.SELECT_SFR_TYPE__SFR_DEF:
				setSFRDef((SFRDefType)newValue);
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
			case EdcPackage.SELECT_SFR_TYPE__SFR_DEF:
				setSFRDef((SFRDefType)null);
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
			case EdcPackage.SELECT_SFR_TYPE__SFR_DEF:
				return sFRDef != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectSFRTypeImpl

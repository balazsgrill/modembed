/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.ModuleRefType;
import crownking.edc.NMMRPlaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NMMR Place Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.NMMRPlaceTypeImpl#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link crownking.edc.impl.NMMRPlaceTypeImpl#getRegionid <em>Regionid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NMMRPlaceTypeImpl extends EObjectImpl implements NMMRPlaceType {
	/**
	 * The cached value of the '{@link #getModuleRef() <em>Module Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleRef()
	 * @generated
	 * @ordered
	 */
	protected ModuleRefType moduleRef;

	/**
	 * The default value of the '{@link #getRegionid() <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionid()
	 * @generated
	 * @ordered
	 */
	protected static final String REGIONID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionid() <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionid()
	 * @generated
	 * @ordered
	 */
	protected String regionid = REGIONID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NMMRPlaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getNMMRPlaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRefType getModuleRef() {
		return moduleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleRef(ModuleRefType newModuleRef, NotificationChain msgs) {
		ModuleRefType oldModuleRef = moduleRef;
		moduleRef = newModuleRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdcPackage.NMMR_PLACE_TYPE__MODULE_REF, oldModuleRef, newModuleRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleRef(ModuleRefType newModuleRef) {
		if (newModuleRef != moduleRef) {
			NotificationChain msgs = null;
			if (moduleRef != null)
				msgs = ((InternalEObject)moduleRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdcPackage.NMMR_PLACE_TYPE__MODULE_REF, null, msgs);
			if (newModuleRef != null)
				msgs = ((InternalEObject)newModuleRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdcPackage.NMMR_PLACE_TYPE__MODULE_REF, null, msgs);
			msgs = basicSetModuleRef(newModuleRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.NMMR_PLACE_TYPE__MODULE_REF, newModuleRef, newModuleRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionid() {
		return regionid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionid(String newRegionid) {
		String oldRegionid = regionid;
		regionid = newRegionid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.NMMR_PLACE_TYPE__REGIONID, oldRegionid, regionid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.NMMR_PLACE_TYPE__MODULE_REF:
				return basicSetModuleRef(null, msgs);
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
			case EdcPackage.NMMR_PLACE_TYPE__MODULE_REF:
				return getModuleRef();
			case EdcPackage.NMMR_PLACE_TYPE__REGIONID:
				return getRegionid();
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
			case EdcPackage.NMMR_PLACE_TYPE__MODULE_REF:
				setModuleRef((ModuleRefType)newValue);
				return;
			case EdcPackage.NMMR_PLACE_TYPE__REGIONID:
				setRegionid((String)newValue);
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
			case EdcPackage.NMMR_PLACE_TYPE__MODULE_REF:
				setModuleRef((ModuleRefType)null);
				return;
			case EdcPackage.NMMR_PLACE_TYPE__REGIONID:
				setRegionid(REGIONID_EDEFAULT);
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
			case EdcPackage.NMMR_PLACE_TYPE__MODULE_REF:
				return moduleRef != null;
			case EdcPackage.NMMR_PLACE_TYPE__REGIONID:
				return REGIONID_EDEFAULT == null ? regionid != null : !REGIONID_EDEFAULT.equals(regionid);
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
		result.append(" (regionid: ");
		result.append(regionid);
		result.append(')');
		return result.toString();
	}

} //NMMRPlaceTypeImpl

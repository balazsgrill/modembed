/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.SFRModeListType;
import crownking.edc.SFRModeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SFR Mode List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.SFRModeListTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeListTypeImpl#getSFRMode <em>SFR Mode</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeListTypeImpl#getStimpcfiles <em>Stimpcfiles</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeListTypeImpl#getStimregfiles <em>Stimregfiles</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeListTypeImpl#getStimscl <em>Stimscl</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRModeListTypeImpl#getStimtype <em>Stimtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SFRModeListTypeImpl extends EObjectImpl implements SFRModeListType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getStimpcfiles() <em>Stimpcfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimpcfiles()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMPCFILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimpcfiles() <em>Stimpcfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimpcfiles()
	 * @generated
	 * @ordered
	 */
	protected String stimpcfiles = STIMPCFILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimregfiles() <em>Stimregfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimregfiles()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMREGFILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimregfiles() <em>Stimregfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimregfiles()
	 * @generated
	 * @ordered
	 */
	protected String stimregfiles = STIMREGFILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimscl() <em>Stimscl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimscl()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMSCL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimscl() <em>Stimscl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimscl()
	 * @generated
	 * @ordered
	 */
	protected String stimscl = STIMSCL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStimtype() <em>Stimtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimtype()
	 * @generated
	 * @ordered
	 */
	protected static final String STIMTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStimtype() <em>Stimtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimtype()
	 * @generated
	 * @ordered
	 */
	protected String stimtype = STIMTYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SFRModeListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getSFRModeListType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.SFR_MODE_LIST_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRModeType> getSFRMode() {
		return getMixed().list(EdcPackage.eINSTANCE.getSFRModeListType_SFRMode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStimpcfiles() {
		return stimpcfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimpcfiles(String newStimpcfiles) {
		String oldStimpcfiles = stimpcfiles;
		stimpcfiles = newStimpcfiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_MODE_LIST_TYPE__STIMPCFILES, oldStimpcfiles, stimpcfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStimregfiles() {
		return stimregfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimregfiles(String newStimregfiles) {
		String oldStimregfiles = stimregfiles;
		stimregfiles = newStimregfiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_MODE_LIST_TYPE__STIMREGFILES, oldStimregfiles, stimregfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStimscl() {
		return stimscl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimscl(String newStimscl) {
		String oldStimscl = stimscl;
		stimscl = newStimscl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_MODE_LIST_TYPE__STIMSCL, oldStimscl, stimscl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStimtype() {
		return stimtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimtype(String newStimtype) {
		String oldStimtype = stimtype;
		stimtype = newStimtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_MODE_LIST_TYPE__STIMTYPE, oldStimtype, stimtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.SFR_MODE_LIST_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_MODE_LIST_TYPE__SFR_MODE:
				return ((InternalEList<?>)getSFRMode()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.SFR_MODE_LIST_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.SFR_MODE_LIST_TYPE__SFR_MODE:
				return getSFRMode();
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMPCFILES:
				return getStimpcfiles();
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMREGFILES:
				return getStimregfiles();
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMSCL:
				return getStimscl();
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMTYPE:
				return getStimtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdcPackage.SFR_MODE_LIST_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__SFR_MODE:
				getSFRMode().clear();
				getSFRMode().addAll((Collection<? extends SFRModeType>)newValue);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMPCFILES:
				setStimpcfiles((String)newValue);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMREGFILES:
				setStimregfiles((String)newValue);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMSCL:
				setStimscl((String)newValue);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMTYPE:
				setStimtype((String)newValue);
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
			case EdcPackage.SFR_MODE_LIST_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__SFR_MODE:
				getSFRMode().clear();
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMPCFILES:
				setStimpcfiles(STIMPCFILES_EDEFAULT);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMREGFILES:
				setStimregfiles(STIMREGFILES_EDEFAULT);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMSCL:
				setStimscl(STIMSCL_EDEFAULT);
				return;
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMTYPE:
				setStimtype(STIMTYPE_EDEFAULT);
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
			case EdcPackage.SFR_MODE_LIST_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.SFR_MODE_LIST_TYPE__SFR_MODE:
				return !getSFRMode().isEmpty();
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMPCFILES:
				return STIMPCFILES_EDEFAULT == null ? stimpcfiles != null : !STIMPCFILES_EDEFAULT.equals(stimpcfiles);
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMREGFILES:
				return STIMREGFILES_EDEFAULT == null ? stimregfiles != null : !STIMREGFILES_EDEFAULT.equals(stimregfiles);
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMSCL:
				return STIMSCL_EDEFAULT == null ? stimscl != null : !STIMSCL_EDEFAULT.equals(stimscl);
			case EdcPackage.SFR_MODE_LIST_TYPE__STIMTYPE:
				return STIMTYPE_EDEFAULT == null ? stimtype != null : !STIMTYPE_EDEFAULT.equals(stimtype);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", stimpcfiles: ");
		result.append(stimpcfiles);
		result.append(", stimregfiles: ");
		result.append(stimregfiles);
		result.append(", stimscl: ");
		result.append(stimscl);
		result.append(", stimtype: ");
		result.append(stimtype);
		result.append(')');
		return result.toString();
	}

} //SFRModeListTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.StimInfoType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stim Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.StimInfoTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.StimInfoTypeImpl#getStimpcfiles <em>Stimpcfiles</em>}</li>
 *   <li>{@link crownking.edc.impl.StimInfoTypeImpl#getStimregfiles <em>Stimregfiles</em>}</li>
 *   <li>{@link crownking.edc.impl.StimInfoTypeImpl#getStimscl <em>Stimscl</em>}</li>
 *   <li>{@link crownking.edc.impl.StimInfoTypeImpl#getStimtype <em>Stimtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StimInfoTypeImpl extends EObjectImpl implements StimInfoType {
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
	protected StimInfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getStimInfoType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.STIM_INFO_TYPE__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.STIM_INFO_TYPE__STIMPCFILES, oldStimpcfiles, stimpcfiles));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.STIM_INFO_TYPE__STIMREGFILES, oldStimregfiles, stimregfiles));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.STIM_INFO_TYPE__STIMSCL, oldStimscl, stimscl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.STIM_INFO_TYPE__STIMTYPE, oldStimtype, stimtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.STIM_INFO_TYPE__VALUE:
				return getValue();
			case EdcPackage.STIM_INFO_TYPE__STIMPCFILES:
				return getStimpcfiles();
			case EdcPackage.STIM_INFO_TYPE__STIMREGFILES:
				return getStimregfiles();
			case EdcPackage.STIM_INFO_TYPE__STIMSCL:
				return getStimscl();
			case EdcPackage.STIM_INFO_TYPE__STIMTYPE:
				return getStimtype();
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
			case EdcPackage.STIM_INFO_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMPCFILES:
				setStimpcfiles((String)newValue);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMREGFILES:
				setStimregfiles((String)newValue);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMSCL:
				setStimscl((String)newValue);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMTYPE:
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
			case EdcPackage.STIM_INFO_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMPCFILES:
				setStimpcfiles(STIMPCFILES_EDEFAULT);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMREGFILES:
				setStimregfiles(STIMREGFILES_EDEFAULT);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMSCL:
				setStimscl(STIMSCL_EDEFAULT);
				return;
			case EdcPackage.STIM_INFO_TYPE__STIMTYPE:
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
			case EdcPackage.STIM_INFO_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.STIM_INFO_TYPE__STIMPCFILES:
				return STIMPCFILES_EDEFAULT == null ? stimpcfiles != null : !STIMPCFILES_EDEFAULT.equals(stimpcfiles);
			case EdcPackage.STIM_INFO_TYPE__STIMREGFILES:
				return STIMREGFILES_EDEFAULT == null ? stimregfiles != null : !STIMREGFILES_EDEFAULT.equals(stimregfiles);
			case EdcPackage.STIM_INFO_TYPE__STIMSCL:
				return STIMSCL_EDEFAULT == null ? stimscl != null : !STIMSCL_EDEFAULT.equals(stimscl);
			case EdcPackage.STIM_INFO_TYPE__STIMTYPE:
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
		result.append(" (value: ");
		result.append(value);
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

} //StimInfoTypeImpl

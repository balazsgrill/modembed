/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.DEVIDToRevType;
import crownking.edc.DeviceIDSectorType;
import crownking.edc.EdcPackage;

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
 * An implementation of the model object '<em><b>Device ID Sector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getDEVIDToRev <em>DEVID To Rev</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getIssection <em>Issection</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getRegionid <em>Regionid</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getSectiondesc <em>Sectiondesc</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getSectionname <em>Sectionname</em>}</li>
 *   <li>{@link crownking.edc.impl.DeviceIDSectorTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceIDSectorTypeImpl extends EObjectImpl implements DeviceIDSectorType {
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
	 * The default value of the '{@link #getBeginaddr() <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginaddr()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGINADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginaddr() <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginaddr()
	 * @generated
	 * @ordered
	 */
	protected String beginaddr = BEGINADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndaddr() <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndaddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndaddr() <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndaddr()
	 * @generated
	 * @ordered
	 */
	protected String endaddr = ENDADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssection() <em>Issection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssection()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssection() <em>Issection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssection()
	 * @generated
	 * @ordered
	 */
	protected String issection = ISSECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String mask = MASK_EDEFAULT;

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
	 * The default value of the '{@link #getSectiondesc() <em>Sectiondesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectiondesc()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTIONDESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectiondesc() <em>Sectiondesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectiondesc()
	 * @generated
	 * @ordered
	 */
	protected String sectiondesc = SECTIONDESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionname() <em>Sectionname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionname()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTIONNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionname() <em>Sectionname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionname()
	 * @generated
	 * @ordered
	 */
	protected String sectionname = SECTIONNAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceIDSectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDeviceIDSectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.DEVICE_ID_SECTOR_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DEVIDToRevType> getDEVIDToRev() {
		return getMixed().list(EdcPackage.eINSTANCE.getDeviceIDSectorType_DEVIDToRev());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeginaddr() {
		return beginaddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginaddr(String newBeginaddr) {
		String oldBeginaddr = beginaddr;
		beginaddr = newBeginaddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__BEGINADDR, oldBeginaddr, beginaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndaddr() {
		return endaddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndaddr(String newEndaddr) {
		String oldEndaddr = endaddr;
		endaddr = newEndaddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__ENDADDR, oldEndaddr, endaddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssection() {
		return issection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssection(String newIssection) {
		String oldIssection = issection;
		issection = newIssection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__ISSECTION, oldIssection, issection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(String newMask) {
		String oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__MASK, oldMask, mask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__REGIONID, oldRegionid, regionid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectiondesc() {
		return sectiondesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectiondesc(String newSectiondesc) {
		String oldSectiondesc = sectiondesc;
		sectiondesc = newSectiondesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONDESC, oldSectiondesc, sectiondesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionname() {
		return sectionname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionname(String newSectionname) {
		String oldSectionname = sectionname;
		sectionname = newSectionname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONNAME, oldSectionname, sectionname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DEVICE_ID_SECTOR_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__DEVID_TO_REV:
				return ((InternalEList<?>)getDEVIDToRev()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__DEVID_TO_REV:
				return getDEVIDToRev();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__BEGINADDR:
				return getBeginaddr();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ENDADDR:
				return getEndaddr();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ISSECTION:
				return getIssection();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MASK:
				return getMask();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__REGIONID:
				return getRegionid();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONDESC:
				return getSectiondesc();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONNAME:
				return getSectionname();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__VALUE:
				return getValue();
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
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__DEVID_TO_REV:
				getDEVIDToRev().clear();
				getDEVIDToRev().addAll((Collection<? extends DEVIDToRevType>)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__BEGINADDR:
				setBeginaddr((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ENDADDR:
				setEndaddr((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ISSECTION:
				setIssection((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MASK:
				setMask((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__REGIONID:
				setRegionid((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONDESC:
				setSectiondesc((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONNAME:
				setSectionname((String)newValue);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__VALUE:
				setValue((String)newValue);
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
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__DEVID_TO_REV:
				getDEVIDToRev().clear();
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__BEGINADDR:
				setBeginaddr(BEGINADDR_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ISSECTION:
				setIssection(ISSECTION_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__REGIONID:
				setRegionid(REGIONID_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONDESC:
				setSectiondesc(SECTIONDESC_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONNAME:
				setSectionname(SECTIONNAME_EDEFAULT);
				return;
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__DEVID_TO_REV:
				return !getDEVIDToRev().isEmpty();
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__BEGINADDR:
				return BEGINADDR_EDEFAULT == null ? beginaddr != null : !BEGINADDR_EDEFAULT.equals(beginaddr);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__ISSECTION:
				return ISSECTION_EDEFAULT == null ? issection != null : !ISSECTION_EDEFAULT.equals(issection);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__REGIONID:
				return REGIONID_EDEFAULT == null ? regionid != null : !REGIONID_EDEFAULT.equals(regionid);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONDESC:
				return SECTIONDESC_EDEFAULT == null ? sectiondesc != null : !SECTIONDESC_EDEFAULT.equals(sectiondesc);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__SECTIONNAME:
				return SECTIONNAME_EDEFAULT == null ? sectionname != null : !SECTIONNAME_EDEFAULT.equals(sectionname);
			case EdcPackage.DEVICE_ID_SECTOR_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(", beginaddr: ");
		result.append(beginaddr);
		result.append(", endaddr: ");
		result.append(endaddr);
		result.append(", issection: ");
		result.append(issection);
		result.append(", mask: ");
		result.append(mask);
		result.append(", regionid: ");
		result.append(regionid);
		result.append(", sectiondesc: ");
		result.append(sectiondesc);
		result.append(", sectionname: ");
		result.append(sectionname);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //DeviceIDSectorTypeImpl

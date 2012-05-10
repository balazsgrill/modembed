/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AdjustPointType;
import crownking.edc.DPRDataSectorType;
import crownking.edc.EdcPackage;
import crownking.edc.SFRDefType;

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
 * An implementation of the model object '<em><b>DPR Data Sector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getRegionid <em>Regionid</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getShadowidref <em>Shadowidref</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getShadowoffset <em>Shadowoffset</em>}</li>
 *   <li>{@link crownking.edc.impl.DPRDataSectorTypeImpl#getShadowoffset1 <em>Shadowoffset1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DPRDataSectorTypeImpl extends EObjectImpl implements DPRDataSectorType {
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
	 * The default value of the '{@link #getBank() <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected static final byte BANK_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected byte bank = BANK_EDEFAULT;

	/**
	 * This is true if the Bank attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bankESet;

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
	 * The default value of the '{@link #getShadowidref() <em>Shadowidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowidref()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOWIDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowidref() <em>Shadowidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowidref()
	 * @generated
	 * @ordered
	 */
	protected String shadowidref = SHADOWIDREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowoffset() <em>Shadowoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowoffset()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOWOFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShadowoffset() <em>Shadowoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowoffset()
	 * @generated
	 * @ordered
	 */
	protected String shadowoffset = SHADOWOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowoffset1() <em>Shadowoffset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowoffset1()
	 * @generated
	 * @ordered
	 */
	protected static final byte SHADOWOFFSET1_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getShadowoffset1() <em>Shadowoffset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowoffset1()
	 * @generated
	 * @ordered
	 */
	protected byte shadowoffset1 = SHADOWOFFSET1_EDEFAULT;

	/**
	 * This is true if the Shadowoffset1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shadowoffset1ESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPRDataSectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDPRDataSectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.DPR_DATA_SECTOR_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(EdcPackage.eINSTANCE.getDPRDataSectorType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRDefType> getSFRDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getDPRDataSectorType_SFRDef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjustPointType> getAdjustPoint() {
		return getGroup().list(EdcPackage.eINSTANCE.getDPRDataSectorType_AdjustPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(byte newBank) {
		byte oldBank = bank;
		bank = newBank;
		boolean oldBankESet = bankESet;
		bankESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__BANK, oldBank, bank, !oldBankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBank() {
		byte oldBank = bank;
		boolean oldBankESet = bankESet;
		bank = BANK_EDEFAULT;
		bankESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.DPR_DATA_SECTOR_TYPE__BANK, oldBank, BANK_EDEFAULT, oldBankESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBank() {
		return bankESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__BEGINADDR, oldBeginaddr, beginaddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__ENDADDR, oldEndaddr, endaddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__REGIONID, oldRegionid, regionid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadowidref() {
		return shadowidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowidref(String newShadowidref) {
		String oldShadowidref = shadowidref;
		shadowidref = newShadowidref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWIDREF, oldShadowidref, shadowidref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShadowoffset() {
		return shadowoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowoffset(String newShadowoffset) {
		String oldShadowoffset = shadowoffset;
		shadowoffset = newShadowoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET, oldShadowoffset, shadowoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getShadowoffset1() {
		return shadowoffset1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowoffset1(byte newShadowoffset1) {
		byte oldShadowoffset1 = shadowoffset1;
		shadowoffset1 = newShadowoffset1;
		boolean oldShadowoffset1ESet = shadowoffset1ESet;
		shadowoffset1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1, oldShadowoffset1, shadowoffset1, !oldShadowoffset1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShadowoffset1() {
		byte oldShadowoffset1 = shadowoffset1;
		boolean oldShadowoffset1ESet = shadowoffset1ESet;
		shadowoffset1 = SHADOWOFFSET1_EDEFAULT;
		shadowoffset1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1, oldShadowoffset1, SHADOWOFFSET1_EDEFAULT, oldShadowoffset1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShadowoffset1() {
		return shadowoffset1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DPR_DATA_SECTOR_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SFR_DEF:
				return ((InternalEList<?>)getSFRDef()).basicRemove(otherEnd, msgs);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ADJUST_POINT:
				return ((InternalEList<?>)getAdjustPoint()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.DPR_DATA_SECTOR_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SFR_DEF:
				return getSFRDef();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ADJUST_POINT:
				return getAdjustPoint();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BANK:
				return getBank();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BEGINADDR:
				return getBeginaddr();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ENDADDR:
				return getEndaddr();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__REGIONID:
				return getRegionid();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWIDREF:
				return getShadowidref();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET:
				return getShadowoffset();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1:
				return getShadowoffset1();
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
			case EdcPackage.DPR_DATA_SECTOR_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SFR_DEF:
				getSFRDef().clear();
				getSFRDef().addAll((Collection<? extends SFRDefType>)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				getAdjustPoint().addAll((Collection<? extends AdjustPointType>)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BANK:
				setBank((Byte)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BEGINADDR:
				setBeginaddr((String)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ENDADDR:
				setEndaddr((String)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__REGIONID:
				setRegionid((String)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWIDREF:
				setShadowidref((String)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET:
				setShadowoffset((String)newValue);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1:
				setShadowoffset1((Byte)newValue);
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
			case EdcPackage.DPR_DATA_SECTOR_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SFR_DEF:
				getSFRDef().clear();
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BANK:
				unsetBank();
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BEGINADDR:
				setBeginaddr(BEGINADDR_EDEFAULT);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__REGIONID:
				setRegionid(REGIONID_EDEFAULT);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWIDREF:
				setShadowidref(SHADOWIDREF_EDEFAULT);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET:
				setShadowoffset(SHADOWOFFSET_EDEFAULT);
				return;
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1:
				unsetShadowoffset1();
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
			case EdcPackage.DPR_DATA_SECTOR_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__GROUP:
				return !getGroup().isEmpty();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SFR_DEF:
				return !getSFRDef().isEmpty();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ADJUST_POINT:
				return !getAdjustPoint().isEmpty();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BANK:
				return isSetBank();
			case EdcPackage.DPR_DATA_SECTOR_TYPE__BEGINADDR:
				return BEGINADDR_EDEFAULT == null ? beginaddr != null : !BEGINADDR_EDEFAULT.equals(beginaddr);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__REGIONID:
				return REGIONID_EDEFAULT == null ? regionid != null : !REGIONID_EDEFAULT.equals(regionid);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWIDREF:
				return SHADOWIDREF_EDEFAULT == null ? shadowidref != null : !SHADOWIDREF_EDEFAULT.equals(shadowidref);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET:
				return SHADOWOFFSET_EDEFAULT == null ? shadowoffset != null : !SHADOWOFFSET_EDEFAULT.equals(shadowoffset);
			case EdcPackage.DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1:
				return isSetShadowoffset1();
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
		result.append(", bank: ");
		if (bankESet) result.append(bank); else result.append("<unset>");
		result.append(", beginaddr: ");
		result.append(beginaddr);
		result.append(", endaddr: ");
		result.append(endaddr);
		result.append(", regionid: ");
		result.append(regionid);
		result.append(", shadowidref: ");
		result.append(shadowidref);
		result.append(", shadowoffset: ");
		result.append(shadowoffset);
		result.append(", shadowoffset1: ");
		if (shadowoffset1ESet) result.append(shadowoffset1); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DPRDataSectorTypeImpl

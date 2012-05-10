/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AdjustPointType;
import crownking.edc.EdcPackage;
import crownking.edc.JoinedSFRDefType;
import crownking.edc.MirrorType;
import crownking.edc.ModuleRefType;
import crownking.edc.MuxedSFRDefType;
import crownking.edc.SFRDataSectorType;
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
 * An implementation of the model object '<em><b>SFR Data Sector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getJoinedSFRDef <em>Joined SFR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getMirror <em>Mirror</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getMuxedSFRDef <em>Muxed SFR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.impl.SFRDataSectorTypeImpl#getRegionid <em>Regionid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SFRDataSectorTypeImpl extends EObjectImpl implements SFRDataSectorType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SFRDataSectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getSFRDataSectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdcPackage.SFR_DATA_SECTOR_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRDefType> getSFRDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRDataSectorType_SFRDef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinedSFRDefType> getJoinedSFRDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRDataSectorType_JoinedSFRDef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdjustPointType> getAdjustPoint() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRDataSectorType_AdjustPoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MirrorType> getMirror() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRDataSectorType_Mirror());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleRefType> getModuleRef() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRDataSectorType_ModuleRef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MuxedSFRDefType> getMuxedSFRDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getSFRDataSectorType_MuxedSFRDef());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_DATA_SECTOR_TYPE__BANK, oldBank, bank, !oldBankESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.SFR_DATA_SECTOR_TYPE__BANK, oldBank, BANK_EDEFAULT, oldBankESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_DATA_SECTOR_TYPE__BEGINADDR, oldBeginaddr, beginaddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_DATA_SECTOR_TYPE__ENDADDR, oldEndaddr, endaddr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.SFR_DATA_SECTOR_TYPE__REGIONID, oldRegionid, regionid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.SFR_DATA_SECTOR_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__SFR_DEF:
				return ((InternalEList<?>)getSFRDef()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__JOINED_SFR_DEF:
				return ((InternalEList<?>)getJoinedSFRDef()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ADJUST_POINT:
				return ((InternalEList<?>)getAdjustPoint()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MIRROR:
				return ((InternalEList<?>)getMirror()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MODULE_REF:
				return ((InternalEList<?>)getModuleRef()).basicRemove(otherEnd, msgs);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MUXED_SFR_DEF:
				return ((InternalEList<?>)getMuxedSFRDef()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.SFR_DATA_SECTOR_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__SFR_DEF:
				return getSFRDef();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__JOINED_SFR_DEF:
				return getJoinedSFRDef();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ADJUST_POINT:
				return getAdjustPoint();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MIRROR:
				return getMirror();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MODULE_REF:
				return getModuleRef();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MUXED_SFR_DEF:
				return getMuxedSFRDef();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BANK:
				return getBank();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BEGINADDR:
				return getBeginaddr();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ENDADDR:
				return getEndaddr();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__REGIONID:
				return getRegionid();
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
			case EdcPackage.SFR_DATA_SECTOR_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__SFR_DEF:
				getSFRDef().clear();
				getSFRDef().addAll((Collection<? extends SFRDefType>)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__JOINED_SFR_DEF:
				getJoinedSFRDef().clear();
				getJoinedSFRDef().addAll((Collection<? extends JoinedSFRDefType>)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				getAdjustPoint().addAll((Collection<? extends AdjustPointType>)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MIRROR:
				getMirror().clear();
				getMirror().addAll((Collection<? extends MirrorType>)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MODULE_REF:
				getModuleRef().clear();
				getModuleRef().addAll((Collection<? extends ModuleRefType>)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MUXED_SFR_DEF:
				getMuxedSFRDef().clear();
				getMuxedSFRDef().addAll((Collection<? extends MuxedSFRDefType>)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BANK:
				setBank((Byte)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BEGINADDR:
				setBeginaddr((String)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ENDADDR:
				setEndaddr((String)newValue);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__REGIONID:
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
			case EdcPackage.SFR_DATA_SECTOR_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__SFR_DEF:
				getSFRDef().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__JOINED_SFR_DEF:
				getJoinedSFRDef().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ADJUST_POINT:
				getAdjustPoint().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MIRROR:
				getMirror().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MODULE_REF:
				getModuleRef().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MUXED_SFR_DEF:
				getMuxedSFRDef().clear();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BANK:
				unsetBank();
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BEGINADDR:
				setBeginaddr(BEGINADDR_EDEFAULT);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ENDADDR:
				setEndaddr(ENDADDR_EDEFAULT);
				return;
			case EdcPackage.SFR_DATA_SECTOR_TYPE__REGIONID:
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
			case EdcPackage.SFR_DATA_SECTOR_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__SFR_DEF:
				return !getSFRDef().isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__JOINED_SFR_DEF:
				return !getJoinedSFRDef().isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ADJUST_POINT:
				return !getAdjustPoint().isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MIRROR:
				return !getMirror().isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MODULE_REF:
				return !getModuleRef().isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__MUXED_SFR_DEF:
				return !getMuxedSFRDef().isEmpty();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BANK:
				return isSetBank();
			case EdcPackage.SFR_DATA_SECTOR_TYPE__BEGINADDR:
				return BEGINADDR_EDEFAULT == null ? beginaddr != null : !BEGINADDR_EDEFAULT.equals(beginaddr);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__ENDADDR:
				return ENDADDR_EDEFAULT == null ? endaddr != null : !ENDADDR_EDEFAULT.equals(endaddr);
			case EdcPackage.SFR_DATA_SECTOR_TYPE__REGIONID:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", bank: ");
		if (bankESet) result.append(bank); else result.append("<unset>");
		result.append(", beginaddr: ");
		result.append(beginaddr);
		result.append(", endaddr: ");
		result.append(endaddr);
		result.append(", regionid: ");
		result.append(regionid);
		result.append(')');
		return result.toString();
	}

} //SFRDataSectorTypeImpl

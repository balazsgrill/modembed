/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.LatchesType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latches Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.LatchesTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.LatchesTypeImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link crownking.edc.impl.LatchesTypeImpl#getEedata <em>Eedata</em>}</li>
 *   <li>{@link crownking.edc.impl.LatchesTypeImpl#getPgm <em>Pgm</em>}</li>
 *   <li>{@link crownking.edc.impl.LatchesTypeImpl#getRowerase <em>Rowerase</em>}</li>
 *   <li>{@link crownking.edc.impl.LatchesTypeImpl#getUserid <em>Userid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatchesTypeImpl extends EObjectImpl implements LatchesType {
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
	 * The default value of the '{@link #getCfg() <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected static final byte CFG_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getCfg() <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected byte cfg = CFG_EDEFAULT;

	/**
	 * This is true if the Cfg attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cfgESet;

	/**
	 * The default value of the '{@link #getEedata() <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEedata()
	 * @generated
	 * @ordered
	 */
	protected static final byte EEDATA_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getEedata() <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEedata()
	 * @generated
	 * @ordered
	 */
	protected byte eedata = EEDATA_EDEFAULT;

	/**
	 * This is true if the Eedata attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eedataESet;

	/**
	 * The default value of the '{@link #getPgm() <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgm()
	 * @generated
	 * @ordered
	 */
	protected static final byte PGM_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getPgm() <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgm()
	 * @generated
	 * @ordered
	 */
	protected byte pgm = PGM_EDEFAULT;

	/**
	 * This is true if the Pgm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pgmESet;

	/**
	 * The default value of the '{@link #getRowerase() <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowerase()
	 * @generated
	 * @ordered
	 */
	protected static final byte ROWERASE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getRowerase() <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowerase()
	 * @generated
	 * @ordered
	 */
	protected byte rowerase = ROWERASE_EDEFAULT;

	/**
	 * This is true if the Rowerase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roweraseESet;

	/**
	 * The default value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected static final byte USERID_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected byte userid = USERID_EDEFAULT;

	/**
	 * This is true if the Userid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useridESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatchesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getLatchesType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.LATCHES_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCfg() {
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfg(byte newCfg) {
		byte oldCfg = cfg;
		cfg = newCfg;
		boolean oldCfgESet = cfgESet;
		cfgESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.LATCHES_TYPE__CFG, oldCfg, cfg, !oldCfgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCfg() {
		byte oldCfg = cfg;
		boolean oldCfgESet = cfgESet;
		cfg = CFG_EDEFAULT;
		cfgESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.LATCHES_TYPE__CFG, oldCfg, CFG_EDEFAULT, oldCfgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCfg() {
		return cfgESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEedata() {
		return eedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEedata(byte newEedata) {
		byte oldEedata = eedata;
		eedata = newEedata;
		boolean oldEedataESet = eedataESet;
		eedataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.LATCHES_TYPE__EEDATA, oldEedata, eedata, !oldEedataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEedata() {
		byte oldEedata = eedata;
		boolean oldEedataESet = eedataESet;
		eedata = EEDATA_EDEFAULT;
		eedataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.LATCHES_TYPE__EEDATA, oldEedata, EEDATA_EDEFAULT, oldEedataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEedata() {
		return eedataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPgm() {
		return pgm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgm(byte newPgm) {
		byte oldPgm = pgm;
		pgm = newPgm;
		boolean oldPgmESet = pgmESet;
		pgmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.LATCHES_TYPE__PGM, oldPgm, pgm, !oldPgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPgm() {
		byte oldPgm = pgm;
		boolean oldPgmESet = pgmESet;
		pgm = PGM_EDEFAULT;
		pgmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.LATCHES_TYPE__PGM, oldPgm, PGM_EDEFAULT, oldPgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPgm() {
		return pgmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getRowerase() {
		return rowerase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowerase(byte newRowerase) {
		byte oldRowerase = rowerase;
		rowerase = newRowerase;
		boolean oldRoweraseESet = roweraseESet;
		roweraseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.LATCHES_TYPE__ROWERASE, oldRowerase, rowerase, !oldRoweraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRowerase() {
		byte oldRowerase = rowerase;
		boolean oldRoweraseESet = roweraseESet;
		rowerase = ROWERASE_EDEFAULT;
		roweraseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.LATCHES_TYPE__ROWERASE, oldRowerase, ROWERASE_EDEFAULT, oldRoweraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRowerase() {
		return roweraseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getUserid() {
		return userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserid(byte newUserid) {
		byte oldUserid = userid;
		userid = newUserid;
		boolean oldUseridESet = useridESet;
		useridESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.LATCHES_TYPE__USERID, oldUserid, userid, !oldUseridESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserid() {
		byte oldUserid = userid;
		boolean oldUseridESet = useridESet;
		userid = USERID_EDEFAULT;
		useridESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.LATCHES_TYPE__USERID, oldUserid, USERID_EDEFAULT, oldUseridESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserid() {
		return useridESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.LATCHES_TYPE__VALUE:
				return getValue();
			case EdcPackage.LATCHES_TYPE__CFG:
				return getCfg();
			case EdcPackage.LATCHES_TYPE__EEDATA:
				return getEedata();
			case EdcPackage.LATCHES_TYPE__PGM:
				return getPgm();
			case EdcPackage.LATCHES_TYPE__ROWERASE:
				return getRowerase();
			case EdcPackage.LATCHES_TYPE__USERID:
				return getUserid();
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
			case EdcPackage.LATCHES_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.LATCHES_TYPE__CFG:
				setCfg((Byte)newValue);
				return;
			case EdcPackage.LATCHES_TYPE__EEDATA:
				setEedata((Byte)newValue);
				return;
			case EdcPackage.LATCHES_TYPE__PGM:
				setPgm((Byte)newValue);
				return;
			case EdcPackage.LATCHES_TYPE__ROWERASE:
				setRowerase((Byte)newValue);
				return;
			case EdcPackage.LATCHES_TYPE__USERID:
				setUserid((Byte)newValue);
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
			case EdcPackage.LATCHES_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.LATCHES_TYPE__CFG:
				unsetCfg();
				return;
			case EdcPackage.LATCHES_TYPE__EEDATA:
				unsetEedata();
				return;
			case EdcPackage.LATCHES_TYPE__PGM:
				unsetPgm();
				return;
			case EdcPackage.LATCHES_TYPE__ROWERASE:
				unsetRowerase();
				return;
			case EdcPackage.LATCHES_TYPE__USERID:
				unsetUserid();
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
			case EdcPackage.LATCHES_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.LATCHES_TYPE__CFG:
				return isSetCfg();
			case EdcPackage.LATCHES_TYPE__EEDATA:
				return isSetEedata();
			case EdcPackage.LATCHES_TYPE__PGM:
				return isSetPgm();
			case EdcPackage.LATCHES_TYPE__ROWERASE:
				return isSetRowerase();
			case EdcPackage.LATCHES_TYPE__USERID:
				return isSetUserid();
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
		result.append(", cfg: ");
		if (cfgESet) result.append(cfg); else result.append("<unset>");
		result.append(", eedata: ");
		if (eedataESet) result.append(eedata); else result.append("<unset>");
		result.append(", pgm: ");
		if (pgmESet) result.append(pgm); else result.append("<unset>");
		result.append(", rowerase: ");
		if (roweraseESet) result.append(rowerase); else result.append("<unset>");
		result.append(", userid: ");
		if (useridESet) result.append(userid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LatchesTypeImpl

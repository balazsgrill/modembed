/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.Latches;
import microchip.device.memory.MemoryPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Latches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.LatchesImpl#getPgm <em>Pgm</em>}</li>
 *   <li>{@link microchip.device.memory.impl.LatchesImpl#getEedata <em>Eedata</em>}</li>
 *   <li>{@link microchip.device.memory.impl.LatchesImpl#getUserid <em>Userid</em>}</li>
 *   <li>{@link microchip.device.memory.impl.LatchesImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link microchip.device.memory.impl.LatchesImpl#getRowerase <em>Rowerase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatchesImpl extends EObjectImpl implements Latches {
	/**
	 * The default value of the '{@link #getPgm() <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgm()
	 * @generated
	 * @ordered
	 */
	protected static final int PGM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPgm() <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgm()
	 * @generated
	 * @ordered
	 */
	protected int pgm = PGM_EDEFAULT;

	/**
	 * This is true if the Pgm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pgmESet;

	/**
	 * The default value of the '{@link #getEedata() <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEedata()
	 * @generated
	 * @ordered
	 */
	protected static final int EEDATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEedata() <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEedata()
	 * @generated
	 * @ordered
	 */
	protected int eedata = EEDATA_EDEFAULT;

	/**
	 * This is true if the Eedata attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eedataESet;

	/**
	 * The default value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected static final int USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected int userid = USERID_EDEFAULT;

	/**
	 * This is true if the Userid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useridESet;

	/**
	 * The default value of the '{@link #getCfg() <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected static final int CFG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCfg() <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected int cfg = CFG_EDEFAULT;

	/**
	 * This is true if the Cfg attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cfgESet;

	/**
	 * The default value of the '{@link #getRowerase() <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowerase()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWERASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowerase() <em>Rowerase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowerase()
	 * @generated
	 * @ordered
	 */
	protected int rowerase = ROWERASE_EDEFAULT;

	/**
	 * This is true if the Rowerase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean roweraseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.LATCHES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPgm() {
		return pgm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgm(int newPgm) {
		int oldPgm = pgm;
		pgm = newPgm;
		boolean oldPgmESet = pgmESet;
		pgmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.LATCHES__PGM, oldPgm, pgm, !oldPgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPgm() {
		int oldPgm = pgm;
		boolean oldPgmESet = pgmESet;
		pgm = PGM_EDEFAULT;
		pgmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.LATCHES__PGM, oldPgm, PGM_EDEFAULT, oldPgmESet));
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
	public int getEedata() {
		return eedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEedata(int newEedata) {
		int oldEedata = eedata;
		eedata = newEedata;
		boolean oldEedataESet = eedataESet;
		eedataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.LATCHES__EEDATA, oldEedata, eedata, !oldEedataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEedata() {
		int oldEedata = eedata;
		boolean oldEedataESet = eedataESet;
		eedata = EEDATA_EDEFAULT;
		eedataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.LATCHES__EEDATA, oldEedata, EEDATA_EDEFAULT, oldEedataESet));
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
	public int getUserid() {
		return userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserid(int newUserid) {
		int oldUserid = userid;
		userid = newUserid;
		boolean oldUseridESet = useridESet;
		useridESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.LATCHES__USERID, oldUserid, userid, !oldUseridESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserid() {
		int oldUserid = userid;
		boolean oldUseridESet = useridESet;
		userid = USERID_EDEFAULT;
		useridESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.LATCHES__USERID, oldUserid, USERID_EDEFAULT, oldUseridESet));
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
	public int getCfg() {
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfg(int newCfg) {
		int oldCfg = cfg;
		cfg = newCfg;
		boolean oldCfgESet = cfgESet;
		cfgESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.LATCHES__CFG, oldCfg, cfg, !oldCfgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCfg() {
		int oldCfg = cfg;
		boolean oldCfgESet = cfgESet;
		cfg = CFG_EDEFAULT;
		cfgESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.LATCHES__CFG, oldCfg, CFG_EDEFAULT, oldCfgESet));
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
	public int getRowerase() {
		return rowerase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowerase(int newRowerase) {
		int oldRowerase = rowerase;
		rowerase = newRowerase;
		boolean oldRoweraseESet = roweraseESet;
		roweraseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.LATCHES__ROWERASE, oldRowerase, rowerase, !oldRoweraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRowerase() {
		int oldRowerase = rowerase;
		boolean oldRoweraseESet = roweraseESet;
		rowerase = ROWERASE_EDEFAULT;
		roweraseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.LATCHES__ROWERASE, oldRowerase, ROWERASE_EDEFAULT, oldRoweraseESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MemoryPackage.LATCHES__PGM:
				return getPgm();
			case MemoryPackage.LATCHES__EEDATA:
				return getEedata();
			case MemoryPackage.LATCHES__USERID:
				return getUserid();
			case MemoryPackage.LATCHES__CFG:
				return getCfg();
			case MemoryPackage.LATCHES__ROWERASE:
				return getRowerase();
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
			case MemoryPackage.LATCHES__PGM:
				setPgm((Integer)newValue);
				return;
			case MemoryPackage.LATCHES__EEDATA:
				setEedata((Integer)newValue);
				return;
			case MemoryPackage.LATCHES__USERID:
				setUserid((Integer)newValue);
				return;
			case MemoryPackage.LATCHES__CFG:
				setCfg((Integer)newValue);
				return;
			case MemoryPackage.LATCHES__ROWERASE:
				setRowerase((Integer)newValue);
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
			case MemoryPackage.LATCHES__PGM:
				unsetPgm();
				return;
			case MemoryPackage.LATCHES__EEDATA:
				unsetEedata();
				return;
			case MemoryPackage.LATCHES__USERID:
				unsetUserid();
				return;
			case MemoryPackage.LATCHES__CFG:
				unsetCfg();
				return;
			case MemoryPackage.LATCHES__ROWERASE:
				unsetRowerase();
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
			case MemoryPackage.LATCHES__PGM:
				return isSetPgm();
			case MemoryPackage.LATCHES__EEDATA:
				return isSetEedata();
			case MemoryPackage.LATCHES__USERID:
				return isSetUserid();
			case MemoryPackage.LATCHES__CFG:
				return isSetCfg();
			case MemoryPackage.LATCHES__ROWERASE:
				return isSetRowerase();
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
		result.append(" (pgm: ");
		if (pgmESet) result.append(pgm); else result.append("<unset>");
		result.append(", eedata: ");
		if (eedataESet) result.append(eedata); else result.append("<unset>");
		result.append(", userid: ");
		if (useridESet) result.append(userid); else result.append("<unset>");
		result.append(", cfg: ");
		if (cfgESet) result.append(cfg); else result.append("<unset>");
		result.append(", rowerase: ");
		if (roweraseESet) result.append(rowerase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LatchesImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.MemoryPackage;
import microchip.device.memory.Wait;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getPgm <em>Pgm</em>}</li>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getLvpgm <em>Lvpgm</em>}</li>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getEedata <em>Eedata</em>}</li>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getUserid <em>Userid</em>}</li>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getErase <em>Erase</em>}</li>
 *   <li>{@link microchip.device.memory.impl.WaitImpl#getLverase <em>Lverase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaitImpl extends EObjectImpl implements Wait {
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
	 * The default value of the '{@link #getLvpgm() <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvpgm()
	 * @generated
	 * @ordered
	 */
	protected static final int LVPGM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLvpgm() <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvpgm()
	 * @generated
	 * @ordered
	 */
	protected int lvpgm = LVPGM_EDEFAULT;

	/**
	 * This is true if the Lvpgm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lvpgmESet;

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
	 * The default value of the '{@link #getErase() <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErase()
	 * @generated
	 * @ordered
	 */
	protected static final int ERASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErase() <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErase()
	 * @generated
	 * @ordered
	 */
	protected int erase = ERASE_EDEFAULT;

	/**
	 * This is true if the Erase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eraseESet;

	/**
	 * The default value of the '{@link #getLverase() <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLverase()
	 * @generated
	 * @ordered
	 */
	protected static final int LVERASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLverase() <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLverase()
	 * @generated
	 * @ordered
	 */
	protected int lverase = LVERASE_EDEFAULT;

	/**
	 * This is true if the Lverase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lveraseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.WAIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__PGM, oldPgm, pgm, !oldPgmESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__PGM, oldPgm, PGM_EDEFAULT, oldPgmESet));
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
	public int getLvpgm() {
		return lvpgm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLvpgm(int newLvpgm) {
		int oldLvpgm = lvpgm;
		lvpgm = newLvpgm;
		boolean oldLvpgmESet = lvpgmESet;
		lvpgmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__LVPGM, oldLvpgm, lvpgm, !oldLvpgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLvpgm() {
		int oldLvpgm = lvpgm;
		boolean oldLvpgmESet = lvpgmESet;
		lvpgm = LVPGM_EDEFAULT;
		lvpgmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__LVPGM, oldLvpgm, LVPGM_EDEFAULT, oldLvpgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLvpgm() {
		return lvpgmESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__EEDATA, oldEedata, eedata, !oldEedataESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__EEDATA, oldEedata, EEDATA_EDEFAULT, oldEedataESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__CFG, oldCfg, cfg, !oldCfgESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__CFG, oldCfg, CFG_EDEFAULT, oldCfgESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__USERID, oldUserid, userid, !oldUseridESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__USERID, oldUserid, USERID_EDEFAULT, oldUseridESet));
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
	public int getErase() {
		return erase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErase(int newErase) {
		int oldErase = erase;
		erase = newErase;
		boolean oldEraseESet = eraseESet;
		eraseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__ERASE, oldErase, erase, !oldEraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErase() {
		int oldErase = erase;
		boolean oldEraseESet = eraseESet;
		erase = ERASE_EDEFAULT;
		eraseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__ERASE, oldErase, ERASE_EDEFAULT, oldEraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErase() {
		return eraseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLverase() {
		return lverase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLverase(int newLverase) {
		int oldLverase = lverase;
		lverase = newLverase;
		boolean oldLveraseESet = lveraseESet;
		lveraseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.WAIT__LVERASE, oldLverase, lverase, !oldLveraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLverase() {
		int oldLverase = lverase;
		boolean oldLveraseESet = lveraseESet;
		lverase = LVERASE_EDEFAULT;
		lveraseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.WAIT__LVERASE, oldLverase, LVERASE_EDEFAULT, oldLveraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLverase() {
		return lveraseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MemoryPackage.WAIT__PGM:
				return getPgm();
			case MemoryPackage.WAIT__LVPGM:
				return getLvpgm();
			case MemoryPackage.WAIT__EEDATA:
				return getEedata();
			case MemoryPackage.WAIT__CFG:
				return getCfg();
			case MemoryPackage.WAIT__USERID:
				return getUserid();
			case MemoryPackage.WAIT__ERASE:
				return getErase();
			case MemoryPackage.WAIT__LVERASE:
				return getLverase();
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
			case MemoryPackage.WAIT__PGM:
				setPgm((Integer)newValue);
				return;
			case MemoryPackage.WAIT__LVPGM:
				setLvpgm((Integer)newValue);
				return;
			case MemoryPackage.WAIT__EEDATA:
				setEedata((Integer)newValue);
				return;
			case MemoryPackage.WAIT__CFG:
				setCfg((Integer)newValue);
				return;
			case MemoryPackage.WAIT__USERID:
				setUserid((Integer)newValue);
				return;
			case MemoryPackage.WAIT__ERASE:
				setErase((Integer)newValue);
				return;
			case MemoryPackage.WAIT__LVERASE:
				setLverase((Integer)newValue);
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
			case MemoryPackage.WAIT__PGM:
				unsetPgm();
				return;
			case MemoryPackage.WAIT__LVPGM:
				unsetLvpgm();
				return;
			case MemoryPackage.WAIT__EEDATA:
				unsetEedata();
				return;
			case MemoryPackage.WAIT__CFG:
				unsetCfg();
				return;
			case MemoryPackage.WAIT__USERID:
				unsetUserid();
				return;
			case MemoryPackage.WAIT__ERASE:
				unsetErase();
				return;
			case MemoryPackage.WAIT__LVERASE:
				unsetLverase();
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
			case MemoryPackage.WAIT__PGM:
				return isSetPgm();
			case MemoryPackage.WAIT__LVPGM:
				return isSetLvpgm();
			case MemoryPackage.WAIT__EEDATA:
				return isSetEedata();
			case MemoryPackage.WAIT__CFG:
				return isSetCfg();
			case MemoryPackage.WAIT__USERID:
				return isSetUserid();
			case MemoryPackage.WAIT__ERASE:
				return isSetErase();
			case MemoryPackage.WAIT__LVERASE:
				return isSetLverase();
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
		result.append(", lvpgm: ");
		if (lvpgmESet) result.append(lvpgm); else result.append("<unset>");
		result.append(", eedata: ");
		if (eedataESet) result.append(eedata); else result.append("<unset>");
		result.append(", cfg: ");
		if (cfgESet) result.append(cfg); else result.append("<unset>");
		result.append(", userid: ");
		if (useridESet) result.append(userid); else result.append("<unset>");
		result.append(", erase: ");
		if (eraseESet) result.append(erase); else result.append("<unset>");
		result.append(", lverase: ");
		if (lveraseESet) result.append(lverase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WaitImpl

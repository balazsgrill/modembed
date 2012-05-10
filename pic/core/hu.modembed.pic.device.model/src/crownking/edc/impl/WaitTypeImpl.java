/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.WaitType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wait Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getEedata <em>Eedata</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getErase <em>Erase</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getLverase <em>Lverase</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getLvpgm <em>Lvpgm</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getPgm <em>Pgm</em>}</li>
 *   <li>{@link crownking.edc.impl.WaitTypeImpl#getUserid <em>Userid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaitTypeImpl extends EObjectImpl implements WaitType {
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
	protected static final short CFG_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCfg() <em>Cfg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected short cfg = CFG_EDEFAULT;

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
	protected static final short EEDATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEedata() <em>Eedata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEedata()
	 * @generated
	 * @ordered
	 */
	protected short eedata = EEDATA_EDEFAULT;

	/**
	 * This is true if the Eedata attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eedataESet;

	/**
	 * The default value of the '{@link #getErase() <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErase()
	 * @generated
	 * @ordered
	 */
	protected static final short ERASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getErase() <em>Erase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErase()
	 * @generated
	 * @ordered
	 */
	protected short erase = ERASE_EDEFAULT;

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
	protected static final short LVERASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLverase() <em>Lverase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLverase()
	 * @generated
	 * @ordered
	 */
	protected short lverase = LVERASE_EDEFAULT;

	/**
	 * This is true if the Lverase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lveraseESet;

	/**
	 * The default value of the '{@link #getLvpgm() <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvpgm()
	 * @generated
	 * @ordered
	 */
	protected static final short LVPGM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLvpgm() <em>Lvpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvpgm()
	 * @generated
	 * @ordered
	 */
	protected short lvpgm = LVPGM_EDEFAULT;

	/**
	 * This is true if the Lvpgm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lvpgmESet;

	/**
	 * The default value of the '{@link #getPgm() <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgm()
	 * @generated
	 * @ordered
	 */
	protected static final short PGM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPgm() <em>Pgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgm()
	 * @generated
	 * @ordered
	 */
	protected short pgm = PGM_EDEFAULT;

	/**
	 * This is true if the Pgm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pgmESet;

	/**
	 * The default value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected static final short USERID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUserid() <em>Userid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected short userid = USERID_EDEFAULT;

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
	protected WaitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getWaitType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCfg() {
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfg(short newCfg) {
		short oldCfg = cfg;
		cfg = newCfg;
		boolean oldCfgESet = cfgESet;
		cfgESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__CFG, oldCfg, cfg, !oldCfgESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCfg() {
		short oldCfg = cfg;
		boolean oldCfgESet = cfgESet;
		cfg = CFG_EDEFAULT;
		cfgESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__CFG, oldCfg, CFG_EDEFAULT, oldCfgESet));
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
	public short getEedata() {
		return eedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEedata(short newEedata) {
		short oldEedata = eedata;
		eedata = newEedata;
		boolean oldEedataESet = eedataESet;
		eedataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__EEDATA, oldEedata, eedata, !oldEedataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEedata() {
		short oldEedata = eedata;
		boolean oldEedataESet = eedataESet;
		eedata = EEDATA_EDEFAULT;
		eedataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__EEDATA, oldEedata, EEDATA_EDEFAULT, oldEedataESet));
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
	public short getErase() {
		return erase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErase(short newErase) {
		short oldErase = erase;
		erase = newErase;
		boolean oldEraseESet = eraseESet;
		eraseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__ERASE, oldErase, erase, !oldEraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErase() {
		short oldErase = erase;
		boolean oldEraseESet = eraseESet;
		erase = ERASE_EDEFAULT;
		eraseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__ERASE, oldErase, ERASE_EDEFAULT, oldEraseESet));
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
	public short getLverase() {
		return lverase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLverase(short newLverase) {
		short oldLverase = lverase;
		lverase = newLverase;
		boolean oldLveraseESet = lveraseESet;
		lveraseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__LVERASE, oldLverase, lverase, !oldLveraseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLverase() {
		short oldLverase = lverase;
		boolean oldLveraseESet = lveraseESet;
		lverase = LVERASE_EDEFAULT;
		lveraseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__LVERASE, oldLverase, LVERASE_EDEFAULT, oldLveraseESet));
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
	public short getLvpgm() {
		return lvpgm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLvpgm(short newLvpgm) {
		short oldLvpgm = lvpgm;
		lvpgm = newLvpgm;
		boolean oldLvpgmESet = lvpgmESet;
		lvpgmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__LVPGM, oldLvpgm, lvpgm, !oldLvpgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLvpgm() {
		short oldLvpgm = lvpgm;
		boolean oldLvpgmESet = lvpgmESet;
		lvpgm = LVPGM_EDEFAULT;
		lvpgmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__LVPGM, oldLvpgm, LVPGM_EDEFAULT, oldLvpgmESet));
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
	public short getPgm() {
		return pgm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgm(short newPgm) {
		short oldPgm = pgm;
		pgm = newPgm;
		boolean oldPgmESet = pgmESet;
		pgmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__PGM, oldPgm, pgm, !oldPgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPgm() {
		short oldPgm = pgm;
		boolean oldPgmESet = pgmESet;
		pgm = PGM_EDEFAULT;
		pgmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__PGM, oldPgm, PGM_EDEFAULT, oldPgmESet));
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
	public short getUserid() {
		return userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserid(short newUserid) {
		short oldUserid = userid;
		userid = newUserid;
		boolean oldUseridESet = useridESet;
		useridESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.WAIT_TYPE__USERID, oldUserid, userid, !oldUseridESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserid() {
		short oldUserid = userid;
		boolean oldUseridESet = useridESet;
		userid = USERID_EDEFAULT;
		useridESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.WAIT_TYPE__USERID, oldUserid, USERID_EDEFAULT, oldUseridESet));
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
			case EdcPackage.WAIT_TYPE__VALUE:
				return getValue();
			case EdcPackage.WAIT_TYPE__CFG:
				return getCfg();
			case EdcPackage.WAIT_TYPE__EEDATA:
				return getEedata();
			case EdcPackage.WAIT_TYPE__ERASE:
				return getErase();
			case EdcPackage.WAIT_TYPE__LVERASE:
				return getLverase();
			case EdcPackage.WAIT_TYPE__LVPGM:
				return getLvpgm();
			case EdcPackage.WAIT_TYPE__PGM:
				return getPgm();
			case EdcPackage.WAIT_TYPE__USERID:
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
			case EdcPackage.WAIT_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.WAIT_TYPE__CFG:
				setCfg((Short)newValue);
				return;
			case EdcPackage.WAIT_TYPE__EEDATA:
				setEedata((Short)newValue);
				return;
			case EdcPackage.WAIT_TYPE__ERASE:
				setErase((Short)newValue);
				return;
			case EdcPackage.WAIT_TYPE__LVERASE:
				setLverase((Short)newValue);
				return;
			case EdcPackage.WAIT_TYPE__LVPGM:
				setLvpgm((Short)newValue);
				return;
			case EdcPackage.WAIT_TYPE__PGM:
				setPgm((Short)newValue);
				return;
			case EdcPackage.WAIT_TYPE__USERID:
				setUserid((Short)newValue);
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
			case EdcPackage.WAIT_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.WAIT_TYPE__CFG:
				unsetCfg();
				return;
			case EdcPackage.WAIT_TYPE__EEDATA:
				unsetEedata();
				return;
			case EdcPackage.WAIT_TYPE__ERASE:
				unsetErase();
				return;
			case EdcPackage.WAIT_TYPE__LVERASE:
				unsetLverase();
				return;
			case EdcPackage.WAIT_TYPE__LVPGM:
				unsetLvpgm();
				return;
			case EdcPackage.WAIT_TYPE__PGM:
				unsetPgm();
				return;
			case EdcPackage.WAIT_TYPE__USERID:
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
			case EdcPackage.WAIT_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.WAIT_TYPE__CFG:
				return isSetCfg();
			case EdcPackage.WAIT_TYPE__EEDATA:
				return isSetEedata();
			case EdcPackage.WAIT_TYPE__ERASE:
				return isSetErase();
			case EdcPackage.WAIT_TYPE__LVERASE:
				return isSetLverase();
			case EdcPackage.WAIT_TYPE__LVPGM:
				return isSetLvpgm();
			case EdcPackage.WAIT_TYPE__PGM:
				return isSetPgm();
			case EdcPackage.WAIT_TYPE__USERID:
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
		result.append(", erase: ");
		if (eraseESet) result.append(erase); else result.append("<unset>");
		result.append(", lverase: ");
		if (lveraseESet) result.append(lverase); else result.append("<unset>");
		result.append(", lvpgm: ");
		if (lvpgmESet) result.append(lvpgm); else result.append("<unset>");
		result.append(", pgm: ");
		if (pgmESet) result.append(pgm); else result.append("<unset>");
		result.append(", userid: ");
		if (useridESet) result.append(userid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WaitTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.impl;

import java.util.Collection;

import microchip.Device;
import microchip.MicrochipPackage;

import microchip.device.Vdd;
import microchip.device.Vpp;

import microchip.device.config.CfgBits;

import microchip.device.memory.Breakpoints;
import microchip.device.memory.DevID;
import microchip.device.memory.MemRegion;
import microchip.device.memory.MirrorRegs;
import microchip.device.memory.Programming;
import microchip.device.memory.SFR;
import microchip.device.memory.UnusedRegs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.impl.DeviceImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getVdd <em>Vdd</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getVpp <em>Vpp</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getCfgbits <em>Cfgbits</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getPgming <em>Pgming</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getPgmmem <em>Pgmmem</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getUserid <em>Userid</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getTestmem <em>Testmem</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getDevid <em>Devid</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getCfgmem <em>Cfgmem</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getEedata <em>Eedata</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getBkbgvectmem <em>Bkbgvectmem</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getSfrs <em>Sfrs</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getNumBanks <em>Num Banks</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getNumHWBP <em>Num HWBP</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getMirrors <em>Mirrors</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getUnused <em>Unused</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getNmmrs <em>Nmmrs</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getUnusedBankMask <em>Unused Bank Mask</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getAccessBankSplitOffset <em>Access Bank Split Offset</em>}</li>
 *   <li>{@link microchip.impl.DeviceImpl#getBreakpoints <em>Breakpoints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends EObjectImpl implements Device {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * The cached value of the '{@link #getVdd() <em>Vdd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVdd()
	 * @generated
	 * @ordered
	 */
	protected Vdd vdd;

	/**
	 * This is true if the Vdd containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vddESet;

	/**
	 * The cached value of the '{@link #getVpp() <em>Vpp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpp()
	 * @generated
	 * @ordered
	 */
	protected Vpp vpp;

	/**
	 * This is true if the Vpp containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vppESet;

	/**
	 * The cached value of the '{@link #getCfgbits() <em>Cfgbits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfgbits()
	 * @generated
	 * @ordered
	 */
	protected EList<CfgBits> cfgbits;

	/**
	 * The cached value of the '{@link #getPgming() <em>Pgming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgming()
	 * @generated
	 * @ordered
	 */
	protected Programming pgming;

	/**
	 * The cached value of the '{@link #getPgmmem() <em>Pgmmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgmmem()
	 * @generated
	 * @ordered
	 */
	protected MemRegion pgmmem;

	/**
	 * The cached value of the '{@link #getUserid() <em>Userid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserid()
	 * @generated
	 * @ordered
	 */
	protected MemRegion userid;

	/**
	 * The cached value of the '{@link #getTestmem() <em>Testmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestmem()
	 * @generated
	 * @ordered
	 */
	protected MemRegion testmem;

	/**
	 * The cached value of the '{@link #getDevid() <em>Devid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevid()
	 * @generated
	 * @ordered
	 */
	protected DevID devid;

	/**
	 * The cached value of the '{@link #getCfgmem() <em>Cfgmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfgmem()
	 * @generated
	 * @ordered
	 */
	protected MemRegion cfgmem;

	/**
	 * The cached value of the '{@link #getEedata() <em>Eedata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEedata()
	 * @generated
	 * @ordered
	 */
	protected MemRegion eedata;

	/**
	 * The cached value of the '{@link #getBkbgvectmem() <em>Bkbgvectmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBkbgvectmem()
	 * @generated
	 * @ordered
	 */
	protected MemRegion bkbgvectmem;

	/**
	 * The cached value of the '{@link #getSfrs() <em>Sfrs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfrs()
	 * @generated
	 * @ordered
	 */
	protected EList<SFR> sfrs;

	/**
	 * The default value of the '{@link #getNumBanks() <em>Num Banks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBanks()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_BANKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumBanks() <em>Num Banks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumBanks()
	 * @generated
	 * @ordered
	 */
	protected int numBanks = NUM_BANKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumHWBP() <em>Num HWBP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHWBP()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_HWBP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumHWBP() <em>Num HWBP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumHWBP()
	 * @generated
	 * @ordered
	 */
	protected int numHWBP = NUM_HWBP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMirrors() <em>Mirrors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirrors()
	 * @generated
	 * @ordered
	 */
	protected EList<MirrorRegs> mirrors;

	/**
	 * The cached value of the '{@link #getUnused() <em>Unused</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnused()
	 * @generated
	 * @ordered
	 */
	protected EList<UnusedRegs> unused;

	/**
	 * The cached value of the '{@link #getNmmrs() <em>Nmmrs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNmmrs()
	 * @generated
	 * @ordered
	 */
	protected EList<SFR> nmmrs;

	/**
	 * The default value of the '{@link #getUnusedBankMask() <em>Unused Bank Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedBankMask()
	 * @generated
	 * @ordered
	 */
	protected static final int UNUSED_BANK_MASK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnusedBankMask() <em>Unused Bank Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedBankMask()
	 * @generated
	 * @ordered
	 */
	protected int unusedBankMask = UNUSED_BANK_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessBankSplitOffset() <em>Access Bank Split Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessBankSplitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCESS_BANK_SPLIT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccessBankSplitOffset() <em>Access Bank Split Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessBankSplitOffset()
	 * @generated
	 * @ordered
	 */
	protected int accessBankSplitOffset = ACCESS_BANK_SPLIT_OFFSET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBreakpoints() <em>Breakpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakpoints()
	 * @generated
	 * @ordered
	 */
	protected Breakpoints breakpoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicrochipPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		String oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MicrochipPackage.DEVICE__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vdd getVdd() {
		return vdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVdd(Vdd newVdd, NotificationChain msgs) {
		Vdd oldVdd = vdd;
		vdd = newVdd;
		boolean oldVddESet = vddESet;
		vddESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__VDD, oldVdd, newVdd, !oldVddESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVdd(Vdd newVdd) {
		if (newVdd != vdd) {
			NotificationChain msgs = null;
			if (vdd != null)
				msgs = ((InternalEObject)vdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__VDD, null, msgs);
			if (newVdd != null)
				msgs = ((InternalEObject)newVdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__VDD, null, msgs);
			msgs = basicSetVdd(newVdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVddESet = vddESet;
			vddESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__VDD, newVdd, newVdd, !oldVddESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetVdd(NotificationChain msgs) {
		Vdd oldVdd = vdd;
		vdd = null;
		boolean oldVddESet = vddESet;
		vddESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, MicrochipPackage.DEVICE__VDD, oldVdd, null, oldVddESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVdd() {
		if (vdd != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)vdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__VDD, null, msgs);
			msgs = basicUnsetVdd(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVddESet = vddESet;
			vddESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, MicrochipPackage.DEVICE__VDD, null, null, oldVddESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVdd() {
		return vddESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vpp getVpp() {
		return vpp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVpp(Vpp newVpp, NotificationChain msgs) {
		Vpp oldVpp = vpp;
		vpp = newVpp;
		boolean oldVppESet = vppESet;
		vppESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__VPP, oldVpp, newVpp, !oldVppESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpp(Vpp newVpp) {
		if (newVpp != vpp) {
			NotificationChain msgs = null;
			if (vpp != null)
				msgs = ((InternalEObject)vpp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__VPP, null, msgs);
			if (newVpp != null)
				msgs = ((InternalEObject)newVpp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__VPP, null, msgs);
			msgs = basicSetVpp(newVpp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVppESet = vppESet;
			vppESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__VPP, newVpp, newVpp, !oldVppESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetVpp(NotificationChain msgs) {
		Vpp oldVpp = vpp;
		vpp = null;
		boolean oldVppESet = vppESet;
		vppESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, MicrochipPackage.DEVICE__VPP, oldVpp, null, oldVppESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVpp() {
		if (vpp != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)vpp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__VPP, null, msgs);
			msgs = basicUnsetVpp(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldVppESet = vppESet;
			vppESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, MicrochipPackage.DEVICE__VPP, null, null, oldVppESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVpp() {
		return vppESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CfgBits> getCfgbits() {
		if (cfgbits == null) {
			cfgbits = new EObjectContainmentEList<CfgBits>(CfgBits.class, this, MicrochipPackage.DEVICE__CFGBITS);
		}
		return cfgbits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programming getPgming() {
		return pgming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPgming(Programming newPgming, NotificationChain msgs) {
		Programming oldPgming = pgming;
		pgming = newPgming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__PGMING, oldPgming, newPgming);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgming(Programming newPgming) {
		if (newPgming != pgming) {
			NotificationChain msgs = null;
			if (pgming != null)
				msgs = ((InternalEObject)pgming).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__PGMING, null, msgs);
			if (newPgming != null)
				msgs = ((InternalEObject)newPgming).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__PGMING, null, msgs);
			msgs = basicSetPgming(newPgming, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__PGMING, newPgming, newPgming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion getPgmmem() {
		return pgmmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPgmmem(MemRegion newPgmmem, NotificationChain msgs) {
		MemRegion oldPgmmem = pgmmem;
		pgmmem = newPgmmem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__PGMMEM, oldPgmmem, newPgmmem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgmmem(MemRegion newPgmmem) {
		if (newPgmmem != pgmmem) {
			NotificationChain msgs = null;
			if (pgmmem != null)
				msgs = ((InternalEObject)pgmmem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__PGMMEM, null, msgs);
			if (newPgmmem != null)
				msgs = ((InternalEObject)newPgmmem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__PGMMEM, null, msgs);
			msgs = basicSetPgmmem(newPgmmem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__PGMMEM, newPgmmem, newPgmmem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion getUserid() {
		return userid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserid(MemRegion newUserid, NotificationChain msgs) {
		MemRegion oldUserid = userid;
		userid = newUserid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__USERID, oldUserid, newUserid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserid(MemRegion newUserid) {
		if (newUserid != userid) {
			NotificationChain msgs = null;
			if (userid != null)
				msgs = ((InternalEObject)userid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__USERID, null, msgs);
			if (newUserid != null)
				msgs = ((InternalEObject)newUserid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__USERID, null, msgs);
			msgs = basicSetUserid(newUserid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__USERID, newUserid, newUserid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion getTestmem() {
		return testmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestmem(MemRegion newTestmem, NotificationChain msgs) {
		MemRegion oldTestmem = testmem;
		testmem = newTestmem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__TESTMEM, oldTestmem, newTestmem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestmem(MemRegion newTestmem) {
		if (newTestmem != testmem) {
			NotificationChain msgs = null;
			if (testmem != null)
				msgs = ((InternalEObject)testmem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__TESTMEM, null, msgs);
			if (newTestmem != null)
				msgs = ((InternalEObject)newTestmem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__TESTMEM, null, msgs);
			msgs = basicSetTestmem(newTestmem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__TESTMEM, newTestmem, newTestmem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevID getDevid() {
		return devid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevid(DevID newDevid, NotificationChain msgs) {
		DevID oldDevid = devid;
		devid = newDevid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__DEVID, oldDevid, newDevid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevid(DevID newDevid) {
		if (newDevid != devid) {
			NotificationChain msgs = null;
			if (devid != null)
				msgs = ((InternalEObject)devid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__DEVID, null, msgs);
			if (newDevid != null)
				msgs = ((InternalEObject)newDevid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__DEVID, null, msgs);
			msgs = basicSetDevid(newDevid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__DEVID, newDevid, newDevid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion getCfgmem() {
		return cfgmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfgmem(MemRegion newCfgmem, NotificationChain msgs) {
		MemRegion oldCfgmem = cfgmem;
		cfgmem = newCfgmem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__CFGMEM, oldCfgmem, newCfgmem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfgmem(MemRegion newCfgmem) {
		if (newCfgmem != cfgmem) {
			NotificationChain msgs = null;
			if (cfgmem != null)
				msgs = ((InternalEObject)cfgmem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__CFGMEM, null, msgs);
			if (newCfgmem != null)
				msgs = ((InternalEObject)newCfgmem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__CFGMEM, null, msgs);
			msgs = basicSetCfgmem(newCfgmem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__CFGMEM, newCfgmem, newCfgmem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion getEedata() {
		return eedata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEedata(MemRegion newEedata, NotificationChain msgs) {
		MemRegion oldEedata = eedata;
		eedata = newEedata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__EEDATA, oldEedata, newEedata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEedata(MemRegion newEedata) {
		if (newEedata != eedata) {
			NotificationChain msgs = null;
			if (eedata != null)
				msgs = ((InternalEObject)eedata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__EEDATA, null, msgs);
			if (newEedata != null)
				msgs = ((InternalEObject)newEedata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__EEDATA, null, msgs);
			msgs = basicSetEedata(newEedata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__EEDATA, newEedata, newEedata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemRegion getBkbgvectmem() {
		return bkbgvectmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBkbgvectmem(MemRegion newBkbgvectmem, NotificationChain msgs) {
		MemRegion oldBkbgvectmem = bkbgvectmem;
		bkbgvectmem = newBkbgvectmem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__BKBGVECTMEM, oldBkbgvectmem, newBkbgvectmem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBkbgvectmem(MemRegion newBkbgvectmem) {
		if (newBkbgvectmem != bkbgvectmem) {
			NotificationChain msgs = null;
			if (bkbgvectmem != null)
				msgs = ((InternalEObject)bkbgvectmem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__BKBGVECTMEM, null, msgs);
			if (newBkbgvectmem != null)
				msgs = ((InternalEObject)newBkbgvectmem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__BKBGVECTMEM, null, msgs);
			msgs = basicSetBkbgvectmem(newBkbgvectmem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__BKBGVECTMEM, newBkbgvectmem, newBkbgvectmem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFR> getSfrs() {
		if (sfrs == null) {
			sfrs = new EObjectContainmentEList<SFR>(SFR.class, this, MicrochipPackage.DEVICE__SFRS);
		}
		return sfrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumBanks() {
		return numBanks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumBanks(int newNumBanks) {
		int oldNumBanks = numBanks;
		numBanks = newNumBanks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__NUM_BANKS, oldNumBanks, numBanks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumHWBP() {
		return numHWBP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumHWBP(int newNumHWBP) {
		int oldNumHWBP = numHWBP;
		numHWBP = newNumHWBP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__NUM_HWBP, oldNumHWBP, numHWBP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MirrorRegs> getMirrors() {
		if (mirrors == null) {
			mirrors = new EObjectContainmentEList<MirrorRegs>(MirrorRegs.class, this, MicrochipPackage.DEVICE__MIRRORS);
		}
		return mirrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnusedRegs> getUnused() {
		if (unused == null) {
			unused = new EObjectContainmentEList<UnusedRegs>(UnusedRegs.class, this, MicrochipPackage.DEVICE__UNUSED);
		}
		return unused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFR> getNmmrs() {
		if (nmmrs == null) {
			nmmrs = new EObjectContainmentEList<SFR>(SFR.class, this, MicrochipPackage.DEVICE__NMMRS);
		}
		return nmmrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnusedBankMask() {
		return unusedBankMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnusedBankMask(int newUnusedBankMask) {
		int oldUnusedBankMask = unusedBankMask;
		unusedBankMask = newUnusedBankMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__UNUSED_BANK_MASK, oldUnusedBankMask, unusedBankMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccessBankSplitOffset() {
		return accessBankSplitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessBankSplitOffset(int newAccessBankSplitOffset) {
		int oldAccessBankSplitOffset = accessBankSplitOffset;
		accessBankSplitOffset = newAccessBankSplitOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__ACCESS_BANK_SPLIT_OFFSET, oldAccessBankSplitOffset, accessBankSplitOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Breakpoints getBreakpoints() {
		return breakpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBreakpoints(Breakpoints newBreakpoints, NotificationChain msgs) {
		Breakpoints oldBreakpoints = breakpoints;
		breakpoints = newBreakpoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__BREAKPOINTS, oldBreakpoints, newBreakpoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakpoints(Breakpoints newBreakpoints) {
		if (newBreakpoints != breakpoints) {
			NotificationChain msgs = null;
			if (breakpoints != null)
				msgs = ((InternalEObject)breakpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__BREAKPOINTS, null, msgs);
			if (newBreakpoints != null)
				msgs = ((InternalEObject)newBreakpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MicrochipPackage.DEVICE__BREAKPOINTS, null, msgs);
			msgs = basicSetBreakpoints(newBreakpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicrochipPackage.DEVICE__BREAKPOINTS, newBreakpoints, newBreakpoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MicrochipPackage.DEVICE__VDD:
				return basicUnsetVdd(msgs);
			case MicrochipPackage.DEVICE__VPP:
				return basicUnsetVpp(msgs);
			case MicrochipPackage.DEVICE__CFGBITS:
				return ((InternalEList<?>)getCfgbits()).basicRemove(otherEnd, msgs);
			case MicrochipPackage.DEVICE__PGMING:
				return basicSetPgming(null, msgs);
			case MicrochipPackage.DEVICE__PGMMEM:
				return basicSetPgmmem(null, msgs);
			case MicrochipPackage.DEVICE__USERID:
				return basicSetUserid(null, msgs);
			case MicrochipPackage.DEVICE__TESTMEM:
				return basicSetTestmem(null, msgs);
			case MicrochipPackage.DEVICE__DEVID:
				return basicSetDevid(null, msgs);
			case MicrochipPackage.DEVICE__CFGMEM:
				return basicSetCfgmem(null, msgs);
			case MicrochipPackage.DEVICE__EEDATA:
				return basicSetEedata(null, msgs);
			case MicrochipPackage.DEVICE__BKBGVECTMEM:
				return basicSetBkbgvectmem(null, msgs);
			case MicrochipPackage.DEVICE__SFRS:
				return ((InternalEList<?>)getSfrs()).basicRemove(otherEnd, msgs);
			case MicrochipPackage.DEVICE__MIRRORS:
				return ((InternalEList<?>)getMirrors()).basicRemove(otherEnd, msgs);
			case MicrochipPackage.DEVICE__UNUSED:
				return ((InternalEList<?>)getUnused()).basicRemove(otherEnd, msgs);
			case MicrochipPackage.DEVICE__NMMRS:
				return ((InternalEList<?>)getNmmrs()).basicRemove(otherEnd, msgs);
			case MicrochipPackage.DEVICE__BREAKPOINTS:
				return basicSetBreakpoints(null, msgs);
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
			case MicrochipPackage.DEVICE__FORMAT:
				return getFormat();
			case MicrochipPackage.DEVICE__VDD:
				return getVdd();
			case MicrochipPackage.DEVICE__VPP:
				return getVpp();
			case MicrochipPackage.DEVICE__CFGBITS:
				return getCfgbits();
			case MicrochipPackage.DEVICE__PGMING:
				return getPgming();
			case MicrochipPackage.DEVICE__PGMMEM:
				return getPgmmem();
			case MicrochipPackage.DEVICE__USERID:
				return getUserid();
			case MicrochipPackage.DEVICE__TESTMEM:
				return getTestmem();
			case MicrochipPackage.DEVICE__DEVID:
				return getDevid();
			case MicrochipPackage.DEVICE__CFGMEM:
				return getCfgmem();
			case MicrochipPackage.DEVICE__EEDATA:
				return getEedata();
			case MicrochipPackage.DEVICE__BKBGVECTMEM:
				return getBkbgvectmem();
			case MicrochipPackage.DEVICE__SFRS:
				return getSfrs();
			case MicrochipPackage.DEVICE__NUM_BANKS:
				return getNumBanks();
			case MicrochipPackage.DEVICE__NUM_HWBP:
				return getNumHWBP();
			case MicrochipPackage.DEVICE__MIRRORS:
				return getMirrors();
			case MicrochipPackage.DEVICE__UNUSED:
				return getUnused();
			case MicrochipPackage.DEVICE__NMMRS:
				return getNmmrs();
			case MicrochipPackage.DEVICE__UNUSED_BANK_MASK:
				return getUnusedBankMask();
			case MicrochipPackage.DEVICE__ACCESS_BANK_SPLIT_OFFSET:
				return getAccessBankSplitOffset();
			case MicrochipPackage.DEVICE__BREAKPOINTS:
				return getBreakpoints();
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
			case MicrochipPackage.DEVICE__FORMAT:
				setFormat((String)newValue);
				return;
			case MicrochipPackage.DEVICE__VDD:
				setVdd((Vdd)newValue);
				return;
			case MicrochipPackage.DEVICE__VPP:
				setVpp((Vpp)newValue);
				return;
			case MicrochipPackage.DEVICE__CFGBITS:
				getCfgbits().clear();
				getCfgbits().addAll((Collection<? extends CfgBits>)newValue);
				return;
			case MicrochipPackage.DEVICE__PGMING:
				setPgming((Programming)newValue);
				return;
			case MicrochipPackage.DEVICE__PGMMEM:
				setPgmmem((MemRegion)newValue);
				return;
			case MicrochipPackage.DEVICE__USERID:
				setUserid((MemRegion)newValue);
				return;
			case MicrochipPackage.DEVICE__TESTMEM:
				setTestmem((MemRegion)newValue);
				return;
			case MicrochipPackage.DEVICE__DEVID:
				setDevid((DevID)newValue);
				return;
			case MicrochipPackage.DEVICE__CFGMEM:
				setCfgmem((MemRegion)newValue);
				return;
			case MicrochipPackage.DEVICE__EEDATA:
				setEedata((MemRegion)newValue);
				return;
			case MicrochipPackage.DEVICE__BKBGVECTMEM:
				setBkbgvectmem((MemRegion)newValue);
				return;
			case MicrochipPackage.DEVICE__SFRS:
				getSfrs().clear();
				getSfrs().addAll((Collection<? extends SFR>)newValue);
				return;
			case MicrochipPackage.DEVICE__NUM_BANKS:
				setNumBanks((Integer)newValue);
				return;
			case MicrochipPackage.DEVICE__NUM_HWBP:
				setNumHWBP((Integer)newValue);
				return;
			case MicrochipPackage.DEVICE__MIRRORS:
				getMirrors().clear();
				getMirrors().addAll((Collection<? extends MirrorRegs>)newValue);
				return;
			case MicrochipPackage.DEVICE__UNUSED:
				getUnused().clear();
				getUnused().addAll((Collection<? extends UnusedRegs>)newValue);
				return;
			case MicrochipPackage.DEVICE__NMMRS:
				getNmmrs().clear();
				getNmmrs().addAll((Collection<? extends SFR>)newValue);
				return;
			case MicrochipPackage.DEVICE__UNUSED_BANK_MASK:
				setUnusedBankMask((Integer)newValue);
				return;
			case MicrochipPackage.DEVICE__ACCESS_BANK_SPLIT_OFFSET:
				setAccessBankSplitOffset((Integer)newValue);
				return;
			case MicrochipPackage.DEVICE__BREAKPOINTS:
				setBreakpoints((Breakpoints)newValue);
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
			case MicrochipPackage.DEVICE__FORMAT:
				unsetFormat();
				return;
			case MicrochipPackage.DEVICE__VDD:
				unsetVdd();
				return;
			case MicrochipPackage.DEVICE__VPP:
				unsetVpp();
				return;
			case MicrochipPackage.DEVICE__CFGBITS:
				getCfgbits().clear();
				return;
			case MicrochipPackage.DEVICE__PGMING:
				setPgming((Programming)null);
				return;
			case MicrochipPackage.DEVICE__PGMMEM:
				setPgmmem((MemRegion)null);
				return;
			case MicrochipPackage.DEVICE__USERID:
				setUserid((MemRegion)null);
				return;
			case MicrochipPackage.DEVICE__TESTMEM:
				setTestmem((MemRegion)null);
				return;
			case MicrochipPackage.DEVICE__DEVID:
				setDevid((DevID)null);
				return;
			case MicrochipPackage.DEVICE__CFGMEM:
				setCfgmem((MemRegion)null);
				return;
			case MicrochipPackage.DEVICE__EEDATA:
				setEedata((MemRegion)null);
				return;
			case MicrochipPackage.DEVICE__BKBGVECTMEM:
				setBkbgvectmem((MemRegion)null);
				return;
			case MicrochipPackage.DEVICE__SFRS:
				getSfrs().clear();
				return;
			case MicrochipPackage.DEVICE__NUM_BANKS:
				setNumBanks(NUM_BANKS_EDEFAULT);
				return;
			case MicrochipPackage.DEVICE__NUM_HWBP:
				setNumHWBP(NUM_HWBP_EDEFAULT);
				return;
			case MicrochipPackage.DEVICE__MIRRORS:
				getMirrors().clear();
				return;
			case MicrochipPackage.DEVICE__UNUSED:
				getUnused().clear();
				return;
			case MicrochipPackage.DEVICE__NMMRS:
				getNmmrs().clear();
				return;
			case MicrochipPackage.DEVICE__UNUSED_BANK_MASK:
				setUnusedBankMask(UNUSED_BANK_MASK_EDEFAULT);
				return;
			case MicrochipPackage.DEVICE__ACCESS_BANK_SPLIT_OFFSET:
				setAccessBankSplitOffset(ACCESS_BANK_SPLIT_OFFSET_EDEFAULT);
				return;
			case MicrochipPackage.DEVICE__BREAKPOINTS:
				setBreakpoints((Breakpoints)null);
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
			case MicrochipPackage.DEVICE__FORMAT:
				return isSetFormat();
			case MicrochipPackage.DEVICE__VDD:
				return isSetVdd();
			case MicrochipPackage.DEVICE__VPP:
				return isSetVpp();
			case MicrochipPackage.DEVICE__CFGBITS:
				return cfgbits != null && !cfgbits.isEmpty();
			case MicrochipPackage.DEVICE__PGMING:
				return pgming != null;
			case MicrochipPackage.DEVICE__PGMMEM:
				return pgmmem != null;
			case MicrochipPackage.DEVICE__USERID:
				return userid != null;
			case MicrochipPackage.DEVICE__TESTMEM:
				return testmem != null;
			case MicrochipPackage.DEVICE__DEVID:
				return devid != null;
			case MicrochipPackage.DEVICE__CFGMEM:
				return cfgmem != null;
			case MicrochipPackage.DEVICE__EEDATA:
				return eedata != null;
			case MicrochipPackage.DEVICE__BKBGVECTMEM:
				return bkbgvectmem != null;
			case MicrochipPackage.DEVICE__SFRS:
				return sfrs != null && !sfrs.isEmpty();
			case MicrochipPackage.DEVICE__NUM_BANKS:
				return numBanks != NUM_BANKS_EDEFAULT;
			case MicrochipPackage.DEVICE__NUM_HWBP:
				return numHWBP != NUM_HWBP_EDEFAULT;
			case MicrochipPackage.DEVICE__MIRRORS:
				return mirrors != null && !mirrors.isEmpty();
			case MicrochipPackage.DEVICE__UNUSED:
				return unused != null && !unused.isEmpty();
			case MicrochipPackage.DEVICE__NMMRS:
				return nmmrs != null && !nmmrs.isEmpty();
			case MicrochipPackage.DEVICE__UNUSED_BANK_MASK:
				return unusedBankMask != UNUSED_BANK_MASK_EDEFAULT;
			case MicrochipPackage.DEVICE__ACCESS_BANK_SPLIT_OFFSET:
				return accessBankSplitOffset != ACCESS_BANK_SPLIT_OFFSET_EDEFAULT;
			case MicrochipPackage.DEVICE__BREAKPOINTS:
				return breakpoints != null;
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
		result.append(" (format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(", numBanks: ");
		result.append(numBanks);
		result.append(", numHWBP: ");
		result.append(numHWBP);
		result.append(", UnusedBankMask: ");
		result.append(unusedBankMask);
		result.append(", AccessBankSplitOffset: ");
		result.append(accessBankSplitOffset);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl

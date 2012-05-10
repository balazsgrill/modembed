/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.LatchesType;
import crownking.edc.ProgrammingType;
import crownking.edc.WaitType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programming Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getLatches <em>Latches</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getCsumadd <em>Csumadd</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getErasealgo <em>Erasealgo</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getHaschecksum <em>Haschecksum</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getHasrowerasecmd <em>Hasrowerasecmd</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getHasvppfirst <em>Hasvppfirst</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getLvpthresh <em>Lvpthresh</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getMemtech <em>Memtech</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getOvrpgm <em>Ovrpgm</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgrammingTypeImpl#getTries <em>Tries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgrammingTypeImpl extends EObjectImpl implements ProgrammingType {
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
	 * The default value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final byte BOUNDARY_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected byte boundary = BOUNDARY_EDEFAULT;

	/**
	 * This is true if the Boundary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boundaryESet;

	/**
	 * The default value of the '{@link #getCsumadd() <em>Csumadd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsumadd()
	 * @generated
	 * @ordered
	 */
	protected static final String CSUMADD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCsumadd() <em>Csumadd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCsumadd()
	 * @generated
	 * @ordered
	 */
	protected String csumadd = CSUMADD_EDEFAULT;

	/**
	 * The default value of the '{@link #getErasealgo() <em>Erasealgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErasealgo()
	 * @generated
	 * @ordered
	 */
	protected static final byte ERASEALGO_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getErasealgo() <em>Erasealgo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErasealgo()
	 * @generated
	 * @ordered
	 */
	protected byte erasealgo = ERASEALGO_EDEFAULT;

	/**
	 * This is true if the Erasealgo attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean erasealgoESet;

	/**
	 * The default value of the '{@link #getHaschecksum() <em>Haschecksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaschecksum()
	 * @generated
	 * @ordered
	 */
	protected static final String HASCHECKSUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHaschecksum() <em>Haschecksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaschecksum()
	 * @generated
	 * @ordered
	 */
	protected String haschecksum = HASCHECKSUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasrowerasecmd() <em>Hasrowerasecmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasrowerasecmd()
	 * @generated
	 * @ordered
	 */
	protected static final String HASROWERASECMD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasrowerasecmd() <em>Hasrowerasecmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasrowerasecmd()
	 * @generated
	 * @ordered
	 */
	protected String hasrowerasecmd = HASROWERASECMD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasvppfirst() <em>Hasvppfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasvppfirst()
	 * @generated
	 * @ordered
	 */
	protected static final String HASVPPFIRST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasvppfirst() <em>Hasvppfirst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasvppfirst()
	 * @generated
	 * @ordered
	 */
	protected String hasvppfirst = HASVPPFIRST_EDEFAULT;

	/**
	 * The default value of the '{@link #getLvpthresh() <em>Lvpthresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvpthresh()
	 * @generated
	 * @ordered
	 */
	protected static final float LVPTHRESH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLvpthresh() <em>Lvpthresh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLvpthresh()
	 * @generated
	 * @ordered
	 */
	protected float lvpthresh = LVPTHRESH_EDEFAULT;

	/**
	 * This is true if the Lvpthresh attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lvpthreshESet;

	/**
	 * The default value of the '{@link #getMemtech() <em>Memtech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtech()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMTECH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemtech() <em>Memtech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemtech()
	 * @generated
	 * @ordered
	 */
	protected String memtech = MEMTECH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvrpgm() <em>Ovrpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvrpgm()
	 * @generated
	 * @ordered
	 */
	protected static final byte OVRPGM_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getOvrpgm() <em>Ovrpgm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvrpgm()
	 * @generated
	 * @ordered
	 */
	protected byte ovrpgm = OVRPGM_EDEFAULT;

	/**
	 * This is true if the Ovrpgm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ovrpgmESet;

	/**
	 * The default value of the '{@link #getTries() <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected static final byte TRIES_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getTries() <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected byte tries = TRIES_EDEFAULT;

	/**
	 * This is true if the Tries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getProgrammingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.PROGRAMMING_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaitType getWait() {
		return (WaitType)getMixed().get(EdcPackage.eINSTANCE.getProgrammingType_Wait(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(WaitType newWait, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EdcPackage.eINSTANCE.getProgrammingType_Wait(), newWait, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(WaitType newWait) {
		((FeatureMap.Internal)getMixed()).set(EdcPackage.eINSTANCE.getProgrammingType_Wait(), newWait);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatchesType getLatches() {
		return (LatchesType)getMixed().get(EdcPackage.eINSTANCE.getProgrammingType_Latches(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatches(LatchesType newLatches, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(EdcPackage.eINSTANCE.getProgrammingType_Latches(), newLatches, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatches(LatchesType newLatches) {
		((FeatureMap.Internal)getMixed()).set(EdcPackage.eINSTANCE.getProgrammingType_Latches(), newLatches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundary(byte newBoundary) {
		byte oldBoundary = boundary;
		boundary = newBoundary;
		boolean oldBoundaryESet = boundaryESet;
		boundaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__BOUNDARY, oldBoundary, boundary, !oldBoundaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoundary() {
		byte oldBoundary = boundary;
		boolean oldBoundaryESet = boundaryESet;
		boundary = BOUNDARY_EDEFAULT;
		boundaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.PROGRAMMING_TYPE__BOUNDARY, oldBoundary, BOUNDARY_EDEFAULT, oldBoundaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBoundary() {
		return boundaryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCsumadd() {
		return csumadd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCsumadd(String newCsumadd) {
		String oldCsumadd = csumadd;
		csumadd = newCsumadd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__CSUMADD, oldCsumadd, csumadd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getErasealgo() {
		return erasealgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErasealgo(byte newErasealgo) {
		byte oldErasealgo = erasealgo;
		erasealgo = newErasealgo;
		boolean oldErasealgoESet = erasealgoESet;
		erasealgoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__ERASEALGO, oldErasealgo, erasealgo, !oldErasealgoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErasealgo() {
		byte oldErasealgo = erasealgo;
		boolean oldErasealgoESet = erasealgoESet;
		erasealgo = ERASEALGO_EDEFAULT;
		erasealgoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.PROGRAMMING_TYPE__ERASEALGO, oldErasealgo, ERASEALGO_EDEFAULT, oldErasealgoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErasealgo() {
		return erasealgoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHaschecksum() {
		return haschecksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHaschecksum(String newHaschecksum) {
		String oldHaschecksum = haschecksum;
		haschecksum = newHaschecksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__HASCHECKSUM, oldHaschecksum, haschecksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasrowerasecmd() {
		return hasrowerasecmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasrowerasecmd(String newHasrowerasecmd) {
		String oldHasrowerasecmd = hasrowerasecmd;
		hasrowerasecmd = newHasrowerasecmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__HASROWERASECMD, oldHasrowerasecmd, hasrowerasecmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHasvppfirst() {
		return hasvppfirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasvppfirst(String newHasvppfirst) {
		String oldHasvppfirst = hasvppfirst;
		hasvppfirst = newHasvppfirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__HASVPPFIRST, oldHasvppfirst, hasvppfirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLvpthresh() {
		return lvpthresh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLvpthresh(float newLvpthresh) {
		float oldLvpthresh = lvpthresh;
		lvpthresh = newLvpthresh;
		boolean oldLvpthreshESet = lvpthreshESet;
		lvpthreshESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__LVPTHRESH, oldLvpthresh, lvpthresh, !oldLvpthreshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLvpthresh() {
		float oldLvpthresh = lvpthresh;
		boolean oldLvpthreshESet = lvpthreshESet;
		lvpthresh = LVPTHRESH_EDEFAULT;
		lvpthreshESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.PROGRAMMING_TYPE__LVPTHRESH, oldLvpthresh, LVPTHRESH_EDEFAULT, oldLvpthreshESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLvpthresh() {
		return lvpthreshESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemtech() {
		return memtech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemtech(String newMemtech) {
		String oldMemtech = memtech;
		memtech = newMemtech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__MEMTECH, oldMemtech, memtech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getOvrpgm() {
		return ovrpgm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvrpgm(byte newOvrpgm) {
		byte oldOvrpgm = ovrpgm;
		ovrpgm = newOvrpgm;
		boolean oldOvrpgmESet = ovrpgmESet;
		ovrpgmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__OVRPGM, oldOvrpgm, ovrpgm, !oldOvrpgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOvrpgm() {
		byte oldOvrpgm = ovrpgm;
		boolean oldOvrpgmESet = ovrpgmESet;
		ovrpgm = OVRPGM_EDEFAULT;
		ovrpgmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.PROGRAMMING_TYPE__OVRPGM, oldOvrpgm, OVRPGM_EDEFAULT, oldOvrpgmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOvrpgm() {
		return ovrpgmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getTries() {
		return tries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTries(byte newTries) {
		byte oldTries = tries;
		tries = newTries;
		boolean oldTriesESet = triesESet;
		triesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.PROGRAMMING_TYPE__TRIES, oldTries, tries, !oldTriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTries() {
		byte oldTries = tries;
		boolean oldTriesESet = triesESet;
		tries = TRIES_EDEFAULT;
		triesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.PROGRAMMING_TYPE__TRIES, oldTries, TRIES_EDEFAULT, oldTriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTries() {
		return triesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.PROGRAMMING_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAMMING_TYPE__WAIT:
				return basicSetWait(null, msgs);
			case EdcPackage.PROGRAMMING_TYPE__LATCHES:
				return basicSetLatches(null, msgs);
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
			case EdcPackage.PROGRAMMING_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.PROGRAMMING_TYPE__WAIT:
				return getWait();
			case EdcPackage.PROGRAMMING_TYPE__LATCHES:
				return getLatches();
			case EdcPackage.PROGRAMMING_TYPE__BOUNDARY:
				return getBoundary();
			case EdcPackage.PROGRAMMING_TYPE__CSUMADD:
				return getCsumadd();
			case EdcPackage.PROGRAMMING_TYPE__ERASEALGO:
				return getErasealgo();
			case EdcPackage.PROGRAMMING_TYPE__HASCHECKSUM:
				return getHaschecksum();
			case EdcPackage.PROGRAMMING_TYPE__HASROWERASECMD:
				return getHasrowerasecmd();
			case EdcPackage.PROGRAMMING_TYPE__HASVPPFIRST:
				return getHasvppfirst();
			case EdcPackage.PROGRAMMING_TYPE__LVPTHRESH:
				return getLvpthresh();
			case EdcPackage.PROGRAMMING_TYPE__MEMTECH:
				return getMemtech();
			case EdcPackage.PROGRAMMING_TYPE__OVRPGM:
				return getOvrpgm();
			case EdcPackage.PROGRAMMING_TYPE__TRIES:
				return getTries();
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
			case EdcPackage.PROGRAMMING_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__WAIT:
				setWait((WaitType)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__LATCHES:
				setLatches((LatchesType)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__BOUNDARY:
				setBoundary((Byte)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__CSUMADD:
				setCsumadd((String)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__ERASEALGO:
				setErasealgo((Byte)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__HASCHECKSUM:
				setHaschecksum((String)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__HASROWERASECMD:
				setHasrowerasecmd((String)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__HASVPPFIRST:
				setHasvppfirst((String)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__LVPTHRESH:
				setLvpthresh((Float)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__MEMTECH:
				setMemtech((String)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__OVRPGM:
				setOvrpgm((Byte)newValue);
				return;
			case EdcPackage.PROGRAMMING_TYPE__TRIES:
				setTries((Byte)newValue);
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
			case EdcPackage.PROGRAMMING_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.PROGRAMMING_TYPE__WAIT:
				setWait((WaitType)null);
				return;
			case EdcPackage.PROGRAMMING_TYPE__LATCHES:
				setLatches((LatchesType)null);
				return;
			case EdcPackage.PROGRAMMING_TYPE__BOUNDARY:
				unsetBoundary();
				return;
			case EdcPackage.PROGRAMMING_TYPE__CSUMADD:
				setCsumadd(CSUMADD_EDEFAULT);
				return;
			case EdcPackage.PROGRAMMING_TYPE__ERASEALGO:
				unsetErasealgo();
				return;
			case EdcPackage.PROGRAMMING_TYPE__HASCHECKSUM:
				setHaschecksum(HASCHECKSUM_EDEFAULT);
				return;
			case EdcPackage.PROGRAMMING_TYPE__HASROWERASECMD:
				setHasrowerasecmd(HASROWERASECMD_EDEFAULT);
				return;
			case EdcPackage.PROGRAMMING_TYPE__HASVPPFIRST:
				setHasvppfirst(HASVPPFIRST_EDEFAULT);
				return;
			case EdcPackage.PROGRAMMING_TYPE__LVPTHRESH:
				unsetLvpthresh();
				return;
			case EdcPackage.PROGRAMMING_TYPE__MEMTECH:
				setMemtech(MEMTECH_EDEFAULT);
				return;
			case EdcPackage.PROGRAMMING_TYPE__OVRPGM:
				unsetOvrpgm();
				return;
			case EdcPackage.PROGRAMMING_TYPE__TRIES:
				unsetTries();
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
			case EdcPackage.PROGRAMMING_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.PROGRAMMING_TYPE__WAIT:
				return getWait() != null;
			case EdcPackage.PROGRAMMING_TYPE__LATCHES:
				return getLatches() != null;
			case EdcPackage.PROGRAMMING_TYPE__BOUNDARY:
				return isSetBoundary();
			case EdcPackage.PROGRAMMING_TYPE__CSUMADD:
				return CSUMADD_EDEFAULT == null ? csumadd != null : !CSUMADD_EDEFAULT.equals(csumadd);
			case EdcPackage.PROGRAMMING_TYPE__ERASEALGO:
				return isSetErasealgo();
			case EdcPackage.PROGRAMMING_TYPE__HASCHECKSUM:
				return HASCHECKSUM_EDEFAULT == null ? haschecksum != null : !HASCHECKSUM_EDEFAULT.equals(haschecksum);
			case EdcPackage.PROGRAMMING_TYPE__HASROWERASECMD:
				return HASROWERASECMD_EDEFAULT == null ? hasrowerasecmd != null : !HASROWERASECMD_EDEFAULT.equals(hasrowerasecmd);
			case EdcPackage.PROGRAMMING_TYPE__HASVPPFIRST:
				return HASVPPFIRST_EDEFAULT == null ? hasvppfirst != null : !HASVPPFIRST_EDEFAULT.equals(hasvppfirst);
			case EdcPackage.PROGRAMMING_TYPE__LVPTHRESH:
				return isSetLvpthresh();
			case EdcPackage.PROGRAMMING_TYPE__MEMTECH:
				return MEMTECH_EDEFAULT == null ? memtech != null : !MEMTECH_EDEFAULT.equals(memtech);
			case EdcPackage.PROGRAMMING_TYPE__OVRPGM:
				return isSetOvrpgm();
			case EdcPackage.PROGRAMMING_TYPE__TRIES:
				return isSetTries();
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
		result.append(", boundary: ");
		if (boundaryESet) result.append(boundary); else result.append("<unset>");
		result.append(", csumadd: ");
		result.append(csumadd);
		result.append(", erasealgo: ");
		if (erasealgoESet) result.append(erasealgo); else result.append("<unset>");
		result.append(", haschecksum: ");
		result.append(haschecksum);
		result.append(", hasrowerasecmd: ");
		result.append(hasrowerasecmd);
		result.append(", hasvppfirst: ");
		result.append(hasvppfirst);
		result.append(", lvpthresh: ");
		if (lvpthreshESet) result.append(lvpthresh); else result.append("<unset>");
		result.append(", memtech: ");
		result.append(memtech);
		result.append(", ovrpgm: ");
		if (ovrpgmESet) result.append(ovrpgm); else result.append("<unset>");
		result.append(", tries: ");
		if (triesESet) result.append(tries); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProgrammingTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.Latches;
import microchip.device.memory.MemoryPackage;
import microchip.device.memory.Programming;
import microchip.device.memory.Wait;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programming</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getLatches <em>Latches</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getMemtech <em>Memtech</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getTries <em>Tries</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getLvpthresh <em>Lvpthresh</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getBoundary <em>Boundary</em>}</li>
 *   <li>{@link microchip.device.memory.impl.ProgrammingImpl#getPanelsize <em>Panelsize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgrammingImpl extends EObjectImpl implements Programming {
	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected Wait wait;

	/**
	 * The cached value of the '{@link #getLatches() <em>Latches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatches()
	 * @generated
	 * @ordered
	 */
	protected Latches latches;

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
	 * The default value of the '{@link #getTries() <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected static final int TRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTries() <em>Tries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTries()
	 * @generated
	 * @ordered
	 */
	protected int tries = TRIES_EDEFAULT;

	/**
	 * This is true if the Tries attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean triesESet;

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
	 * The default value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final int BOUNDARY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected int boundary = BOUNDARY_EDEFAULT;

	/**
	 * This is true if the Boundary attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean boundaryESet;

	/**
	 * The default value of the '{@link #getPanelsize() <em>Panelsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelsize()
	 * @generated
	 * @ordered
	 */
	protected static final int PANELSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPanelsize() <em>Panelsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanelsize()
	 * @generated
	 * @ordered
	 */
	protected int panelsize = PANELSIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.PROGRAMMING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wait getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(Wait newWait, NotificationChain msgs) {
		Wait oldWait = wait;
		wait = newWait;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__WAIT, oldWait, newWait);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(Wait newWait) {
		if (newWait != wait) {
			NotificationChain msgs = null;
			if (wait != null)
				msgs = ((InternalEObject)wait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.PROGRAMMING__WAIT, null, msgs);
			if (newWait != null)
				msgs = ((InternalEObject)newWait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.PROGRAMMING__WAIT, null, msgs);
			msgs = basicSetWait(newWait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__WAIT, newWait, newWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latches getLatches() {
		return latches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatches(Latches newLatches, NotificationChain msgs) {
		Latches oldLatches = latches;
		latches = newLatches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__LATCHES, oldLatches, newLatches);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatches(Latches newLatches) {
		if (newLatches != latches) {
			NotificationChain msgs = null;
			if (latches != null)
				msgs = ((InternalEObject)latches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.PROGRAMMING__LATCHES, null, msgs);
			if (newLatches != null)
				msgs = ((InternalEObject)newLatches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.PROGRAMMING__LATCHES, null, msgs);
			msgs = basicSetLatches(newLatches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__LATCHES, newLatches, newLatches));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__MEMTECH, oldMemtech, memtech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTries() {
		return tries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTries(int newTries) {
		int oldTries = tries;
		tries = newTries;
		boolean oldTriesESet = triesESet;
		triesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__TRIES, oldTries, tries, !oldTriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTries() {
		int oldTries = tries;
		boolean oldTriesESet = triesESet;
		tries = TRIES_EDEFAULT;
		triesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.PROGRAMMING__TRIES, oldTries, TRIES_EDEFAULT, oldTriesESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__LVPTHRESH, oldLvpthresh, lvpthresh, !oldLvpthreshESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.PROGRAMMING__LVPTHRESH, oldLvpthresh, LVPTHRESH_EDEFAULT, oldLvpthreshESet));
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
	public int getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundary(int newBoundary) {
		int oldBoundary = boundary;
		boundary = newBoundary;
		boolean oldBoundaryESet = boundaryESet;
		boundaryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__BOUNDARY, oldBoundary, boundary, !oldBoundaryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBoundary() {
		int oldBoundary = boundary;
		boolean oldBoundaryESet = boundaryESet;
		boundary = BOUNDARY_EDEFAULT;
		boundaryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MemoryPackage.PROGRAMMING__BOUNDARY, oldBoundary, BOUNDARY_EDEFAULT, oldBoundaryESet));
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
	public int getPanelsize() {
		return panelsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanelsize(int newPanelsize) {
		int oldPanelsize = panelsize;
		panelsize = newPanelsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.PROGRAMMING__PANELSIZE, oldPanelsize, panelsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemoryPackage.PROGRAMMING__WAIT:
				return basicSetWait(null, msgs);
			case MemoryPackage.PROGRAMMING__LATCHES:
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
			case MemoryPackage.PROGRAMMING__WAIT:
				return getWait();
			case MemoryPackage.PROGRAMMING__LATCHES:
				return getLatches();
			case MemoryPackage.PROGRAMMING__MEMTECH:
				return getMemtech();
			case MemoryPackage.PROGRAMMING__TRIES:
				return getTries();
			case MemoryPackage.PROGRAMMING__LVPTHRESH:
				return getLvpthresh();
			case MemoryPackage.PROGRAMMING__BOUNDARY:
				return getBoundary();
			case MemoryPackage.PROGRAMMING__PANELSIZE:
				return getPanelsize();
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
			case MemoryPackage.PROGRAMMING__WAIT:
				setWait((Wait)newValue);
				return;
			case MemoryPackage.PROGRAMMING__LATCHES:
				setLatches((Latches)newValue);
				return;
			case MemoryPackage.PROGRAMMING__MEMTECH:
				setMemtech((String)newValue);
				return;
			case MemoryPackage.PROGRAMMING__TRIES:
				setTries((Integer)newValue);
				return;
			case MemoryPackage.PROGRAMMING__LVPTHRESH:
				setLvpthresh((Float)newValue);
				return;
			case MemoryPackage.PROGRAMMING__BOUNDARY:
				setBoundary((Integer)newValue);
				return;
			case MemoryPackage.PROGRAMMING__PANELSIZE:
				setPanelsize((Integer)newValue);
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
			case MemoryPackage.PROGRAMMING__WAIT:
				setWait((Wait)null);
				return;
			case MemoryPackage.PROGRAMMING__LATCHES:
				setLatches((Latches)null);
				return;
			case MemoryPackage.PROGRAMMING__MEMTECH:
				setMemtech(MEMTECH_EDEFAULT);
				return;
			case MemoryPackage.PROGRAMMING__TRIES:
				unsetTries();
				return;
			case MemoryPackage.PROGRAMMING__LVPTHRESH:
				unsetLvpthresh();
				return;
			case MemoryPackage.PROGRAMMING__BOUNDARY:
				unsetBoundary();
				return;
			case MemoryPackage.PROGRAMMING__PANELSIZE:
				setPanelsize(PANELSIZE_EDEFAULT);
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
			case MemoryPackage.PROGRAMMING__WAIT:
				return wait != null;
			case MemoryPackage.PROGRAMMING__LATCHES:
				return latches != null;
			case MemoryPackage.PROGRAMMING__MEMTECH:
				return MEMTECH_EDEFAULT == null ? memtech != null : !MEMTECH_EDEFAULT.equals(memtech);
			case MemoryPackage.PROGRAMMING__TRIES:
				return isSetTries();
			case MemoryPackage.PROGRAMMING__LVPTHRESH:
				return isSetLvpthresh();
			case MemoryPackage.PROGRAMMING__BOUNDARY:
				return isSetBoundary();
			case MemoryPackage.PROGRAMMING__PANELSIZE:
				return panelsize != PANELSIZE_EDEFAULT;
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
		result.append(" (memtech: ");
		result.append(memtech);
		result.append(", tries: ");
		if (triesESet) result.append(tries); else result.append("<unset>");
		result.append(", lvpthresh: ");
		if (lvpthreshESet) result.append(lvpthresh); else result.append("<unset>");
		result.append(", boundary: ");
		if (boundaryESet) result.append(boundary); else result.append("<unset>");
		result.append(", panelsize: ");
		result.append(panelsize);
		result.append(')');
		return result.toString();
	}

} //ProgrammingImpl

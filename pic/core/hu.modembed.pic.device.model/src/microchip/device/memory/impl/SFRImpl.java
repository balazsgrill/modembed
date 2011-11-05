/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import java.util.Collection;

import microchip.device.memory.Bit;
import microchip.device.memory.MemoryPackage;
import microchip.device.memory.Reset;
import microchip.device.memory.SFR;
import microchip.device.memory.Stimulus;

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
 * An implementation of the model object '<em><b>SFR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getKey <em>Key</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getSize <em>Size</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getReset <em>Reset</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getBits <em>Bits</em>}</li>
 *   <li>{@link microchip.device.memory.impl.SFRImpl#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SFRImpl extends EObjectImpl implements SFR {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected int addr = ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected String flags = FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReset() <em>Reset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReset()
	 * @generated
	 * @ordered
	 */
	protected Reset reset;

	/**
	 * The cached value of the '{@link #getBits() <em>Bits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBits()
	 * @generated
	 * @ordered
	 */
	protected EList<Bit> bits;

	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Stimulus stimulus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SFRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.SFR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(int newAddr) {
		int oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(String newFlags) {
		String oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reset getReset() {
		return reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReset(Reset newReset, NotificationChain msgs) {
		Reset oldReset = reset;
		reset = newReset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__RESET, oldReset, newReset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReset(Reset newReset) {
		if (newReset != reset) {
			NotificationChain msgs = null;
			if (reset != null)
				msgs = ((InternalEObject)reset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.SFR__RESET, null, msgs);
			if (newReset != null)
				msgs = ((InternalEObject)newReset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.SFR__RESET, null, msgs);
			msgs = basicSetReset(newReset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__RESET, newReset, newReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bit> getBits() {
		if (bits == null) {
			bits = new EObjectContainmentEList<Bit>(Bit.class, this, MemoryPackage.SFR__BITS);
		}
		return bits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus getStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStimulus(Stimulus newStimulus, NotificationChain msgs) {
		Stimulus oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__STIMULUS, oldStimulus, newStimulus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(Stimulus newStimulus) {
		if (newStimulus != stimulus) {
			NotificationChain msgs = null;
			if (stimulus != null)
				msgs = ((InternalEObject)stimulus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.SFR__STIMULUS, null, msgs);
			if (newStimulus != null)
				msgs = ((InternalEObject)newStimulus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MemoryPackage.SFR__STIMULUS, null, msgs);
			msgs = basicSetStimulus(newStimulus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.SFR__STIMULUS, newStimulus, newStimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemoryPackage.SFR__RESET:
				return basicSetReset(null, msgs);
			case MemoryPackage.SFR__BITS:
				return ((InternalEList<?>)getBits()).basicRemove(otherEnd, msgs);
			case MemoryPackage.SFR__STIMULUS:
				return basicSetStimulus(null, msgs);
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
			case MemoryPackage.SFR__KEY:
				return getKey();
			case MemoryPackage.SFR__ADDR:
				return getAddr();
			case MemoryPackage.SFR__SIZE:
				return getSize();
			case MemoryPackage.SFR__FLAGS:
				return getFlags();
			case MemoryPackage.SFR__ACCESS:
				return getAccess();
			case MemoryPackage.SFR__RESET:
				return getReset();
			case MemoryPackage.SFR__BITS:
				return getBits();
			case MemoryPackage.SFR__STIMULUS:
				return getStimulus();
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
			case MemoryPackage.SFR__KEY:
				setKey((String)newValue);
				return;
			case MemoryPackage.SFR__ADDR:
				setAddr((Integer)newValue);
				return;
			case MemoryPackage.SFR__SIZE:
				setSize((Integer)newValue);
				return;
			case MemoryPackage.SFR__FLAGS:
				setFlags((String)newValue);
				return;
			case MemoryPackage.SFR__ACCESS:
				setAccess((String)newValue);
				return;
			case MemoryPackage.SFR__RESET:
				setReset((Reset)newValue);
				return;
			case MemoryPackage.SFR__BITS:
				getBits().clear();
				getBits().addAll((Collection<? extends Bit>)newValue);
				return;
			case MemoryPackage.SFR__STIMULUS:
				setStimulus((Stimulus)newValue);
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
			case MemoryPackage.SFR__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case MemoryPackage.SFR__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case MemoryPackage.SFR__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case MemoryPackage.SFR__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case MemoryPackage.SFR__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case MemoryPackage.SFR__RESET:
				setReset((Reset)null);
				return;
			case MemoryPackage.SFR__BITS:
				getBits().clear();
				return;
			case MemoryPackage.SFR__STIMULUS:
				setStimulus((Stimulus)null);
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
			case MemoryPackage.SFR__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case MemoryPackage.SFR__ADDR:
				return addr != ADDR_EDEFAULT;
			case MemoryPackage.SFR__SIZE:
				return size != SIZE_EDEFAULT;
			case MemoryPackage.SFR__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case MemoryPackage.SFR__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case MemoryPackage.SFR__RESET:
				return reset != null;
			case MemoryPackage.SFR__BITS:
				return bits != null && !bits.isEmpty();
			case MemoryPackage.SFR__STIMULUS:
				return stimulus != null;
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
		result.append(" (key: ");
		result.append(key);
		result.append(", addr: ");
		result.append(addr);
		result.append(", size: ");
		result.append(size);
		result.append(", flags: ");
		result.append(flags);
		result.append(", access: ");
		result.append(access);
		result.append(')');
		return result.toString();
	}

} //SFRImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.config.impl;

import java.util.Collection;
import microchip.device.config.CfgBits;
import microchip.device.config.ConfigPackage;

import microchip.device.config.Field;
import microchip.device.config.Illegal;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cfg Bits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.config.impl.CfgBitsImpl#getKey <em>Key</em>}</li>
 *   <li>{@link microchip.device.config.impl.CfgBitsImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link microchip.device.config.impl.CfgBitsImpl#getUnused <em>Unused</em>}</li>
 *   <li>{@link microchip.device.config.impl.CfgBitsImpl#getIllegals <em>Illegals</em>}</li>
 *   <li>{@link microchip.device.config.impl.CfgBitsImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CfgBitsImpl extends EObjectImpl implements CfgBits {
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
	 * This is true if the Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyESet;

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
	 * This is true if the Addr attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean addrESet;

	/**
	 * The default value of the '{@link #getUnused() <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnused()
	 * @generated
	 * @ordered
	 */
	protected static final int UNUSED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnused() <em>Unused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnused()
	 * @generated
	 * @ordered
	 */
	protected int unused = UNUSED_EDEFAULT;

	/**
	 * This is true if the Unused attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unusedESet;

	/**
	 * The cached value of the '{@link #getIllegals() <em>Illegals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIllegals()
	 * @generated
	 * @ordered
	 */
	protected EList<Illegal> illegals;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CfgBitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CFG_BITS;
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
		boolean oldKeyESet = keyESet;
		keyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CFG_BITS__KEY, oldKey, key, !oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKey() {
		String oldKey = key;
		boolean oldKeyESet = keyESet;
		key = KEY_EDEFAULT;
		keyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CFG_BITS__KEY, oldKey, KEY_EDEFAULT, oldKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKey() {
		return keyESet;
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
		boolean oldAddrESet = addrESet;
		addrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CFG_BITS__ADDR, oldAddr, addr, !oldAddrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAddr() {
		int oldAddr = addr;
		boolean oldAddrESet = addrESet;
		addr = ADDR_EDEFAULT;
		addrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CFG_BITS__ADDR, oldAddr, ADDR_EDEFAULT, oldAddrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAddr() {
		return addrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnused() {
		return unused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnused(int newUnused) {
		int oldUnused = unused;
		unused = newUnused;
		boolean oldUnusedESet = unusedESet;
		unusedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CFG_BITS__UNUSED, oldUnused, unused, !oldUnusedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnused() {
		int oldUnused = unused;
		boolean oldUnusedESet = unusedESet;
		unused = UNUSED_EDEFAULT;
		unusedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ConfigPackage.CFG_BITS__UNUSED, oldUnused, UNUSED_EDEFAULT, oldUnusedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnused() {
		return unusedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Illegal> getIllegals() {
		if (illegals == null) {
			illegals = new EObjectContainmentEList<Illegal>(Illegal.class, this, ConfigPackage.CFG_BITS__ILLEGALS);
		}
		return illegals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, ConfigPackage.CFG_BITS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.CFG_BITS__ILLEGALS:
				return ((InternalEList<?>)getIllegals()).basicRemove(otherEnd, msgs);
			case ConfigPackage.CFG_BITS__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.CFG_BITS__KEY:
				return getKey();
			case ConfigPackage.CFG_BITS__ADDR:
				return getAddr();
			case ConfigPackage.CFG_BITS__UNUSED:
				return getUnused();
			case ConfigPackage.CFG_BITS__ILLEGALS:
				return getIllegals();
			case ConfigPackage.CFG_BITS__FIELDS:
				return getFields();
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
			case ConfigPackage.CFG_BITS__KEY:
				setKey((String)newValue);
				return;
			case ConfigPackage.CFG_BITS__ADDR:
				setAddr((Integer)newValue);
				return;
			case ConfigPackage.CFG_BITS__UNUSED:
				setUnused((Integer)newValue);
				return;
			case ConfigPackage.CFG_BITS__ILLEGALS:
				getIllegals().clear();
				getIllegals().addAll((Collection<? extends Illegal>)newValue);
				return;
			case ConfigPackage.CFG_BITS__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
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
			case ConfigPackage.CFG_BITS__KEY:
				unsetKey();
				return;
			case ConfigPackage.CFG_BITS__ADDR:
				unsetAddr();
				return;
			case ConfigPackage.CFG_BITS__UNUSED:
				unsetUnused();
				return;
			case ConfigPackage.CFG_BITS__ILLEGALS:
				getIllegals().clear();
				return;
			case ConfigPackage.CFG_BITS__FIELDS:
				getFields().clear();
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
			case ConfigPackage.CFG_BITS__KEY:
				return isSetKey();
			case ConfigPackage.CFG_BITS__ADDR:
				return isSetAddr();
			case ConfigPackage.CFG_BITS__UNUSED:
				return isSetUnused();
			case ConfigPackage.CFG_BITS__ILLEGALS:
				return illegals != null && !illegals.isEmpty();
			case ConfigPackage.CFG_BITS__FIELDS:
				return fields != null && !fields.isEmpty();
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
		if (keyESet) result.append(key); else result.append("<unset>");
		result.append(", addr: ");
		if (addrESet) result.append(addr); else result.append("<unset>");
		result.append(", unused: ");
		if (unusedESet) result.append(unused); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CfgBitsImpl

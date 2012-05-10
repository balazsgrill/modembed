/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.VirtualPinType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Pin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.VirtualPinTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.VirtualPinTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.impl.VirtualPinTypeImpl#getPpsval <em>Ppsval</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualPinTypeImpl extends EObjectImpl implements VirtualPinType {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPpsval() <em>Ppsval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPpsval()
	 * @generated
	 * @ordered
	 */
	protected static final byte PPSVAL_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getPpsval() <em>Ppsval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPpsval()
	 * @generated
	 * @ordered
	 */
	protected byte ppsval = PPSVAL_EDEFAULT;

	/**
	 * This is true if the Ppsval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ppsvalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualPinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getVirtualPinType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VIRTUAL_PIN_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VIRTUAL_PIN_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getPpsval() {
		return ppsval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPpsval(byte newPpsval) {
		byte oldPpsval = ppsval;
		ppsval = newPpsval;
		boolean oldPpsvalESet = ppsvalESet;
		ppsvalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VIRTUAL_PIN_TYPE__PPSVAL, oldPpsval, ppsval, !oldPpsvalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPpsval() {
		byte oldPpsval = ppsval;
		boolean oldPpsvalESet = ppsvalESet;
		ppsval = PPSVAL_EDEFAULT;
		ppsvalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VIRTUAL_PIN_TYPE__PPSVAL, oldPpsval, PPSVAL_EDEFAULT, oldPpsvalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPpsval() {
		return ppsvalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.VIRTUAL_PIN_TYPE__VALUE:
				return getValue();
			case EdcPackage.VIRTUAL_PIN_TYPE__NAME:
				return getName();
			case EdcPackage.VIRTUAL_PIN_TYPE__PPSVAL:
				return getPpsval();
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
			case EdcPackage.VIRTUAL_PIN_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.VIRTUAL_PIN_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdcPackage.VIRTUAL_PIN_TYPE__PPSVAL:
				setPpsval((Byte)newValue);
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
			case EdcPackage.VIRTUAL_PIN_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.VIRTUAL_PIN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdcPackage.VIRTUAL_PIN_TYPE__PPSVAL:
				unsetPpsval();
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
			case EdcPackage.VIRTUAL_PIN_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.VIRTUAL_PIN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdcPackage.VIRTUAL_PIN_TYPE__PPSVAL:
				return isSetPpsval();
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
		result.append(", name: ");
		result.append(name);
		result.append(", ppsval: ");
		if (ppsvalESet) result.append(ppsval); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VirtualPinTypeImpl

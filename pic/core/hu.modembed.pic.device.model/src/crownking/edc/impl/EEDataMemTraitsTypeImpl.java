/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EEDataMemTraitsType;
import crownking.edc.EdcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EE Data Mem Traits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.EEDataMemTraitsTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.EEDataMemTraitsTypeImpl#getMagicoffset <em>Magicoffset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEDataMemTraitsTypeImpl extends EObjectImpl implements EEDataMemTraitsType {
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
	 * The default value of the '{@link #getMagicoffset() <em>Magicoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagicoffset()
	 * @generated
	 * @ordered
	 */
	protected static final String MAGICOFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMagicoffset() <em>Magicoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagicoffset()
	 * @generated
	 * @ordered
	 */
	protected String magicoffset = MAGICOFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEDataMemTraitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getEEDataMemTraitsType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.EE_DATA_MEM_TRAITS_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMagicoffset() {
		return magicoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagicoffset(String newMagicoffset) {
		String oldMagicoffset = magicoffset;
		magicoffset = newMagicoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.EE_DATA_MEM_TRAITS_TYPE__MAGICOFFSET, oldMagicoffset, magicoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__VALUE:
				return getValue();
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__MAGICOFFSET:
				return getMagicoffset();
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
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__MAGICOFFSET:
				setMagicoffset((String)newValue);
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
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__MAGICOFFSET:
				setMagicoffset(MAGICOFFSET_EDEFAULT);
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
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.EE_DATA_MEM_TRAITS_TYPE__MAGICOFFSET:
				return MAGICOFFSET_EDEFAULT == null ? magicoffset != null : !MAGICOFFSET_EDEFAULT.equals(magicoffset);
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
		result.append(", magicoffset: ");
		result.append(magicoffset);
		result.append(')');
		return result.toString();
	}

} //EEDataMemTraitsTypeImpl

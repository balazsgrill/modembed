/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.VPPType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPP Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.VPPTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.VPPTypeImpl#getDefaultvoltage <em>Defaultvoltage</em>}</li>
 *   <li>{@link crownking.edc.impl.VPPTypeImpl#getMaxvoltage <em>Maxvoltage</em>}</li>
 *   <li>{@link crownking.edc.impl.VPPTypeImpl#getMinvoltage <em>Minvoltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VPPTypeImpl extends EObjectImpl implements VPPType {
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
	 * The default value of the '{@link #getDefaultvoltage() <em>Defaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float DEFAULTVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDefaultvoltage() <em>Defaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvoltage()
	 * @generated
	 * @ordered
	 */
	protected float defaultvoltage = DEFAULTVOLTAGE_EDEFAULT;

	/**
	 * This is true if the Defaultvoltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultvoltageESet;

	/**
	 * The default value of the '{@link #getMaxvoltage() <em>Maxvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxvoltage() <em>Maxvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxvoltage()
	 * @generated
	 * @ordered
	 */
	protected float maxvoltage = MAXVOLTAGE_EDEFAULT;

	/**
	 * This is true if the Maxvoltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxvoltageESet;

	/**
	 * The default value of the '{@link #getMinvoltage() <em>Minvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MINVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinvoltage() <em>Minvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinvoltage()
	 * @generated
	 * @ordered
	 */
	protected float minvoltage = MINVOLTAGE_EDEFAULT;

	/**
	 * This is true if the Minvoltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minvoltageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPPTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getVPPType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VPP_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDefaultvoltage() {
		return defaultvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultvoltage(float newDefaultvoltage) {
		float oldDefaultvoltage = defaultvoltage;
		defaultvoltage = newDefaultvoltage;
		boolean oldDefaultvoltageESet = defaultvoltageESet;
		defaultvoltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VPP_TYPE__DEFAULTVOLTAGE, oldDefaultvoltage, defaultvoltage, !oldDefaultvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultvoltage() {
		float oldDefaultvoltage = defaultvoltage;
		boolean oldDefaultvoltageESet = defaultvoltageESet;
		defaultvoltage = DEFAULTVOLTAGE_EDEFAULT;
		defaultvoltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VPP_TYPE__DEFAULTVOLTAGE, oldDefaultvoltage, DEFAULTVOLTAGE_EDEFAULT, oldDefaultvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultvoltage() {
		return defaultvoltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxvoltage() {
		return maxvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxvoltage(float newMaxvoltage) {
		float oldMaxvoltage = maxvoltage;
		maxvoltage = newMaxvoltage;
		boolean oldMaxvoltageESet = maxvoltageESet;
		maxvoltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VPP_TYPE__MAXVOLTAGE, oldMaxvoltage, maxvoltage, !oldMaxvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxvoltage() {
		float oldMaxvoltage = maxvoltage;
		boolean oldMaxvoltageESet = maxvoltageESet;
		maxvoltage = MAXVOLTAGE_EDEFAULT;
		maxvoltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VPP_TYPE__MAXVOLTAGE, oldMaxvoltage, MAXVOLTAGE_EDEFAULT, oldMaxvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxvoltage() {
		return maxvoltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinvoltage() {
		return minvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinvoltage(float newMinvoltage) {
		float oldMinvoltage = minvoltage;
		minvoltage = newMinvoltage;
		boolean oldMinvoltageESet = minvoltageESet;
		minvoltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VPP_TYPE__MINVOLTAGE, oldMinvoltage, minvoltage, !oldMinvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinvoltage() {
		float oldMinvoltage = minvoltage;
		boolean oldMinvoltageESet = minvoltageESet;
		minvoltage = MINVOLTAGE_EDEFAULT;
		minvoltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VPP_TYPE__MINVOLTAGE, oldMinvoltage, MINVOLTAGE_EDEFAULT, oldMinvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinvoltage() {
		return minvoltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.VPP_TYPE__VALUE:
				return getValue();
			case EdcPackage.VPP_TYPE__DEFAULTVOLTAGE:
				return getDefaultvoltage();
			case EdcPackage.VPP_TYPE__MAXVOLTAGE:
				return getMaxvoltage();
			case EdcPackage.VPP_TYPE__MINVOLTAGE:
				return getMinvoltage();
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
			case EdcPackage.VPP_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.VPP_TYPE__DEFAULTVOLTAGE:
				setDefaultvoltage((Float)newValue);
				return;
			case EdcPackage.VPP_TYPE__MAXVOLTAGE:
				setMaxvoltage((Float)newValue);
				return;
			case EdcPackage.VPP_TYPE__MINVOLTAGE:
				setMinvoltage((Float)newValue);
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
			case EdcPackage.VPP_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.VPP_TYPE__DEFAULTVOLTAGE:
				unsetDefaultvoltage();
				return;
			case EdcPackage.VPP_TYPE__MAXVOLTAGE:
				unsetMaxvoltage();
				return;
			case EdcPackage.VPP_TYPE__MINVOLTAGE:
				unsetMinvoltage();
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
			case EdcPackage.VPP_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.VPP_TYPE__DEFAULTVOLTAGE:
				return isSetDefaultvoltage();
			case EdcPackage.VPP_TYPE__MAXVOLTAGE:
				return isSetMaxvoltage();
			case EdcPackage.VPP_TYPE__MINVOLTAGE:
				return isSetMinvoltage();
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
		result.append(", defaultvoltage: ");
		if (defaultvoltageESet) result.append(defaultvoltage); else result.append("<unset>");
		result.append(", maxvoltage: ");
		if (maxvoltageESet) result.append(maxvoltage); else result.append("<unset>");
		result.append(", minvoltage: ");
		if (minvoltageESet) result.append(minvoltage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VPPTypeImpl

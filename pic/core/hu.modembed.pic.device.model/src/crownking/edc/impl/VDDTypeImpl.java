/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.EdcPackage;
import crownking.edc.VDDType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VDD Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.VDDTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.VDDTypeImpl#getMaxdefaultvoltage <em>Maxdefaultvoltage</em>}</li>
 *   <li>{@link crownking.edc.impl.VDDTypeImpl#getMaxvoltage <em>Maxvoltage</em>}</li>
 *   <li>{@link crownking.edc.impl.VDDTypeImpl#getMindefaultvoltage <em>Mindefaultvoltage</em>}</li>
 *   <li>{@link crownking.edc.impl.VDDTypeImpl#getMinvoltage <em>Minvoltage</em>}</li>
 *   <li>{@link crownking.edc.impl.VDDTypeImpl#getNominalvoltage <em>Nominalvoltage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDDTypeImpl extends EObjectImpl implements VDDType {
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
	 * The default value of the '{@link #getMaxdefaultvoltage() <em>Maxdefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxdefaultvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXDEFAULTVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxdefaultvoltage() <em>Maxdefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxdefaultvoltage()
	 * @generated
	 * @ordered
	 */
	protected float maxdefaultvoltage = MAXDEFAULTVOLTAGE_EDEFAULT;

	/**
	 * This is true if the Maxdefaultvoltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxdefaultvoltageESet;

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
	 * The default value of the '{@link #getMindefaultvoltage() <em>Mindefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindefaultvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float MINDEFAULTVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMindefaultvoltage() <em>Mindefaultvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMindefaultvoltage()
	 * @generated
	 * @ordered
	 */
	protected float mindefaultvoltage = MINDEFAULTVOLTAGE_EDEFAULT;

	/**
	 * This is true if the Mindefaultvoltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mindefaultvoltageESet;

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
	 * The default value of the '{@link #getNominalvoltage() <em>Nominalvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalvoltage()
	 * @generated
	 * @ordered
	 */
	protected static final float NOMINALVOLTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getNominalvoltage() <em>Nominalvoltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalvoltage()
	 * @generated
	 * @ordered
	 */
	protected float nominalvoltage = NOMINALVOLTAGE_EDEFAULT;

	/**
	 * This is true if the Nominalvoltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalvoltageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VDDTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getVDDType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VDD_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxdefaultvoltage() {
		return maxdefaultvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxdefaultvoltage(float newMaxdefaultvoltage) {
		float oldMaxdefaultvoltage = maxdefaultvoltage;
		maxdefaultvoltage = newMaxdefaultvoltage;
		boolean oldMaxdefaultvoltageESet = maxdefaultvoltageESet;
		maxdefaultvoltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VDD_TYPE__MAXDEFAULTVOLTAGE, oldMaxdefaultvoltage, maxdefaultvoltage, !oldMaxdefaultvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxdefaultvoltage() {
		float oldMaxdefaultvoltage = maxdefaultvoltage;
		boolean oldMaxdefaultvoltageESet = maxdefaultvoltageESet;
		maxdefaultvoltage = MAXDEFAULTVOLTAGE_EDEFAULT;
		maxdefaultvoltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VDD_TYPE__MAXDEFAULTVOLTAGE, oldMaxdefaultvoltage, MAXDEFAULTVOLTAGE_EDEFAULT, oldMaxdefaultvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxdefaultvoltage() {
		return maxdefaultvoltageESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VDD_TYPE__MAXVOLTAGE, oldMaxvoltage, maxvoltage, !oldMaxvoltageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VDD_TYPE__MAXVOLTAGE, oldMaxvoltage, MAXVOLTAGE_EDEFAULT, oldMaxvoltageESet));
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
	public float getMindefaultvoltage() {
		return mindefaultvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMindefaultvoltage(float newMindefaultvoltage) {
		float oldMindefaultvoltage = mindefaultvoltage;
		mindefaultvoltage = newMindefaultvoltage;
		boolean oldMindefaultvoltageESet = mindefaultvoltageESet;
		mindefaultvoltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VDD_TYPE__MINDEFAULTVOLTAGE, oldMindefaultvoltage, mindefaultvoltage, !oldMindefaultvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMindefaultvoltage() {
		float oldMindefaultvoltage = mindefaultvoltage;
		boolean oldMindefaultvoltageESet = mindefaultvoltageESet;
		mindefaultvoltage = MINDEFAULTVOLTAGE_EDEFAULT;
		mindefaultvoltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VDD_TYPE__MINDEFAULTVOLTAGE, oldMindefaultvoltage, MINDEFAULTVOLTAGE_EDEFAULT, oldMindefaultvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMindefaultvoltage() {
		return mindefaultvoltageESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VDD_TYPE__MINVOLTAGE, oldMinvoltage, minvoltage, !oldMinvoltageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VDD_TYPE__MINVOLTAGE, oldMinvoltage, MINVOLTAGE_EDEFAULT, oldMinvoltageESet));
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
	public float getNominalvoltage() {
		return nominalvoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalvoltage(float newNominalvoltage) {
		float oldNominalvoltage = nominalvoltage;
		nominalvoltage = newNominalvoltage;
		boolean oldNominalvoltageESet = nominalvoltageESet;
		nominalvoltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.VDD_TYPE__NOMINALVOLTAGE, oldNominalvoltage, nominalvoltage, !oldNominalvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalvoltage() {
		float oldNominalvoltage = nominalvoltage;
		boolean oldNominalvoltageESet = nominalvoltageESet;
		nominalvoltage = NOMINALVOLTAGE_EDEFAULT;
		nominalvoltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdcPackage.VDD_TYPE__NOMINALVOLTAGE, oldNominalvoltage, NOMINALVOLTAGE_EDEFAULT, oldNominalvoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalvoltage() {
		return nominalvoltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.VDD_TYPE__VALUE:
				return getValue();
			case EdcPackage.VDD_TYPE__MAXDEFAULTVOLTAGE:
				return getMaxdefaultvoltage();
			case EdcPackage.VDD_TYPE__MAXVOLTAGE:
				return getMaxvoltage();
			case EdcPackage.VDD_TYPE__MINDEFAULTVOLTAGE:
				return getMindefaultvoltage();
			case EdcPackage.VDD_TYPE__MINVOLTAGE:
				return getMinvoltage();
			case EdcPackage.VDD_TYPE__NOMINALVOLTAGE:
				return getNominalvoltage();
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
			case EdcPackage.VDD_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.VDD_TYPE__MAXDEFAULTVOLTAGE:
				setMaxdefaultvoltage((Float)newValue);
				return;
			case EdcPackage.VDD_TYPE__MAXVOLTAGE:
				setMaxvoltage((Float)newValue);
				return;
			case EdcPackage.VDD_TYPE__MINDEFAULTVOLTAGE:
				setMindefaultvoltage((Float)newValue);
				return;
			case EdcPackage.VDD_TYPE__MINVOLTAGE:
				setMinvoltage((Float)newValue);
				return;
			case EdcPackage.VDD_TYPE__NOMINALVOLTAGE:
				setNominalvoltage((Float)newValue);
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
			case EdcPackage.VDD_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.VDD_TYPE__MAXDEFAULTVOLTAGE:
				unsetMaxdefaultvoltage();
				return;
			case EdcPackage.VDD_TYPE__MAXVOLTAGE:
				unsetMaxvoltage();
				return;
			case EdcPackage.VDD_TYPE__MINDEFAULTVOLTAGE:
				unsetMindefaultvoltage();
				return;
			case EdcPackage.VDD_TYPE__MINVOLTAGE:
				unsetMinvoltage();
				return;
			case EdcPackage.VDD_TYPE__NOMINALVOLTAGE:
				unsetNominalvoltage();
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
			case EdcPackage.VDD_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.VDD_TYPE__MAXDEFAULTVOLTAGE:
				return isSetMaxdefaultvoltage();
			case EdcPackage.VDD_TYPE__MAXVOLTAGE:
				return isSetMaxvoltage();
			case EdcPackage.VDD_TYPE__MINDEFAULTVOLTAGE:
				return isSetMindefaultvoltage();
			case EdcPackage.VDD_TYPE__MINVOLTAGE:
				return isSetMinvoltage();
			case EdcPackage.VDD_TYPE__NOMINALVOLTAGE:
				return isSetNominalvoltage();
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
		result.append(", maxdefaultvoltage: ");
		if (maxdefaultvoltageESet) result.append(maxdefaultvoltage); else result.append("<unset>");
		result.append(", maxvoltage: ");
		if (maxvoltageESet) result.append(maxvoltage); else result.append("<unset>");
		result.append(", mindefaultvoltage: ");
		if (mindefaultvoltageESet) result.append(mindefaultvoltage); else result.append("<unset>");
		result.append(", minvoltage: ");
		if (minvoltageESet) result.append(minvoltage); else result.append("<unset>");
		result.append(", nominalvoltage: ");
		if (nominalvoltageESet) result.append(nominalvoltage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VDDTypeImpl

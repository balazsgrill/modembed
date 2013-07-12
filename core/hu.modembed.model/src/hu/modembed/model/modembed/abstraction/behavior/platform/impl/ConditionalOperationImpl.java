/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform.impl;

import hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#getBitOffset <em>Bit Offset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#getValueOffset <em>Value Offset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#isEquals <em>Equals</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#isGreater <em>Greater</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#isLower <em>Lower</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#getCheckValue <em>Check Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalOperationImpl extends OperationStepImpl implements ConditionalOperation {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected OperationArgument value;

	/**
	 * The default value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitOffset() <em>Bit Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitOffset()
	 * @generated
	 * @ordered
	 */
	protected int bitOffset = BIT_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueOffset() <em>Value Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueOffset() <em>Value Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOffset()
	 * @generated
	 * @ordered
	 */
	protected int valueOffset = VALUE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #isEquals() <em>Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEquals()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EQUALS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEquals() <em>Equals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEquals()
	 * @generated
	 * @ordered
	 */
	protected boolean equals = EQUALS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGreater() <em>Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGreater()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GREATER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGreater() <em>Greater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGreater()
	 * @generated
	 * @ordered
	 */
	protected boolean greater = GREATER_EDEFAULT;

	/**
	 * The default value of the '{@link #isLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLower()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLower()
	 * @generated
	 * @ordered
	 */
	protected boolean lower = LOWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckValue() <em>Check Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CHECK_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCheckValue() <em>Check Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckValue()
	 * @generated
	 * @ordered
	 */
	protected int checkValue = CHECK_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final int MASK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected int mask = MASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.CONDITIONAL_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationArgument getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (OperationArgument)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.CONDITIONAL_OPERATION__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationArgument basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(OperationArgument newValue) {
		OperationArgument oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitOffset() {
		return bitOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitOffset(int newBitOffset) {
		int oldBitOffset = bitOffset;
		bitOffset = newBitOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__BIT_OFFSET, oldBitOffset, bitOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValueOffset() {
		return valueOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOffset(int newValueOffset) {
		int oldValueOffset = valueOffset;
		valueOffset = newValueOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__VALUE_OFFSET, oldValueOffset, valueOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEquals() {
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquals(boolean newEquals) {
		boolean oldEquals = equals;
		equals = newEquals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__EQUALS, oldEquals, equals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGreater() {
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreater(boolean newGreater) {
		boolean oldGreater = greater;
		greater = newGreater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__GREATER, oldGreater, greater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(boolean newLower) {
		boolean oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCheckValue() {
		return checkValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckValue(int newCheckValue) {
		int oldCheckValue = checkValue;
		checkValue = newCheckValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__CHECK_VALUE, oldCheckValue, checkValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(int newMask) {
		int oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.CONDITIONAL_OPERATION__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<OperationStep>(OperationStep.class, this, PlatformPackage.CONDITIONAL_OPERATION__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.CONDITIONAL_OPERATION__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PlatformPackage.CONDITIONAL_OPERATION__BIT_OFFSET:
				return getBitOffset();
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE_OFFSET:
				return getValueOffset();
			case PlatformPackage.CONDITIONAL_OPERATION__EQUALS:
				return isEquals();
			case PlatformPackage.CONDITIONAL_OPERATION__GREATER:
				return isGreater();
			case PlatformPackage.CONDITIONAL_OPERATION__LOWER:
				return isLower();
			case PlatformPackage.CONDITIONAL_OPERATION__CHECK_VALUE:
				return getCheckValue();
			case PlatformPackage.CONDITIONAL_OPERATION__MASK:
				return getMask();
			case PlatformPackage.CONDITIONAL_OPERATION__STEPS:
				return getSteps();
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
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE:
				setValue((OperationArgument)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__BIT_OFFSET:
				setBitOffset((Integer)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE_OFFSET:
				setValueOffset((Integer)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__EQUALS:
				setEquals((Boolean)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__GREATER:
				setGreater((Boolean)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__LOWER:
				setLower((Boolean)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__CHECK_VALUE:
				setCheckValue((Integer)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__MASK:
				setMask((Integer)newValue);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends OperationStep>)newValue);
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
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE:
				setValue((OperationArgument)null);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__BIT_OFFSET:
				setBitOffset(BIT_OFFSET_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE_OFFSET:
				setValueOffset(VALUE_OFFSET_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__EQUALS:
				setEquals(EQUALS_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__GREATER:
				setGreater(GREATER_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__CHECK_VALUE:
				setCheckValue(CHECK_VALUE_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case PlatformPackage.CONDITIONAL_OPERATION__STEPS:
				getSteps().clear();
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
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE:
				return value != null;
			case PlatformPackage.CONDITIONAL_OPERATION__BIT_OFFSET:
				return bitOffset != BIT_OFFSET_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__VALUE_OFFSET:
				return valueOffset != VALUE_OFFSET_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__EQUALS:
				return equals != EQUALS_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__GREATER:
				return greater != GREATER_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__LOWER:
				return lower != LOWER_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__CHECK_VALUE:
				return checkValue != CHECK_VALUE_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__MASK:
				return mask != MASK_EDEFAULT;
			case PlatformPackage.CONDITIONAL_OPERATION__STEPS:
				return steps != null && !steps.isEmpty();
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
		result.append(" (bitOffset: ");
		result.append(bitOffset);
		result.append(", valueOffset: ");
		result.append(valueOffset);
		result.append(", equals: ");
		result.append(equals);
		result.append(", greater: ");
		result.append(greater);
		result.append(", lower: ");
		result.append(lower);
		result.append(", checkValue: ");
		result.append(checkValue);
		result.append(", mask: ");
		result.append(mask);
		result.append(')');
		return result.toString();
	}

} //ConditionalOperationImpl

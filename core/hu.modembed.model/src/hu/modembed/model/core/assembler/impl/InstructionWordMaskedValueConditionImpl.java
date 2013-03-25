/**
 */
package hu.modembed.model.core.assembler.impl;

import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.InstructionParameter;
import hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Word Masked Value Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionWordMaskedValueConditionImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionWordMaskedValueConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionWordMaskedValueConditionImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionWordMaskedValueConditionImpl extends InstructionWordConditionImpl implements InstructionWordMaskedValueCondition {
	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final long MASK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected long mask = MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final long VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected InstructionParameter argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionWordMaskedValueConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblerPackage.Literals.INSTRUCTION_WORD_MASKED_VALUE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(long newMask) {
		long oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (InstructionParameter)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(InstructionParameter newArgument) {
		InstructionParameter oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK:
				return getMask();
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE:
				return getValue();
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
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
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK:
				setMask((Long)newValue);
				return;
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE:
				setValue((Long)newValue);
				return;
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT:
				setArgument((InstructionParameter)newValue);
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
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT:
				setArgument((InstructionParameter)null);
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
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK:
				return mask != MASK_EDEFAULT;
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE:
				return value != VALUE_EDEFAULT;
			case AssemblerPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT:
				return argument != null;
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
		result.append(" (mask: ");
		result.append(mask);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //InstructionWordMaskedValueConditionImpl

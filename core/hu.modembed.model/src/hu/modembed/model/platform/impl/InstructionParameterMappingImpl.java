/**
 */
package hu.modembed.model.platform.impl;

import hu.modembed.model.core.impl.MODembedElementImpl;

import hu.modembed.model.platform.InstructionParameterMapping;
import hu.modembed.model.platform.OperationArgument;
import hu.modembed.model.platform.PlatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.impl.InstructionParameterMappingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.platform.impl.InstructionParameterMappingImpl#getBitOffset <em>Bit Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionParameterMappingImpl extends MODembedElementImpl implements InstructionParameterMapping {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionParameterMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.INSTRUCTION_PARAMETER_MAPPING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET, oldBitOffset, bitOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET:
				return getBitOffset();
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
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE:
				setValue((OperationArgument)newValue);
				return;
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET:
				setBitOffset((Integer)newValue);
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
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE:
				setValue((OperationArgument)null);
				return;
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET:
				setBitOffset(BIT_OFFSET_EDEFAULT);
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
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__VALUE:
				return value != null;
			case PlatformPackage.INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET:
				return bitOffset != BIT_OFFSET_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //InstructionParameterMappingImpl

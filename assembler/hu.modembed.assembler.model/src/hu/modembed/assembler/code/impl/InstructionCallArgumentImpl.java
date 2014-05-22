/**
 */
package hu.modembed.assembler.code.impl;

import hu.modembed.assembler.code.CodePackage;
import hu.modembed.assembler.code.InstructionCallArgument;

import hu.modembed.assembler.instructionset.InstructionParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Call Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.assembler.code.impl.InstructionCallArgumentImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.impl.InstructionCallArgumentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.impl.InstructionCallArgumentImpl#isLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionCallArgumentImpl extends MinimalEObjectImpl.Container implements InstructionCallArgument {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected InstructionParameter definition;

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
	 * The default value of the '{@link #isLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LABEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLabel()
	 * @generated
	 * @ordered
	 */
	protected boolean label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionCallArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodePackage.Literals.INSTRUCTION_CALL_ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (InstructionParameter)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodePackage.INSTRUCTION_CALL_ARGUMENT__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionParameter basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(InstructionParameter newDefinition) {
		InstructionParameter oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.INSTRUCTION_CALL_ARGUMENT__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.INSTRUCTION_CALL_ARGUMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(boolean newLabel) {
		boolean oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodePackage.INSTRUCTION_CALL_ARGUMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__VALUE:
				return getValue();
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__LABEL:
				return isLabel();
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
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__DEFINITION:
				setDefinition((InstructionParameter)newValue);
				return;
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__VALUE:
				setValue((Long)newValue);
				return;
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__LABEL:
				setLabel((Boolean)newValue);
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
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__DEFINITION:
				setDefinition((InstructionParameter)null);
				return;
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__DEFINITION:
				return definition != null;
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case CodePackage.INSTRUCTION_CALL_ARGUMENT__LABEL:
				return label != LABEL_EDEFAULT;
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //InstructionCallArgumentImpl

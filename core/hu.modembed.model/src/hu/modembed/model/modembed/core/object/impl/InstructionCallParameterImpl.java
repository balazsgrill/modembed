/**
 */
package hu.modembed.model.modembed.core.object.impl;

import hu.modembed.model.modembed.core.instructionset.InstructionParameter;

import hu.modembed.model.modembed.core.object.InstructionCallParameter;
import hu.modembed.model.modembed.core.object.ObjectPackage;

import hu.modembed.model.modembed.infrastructure.impl.MODembedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Call Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl#isLabel <em>Label</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.InstructionCallParameterImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionCallParameterImpl extends MODembedElementImpl implements InstructionCallParameter {
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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected InstructionParameter definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionCallParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectPackage.Literals.INSTRUCTION_CALL_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.INSTRUCTION_CALL_PARAMETER__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.INSTRUCTION_CALL_PARAMETER__LABEL, oldLabel, label));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectPackage.INSTRUCTION_CALL_PARAMETER__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.INSTRUCTION_CALL_PARAMETER__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__VALUE:
				return getValue();
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__LABEL:
				return isLabel();
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__VALUE:
				setValue((Long)newValue);
				return;
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__LABEL:
				setLabel((Boolean)newValue);
				return;
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__DEFINITION:
				setDefinition((InstructionParameter)newValue);
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
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__DEFINITION:
				setDefinition((InstructionParameter)null);
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
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__VALUE:
				return value != VALUE_EDEFAULT;
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__LABEL:
				return label != LABEL_EDEFAULT;
			case ObjectPackage.INSTRUCTION_CALL_PARAMETER__DEFINITION:
				return definition != null;
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

} //InstructionCallParameterImpl

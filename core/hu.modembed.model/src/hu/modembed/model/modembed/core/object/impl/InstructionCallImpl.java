/**
 */
package hu.modembed.model.modembed.core.object.impl;

import hu.modembed.model.modembed.core.instructionset.Instruction;

import hu.modembed.model.modembed.core.object.InstructionCall;
import hu.modembed.model.modembed.core.object.InstructionCallParameter;
import hu.modembed.model.modembed.core.object.ObjectPackage;

import hu.modembed.model.modembed.infrastructure.impl.MODembedElementImpl;

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
 * An implementation of the model object '<em><b>Instruction Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.InstructionCallImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.core.object.impl.InstructionCallImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionCallImpl extends MODembedElementImpl implements InstructionCall {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionCallParameter> parameters;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected Instruction instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectPackage.Literals.INSTRUCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionCallParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<InstructionCallParameter>(InstructionCallParameter.class, this, ObjectPackage.INSTRUCTION_CALL__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getInstruction() {
		if (instruction != null && instruction.eIsProxy()) {
			InternalEObject oldInstruction = (InternalEObject)instruction;
			instruction = (Instruction)eResolveProxy(oldInstruction);
			if (instruction != oldInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectPackage.INSTRUCTION_CALL__INSTRUCTION, oldInstruction, instruction));
			}
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(Instruction newInstruction) {
		Instruction oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.INSTRUCTION_CALL__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectPackage.INSTRUCTION_CALL__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case ObjectPackage.INSTRUCTION_CALL__PARAMETERS:
				return getParameters();
			case ObjectPackage.INSTRUCTION_CALL__INSTRUCTION:
				if (resolve) return getInstruction();
				return basicGetInstruction();
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
			case ObjectPackage.INSTRUCTION_CALL__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends InstructionCallParameter>)newValue);
				return;
			case ObjectPackage.INSTRUCTION_CALL__INSTRUCTION:
				setInstruction((Instruction)newValue);
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
			case ObjectPackage.INSTRUCTION_CALL__PARAMETERS:
				getParameters().clear();
				return;
			case ObjectPackage.INSTRUCTION_CALL__INSTRUCTION:
				setInstruction((Instruction)null);
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
			case ObjectPackage.INSTRUCTION_CALL__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ObjectPackage.INSTRUCTION_CALL__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionCallImpl

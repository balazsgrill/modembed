/**
 */
package hu.modembed.model.core.assembler.impl;

import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionSet;

import hu.modembed.model.core.impl.RootElementImpl;

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
 * An implementation of the model object '<em><b>Instruction Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionSetImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.impl.InstructionSetImpl#getExtend <em>Extend</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionSetImpl extends RootElementImpl implements InstructionSet {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected InstructionSet extend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblerPackage.Literals.INSTRUCTION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this, AssemblerPackage.INSTRUCTION_SET__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet getExtend() {
		if (extend != null && extend.eIsProxy()) {
			InternalEObject oldExtend = (InternalEObject)extend;
			extend = (InstructionSet)eResolveProxy(oldExtend);
			if (extend != oldExtend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssemblerPackage.INSTRUCTION_SET__EXTEND, oldExtend, extend));
			}
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet basicGetExtend() {
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtend(InstructionSet newExtend) {
		InstructionSet oldExtend = extend;
		extend = newExtend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblerPackage.INSTRUCTION_SET__EXTEND, oldExtend, extend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblerPackage.INSTRUCTION_SET__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
			case AssemblerPackage.INSTRUCTION_SET__INSTRUCTIONS:
				return getInstructions();
			case AssemblerPackage.INSTRUCTION_SET__EXTEND:
				if (resolve) return getExtend();
				return basicGetExtend();
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
			case AssemblerPackage.INSTRUCTION_SET__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends Instruction>)newValue);
				return;
			case AssemblerPackage.INSTRUCTION_SET__EXTEND:
				setExtend((InstructionSet)newValue);
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
			case AssemblerPackage.INSTRUCTION_SET__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case AssemblerPackage.INSTRUCTION_SET__EXTEND:
				setExtend((InstructionSet)null);
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
			case AssemblerPackage.INSTRUCTION_SET__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case AssemblerPackage.INSTRUCTION_SET__EXTEND:
				return extend != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionSetImpl

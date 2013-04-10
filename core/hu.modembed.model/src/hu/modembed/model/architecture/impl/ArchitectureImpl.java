/**
 */
package hu.modembed.model.architecture.impl;

import hu.modembed.model.abstraction.types.Type;

import hu.modembed.model.architecture.Architecture;
import hu.modembed.model.architecture.ArchitecturePackage;
import hu.modembed.model.architecture.MemorySection;

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
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.architecture.impl.ArchitectureImpl#getHeapPointerType <em>Heap Pointer Type</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.impl.ArchitectureImpl#getCodePointerType <em>Code Pointer Type</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.impl.ArchitectureImpl#getInstructionSet <em>Instruction Set</em>}</li>
 *   <li>{@link hu.modembed.model.architecture.impl.ArchitectureImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureImpl extends RootElementImpl implements Architecture {
	/**
	 * The cached value of the '{@link #getHeapPointerType() <em>Heap Pointer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapPointerType()
	 * @generated
	 * @ordered
	 */
	protected Type heapPointerType;

	/**
	 * The cached value of the '{@link #getCodePointerType() <em>Code Pointer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePointerType()
	 * @generated
	 * @ordered
	 */
	protected Type codePointerType;

	/**
	 * The cached value of the '{@link #getInstructionSet() <em>Instruction Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionSet()
	 * @generated
	 * @ordered
	 */
	protected InstructionSet instructionSet;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<MemorySection> memory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getHeapPointerType() {
		if (heapPointerType != null && heapPointerType.eIsProxy()) {
			InternalEObject oldHeapPointerType = (InternalEObject)heapPointerType;
			heapPointerType = (Type)eResolveProxy(oldHeapPointerType);
			if (heapPointerType != oldHeapPointerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE, oldHeapPointerType, heapPointerType));
			}
		}
		return heapPointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetHeapPointerType() {
		return heapPointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeapPointerType(Type newHeapPointerType) {
		Type oldHeapPointerType = heapPointerType;
		heapPointerType = newHeapPointerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE, oldHeapPointerType, heapPointerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getCodePointerType() {
		if (codePointerType != null && codePointerType.eIsProxy()) {
			InternalEObject oldCodePointerType = (InternalEObject)codePointerType;
			codePointerType = (Type)eResolveProxy(oldCodePointerType);
			if (codePointerType != oldCodePointerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE, oldCodePointerType, codePointerType));
			}
		}
		return codePointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetCodePointerType() {
		return codePointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePointerType(Type newCodePointerType) {
		Type oldCodePointerType = codePointerType;
		codePointerType = newCodePointerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE, oldCodePointerType, codePointerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet getInstructionSet() {
		if (instructionSet != null && instructionSet.eIsProxy()) {
			InternalEObject oldInstructionSet = (InternalEObject)instructionSet;
			instructionSet = (InstructionSet)eResolveProxy(oldInstructionSet);
			if (instructionSet != oldInstructionSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET, oldInstructionSet, instructionSet));
			}
		}
		return instructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet basicGetInstructionSet() {
		return instructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionSet(InstructionSet newInstructionSet) {
		InstructionSet oldInstructionSet = instructionSet;
		instructionSet = newInstructionSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET, oldInstructionSet, instructionSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemorySection> getMemory() {
		if (memory == null) {
			memory = new EObjectContainmentEList<MemorySection>(MemorySection.class, this, ArchitecturePackage.ARCHITECTURE__MEMORY);
		}
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.ARCHITECTURE__MEMORY:
				return ((InternalEList<?>)getMemory()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE:
				if (resolve) return getHeapPointerType();
				return basicGetHeapPointerType();
			case ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE:
				if (resolve) return getCodePointerType();
				return basicGetCodePointerType();
			case ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET:
				if (resolve) return getInstructionSet();
				return basicGetInstructionSet();
			case ArchitecturePackage.ARCHITECTURE__MEMORY:
				return getMemory();
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
			case ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE:
				setHeapPointerType((Type)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE:
				setCodePointerType((Type)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET:
				setInstructionSet((InstructionSet)newValue);
				return;
			case ArchitecturePackage.ARCHITECTURE__MEMORY:
				getMemory().clear();
				getMemory().addAll((Collection<? extends MemorySection>)newValue);
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
			case ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE:
				setHeapPointerType((Type)null);
				return;
			case ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE:
				setCodePointerType((Type)null);
				return;
			case ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET:
				setInstructionSet((InstructionSet)null);
				return;
			case ArchitecturePackage.ARCHITECTURE__MEMORY:
				getMemory().clear();
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
			case ArchitecturePackage.ARCHITECTURE__HEAP_POINTER_TYPE:
				return heapPointerType != null;
			case ArchitecturePackage.ARCHITECTURE__CODE_POINTER_TYPE:
				return codePointerType != null;
			case ArchitecturePackage.ARCHITECTURE__INSTRUCTION_SET:
				return instructionSet != null;
			case ArchitecturePackage.ARCHITECTURE__MEMORY:
				return memory != null && !memory.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureImpl

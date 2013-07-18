/**
 */
package hu.modembed.model.modembed.abstraction.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.abstraction.DeviceAbstraction;

import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;

import hu.modembed.model.modembed.core.instructionset.InstructionSet;

import hu.modembed.model.modembed.infrastructure.impl.RootElementImpl;

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
 * An implementation of the model object '<em><b>Device Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getAncestor <em>Ancestor</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getInstructionset <em>Instructionset</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getMemoryTypes <em>Memory Types</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getMemoryInstances <em>Memory Instances</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceAbstractionImpl extends RootElementImpl implements DeviceAbstraction {
	/**
	 * The cached value of the '{@link #getAncestor() <em>Ancestor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAncestor()
	 * @generated
	 * @ordered
	 */
	protected DeviceAbstraction ancestor;

	/**
	 * The cached value of the '{@link #getInstructionset() <em>Instructionset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionset()
	 * @generated
	 * @ordered
	 */
	protected InstructionSet instructionset;

	/**
	 * The cached value of the '{@link #getMemoryTypes() <em>Memory Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryType> memoryTypes;

	/**
	 * The cached value of the '{@link #getMemoryInstances() <em>Memory Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryInstance> memoryInstances;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinition> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceAbstractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractionPackage.Literals.DEVICE_ABSTRACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAbstraction getAncestor() {
		if (ancestor != null && ancestor.eIsProxy()) {
			InternalEObject oldAncestor = (InternalEObject)ancestor;
			ancestor = (DeviceAbstraction)eResolveProxy(oldAncestor);
			if (ancestor != oldAncestor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR, oldAncestor, ancestor));
			}
		}
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAbstraction basicGetAncestor() {
		return ancestor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAncestor(DeviceAbstraction newAncestor) {
		DeviceAbstraction oldAncestor = ancestor;
		ancestor = newAncestor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR, oldAncestor, ancestor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet getInstructionset() {
		if (instructionset != null && instructionset.eIsProxy()) {
			InternalEObject oldInstructionset = (InternalEObject)instructionset;
			instructionset = (InstructionSet)eResolveProxy(oldInstructionset);
			if (instructionset != oldInstructionset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET, oldInstructionset, instructionset));
			}
		}
		return instructionset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionSet basicGetInstructionset() {
		return instructionset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionset(InstructionSet newInstructionset) {
		InstructionSet oldInstructionset = instructionset;
		instructionset = newInstructionset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET, oldInstructionset, instructionset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryType> getMemoryTypes() {
		if (memoryTypes == null) {
			memoryTypes = new EObjectContainmentEList<MemoryType>(MemoryType.class, this, AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES);
		}
		return memoryTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryInstance> getMemoryInstances() {
		if (memoryInstances == null) {
			memoryInstances = new EObjectContainmentEList<MemoryInstance>(MemoryInstance.class, this, AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES);
		}
		return memoryInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinition> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OperationDefinition>(OperationDefinition.class, this, AbstractionPackage.DEVICE_ABSTRACTION__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				return ((InternalEList<?>)getMemoryTypes()).basicRemove(otherEnd, msgs);
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				return ((InternalEList<?>)getMemoryInstances()).basicRemove(otherEnd, msgs);
			case AbstractionPackage.DEVICE_ABSTRACTION__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
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
			case AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR:
				if (resolve) return getAncestor();
				return basicGetAncestor();
			case AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET:
				if (resolve) return getInstructionset();
				return basicGetInstructionset();
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				return getMemoryTypes();
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				return getMemoryInstances();
			case AbstractionPackage.DEVICE_ABSTRACTION__OPERATION:
				return getOperation();
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
			case AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR:
				setAncestor((DeviceAbstraction)newValue);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET:
				setInstructionset((InstructionSet)newValue);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				getMemoryTypes().clear();
				getMemoryTypes().addAll((Collection<? extends MemoryType>)newValue);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				getMemoryInstances().clear();
				getMemoryInstances().addAll((Collection<? extends MemoryInstance>)newValue);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OperationDefinition>)newValue);
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
			case AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR:
				setAncestor((DeviceAbstraction)null);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET:
				setInstructionset((InstructionSet)null);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				getMemoryTypes().clear();
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				getMemoryInstances().clear();
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__OPERATION:
				getOperation().clear();
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
			case AbstractionPackage.DEVICE_ABSTRACTION__ANCESTOR:
				return ancestor != null;
			case AbstractionPackage.DEVICE_ABSTRACTION__INSTRUCTIONSET:
				return instructionset != null;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				return memoryTypes != null && !memoryTypes.isEmpty();
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				return memoryInstances != null && !memoryInstances.isEmpty();
			case AbstractionPackage.DEVICE_ABSTRACTION__OPERATION:
				return operation != null && !operation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceAbstractionImpl

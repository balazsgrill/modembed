/**
 */
package hu.modembed.model.modembed.abstraction.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.abstraction.DeviceAbstraction;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;

import hu.modembed.model.modembed.infrastructure.impl.RootElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Abstraction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getMemoryTypes <em>Memory Types</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.impl.DeviceAbstractionImpl#getMemoryInstances <em>Memory Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceAbstractionImpl extends RootElementImpl implements DeviceAbstraction {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				return ((InternalEList<?>)getMemoryTypes()).basicRemove(otherEnd, msgs);
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				return ((InternalEList<?>)getMemoryInstances()).basicRemove(otherEnd, msgs);
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
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				return getMemoryTypes();
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				return getMemoryInstances();
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
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				getMemoryTypes().clear();
				getMemoryTypes().addAll((Collection<? extends MemoryType>)newValue);
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				getMemoryInstances().clear();
				getMemoryInstances().addAll((Collection<? extends MemoryInstance>)newValue);
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
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				getMemoryTypes().clear();
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				getMemoryInstances().clear();
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
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
				return memoryTypes != null && !memoryTypes.isEmpty();
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
				return memoryInstances != null && !memoryInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceAbstractionImpl

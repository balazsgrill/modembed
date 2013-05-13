/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;

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
 * An implementation of the model object '<em><b>Sequential Behavior Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getSymbolMappings <em>Symbol Mappings</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getBehaviorModels <em>Behavior Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialBehaviorModuleImpl extends RootElementImpl implements SequentialBehaviorModule {
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected DeviceAbstraction device;

	/**
	 * The cached value of the '{@link #getSymbolMappings() <em>Symbol Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolValueAssignment> symbolMappings;

	/**
	 * The cached value of the '{@link #getBehaviorModels() <em>Behavior Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SequentialBehavior> behaviorModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialBehaviorModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAbstraction getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (DeviceAbstraction)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAbstraction basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(DeviceAbstraction newDevice) {
		DeviceAbstraction oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolValueAssignment> getSymbolMappings() {
		if (symbolMappings == null) {
			symbolMappings = new EObjectContainmentEList<SymbolValueAssignment>(SymbolValueAssignment.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS);
		}
		return symbolMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequentialBehavior> getBehaviorModels() {
		if (behaviorModels == null) {
			behaviorModels = new EObjectContainmentEList<SequentialBehavior>(SequentialBehavior.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS);
		}
		return behaviorModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS:
				return ((InternalEList<?>)getSymbolMappings()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS:
				return ((InternalEList<?>)getBehaviorModels()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS:
				return getSymbolMappings();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS:
				return getBehaviorModels();
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__DEVICE:
				setDevice((DeviceAbstraction)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS:
				getSymbolMappings().clear();
				getSymbolMappings().addAll((Collection<? extends SymbolValueAssignment>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS:
				getBehaviorModels().clear();
				getBehaviorModels().addAll((Collection<? extends SequentialBehavior>)newValue);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__DEVICE:
				setDevice((DeviceAbstraction)null);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS:
				getSymbolMappings().clear();
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS:
				getBehaviorModels().clear();
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__DEVICE:
				return device != null;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS:
				return symbolMappings != null && !symbolMappings.isEmpty();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS:
				return behaviorModels != null && !behaviorModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequentialBehaviorModuleImpl

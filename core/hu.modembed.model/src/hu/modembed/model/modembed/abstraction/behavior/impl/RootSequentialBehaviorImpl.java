/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;

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
 * An implementation of the model object '<em><b>Root Sequential Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.RootSequentialBehaviorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.RootSequentialBehaviorImpl#getLocalSymbols <em>Local Symbols</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.RootSequentialBehaviorImpl#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootSequentialBehaviorImpl extends RootElementImpl implements RootSequentialBehavior {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<SequentialAction> actions;

	/**
	 * The cached value of the '{@link #getLocalSymbols() <em>Local Symbols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSymbols()
	 * @generated
	 * @ordered
	 */
	protected EList<SymbolAssignment> localSymbols;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootSequentialBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.ROOT_SEQUENTIAL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequentialAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<SequentialAction>(SequentialAction.class, this, BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolAssignment> getLocalSymbols() {
		if (localSymbols == null) {
			localSymbols = new EObjectContainmentEList<SymbolAssignment>(SymbolAssignment.class, this, BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS);
		}
		return localSymbols;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__DEVICE, oldDevice, device));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				return ((InternalEList<?>)getLocalSymbols()).basicRemove(otherEnd, msgs);
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
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS:
				return getActions();
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				return getLocalSymbols();
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
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
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends SequentialAction>)newValue);
				return;
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				getLocalSymbols().clear();
				getLocalSymbols().addAll((Collection<? extends SymbolAssignment>)newValue);
				return;
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__DEVICE:
				setDevice((DeviceAbstraction)newValue);
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
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS:
				getActions().clear();
				return;
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				getLocalSymbols().clear();
				return;
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__DEVICE:
				setDevice((DeviceAbstraction)null);
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
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				return localSymbols != null && !localSymbols.isEmpty();
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__DEVICE:
				return device != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SequentialBehavior.class) {
			switch (derivedFeatureID) {
				case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS: return BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS;
				case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS: return BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SequentialBehavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS: return BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__ACTIONS;
				case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS: return BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RootSequentialBehaviorImpl

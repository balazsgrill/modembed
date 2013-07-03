/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.DeviceAbstraction;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
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
 * An implementation of the model object '<em><b>Sequential Behavior Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getSymbolMappings <em>Symbol Mappings</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getBehaviorModels <em>Behavior Models</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorModuleImpl#getInitSequence <em>Init Sequence</em>}</li>
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
	protected EList<SymbolAssignment> symbolMappings;

	/**
	 * The cached value of the '{@link #getBehaviorModels() <em>Behavior Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviorModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SequentialBehaviorPart> behaviorModels;

	/**
	 * The cached value of the '{@link #getInitSequence() <em>Init Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitSequence()
	 * @generated
	 * @ordered
	 */
	protected SequentialBehaviorPart initSequence;

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
	public EList<SymbolAssignment> getSymbolMappings() {
		if (symbolMappings == null) {
			symbolMappings = new EObjectContainmentEList<SymbolAssignment>(SymbolAssignment.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS);
		}
		return symbolMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequentialBehaviorPart> getBehaviorModels() {
		if (behaviorModels == null) {
			behaviorModels = new EObjectContainmentEList<SequentialBehaviorPart>(SequentialBehaviorPart.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS);
		}
		return behaviorModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialBehaviorPart getInitSequence() {
		return initSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitSequence(SequentialBehaviorPart newInitSequence, NotificationChain msgs) {
		SequentialBehaviorPart oldInitSequence = initSequence;
		initSequence = newInitSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE, oldInitSequence, newInitSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitSequence(SequentialBehaviorPart newInitSequence) {
		if (newInitSequence != initSequence) {
			NotificationChain msgs = null;
			if (initSequence != null)
				msgs = ((InternalEObject)initSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE, null, msgs);
			if (newInitSequence != null)
				msgs = ((InternalEObject)newInitSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE, null, msgs);
			msgs = basicSetInitSequence(newInitSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE, newInitSequence, newInitSequence));
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE:
				return basicSetInitSequence(null, msgs);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE:
				return getInitSequence();
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
				getSymbolMappings().addAll((Collection<? extends SymbolAssignment>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS:
				getBehaviorModels().clear();
				getBehaviorModels().addAll((Collection<? extends SequentialBehaviorPart>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE:
				setInitSequence((SequentialBehaviorPart)newValue);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE:
				setInitSequence((SequentialBehaviorPart)null);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE__INIT_SEQUENCE:
				return initSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //SequentialBehaviorModuleImpl

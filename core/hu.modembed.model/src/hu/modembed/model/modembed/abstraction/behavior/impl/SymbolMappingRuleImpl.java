/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;

import hu.modembed.model.modembed.infrastructure.impl.MODembedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingRuleImpl#getMemInstance <em>Mem Instance</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingRuleImpl#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingRuleImpl#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingRuleImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolMappingRuleImpl extends MODembedElementImpl implements SymbolMappingRule {
	/**
	 * The cached value of the '{@link #getMemInstance() <em>Mem Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemInstance()
	 * @generated
	 * @ordered
	 */
	protected MemoryInstance memInstance;

	/**
	 * The default value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long START_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStartAddress() <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAddress()
	 * @generated
	 * @ordered
	 */
	protected long startAddress = START_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected static final long END_ADDRESS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEndAddress() <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAddress()
	 * @generated
	 * @ordered
	 */
	protected long endAddress = END_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolMappingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SYMBOL_MAPPING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryInstance getMemInstance() {
		if (memInstance != null && memInstance.eIsProxy()) {
			InternalEObject oldMemInstance = (InternalEObject)memInstance;
			memInstance = (MemoryInstance)eResolveProxy(oldMemInstance);
			if (memInstance != oldMemInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SYMBOL_MAPPING_RULE__MEM_INSTANCE, oldMemInstance, memInstance));
			}
		}
		return memInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryInstance basicGetMemInstance() {
		return memInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemInstance(MemoryInstance newMemInstance) {
		MemoryInstance oldMemInstance = memInstance;
		memInstance = newMemInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_MAPPING_RULE__MEM_INSTANCE, oldMemInstance, memInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStartAddress() {
		return startAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAddress(long newStartAddress) {
		long oldStartAddress = startAddress;
		startAddress = newStartAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_MAPPING_RULE__START_ADDRESS, oldStartAddress, startAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEndAddress() {
		return endAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAddress(long newEndAddress) {
		long oldEndAddress = endAddress;
		endAddress = newEndAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_MAPPING_RULE__END_ADDRESS, oldEndAddress, endAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClasses() {
		if (classes == null) {
			classes = new EDataTypeUniqueEList<String>(String.class, this, BehaviorPackage.SYMBOL_MAPPING_RULE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SYMBOL_MAPPING_RULE__MEM_INSTANCE:
				if (resolve) return getMemInstance();
				return basicGetMemInstance();
			case BehaviorPackage.SYMBOL_MAPPING_RULE__START_ADDRESS:
				return getStartAddress();
			case BehaviorPackage.SYMBOL_MAPPING_RULE__END_ADDRESS:
				return getEndAddress();
			case BehaviorPackage.SYMBOL_MAPPING_RULE__CLASSES:
				return getClasses();
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
			case BehaviorPackage.SYMBOL_MAPPING_RULE__MEM_INSTANCE:
				setMemInstance((MemoryInstance)newValue);
				return;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__START_ADDRESS:
				setStartAddress((Long)newValue);
				return;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__END_ADDRESS:
				setEndAddress((Long)newValue);
				return;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends String>)newValue);
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
			case BehaviorPackage.SYMBOL_MAPPING_RULE__MEM_INSTANCE:
				setMemInstance((MemoryInstance)null);
				return;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__START_ADDRESS:
				setStartAddress(START_ADDRESS_EDEFAULT);
				return;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__END_ADDRESS:
				setEndAddress(END_ADDRESS_EDEFAULT);
				return;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__CLASSES:
				getClasses().clear();
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
			case BehaviorPackage.SYMBOL_MAPPING_RULE__MEM_INSTANCE:
				return memInstance != null;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__START_ADDRESS:
				return startAddress != START_ADDRESS_EDEFAULT;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__END_ADDRESS:
				return endAddress != END_ADDRESS_EDEFAULT;
			case BehaviorPackage.SYMBOL_MAPPING_RULE__CLASSES:
				return classes != null && !classes.isEmpty();
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
		result.append(" (startAddress: ");
		result.append(startAddress);
		result.append(", endAddress: ");
		result.append(endAddress);
		result.append(", classes: ");
		result.append(classes);
		result.append(')');
		return result.toString();
	}

} //SymbolMappingRuleImpl

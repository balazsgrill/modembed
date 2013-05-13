/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.memorymodel.MemoryInstance;
import hu.modembed.model.modembed.abstraction.types.TypeDefinition;
import hu.modembed.model.modembed.infrastructure.impl.MODembedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl#getIndirection <em>Indirection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolValueAssignmentImpl extends MODembedElementImpl implements SymbolValueAssignment {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDefinition type;

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
	 * The cached value of the '{@link #getIndirection() <em>Indirection</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirection()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryInstance> indirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolValueAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SYMBOL_VALUE_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeDefinition newType, NotificationChain msgs) {
		TypeDefinition oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDefinition newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE, newType, newType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryInstance> getIndirection() {
		if (indirection == null) {
			indirection = new EObjectResolvingEList<MemoryInstance>(MemoryInstance.class, this, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION);
		}
		return indirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE:
				return basicSetType(null, msgs);
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
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL:
				return getSymbol();
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE:
				return getType();
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				return getValue();
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION:
				return getIndirection();
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
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL:
				setSymbol((String)newValue);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE:
				setType((TypeDefinition)newValue);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				setValue((Long)newValue);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION:
				getIndirection().clear();
				getIndirection().addAll((Collection<? extends MemoryInstance>)newValue);
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
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE:
				setType((TypeDefinition)null);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION:
				getIndirection().clear();
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
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__TYPE:
				return type != null;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION:
				return indirection != null && !indirection.isEmpty();
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SymbolValueAssignmentImpl

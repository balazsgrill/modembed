/**
 */
package hu.modembed.model.behavior.impl;

import hu.modembed.model.behavior.BehaviorPackage;
import hu.modembed.model.behavior.Symbol;
import hu.modembed.model.behavior.SymbolValueAssignment;

import hu.modembed.model.core.impl.MODembedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Value Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.behavior.impl.SymbolValueAssignmentImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link hu.modembed.model.behavior.impl.SymbolValueAssignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.behavior.impl.SymbolValueAssignmentImpl#getIndirectionLevel <em>Indirection Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolValueAssignmentImpl extends MODembedElementImpl implements SymbolValueAssignment {
	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected Symbol symbol;

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
	 * The default value of the '{@link #getIndirectionLevel() <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int INDIRECTION_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndirectionLevel() <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndirectionLevel()
	 * @generated
	 * @ordered
	 */
	protected int indirectionLevel = INDIRECTION_LEVEL_EDEFAULT;

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
	public Symbol getSymbol() {
		if (symbol != null && symbol.eIsProxy()) {
			InternalEObject oldSymbol = (InternalEObject)symbol;
			symbol = (Symbol)eResolveProxy(oldSymbol);
			if (symbol != oldSymbol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL, oldSymbol, symbol));
			}
		}
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(Symbol newSymbol) {
		Symbol oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL, oldSymbol, symbol));
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
	public int getIndirectionLevel() {
		return indirectionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndirectionLevel(int newIndirectionLevel) {
		int oldIndirectionLevel = indirectionLevel;
		indirectionLevel = newIndirectionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL, oldIndirectionLevel, indirectionLevel));
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
				if (resolve) return getSymbol();
				return basicGetSymbol();
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				return getValue();
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL:
				return getIndirectionLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__SYMBOL:
				setSymbol((Symbol)newValue);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				setValue((Long)newValue);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL:
				setIndirectionLevel((Integer)newValue);
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
				setSymbol((Symbol)null);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL:
				setIndirectionLevel(INDIRECTION_LEVEL_EDEFAULT);
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
				return symbol != null;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__VALUE:
				return value != VALUE_EDEFAULT;
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL:
				return indirectionLevel != INDIRECTION_LEVEL_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", indirectionLevel: ");
		result.append(indirectionLevel);
		result.append(')');
		return result.toString();
	}

} //SymbolValueAssignmentImpl

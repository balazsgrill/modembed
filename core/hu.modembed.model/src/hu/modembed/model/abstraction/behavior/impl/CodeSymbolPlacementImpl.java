/**
 */
package hu.modembed.model.abstraction.behavior.impl;

import hu.modembed.model.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.abstraction.behavior.Symbol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Symbol Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.impl.CodeSymbolPlacementImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSymbolPlacementImpl extends SequentialActionImpl implements CodeSymbolPlacement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSymbolPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.CODE_SYMBOL_PLACEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.CODE_SYMBOL_PLACEMENT__SYMBOL, oldSymbol, symbol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.CODE_SYMBOL_PLACEMENT__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT__SYMBOL:
				if (resolve) return getSymbol();
				return basicGetSymbol();
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
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT__SYMBOL:
				setSymbol((Symbol)newValue);
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
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT__SYMBOL:
				setSymbol((Symbol)null);
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
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT__SYMBOL:
				return symbol != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeSymbolPlacementImpl

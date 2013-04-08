/**
 */
package hu.modembed.model.behavior.impl;

import hu.modembed.model.behavior.BehaviorPackage;
import hu.modembed.model.behavior.Symbol;
import hu.modembed.model.behavior.SymbolMapping;

import hu.modembed.model.core.impl.MODembedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.behavior.impl.SymbolMappingImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link hu.modembed.model.behavior.impl.SymbolMappingImpl#getRemote <em>Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolMappingImpl extends MODembedElementImpl implements SymbolMapping {
	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected Symbol local;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected Symbol remote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SYMBOL_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getLocal() {
		if (local != null && local.eIsProxy()) {
			InternalEObject oldLocal = (InternalEObject)local;
			local = (Symbol)eResolveProxy(oldLocal);
			if (local != oldLocal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SYMBOL_MAPPING__LOCAL, oldLocal, local));
			}
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(Symbol newLocal) {
		Symbol oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_MAPPING__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getRemote() {
		if (remote != null && remote.eIsProxy()) {
			InternalEObject oldRemote = (InternalEObject)remote;
			remote = (Symbol)eResolveProxy(oldRemote);
			if (remote != oldRemote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviorPackage.SYMBOL_MAPPING__REMOTE, oldRemote, remote));
			}
		}
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(Symbol newRemote) {
		Symbol oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SYMBOL_MAPPING__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SYMBOL_MAPPING__LOCAL:
				if (resolve) return getLocal();
				return basicGetLocal();
			case BehaviorPackage.SYMBOL_MAPPING__REMOTE:
				if (resolve) return getRemote();
				return basicGetRemote();
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
			case BehaviorPackage.SYMBOL_MAPPING__LOCAL:
				setLocal((Symbol)newValue);
				return;
			case BehaviorPackage.SYMBOL_MAPPING__REMOTE:
				setRemote((Symbol)newValue);
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
			case BehaviorPackage.SYMBOL_MAPPING__LOCAL:
				setLocal((Symbol)null);
				return;
			case BehaviorPackage.SYMBOL_MAPPING__REMOTE:
				setRemote((Symbol)null);
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
			case BehaviorPackage.SYMBOL_MAPPING__LOCAL:
				return local != null;
			case BehaviorPackage.SYMBOL_MAPPING__REMOTE:
				return remote != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolMappingImpl

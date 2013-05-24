/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.infrastructure.impl.NamedElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl#getLocalSymbols <em>Local Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialBehaviorImpl extends NamedElementImpl implements SequentialBehavior {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequentialAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<SequentialAction>(SequentialAction.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SymbolAssignment> getLocalSymbols() {
		if (localSymbols == null) {
			localSymbols = new EObjectContainmentEList<SymbolAssignment>(SymbolAssignment.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS);
		}
		return localSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS:
				return getActions();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__PARAMETERS:
				return getParameters();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				return getLocalSymbols();
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends SequentialAction>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				getLocalSymbols().clear();
				getLocalSymbols().addAll((Collection<? extends SymbolAssignment>)newValue);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS:
				getActions().clear();
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__PARAMETERS:
				getParameters().clear();
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				getLocalSymbols().clear();
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS:
				return localSymbols != null && !localSymbols.isEmpty();
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
		result.append(" (parameters: ");
		result.append(parameters);
		result.append(')');
		return result.toString();
	}

} //SequentialBehaviorImpl

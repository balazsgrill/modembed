/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;
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
 * An implementation of the model object '<em><b>Sequential Behavior Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorPartImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorPartImpl#getLocalSymbols <em>Local Symbols</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorPartImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialBehaviorPartImpl extends NamedElementImpl implements SequentialBehaviorPart {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialBehaviorPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequentialAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<SequentialAction>(SequentialAction.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS);
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
			localSymbols = new EObjectContainmentEList<SymbolAssignment>(SymbolAssignment.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS);
		}
		return localSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeUniqueEList<String>(String.class, this, BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS:
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS:
				return getActions();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS:
				return getLocalSymbols();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS:
				return getParameters();
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends SequentialAction>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS:
				getLocalSymbols().clear();
				getLocalSymbols().addAll((Collection<? extends SymbolAssignment>)newValue);
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS:
				getActions().clear();
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS:
				getLocalSymbols().clear();
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS:
				getParameters().clear();
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS:
				return localSymbols != null && !localSymbols.isEmpty();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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
				case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS: return BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS;
				case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS: return BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS;
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
				case BehaviorPackage.SEQUENTIAL_BEHAVIOR__ACTIONS: return BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS;
				case BehaviorPackage.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS: return BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //SequentialBehaviorPartImpl

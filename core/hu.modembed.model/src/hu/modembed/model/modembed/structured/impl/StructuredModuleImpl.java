/**
 */
package hu.modembed.model.modembed.structured.impl;

import hu.modembed.model.modembed.infrastructure.impl.RootElementImpl;

import hu.modembed.model.modembed.structured.StructuredFunction;
import hu.modembed.model.modembed.structured.StructuredModule;
import hu.modembed.model.modembed.structured.StructuredPackage;
import hu.modembed.model.modembed.structured.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.StructuredModuleImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.StructuredModuleImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.impl.StructuredModuleImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredModuleImpl extends RootElementImpl implements StructuredModule {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFunction> functions;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> variables;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredModule> uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredPackage.Literals.STRUCTURED_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<StructuredFunction>(StructuredFunction.class, this, StructuredPackage.STRUCTURED_MODULE__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, StructuredPackage.STRUCTURED_MODULE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredModule> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<StructuredModule>(StructuredModule.class, this, StructuredPackage.STRUCTURED_MODULE__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredPackage.STRUCTURED_MODULE__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case StructuredPackage.STRUCTURED_MODULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case StructuredPackage.STRUCTURED_MODULE__FUNCTIONS:
				return getFunctions();
			case StructuredPackage.STRUCTURED_MODULE__VARIABLES:
				return getVariables();
			case StructuredPackage.STRUCTURED_MODULE__USES:
				return getUses();
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
			case StructuredPackage.STRUCTURED_MODULE__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends StructuredFunction>)newValue);
				return;
			case StructuredPackage.STRUCTURED_MODULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case StructuredPackage.STRUCTURED_MODULE__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends StructuredModule>)newValue);
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
			case StructuredPackage.STRUCTURED_MODULE__FUNCTIONS:
				getFunctions().clear();
				return;
			case StructuredPackage.STRUCTURED_MODULE__VARIABLES:
				getVariables().clear();
				return;
			case StructuredPackage.STRUCTURED_MODULE__USES:
				getUses().clear();
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
			case StructuredPackage.STRUCTURED_MODULE__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case StructuredPackage.STRUCTURED_MODULE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case StructuredPackage.STRUCTURED_MODULE__USES:
				return uses != null && !uses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuredModuleImpl

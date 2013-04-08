/**
 */
package hu.modembed.model.platform.impl;

import hu.modembed.model.core.impl.MODembedElementImpl;

import hu.modembed.model.platform.OperationArgument;
import hu.modembed.model.platform.OperationDefinition;
import hu.modembed.model.platform.OperationStep;
import hu.modembed.model.platform.PlatformPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.impl.OperationDefinitionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.modembed.model.platform.impl.OperationDefinitionImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationDefinitionImpl extends MODembedElementImpl implements OperationDefinition {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationArgument> arguments;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.OPERATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationArgument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<OperationArgument>(OperationArgument.class, this, PlatformPackage.OPERATION_DEFINITION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationStep> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<OperationStep>(OperationStep.class, this, PlatformPackage.OPERATION_DEFINITION__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.OPERATION_DEFINITION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case PlatformPackage.OPERATION_DEFINITION__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.OPERATION_DEFINITION__ARGUMENTS:
				return getArguments();
			case PlatformPackage.OPERATION_DEFINITION__STEPS:
				return getSteps();
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
			case PlatformPackage.OPERATION_DEFINITION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends OperationArgument>)newValue);
				return;
			case PlatformPackage.OPERATION_DEFINITION__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends OperationStep>)newValue);
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
			case PlatformPackage.OPERATION_DEFINITION__ARGUMENTS:
				getArguments().clear();
				return;
			case PlatformPackage.OPERATION_DEFINITION__STEPS:
				getSteps().clear();
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
			case PlatformPackage.OPERATION_DEFINITION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case PlatformPackage.OPERATION_DEFINITION__STEPS:
				return steps != null && !steps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionImpl

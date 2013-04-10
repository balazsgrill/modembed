/**
 */
package hu.modembed.model.abstraction.behavior.platform.impl;

import hu.modembed.model.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.abstraction.behavior.platform.PlatformDefinition;
import hu.modembed.model.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.core.impl.RootElementImpl;

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
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.platform.impl.PlatformDefinitionImpl#getRefine <em>Refine</em>}</li>
 *   <li>{@link hu.modembed.model.abstraction.behavior.platform.impl.PlatformDefinitionImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformDefinitionImpl extends RootElementImpl implements PlatformDefinition {
	/**
	 * The cached value of the '{@link #getRefine() <em>Refine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefine()
	 * @generated
	 * @ordered
	 */
	protected PlatformDefinition refine;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationDefinition> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlatformDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlatformPackage.Literals.PLATFORM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformDefinition getRefine() {
		if (refine != null && refine.eIsProxy()) {
			InternalEObject oldRefine = (InternalEObject)refine;
			refine = (PlatformDefinition)eResolveProxy(oldRefine);
			if (refine != oldRefine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlatformPackage.PLATFORM_DEFINITION__REFINE, oldRefine, refine));
			}
		}
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformDefinition basicGetRefine() {
		return refine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefine(PlatformDefinition newRefine) {
		PlatformDefinition oldRefine = refine;
		refine = newRefine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlatformPackage.PLATFORM_DEFINITION__REFINE, oldRefine, refine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationDefinition> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<OperationDefinition>(OperationDefinition.class, this, PlatformPackage.PLATFORM_DEFINITION__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlatformPackage.PLATFORM_DEFINITION__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case PlatformPackage.PLATFORM_DEFINITION__REFINE:
				if (resolve) return getRefine();
				return basicGetRefine();
			case PlatformPackage.PLATFORM_DEFINITION__OPERATIONS:
				return getOperations();
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
			case PlatformPackage.PLATFORM_DEFINITION__REFINE:
				setRefine((PlatformDefinition)newValue);
				return;
			case PlatformPackage.PLATFORM_DEFINITION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends OperationDefinition>)newValue);
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
			case PlatformPackage.PLATFORM_DEFINITION__REFINE:
				setRefine((PlatformDefinition)null);
				return;
			case PlatformPackage.PLATFORM_DEFINITION__OPERATIONS:
				getOperations().clear();
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
			case PlatformPackage.PLATFORM_DEFINITION__REFINE:
				return refine != null;
			case PlatformPackage.PLATFORM_DEFINITION__OPERATIONS:
				return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlatformDefinitionImpl

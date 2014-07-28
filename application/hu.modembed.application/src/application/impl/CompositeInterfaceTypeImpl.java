/**
 */
package application.impl;

import application.ApplicationInterface;
import application.ApplicationPackage;
import application.CompositeInterfaceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.CompositeInterfaceTypeImpl#getExpects <em>Expects</em>}</li>
 *   <li>{@link application.impl.CompositeInterfaceTypeImpl#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeInterfaceTypeImpl extends ApplicationInterfaceTypeImpl implements CompositeInterfaceType {
	/**
	 * The cached value of the '{@link #getExpects() <em>Expects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpects()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInterface> expects;
	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationInterface> implements_;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeInterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.COMPOSITE_INTERFACE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationInterface> getExpects() {
		if (expects == null) {
			expects = new EObjectContainmentEList<ApplicationInterface>(ApplicationInterface.class, this, ApplicationPackage.COMPOSITE_INTERFACE_TYPE__EXPECTS);
		}
		return expects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationInterface> getImplements() {
		if (implements_ == null) {
			implements_ = new EObjectContainmentEList<ApplicationInterface>(ApplicationInterface.class, this, ApplicationPackage.COMPOSITE_INTERFACE_TYPE__IMPLEMENTS);
		}
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__EXPECTS:
				return ((InternalEList<?>)getExpects()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__IMPLEMENTS:
				return ((InternalEList<?>)getImplements()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__EXPECTS:
				return getExpects();
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__IMPLEMENTS:
				return getImplements();
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
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__EXPECTS:
				getExpects().clear();
				getExpects().addAll((Collection<? extends ApplicationInterface>)newValue);
				return;
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__IMPLEMENTS:
				getImplements().clear();
				getImplements().addAll((Collection<? extends ApplicationInterface>)newValue);
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
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__EXPECTS:
				getExpects().clear();
				return;
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__IMPLEMENTS:
				getImplements().clear();
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
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__EXPECTS:
				return expects != null && !expects.isEmpty();
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE__IMPLEMENTS:
				return implements_ != null && !implements_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeInterfaceTypeImpl

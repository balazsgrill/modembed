/**
 */
package application.impl;

import application.ApplicationModule;
import application.ApplicationPackage;
import application.CompositeModuleImplementation;
import application.InterfaceImplementationMapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Module Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.CompositeModuleImplementationImpl#getSubModules <em>Sub Modules</em>}</li>
 *   <li>{@link application.impl.CompositeModuleImplementationImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeModuleImplementationImpl extends ApplicationModuleImplementationImpl implements CompositeModuleImplementation {
	/**
	 * The cached value of the '{@link #getSubModules() <em>Sub Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModules()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationModule> subModules;

	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementationMapping> mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeModuleImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.COMPOSITE_MODULE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ApplicationModule> getSubModules() {
		if (subModules == null) {
			subModules = new EObjectContainmentEList<ApplicationModule>(ApplicationModule.class, this, ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES);
		}
		return subModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceImplementationMapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<InterfaceImplementationMapping>(InterfaceImplementationMapping.class, this, ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES:
				return ((InternalEList<?>)getSubModules()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES:
				return getSubModules();
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS:
				return getMappings();
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
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES:
				getSubModules().clear();
				getSubModules().addAll((Collection<? extends ApplicationModule>)newValue);
				return;
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends InterfaceImplementationMapping>)newValue);
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
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES:
				getSubModules().clear();
				return;
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS:
				getMappings().clear();
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
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__SUB_MODULES:
				return subModules != null && !subModules.isEmpty();
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeModuleImplementationImpl

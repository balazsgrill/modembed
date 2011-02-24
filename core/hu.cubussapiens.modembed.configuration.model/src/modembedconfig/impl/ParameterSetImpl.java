/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig.impl;

import java.util.Collection;

import modembedconfig.ModembedconfigPackage;
import modembedconfig.Parameter;
import modembedconfig.ParameterSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modembedconfig.impl.ParameterSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link modembedconfig.impl.ParameterSetImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link modembedconfig.impl.ParameterSetImpl#getSubsets <em>Subsets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterSetImpl extends EObjectImpl implements ParameterSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getSubsets() <em>Subsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsets()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> subsets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModembedconfigPackage.Literals.PARAMETER_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModembedconfigPackage.PARAMETER_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ModembedconfigPackage.PARAMETER_SET__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getSubsets() {
		if (subsets == null) {
			subsets = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, ModembedconfigPackage.PARAMETER_SET__SUBSETS);
		}
		return subsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModembedconfigPackage.PARAMETER_SET__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ModembedconfigPackage.PARAMETER_SET__SUBSETS:
				return ((InternalEList<?>)getSubsets()).basicRemove(otherEnd, msgs);
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
			case ModembedconfigPackage.PARAMETER_SET__NAME:
				return getName();
			case ModembedconfigPackage.PARAMETER_SET__PARAMETERS:
				return getParameters();
			case ModembedconfigPackage.PARAMETER_SET__SUBSETS:
				return getSubsets();
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
			case ModembedconfigPackage.PARAMETER_SET__NAME:
				setName((String)newValue);
				return;
			case ModembedconfigPackage.PARAMETER_SET__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ModembedconfigPackage.PARAMETER_SET__SUBSETS:
				getSubsets().clear();
				getSubsets().addAll((Collection<? extends ParameterSet>)newValue);
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
			case ModembedconfigPackage.PARAMETER_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModembedconfigPackage.PARAMETER_SET__PARAMETERS:
				getParameters().clear();
				return;
			case ModembedconfigPackage.PARAMETER_SET__SUBSETS:
				getSubsets().clear();
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
			case ModembedconfigPackage.PARAMETER_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModembedconfigPackage.PARAMETER_SET__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ModembedconfigPackage.PARAMETER_SET__SUBSETS:
				return subsets != null && !subsets.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParameterSetImpl

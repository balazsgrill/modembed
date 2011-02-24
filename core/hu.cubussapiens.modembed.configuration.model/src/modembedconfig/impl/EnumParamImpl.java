/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig.impl;

import java.util.Collection;

import modembedconfig.EnumParam;
import modembedconfig.EnumParamLiteral;
import modembedconfig.ModembedconfigPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modembedconfig.impl.EnumParamImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumParamImpl extends ParameterImpl implements EnumParam {
	/**
	 * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumParamLiteral> literals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModembedconfigPackage.Literals.ENUM_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumParamLiteral> getLiterals() {
		if (literals == null) {
			literals = new EObjectContainmentEList<EnumParamLiteral>(EnumParamLiteral.class, this, ModembedconfigPackage.ENUM_PARAM__LITERALS);
		}
		return literals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModembedconfigPackage.ENUM_PARAM__LITERALS:
				return ((InternalEList<?>)getLiterals()).basicRemove(otherEnd, msgs);
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
			case ModembedconfigPackage.ENUM_PARAM__LITERALS:
				return getLiterals();
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
			case ModembedconfigPackage.ENUM_PARAM__LITERALS:
				getLiterals().clear();
				getLiterals().addAll((Collection<? extends EnumParamLiteral>)newValue);
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
			case ModembedconfigPackage.ENUM_PARAM__LITERALS:
				getLiterals().clear();
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
			case ModembedconfigPackage.ENUM_PARAM__LITERALS:
				return literals != null && !literals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumParamImpl

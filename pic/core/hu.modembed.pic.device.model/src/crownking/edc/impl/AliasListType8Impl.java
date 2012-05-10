/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AliasListType8;
import crownking.edc.EdcPackage;
import crownking.edc.LegacyAliasType;
import crownking.edc.MigrationAliasType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias List Type8</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.AliasListType8Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType8Impl#getLegacyAlias <em>Legacy Alias</em>}</li>
 *   <li>{@link crownking.edc.impl.AliasListType8Impl#getMigrationAlias <em>Migration Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasListType8Impl extends EObjectImpl implements AliasListType8 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasListType8Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getAliasListType8();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdcPackage.ALIAS_LIST_TYPE8__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LegacyAliasType> getLegacyAlias() {
		return getGroup().list(EdcPackage.eINSTANCE.getAliasListType8_LegacyAlias());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MigrationAliasType> getMigrationAlias() {
		return getGroup().list(EdcPackage.eINSTANCE.getAliasListType8_MigrationAlias());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.ALIAS_LIST_TYPE8__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE8__LEGACY_ALIAS:
				return ((InternalEList<?>)getLegacyAlias()).basicRemove(otherEnd, msgs);
			case EdcPackage.ALIAS_LIST_TYPE8__MIGRATION_ALIAS:
				return ((InternalEList<?>)getMigrationAlias()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.ALIAS_LIST_TYPE8__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.ALIAS_LIST_TYPE8__LEGACY_ALIAS:
				return getLegacyAlias();
			case EdcPackage.ALIAS_LIST_TYPE8__MIGRATION_ALIAS:
				return getMigrationAlias();
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
			case EdcPackage.ALIAS_LIST_TYPE8__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE8__LEGACY_ALIAS:
				getLegacyAlias().clear();
				getLegacyAlias().addAll((Collection<? extends LegacyAliasType>)newValue);
				return;
			case EdcPackage.ALIAS_LIST_TYPE8__MIGRATION_ALIAS:
				getMigrationAlias().clear();
				getMigrationAlias().addAll((Collection<? extends MigrationAliasType>)newValue);
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
			case EdcPackage.ALIAS_LIST_TYPE8__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE8__LEGACY_ALIAS:
				getLegacyAlias().clear();
				return;
			case EdcPackage.ALIAS_LIST_TYPE8__MIGRATION_ALIAS:
				getMigrationAlias().clear();
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
			case EdcPackage.ALIAS_LIST_TYPE8__GROUP:
				return group != null && !group.isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE8__LEGACY_ALIAS:
				return !getLegacyAlias().isEmpty();
			case EdcPackage.ALIAS_LIST_TYPE8__MIGRATION_ALIAS:
				return !getMigrationAlias().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //AliasListType8Impl

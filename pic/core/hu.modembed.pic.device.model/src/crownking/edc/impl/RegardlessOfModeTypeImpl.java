/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.DPRDataSectorType;
import crownking.edc.EdcPackage;
import crownking.edc.EmulatorZoneType;
import crownking.edc.GPRDataSectorType;
import crownking.edc.NMMRPlaceType;
import crownking.edc.RegardlessOfModeType;
import crownking.edc.SFRDataSectorType;

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
 * An implementation of the model object '<em><b>Regardless Of Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.RegardlessOfModeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.RegardlessOfModeTypeImpl#getNMMRPlace <em>NMMR Place</em>}</li>
 *   <li>{@link crownking.edc.impl.RegardlessOfModeTypeImpl#getSFRDataSector <em>SFR Data Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.RegardlessOfModeTypeImpl#getDPRDataSector <em>DPR Data Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.RegardlessOfModeTypeImpl#getGPRDataSector <em>GPR Data Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.RegardlessOfModeTypeImpl#getEmulatorZone <em>Emulator Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegardlessOfModeTypeImpl extends EObjectImpl implements RegardlessOfModeType {
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
	protected RegardlessOfModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getRegardlessOfModeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdcPackage.REGARDLESS_OF_MODE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NMMRPlaceType> getNMMRPlace() {
		return getGroup().list(EdcPackage.eINSTANCE.getRegardlessOfModeType_NMMRPlace());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRDataSectorType> getSFRDataSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getRegardlessOfModeType_SFRDataSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPRDataSectorType> getDPRDataSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getRegardlessOfModeType_DPRDataSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GPRDataSectorType> getGPRDataSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getRegardlessOfModeType_GPRDataSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmulatorZoneType> getEmulatorZone() {
		return getGroup().list(EdcPackage.eINSTANCE.getRegardlessOfModeType_EmulatorZone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__NMMR_PLACE:
				return ((InternalEList<?>)getNMMRPlace()).basicRemove(otherEnd, msgs);
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__SFR_DATA_SECTOR:
				return ((InternalEList<?>)getSFRDataSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__DPR_DATA_SECTOR:
				return ((InternalEList<?>)getDPRDataSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GPR_DATA_SECTOR:
				return ((InternalEList<?>)getGPRDataSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__EMULATOR_ZONE:
				return ((InternalEList<?>)getEmulatorZone()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__NMMR_PLACE:
				return getNMMRPlace();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__SFR_DATA_SECTOR:
				return getSFRDataSector();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__DPR_DATA_SECTOR:
				return getDPRDataSector();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GPR_DATA_SECTOR:
				return getGPRDataSector();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__EMULATOR_ZONE:
				return getEmulatorZone();
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
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__NMMR_PLACE:
				getNMMRPlace().clear();
				getNMMRPlace().addAll((Collection<? extends NMMRPlaceType>)newValue);
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__SFR_DATA_SECTOR:
				getSFRDataSector().clear();
				getSFRDataSector().addAll((Collection<? extends SFRDataSectorType>)newValue);
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__DPR_DATA_SECTOR:
				getDPRDataSector().clear();
				getDPRDataSector().addAll((Collection<? extends DPRDataSectorType>)newValue);
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GPR_DATA_SECTOR:
				getGPRDataSector().clear();
				getGPRDataSector().addAll((Collection<? extends GPRDataSectorType>)newValue);
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__EMULATOR_ZONE:
				getEmulatorZone().clear();
				getEmulatorZone().addAll((Collection<? extends EmulatorZoneType>)newValue);
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
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__NMMR_PLACE:
				getNMMRPlace().clear();
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__SFR_DATA_SECTOR:
				getSFRDataSector().clear();
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__DPR_DATA_SECTOR:
				getDPRDataSector().clear();
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GPR_DATA_SECTOR:
				getGPRDataSector().clear();
				return;
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__EMULATOR_ZONE:
				getEmulatorZone().clear();
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
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__NMMR_PLACE:
				return !getNMMRPlace().isEmpty();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__SFR_DATA_SECTOR:
				return !getSFRDataSector().isEmpty();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__DPR_DATA_SECTOR:
				return !getDPRDataSector().isEmpty();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__GPR_DATA_SECTOR:
				return !getGPRDataSector().isEmpty();
			case EdcPackage.REGARDLESS_OF_MODE_TYPE__EMULATOR_ZONE:
				return !getEmulatorZone().isEmpty();
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

} //RegardlessOfModeTypeImpl

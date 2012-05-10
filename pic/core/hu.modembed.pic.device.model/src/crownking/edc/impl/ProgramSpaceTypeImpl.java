/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.BACKBUGVectorSectorType;
import crownking.edc.CalDataZoneType;
import crownking.edc.CodeSectorType;
import crownking.edc.ConfigFuseSectorType;
import crownking.edc.DeviceIDSectorType;
import crownking.edc.EEDataSectorType;
import crownking.edc.EdcPackage;
import crownking.edc.ProgramSpaceType;
import crownking.edc.TestZoneType;
import crownking.edc.UserIDSectorType;

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
 * An implementation of the model object '<em><b>Program Space Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getCodeSector <em>Code Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getUserIDSector <em>User ID Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getTestZone <em>Test Zone</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getDeviceIDSector <em>Device ID Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getConfigFuseSector <em>Config Fuse Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getBACKBUGVectorSector <em>BACKBUG Vector Sector</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getCalDataZone <em>Cal Data Zone</em>}</li>
 *   <li>{@link crownking.edc.impl.ProgramSpaceTypeImpl#getEEDataSector <em>EE Data Sector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramSpaceTypeImpl extends EObjectImpl implements ProgramSpaceType {
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
	protected ProgramSpaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getProgramSpaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdcPackage.PROGRAM_SPACE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeSectorType> getCodeSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_CodeSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserIDSectorType> getUserIDSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_UserIDSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestZoneType> getTestZone() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_TestZone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceIDSectorType> getDeviceIDSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_DeviceIDSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigFuseSectorType> getConfigFuseSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_ConfigFuseSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BACKBUGVectorSectorType> getBACKBUGVectorSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_BACKBUGVectorSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalDataZoneType> getCalDataZone() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_CalDataZone());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEDataSectorType> getEEDataSector() {
		return getGroup().list(EdcPackage.eINSTANCE.getProgramSpaceType_EEDataSector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.PROGRAM_SPACE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__CODE_SECTOR:
				return ((InternalEList<?>)getCodeSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__USER_ID_SECTOR:
				return ((InternalEList<?>)getUserIDSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__TEST_ZONE:
				return ((InternalEList<?>)getTestZone()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__DEVICE_ID_SECTOR:
				return ((InternalEList<?>)getDeviceIDSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__CONFIG_FUSE_SECTOR:
				return ((InternalEList<?>)getConfigFuseSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__BACKBUG_VECTOR_SECTOR:
				return ((InternalEList<?>)getBACKBUGVectorSector()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__CAL_DATA_ZONE:
				return ((InternalEList<?>)getCalDataZone()).basicRemove(otherEnd, msgs);
			case EdcPackage.PROGRAM_SPACE_TYPE__EE_DATA_SECTOR:
				return ((InternalEList<?>)getEEDataSector()).basicRemove(otherEnd, msgs);
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
			case EdcPackage.PROGRAM_SPACE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.PROGRAM_SPACE_TYPE__CODE_SECTOR:
				return getCodeSector();
			case EdcPackage.PROGRAM_SPACE_TYPE__USER_ID_SECTOR:
				return getUserIDSector();
			case EdcPackage.PROGRAM_SPACE_TYPE__TEST_ZONE:
				return getTestZone();
			case EdcPackage.PROGRAM_SPACE_TYPE__DEVICE_ID_SECTOR:
				return getDeviceIDSector();
			case EdcPackage.PROGRAM_SPACE_TYPE__CONFIG_FUSE_SECTOR:
				return getConfigFuseSector();
			case EdcPackage.PROGRAM_SPACE_TYPE__BACKBUG_VECTOR_SECTOR:
				return getBACKBUGVectorSector();
			case EdcPackage.PROGRAM_SPACE_TYPE__CAL_DATA_ZONE:
				return getCalDataZone();
			case EdcPackage.PROGRAM_SPACE_TYPE__EE_DATA_SECTOR:
				return getEEDataSector();
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
			case EdcPackage.PROGRAM_SPACE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__CODE_SECTOR:
				getCodeSector().clear();
				getCodeSector().addAll((Collection<? extends CodeSectorType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__USER_ID_SECTOR:
				getUserIDSector().clear();
				getUserIDSector().addAll((Collection<? extends UserIDSectorType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__TEST_ZONE:
				getTestZone().clear();
				getTestZone().addAll((Collection<? extends TestZoneType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__DEVICE_ID_SECTOR:
				getDeviceIDSector().clear();
				getDeviceIDSector().addAll((Collection<? extends DeviceIDSectorType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__CONFIG_FUSE_SECTOR:
				getConfigFuseSector().clear();
				getConfigFuseSector().addAll((Collection<? extends ConfigFuseSectorType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__BACKBUG_VECTOR_SECTOR:
				getBACKBUGVectorSector().clear();
				getBACKBUGVectorSector().addAll((Collection<? extends BACKBUGVectorSectorType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__CAL_DATA_ZONE:
				getCalDataZone().clear();
				getCalDataZone().addAll((Collection<? extends CalDataZoneType>)newValue);
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__EE_DATA_SECTOR:
				getEEDataSector().clear();
				getEEDataSector().addAll((Collection<? extends EEDataSectorType>)newValue);
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
			case EdcPackage.PROGRAM_SPACE_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__CODE_SECTOR:
				getCodeSector().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__USER_ID_SECTOR:
				getUserIDSector().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__TEST_ZONE:
				getTestZone().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__DEVICE_ID_SECTOR:
				getDeviceIDSector().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__CONFIG_FUSE_SECTOR:
				getConfigFuseSector().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__BACKBUG_VECTOR_SECTOR:
				getBACKBUGVectorSector().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__CAL_DATA_ZONE:
				getCalDataZone().clear();
				return;
			case EdcPackage.PROGRAM_SPACE_TYPE__EE_DATA_SECTOR:
				getEEDataSector().clear();
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
			case EdcPackage.PROGRAM_SPACE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__CODE_SECTOR:
				return !getCodeSector().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__USER_ID_SECTOR:
				return !getUserIDSector().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__TEST_ZONE:
				return !getTestZone().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__DEVICE_ID_SECTOR:
				return !getDeviceIDSector().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__CONFIG_FUSE_SECTOR:
				return !getConfigFuseSector().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__BACKBUG_VECTOR_SECTOR:
				return !getBACKBUGVectorSector().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__CAL_DATA_ZONE:
				return !getCalDataZone().isEmpty();
			case EdcPackage.PROGRAM_SPACE_TYPE__EE_DATA_SECTOR:
				return !getEEDataSector().isEmpty();
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

} //ProgramSpaceTypeImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ProgramSpaceType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getCodeSector <em>Code Sector</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getUserIDSector <em>User ID Sector</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getTestZone <em>Test Zone</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getDeviceIDSector <em>Device ID Sector</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getConfigFuseSector <em>Config Fuse Sector</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getBACKBUGVectorSector <em>BACKBUG Vector Sector</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getCalDataZone <em>Cal Data Zone</em>}</li>
 *   <li>{@link crownking.edc.ProgramSpaceType#getEEDataSector <em>EE Data Sector</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getProgramSpaceType()
 * @model extendedMetaData="name='ProgramSpaceType' kind='elementOnly'"
 * @generated
 */
public interface ProgramSpaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Code Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.CodeSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_CodeSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CodeSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CodeSectorType> getCodeSector();

	/**
	 * Returns the value of the '<em><b>User ID Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.UserIDSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_UserIDSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserIDSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UserIDSectorType> getUserIDSector();

	/**
	 * Returns the value of the '<em><b>Test Zone</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.TestZoneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Zone</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_TestZone()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TestZone' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TestZoneType> getTestZone();

	/**
	 * Returns the value of the '<em><b>Device ID Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.DeviceIDSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_DeviceIDSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceIDSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DeviceIDSectorType> getDeviceIDSector();

	/**
	 * Returns the value of the '<em><b>Config Fuse Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ConfigFuseSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Fuse Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Fuse Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_ConfigFuseSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConfigFuseSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConfigFuseSectorType> getConfigFuseSector();

	/**
	 * Returns the value of the '<em><b>BACKBUG Vector Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.BACKBUGVectorSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BACKBUG Vector Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BACKBUG Vector Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_BACKBUGVectorSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BACKBUGVectorSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<BACKBUGVectorSectorType> getBACKBUGVectorSector();

	/**
	 * Returns the value of the '<em><b>Cal Data Zone</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.CalDataZoneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cal Data Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cal Data Zone</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_CalDataZone()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CalDataZone' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CalDataZoneType> getCalDataZone();

	/**
	 * Returns the value of the '<em><b>EE Data Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.EEDataSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Data Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Data Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getProgramSpaceType_EEDataSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EEDataSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EEDataSectorType> getEEDataSector();

} // ProgramSpaceType

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
 * A representation of the model object '<em><b>Regardless Of Mode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.RegardlessOfModeType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.RegardlessOfModeType#getNMMRPlace <em>NMMR Place</em>}</li>
 *   <li>{@link crownking.edc.RegardlessOfModeType#getSFRDataSector <em>SFR Data Sector</em>}</li>
 *   <li>{@link crownking.edc.RegardlessOfModeType#getDPRDataSector <em>DPR Data Sector</em>}</li>
 *   <li>{@link crownking.edc.RegardlessOfModeType#getGPRDataSector <em>GPR Data Sector</em>}</li>
 *   <li>{@link crownking.edc.RegardlessOfModeType#getEmulatorZone <em>Emulator Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getRegardlessOfModeType()
 * @model extendedMetaData="name='RegardlessOfModeType' kind='elementOnly'"
 * @generated
 */
public interface RegardlessOfModeType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getRegardlessOfModeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>NMMR Place</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.NMMRPlaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NMMR Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMMR Place</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getRegardlessOfModeType_NMMRPlace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NMMRPlace' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NMMRPlaceType> getNMMRPlace();

	/**
	 * Returns the value of the '<em><b>SFR Data Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.SFRDataSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Data Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Data Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getRegardlessOfModeType_SFRDataSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRDataSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SFRDataSectorType> getSFRDataSector();

	/**
	 * Returns the value of the '<em><b>DPR Data Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.DPRDataSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DPR Data Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DPR Data Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getRegardlessOfModeType_DPRDataSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DPRDataSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DPRDataSectorType> getDPRDataSector();

	/**
	 * Returns the value of the '<em><b>GPR Data Sector</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.GPRDataSectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPR Data Sector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPR Data Sector</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getRegardlessOfModeType_GPRDataSector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GPRDataSector' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GPRDataSectorType> getGPRDataSector();

	/**
	 * Returns the value of the '<em><b>Emulator Zone</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.EmulatorZoneType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emulator Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emulator Zone</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getRegardlessOfModeType_EmulatorZone()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EmulatorZone' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EmulatorZoneType> getEmulatorZone();

} // RegardlessOfModeType

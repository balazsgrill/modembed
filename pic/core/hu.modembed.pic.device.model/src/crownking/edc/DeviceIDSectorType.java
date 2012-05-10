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
 * A representation of the model object '<em><b>Device ID Sector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getDEVIDToRev <em>DEVID To Rev</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getIssection <em>Issection</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getMask <em>Mask</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getRegionid <em>Regionid</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getSectiondesc <em>Sectiondesc</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getSectionname <em>Sectionname</em>}</li>
 *   <li>{@link crownking.edc.DeviceIDSectorType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getDeviceIDSectorType()
 * @model extendedMetaData="name='DeviceIDSectorType' kind='mixed'"
 * @generated
 */
public interface DeviceIDSectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>DEVID To Rev</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.DEVIDToRevType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEVID To Rev</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEVID To Rev</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_DEVIDToRev()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DEVIDToRev' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DEVIDToRevType> getDEVIDToRev();

	/**
	 * Returns the value of the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginaddr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginaddr</em>' attribute.
	 * @see #setBeginaddr(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Beginaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginaddr'"
	 * @generated
	 */
	String getBeginaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getBeginaddr <em>Beginaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginaddr</em>' attribute.
	 * @see #getBeginaddr()
	 * @generated
	 */
	void setBeginaddr(String value);

	/**
	 * Returns the value of the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endaddr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endaddr</em>' attribute.
	 * @see #setEndaddr(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getEndaddr <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endaddr</em>' attribute.
	 * @see #getEndaddr()
	 * @generated
	 */
	void setEndaddr(String value);

	/**
	 * Returns the value of the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issection</em>' attribute.
	 * @see #setIssection(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Issection()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='issection'"
	 * @generated
	 */
	String getIssection();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getIssection <em>Issection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issection</em>' attribute.
	 * @see #getIssection()
	 * @generated
	 */
	void setIssection(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Mask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mask'"
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

	/**
	 * Returns the value of the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regionid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regionid</em>' attribute.
	 * @see #setRegionid(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Regionid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionid'"
	 * @generated
	 */
	String getRegionid();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getRegionid <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionid</em>' attribute.
	 * @see #getRegionid()
	 * @generated
	 */
	void setRegionid(String value);

	/**
	 * Returns the value of the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sectiondesc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectiondesc</em>' attribute.
	 * @see #setSectiondesc(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Sectiondesc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sectiondesc'"
	 * @generated
	 */
	String getSectiondesc();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getSectiondesc <em>Sectiondesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sectiondesc</em>' attribute.
	 * @see #getSectiondesc()
	 * @generated
	 */
	void setSectiondesc(String value);

	/**
	 * Returns the value of the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sectionname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sectionname</em>' attribute.
	 * @see #setSectionname(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Sectionname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sectionname'"
	 * @generated
	 */
	String getSectionname();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getSectionname <em>Sectionname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sectionname</em>' attribute.
	 * @see #getSectionname()
	 * @generated
	 */
	void setSectionname(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see crownking.edc.EdcPackage#getDeviceIDSectorType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.DeviceIDSectorType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DeviceIDSectorType

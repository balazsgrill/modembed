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
 * A representation of the model object '<em><b>SFR Mode List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.SFRModeListType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.SFRModeListType#getSFRMode <em>SFR Mode</em>}</li>
 *   <li>{@link crownking.edc.SFRModeListType#getStimpcfiles <em>Stimpcfiles</em>}</li>
 *   <li>{@link crownking.edc.SFRModeListType#getStimregfiles <em>Stimregfiles</em>}</li>
 *   <li>{@link crownking.edc.SFRModeListType#getStimscl <em>Stimscl</em>}</li>
 *   <li>{@link crownking.edc.SFRModeListType#getStimtype <em>Stimtype</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getSFRModeListType()
 * @model extendedMetaData="name='SFRModeListType' kind='mixed'"
 * @generated
 */
public interface SFRModeListType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getSFRModeListType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>SFR Mode</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.SFRModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Mode</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getSFRModeListType_SFRMode()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRMode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SFRModeType> getSFRMode();

	/**
	 * Returns the value of the '<em><b>Stimpcfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimpcfiles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimpcfiles</em>' attribute.
	 * @see #setStimpcfiles(String)
	 * @see crownking.edc.EdcPackage#getSFRModeListType_Stimpcfiles()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stimpcfiles'"
	 * @generated
	 */
	String getStimpcfiles();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRModeListType#getStimpcfiles <em>Stimpcfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimpcfiles</em>' attribute.
	 * @see #getStimpcfiles()
	 * @generated
	 */
	void setStimpcfiles(String value);

	/**
	 * Returns the value of the '<em><b>Stimregfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimregfiles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimregfiles</em>' attribute.
	 * @see #setStimregfiles(String)
	 * @see crownking.edc.EdcPackage#getSFRModeListType_Stimregfiles()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stimregfiles'"
	 * @generated
	 */
	String getStimregfiles();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRModeListType#getStimregfiles <em>Stimregfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimregfiles</em>' attribute.
	 * @see #getStimregfiles()
	 * @generated
	 */
	void setStimregfiles(String value);

	/**
	 * Returns the value of the '<em><b>Stimscl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimscl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimscl</em>' attribute.
	 * @see #setStimscl(String)
	 * @see crownking.edc.EdcPackage#getSFRModeListType_Stimscl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stimscl'"
	 * @generated
	 */
	String getStimscl();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRModeListType#getStimscl <em>Stimscl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimscl</em>' attribute.
	 * @see #getStimscl()
	 * @generated
	 */
	void setStimscl(String value);

	/**
	 * Returns the value of the '<em><b>Stimtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimtype</em>' attribute.
	 * @see #setStimtype(String)
	 * @see crownking.edc.EdcPackage#getSFRModeListType_Stimtype()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='stimtype'"
	 * @generated
	 */
	String getStimtype();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRModeListType#getStimtype <em>Stimtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimtype</em>' attribute.
	 * @see #getStimtype()
	 * @generated
	 */
	void setStimtype(String value);

} // SFRModeListType

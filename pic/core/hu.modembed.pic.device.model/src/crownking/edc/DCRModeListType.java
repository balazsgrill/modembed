/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DCR Mode List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.DCRModeListType#getDCRMode <em>DCR Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getDCRModeListType()
 * @model extendedMetaData="name='DCRModeListType' kind='elementOnly'"
 * @generated
 */
public interface DCRModeListType extends EObject {
	/**
	 * Returns the value of the '<em><b>DCR Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCR Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCR Mode</em>' containment reference.
	 * @see #setDCRMode(DCRModeType)
	 * @see crownking.edc.EdcPackage#getDCRModeListType_DCRMode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DCRMode' namespace='##targetNamespace'"
	 * @generated
	 */
	DCRModeType getDCRMode();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRModeListType#getDCRMode <em>DCR Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCR Mode</em>' containment reference.
	 * @see #getDCRMode()
	 * @generated
	 */
	void setDCRMode(DCRModeType value);

} // DCRModeListType

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
 * A representation of the model object '<em><b>Power Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.PowerType#getVPP <em>VPP</em>}</li>
 *   <li>{@link crownking.edc.PowerType#getVDD <em>VDD</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getPowerType()
 * @model extendedMetaData="name='PowerType' kind='elementOnly'"
 * @generated
 */
public interface PowerType extends EObject {
	/**
	 * Returns the value of the '<em><b>VPP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VPP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VPP</em>' containment reference.
	 * @see #setVPP(VPPType)
	 * @see crownking.edc.EdcPackage#getPowerType_VPP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VPP' namespace='##targetNamespace'"
	 * @generated
	 */
	VPPType getVPP();

	/**
	 * Sets the value of the '{@link crownking.edc.PowerType#getVPP <em>VPP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VPP</em>' containment reference.
	 * @see #getVPP()
	 * @generated
	 */
	void setVPP(VPPType value);

	/**
	 * Returns the value of the '<em><b>VDD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VDD</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VDD</em>' containment reference.
	 * @see #setVDD(VDDType)
	 * @see crownking.edc.EdcPackage#getPowerType_VDD()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VDD' namespace='##targetNamespace'"
	 * @generated
	 */
	VDDType getVDD();

	/**
	 * Sets the value of the '{@link crownking.edc.PowerType#getVDD <em>VDD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VDD</em>' containment reference.
	 * @see #getVDD()
	 * @generated
	 */
	void setVDD(VDDType value);

} // PowerType

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
 * A representation of the model object '<em><b>Select SFR Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.SelectSFRType#getSFRDef <em>SFR Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getSelectSFRType()
 * @model extendedMetaData="name='SelectSFRType' kind='elementOnly'"
 * @generated
 */
public interface SelectSFRType extends EObject {
	/**
	 * Returns the value of the '<em><b>SFR Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Def</em>' containment reference.
	 * @see #setSFRDef(SFRDefType)
	 * @see crownking.edc.EdcPackage#getSelectSFRType_SFRDef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SFRDef' namespace='##targetNamespace'"
	 * @generated
	 */
	SFRDefType getSFRDef();

	/**
	 * Sets the value of the '{@link crownking.edc.SelectSFRType#getSFRDef <em>SFR Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SFR Def</em>' containment reference.
	 * @see #getSFRDef()
	 * @generated
	 */
	void setSFRDef(SFRDefType value);

} // SelectSFRType

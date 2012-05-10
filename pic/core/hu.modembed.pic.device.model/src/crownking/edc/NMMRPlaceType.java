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
 * A representation of the model object '<em><b>NMMR Place Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.NMMRPlaceType#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link crownking.edc.NMMRPlaceType#getRegionid <em>Regionid</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getNMMRPlaceType()
 * @model extendedMetaData="name='NMMRPlaceType' kind='elementOnly'"
 * @generated
 */
public interface NMMRPlaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Ref</em>' containment reference.
	 * @see #setModuleRef(ModuleRefType)
	 * @see crownking.edc.EdcPackage#getNMMRPlaceType_ModuleRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Module_ref' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleRefType getModuleRef();

	/**
	 * Sets the value of the '{@link crownking.edc.NMMRPlaceType#getModuleRef <em>Module Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Ref</em>' containment reference.
	 * @see #getModuleRef()
	 * @generated
	 */
	void setModuleRef(ModuleRefType value);

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
	 * @see crownking.edc.EdcPackage#getNMMRPlaceType_Regionid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionid'"
	 * @generated
	 */
	String getRegionid();

	/**
	 * Sets the value of the '{@link crownking.edc.NMMRPlaceType#getRegionid <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionid</em>' attribute.
	 * @see #getRegionid()
	 * @generated
	 */
	void setRegionid(String value);

} // NMMRPlaceType

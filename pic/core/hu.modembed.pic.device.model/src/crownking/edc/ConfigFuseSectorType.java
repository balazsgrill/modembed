/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Fuse Sector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ConfigFuseSectorType#getDCRDef <em>DCR Def</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseSectorType#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseSectorType#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseSectorType#getRegionid <em>Regionid</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getConfigFuseSectorType()
 * @model extendedMetaData="name='ConfigFuseSectorType' kind='elementOnly'"
 * @generated
 */
public interface ConfigFuseSectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>DCR Def</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.DCRDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCR Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCR Def</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getConfigFuseSectorType_DCRDef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DCRDef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DCRDefType> getDCRDef();

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
	 * @see crownking.edc.EdcPackage#getConfigFuseSectorType_Beginaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginaddr'"
	 * @generated
	 */
	String getBeginaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseSectorType#getBeginaddr <em>Beginaddr</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getConfigFuseSectorType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseSectorType#getEndaddr <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endaddr</em>' attribute.
	 * @see #getEndaddr()
	 * @generated
	 */
	void setEndaddr(String value);

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
	 * @see crownking.edc.EdcPackage#getConfigFuseSectorType_Regionid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionid'"
	 * @generated
	 */
	String getRegionid();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseSectorType#getRegionid <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionid</em>' attribute.
	 * @see #getRegionid()
	 * @generated
	 */
	void setRegionid(String value);

} // ConfigFuseSectorType

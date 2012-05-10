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
 * A representation of the model object '<em><b>DCR Mode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.DCRModeType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.DCRModeType#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.DCRModeType#getDCRFieldDef <em>DCR Field Def</em>}</li>
 *   <li>{@link crownking.edc.DCRModeType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getDCRModeType()
 * @model extendedMetaData="name='DCRModeType' kind='elementOnly'"
 * @generated
 */
public interface DCRModeType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getDCRModeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Adjust Point</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.AdjustPointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjust Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjust Point</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getDCRModeType_AdjustPoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdjustPoint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AdjustPointType> getAdjustPoint();

	/**
	 * Returns the value of the '<em><b>DCR Field Def</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.DCRFieldDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCR Field Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCR Field Def</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getDCRModeType_DCRFieldDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DCRFieldDef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DCRFieldDefType> getDCRFieldDef();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see crownking.edc.EdcPackage#getDCRModeType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link crownking.edc.DCRModeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DCRModeType

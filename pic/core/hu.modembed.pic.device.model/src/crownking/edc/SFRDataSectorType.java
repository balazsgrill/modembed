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
 * A representation of the model object '<em><b>SFR Data Sector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.SFRDataSectorType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getJoinedSFRDef <em>Joined SFR Def</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getMirror <em>Mirror</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getModuleRef <em>Module Ref</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getMuxedSFRDef <em>Muxed SFR Def</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getBank <em>Bank</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.SFRDataSectorType#getRegionid <em>Regionid</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getSFRDataSectorType()
 * @model extendedMetaData="name='SFRDataSectorType' kind='elementOnly'"
 * @generated
 */
public interface SFRDataSectorType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>SFR Def</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.SFRDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Def</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_SFRDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRDef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SFRDefType> getSFRDef();

	/**
	 * Returns the value of the '<em><b>Joined SFR Def</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.JoinedSFRDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joined SFR Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joined SFR Def</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_JoinedSFRDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JoinedSFRDef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JoinedSFRDefType> getJoinedSFRDef();

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
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_AdjustPoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdjustPoint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AdjustPointType> getAdjustPoint();

	/**
	 * Returns the value of the '<em><b>Mirror</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.MirrorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mirror</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_Mirror()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mirror' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MirrorType> getMirror();

	/**
	 * Returns the value of the '<em><b>Module Ref</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ModuleRefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Ref</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_ModuleRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Module_ref' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ModuleRefType> getModuleRef();

	/**
	 * Returns the value of the '<em><b>Muxed SFR Def</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.MuxedSFRDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Muxed SFR Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Muxed SFR Def</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_MuxedSFRDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MuxedSFRDef' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MuxedSFRDefType> getMuxedSFRDef();

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' attribute.
	 * @see #isSetBank()
	 * @see #unsetBank()
	 * @see #setBank(byte)
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_Bank()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='bank'"
	 * @generated
	 */
	byte getBank();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRDataSectorType#getBank <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' attribute.
	 * @see #isSetBank()
	 * @see #unsetBank()
	 * @see #getBank()
	 * @generated
	 */
	void setBank(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.SFRDataSectorType#getBank <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBank()
	 * @see #getBank()
	 * @see #setBank(byte)
	 * @generated
	 */
	void unsetBank();

	/**
	 * Returns whether the value of the '{@link crownking.edc.SFRDataSectorType#getBank <em>Bank</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bank</em>' attribute is set.
	 * @see #unsetBank()
	 * @see #getBank()
	 * @see #setBank(byte)
	 * @generated
	 */
	boolean isSetBank();

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
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_Beginaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginaddr'"
	 * @generated
	 */
	String getBeginaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRDataSectorType#getBeginaddr <em>Beginaddr</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRDataSectorType#getEndaddr <em>Endaddr</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getSFRDataSectorType_Regionid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionid'"
	 * @generated
	 */
	String getRegionid();

	/**
	 * Sets the value of the '{@link crownking.edc.SFRDataSectorType#getRegionid <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionid</em>' attribute.
	 * @see #getRegionid()
	 * @generated
	 */
	void setRegionid(String value);

} // SFRDataSectorType

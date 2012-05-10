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
 * A representation of the model object '<em><b>Emulator Zone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.EmulatorZoneType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getAdjustPoint <em>Adjust Point</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getBank <em>Bank</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getBeginaddr <em>Beginaddr</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getEndaddr <em>Endaddr</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getRegionid <em>Regionid</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getShadowidref <em>Shadowidref</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getShadowoffset <em>Shadowoffset</em>}</li>
 *   <li>{@link crownking.edc.EmulatorZoneType#getShadowoffset1 <em>Shadowoffset1</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getEmulatorZoneType()
 * @model extendedMetaData="name='EmulatorZoneType' kind='mixed'"
 * @generated
 */
public interface EmulatorZoneType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_SFRDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRDef' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SFRDefType> getSFRDef();

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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_AdjustPoint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AdjustPoint' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AdjustPointType> getAdjustPoint();

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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Bank()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='bank'"
	 * @generated
	 */
	byte getBank();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getBank <em>Bank</em>}' attribute.
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
	 * Unsets the value of the '{@link crownking.edc.EmulatorZoneType#getBank <em>Bank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBank()
	 * @see #getBank()
	 * @see #setBank(byte)
	 * @generated
	 */
	void unsetBank();

	/**
	 * Returns whether the value of the '{@link crownking.edc.EmulatorZoneType#getBank <em>Bank</em>}' attribute is set.
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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Beginaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='beginaddr'"
	 * @generated
	 */
	String getBeginaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getBeginaddr <em>Beginaddr</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getEndaddr <em>Endaddr</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Regionid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionid'"
	 * @generated
	 */
	String getRegionid();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getRegionid <em>Regionid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionid</em>' attribute.
	 * @see #getRegionid()
	 * @generated
	 */
	void setRegionid(String value);

	/**
	 * Returns the value of the '<em><b>Shadowidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadowidref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadowidref</em>' attribute.
	 * @see #setShadowidref(String)
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Shadowidref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shadowidref'"
	 * @generated
	 */
	String getShadowidref();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getShadowidref <em>Shadowidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadowidref</em>' attribute.
	 * @see #getShadowidref()
	 * @generated
	 */
	void setShadowidref(String value);

	/**
	 * Returns the value of the '<em><b>Shadowoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadowoffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadowoffset</em>' attribute.
	 * @see #setShadowoffset(String)
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Shadowoffset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='shadowoffset'"
	 * @generated
	 */
	String getShadowoffset();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getShadowoffset <em>Shadowoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadowoffset</em>' attribute.
	 * @see #getShadowoffset()
	 * @generated
	 */
	void setShadowoffset(String value);

	/**
	 * Returns the value of the '<em><b>Shadowoffset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadowoffset1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadowoffset1</em>' attribute.
	 * @see #isSetShadowoffset1()
	 * @see #unsetShadowoffset1()
	 * @see #setShadowoffset1(byte)
	 * @see crownking.edc.EdcPackage#getEmulatorZoneType_Shadowoffset1()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='shadowoffset'"
	 * @generated
	 */
	byte getShadowoffset1();

	/**
	 * Sets the value of the '{@link crownking.edc.EmulatorZoneType#getShadowoffset1 <em>Shadowoffset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadowoffset1</em>' attribute.
	 * @see #isSetShadowoffset1()
	 * @see #unsetShadowoffset1()
	 * @see #getShadowoffset1()
	 * @generated
	 */
	void setShadowoffset1(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.EmulatorZoneType#getShadowoffset1 <em>Shadowoffset1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShadowoffset1()
	 * @see #getShadowoffset1()
	 * @see #setShadowoffset1(byte)
	 * @generated
	 */
	void unsetShadowoffset1();

	/**
	 * Returns whether the value of the '{@link crownking.edc.EmulatorZoneType#getShadowoffset1 <em>Shadowoffset1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shadowoffset1</em>' attribute is set.
	 * @see #unsetShadowoffset1()
	 * @see #getShadowoffset1()
	 * @see #setShadowoffset1(byte)
	 * @generated
	 */
	boolean isSetShadowoffset1();

} // EmulatorZoneType

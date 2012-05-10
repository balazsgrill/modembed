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
 * A representation of the model object '<em><b>Mem Traits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.MemTraitsType#getCodeMemTraits <em>Code Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getCalDataMemTraits <em>Cal Data Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getBackgroundDebugMemTraits <em>Background Debug Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getTestMemTraits <em>Test Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getUserIDMemTraits <em>User ID Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getConfigFuseMemTraits <em>Config Fuse Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getDeviceIDMemTraits <em>Device ID Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getEEDataMemTraits <em>EE Data Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getDataMemTraits <em>Data Mem Traits</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getBankcount <em>Bankcount</em>}</li>
 *   <li>{@link crownking.edc.MemTraitsType#getHwstackdepth <em>Hwstackdepth</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getMemTraitsType()
 * @model extendedMetaData="name='MemTraitsType' kind='elementOnly'"
 * @generated
 */
public interface MemTraitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Mem Traits</em>' containment reference.
	 * @see #setCodeMemTraits(CodeMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_CodeMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CodeMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeMemTraitsType getCodeMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getCodeMemTraits <em>Code Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Mem Traits</em>' containment reference.
	 * @see #getCodeMemTraits()
	 * @generated
	 */
	void setCodeMemTraits(CodeMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Cal Data Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cal Data Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cal Data Mem Traits</em>' containment reference.
	 * @see #setCalDataMemTraits(CalDataMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_CalDataMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalDataMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	CalDataMemTraitsType getCalDataMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getCalDataMemTraits <em>Cal Data Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cal Data Mem Traits</em>' containment reference.
	 * @see #getCalDataMemTraits()
	 * @generated
	 */
	void setCalDataMemTraits(CalDataMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Background Debug Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Debug Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Debug Mem Traits</em>' containment reference.
	 * @see #setBackgroundDebugMemTraits(BackgroundDebugMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_BackgroundDebugMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BackgroundDebugMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	BackgroundDebugMemTraitsType getBackgroundDebugMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getBackgroundDebugMemTraits <em>Background Debug Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Debug Mem Traits</em>' containment reference.
	 * @see #getBackgroundDebugMemTraits()
	 * @generated
	 */
	void setBackgroundDebugMemTraits(BackgroundDebugMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Test Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Mem Traits</em>' containment reference.
	 * @see #setTestMemTraits(TestMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_TestMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TestMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	TestMemTraitsType getTestMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getTestMemTraits <em>Test Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Mem Traits</em>' containment reference.
	 * @see #getTestMemTraits()
	 * @generated
	 */
	void setTestMemTraits(TestMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>User ID Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID Mem Traits</em>' containment reference.
	 * @see #setUserIDMemTraits(UserIDMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_UserIDMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UserIDMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	UserIDMemTraitsType getUserIDMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getUserIDMemTraits <em>User ID Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID Mem Traits</em>' containment reference.
	 * @see #getUserIDMemTraits()
	 * @generated
	 */
	void setUserIDMemTraits(UserIDMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Config Fuse Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Fuse Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Fuse Mem Traits</em>' containment reference.
	 * @see #setConfigFuseMemTraits(ConfigFuseMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_ConfigFuseMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConfigFuseMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigFuseMemTraitsType getConfigFuseMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getConfigFuseMemTraits <em>Config Fuse Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Fuse Mem Traits</em>' containment reference.
	 * @see #getConfigFuseMemTraits()
	 * @generated
	 */
	void setConfigFuseMemTraits(ConfigFuseMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Device ID Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID Mem Traits</em>' containment reference.
	 * @see #setDeviceIDMemTraits(DeviceIDMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_DeviceIDMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DeviceIDMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceIDMemTraitsType getDeviceIDMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getDeviceIDMemTraits <em>Device ID Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID Mem Traits</em>' containment reference.
	 * @see #getDeviceIDMemTraits()
	 * @generated
	 */
	void setDeviceIDMemTraits(DeviceIDMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>EE Data Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EE Data Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EE Data Mem Traits</em>' containment reference.
	 * @see #setEEDataMemTraits(EEDataMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_EEDataMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EEDataMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	EEDataMemTraitsType getEEDataMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getEEDataMemTraits <em>EE Data Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EE Data Mem Traits</em>' containment reference.
	 * @see #getEEDataMemTraits()
	 * @generated
	 */
	void setEEDataMemTraits(EEDataMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Data Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Mem Traits</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Mem Traits</em>' containment reference.
	 * @see #setDataMemTraits(DataMemTraitsType)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_DataMemTraits()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataMemTraits' namespace='##targetNamespace'"
	 * @generated
	 */
	DataMemTraitsType getDataMemTraits();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getDataMemTraits <em>Data Mem Traits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Mem Traits</em>' containment reference.
	 * @see #getDataMemTraits()
	 * @generated
	 */
	void setDataMemTraits(DataMemTraitsType value);

	/**
	 * Returns the value of the '<em><b>Bankcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bankcount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bankcount</em>' attribute.
	 * @see #isSetBankcount()
	 * @see #unsetBankcount()
	 * @see #setBankcount(byte)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_Bankcount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='bankcount'"
	 * @generated
	 */
	byte getBankcount();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getBankcount <em>Bankcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankcount</em>' attribute.
	 * @see #isSetBankcount()
	 * @see #unsetBankcount()
	 * @see #getBankcount()
	 * @generated
	 */
	void setBankcount(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.MemTraitsType#getBankcount <em>Bankcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBankcount()
	 * @see #getBankcount()
	 * @see #setBankcount(byte)
	 * @generated
	 */
	void unsetBankcount();

	/**
	 * Returns whether the value of the '{@link crownking.edc.MemTraitsType#getBankcount <em>Bankcount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bankcount</em>' attribute is set.
	 * @see #unsetBankcount()
	 * @see #getBankcount()
	 * @see #setBankcount(byte)
	 * @generated
	 */
	boolean isSetBankcount();

	/**
	 * Returns the value of the '<em><b>Hwstackdepth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwstackdepth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hwstackdepth</em>' attribute.
	 * @see #isSetHwstackdepth()
	 * @see #unsetHwstackdepth()
	 * @see #setHwstackdepth(byte)
	 * @see crownking.edc.EdcPackage#getMemTraitsType_Hwstackdepth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='hwstackdepth'"
	 * @generated
	 */
	byte getHwstackdepth();

	/**
	 * Sets the value of the '{@link crownking.edc.MemTraitsType#getHwstackdepth <em>Hwstackdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwstackdepth</em>' attribute.
	 * @see #isSetHwstackdepth()
	 * @see #unsetHwstackdepth()
	 * @see #getHwstackdepth()
	 * @generated
	 */
	void setHwstackdepth(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.MemTraitsType#getHwstackdepth <em>Hwstackdepth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHwstackdepth()
	 * @see #getHwstackdepth()
	 * @see #setHwstackdepth(byte)
	 * @generated
	 */
	void unsetHwstackdepth();

	/**
	 * Returns whether the value of the '{@link crownking.edc.MemTraitsType#getHwstackdepth <em>Hwstackdepth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hwstackdepth</em>' attribute is set.
	 * @see #unsetHwstackdepth()
	 * @see #getHwstackdepth()
	 * @see #setHwstackdepth(byte)
	 * @generated
	 */
	boolean isSetHwstackdepth();

} // MemTraitsType

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
 * A representation of the model object '<em><b>Config Fuse Mem Traits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getLocsize <em>Locsize</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getUnimplval <em>Unimplval</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getWordimpl <em>Wordimpl</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getWordinit <em>Wordinit</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getWordsafe <em>Wordsafe</em>}</li>
 *   <li>{@link crownking.edc.ConfigFuseMemTraitsType#getWordsize <em>Wordsize</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType()
 * @model extendedMetaData="name='ConfigFuseMemTraitsType' kind='simple'"
 * @generated
 */
public interface ConfigFuseMemTraitsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locsize</em>' attribute.
	 * @see #setLocsize(String)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Locsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locsize'"
	 * @generated
	 */
	String getLocsize();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getLocsize <em>Locsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locsize</em>' attribute.
	 * @see #getLocsize()
	 * @generated
	 */
	void setLocsize(String value);

	/**
	 * Returns the value of the '<em><b>Unimplval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unimplval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unimplval</em>' attribute.
	 * @see #isSetUnimplval()
	 * @see #unsetUnimplval()
	 * @see #setUnimplval(byte)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Unimplval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='unimplval'"
	 * @generated
	 */
	byte getUnimplval();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getUnimplval <em>Unimplval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unimplval</em>' attribute.
	 * @see #isSetUnimplval()
	 * @see #unsetUnimplval()
	 * @see #getUnimplval()
	 * @generated
	 */
	void setUnimplval(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getUnimplval <em>Unimplval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnimplval()
	 * @see #getUnimplval()
	 * @see #setUnimplval(byte)
	 * @generated
	 */
	void unsetUnimplval();

	/**
	 * Returns whether the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getUnimplval <em>Unimplval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unimplval</em>' attribute is set.
	 * @see #unsetUnimplval()
	 * @see #getUnimplval()
	 * @see #setUnimplval(byte)
	 * @generated
	 */
	boolean isSetUnimplval();

	/**
	 * Returns the value of the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wordimpl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordimpl</em>' attribute.
	 * @see #setWordimpl(String)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Wordimpl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wordimpl'"
	 * @generated
	 */
	String getWordimpl();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getWordimpl <em>Wordimpl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordimpl</em>' attribute.
	 * @see #getWordimpl()
	 * @generated
	 */
	void setWordimpl(String value);

	/**
	 * Returns the value of the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wordinit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordinit</em>' attribute.
	 * @see #setWordinit(String)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Wordinit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wordinit'"
	 * @generated
	 */
	String getWordinit();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getWordinit <em>Wordinit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordinit</em>' attribute.
	 * @see #getWordinit()
	 * @generated
	 */
	void setWordinit(String value);

	/**
	 * Returns the value of the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wordsafe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsafe</em>' attribute.
	 * @see #setWordsafe(String)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Wordsafe()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wordsafe'"
	 * @generated
	 */
	String getWordsafe();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getWordsafe <em>Wordsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsafe</em>' attribute.
	 * @see #getWordsafe()
	 * @generated
	 */
	void setWordsafe(String value);

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wordsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(String)
	 * @see crownking.edc.EdcPackage#getConfigFuseMemTraitsType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	String getWordsize();

	/**
	 * Sets the value of the '{@link crownking.edc.ConfigFuseMemTraitsType#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(String value);

} // ConfigFuseMemTraitsType

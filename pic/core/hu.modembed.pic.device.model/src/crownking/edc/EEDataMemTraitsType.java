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
 * A representation of the model object '<em><b>EE Data Mem Traits Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.EEDataMemTraitsType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.EEDataMemTraitsType#getMagicoffset <em>Magicoffset</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getEEDataMemTraitsType()
 * @model extendedMetaData="name='EEDataMemTraitsType' kind='simple'"
 * @generated
 */
public interface EEDataMemTraitsType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getEEDataMemTraitsType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.EEDataMemTraitsType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Magicoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magicoffset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magicoffset</em>' attribute.
	 * @see #setMagicoffset(String)
	 * @see crownking.edc.EdcPackage#getEEDataMemTraitsType_Magicoffset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='magicoffset'"
	 * @generated
	 */
	String getMagicoffset();

	/**
	 * Sets the value of the '{@link crownking.edc.EEDataMemTraitsType#getMagicoffset <em>Magicoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magicoffset</em>' attribute.
	 * @see #getMagicoffset()
	 * @generated
	 */
	void setMagicoffset(String value);

} // EEDataMemTraitsType

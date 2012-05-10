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
 * A representation of the model object '<em><b>Breakpoints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.BreakpointsType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.BreakpointsType#getHasdatacapture <em>Hasdatacapture</em>}</li>
 *   <li>{@link crownking.edc.BreakpointsType#getHwbpcount <em>Hwbpcount</em>}</li>
 *   <li>{@link crownking.edc.BreakpointsType#getIdbyte <em>Idbyte</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getBreakpointsType()
 * @model extendedMetaData="name='BreakpointsType' kind='simple'"
 * @generated
 */
public interface BreakpointsType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getBreakpointsType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.BreakpointsType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Hasdatacapture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hasdatacapture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hasdatacapture</em>' attribute.
	 * @see #setHasdatacapture(String)
	 * @see crownking.edc.EdcPackage#getBreakpointsType_Hasdatacapture()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hasdatacapture'"
	 * @generated
	 */
	String getHasdatacapture();

	/**
	 * Sets the value of the '{@link crownking.edc.BreakpointsType#getHasdatacapture <em>Hasdatacapture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hasdatacapture</em>' attribute.
	 * @see #getHasdatacapture()
	 * @generated
	 */
	void setHasdatacapture(String value);

	/**
	 * Returns the value of the '<em><b>Hwbpcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwbpcount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hwbpcount</em>' attribute.
	 * @see #isSetHwbpcount()
	 * @see #unsetHwbpcount()
	 * @see #setHwbpcount(byte)
	 * @see crownking.edc.EdcPackage#getBreakpointsType_Hwbpcount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='hwbpcount'"
	 * @generated
	 */
	byte getHwbpcount();

	/**
	 * Sets the value of the '{@link crownking.edc.BreakpointsType#getHwbpcount <em>Hwbpcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwbpcount</em>' attribute.
	 * @see #isSetHwbpcount()
	 * @see #unsetHwbpcount()
	 * @see #getHwbpcount()
	 * @generated
	 */
	void setHwbpcount(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.BreakpointsType#getHwbpcount <em>Hwbpcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHwbpcount()
	 * @see #getHwbpcount()
	 * @see #setHwbpcount(byte)
	 * @generated
	 */
	void unsetHwbpcount();

	/**
	 * Returns whether the value of the '{@link crownking.edc.BreakpointsType#getHwbpcount <em>Hwbpcount</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hwbpcount</em>' attribute is set.
	 * @see #unsetHwbpcount()
	 * @see #getHwbpcount()
	 * @see #setHwbpcount(byte)
	 * @generated
	 */
	boolean isSetHwbpcount();

	/**
	 * Returns the value of the '<em><b>Idbyte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idbyte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idbyte</em>' attribute.
	 * @see #setIdbyte(String)
	 * @see crownking.edc.EdcPackage#getBreakpointsType_Idbyte()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='idbyte'"
	 * @generated
	 */
	String getIdbyte();

	/**
	 * Sets the value of the '{@link crownking.edc.BreakpointsType#getIdbyte <em>Idbyte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idbyte</em>' attribute.
	 * @see #getIdbyte()
	 * @generated
	 */
	void setIdbyte(String value);

} // BreakpointsType

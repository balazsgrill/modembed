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
 * A representation of the model object '<em><b>LCD Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.LCDType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.LCDType#getSegcount <em>Segcount</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getLCDType()
 * @model extendedMetaData="name='LCDType' kind='simple'"
 * @generated
 */
public interface LCDType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getLCDType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.LCDType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Segcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segcount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segcount</em>' attribute.
	 * @see #setSegcount(String)
	 * @see crownking.edc.EdcPackage#getLCDType_Segcount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='segcount'"
	 * @generated
	 */
	String getSegcount();

	/**
	 * Sets the value of the '{@link crownking.edc.LCDType#getSegcount <em>Segcount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segcount</em>' attribute.
	 * @see #getSegcount()
	 * @generated
	 */
	void setSegcount(String value);

} // LCDType

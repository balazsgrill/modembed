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
 * A representation of the model object '<em><b>Virtual Pin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.VirtualPinType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.VirtualPinType#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.VirtualPinType#getPpsval <em>Ppsval</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getVirtualPinType()
 * @model extendedMetaData="name='VirtualPinType' kind='simple'"
 * @generated
 */
public interface VirtualPinType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getVirtualPinType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.VirtualPinType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crownking.edc.EdcPackage#getVirtualPinType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crownking.edc.VirtualPinType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ppsval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ppsval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ppsval</em>' attribute.
	 * @see #isSetPpsval()
	 * @see #unsetPpsval()
	 * @see #setPpsval(byte)
	 * @see crownking.edc.EdcPackage#getVirtualPinType_Ppsval()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Byte"
	 *        extendedMetaData="kind='attribute' name='ppsval'"
	 * @generated
	 */
	byte getPpsval();

	/**
	 * Sets the value of the '{@link crownking.edc.VirtualPinType#getPpsval <em>Ppsval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ppsval</em>' attribute.
	 * @see #isSetPpsval()
	 * @see #unsetPpsval()
	 * @see #getPpsval()
	 * @generated
	 */
	void setPpsval(byte value);

	/**
	 * Unsets the value of the '{@link crownking.edc.VirtualPinType#getPpsval <em>Ppsval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPpsval()
	 * @see #getPpsval()
	 * @see #setPpsval(byte)
	 * @generated
	 */
	void unsetPpsval();

	/**
	 * Returns whether the value of the '{@link crownking.edc.VirtualPinType#getPpsval <em>Ppsval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ppsval</em>' attribute is set.
	 * @see #unsetPpsval()
	 * @see #getPpsval()
	 * @see #setPpsval(byte)
	 * @generated
	 */
	boolean isSetPpsval();

} // VirtualPinType

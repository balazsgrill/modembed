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
 * A representation of the model object '<em><b>Data Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.DataSpaceType#getRegardlessOfMode <em>Regardless Of Mode</em>}</li>
 *   <li>{@link crownking.edc.DataSpaceType#getTraditionalModeOnly <em>Traditional Mode Only</em>}</li>
 *   <li>{@link crownking.edc.DataSpaceType#getExtendedModeOnly <em>Extended Mode Only</em>}</li>
 *   <li>{@link crownking.edc.DataSpaceType#getEndaddr <em>Endaddr</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getDataSpaceType()
 * @model extendedMetaData="name='DataSpaceType' kind='elementOnly'"
 * @generated
 */
public interface DataSpaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Regardless Of Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regardless Of Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regardless Of Mode</em>' containment reference.
	 * @see #setRegardlessOfMode(RegardlessOfModeType)
	 * @see crownking.edc.EdcPackage#getDataSpaceType_RegardlessOfMode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RegardlessOfMode' namespace='##targetNamespace'"
	 * @generated
	 */
	RegardlessOfModeType getRegardlessOfMode();

	/**
	 * Sets the value of the '{@link crownking.edc.DataSpaceType#getRegardlessOfMode <em>Regardless Of Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regardless Of Mode</em>' containment reference.
	 * @see #getRegardlessOfMode()
	 * @generated
	 */
	void setRegardlessOfMode(RegardlessOfModeType value);

	/**
	 * Returns the value of the '<em><b>Traditional Mode Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traditional Mode Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traditional Mode Only</em>' attribute.
	 * @see #setTraditionalModeOnly(String)
	 * @see crownking.edc.EdcPackage#getDataSpaceType_TraditionalModeOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TraditionalModeOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTraditionalModeOnly();

	/**
	 * Sets the value of the '{@link crownking.edc.DataSpaceType#getTraditionalModeOnly <em>Traditional Mode Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traditional Mode Only</em>' attribute.
	 * @see #getTraditionalModeOnly()
	 * @generated
	 */
	void setTraditionalModeOnly(String value);

	/**
	 * Returns the value of the '<em><b>Extended Mode Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extended Mode Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Mode Only</em>' attribute.
	 * @see #setExtendedModeOnly(String)
	 * @see crownking.edc.EdcPackage#getDataSpaceType_ExtendedModeOnly()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ExtendedModeOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExtendedModeOnly();

	/**
	 * Sets the value of the '{@link crownking.edc.DataSpaceType#getExtendedModeOnly <em>Extended Mode Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Mode Only</em>' attribute.
	 * @see #getExtendedModeOnly()
	 * @generated
	 */
	void setExtendedModeOnly(String value);

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
	 * @see crownking.edc.EdcPackage#getDataSpaceType_Endaddr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='endaddr'"
	 * @generated
	 */
	String getEndaddr();

	/**
	 * Sets the value of the '{@link crownking.edc.DataSpaceType#getEndaddr <em>Endaddr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endaddr</em>' attribute.
	 * @see #getEndaddr()
	 * @generated
	 */
	void setEndaddr(String value);

} // DataSpaceType

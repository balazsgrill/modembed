/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.config;

import microchip.device.generic.IntRange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Checksum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.config.Checksum#getType <em>Type</em>}</li>
 *   <li>{@link microchip.device.config.Checksum#getProtregion <em>Protregion</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.config.ConfigPackage#getChecksum()
 * @model
 * @generated
 */
public interface Checksum extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(int)
	 * @see microchip.device.config.ConfigPackage#getChecksum_Type()
	 * @model unsettable="true"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link microchip.device.config.Checksum#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.Checksum#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(int)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.Checksum#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(int)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Protregion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protregion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protregion</em>' containment reference.
	 * @see #setProtregion(IntRange)
	 * @see microchip.device.config.ConfigPackage#getChecksum_Protregion()
	 * @model containment="true"
	 * @generated
	 */
	IntRange getProtregion();

	/**
	 * Sets the value of the '{@link microchip.device.config.Checksum#getProtregion <em>Protregion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protregion</em>' containment reference.
	 * @see #getProtregion()
	 * @generated
	 */
	void setProtregion(IntRange value);

} // Checksum

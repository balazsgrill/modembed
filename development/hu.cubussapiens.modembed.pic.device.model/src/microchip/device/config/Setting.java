/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.config.Setting#getReq <em>Req</em>}</li>
 *   <li>{@link microchip.device.config.Setting#getValue <em>Value</em>}</li>
 *   <li>{@link microchip.device.config.Setting#getDesc <em>Desc</em>}</li>
 *   <li>{@link microchip.device.config.Setting#getChecksum <em>Checksum</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.config.ConfigPackage#getSetting()
 * @model
 * @generated
 */
public interface Setting extends EObject {
	/**
	 * Returns the value of the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' attribute.
	 * @see #isSetReq()
	 * @see #unsetReq()
	 * @see #setReq(int)
	 * @see microchip.device.config.ConfigPackage#getSetting_Req()
	 * @model unsettable="true"
	 * @generated
	 */
	int getReq();

	/**
	 * Sets the value of the '{@link microchip.device.config.Setting#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req</em>' attribute.
	 * @see #isSetReq()
	 * @see #unsetReq()
	 * @see #getReq()
	 * @generated
	 */
	void setReq(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.Setting#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReq()
	 * @see #getReq()
	 * @see #setReq(int)
	 * @generated
	 */
	void unsetReq();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.Setting#getReq <em>Req</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req</em>' attribute is set.
	 * @see #unsetReq()
	 * @see #getReq()
	 * @see #setReq(int)
	 * @generated
	 */
	boolean isSetReq();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(int)
	 * @see microchip.device.config.ConfigPackage#getSetting_Value()
	 * @model unsettable="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link microchip.device.config.Setting#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.Setting#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.Setting#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see microchip.device.config.ConfigPackage#getSetting_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link microchip.device.config.Setting#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' containment reference.
	 * @see #setChecksum(Checksum)
	 * @see microchip.device.config.ConfigPackage#getSetting_Checksum()
	 * @model containment="true"
	 * @generated
	 */
	Checksum getChecksum();

	/**
	 * Sets the value of the '{@link microchip.device.config.Setting#getChecksum <em>Checksum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checksum</em>' containment reference.
	 * @see #getChecksum()
	 * @generated
	 */
	void setChecksum(Checksum value);

} // Setting

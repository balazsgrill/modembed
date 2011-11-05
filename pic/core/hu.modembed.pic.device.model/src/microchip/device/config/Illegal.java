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
 * A representation of the model object '<em><b>Illegal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.config.Illegal#getMask <em>Mask</em>}</li>
 *   <li>{@link microchip.device.config.Illegal#getValue <em>Value</em>}</li>
 *   <li>{@link microchip.device.config.Illegal#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.config.ConfigPackage#getIllegal()
 * @model
 * @generated
 */
public interface Illegal extends EObject {
	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #isSetMask()
	 * @see #unsetMask()
	 * @see #setMask(int)
	 * @see microchip.device.config.ConfigPackage#getIllegal_Mask()
	 * @model unsettable="true"
	 * @generated
	 */
	int getMask();

	/**
	 * Sets the value of the '{@link microchip.device.config.Illegal#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #isSetMask()
	 * @see #unsetMask()
	 * @see #getMask()
	 * @generated
	 */
	void setMask(int value);

	/**
	 * Unsets the value of the '{@link microchip.device.config.Illegal#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMask()
	 * @see #getMask()
	 * @see #setMask(int)
	 * @generated
	 */
	void unsetMask();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.Illegal#getMask <em>Mask</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mask</em>' attribute is set.
	 * @see #unsetMask()
	 * @see #getMask()
	 * @see #setMask(int)
	 * @generated
	 */
	boolean isSetMask();

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
	 * @see microchip.device.config.ConfigPackage#getIllegal_Value()
	 * @model unsettable="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link microchip.device.config.Illegal#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link microchip.device.config.Illegal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(int)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link microchip.device.config.Illegal#getValue <em>Value</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see microchip.device.config.ConfigPackage#getIllegal_Msg()
	 * @model
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link microchip.device.config.Illegal#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

} // Illegal

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device;

import microchip.device.generic.FloatRange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vpp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.Vpp#getRange <em>Range</em>}</li>
 *   <li>{@link microchip.device.Vpp#getDflt <em>Dflt</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.DevicePackage#getVpp()
 * @model
 * @generated
 */
public interface Vpp extends EObject {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #setRange(FloatRange)
	 * @see microchip.device.DevicePackage#getVpp_Range()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	FloatRange getRange();

	/**
	 * Sets the value of the '{@link microchip.device.Vpp#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #getRange()
	 * @generated
	 */
	void setRange(FloatRange value);

	/**
	 * Unsets the value of the '{@link microchip.device.Vpp#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRange()
	 * @see #getRange()
	 * @see #setRange(FloatRange)
	 * @generated
	 */
	void unsetRange();

	/**
	 * Returns whether the value of the '{@link microchip.device.Vpp#getRange <em>Range</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range</em>' containment reference is set.
	 * @see #unsetRange()
	 * @see #getRange()
	 * @see #setRange(FloatRange)
	 * @generated
	 */
	boolean isSetRange();

	/**
	 * Returns the value of the '<em><b>Dflt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dflt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dflt</em>' attribute.
	 * @see #isSetDflt()
	 * @see #unsetDflt()
	 * @see #setDflt(float)
	 * @see microchip.device.DevicePackage#getVpp_Dflt()
	 * @model unsettable="true"
	 * @generated
	 */
	float getDflt();

	/**
	 * Sets the value of the '{@link microchip.device.Vpp#getDflt <em>Dflt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dflt</em>' attribute.
	 * @see #isSetDflt()
	 * @see #unsetDflt()
	 * @see #getDflt()
	 * @generated
	 */
	void setDflt(float value);

	/**
	 * Unsets the value of the '{@link microchip.device.Vpp#getDflt <em>Dflt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDflt()
	 * @see #getDflt()
	 * @see #setDflt(float)
	 * @generated
	 */
	void unsetDflt();

	/**
	 * Returns whether the value of the '{@link microchip.device.Vpp#getDflt <em>Dflt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dflt</em>' attribute is set.
	 * @see #unsetDflt()
	 * @see #getDflt()
	 * @see #setDflt(float)
	 * @generated
	 */
	boolean isSetDflt();

} // Vpp

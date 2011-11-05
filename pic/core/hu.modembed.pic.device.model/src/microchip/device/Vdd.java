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
 * A representation of the model object '<em><b>Vdd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.Vdd#getRange <em>Range</em>}</li>
 *   <li>{@link microchip.device.Vdd#getDfltrange <em>Dfltrange</em>}</li>
 *   <li>{@link microchip.device.Vdd#getNominal <em>Nominal</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.DevicePackage#getVdd()
 * @model
 * @generated
 */
public interface Vdd extends EObject {
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
	 * @see microchip.device.DevicePackage#getVdd_Range()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	FloatRange getRange();

	/**
	 * Sets the value of the '{@link microchip.device.Vdd#getRange <em>Range</em>}' containment reference.
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
	 * Unsets the value of the '{@link microchip.device.Vdd#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRange()
	 * @see #getRange()
	 * @see #setRange(FloatRange)
	 * @generated
	 */
	void unsetRange();

	/**
	 * Returns whether the value of the '{@link microchip.device.Vdd#getRange <em>Range</em>}' containment reference is set.
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
	 * Returns the value of the '<em><b>Dfltrange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dfltrange</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dfltrange</em>' containment reference.
	 * @see #isSetDfltrange()
	 * @see #unsetDfltrange()
	 * @see #setDfltrange(FloatRange)
	 * @see microchip.device.DevicePackage#getVdd_Dfltrange()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	FloatRange getDfltrange();

	/**
	 * Sets the value of the '{@link microchip.device.Vdd#getDfltrange <em>Dfltrange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dfltrange</em>' containment reference.
	 * @see #isSetDfltrange()
	 * @see #unsetDfltrange()
	 * @see #getDfltrange()
	 * @generated
	 */
	void setDfltrange(FloatRange value);

	/**
	 * Unsets the value of the '{@link microchip.device.Vdd#getDfltrange <em>Dfltrange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDfltrange()
	 * @see #getDfltrange()
	 * @see #setDfltrange(FloatRange)
	 * @generated
	 */
	void unsetDfltrange();

	/**
	 * Returns whether the value of the '{@link microchip.device.Vdd#getDfltrange <em>Dfltrange</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dfltrange</em>' containment reference is set.
	 * @see #unsetDfltrange()
	 * @see #getDfltrange()
	 * @see #setDfltrange(FloatRange)
	 * @generated
	 */
	boolean isSetDfltrange();

	/**
	 * Returns the value of the '<em><b>Nominal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal</em>' attribute.
	 * @see #isSetNominal()
	 * @see #unsetNominal()
	 * @see #setNominal(float)
	 * @see microchip.device.DevicePackage#getVdd_Nominal()
	 * @model unsettable="true"
	 * @generated
	 */
	float getNominal();

	/**
	 * Sets the value of the '{@link microchip.device.Vdd#getNominal <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal</em>' attribute.
	 * @see #isSetNominal()
	 * @see #unsetNominal()
	 * @see #getNominal()
	 * @generated
	 */
	void setNominal(float value);

	/**
	 * Unsets the value of the '{@link microchip.device.Vdd#getNominal <em>Nominal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNominal()
	 * @see #getNominal()
	 * @see #setNominal(float)
	 * @generated
	 */
	void unsetNominal();

	/**
	 * Returns whether the value of the '{@link microchip.device.Vdd#getNominal <em>Nominal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nominal</em>' attribute is set.
	 * @see #unsetNominal()
	 * @see #getNominal()
	 * @see #setNominal(float)
	 * @generated
	 */
	boolean isSetNominal();

} // Vdd

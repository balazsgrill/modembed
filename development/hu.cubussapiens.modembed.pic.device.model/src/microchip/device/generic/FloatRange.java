/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.generic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.generic.FloatRange#getStart <em>Start</em>}</li>
 *   <li>{@link microchip.device.generic.FloatRange#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.generic.GenericPackage#getFloatRange()
 * @model
 * @generated
 */
public interface FloatRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(float)
	 * @see microchip.device.generic.GenericPackage#getFloatRange_Start()
	 * @model
	 * @generated
	 */
	float getStart();

	/**
	 * Sets the value of the '{@link microchip.device.generic.FloatRange#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(float value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(float)
	 * @see microchip.device.generic.GenericPackage#getFloatRange_End()
	 * @model
	 * @generated
	 */
	float getEnd();

	/**
	 * Sets the value of the '{@link microchip.device.generic.FloatRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(float value);

} // FloatRange

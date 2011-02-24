/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.Stimulus#getScl <em>Scl</em>}</li>
 *   <li>{@link microchip.device.memory.Stimulus#getPcfiles <em>Pcfiles</em>}</li>
 *   <li>{@link microchip.device.memory.Stimulus#getRegfiles <em>Regfiles</em>}</li>
 *   <li>{@link microchip.device.memory.Stimulus#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getStimulus()
 * @model
 * @generated
 */
public interface Stimulus extends EObject {
	/**
	 * Returns the value of the '<em><b>Scl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scl</em>' attribute.
	 * @see #setScl(String)
	 * @see microchip.device.memory.MemoryPackage#getStimulus_Scl()
	 * @model
	 * @generated
	 */
	String getScl();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Stimulus#getScl <em>Scl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scl</em>' attribute.
	 * @see #getScl()
	 * @generated
	 */
	void setScl(String value);

	/**
	 * Returns the value of the '<em><b>Pcfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcfiles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcfiles</em>' attribute.
	 * @see #setPcfiles(String)
	 * @see microchip.device.memory.MemoryPackage#getStimulus_Pcfiles()
	 * @model
	 * @generated
	 */
	String getPcfiles();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Stimulus#getPcfiles <em>Pcfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcfiles</em>' attribute.
	 * @see #getPcfiles()
	 * @generated
	 */
	void setPcfiles(String value);

	/**
	 * Returns the value of the '<em><b>Regfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regfiles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regfiles</em>' attribute.
	 * @see #setRegfiles(String)
	 * @see microchip.device.memory.MemoryPackage#getStimulus_Regfiles()
	 * @model
	 * @generated
	 */
	String getRegfiles();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Stimulus#getRegfiles <em>Regfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regfiles</em>' attribute.
	 * @see #getRegfiles()
	 * @generated
	 */
	void setRegfiles(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see microchip.device.memory.MemoryPackage#getStimulus_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Stimulus#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Stimulus

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
 * A representation of the model object '<em><b>Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.Reset#getPor <em>Por</em>}</li>
 *   <li>{@link microchip.device.memory.Reset#getMclr <em>Mclr</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getReset()
 * @model
 * @generated
 */
public interface Reset extends EObject {
	/**
	 * Returns the value of the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Por</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Por</em>' attribute.
	 * @see #setPor(String)
	 * @see microchip.device.memory.MemoryPackage#getReset_Por()
	 * @model
	 * @generated
	 */
	String getPor();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Reset#getPor <em>Por</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Por</em>' attribute.
	 * @see #getPor()
	 * @generated
	 */
	void setPor(String value);

	/**
	 * Returns the value of the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mclr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mclr</em>' attribute.
	 * @see #setMclr(String)
	 * @see microchip.device.memory.MemoryPackage#getReset_Mclr()
	 * @model
	 * @generated
	 */
	String getMclr();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Reset#getMclr <em>Mclr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mclr</em>' attribute.
	 * @see #getMclr()
	 * @generated
	 */
	void setMclr(String value);

} // Reset

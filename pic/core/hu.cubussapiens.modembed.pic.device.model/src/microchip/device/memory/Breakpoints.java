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
 * A representation of the model object '<em><b>Breakpoints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.Breakpoints#getNumhwbp <em>Numhwbp</em>}</li>
 *   <li>{@link microchip.device.memory.Breakpoints#getDatacapture <em>Datacapture</em>}</li>
 *   <li>{@link microchip.device.memory.Breakpoints#getIdbyte <em>Idbyte</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getBreakpoints()
 * @model
 * @generated
 */
public interface Breakpoints extends EObject {
	/**
	 * Returns the value of the '<em><b>Numhwbp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numhwbp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numhwbp</em>' attribute.
	 * @see #setNumhwbp(int)
	 * @see microchip.device.memory.MemoryPackage#getBreakpoints_Numhwbp()
	 * @model
	 * @generated
	 */
	int getNumhwbp();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Breakpoints#getNumhwbp <em>Numhwbp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numhwbp</em>' attribute.
	 * @see #getNumhwbp()
	 * @generated
	 */
	void setNumhwbp(int value);

	/**
	 * Returns the value of the '<em><b>Datacapture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacapture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacapture</em>' attribute.
	 * @see #setDatacapture(String)
	 * @see microchip.device.memory.MemoryPackage#getBreakpoints_Datacapture()
	 * @model
	 * @generated
	 */
	String getDatacapture();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Breakpoints#getDatacapture <em>Datacapture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacapture</em>' attribute.
	 * @see #getDatacapture()
	 * @generated
	 */
	void setDatacapture(String value);

	/**
	 * Returns the value of the '<em><b>Idbyte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idbyte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idbyte</em>' attribute.
	 * @see #setIdbyte(String)
	 * @see microchip.device.memory.MemoryPackage#getBreakpoints_Idbyte()
	 * @model
	 * @generated
	 */
	String getIdbyte();

	/**
	 * Sets the value of the '{@link microchip.device.memory.Breakpoints#getIdbyte <em>Idbyte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idbyte</em>' attribute.
	 * @see #getIdbyte()
	 * @generated
	 */
	void setIdbyte(String value);

} // Breakpoints

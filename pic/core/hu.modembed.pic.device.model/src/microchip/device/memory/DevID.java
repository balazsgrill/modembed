/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dev ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link microchip.device.memory.DevID#getIdmask <em>Idmask</em>}</li>
 *   <li>{@link microchip.device.memory.DevID#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see microchip.device.memory.MemoryPackage#getDevID()
 * @model
 * @generated
 */
public interface DevID extends MemRegion {
	/**
	 * Returns the value of the '<em><b>Idmask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idmask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idmask</em>' attribute.
	 * @see #setIdmask(int)
	 * @see microchip.device.memory.MemoryPackage#getDevID_Idmask()
	 * @model
	 * @generated
	 */
	int getIdmask();

	/**
	 * Sets the value of the '{@link microchip.device.memory.DevID#getIdmask <em>Idmask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idmask</em>' attribute.
	 * @see #getIdmask()
	 * @generated
	 */
	void setIdmask(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see microchip.device.memory.MemoryPackage#getDevID_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link microchip.device.memory.DevID#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // DevID

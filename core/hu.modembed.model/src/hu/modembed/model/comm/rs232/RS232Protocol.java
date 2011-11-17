/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.comm.rs232;

import hu.modembed.model.comm.CommunicationProtocol;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RS232 Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.comm.rs232.RS232Protocol#getIdBitLength <em>Id Bit Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.comm.rs232.Rs232Package#getRS232Protocol()
 * @model
 * @generated
 */
public interface RS232Protocol extends CommunicationProtocol {
	/**
	 * Returns the value of the '<em><b>Id Bit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Bit Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Bit Length</em>' attribute.
	 * @see #setIdBitLength(int)
	 * @see hu.modembed.model.comm.rs232.Rs232Package#getRS232Protocol_IdBitLength()
	 * @model
	 * @generated
	 */
	int getIdBitLength();

	/**
	 * Sets the value of the '{@link hu.modembed.model.comm.rs232.RS232Protocol#getIdBitLength <em>Id Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Bit Length</em>' attribute.
	 * @see #getIdBitLength()
	 * @generated
	 */
	void setIdBitLength(int value);

} // RS232Protocol

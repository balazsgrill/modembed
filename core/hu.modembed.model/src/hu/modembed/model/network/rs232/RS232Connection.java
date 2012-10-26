/**
 */
package hu.modembed.model.network.rs232;

import hu.modembed.model.network.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RS232 Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.network.rs232.RS232Connection#getBaudRate <em>Baud Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.network.rs232.Rs232Package#getRS232Connection()
 * @model
 * @generated
 */
public interface RS232Connection extends Connection {
	/**
	 * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baud Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate</em>' attribute.
	 * @see #setBaudRate(int)
	 * @see hu.modembed.model.network.rs232.Rs232Package#getRS232Connection_BaudRate()
	 * @model
	 * @generated
	 */
	int getBaudRate();

	/**
	 * Sets the value of the '{@link hu.modembed.model.network.rs232.RS232Connection#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(int value);

} // RS232Connection

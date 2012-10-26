/**
 */
package hu.modembed.model.comm.rs232;

import hu.modembed.model.comm.Frame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RS232 Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.comm.rs232.RS232Frame#getNumOfBytes <em>Num Of Bytes</em>}</li>
 *   <li>{@link hu.modembed.model.comm.rs232.RS232Frame#getFields <em>Fields</em>}</li>
 *   <li>{@link hu.modembed.model.comm.rs232.RS232Frame#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.comm.rs232.Rs232Package#getRS232Frame()
 * @model
 * @generated
 */
public interface RS232Frame extends Frame {
	/**
	 * Returns the value of the '<em><b>Num Of Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Bytes</em>' attribute.
	 * @see #setNumOfBytes(int)
	 * @see hu.modembed.model.comm.rs232.Rs232Package#getRS232Frame_NumOfBytes()
	 * @model
	 * @generated
	 */
	int getNumOfBytes();

	/**
	 * Sets the value of the '{@link hu.modembed.model.comm.rs232.RS232Frame#getNumOfBytes <em>Num Of Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Bytes</em>' attribute.
	 * @see #getNumOfBytes()
	 * @generated
	 */
	void setNumOfBytes(int value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.comm.rs232.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see hu.modembed.model.comm.rs232.Rs232Package#getRS232Frame_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

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
	 * @see hu.modembed.model.comm.rs232.Rs232Package#getRS232Frame_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link hu.modembed.model.comm.rs232.RS232Frame#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // RS232Frame

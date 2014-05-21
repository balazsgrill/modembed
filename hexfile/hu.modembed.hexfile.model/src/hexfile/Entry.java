/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hexfile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hexfile.Entry#getAddress <em>Address</em>}</li>
 *   <li>{@link hexfile.Entry#getData <em>Data</em>}</li>
 *   <li>{@link hexfile.Entry#getBlocksize <em>Blocksize</em>}</li>
 * </ul>
 * </p>
 *
 * @see hexfile.HexfilePackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(int)
	 * @see hexfile.HexfilePackage#getEntry_Address()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getAddress();

	/**
	 * Sets the value of the '{@link hexfile.Entry#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(int value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see hexfile.HexfilePackage#getEntry_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link hexfile.Entry#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Blocksize</b></em>' attribute.
	 * The default value is <code>"16"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocksize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocksize</em>' attribute.
	 * @see #setBlocksize(int)
	 * @see hexfile.HexfilePackage#getEntry_Blocksize()
	 * @model default="16" required="true"
	 * @generated
	 */
	int getBlocksize();

	/**
	 * Sets the value of the '{@link hexfile.Entry#getBlocksize <em>Blocksize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocksize</em>' attribute.
	 * @see #getBlocksize()
	 * @generated
	 */
	void setBlocksize(int value);

} // Entry

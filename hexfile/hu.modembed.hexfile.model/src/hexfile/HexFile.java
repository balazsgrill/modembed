/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hexfile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hexfile.HexFile#getEntries <em>Entries</em>}</li>
 *   <li>{@link hexfile.HexFile#getAddressType <em>Address Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hexfile.HexfilePackage#getHexFile()
 * @model
 * @generated
 */
public interface HexFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link hexfile.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see hexfile.HexfilePackage#getHexFile_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * The default value is <code>"Single"</code>.
	 * The literals are from the enumeration {@link hexfile.AddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see hexfile.AddressType
	 * @see #setAddressType(AddressType)
	 * @see hexfile.HexfilePackage#getHexFile_AddressType()
	 * @model default="Single" required="true"
	 * @generated
	 */
	AddressType getAddressType();

	/**
	 * Sets the value of the '{@link hexfile.HexFile#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see hexfile.AddressType
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(AddressType value);

} // HexFile

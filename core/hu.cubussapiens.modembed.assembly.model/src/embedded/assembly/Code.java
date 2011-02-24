/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package embedded.assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link embedded.assembly.Code#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see embedded.assembly.AssemblyPackage#getCode()
 * @model
 * @generated
 */
public interface Code extends Section {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see embedded.assembly.AssemblyPackage#getCode_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link embedded.assembly.Code#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

} // Code

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package embedded.assembly;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link embedded.assembly.Field#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see embedded.assembly.AssemblyPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Section {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link embedded.assembly.FieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see embedded.assembly.FieldType
	 * @see #setType(FieldType)
	 * @see embedded.assembly.AssemblyPackage#getField_Type()
	 * @model
	 * @generated
	 */
	FieldType getType();

	/**
	 * Sets the value of the '{@link embedded.assembly.Field#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see embedded.assembly.FieldType
	 * @see #getType()
	 * @generated
	 */
	void setType(FieldType value);

} // Field

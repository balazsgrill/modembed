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
 *   <li>{@link embedded.assembly.Field#getParameter <em>Parameter</em>}</li>
 *   <li>{@link embedded.assembly.Field#getParamshift <em>Paramshift</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see embedded.assembly.AssemblyPackage#getField_Parameter()
	 * @model
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link embedded.assembly.Field#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Paramshift</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramshift</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramshift</em>' attribute.
	 * @see #setParamshift(int)
	 * @see embedded.assembly.AssemblyPackage#getField_Paramshift()
	 * @model default="0"
	 * @generated
	 */
	int getParamshift();

	/**
	 * Sets the value of the '{@link embedded.assembly.Field#getParamshift <em>Paramshift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paramshift</em>' attribute.
	 * @see #getParamshift()
	 * @generated
	 */
	void setParamshift(int value);

} // Field

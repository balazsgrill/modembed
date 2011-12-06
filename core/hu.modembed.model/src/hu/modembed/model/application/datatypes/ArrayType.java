/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.datatypes;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.datatypes.ArrayType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link hu.modembed.model.application.datatypes.ArrayType#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.datatypes.DatatypesPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends StructuredType {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see #setBaseType(Datatype)
	 * @see hu.modembed.model.application.datatypes.DatatypesPackage#getArrayType_BaseType()
	 * @model
	 * @generated
	 */
	Datatype getBaseType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.datatypes.ArrayType#getBaseType <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see hu.modembed.model.application.datatypes.DatatypesPackage#getArrayType_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.datatypes.ArrayType#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // ArrayType

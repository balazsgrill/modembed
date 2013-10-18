/**
 */
package hu.modembed.model.modembed.abstraction.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.types.ArrayTypeDefinition#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.types.TypesPackage#getArrayTypeDefinition()
 * @model
 * @generated
 */
public interface ArrayTypeDefinition extends CompositeTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(TypeDefinition)
	 * @see hu.modembed.model.modembed.abstraction.types.TypesPackage#getArrayTypeDefinition_ElementType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getElementType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.types.ArrayTypeDefinition#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(TypeDefinition value);

} // ArrayTypeDefinition

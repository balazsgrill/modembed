/**
 */
package hu.modembed.model.abstraction.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.types.PointerTypeDefinition#getPointerType <em>Pointer Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.types.TypesPackage#getPointerTypeDefinition()
 * @model
 * @generated
 */
public interface PointerTypeDefinition extends CompositeTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Pointer Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointer Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer Type</em>' containment reference.
	 * @see #setPointerType(TypeDefinition)
	 * @see hu.modembed.model.abstraction.types.TypesPackage#getPointerTypeDefinition_PointerType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getPointerType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.types.PointerTypeDefinition#getPointerType <em>Pointer Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer Type</em>' containment reference.
	 * @see #getPointerType()
	 * @generated
	 */
	void setPointerType(TypeDefinition value);

} // PointerTypeDefinition

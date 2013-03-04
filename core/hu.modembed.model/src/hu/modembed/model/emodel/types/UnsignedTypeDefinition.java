/**
 */
package hu.modembed.model.emodel.types;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsigned Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.types.UnsignedTypeDefinition#getBits <em>Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.types.TypesPackage#getUnsignedTypeDefinition()
 * @model
 * @generated
 */
public interface UnsignedTypeDefinition extends PrimitiveTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits</em>' attribute.
	 * @see #setBits(int)
	 * @see hu.modembed.model.emodel.types.TypesPackage#getUnsignedTypeDefinition_Bits()
	 * @model
	 * @generated
	 */
	int getBits();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.types.UnsignedTypeDefinition#getBits <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits</em>' attribute.
	 * @see #getBits()
	 * @generated
	 */
	void setBits(int value);

} // UnsignedTypeDefinition

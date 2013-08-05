/**
 */
package hu.modembed.model.emodel.types;

import hu.modembed.model.emodel.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.types.ReferenceTypeDefinition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.types.TypesPackage#getReferenceTypeDefinition()
 * @model
 * @generated
 */
public interface ReferenceTypeDefinition extends CompositeTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see hu.modembed.model.emodel.types.TypesPackage#getReferenceTypeDefinition_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.types.ReferenceTypeDefinition#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // ReferenceTypeDefinition
/**
 */
package hu.modembed.model.abstraction.types;

import hu.modembed.model.core.RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.types.Type#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.types.TypesPackage#getType()
 * @model
 * @generated
 */
public interface Type extends RootElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(TypeDefinition)
	 * @see hu.modembed.model.abstraction.types.TypesPackage#getType_Definition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.abstraction.types.Type#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(TypeDefinition value);

} // Type

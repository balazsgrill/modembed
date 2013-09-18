/**
 */
package hu.modembed.model.modembed.abstraction.types;

import hu.modembed.model.modembed.infrastructure.expressions.Expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.types.ArrayDefinition#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.types.TypesPackage#getArrayDefinition()
 * @model
 * @generated
 */
public interface ArrayDefinition extends ArrayTypeDefinition {

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Expression)
	 * @see hu.modembed.model.modembed.abstraction.types.TypesPackage#getArrayDefinition_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getSize();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.types.ArrayDefinition#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Expression value);
} // ArrayDefinition

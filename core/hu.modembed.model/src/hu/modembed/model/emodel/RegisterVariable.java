/**
 */
package hu.modembed.model.emodel;

import hu.modembed.model.emodel.expressions.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.RegisterVariable#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getRegisterVariable()
 * @model
 * @generated
 */
public interface RegisterVariable extends GlobalVariable {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(Expression)
	 * @see hu.modembed.model.emodel.EmodelPackage#getRegisterVariable_Address()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAddress();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.RegisterVariable#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Expression value);

} // RegisterVariable

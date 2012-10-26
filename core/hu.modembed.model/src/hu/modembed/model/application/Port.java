/**
 */
package hu.modembed.model.application;

import hu.modembed.model.application.interface_.ComponentInterface;

import hu.modembed.model.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.Port#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.ApplicationPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(ComponentInterface)
	 * @see hu.modembed.model.application.ApplicationPackage#getPort_Interface()
	 * @model
	 * @generated
	 */
	ComponentInterface getInterface();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.Port#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(ComponentInterface value);

} // Port

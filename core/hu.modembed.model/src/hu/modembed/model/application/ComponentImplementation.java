/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application;

import hu.modembed.model.core.PackagedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.ComponentImplementation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.ApplicationPackage#getComponentImplementation()
 * @model abstract="true"
 * @generated
 */
public interface ComponentImplementation extends PackagedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentType)
	 * @see hu.modembed.model.application.ApplicationPackage#getComponentImplementation_Type()
	 * @model
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.ComponentImplementation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

} // ComponentImplementation

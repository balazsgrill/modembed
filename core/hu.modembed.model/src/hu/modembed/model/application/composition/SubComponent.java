/**
 */
package hu.modembed.model.application.composition;

import hu.modembed.model.application.Component;

import hu.modembed.model.core.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.composition.SubComponent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.composition.CompositionPackage#getSubComponent()
 * @model
 * @generated
 */
public interface SubComponent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see hu.modembed.model.application.composition.CompositionPackage#getSubComponent_Type()
	 * @model
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.composition.SubComponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

} // SubComponent

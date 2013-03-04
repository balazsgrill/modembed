/**
 */
package hu.modembed.model.application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.Component#getUses <em>Uses</em>}</li>
 *   <li>{@link hu.modembed.model.application.Component#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.ApplicationPackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.application.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see hu.modembed.model.application.ApplicationPackage#getComponent_Uses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getUses();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.application.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see hu.modembed.model.application.ApplicationPackage#getComponent_Implements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getImplements();

} // Component

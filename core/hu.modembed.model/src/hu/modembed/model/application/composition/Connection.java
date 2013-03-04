/**
 */
package hu.modembed.model.application.composition;

import hu.modembed.model.application.Port;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.composition.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link hu.modembed.model.application.composition.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.composition.CompositionPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Port)
	 * @see hu.modembed.model.application.composition.CompositionPackage#getConnection_Source()
	 * @model
	 * @generated
	 */
	Port getSource();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.composition.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Port value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Port)
	 * @see hu.modembed.model.application.composition.CompositionPackage#getConnection_Target()
	 * @model
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.composition.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

} // Connection

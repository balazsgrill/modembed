/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.composition;

import hu.modembed.model.application.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.composition.CompositeComponent#getComponents <em>Components</em>}</li>
 *   <li>{@link hu.modembed.model.application.composition.CompositeComponent#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.composition.CompositionPackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.application.composition.SubComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see hu.modembed.model.application.composition.CompositionPackage#getCompositeComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.application.composition.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see hu.modembed.model.application.composition.CompositionPackage#getCompositeComponent_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // CompositeComponent

/**
 */
package hu.modembed.model.modembed.infrastructure;

import hu.modembed.model.modembed.infrastructure.traceability.Origin;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MO Dembed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.MODembedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.MODembedElement#getOrigins <em>Origins</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getMODembedElement()
 * @model abstract="true"
 * @generated
 */
public interface MODembedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getMODembedElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.MODembedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Origins</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.infrastructure.traceability.Origin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origins</em>' containment reference list.
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getMODembedElement_Origins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Origin> getOrigins();

} // MODembedElement

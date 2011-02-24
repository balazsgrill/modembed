/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig.instance;

import modembedconfig.Scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modembedconfig.instance.Configuration#getScheme <em>Scheme</em>}</li>
 *   <li>{@link modembedconfig.instance.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link modembedconfig.instance.Configuration#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see modembedconfig.instance.InstancePackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' reference.
	 * @see #setScheme(Scheme)
	 * @see modembedconfig.instance.InstancePackage#getConfiguration_Scheme()
	 * @model
	 * @generated
	 */
	Scheme getScheme();

	/**
	 * Sets the value of the '{@link modembedconfig.instance.Configuration#getScheme <em>Scheme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' reference.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(Scheme value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modembedconfig.instance.InstancePackage#getConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modembedconfig.instance.Configuration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link modembedconfig.instance.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see modembedconfig.instance.InstancePackage#getConfiguration_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // Configuration

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pic.ConfigurationWord#getAddress <em>Address</em>}</li>
 *   <li>{@link pic.ConfigurationWord#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see pic.PicPackage#getConfigurationWord()
 * @model
 * @generated
 */
public interface ConfigurationWord extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(int)
	 * @see pic.PicPackage#getConfigurationWord_Address()
	 * @model
	 * @generated
	 */
	int getAddress();

	/**
	 * Sets the value of the '{@link pic.ConfigurationWord#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(int value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link pic.ConfigurationField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see pic.PicPackage#getConfigurationWord_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationField> getFields();

} // ConfigurationWord

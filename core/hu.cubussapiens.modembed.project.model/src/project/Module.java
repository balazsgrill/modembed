/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link project.Module#getQualifiedID <em>Qualified ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see project.ProjectPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualified ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified ID</em>' attribute.
	 * @see #setQualifiedID(String)
	 * @see project.ProjectPackage#getModule_QualifiedID()
	 * @model
	 * @generated
	 */
	String getQualifiedID();

	/**
	 * Sets the value of the '{@link project.Module#getQualifiedID <em>Qualified ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified ID</em>' attribute.
	 * @see #getQualifiedID()
	 * @generated
	 */
	void setQualifiedID(String value);

} // Module

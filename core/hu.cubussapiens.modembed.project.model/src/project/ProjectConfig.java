/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link project.ProjectConfig#getSourcedirs <em>Sourcedirs</em>}</li>
 * </ul>
 * </p>
 *
 * @see project.ProjectPackage#getProjectConfig()
 * @model
 * @generated
 */
public interface ProjectConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Sourcedirs</b></em>' reference list.
	 * The list contents are of type {@link project.SourceDir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcedirs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcedirs</em>' reference list.
	 * @see project.ProjectPackage#getProjectConfig_Sourcedirs()
	 * @model
	 * @generated
	 */
	EList<SourceDir> getSourcedirs();

} // ProjectConfig

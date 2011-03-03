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
 *   <li>{@link project.ProjectConfig#getBuilds <em>Builds</em>}</li>
 *   <li>{@link project.ProjectConfig#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see project.ProjectPackage#getProjectConfig()
 * @model
 * @generated
 */
public interface ProjectConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Sourcedirs</b></em>' containment reference list.
	 * The list contents are of type {@link project.Directory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcedirs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcedirs</em>' containment reference list.
	 * @see project.ProjectPackage#getProjectConfig_Sourcedirs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directory> getSourcedirs();

	/**
	 * Returns the value of the '<em><b>Builds</b></em>' containment reference list.
	 * The list contents are of type {@link project.MainModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builds</em>' containment reference list.
	 * @see project.ProjectPackage#getProjectConfig_Builds()
	 * @model containment="true"
	 * @generated
	 */
	EList<MainModule> getBuilds();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link project.SettingsExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see project.ProjectPackage#getProjectConfig_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SettingsExtension> getExtensions();

} // ProjectConfig

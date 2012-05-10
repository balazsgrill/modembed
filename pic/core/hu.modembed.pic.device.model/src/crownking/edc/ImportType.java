/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ImportType#getModuleImport <em>Module Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getImportType()
 * @model extendedMetaData="name='ImportType' kind='elementOnly'"
 * @generated
 */
public interface ImportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Import</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ModuleImportType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Import</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Import</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getImportType_ModuleImport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Module_import' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleImportType> getModuleImport();

} // ImportType

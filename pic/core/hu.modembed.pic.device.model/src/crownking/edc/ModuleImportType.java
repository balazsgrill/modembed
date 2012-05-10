/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.ModuleImportType#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.ModuleImportType#getModsrc <em>Modsrc</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getModuleImportType()
 * @model extendedMetaData="name='Module_importType' kind='simple'"
 * @generated
 */
public interface ModuleImportType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see crownking.edc.EdcPackage#getModuleImportType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link crownking.edc.ModuleImportType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modsrc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modsrc</em>' attribute.
	 * @see #setModsrc(String)
	 * @see crownking.edc.EdcPackage#getModuleImportType_Modsrc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='modsrc'"
	 * @generated
	 */
	String getModsrc();

	/**
	 * Sets the value of the '{@link crownking.edc.ModuleImportType#getModsrc <em>Modsrc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modsrc</em>' attribute.
	 * @see #getModsrc()
	 * @generated
	 */
	void setModsrc(String value);

} // ModuleImportType

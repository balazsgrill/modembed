/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package picproject;

import pic.PicCPUType;

import project.SettingsExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIC Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link picproject.PICSettings#getCpu <em>Cpu</em>}</li>
 *   <li>{@link picproject.PICSettings#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see picproject.PicprojectPackage#getPICSettings()
 * @model
 * @generated
 */
public interface PICSettings extends SettingsExtension {
	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' reference.
	 * @see #setCpu(PicCPUType)
	 * @see picproject.PicprojectPackage#getPICSettings_Cpu()
	 * @model
	 * @generated
	 */
	PicCPUType getCpu();

	/**
	 * Sets the value of the '{@link picproject.PICSettings#getCpu <em>Cpu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' reference.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(PicCPUType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(String)
	 * @see picproject.PicprojectPackage#getPICSettings_Configuration()
	 * @model
	 * @generated
	 */
	String getConfiguration();

	/**
	 * Sets the value of the '{@link picproject.PICSettings#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(String value);

} // PICSettings

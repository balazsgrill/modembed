/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pic.PicCPUType#getName <em>Name</em>}</li>
 *   <li>{@link pic.PicCPUType#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see pic.PicPackage#getPicCPUType()
 * @model
 * @generated
 */
public interface PicCPUType extends EObject {
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
	 * @see pic.PicPackage#getPicCPUType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pic.PicCPUType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationBits)
	 * @see pic.PicPackage#getPicCPUType_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationBits getConfiguration();

	/**
	 * Sets the value of the '{@link pic.PicCPUType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationBits value);

} // PicCPUType

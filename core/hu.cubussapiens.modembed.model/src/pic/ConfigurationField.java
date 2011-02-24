/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic;

import modembedconfig.Parameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pic.ConfigurationField#getParameter <em>Parameter</em>}</li>
 *   <li>{@link pic.ConfigurationField#getStartBit <em>Start Bit</em>}</li>
 *   <li>{@link pic.ConfigurationField#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see pic.PicPackage#getConfigurationField()
 * @model
 * @generated
 */
public interface ConfigurationField extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see pic.PicPackage#getConfigurationField_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link pic.ConfigurationField#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Start Bit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Bit</em>' attribute.
	 * @see #setStartBit(int)
	 * @see pic.PicPackage#getConfigurationField_StartBit()
	 * @model
	 * @generated
	 */
	int getStartBit();

	/**
	 * Sets the value of the '{@link pic.ConfigurationField#getStartBit <em>Start Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Bit</em>' attribute.
	 * @see #getStartBit()
	 * @generated
	 */
	void setStartBit(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see pic.PicPackage#getConfigurationField_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link pic.ConfigurationField#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // ConfigurationField

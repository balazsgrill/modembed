/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic;

import modembedconfig.Scheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Bits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link pic.ConfigurationBits#getScheme <em>Scheme</em>}</li>
 *   <li>{@link pic.ConfigurationBits#getWords <em>Words</em>}</li>
 *   <li>{@link pic.ConfigurationBits#getWordsize <em>Wordsize</em>}</li>
 * </ul>
 * </p>
 *
 * @see pic.PicPackage#getConfigurationBits()
 * @model
 * @generated
 */
public interface ConfigurationBits extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' containment reference.
	 * @see #setScheme(Scheme)
	 * @see pic.PicPackage#getConfigurationBits_Scheme()
	 * @model containment="true"
	 * @generated
	 */
	Scheme getScheme();

	/**
	 * Sets the value of the '{@link pic.ConfigurationBits#getScheme <em>Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' containment reference.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(Scheme value);

	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link pic.ConfigurationWord}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see pic.PicPackage#getConfigurationBits_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationWord> getWords();

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wordsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(int)
	 * @see pic.PicPackage#getConfigurationBits_Wordsize()
	 * @model
	 * @generated
	 */
	int getWordsize();

	/**
	 * Sets the value of the '{@link pic.ConfigurationBits#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(int value);

} // ConfigurationBits

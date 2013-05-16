/**
 */
package hu.modembed.model.pic;

import hu.modembed.model.modembed.infrastructure.MODembedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.ConfigurationSelection#getField <em>Field</em>}</li>
 *   <li>{@link hu.modembed.model.pic.ConfigurationSelection#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.pic.PicPackage#getConfigurationSelection()
 * @model
 * @generated
 */
public interface ConfigurationSelection extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(ConfigField)
	 * @see hu.modembed.model.pic.PicPackage#getConfigurationSelection_Field()
	 * @model required="true"
	 * @generated
	 */
	ConfigField getField();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.ConfigurationSelection#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(ConfigField value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(ConfigLiteral)
	 * @see hu.modembed.model.pic.PicPackage#getConfigurationSelection_Selection()
	 * @model
	 * @generated
	 */
	ConfigLiteral getSelection();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.ConfigurationSelection#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(ConfigLiteral value);

} // ConfigurationSelection

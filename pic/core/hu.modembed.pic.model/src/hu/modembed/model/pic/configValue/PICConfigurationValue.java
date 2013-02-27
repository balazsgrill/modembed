/**
 */
package hu.modembed.model.pic.configValue;

import hu.modembed.model.core.RootElement;

import hu.modembed.model.pic.PICArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIC Configuration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.configValue.PICConfigurationValue#getValues <em>Values</em>}</li>
 *   <li>{@link hu.modembed.model.pic.configValue.PICConfigurationValue#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.pic.configValue.ConfigValuePackage#getPICConfigurationValue()
 * @model
 * @generated
 */
public interface PICConfigurationValue extends RootElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.pic.configValue.ConfigurationSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see hu.modembed.model.pic.configValue.ConfigValuePackage#getPICConfigurationValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationSelection> getValues();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(PICArchitecture)
	 * @see hu.modembed.model.pic.configValue.ConfigValuePackage#getPICConfigurationValue_Definition()
	 * @model
	 * @generated
	 */
	PICArchitecture getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.configValue.PICConfigurationValue#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(PICArchitecture value);

} // PICConfigurationValue

/**
 */
package hu.modembed.model.pic;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PIC Configuration Value Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.pic.PICConfigurationValueModel#getValues <em>Values</em>}</li>
 *   <li>{@link hu.modembed.model.pic.PICConfigurationValueModel#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.pic.PicPackage#getPICConfigurationValueModel()
 * @model
 * @generated
 */
public interface PICConfigurationValueModel extends RootElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.pic.ConfigurationSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see hu.modembed.model.pic.PicPackage#getPICConfigurationValueModel_Values()
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
	 * @see #setDefinition(PICConfigurationModel)
	 * @see hu.modembed.model.pic.PicPackage#getPICConfigurationValueModel_Definition()
	 * @model
	 * @generated
	 */
	PICConfigurationModel getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.pic.PICConfigurationValueModel#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(PICConfigurationModel value);

} // PICConfigurationValueModel

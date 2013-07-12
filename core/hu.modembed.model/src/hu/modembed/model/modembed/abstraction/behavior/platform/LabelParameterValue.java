/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getLabelParameterValue()
 * @model
 * @generated
 */
public interface LabelParameterValue extends InstructionParameterValue {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see #setLabel(OperationLocalLabel)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getLabelParameterValue_Label()
	 * @model required="true"
	 * @generated
	 */
	OperationLocalLabel getLabel();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue#getLabel <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(OperationLocalLabel value);

} // LabelParameterValue

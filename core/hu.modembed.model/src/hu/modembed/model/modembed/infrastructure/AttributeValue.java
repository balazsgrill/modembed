/**
 */
package hu.modembed.model.modembed.infrastructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.AttributeValue#getDefinition <em>Definition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.AttributeValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeDefinition)
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeValue_Definition()
	 * @model required="true"
	 * @generated
	 */
	AttributeDefinition getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.AttributeValue#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinition value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeValue_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.AttributeValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // AttributeValue

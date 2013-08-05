/**
 */
package hu.modembed.model.modembed.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.AttributeValueContainer#getDefinition <em>Definition</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.AttributeValueContainer#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeValueContainer()
 * @model
 * @generated
 */
public interface AttributeValueContainer extends RootElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeContainerDefinition)
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeValueContainer_Definition()
	 * @model required="true"
	 * @generated
	 */
	AttributeContainerDefinition getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.AttributeValueContainer#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeContainerDefinition value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.infrastructure.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeValueContainer_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValue> getValues();

} // AttributeValueContainer

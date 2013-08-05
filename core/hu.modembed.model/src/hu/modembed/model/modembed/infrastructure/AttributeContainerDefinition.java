/**
 */
package hu.modembed.model.modembed.infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Container Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeContainerDefinition()
 * @model
 * @generated
 */
public interface AttributeContainerDefinition extends RootElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.infrastructure.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see hu.modembed.model.modembed.infrastructure.InfrastructurePackage#getAttributeContainerDefinition_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getAttributes();

} // AttributeContainerDefinition

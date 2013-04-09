/**
 */
package hu.modembed.model.platform;

import hu.modembed.model.core.NamedElement;
import hu.modembed.model.emodel.types.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.OperationArgument#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.platform.OperationArgument#getIndirectionLevel <em>Indirection Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.platform.PlatformPackage#getOperationArgument()
 * @model
 * @generated
 */
public interface OperationArgument extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeDefinition)
	 * @see hu.modembed.model.platform.PlatformPackage#getOperationArgument_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.platform.OperationArgument#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Indirection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indirection Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirection Level</em>' attribute.
	 * @see #setIndirectionLevel(int)
	 * @see hu.modembed.model.platform.PlatformPackage#getOperationArgument_IndirectionLevel()
	 * @model
	 * @generated
	 */
	int getIndirectionLevel();

	/**
	 * Sets the value of the '{@link hu.modembed.model.platform.OperationArgument#getIndirectionLevel <em>Indirection Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indirection Level</em>' attribute.
	 * @see #getIndirectionLevel()
	 * @generated
	 */
	void setIndirectionLevel(int value);
} // OperationArgument

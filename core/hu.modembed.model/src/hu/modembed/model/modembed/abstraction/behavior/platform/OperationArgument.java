/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

import hu.modembed.model.modembed.infrastructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getMemType <em>Mem Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getOperationArgument()
 * @model
 * @generated
 */
public interface OperationArgument extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeDefinition)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getOperationArgument_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Mem Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Type</em>' reference.
	 * @see #setMemType(MemoryType)
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#getOperationArgument_MemType()
	 * @model
	 * @generated
	 */
	MemoryType getMemType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getMemType <em>Mem Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Type</em>' reference.
	 * @see #getMemType()
	 * @generated
	 */
	void setMemType(MemoryType value);

} // OperationArgument

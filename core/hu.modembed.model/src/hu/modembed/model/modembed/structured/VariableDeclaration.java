/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

import hu.modembed.model.modembed.infrastructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.VariableDeclaration#isConst <em>Const</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.VariableDeclaration#isGlobal <em>Global</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.VariableDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.VariableDeclaration#getInitValue <em>Init Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const</em>' attribute.
	 * @see #setConst(boolean)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableDeclaration_Const()
	 * @model required="true"
	 * @generated
	 */
	boolean isConst();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.VariableDeclaration#isConst <em>Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const</em>' attribute.
	 * @see #isConst()
	 * @generated
	 */
	void setConst(boolean value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' attribute.
	 * @see #setGlobal(boolean)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableDeclaration_Global()
	 * @model required="true"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.VariableDeclaration#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

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
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableDeclaration_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.VariableDeclaration#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value</em>' containment reference.
	 * @see #setInitValue(Expression)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getVariableDeclaration_InitValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.VariableDeclaration#getInitValue <em>Init Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' containment reference.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(Expression value);

} // VariableDeclaration

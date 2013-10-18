/**
 */
package hu.modembed.model.modembed.structured;

import hu.modembed.model.modembed.abstraction.types.TypeDefinition;

import hu.modembed.model.modembed.infrastructure.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredFunction#isGlobal <em>Global</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredFunction#getResultType <em>Result Type</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.structured.StructuredFunction#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredFunction()
 * @model
 * @generated
 */
public interface StructuredFunction extends NamedElement {
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
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredFunction_Global()
	 * @model required="true"
	 * @generated
	 */
	boolean isGlobal();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.StructuredFunction#isGlobal <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' attribute.
	 * @see #isGlobal()
	 * @generated
	 */
	void setGlobal(boolean value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' containment reference.
	 * @see #setResultType(TypeDefinition)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredFunction_ResultType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeDefinition getResultType();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.StructuredFunction#getResultType <em>Result Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' containment reference.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(TypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.structured.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredFunction_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getParameters();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(Operation)
	 * @see hu.modembed.model.modembed.structured.StructuredPackage#getStructuredFunction_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	Operation getImplementation();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.structured.StructuredFunction#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(Operation value);

} // StructuredFunction

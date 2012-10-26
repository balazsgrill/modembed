/**
 */
package hu.modembed.model.emodel;

import hu.modembed.model.emodel.expressions.ExecutionStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.Function#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.Function#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.Function#getResult <em>Result</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.Function#getImplementation <em>Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends LibraryElement {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.FunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.modembed.model.emodel.EmodelPackage#getFunction_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionParameter> getArguments();

	/**
	 * Returns the value of the '<em><b>Overrides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overrides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overrides</em>' reference.
	 * @see #setOverrides(Function)
	 * @see hu.modembed.model.emodel.EmodelPackage#getFunction_Overrides()
	 * @model
	 * @generated
	 */
	Function getOverrides();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.Function#getOverrides <em>Overrides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overrides</em>' reference.
	 * @see #getOverrides()
	 * @generated
	 */
	void setOverrides(Function value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(FunctionResult)
	 * @see hu.modembed.model.emodel.EmodelPackage#getFunction_Result()
	 * @model containment="true"
	 * @generated
	 */
	FunctionResult getResult();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.Function#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(FunctionResult value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(ExecutionStep)
	 * @see hu.modembed.model.emodel.EmodelPackage#getFunction_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionStep getImplementation();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.Function#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(ExecutionStep value);

} // Function

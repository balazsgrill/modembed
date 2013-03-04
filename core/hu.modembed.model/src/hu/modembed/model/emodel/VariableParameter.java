/**
 */
package hu.modembed.model.emodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.VariableParameter#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getVariableParameter()
 * @model
 * @generated
 */
public interface VariableParameter extends FunctionParameter {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.modembed.model.emodel.VariableParameterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see hu.modembed.model.emodel.VariableParameterKind
	 * @see #setKind(VariableParameterKind)
	 * @see hu.modembed.model.emodel.EmodelPackage#getVariableParameter_Kind()
	 * @model
	 * @generated
	 */
	VariableParameterKind getKind();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.VariableParameter#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see hu.modembed.model.emodel.VariableParameterKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(VariableParameterKind value);
} // VariableParameter

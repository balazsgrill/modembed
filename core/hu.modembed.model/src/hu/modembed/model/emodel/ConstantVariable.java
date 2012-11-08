/**
 */
package hu.modembed.model.emodel;

import hu.modembed.model.emodel.expressions.ExecutionStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.ConstantVariable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getConstantVariable()
 * @model
 * @generated
 */
public interface ConstantVariable extends GlobalVariable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ExecutionStep)
	 * @see hu.modembed.model.emodel.EmodelPackage#getConstantVariable_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutionStep getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.ConstantVariable#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ExecutionStep value);

} // ConstantVariable
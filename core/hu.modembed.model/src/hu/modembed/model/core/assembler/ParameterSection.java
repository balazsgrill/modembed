/**
 */
package hu.modembed.model.core.assembler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.ParameterSection#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.assembler.AssemblerPackage#getParameterSection()
 * @model
 * @generated
 */
public interface ParameterSection extends InstructionSection {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(InstructionParameter)
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getParameterSection_Parameter()
	 * @model required="true"
	 * @generated
	 */
	InstructionParameter getParameter();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.ParameterSection#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(InstructionParameter value);

} // ParameterSection

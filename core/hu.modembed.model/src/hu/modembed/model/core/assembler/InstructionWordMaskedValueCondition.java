/**
 */
package hu.modembed.model.core.assembler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Word Masked Value Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition#getMask <em>Mask</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionWordMaskedValueCondition()
 * @model
 * @generated
 */
public interface InstructionWordMaskedValueCondition extends InstructionWordCondition {
	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(long)
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionWordMaskedValueCondition_Mask()
	 * @model
	 * @generated
	 */
	long getMask();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(long value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionWordMaskedValueCondition_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(InstructionParameter)
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#getInstructionWordMaskedValueCondition_Argument()
	 * @model required="true"
	 * @generated
	 */
	InstructionParameter getArgument();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(InstructionParameter value);

} // InstructionWordMaskedValueCondition

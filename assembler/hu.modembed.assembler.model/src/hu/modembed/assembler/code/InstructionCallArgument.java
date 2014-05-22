/**
 */
package hu.modembed.assembler.code;

import hu.modembed.assembler.instructionset.InstructionParameter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Call Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.assembler.code.InstructionCallArgument#getDefinition <em>Definition</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.InstructionCallArgument#getValue <em>Value</em>}</li>
 *   <li>{@link hu.modembed.assembler.code.InstructionCallArgument#isLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.assembler.code.CodePackage#getInstructionCallArgument()
 * @model
 * @generated
 */
public interface InstructionCallArgument extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(InstructionParameter)
	 * @see hu.modembed.assembler.code.CodePackage#getInstructionCallArgument_Definition()
	 * @model required="true"
	 * @generated
	 */
	InstructionParameter getDefinition();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.code.InstructionCallArgument#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(InstructionParameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see hu.modembed.assembler.code.CodePackage#getInstructionCallArgument_Value()
	 * @model default="0" required="true"
	 *        extendedMetaData="namespace=''"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.code.InstructionCallArgument#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(boolean)
	 * @see hu.modembed.assembler.code.CodePackage#getInstructionCallArgument_Label()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isLabel();

	/**
	 * Sets the value of the '{@link hu.modembed.assembler.code.InstructionCallArgument#isLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isLabel()
	 * @generated
	 */
	void setLabel(boolean value);

} // InstructionCallArgument

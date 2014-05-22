/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.assembler.instructionset.InstructionsetPackage
 * @generated
 */
public interface InstructionsetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstructionsetFactory eINSTANCE = hu.modembed.assembler.instructionset.impl.InstructionsetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instruction Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Set</em>'.
	 * @generated
	 */
	InstructionSet createInstructionSet();

	/**
	 * Returns a new object of class '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction</em>'.
	 * @generated
	 */
	Instruction createInstruction();

	/**
	 * Returns a new object of class '<em>Instruction Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Parameter</em>'.
	 * @generated
	 */
	InstructionParameter createInstructionParameter();

	/**
	 * Returns a new object of class '<em>Instruction Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Word</em>'.
	 * @generated
	 */
	InstructionWord createInstructionWord();

	/**
	 * Returns a new object of class '<em>Parameter Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Section</em>'.
	 * @generated
	 */
	ParameterSection createParameterSection();

	/**
	 * Returns a new object of class '<em>Constant Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Section</em>'.
	 * @generated
	 */
	ConstantSection createConstantSection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstructionsetPackage getInstructionsetPackage();

} //InstructionsetFactory

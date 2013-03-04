/**
 */
package hu.modembed.model.core.assembler.code;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.core.assembler.code.CodePackage
 * @generated
 */
public interface CodeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeFactory eINSTANCE = hu.modembed.model.core.assembler.code.impl.CodeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assembler Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assembler Object</em>'.
	 * @generated
	 */
	AssemblerObject createAssemblerObject();

	/**
	 * Returns a new object of class '<em>Instruction Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Call</em>'.
	 * @generated
	 */
	InstructionCall createInstructionCall();

	/**
	 * Returns a new object of class '<em>Instruction Call Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Call Parameter</em>'.
	 * @generated
	 */
	InstructionCallParameter createInstructionCallParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodePackage getCodePackage();

} //CodeFactory

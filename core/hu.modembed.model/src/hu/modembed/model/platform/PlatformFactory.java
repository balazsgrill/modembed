/**
 */
package hu.modembed.model.platform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.platform.PlatformPackage
 * @generated
 */
public interface PlatformFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformFactory eINSTANCE = hu.modembed.model.platform.impl.PlatformFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	PlatformDefinition createPlatformDefinition();

	/**
	 * Returns a new object of class '<em>Operation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Definition</em>'.
	 * @generated
	 */
	OperationDefinition createOperationDefinition();

	/**
	 * Returns a new object of class '<em>Operation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Argument</em>'.
	 * @generated
	 */
	OperationArgument createOperationArgument();

	/**
	 * Returns a new object of class '<em>Instruction Call Operation Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Call Operation Step</em>'.
	 * @generated
	 */
	InstructionCallOperationStep createInstructionCallOperationStep();

	/**
	 * Returns a new object of class '<em>Instruction Parameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Parameter Mapping</em>'.
	 * @generated
	 */
	InstructionParameterMapping createInstructionParameterMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PlatformPackage getPlatformPackage();

} //PlatformFactory

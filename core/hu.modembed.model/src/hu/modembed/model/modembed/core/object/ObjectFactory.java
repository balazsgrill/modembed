/**
 */
package hu.modembed.model.modembed.core.object;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.core.object.ObjectPackage
 * @generated
 */
public interface ObjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ObjectFactory eINSTANCE = hu.modembed.model.modembed.core.object.impl.ObjectFactoryImpl.init();

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
	 * Returns a new object of class '<em>Program Link Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Link Map</em>'.
	 * @generated
	 */
	ProgramLinkMap createProgramLinkMap();

	/**
	 * Returns a new object of class '<em>Link Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Mapping</em>'.
	 * @generated
	 */
	LinkMapping createLinkMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ObjectPackage getObjectPackage();

} //ObjectFactory

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.e.compiler.list.ListPackage
 * @generated
 */
public interface ListFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListFactory eINSTANCE = hu.e.compiler.list.impl.ListFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program List</em>'.
	 * @generated
	 */
	ProgramList createProgramList();

	/**
	 * Returns a new object of class '<em>Instruction Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction Step</em>'.
	 * @generated
	 */
	InstructionStep createInstructionStep();

	/**
	 * Returns a new object of class '<em>Sequence Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Step</em>'.
	 * @generated
	 */
	SequenceStep createSequenceStep();

	/**
	 * Returns a new object of class '<em>Choice Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Step</em>'.
	 * @generated
	 */
	ChoiceStep createChoiceStep();

	/**
	 * Returns a new object of class '<em>Label Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Step</em>'.
	 * @generated
	 */
	LabelStep createLabelStep();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Status Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status Step</em>'.
	 * @generated
	 */
	StatusStep createStatusStep();

	/**
	 * Returns a new object of class '<em>Memory Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Assignment</em>'.
	 * @generated
	 */
	MemoryAssignment createMemoryAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ListPackage getListPackage();

} //ListFactory

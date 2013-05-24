/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage
 * @generated
 */
public interface BehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorFactory eINSTANCE = hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequential Behavior Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Behavior Module</em>'.
	 * @generated
	 */
	SequentialBehaviorModule createSequentialBehaviorModule();

	/**
	 * Returns a new object of class '<em>Sequential Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Behavior</em>'.
	 * @generated
	 */
	SequentialBehavior createSequentialBehavior();

	/**
	 * Returns a new object of class '<em>Code Symbol Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Symbol Placement</em>'.
	 * @generated
	 */
	CodeSymbolPlacement createCodeSymbolPlacement();

	/**
	 * Returns a new object of class '<em>Operation Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Execution</em>'.
	 * @generated
	 */
	OperationExecution createOperationExecution();

	/**
	 * Returns a new object of class '<em>Symbol Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Allocation</em>'.
	 * @generated
	 */
	SymbolAllocation createSymbolAllocation();

	/**
	 * Returns a new object of class '<em>Symbol Address Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Address Assignment</em>'.
	 * @generated
	 */
	SymbolAddressAssignment createSymbolAddressAssignment();

	/**
	 * Returns a new object of class '<em>Symbol Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Value Assignment</em>'.
	 * @generated
	 */
	SymbolValueAssignment createSymbolValueAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviorPackage getBehaviorPackage();

} //BehaviorFactory

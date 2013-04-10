/**
 */
package hu.modembed.model.abstraction.behavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage
 * @generated
 */
public interface BehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorFactory eINSTANCE = hu.modembed.model.abstraction.behavior.impl.BehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequential Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Behavior</em>'.
	 * @generated
	 */
	SequentialBehavior createSequentialBehavior();

	/**
	 * Returns a new object of class '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol</em>'.
	 * @generated
	 */
	Symbol createSymbol();

	/**
	 * Returns a new object of class '<em>Code Symbol Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Symbol Placement</em>'.
	 * @generated
	 */
	CodeSymbolPlacement createCodeSymbolPlacement();

	/**
	 * Returns a new object of class '<em>Atomic Operation Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Operation Execution</em>'.
	 * @generated
	 */
	AtomicOperationExecution createAtomicOperationExecution();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	BehaviorCall createBehaviorCall();

	/**
	 * Returns a new object of class '<em>Symbol Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Mapping</em>'.
	 * @generated
	 */
	SymbolMapping createSymbolMapping();

	/**
	 * Returns a new object of class '<em>Symbol Value Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symbol Value Map</em>'.
	 * @generated
	 */
	SymbolValueMap createSymbolValueMap();

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

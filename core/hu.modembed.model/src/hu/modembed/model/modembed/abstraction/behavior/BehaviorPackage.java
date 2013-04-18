/**
 */
package hu.modembed.model.modembed.abstraction.behavior;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/abstraction/behavior";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviorPackage eINSTANCE = hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl <em>Sequential Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSequentialBehavior()
	 * @generated
	 */
	int SEQUENTIAL_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_BEHAVIOR__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_BEHAVIOR__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_BEHAVIOR__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_BEHAVIOR__SYMBOLS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_BEHAVIOR__ACTIONS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequential Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_BEHAVIOR_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__TYPE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__EXTERNAL = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialActionImpl <em>Sequential Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SequentialActionImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSequentialAction()
	 * @generated
	 */
	int SEQUENTIAL_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ACTION__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ACTION__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The number of structural features of the '<em>Sequential Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ACTION_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.CodeSymbolPlacementImpl <em>Code Symbol Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.CodeSymbolPlacementImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getCodeSymbolPlacement()
	 * @generated
	 */
	int CODE_SYMBOL_PLACEMENT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYMBOL_PLACEMENT__DESCRIPTION = SEQUENTIAL_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYMBOL_PLACEMENT__ORIGINS = SEQUENTIAL_ACTION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYMBOL_PLACEMENT__SYMBOL = SEQUENTIAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Symbol Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYMBOL_PLACEMENT_FEATURE_COUNT = SEQUENTIAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.AtomicOperationExecutionImpl <em>Atomic Operation Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.AtomicOperationExecutionImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getAtomicOperationExecution()
	 * @generated
	 */
	int ATOMIC_OPERATION_EXECUTION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_EXECUTION__DESCRIPTION = SEQUENTIAL_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_EXECUTION__ORIGINS = SEQUENTIAL_ACTION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_EXECUTION__ARGUMENTS = SEQUENTIAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_EXECUTION__OPERATION = SEQUENTIAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Operation Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATION_EXECUTION_FEATURE_COUNT = SEQUENTIAL_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorCallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorCallImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getBehaviorCall()
	 * @generated
	 */
	int BEHAVIOR_CALL = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CALL__DESCRIPTION = SEQUENTIAL_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CALL__ORIGINS = SEQUENTIAL_ACTION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Argument Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CALL__ARGUMENT_MAPPINGS = SEQUENTIAL_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_CALL_FEATURE_COUNT = SEQUENTIAL_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingImpl <em>Symbol Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbolMapping()
	 * @generated
	 */
	int SYMBOL_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_MAPPING__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_MAPPING__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Local</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_MAPPING__LOCAL = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_MAPPING__REMOTE = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbol Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_MAPPING_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueMapImpl <em>Symbol Value Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueMapImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbolValueMap()
	 * @generated
	 */
	int SYMBOL_VALUE_MAP = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_MAP__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_MAP__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_MAP__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_MAP__VALUES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol Value Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_MAP_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl <em>Symbol Value Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbolValueAssignment()
	 * @generated
	 */
	int SYMBOL_VALUE_ASSIGNMENT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_ASSIGNMENT__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_ASSIGNMENT__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_ASSIGNMENT__SYMBOL = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_ASSIGNMENT__VALUE = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indirection Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Symbol Value Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_VALUE_ASSIGNMENT_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior <em>Sequential Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Behavior</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior
	 * @generated
	 */
	EClass getSequentialBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbols</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getSymbols()
	 * @see #getSequentialBehavior()
	 * @generated
	 */
	EReference getSequentialBehavior_Symbols();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior#getActions()
	 * @see #getSequentialBehavior()
	 * @generated
	 */
	EReference getSequentialBehavior_Actions();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.abstraction.behavior.Symbol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.Symbol#getType()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Type();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.Symbol#isExternal <em>External</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.Symbol#isExternal()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_External();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.SequentialAction <em>Sequential Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Action</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SequentialAction
	 * @generated
	 */
	EClass getSequentialAction();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement <em>Code Symbol Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Symbol Placement</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement
	 * @generated
	 */
	EClass getCodeSymbolPlacement();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement#getSymbol()
	 * @see #getCodeSymbolPlacement()
	 * @generated
	 */
	EReference getCodeSymbolPlacement_Symbol();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution <em>Atomic Operation Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Operation Execution</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution
	 * @generated
	 */
	EClass getAtomicOperationExecution();

	/**
	 * Returns the meta object for the reference list '{@link hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getArguments()
	 * @see #getAtomicOperationExecution()
	 * @generated
	 */
	EReference getAtomicOperationExecution_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.AtomicOperationExecution#getOperation()
	 * @see #getAtomicOperationExecution()
	 * @generated
	 */
	EAttribute getAtomicOperationExecution_Operation();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.BehaviorCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorCall
	 * @generated
	 */
	EClass getBehaviorCall();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.BehaviorCall#getArgumentMappings <em>Argument Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Mappings</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorCall#getArgumentMappings()
	 * @see #getBehaviorCall()
	 * @generated
	 */
	EReference getBehaviorCall_ArgumentMappings();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMapping <em>Symbol Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Mapping</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolMapping
	 * @generated
	 */
	EClass getSymbolMapping();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMapping#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolMapping#getLocal()
	 * @see #getSymbolMapping()
	 * @generated
	 */
	EReference getSymbolMapping_Local();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolMapping#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolMapping#getRemote()
	 * @see #getSymbolMapping()
	 * @generated
	 */
	EReference getSymbolMapping_Remote();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueMap <em>Symbol Value Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Value Map</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolValueMap
	 * @generated
	 */
	EClass getSymbolValueMap();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueMap#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolValueMap#getValues()
	 * @see #getSymbolValueMap()
	 * @generated
	 */
	EReference getSymbolValueMap_Values();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment <em>Symbol Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol Value Assignment</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment
	 * @generated
	 */
	EClass getSymbolValueAssignment();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getSymbol()
	 * @see #getSymbolValueAssignment()
	 * @generated
	 */
	EReference getSymbolValueAssignment_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getValue()
	 * @see #getSymbolValueAssignment()
	 * @generated
	 */
	EAttribute getSymbolValueAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getIndirectionLevel <em>Indirection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indirection Level</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment#getIndirectionLevel()
	 * @see #getSymbolValueAssignment()
	 * @generated
	 */
	EAttribute getSymbolValueAssignment_IndirectionLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviorFactory getBehaviorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl <em>Sequential Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SequentialBehaviorImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSequentialBehavior()
		 * @generated
		 */
		EClass SEQUENTIAL_BEHAVIOR = eINSTANCE.getSequentialBehavior();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_BEHAVIOR__SYMBOLS = eINSTANCE.getSequentialBehavior_Symbols();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_BEHAVIOR__ACTIONS = eINSTANCE.getSequentialBehavior_Actions();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__TYPE = eINSTANCE.getSymbol_Type();

		/**
		 * The meta object literal for the '<em><b>External</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__EXTERNAL = eINSTANCE.getSymbol_External();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SequentialActionImpl <em>Sequential Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SequentialActionImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSequentialAction()
		 * @generated
		 */
		EClass SEQUENTIAL_ACTION = eINSTANCE.getSequentialAction();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.CodeSymbolPlacementImpl <em>Code Symbol Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.CodeSymbolPlacementImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getCodeSymbolPlacement()
		 * @generated
		 */
		EClass CODE_SYMBOL_PLACEMENT = eINSTANCE.getCodeSymbolPlacement();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SYMBOL_PLACEMENT__SYMBOL = eINSTANCE.getCodeSymbolPlacement_Symbol();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.AtomicOperationExecutionImpl <em>Atomic Operation Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.AtomicOperationExecutionImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getAtomicOperationExecution()
		 * @generated
		 */
		EClass ATOMIC_OPERATION_EXECUTION = eINSTANCE.getAtomicOperationExecution();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_OPERATION_EXECUTION__ARGUMENTS = eINSTANCE.getAtomicOperationExecution_Arguments();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_OPERATION_EXECUTION__OPERATION = eINSTANCE.getAtomicOperationExecution_Operation();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorCallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorCallImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getBehaviorCall()
		 * @generated
		 */
		EClass BEHAVIOR_CALL = eINSTANCE.getBehaviorCall();

		/**
		 * The meta object literal for the '<em><b>Argument Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_CALL__ARGUMENT_MAPPINGS = eINSTANCE.getBehaviorCall_ArgumentMappings();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingImpl <em>Symbol Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolMappingImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbolMapping()
		 * @generated
		 */
		EClass SYMBOL_MAPPING = eINSTANCE.getSymbolMapping();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_MAPPING__LOCAL = eINSTANCE.getSymbolMapping_Local();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_MAPPING__REMOTE = eINSTANCE.getSymbolMapping_Remote();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueMapImpl <em>Symbol Value Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueMapImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbolValueMap()
		 * @generated
		 */
		EClass SYMBOL_VALUE_MAP = eINSTANCE.getSymbolValueMap();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_VALUE_MAP__VALUES = eINSTANCE.getSymbolValueMap_Values();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl <em>Symbol Value Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.SymbolValueAssignmentImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl#getSymbolValueAssignment()
		 * @generated
		 */
		EClass SYMBOL_VALUE_ASSIGNMENT = eINSTANCE.getSymbolValueAssignment();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL_VALUE_ASSIGNMENT__SYMBOL = eINSTANCE.getSymbolValueAssignment_Symbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_VALUE_ASSIGNMENT__VALUE = eINSTANCE.getSymbolValueAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Indirection Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL_VALUE_ASSIGNMENT__INDIRECTION_LEVEL = eINSTANCE.getSymbolValueAssignment_IndirectionLevel();

	}

} //BehaviorPackage
/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.behavior.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorFactoryImpl extends EFactoryImpl implements BehaviorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFactory init() {
		try {
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviorPackage.eNS_URI);
			if (theBehaviorFactory != null) {
				return theBehaviorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE: return createSequentialBehaviorModule();
			case BehaviorPackage.SYMBOL_MAP: return createSymbolMap();
			case BehaviorPackage.SYMBOL_MAPPING_RULES: return createSymbolMappingRules();
			case BehaviorPackage.SYMBOL_MAPPING_RULE: return createSymbolMappingRule();
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR: return createRootSequentialBehavior();
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART: return createSequentialBehaviorPart();
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT: return createCodeSymbolPlacement();
			case BehaviorPackage.OPERATION_EXECUTION: return createOperationExecution();
			case BehaviorPackage.SYMBOL_ALLOCATION: return createSymbolAllocation();
			case BehaviorPackage.SYMBOL_INDIRECTION: return createSymbolIndirection();
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT: return createSymbolAddressAssignment();
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT: return createSymbolValueAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialBehaviorModule createSequentialBehaviorModule() {
		SequentialBehaviorModuleImpl sequentialBehaviorModule = new SequentialBehaviorModuleImpl();
		return sequentialBehaviorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolMap createSymbolMap() {
		SymbolMapImpl symbolMap = new SymbolMapImpl();
		return symbolMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolMappingRules createSymbolMappingRules() {
		SymbolMappingRulesImpl symbolMappingRules = new SymbolMappingRulesImpl();
		return symbolMappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolMappingRule createSymbolMappingRule() {
		SymbolMappingRuleImpl symbolMappingRule = new SymbolMappingRuleImpl();
		return symbolMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootSequentialBehavior createRootSequentialBehavior() {
		RootSequentialBehaviorImpl rootSequentialBehavior = new RootSequentialBehaviorImpl();
		return rootSequentialBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialBehaviorPart createSequentialBehaviorPart() {
		SequentialBehaviorPartImpl sequentialBehaviorPart = new SequentialBehaviorPartImpl();
		return sequentialBehaviorPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSymbolPlacement createCodeSymbolPlacement() {
		CodeSymbolPlacementImpl codeSymbolPlacement = new CodeSymbolPlacementImpl();
		return codeSymbolPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationExecution createOperationExecution() {
		OperationExecutionImpl operationExecution = new OperationExecutionImpl();
		return operationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolAllocation createSymbolAllocation() {
		SymbolAllocationImpl symbolAllocation = new SymbolAllocationImpl();
		return symbolAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolIndirection createSymbolIndirection() {
		SymbolIndirectionImpl symbolIndirection = new SymbolIndirectionImpl();
		return symbolIndirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolAddressAssignment createSymbolAddressAssignment() {
		SymbolAddressAssignmentImpl symbolAddressAssignment = new SymbolAddressAssignmentImpl();
		return symbolAddressAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolValueAssignment createSymbolValueAssignment() {
		SymbolValueAssignmentImpl symbolValueAssignment = new SymbolValueAssignmentImpl();
		return symbolValueAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorPackage getBehaviorPackage() {
		return (BehaviorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviorPackage getPackage() {
		return BehaviorPackage.eINSTANCE;
	}

} //BehaviorFactoryImpl

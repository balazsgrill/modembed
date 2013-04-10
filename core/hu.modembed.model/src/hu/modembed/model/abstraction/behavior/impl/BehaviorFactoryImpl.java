/**
 */
package hu.modembed.model.abstraction.behavior.impl;

import hu.modembed.model.abstraction.behavior.*;

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
			BehaviorFactory theBehaviorFactory = (BehaviorFactory)EPackage.Registry.INSTANCE.getEFactory("http://modembed.hu/behavior"); 
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR: return createSequentialBehavior();
			case BehaviorPackage.SYMBOL: return createSymbol();
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT: return createCodeSymbolPlacement();
			case BehaviorPackage.ATOMIC_OPERATION_EXECUTION: return createAtomicOperationExecution();
			case BehaviorPackage.BEHAVIOR_CALL: return createBehaviorCall();
			case BehaviorPackage.SYMBOL_MAPPING: return createSymbolMapping();
			case BehaviorPackage.SYMBOL_VALUE_MAP: return createSymbolValueMap();
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
	public SequentialBehavior createSequentialBehavior() {
		SequentialBehaviorImpl sequentialBehavior = new SequentialBehaviorImpl();
		return sequentialBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
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
	public AtomicOperationExecution createAtomicOperationExecution() {
		AtomicOperationExecutionImpl atomicOperationExecution = new AtomicOperationExecutionImpl();
		return atomicOperationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorCall createBehaviorCall() {
		BehaviorCallImpl behaviorCall = new BehaviorCallImpl();
		return behaviorCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolMapping createSymbolMapping() {
		SymbolMappingImpl symbolMapping = new SymbolMappingImpl();
		return symbolMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolValueMap createSymbolValueMap() {
		SymbolValueMapImpl symbolValueMap = new SymbolValueMapImpl();
		return symbolValueMap;
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

/**
 */
package hu.modembed.model.modembed.abstraction.behavior.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement;
import hu.modembed.model.modembed.abstraction.behavior.OperationExecution;
import hu.modembed.model.modembed.abstraction.behavior.SequentialAction;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehavior;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation;
import hu.modembed.model.modembed.abstraction.behavior.SymbolAssignment;
import hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment;
import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;
import hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl;
import hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl;
import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage;
import hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl;
import hu.modembed.model.modembed.abstraction.types.TypesPackage;
import hu.modembed.model.modembed.abstraction.types.impl.TypesPackageImpl;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;
import hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl;
import hu.modembed.model.modembed.core.object.ObjectPackage;
import hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
import hu.modembed.model.modembed.infrastructure.impl.InfrastructurePackageImpl;
import hu.modembed.model.modembed.infrastructure.traceability.TraceabilityPackage;
import hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorPackageImpl extends EPackageImpl implements BehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialBehaviorModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSymbolPlacementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationExecutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolAddressAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolValueAssignmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviorPackageImpl() {
		super(eNS_URI, BehaviorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviorPackage init() {
		if (isInited) return (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Obtain or create and register package
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviorPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);
		InstructionsetPackageImpl theInstructionsetPackage = (InstructionsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) instanceof InstructionsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) : InstructionsetPackage.eINSTANCE);
		ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
		AbstractionPackageImpl theAbstractionPackage = (AbstractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) instanceof AbstractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) : AbstractionPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		MemorymodelPackageImpl theMemorymodelPackage = (MemorymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) instanceof MemorymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) : MemorymodelPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviorPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theInstructionsetPackage.createPackageContents();
		theObjectPackage.createPackageContents();
		theAbstractionPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theMemorymodelPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviorPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theInstructionsetPackage.initializePackageContents();
		theObjectPackage.initializePackageContents();
		theAbstractionPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theMemorymodelPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviorPackage.eNS_URI, theBehaviorPackage);
		return theBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialBehaviorModule() {
		return sequentialBehaviorModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialBehaviorModule_Device() {
		return (EReference)sequentialBehaviorModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialBehaviorModule_SymbolMappings() {
		return (EReference)sequentialBehaviorModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialBehaviorModule_BehaviorModels() {
		return (EReference)sequentialBehaviorModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialBehavior() {
		return sequentialBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialBehavior_Actions() {
		return (EReference)sequentialBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequentialBehavior_Parameters() {
		return (EAttribute)sequentialBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialBehavior_LocalSymbols() {
		return (EReference)sequentialBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialAction() {
		return sequentialActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSymbolPlacement() {
		return codeSymbolPlacementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeSymbolPlacement_Symbol() {
		return (EAttribute)codeSymbolPlacementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationExecution() {
		return operationExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationExecution_Arguments() {
		return (EAttribute)operationExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationExecution_Operation() {
		return (EAttribute)operationExecutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolAssignment() {
		return symbolAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolAssignment_Symbol() {
		return (EAttribute)symbolAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolAssignment_Type() {
		return (EReference)symbolAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolAllocation() {
		return symbolAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolAddressAssignment() {
		return symbolAddressAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolAddressAssignment_MemoryInstance() {
		return (EReference)symbolAddressAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolAddressAssignment_Address() {
		return (EAttribute)symbolAddressAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolValueAssignment() {
		return symbolValueAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbolValueAssignment_Value() {
		return (EAttribute)symbolValueAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorFactory getBehaviorFactory() {
		return (BehaviorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sequentialBehaviorModuleEClass = createEClass(SEQUENTIAL_BEHAVIOR_MODULE);
		createEReference(sequentialBehaviorModuleEClass, SEQUENTIAL_BEHAVIOR_MODULE__DEVICE);
		createEReference(sequentialBehaviorModuleEClass, SEQUENTIAL_BEHAVIOR_MODULE__SYMBOL_MAPPINGS);
		createEReference(sequentialBehaviorModuleEClass, SEQUENTIAL_BEHAVIOR_MODULE__BEHAVIOR_MODELS);

		sequentialBehaviorEClass = createEClass(SEQUENTIAL_BEHAVIOR);
		createEReference(sequentialBehaviorEClass, SEQUENTIAL_BEHAVIOR__ACTIONS);
		createEAttribute(sequentialBehaviorEClass, SEQUENTIAL_BEHAVIOR__PARAMETERS);
		createEReference(sequentialBehaviorEClass, SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS);

		sequentialActionEClass = createEClass(SEQUENTIAL_ACTION);

		codeSymbolPlacementEClass = createEClass(CODE_SYMBOL_PLACEMENT);
		createEAttribute(codeSymbolPlacementEClass, CODE_SYMBOL_PLACEMENT__SYMBOL);

		operationExecutionEClass = createEClass(OPERATION_EXECUTION);
		createEAttribute(operationExecutionEClass, OPERATION_EXECUTION__ARGUMENTS);
		createEAttribute(operationExecutionEClass, OPERATION_EXECUTION__OPERATION);

		symbolAssignmentEClass = createEClass(SYMBOL_ASSIGNMENT);
		createEAttribute(symbolAssignmentEClass, SYMBOL_ASSIGNMENT__SYMBOL);
		createEReference(symbolAssignmentEClass, SYMBOL_ASSIGNMENT__TYPE);

		symbolAllocationEClass = createEClass(SYMBOL_ALLOCATION);

		symbolAddressAssignmentEClass = createEClass(SYMBOL_ADDRESS_ASSIGNMENT);
		createEReference(symbolAddressAssignmentEClass, SYMBOL_ADDRESS_ASSIGNMENT__MEMORY_INSTANCE);
		createEAttribute(symbolAddressAssignmentEClass, SYMBOL_ADDRESS_ASSIGNMENT__ADDRESS);

		symbolValueAssignmentEClass = createEClass(SYMBOL_VALUE_ASSIGNMENT);
		createEAttribute(symbolValueAssignmentEClass, SYMBOL_VALUE_ASSIGNMENT__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PlatformPackage thePlatformPackage = (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		AbstractionPackage theAbstractionPackage = (AbstractionPackage)EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		MemorymodelPackage theMemorymodelPackage = (MemorymodelPackage)EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePlatformPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sequentialBehaviorModuleEClass.getESuperTypes().add(theInfrastructurePackage.getRootElement());
		sequentialBehaviorEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		sequentialActionEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		codeSymbolPlacementEClass.getESuperTypes().add(this.getSequentialAction());
		operationExecutionEClass.getESuperTypes().add(this.getSequentialAction());
		symbolAssignmentEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		symbolAllocationEClass.getESuperTypes().add(this.getSymbolAssignment());
		symbolAddressAssignmentEClass.getESuperTypes().add(this.getSymbolAssignment());
		symbolValueAssignmentEClass.getESuperTypes().add(this.getSymbolAssignment());

		// Initialize classes and features; add operations and parameters
		initEClass(sequentialBehaviorModuleEClass, SequentialBehaviorModule.class, "SequentialBehaviorModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialBehaviorModule_Device(), theAbstractionPackage.getDeviceAbstraction(), null, "device", null, 0, 1, SequentialBehaviorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialBehaviorModule_SymbolMappings(), this.getSymbolAssignment(), null, "symbolMappings", null, 0, -1, SequentialBehaviorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialBehaviorModule_BehaviorModels(), this.getSequentialBehavior(), null, "behaviorModels", null, 0, -1, SequentialBehaviorModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequentialBehaviorEClass, SequentialBehavior.class, "SequentialBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialBehavior_Actions(), this.getSequentialAction(), null, "actions", null, 0, -1, SequentialBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequentialBehavior_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, SequentialBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialBehavior_LocalSymbols(), this.getSymbolAssignment(), null, "localSymbols", null, 0, -1, SequentialBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequentialActionEClass, SequentialAction.class, "SequentialAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSymbolPlacementEClass, CodeSymbolPlacement.class, "CodeSymbolPlacement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeSymbolPlacement_Symbol(), ecorePackage.getEString(), "symbol", null, 1, 1, CodeSymbolPlacement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationExecutionEClass, OperationExecution.class, "OperationExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationExecution_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, OperationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationExecution_Operation(), ecorePackage.getEString(), "operation", null, 1, 1, OperationExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolAssignmentEClass, SymbolAssignment.class, "SymbolAssignment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolAssignment_Symbol(), ecorePackage.getEString(), "symbol", null, 1, 1, SymbolAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolAssignment_Type(), theTypesPackage.getTypeDefinition(), null, "type", null, 1, 1, SymbolAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolAllocationEClass, SymbolAllocation.class, "SymbolAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(symbolAddressAssignmentEClass, SymbolAddressAssignment.class, "SymbolAddressAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolAddressAssignment_MemoryInstance(), theMemorymodelPackage.getMemoryInstance(), null, "memoryInstance", null, 1, 1, SymbolAddressAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbolAddressAssignment_Address(), ecorePackage.getELong(), "address", null, 1, 1, SymbolAddressAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symbolValueAssignmentEClass, SymbolValueAssignment.class, "SymbolValueAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbolValueAssignment_Value(), ecorePackage.getELong(), "value", null, 1, 1, SymbolValueAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //BehaviorPackageImpl

/**
 */
package hu.modembed.model.platform.impl;

import hu.modembed.model.application.ApplicationPackage;

import hu.modembed.model.application.composition.CompositionPackage;

import hu.modembed.model.application.composition.impl.CompositionPackageImpl;

import hu.modembed.model.application.impl.ApplicationPackageImpl;

import hu.modembed.model.application.interface_.InterfacePackage;

import hu.modembed.model.application.interface_.impl.InterfacePackageImpl;

import hu.modembed.model.architecture.ArchitecturePackage;

import hu.modembed.model.architecture.impl.ArchitecturePackageImpl;

import hu.modembed.model.architecture.linking.LinkingPackage;

import hu.modembed.model.architecture.linking.impl.LinkingPackageImpl;

import hu.modembed.model.behavior.BehaviorPackage;

import hu.modembed.model.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.comm.CommPackage;

import hu.modembed.model.comm.impl.CommPackageImpl;

import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.assembler.AssemblerPackage;

import hu.modembed.model.core.assembler.code.CodePackage;

import hu.modembed.model.core.assembler.code.impl.CodePackageImpl;

import hu.modembed.model.core.assembler.impl.AssemblerPackageImpl;

import hu.modembed.model.core.impl.CorePackageImpl;

import hu.modembed.model.core.workflow.WorkflowPackage;

import hu.modembed.model.core.workflow.impl.WorkflowPackageImpl;

import hu.modembed.model.emodel.EmodelPackage;

import hu.modembed.model.emodel.expressions.ExpressionsPackage;

import hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl;

import hu.modembed.model.emodel.impl.EmodelPackageImpl;

import hu.modembed.model.emodel.memorymap.MemorymapPackage;

import hu.modembed.model.emodel.memorymap.impl.MemorymapPackageImpl;

import hu.modembed.model.emodel.types.TypesPackage;

import hu.modembed.model.emodel.types.impl.TypesPackageImpl;

import hu.modembed.model.network.NetworkPackage;

import hu.modembed.model.network.impl.NetworkPackageImpl;

import hu.modembed.model.network.rs232.Rs232Package;

import hu.modembed.model.network.rs232.impl.Rs232PackageImpl;

import hu.modembed.model.platform.InstructionCallOperationStep;
import hu.modembed.model.platform.InstructionParameterMapping;
import hu.modembed.model.platform.OperationArgument;
import hu.modembed.model.platform.OperationDefinition;
import hu.modembed.model.platform.OperationStep;
import hu.modembed.model.platform.PlatformDefinition;
import hu.modembed.model.platform.PlatformFactory;
import hu.modembed.model.platform.PlatformPackage;

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
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass platformDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionCallOperationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionParameterMappingEClass = null;

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
	 * @see hu.modembed.model.platform.PlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlatformPackageImpl() {
		super(eNS_URI, PlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlatformPackage init() {
		if (isInited) return (PlatformPackage)EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI);

		// Obtain or create and register package
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PlatformPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) : AssemblerPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		Rs232PackageImpl theRs232Package = (Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI) instanceof Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI) : Rs232Package.eINSTANCE);
		CommPackageImpl theCommPackage = (CommPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) instanceof CommPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) : CommPackage.eINSTANCE);
		hu.modembed.model.comm.rs232.impl.Rs232PackageImpl theRs232Package_1 = (hu.modembed.model.comm.rs232.impl.Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) instanceof hu.modembed.model.comm.rs232.impl.Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) : hu.modembed.model.comm.rs232.Rs232Package.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) : InterfacePackage.eINSTANCE);
		CompositionPackageImpl theCompositionPackage = (CompositionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) instanceof CompositionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) : CompositionPackage.eINSTANCE);
		EmodelPackageImpl theEmodelPackage = (EmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI) instanceof EmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI) : EmodelPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		MemorymapPackageImpl theMemorymapPackage = (MemorymapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemorymapPackage.eNS_URI) instanceof MemorymapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemorymapPackage.eNS_URI) : MemorymapPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		LinkingPackageImpl theLinkingPackage = (LinkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinkingPackage.eNS_URI) instanceof LinkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinkingPackage.eNS_URI) : LinkingPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAssemblerPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theRs232Package.createPackageContents();
		theCommPackage.createPackageContents();
		theRs232Package_1.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theCompositionPackage.createPackageContents();
		theEmodelPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theMemorymapPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theLinkingPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssemblerPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theRs232Package.initializePackageContents();
		theCommPackage.initializePackageContents();
		theRs232Package_1.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theCompositionPackage.initializePackageContents();
		theEmodelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theMemorymapPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theLinkingPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlatformPackage.eNS_URI, thePlatformPackage);
		return thePlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlatformDefinition() {
		return platformDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformDefinition_Refine() {
		return (EReference)platformDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlatformDefinition_Operations() {
		return (EReference)platformDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinition() {
		return operationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Arguments() {
		return (EReference)operationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Steps() {
		return (EReference)operationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationDefinition_Operation() {
		return (EAttribute)operationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationArgument() {
		return operationArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationArgument_Type() {
		return (EReference)operationArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationArgument_IndirectionLevel() {
		return (EAttribute)operationArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionCallOperationStep() {
		return instructionCallOperationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCallOperationStep_Instruction() {
		return (EReference)instructionCallOperationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCallOperationStep_Arguments() {
		return (EReference)instructionCallOperationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationStep() {
		return operationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionParameterMapping() {
		return instructionParameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionParameterMapping_Value() {
		return (EReference)instructionParameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionParameterMapping_BitOffset() {
		return (EAttribute)instructionParameterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformFactory getPlatformFactory() {
		return (PlatformFactory)getEFactoryInstance();
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
		platformDefinitionEClass = createEClass(PLATFORM_DEFINITION);
		createEReference(platformDefinitionEClass, PLATFORM_DEFINITION__REFINE);
		createEReference(platformDefinitionEClass, PLATFORM_DEFINITION__OPERATIONS);

		operationDefinitionEClass = createEClass(OPERATION_DEFINITION);
		createEReference(operationDefinitionEClass, OPERATION_DEFINITION__ARGUMENTS);
		createEReference(operationDefinitionEClass, OPERATION_DEFINITION__STEPS);
		createEAttribute(operationDefinitionEClass, OPERATION_DEFINITION__OPERATION);

		operationArgumentEClass = createEClass(OPERATION_ARGUMENT);
		createEReference(operationArgumentEClass, OPERATION_ARGUMENT__TYPE);
		createEAttribute(operationArgumentEClass, OPERATION_ARGUMENT__INDIRECTION_LEVEL);

		instructionCallOperationStepEClass = createEClass(INSTRUCTION_CALL_OPERATION_STEP);
		createEReference(instructionCallOperationStepEClass, INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION);
		createEReference(instructionCallOperationStepEClass, INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS);

		operationStepEClass = createEClass(OPERATION_STEP);

		instructionParameterMappingEClass = createEClass(INSTRUCTION_PARAMETER_MAPPING);
		createEReference(instructionParameterMappingEClass, INSTRUCTION_PARAMETER_MAPPING__VALUE);
		createEAttribute(instructionParameterMappingEClass, INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		AssemblerPackage theAssemblerPackage = (AssemblerPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		platformDefinitionEClass.getESuperTypes().add(theCorePackage.getRootElement());
		operationDefinitionEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		operationArgumentEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		instructionCallOperationStepEClass.getESuperTypes().add(this.getOperationStep());
		operationStepEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		instructionParameterMappingEClass.getESuperTypes().add(theCorePackage.getMODembedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(platformDefinitionEClass, PlatformDefinition.class, "PlatformDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlatformDefinition_Refine(), this.getPlatformDefinition(), null, "refine", null, 0, 1, PlatformDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlatformDefinition_Operations(), this.getOperationDefinition(), null, "operations", null, 0, -1, PlatformDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationDefinitionEClass, OperationDefinition.class, "OperationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDefinition_Arguments(), this.getOperationArgument(), null, "arguments", null, 0, -1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDefinition_Steps(), this.getOperationStep(), null, "steps", null, 0, -1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDefinition_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationArgumentEClass, OperationArgument.class, "OperationArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationArgument_Type(), theTypesPackage.getTypeDefinition(), null, "type", null, 0, 1, OperationArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationArgument_IndirectionLevel(), ecorePackage.getEInt(), "indirectionLevel", null, 0, 1, OperationArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionCallOperationStepEClass, InstructionCallOperationStep.class, "InstructionCallOperationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionCallOperationStep_Instruction(), theAssemblerPackage.getInstruction(), null, "instruction", null, 0, 1, InstructionCallOperationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionCallOperationStep_Arguments(), this.getInstructionParameterMapping(), null, "arguments", null, 0, -1, InstructionCallOperationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationStepEClass, OperationStep.class, "OperationStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instructionParameterMappingEClass, InstructionParameterMapping.class, "InstructionParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionParameterMapping_Value(), this.getOperationArgument(), null, "value", null, 0, 1, InstructionParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionParameterMapping_BitOffset(), ecorePackage.getEInt(), "bitOffset", null, 0, 1, InstructionParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PlatformPackageImpl

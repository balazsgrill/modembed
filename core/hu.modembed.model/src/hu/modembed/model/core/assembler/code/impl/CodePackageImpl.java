/**
 */
package hu.modembed.model.core.assembler.code.impl;

import hu.modembed.model.abstraction.behavior.BehaviorPackage;

import hu.modembed.model.abstraction.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.abstraction.behavior.platform.impl.PlatformPackageImpl;

import hu.modembed.model.abstraction.types.TypesPackage;

import hu.modembed.model.abstraction.types.impl.TypesPackageImpl;

import hu.modembed.model.architecture.ArchitecturePackage;

import hu.modembed.model.architecture.impl.ArchitecturePackageImpl;

import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.assembler.AssemblerPackage;

import hu.modembed.model.core.assembler.code.AssemblerObject;
import hu.modembed.model.core.assembler.code.CodeFactory;
import hu.modembed.model.core.assembler.code.CodePackage;
import hu.modembed.model.core.assembler.code.InstructionCall;
import hu.modembed.model.core.assembler.code.InstructionCallParameter;

import hu.modembed.model.core.assembler.impl.AssemblerPackageImpl;

import hu.modembed.model.core.impl.CorePackageImpl;

import hu.modembed.model.core.workflow.WorkflowPackage;

import hu.modembed.model.core.workflow.impl.WorkflowPackageImpl;

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
public class CodePackageImpl extends EPackageImpl implements CodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblerObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionCallParameterEClass = null;

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
	 * @see hu.modembed.model.core.assembler.code.CodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodePackageImpl() {
		super(eNS_URI, CodeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodePackage init() {
		if (isInited) return (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);

		// Obtain or create and register package
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) : AssemblerPackage.eINSTANCE);
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);

		// Create package meta-data objects
		theCodePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAssemblerPackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theCodePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssemblerPackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodePackage.eNS_URI, theCodePackage);
		return theCodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssemblerObject() {
		return assemblerObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblerObject_Instructions() {
		return (EReference)assemblerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionCall() {
		return instructionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCall_Parameters() {
		return (EReference)instructionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCall_Instruction() {
		return (EReference)instructionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionCallParameter() {
		return instructionCallParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionCallParameter_Value() {
		return (EAttribute)instructionCallParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCallParameter_Definition() {
		return (EReference)instructionCallParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFactory getCodeFactory() {
		return (CodeFactory)getEFactoryInstance();
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
		assemblerObjectEClass = createEClass(ASSEMBLER_OBJECT);
		createEReference(assemblerObjectEClass, ASSEMBLER_OBJECT__INSTRUCTIONS);

		instructionCallEClass = createEClass(INSTRUCTION_CALL);
		createEReference(instructionCallEClass, INSTRUCTION_CALL__PARAMETERS);
		createEReference(instructionCallEClass, INSTRUCTION_CALL__INSTRUCTION);

		instructionCallParameterEClass = createEClass(INSTRUCTION_CALL_PARAMETER);
		createEAttribute(instructionCallParameterEClass, INSTRUCTION_CALL_PARAMETER__VALUE);
		createEReference(instructionCallParameterEClass, INSTRUCTION_CALL_PARAMETER__DEFINITION);
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
		AssemblerPackage theAssemblerPackage = (AssemblerPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assemblerObjectEClass.getESuperTypes().add(theCorePackage.getRootElement());
		instructionCallEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		instructionCallParameterEClass.getESuperTypes().add(theCorePackage.getMODembedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(assemblerObjectEClass, AssemblerObject.class, "AssemblerObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblerObject_Instructions(), this.getInstructionCall(), null, "instructions", null, 0, -1, AssemblerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionCallEClass, InstructionCall.class, "InstructionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionCall_Parameters(), this.getInstructionCallParameter(), null, "parameters", null, 0, -1, InstructionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionCall_Instruction(), theAssemblerPackage.getInstruction(), null, "instruction", null, 0, 1, InstructionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionCallParameterEClass, InstructionCallParameter.class, "InstructionCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionCallParameter_Value(), ecorePackage.getELong(), "value", null, 0, 1, InstructionCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionCallParameter_Definition(), theAssemblerPackage.getInstructionParameter(), null, "definition", null, 0, 1, InstructionCallParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CodePackageImpl

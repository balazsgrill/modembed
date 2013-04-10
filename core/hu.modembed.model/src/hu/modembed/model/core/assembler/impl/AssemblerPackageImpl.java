/**
 */
package hu.modembed.model.core.assembler.impl;

import hu.modembed.model.abstraction.behavior.BehaviorPackage;

import hu.modembed.model.abstraction.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.abstraction.behavior.platform.impl.PlatformPackageImpl;

import hu.modembed.model.abstraction.types.TypesPackage;

import hu.modembed.model.abstraction.types.impl.TypesPackageImpl;

import hu.modembed.model.architecture.ArchitecturePackage;

import hu.modembed.model.architecture.impl.ArchitecturePackageImpl;

import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.assembler.AssemblerFactory;
import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.ConstantSection;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionParameter;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionSet;
import hu.modembed.model.core.assembler.InstructionWord;
import hu.modembed.model.core.assembler.InstructionWordCondition;
import hu.modembed.model.core.assembler.InstructionWordMaskedValueCondition;
import hu.modembed.model.core.assembler.ParameterSection;

import hu.modembed.model.core.assembler.code.CodePackage;

import hu.modembed.model.core.assembler.code.impl.CodePackageImpl;

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
public class AssemblerPackageImpl extends EPackageImpl implements AssemblerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionWordConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionWordMaskedValueConditionEClass = null;

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
	 * @see hu.modembed.model.core.assembler.AssemblerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AssemblerPackageImpl() {
		super(eNS_URI, AssemblerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AssemblerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AssemblerPackage init() {
		if (isInited) return (AssemblerPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI);

		// Obtain or create and register package
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssemblerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblerPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblerPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAssemblerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AssemblerPackage.eNS_URI, theAssemblerPackage);
		return theAssemblerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionSet() {
		return instructionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionSet_Instructions() {
		return (EReference)instructionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionSet_Extend() {
		return (EReference)instructionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Parameters() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Words() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionParameter() {
		return instructionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionParameter_Id() {
		return (EAttribute)instructionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionParameter_DefaultValue() {
		return (EAttribute)instructionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionSection() {
		return instructionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionSection_Start() {
		return (EAttribute)instructionSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionSection_Size() {
		return (EAttribute)instructionSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionSection_Shift() {
		return (EAttribute)instructionSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantSection() {
		return constantSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantSection_Value() {
		return (EAttribute)constantSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSection() {
		return parameterSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSection_Parameter() {
		return (EReference)parameterSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionWord() {
		return instructionWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionWord_Sections() {
		return (EReference)instructionWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionWord_Condition() {
		return (EReference)instructionWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionWordCondition() {
		return instructionWordConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionWordMaskedValueCondition() {
		return instructionWordMaskedValueConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionWordMaskedValueCondition_Mask() {
		return (EAttribute)instructionWordMaskedValueConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionWordMaskedValueCondition_Value() {
		return (EAttribute)instructionWordMaskedValueConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionWordMaskedValueCondition_Argument() {
		return (EReference)instructionWordMaskedValueConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblerFactory getAssemblerFactory() {
		return (AssemblerFactory)getEFactoryInstance();
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
		instructionSetEClass = createEClass(INSTRUCTION_SET);
		createEReference(instructionSetEClass, INSTRUCTION_SET__INSTRUCTIONS);
		createEReference(instructionSetEClass, INSTRUCTION_SET__EXTEND);

		instructionEClass = createEClass(INSTRUCTION);
		createEReference(instructionEClass, INSTRUCTION__PARAMETERS);
		createEReference(instructionEClass, INSTRUCTION__WORDS);

		instructionParameterEClass = createEClass(INSTRUCTION_PARAMETER);
		createEAttribute(instructionParameterEClass, INSTRUCTION_PARAMETER__ID);
		createEAttribute(instructionParameterEClass, INSTRUCTION_PARAMETER__DEFAULT_VALUE);

		instructionSectionEClass = createEClass(INSTRUCTION_SECTION);
		createEAttribute(instructionSectionEClass, INSTRUCTION_SECTION__START);
		createEAttribute(instructionSectionEClass, INSTRUCTION_SECTION__SIZE);
		createEAttribute(instructionSectionEClass, INSTRUCTION_SECTION__SHIFT);

		constantSectionEClass = createEClass(CONSTANT_SECTION);
		createEAttribute(constantSectionEClass, CONSTANT_SECTION__VALUE);

		parameterSectionEClass = createEClass(PARAMETER_SECTION);
		createEReference(parameterSectionEClass, PARAMETER_SECTION__PARAMETER);

		instructionWordEClass = createEClass(INSTRUCTION_WORD);
		createEReference(instructionWordEClass, INSTRUCTION_WORD__SECTIONS);
		createEReference(instructionWordEClass, INSTRUCTION_WORD__CONDITION);

		instructionWordConditionEClass = createEClass(INSTRUCTION_WORD_CONDITION);

		instructionWordMaskedValueConditionEClass = createEClass(INSTRUCTION_WORD_MASKED_VALUE_CONDITION);
		createEAttribute(instructionWordMaskedValueConditionEClass, INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK);
		createEAttribute(instructionWordMaskedValueConditionEClass, INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE);
		createEReference(instructionWordMaskedValueConditionEClass, INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT);
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
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCodePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionSetEClass.getESuperTypes().add(theCorePackage.getRootElement());
		instructionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		instructionParameterEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		instructionSectionEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		constantSectionEClass.getESuperTypes().add(this.getInstructionSection());
		parameterSectionEClass.getESuperTypes().add(this.getInstructionSection());
		instructionWordEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		instructionWordConditionEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		instructionWordMaskedValueConditionEClass.getESuperTypes().add(this.getInstructionWordCondition());

		// Initialize classes and features; add operations and parameters
		initEClass(instructionSetEClass, InstructionSet.class, "InstructionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionSet_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, InstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionSet_Extend(), this.getInstructionSet(), null, "extend", null, 0, 1, InstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Parameters(), this.getInstructionParameter(), null, "parameters", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Words(), this.getInstructionWord(), null, "words", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionParameterEClass, InstructionParameter.class, "InstructionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionParameter_Id(), ecorePackage.getEChar(), "id", null, 1, 1, InstructionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionParameter_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1, InstructionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionSectionEClass, InstructionSection.class, "InstructionSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionSection_Start(), ecorePackage.getEInt(), "start", null, 1, 1, InstructionSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionSection_Size(), ecorePackage.getEInt(), "size", null, 1, 1, InstructionSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionSection_Shift(), ecorePackage.getEInt(), "shift", null, 1, 1, InstructionSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantSectionEClass, ConstantSection.class, "ConstantSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantSection_Value(), ecorePackage.getEInt(), "value", null, 1, 1, ConstantSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSectionEClass, ParameterSection.class, "ParameterSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterSection_Parameter(), this.getInstructionParameter(), null, "parameter", null, 1, 1, ParameterSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionWordEClass, InstructionWord.class, "InstructionWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionWord_Sections(), this.getInstructionSection(), null, "sections", null, 0, -1, InstructionWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionWord_Condition(), this.getInstructionWordCondition(), null, "condition", null, 0, -1, InstructionWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionWordConditionEClass, InstructionWordCondition.class, "InstructionWordCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instructionWordMaskedValueConditionEClass, InstructionWordMaskedValueCondition.class, "InstructionWordMaskedValueCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionWordMaskedValueCondition_Mask(), ecorePackage.getELong(), "mask", null, 0, 1, InstructionWordMaskedValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionWordMaskedValueCondition_Value(), ecorePackage.getELong(), "value", null, 0, 1, InstructionWordMaskedValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionWordMaskedValueCondition_Argument(), this.getInstructionParameter(), null, "argument", null, 1, 1, InstructionWordMaskedValueCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AssemblerPackageImpl

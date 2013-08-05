/**
 */
package hu.modembed.model.modembed.core.instructionset.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;

import hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl;

import hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl;

import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage;

import hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl;

import hu.modembed.model.modembed.abstraction.types.TypesPackage;

import hu.modembed.model.modembed.abstraction.types.impl.TypesPackageImpl;

import hu.modembed.model.modembed.core.instructionset.ConstantSection;
import hu.modembed.model.modembed.core.instructionset.Instruction;
import hu.modembed.model.modembed.core.instructionset.InstructionParameter;
import hu.modembed.model.modembed.core.instructionset.InstructionSection;
import hu.modembed.model.modembed.core.instructionset.InstructionSet;
import hu.modembed.model.modembed.core.instructionset.InstructionWord;
import hu.modembed.model.modembed.core.instructionset.InstructionWordCondition;
import hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition;
import hu.modembed.model.modembed.core.instructionset.InstructionsetFactory;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;
import hu.modembed.model.modembed.core.instructionset.ParameterSection;

import hu.modembed.model.modembed.core.object.ObjectPackage;

import hu.modembed.model.modembed.core.object.impl.ObjectPackageImpl;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

import hu.modembed.model.modembed.infrastructure.expressions.ExpressionsPackage;

import hu.modembed.model.modembed.infrastructure.expressions.impl.ExpressionsPackageImpl;

import hu.modembed.model.modembed.infrastructure.impl.InfrastructurePackageImpl;

import hu.modembed.model.modembed.infrastructure.traceability.TraceabilityPackage;

import hu.modembed.model.modembed.infrastructure.traceability.impl.TraceabilityPackageImpl;

import hu.modembed.model.modembed.structured.StructuredPackage;

import hu.modembed.model.modembed.structured.impl.StructuredPackageImpl;

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
public class InstructionsetPackageImpl extends EPackageImpl implements InstructionsetPackage {
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
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstructionsetPackageImpl() {
		super(eNS_URI, InstructionsetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InstructionsetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstructionsetPackage init() {
		if (isInited) return (InstructionsetPackage)EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI);

		// Obtain or create and register package
		InstructionsetPackageImpl theInstructionsetPackage = (InstructionsetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstructionsetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstructionsetPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
		AbstractionPackageImpl theAbstractionPackage = (AbstractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) instanceof AbstractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) : AbstractionPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		MemorymodelPackageImpl theMemorymodelPackage = (MemorymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) instanceof MemorymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) : MemorymodelPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);
		StructuredPackageImpl theStructuredPackage = (StructuredPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredPackage.eNS_URI) instanceof StructuredPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredPackage.eNS_URI) : StructuredPackage.eINSTANCE);

		// Create package meta-data objects
		theInstructionsetPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theObjectPackage.createPackageContents();
		theAbstractionPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theMemorymodelPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePlatformPackage.createPackageContents();
		theStructuredPackage.createPackageContents();

		// Initialize created meta-data
		theInstructionsetPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theObjectPackage.initializePackageContents();
		theAbstractionPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theMemorymodelPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();
		theStructuredPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstructionsetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstructionsetPackage.eNS_URI, theInstructionsetPackage);
		return theInstructionsetPackage;
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
	public EAttribute getInstructionParameter_DefaultValue() {
		return (EAttribute)instructionParameterEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInstructionSection_Size() {
		return (EAttribute)instructionSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionSection_Shift() {
		return (EAttribute)instructionSectionEClass.getEStructuralFeatures().get(1);
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
	public InstructionsetFactory getInstructionsetFactory() {
		return (InstructionsetFactory)getEFactoryInstance();
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
		createEAttribute(instructionParameterEClass, INSTRUCTION_PARAMETER__DEFAULT_VALUE);

		instructionSectionEClass = createEClass(INSTRUCTION_SECTION);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionSetEClass.getESuperTypes().add(theInfrastructurePackage.getRootElement());
		instructionEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		instructionParameterEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		instructionSectionEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		constantSectionEClass.getESuperTypes().add(this.getInstructionSection());
		parameterSectionEClass.getESuperTypes().add(this.getInstructionSection());
		instructionWordEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		instructionWordConditionEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		instructionWordMaskedValueConditionEClass.getESuperTypes().add(this.getInstructionWordCondition());

		// Initialize classes and features; add operations and parameters
		initEClass(instructionSetEClass, InstructionSet.class, "InstructionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionSet_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, InstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionSet_Extend(), this.getInstructionSet(), null, "extend", null, 0, 1, InstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Parameters(), this.getInstructionParameter(), null, "parameters", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Words(), this.getInstructionWord(), null, "words", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionParameterEClass, InstructionParameter.class, "InstructionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionParameter_DefaultValue(), ecorePackage.getEInt(), "defaultValue", null, 0, 1, InstructionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionSectionEClass, InstructionSection.class, "InstructionSection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionSection_Size(), ecorePackage.getEInt(), "size", null, 1, 1, InstructionSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionSection_Shift(), ecorePackage.getEInt(), "shift", null, 0, 1, InstructionSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //InstructionsetPackageImpl

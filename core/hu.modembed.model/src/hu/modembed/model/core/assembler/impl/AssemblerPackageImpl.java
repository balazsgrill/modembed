/**
 */
package hu.modembed.model.core.assembler.impl;

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
import hu.modembed.model.comm.CommPackage;
import hu.modembed.model.comm.impl.CommPackageImpl;
import hu.modembed.model.core.CorePackage;
import hu.modembed.model.core.assembler.AssemblerFactory;
import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.ConstantSection;
import hu.modembed.model.core.assembler.Instruction;
import hu.modembed.model.core.assembler.InstructionParameter;
import hu.modembed.model.core.assembler.InstructionSection;
import hu.modembed.model.core.assembler.InstructionSet;
import hu.modembed.model.core.assembler.ParameterSection;
import hu.modembed.model.core.assembler.code.CodePackage;
import hu.modembed.model.core.assembler.code.impl.CodePackageImpl;
import hu.modembed.model.core.impl.CorePackageImpl;
import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.expressions.ExpressionsPackage;
import hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl;
import hu.modembed.model.emodel.impl.EmodelPackageImpl;
import hu.modembed.model.emodel.types.TypesPackage;
import hu.modembed.model.emodel.types.impl.TypesPackageImpl;
import hu.modembed.model.network.NetworkPackage;
import hu.modembed.model.network.impl.NetworkPackageImpl;
import hu.modembed.model.network.rs232.Rs232Package;
import hu.modembed.model.network.rs232.impl.Rs232PackageImpl;

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
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		LinkingPackageImpl theLinkingPackage = (LinkingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LinkingPackage.eNS_URI) instanceof LinkingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LinkingPackage.eNS_URI) : LinkingPackage.eINSTANCE);

		// Create package meta-data objects
		theAssemblerPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theCodePackage.createPackageContents();
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
		theArchitecturePackage.createPackageContents();
		theLinkingPackage.createPackageContents();

		// Initialize created meta-data
		theAssemblerPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theCodePackage.initializePackageContents();
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
		theArchitecturePackage.initializePackageContents();
		theLinkingPackage.initializePackageContents();

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
	public EReference getInstruction_Sections() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Parameters() {
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
		createEReference(instructionEClass, INSTRUCTION__SECTIONS);
		createEReference(instructionEClass, INSTRUCTION__PARAMETERS);

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
		EmodelPackage theEmodelPackage = (EmodelPackage)EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCodePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionSetEClass.getESuperTypes().add(theCorePackage.getRootElement());
		instructionEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		instructionEClass.getESuperTypes().add(theEmodelPackage.getCallableElement());
		instructionParameterEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		instructionSectionEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		constantSectionEClass.getESuperTypes().add(this.getInstructionSection());
		parameterSectionEClass.getESuperTypes().add(this.getInstructionSection());

		// Initialize classes and features; add operations and parameters
		initEClass(instructionSetEClass, InstructionSet.class, "InstructionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionSet_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, InstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionSet_Extend(), this.getInstructionSet(), null, "extend", null, 0, 1, InstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Sections(), this.getInstructionSection(), null, "sections", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstruction_Parameters(), this.getInstructionParameter(), null, "parameters", null, 0, -1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
	}

} //AssemblerPackageImpl

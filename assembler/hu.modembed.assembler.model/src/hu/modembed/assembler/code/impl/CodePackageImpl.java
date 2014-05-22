/**
 */
package hu.modembed.assembler.code.impl;

import hu.modembed.assembler.code.AssemblerObject;
import hu.modembed.assembler.code.CodeFactory;
import hu.modembed.assembler.code.CodePackage;
import hu.modembed.assembler.code.InstructionCall;
import hu.modembed.assembler.code.InstructionCallArgument;

import hu.modembed.assembler.instructionset.InstructionsetPackage;

import hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl;

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
	private EClass instructionCallArgumentEClass = null;

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
	 * @see hu.modembed.assembler.code.CodePackage#eNS_URI
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
		InstructionsetPackageImpl theInstructionsetPackage = (InstructionsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) instanceof InstructionsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) : InstructionsetPackage.eINSTANCE);

		// Create package meta-data objects
		theCodePackage.createPackageContents();
		theInstructionsetPackage.createPackageContents();

		// Initialize created meta-data
		theCodePackage.initializePackageContents();
		theInstructionsetPackage.initializePackageContents();

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
	public EReference getAssemblerObject_Instructionset() {
		return (EReference)assemblerObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssemblerObject_StartAddress() {
		return (EAttribute)assemblerObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssemblerObject_Instructions() {
		return (EReference)assemblerObjectEClass.getEStructuralFeatures().get(2);
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
	public EReference getInstructionCall_Instruction() {
		return (EReference)instructionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCall_Arguments() {
		return (EReference)instructionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionCallArgument() {
		return instructionCallArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionCallArgument_Definition() {
		return (EReference)instructionCallArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionCallArgument_Value() {
		return (EAttribute)instructionCallArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionCallArgument_Label() {
		return (EAttribute)instructionCallArgumentEClass.getEStructuralFeatures().get(2);
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
		createEReference(assemblerObjectEClass, ASSEMBLER_OBJECT__INSTRUCTIONSET);
		createEAttribute(assemblerObjectEClass, ASSEMBLER_OBJECT__START_ADDRESS);
		createEReference(assemblerObjectEClass, ASSEMBLER_OBJECT__INSTRUCTIONS);

		instructionCallEClass = createEClass(INSTRUCTION_CALL);
		createEReference(instructionCallEClass, INSTRUCTION_CALL__INSTRUCTION);
		createEReference(instructionCallEClass, INSTRUCTION_CALL__ARGUMENTS);

		instructionCallArgumentEClass = createEClass(INSTRUCTION_CALL_ARGUMENT);
		createEReference(instructionCallArgumentEClass, INSTRUCTION_CALL_ARGUMENT__DEFINITION);
		createEAttribute(instructionCallArgumentEClass, INSTRUCTION_CALL_ARGUMENT__VALUE);
		createEAttribute(instructionCallArgumentEClass, INSTRUCTION_CALL_ARGUMENT__LABEL);
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
		InstructionsetPackage theInstructionsetPackage = (InstructionsetPackage)EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(assemblerObjectEClass, AssemblerObject.class, "AssemblerObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssemblerObject_Instructionset(), theInstructionsetPackage.getInstructionSet(), null, "instructionset", null, 0, 1, AssemblerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssemblerObject_StartAddress(), ecorePackage.getELong(), "startAddress", "0", 1, 1, AssemblerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssemblerObject_Instructions(), this.getInstructionCall(), null, "instructions", null, 0, -1, AssemblerObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionCallEClass, InstructionCall.class, "InstructionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionCall_Instruction(), theInstructionsetPackage.getInstruction(), null, "instruction", null, 1, 1, InstructionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionCall_Arguments(), this.getInstructionCallArgument(), null, "arguments", null, 0, -1, InstructionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionCallArgumentEClass, InstructionCallArgument.class, "InstructionCallArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionCallArgument_Definition(), theInstructionsetPackage.getInstructionParameter(), null, "definition", null, 1, 1, InstructionCallArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionCallArgument_Value(), ecorePackage.getELong(), "value", "0", 1, 1, InstructionCallArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionCallArgument_Label(), ecorePackage.getEBoolean(), "label", "false", 1, 1, InstructionCallArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getInstructionCallArgument_Value(), 
		   source, 
		   new String[] {
			 "namespace", ""
		   });
	}

} //CodePackageImpl

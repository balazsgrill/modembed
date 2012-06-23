/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.impl;

import hu.e.compiler.list.AnnotationStep;
import hu.e.compiler.list.InstructionArgument;
import hu.e.compiler.list.InstructionStep;
import hu.e.compiler.list.LabelStep;
import hu.e.compiler.list.LinkTimeConstant;
import hu.e.compiler.list.LinkTimeExpression;
import hu.e.compiler.list.LinkTimeOperation;
import hu.e.compiler.list.LinkTimeValue;
import hu.e.compiler.list.ListFactory;
import hu.e.compiler.list.ListPackage;
import hu.e.compiler.list.MemoryAssignment;
import hu.e.compiler.list.ProgramList;
import hu.e.compiler.list.ProgramStep;
import hu.e.compiler.list.ReferableValue;
import hu.e.compiler.list.Reference;
import hu.e.compiler.list.SequenceStep;
import hu.e.compiler.list.Severity;
import hu.e.compiler.list.StatusStep;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ListPackageImpl extends EPackageImpl implements ListPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referableValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTimeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTimeConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTimeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTimeOperationEEnum = null;

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
	 * @see hu.e.compiler.list.ListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ListPackageImpl() {
		super(eNS_URI, ListFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ListPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ListPackage init() {
		if (isInited) return (ListPackage)EPackage.Registry.INSTANCE.getEPackage(ListPackage.eNS_URI);

		// Obtain or create and register package
		ListPackageImpl theListPackage = (ListPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ListPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ListPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theListPackage.createPackageContents();

		// Initialize created meta-data
		theListPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theListPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ListPackage.eNS_URI, theListPackage);
		return theListPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramList() {
		return programListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramList_Name() {
		return (EAttribute)programListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramList_Step() {
		return (EReference)programListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramStep() {
		return programStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionStep() {
		return instructionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionStep_Code() {
		return (EAttribute)instructionStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionStep_Args() {
		return (EReference)instructionStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionStep_Width() {
		return (EAttribute)instructionStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceStep() {
		return sequenceStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceStep_Name() {
		return (EAttribute)sequenceStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStep_Steps() {
		return (EReference)sequenceStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceStep_Variables() {
		return (EReference)sequenceStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelStep() {
		return labelStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Value() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatusStep() {
		return statusStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusStep_Severity() {
		return (EAttribute)statusStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatusStep_Message() {
		return (EAttribute)statusStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferableValue() {
		return referableValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryAssignment() {
		return memoryAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryAssignment_Size() {
		return (EAttribute)memoryAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryAssignment_Name() {
		return (EAttribute)memoryAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationStep() {
		return annotationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationStep_Key() {
		return (EAttribute)annotationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkTimeValue() {
		return linkTimeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkTimeConstant() {
		return linkTimeConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkTimeConstant_Value() {
		return (EAttribute)linkTimeConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkTimeExpression() {
		return linkTimeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkTimeExpression_Arguments() {
		return (EReference)linkTimeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkTimeExpression_Operation() {
		return (EAttribute)linkTimeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionArgument() {
		return instructionArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionArgument_Shift() {
		return (EAttribute)instructionArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionArgument_Size() {
		return (EAttribute)instructionArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionArgument_Start() {
		return (EAttribute)instructionArgumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionArgument_Offset() {
		return (EAttribute)instructionArgumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionArgument_Value() {
		return (EReference)instructionArgumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkTimeOperation() {
		return linkTimeOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFactory getListFactory() {
		return (ListFactory)getEFactoryInstance();
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
		programListEClass = createEClass(PROGRAM_LIST);
		createEAttribute(programListEClass, PROGRAM_LIST__NAME);
		createEReference(programListEClass, PROGRAM_LIST__STEP);

		programStepEClass = createEClass(PROGRAM_STEP);

		instructionStepEClass = createEClass(INSTRUCTION_STEP);
		createEAttribute(instructionStepEClass, INSTRUCTION_STEP__CODE);
		createEReference(instructionStepEClass, INSTRUCTION_STEP__ARGS);
		createEAttribute(instructionStepEClass, INSTRUCTION_STEP__WIDTH);

		sequenceStepEClass = createEClass(SEQUENCE_STEP);
		createEAttribute(sequenceStepEClass, SEQUENCE_STEP__NAME);
		createEReference(sequenceStepEClass, SEQUENCE_STEP__STEPS);
		createEReference(sequenceStepEClass, SEQUENCE_STEP__VARIABLES);

		labelStepEClass = createEClass(LABEL_STEP);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__VALUE);

		statusStepEClass = createEClass(STATUS_STEP);
		createEAttribute(statusStepEClass, STATUS_STEP__SEVERITY);
		createEAttribute(statusStepEClass, STATUS_STEP__MESSAGE);

		referableValueEClass = createEClass(REFERABLE_VALUE);

		memoryAssignmentEClass = createEClass(MEMORY_ASSIGNMENT);
		createEAttribute(memoryAssignmentEClass, MEMORY_ASSIGNMENT__SIZE);
		createEAttribute(memoryAssignmentEClass, MEMORY_ASSIGNMENT__NAME);

		annotationStepEClass = createEClass(ANNOTATION_STEP);
		createEAttribute(annotationStepEClass, ANNOTATION_STEP__KEY);

		linkTimeValueEClass = createEClass(LINK_TIME_VALUE);

		linkTimeConstantEClass = createEClass(LINK_TIME_CONSTANT);
		createEAttribute(linkTimeConstantEClass, LINK_TIME_CONSTANT__VALUE);

		linkTimeExpressionEClass = createEClass(LINK_TIME_EXPRESSION);
		createEReference(linkTimeExpressionEClass, LINK_TIME_EXPRESSION__ARGUMENTS);
		createEAttribute(linkTimeExpressionEClass, LINK_TIME_EXPRESSION__OPERATION);

		instructionArgumentEClass = createEClass(INSTRUCTION_ARGUMENT);
		createEAttribute(instructionArgumentEClass, INSTRUCTION_ARGUMENT__SHIFT);
		createEAttribute(instructionArgumentEClass, INSTRUCTION_ARGUMENT__SIZE);
		createEAttribute(instructionArgumentEClass, INSTRUCTION_ARGUMENT__START);
		createEAttribute(instructionArgumentEClass, INSTRUCTION_ARGUMENT__OFFSET);
		createEReference(instructionArgumentEClass, INSTRUCTION_ARGUMENT__VALUE);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
		linkTimeOperationEEnum = createEEnum(LINK_TIME_OPERATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		instructionStepEClass.getESuperTypes().add(this.getProgramStep());
		sequenceStepEClass.getESuperTypes().add(this.getProgramStep());
		labelStepEClass.getESuperTypes().add(this.getProgramStep());
		labelStepEClass.getESuperTypes().add(this.getReferableValue());
		referenceEClass.getESuperTypes().add(this.getLinkTimeValue());
		statusStepEClass.getESuperTypes().add(this.getProgramStep());
		memoryAssignmentEClass.getESuperTypes().add(this.getReferableValue());
		annotationStepEClass.getESuperTypes().add(this.getProgramStep());
		linkTimeConstantEClass.getESuperTypes().add(this.getLinkTimeValue());
		linkTimeExpressionEClass.getESuperTypes().add(this.getLinkTimeValue());

		// Initialize classes and features; add operations and parameters
		initEClass(programListEClass, ProgramList.class, "ProgramList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramList_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProgramList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgramList_Step(), this.getProgramStep(), null, "step", null, 0, 1, ProgramList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programStepEClass, ProgramStep.class, "ProgramStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instructionStepEClass, InstructionStep.class, "InstructionStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionStep_Code(), ecorePackage.getELong(), "code", null, 0, 1, InstructionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionStep_Args(), this.getInstructionArgument(), null, "args", null, 0, -1, InstructionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionStep_Width(), ecorePackage.getEInt(), "width", null, 0, 1, InstructionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceStepEClass, SequenceStep.class, "SequenceStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequenceStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, SequenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStep_Steps(), this.getProgramStep(), null, "steps", null, 0, -1, SequenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceStep_Variables(), this.getMemoryAssignment(), null, "variables", null, 0, -1, SequenceStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelStepEClass, LabelStep.class, "LabelStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Value(), this.getReferableValue(), null, "value", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusStepEClass, StatusStep.class, "StatusStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatusStep_Severity(), this.getSeverity(), "severity", null, 0, 1, StatusStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatusStep_Message(), ecorePackage.getEString(), "message", null, 0, 1, StatusStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referableValueEClass, ReferableValue.class, "ReferableValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryAssignmentEClass, MemoryAssignment.class, "MemoryAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryAssignment_Size(), ecorePackage.getEInt(), "size", null, 0, 1, MemoryAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryAssignment_Name(), ecorePackage.getEString(), "name", null, 0, 1, MemoryAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationStepEClass, AnnotationStep.class, "AnnotationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationStep_Key(), ecorePackage.getEString(), "key", null, 0, 1, AnnotationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTimeValueEClass, LinkTimeValue.class, "LinkTimeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkTimeConstantEClass, LinkTimeConstant.class, "LinkTimeConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkTimeConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LinkTimeConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTimeExpressionEClass, LinkTimeExpression.class, "LinkTimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkTimeExpression_Arguments(), this.getLinkTimeValue(), null, "arguments", null, 0, -1, LinkTimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkTimeExpression_Operation(), this.getLinkTimeOperation(), "operation", null, 0, 1, LinkTimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionArgumentEClass, InstructionArgument.class, "InstructionArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionArgument_Shift(), ecorePackage.getEInt(), "shift", null, 0, 1, InstructionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionArgument_Size(), ecorePackage.getEInt(), "size", null, 0, 1, InstructionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionArgument_Start(), ecorePackage.getEInt(), "start", null, 0, 1, InstructionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionArgument_Offset(), ecorePackage.getEInt(), "offset", "0", 0, 1, InstructionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionArgument_Value(), this.getLinkTimeValue(), null, "value", null, 0, 1, InstructionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.DEBUG);
		addEEnumLiteral(severityEEnum, Severity.INFO);
		addEEnumLiteral(severityEEnum, Severity.WARNING);
		addEEnumLiteral(severityEEnum, Severity.ERROR);

		initEEnum(linkTimeOperationEEnum, LinkTimeOperation.class, "LinkTimeOperation");
		addEEnumLiteral(linkTimeOperationEEnum, LinkTimeOperation.ADD);

		// Create resource
		createResource(eNS_URI);
	}

} //ListPackageImpl

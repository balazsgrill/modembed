/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;

import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;

import hu.modembed.model.modembed.abstraction.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping;
import hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationLocalLabel;
import hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep;
import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory;
import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.modembed.abstraction.impl.AbstractionPackageImpl;

import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage;

import hu.modembed.model.modembed.abstraction.memorymodel.impl.MemorymodelPackageImpl;

import hu.modembed.model.modembed.abstraction.types.TypesPackage;

import hu.modembed.model.modembed.abstraction.types.impl.TypesPackageImpl;

import hu.modembed.model.modembed.application.ApplicationPackage;
import hu.modembed.model.modembed.application.impl.ApplicationPackageImpl;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;

import hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl;

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
public class PlatformPackageImpl extends EPackageImpl implements PlatformPackage {
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
	private EClass operationLocalLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelParameterValueEClass = null;

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
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformPackage#eNS_URI
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
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) instanceof InfrastructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI) : InfrastructurePackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI) : TraceabilityPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);
		InstructionsetPackageImpl theInstructionsetPackage = (InstructionsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) instanceof InstructionsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI) : InstructionsetPackage.eINSTANCE);
		ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
		AbstractionPackageImpl theAbstractionPackage = (AbstractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) instanceof AbstractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AbstractionPackage.eNS_URI) : AbstractionPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		MemorymodelPackageImpl theMemorymodelPackage = (MemorymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) instanceof MemorymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI) : MemorymodelPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		StructuredPackageImpl theStructuredPackage = (StructuredPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredPackage.eNS_URI) instanceof StructuredPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredPackage.eNS_URI) : StructuredPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

		// Create package meta-data objects
		thePlatformPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();
		theInstructionsetPackage.createPackageContents();
		theObjectPackage.createPackageContents();
		theAbstractionPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theMemorymodelPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStructuredPackage.createPackageContents();
		theApplicationPackage.createPackageContents();

		// Initialize created meta-data
		thePlatformPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();
		theInstructionsetPackage.initializePackageContents();
		theObjectPackage.initializePackageContents();
		theAbstractionPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theMemorymodelPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStructuredPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();

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
	public EReference getOperationArgument_MemType() {
		return (EReference)operationArgumentEClass.getEStructuralFeatures().get(1);
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
	public EClass getOperationLocalLabel() {
		return operationLocalLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalOperation() {
		return conditionalOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOperation_Condition() {
		return (EReference)conditionalOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalOperation_Steps() {
		return (EReference)conditionalOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelParameterValue() {
		return labelParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLabelParameterValue_Label() {
		return (EReference)labelParameterValueEClass.getEStructuralFeatures().get(0);
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
	public EReference getInstructionParameterMapping_Attribute() {
		return (EReference)instructionParameterMappingEClass.getEStructuralFeatures().get(1);
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
		operationDefinitionEClass = createEClass(OPERATION_DEFINITION);
		createEReference(operationDefinitionEClass, OPERATION_DEFINITION__ARGUMENTS);
		createEReference(operationDefinitionEClass, OPERATION_DEFINITION__STEPS);
		createEAttribute(operationDefinitionEClass, OPERATION_DEFINITION__OPERATION);

		operationArgumentEClass = createEClass(OPERATION_ARGUMENT);
		createEReference(operationArgumentEClass, OPERATION_ARGUMENT__TYPE);
		createEReference(operationArgumentEClass, OPERATION_ARGUMENT__MEM_TYPE);

		instructionCallOperationStepEClass = createEClass(INSTRUCTION_CALL_OPERATION_STEP);
		createEReference(instructionCallOperationStepEClass, INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION);
		createEReference(instructionCallOperationStepEClass, INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS);

		operationStepEClass = createEClass(OPERATION_STEP);

		operationLocalLabelEClass = createEClass(OPERATION_LOCAL_LABEL);

		conditionalOperationEClass = createEClass(CONDITIONAL_OPERATION);
		createEReference(conditionalOperationEClass, CONDITIONAL_OPERATION__CONDITION);
		createEReference(conditionalOperationEClass, CONDITIONAL_OPERATION__STEPS);

		labelParameterValueEClass = createEClass(LABEL_PARAMETER_VALUE);
		createEReference(labelParameterValueEClass, LABEL_PARAMETER_VALUE__LABEL);

		instructionParameterMappingEClass = createEClass(INSTRUCTION_PARAMETER_MAPPING);
		createEReference(instructionParameterMappingEClass, INSTRUCTION_PARAMETER_MAPPING__VALUE);
		createEReference(instructionParameterMappingEClass, INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		MemorymodelPackage theMemorymodelPackage = (MemorymodelPackage)EPackage.Registry.INSTANCE.getEPackage(MemorymodelPackage.eNS_URI);
		InstructionsetPackage theInstructionsetPackage = (InstructionsetPackage)EPackage.Registry.INSTANCE.getEPackage(InstructionsetPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationDefinitionEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		operationArgumentEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		instructionCallOperationStepEClass.getESuperTypes().add(this.getOperationStep());
		operationStepEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());
		operationLocalLabelEClass.getESuperTypes().add(this.getOperationStep());
		operationLocalLabelEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		conditionalOperationEClass.getESuperTypes().add(this.getOperationStep());
		labelParameterValueEClass.getESuperTypes().add(theExpressionsPackage.getExpression());
		instructionParameterMappingEClass.getESuperTypes().add(theExpressionsPackage.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(operationDefinitionEClass, OperationDefinition.class, "OperationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDefinition_Arguments(), this.getOperationArgument(), null, "arguments", null, 0, -1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDefinition_Steps(), this.getOperationStep(), null, "steps", null, 0, -1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationDefinition_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, OperationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationArgumentEClass, OperationArgument.class, "OperationArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationArgument_Type(), theTypesPackage.getTypeDefinition(), null, "type", null, 0, 1, OperationArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationArgument_MemType(), theMemorymodelPackage.getMemoryType(), null, "memType", null, 0, 1, OperationArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionCallOperationStepEClass, InstructionCallOperationStep.class, "InstructionCallOperationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionCallOperationStep_Instruction(), theInstructionsetPackage.getInstruction(), null, "instruction", null, 0, 1, InstructionCallOperationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionCallOperationStep_Arguments(), theExpressionsPackage.getExpression(), null, "arguments", null, 0, -1, InstructionCallOperationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationStepEClass, OperationStep.class, "OperationStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationLocalLabelEClass, OperationLocalLabel.class, "OperationLocalLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalOperationEClass, ConditionalOperation.class, "ConditionalOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalOperation_Condition(), theExpressionsPackage.getExpression(), null, "condition", null, 1, 1, ConditionalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalOperation_Steps(), this.getOperationStep(), null, "steps", null, 0, -1, ConditionalOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelParameterValueEClass, LabelParameterValue.class, "LabelParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLabelParameterValue_Label(), this.getOperationLocalLabel(), null, "label", null, 1, 1, LabelParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionParameterMappingEClass, InstructionParameterMapping.class, "InstructionParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstructionParameterMapping_Value(), this.getOperationArgument(), null, "value", null, 1, 1, InstructionParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionParameterMapping_Attribute(), theInfrastructurePackage.getAttributeDefinition(), null, "attribute", null, 0, 1, InstructionParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //PlatformPackageImpl

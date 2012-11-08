/**
 */
package hu.modembed.model.emodel.expressions.impl;

import hu.modembed.model.application.ApplicationPackage;
import hu.modembed.model.application.composition.CompositionPackage;
import hu.modembed.model.application.composition.impl.CompositionPackageImpl;
import hu.modembed.model.application.impl.ApplicationPackageImpl;
import hu.modembed.model.application.interface_.InterfacePackage;
import hu.modembed.model.application.interface_.impl.InterfacePackageImpl;
import hu.modembed.model.comm.CommPackage;
import hu.modembed.model.comm.impl.CommPackageImpl;
import hu.modembed.model.core.CorePackage;
import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.code.CodePackage;
import hu.modembed.model.core.assembler.code.impl.CodePackageImpl;
import hu.modembed.model.core.assembler.impl.AssemblerPackageImpl;
import hu.modembed.model.core.impl.CorePackageImpl;
import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.expressions.Call;
import hu.modembed.model.emodel.expressions.CompilationLogStep;
import hu.modembed.model.emodel.expressions.CompilationLogStepSeverity;
import hu.modembed.model.emodel.expressions.ExecutionBlock;
import hu.modembed.model.emodel.expressions.ExecutionStep;
import hu.modembed.model.emodel.expressions.Expression;
import hu.modembed.model.emodel.expressions.ExpressionsFactory;
import hu.modembed.model.emodel.expressions.ExpressionsPackage;
import hu.modembed.model.emodel.expressions.IntegerLiteralExpression;
import hu.modembed.model.emodel.expressions.LiteralExpression;
import hu.modembed.model.emodel.expressions.LocalVariable;
import hu.modembed.model.emodel.expressions.PrimitiveLiteralExpression;
import hu.modembed.model.emodel.expressions.VariableReference;
import hu.modembed.model.emodel.impl.EmodelPackageImpl;
import hu.modembed.model.emodel.types.TypesPackage;
import hu.modembed.model.emodel.types.impl.TypesPackageImpl;
import hu.modembed.model.network.NetworkPackage;
import hu.modembed.model.network.impl.NetworkPackageImpl;
import hu.modembed.model.network.rs232.Rs232Package;
import hu.modembed.model.network.rs232.impl.Rs232PackageImpl;

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
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationLogStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compilationLogStepSeverityEEnum = null;

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
	 * @see hu.modembed.model.emodel.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) : AssemblerPackage.eINSTANCE);
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

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAssemblerPackage.createPackageContents();
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

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssemblerPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionStep() {
		return executionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralExpression() {
		return literalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralExpression_Type() {
		return (EReference)literalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionBlock() {
		return executionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionBlock_Steps() {
		return (EReference)executionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Parameters() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Function() {
		return (EReference)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableReference() {
		return variableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableReference_Variable() {
		return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveLiteralExpression() {
		return primitiveLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteralExpression() {
		return integerLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLiteralExpression_Value() {
		return (EAttribute)integerLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompilationLogStep() {
		return compilationLogStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationLogStep_Severity() {
		return (EAttribute)compilationLogStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompilationLogStep_Message() {
		return (EAttribute)compilationLogStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalVariable() {
		return localVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompilationLogStepSeverity() {
		return compilationLogStepSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
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
		expressionEClass = createEClass(EXPRESSION);

		executionStepEClass = createEClass(EXECUTION_STEP);

		literalExpressionEClass = createEClass(LITERAL_EXPRESSION);
		createEReference(literalExpressionEClass, LITERAL_EXPRESSION__TYPE);

		executionBlockEClass = createEClass(EXECUTION_BLOCK);
		createEReference(executionBlockEClass, EXECUTION_BLOCK__STEPS);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__PARAMETERS);
		createEReference(callEClass, CALL__FUNCTION);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
		createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VARIABLE);

		primitiveLiteralExpressionEClass = createEClass(PRIMITIVE_LITERAL_EXPRESSION);

		integerLiteralExpressionEClass = createEClass(INTEGER_LITERAL_EXPRESSION);
		createEAttribute(integerLiteralExpressionEClass, INTEGER_LITERAL_EXPRESSION__VALUE);

		compilationLogStepEClass = createEClass(COMPILATION_LOG_STEP);
		createEAttribute(compilationLogStepEClass, COMPILATION_LOG_STEP__SEVERITY);
		createEAttribute(compilationLogStepEClass, COMPILATION_LOG_STEP__MESSAGE);

		localVariableEClass = createEClass(LOCAL_VARIABLE);

		// Create enums
		compilationLogStepSeverityEEnum = createEEnum(COMPILATION_LOG_STEP_SEVERITY);
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
		EmodelPackage theEmodelPackage = (EmodelPackage)EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		expressionEClass.getESuperTypes().add(this.getExecutionStep());
		executionStepEClass.getESuperTypes().add(theCorePackage.getMODembedElement());
		literalExpressionEClass.getESuperTypes().add(this.getExpression());
		executionBlockEClass.getESuperTypes().add(this.getExecutionStep());
		callEClass.getESuperTypes().add(this.getExpression());
		variableReferenceEClass.getESuperTypes().add(this.getExpression());
		primitiveLiteralExpressionEClass.getESuperTypes().add(this.getLiteralExpression());
		integerLiteralExpressionEClass.getESuperTypes().add(this.getPrimitiveLiteralExpression());
		compilationLogStepEClass.getESuperTypes().add(this.getExecutionStep());
		localVariableEClass.getESuperTypes().add(this.getExecutionStep());
		localVariableEClass.getESuperTypes().add(theEmodelPackage.getVariable());

		// Initialize classes and features; add operations and parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionStepEClass, ExecutionStep.class, "ExecutionStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalExpressionEClass, LiteralExpression.class, "LiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralExpression_Type(), theTypesPackage.getTypeDefinition(), null, "type", null, 0, 1, LiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionBlockEClass, ExecutionBlock.class, "ExecutionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionBlock_Steps(), this.getExecutionStep(), null, "steps", null, 0, -1, ExecutionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Parameters(), this.getExecutionStep(), null, "parameters", null, 0, -1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_Function(), theEmodelPackage.getCallableElement(), null, "function", null, 1, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableReference_Variable(), theEmodelPackage.getVariable(), null, "variable", null, 1, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveLiteralExpressionEClass, PrimitiveLiteralExpression.class, "PrimitiveLiteralExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerLiteralExpressionEClass, IntegerLiteralExpression.class, "IntegerLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteralExpression_Value(), ecorePackage.getEBigInteger(), "value", null, 0, 1, IntegerLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compilationLogStepEClass, CompilationLogStep.class, "CompilationLogStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompilationLogStep_Severity(), this.getCompilationLogStepSeverity(), "severity", null, 1, 1, CompilationLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompilationLogStep_Message(), ecorePackage.getEString(), "message", null, 1, 1, CompilationLogStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localVariableEClass, LocalVariable.class, "LocalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(compilationLogStepSeverityEEnum, CompilationLogStepSeverity.class, "CompilationLogStepSeverity");
		addEEnumLiteral(compilationLogStepSeverityEEnum, CompilationLogStepSeverity.INFO);
		addEEnumLiteral(compilationLogStepSeverityEEnum, CompilationLogStepSeverity.DEBUG);
		addEEnumLiteral(compilationLogStepSeverityEEnum, CompilationLogStepSeverity.WARNING);
		addEEnumLiteral(compilationLogStepSeverityEEnum, CompilationLogStepSeverity.ERROR);
	}

} //ExpressionsPackageImpl

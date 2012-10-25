/**
 */
package hu.modembed.model.emodel.impl;

import hu.modembed.model.application.ApplicationPackage;

import hu.modembed.model.application.code.CodePackage;
import hu.modembed.model.application.code.impl.CodePackageImpl;
import hu.modembed.model.application.composition.CompositionPackage;
import hu.modembed.model.application.composition.impl.CompositionPackageImpl;
import hu.modembed.model.application.datatypes.DatatypesPackage;
import hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl;
import hu.modembed.model.application.impl.ApplicationPackageImpl;
import hu.modembed.model.application.interface_.InterfacePackage;
import hu.modembed.model.application.interface_.impl.InterfacePackageImpl;
import hu.modembed.model.comm.CommPackage;

import hu.modembed.model.comm.impl.CommPackageImpl;
import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.impl.AssemblerPackageImpl;
import hu.modembed.model.core.impl.CorePackageImpl;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.Function;
import hu.modembed.model.emodel.FunctionParameter;
import hu.modembed.model.emodel.FunctionResult;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.ResultBuffer;
import hu.modembed.model.emodel.ResultExpression;
import hu.modembed.model.emodel.Type;
import hu.modembed.model.emodel.Variable;

import hu.modembed.model.emodel.expressions.ExpressionsPackage;

import hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl;

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
public class EmodelPackageImpl extends EPackageImpl implements EmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultExpressionEClass = null;

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
	 * @see hu.modembed.model.emodel.EmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EmodelPackageImpl() {
		super(eNS_URI, EmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EmodelPackage init() {
		if (isInited) return (EmodelPackage)EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI);

		// Obtain or create and register package
		EmodelPackageImpl theEmodelPackage = (EmodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmodelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) : AssemblerPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		Rs232PackageImpl theRs232Package = (Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI) instanceof Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI) : Rs232Package.eINSTANCE);
		CommPackageImpl theCommPackage = (CommPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) instanceof CommPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) : CommPackage.eINSTANCE);
		hu.modembed.model.comm.rs232.impl.Rs232PackageImpl theRs232Package_1 = (hu.modembed.model.comm.rs232.impl.Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) instanceof hu.modembed.model.comm.rs232.impl.Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) : hu.modembed.model.comm.rs232.Rs232Package.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) : InterfacePackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		CompositionPackageImpl theCompositionPackage = (CompositionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) instanceof CompositionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) : CompositionPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theEmodelPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theAssemblerPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theRs232Package.createPackageContents();
		theCommPackage.createPackageContents();
		theRs232Package_1.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theCompositionPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theEmodelPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssemblerPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theRs232Package.initializePackageContents();
		theCommPackage.initializePackageContents();
		theRs232Package_1.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theCompositionPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmodelPackage.eNS_URI, theEmodelPackage);
		return theEmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibrary_Uses() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Definition() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Arguments() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Overrides() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Result() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Implementation() {
		return (EReference)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Type() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Lazy() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionResult() {
		return functionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultBuffer() {
		return resultBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultExpression() {
		return resultExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultExpression_Expression() {
		return (EReference)resultExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmodelFactory getEmodelFactory() {
		return (EmodelFactory)getEFactoryInstance();
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
		libraryEClass = createEClass(LIBRARY);
		createEReference(libraryEClass, LIBRARY__USES);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__DEFINITION);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__ARGUMENTS);
		createEReference(functionEClass, FUNCTION__OVERRIDES);
		createEReference(functionEClass, FUNCTION__RESULT);
		createEReference(functionEClass, FUNCTION__IMPLEMENTATION);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TYPE);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__LAZY);

		functionResultEClass = createEClass(FUNCTION_RESULT);

		resultBufferEClass = createEClass(RESULT_BUFFER);

		resultExpressionEClass = createEClass(RESULT_EXPRESSION);
		createEReference(resultExpressionEClass, RESULT_EXPRESSION__EXPRESSION);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTypesPackage);
		getESubpackages().add(theExpressionsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		libraryEClass.getESuperTypes().add(theCorePackage.getPackage());
		libraryEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		typeEClass.getESuperTypes().add(theCorePackage.getPackagedElement());
		functionEClass.getESuperTypes().add(theCorePackage.getPackagedElement());
		variableEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		functionParameterEClass.getESuperTypes().add(this.getVariable());
		resultBufferEClass.getESuperTypes().add(this.getFunctionResult());
		resultBufferEClass.getESuperTypes().add(this.getVariable());
		resultExpressionEClass.getESuperTypes().add(this.getFunctionResult());

		// Initialize classes and features; add operations and parameters
		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibrary_Uses(), this.getLibrary(), null, "uses", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Definition(), theTypesPackage.getTypeDefinition(), null, "definition", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Arguments(), this.getFunctionParameter(), null, "arguments", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Overrides(), this.getFunction(), null, "overrides", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Result(), this.getFunctionResult(), null, "result", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Implementation(), theExpressionsPackage.getExecutionStep(), null, "implementation", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Type(), theTypesPackage.getTypeDefinition(), null, "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionParameter_Lazy(), ecorePackage.getEBoolean(), "lazy", "false", 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionResultEClass, FunctionResult.class, "FunctionResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultBufferEClass, ResultBuffer.class, "ResultBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultExpressionEClass, ResultExpression.class, "ResultExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultExpression_Expression(), theExpressionsPackage.getExpression(), null, "expression", null, 1, 1, ResultExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EmodelPackageImpl

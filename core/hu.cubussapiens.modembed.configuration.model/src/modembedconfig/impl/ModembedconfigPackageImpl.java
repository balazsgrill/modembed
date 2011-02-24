/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig.impl;

import modembedconfig.EnumParam;
import modembedconfig.EnumParamLiteral;
import modembedconfig.ModembedconfigFactory;
import modembedconfig.ModembedconfigPackage;
import modembedconfig.Parameter;
import modembedconfig.ParameterSet;
import modembedconfig.Scheme;

import modembedconfig.instance.InstancePackage;

import modembedconfig.instance.impl.InstancePackageImpl;

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
public class ModembedconfigPackageImpl extends EPackageImpl implements ModembedconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumParamLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetEClass = null;

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
	 * @see modembedconfig.ModembedconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModembedconfigPackageImpl() {
		super(eNS_URI, ModembedconfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModembedconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModembedconfigPackage init() {
		if (isInited) return (ModembedconfigPackage)EPackage.Registry.INSTANCE.getEPackage(ModembedconfigPackage.eNS_URI);

		// Obtain or create and register package
		ModembedconfigPackageImpl theModembedconfigPackage = (ModembedconfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModembedconfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModembedconfigPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);

		// Create package meta-data objects
		theModembedconfigPackage.createPackageContents();
		theInstancePackage.createPackageContents();

		// Initialize created meta-data
		theModembedconfigPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModembedconfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModembedconfigPackage.eNS_URI, theModembedconfigPackage);
		return theModembedconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheme() {
		return schemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Default() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumParam() {
		return enumParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumParam_Literals() {
		return (EReference)enumParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumParamLiteral() {
		return enumParamLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumParamLiteral_Name() {
		return (EAttribute)enumParamLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumParamLiteral_Value() {
		return (EAttribute)enumParamLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSet() {
		return parameterSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSet_Name() {
		return (EAttribute)parameterSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Parameters() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Subsets() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModembedconfigFactory getModembedconfigFactory() {
		return (ModembedconfigFactory)getEFactoryInstance();
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
		schemeEClass = createEClass(SCHEME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);

		enumParamEClass = createEClass(ENUM_PARAM);
		createEReference(enumParamEClass, ENUM_PARAM__LITERALS);

		enumParamLiteralEClass = createEClass(ENUM_PARAM_LITERAL);
		createEAttribute(enumParamLiteralEClass, ENUM_PARAM_LITERAL__NAME);
		createEAttribute(enumParamLiteralEClass, ENUM_PARAM_LITERAL__VALUE);

		parameterSetEClass = createEClass(PARAMETER_SET);
		createEAttribute(parameterSetEClass, PARAMETER_SET__NAME);
		createEReference(parameterSetEClass, PARAMETER_SET__PARAMETERS);
		createEReference(parameterSetEClass, PARAMETER_SET__SUBSETS);
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
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theInstancePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		schemeEClass.getESuperTypes().add(this.getParameterSet());
		enumParamEClass.getESuperTypes().add(this.getParameter());

		// Initialize classes and features; add operations and parameters
		initEClass(schemeEClass, Scheme.class, "Scheme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Default(), ecorePackage.getEInt(), "default", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumParamEClass, EnumParam.class, "EnumParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumParam_Literals(), this.getEnumParamLiteral(), null, "literals", null, 0, -1, EnumParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumParamLiteralEClass, EnumParamLiteral.class, "EnumParamLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumParamLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumParamLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumParamLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, EnumParamLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSetEClass, ParameterSet.class, "ParameterSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterSet_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterSet_Subsets(), this.getParameterSet(), null, "subsets", null, 0, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModembedconfigPackageImpl

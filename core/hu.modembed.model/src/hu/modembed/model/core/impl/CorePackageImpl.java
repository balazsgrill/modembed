/**
 */
package hu.modembed.model.core.impl;

import hu.modembed.model.abstraction.behavior.BehaviorPackage;

import hu.modembed.model.abstraction.behavior.impl.BehaviorPackageImpl;

import hu.modembed.model.abstraction.behavior.platform.PlatformPackage;

import hu.modembed.model.abstraction.behavior.platform.impl.PlatformPackageImpl;

import hu.modembed.model.abstraction.types.TypesPackage;

import hu.modembed.model.abstraction.types.impl.TypesPackageImpl;

import hu.modembed.model.architecture.ArchitecturePackage;

import hu.modembed.model.architecture.impl.ArchitecturePackageImpl;

import hu.modembed.model.core.CoreFactory;
import hu.modembed.model.core.CorePackage;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.ModelOrigin;
import hu.modembed.model.core.NamedElement;
import hu.modembed.model.core.Origin;
import hu.modembed.model.core.RootElement;
import hu.modembed.model.core.TextOrigin;

import hu.modembed.model.core.assembler.AssemblerPackage;

import hu.modembed.model.core.assembler.code.CodePackage;

import hu.modembed.model.core.assembler.code.impl.CodePackageImpl;

import hu.modembed.model.core.assembler.impl.AssemblerPackageImpl;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moDembedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass originEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelOriginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textOriginEClass = null;

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
	 * @see hu.modembed.model.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) : AssemblerPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI) : WorkflowPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		PlatformPackageImpl thePlatformPackage = (PlatformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) instanceof PlatformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlatformPackage.eNS_URI) : PlatformPackage.eINSTANCE);

		// Create package meta-data objects
		theCorePackage.createPackageContents();
		theAssemblerPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theWorkflowPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		thePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theAssemblerPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		thePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMODembedElement() {
		return moDembedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODembedElement_Origins() {
		return (EReference)moDembedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODembedElement_Description() {
		return (EAttribute)moDembedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElement() {
		return rootElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrigin() {
		return originEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelOrigin() {
		return modelOriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelOrigin_Element() {
		return (EReference)modelOriginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextOrigin() {
		return textOriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextOrigin_Path() {
		return (EAttribute)textOriginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextOrigin_Line() {
		return (EAttribute)textOriginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextOrigin_CharStart() {
		return (EAttribute)textOriginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextOrigin_CharEnd() {
		return (EAttribute)textOriginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		moDembedElementEClass = createEClass(MO_DEMBED_ELEMENT);
		createEReference(moDembedElementEClass, MO_DEMBED_ELEMENT__ORIGINS);
		createEAttribute(moDembedElementEClass, MO_DEMBED_ELEMENT__DESCRIPTION);

		rootElementEClass = createEClass(ROOT_ELEMENT);

		originEClass = createEClass(ORIGIN);

		modelOriginEClass = createEClass(MODEL_ORIGIN);
		createEReference(modelOriginEClass, MODEL_ORIGIN__ELEMENT);

		textOriginEClass = createEClass(TEXT_ORIGIN);
		createEAttribute(textOriginEClass, TEXT_ORIGIN__PATH);
		createEAttribute(textOriginEClass, TEXT_ORIGIN__LINE);
		createEAttribute(textOriginEClass, TEXT_ORIGIN__CHAR_START);
		createEAttribute(textOriginEClass, TEXT_ORIGIN__CHAR_END);
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
		AssemblerPackage theAssemblerPackage = (AssemblerPackage)EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI);
		WorkflowPackage theWorkflowPackage = (WorkflowPackage)EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAssemblerPackage);
		getESubpackages().add(theWorkflowPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedElementEClass.getESuperTypes().add(this.getMODembedElement());
		rootElementEClass.getESuperTypes().add(this.getNamedElement());
		modelOriginEClass.getESuperTypes().add(this.getOrigin());
		textOriginEClass.getESuperTypes().add(this.getOrigin());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moDembedElementEClass, MODembedElement.class, "MODembedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMODembedElement_Origins(), this.getOrigin(), null, "origins", null, 0, -1, MODembedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMODembedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, MODembedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rootElementEClass, RootElement.class, "RootElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(originEClass, Origin.class, "Origin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelOriginEClass, ModelOrigin.class, "ModelOrigin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelOrigin_Element(), this.getMODembedElement(), null, "element", null, 1, 1, ModelOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textOriginEClass, TextOrigin.class, "TextOrigin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextOrigin_Path(), ecorePackage.getEString(), "path", null, 1, 1, TextOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextOrigin_Line(), ecorePackage.getEInt(), "line", null, 0, 1, TextOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextOrigin_CharStart(), ecorePackage.getEInt(), "charStart", null, 0, 1, TextOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextOrigin_CharEnd(), ecorePackage.getEInt(), "charEnd", null, 0, 1, TextOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CorePackageImpl

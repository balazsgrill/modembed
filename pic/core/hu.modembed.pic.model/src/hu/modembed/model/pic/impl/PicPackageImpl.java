/**
 */
package hu.modembed.model.pic.impl;

import hu.modembed.model.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.abstraction.types.TypesPackage;
import hu.modembed.model.architecture.ArchitecturePackage;
import hu.modembed.model.core.CorePackage;
import hu.modembed.model.pic.ConfigField;
import hu.modembed.model.pic.ConfigLiteral;
import hu.modembed.model.pic.ConfigWord;
import hu.modembed.model.pic.PICArchitecture;
import hu.modembed.model.pic.PicFactory;
import hu.modembed.model.pic.PicPackage;
import hu.modembed.model.pic.configValue.ConfigValuePackage;
import hu.modembed.model.pic.configValue.impl.ConfigValuePackageImpl;

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
public class PicPackageImpl extends EPackageImpl implements PicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configLiteralEClass = null;

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
	 * @see hu.modembed.model.pic.PicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PicPackageImpl() {
		super(eNS_URI, PicFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PicPackage init() {
		if (isInited) return (PicPackage)EPackage.Registry.INSTANCE.getEPackage(PicPackage.eNS_URI);

		// Obtain or create and register package
		PicPackageImpl thePicPackage = (PicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PicPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		ArchitecturePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		BehaviorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ConfigValuePackageImpl theConfigValuePackage = (ConfigValuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigValuePackage.eNS_URI) instanceof ConfigValuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigValuePackage.eNS_URI) : ConfigValuePackage.eINSTANCE);

		// Create package meta-data objects
		thePicPackage.createPackageContents();
		theConfigValuePackage.createPackageContents();

		// Initialize created meta-data
		thePicPackage.initializePackageContents();
		theConfigValuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PicPackage.eNS_URI, thePicPackage);
		return thePicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPICArchitecture() {
		return picArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICArchitecture_ConfigWords() {
		return (EReference)picArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigWord() {
		return configWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigWord_Address() {
		return (EAttribute)configWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigWord_Size() {
		return (EAttribute)configWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigWord_DefaultValue() {
		return (EAttribute)configWordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigWord_Fields() {
		return (EReference)configWordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigWord_ImplMask() {
		return (EAttribute)configWordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigField() {
		return configFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigField_Literals() {
		return (EReference)configFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigField_Size() {
		return (EAttribute)configFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigField_Start() {
		return (EAttribute)configFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigLiteral() {
		return configLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigLiteral_Value() {
		return (EAttribute)configLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicFactory getPicFactory() {
		return (PicFactory)getEFactoryInstance();
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
		picArchitectureEClass = createEClass(PIC_ARCHITECTURE);
		createEReference(picArchitectureEClass, PIC_ARCHITECTURE__CONFIG_WORDS);

		configWordEClass = createEClass(CONFIG_WORD);
		createEAttribute(configWordEClass, CONFIG_WORD__ADDRESS);
		createEAttribute(configWordEClass, CONFIG_WORD__SIZE);
		createEAttribute(configWordEClass, CONFIG_WORD__DEFAULT_VALUE);
		createEReference(configWordEClass, CONFIG_WORD__FIELDS);
		createEAttribute(configWordEClass, CONFIG_WORD__IMPL_MASK);

		configFieldEClass = createEClass(CONFIG_FIELD);
		createEReference(configFieldEClass, CONFIG_FIELD__LITERALS);
		createEAttribute(configFieldEClass, CONFIG_FIELD__SIZE);
		createEAttribute(configFieldEClass, CONFIG_FIELD__START);

		configLiteralEClass = createEClass(CONFIG_LITERAL);
		createEAttribute(configLiteralEClass, CONFIG_LITERAL__VALUE);
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
		ConfigValuePackage theConfigValuePackage = (ConfigValuePackage)EPackage.Registry.INSTANCE.getEPackage(ConfigValuePackage.eNS_URI);
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theConfigValuePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		picArchitectureEClass.getESuperTypes().add(theArchitecturePackage.getArchitecture());
		configWordEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		configFieldEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		configLiteralEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(picArchitectureEClass, PICArchitecture.class, "PICArchitecture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPICArchitecture_ConfigWords(), this.getConfigWord(), null, "configWords", null, 0, -1, PICArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configWordEClass, ConfigWord.class, "ConfigWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigWord_Address(), ecorePackage.getELong(), "address", null, 0, 1, ConfigWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigWord_Size(), ecorePackage.getELong(), "size", null, 0, 1, ConfigWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigWord_DefaultValue(), ecorePackage.getELong(), "defaultValue", null, 0, 1, ConfigWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigWord_Fields(), this.getConfigField(), null, "fields", null, 0, -1, ConfigWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigWord_ImplMask(), ecorePackage.getELong(), "implMask", null, 0, 1, ConfigWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configFieldEClass, ConfigField.class, "ConfigField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigField_Literals(), this.getConfigLiteral(), null, "literals", null, 0, -1, ConfigField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigField_Size(), ecorePackage.getEInt(), "size", null, 0, 1, ConfigField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigField_Start(), ecorePackage.getELong(), "start", null, 0, 1, ConfigField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configLiteralEClass, ConfigLiteral.class, "ConfigLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigLiteral_Value(), ecorePackage.getELong(), "value", null, 0, 1, ConfigLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PicPackageImpl

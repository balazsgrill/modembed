/**
 */
package hu.modembed.model.pic.impl;

import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;
import hu.modembed.model.modembed.core.object.ObjectPackage;
import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
import hu.modembed.model.pic.ConfigField;
import hu.modembed.model.pic.ConfigLiteral;
import hu.modembed.model.pic.ConfigWord;
import hu.modembed.model.pic.ConfigurationSelection;
import hu.modembed.model.pic.PICConfigurationModel;
import hu.modembed.model.pic.PICConfigurationValueModel;
import hu.modembed.model.pic.PicFactory;
import hu.modembed.model.pic.PicPackage;

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
	private EClass picConfigurationModelEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picConfigurationValueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationSelectionEClass = null;

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
		InfrastructurePackage.eINSTANCE.eClass();
		InstructionsetPackage.eINSTANCE.eClass();
		ObjectPackage.eINSTANCE.eClass();
		AbstractionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePicPackage.createPackageContents();

		// Initialize created meta-data
		thePicPackage.initializePackageContents();

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
	public EClass getPICConfigurationModel() {
		return picConfigurationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICConfigurationModel_ConfigWords() {
		return (EReference)picConfigurationModelEClass.getEStructuralFeatures().get(0);
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
	public EClass getPICConfigurationValueModel() {
		return picConfigurationValueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICConfigurationValueModel_Values() {
		return (EReference)picConfigurationValueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICConfigurationValueModel_Definition() {
		return (EReference)picConfigurationValueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationSelection() {
		return configurationSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSelection_Field() {
		return (EReference)configurationSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSelection_Selection() {
		return (EReference)configurationSelectionEClass.getEStructuralFeatures().get(1);
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
		picConfigurationModelEClass = createEClass(PIC_CONFIGURATION_MODEL);
		createEReference(picConfigurationModelEClass, PIC_CONFIGURATION_MODEL__CONFIG_WORDS);

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

		picConfigurationValueModelEClass = createEClass(PIC_CONFIGURATION_VALUE_MODEL);
		createEReference(picConfigurationValueModelEClass, PIC_CONFIGURATION_VALUE_MODEL__VALUES);
		createEReference(picConfigurationValueModelEClass, PIC_CONFIGURATION_VALUE_MODEL__DEFINITION);

		configurationSelectionEClass = createEClass(CONFIGURATION_SELECTION);
		createEReference(configurationSelectionEClass, CONFIGURATION_SELECTION__FIELD);
		createEReference(configurationSelectionEClass, CONFIGURATION_SELECTION__SELECTION);
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
		picConfigurationModelEClass.getESuperTypes().add(theInfrastructurePackage.getRootElement());
		configWordEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		configFieldEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		configLiteralEClass.getESuperTypes().add(theInfrastructurePackage.getNamedElement());
		picConfigurationValueModelEClass.getESuperTypes().add(theInfrastructurePackage.getRootElement());
		configurationSelectionEClass.getESuperTypes().add(theInfrastructurePackage.getMODembedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(picConfigurationModelEClass, PICConfigurationModel.class, "PICConfigurationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPICConfigurationModel_ConfigWords(), this.getConfigWord(), null, "configWords", null, 0, -1, PICConfigurationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(picConfigurationValueModelEClass, PICConfigurationValueModel.class, "PICConfigurationValueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPICConfigurationValueModel_Values(), this.getConfigurationSelection(), null, "values", null, 0, -1, PICConfigurationValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPICConfigurationValueModel_Definition(), this.getPICConfigurationModel(), null, "definition", null, 0, 1, PICConfigurationValueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSelectionEClass, ConfigurationSelection.class, "ConfigurationSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationSelection_Field(), this.getConfigField(), null, "field", null, 1, 1, ConfigurationSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSelection_Selection(), this.getConfigLiteral(), null, "selection", null, 0, 1, ConfigurationSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PicPackageImpl

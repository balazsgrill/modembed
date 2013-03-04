/**
 */
package hu.modembed.model.pic.configValue.impl;

import hu.modembed.model.application.ApplicationPackage;

import hu.modembed.model.architecture.ArchitecturePackage;

import hu.modembed.model.comm.CommPackage;

import hu.modembed.model.core.CorePackage;

import hu.modembed.model.emodel.EmodelPackage;

import hu.modembed.model.network.NetworkPackage;

import hu.modembed.model.pic.PicPackage;

import hu.modembed.model.pic.configValue.ConfigValueFactory;
import hu.modembed.model.pic.configValue.ConfigValuePackage;
import hu.modembed.model.pic.configValue.ConfigurationSelection;
import hu.modembed.model.pic.configValue.PICConfigurationValue;

import hu.modembed.model.pic.impl.PicPackageImpl;

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
public class ConfigValuePackageImpl extends EPackageImpl implements ConfigValuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picConfigurationValueEClass = null;

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
	 * @see hu.modembed.model.pic.configValue.ConfigValuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigValuePackageImpl() {
		super(eNS_URI, ConfigValueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigValuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigValuePackage init() {
		if (isInited) return (ConfigValuePackage)EPackage.Registry.INSTANCE.getEPackage(ConfigValuePackage.eNS_URI);

		// Obtain or create and register package
		ConfigValuePackageImpl theConfigValuePackage = (ConfigValuePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigValuePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigValuePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();
		NetworkPackage.eINSTANCE.eClass();
		CommPackage.eINSTANCE.eClass();
		ApplicationPackage.eINSTANCE.eClass();
		EmodelPackage.eINSTANCE.eClass();
		ArchitecturePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PicPackageImpl thePicPackage = (PicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PicPackage.eNS_URI) instanceof PicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PicPackage.eNS_URI) : PicPackage.eINSTANCE);

		// Create package meta-data objects
		theConfigValuePackage.createPackageContents();
		thePicPackage.createPackageContents();

		// Initialize created meta-data
		theConfigValuePackage.initializePackageContents();
		thePicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigValuePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigValuePackage.eNS_URI, theConfigValuePackage);
		return theConfigValuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPICConfigurationValue() {
		return picConfigurationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICConfigurationValue_Values() {
		return (EReference)picConfigurationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICConfigurationValue_Definition() {
		return (EReference)picConfigurationValueEClass.getEStructuralFeatures().get(1);
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
	public ConfigValueFactory getConfigValueFactory() {
		return (ConfigValueFactory)getEFactoryInstance();
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
		picConfigurationValueEClass = createEClass(PIC_CONFIGURATION_VALUE);
		createEReference(picConfigurationValueEClass, PIC_CONFIGURATION_VALUE__VALUES);
		createEReference(picConfigurationValueEClass, PIC_CONFIGURATION_VALUE__DEFINITION);

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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		PicPackage thePicPackage = (PicPackage)EPackage.Registry.INSTANCE.getEPackage(PicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		picConfigurationValueEClass.getESuperTypes().add(theCorePackage.getRootElement());
		configurationSelectionEClass.getESuperTypes().add(theCorePackage.getMODembedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(picConfigurationValueEClass, PICConfigurationValue.class, "PICConfigurationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPICConfigurationValue_Values(), this.getConfigurationSelection(), null, "values", null, 0, -1, PICConfigurationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPICConfigurationValue_Definition(), thePicPackage.getPICArchitecture(), null, "definition", null, 0, 1, PICConfigurationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationSelectionEClass, ConfigurationSelection.class, "ConfigurationSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationSelection_Field(), thePicPackage.getConfigField(), null, "field", null, 1, 1, ConfigurationSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSelection_Selection(), thePicPackage.getConfigLiteral(), null, "selection", null, 0, 1, ConfigurationSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ConfigValuePackageImpl

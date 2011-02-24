/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic.impl;

import modembedconfig.ModembedconfigPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pic.ConfigurationBits;
import pic.ConfigurationField;
import pic.ConfigurationWord;
import pic.PicCPUType;
import pic.PicFactory;
import pic.PicPackage;

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
	private EClass configurationBitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationWordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picCPUTypeEClass = null;

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
	 * @see pic.PicPackage#eNS_URI
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
		ModembedconfigPackage.eINSTANCE.eClass();

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
	public EClass getConfigurationBits() {
		return configurationBitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationBits_Scheme() {
		return (EReference)configurationBitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationBits_Words() {
		return (EReference)configurationBitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationBits_Wordsize() {
		return (EAttribute)configurationBitsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationWord() {
		return configurationWordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationWord_Address() {
		return (EAttribute)configurationWordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationWord_Fields() {
		return (EReference)configurationWordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationField() {
		return configurationFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationField_Parameter() {
		return (EReference)configurationFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationField_StartBit() {
		return (EAttribute)configurationFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationField_Length() {
		return (EAttribute)configurationFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPicCPUType() {
		return picCPUTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPicCPUType_Name() {
		return (EAttribute)picCPUTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPicCPUType_Configuration() {
		return (EReference)picCPUTypeEClass.getEStructuralFeatures().get(1);
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
		configurationBitsEClass = createEClass(CONFIGURATION_BITS);
		createEReference(configurationBitsEClass, CONFIGURATION_BITS__SCHEME);
		createEReference(configurationBitsEClass, CONFIGURATION_BITS__WORDS);
		createEAttribute(configurationBitsEClass, CONFIGURATION_BITS__WORDSIZE);

		configurationWordEClass = createEClass(CONFIGURATION_WORD);
		createEAttribute(configurationWordEClass, CONFIGURATION_WORD__ADDRESS);
		createEReference(configurationWordEClass, CONFIGURATION_WORD__FIELDS);

		configurationFieldEClass = createEClass(CONFIGURATION_FIELD);
		createEReference(configurationFieldEClass, CONFIGURATION_FIELD__PARAMETER);
		createEAttribute(configurationFieldEClass, CONFIGURATION_FIELD__START_BIT);
		createEAttribute(configurationFieldEClass, CONFIGURATION_FIELD__LENGTH);

		picCPUTypeEClass = createEClass(PIC_CPU_TYPE);
		createEAttribute(picCPUTypeEClass, PIC_CPU_TYPE__NAME);
		createEReference(picCPUTypeEClass, PIC_CPU_TYPE__CONFIGURATION);
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
		ModembedconfigPackage theModembedconfigPackage = (ModembedconfigPackage)EPackage.Registry.INSTANCE.getEPackage(ModembedconfigPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(configurationBitsEClass, ConfigurationBits.class, "ConfigurationBits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationBits_Scheme(), theModembedconfigPackage.getScheme(), null, "scheme", null, 0, 1, ConfigurationBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationBits_Words(), this.getConfigurationWord(), null, "words", null, 0, -1, ConfigurationBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationBits_Wordsize(), ecorePackage.getEInt(), "wordsize", null, 0, 1, ConfigurationBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationWordEClass, ConfigurationWord.class, "ConfigurationWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationWord_Address(), ecorePackage.getEInt(), "address", null, 0, 1, ConfigurationWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationWord_Fields(), this.getConfigurationField(), null, "fields", null, 0, -1, ConfigurationWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationFieldEClass, ConfigurationField.class, "ConfigurationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationField_Parameter(), theModembedconfigPackage.getParameter(), null, "parameter", null, 0, 1, ConfigurationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationField_StartBit(), ecorePackage.getEInt(), "startBit", null, 0, 1, ConfigurationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurationField_Length(), ecorePackage.getEInt(), "length", null, 0, 1, ConfigurationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(picCPUTypeEClass, PicCPUType.class, "PicCPUType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPicCPUType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PicCPUType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPicCPUType_Configuration(), this.getConfigurationBits(), null, "configuration", null, 0, 1, PicCPUType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PicPackageImpl

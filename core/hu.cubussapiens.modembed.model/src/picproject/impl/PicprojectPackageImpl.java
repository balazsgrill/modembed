/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package picproject.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pic.PicPackage;

import picproject.PICSettings;
import picproject.PicprojectFactory;
import picproject.PicprojectPackage;

import project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PicprojectPackageImpl extends EPackageImpl implements PicprojectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picSettingsEClass = null;

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
	 * @see picproject.PicprojectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PicprojectPackageImpl() {
		super(eNS_URI, PicprojectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PicprojectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PicprojectPackage init() {
		if (isInited) return (PicprojectPackage)EPackage.Registry.INSTANCE.getEPackage(PicprojectPackage.eNS_URI);

		// Obtain or create and register package
		PicprojectPackageImpl thePicprojectPackage = (PicprojectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PicprojectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PicprojectPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PicPackage.eINSTANCE.eClass();
		ProjectPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePicprojectPackage.createPackageContents();

		// Initialize created meta-data
		thePicprojectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePicprojectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PicprojectPackage.eNS_URI, thePicprojectPackage);
		return thePicprojectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPICSettings() {
		return picSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPICSettings_Cpu() {
		return (EReference)picSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPICSettings_Configuration() {
		return (EAttribute)picSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicprojectFactory getPicprojectFactory() {
		return (PicprojectFactory)getEFactoryInstance();
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
		picSettingsEClass = createEClass(PIC_SETTINGS);
		createEReference(picSettingsEClass, PIC_SETTINGS__CPU);
		createEAttribute(picSettingsEClass, PIC_SETTINGS__CONFIGURATION);
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
		ProjectPackage theProjectPackage = (ProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectPackage.eNS_URI);
		PicPackage thePicPackage = (PicPackage)EPackage.Registry.INSTANCE.getEPackage(PicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		picSettingsEClass.getESuperTypes().add(theProjectPackage.getSettingsExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(picSettingsEClass, PICSettings.class, "PICSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPICSettings_Cpu(), thePicPackage.getPicCPUType(), null, "cpu", null, 0, 1, PICSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPICSettings_Configuration(), ecorePackage.getEString(), "configuration", null, 0, 1, PICSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PicprojectPackageImpl

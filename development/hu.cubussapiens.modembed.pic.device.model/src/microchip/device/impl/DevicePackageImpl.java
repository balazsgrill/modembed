/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.impl;

import microchip.MicrochipPackage;
import microchip.device.DeviceFactory;
import microchip.device.DevicePackage;
import microchip.device.Vdd;
import microchip.device.Vpp;
import microchip.device.config.ConfigPackage;
import microchip.device.config.impl.ConfigPackageImpl;
import microchip.device.generic.GenericPackage;
import microchip.device.generic.impl.GenericPackageImpl;
import microchip.device.memory.MemoryPackage;
import microchip.device.memory.impl.MemoryPackageImpl;
import microchip.impl.MicrochipPackageImpl;

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
public class DevicePackageImpl extends EPackageImpl implements DevicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vppEClass = null;

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
	 * @see microchip.device.DevicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevicePackageImpl() {
		super(eNS_URI, DeviceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DevicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevicePackage init() {
		if (isInited) return (DevicePackage)EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI);

		// Obtain or create and register package
		DevicePackageImpl theDevicePackage = (DevicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevicePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MicrochipPackageImpl theMicrochipPackage = (MicrochipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicrochipPackage.eNS_URI) instanceof MicrochipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicrochipPackage.eNS_URI) : MicrochipPackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);
		GenericPackageImpl theGenericPackage = (GenericPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI) instanceof GenericPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI) : GenericPackage.eINSTANCE);
		MemoryPackageImpl theMemoryPackage = (MemoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI) instanceof MemoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI) : MemoryPackage.eINSTANCE);

		// Create package meta-data objects
		theDevicePackage.createPackageContents();
		theMicrochipPackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theGenericPackage.createPackageContents();
		theMemoryPackage.createPackageContents();

		// Initialize created meta-data
		theDevicePackage.initializePackageContents();
		theMicrochipPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theGenericPackage.initializePackageContents();
		theMemoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevicePackage.eNS_URI, theDevicePackage);
		return theDevicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVdd() {
		return vddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVdd_Range() {
		return (EReference)vddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVdd_Dfltrange() {
		return (EReference)vddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVdd_Nominal() {
		return (EAttribute)vddEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVpp() {
		return vppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVpp_Range() {
		return (EReference)vppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVpp_Dflt() {
		return (EAttribute)vppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFactory getDeviceFactory() {
		return (DeviceFactory)getEFactoryInstance();
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
		vddEClass = createEClass(VDD);
		createEReference(vddEClass, VDD__RANGE);
		createEReference(vddEClass, VDD__DFLTRANGE);
		createEAttribute(vddEClass, VDD__NOMINAL);

		vppEClass = createEClass(VPP);
		createEReference(vppEClass, VPP__RANGE);
		createEAttribute(vppEClass, VPP__DFLT);
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
		ConfigPackage theConfigPackage = (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);
		GenericPackage theGenericPackage = (GenericPackage)EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI);
		MemoryPackage theMemoryPackage = (MemoryPackage)EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theConfigPackage);
		getESubpackages().add(theGenericPackage);
		getESubpackages().add(theMemoryPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(vddEClass, Vdd.class, "Vdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVdd_Range(), theGenericPackage.getFloatRange(), null, "range", null, 0, 1, Vdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVdd_Dfltrange(), theGenericPackage.getFloatRange(), null, "dfltrange", null, 0, 1, Vdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVdd_Nominal(), ecorePackage.getEFloat(), "nominal", null, 0, 1, Vdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vppEClass, Vpp.class, "Vpp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVpp_Range(), theGenericPackage.getFloatRange(), null, "range", null, 0, 1, Vpp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVpp_Dflt(), ecorePackage.getEFloat(), "dflt", null, 0, 1, Vpp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DevicePackageImpl

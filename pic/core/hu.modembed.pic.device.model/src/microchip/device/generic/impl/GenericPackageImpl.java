/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.generic.impl;

import microchip.MicrochipPackage;
import microchip.device.DevicePackage;

import microchip.device.config.ConfigPackage;
import microchip.device.config.impl.ConfigPackageImpl;
import microchip.device.generic.FloatRange;
import microchip.device.generic.GenericFactory;
import microchip.device.generic.GenericPackage;
import microchip.device.generic.IntRange;

import microchip.device.impl.DevicePackageImpl;

import microchip.device.memory.MemoryPackage;
import microchip.device.memory.impl.MemoryPackageImpl;
import microchip.impl.MicrochipPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericPackageImpl extends EPackageImpl implements GenericPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatRangeEClass = null;

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
	 * @see microchip.device.generic.GenericPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericPackageImpl() {
		super(eNS_URI, GenericFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericPackage init() {
		if (isInited) return (GenericPackage)EPackage.Registry.INSTANCE.getEPackage(GenericPackage.eNS_URI);

		// Obtain or create and register package
		GenericPackageImpl theGenericPackage = (GenericPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenericPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenericPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MicrochipPackageImpl theMicrochipPackage = (MicrochipPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MicrochipPackage.eNS_URI) instanceof MicrochipPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MicrochipPackage.eNS_URI) : MicrochipPackage.eINSTANCE);
		DevicePackageImpl theDevicePackage = (DevicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI) instanceof DevicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI) : DevicePackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);
		MemoryPackageImpl theMemoryPackage = (MemoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI) instanceof MemoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI) : MemoryPackage.eINSTANCE);

		// Create package meta-data objects
		theGenericPackage.createPackageContents();
		theMicrochipPackage.createPackageContents();
		theDevicePackage.createPackageContents();
		theConfigPackage.createPackageContents();
		theMemoryPackage.createPackageContents();

		// Initialize created meta-data
		theGenericPackage.initializePackageContents();
		theMicrochipPackage.initializePackageContents();
		theDevicePackage.initializePackageContents();
		theConfigPackage.initializePackageContents();
		theMemoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericPackage.eNS_URI, theGenericPackage);
		return theGenericPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntRange() {
		return intRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntRange_Start() {
		return (EAttribute)intRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntRange_End() {
		return (EAttribute)intRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatRange() {
		return floatRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatRange_Start() {
		return (EAttribute)floatRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFloatRange_End() {
		return (EAttribute)floatRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericFactory getGenericFactory() {
		return (GenericFactory)getEFactoryInstance();
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
		intRangeEClass = createEClass(INT_RANGE);
		createEAttribute(intRangeEClass, INT_RANGE__START);
		createEAttribute(intRangeEClass, INT_RANGE__END);

		floatRangeEClass = createEClass(FLOAT_RANGE);
		createEAttribute(floatRangeEClass, FLOAT_RANGE__START);
		createEAttribute(floatRangeEClass, FLOAT_RANGE__END);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(intRangeEClass, IntRange.class, "IntRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntRange_Start(), ecorePackage.getEInt(), "start", null, 0, 1, IntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntRange_End(), ecorePackage.getEInt(), "end", null, 0, 1, IntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatRangeEClass, FloatRange.class, "FloatRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatRange_Start(), ecorePackage.getEFloat(), "start", null, 0, 1, FloatRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFloatRange_End(), ecorePackage.getEFloat(), "end", null, 0, 1, FloatRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //GenericPackageImpl

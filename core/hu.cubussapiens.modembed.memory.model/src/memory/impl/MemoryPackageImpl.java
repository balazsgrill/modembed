/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory.impl;

import memory.GenericRAMSegment;
import memory.MemoryFactory;
import memory.MemoryModel;
import memory.MemoryPackage;
import memory.ProgModel;
import memory.RAMModel;

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
public class MemoryPackageImpl extends EPackageImpl implements MemoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericRAMSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progModelEClass = null;

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
	 * @see memory.MemoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MemoryPackageImpl() {
		super(eNS_URI, MemoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MemoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MemoryPackage init() {
		if (isInited) return (MemoryPackage)EPackage.Registry.INSTANCE.getEPackage(MemoryPackage.eNS_URI);

		// Obtain or create and register package
		MemoryPackageImpl theMemoryPackage = (MemoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MemoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MemoryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMemoryPackage.createPackageContents();

		// Initialize created meta-data
		theMemoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMemoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MemoryPackage.eNS_URI, theMemoryPackage);
		return theMemoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRAMModel() {
		return ramModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRAMModel_Segments() {
		return (EReference)ramModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryModel() {
		return memoryModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryModel_Ram() {
		return (EReference)memoryModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryModel_Prog() {
		return (EReference)memoryModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericRAMSegment() {
		return genericRAMSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericRAMSegment_StartAddr() {
		return (EAttribute)genericRAMSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericRAMSegment_Size() {
		return (EAttribute)genericRAMSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgModel() {
		return progModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgModel_StartAddr() {
		return (EAttribute)progModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgModel_Size() {
		return (EAttribute)progModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgModel_ResetVector() {
		return (EAttribute)progModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryFactory getMemoryFactory() {
		return (MemoryFactory)getEFactoryInstance();
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
		ramModelEClass = createEClass(RAM_MODEL);
		createEReference(ramModelEClass, RAM_MODEL__SEGMENTS);

		memoryModelEClass = createEClass(MEMORY_MODEL);
		createEReference(memoryModelEClass, MEMORY_MODEL__RAM);
		createEReference(memoryModelEClass, MEMORY_MODEL__PROG);

		genericRAMSegmentEClass = createEClass(GENERIC_RAM_SEGMENT);
		createEAttribute(genericRAMSegmentEClass, GENERIC_RAM_SEGMENT__START_ADDR);
		createEAttribute(genericRAMSegmentEClass, GENERIC_RAM_SEGMENT__SIZE);

		progModelEClass = createEClass(PROG_MODEL);
		createEAttribute(progModelEClass, PROG_MODEL__START_ADDR);
		createEAttribute(progModelEClass, PROG_MODEL__SIZE);
		createEAttribute(progModelEClass, PROG_MODEL__RESET_VECTOR);
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
		initEClass(ramModelEClass, RAMModel.class, "RAMModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRAMModel_Segments(), this.getGenericRAMSegment(), null, "segments", null, 0, -1, RAMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryModelEClass, MemoryModel.class, "MemoryModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemoryModel_Ram(), this.getRAMModel(), null, "ram", null, 0, 1, MemoryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryModel_Prog(), this.getProgModel(), null, "prog", null, 0, 1, MemoryModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericRAMSegmentEClass, GenericRAMSegment.class, "GenericRAMSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericRAMSegment_StartAddr(), ecorePackage.getELong(), "startAddr", null, 0, 1, GenericRAMSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericRAMSegment_Size(), ecorePackage.getELong(), "size", null, 0, 1, GenericRAMSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progModelEClass, ProgModel.class, "ProgModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgModel_StartAddr(), ecorePackage.getELong(), "startAddr", null, 0, 1, ProgModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgModel_Size(), ecorePackage.getELong(), "size", null, 0, 1, ProgModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgModel_ResetVector(), ecorePackage.getELong(), "resetVector", null, 0, 1, ProgModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MemoryPackageImpl

/**
 */
package elf.impl;

import elf.ElfFactory;
import elf.ElfPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElfPackageImpl extends EPackageImpl implements ElfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType halfEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType offsetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wordEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signedWordEDataType = null;

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
	 * @see elf.ElfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElfPackageImpl() {
		super(eNS_URI, ElfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElfPackage init() {
		if (isInited) return (ElfPackage)EPackage.Registry.INSTANCE.getEPackage(ElfPackage.eNS_URI);

		// Obtain or create and register package
		ElfPackageImpl theElfPackage = (ElfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ElfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ElfPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theElfPackage.createPackageContents();

		// Initialize created meta-data
		theElfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theElfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElfPackage.eNS_URI, theElfPackage);
		return theElfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getELF() {
		return elfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_Type() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_Machine() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_Version() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_Entry() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_ProgramHeaderOffset() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_SectionHeaderOffset() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_Flags() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_HeaderSize() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_ProgramHeaderEntrySize() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getELF_ProgramHeaderEntryNumber() {
		return (EAttribute)elfEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddress() {
		return addressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHalf() {
		return halfEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOffset() {
		return offsetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWord() {
		return wordEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSignedWord() {
		return signedWordEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElfFactory getElfFactory() {
		return (ElfFactory)getEFactoryInstance();
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
		elfEClass = createEClass(ELF);
		createEAttribute(elfEClass, ELF__TYPE);
		createEAttribute(elfEClass, ELF__MACHINE);
		createEAttribute(elfEClass, ELF__VERSION);
		createEAttribute(elfEClass, ELF__ENTRY);
		createEAttribute(elfEClass, ELF__PROGRAM_HEADER_OFFSET);
		createEAttribute(elfEClass, ELF__SECTION_HEADER_OFFSET);
		createEAttribute(elfEClass, ELF__FLAGS);
		createEAttribute(elfEClass, ELF__HEADER_SIZE);
		createEAttribute(elfEClass, ELF__PROGRAM_HEADER_ENTRY_SIZE);
		createEAttribute(elfEClass, ELF__PROGRAM_HEADER_ENTRY_NUMBER);

		// Create data types
		addressEDataType = createEDataType(ADDRESS);
		halfEDataType = createEDataType(HALF);
		offsetEDataType = createEDataType(OFFSET);
		wordEDataType = createEDataType(WORD);
		signedWordEDataType = createEDataType(SIGNED_WORD);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(elfEClass, elf.ELF.class, "ELF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELF_Type(), this.getHalf(), "type", "0", 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_Machine(), this.getHalf(), "machine", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_Version(), this.getWord(), "version", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_Entry(), this.getAddress(), "entry", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_ProgramHeaderOffset(), this.getOffset(), "programHeaderOffset", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_SectionHeaderOffset(), this.getOffset(), "sectionHeaderOffset", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_Flags(), this.getWord(), "flags", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_HeaderSize(), this.getHalf(), "headerSize", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_ProgramHeaderEntrySize(), this.getHalf(), "programHeaderEntrySize", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getELF_ProgramHeaderEntryNumber(), this.getHalf(), "programHeaderEntryNumber", null, 0, 1, elf.ELF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(addressEDataType, long.class, "Address", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(halfEDataType, Object.class, "Half", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(offsetEDataType, long.class, "Offset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wordEDataType, Object.class, "Word", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signedWordEDataType, Object.class, "SignedWord", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ElfPackageImpl

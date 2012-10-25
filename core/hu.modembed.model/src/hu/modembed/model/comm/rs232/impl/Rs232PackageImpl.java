/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.comm.rs232.impl;

import hu.modembed.model.application.ApplicationPackage;
import hu.modembed.model.application.code.CodePackage;
import hu.modembed.model.application.code.impl.CodePackageImpl;
import hu.modembed.model.application.composition.CompositionPackage;
import hu.modembed.model.application.composition.impl.CompositionPackageImpl;
import hu.modembed.model.application.datatypes.DatatypesPackage;
import hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl;
import hu.modembed.model.application.impl.ApplicationPackageImpl;
import hu.modembed.model.application.interface_.InterfacePackage;
import hu.modembed.model.application.interface_.impl.InterfacePackageImpl;
import hu.modembed.model.comm.CommPackage;

import hu.modembed.model.comm.impl.CommPackageImpl;

import hu.modembed.model.comm.rs232.Field;
import hu.modembed.model.comm.rs232.RS232Frame;
import hu.modembed.model.comm.rs232.RS232Protocol;
import hu.modembed.model.comm.rs232.Rs232Factory;
import hu.modembed.model.comm.rs232.Rs232Package;

import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.assembler.AssemblerPackage;
import hu.modembed.model.core.assembler.impl.AssemblerPackageImpl;
import hu.modembed.model.core.impl.CorePackageImpl;

import hu.modembed.model.emodel.EmodelPackage;
import hu.modembed.model.emodel.expressions.ExpressionsPackage;
import hu.modembed.model.emodel.expressions.impl.ExpressionsPackageImpl;
import hu.modembed.model.emodel.impl.EmodelPackageImpl;
import hu.modembed.model.emodel.types.TypesPackage;
import hu.modembed.model.emodel.types.impl.TypesPackageImpl;
import hu.modembed.model.network.NetworkPackage;

import hu.modembed.model.network.impl.NetworkPackageImpl;

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
public class Rs232PackageImpl extends EPackageImpl implements Rs232Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rs232FrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rs232ProtocolEClass = null;

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
	 * @see hu.modembed.model.comm.rs232.Rs232Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Rs232PackageImpl() {
		super(eNS_URI, Rs232Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Rs232Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Rs232Package init() {
		if (isInited) return (Rs232Package)EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI);

		// Obtain or create and register package
		Rs232PackageImpl theRs232Package = (Rs232PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Rs232PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Rs232PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		AssemblerPackageImpl theAssemblerPackage = (AssemblerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) instanceof AssemblerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AssemblerPackage.eNS_URI) : AssemblerPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		hu.modembed.model.network.rs232.impl.Rs232PackageImpl theRs232Package_1 = (hu.modembed.model.network.rs232.impl.Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.network.rs232.Rs232Package.eNS_URI) instanceof hu.modembed.model.network.rs232.impl.Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.network.rs232.Rs232Package.eNS_URI) : hu.modembed.model.network.rs232.Rs232Package.eINSTANCE);
		CommPackageImpl theCommPackage = (CommPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) instanceof CommPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) : CommPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) : InterfacePackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		CompositionPackageImpl theCompositionPackage = (CompositionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) instanceof CompositionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) : CompositionPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		EmodelPackageImpl theEmodelPackage = (EmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI) instanceof EmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmodelPackage.eNS_URI) : EmodelPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI) : ExpressionsPackage.eINSTANCE);

		// Create package meta-data objects
		theRs232Package.createPackageContents();
		theCorePackage.createPackageContents();
		theAssemblerPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theRs232Package_1.createPackageContents();
		theCommPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theCompositionPackage.createPackageContents();
		theCodePackage.createPackageContents();
		theEmodelPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theRs232Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theAssemblerPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theRs232Package_1.initializePackageContents();
		theCommPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theCompositionPackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theEmodelPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRs232Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Rs232Package.eNS_URI, theRs232Package);
		return theRs232Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRS232Frame() {
		return rs232FrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRS232Frame_NumOfBytes() {
		return (EAttribute)rs232FrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRS232Frame_Fields() {
		return (EReference)rs232FrameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRS232Frame_Id() {
		return (EAttribute)rs232FrameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Start() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Length() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRS232Protocol() {
		return rs232ProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRS232Protocol_IdBitLength() {
		return (EAttribute)rs232ProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rs232Factory getRs232Factory() {
		return (Rs232Factory)getEFactoryInstance();
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
		rs232FrameEClass = createEClass(RS232_FRAME);
		createEAttribute(rs232FrameEClass, RS232_FRAME__NUM_OF_BYTES);
		createEReference(rs232FrameEClass, RS232_FRAME__FIELDS);
		createEAttribute(rs232FrameEClass, RS232_FRAME__ID);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__START);
		createEAttribute(fieldEClass, FIELD__LENGTH);

		rs232ProtocolEClass = createEClass(RS232_PROTOCOL);
		createEAttribute(rs232ProtocolEClass, RS232_PROTOCOL__ID_BIT_LENGTH);
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
		CommPackage theCommPackage = (CommPackage)EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rs232FrameEClass.getESuperTypes().add(theCommPackage.getFrame());
		fieldEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		rs232ProtocolEClass.getESuperTypes().add(theCommPackage.getCommunicationProtocol());

		// Initialize classes and features; add operations and parameters
		initEClass(rs232FrameEClass, RS232Frame.class, "RS232Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRS232Frame_NumOfBytes(), ecorePackage.getEInt(), "numOfBytes", null, 0, 1, RS232Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRS232Frame_Fields(), this.getField(), null, "fields", null, 0, -1, RS232Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRS232Frame_Id(), ecorePackage.getEInt(), "id", null, 0, 1, RS232Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Start(), ecorePackage.getEInt(), "start", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rs232ProtocolEClass, RS232Protocol.class, "RS232Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRS232Protocol_IdBitLength(), ecorePackage.getEInt(), "idBitLength", null, 0, 1, RS232Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Rs232PackageImpl

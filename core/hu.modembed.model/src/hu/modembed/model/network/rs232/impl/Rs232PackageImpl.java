/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.network.rs232.impl;

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
import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.impl.CorePackageImpl;

import hu.modembed.model.network.NetworkPackage;

import hu.modembed.model.network.impl.NetworkPackageImpl;

import hu.modembed.model.network.rs232.RS232Connection;
import hu.modembed.model.network.rs232.RS232Interface;
import hu.modembed.model.network.rs232.Rs232Factory;
import hu.modembed.model.network.rs232.Rs232Package;

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
public class Rs232PackageImpl extends EPackageImpl implements Rs232Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rs232InterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rs232ConnectionEClass = null;

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
	 * @see hu.modembed.model.network.rs232.Rs232Package#eNS_URI
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
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		CommPackageImpl theCommPackage = (CommPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) instanceof CommPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) : CommPackage.eINSTANCE);
		hu.modembed.model.comm.rs232.impl.Rs232PackageImpl theRs232Package_1 = (hu.modembed.model.comm.rs232.impl.Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) instanceof hu.modembed.model.comm.rs232.impl.Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) : hu.modembed.model.comm.rs232.Rs232Package.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI) : InterfacePackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		CompositionPackageImpl theCompositionPackage = (CompositionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) instanceof CompositionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI) : CompositionPackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);

		// Create package meta-data objects
		theRs232Package.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theCommPackage.createPackageContents();
		theRs232Package_1.createPackageContents();
		theApplicationPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theCompositionPackage.createPackageContents();
		theCodePackage.createPackageContents();

		// Initialize created meta-data
		theRs232Package.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theCommPackage.initializePackageContents();
		theRs232Package_1.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theCompositionPackage.initializePackageContents();
		theCodePackage.initializePackageContents();

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
	public EClass getRS232Interface() {
		return rs232InterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRS232Connection() {
		return rs232ConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRS232Connection_BaudRate() {
		return (EAttribute)rs232ConnectionEClass.getEStructuralFeatures().get(0);
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
		rs232InterfaceEClass = createEClass(RS232_INTERFACE);

		rs232ConnectionEClass = createEClass(RS232_CONNECTION);
		createEAttribute(rs232ConnectionEClass, RS232_CONNECTION__BAUD_RATE);
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
		NetworkPackage theNetworkPackage = (NetworkPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rs232InterfaceEClass.getESuperTypes().add(theNetworkPackage.getNetworkInterface());
		rs232ConnectionEClass.getESuperTypes().add(theNetworkPackage.getConnection());

		// Initialize classes and features; add operations and parameters
		initEClass(rs232InterfaceEClass, RS232Interface.class, "RS232Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rs232ConnectionEClass, RS232Connection.class, "RS232Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRS232Connection_BaudRate(), ecorePackage.getEInt(), "baudRate", null, 0, 1, RS232Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Rs232PackageImpl

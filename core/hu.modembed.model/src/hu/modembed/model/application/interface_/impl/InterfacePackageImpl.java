/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.interface_.impl;

import hu.modembed.model.application.ApplicationPackage;

import hu.modembed.model.application.datatypes.DatatypesPackage;

import hu.modembed.model.application.datatypes.impl.DatatypesPackageImpl;

import hu.modembed.model.application.impl.ApplicationPackageImpl;

import hu.modembed.model.application.interface_.Argument;
import hu.modembed.model.application.interface_.ComponentInterface;
import hu.modembed.model.application.interface_.InterfaceFactory;
import hu.modembed.model.application.interface_.InterfacePackage;
import hu.modembed.model.application.interface_.Operation;
import hu.modembed.model.application.interface_.OperationInterface;

import hu.modembed.model.comm.CommPackage;

import hu.modembed.model.comm.impl.CommPackageImpl;

import hu.modembed.model.core.CorePackage;

import hu.modembed.model.core.impl.CorePackageImpl;

import hu.modembed.model.network.NetworkPackage;

import hu.modembed.model.network.impl.NetworkPackageImpl;

import hu.modembed.model.network.rs232.Rs232Package;

import hu.modembed.model.network.rs232.impl.Rs232PackageImpl;

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
public class InterfacePackageImpl extends EPackageImpl implements InterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

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
	 * @see hu.modembed.model.application.interface_.InterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacePackageImpl() {
		super(eNS_URI, InterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacePackage init() {
		if (isInited) return (InterfacePackage)EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);

		// Obtain or create and register package
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InterfacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InterfacePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		Rs232PackageImpl theRs232Package = (Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI) instanceof Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Rs232Package.eNS_URI) : Rs232Package.eINSTANCE);
		CommPackageImpl theCommPackage = (CommPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) instanceof CommPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI) : CommPackage.eINSTANCE);
		hu.modembed.model.comm.rs232.impl.Rs232PackageImpl theRs232Package_1 = (hu.modembed.model.comm.rs232.impl.Rs232PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) instanceof hu.modembed.model.comm.rs232.impl.Rs232PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(hu.modembed.model.comm.rs232.Rs232Package.eNS_URI) : hu.modembed.model.comm.rs232.Rs232Package.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInterfacePackage.createPackageContents();
		theCorePackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theRs232Package.createPackageContents();
		theCommPackage.createPackageContents();
		theRs232Package_1.createPackageContents();
		theApplicationPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theInterfacePackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theRs232Package.initializePackageContents();
		theCommPackage.initializePackageContents();
		theRs232Package_1.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacePackage.eNS_URI, theInterfacePackage);
		return theInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInterface() {
		return componentInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationInterface() {
		return operationInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationInterface_Operations() {
		return (EReference)operationInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Arguments() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceFactory getInterfaceFactory() {
		return (InterfaceFactory)getEFactoryInstance();
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
		componentInterfaceEClass = createEClass(COMPONENT_INTERFACE);

		operationInterfaceEClass = createEClass(OPERATION_INTERFACE);
		createEReference(operationInterfaceEClass, OPERATION_INTERFACE__OPERATIONS);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__ARGUMENTS);

		argumentEClass = createEClass(ARGUMENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInterfaceEClass.getESuperTypes().add(theCorePackage.getPackagedElement());
		operationInterfaceEClass.getESuperTypes().add(this.getComponentInterface());
		operationEClass.getESuperTypes().add(theCorePackage.getNamedElement());
		argumentEClass.getESuperTypes().add(theCorePackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInterfaceEClass, ComponentInterface.class, "ComponentInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationInterfaceEClass, OperationInterface.class, "OperationInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationInterface_Operations(), this.getOperation(), null, "operations", null, 0, -1, OperationInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //InterfacePackageImpl
/**
 */
package application.impl;

import application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFactory init() {
		try {
			ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
			if (theApplicationFactory != null) {
				return theApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE: return createCompositeInterfaceType();
			case ApplicationPackage.CALLABLE_INTERFACE_TYPE: return createCallableInterfaceType();
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION: return createCompositeModuleImplementation();
			case ApplicationPackage.APPLICATION_MODULE: return createApplicationModule();
			case ApplicationPackage.CODE_BASED_IMPLEMENTATION: return createCodeBasedImplementation();
			case ApplicationPackage.DELEGATED_IMPLEMENTATION: return createDelegatedImplementation();
			case ApplicationPackage.INTERFACE_OF_MODULE: return createInterfaceOfModule();
			case ApplicationPackage.MAPPED_IMPLEMENTATION: return createMappedImplementation();
			case ApplicationPackage.APPLICATION_LIBRARY: return createApplicationLibrary();
			case ApplicationPackage.NATIVE_DATA_TYPE: return createNativeDataType();
			case ApplicationPackage.ARGUMENT: return createArgument();
			case ApplicationPackage.COMPOSITE_INTERFACE_PART: return createCompositeInterfacePart();
			case ApplicationPackage.BUFFER_INTERFACE_TYPE: return createBufferInterfaceType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInterfaceType createCompositeInterfaceType() {
		CompositeInterfaceTypeImpl compositeInterfaceType = new CompositeInterfaceTypeImpl();
		return compositeInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableInterfaceType createCallableInterfaceType() {
		CallableInterfaceTypeImpl callableInterfaceType = new CallableInterfaceTypeImpl();
		return callableInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeModuleImplementation createCompositeModuleImplementation() {
		CompositeModuleImplementationImpl compositeModuleImplementation = new CompositeModuleImplementationImpl();
		return compositeModuleImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationModule createApplicationModule() {
		ApplicationModuleImpl applicationModule = new ApplicationModuleImpl();
		return applicationModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBasedImplementation createCodeBasedImplementation() {
		CodeBasedImplementationImpl codeBasedImplementation = new CodeBasedImplementationImpl();
		return codeBasedImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatedImplementation createDelegatedImplementation() {
		DelegatedImplementationImpl delegatedImplementation = new DelegatedImplementationImpl();
		return delegatedImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceOfModule createInterfaceOfModule() {
		InterfaceOfModuleImpl interfaceOfModule = new InterfaceOfModuleImpl();
		return interfaceOfModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedImplementation createMappedImplementation() {
		MappedImplementationImpl mappedImplementation = new MappedImplementationImpl();
		return mappedImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLibrary createApplicationLibrary() {
		ApplicationLibraryImpl applicationLibrary = new ApplicationLibraryImpl();
		return applicationLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NativeDataType createNativeDataType() {
		NativeDataTypeImpl nativeDataType = new NativeDataTypeImpl();
		return nativeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeInterfacePart createCompositeInterfacePart() {
		CompositeInterfacePartImpl compositeInterfacePart = new CompositeInterfacePartImpl();
		return compositeInterfacePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferInterfaceType createBufferInterfaceType() {
		BufferInterfaceTypeImpl bufferInterfaceType = new BufferInterfaceTypeImpl();
		return bufferInterfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPackage getApplicationPackage() {
		return (ApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationPackage getPackage() {
		return ApplicationPackage.eINSTANCE;
	}

} //ApplicationFactoryImpl

/**
 */
package application.util;

import application.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see application.ApplicationPackage
 * @generated
 */
public class ApplicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApplicationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationSwitch<Adapter> modelSwitch =
		new ApplicationSwitch<Adapter>() {
			@Override
			public Adapter caseApplicationInterfaceType(ApplicationInterfaceType object) {
				return createApplicationInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseCompositeInterfaceType(CompositeInterfaceType object) {
				return createCompositeInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseCallableInterfaceType(CallableInterfaceType object) {
				return createCallableInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseApplicationInterface(ApplicationInterface object) {
				return createApplicationInterfaceAdapter();
			}
			@Override
			public Adapter caseCompositeModuleImplementation(CompositeModuleImplementation object) {
				return createCompositeModuleImplementationAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseApplicationModule(ApplicationModule object) {
				return createApplicationModuleAdapter();
			}
			@Override
			public Adapter caseApplicationModuleImplementation(ApplicationModuleImplementation object) {
				return createApplicationModuleImplementationAdapter();
			}
			@Override
			public Adapter caseCodeBasedImplementation(CodeBasedImplementation object) {
				return createCodeBasedImplementationAdapter();
			}
			@Override
			public Adapter caseInterfaceImplementationMapping(InterfaceImplementationMapping object) {
				return createInterfaceImplementationMappingAdapter();
			}
			@Override
			public Adapter caseDelegatedImplementation(DelegatedImplementation object) {
				return createDelegatedImplementationAdapter();
			}
			@Override
			public Adapter caseInterfaceOfModule(InterfaceOfModule object) {
				return createInterfaceOfModuleAdapter();
			}
			@Override
			public Adapter caseMappedImplementation(MappedImplementation object) {
				return createMappedImplementationAdapter();
			}
			@Override
			public Adapter caseApplicationLibrary(ApplicationLibrary object) {
				return createApplicationLibraryAdapter();
			}
			@Override
			public Adapter caseLibraryElement(LibraryElement object) {
				return createLibraryElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseNativeDataType(NativeDataType object) {
				return createNativeDataTypeAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseCompositeInterfacePart(CompositeInterfacePart object) {
				return createCompositeInterfacePartAdapter();
			}
			@Override
			public Adapter caseBufferInterfaceType(BufferInterfaceType object) {
				return createBufferInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseSourceFile(SourceFile object) {
				return createSourceFileAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link application.ApplicationInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ApplicationInterfaceType
	 * @generated
	 */
	public Adapter createApplicationInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.CompositeInterfaceType <em>Composite Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.CompositeInterfaceType
	 * @generated
	 */
	public Adapter createCompositeInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.CallableInterfaceType <em>Callable Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.CallableInterfaceType
	 * @generated
	 */
	public Adapter createCallableInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ApplicationInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ApplicationInterface
	 * @generated
	 */
	public Adapter createApplicationInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.CompositeModuleImplementation <em>Composite Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.CompositeModuleImplementation
	 * @generated
	 */
	public Adapter createCompositeModuleImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ApplicationModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ApplicationModule
	 * @generated
	 */
	public Adapter createApplicationModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ApplicationModuleImplementation <em>Module Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ApplicationModuleImplementation
	 * @generated
	 */
	public Adapter createApplicationModuleImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.CodeBasedImplementation <em>Code Based Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.CodeBasedImplementation
	 * @generated
	 */
	public Adapter createCodeBasedImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.InterfaceImplementationMapping <em>Interface Implementation Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.InterfaceImplementationMapping
	 * @generated
	 */
	public Adapter createInterfaceImplementationMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.DelegatedImplementation <em>Delegated Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.DelegatedImplementation
	 * @generated
	 */
	public Adapter createDelegatedImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.InterfaceOfModule <em>Interface Of Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.InterfaceOfModule
	 * @generated
	 */
	public Adapter createInterfaceOfModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.MappedImplementation <em>Mapped Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.MappedImplementation
	 * @generated
	 */
	public Adapter createMappedImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.ApplicationLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.ApplicationLibrary
	 * @generated
	 */
	public Adapter createApplicationLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.LibraryElement <em>Library Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.LibraryElement
	 * @generated
	 */
	public Adapter createLibraryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.NativeDataType <em>Native Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.NativeDataType
	 * @generated
	 */
	public Adapter createNativeDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.CompositeInterfacePart <em>Composite Interface Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.CompositeInterfacePart
	 * @generated
	 */
	public Adapter createCompositeInterfacePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.BufferInterfaceType <em>Buffer Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.BufferInterfaceType
	 * @generated
	 */
	public Adapter createBufferInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link application.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see application.SourceFile
	 * @generated
	 */
	public Adapter createSourceFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApplicationAdapterFactory

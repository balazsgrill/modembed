/**
 */
package application.util;

import application.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see application.ApplicationPackage
 * @generated
 */
public class ApplicationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationSwitch() {
		if (modelPackage == null) {
			modelPackage = ApplicationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApplicationPackage.APPLICATION_INTERFACE_TYPE: {
				ApplicationInterfaceType applicationInterfaceType = (ApplicationInterfaceType)theEObject;
				T result = caseApplicationInterfaceType(applicationInterfaceType);
				if (result == null) result = caseLibraryElement(applicationInterfaceType);
				if (result == null) result = caseNamedElement(applicationInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.COMPOSITE_INTERFACE_TYPE: {
				CompositeInterfaceType compositeInterfaceType = (CompositeInterfaceType)theEObject;
				T result = caseCompositeInterfaceType(compositeInterfaceType);
				if (result == null) result = caseApplicationInterfaceType(compositeInterfaceType);
				if (result == null) result = caseLibraryElement(compositeInterfaceType);
				if (result == null) result = caseNamedElement(compositeInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.CALLABLE_INTERFACE_TYPE: {
				CallableInterfaceType callableInterfaceType = (CallableInterfaceType)theEObject;
				T result = caseCallableInterfaceType(callableInterfaceType);
				if (result == null) result = caseApplicationInterfaceType(callableInterfaceType);
				if (result == null) result = caseLibraryElement(callableInterfaceType);
				if (result == null) result = caseNamedElement(callableInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.APPLICATION_INTERFACE: {
				ApplicationInterface applicationInterface = (ApplicationInterface)theEObject;
				T result = caseApplicationInterface(applicationInterface);
				if (result == null) result = caseNamedElement(applicationInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.COMPOSITE_MODULE_IMPLEMENTATION: {
				CompositeModuleImplementation compositeModuleImplementation = (CompositeModuleImplementation)theEObject;
				T result = caseCompositeModuleImplementation(compositeModuleImplementation);
				if (result == null) result = caseApplicationModuleImplementation(compositeModuleImplementation);
				if (result == null) result = caseLibraryElement(compositeModuleImplementation);
				if (result == null) result = caseNamedElement(compositeModuleImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.APPLICATION_MODULE: {
				ApplicationModule applicationModule = (ApplicationModule)theEObject;
				T result = caseApplicationModule(applicationModule);
				if (result == null) result = caseNamedElement(applicationModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.APPLICATION_MODULE_IMPLEMENTATION: {
				ApplicationModuleImplementation applicationModuleImplementation = (ApplicationModuleImplementation)theEObject;
				T result = caseApplicationModuleImplementation(applicationModuleImplementation);
				if (result == null) result = caseLibraryElement(applicationModuleImplementation);
				if (result == null) result = caseNamedElement(applicationModuleImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.CODE_BASED_IMPLEMENTATION: {
				CodeBasedImplementation codeBasedImplementation = (CodeBasedImplementation)theEObject;
				T result = caseCodeBasedImplementation(codeBasedImplementation);
				if (result == null) result = caseApplicationModuleImplementation(codeBasedImplementation);
				if (result == null) result = caseLibraryElement(codeBasedImplementation);
				if (result == null) result = caseNamedElement(codeBasedImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.INTERFACE_IMPLEMENTATION_MAPPING: {
				InterfaceImplementationMapping interfaceImplementationMapping = (InterfaceImplementationMapping)theEObject;
				T result = caseInterfaceImplementationMapping(interfaceImplementationMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.DELEGATED_IMPLEMENTATION: {
				DelegatedImplementation delegatedImplementation = (DelegatedImplementation)theEObject;
				T result = caseDelegatedImplementation(delegatedImplementation);
				if (result == null) result = caseInterfaceImplementationMapping(delegatedImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.INTERFACE_OF_MODULE: {
				InterfaceOfModule interfaceOfModule = (InterfaceOfModule)theEObject;
				T result = caseInterfaceOfModule(interfaceOfModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.MAPPED_IMPLEMENTATION: {
				MappedImplementation mappedImplementation = (MappedImplementation)theEObject;
				T result = caseMappedImplementation(mappedImplementation);
				if (result == null) result = caseInterfaceImplementationMapping(mappedImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.APPLICATION_LIBRARY: {
				ApplicationLibrary applicationLibrary = (ApplicationLibrary)theEObject;
				T result = caseApplicationLibrary(applicationLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.LIBRARY_ELEMENT: {
				LibraryElement libraryElement = (LibraryElement)theEObject;
				T result = caseLibraryElement(libraryElement);
				if (result == null) result = caseNamedElement(libraryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseLibraryElement(dataType);
				if (result == null) result = caseNamedElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.NATIVE_DATA_TYPE: {
				NativeDataType nativeDataType = (NativeDataType)theEObject;
				T result = caseNativeDataType(nativeDataType);
				if (result == null) result = caseDataType(nativeDataType);
				if (result == null) result = caseLibraryElement(nativeDataType);
				if (result == null) result = caseNamedElement(nativeDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseNamedElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApplicationPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseData(argument);
				if (result == null) result = caseNamedElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationInterfaceType(ApplicationInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeInterfaceType(CompositeInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableInterfaceType(CallableInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationInterface(ApplicationInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Module Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Module Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeModuleImplementation(CompositeModuleImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationModule(ApplicationModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationModuleImplementation(ApplicationModuleImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Based Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Based Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBasedImplementation(CodeBasedImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Implementation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Implementation Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceImplementationMapping(InterfaceImplementationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegated Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegated Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegatedImplementation(DelegatedImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Of Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Of Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceOfModule(InterfaceOfModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapped Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapped Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappedImplementation(MappedImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLibrary(ApplicationLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryElement(LibraryElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeDataType(NativeDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApplicationSwitch

/**
 */
package hu.modembed.model.emodel.util;

import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.core.NamedElement;
import hu.modembed.model.core.RootElement;

import hu.modembed.model.emodel.*;

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
 * @see hu.modembed.model.emodel.EmodelPackage
 * @generated
 */
public class EmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = EmodelPackage.eINSTANCE;
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
			case EmodelPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseRootElement(library);
				if (result == null) result = caseNamedElement(library);
				if (result == null) result = caseMODembedElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseLibraryElement(type);
				if (result == null) result = caseNamedElement(type);
				if (result == null) result = caseMODembedElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseLibraryElement(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = caseMODembedElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseMODembedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.FUNCTION_PARAMETER: {
				FunctionParameter functionParameter = (FunctionParameter)theEObject;
				T result = caseFunctionParameter(functionParameter);
				if (result == null) result = caseVariable(functionParameter);
				if (result == null) result = caseNamedElement(functionParameter);
				if (result == null) result = caseMODembedElement(functionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.FUNCTION_RESULT: {
				FunctionResult functionResult = (FunctionResult)theEObject;
				T result = caseFunctionResult(functionResult);
				if (result == null) result = caseMODembedElement(functionResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.RESULT_BUFFER: {
				ResultBuffer resultBuffer = (ResultBuffer)theEObject;
				T result = caseResultBuffer(resultBuffer);
				if (result == null) result = caseFunctionResult(resultBuffer);
				if (result == null) result = caseVariable(resultBuffer);
				if (result == null) result = caseNamedElement(resultBuffer);
				if (result == null) result = caseMODembedElement(resultBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.RESULT_EXPRESSION: {
				ResultExpression resultExpression = (ResultExpression)theEObject;
				T result = caseResultExpression(resultExpression);
				if (result == null) result = caseFunctionResult(resultExpression);
				if (result == null) result = caseMODembedElement(resultExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.LIBRARY_ELEMENT: {
				LibraryElement libraryElement = (LibraryElement)theEObject;
				T result = caseLibraryElement(libraryElement);
				if (result == null) result = caseNamedElement(libraryElement);
				if (result == null) result = caseMODembedElement(libraryElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.GLOBAL_VARIABLE: {
				GlobalVariable globalVariable = (GlobalVariable)theEObject;
				T result = caseGlobalVariable(globalVariable);
				if (result == null) result = caseVariable(globalVariable);
				if (result == null) result = caseLibraryElement(globalVariable);
				if (result == null) result = caseNamedElement(globalVariable);
				if (result == null) result = caseMODembedElement(globalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.HEAP_VARIABLE: {
				HeapVariable heapVariable = (HeapVariable)theEObject;
				T result = caseHeapVariable(heapVariable);
				if (result == null) result = caseGlobalVariable(heapVariable);
				if (result == null) result = caseVariable(heapVariable);
				if (result == null) result = caseLibraryElement(heapVariable);
				if (result == null) result = caseNamedElement(heapVariable);
				if (result == null) result = caseMODembedElement(heapVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.REGISTER_VARIABLE: {
				RegisterVariable registerVariable = (RegisterVariable)theEObject;
				T result = caseRegisterVariable(registerVariable);
				if (result == null) result = caseGlobalVariable(registerVariable);
				if (result == null) result = caseVariable(registerVariable);
				if (result == null) result = caseLibraryElement(registerVariable);
				if (result == null) result = caseNamedElement(registerVariable);
				if (result == null) result = caseMODembedElement(registerVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EmodelPackage.CONSTANT_VARIABLE: {
				ConstantVariable constantVariable = (ConstantVariable)theEObject;
				T result = caseConstantVariable(constantVariable);
				if (result == null) result = caseGlobalVariable(constantVariable);
				if (result == null) result = caseVariable(constantVariable);
				if (result == null) result = caseLibraryElement(constantVariable);
				if (result == null) result = caseNamedElement(constantVariable);
				if (result == null) result = caseMODembedElement(constantVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionResult(FunctionResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultBuffer(ResultBuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultExpression(ResultExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVariable(GlobalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heap Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heap Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeapVariable(HeapVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterVariable(RegisterVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantVariable(ConstantVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MO Dembed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MO Dembed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMODembedElement(MODembedElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootElement(RootElement object) {
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

} //EmodelSwitch

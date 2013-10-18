/**
 */
package hu.modembed.model.modembed.abstraction.behavior.util;

import hu.modembed.model.modembed.abstraction.behavior.*;

import hu.modembed.model.modembed.infrastructure.MODembedElement;
import hu.modembed.model.modembed.infrastructure.NamedElement;
import hu.modembed.model.modembed.infrastructure.RootElement;

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
 * @see hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage
 * @generated
 */
public class BehaviorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BehaviorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorSwitch() {
		if (modelPackage == null) {
			modelPackage = BehaviorPackage.eINSTANCE;
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
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_MODULE: {
				SequentialBehaviorModule sequentialBehaviorModule = (SequentialBehaviorModule)theEObject;
				T result = caseSequentialBehaviorModule(sequentialBehaviorModule);
				if (result == null) result = caseRootElement(sequentialBehaviorModule);
				if (result == null) result = caseNamedElement(sequentialBehaviorModule);
				if (result == null) result = caseMODembedElement(sequentialBehaviorModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_MAP: {
				SymbolMap symbolMap = (SymbolMap)theEObject;
				T result = caseSymbolMap(symbolMap);
				if (result == null) result = caseRootElement(symbolMap);
				if (result == null) result = caseNamedElement(symbolMap);
				if (result == null) result = caseMODembedElement(symbolMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_MAPPING_RULES: {
				SymbolMappingRules symbolMappingRules = (SymbolMappingRules)theEObject;
				T result = caseSymbolMappingRules(symbolMappingRules);
				if (result == null) result = caseRootElement(symbolMappingRules);
				if (result == null) result = caseNamedElement(symbolMappingRules);
				if (result == null) result = caseMODembedElement(symbolMappingRules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_MAPPING_RULE: {
				SymbolMappingRule symbolMappingRule = (SymbolMappingRule)theEObject;
				T result = caseSymbolMappingRule(symbolMappingRule);
				if (result == null) result = caseMODembedElement(symbolMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR: {
				SequentialBehavior sequentialBehavior = (SequentialBehavior)theEObject;
				T result = caseSequentialBehavior(sequentialBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.ROOT_SEQUENTIAL_BEHAVIOR: {
				RootSequentialBehavior rootSequentialBehavior = (RootSequentialBehavior)theEObject;
				T result = caseRootSequentialBehavior(rootSequentialBehavior);
				if (result == null) result = caseRootElement(rootSequentialBehavior);
				if (result == null) result = caseSequentialBehavior(rootSequentialBehavior);
				if (result == null) result = caseNamedElement(rootSequentialBehavior);
				if (result == null) result = caseMODembedElement(rootSequentialBehavior);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART: {
				SequentialBehaviorPart sequentialBehaviorPart = (SequentialBehaviorPart)theEObject;
				T result = caseSequentialBehaviorPart(sequentialBehaviorPart);
				if (result == null) result = caseNamedElement(sequentialBehaviorPart);
				if (result == null) result = caseSequentialBehavior(sequentialBehaviorPart);
				if (result == null) result = caseMODembedElement(sequentialBehaviorPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SEQUENTIAL_ACTION: {
				SequentialAction sequentialAction = (SequentialAction)theEObject;
				T result = caseSequentialAction(sequentialAction);
				if (result == null) result = caseMODembedElement(sequentialAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.CODE_SYMBOL_PLACEMENT: {
				CodeSymbolPlacement codeSymbolPlacement = (CodeSymbolPlacement)theEObject;
				T result = caseCodeSymbolPlacement(codeSymbolPlacement);
				if (result == null) result = caseSequentialAction(codeSymbolPlacement);
				if (result == null) result = caseMODembedElement(codeSymbolPlacement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.OPERATION_EXECUTION: {
				OperationExecution operationExecution = (OperationExecution)theEObject;
				T result = caseOperationExecution(operationExecution);
				if (result == null) result = caseSequentialAction(operationExecution);
				if (result == null) result = caseMODembedElement(operationExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_ASSIGNMENT: {
				SymbolAssignment symbolAssignment = (SymbolAssignment)theEObject;
				T result = caseSymbolAssignment(symbolAssignment);
				if (result == null) result = caseMODembedElement(symbolAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_ALLOCATION: {
				SymbolAllocation symbolAllocation = (SymbolAllocation)theEObject;
				T result = caseSymbolAllocation(symbolAllocation);
				if (result == null) result = caseSymbolAssignment(symbolAllocation);
				if (result == null) result = caseMODembedElement(symbolAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_INDIRECTION: {
				SymbolIndirection symbolIndirection = (SymbolIndirection)theEObject;
				T result = caseSymbolIndirection(symbolIndirection);
				if (result == null) result = caseSymbolAssignment(symbolIndirection);
				if (result == null) result = caseMODembedElement(symbolIndirection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_ADDRESS_ASSIGNMENT: {
				SymbolAddressAssignment symbolAddressAssignment = (SymbolAddressAssignment)theEObject;
				T result = caseSymbolAddressAssignment(symbolAddressAssignment);
				if (result == null) result = caseSymbolAssignment(symbolAddressAssignment);
				if (result == null) result = caseMODembedElement(symbolAddressAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BehaviorPackage.SYMBOL_VALUE_ASSIGNMENT: {
				SymbolValueAssignment symbolValueAssignment = (SymbolValueAssignment)theEObject;
				T result = caseSymbolValueAssignment(symbolValueAssignment);
				if (result == null) result = caseSymbolAssignment(symbolValueAssignment);
				if (result == null) result = caseMODembedElement(symbolValueAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Behavior Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Behavior Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialBehaviorModule(SequentialBehaviorModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolMap(SymbolMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Mapping Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Mapping Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolMappingRules(SymbolMappingRules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolMappingRule(SymbolMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialBehavior(SequentialBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Sequential Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Sequential Behavior</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootSequentialBehavior(RootSequentialBehavior object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Behavior Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Behavior Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialBehaviorPart(SequentialBehaviorPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialAction(SequentialAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Symbol Placement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Symbol Placement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeSymbolPlacement(CodeSymbolPlacement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationExecution(OperationExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolAssignment(SymbolAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolAllocation(SymbolAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Indirection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Indirection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolIndirection(SymbolIndirection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Address Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Address Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolAddressAssignment(SymbolAddressAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Value Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Value Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolValueAssignment(SymbolValueAssignment object) {
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

} //BehaviorSwitch

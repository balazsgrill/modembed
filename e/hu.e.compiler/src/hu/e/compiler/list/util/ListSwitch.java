/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.util;

import hu.e.compiler.list.*;

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
 * @see hu.e.compiler.list.ListPackage
 * @generated
 */
public class ListSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ListPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListSwitch() {
		if (modelPackage == null) {
			modelPackage = ListPackage.eINSTANCE;
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
			case ListPackage.PROGRAM_LIST: {
				ProgramList programList = (ProgramList)theEObject;
				T result = caseProgramList(programList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.PROGRAM_STEP: {
				ProgramStep programStep = (ProgramStep)theEObject;
				T result = caseProgramStep(programStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.INSTRUCTION_STEP: {
				InstructionStep instructionStep = (InstructionStep)theEObject;
				T result = caseInstructionStep(instructionStep);
				if (result == null) result = caseProgramStep(instructionStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.SEQUENCE_STEP: {
				SequenceStep sequenceStep = (SequenceStep)theEObject;
				T result = caseSequenceStep(sequenceStep);
				if (result == null) result = caseProgramStep(sequenceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.CHOICE_STEP: {
				ChoiceStep choiceStep = (ChoiceStep)theEObject;
				T result = caseChoiceStep(choiceStep);
				if (result == null) result = caseProgramStep(choiceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.LABEL_STEP: {
				LabelStep labelStep = (LabelStep)theEObject;
				T result = caseLabelStep(labelStep);
				if (result == null) result = caseProgramStep(labelStep);
				if (result == null) result = caseReferableValue(labelStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.STATUS_STEP: {
				StatusStep statusStep = (StatusStep)theEObject;
				T result = caseStatusStep(statusStep);
				if (result == null) result = caseProgramStep(statusStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.REFERABLE_VALUE: {
				ReferableValue referableValue = (ReferableValue)theEObject;
				T result = caseReferableValue(referableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ListPackage.MEMORY_ASSIGNMENT: {
				MemoryAssignment memoryAssignment = (MemoryAssignment)theEObject;
				T result = caseMemoryAssignment(memoryAssignment);
				if (result == null) result = caseReferableValue(memoryAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramList(ProgramList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramStep(ProgramStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionStep(InstructionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceStep(SequenceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceStep(ChoiceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelStep(LabelStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusStep(StatusStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referable Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferableValue(ReferableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryAssignment(MemoryAssignment object) {
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

} //ListSwitch

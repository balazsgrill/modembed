/**
 */
package hu.modembed.model.modembed.core.instructionset.util;

import hu.modembed.model.modembed.core.instructionset.*;

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
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetPackage
 * @generated
 */
public class InstructionsetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InstructionsetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsetSwitch() {
		if (modelPackage == null) {
			modelPackage = InstructionsetPackage.eINSTANCE;
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
			case InstructionsetPackage.INSTRUCTION_SET: {
				InstructionSet instructionSet = (InstructionSet)theEObject;
				T result = caseInstructionSet(instructionSet);
				if (result == null) result = caseRootElement(instructionSet);
				if (result == null) result = caseNamedElement(instructionSet);
				if (result == null) result = caseMODembedElement(instructionSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = caseNamedElement(instruction);
				if (result == null) result = caseMODembedElement(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.INSTRUCTION_PARAMETER: {
				InstructionParameter instructionParameter = (InstructionParameter)theEObject;
				T result = caseInstructionParameter(instructionParameter);
				if (result == null) result = caseNamedElement(instructionParameter);
				if (result == null) result = caseMODembedElement(instructionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.INSTRUCTION_SECTION: {
				InstructionSection instructionSection = (InstructionSection)theEObject;
				T result = caseInstructionSection(instructionSection);
				if (result == null) result = caseMODembedElement(instructionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.CONSTANT_SECTION: {
				ConstantSection constantSection = (ConstantSection)theEObject;
				T result = caseConstantSection(constantSection);
				if (result == null) result = caseInstructionSection(constantSection);
				if (result == null) result = caseMODembedElement(constantSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.PARAMETER_SECTION: {
				ParameterSection parameterSection = (ParameterSection)theEObject;
				T result = caseParameterSection(parameterSection);
				if (result == null) result = caseInstructionSection(parameterSection);
				if (result == null) result = caseMODembedElement(parameterSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.INSTRUCTION_WORD: {
				InstructionWord instructionWord = (InstructionWord)theEObject;
				T result = caseInstructionWord(instructionWord);
				if (result == null) result = caseMODembedElement(instructionWord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.INSTRUCTION_WORD_CONDITION: {
				InstructionWordCondition instructionWordCondition = (InstructionWordCondition)theEObject;
				T result = caseInstructionWordCondition(instructionWordCondition);
				if (result == null) result = caseMODembedElement(instructionWordCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InstructionsetPackage.INSTRUCTION_WORD_MASKED_VALUE_CONDITION: {
				InstructionWordMaskedValueCondition instructionWordMaskedValueCondition = (InstructionWordMaskedValueCondition)theEObject;
				T result = caseInstructionWordMaskedValueCondition(instructionWordMaskedValueCondition);
				if (result == null) result = caseInstructionWordCondition(instructionWordMaskedValueCondition);
				if (result == null) result = caseMODembedElement(instructionWordMaskedValueCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionSet(InstructionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionParameter(InstructionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionSection(InstructionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantSection(ConstantSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSection(ParameterSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Word</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Word</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionWord(InstructionWord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Word Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Word Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionWordCondition(InstructionWordCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Word Masked Value Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Word Masked Value Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionWordMaskedValueCondition(InstructionWordMaskedValueCondition object) {
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

} //InstructionsetSwitch

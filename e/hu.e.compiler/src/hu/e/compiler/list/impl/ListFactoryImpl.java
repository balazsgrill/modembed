/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.impl;

import hu.e.compiler.list.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ListFactoryImpl extends EFactoryImpl implements ListFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListFactory init() {
		try {
			ListFactory theListFactory = (ListFactory)EPackage.Registry.INSTANCE.getEFactory("http://e.hu/compiler/list"); 
			if (theListFactory != null) {
				return theListFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ListFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFactoryImpl() {
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
			case ListPackage.PROGRAM_LIST: return createProgramList();
			case ListPackage.INSTRUCTION_STEP: return createInstructionStep();
			case ListPackage.SEQUENCE_STEP: return createSequenceStep();
			case ListPackage.CHOICE_STEP: return createChoiceStep();
			case ListPackage.LABEL_STEP: return createLabelStep();
			case ListPackage.REFERENCE: return createReference();
			case ListPackage.STATUS_STEP: return createStatusStep();
			case ListPackage.MEMORY_ASSIGNMENT: return createMemoryAssignment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ListPackage.SEVERITY:
				return createSeverityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ListPackage.SEVERITY:
				return convertSeverityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramList createProgramList() {
		ProgramListImpl programList = new ProgramListImpl();
		return programList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionStep createInstructionStep() {
		InstructionStepImpl instructionStep = new InstructionStepImpl();
		return instructionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceStep createSequenceStep() {
		SequenceStepImpl sequenceStep = new SequenceStepImpl();
		return sequenceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceStep createChoiceStep() {
		ChoiceStepImpl choiceStep = new ChoiceStepImpl();
		return choiceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStep createLabelStep() {
		LabelStepImpl labelStep = new LabelStepImpl();
		return labelStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusStep createStatusStep() {
		StatusStepImpl statusStep = new StatusStepImpl();
		return statusStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAssignment createMemoryAssignment() {
		MemoryAssignmentImpl memoryAssignment = new MemoryAssignmentImpl();
		return memoryAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListPackage getListPackage() {
		return (ListPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ListPackage getPackage() {
		return ListPackage.eINSTANCE;
	}

} //ListFactoryImpl

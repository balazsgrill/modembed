/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.e.compiler.list.ListFactory
 * @model kind="package"
 * @generated
 */
public interface ListPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "list";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://e.hu/compiler/list";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ListPackage eINSTANCE = hu.e.compiler.list.impl.ListPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.ProgramListImpl <em>Program List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.ProgramListImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getProgramList()
	 * @generated
	 */
	int PROGRAM_LIST = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LIST__STEP = 1;

	/**
	 * The number of structural features of the '<em>Program List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.ProgramStepImpl <em>Program Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.ProgramStepImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getProgramStep()
	 * @generated
	 */
	int PROGRAM_STEP = 1;

	/**
	 * The number of structural features of the '<em>Program Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_STEP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.InstructionStepImpl <em>Instruction Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.InstructionStepImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getInstructionStep()
	 * @generated
	 */
	int INSTRUCTION_STEP = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STEP__CODE = PROGRAM_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STEP__REFS = PROGRAM_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STEP__WIDTH = PROGRAM_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_STEP_FEATURE_COUNT = PROGRAM_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.SequenceStepImpl <em>Sequence Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.SequenceStepImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getSequenceStep()
	 * @generated
	 */
	int SEQUENCE_STEP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STEP__NAME = PROGRAM_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STEP__STEPS = PROGRAM_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STEP__VARIABLES = PROGRAM_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sequence Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_STEP_FEATURE_COUNT = PROGRAM_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.ChoiceStepImpl <em>Choice Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.ChoiceStepImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getChoiceStep()
	 * @generated
	 */
	int CHOICE_STEP = 4;

	/**
	 * The number of structural features of the '<em>Choice Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_STEP_FEATURE_COUNT = PROGRAM_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.LabelStepImpl <em>Label Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.LabelStepImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getLabelStep()
	 * @generated
	 */
	int LABEL_STEP = 5;

	/**
	 * The number of structural features of the '<em>Label Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STEP_FEATURE_COUNT = PROGRAM_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.ReferenceImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SHIFT = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__START = 3;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.StatusStepImpl <em>Status Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.StatusStepImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getStatusStep()
	 * @generated
	 */
	int STATUS_STEP = 7;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_STEP__SEVERITY = PROGRAM_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_STEP__MESSAGE = PROGRAM_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Status Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_STEP_FEATURE_COUNT = PROGRAM_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.ReferableValueImpl <em>Referable Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.ReferableValueImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getReferableValue()
	 * @generated
	 */
	int REFERABLE_VALUE = 8;

	/**
	 * The number of structural features of the '<em>Referable Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.impl.MemoryAssignmentImpl <em>Memory Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.impl.MemoryAssignmentImpl
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getMemoryAssignment()
	 * @generated
	 */
	int MEMORY_ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ASSIGNMENT__SIZE = REFERABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_ASSIGNMENT_FEATURE_COUNT = REFERABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.e.compiler.list.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.e.compiler.list.Severity
	 * @see hu.e.compiler.list.impl.ListPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 10;


	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.ProgramList <em>Program List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program List</em>'.
	 * @see hu.e.compiler.list.ProgramList
	 * @generated
	 */
	EClass getProgramList();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.ProgramList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.e.compiler.list.ProgramList#getName()
	 * @see #getProgramList()
	 * @generated
	 */
	EAttribute getProgramList_Name();

	/**
	 * Returns the meta object for the containment reference '{@link hu.e.compiler.list.ProgramList#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see hu.e.compiler.list.ProgramList#getStep()
	 * @see #getProgramList()
	 * @generated
	 */
	EReference getProgramList_Step();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.ProgramStep <em>Program Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Step</em>'.
	 * @see hu.e.compiler.list.ProgramStep
	 * @generated
	 */
	EClass getProgramStep();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.InstructionStep <em>Instruction Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Step</em>'.
	 * @see hu.e.compiler.list.InstructionStep
	 * @generated
	 */
	EClass getInstructionStep();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.InstructionStep#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see hu.e.compiler.list.InstructionStep#getCode()
	 * @see #getInstructionStep()
	 * @generated
	 */
	EAttribute getInstructionStep_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.e.compiler.list.InstructionStep#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refs</em>'.
	 * @see hu.e.compiler.list.InstructionStep#getRefs()
	 * @see #getInstructionStep()
	 * @generated
	 */
	EReference getInstructionStep_Refs();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.InstructionStep#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see hu.e.compiler.list.InstructionStep#getWidth()
	 * @see #getInstructionStep()
	 * @generated
	 */
	EAttribute getInstructionStep_Width();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.SequenceStep <em>Sequence Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Step</em>'.
	 * @see hu.e.compiler.list.SequenceStep
	 * @generated
	 */
	EClass getSequenceStep();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.SequenceStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.e.compiler.list.SequenceStep#getName()
	 * @see #getSequenceStep()
	 * @generated
	 */
	EAttribute getSequenceStep_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.e.compiler.list.SequenceStep#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see hu.e.compiler.list.SequenceStep#getSteps()
	 * @see #getSequenceStep()
	 * @generated
	 */
	EReference getSequenceStep_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.e.compiler.list.SequenceStep#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hu.e.compiler.list.SequenceStep#getVariables()
	 * @see #getSequenceStep()
	 * @generated
	 */
	EReference getSequenceStep_Variables();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.ChoiceStep <em>Choice Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Step</em>'.
	 * @see hu.e.compiler.list.ChoiceStep
	 * @generated
	 */
	EClass getChoiceStep();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.LabelStep <em>Label Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Step</em>'.
	 * @see hu.e.compiler.list.LabelStep
	 * @generated
	 */
	EClass getLabelStep();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see hu.e.compiler.list.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.Reference#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift</em>'.
	 * @see hu.e.compiler.list.Reference#getShift()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Shift();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.Reference#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.e.compiler.list.Reference#getSize()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Size();

	/**
	 * Returns the meta object for the reference '{@link hu.e.compiler.list.Reference#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.e.compiler.list.Reference#getValue()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.Reference#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hu.e.compiler.list.Reference#getStart()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Start();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.StatusStep <em>Status Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Step</em>'.
	 * @see hu.e.compiler.list.StatusStep
	 * @generated
	 */
	EClass getStatusStep();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.StatusStep#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see hu.e.compiler.list.StatusStep#getSeverity()
	 * @see #getStatusStep()
	 * @generated
	 */
	EAttribute getStatusStep_Severity();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.StatusStep#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see hu.e.compiler.list.StatusStep#getMessage()
	 * @see #getStatusStep()
	 * @generated
	 */
	EAttribute getStatusStep_Message();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.ReferableValue <em>Referable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable Value</em>'.
	 * @see hu.e.compiler.list.ReferableValue
	 * @generated
	 */
	EClass getReferableValue();

	/**
	 * Returns the meta object for class '{@link hu.e.compiler.list.MemoryAssignment <em>Memory Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Assignment</em>'.
	 * @see hu.e.compiler.list.MemoryAssignment
	 * @generated
	 */
	EClass getMemoryAssignment();

	/**
	 * Returns the meta object for the attribute '{@link hu.e.compiler.list.MemoryAssignment#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.e.compiler.list.MemoryAssignment#getSize()
	 * @see #getMemoryAssignment()
	 * @generated
	 */
	EAttribute getMemoryAssignment_Size();

	/**
	 * Returns the meta object for enum '{@link hu.e.compiler.list.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see hu.e.compiler.list.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ListFactory getListFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.ProgramListImpl <em>Program List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.ProgramListImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getProgramList()
		 * @generated
		 */
		EClass PROGRAM_LIST = eINSTANCE.getProgramList();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_LIST__NAME = eINSTANCE.getProgramList_Name();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_LIST__STEP = eINSTANCE.getProgramList_Step();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.ProgramStepImpl <em>Program Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.ProgramStepImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getProgramStep()
		 * @generated
		 */
		EClass PROGRAM_STEP = eINSTANCE.getProgramStep();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.InstructionStepImpl <em>Instruction Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.InstructionStepImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getInstructionStep()
		 * @generated
		 */
		EClass INSTRUCTION_STEP = eINSTANCE.getInstructionStep();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_STEP__CODE = eINSTANCE.getInstructionStep_Code();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_STEP__REFS = eINSTANCE.getInstructionStep_Refs();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_STEP__WIDTH = eINSTANCE.getInstructionStep_Width();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.SequenceStepImpl <em>Sequence Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.SequenceStepImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getSequenceStep()
		 * @generated
		 */
		EClass SEQUENCE_STEP = eINSTANCE.getSequenceStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_STEP__NAME = eINSTANCE.getSequenceStep_Name();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STEP__STEPS = eINSTANCE.getSequenceStep_Steps();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_STEP__VARIABLES = eINSTANCE.getSequenceStep_Variables();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.ChoiceStepImpl <em>Choice Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.ChoiceStepImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getChoiceStep()
		 * @generated
		 */
		EClass CHOICE_STEP = eINSTANCE.getChoiceStep();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.LabelStepImpl <em>Label Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.LabelStepImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getLabelStep()
		 * @generated
		 */
		EClass LABEL_STEP = eINSTANCE.getLabelStep();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.ReferenceImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__SHIFT = eINSTANCE.getReference_Shift();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__SIZE = eINSTANCE.getReference_Size();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__VALUE = eINSTANCE.getReference_Value();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__START = eINSTANCE.getReference_Start();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.StatusStepImpl <em>Status Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.StatusStepImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getStatusStep()
		 * @generated
		 */
		EClass STATUS_STEP = eINSTANCE.getStatusStep();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_STEP__SEVERITY = eINSTANCE.getStatusStep_Severity();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_STEP__MESSAGE = eINSTANCE.getStatusStep_Message();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.ReferableValueImpl <em>Referable Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.ReferableValueImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getReferableValue()
		 * @generated
		 */
		EClass REFERABLE_VALUE = eINSTANCE.getReferableValue();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.impl.MemoryAssignmentImpl <em>Memory Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.impl.MemoryAssignmentImpl
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getMemoryAssignment()
		 * @generated
		 */
		EClass MEMORY_ASSIGNMENT = eINSTANCE.getMemoryAssignment();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_ASSIGNMENT__SIZE = eINSTANCE.getMemoryAssignment_Size();

		/**
		 * The meta object literal for the '{@link hu.e.compiler.list.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.e.compiler.list.Severity
		 * @see hu.e.compiler.list.impl.ListPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //ListPackage

/**
 */
package hu.modembed.assembler.instructionset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.modembed.assembler.instructionset.InstructionsetFactory
 * @model kind="package"
 * @generated
 */
public interface InstructionsetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instructionset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/assembler/instructionset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instructionset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstructionsetPackage eINSTANCE = hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.InstructionSetImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionSet()
	 * @generated
	 */
	int INSTRUCTION_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__INSTRUCTIONS = 2;

	/**
	 * The number of structural features of the '<em>Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.InstructionImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__WORDS = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.InstructionParameterImpl <em>Instruction Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.InstructionParameterImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionParameter()
	 * @generated
	 */
	int INSTRUCTION_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER__DEFAULT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Instruction Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instruction Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.InstructionWordImpl <em>Instruction Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.InstructionWordImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionWord()
	 * @generated
	 */
	int INSTRUCTION_WORD = 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD__SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Instruction Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instruction Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.InstructionSectionImpl <em>Instruction Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.InstructionSectionImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionSection()
	 * @generated
	 */
	int INSTRUCTION_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__SHIFT = 1;

	/**
	 * The number of structural features of the '<em>Instruction Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instruction Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.ParameterSectionImpl <em>Parameter Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.ParameterSectionImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getParameterSection()
	 * @generated
	 */
	int PARAMETER_SECTION = 5;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION__SIZE = INSTRUCTION_SECTION__SIZE;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION__SHIFT = INSTRUCTION_SECTION__SHIFT;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION__PARAMETER = INSTRUCTION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION_FEATURE_COUNT = INSTRUCTION_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION_OPERATION_COUNT = INSTRUCTION_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.assembler.instructionset.impl.ConstantSectionImpl <em>Constant Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.assembler.instructionset.impl.ConstantSectionImpl
	 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getConstantSection()
	 * @generated
	 */
	int CONSTANT_SECTION = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION__SIZE = INSTRUCTION_SECTION__SIZE;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION__SHIFT = INSTRUCTION_SECTION__SHIFT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION__VALUE = INSTRUCTION_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION_FEATURE_COUNT = INSTRUCTION_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION_OPERATION_COUNT = INSTRUCTION_SECTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.InstructionSet <em>Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Set</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSet
	 * @generated
	 */
	EClass getInstructionSet();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.InstructionSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSet#getName()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EAttribute getInstructionSet_Name();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.assembler.instructionset.InstructionSet#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSet#getExtends()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EReference getInstructionSet_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.assembler.instructionset.InstructionSet#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSet#getInstructions()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EReference getInstructionSet_Instructions();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see hu.modembed.assembler.instructionset.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.assembler.instructionset.Instruction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.modembed.assembler.instructionset.Instruction#getParameters()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.Instruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.modembed.assembler.instructionset.Instruction#getName()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.assembler.instructionset.Instruction#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see hu.modembed.assembler.instructionset.Instruction#getWords()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Words();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.InstructionParameter <em>Instruction Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Parameter</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionParameter
	 * @generated
	 */
	EClass getInstructionParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionParameter#getDefaultValue()
	 * @see #getInstructionParameter()
	 * @generated
	 */
	EAttribute getInstructionParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.InstructionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionParameter#getName()
	 * @see #getInstructionParameter()
	 * @generated
	 */
	EAttribute getInstructionParameter_Name();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.InstructionWord <em>Instruction Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Word</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionWord
	 * @generated
	 */
	EClass getInstructionWord();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.assembler.instructionset.InstructionWord#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionWord#getSections()
	 * @see #getInstructionWord()
	 * @generated
	 */
	EReference getInstructionWord_Sections();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.InstructionSection <em>Instruction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Section</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSection
	 * @generated
	 */
	EClass getInstructionSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.InstructionSection#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSection#getSize()
	 * @see #getInstructionSection()
	 * @generated
	 */
	EAttribute getInstructionSection_Size();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.InstructionSection#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift</em>'.
	 * @see hu.modembed.assembler.instructionset.InstructionSection#getShift()
	 * @see #getInstructionSection()
	 * @generated
	 */
	EAttribute getInstructionSection_Shift();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.ParameterSection <em>Parameter Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Section</em>'.
	 * @see hu.modembed.assembler.instructionset.ParameterSection
	 * @generated
	 */
	EClass getParameterSection();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.assembler.instructionset.ParameterSection#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see hu.modembed.assembler.instructionset.ParameterSection#getParameter()
	 * @see #getParameterSection()
	 * @generated
	 */
	EReference getParameterSection_Parameter();

	/**
	 * Returns the meta object for class '{@link hu.modembed.assembler.instructionset.ConstantSection <em>Constant Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Section</em>'.
	 * @see hu.modembed.assembler.instructionset.ConstantSection
	 * @generated
	 */
	EClass getConstantSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.assembler.instructionset.ConstantSection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.assembler.instructionset.ConstantSection#getValue()
	 * @see #getConstantSection()
	 * @generated
	 */
	EAttribute getConstantSection_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstructionsetFactory getInstructionsetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.InstructionSetImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionSet()
		 * @generated
		 */
		EClass INSTRUCTION_SET = eINSTANCE.getInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_SET__NAME = eINSTANCE.getInstructionSet_Name();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_SET__EXTENDS = eINSTANCE.getInstructionSet_Extends();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_SET__INSTRUCTIONS = eINSTANCE.getInstructionSet_Instructions();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.InstructionImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PARAMETERS = eINSTANCE.getInstruction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NAME = eINSTANCE.getInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__WORDS = eINSTANCE.getInstruction_Words();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.InstructionParameterImpl <em>Instruction Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.InstructionParameterImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionParameter()
		 * @generated
		 */
		EClass INSTRUCTION_PARAMETER = eINSTANCE.getInstructionParameter();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER__DEFAULT_VALUE = eINSTANCE.getInstructionParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER__NAME = eINSTANCE.getInstructionParameter_Name();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.InstructionWordImpl <em>Instruction Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.InstructionWordImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionWord()
		 * @generated
		 */
		EClass INSTRUCTION_WORD = eINSTANCE.getInstructionWord();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_WORD__SECTIONS = eINSTANCE.getInstructionWord_Sections();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.InstructionSectionImpl <em>Instruction Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.InstructionSectionImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getInstructionSection()
		 * @generated
		 */
		EClass INSTRUCTION_SECTION = eINSTANCE.getInstructionSection();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_SECTION__SIZE = eINSTANCE.getInstructionSection_Size();

		/**
		 * The meta object literal for the '<em><b>Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_SECTION__SHIFT = eINSTANCE.getInstructionSection_Shift();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.ParameterSectionImpl <em>Parameter Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.ParameterSectionImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getParameterSection()
		 * @generated
		 */
		EClass PARAMETER_SECTION = eINSTANCE.getParameterSection();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SECTION__PARAMETER = eINSTANCE.getParameterSection_Parameter();

		/**
		 * The meta object literal for the '{@link hu.modembed.assembler.instructionset.impl.ConstantSectionImpl <em>Constant Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.assembler.instructionset.impl.ConstantSectionImpl
		 * @see hu.modembed.assembler.instructionset.impl.InstructionsetPackageImpl#getConstantSection()
		 * @generated
		 */
		EClass CONSTANT_SECTION = eINSTANCE.getConstantSection();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_SECTION__VALUE = eINSTANCE.getConstantSection_Value();

	}

} //InstructionsetPackage

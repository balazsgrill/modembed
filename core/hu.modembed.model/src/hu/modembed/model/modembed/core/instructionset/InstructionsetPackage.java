/**
 */
package hu.modembed.model.modembed.core.instructionset;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.core.instructionset.InstructionsetFactory
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
	String eNS_URI = "http://modembed.hu/core/instructionset";

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
	InstructionsetPackage eINSTANCE = hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionSetImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionSet()
	 * @generated
	 */
	int INSTRUCTION_SET = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__INSTRUCTIONS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET__EXTEND = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SET_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PARAMETERS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__WORDS = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionParameterImpl <em>Instruction Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionParameterImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionParameter()
	 * @generated
	 */
	int INSTRUCTION_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER__ID = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER__DEFAULT_VALUE = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl <em>Instruction Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionSection()
	 * @generated
	 */
	int INSTRUCTION_SECTION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__START = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__SIZE = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION__SHIFT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_SECTION_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.ConstantSectionImpl <em>Constant Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.ConstantSectionImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getConstantSection()
	 * @generated
	 */
	int CONSTANT_SECTION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION__DESCRIPTION = INSTRUCTION_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION__ORIGINS = INSTRUCTION_SECTION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_SECTION__START = INSTRUCTION_SECTION__START;

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
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.ParameterSectionImpl <em>Parameter Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.ParameterSectionImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getParameterSection()
	 * @generated
	 */
	int PARAMETER_SECTION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION__DESCRIPTION = INSTRUCTION_SECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION__ORIGINS = INSTRUCTION_SECTION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SECTION__START = INSTRUCTION_SECTION__START;

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
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionWordImpl <em>Instruction Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionWordImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionWord()
	 * @generated
	 */
	int INSTRUCTION_WORD = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD__SECTIONS = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD__CONDITION = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionWordConditionImpl <em>Instruction Word Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionWordConditionImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionWordCondition()
	 * @generated
	 */
	int INSTRUCTION_WORD_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_CONDITION__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_CONDITION__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The number of structural features of the '<em>Instruction Word Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_CONDITION_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionWordMaskedValueConditionImpl <em>Instruction Word Masked Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionWordMaskedValueConditionImpl
	 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionWordMaskedValueCondition()
	 * @generated
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION__DESCRIPTION = INSTRUCTION_WORD_CONDITION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ORIGINS = INSTRUCTION_WORD_CONDITION__ORIGINS;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK = INSTRUCTION_WORD_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE = INSTRUCTION_WORD_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT = INSTRUCTION_WORD_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instruction Word Masked Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_WORD_MASKED_VALUE_CONDITION_FEATURE_COUNT = INSTRUCTION_WORD_CONDITION_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.InstructionSet <em>Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Set</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSet
	 * @generated
	 */
	EClass getInstructionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.instructionset.InstructionSet#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSet#getInstructions()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EReference getInstructionSet_Instructions();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.core.instructionset.InstructionSet#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extend</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSet#getExtend()
	 * @see #getInstructionSet()
	 * @generated
	 */
	EReference getInstructionSet_Extend();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.instructionset.Instruction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.Instruction#getParameters()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.instructionset.Instruction#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.Instruction#getWords()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Words();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter <em>Instruction Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Parameter</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionParameter
	 * @generated
	 */
	EClass getInstructionParameter();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionParameter#getId()
	 * @see #getInstructionParameter()
	 * @generated
	 */
	EAttribute getInstructionParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionParameter#getDefaultValue()
	 * @see #getInstructionParameter()
	 * @generated
	 */
	EAttribute getInstructionParameter_DefaultValue();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.InstructionSection <em>Instruction Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Section</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSection
	 * @generated
	 */
	EClass getInstructionSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSection#getStart()
	 * @see #getInstructionSection()
	 * @generated
	 */
	EAttribute getInstructionSection_Start();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSection#getSize()
	 * @see #getInstructionSection()
	 * @generated
	 */
	EAttribute getInstructionSection_Size();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionSection#getShift <em>Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shift</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionSection#getShift()
	 * @see #getInstructionSection()
	 * @generated
	 */
	EAttribute getInstructionSection_Shift();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.ConstantSection <em>Constant Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Section</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.ConstantSection
	 * @generated
	 */
	EClass getConstantSection();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.ConstantSection#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.ConstantSection#getValue()
	 * @see #getConstantSection()
	 * @generated
	 */
	EAttribute getConstantSection_Value();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.ParameterSection <em>Parameter Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Section</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.ParameterSection
	 * @generated
	 */
	EClass getParameterSection();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.core.instructionset.ParameterSection#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.ParameterSection#getParameter()
	 * @see #getParameterSection()
	 * @generated
	 */
	EReference getParameterSection_Parameter();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.InstructionWord <em>Instruction Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Word</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWord
	 * @generated
	 */
	EClass getInstructionWord();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.instructionset.InstructionWord#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWord#getSections()
	 * @see #getInstructionWord()
	 * @generated
	 */
	EReference getInstructionWord_Sections();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.core.instructionset.InstructionWord#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWord#getCondition()
	 * @see #getInstructionWord()
	 * @generated
	 */
	EReference getInstructionWord_Condition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.InstructionWordCondition <em>Instruction Word Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Word Condition</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWordCondition
	 * @generated
	 */
	EClass getInstructionWordCondition();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition <em>Instruction Word Masked Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Word Masked Value Condition</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition
	 * @generated
	 */
	EClass getInstructionWordMaskedValueCondition();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition#getMask()
	 * @see #getInstructionWordMaskedValueCondition()
	 * @generated
	 */
	EAttribute getInstructionWordMaskedValueCondition_Mask();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition#getValue()
	 * @see #getInstructionWordMaskedValueCondition()
	 * @generated
	 */
	EAttribute getInstructionWordMaskedValueCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see hu.modembed.model.modembed.core.instructionset.InstructionWordMaskedValueCondition#getArgument()
	 * @see #getInstructionWordMaskedValueCondition()
	 * @generated
	 */
	EReference getInstructionWordMaskedValueCondition_Argument();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSetImpl <em>Instruction Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionSetImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionSet()
		 * @generated
		 */
		EClass INSTRUCTION_SET = eINSTANCE.getInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_SET__INSTRUCTIONS = eINSTANCE.getInstructionSet_Instructions();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_SET__EXTEND = eINSTANCE.getInstructionSet_Extend();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstruction()
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
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__WORDS = eINSTANCE.getInstruction_Words();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionParameterImpl <em>Instruction Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionParameterImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionParameter()
		 * @generated
		 */
		EClass INSTRUCTION_PARAMETER = eINSTANCE.getInstructionParameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER__ID = eINSTANCE.getInstructionParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER__DEFAULT_VALUE = eINSTANCE.getInstructionParameter_DefaultValue();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl <em>Instruction Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionSectionImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionSection()
		 * @generated
		 */
		EClass INSTRUCTION_SECTION = eINSTANCE.getInstructionSection();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_SECTION__START = eINSTANCE.getInstructionSection_Start();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.ConstantSectionImpl <em>Constant Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.ConstantSectionImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getConstantSection()
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

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.ParameterSectionImpl <em>Parameter Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.ParameterSectionImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getParameterSection()
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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionWordImpl <em>Instruction Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionWordImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionWord()
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
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_WORD__CONDITION = eINSTANCE.getInstructionWord_Condition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionWordConditionImpl <em>Instruction Word Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionWordConditionImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionWordCondition()
		 * @generated
		 */
		EClass INSTRUCTION_WORD_CONDITION = eINSTANCE.getInstructionWordCondition();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.core.instructionset.impl.InstructionWordMaskedValueConditionImpl <em>Instruction Word Masked Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionWordMaskedValueConditionImpl
		 * @see hu.modembed.model.modembed.core.instructionset.impl.InstructionsetPackageImpl#getInstructionWordMaskedValueCondition()
		 * @generated
		 */
		EClass INSTRUCTION_WORD_MASKED_VALUE_CONDITION = eINSTANCE.getInstructionWordMaskedValueCondition();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_WORD_MASKED_VALUE_CONDITION__MASK = eINSTANCE.getInstructionWordMaskedValueCondition_Mask();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_WORD_MASKED_VALUE_CONDITION__VALUE = eINSTANCE.getInstructionWordMaskedValueCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_WORD_MASKED_VALUE_CONDITION__ARGUMENT = eINSTANCE.getInstructionWordMaskedValueCondition_Argument();

	}

} //InstructionsetPackage

/**
 */
package hu.modembed.model.modembed.abstraction.behavior.platform;

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
 * @see hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory
 * @model kind="package"
 * @generated
 */
public interface PlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "platform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/abstraction/behavior/platform";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlatformPackage eINSTANCE = hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationDefinitionImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationDefinition()
	 * @generated
	 */
	int OPERATION_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__ANNOTATIONS = InfrastructurePackage.MO_DEMBED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__ARGUMENTS = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__STEPS = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION__OPERATION = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DEFINITION_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl <em>Operation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationArgument()
	 * @generated
	 */
	int OPERATION_ARGUMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT__ANNOTATIONS = InfrastructurePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT__TYPE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mem Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT__MEM_TYPE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ARGUMENT_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationStepImpl <em>Operation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationStepImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationStep()
	 * @generated
	 */
	int OPERATION_STEP = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STEP__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STEP__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STEP__ANNOTATIONS = InfrastructurePackage.MO_DEMBED_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Operation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STEP_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionCallOperationStepImpl <em>Instruction Call Operation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionCallOperationStepImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionCallOperationStep()
	 * @generated
	 */
	int INSTRUCTION_CALL_OPERATION_STEP = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_STEP__DESCRIPTION = OPERATION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_STEP__ORIGINS = OPERATION_STEP__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_STEP__ANNOTATIONS = OPERATION_STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION = OPERATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS = OPERATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instruction Call Operation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_CALL_OPERATION_STEP_FEATURE_COUNT = OPERATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationLocalLabelImpl <em>Operation Local Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationLocalLabelImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationLocalLabel()
	 * @generated
	 */
	int OPERATION_LOCAL_LABEL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LOCAL_LABEL__DESCRIPTION = OPERATION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LOCAL_LABEL__ORIGINS = OPERATION_STEP__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LOCAL_LABEL__ANNOTATIONS = OPERATION_STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LOCAL_LABEL__NAME = OPERATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Local Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_LOCAL_LABEL_FEATURE_COUNT = OPERATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl <em>Conditional Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getConditionalOperation()
	 * @generated
	 */
	int CONDITIONAL_OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__DESCRIPTION = OPERATION_STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__ORIGINS = OPERATION_STEP__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__ANNOTATIONS = OPERATION_STEP__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__VALUE = OPERATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__BIT_OFFSET = OPERATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__VALUE_OFFSET = OPERATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Equals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__EQUALS = OPERATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Greater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__GREATER = OPERATION_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__LOWER = OPERATION_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Check Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__CHECK_VALUE = OPERATION_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__MASK = OPERATION_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION__STEPS = OPERATION_STEP_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Conditional Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OPERATION_FEATURE_COUNT = OPERATION_STEP_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterValueImpl <em>Instruction Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterValueImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionParameterValue()
	 * @generated
	 */
	int INSTRUCTION_PARAMETER_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_VALUE__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_VALUE__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_VALUE__ANNOTATIONS = InfrastructurePackage.MO_DEMBED_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Instruction Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.LabelParameterValueImpl <em>Label Parameter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.LabelParameterValueImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getLabelParameterValue()
	 * @generated
	 */
	int LABEL_PARAMETER_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_VALUE__DESCRIPTION = INSTRUCTION_PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_VALUE__ORIGINS = INSTRUCTION_PARAMETER_VALUE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_VALUE__ANNOTATIONS = INSTRUCTION_PARAMETER_VALUE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_VALUE__LABEL = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Parameter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_PARAMETER_VALUE_FEATURE_COUNT = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterConstantValueImpl <em>Instruction Parameter Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterConstantValueImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionParameterConstantValue()
	 * @generated
	 */
	int INSTRUCTION_PARAMETER_CONSTANT_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_CONSTANT_VALUE__DESCRIPTION = INSTRUCTION_PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_CONSTANT_VALUE__ORIGINS = INSTRUCTION_PARAMETER_VALUE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_CONSTANT_VALUE__ANNOTATIONS = INSTRUCTION_PARAMETER_VALUE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_CONSTANT_VALUE__VALUE = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instruction Parameter Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_CONSTANT_VALUE_FEATURE_COUNT = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterMappingImpl <em>Instruction Parameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterMappingImpl
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionParameterMapping()
	 * @generated
	 */
	int INSTRUCTION_PARAMETER_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__DESCRIPTION = INSTRUCTION_PARAMETER_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__ORIGINS = INSTRUCTION_PARAMETER_VALUE__ORIGINS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__ANNOTATIONS = INSTRUCTION_PARAMETER_VALUE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__VALUE = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bit Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Instruction Parameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_PARAMETER_MAPPING_FEATURE_COUNT = INSTRUCTION_PARAMETER_VALUE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition <em>Operation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Definition</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition
	 * @generated
	 */
	EClass getOperationDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition#getArguments()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition#getSteps()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EReference getOperationDefinition_Steps();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationDefinition#getOperation()
	 * @see #getOperationDefinition()
	 * @generated
	 */
	EAttribute getOperationDefinition_Operation();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument <em>Operation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Argument</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument
	 * @generated
	 */
	EClass getOperationArgument();

	/**
	 * Returns the meta object for the containment reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getType()
	 * @see #getOperationArgument()
	 * @generated
	 */
	EReference getOperationArgument_Type();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getMemType <em>Mem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mem Type</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationArgument#getMemType()
	 * @see #getOperationArgument()
	 * @generated
	 */
	EReference getOperationArgument_MemType();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep <em>Instruction Call Operation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Call Operation Step</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep
	 * @generated
	 */
	EClass getInstructionCallOperationStep();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep#getInstruction()
	 * @see #getInstructionCallOperationStep()
	 * @generated
	 */
	EReference getInstructionCallOperationStep_Instruction();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionCallOperationStep#getArguments()
	 * @see #getInstructionCallOperationStep()
	 * @generated
	 */
	EReference getInstructionCallOperationStep_Arguments();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep <em>Operation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Step</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationStep
	 * @generated
	 */
	EClass getOperationStep();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.OperationLocalLabel <em>Operation Local Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Local Label</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.OperationLocalLabel
	 * @generated
	 */
	EClass getOperationLocalLabel();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation <em>Conditional Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Operation</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation
	 * @generated
	 */
	EClass getConditionalOperation();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValue()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EReference getConditionalOperation_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getBitOffset <em>Bit Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Offset</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getBitOffset()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_BitOffset();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValueOffset <em>Value Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Offset</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getValueOffset()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_ValueOffset();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isEquals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equals</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isEquals()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_Equals();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isGreater <em>Greater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greater</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isGreater()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_Greater();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#isLower()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_Lower();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getCheckValue <em>Check Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getCheckValue()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_CheckValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getMask()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EAttribute getConditionalOperation_Mask();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.ConditionalOperation#getSteps()
	 * @see #getConditionalOperation()
	 * @generated
	 */
	EReference getConditionalOperation_Steps();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterValue <em>Instruction Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Parameter Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterValue
	 * @generated
	 */
	EClass getInstructionParameterValue();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue <em>Label Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Parameter Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue
	 * @generated
	 */
	EClass getLabelParameterValue();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.LabelParameterValue#getLabel()
	 * @see #getLabelParameterValue()
	 * @generated
	 */
	EReference getLabelParameterValue_Label();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterConstantValue <em>Instruction Parameter Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Parameter Constant Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterConstantValue
	 * @generated
	 */
	EClass getInstructionParameterConstantValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterConstantValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterConstantValue#getValue()
	 * @see #getInstructionParameterConstantValue()
	 * @generated
	 */
	EAttribute getInstructionParameterConstantValue_Value();

	/**
	 * Returns the meta object for class '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping <em>Instruction Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Parameter Mapping</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping
	 * @generated
	 */
	EClass getInstructionParameterMapping();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValue()
	 * @see #getInstructionParameterMapping()
	 * @generated
	 */
	EReference getInstructionParameterMapping_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getAttribute()
	 * @see #getInstructionParameterMapping()
	 * @generated
	 */
	EReference getInstructionParameterMapping_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getBitOffset <em>Bit Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Offset</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getBitOffset()
	 * @see #getInstructionParameterMapping()
	 * @generated
	 */
	EAttribute getInstructionParameterMapping_BitOffset();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValueOffset <em>Value Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Offset</em>'.
	 * @see hu.modembed.model.modembed.abstraction.behavior.platform.InstructionParameterMapping#getValueOffset()
	 * @see #getInstructionParameterMapping()
	 * @generated
	 */
	EAttribute getInstructionParameterMapping_ValueOffset();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlatformFactory getPlatformFactory();

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
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationDefinitionImpl <em>Operation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationDefinitionImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationDefinition()
		 * @generated
		 */
		EClass OPERATION_DEFINITION = eINSTANCE.getOperationDefinition();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__ARGUMENTS = eINSTANCE.getOperationDefinition_Arguments();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DEFINITION__STEPS = eINSTANCE.getOperationDefinition_Steps();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_DEFINITION__OPERATION = eINSTANCE.getOperationDefinition_Operation();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl <em>Operation Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationArgumentImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationArgument()
		 * @generated
		 */
		EClass OPERATION_ARGUMENT = eINSTANCE.getOperationArgument();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ARGUMENT__TYPE = eINSTANCE.getOperationArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Mem Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ARGUMENT__MEM_TYPE = eINSTANCE.getOperationArgument_MemType();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionCallOperationStepImpl <em>Instruction Call Operation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionCallOperationStepImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionCallOperationStep()
		 * @generated
		 */
		EClass INSTRUCTION_CALL_OPERATION_STEP = eINSTANCE.getInstructionCallOperationStep();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL_OPERATION_STEP__INSTRUCTION = eINSTANCE.getInstructionCallOperationStep_Instruction();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_CALL_OPERATION_STEP__ARGUMENTS = eINSTANCE.getInstructionCallOperationStep_Arguments();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationStepImpl <em>Operation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationStepImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationStep()
		 * @generated
		 */
		EClass OPERATION_STEP = eINSTANCE.getOperationStep();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationLocalLabelImpl <em>Operation Local Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.OperationLocalLabelImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getOperationLocalLabel()
		 * @generated
		 */
		EClass OPERATION_LOCAL_LABEL = eINSTANCE.getOperationLocalLabel();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl <em>Conditional Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.ConditionalOperationImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getConditionalOperation()
		 * @generated
		 */
		EClass CONDITIONAL_OPERATION = eINSTANCE.getConditionalOperation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OPERATION__VALUE = eINSTANCE.getConditionalOperation_Value();

		/**
		 * The meta object literal for the '<em><b>Bit Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__BIT_OFFSET = eINSTANCE.getConditionalOperation_BitOffset();

		/**
		 * The meta object literal for the '<em><b>Value Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__VALUE_OFFSET = eINSTANCE.getConditionalOperation_ValueOffset();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__EQUALS = eINSTANCE.getConditionalOperation_Equals();

		/**
		 * The meta object literal for the '<em><b>Greater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__GREATER = eINSTANCE.getConditionalOperation_Greater();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__LOWER = eINSTANCE.getConditionalOperation_Lower();

		/**
		 * The meta object literal for the '<em><b>Check Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__CHECK_VALUE = eINSTANCE.getConditionalOperation_CheckValue();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_OPERATION__MASK = eINSTANCE.getConditionalOperation_Mask();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OPERATION__STEPS = eINSTANCE.getConditionalOperation_Steps();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterValueImpl <em>Instruction Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterValueImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionParameterValue()
		 * @generated
		 */
		EClass INSTRUCTION_PARAMETER_VALUE = eINSTANCE.getInstructionParameterValue();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.LabelParameterValueImpl <em>Label Parameter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.LabelParameterValueImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getLabelParameterValue()
		 * @generated
		 */
		EClass LABEL_PARAMETER_VALUE = eINSTANCE.getLabelParameterValue();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_PARAMETER_VALUE__LABEL = eINSTANCE.getLabelParameterValue_Label();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterConstantValueImpl <em>Instruction Parameter Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterConstantValueImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionParameterConstantValue()
		 * @generated
		 */
		EClass INSTRUCTION_PARAMETER_CONSTANT_VALUE = eINSTANCE.getInstructionParameterConstantValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER_CONSTANT_VALUE__VALUE = eINSTANCE.getInstructionParameterConstantValue_Value();

		/**
		 * The meta object literal for the '{@link hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterMappingImpl <em>Instruction Parameter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.InstructionParameterMappingImpl
		 * @see hu.modembed.model.modembed.abstraction.behavior.platform.impl.PlatformPackageImpl#getInstructionParameterMapping()
		 * @generated
		 */
		EClass INSTRUCTION_PARAMETER_MAPPING = eINSTANCE.getInstructionParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_PARAMETER_MAPPING__VALUE = eINSTANCE.getInstructionParameterMapping_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_PARAMETER_MAPPING__ATTRIBUTE = eINSTANCE.getInstructionParameterMapping_Attribute();

		/**
		 * The meta object literal for the '<em><b>Bit Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER_MAPPING__BIT_OFFSET = eINSTANCE.getInstructionParameterMapping_BitOffset();

		/**
		 * The meta object literal for the '<em><b>Value Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_PARAMETER_MAPPING__VALUE_OFFSET = eINSTANCE.getInstructionParameterMapping_ValueOffset();

	}

} //PlatformPackage

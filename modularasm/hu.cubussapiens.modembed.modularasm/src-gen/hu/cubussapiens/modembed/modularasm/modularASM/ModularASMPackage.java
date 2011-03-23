/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

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
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMFactory
 * @model kind="package"
 * @generated
 */
public interface ModularASMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "modularASM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cubussapiens.hu/modembed/modularasm/ModularASM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "modularASM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModularASMPackage eINSTANCE = hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getModule()
   * @generated
   */
  int MODULE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__TARGET = 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__ITEMS = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PARAMS = 3;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleParamImpl <em>Module Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getModuleParam()
   * @generated
   */
  int MODULE_PARAM = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_PARAM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>Module Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.QualifiedIDImpl <em>Qualified ID</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.QualifiedIDImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getQualifiedID()
   * @generated
   */
  int QUALIFIED_ID = 2;

  /**
   * The feature id for the '<em><b>Segments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ID__SEGMENTS = 0;

  /**
   * The number of structural features of the '<em>Qualified ID</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleItemImpl <em>Module Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleItemImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getModuleItem()
   * @generated
   */
  int MODULE_ITEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ITEM__NAME = 0;

  /**
   * The number of structural features of the '<em>Module Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationWordImpl <em>Configuration Word</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationWordImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getConfigurationWord()
   * @generated
   */
  int CONFIGURATION_WORD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_WORD__NAME = MODULE_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_WORD__DEFAULT = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_WORD__FIELDS = MODULE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Configuration Word</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_WORD_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl <em>Configuration Field Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getConfigurationFieldPlace()
   * @generated
   */
  int CONFIGURATION_FIELD_PLACE = 5;

  /**
   * The feature id for the '<em><b>Bit Num</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FIELD_PLACE__BIT_NUM = 0;

  /**
   * The feature id for the '<em><b>Start Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FIELD_PLACE__START_BIT = 1;

  /**
   * The feature id for the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FIELD_PLACE__FIELD = 2;

  /**
   * The number of structural features of the '<em>Configuration Field Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FIELD_PLACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldImpl <em>Configuration Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getConfigurationField()
   * @generated
   */
  int CONFIGURATION_FIELD = 6;

  /**
   * The number of structural features of the '<em>Configuration Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FIELD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldImpl <em>Enum Configuration Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getEnumConfigurationField()
   * @generated
   */
  int ENUM_CONFIGURATION_FIELD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONFIGURATION_FIELD__NAME = CONFIGURATION_FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONFIGURATION_FIELD__LITERALS = CONFIGURATION_FIELD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Configuration Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONFIGURATION_FIELD_FEATURE_COUNT = CONFIGURATION_FIELD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldLiteralImpl <em>Enum Configuration Field Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldLiteralImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getEnumConfigurationFieldLiteral()
   * @generated
   */
  int ENUM_CONFIGURATION_FIELD_LITERAL = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONFIGURATION_FIELD_LITERAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONFIGURATION_FIELD_LITERAL__VALUE = 1;

  /**
   * The number of structural features of the '<em>Enum Configuration Field Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_CONFIGURATION_FIELD_LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.SymbolImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__NAME = MODULE_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__VALUE = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = MODULE_ITEM__NAME;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.InstanceImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = MODULE_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__PARAMS = MODULE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.FunctionImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = MODULE_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__STEP = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = MODULE_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMS = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Step</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__STEP = MODULE_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodParamImpl <em>Method Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethodParam()
   * @generated
   */
  int METHOD_PARAM = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>Method Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.StepImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getStep()
   * @generated
   */
  int STEP = 15;

  /**
   * The number of structural features of the '<em>Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STEP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.LabelImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = STEP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.InstructionImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 17;

  /**
   * The feature id for the '<em><b>Ins</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__INS = STEP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__PARAMS = STEP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallImpl <em>Method Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethodCall()
   * @generated
   */
  int METHOD_CALL = 18;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__METHOD = STEP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL__PARAMS = STEP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallParamImpl <em>Method Call Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethodCallParam()
   * @generated
   */
  int METHOD_CALL_PARAM = 19;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_PARAM__REF = 0;

  /**
   * The number of structural features of the '<em>Method Call Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_CALL_PARAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.InsParamImpl <em>Ins Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.InsParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getInsParam()
   * @generated
   */
  int INS_PARAM = 20;

  /**
   * The number of structural features of the '<em>Ins Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INS_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.LiteralParamImpl <em>Literal Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.LiteralParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getLiteralParam()
   * @generated
   */
  int LITERAL_PARAM = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_PARAM__VALUE = INS_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_PARAM_FEATURE_COUNT = INS_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.RefParamImpl <em>Ref Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.RefParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getRefParam()
   * @generated
   */
  int REF_PARAM = 22;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PARAM__REF = INS_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PARAM_FEATURE_COUNT = INS_PARAM_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.Module#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Module#getTarget()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Target();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Module#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Module#getItems()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Items();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Module#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Module#getParams()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Params();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam <em>Module Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam
   * @generated
   */
  EClass getModuleParam();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam#getType()
   * @see #getModuleParam()
   * @generated
   */
  EReference getModuleParam_Type();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam#getName()
   * @see #getModuleParam()
   * @generated
   */
  EAttribute getModuleParam_Name();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID <em>Qualified ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified ID</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID
   * @generated
   */
  EClass getQualifiedID();

  /**
   * Returns the meta object for the attribute list '{@link hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Segments</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID#getSegments()
   * @see #getQualifiedID()
   * @generated
   */
  EAttribute getQualifiedID_Segments();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem <em>Module Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Item</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem
   * @generated
   */
  EClass getModuleItem();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem#getName()
   * @see #getModuleItem()
   * @generated
   */
  EAttribute getModuleItem_Name();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord <em>Configuration Word</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Word</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord
   * @generated
   */
  EClass getConfigurationWord();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getDefault()
   * @see #getConfigurationWord()
   * @generated
   */
  EReference getConfigurationWord_Default();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getFields()
   * @see #getConfigurationWord()
   * @generated
   */
  EReference getConfigurationWord_Fields();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace <em>Configuration Field Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Field Place</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace
   * @generated
   */
  EClass getConfigurationFieldPlace();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getBitNum <em>Bit Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bit Num</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getBitNum()
   * @see #getConfigurationFieldPlace()
   * @generated
   */
  EReference getConfigurationFieldPlace_BitNum();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getStartBit <em>Start Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Bit</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getStartBit()
   * @see #getConfigurationFieldPlace()
   * @generated
   */
  EReference getConfigurationFieldPlace_StartBit();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getField <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getField()
   * @see #getConfigurationFieldPlace()
   * @generated
   */
  EReference getConfigurationFieldPlace_Field();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField <em>Configuration Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Field</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField
   * @generated
   */
  EClass getConfigurationField();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField <em>Enum Configuration Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Configuration Field</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField
   * @generated
   */
  EClass getEnumConfigurationField();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getName()
   * @see #getEnumConfigurationField()
   * @generated
   */
  EAttribute getEnumConfigurationField_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getLiterals()
   * @see #getEnumConfigurationField()
   * @generated
   */
  EReference getEnumConfigurationField_Literals();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral <em>Enum Configuration Field Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Configuration Field Literal</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral
   * @generated
   */
  EClass getEnumConfigurationFieldLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral#getName()
   * @see #getEnumConfigurationFieldLiteral()
   * @generated
   */
  EAttribute getEnumConfigurationFieldLiteral_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral#getValue()
   * @see #getEnumConfigurationFieldLiteral()
   * @generated
   */
  EReference getEnumConfigurationFieldLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.Symbol#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Symbol#getValue()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Value();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Type();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instance#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instance#getParams()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Params();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Function#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Step</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Function#getStep()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Step();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Method#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Method#getParams()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Params();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Method#getStep <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Step</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Method#getStep()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Step();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam <em>Method Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodParam
   * @generated
   */
  EClass getMethodParam();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getType()
   * @see #getMethodParam()
   * @generated
   */
  EReference getMethodParam_Type();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getName()
   * @see #getMethodParam()
   * @generated
   */
  EAttribute getMethodParam_Name();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Step</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Step
   * @generated
   */
  EClass getStep();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.Label#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Label#getName()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Name();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ins</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getIns()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_Ins();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getParams()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Params();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCall
   * @generated
   */
  EClass getMethodCall();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getMethod()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Method();

  /**
   * Returns the meta object for the containment reference list '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getParams()
   * @see #getMethodCall()
   * @generated
   */
  EReference getMethodCall_Params();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam <em>Method Call Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Call Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam
   * @generated
   */
  EClass getMethodCallParam();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam#getRef()
   * @see #getMethodCallParam()
   * @generated
   */
  EReference getMethodCallParam_Ref();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.InsParam <em>Ins Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ins Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.InsParam
   * @generated
   */
  EClass getInsParam();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam <em>Literal Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam
   * @generated
   */
  EClass getLiteralParam();

  /**
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam#getValue()
   * @see #getLiteralParam()
   * @generated
   */
  EAttribute getLiteralParam_Value();

  /**
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.RefParam <em>Ref Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.RefParam
   * @generated
   */
  EClass getRefParam();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.RefParam#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.RefParam#getRef()
   * @see #getRefParam()
   * @generated
   */
  EReference getRefParam_Ref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModularASMFactory getModularASMFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__TARGET = eINSTANCE.getModule_Target();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__ITEMS = eINSTANCE.getModule_Items();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PARAMS = eINSTANCE.getModule_Params();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleParamImpl <em>Module Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getModuleParam()
     * @generated
     */
    EClass MODULE_PARAM = eINSTANCE.getModuleParam();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE_PARAM__TYPE = eINSTANCE.getModuleParam_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_PARAM__NAME = eINSTANCE.getModuleParam_Name();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.QualifiedIDImpl <em>Qualified ID</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.QualifiedIDImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getQualifiedID()
     * @generated
     */
    EClass QUALIFIED_ID = eINSTANCE.getQualifiedID();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_ID__SEGMENTS = eINSTANCE.getQualifiedID_Segments();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleItemImpl <em>Module Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModuleItemImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getModuleItem()
     * @generated
     */
    EClass MODULE_ITEM = eINSTANCE.getModuleItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_ITEM__NAME = eINSTANCE.getModuleItem_Name();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationWordImpl <em>Configuration Word</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationWordImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getConfigurationWord()
     * @generated
     */
    EClass CONFIGURATION_WORD = eINSTANCE.getConfigurationWord();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_WORD__DEFAULT = eINSTANCE.getConfigurationWord_Default();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_WORD__FIELDS = eINSTANCE.getConfigurationWord_Fields();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl <em>Configuration Field Place</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getConfigurationFieldPlace()
     * @generated
     */
    EClass CONFIGURATION_FIELD_PLACE = eINSTANCE.getConfigurationFieldPlace();

    /**
     * The meta object literal for the '<em><b>Bit Num</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_FIELD_PLACE__BIT_NUM = eINSTANCE.getConfigurationFieldPlace_BitNum();

    /**
     * The meta object literal for the '<em><b>Start Bit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_FIELD_PLACE__START_BIT = eINSTANCE.getConfigurationFieldPlace_StartBit();

    /**
     * The meta object literal for the '<em><b>Field</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_FIELD_PLACE__FIELD = eINSTANCE.getConfigurationFieldPlace_Field();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldImpl <em>Configuration Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getConfigurationField()
     * @generated
     */
    EClass CONFIGURATION_FIELD = eINSTANCE.getConfigurationField();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldImpl <em>Enum Configuration Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getEnumConfigurationField()
     * @generated
     */
    EClass ENUM_CONFIGURATION_FIELD = eINSTANCE.getEnumConfigurationField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_CONFIGURATION_FIELD__NAME = eINSTANCE.getEnumConfigurationField_Name();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_CONFIGURATION_FIELD__LITERALS = eINSTANCE.getEnumConfigurationField_Literals();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldLiteralImpl <em>Enum Configuration Field Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.EnumConfigurationFieldLiteralImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getEnumConfigurationFieldLiteral()
     * @generated
     */
    EClass ENUM_CONFIGURATION_FIELD_LITERAL = eINSTANCE.getEnumConfigurationFieldLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_CONFIGURATION_FIELD_LITERAL__NAME = eINSTANCE.getEnumConfigurationFieldLiteral_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_CONFIGURATION_FIELD_LITERAL__VALUE = eINSTANCE.getEnumConfigurationFieldLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.SymbolImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__VALUE = eINSTANCE.getSymbol_Value();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.InstanceImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__PARAMS = eINSTANCE.getInstance_Params();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.FunctionImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__STEP = eINSTANCE.getFunction_Step();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMS = eINSTANCE.getMethod_Params();

    /**
     * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__STEP = eINSTANCE.getMethod_Step();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodParamImpl <em>Method Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethodParam()
     * @generated
     */
    EClass METHOD_PARAM = eINSTANCE.getMethodParam();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PARAM__TYPE = eINSTANCE.getMethodParam_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_PARAM__NAME = eINSTANCE.getMethodParam_Name();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.StepImpl <em>Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.StepImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getStep()
     * @generated
     */
    EClass STEP = eINSTANCE.getStep();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.LabelImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.InstructionImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__INS = eINSTANCE.getInstruction_Ins();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__PARAMS = eINSTANCE.getInstruction_Params();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallImpl <em>Method Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethodCall()
     * @generated
     */
    EClass METHOD_CALL = eINSTANCE.getMethodCall();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__METHOD = eINSTANCE.getMethodCall_Method();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL__PARAMS = eINSTANCE.getMethodCall_Params();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallParamImpl <em>Method Call Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getMethodCallParam()
     * @generated
     */
    EClass METHOD_CALL_PARAM = eINSTANCE.getMethodCallParam();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_CALL_PARAM__REF = eINSTANCE.getMethodCallParam_Ref();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.InsParamImpl <em>Ins Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.InsParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getInsParam()
     * @generated
     */
    EClass INS_PARAM = eINSTANCE.getInsParam();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.LiteralParamImpl <em>Literal Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.LiteralParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getLiteralParam()
     * @generated
     */
    EClass LITERAL_PARAM = eINSTANCE.getLiteralParam();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_PARAM__VALUE = eINSTANCE.getLiteralParam_Value();

    /**
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.RefParamImpl <em>Ref Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.RefParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getRefParam()
     * @generated
     */
    EClass REF_PARAM = eINSTANCE.getRefParam();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_PARAM__REF = eINSTANCE.getRefParam_Ref();

  }

} //ModularASMPackage

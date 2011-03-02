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
   * The feature id for the '<em><b>Type</b></em>' attribute.
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
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableDeclImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 4;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__VARIABLE = 1;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.SymbolImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 5;

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
  int VARIABLE = 6;

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
  int INSTANCE = 7;

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
  int FUNCTION = 8;

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
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.StepImpl <em>Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.StepImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getStep()
   * @generated
   */
  int STEP = 9;

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
  int LABEL = 10;

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
  int INSTRUCTION = 11;

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
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ParamImpl <em>Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getParam()
   * @generated
   */
  int PARAM = 12;

  /**
   * The number of structural features of the '<em>Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.LiteralParamImpl <em>Literal Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.LiteralParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getLiteralParam()
   * @generated
   */
  int LITERAL_PARAM = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_PARAM__VALUE = PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Literal Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_PARAM_FEATURE_COUNT = PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.RefParamImpl <em>Ref Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.RefParamImpl
   * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getRefParam()
   * @generated
   */
  int REF_PARAM = 14;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PARAM__REF = PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_PARAM_FEATURE_COUNT = PARAM_FEATURE_COUNT + 1;


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
   * Returns the meta object for the attribute '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam#getType()
   * @see #getModuleParam()
   * @generated
   */
  EAttribute getModuleParam_Type();

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
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the attribute list '{@link hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifier</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl#getModifier()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Modifier();

  /**
   * Returns the meta object for the containment reference '{@link hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.VariableDecl#getVariable()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_Variable();

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
   * Returns the meta object for class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Param <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param</em>'.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Param
   * @generated
   */
  EClass getParam();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE_PARAM__TYPE = eINSTANCE.getModuleParam_Type();

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
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.VariableDeclImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__MODIFIER = eINSTANCE.getVariableDecl_Modifier();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__VARIABLE = eINSTANCE.getVariableDecl_Variable();

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
     * The meta object literal for the '{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ParamImpl <em>Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ParamImpl
     * @see hu.cubussapiens.modembed.modularasm.modularASM.impl.ModularASMPackageImpl#getParam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getParam();

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

/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM.impl;

import hu.cubussapiens.modembed.modularasm.modularASM.*;

import org.eclipse.emf.ecore.EClass;
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
public class ModularASMFactoryImpl extends EFactoryImpl implements ModularASMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModularASMFactory init()
  {
    try
    {
      ModularASMFactory theModularASMFactory = (ModularASMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cubussapiens.hu/modembed/modularasm/ModularASM"); 
      if (theModularASMFactory != null)
      {
        return theModularASMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModularASMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModularASMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModularASMPackage.MODULE: return createModule();
      case ModularASMPackage.MODULE_PARAM: return createModuleParam();
      case ModularASMPackage.QUALIFIED_ID: return createQualifiedID();
      case ModularASMPackage.MODULE_ITEM: return createModuleItem();
      case ModularASMPackage.VARIABLE_DECL: return createVariableDecl();
      case ModularASMPackage.SYMBOL: return createSymbol();
      case ModularASMPackage.VARIABLE: return createVariable();
      case ModularASMPackage.INSTANCE: return createInstance();
      case ModularASMPackage.FUNCTION: return createFunction();
      case ModularASMPackage.STEP: return createStep();
      case ModularASMPackage.LABEL: return createLabel();
      case ModularASMPackage.INSTRUCTION: return createInstruction();
      case ModularASMPackage.PARAM: return createParam();
      case ModularASMPackage.LITERAL_PARAM: return createLiteralParam();
      case ModularASMPackage.REF_PARAM: return createRefParam();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleParam createModuleParam()
  {
    ModuleParamImpl moduleParam = new ModuleParamImpl();
    return moduleParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedID createQualifiedID()
  {
    QualifiedIDImpl qualifiedID = new QualifiedIDImpl();
    return qualifiedID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleItem createModuleItem()
  {
    ModuleItemImpl moduleItem = new ModuleItemImpl();
    return moduleItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Step createStep()
  {
    StepImpl step = new StepImpl();
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralParam createLiteralParam()
  {
    LiteralParamImpl literalParam = new LiteralParamImpl();
    return literalParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefParam createRefParam()
  {
    RefParamImpl refParam = new RefParamImpl();
    return refParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModularASMPackage getModularASMPackage()
  {
    return (ModularASMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModularASMPackage getPackage()
  {
    return ModularASMPackage.eINSTANCE;
  }

} //ModularASMFactoryImpl

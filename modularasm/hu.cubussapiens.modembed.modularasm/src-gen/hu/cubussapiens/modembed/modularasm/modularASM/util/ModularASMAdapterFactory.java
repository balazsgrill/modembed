/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM.util;

import hu.cubussapiens.modembed.modularasm.modularASM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage
 * @generated
 */
public class ModularASMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ModularASMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModularASMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ModularASMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModularASMSwitch<Adapter> modelSwitch =
    new ModularASMSwitch<Adapter>()
    {
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleParam(ModuleParam object)
      {
        return createModuleParamAdapter();
      }
      @Override
      public Adapter caseQualifiedID(QualifiedID object)
      {
        return createQualifiedIDAdapter();
      }
      @Override
      public Adapter caseModuleItem(ModuleItem object)
      {
        return createModuleItemAdapter();
      }
      @Override
      public Adapter caseConfigurationWord(ConfigurationWord object)
      {
        return createConfigurationWordAdapter();
      }
      @Override
      public Adapter caseConfigurationFieldPlace(ConfigurationFieldPlace object)
      {
        return createConfigurationFieldPlaceAdapter();
      }
      @Override
      public Adapter caseConfigurationField(ConfigurationField object)
      {
        return createConfigurationFieldAdapter();
      }
      @Override
      public Adapter caseEnumConfigurationField(EnumConfigurationField object)
      {
        return createEnumConfigurationFieldAdapter();
      }
      @Override
      public Adapter caseEnumConfigurationFieldLiteral(EnumConfigurationFieldLiteral object)
      {
        return createEnumConfigurationFieldLiteralAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseInstance(Instance object)
      {
        return createInstanceAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseMethodParam(MethodParam object)
      {
        return createMethodParamAdapter();
      }
      @Override
      public Adapter caseStep(Step object)
      {
        return createStepAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseMethodCall(MethodCall object)
      {
        return createMethodCallAdapter();
      }
      @Override
      public Adapter caseMethodCallParam(MethodCallParam object)
      {
        return createMethodCallParamAdapter();
      }
      @Override
      public Adapter caseInsParam(InsParam object)
      {
        return createInsParamAdapter();
      }
      @Override
      public Adapter caseLiteralParam(LiteralParam object)
      {
        return createLiteralParamAdapter();
      }
      @Override
      public Adapter caseRefParam(RefParam object)
      {
        return createRefParamAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam <em>Module Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleParam
   * @generated
   */
  public Adapter createModuleParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID <em>Qualified ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID
   * @generated
   */
  public Adapter createQualifiedIDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem <em>Module Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModuleItem
   * @generated
   */
  public Adapter createModuleItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord <em>Configuration Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord
   * @generated
   */
  public Adapter createConfigurationWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace <em>Configuration Field Place</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace
   * @generated
   */
  public Adapter createConfigurationFieldPlaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField <em>Configuration Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField
   * @generated
   */
  public Adapter createConfigurationFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField <em>Enum Configuration Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField
   * @generated
   */
  public Adapter createEnumConfigurationFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral <em>Enum Configuration Field Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral
   * @generated
   */
  public Adapter createEnumConfigurationFieldLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instance
   * @generated
   */
  public Adapter createInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Method
   * @generated
   */
  public Adapter createMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam <em>Method Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodParam
   * @generated
   */
  public Adapter createMethodParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Step <em>Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Step
   * @generated
   */
  public Adapter createStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall <em>Method Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCall
   * @generated
   */
  public Adapter createMethodCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam <em>Method Call Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam
   * @generated
   */
  public Adapter createMethodCallParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.InsParam <em>Ins Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.InsParam
   * @generated
   */
  public Adapter createInsParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam <em>Literal Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam
   * @generated
   */
  public Adapter createLiteralParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.cubussapiens.modembed.modularasm.modularASM.RefParam <em>Ref Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.RefParam
   * @generated
   */
  public Adapter createRefParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ModularASMAdapterFactory

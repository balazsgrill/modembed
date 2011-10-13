/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax.util;

import hu.e.parser.eSyntax.ArrayRef;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.CompileContextVariable;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.LabelReference;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.LiteralValue;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructRef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.TopLevelItem;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableRefSection;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.WordSection;
import hu.e.parser.eSyntax.XAddressOfVar;
import hu.e.parser.eSyntax.XAssignment;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XIfExpression;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XPrimaryExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;
import hu.e.parser.eSyntax.XTopLevelExpression;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.e.parser.eSyntax.ESyntaxPackage
 * @generated
 */
public class ESyntaxAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ESyntaxPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ESyntaxAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ESyntaxPackage.eINSTANCE;
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
  protected ESyntaxSwitch<Adapter> modelSwitch =
    new ESyntaxSwitch<Adapter>()
    {
      @Override
      public Adapter casePackage(hu.e.parser.eSyntax.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseTopLevelItem(TopLevelItem object)
      {
        return createTopLevelItemAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseTypeDef(TypeDef object)
      {
        return createTypeDefAdapter();
      }
      @Override
      public Adapter caseDataTypeDef(DataTypeDef object)
      {
        return createDataTypeDefAdapter();
      }
      @Override
      public Adapter caseArrayTypeDef(ArrayTypeDef object)
      {
        return createArrayTypeDefAdapter();
      }
      @Override
      public Adapter caseStructTypeDef(StructTypeDef object)
      {
        return createStructTypeDefAdapter();
      }
      @Override
      public Adapter caseStructTypeDefMember(StructTypeDefMember object)
      {
        return createStructTypeDefMemberAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseOperationStep(OperationStep object)
      {
        return createOperationStepAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseInstructionWord(InstructionWord object)
      {
        return createInstructionWordAdapter();
      }
      @Override
      public Adapter caseWordSection(WordSection object)
      {
        return createWordSectionAdapter();
      }
      @Override
      public Adapter caseLiteralValue(LiteralValue object)
      {
        return createLiteralValueAdapter();
      }
      @Override
      public Adapter caseLabelReference(LabelReference object)
      {
        return createLabelReferenceAdapter();
      }
      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
      }
      @Override
      public Adapter caseVariableRefSection(VariableRefSection object)
      {
        return createVariableRefSectionAdapter();
      }
      @Override
      public Adapter caseArrayRef(ArrayRef object)
      {
        return createArrayRefAdapter();
      }
      @Override
      public Adapter caseStructRef(StructRef object)
      {
        return createStructRefAdapter();
      }
      @Override
      public Adapter caseOperationCall(OperationCall object)
      {
        return createOperationCallAdapter();
      }
      @Override
      public Adapter caseOperationCallParameter(OperationCallParameter object)
      {
        return createOperationCallParameterAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseOperationBlock(OperationBlock object)
      {
        return createOperationBlockAdapter();
      }
      @Override
      public Adapter caseParameterVariable(ParameterVariable object)
      {
        return createParameterVariableAdapter();
      }
      @Override
      public Adapter caseOperatorDefinition(OperatorDefinition object)
      {
        return createOperatorDefinitionAdapter();
      }
      @Override
      public Adapter caseLinkedBinary(LinkedBinary object)
      {
        return createLinkedBinaryAdapter();
      }
      @Override
      public Adapter caseBinarySection(BinarySection object)
      {
        return createBinarySectionAdapter();
      }
      @Override
      public Adapter caseFunctionBinarySection(FunctionBinarySection object)
      {
        return createFunctionBinarySectionAdapter();
      }
      @Override
      public Adapter caseFunctionMemory(FunctionMemory object)
      {
        return createFunctionMemoryAdapter();
      }
      @Override
      public Adapter caseConstantBinarySection(ConstantBinarySection object)
      {
        return createConstantBinarySectionAdapter();
      }
      @Override
      public Adapter caseReferenceBinarySection(ReferenceBinarySection object)
      {
        return createReferenceBinarySectionAdapter();
      }
      @Override
      public Adapter caseXExpression(XExpression object)
      {
        return createXExpressionAdapter();
      }
      @Override
      public Adapter caseXPrimaryExpression(XPrimaryExpression object)
      {
        return createXPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseXSizeOfExpression(XSizeOfExpression object)
      {
        return createXSizeOfExpressionAdapter();
      }
      @Override
      public Adapter caseXStructExpression(XStructExpression object)
      {
        return createXStructExpressionAdapter();
      }
      @Override
      public Adapter caseXExpression1(XExpression1 object)
      {
        return createXExpression1Adapter();
      }
      @Override
      public Adapter caseXExpression2(XExpression2 object)
      {
        return createXExpression2Adapter();
      }
      @Override
      public Adapter caseXExpression3(XExpression3 object)
      {
        return createXExpression3Adapter();
      }
      @Override
      public Adapter caseXExpression4(XExpression4 object)
      {
        return createXExpression4Adapter();
      }
      @Override
      public Adapter caseXExpression5(XExpression5 object)
      {
        return createXExpression5Adapter();
      }
      @Override
      public Adapter caseXExpressionLiteral(XExpressionLiteral object)
      {
        return createXExpressionLiteralAdapter();
      }
      @Override
      public Adapter caseXTopLevelExpression(XTopLevelExpression object)
      {
        return createXTopLevelExpressionAdapter();
      }
      @Override
      public Adapter caseXAssignment(XAssignment object)
      {
        return createXAssignmentAdapter();
      }
      @Override
      public Adapter caseXAddressOfVar(XAddressOfVar object)
      {
        return createXAddressOfVarAdapter();
      }
      @Override
      public Adapter caseXIsLiteralExpression(XIsLiteralExpression object)
      {
        return createXIsLiteralExpressionAdapter();
      }
      @Override
      public Adapter caseXIfExpression(XIfExpression object)
      {
        return createXIfExpressionAdapter();
      }
      @Override
      public Adapter caseXParenthesizedExpression(XParenthesizedExpression object)
      {
        return createXParenthesizedExpressionAdapter();
      }
      @Override
      public Adapter caseConstantVariable(ConstantVariable object)
      {
        return createConstantVariableAdapter();
      }
      @Override
      public Adapter caseRegisterVariable(RegisterVariable object)
      {
        return createRegisterVariableAdapter();
      }
      @Override
      public Adapter caseCompileContextVariable(CompileContextVariable object)
      {
        return createCompileContextVariableAdapter();
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.TopLevelItem <em>Top Level Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.TopLevelItem
   * @generated
   */
  public Adapter createTopLevelItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.TypeDef
   * @generated
   */
  public Adapter createTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.DataTypeDef <em>Data Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.DataTypeDef
   * @generated
   */
  public Adapter createDataTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.ArrayTypeDef <em>Array Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.ArrayTypeDef
   * @generated
   */
  public Adapter createArrayTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.StructTypeDef <em>Struct Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.StructTypeDef
   * @generated
   */
  public Adapter createStructTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.StructTypeDefMember <em>Struct Type Def Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.StructTypeDefMember
   * @generated
   */
  public Adapter createStructTypeDefMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OperationStep <em>Operation Step</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OperationStep
   * @generated
   */
  public Adapter createOperationStepAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.InstructionWord <em>Instruction Word</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.InstructionWord
   * @generated
   */
  public Adapter createInstructionWordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.WordSection <em>Word Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.WordSection
   * @generated
   */
  public Adapter createWordSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.LiteralValue <em>Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.LiteralValue
   * @generated
   */
  public Adapter createLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.LabelReference <em>Label Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.LabelReference
   * @generated
   */
  public Adapter createLabelReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.VariableReference
   * @generated
   */
  public Adapter createVariableReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.VariableRefSection <em>Variable Ref Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.VariableRefSection
   * @generated
   */
  public Adapter createVariableRefSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.ArrayRef <em>Array Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.ArrayRef
   * @generated
   */
  public Adapter createArrayRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.StructRef <em>Struct Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.StructRef
   * @generated
   */
  public Adapter createStructRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OperationCall
   * @generated
   */
  public Adapter createOperationCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OperationCallParameter <em>Operation Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OperationCallParameter
   * @generated
   */
  public Adapter createOperationCallParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OperationBlock <em>Operation Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OperationBlock
   * @generated
   */
  public Adapter createOperationBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.ParameterVariable <em>Parameter Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.ParameterVariable
   * @generated
   */
  public Adapter createParameterVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OperatorDefinition <em>Operator Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OperatorDefinition
   * @generated
   */
  public Adapter createOperatorDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.LinkedBinary <em>Linked Binary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.LinkedBinary
   * @generated
   */
  public Adapter createLinkedBinaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.BinarySection <em>Binary Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.BinarySection
   * @generated
   */
  public Adapter createBinarySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.FunctionBinarySection <em>Function Binary Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.FunctionBinarySection
   * @generated
   */
  public Adapter createFunctionBinarySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.FunctionMemory <em>Function Memory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.FunctionMemory
   * @generated
   */
  public Adapter createFunctionMemoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.ConstantBinarySection <em>Constant Binary Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.ConstantBinarySection
   * @generated
   */
  public Adapter createConstantBinarySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.ReferenceBinarySection <em>Reference Binary Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.ReferenceBinarySection
   * @generated
   */
  public Adapter createReferenceBinarySectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression
   * @generated
   */
  public Adapter createXExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XPrimaryExpression <em>XPrimary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XPrimaryExpression
   * @generated
   */
  public Adapter createXPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XSizeOfExpression <em>XSize Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XSizeOfExpression
   * @generated
   */
  public Adapter createXSizeOfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XStructExpression <em>XStruct Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XStructExpression
   * @generated
   */
  public Adapter createXStructExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression1 <em>XExpression1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression1
   * @generated
   */
  public Adapter createXExpression1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression2 <em>XExpression2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression2
   * @generated
   */
  public Adapter createXExpression2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression3 <em>XExpression3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression3
   * @generated
   */
  public Adapter createXExpression3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression4 <em>XExpression4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression4
   * @generated
   */
  public Adapter createXExpression4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression5 <em>XExpression5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression5
   * @generated
   */
  public Adapter createXExpression5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpressionLiteral <em>XExpression Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpressionLiteral
   * @generated
   */
  public Adapter createXExpressionLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XTopLevelExpression <em>XTop Level Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XTopLevelExpression
   * @generated
   */
  public Adapter createXTopLevelExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XAssignment <em>XAssignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XAssignment
   * @generated
   */
  public Adapter createXAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XAddressOfVar <em>XAddress Of Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XAddressOfVar
   * @generated
   */
  public Adapter createXAddressOfVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XIsLiteralExpression <em>XIs Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XIsLiteralExpression
   * @generated
   */
  public Adapter createXIsLiteralExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XIfExpression <em>XIf Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XIfExpression
   * @generated
   */
  public Adapter createXIfExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XParenthesizedExpression <em>XParenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XParenthesizedExpression
   * @generated
   */
  public Adapter createXParenthesizedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.ConstantVariable <em>Constant Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.ConstantVariable
   * @generated
   */
  public Adapter createConstantVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.RegisterVariable <em>Register Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.RegisterVariable
   * @generated
   */
  public Adapter createRegisterVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.CompileContextVariable <em>Compile Context Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.CompileContextVariable
   * @generated
   */
  public Adapter createCompileContextVariableAdapter()
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

} //ESyntaxAdapterFactory
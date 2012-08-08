/**
 */
package hu.e.parser.eSyntax.util;

import hu.e.parser.eSyntax.*;

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
      public Adapter caseCompilationUnit(CompilationUnit object)
      {
        return createCompilationUnitAdapter();
      }
      @Override
      public Adapter caseAnnotationDefinition(AnnotationDefinition object)
      {
        return createAnnotationDefinitionAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseLibrary(Library object)
      {
        return createLibraryAdapter();
      }
      @Override
      public Adapter caseLibraryItem(LibraryItem object)
      {
        return createLibraryItemAdapter();
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
      public Adapter casePointerTypeDef(PointerTypeDef object)
      {
        return createPointerTypeDefAdapter();
      }
      @Override
      public Adapter caseArrayTypeDef(ArrayTypeDef object)
      {
        return createArrayTypeDefAdapter();
      }
      @Override
      public Adapter caseRefTypeDef(RefTypeDef object)
      {
        return createRefTypeDefAdapter();
      }
      @Override
      public Adapter caseDataTypeDef(DataTypeDef object)
      {
        return createDataTypeDefAdapter();
      }
      @Override
      public Adapter caseFixedDataTypeDef(FixedDataTypeDef object)
      {
        return createFixedDataTypeDefAdapter();
      }
      @Override
      public Adapter caseIntegerDataTypeDef(IntegerDataTypeDef object)
      {
        return createIntegerDataTypeDefAdapter();
      }
      @Override
      public Adapter caseStructTypeDef(StructTypeDef object)
      {
        return createStructTypeDefAdapter();
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
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
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
      public Adapter caseOperationSignature(OperationSignature object)
      {
        return createOperationSignatureAdapter();
      }
      @Override
      public Adapter caseOperationBlock(OperationBlock object)
      {
        return createOperationBlockAdapter();
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
      public Adapter caseOptimizerCall(OptimizerCall object)
      {
        return createOptimizerCallAdapter();
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
      public Adapter caseXExpression0(XExpression0 object)
      {
        return createXExpression0Adapter();
      }
      @Override
      public Adapter caseXExpressionM1(XExpressionM1 object)
      {
        return createXExpressionM1Adapter();
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
      public Adapter caseXExpression6(XExpression6 object)
      {
        return createXExpression6Adapter();
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
      public Adapter caseXErrorExpression(XErrorExpression object)
      {
        return createXErrorExpressionAdapter();
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
      public Adapter caseXWhileExpression(XWhileExpression object)
      {
        return createXWhileExpressionAdapter();
      }
      @Override
      public Adapter caseXForExpression(XForExpression object)
      {
        return createXForExpressionAdapter();
      }
      @Override
      public Adapter caseXParenthesizedExpression(XParenthesizedExpression object)
      {
        return createXParenthesizedExpressionAdapter();
      }
      @Override
      public Adapter caseStructTypeDefMember(StructTypeDefMember object)
      {
        return createStructTypeDefMemberAdapter();
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
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseParameterVariable(ParameterVariable object)
      {
        return createParameterVariableAdapter();
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.CompilationUnit
   * @generated
   */
  public Adapter createCompilationUnitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.AnnotationDefinition <em>Annotation Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.AnnotationDefinition
   * @generated
   */
  public Adapter createAnnotationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.Library
   * @generated
   */
  public Adapter createLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.LibraryItem <em>Library Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.LibraryItem
   * @generated
   */
  public Adapter createLibraryItemAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.PointerTypeDef <em>Pointer Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.PointerTypeDef
   * @generated
   */
  public Adapter createPointerTypeDefAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.RefTypeDef <em>Ref Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.RefTypeDef
   * @generated
   */
  public Adapter createRefTypeDefAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.FixedDataTypeDef <em>Fixed Data Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.FixedDataTypeDef
   * @generated
   */
  public Adapter createFixedDataTypeDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.IntegerDataTypeDef <em>Integer Data Type Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.IntegerDataTypeDef
   * @generated
   */
  public Adapter createIntegerDataTypeDefAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OperationSignature <em>Operation Signature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OperationSignature
   * @generated
   */
  public Adapter createOperationSignatureAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.OptimizerCall <em>Optimizer Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.OptimizerCall
   * @generated
   */
  public Adapter createOptimizerCallAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression0 <em>XExpression0</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression0
   * @generated
   */
  public Adapter createXExpression0Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpressionM1 <em>XExpression M1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpressionM1
   * @generated
   */
  public Adapter createXExpressionM1Adapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XExpression6 <em>XExpression6</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XExpression6
   * @generated
   */
  public Adapter createXExpression6Adapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XErrorExpression <em>XError Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XErrorExpression
   * @generated
   */
  public Adapter createXErrorExpressionAdapter()
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
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XWhileExpression <em>XWhile Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XWhileExpression
   * @generated
   */
  public Adapter createXWhileExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hu.e.parser.eSyntax.XForExpression <em>XFor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hu.e.parser.eSyntax.XForExpression
   * @generated
   */
  public Adapter createXForExpressionAdapter()
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

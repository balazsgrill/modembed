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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.e.parser.eSyntax.ESyntaxPackage
 * @generated
 */
public class ESyntaxSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ESyntaxPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ESyntaxSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ESyntaxPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ESyntaxPackage.PACKAGE:
      {
        hu.e.parser.eSyntax.Package package_ = (hu.e.parser.eSyntax.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.TOP_LEVEL_ITEM:
      {
        TopLevelItem topLevelItem = (TopLevelItem)theEObject;
        T result = caseTopLevelItem(topLevelItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseTopLevelItem(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.TYPE_DEF:
      {
        TypeDef typeDef = (TypeDef)theEObject;
        T result = caseTypeDef(typeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.DATA_TYPE_DEF:
      {
        DataTypeDef dataTypeDef = (DataTypeDef)theEObject;
        T result = caseDataTypeDef(dataTypeDef);
        if (result == null) result = caseTypeDef(dataTypeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.ARRAY_TYPE_DEF:
      {
        ArrayTypeDef arrayTypeDef = (ArrayTypeDef)theEObject;
        T result = caseArrayTypeDef(arrayTypeDef);
        if (result == null) result = caseTypeDef(arrayTypeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.STRUCT_TYPE_DEF:
      {
        StructTypeDef structTypeDef = (StructTypeDef)theEObject;
        T result = caseStructTypeDef(structTypeDef);
        if (result == null) result = caseTypeDef(structTypeDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.STRUCT_TYPE_DEF_MEMBER:
      {
        StructTypeDefMember structTypeDefMember = (StructTypeDefMember)theEObject;
        T result = caseStructTypeDefMember(structTypeDefMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseTopLevelItem(variable);
        if (result == null) result = caseOperationStep(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.OPERATION_STEP:
      {
        OperationStep operationStep = (OperationStep)theEObject;
        T result = caseOperationStep(operationStep);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseOperationStep(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.INSTRUCTION_WORD:
      {
        InstructionWord instructionWord = (InstructionWord)theEObject;
        T result = caseInstructionWord(instructionWord);
        if (result == null) result = caseOperationStep(instructionWord);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.WORD_SECTION:
      {
        WordSection wordSection = (WordSection)theEObject;
        T result = caseWordSection(wordSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.LITERAL_VALUE:
      {
        LiteralValue literalValue = (LiteralValue)theEObject;
        T result = caseLiteralValue(literalValue);
        if (result == null) result = caseWordSection(literalValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.LABEL_REFERENCE:
      {
        LabelReference labelReference = (LabelReference)theEObject;
        T result = caseLabelReference(labelReference);
        if (result == null) result = caseWordSection(labelReference);
        if (result == null) result = caseOperationCallParameter(labelReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.VARIABLE_REFERENCE:
      {
        VariableReference variableReference = (VariableReference)theEObject;
        T result = caseVariableReference(variableReference);
        if (result == null) result = caseWordSection(variableReference);
        if (result == null) result = caseXPrimaryExpression(variableReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.VARIABLE_REF_SECTION:
      {
        VariableRefSection variableRefSection = (VariableRefSection)theEObject;
        T result = caseVariableRefSection(variableRefSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.ARRAY_REF:
      {
        ArrayRef arrayRef = (ArrayRef)theEObject;
        T result = caseArrayRef(arrayRef);
        if (result == null) result = caseVariableRefSection(arrayRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.STRUCT_REF:
      {
        StructRef structRef = (StructRef)theEObject;
        T result = caseStructRef(structRef);
        if (result == null) result = caseVariableRefSection(structRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.OPERATION_CALL:
      {
        OperationCall operationCall = (OperationCall)theEObject;
        T result = caseOperationCall(operationCall);
        if (result == null) result = caseOperationStep(operationCall);
        if (result == null) result = caseXPrimaryExpression(operationCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.OPERATION_CALL_PARAMETER:
      {
        OperationCallParameter operationCallParameter = (OperationCallParameter)theEObject;
        T result = caseOperationCallParameter(operationCallParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseTopLevelItem(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.OPERATION_BLOCK:
      {
        OperationBlock operationBlock = (OperationBlock)theEObject;
        T result = caseOperationBlock(operationBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.PARAMETER_VARIABLE:
      {
        ParameterVariable parameterVariable = (ParameterVariable)theEObject;
        T result = caseParameterVariable(parameterVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.OPERATOR_DEFINITION:
      {
        OperatorDefinition operatorDefinition = (OperatorDefinition)theEObject;
        T result = caseOperatorDefinition(operatorDefinition);
        if (result == null) result = caseTopLevelItem(operatorDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.LINKED_BINARY:
      {
        LinkedBinary linkedBinary = (LinkedBinary)theEObject;
        T result = caseLinkedBinary(linkedBinary);
        if (result == null) result = caseTopLevelItem(linkedBinary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.BINARY_SECTION:
      {
        BinarySection binarySection = (BinarySection)theEObject;
        T result = caseBinarySection(binarySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.FUNCTION_BINARY_SECTION:
      {
        FunctionBinarySection functionBinarySection = (FunctionBinarySection)theEObject;
        T result = caseFunctionBinarySection(functionBinarySection);
        if (result == null) result = caseBinarySection(functionBinarySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.FUNCTION_MEMORY:
      {
        FunctionMemory functionMemory = (FunctionMemory)theEObject;
        T result = caseFunctionMemory(functionMemory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.CONSTANT_BINARY_SECTION:
      {
        ConstantBinarySection constantBinarySection = (ConstantBinarySection)theEObject;
        T result = caseConstantBinarySection(constantBinarySection);
        if (result == null) result = caseBinarySection(constantBinarySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.REFERENCE_BINARY_SECTION:
      {
        ReferenceBinarySection referenceBinarySection = (ReferenceBinarySection)theEObject;
        T result = caseReferenceBinarySection(referenceBinarySection);
        if (result == null) result = caseBinarySection(referenceBinarySection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION:
      {
        XExpression xExpression = (XExpression)theEObject;
        T result = caseXExpression(xExpression);
        if (result == null) result = caseOperationCallParameter(xExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XPRIMARY_EXPRESSION:
      {
        XPrimaryExpression xPrimaryExpression = (XPrimaryExpression)theEObject;
        T result = caseXPrimaryExpression(xPrimaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XSIZE_OF_EXPRESSION:
      {
        XSizeOfExpression xSizeOfExpression = (XSizeOfExpression)theEObject;
        T result = caseXSizeOfExpression(xSizeOfExpression);
        if (result == null) result = caseXPrimaryExpression(xSizeOfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XSTRUCT_EXPRESSION:
      {
        XStructExpression xStructExpression = (XStructExpression)theEObject;
        T result = caseXStructExpression(xStructExpression);
        if (result == null) result = caseXPrimaryExpression(xStructExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION1:
      {
        XExpression1 xExpression1 = (XExpression1)theEObject;
        T result = caseXExpression1(xExpression1);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION2:
      {
        XExpression2 xExpression2 = (XExpression2)theEObject;
        T result = caseXExpression2(xExpression2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION3:
      {
        XExpression3 xExpression3 = (XExpression3)theEObject;
        T result = caseXExpression3(xExpression3);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION4:
      {
        XExpression4 xExpression4 = (XExpression4)theEObject;
        T result = caseXExpression4(xExpression4);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION5:
      {
        XExpression5 xExpression5 = (XExpression5)theEObject;
        T result = caseXExpression5(xExpression5);
        if (result == null) result = caseXExpression(xExpression5);
        if (result == null) result = caseOperationCallParameter(xExpression5);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XEXPRESSION_LITERAL:
      {
        XExpressionLiteral xExpressionLiteral = (XExpressionLiteral)theEObject;
        T result = caseXExpressionLiteral(xExpressionLiteral);
        if (result == null) result = caseXPrimaryExpression(xExpressionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XTOP_LEVEL_EXPRESSION:
      {
        XTopLevelExpression xTopLevelExpression = (XTopLevelExpression)theEObject;
        T result = caseXTopLevelExpression(xTopLevelExpression);
        if (result == null) result = caseOperationStep(xTopLevelExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XASSIGNMENT:
      {
        XAssignment xAssignment = (XAssignment)theEObject;
        T result = caseXAssignment(xAssignment);
        if (result == null) result = caseXTopLevelExpression(xAssignment);
        if (result == null) result = caseOperationStep(xAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XADDRESS_OF_VAR:
      {
        XAddressOfVar xAddressOfVar = (XAddressOfVar)theEObject;
        T result = caseXAddressOfVar(xAddressOfVar);
        if (result == null) result = caseXPrimaryExpression(xAddressOfVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XIS_LITERAL_EXPRESSION:
      {
        XIsLiteralExpression xIsLiteralExpression = (XIsLiteralExpression)theEObject;
        T result = caseXIsLiteralExpression(xIsLiteralExpression);
        if (result == null) result = caseXPrimaryExpression(xIsLiteralExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XIF_EXPRESSION:
      {
        XIfExpression xIfExpression = (XIfExpression)theEObject;
        T result = caseXIfExpression(xIfExpression);
        if (result == null) result = caseXTopLevelExpression(xIfExpression);
        if (result == null) result = caseOperationStep(xIfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.XPARENTHESIZED_EXPRESSION:
      {
        XParenthesizedExpression xParenthesizedExpression = (XParenthesizedExpression)theEObject;
        T result = caseXParenthesizedExpression(xParenthesizedExpression);
        if (result == null) result = caseXPrimaryExpression(xParenthesizedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.CONSTANT_VARIABLE:
      {
        ConstantVariable constantVariable = (ConstantVariable)theEObject;
        T result = caseConstantVariable(constantVariable);
        if (result == null) result = caseVariable(constantVariable);
        if (result == null) result = caseTopLevelItem(constantVariable);
        if (result == null) result = caseOperationStep(constantVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.REGISTER_VARIABLE:
      {
        RegisterVariable registerVariable = (RegisterVariable)theEObject;
        T result = caseRegisterVariable(registerVariable);
        if (result == null) result = caseVariable(registerVariable);
        if (result == null) result = caseTopLevelItem(registerVariable);
        if (result == null) result = caseOperationStep(registerVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ESyntaxPackage.COMPILE_CONTEXT_VARIABLE:
      {
        CompileContextVariable compileContextVariable = (CompileContextVariable)theEObject;
        T result = caseCompileContextVariable(compileContextVariable);
        if (result == null) result = caseVariable(compileContextVariable);
        if (result == null) result = caseTopLevelItem(compileContextVariable);
        if (result == null) result = caseOperationStep(compileContextVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(hu.e.parser.eSyntax.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Top Level Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Top Level Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTopLevelItem(TopLevelItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDef(TypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeDef(DataTypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayTypeDef(ArrayTypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Type Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Type Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructTypeDef(StructTypeDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Type Def Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Type Def Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructTypeDefMember(StructTypeDefMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationStep(OperationStep object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instruction Word</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instruction Word</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructionWord(InstructionWord object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Word Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Word Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWordSection(WordSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralValue(LiteralValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelReference(LabelReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableReference(VariableReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Ref Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Ref Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableRefSection(VariableRefSection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayRef(ArrayRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructRef(StructRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationCall(OperationCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Call Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationCallParameter(OperationCallParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationBlock(OperationBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterVariable(ParameterVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operator Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operator Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperatorDefinition(OperatorDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linked Binary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linked Binary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinkedBinary(LinkedBinary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binary Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binary Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinarySection(BinarySection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Binary Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Binary Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBinarySection(FunctionBinarySection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Memory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Memory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionMemory(FunctionMemory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Binary Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Binary Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantBinarySection(ConstantBinarySection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Binary Section</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Binary Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceBinarySection(ReferenceBinarySection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XPrimary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XPrimary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXPrimaryExpression(XPrimaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XSize Of Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XSize Of Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXSizeOfExpression(XSizeOfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XStruct Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XStruct Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXStructExpression(XStructExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression1</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression1</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression1(XExpression1 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression2(XExpression2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression3</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression3</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression3(XExpression3 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression4</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression4</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression4(XExpression4 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression5</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression5</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression5(XExpression5 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XExpression Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpressionLiteral(XExpressionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XTop Level Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XTop Level Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXTopLevelExpression(XTopLevelExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XAssignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XAssignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXAssignment(XAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XAddress Of Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XAddress Of Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXAddressOfVar(XAddressOfVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XIs Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XIs Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXIsLiteralExpression(XIsLiteralExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XIf Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XIf Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXIfExpression(XIfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XParenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XParenthesized Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXParenthesizedExpression(XParenthesizedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantVariable(ConstantVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Register Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Register Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegisterVariable(RegisterVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compile Context Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compile Context Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompileContextVariable(CompileContextVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ESyntaxSwitch
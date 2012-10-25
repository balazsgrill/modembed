/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ESyntaxFactoryImpl extends EFactoryImpl implements ESyntaxFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ESyntaxFactory init()
  {
    try
    {
      ESyntaxFactory theESyntaxFactory = (ESyntaxFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.e.hu/parser/ESyntax"); 
      if (theESyntaxFactory != null)
      {
        return theESyntaxFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ESyntaxFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ESyntaxFactoryImpl()
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
      case ESyntaxPackage.COMPILATION_UNIT: return createCompilationUnit();
      case ESyntaxPackage.ANNOTATION_DEFINITION: return createAnnotationDefinition();
      case ESyntaxPackage.ANNOTATION: return createAnnotation();
      case ESyntaxPackage.LIBRARY: return createLibrary();
      case ESyntaxPackage.LIBRARY_ITEM: return createLibraryItem();
      case ESyntaxPackage.TYPE: return createType();
      case ESyntaxPackage.TYPE_DEF: return createTypeDef();
      case ESyntaxPackage.POINTER_TYPE_DEF: return createPointerTypeDef();
      case ESyntaxPackage.ARRAY_TYPE_DEF: return createArrayTypeDef();
      case ESyntaxPackage.REF_TYPE_DEF: return createRefTypeDef();
      case ESyntaxPackage.DATA_TYPE_DEF: return createDataTypeDef();
      case ESyntaxPackage.FIXED_DATA_TYPE_DEF: return createFixedDataTypeDef();
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF: return createIntegerDataTypeDef();
      case ESyntaxPackage.STRUCT_TYPE_DEF: return createStructTypeDef();
      case ESyntaxPackage.VARIABLE: return createVariable();
      case ESyntaxPackage.OPERATION_STEP: return createOperationStep();
      case ESyntaxPackage.VARIABLE_REFERENCE: return createVariableReference();
      case ESyntaxPackage.OPERATION_CALL: return createOperationCall();
      case ESyntaxPackage.OPERATION_CALL_PARAMETER: return createOperationCallParameter();
      case ESyntaxPackage.OPERATION_SIGNATURE: return createOperationSignature();
      case ESyntaxPackage.OPERATION_BLOCK: return createOperationBlock();
      case ESyntaxPackage.XEXPRESSION: return createXExpression();
      case ESyntaxPackage.XPRIMARY_EXPRESSION: return createXPrimaryExpression();
      case ESyntaxPackage.XSIZE_OF_EXPRESSION: return createXSizeOfExpression();
      case ESyntaxPackage.XSTRUCT_EXPRESSION: return createXStructExpression();
      case ESyntaxPackage.XEXPRESSION1: return createXExpression1();
      case ESyntaxPackage.XEXPRESSION0: return createXExpression0();
      case ESyntaxPackage.XEXPRESSION_M1: return createXExpressionM1();
      case ESyntaxPackage.XEXPRESSION2: return createXExpression2();
      case ESyntaxPackage.XEXPRESSION3: return createXExpression3();
      case ESyntaxPackage.XEXPRESSION4: return createXExpression4();
      case ESyntaxPackage.XEXPRESSION5: return createXExpression5();
      case ESyntaxPackage.XEXPRESSION6: return createXExpression6();
      case ESyntaxPackage.XEXPRESSION_LITERAL: return createXExpressionLiteral();
      case ESyntaxPackage.XTOP_LEVEL_EXPRESSION: return createXTopLevelExpression();
      case ESyntaxPackage.XERROR_EXPRESSION: return createXErrorExpression();
      case ESyntaxPackage.XIS_LITERAL_EXPRESSION: return createXIsLiteralExpression();
      case ESyntaxPackage.XPARENTHESIZED_EXPRESSION: return createXParenthesizedExpression();
      case ESyntaxPackage.STRUCT_TYPE_DEF_MEMBER: return createStructTypeDefMember();
      case ESyntaxPackage.CONSTANT_VARIABLE: return createConstantVariable();
      case ESyntaxPackage.REGISTER_VARIABLE: return createRegisterVariable();
      case ESyntaxPackage.LABEL: return createLabel();
      case ESyntaxPackage.OPERATION: return createOperation();
      case ESyntaxPackage.PARAMETER_VARIABLE: return createParameterVariable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ESyntaxPackage.INTEGER_KIND:
        return createIntegerKindFromString(eDataType, initialValue);
      case ESyntaxPackage.PARAMETER_KIND:
        return createParameterKindFromString(eDataType, initialValue);
      case ESyntaxPackage.UNARY_OPERATOR:
        return createUNARY_OPERATORFromString(eDataType, initialValue);
      case ESyntaxPackage.MULTIPLICATIVE_OPERATOR:
        return createMULTIPLICATIVE_OPERATORFromString(eDataType, initialValue);
      case ESyntaxPackage.ADDITIVE_OPERATOR:
        return createADDITIVE_OPERATORFromString(eDataType, initialValue);
      case ESyntaxPackage.EQUALITY_OPERATOR:
        return createEQUALITY_OPERATORFromString(eDataType, initialValue);
      case ESyntaxPackage.BOOLEAN_OPERATOR:
        return createBOOLEAN_OPERATORFromString(eDataType, initialValue);
      case ESyntaxPackage.ERROR_LEVELS:
        return createErrorLevelsFromString(eDataType, initialValue);
      case ESyntaxPackage.OP_SINGLE_ASSIGN:
        return createOpSingleAssignFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ESyntaxPackage.INTEGER_KIND:
        return convertIntegerKindToString(eDataType, instanceValue);
      case ESyntaxPackage.PARAMETER_KIND:
        return convertParameterKindToString(eDataType, instanceValue);
      case ESyntaxPackage.UNARY_OPERATOR:
        return convertUNARY_OPERATORToString(eDataType, instanceValue);
      case ESyntaxPackage.MULTIPLICATIVE_OPERATOR:
        return convertMULTIPLICATIVE_OPERATORToString(eDataType, instanceValue);
      case ESyntaxPackage.ADDITIVE_OPERATOR:
        return convertADDITIVE_OPERATORToString(eDataType, instanceValue);
      case ESyntaxPackage.EQUALITY_OPERATOR:
        return convertEQUALITY_OPERATORToString(eDataType, instanceValue);
      case ESyntaxPackage.BOOLEAN_OPERATOR:
        return convertBOOLEAN_OPERATORToString(eDataType, instanceValue);
      case ESyntaxPackage.ERROR_LEVELS:
        return convertErrorLevelsToString(eDataType, instanceValue);
      case ESyntaxPackage.OP_SINGLE_ASSIGN:
        return convertOpSingleAssignToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilationUnit createCompilationUnit()
  {
    CompilationUnitImpl compilationUnit = new CompilationUnitImpl();
    return compilationUnit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationDefinition createAnnotationDefinition()
  {
    AnnotationDefinitionImpl annotationDefinition = new AnnotationDefinitionImpl();
    return annotationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Library createLibrary()
  {
    LibraryImpl library = new LibraryImpl();
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibraryItem createLibraryItem()
  {
    LibraryItemImpl libraryItem = new LibraryItemImpl();
    return libraryItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef createTypeDef()
  {
    TypeDefImpl typeDef = new TypeDefImpl();
    return typeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerTypeDef createPointerTypeDef()
  {
    PointerTypeDefImpl pointerTypeDef = new PointerTypeDefImpl();
    return pointerTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayTypeDef createArrayTypeDef()
  {
    ArrayTypeDefImpl arrayTypeDef = new ArrayTypeDefImpl();
    return arrayTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefTypeDef createRefTypeDef()
  {
    RefTypeDefImpl refTypeDef = new RefTypeDefImpl();
    return refTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDef createDataTypeDef()
  {
    DataTypeDefImpl dataTypeDef = new DataTypeDefImpl();
    return dataTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FixedDataTypeDef createFixedDataTypeDef()
  {
    FixedDataTypeDefImpl fixedDataTypeDef = new FixedDataTypeDefImpl();
    return fixedDataTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerDataTypeDef createIntegerDataTypeDef()
  {
    IntegerDataTypeDefImpl integerDataTypeDef = new IntegerDataTypeDefImpl();
    return integerDataTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructTypeDef createStructTypeDef()
  {
    StructTypeDefImpl structTypeDef = new StructTypeDefImpl();
    return structTypeDef;
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
  public OperationStep createOperationStep()
  {
    OperationStepImpl operationStep = new OperationStepImpl();
    return operationStep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationCall createOperationCall()
  {
    OperationCallImpl operationCall = new OperationCallImpl();
    return operationCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationCallParameter createOperationCallParameter()
  {
    OperationCallParameterImpl operationCallParameter = new OperationCallParameterImpl();
    return operationCallParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationSignature createOperationSignature()
  {
    OperationSignatureImpl operationSignature = new OperationSignatureImpl();
    return operationSignature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationBlock createOperationBlock()
  {
    OperationBlockImpl operationBlock = new OperationBlockImpl();
    return operationBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression createXExpression()
  {
    XExpressionImpl xExpression = new XExpressionImpl();
    return xExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XPrimaryExpression createXPrimaryExpression()
  {
    XPrimaryExpressionImpl xPrimaryExpression = new XPrimaryExpressionImpl();
    return xPrimaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSizeOfExpression createXSizeOfExpression()
  {
    XSizeOfExpressionImpl xSizeOfExpression = new XSizeOfExpressionImpl();
    return xSizeOfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XStructExpression createXStructExpression()
  {
    XStructExpressionImpl xStructExpression = new XStructExpressionImpl();
    return xStructExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression1 createXExpression1()
  {
    XExpression1Impl xExpression1 = new XExpression1Impl();
    return xExpression1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression0 createXExpression0()
  {
    XExpression0Impl xExpression0 = new XExpression0Impl();
    return xExpression0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpressionM1 createXExpressionM1()
  {
    XExpressionM1Impl xExpressionM1 = new XExpressionM1Impl();
    return xExpressionM1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression2 createXExpression2()
  {
    XExpression2Impl xExpression2 = new XExpression2Impl();
    return xExpression2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression3 createXExpression3()
  {
    XExpression3Impl xExpression3 = new XExpression3Impl();
    return xExpression3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression4 createXExpression4()
  {
    XExpression4Impl xExpression4 = new XExpression4Impl();
    return xExpression4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression5 createXExpression5()
  {
    XExpression5Impl xExpression5 = new XExpression5Impl();
    return xExpression5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression6 createXExpression6()
  {
    XExpression6Impl xExpression6 = new XExpression6Impl();
    return xExpression6;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpressionLiteral createXExpressionLiteral()
  {
    XExpressionLiteralImpl xExpressionLiteral = new XExpressionLiteralImpl();
    return xExpressionLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XTopLevelExpression createXTopLevelExpression()
  {
    XTopLevelExpressionImpl xTopLevelExpression = new XTopLevelExpressionImpl();
    return xTopLevelExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XErrorExpression createXErrorExpression()
  {
    XErrorExpressionImpl xErrorExpression = new XErrorExpressionImpl();
    return xErrorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XIsLiteralExpression createXIsLiteralExpression()
  {
    XIsLiteralExpressionImpl xIsLiteralExpression = new XIsLiteralExpressionImpl();
    return xIsLiteralExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XParenthesizedExpression createXParenthesizedExpression()
  {
    XParenthesizedExpressionImpl xParenthesizedExpression = new XParenthesizedExpressionImpl();
    return xParenthesizedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructTypeDefMember createStructTypeDefMember()
  {
    StructTypeDefMemberImpl structTypeDefMember = new StructTypeDefMemberImpl();
    return structTypeDefMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantVariable createConstantVariable()
  {
    ConstantVariableImpl constantVariable = new ConstantVariableImpl();
    return constantVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegisterVariable createRegisterVariable()
  {
    RegisterVariableImpl registerVariable = new RegisterVariableImpl();
    return registerVariable;
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
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterVariable createParameterVariable()
  {
    ParameterVariableImpl parameterVariable = new ParameterVariableImpl();
    return parameterVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerKind createIntegerKindFromString(EDataType eDataType, String initialValue)
  {
    IntegerKind result = IntegerKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntegerKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue)
  {
    ParameterKind result = ParameterKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UNARY_OPERATOR createUNARY_OPERATORFromString(EDataType eDataType, String initialValue)
  {
    UNARY_OPERATOR result = UNARY_OPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUNARY_OPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MULTIPLICATIVE_OPERATOR createMULTIPLICATIVE_OPERATORFromString(EDataType eDataType, String initialValue)
  {
    MULTIPLICATIVE_OPERATOR result = MULTIPLICATIVE_OPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMULTIPLICATIVE_OPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADDITIVE_OPERATOR createADDITIVE_OPERATORFromString(EDataType eDataType, String initialValue)
  {
    ADDITIVE_OPERATOR result = ADDITIVE_OPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertADDITIVE_OPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQUALITY_OPERATOR createEQUALITY_OPERATORFromString(EDataType eDataType, String initialValue)
  {
    EQUALITY_OPERATOR result = EQUALITY_OPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEQUALITY_OPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOLEAN_OPERATOR createBOOLEAN_OPERATORFromString(EDataType eDataType, String initialValue)
  {
    BOOLEAN_OPERATOR result = BOOLEAN_OPERATOR.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBOOLEAN_OPERATORToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorLevels createErrorLevelsFromString(EDataType eDataType, String initialValue)
  {
    ErrorLevels result = ErrorLevels.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertErrorLevelsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpSingleAssign createOpSingleAssignFromString(EDataType eDataType, String initialValue)
  {
    OpSingleAssign result = OpSingleAssign.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOpSingleAssignToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ESyntaxPackage getESyntaxPackage()
  {
    return (ESyntaxPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ESyntaxPackage getPackage()
  {
    return ESyntaxPackage.eINSTANCE;
  }

} //ESyntaxFactoryImpl

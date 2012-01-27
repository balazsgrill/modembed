/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ADDITIVE_OPERATOR;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.BOOLEAN_OPERATOR;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.BinaryType;
import hu.e.parser.eSyntax.ClassItem;
import hu.e.parser.eSyntax.CompilationUnit;
import hu.e.parser.eSyntax.CompileContextVariable;
import hu.e.parser.eSyntax.ConfigVariable;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.EQUALITY_OPERATOR;
import hu.e.parser.eSyntax.ESyntaxFactory;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.InstanceConfig;
import hu.e.parser.eSyntax.InstanceReference;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.LinkedInstance;
import hu.e.parser.eSyntax.LiteralValue;
import hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.PrimitiveKind;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.ReferenceLink;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.UNARY_OPERATOR;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.WordSection;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XExpression0;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpression6;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XExpressionM1;
import hu.e.parser.eSyntax.XIfExpression;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XPrimaryExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;
import hu.e.parser.eSyntax.XTopLevelExpression;
import hu.e.parser.eSyntax.XWhileExpression;

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
      case ESyntaxPackage.PACKAGE: return createPackage();
      case ESyntaxPackage.COMPILATION_UNIT: return createCompilationUnit();
      case ESyntaxPackage.CLASS: return createClass();
      case ESyntaxPackage.CLASS_ITEM: return createClassItem();
      case ESyntaxPackage.INSTANCE_REFERENCE: return createInstanceReference();
      case ESyntaxPackage.VARIABLE: return createVariable();
      case ESyntaxPackage.LIBRARY: return createLibrary();
      case ESyntaxPackage.LIBRARY_ITEM: return createLibraryItem();
      case ESyntaxPackage.TYPE: return createType();
      case ESyntaxPackage.TYPE_DEF: return createTypeDef();
      case ESyntaxPackage.POINTER_TYPE_DEF: return createPointerTypeDef();
      case ESyntaxPackage.ARRAY_TYPE_DEF: return createArrayTypeDef();
      case ESyntaxPackage.REF_TYPE_DEF: return createRefTypeDef();
      case ESyntaxPackage.DATA_TYPE_DEF: return createDataTypeDef();
      case ESyntaxPackage.STRUCT_TYPE_DEF: return createStructTypeDef();
      case ESyntaxPackage.OPERATION_STEP: return createOperationStep();
      case ESyntaxPackage.INSTRUCTION_WORD: return createInstructionWord();
      case ESyntaxPackage.WORD_SECTION: return createWordSection();
      case ESyntaxPackage.LITERAL_VALUE: return createLiteralValue();
      case ESyntaxPackage.VARIABLE_REFERENCE: return createVariableReference();
      case ESyntaxPackage.OPERATION_CALL: return createOperationCall();
      case ESyntaxPackage.OPERATION_CALL_PARAMETER: return createOperationCallParameter();
      case ESyntaxPackage.OPERATION_BLOCK: return createOperationBlock();
      case ESyntaxPackage.OPERATOR_DEFINITION: return createOperatorDefinition();
      case ESyntaxPackage.LINKED_BINARY: return createLinkedBinary();
      case ESyntaxPackage.BINARY_SECTION: return createBinarySection();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION: return createFunctionBinarySection();
      case ESyntaxPackage.LINKED_INSTANCE: return createLinkedInstance();
      case ESyntaxPackage.REFERENCE_LINK: return createReferenceLink();
      case ESyntaxPackage.INSTANCE_CONFIG: return createInstanceConfig();
      case ESyntaxPackage.FUNCTION_MEMORY: return createFunctionMemory();
      case ESyntaxPackage.CONSTANT_BINARY_SECTION: return createConstantBinarySection();
      case ESyntaxPackage.REFERENCE_BINARY_SECTION: return createReferenceBinarySection();
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
      case ESyntaxPackage.XIS_LITERAL_EXPRESSION: return createXIsLiteralExpression();
      case ESyntaxPackage.XIF_EXPRESSION: return createXIfExpression();
      case ESyntaxPackage.XWHILE_EXPRESSION: return createXWhileExpression();
      case ESyntaxPackage.XPARENTHESIZED_EXPRESSION: return createXParenthesizedExpression();
      case ESyntaxPackage.CONFIG_VARIABLE: return createConfigVariable();
      case ESyntaxPackage.STRUCT_TYPE_DEF_MEMBER: return createStructTypeDefMember();
      case ESyntaxPackage.CONSTANT_VARIABLE: return createConstantVariable();
      case ESyntaxPackage.REGISTER_VARIABLE: return createRegisterVariable();
      case ESyntaxPackage.COMPILE_CONTEXT_VARIABLE: return createCompileContextVariable();
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
      case ESyntaxPackage.PRIMITIVE_KIND:
        return createPrimitiveKindFromString(eDataType, initialValue);
      case ESyntaxPackage.PARAMETER_KIND:
        return createParameterKindFromString(eDataType, initialValue);
      case ESyntaxPackage.OPERATION_ROLE:
        return createOperationRoleFromString(eDataType, initialValue);
      case ESyntaxPackage.BINARY_TYPE:
        return createBinaryTypeFromString(eDataType, initialValue);
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
      case ESyntaxPackage.PRIMITIVE_KIND:
        return convertPrimitiveKindToString(eDataType, instanceValue);
      case ESyntaxPackage.PARAMETER_KIND:
        return convertParameterKindToString(eDataType, instanceValue);
      case ESyntaxPackage.OPERATION_ROLE:
        return convertOperationRoleToString(eDataType, instanceValue);
      case ESyntaxPackage.BINARY_TYPE:
        return convertBinaryTypeToString(eDataType, instanceValue);
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
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public hu.e.parser.eSyntax.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
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
  public hu.e.parser.eSyntax.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassItem createClassItem()
  {
    ClassItemImpl classItem = new ClassItemImpl();
    return classItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceReference createInstanceReference()
  {
    InstanceReferenceImpl instanceReference = new InstanceReferenceImpl();
    return instanceReference;
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
  public InstructionWord createInstructionWord()
  {
    InstructionWordImpl instructionWord = new InstructionWordImpl();
    return instructionWord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WordSection createWordSection()
  {
    WordSectionImpl wordSection = new WordSectionImpl();
    return wordSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralValue createLiteralValue()
  {
    LiteralValueImpl literalValue = new LiteralValueImpl();
    return literalValue;
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
  public OperatorDefinition createOperatorDefinition()
  {
    OperatorDefinitionImpl operatorDefinition = new OperatorDefinitionImpl();
    return operatorDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedBinary createLinkedBinary()
  {
    LinkedBinaryImpl linkedBinary = new LinkedBinaryImpl();
    return linkedBinary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinarySection createBinarySection()
  {
    BinarySectionImpl binarySection = new BinarySectionImpl();
    return binarySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBinarySection createFunctionBinarySection()
  {
    FunctionBinarySectionImpl functionBinarySection = new FunctionBinarySectionImpl();
    return functionBinarySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedInstance createLinkedInstance()
  {
    LinkedInstanceImpl linkedInstance = new LinkedInstanceImpl();
    return linkedInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceLink createReferenceLink()
  {
    ReferenceLinkImpl referenceLink = new ReferenceLinkImpl();
    return referenceLink;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceConfig createInstanceConfig()
  {
    InstanceConfigImpl instanceConfig = new InstanceConfigImpl();
    return instanceConfig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionMemory createFunctionMemory()
  {
    FunctionMemoryImpl functionMemory = new FunctionMemoryImpl();
    return functionMemory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantBinarySection createConstantBinarySection()
  {
    ConstantBinarySectionImpl constantBinarySection = new ConstantBinarySectionImpl();
    return constantBinarySection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceBinarySection createReferenceBinarySection()
  {
    ReferenceBinarySectionImpl referenceBinarySection = new ReferenceBinarySectionImpl();
    return referenceBinarySection;
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
  public XIfExpression createXIfExpression()
  {
    XIfExpressionImpl xIfExpression = new XIfExpressionImpl();
    return xIfExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XWhileExpression createXWhileExpression()
  {
    XWhileExpressionImpl xWhileExpression = new XWhileExpressionImpl();
    return xWhileExpression;
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
  public ConfigVariable createConfigVariable()
  {
    ConfigVariableImpl configVariable = new ConfigVariableImpl();
    return configVariable;
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
  public CompileContextVariable createCompileContextVariable()
  {
    CompileContextVariableImpl compileContextVariable = new CompileContextVariableImpl();
    return compileContextVariable;
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
  public PrimitiveKind createPrimitiveKindFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveKind result = PrimitiveKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveKindToString(EDataType eDataType, Object instanceValue)
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
  public OperationRole createOperationRoleFromString(EDataType eDataType, String initialValue)
  {
    OperationRole result = OperationRole.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOperationRoleToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryType createBinaryTypeFromString(EDataType eDataType, String initialValue)
  {
    BinaryType result = BinaryType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue)
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

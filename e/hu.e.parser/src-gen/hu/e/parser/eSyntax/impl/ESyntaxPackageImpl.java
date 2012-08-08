/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.Annotation;
import hu.e.parser.eSyntax.AnnotationDefinition;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.BinaryType;
import hu.e.parser.eSyntax.CompilationUnit;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.ESyntaxFactory;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.ErrorLevels;
import hu.e.parser.eSyntax.FixedDataTypeDef;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.IntegerDataTypeDef;
import hu.e.parser.eSyntax.IntegerKind;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.LiteralValue;
import hu.e.parser.eSyntax.OpSingleAssign;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperationSignature;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.OptimizerCall;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.WordSection;
import hu.e.parser.eSyntax.XErrorExpression;
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
import hu.e.parser.eSyntax.XForExpression;
import hu.e.parser.eSyntax.XIfExpression;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XPrimaryExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;
import hu.e.parser.eSyntax.XTopLevelExpression;
import hu.e.parser.eSyntax.XWhileExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ESyntaxPackageImpl extends EPackageImpl implements ESyntaxPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilationUnitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass libraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass libraryItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointerTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fixedDataTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerDataTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationStepEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionWordEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wordSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationCallParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkedBinaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binarySectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBinarySectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optimizerCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionMemoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantBinarySectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceBinarySectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xPrimaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSizeOfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xStructExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression0EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpressionM1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpression6EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpressionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xTopLevelExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xErrorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xIsLiteralExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xIfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xWhileExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xForExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xParenthesizedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structTypeDefMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass registerVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum integerKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum operationRoleEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unarY_OPERATOREEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicativE_OPERATOREEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum additivE_OPERATOREEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum equalitY_OPERATOREEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleaN_OPERATOREEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum errorLevelsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum opSingleAssignEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see hu.e.parser.eSyntax.ESyntaxPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ESyntaxPackageImpl()
  {
    super(eNS_URI, ESyntaxFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ESyntaxPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ESyntaxPackage init()
  {
    if (isInited) return (ESyntaxPackage)EPackage.Registry.INSTANCE.getEPackage(ESyntaxPackage.eNS_URI);

    // Obtain or create and register package
    ESyntaxPackageImpl theESyntaxPackage = (ESyntaxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ESyntaxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ESyntaxPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theESyntaxPackage.createPackageContents();

    // Initialize created meta-data
    theESyntaxPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theESyntaxPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ESyntaxPackage.eNS_URI, theESyntaxPackage);
    return theESyntaxPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilationUnit()
  {
    return compilationUnitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompilationUnit_Name()
  {
    return (EAttribute)compilationUnitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilationUnit_Use()
  {
    return (EReference)compilationUnitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationDefinition()
  {
    return annotationDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationDefinition_Name()
  {
    return (EAttribute)annotationDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_Definition()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibrary()
  {
    return libraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLibrary_Overrides()
  {
    return (EReference)libraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLibrary_Items()
  {
    return (EReference)libraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLibraryItem()
  {
    return libraryItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Def()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDef()
  {
    return typeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointerTypeDef()
  {
    return pointerTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointerTypeDef_Def()
  {
    return (EReference)pointerTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayTypeDef()
  {
    return arrayTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayTypeDef_Size()
  {
    return (EReference)arrayTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayTypeDef_Def()
  {
    return (EReference)arrayTypeDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefTypeDef()
  {
    return refTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefTypeDef_Type()
  {
    return (EReference)refTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeDef()
  {
    return dataTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeDef_Bits()
  {
    return (EAttribute)dataTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFixedDataTypeDef()
  {
    return fixedDataTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFixedDataTypeDef_Scale()
  {
    return (EAttribute)fixedDataTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerDataTypeDef()
  {
    return integerDataTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerDataTypeDef_Kind()
  {
    return (EAttribute)integerDataTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructTypeDef()
  {
    return structTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructTypeDef_Members()
  {
    return (EReference)structTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Type()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationStep()
  {
    return operationStepEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionWord()
  {
    return instructionWordEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstructionWord_Sections()
  {
    return (EReference)instructionWordEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWordSection()
  {
    return wordSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWordSection_Size()
  {
    return (EAttribute)wordSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWordSection_Shift()
  {
    return (EAttribute)wordSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralValue()
  {
    return literalValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralValue_Value()
  {
    return (EAttribute)literalValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableReference()
  {
    return variableReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariableReference_Var()
  {
    return (EReference)variableReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCall()
  {
    return operationCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCall_Operation()
  {
    return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCall_Params()
  {
    return (EReference)operationCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCallParameter()
  {
    return operationCallParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationSignature()
  {
    return operationSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationSignature_Params()
  {
    return (EReference)operationSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationBlock()
  {
    return operationBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationBlock_Steps()
  {
    return (EReference)operationBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperatorDefinition()
  {
    return operatorDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperatorDefinition_Role()
  {
    return (EAttribute)operatorDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperatorDefinition_Candidate()
  {
    return (EReference)operatorDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinkedBinary()
  {
    return linkedBinaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkedBinary_Type()
  {
    return (EAttribute)linkedBinaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkedBinary_Sections()
  {
    return (EReference)linkedBinaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinarySection()
  {
    return binarySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinarySection_Start()
  {
    return (EReference)binarySectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinarySection_Width()
  {
    return (EAttribute)binarySectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBinarySection()
  {
    return functionBinarySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionBinarySection_Name()
  {
    return (EAttribute)functionBinarySectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionBinarySection_StartAddr()
  {
    return (EAttribute)functionBinarySectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionBinarySection_Memwidth()
  {
    return (EAttribute)functionBinarySectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_PointerType()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_AddressType()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_Mems()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_Optimizercalls()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_Lib()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_Do()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptimizerCall()
  {
    return optimizerCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptimizerCall_Optimizer()
  {
    return (EAttribute)optimizerCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionMemory()
  {
    return functionMemoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionMemory_Start()
  {
    return (EAttribute)functionMemoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionMemory_End()
  {
    return (EAttribute)functionMemoryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantBinarySection()
  {
    return constantBinarySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantBinarySection_Data()
  {
    return (EReference)constantBinarySectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceBinarySection()
  {
    return referenceBinarySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceBinarySection_Inc()
  {
    return (EReference)referenceBinarySectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression()
  {
    return xExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXPrimaryExpression()
  {
    return xPrimaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSizeOfExpression()
  {
    return xSizeOfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSizeOfExpression_Type()
  {
    return (EReference)xSizeOfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXStructExpression()
  {
    return xStructExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXStructExpression_Type()
  {
    return (EReference)xStructExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXStructExpression_Values()
  {
    return (EReference)xStructExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression1()
  {
    return xExpression1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression1_Operator()
  {
    return (EAttribute)xExpression1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression1_A()
  {
    return (EReference)xExpression1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression0()
  {
    return xExpression0EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression0_A()
  {
    return (EReference)xExpression0EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression0_Member()
  {
    return (EAttribute)xExpression0EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpressionM1()
  {
    return xExpressionM1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpressionM1_A()
  {
    return (EReference)xExpressionM1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpressionM1_Index()
  {
    return (EReference)xExpressionM1EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression2()
  {
    return xExpression2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression2_A()
  {
    return (EReference)xExpression2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression2_Op()
  {
    return (EAttribute)xExpression2EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression2_B()
  {
    return (EReference)xExpression2EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression3()
  {
    return xExpression3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression3_A()
  {
    return (EReference)xExpression3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression3_Op()
  {
    return (EAttribute)xExpression3EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression3_B()
  {
    return (EReference)xExpression3EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression4()
  {
    return xExpression4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression4_A()
  {
    return (EReference)xExpression4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression4_Op()
  {
    return (EAttribute)xExpression4EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression4_B()
  {
    return (EReference)xExpression4EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression5()
  {
    return xExpression5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression5_A()
  {
    return (EReference)xExpression5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression5_Op()
  {
    return (EAttribute)xExpression5EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression5_B()
  {
    return (EReference)xExpression5EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression6()
  {
    return xExpression6EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression6_Type()
  {
    return (EReference)xExpression6EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression6_Ref()
  {
    return (EReference)xExpression6EClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpression6_Op()
  {
    return (EAttribute)xExpression6EClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXExpression6_A()
  {
    return (EReference)xExpression6EClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpressionLiteral()
  {
    return xExpressionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXExpressionLiteral_Value()
  {
    return (EAttribute)xExpressionLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXTopLevelExpression()
  {
    return xTopLevelExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXErrorExpression()
  {
    return xErrorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXErrorExpression_Level()
  {
    return (EAttribute)xErrorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXErrorExpression_Msg()
  {
    return (EAttribute)xErrorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXIsLiteralExpression()
  {
    return xIsLiteralExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIsLiteralExpression_Ref()
  {
    return (EReference)xIsLiteralExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXIfExpression()
  {
    return xIfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_If()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Then()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Else()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXWhileExpression()
  {
    return xWhileExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXWhileExpression_Cond()
  {
    return (EReference)xWhileExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXWhileExpression_Do()
  {
    return (EReference)xWhileExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXForExpression()
  {
    return xForExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_Var()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_From()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_By()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_To()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForExpression_Do()
  {
    return (EReference)xForExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXParenthesizedExpression()
  {
    return xParenthesizedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXParenthesizedExpression_A()
  {
    return (EReference)xParenthesizedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructTypeDefMember()
  {
    return structTypeDefMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantVariable()
  {
    return constantVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantVariable_Value()
  {
    return (EReference)constantVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegisterVariable()
  {
    return registerVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegisterVariable_Addr()
  {
    return (EReference)registerVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Block()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Return()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Returnvar()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterVariable()
  {
    return parameterVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterVariable_Kind()
  {
    return (EAttribute)parameterVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterVariable_Default()
  {
    return (EAttribute)parameterVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getIntegerKind()
  {
    return integerKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterKind()
  {
    return parameterKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOperationRole()
  {
    return operationRoleEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryType()
  {
    return binaryTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUNARY_OPERATOR()
  {
    return unarY_OPERATOREEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMULTIPLICATIVE_OPERATOR()
  {
    return multiplicativE_OPERATOREEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getADDITIVE_OPERATOR()
  {
    return additivE_OPERATOREEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEQUALITY_OPERATOR()
  {
    return equalitY_OPERATOREEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBOOLEAN_OPERATOR()
  {
    return booleaN_OPERATOREEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getErrorLevels()
  {
    return errorLevelsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getOpSingleAssign()
  {
    return opSingleAssignEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ESyntaxFactory getESyntaxFactory()
  {
    return (ESyntaxFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    compilationUnitEClass = createEClass(COMPILATION_UNIT);
    createEAttribute(compilationUnitEClass, COMPILATION_UNIT__NAME);
    createEReference(compilationUnitEClass, COMPILATION_UNIT__USE);

    annotationDefinitionEClass = createEClass(ANNOTATION_DEFINITION);
    createEAttribute(annotationDefinitionEClass, ANNOTATION_DEFINITION__NAME);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__DEFINITION);

    libraryEClass = createEClass(LIBRARY);
    createEReference(libraryEClass, LIBRARY__OVERRIDES);
    createEReference(libraryEClass, LIBRARY__ITEMS);

    libraryItemEClass = createEClass(LIBRARY_ITEM);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);
    createEReference(typeEClass, TYPE__DEF);

    typeDefEClass = createEClass(TYPE_DEF);

    pointerTypeDefEClass = createEClass(POINTER_TYPE_DEF);
    createEReference(pointerTypeDefEClass, POINTER_TYPE_DEF__DEF);

    arrayTypeDefEClass = createEClass(ARRAY_TYPE_DEF);
    createEReference(arrayTypeDefEClass, ARRAY_TYPE_DEF__SIZE);
    createEReference(arrayTypeDefEClass, ARRAY_TYPE_DEF__DEF);

    refTypeDefEClass = createEClass(REF_TYPE_DEF);
    createEReference(refTypeDefEClass, REF_TYPE_DEF__TYPE);

    dataTypeDefEClass = createEClass(DATA_TYPE_DEF);
    createEAttribute(dataTypeDefEClass, DATA_TYPE_DEF__BITS);

    fixedDataTypeDefEClass = createEClass(FIXED_DATA_TYPE_DEF);
    createEAttribute(fixedDataTypeDefEClass, FIXED_DATA_TYPE_DEF__SCALE);

    integerDataTypeDefEClass = createEClass(INTEGER_DATA_TYPE_DEF);
    createEAttribute(integerDataTypeDefEClass, INTEGER_DATA_TYPE_DEF__KIND);

    structTypeDefEClass = createEClass(STRUCT_TYPE_DEF);
    createEReference(structTypeDefEClass, STRUCT_TYPE_DEF__MEMBERS);

    variableEClass = createEClass(VARIABLE);
    createEReference(variableEClass, VARIABLE__TYPE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    operationStepEClass = createEClass(OPERATION_STEP);

    instructionWordEClass = createEClass(INSTRUCTION_WORD);
    createEReference(instructionWordEClass, INSTRUCTION_WORD__SECTIONS);

    wordSectionEClass = createEClass(WORD_SECTION);
    createEAttribute(wordSectionEClass, WORD_SECTION__SIZE);
    createEAttribute(wordSectionEClass, WORD_SECTION__SHIFT);

    literalValueEClass = createEClass(LITERAL_VALUE);
    createEAttribute(literalValueEClass, LITERAL_VALUE__VALUE);

    variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
    createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VAR);

    operationCallEClass = createEClass(OPERATION_CALL);
    createEReference(operationCallEClass, OPERATION_CALL__OPERATION);
    createEReference(operationCallEClass, OPERATION_CALL__PARAMS);

    operationCallParameterEClass = createEClass(OPERATION_CALL_PARAMETER);

    operationSignatureEClass = createEClass(OPERATION_SIGNATURE);
    createEReference(operationSignatureEClass, OPERATION_SIGNATURE__PARAMS);

    operationBlockEClass = createEClass(OPERATION_BLOCK);
    createEReference(operationBlockEClass, OPERATION_BLOCK__STEPS);

    operatorDefinitionEClass = createEClass(OPERATOR_DEFINITION);
    createEAttribute(operatorDefinitionEClass, OPERATOR_DEFINITION__ROLE);
    createEReference(operatorDefinitionEClass, OPERATOR_DEFINITION__CANDIDATE);

    linkedBinaryEClass = createEClass(LINKED_BINARY);
    createEAttribute(linkedBinaryEClass, LINKED_BINARY__TYPE);
    createEReference(linkedBinaryEClass, LINKED_BINARY__SECTIONS);

    binarySectionEClass = createEClass(BINARY_SECTION);
    createEReference(binarySectionEClass, BINARY_SECTION__START);
    createEAttribute(binarySectionEClass, BINARY_SECTION__WIDTH);

    functionBinarySectionEClass = createEClass(FUNCTION_BINARY_SECTION);
    createEAttribute(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__NAME);
    createEAttribute(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__START_ADDR);
    createEAttribute(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__MEMWIDTH);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__POINTER_TYPE);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__ADDRESS_TYPE);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__MEMS);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__OPTIMIZERCALLS);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__LIB);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__DO);

    optimizerCallEClass = createEClass(OPTIMIZER_CALL);
    createEAttribute(optimizerCallEClass, OPTIMIZER_CALL__OPTIMIZER);

    functionMemoryEClass = createEClass(FUNCTION_MEMORY);
    createEAttribute(functionMemoryEClass, FUNCTION_MEMORY__START);
    createEAttribute(functionMemoryEClass, FUNCTION_MEMORY__END);

    constantBinarySectionEClass = createEClass(CONSTANT_BINARY_SECTION);
    createEReference(constantBinarySectionEClass, CONSTANT_BINARY_SECTION__DATA);

    referenceBinarySectionEClass = createEClass(REFERENCE_BINARY_SECTION);
    createEReference(referenceBinarySectionEClass, REFERENCE_BINARY_SECTION__INC);

    xExpressionEClass = createEClass(XEXPRESSION);

    xPrimaryExpressionEClass = createEClass(XPRIMARY_EXPRESSION);

    xSizeOfExpressionEClass = createEClass(XSIZE_OF_EXPRESSION);
    createEReference(xSizeOfExpressionEClass, XSIZE_OF_EXPRESSION__TYPE);

    xStructExpressionEClass = createEClass(XSTRUCT_EXPRESSION);
    createEReference(xStructExpressionEClass, XSTRUCT_EXPRESSION__TYPE);
    createEReference(xStructExpressionEClass, XSTRUCT_EXPRESSION__VALUES);

    xExpression1EClass = createEClass(XEXPRESSION1);
    createEAttribute(xExpression1EClass, XEXPRESSION1__OPERATOR);
    createEReference(xExpression1EClass, XEXPRESSION1__A);

    xExpression0EClass = createEClass(XEXPRESSION0);
    createEReference(xExpression0EClass, XEXPRESSION0__A);
    createEAttribute(xExpression0EClass, XEXPRESSION0__MEMBER);

    xExpressionM1EClass = createEClass(XEXPRESSION_M1);
    createEReference(xExpressionM1EClass, XEXPRESSION_M1__A);
    createEReference(xExpressionM1EClass, XEXPRESSION_M1__INDEX);

    xExpression2EClass = createEClass(XEXPRESSION2);
    createEReference(xExpression2EClass, XEXPRESSION2__A);
    createEAttribute(xExpression2EClass, XEXPRESSION2__OP);
    createEReference(xExpression2EClass, XEXPRESSION2__B);

    xExpression3EClass = createEClass(XEXPRESSION3);
    createEReference(xExpression3EClass, XEXPRESSION3__A);
    createEAttribute(xExpression3EClass, XEXPRESSION3__OP);
    createEReference(xExpression3EClass, XEXPRESSION3__B);

    xExpression4EClass = createEClass(XEXPRESSION4);
    createEReference(xExpression4EClass, XEXPRESSION4__A);
    createEAttribute(xExpression4EClass, XEXPRESSION4__OP);
    createEReference(xExpression4EClass, XEXPRESSION4__B);

    xExpression5EClass = createEClass(XEXPRESSION5);
    createEReference(xExpression5EClass, XEXPRESSION5__A);
    createEAttribute(xExpression5EClass, XEXPRESSION5__OP);
    createEReference(xExpression5EClass, XEXPRESSION5__B);

    xExpression6EClass = createEClass(XEXPRESSION6);
    createEReference(xExpression6EClass, XEXPRESSION6__TYPE);
    createEReference(xExpression6EClass, XEXPRESSION6__REF);
    createEAttribute(xExpression6EClass, XEXPRESSION6__OP);
    createEReference(xExpression6EClass, XEXPRESSION6__A);

    xExpressionLiteralEClass = createEClass(XEXPRESSION_LITERAL);
    createEAttribute(xExpressionLiteralEClass, XEXPRESSION_LITERAL__VALUE);

    xTopLevelExpressionEClass = createEClass(XTOP_LEVEL_EXPRESSION);

    xErrorExpressionEClass = createEClass(XERROR_EXPRESSION);
    createEAttribute(xErrorExpressionEClass, XERROR_EXPRESSION__LEVEL);
    createEAttribute(xErrorExpressionEClass, XERROR_EXPRESSION__MSG);

    xIsLiteralExpressionEClass = createEClass(XIS_LITERAL_EXPRESSION);
    createEReference(xIsLiteralExpressionEClass, XIS_LITERAL_EXPRESSION__REF);

    xIfExpressionEClass = createEClass(XIF_EXPRESSION);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__IF);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__THEN);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__ELSE);

    xWhileExpressionEClass = createEClass(XWHILE_EXPRESSION);
    createEReference(xWhileExpressionEClass, XWHILE_EXPRESSION__COND);
    createEReference(xWhileExpressionEClass, XWHILE_EXPRESSION__DO);

    xForExpressionEClass = createEClass(XFOR_EXPRESSION);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__VAR);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__FROM);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__BY);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__TO);
    createEReference(xForExpressionEClass, XFOR_EXPRESSION__DO);

    xParenthesizedExpressionEClass = createEClass(XPARENTHESIZED_EXPRESSION);
    createEReference(xParenthesizedExpressionEClass, XPARENTHESIZED_EXPRESSION__A);

    structTypeDefMemberEClass = createEClass(STRUCT_TYPE_DEF_MEMBER);

    constantVariableEClass = createEClass(CONSTANT_VARIABLE);
    createEReference(constantVariableEClass, CONSTANT_VARIABLE__VALUE);

    registerVariableEClass = createEClass(REGISTER_VARIABLE);
    createEReference(registerVariableEClass, REGISTER_VARIABLE__ADDR);

    labelEClass = createEClass(LABEL);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__BLOCK);
    createEReference(operationEClass, OPERATION__RETURN);
    createEReference(operationEClass, OPERATION__RETURNVAR);

    parameterVariableEClass = createEClass(PARAMETER_VARIABLE);
    createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__KIND);
    createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__DEFAULT);

    // Create enums
    integerKindEEnum = createEEnum(INTEGER_KIND);
    parameterKindEEnum = createEEnum(PARAMETER_KIND);
    operationRoleEEnum = createEEnum(OPERATION_ROLE);
    binaryTypeEEnum = createEEnum(BINARY_TYPE);
    unarY_OPERATOREEnum = createEEnum(UNARY_OPERATOR);
    multiplicativE_OPERATOREEnum = createEEnum(MULTIPLICATIVE_OPERATOR);
    additivE_OPERATOREEnum = createEEnum(ADDITIVE_OPERATOR);
    equalitY_OPERATOREEnum = createEEnum(EQUALITY_OPERATOR);
    booleaN_OPERATOREEnum = createEEnum(BOOLEAN_OPERATOR);
    errorLevelsEEnum = createEEnum(ERROR_LEVELS);
    opSingleAssignEEnum = createEEnum(OP_SINGLE_ASSIGN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    annotationDefinitionEClass.getESuperTypes().add(this.getLibraryItem());
    annotationEClass.getESuperTypes().add(this.getXTopLevelExpression());
    libraryEClass.getESuperTypes().add(this.getCompilationUnit());
    typeEClass.getESuperTypes().add(this.getLibraryItem());
    pointerTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    arrayTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    refTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    dataTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    fixedDataTypeDefEClass.getESuperTypes().add(this.getDataTypeDef());
    integerDataTypeDefEClass.getESuperTypes().add(this.getDataTypeDef());
    structTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    variableEClass.getESuperTypes().add(this.getLibraryItem());
    variableEClass.getESuperTypes().add(this.getOperationStep());
    instructionWordEClass.getESuperTypes().add(this.getOperationStep());
    literalValueEClass.getESuperTypes().add(this.getWordSection());
    variableReferenceEClass.getESuperTypes().add(this.getWordSection());
    variableReferenceEClass.getESuperTypes().add(this.getXPrimaryExpression());
    operationCallEClass.getESuperTypes().add(this.getXPrimaryExpression());
    operationSignatureEClass.getESuperTypes().add(this.getLibraryItem());
    operationSignatureEClass.getESuperTypes().add(this.getVariable());
    operatorDefinitionEClass.getESuperTypes().add(this.getLibraryItem());
    linkedBinaryEClass.getESuperTypes().add(this.getCompilationUnit());
    functionBinarySectionEClass.getESuperTypes().add(this.getBinarySection());
    constantBinarySectionEClass.getESuperTypes().add(this.getBinarySection());
    referenceBinarySectionEClass.getESuperTypes().add(this.getBinarySection());
    xExpressionEClass.getESuperTypes().add(this.getOperationCallParameter());
    xExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xSizeOfExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xStructExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xExpression6EClass.getESuperTypes().add(this.getXExpression());
    xExpressionLiteralEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xTopLevelExpressionEClass.getESuperTypes().add(this.getOperationStep());
    xErrorExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xIsLiteralExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xIfExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xWhileExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xForExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xParenthesizedExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    structTypeDefMemberEClass.getESuperTypes().add(this.getVariable());
    constantVariableEClass.getESuperTypes().add(this.getVariable());
    registerVariableEClass.getESuperTypes().add(this.getVariable());
    labelEClass.getESuperTypes().add(this.getVariable());
    operationEClass.getESuperTypes().add(this.getOperationSignature());
    parameterVariableEClass.getESuperTypes().add(this.getVariable());

    // Initialize classes and features; add operations and parameters
    initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompilationUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilationUnit_Use(), this.getLibrary(), null, "use", null, 0, -1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationDefinitionEClass, AnnotationDefinition.class, "AnnotationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnnotationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_Definition(), this.getAnnotationDefinition(), null, "definition", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLibrary_Overrides(), this.getLibrary(), null, "overrides", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_Items(), this.getLibraryItem(), null, "items", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(libraryItemEClass, LibraryItem.class, "LibraryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Def(), this.getTypeDef(), null, "def", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pointerTypeDefEClass, PointerTypeDef.class, "PointerTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointerTypeDef_Def(), this.getTypeDef(), null, "def", null, 0, 1, PointerTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeDefEClass, ArrayTypeDef.class, "ArrayTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayTypeDef_Size(), this.getXExpression(), null, "size", null, 0, 1, ArrayTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayTypeDef_Def(), this.getTypeDef(), null, "def", null, 0, 1, ArrayTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refTypeDefEClass, RefTypeDef.class, "RefTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefTypeDef_Type(), this.getType(), null, "type", null, 0, 1, RefTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefEClass, DataTypeDef.class, "DataTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeDef_Bits(), ecorePackage.getEInt(), "bits", null, 0, 1, DataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fixedDataTypeDefEClass, FixedDataTypeDef.class, "FixedDataTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFixedDataTypeDef_Scale(), ecorePackage.getEBigDecimal(), "scale", null, 0, 1, FixedDataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerDataTypeDefEClass, IntegerDataTypeDef.class, "IntegerDataTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerDataTypeDef_Kind(), this.getIntegerKind(), "kind", null, 0, 1, IntegerDataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeDefEClass, StructTypeDef.class, "StructTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructTypeDef_Members(), this.getVariable(), null, "members", null, 0, -1, StructTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Type(), this.getTypeDef(), null, "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationStepEClass, OperationStep.class, "OperationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionWordEClass, InstructionWord.class, "InstructionWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstructionWord_Sections(), this.getWordSection(), null, "sections", null, 0, -1, InstructionWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordSectionEClass, WordSection.class, "WordSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWordSection_Size(), ecorePackage.getEInt(), "size", null, 0, 1, WordSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWordSection_Shift(), ecorePackage.getEInt(), "shift", null, 0, 1, WordSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableReference_Var(), this.getVariable(), null, "var", null, 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationCall_Operation(), this.getOperation(), null, "operation", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCall_Params(), this.getOperationCallParameter(), null, "params", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallParameterEClass, OperationCallParameter.class, "OperationCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationSignatureEClass, OperationSignature.class, "OperationSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationSignature_Params(), this.getVariable(), null, "params", null, 0, -1, OperationSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationBlockEClass, OperationBlock.class, "OperationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationBlock_Steps(), this.getOperationStep(), null, "steps", null, 0, -1, OperationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorDefinitionEClass, OperatorDefinition.class, "OperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperatorDefinition_Role(), this.getOperationRole(), "role", null, 0, 1, OperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperatorDefinition_Candidate(), this.getOperation(), null, "candidate", null, 0, -1, OperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkedBinaryEClass, LinkedBinary.class, "LinkedBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkedBinary_Type(), this.getBinaryType(), "type", null, 0, 1, LinkedBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinkedBinary_Sections(), this.getBinarySection(), null, "sections", null, 0, -1, LinkedBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binarySectionEClass, BinarySection.class, "BinarySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinarySection_Start(), this.getXExpression(), null, "start", null, 0, 1, BinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBinarySection_Width(), ecorePackage.getEString(), "width", null, 0, 1, BinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBinarySectionEClass, FunctionBinarySection.class, "FunctionBinarySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionBinarySection_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionBinarySection_StartAddr(), ecorePackage.getEString(), "startAddr", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionBinarySection_Memwidth(), ecorePackage.getEString(), "memwidth", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_PointerType(), this.getTypeDef(), null, "pointerType", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_AddressType(), this.getTypeDef(), null, "addressType", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_Mems(), this.getFunctionMemory(), null, "mems", null, 0, -1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_Optimizercalls(), this.getOptimizerCall(), null, "optimizercalls", null, 0, -1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_Lib(), this.getLibrary(), null, "lib", null, 0, -1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_Do(), this.getOperationBlock(), null, "do", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optimizerCallEClass, OptimizerCall.class, "OptimizerCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOptimizerCall_Optimizer(), ecorePackage.getEString(), "optimizer", null, 0, 1, OptimizerCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionMemoryEClass, FunctionMemory.class, "FunctionMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionMemory_Start(), ecorePackage.getEString(), "start", null, 0, 1, FunctionMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionMemory_End(), ecorePackage.getEString(), "end", null, 0, 1, FunctionMemory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantBinarySectionEClass, ConstantBinarySection.class, "ConstantBinarySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantBinarySection_Data(), this.getXExpression(), null, "data", null, 0, -1, ConstantBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceBinarySectionEClass, ReferenceBinarySection.class, "ReferenceBinarySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceBinarySection_Inc(), this.getLinkedBinary(), null, "inc", null, 0, 1, ReferenceBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpressionEClass, XExpression.class, "XExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xPrimaryExpressionEClass, XPrimaryExpression.class, "XPrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xSizeOfExpressionEClass, XSizeOfExpression.class, "XSizeOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXSizeOfExpression_Type(), this.getTypeDef(), null, "type", null, 0, 1, XSizeOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xStructExpressionEClass, XStructExpression.class, "XStructExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXStructExpression_Type(), this.getType(), null, "type", null, 0, 1, XStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXStructExpression_Values(), this.getXExpression(), null, "values", null, 0, -1, XStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression1EClass, XExpression1.class, "XExpression1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXExpression1_Operator(), this.getUNARY_OPERATOR(), "operator", null, 0, -1, XExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression1_A(), this.getXExpression0(), null, "a", null, 0, 1, XExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression0EClass, XExpression0.class, "XExpression0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpression0_A(), this.getXExpressionM1(), null, "a", null, 0, 1, XExpression0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXExpression0_Member(), ecorePackage.getEString(), "member", null, 0, -1, XExpression0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpressionM1EClass, XExpressionM1.class, "XExpressionM1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpressionM1_A(), this.getXPrimaryExpression(), null, "a", null, 0, 1, XExpressionM1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpressionM1_Index(), this.getXExpression(), null, "index", null, 0, -1, XExpressionM1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression2EClass, XExpression2.class, "XExpression2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpression2_A(), this.getXExpression1(), null, "a", null, 0, 1, XExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXExpression2_Op(), this.getMULTIPLICATIVE_OPERATOR(), "op", null, 0, -1, XExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression2_B(), this.getXExpression2(), null, "b", null, 0, -1, XExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression3EClass, XExpression3.class, "XExpression3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpression3_A(), this.getXExpression2(), null, "a", null, 0, 1, XExpression3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXExpression3_Op(), this.getADDITIVE_OPERATOR(), "op", null, 0, -1, XExpression3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression3_B(), this.getXExpression2(), null, "b", null, 0, -1, XExpression3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression4EClass, XExpression4.class, "XExpression4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpression4_A(), this.getXExpression3(), null, "a", null, 0, 1, XExpression4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXExpression4_Op(), this.getEQUALITY_OPERATOR(), "op", null, 0, -1, XExpression4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression4_B(), this.getXExpression3(), null, "b", null, 0, -1, XExpression4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression5EClass, XExpression5.class, "XExpression5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpression5_A(), this.getXExpression4(), null, "a", null, 0, 1, XExpression5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXExpression5_Op(), this.getBOOLEAN_OPERATOR(), "op", null, 0, -1, XExpression5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression5_B(), this.getXExpression4(), null, "b", null, 0, -1, XExpression5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression6EClass, XExpression6.class, "XExpression6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXExpression6_Type(), this.getTypeDef(), null, "type", null, 0, 1, XExpression6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression6_Ref(), this.getVariableReference(), null, "ref", null, 0, 1, XExpression6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXExpression6_Op(), this.getOpSingleAssign(), "op", null, 0, 1, XExpression6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression6_A(), this.getXExpression5(), null, "a", null, 0, 1, XExpression6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpressionLiteralEClass, XExpressionLiteral.class, "XExpressionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXExpressionLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, XExpressionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xTopLevelExpressionEClass, XTopLevelExpression.class, "XTopLevelExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xErrorExpressionEClass, XErrorExpression.class, "XErrorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXErrorExpression_Level(), this.getErrorLevels(), "level", null, 0, 1, XErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXErrorExpression_Msg(), ecorePackage.getEString(), "msg", null, 0, 1, XErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIsLiteralExpressionEClass, XIsLiteralExpression.class, "XIsLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIsLiteralExpression_Ref(), this.getVariableReference(), null, "ref", null, 0, 1, XIsLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIfExpressionEClass, XIfExpression.class, "XIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIfExpression_If(), this.getXExpression(), null, "if", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Then(), this.getOperationBlock(), null, "then", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Else(), this.getOperationBlock(), null, "else", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xWhileExpressionEClass, XWhileExpression.class, "XWhileExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXWhileExpression_Cond(), this.getXExpression(), null, "cond", null, 0, 1, XWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXWhileExpression_Do(), this.getOperationBlock(), null, "do", null, 0, 1, XWhileExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xForExpressionEClass, XForExpression.class, "XForExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXForExpression_Var(), this.getVariable(), null, "var", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_From(), this.getXExpression(), null, "from", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_By(), this.getXExpression(), null, "by", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_To(), this.getXExpression(), null, "to", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForExpression_Do(), this.getOperationBlock(), null, "do", null, 0, 1, XForExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xParenthesizedExpressionEClass, XParenthesizedExpression.class, "XParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXParenthesizedExpression_A(), this.getXExpression(), null, "a", null, 0, 1, XParenthesizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeDefMemberEClass, StructTypeDefMember.class, "StructTypeDefMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantVariableEClass, ConstantVariable.class, "ConstantVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantVariable_Value(), this.getXExpression(), null, "value", null, 0, 1, ConstantVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(registerVariableEClass, RegisterVariable.class, "RegisterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegisterVariable_Addr(), this.getXExpression(), null, "addr", null, 0, 1, RegisterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Block(), this.getOperationBlock(), null, "block", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Return(), this.getXExpression(), null, "return", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Returnvar(), this.getVariable(), null, "returnvar", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterVariableEClass, ParameterVariable.class, "ParameterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterVariable_Kind(), this.getParameterKind(), "kind", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterVariable_Default(), ecorePackage.getEString(), "default", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(integerKindEEnum, IntegerKind.class, "IntegerKind");
    addEEnumLiteral(integerKindEEnum, IntegerKind.UNSIGNED);
    addEEnumLiteral(integerKindEEnum, IntegerKind.SIGNED);

    initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind");
    addEEnumLiteral(parameterKindEEnum, ParameterKind.ANY);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.VAR);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.CONST);

    initEEnum(operationRoleEEnum, OperationRole.class, "OperationRole");
    addEEnumLiteral(operationRoleEEnum, OperationRole.SET);
    addEEnumLiteral(operationRoleEEnum, OperationRole.ADD);
    addEEnumLiteral(operationRoleEEnum, OperationRole.SUBTRACT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.AND);
    addEEnumLiteral(operationRoleEEnum, OperationRole.OR);
    addEEnumLiteral(operationRoleEEnum, OperationRole.XOR);
    addEEnumLiteral(operationRoleEEnum, OperationRole.EQUALS);
    addEEnumLiteral(operationRoleEEnum, OperationRole.BRANCH);
    addEEnumLiteral(operationRoleEEnum, OperationRole.UC_GOTO);
    addEEnumLiteral(operationRoleEEnum, OperationRole.NOT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.INDIRECTION);
    addEEnumLiteral(operationRoleEEnum, OperationRole.CLEAR);
    addEEnumLiteral(operationRoleEEnum, OperationRole.INCREMENT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.DECREMENT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.DIV);
    addEEnumLiteral(operationRoleEEnum, OperationRole.MUL);
    addEEnumLiteral(operationRoleEEnum, OperationRole.MOD);
    addEEnumLiteral(operationRoleEEnum, OperationRole.LT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.LTE);
    addEEnumLiteral(operationRoleEEnum, OperationRole.GT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.GTE);
    addEEnumLiteral(operationRoleEEnum, OperationRole.NOTEQUALS);

    initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
    addEEnumLiteral(binaryTypeEEnum, BinaryType.DEFAULT);
    addEEnumLiteral(binaryTypeEEnum, BinaryType.INTELHEXFILE);
    addEEnumLiteral(binaryTypeEEnum, BinaryType.SRECHEXFILE);

    initEEnum(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.class, "UNARY_OPERATOR");
    addEEnumLiteral(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.MINUS);
    addEEnumLiteral(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.NOT);
    addEEnumLiteral(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.REFERENCE);
    addEEnumLiteral(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.DEREFERENCE);

    initEEnum(multiplicativE_OPERATOREEnum, hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR.class, "MULTIPLICATIVE_OPERATOR");
    addEEnumLiteral(multiplicativE_OPERATOREEnum, hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR.MUL);
    addEEnumLiteral(multiplicativE_OPERATOREEnum, hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR.DIV);
    addEEnumLiteral(multiplicativE_OPERATOREEnum, hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR.MOD);

    initEEnum(additivE_OPERATOREEnum, hu.e.parser.eSyntax.ADDITIVE_OPERATOR.class, "ADDITIVE_OPERATOR");
    addEEnumLiteral(additivE_OPERATOREEnum, hu.e.parser.eSyntax.ADDITIVE_OPERATOR.ADD);
    addEEnumLiteral(additivE_OPERATOREEnum, hu.e.parser.eSyntax.ADDITIVE_OPERATOR.MINUS);

    initEEnum(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.class, "EQUALITY_OPERATOR");
    addEEnumLiteral(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.EQUALS);
    addEEnumLiteral(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.NOTEQUALS);
    addEEnumLiteral(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.GTE);
    addEEnumLiteral(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.LTE);
    addEEnumLiteral(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.GT);
    addEEnumLiteral(equalitY_OPERATOREEnum, hu.e.parser.eSyntax.EQUALITY_OPERATOR.LT);

    initEEnum(booleaN_OPERATOREEnum, hu.e.parser.eSyntax.BOOLEAN_OPERATOR.class, "BOOLEAN_OPERATOR");
    addEEnumLiteral(booleaN_OPERATOREEnum, hu.e.parser.eSyntax.BOOLEAN_OPERATOR.OR);
    addEEnumLiteral(booleaN_OPERATOREEnum, hu.e.parser.eSyntax.BOOLEAN_OPERATOR.AND);

    initEEnum(errorLevelsEEnum, ErrorLevels.class, "ErrorLevels");
    addEEnumLiteral(errorLevelsEEnum, ErrorLevels.ERROR);
    addEEnumLiteral(errorLevelsEEnum, ErrorLevels.WARNING);
    addEEnumLiteral(errorLevelsEEnum, ErrorLevels.INFO);

    initEEnum(opSingleAssignEEnum, OpSingleAssign.class, "OpSingleAssign");
    addEEnumLiteral(opSingleAssignEEnum, OpSingleAssign.ASSIGN);
    addEEnumLiteral(opSingleAssignEEnum, OpSingleAssign.ASSIGNADD);
    addEEnumLiteral(opSingleAssignEEnum, OpSingleAssign.ASSIGNSUBTRACT);

    // Create resource
    createResource(eNS_URI);
  }

} //ESyntaxPackageImpl

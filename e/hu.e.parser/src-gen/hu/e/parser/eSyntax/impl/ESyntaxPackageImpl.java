/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ArrayRef;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.BinarySection;
import hu.e.parser.eSyntax.BinaryType;
import hu.e.parser.eSyntax.CompileContextVariable;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.ESyntaxFactory;
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
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.PrimitiveKind;
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
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelItemEClass = null;

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
  private EClass dataTypeDefEClass = null;

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
  private EClass structTypeDefEClass = null;

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
  private EClass labelEClass = null;

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
  private EClass labelReferenceEClass = null;

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
  private EClass variableRefSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structRefEClass = null;

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
  private EClass operationEClass = null;

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
  private EClass parameterVariableEClass = null;

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
  private EClass xAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xAddressOfVarEClass = null;

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
  private EClass xParenthesizedExpressionEClass = null;

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
  private EClass compileContextVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum primitiveKindEEnum = null;

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
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Uses()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Items()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelItem()
  {
    return topLevelItemEClass;
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
  public EClass getDataTypeDef()
  {
    return dataTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeDef_Kind()
  {
    return (EAttribute)dataTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeDef_Bits()
  {
    return (EAttribute)dataTypeDefEClass.getEStructuralFeatures().get(1);
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
  public EReference getArrayTypeDef_Type()
  {
    return (EReference)arrayTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayTypeDef_Length()
  {
    return (EReference)arrayTypeDefEClass.getEStructuralFeatures().get(1);
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
  public EClass getStructTypeDefMember()
  {
    return structTypeDefMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructTypeDefMember_Type()
  {
    return (EReference)structTypeDefMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructTypeDefMember_Name()
  {
    return (EAttribute)structTypeDefMemberEClass.getEStructuralFeatures().get(1);
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
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Name()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
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
  public EClass getLabelReference()
  {
    return labelReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelReference_Label()
  {
    return (EReference)labelReferenceEClass.getEStructuralFeatures().get(0);
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
  public EReference getVariableReference_Ref()
  {
    return (EReference)variableReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableRefSection()
  {
    return variableRefSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayRef()
  {
    return arrayRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayRef_V()
  {
    return (EReference)arrayRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructRef()
  {
    return structRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructRef_Ref()
  {
    return (EReference)structRefEClass.getEStructuralFeatures().get(0);
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
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Returntype()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Name()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Params()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Block()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Return()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(4);
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
  public EReference getParameterVariable_Var()
  {
    return (EReference)parameterVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterVariable_Default()
  {
    return (EAttribute)parameterVariableEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getLinkedBinary_Name()
  {
    return (EAttribute)linkedBinaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinkedBinary_Type()
  {
    return (EAttribute)linkedBinaryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinkedBinary_Sections()
  {
    return (EReference)linkedBinaryEClass.getEStructuralFeatures().get(2);
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
  public EClass getFunctionBinarySection()
  {
    return functionBinarySectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_Operation()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionBinarySection_Memwidth()
  {
    return (EAttribute)functionBinarySectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBinarySection_Mems()
  {
    return (EReference)functionBinarySectionEClass.getEStructuralFeatures().get(2);
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
  public EClass getXAssignment()
  {
    return xAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXAssignment_Ref()
  {
    return (EReference)xAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXAssignment_Value()
  {
    return (EReference)xAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXAddressOfVar()
  {
    return xAddressOfVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXAddressOfVar_Ref()
  {
    return (EReference)xAddressOfVarEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getRegisterVariable_Addr()
  {
    return (EAttribute)registerVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompileContextVariable()
  {
    return compileContextVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompileContextVariable_Value()
  {
    return (EReference)compileContextVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPrimitiveKind()
  {
    return primitiveKindEEnum;
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
    packageEClass = createEClass(PACKAGE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__USES);
    createEReference(packageEClass, PACKAGE__ITEMS);

    topLevelItemEClass = createEClass(TOP_LEVEL_ITEM);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);
    createEReference(typeEClass, TYPE__DEF);

    typeDefEClass = createEClass(TYPE_DEF);

    dataTypeDefEClass = createEClass(DATA_TYPE_DEF);
    createEAttribute(dataTypeDefEClass, DATA_TYPE_DEF__KIND);
    createEAttribute(dataTypeDefEClass, DATA_TYPE_DEF__BITS);

    arrayTypeDefEClass = createEClass(ARRAY_TYPE_DEF);
    createEReference(arrayTypeDefEClass, ARRAY_TYPE_DEF__TYPE);
    createEReference(arrayTypeDefEClass, ARRAY_TYPE_DEF__LENGTH);

    structTypeDefEClass = createEClass(STRUCT_TYPE_DEF);
    createEReference(structTypeDefEClass, STRUCT_TYPE_DEF__MEMBERS);

    structTypeDefMemberEClass = createEClass(STRUCT_TYPE_DEF_MEMBER);
    createEReference(structTypeDefMemberEClass, STRUCT_TYPE_DEF_MEMBER__TYPE);
    createEAttribute(structTypeDefMemberEClass, STRUCT_TYPE_DEF_MEMBER__NAME);

    variableEClass = createEClass(VARIABLE);
    createEReference(variableEClass, VARIABLE__TYPE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    operationStepEClass = createEClass(OPERATION_STEP);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__NAME);

    instructionWordEClass = createEClass(INSTRUCTION_WORD);
    createEReference(instructionWordEClass, INSTRUCTION_WORD__SECTIONS);

    wordSectionEClass = createEClass(WORD_SECTION);
    createEAttribute(wordSectionEClass, WORD_SECTION__SIZE);
    createEAttribute(wordSectionEClass, WORD_SECTION__SHIFT);

    literalValueEClass = createEClass(LITERAL_VALUE);
    createEAttribute(literalValueEClass, LITERAL_VALUE__VALUE);

    labelReferenceEClass = createEClass(LABEL_REFERENCE);
    createEReference(labelReferenceEClass, LABEL_REFERENCE__LABEL);

    variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
    createEReference(variableReferenceEClass, VARIABLE_REFERENCE__VAR);
    createEReference(variableReferenceEClass, VARIABLE_REFERENCE__REF);

    variableRefSectionEClass = createEClass(VARIABLE_REF_SECTION);

    arrayRefEClass = createEClass(ARRAY_REF);
    createEReference(arrayRefEClass, ARRAY_REF__V);

    structRefEClass = createEClass(STRUCT_REF);
    createEReference(structRefEClass, STRUCT_REF__REF);

    operationCallEClass = createEClass(OPERATION_CALL);
    createEReference(operationCallEClass, OPERATION_CALL__OPERATION);
    createEReference(operationCallEClass, OPERATION_CALL__PARAMS);

    operationCallParameterEClass = createEClass(OPERATION_CALL_PARAMETER);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__RETURNTYPE);
    createEAttribute(operationEClass, OPERATION__NAME);
    createEReference(operationEClass, OPERATION__PARAMS);
    createEReference(operationEClass, OPERATION__BLOCK);
    createEReference(operationEClass, OPERATION__RETURN);

    operationBlockEClass = createEClass(OPERATION_BLOCK);
    createEReference(operationBlockEClass, OPERATION_BLOCK__STEPS);

    parameterVariableEClass = createEClass(PARAMETER_VARIABLE);
    createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__KIND);
    createEReference(parameterVariableEClass, PARAMETER_VARIABLE__VAR);
    createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__DEFAULT);

    operatorDefinitionEClass = createEClass(OPERATOR_DEFINITION);
    createEAttribute(operatorDefinitionEClass, OPERATOR_DEFINITION__ROLE);
    createEReference(operatorDefinitionEClass, OPERATOR_DEFINITION__CANDIDATE);

    linkedBinaryEClass = createEClass(LINKED_BINARY);
    createEAttribute(linkedBinaryEClass, LINKED_BINARY__NAME);
    createEAttribute(linkedBinaryEClass, LINKED_BINARY__TYPE);
    createEReference(linkedBinaryEClass, LINKED_BINARY__SECTIONS);

    binarySectionEClass = createEClass(BINARY_SECTION);
    createEReference(binarySectionEClass, BINARY_SECTION__START);

    functionBinarySectionEClass = createEClass(FUNCTION_BINARY_SECTION);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__OPERATION);
    createEAttribute(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__MEMWIDTH);
    createEReference(functionBinarySectionEClass, FUNCTION_BINARY_SECTION__MEMS);

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

    xExpressionLiteralEClass = createEClass(XEXPRESSION_LITERAL);
    createEAttribute(xExpressionLiteralEClass, XEXPRESSION_LITERAL__VALUE);

    xTopLevelExpressionEClass = createEClass(XTOP_LEVEL_EXPRESSION);

    xAssignmentEClass = createEClass(XASSIGNMENT);
    createEReference(xAssignmentEClass, XASSIGNMENT__REF);
    createEReference(xAssignmentEClass, XASSIGNMENT__VALUE);

    xAddressOfVarEClass = createEClass(XADDRESS_OF_VAR);
    createEReference(xAddressOfVarEClass, XADDRESS_OF_VAR__REF);

    xIsLiteralExpressionEClass = createEClass(XIS_LITERAL_EXPRESSION);
    createEReference(xIsLiteralExpressionEClass, XIS_LITERAL_EXPRESSION__REF);

    xIfExpressionEClass = createEClass(XIF_EXPRESSION);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__IF);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__THEN);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__ELSE);

    xParenthesizedExpressionEClass = createEClass(XPARENTHESIZED_EXPRESSION);
    createEReference(xParenthesizedExpressionEClass, XPARENTHESIZED_EXPRESSION__A);

    constantVariableEClass = createEClass(CONSTANT_VARIABLE);
    createEReference(constantVariableEClass, CONSTANT_VARIABLE__VALUE);

    registerVariableEClass = createEClass(REGISTER_VARIABLE);
    createEAttribute(registerVariableEClass, REGISTER_VARIABLE__ADDR);

    compileContextVariableEClass = createEClass(COMPILE_CONTEXT_VARIABLE);
    createEReference(compileContextVariableEClass, COMPILE_CONTEXT_VARIABLE__VALUE);

    // Create enums
    primitiveKindEEnum = createEEnum(PRIMITIVE_KIND);
    parameterKindEEnum = createEEnum(PARAMETER_KIND);
    operationRoleEEnum = createEEnum(OPERATION_ROLE);
    binaryTypeEEnum = createEEnum(BINARY_TYPE);
    unarY_OPERATOREEnum = createEEnum(UNARY_OPERATOR);
    multiplicativE_OPERATOREEnum = createEEnum(MULTIPLICATIVE_OPERATOR);
    additivE_OPERATOREEnum = createEEnum(ADDITIVE_OPERATOR);
    equalitY_OPERATOREEnum = createEEnum(EQUALITY_OPERATOR);
    booleaN_OPERATOREEnum = createEEnum(BOOLEAN_OPERATOR);
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
    typeEClass.getESuperTypes().add(this.getTopLevelItem());
    dataTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    arrayTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    structTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    variableEClass.getESuperTypes().add(this.getTopLevelItem());
    variableEClass.getESuperTypes().add(this.getOperationStep());
    labelEClass.getESuperTypes().add(this.getOperationStep());
    instructionWordEClass.getESuperTypes().add(this.getOperationStep());
    literalValueEClass.getESuperTypes().add(this.getWordSection());
    labelReferenceEClass.getESuperTypes().add(this.getWordSection());
    labelReferenceEClass.getESuperTypes().add(this.getOperationCallParameter());
    variableReferenceEClass.getESuperTypes().add(this.getWordSection());
    variableReferenceEClass.getESuperTypes().add(this.getXPrimaryExpression());
    arrayRefEClass.getESuperTypes().add(this.getVariableRefSection());
    structRefEClass.getESuperTypes().add(this.getVariableRefSection());
    operationCallEClass.getESuperTypes().add(this.getOperationStep());
    operationCallEClass.getESuperTypes().add(this.getXPrimaryExpression());
    operationEClass.getESuperTypes().add(this.getTopLevelItem());
    operatorDefinitionEClass.getESuperTypes().add(this.getTopLevelItem());
    linkedBinaryEClass.getESuperTypes().add(this.getTopLevelItem());
    functionBinarySectionEClass.getESuperTypes().add(this.getBinarySection());
    constantBinarySectionEClass.getESuperTypes().add(this.getBinarySection());
    referenceBinarySectionEClass.getESuperTypes().add(this.getBinarySection());
    xExpressionEClass.getESuperTypes().add(this.getOperationCallParameter());
    xSizeOfExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xStructExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xExpression5EClass.getESuperTypes().add(this.getXExpression());
    xExpressionLiteralEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xTopLevelExpressionEClass.getESuperTypes().add(this.getOperationStep());
    xAssignmentEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xAddressOfVarEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xIsLiteralExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xIfExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xParenthesizedExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    constantVariableEClass.getESuperTypes().add(this.getVariable());
    registerVariableEClass.getESuperTypes().add(this.getVariable());
    compileContextVariableEClass.getESuperTypes().add(this.getVariable());

    // Initialize classes and features; add operations and parameters
    initEClass(packageEClass, hu.e.parser.eSyntax.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, hu.e.parser.eSyntax.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Uses(), this.getPackage(), null, "uses", null, 0, -1, hu.e.parser.eSyntax.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackage_Items(), this.getTopLevelItem(), null, "items", null, 0, -1, hu.e.parser.eSyntax.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(topLevelItemEClass, TopLevelItem.class, "TopLevelItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_Def(), this.getTypeDef(), null, "def", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeDefEClass, DataTypeDef.class, "DataTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeDef_Kind(), this.getPrimitiveKind(), "kind", null, 0, 1, DataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTypeDef_Bits(), ecorePackage.getEInt(), "bits", null, 0, 1, DataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeDefEClass, ArrayTypeDef.class, "ArrayTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayTypeDef_Type(), this.getType(), null, "type", null, 0, 1, ArrayTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayTypeDef_Length(), this.getXExpression(), null, "length", null, 0, 1, ArrayTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeDefEClass, StructTypeDef.class, "StructTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructTypeDef_Members(), this.getStructTypeDefMember(), null, "members", null, 0, -1, StructTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeDefMemberEClass, StructTypeDefMember.class, "StructTypeDefMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructTypeDefMember_Type(), this.getType(), null, "type", null, 0, 1, StructTypeDefMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructTypeDefMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructTypeDefMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Type(), this.getType(), null, "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationStepEClass, OperationStep.class, "OperationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionWordEClass, InstructionWord.class, "InstructionWord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstructionWord_Sections(), this.getWordSection(), null, "sections", null, 0, -1, InstructionWord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(wordSectionEClass, WordSection.class, "WordSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWordSection_Size(), ecorePackage.getEInt(), "size", null, 0, 1, WordSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWordSection_Shift(), ecorePackage.getEInt(), "shift", null, 0, 1, WordSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalValueEClass, LiteralValue.class, "LiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelReferenceEClass, LabelReference.class, "LabelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabelReference_Label(), this.getLabel(), null, "label", null, 0, 1, LabelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariableReference_Var(), this.getVariable(), null, "var", null, 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariableReference_Ref(), this.getVariableRefSection(), null, "ref", null, 0, -1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableRefSectionEClass, VariableRefSection.class, "VariableRefSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayRefEClass, ArrayRef.class, "ArrayRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayRef_V(), this.getXExpression(), null, "v", null, 0, 1, ArrayRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structRefEClass, StructRef.class, "StructRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructRef_Ref(), this.getStructTypeDefMember(), null, "ref", null, 0, 1, StructRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationCall_Operation(), this.getOperation(), null, "operation", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCall_Params(), this.getOperationCallParameter(), null, "params", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallParameterEClass, OperationCallParameter.class, "OperationCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Returntype(), this.getType(), null, "returntype", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Params(), this.getParameterVariable(), null, "params", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Block(), this.getOperationBlock(), null, "block", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Return(), this.getXExpression(), null, "return", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationBlockEClass, OperationBlock.class, "OperationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationBlock_Steps(), this.getOperationStep(), null, "steps", null, 0, -1, OperationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterVariableEClass, ParameterVariable.class, "ParameterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterVariable_Kind(), this.getParameterKind(), "kind", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterVariable_Var(), this.getVariable(), null, "var", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterVariable_Default(), ecorePackage.getEString(), "default", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorDefinitionEClass, OperatorDefinition.class, "OperatorDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperatorDefinition_Role(), this.getOperationRole(), "role", null, 0, 1, OperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperatorDefinition_Candidate(), this.getOperation(), null, "candidate", null, 0, -1, OperatorDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkedBinaryEClass, LinkedBinary.class, "LinkedBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinkedBinary_Name(), ecorePackage.getEString(), "name", null, 0, 1, LinkedBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinkedBinary_Type(), this.getBinaryType(), "type", null, 0, 1, LinkedBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinkedBinary_Sections(), this.getBinarySection(), null, "sections", null, 0, -1, LinkedBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binarySectionEClass, BinarySection.class, "BinarySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBinarySection_Start(), this.getXExpression(), null, "start", null, 0, 1, BinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBinarySectionEClass, FunctionBinarySection.class, "FunctionBinarySection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionBinarySection_Operation(), this.getOperation(), null, "operation", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionBinarySection_Memwidth(), ecorePackage.getEString(), "memwidth", null, 0, 1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionBinarySection_Mems(), this.getFunctionMemory(), null, "mems", null, 0, -1, FunctionBinarySection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getXSizeOfExpression_Type(), this.getType(), null, "type", null, 0, 1, XSizeOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xStructExpressionEClass, XStructExpression.class, "XStructExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXStructExpression_Type(), this.getType(), null, "type", null, 0, 1, XStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXStructExpression_Values(), this.getXExpression(), null, "values", null, 0, -1, XStructExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpression1EClass, XExpression1.class, "XExpression1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXExpression1_Operator(), this.getUNARY_OPERATOR(), "operator", null, 0, -1, XExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXExpression1_A(), this.getXPrimaryExpression(), null, "a", null, 0, 1, XExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(xExpressionLiteralEClass, XExpressionLiteral.class, "XExpressionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXExpressionLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, XExpressionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xTopLevelExpressionEClass, XTopLevelExpression.class, "XTopLevelExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xAssignmentEClass, XAssignment.class, "XAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXAssignment_Ref(), this.getVariableReference(), null, "ref", null, 0, 1, XAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXAssignment_Value(), this.getXExpression(), null, "value", null, 0, 1, XAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xAddressOfVarEClass, XAddressOfVar.class, "XAddressOfVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXAddressOfVar_Ref(), this.getVariableReference(), null, "ref", null, 0, 1, XAddressOfVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIsLiteralExpressionEClass, XIsLiteralExpression.class, "XIsLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIsLiteralExpression_Ref(), this.getVariableReference(), null, "ref", null, 0, 1, XIsLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIfExpressionEClass, XIfExpression.class, "XIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIfExpression_If(), this.getXExpression(), null, "if", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Then(), this.getOperationBlock(), null, "then", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Else(), this.getOperationBlock(), null, "else", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xParenthesizedExpressionEClass, XParenthesizedExpression.class, "XParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXParenthesizedExpression_A(), this.getXExpression(), null, "a", null, 0, 1, XParenthesizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantVariableEClass, ConstantVariable.class, "ConstantVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantVariable_Value(), this.getXExpression(), null, "value", null, 0, 1, ConstantVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(registerVariableEClass, RegisterVariable.class, "RegisterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegisterVariable_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, RegisterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compileContextVariableEClass, CompileContextVariable.class, "CompileContextVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompileContextVariable_Value(), this.getXExpression(), null, "value", null, 0, 1, CompileContextVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(primitiveKindEEnum, PrimitiveKind.class, "PrimitiveKind");
    addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.UNSIGNED);
    addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.SIGNED);
    addEEnumLiteral(primitiveKindEEnum, PrimitiveKind.REAL);

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
    addEEnumLiteral(operationRoleEEnum, OperationRole.MOD);
    addEEnumLiteral(operationRoleEEnum, OperationRole.LT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.LTE);
    addEEnumLiteral(operationRoleEEnum, OperationRole.GT);
    addEEnumLiteral(operationRoleEEnum, OperationRole.GTE);

    initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
    addEEnumLiteral(binaryTypeEEnum, BinaryType.DEFAULT);
    addEEnumLiteral(binaryTypeEEnum, BinaryType.HEXFILE);

    initEEnum(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.class, "UNARY_OPERATOR");
    addEEnumLiteral(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.MINUS);
    addEEnumLiteral(unarY_OPERATOREEnum, hu.e.parser.eSyntax.UNARY_OPERATOR.NOT);

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

    // Create resource
    createResource(eNS_URI);
  }

} //ESyntaxPackageImpl

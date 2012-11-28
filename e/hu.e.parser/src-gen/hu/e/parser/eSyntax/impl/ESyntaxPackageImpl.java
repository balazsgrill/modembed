/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.Annotation;
import hu.e.parser.eSyntax.AnnotationDefinition;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.CompilationUnit;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.ESyntaxFactory;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.ErrorLevels;
import hu.e.parser.eSyntax.FixedDataTypeDef;
import hu.e.parser.eSyntax.InsctructionSectionNotation;
import hu.e.parser.eSyntax.InstructionNotation;
import hu.e.parser.eSyntax.InstructionParameterNotation;
import hu.e.parser.eSyntax.InstructionSetNotation;
import hu.e.parser.eSyntax.InstructionWordNotation;
import hu.e.parser.eSyntax.IntegerDataTypeDef;
import hu.e.parser.eSyntax.IntegerKind;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.LazyParameter;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.OpSingleAssign;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationCallParameter;
import hu.e.parser.eSyntax.OperationParameter;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.OperationTypeDef;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.TypeDef;
import hu.e.parser.eSyntax.UnspecifiedTypeDef;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.XErrorExpression;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XExpression0;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpression6;
import hu.e.parser.eSyntax.XExpressionBlock;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XExpressionM1;
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
  private EClass instructionSetNotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionNotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionWordNotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionParameterNotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insctructionSectionNotationEClass = null;

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
  private EClass unspecifiedTypeDefEClass = null;

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
  private EClass operationTypeDefEClass = null;

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
  private EClass operationParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lazyParameterEClass = null;

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
  private EClass xExpressionBlockEClass = null;

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
  private EClass parameterVariableEClass = null;

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
  public EClass getAnnotationDefinition()
  {
    return annotationDefinitionEClass;
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
  public EAttribute getAnnotation_Definition()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionSetNotation()
  {
    return instructionSetNotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstructionSetNotation_Extends()
  {
    return (EAttribute)instructionSetNotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstructionSetNotation_Instructions()
  {
    return (EReference)instructionSetNotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionNotation()
  {
    return instructionNotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstructionNotation_Name()
  {
    return (EAttribute)instructionNotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstructionNotation_Params()
  {
    return (EReference)instructionNotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstructionNotation_Words()
  {
    return (EReference)instructionNotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionWordNotation()
  {
    return instructionWordNotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstructionWordNotation_Sections()
  {
    return (EReference)instructionWordNotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructionParameterNotation()
  {
    return instructionParameterNotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstructionParameterNotation_Name()
  {
    return (EAttribute)instructionParameterNotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstructionParameterNotation_Default()
  {
    return (EAttribute)instructionParameterNotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsctructionSectionNotation()
  {
    return insctructionSectionNotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsctructionSectionNotation_Param()
  {
    return (EAttribute)insctructionSectionNotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsctructionSectionNotation_Value()
  {
    return (EAttribute)insctructionSectionNotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsctructionSectionNotation_Size()
  {
    return (EAttribute)insctructionSectionNotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsctructionSectionNotation_Shift()
  {
    return (EAttribute)insctructionSectionNotationEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getLibrary_Use()
  {
    return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getLibraryItem_Name()
  {
    return (EAttribute)libraryItemEClass.getEStructuralFeatures().get(0);
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
  public EReference getType_Def()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
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
  public EClass getUnspecifiedTypeDef()
  {
    return unspecifiedTypeDefEClass;
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
  public EReference getArrayTypeDef_Def()
  {
    return (EReference)arrayTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayTypeDef_Size()
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
  public EAttribute getRefTypeDef_Type()
  {
    return (EAttribute)refTypeDefEClass.getEStructuralFeatures().get(0);
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
  public EClass getOperationStep()
  {
    return operationStepEClass;
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
  public EAttribute getVariableReference_Var()
  {
    return (EAttribute)variableReferenceEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getOperationCall_Operation()
  {
    return (EAttribute)operationCallEClass.getEStructuralFeatures().get(0);
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
  public EClass getOperationTypeDef()
  {
    return operationTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationTypeDef_ResultType()
  {
    return (EReference)operationTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationTypeDef_Params()
  {
    return (EReference)operationTypeDefEClass.getEStructuralFeatures().get(1);
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
  public EReference getOperation_Type()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Overrides()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Content()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationParameter()
  {
    return operationParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLazyParameter()
  {
    return lazyParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLazyParameter_Paramname()
  {
    return (EAttribute)lazyParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLazyParameter_Type()
  {
    return (EReference)lazyParameterEClass.getEStructuralFeatures().get(1);
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
  public EClass getXExpressionBlock()
  {
    return xExpressionBlockEClass;
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
  public EReference getXStructExpression_Values()
  {
    return (EReference)xStructExpressionEClass.getEStructuralFeatures().get(0);
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

    annotationDefinitionEClass = createEClass(ANNOTATION_DEFINITION);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__DEFINITION);

    instructionSetNotationEClass = createEClass(INSTRUCTION_SET_NOTATION);
    createEAttribute(instructionSetNotationEClass, INSTRUCTION_SET_NOTATION__EXTENDS);
    createEReference(instructionSetNotationEClass, INSTRUCTION_SET_NOTATION__INSTRUCTIONS);

    instructionNotationEClass = createEClass(INSTRUCTION_NOTATION);
    createEAttribute(instructionNotationEClass, INSTRUCTION_NOTATION__NAME);
    createEReference(instructionNotationEClass, INSTRUCTION_NOTATION__PARAMS);
    createEReference(instructionNotationEClass, INSTRUCTION_NOTATION__WORDS);

    instructionWordNotationEClass = createEClass(INSTRUCTION_WORD_NOTATION);
    createEReference(instructionWordNotationEClass, INSTRUCTION_WORD_NOTATION__SECTIONS);

    instructionParameterNotationEClass = createEClass(INSTRUCTION_PARAMETER_NOTATION);
    createEAttribute(instructionParameterNotationEClass, INSTRUCTION_PARAMETER_NOTATION__NAME);
    createEAttribute(instructionParameterNotationEClass, INSTRUCTION_PARAMETER_NOTATION__DEFAULT);

    insctructionSectionNotationEClass = createEClass(INSCTRUCTION_SECTION_NOTATION);
    createEAttribute(insctructionSectionNotationEClass, INSCTRUCTION_SECTION_NOTATION__PARAM);
    createEAttribute(insctructionSectionNotationEClass, INSCTRUCTION_SECTION_NOTATION__VALUE);
    createEAttribute(insctructionSectionNotationEClass, INSCTRUCTION_SECTION_NOTATION__SIZE);
    createEAttribute(insctructionSectionNotationEClass, INSCTRUCTION_SECTION_NOTATION__SHIFT);

    libraryEClass = createEClass(LIBRARY);
    createEAttribute(libraryEClass, LIBRARY__USE);
    createEReference(libraryEClass, LIBRARY__ITEMS);

    libraryItemEClass = createEClass(LIBRARY_ITEM);
    createEAttribute(libraryItemEClass, LIBRARY_ITEM__NAME);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__DEF);

    typeDefEClass = createEClass(TYPE_DEF);

    unspecifiedTypeDefEClass = createEClass(UNSPECIFIED_TYPE_DEF);

    pointerTypeDefEClass = createEClass(POINTER_TYPE_DEF);
    createEReference(pointerTypeDefEClass, POINTER_TYPE_DEF__DEF);

    arrayTypeDefEClass = createEClass(ARRAY_TYPE_DEF);
    createEReference(arrayTypeDefEClass, ARRAY_TYPE_DEF__DEF);
    createEReference(arrayTypeDefEClass, ARRAY_TYPE_DEF__SIZE);

    refTypeDefEClass = createEClass(REF_TYPE_DEF);
    createEAttribute(refTypeDefEClass, REF_TYPE_DEF__TYPE);

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

    operationStepEClass = createEClass(OPERATION_STEP);

    variableReferenceEClass = createEClass(VARIABLE_REFERENCE);
    createEAttribute(variableReferenceEClass, VARIABLE_REFERENCE__VAR);

    operationCallEClass = createEClass(OPERATION_CALL);
    createEAttribute(operationCallEClass, OPERATION_CALL__OPERATION);
    createEReference(operationCallEClass, OPERATION_CALL__PARAMS);

    operationCallParameterEClass = createEClass(OPERATION_CALL_PARAMETER);

    operationTypeDefEClass = createEClass(OPERATION_TYPE_DEF);
    createEReference(operationTypeDefEClass, OPERATION_TYPE_DEF__RESULT_TYPE);
    createEReference(operationTypeDefEClass, OPERATION_TYPE_DEF__PARAMS);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__TYPE);
    createEAttribute(operationEClass, OPERATION__OVERRIDES);
    createEReference(operationEClass, OPERATION__CONTENT);

    operationParameterEClass = createEClass(OPERATION_PARAMETER);

    lazyParameterEClass = createEClass(LAZY_PARAMETER);
    createEAttribute(lazyParameterEClass, LAZY_PARAMETER__PARAMNAME);
    createEReference(lazyParameterEClass, LAZY_PARAMETER__TYPE);

    xExpressionEClass = createEClass(XEXPRESSION);

    xExpressionBlockEClass = createEClass(XEXPRESSION_BLOCK);

    xPrimaryExpressionEClass = createEClass(XPRIMARY_EXPRESSION);

    xSizeOfExpressionEClass = createEClass(XSIZE_OF_EXPRESSION);
    createEReference(xSizeOfExpressionEClass, XSIZE_OF_EXPRESSION__TYPE);

    xStructExpressionEClass = createEClass(XSTRUCT_EXPRESSION);
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

    xParenthesizedExpressionEClass = createEClass(XPARENTHESIZED_EXPRESSION);
    createEReference(xParenthesizedExpressionEClass, XPARENTHESIZED_EXPRESSION__A);

    structTypeDefMemberEClass = createEClass(STRUCT_TYPE_DEF_MEMBER);

    constantVariableEClass = createEClass(CONSTANT_VARIABLE);
    createEReference(constantVariableEClass, CONSTANT_VARIABLE__VALUE);

    registerVariableEClass = createEClass(REGISTER_VARIABLE);
    createEReference(registerVariableEClass, REGISTER_VARIABLE__ADDR);

    labelEClass = createEClass(LABEL);

    parameterVariableEClass = createEClass(PARAMETER_VARIABLE);
    createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__KIND);
    createEAttribute(parameterVariableEClass, PARAMETER_VARIABLE__DEFAULT);

    operationBlockEClass = createEClass(OPERATION_BLOCK);
    createEReference(operationBlockEClass, OPERATION_BLOCK__STEPS);

    // Create enums
    integerKindEEnum = createEEnum(INTEGER_KIND);
    parameterKindEEnum = createEEnum(PARAMETER_KIND);
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
    instructionSetNotationEClass.getESuperTypes().add(this.getCompilationUnit());
    libraryEClass.getESuperTypes().add(this.getCompilationUnit());
    typeEClass.getESuperTypes().add(this.getLibraryItem());
    unspecifiedTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    pointerTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    arrayTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    refTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    dataTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    fixedDataTypeDefEClass.getESuperTypes().add(this.getDataTypeDef());
    integerDataTypeDefEClass.getESuperTypes().add(this.getDataTypeDef());
    structTypeDefEClass.getESuperTypes().add(this.getTypeDef());
    variableEClass.getESuperTypes().add(this.getLibraryItem());
    variableEClass.getESuperTypes().add(this.getOperationStep());
    variableEClass.getESuperTypes().add(this.getOperationParameter());
    variableReferenceEClass.getESuperTypes().add(this.getXPrimaryExpression());
    operationCallEClass.getESuperTypes().add(this.getXPrimaryExpression());
    operationEClass.getESuperTypes().add(this.getLibraryItem());
    lazyParameterEClass.getESuperTypes().add(this.getOperationParameter());
    xExpressionEClass.getESuperTypes().add(this.getOperationCallParameter());
    xExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xExpressionBlockEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xSizeOfExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xStructExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xExpression6EClass.getESuperTypes().add(this.getXExpression());
    xExpressionLiteralEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xTopLevelExpressionEClass.getESuperTypes().add(this.getOperationStep());
    xErrorExpressionEClass.getESuperTypes().add(this.getXTopLevelExpression());
    xIsLiteralExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    xParenthesizedExpressionEClass.getESuperTypes().add(this.getXPrimaryExpression());
    structTypeDefMemberEClass.getESuperTypes().add(this.getVariable());
    constantVariableEClass.getESuperTypes().add(this.getVariable());
    registerVariableEClass.getESuperTypes().add(this.getVariable());
    labelEClass.getESuperTypes().add(this.getVariable());
    parameterVariableEClass.getESuperTypes().add(this.getVariable());
    operationBlockEClass.getESuperTypes().add(this.getXExpressionBlock());

    // Initialize classes and features; add operations and parameters
    initEClass(compilationUnitEClass, CompilationUnit.class, "CompilationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompilationUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompilationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationDefinitionEClass, AnnotationDefinition.class, "AnnotationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Definition(), ecorePackage.getEString(), "definition", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionSetNotationEClass, InstructionSetNotation.class, "InstructionSetNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstructionSetNotation_Extends(), ecorePackage.getEString(), "extends", null, 0, 1, InstructionSetNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstructionSetNotation_Instructions(), this.getInstructionNotation(), null, "instructions", null, 0, -1, InstructionSetNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionNotationEClass, InstructionNotation.class, "InstructionNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstructionNotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstructionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstructionNotation_Params(), this.getInstructionParameterNotation(), null, "params", null, 0, -1, InstructionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstructionNotation_Words(), this.getInstructionWordNotation(), null, "words", null, 0, -1, InstructionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionWordNotationEClass, InstructionWordNotation.class, "InstructionWordNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstructionWordNotation_Sections(), this.getInsctructionSectionNotation(), null, "sections", null, 0, -1, InstructionWordNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionParameterNotationEClass, InstructionParameterNotation.class, "InstructionParameterNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInstructionParameterNotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, InstructionParameterNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstructionParameterNotation_Default(), ecorePackage.getEString(), "default", null, 0, 1, InstructionParameterNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insctructionSectionNotationEClass, InsctructionSectionNotation.class, "InsctructionSectionNotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInsctructionSectionNotation_Param(), ecorePackage.getEString(), "param", null, 0, 1, InsctructionSectionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsctructionSectionNotation_Value(), ecorePackage.getEString(), "value", null, 0, 1, InsctructionSectionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsctructionSectionNotation_Size(), ecorePackage.getEString(), "size", null, 0, 1, InsctructionSectionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsctructionSectionNotation_Shift(), ecorePackage.getEString(), "shift", null, 0, 1, InsctructionSectionNotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLibrary_Use(), ecorePackage.getEString(), "use", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLibrary_Items(), this.getLibraryItem(), null, "items", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(libraryItemEClass, LibraryItem.class, "LibraryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLibraryItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, LibraryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Def(), this.getTypeDef(), null, "def", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefEClass, TypeDef.class, "TypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unspecifiedTypeDefEClass, UnspecifiedTypeDef.class, "UnspecifiedTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pointerTypeDefEClass, PointerTypeDef.class, "PointerTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointerTypeDef_Def(), this.getTypeDef(), null, "def", null, 0, 1, PointerTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayTypeDefEClass, ArrayTypeDef.class, "ArrayTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayTypeDef_Def(), this.getTypeDef(), null, "def", null, 0, 1, ArrayTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayTypeDef_Size(), this.getXExpression(), null, "size", null, 0, 1, ArrayTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refTypeDefEClass, RefTypeDef.class, "RefTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefTypeDef_Type(), ecorePackage.getEString(), "type", null, 0, 1, RefTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(operationStepEClass, OperationStep.class, "OperationStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableReference_Var(), ecorePackage.getEString(), "var", null, 0, 1, VariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperationCall_Operation(), ecorePackage.getEString(), "operation", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCall_Params(), this.getOperationCallParameter(), null, "params", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallParameterEClass, OperationCallParameter.class, "OperationCallParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(operationTypeDefEClass, OperationTypeDef.class, "OperationTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationTypeDef_ResultType(), this.getTypeDef(), null, "resultType", null, 0, 1, OperationTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationTypeDef_Params(), this.getOperationParameter(), null, "params", null, 0, -1, OperationTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Type(), this.getOperationTypeDef(), null, "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Overrides(), ecorePackage.getEString(), "overrides", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Content(), this.getXExpression(), null, "content", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationParameterEClass, OperationParameter.class, "OperationParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lazyParameterEClass, LazyParameter.class, "LazyParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLazyParameter_Paramname(), ecorePackage.getEString(), "paramname", null, 0, 1, LazyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLazyParameter_Type(), this.getOperationTypeDef(), null, "type", null, 0, 1, LazyParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xExpressionEClass, XExpression.class, "XExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xExpressionBlockEClass, XExpressionBlock.class, "XExpressionBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xPrimaryExpressionEClass, XPrimaryExpression.class, "XPrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xSizeOfExpressionEClass, XSizeOfExpression.class, "XSizeOfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXSizeOfExpression_Type(), this.getTypeDef(), null, "type", null, 0, 1, XSizeOfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xStructExpressionEClass, XStructExpression.class, "XStructExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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

    initEClass(xParenthesizedExpressionEClass, XParenthesizedExpression.class, "XParenthesizedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXParenthesizedExpression_A(), this.getXExpression(), null, "a", null, 0, 1, XParenthesizedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structTypeDefMemberEClass, StructTypeDefMember.class, "StructTypeDefMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantVariableEClass, ConstantVariable.class, "ConstantVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstantVariable_Value(), this.getXExpression(), null, "value", null, 0, 1, ConstantVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(registerVariableEClass, RegisterVariable.class, "RegisterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegisterVariable_Addr(), this.getXExpression(), null, "addr", null, 0, 1, RegisterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterVariableEClass, ParameterVariable.class, "ParameterVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterVariable_Kind(), this.getParameterKind(), "kind", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameterVariable_Default(), ecorePackage.getEString(), "default", null, 0, 1, ParameterVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationBlockEClass, OperationBlock.class, "OperationBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationBlock_Steps(), this.getOperationStep(), null, "steps", null, 0, -1, OperationBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(integerKindEEnum, IntegerKind.class, "IntegerKind");
    addEEnumLiteral(integerKindEEnum, IntegerKind.UNSIGNED);
    addEEnumLiteral(integerKindEEnum, IntegerKind.SIGNED);

    initEEnum(parameterKindEEnum, ParameterKind.class, "ParameterKind");
    addEEnumLiteral(parameterKindEEnum, ParameterKind.ANY);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.VAR);
    addEEnumLiteral(parameterKindEEnum, ParameterKind.CONST);

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

/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.e.parser.eSyntax.ESyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface ESyntaxPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eSyntax";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.e.hu/parser/ESyntax";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eSyntax";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ESyntaxPackage eINSTANCE = hu.e.parser.eSyntax.impl.ESyntaxPackageImpl.init();

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.CompilationUnitImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getCompilationUnit()
   * @generated
   */
  int COMPILATION_UNIT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__NAME = 0;

  /**
   * The number of structural features of the '<em>Compilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.LibraryItemImpl <em>Library Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.LibraryItemImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLibraryItem()
   * @generated
   */
  int LIBRARY_ITEM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_ITEM__NAME = 0;

  /**
   * The number of structural features of the '<em>Library Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.AnnotationDefinitionImpl <em>Annotation Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.AnnotationDefinitionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getAnnotationDefinition()
   * @generated
   */
  int ANNOTATION_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEFINITION__NAME = LIBRARY_ITEM__NAME;

  /**
   * The number of structural features of the '<em>Annotation Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_DEFINITION_FEATURE_COUNT = LIBRARY_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationStepImpl <em>Operation Step</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationStepImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationStep()
   * @generated
   */
  int OPERATION_STEP = 20;

  /**
   * The number of structural features of the '<em>Operation Step</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_STEP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XTopLevelExpressionImpl <em>XTop Level Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XTopLevelExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXTopLevelExpression()
   * @generated
   */
  int XTOP_LEVEL_EXPRESSION = 42;

  /**
   * The number of structural features of the '<em>XTop Level Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTOP_LEVEL_EXPRESSION_FEATURE_COUNT = OPERATION_STEP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.AnnotationImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 2;

  /**
   * The feature id for the '<em><b>Definition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__DEFINITION = XTOP_LEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = XTOP_LEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.InstructionSetNotationImpl <em>Instruction Set Notation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.InstructionSetNotationImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInstructionSetNotation()
   * @generated
   */
  int INSTRUCTION_SET_NOTATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_NOTATION__NAME = COMPILATION_UNIT__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_NOTATION__EXTENDS = COMPILATION_UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_NOTATION__INSTRUCTIONS = COMPILATION_UNIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instruction Set Notation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_SET_NOTATION_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.InstructionNotationImpl <em>Instruction Notation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.InstructionNotationImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInstructionNotation()
   * @generated
   */
  int INSTRUCTION_NOTATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_NOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_NOTATION__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_NOTATION__SECTIONS = 2;

  /**
   * The number of structural features of the '<em>Instruction Notation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_NOTATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.InstructionParameterNotationImpl <em>Instruction Parameter Notation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.InstructionParameterNotationImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInstructionParameterNotation()
   * @generated
   */
  int INSTRUCTION_PARAMETER_NOTATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PARAMETER_NOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PARAMETER_NOTATION__DEFAULT = 1;

  /**
   * The number of structural features of the '<em>Instruction Parameter Notation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_PARAMETER_NOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl <em>Insctruction Section Notation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInsctructionSectionNotation()
   * @generated
   */
  int INSCTRUCTION_SECTION_NOTATION = 6;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSCTRUCTION_SECTION_NOTATION__PARAM = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSCTRUCTION_SECTION_NOTATION__VALUE = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSCTRUCTION_SECTION_NOTATION__SIZE = 2;

  /**
   * The feature id for the '<em><b>Shift</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSCTRUCTION_SECTION_NOTATION__SHIFT = 3;

  /**
   * The number of structural features of the '<em>Insctruction Section Notation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSCTRUCTION_SECTION_NOTATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.LibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.LibraryImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLibrary()
   * @generated
   */
  int LIBRARY = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__NAME = COMPILATION_UNIT__NAME;

  /**
   * The feature id for the '<em><b>Use</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__USE = COMPILATION_UNIT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY__ITEMS = COMPILATION_UNIT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIBRARY_FEATURE_COUNT = COMPILATION_UNIT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.TypeImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getType()
   * @generated
   */
  int TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = LIBRARY_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DEF = LIBRARY_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = LIBRARY_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.TypeDefImpl <em>Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.TypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getTypeDef()
   * @generated
   */
  int TYPE_DEF = 10;

  /**
   * The number of structural features of the '<em>Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.UnspecifiedTypeDefImpl <em>Unspecified Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.UnspecifiedTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getUnspecifiedTypeDef()
   * @generated
   */
  int UNSPECIFIED_TYPE_DEF = 11;

  /**
   * The number of structural features of the '<em>Unspecified Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSPECIFIED_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.PointerTypeDefImpl <em>Pointer Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.PointerTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getPointerTypeDef()
   * @generated
   */
  int POINTER_TYPE_DEF = 12;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_TYPE_DEF__DEF = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pointer Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTER_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.ArrayTypeDefImpl <em>Array Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.ArrayTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getArrayTypeDef()
   * @generated
   */
  int ARRAY_TYPE_DEF = 13;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DEF__DEF = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DEF__SIZE = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.RefTypeDefImpl <em>Ref Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.RefTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getRefTypeDef()
   * @generated
   */
  int REF_TYPE_DEF = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE_DEF__TYPE = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.DataTypeDefImpl <em>Data Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.DataTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getDataTypeDef()
   * @generated
   */
  int DATA_TYPE_DEF = 15;

  /**
   * The feature id for the '<em><b>Bits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEF__BITS = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.FixedDataTypeDefImpl <em>Fixed Data Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.FixedDataTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getFixedDataTypeDef()
   * @generated
   */
  int FIXED_DATA_TYPE_DEF = 16;

  /**
   * The feature id for the '<em><b>Bits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_DATA_TYPE_DEF__BITS = DATA_TYPE_DEF__BITS;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_DATA_TYPE_DEF__SCALE = DATA_TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fixed Data Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIXED_DATA_TYPE_DEF_FEATURE_COUNT = DATA_TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.IntegerDataTypeDefImpl <em>Integer Data Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.IntegerDataTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getIntegerDataTypeDef()
   * @generated
   */
  int INTEGER_DATA_TYPE_DEF = 17;

  /**
   * The feature id for the '<em><b>Bits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DATA_TYPE_DEF__BITS = DATA_TYPE_DEF__BITS;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DATA_TYPE_DEF__KIND = DATA_TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Data Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_DATA_TYPE_DEF_FEATURE_COUNT = DATA_TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl <em>Struct Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.StructTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getStructTypeDef()
   * @generated
   */
  int STRUCT_TYPE_DEF = 18;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DEF__MEMBERS = TYPE_DEF_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Struct Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.VariableImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = LIBRARY_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE = LIBRARY_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = LIBRARY_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XPrimaryExpressionImpl <em>XPrimary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XPrimaryExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXPrimaryExpression()
   * @generated
   */
  int XPRIMARY_EXPRESSION = 30;

  /**
   * The number of structural features of the '<em>XPrimary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPRIMARY_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.VariableReferenceImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 21;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VAR = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationCallImpl <em>Operation Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationCallImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationCall()
   * @generated
   */
  int OPERATION_CALL = 22;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL__OPERATION = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL__PARAMS = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationCallParameterImpl <em>Operation Call Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationCallParameterImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationCallParameter()
   * @generated
   */
  int OPERATION_CALL_PARAMETER = 23;

  /**
   * The number of structural features of the '<em>Operation Call Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_CALL_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationTypeDefImpl <em>Operation Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationTypeDefImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationTypeDef()
   * @generated
   */
  int OPERATION_TYPE_DEF = 24;

  /**
   * The feature id for the '<em><b>Result Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_DEF__RESULT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_DEF__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Operation Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_TYPE_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = LIBRARY_ITEM__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = LIBRARY_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Overrides</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OVERRIDES = LIBRARY_ITEM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CONTENT = LIBRARY_ITEM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = LIBRARY_ITEM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationParameterImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationParameter()
   * @generated
   */
  int OPERATION_PARAMETER = 26;

  /**
   * The number of structural features of the '<em>Operation Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.LazyParameterImpl <em>Lazy Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.LazyParameterImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLazyParameter()
   * @generated
   */
  int LAZY_PARAMETER = 27;

  /**
   * The feature id for the '<em><b>Paramname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAZY_PARAMETER__PARAMNAME = OPERATION_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAZY_PARAMETER__TYPE = OPERATION_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lazy Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAZY_PARAMETER_FEATURE_COUNT = OPERATION_PARAMETER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpressionImpl <em>XExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression()
   * @generated
   */
  int XEXPRESSION = 28;

  /**
   * The number of structural features of the '<em>XExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_FEATURE_COUNT = OPERATION_CALL_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpressionBlockImpl <em>XExpression Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpressionBlockImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpressionBlock()
   * @generated
   */
  int XEXPRESSION_BLOCK = 29;

  /**
   * The number of structural features of the '<em>XExpression Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_BLOCK_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XSizeOfExpressionImpl <em>XSize Of Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XSizeOfExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXSizeOfExpression()
   * @generated
   */
  int XSIZE_OF_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSIZE_OF_EXPRESSION__TYPE = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XSize Of Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSIZE_OF_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XStructExpressionImpl <em>XStruct Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XStructExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXStructExpression()
   * @generated
   */
  int XSTRUCT_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRUCT_EXPRESSION__VALUES = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XStruct Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XSTRUCT_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression1Impl <em>XExpression1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression1Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression1()
   * @generated
   */
  int XEXPRESSION1 = 33;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION1__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION1__A = 1;

  /**
   * The number of structural features of the '<em>XExpression1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression0Impl <em>XExpression0</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression0Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression0()
   * @generated
   */
  int XEXPRESSION0 = 34;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION0__A = 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION0__MEMBER = 1;

  /**
   * The number of structural features of the '<em>XExpression0</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION0_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpressionM1Impl <em>XExpression M1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpressionM1Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpressionM1()
   * @generated
   */
  int XEXPRESSION_M1 = 35;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_M1__A = 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_M1__INDEX = 1;

  /**
   * The number of structural features of the '<em>XExpression M1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_M1_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression2Impl <em>XExpression2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression2Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression2()
   * @generated
   */
  int XEXPRESSION2 = 36;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION2__A = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION2__OP = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION2__B = 2;

  /**
   * The number of structural features of the '<em>XExpression2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION2_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression3Impl <em>XExpression3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression3Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression3()
   * @generated
   */
  int XEXPRESSION3 = 37;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION3__A = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION3__OP = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION3__B = 2;

  /**
   * The number of structural features of the '<em>XExpression3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION3_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression4Impl <em>XExpression4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression4Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression4()
   * @generated
   */
  int XEXPRESSION4 = 38;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION4__A = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION4__OP = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION4__B = 2;

  /**
   * The number of structural features of the '<em>XExpression4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION4_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression5Impl <em>XExpression5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression5Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression5()
   * @generated
   */
  int XEXPRESSION5 = 39;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION5__A = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION5__OP = 1;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION5__B = 2;

  /**
   * The number of structural features of the '<em>XExpression5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION5_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpression6Impl <em>XExpression6</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpression6Impl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression6()
   * @generated
   */
  int XEXPRESSION6 = 40;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION6__TYPE = XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION6__REF = XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION6__OP = XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION6__A = XEXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>XExpression6</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION6_FEATURE_COUNT = XEXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XExpressionLiteralImpl <em>XExpression Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XExpressionLiteralImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpressionLiteral()
   * @generated
   */
  int XEXPRESSION_LITERAL = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_LITERAL__VALUE = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XExpression Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XEXPRESSION_LITERAL_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XErrorExpressionImpl <em>XError Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XErrorExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXErrorExpression()
   * @generated
   */
  int XERROR_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XERROR_EXPRESSION__LEVEL = XTOP_LEVEL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XERROR_EXPRESSION__MSG = XTOP_LEVEL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XError Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XERROR_EXPRESSION_FEATURE_COUNT = XTOP_LEVEL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XIsLiteralExpressionImpl <em>XIs Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XIsLiteralExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXIsLiteralExpression()
   * @generated
   */
  int XIS_LITERAL_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIS_LITERAL_EXPRESSION__REF = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XIs Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XIS_LITERAL_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.XParenthesizedExpressionImpl <em>XParenthesized Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.XParenthesizedExpressionImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXParenthesizedExpression()
   * @generated
   */
  int XPARENTHESIZED_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPARENTHESIZED_EXPRESSION__A = XPRIMARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>XParenthesized Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPARENTHESIZED_EXPRESSION_FEATURE_COUNT = XPRIMARY_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.StructTypeDefMemberImpl <em>Struct Type Def Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.StructTypeDefMemberImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getStructTypeDefMember()
   * @generated
   */
  int STRUCT_TYPE_DEF_MEMBER = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DEF_MEMBER__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DEF_MEMBER__TYPE = VARIABLE__TYPE;

  /**
   * The number of structural features of the '<em>Struct Type Def Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_TYPE_DEF_MEMBER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.ConstantVariableImpl <em>Constant Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.ConstantVariableImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getConstantVariable()
   * @generated
   */
  int CONSTANT_VARIABLE = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VARIABLE__TYPE = VARIABLE__TYPE;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VARIABLE__VALUE = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constant Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.RegisterVariableImpl <em>Register Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.RegisterVariableImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getRegisterVariable()
   * @generated
   */
  int REGISTER_VARIABLE = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_VARIABLE__TYPE = VARIABLE__TYPE;

  /**
   * The feature id for the '<em><b>Addr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_VARIABLE__ADDR = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Register Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGISTER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.LabelImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 49;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__TYPE = VARIABLE__TYPE;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.ParameterVariableImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getParameterVariable()
   * @generated
   */
  int PARAMETER_VARIABLE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARIABLE__TYPE = VARIABLE__TYPE;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARIABLE__KIND = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARIABLE__DEFAULT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.impl.OperationBlockImpl <em>Operation Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.impl.OperationBlockImpl
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationBlock()
   * @generated
   */
  int OPERATION_BLOCK = 51;

  /**
   * The feature id for the '<em><b>Steps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_BLOCK__STEPS = XEXPRESSION_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operation Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_BLOCK_FEATURE_COUNT = XEXPRESSION_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.IntegerKind <em>Integer Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.IntegerKind
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getIntegerKind()
   * @generated
   */
  int INTEGER_KIND = 52;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.ParameterKind <em>Parameter Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.ParameterKind
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getParameterKind()
   * @generated
   */
  int PARAMETER_KIND = 53;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.UNARY_OPERATOR <em>UNARY OPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.UNARY_OPERATOR
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getUNARY_OPERATOR()
   * @generated
   */
  int UNARY_OPERATOR = 54;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR <em>MULTIPLICATIVE OPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getMULTIPLICATIVE_OPERATOR()
   * @generated
   */
  int MULTIPLICATIVE_OPERATOR = 55;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.ADDITIVE_OPERATOR <em>ADDITIVE OPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.ADDITIVE_OPERATOR
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getADDITIVE_OPERATOR()
   * @generated
   */
  int ADDITIVE_OPERATOR = 56;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.EQUALITY_OPERATOR <em>EQUALITY OPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.EQUALITY_OPERATOR
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getEQUALITY_OPERATOR()
   * @generated
   */
  int EQUALITY_OPERATOR = 57;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.BOOLEAN_OPERATOR <em>BOOLEAN OPERATOR</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.BOOLEAN_OPERATOR
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getBOOLEAN_OPERATOR()
   * @generated
   */
  int BOOLEAN_OPERATOR = 58;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.ErrorLevels <em>Error Levels</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.ErrorLevels
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getErrorLevels()
   * @generated
   */
  int ERROR_LEVELS = 59;

  /**
   * The meta object id for the '{@link hu.e.parser.eSyntax.OpSingleAssign <em>Op Single Assign</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.e.parser.eSyntax.OpSingleAssign
   * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOpSingleAssign()
   * @generated
   */
  int OP_SINGLE_ASSIGN = 60;


  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.CompilationUnit <em>Compilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation Unit</em>'.
   * @see hu.e.parser.eSyntax.CompilationUnit
   * @generated
   */
  EClass getCompilationUnit();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.CompilationUnit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.e.parser.eSyntax.CompilationUnit#getName()
   * @see #getCompilationUnit()
   * @generated
   */
  EAttribute getCompilationUnit_Name();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.AnnotationDefinition <em>Annotation Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Definition</em>'.
   * @see hu.e.parser.eSyntax.AnnotationDefinition
   * @generated
   */
  EClass getAnnotationDefinition();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see hu.e.parser.eSyntax.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.Annotation#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition</em>'.
   * @see hu.e.parser.eSyntax.Annotation#getDefinition()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Definition();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.InstructionSetNotation <em>Instruction Set Notation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Set Notation</em>'.
   * @see hu.e.parser.eSyntax.InstructionSetNotation
   * @generated
   */
  EClass getInstructionSetNotation();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InstructionSetNotation#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Extends</em>'.
   * @see hu.e.parser.eSyntax.InstructionSetNotation#getExtends()
   * @see #getInstructionSetNotation()
   * @generated
   */
  EAttribute getInstructionSetNotation_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.InstructionSetNotation#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see hu.e.parser.eSyntax.InstructionSetNotation#getInstructions()
   * @see #getInstructionSetNotation()
   * @generated
   */
  EReference getInstructionSetNotation_Instructions();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.InstructionNotation <em>Instruction Notation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Notation</em>'.
   * @see hu.e.parser.eSyntax.InstructionNotation
   * @generated
   */
  EClass getInstructionNotation();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InstructionNotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.e.parser.eSyntax.InstructionNotation#getName()
   * @see #getInstructionNotation()
   * @generated
   */
  EAttribute getInstructionNotation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.InstructionNotation#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.e.parser.eSyntax.InstructionNotation#getParams()
   * @see #getInstructionNotation()
   * @generated
   */
  EReference getInstructionNotation_Params();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.InstructionNotation#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see hu.e.parser.eSyntax.InstructionNotation#getSections()
   * @see #getInstructionNotation()
   * @generated
   */
  EReference getInstructionNotation_Sections();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.InstructionParameterNotation <em>Instruction Parameter Notation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction Parameter Notation</em>'.
   * @see hu.e.parser.eSyntax.InstructionParameterNotation
   * @generated
   */
  EClass getInstructionParameterNotation();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InstructionParameterNotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.e.parser.eSyntax.InstructionParameterNotation#getName()
   * @see #getInstructionParameterNotation()
   * @generated
   */
  EAttribute getInstructionParameterNotation_Name();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InstructionParameterNotation#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see hu.e.parser.eSyntax.InstructionParameterNotation#getDefault()
   * @see #getInstructionParameterNotation()
   * @generated
   */
  EAttribute getInstructionParameterNotation_Default();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.InsctructionSectionNotation <em>Insctruction Section Notation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insctruction Section Notation</em>'.
   * @see hu.e.parser.eSyntax.InsctructionSectionNotation
   * @generated
   */
  EClass getInsctructionSectionNotation();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InsctructionSectionNotation#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Param</em>'.
   * @see hu.e.parser.eSyntax.InsctructionSectionNotation#getParam()
   * @see #getInsctructionSectionNotation()
   * @generated
   */
  EAttribute getInsctructionSectionNotation_Param();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InsctructionSectionNotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.e.parser.eSyntax.InsctructionSectionNotation#getValue()
   * @see #getInsctructionSectionNotation()
   * @generated
   */
  EAttribute getInsctructionSectionNotation_Value();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InsctructionSectionNotation#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see hu.e.parser.eSyntax.InsctructionSectionNotation#getSize()
   * @see #getInsctructionSectionNotation()
   * @generated
   */
  EAttribute getInsctructionSectionNotation_Size();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.InsctructionSectionNotation#getShift <em>Shift</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shift</em>'.
   * @see hu.e.parser.eSyntax.InsctructionSectionNotation#getShift()
   * @see #getInsctructionSectionNotation()
   * @generated
   */
  EAttribute getInsctructionSectionNotation_Shift();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.Library <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see hu.e.parser.eSyntax.Library
   * @generated
   */
  EClass getLibrary();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.Library#getUse <em>Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Use</em>'.
   * @see hu.e.parser.eSyntax.Library#getUse()
   * @see #getLibrary()
   * @generated
   */
  EAttribute getLibrary_Use();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.Library#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see hu.e.parser.eSyntax.Library#getItems()
   * @see #getLibrary()
   * @generated
   */
  EReference getLibrary_Items();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.LibraryItem <em>Library Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library Item</em>'.
   * @see hu.e.parser.eSyntax.LibraryItem
   * @generated
   */
  EClass getLibraryItem();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.LibraryItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.e.parser.eSyntax.LibraryItem#getName()
   * @see #getLibraryItem()
   * @generated
   */
  EAttribute getLibraryItem_Name();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.Type#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see hu.e.parser.eSyntax.Type#getDef()
   * @see #getType()
   * @generated
   */
  EReference getType_Def();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.TypeDef <em>Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Def</em>'.
   * @see hu.e.parser.eSyntax.TypeDef
   * @generated
   */
  EClass getTypeDef();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.UnspecifiedTypeDef <em>Unspecified Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unspecified Type Def</em>'.
   * @see hu.e.parser.eSyntax.UnspecifiedTypeDef
   * @generated
   */
  EClass getUnspecifiedTypeDef();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.PointerTypeDef <em>Pointer Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointer Type Def</em>'.
   * @see hu.e.parser.eSyntax.PointerTypeDef
   * @generated
   */
  EClass getPointerTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.PointerTypeDef#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see hu.e.parser.eSyntax.PointerTypeDef#getDef()
   * @see #getPointerTypeDef()
   * @generated
   */
  EReference getPointerTypeDef_Def();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.ArrayTypeDef <em>Array Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type Def</em>'.
   * @see hu.e.parser.eSyntax.ArrayTypeDef
   * @generated
   */
  EClass getArrayTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.ArrayTypeDef#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see hu.e.parser.eSyntax.ArrayTypeDef#getDef()
   * @see #getArrayTypeDef()
   * @generated
   */
  EReference getArrayTypeDef_Def();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.ArrayTypeDef#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see hu.e.parser.eSyntax.ArrayTypeDef#getSize()
   * @see #getArrayTypeDef()
   * @generated
   */
  EReference getArrayTypeDef_Size();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.RefTypeDef <em>Ref Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Type Def</em>'.
   * @see hu.e.parser.eSyntax.RefTypeDef
   * @generated
   */
  EClass getRefTypeDef();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.RefTypeDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.RefTypeDef#getType()
   * @see #getRefTypeDef()
   * @generated
   */
  EAttribute getRefTypeDef_Type();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.DataTypeDef <em>Data Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Def</em>'.
   * @see hu.e.parser.eSyntax.DataTypeDef
   * @generated
   */
  EClass getDataTypeDef();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.DataTypeDef#getBits <em>Bits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bits</em>'.
   * @see hu.e.parser.eSyntax.DataTypeDef#getBits()
   * @see #getDataTypeDef()
   * @generated
   */
  EAttribute getDataTypeDef_Bits();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.FixedDataTypeDef <em>Fixed Data Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fixed Data Type Def</em>'.
   * @see hu.e.parser.eSyntax.FixedDataTypeDef
   * @generated
   */
  EClass getFixedDataTypeDef();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.FixedDataTypeDef#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see hu.e.parser.eSyntax.FixedDataTypeDef#getScale()
   * @see #getFixedDataTypeDef()
   * @generated
   */
  EAttribute getFixedDataTypeDef_Scale();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.IntegerDataTypeDef <em>Integer Data Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Data Type Def</em>'.
   * @see hu.e.parser.eSyntax.IntegerDataTypeDef
   * @generated
   */
  EClass getIntegerDataTypeDef();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.IntegerDataTypeDef#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see hu.e.parser.eSyntax.IntegerDataTypeDef#getKind()
   * @see #getIntegerDataTypeDef()
   * @generated
   */
  EAttribute getIntegerDataTypeDef_Kind();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.StructTypeDef <em>Struct Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Type Def</em>'.
   * @see hu.e.parser.eSyntax.StructTypeDef
   * @generated
   */
  EClass getStructTypeDef();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.StructTypeDef#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see hu.e.parser.eSyntax.StructTypeDef#getMembers()
   * @see #getStructTypeDef()
   * @generated
   */
  EReference getStructTypeDef_Members();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see hu.e.parser.eSyntax.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.Variable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.Variable#getType()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Type();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.OperationStep <em>Operation Step</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Step</em>'.
   * @see hu.e.parser.eSyntax.OperationStep
   * @generated
   */
  EClass getOperationStep();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see hu.e.parser.eSyntax.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.VariableReference#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see hu.e.parser.eSyntax.VariableReference#getVar()
   * @see #getVariableReference()
   * @generated
   */
  EAttribute getVariableReference_Var();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.OperationCall <em>Operation Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call</em>'.
   * @see hu.e.parser.eSyntax.OperationCall
   * @generated
   */
  EClass getOperationCall();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.OperationCall#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see hu.e.parser.eSyntax.OperationCall#getOperation()
   * @see #getOperationCall()
   * @generated
   */
  EAttribute getOperationCall_Operation();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.OperationCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.e.parser.eSyntax.OperationCall#getParams()
   * @see #getOperationCall()
   * @generated
   */
  EReference getOperationCall_Params();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.OperationCallParameter <em>Operation Call Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Call Parameter</em>'.
   * @see hu.e.parser.eSyntax.OperationCallParameter
   * @generated
   */
  EClass getOperationCallParameter();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.OperationTypeDef <em>Operation Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Type Def</em>'.
   * @see hu.e.parser.eSyntax.OperationTypeDef
   * @generated
   */
  EClass getOperationTypeDef();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.OperationTypeDef#getResultType <em>Result Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result Type</em>'.
   * @see hu.e.parser.eSyntax.OperationTypeDef#getResultType()
   * @see #getOperationTypeDef()
   * @generated
   */
  EReference getOperationTypeDef_ResultType();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.OperationTypeDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.e.parser.eSyntax.OperationTypeDef#getParams()
   * @see #getOperationTypeDef()
   * @generated
   */
  EReference getOperationTypeDef_Params();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see hu.e.parser.eSyntax.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.Operation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.Operation#getType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Type();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.Operation#getOverrides <em>Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overrides</em>'.
   * @see hu.e.parser.eSyntax.Operation#getOverrides()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Overrides();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.Operation#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see hu.e.parser.eSyntax.Operation#getContent()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Content();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.OperationParameter <em>Operation Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Parameter</em>'.
   * @see hu.e.parser.eSyntax.OperationParameter
   * @generated
   */
  EClass getOperationParameter();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.LazyParameter <em>Lazy Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lazy Parameter</em>'.
   * @see hu.e.parser.eSyntax.LazyParameter
   * @generated
   */
  EClass getLazyParameter();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.LazyParameter#getParamname <em>Paramname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paramname</em>'.
   * @see hu.e.parser.eSyntax.LazyParameter#getParamname()
   * @see #getLazyParameter()
   * @generated
   */
  EAttribute getLazyParameter_Paramname();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.LazyParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.LazyParameter#getType()
   * @see #getLazyParameter()
   * @generated
   */
  EReference getLazyParameter_Type();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression <em>XExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression</em>'.
   * @see hu.e.parser.eSyntax.XExpression
   * @generated
   */
  EClass getXExpression();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpressionBlock <em>XExpression Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression Block</em>'.
   * @see hu.e.parser.eSyntax.XExpressionBlock
   * @generated
   */
  EClass getXExpressionBlock();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XPrimaryExpression <em>XPrimary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XPrimary Expression</em>'.
   * @see hu.e.parser.eSyntax.XPrimaryExpression
   * @generated
   */
  EClass getXPrimaryExpression();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XSizeOfExpression <em>XSize Of Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XSize Of Expression</em>'.
   * @see hu.e.parser.eSyntax.XSizeOfExpression
   * @generated
   */
  EClass getXSizeOfExpression();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XSizeOfExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.XSizeOfExpression#getType()
   * @see #getXSizeOfExpression()
   * @generated
   */
  EReference getXSizeOfExpression_Type();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XStructExpression <em>XStruct Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XStruct Expression</em>'.
   * @see hu.e.parser.eSyntax.XStructExpression
   * @generated
   */
  EClass getXStructExpression();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.XStructExpression#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see hu.e.parser.eSyntax.XStructExpression#getValues()
   * @see #getXStructExpression()
   * @generated
   */
  EReference getXStructExpression_Values();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression1 <em>XExpression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression1</em>'.
   * @see hu.e.parser.eSyntax.XExpression1
   * @generated
   */
  EClass getXExpression1();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.XExpression1#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see hu.e.parser.eSyntax.XExpression1#getOperator()
   * @see #getXExpression1()
   * @generated
   */
  EAttribute getXExpression1_Operator();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression1#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression1#getA()
   * @see #getXExpression1()
   * @generated
   */
  EReference getXExpression1_A();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression0 <em>XExpression0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression0</em>'.
   * @see hu.e.parser.eSyntax.XExpression0
   * @generated
   */
  EClass getXExpression0();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression0#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression0#getA()
   * @see #getXExpression0()
   * @generated
   */
  EReference getXExpression0_A();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.XExpression0#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Member</em>'.
   * @see hu.e.parser.eSyntax.XExpression0#getMember()
   * @see #getXExpression0()
   * @generated
   */
  EAttribute getXExpression0_Member();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpressionM1 <em>XExpression M1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression M1</em>'.
   * @see hu.e.parser.eSyntax.XExpressionM1
   * @generated
   */
  EClass getXExpressionM1();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpressionM1#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpressionM1#getA()
   * @see #getXExpressionM1()
   * @generated
   */
  EReference getXExpressionM1_A();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.XExpressionM1#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Index</em>'.
   * @see hu.e.parser.eSyntax.XExpressionM1#getIndex()
   * @see #getXExpressionM1()
   * @generated
   */
  EReference getXExpressionM1_Index();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression2 <em>XExpression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression2</em>'.
   * @see hu.e.parser.eSyntax.XExpression2
   * @generated
   */
  EClass getXExpression2();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression2#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression2#getA()
   * @see #getXExpression2()
   * @generated
   */
  EReference getXExpression2_A();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.XExpression2#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see hu.e.parser.eSyntax.XExpression2#getOp()
   * @see #getXExpression2()
   * @generated
   */
  EAttribute getXExpression2_Op();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.XExpression2#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>B</em>'.
   * @see hu.e.parser.eSyntax.XExpression2#getB()
   * @see #getXExpression2()
   * @generated
   */
  EReference getXExpression2_B();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression3 <em>XExpression3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression3</em>'.
   * @see hu.e.parser.eSyntax.XExpression3
   * @generated
   */
  EClass getXExpression3();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression3#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression3#getA()
   * @see #getXExpression3()
   * @generated
   */
  EReference getXExpression3_A();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.XExpression3#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see hu.e.parser.eSyntax.XExpression3#getOp()
   * @see #getXExpression3()
   * @generated
   */
  EAttribute getXExpression3_Op();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.XExpression3#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>B</em>'.
   * @see hu.e.parser.eSyntax.XExpression3#getB()
   * @see #getXExpression3()
   * @generated
   */
  EReference getXExpression3_B();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression4 <em>XExpression4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression4</em>'.
   * @see hu.e.parser.eSyntax.XExpression4
   * @generated
   */
  EClass getXExpression4();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression4#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression4#getA()
   * @see #getXExpression4()
   * @generated
   */
  EReference getXExpression4_A();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.XExpression4#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see hu.e.parser.eSyntax.XExpression4#getOp()
   * @see #getXExpression4()
   * @generated
   */
  EAttribute getXExpression4_Op();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.XExpression4#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>B</em>'.
   * @see hu.e.parser.eSyntax.XExpression4#getB()
   * @see #getXExpression4()
   * @generated
   */
  EReference getXExpression4_B();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression5 <em>XExpression5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression5</em>'.
   * @see hu.e.parser.eSyntax.XExpression5
   * @generated
   */
  EClass getXExpression5();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression5#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression5#getA()
   * @see #getXExpression5()
   * @generated
   */
  EReference getXExpression5_A();

  /**
   * Returns the meta object for the attribute list '{@link hu.e.parser.eSyntax.XExpression5#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Op</em>'.
   * @see hu.e.parser.eSyntax.XExpression5#getOp()
   * @see #getXExpression5()
   * @generated
   */
  EAttribute getXExpression5_Op();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.XExpression5#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>B</em>'.
   * @see hu.e.parser.eSyntax.XExpression5#getB()
   * @see #getXExpression5()
   * @generated
   */
  EReference getXExpression5_B();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpression6 <em>XExpression6</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression6</em>'.
   * @see hu.e.parser.eSyntax.XExpression6
   * @generated
   */
  EClass getXExpression6();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression6#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.e.parser.eSyntax.XExpression6#getType()
   * @see #getXExpression6()
   * @generated
   */
  EReference getXExpression6_Type();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression6#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see hu.e.parser.eSyntax.XExpression6#getRef()
   * @see #getXExpression6()
   * @generated
   */
  EReference getXExpression6_Ref();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.XExpression6#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see hu.e.parser.eSyntax.XExpression6#getOp()
   * @see #getXExpression6()
   * @generated
   */
  EAttribute getXExpression6_Op();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XExpression6#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XExpression6#getA()
   * @see #getXExpression6()
   * @generated
   */
  EReference getXExpression6_A();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XExpressionLiteral <em>XExpression Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XExpression Literal</em>'.
   * @see hu.e.parser.eSyntax.XExpressionLiteral
   * @generated
   */
  EClass getXExpressionLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.XExpressionLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.e.parser.eSyntax.XExpressionLiteral#getValue()
   * @see #getXExpressionLiteral()
   * @generated
   */
  EAttribute getXExpressionLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XTopLevelExpression <em>XTop Level Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XTop Level Expression</em>'.
   * @see hu.e.parser.eSyntax.XTopLevelExpression
   * @generated
   */
  EClass getXTopLevelExpression();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XErrorExpression <em>XError Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XError Expression</em>'.
   * @see hu.e.parser.eSyntax.XErrorExpression
   * @generated
   */
  EClass getXErrorExpression();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.XErrorExpression#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see hu.e.parser.eSyntax.XErrorExpression#getLevel()
   * @see #getXErrorExpression()
   * @generated
   */
  EAttribute getXErrorExpression_Level();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.XErrorExpression#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Msg</em>'.
   * @see hu.e.parser.eSyntax.XErrorExpression#getMsg()
   * @see #getXErrorExpression()
   * @generated
   */
  EAttribute getXErrorExpression_Msg();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XIsLiteralExpression <em>XIs Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XIs Literal Expression</em>'.
   * @see hu.e.parser.eSyntax.XIsLiteralExpression
   * @generated
   */
  EClass getXIsLiteralExpression();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XIsLiteralExpression#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see hu.e.parser.eSyntax.XIsLiteralExpression#getRef()
   * @see #getXIsLiteralExpression()
   * @generated
   */
  EReference getXIsLiteralExpression_Ref();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.XParenthesizedExpression <em>XParenthesized Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XParenthesized Expression</em>'.
   * @see hu.e.parser.eSyntax.XParenthesizedExpression
   * @generated
   */
  EClass getXParenthesizedExpression();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.XParenthesizedExpression#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see hu.e.parser.eSyntax.XParenthesizedExpression#getA()
   * @see #getXParenthesizedExpression()
   * @generated
   */
  EReference getXParenthesizedExpression_A();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.StructTypeDefMember <em>Struct Type Def Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Type Def Member</em>'.
   * @see hu.e.parser.eSyntax.StructTypeDefMember
   * @generated
   */
  EClass getStructTypeDefMember();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.ConstantVariable <em>Constant Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Variable</em>'.
   * @see hu.e.parser.eSyntax.ConstantVariable
   * @generated
   */
  EClass getConstantVariable();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.ConstantVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.e.parser.eSyntax.ConstantVariable#getValue()
   * @see #getConstantVariable()
   * @generated
   */
  EReference getConstantVariable_Value();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.RegisterVariable <em>Register Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Register Variable</em>'.
   * @see hu.e.parser.eSyntax.RegisterVariable
   * @generated
   */
  EClass getRegisterVariable();

  /**
   * Returns the meta object for the containment reference '{@link hu.e.parser.eSyntax.RegisterVariable#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Addr</em>'.
   * @see hu.e.parser.eSyntax.RegisterVariable#getAddr()
   * @see #getRegisterVariable()
   * @generated
   */
  EReference getRegisterVariable_Addr();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see hu.e.parser.eSyntax.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.ParameterVariable <em>Parameter Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Variable</em>'.
   * @see hu.e.parser.eSyntax.ParameterVariable
   * @generated
   */
  EClass getParameterVariable();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.ParameterVariable#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see hu.e.parser.eSyntax.ParameterVariable#getKind()
   * @see #getParameterVariable()
   * @generated
   */
  EAttribute getParameterVariable_Kind();

  /**
   * Returns the meta object for the attribute '{@link hu.e.parser.eSyntax.ParameterVariable#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see hu.e.parser.eSyntax.ParameterVariable#getDefault()
   * @see #getParameterVariable()
   * @generated
   */
  EAttribute getParameterVariable_Default();

  /**
   * Returns the meta object for class '{@link hu.e.parser.eSyntax.OperationBlock <em>Operation Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation Block</em>'.
   * @see hu.e.parser.eSyntax.OperationBlock
   * @generated
   */
  EClass getOperationBlock();

  /**
   * Returns the meta object for the containment reference list '{@link hu.e.parser.eSyntax.OperationBlock#getSteps <em>Steps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Steps</em>'.
   * @see hu.e.parser.eSyntax.OperationBlock#getSteps()
   * @see #getOperationBlock()
   * @generated
   */
  EReference getOperationBlock_Steps();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.IntegerKind <em>Integer Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Integer Kind</em>'.
   * @see hu.e.parser.eSyntax.IntegerKind
   * @generated
   */
  EEnum getIntegerKind();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.ParameterKind <em>Parameter Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Parameter Kind</em>'.
   * @see hu.e.parser.eSyntax.ParameterKind
   * @generated
   */
  EEnum getParameterKind();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.UNARY_OPERATOR <em>UNARY OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>UNARY OPERATOR</em>'.
   * @see hu.e.parser.eSyntax.UNARY_OPERATOR
   * @generated
   */
  EEnum getUNARY_OPERATOR();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR <em>MULTIPLICATIVE OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>MULTIPLICATIVE OPERATOR</em>'.
   * @see hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR
   * @generated
   */
  EEnum getMULTIPLICATIVE_OPERATOR();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.ADDITIVE_OPERATOR <em>ADDITIVE OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ADDITIVE OPERATOR</em>'.
   * @see hu.e.parser.eSyntax.ADDITIVE_OPERATOR
   * @generated
   */
  EEnum getADDITIVE_OPERATOR();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.EQUALITY_OPERATOR <em>EQUALITY OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>EQUALITY OPERATOR</em>'.
   * @see hu.e.parser.eSyntax.EQUALITY_OPERATOR
   * @generated
   */
  EEnum getEQUALITY_OPERATOR();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.BOOLEAN_OPERATOR <em>BOOLEAN OPERATOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BOOLEAN OPERATOR</em>'.
   * @see hu.e.parser.eSyntax.BOOLEAN_OPERATOR
   * @generated
   */
  EEnum getBOOLEAN_OPERATOR();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.ErrorLevels <em>Error Levels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Error Levels</em>'.
   * @see hu.e.parser.eSyntax.ErrorLevels
   * @generated
   */
  EEnum getErrorLevels();

  /**
   * Returns the meta object for enum '{@link hu.e.parser.eSyntax.OpSingleAssign <em>Op Single Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Op Single Assign</em>'.
   * @see hu.e.parser.eSyntax.OpSingleAssign
   * @generated
   */
  EEnum getOpSingleAssign();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ESyntaxFactory getESyntaxFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.CompilationUnitImpl <em>Compilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.CompilationUnitImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getCompilationUnit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilationUnit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPILATION_UNIT__NAME = eINSTANCE.getCompilationUnit_Name();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.AnnotationDefinitionImpl <em>Annotation Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.AnnotationDefinitionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getAnnotationDefinition()
     * @generated
     */
    EClass ANNOTATION_DEFINITION = eINSTANCE.getAnnotationDefinition();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.AnnotationImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__DEFINITION = eINSTANCE.getAnnotation_Definition();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.InstructionSetNotationImpl <em>Instruction Set Notation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.InstructionSetNotationImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInstructionSetNotation()
     * @generated
     */
    EClass INSTRUCTION_SET_NOTATION = eINSTANCE.getInstructionSetNotation();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_SET_NOTATION__EXTENDS = eINSTANCE.getInstructionSetNotation_Extends();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_SET_NOTATION__INSTRUCTIONS = eINSTANCE.getInstructionSetNotation_Instructions();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.InstructionNotationImpl <em>Instruction Notation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.InstructionNotationImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInstructionNotation()
     * @generated
     */
    EClass INSTRUCTION_NOTATION = eINSTANCE.getInstructionNotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_NOTATION__NAME = eINSTANCE.getInstructionNotation_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_NOTATION__PARAMS = eINSTANCE.getInstructionNotation_Params();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION_NOTATION__SECTIONS = eINSTANCE.getInstructionNotation_Sections();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.InstructionParameterNotationImpl <em>Instruction Parameter Notation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.InstructionParameterNotationImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInstructionParameterNotation()
     * @generated
     */
    EClass INSTRUCTION_PARAMETER_NOTATION = eINSTANCE.getInstructionParameterNotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_PARAMETER_NOTATION__NAME = eINSTANCE.getInstructionParameterNotation_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION_PARAMETER_NOTATION__DEFAULT = eINSTANCE.getInstructionParameterNotation_Default();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl <em>Insctruction Section Notation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getInsctructionSectionNotation()
     * @generated
     */
    EClass INSCTRUCTION_SECTION_NOTATION = eINSTANCE.getInsctructionSectionNotation();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSCTRUCTION_SECTION_NOTATION__PARAM = eINSTANCE.getInsctructionSectionNotation_Param();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSCTRUCTION_SECTION_NOTATION__VALUE = eINSTANCE.getInsctructionSectionNotation_Value();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSCTRUCTION_SECTION_NOTATION__SIZE = eINSTANCE.getInsctructionSectionNotation_Size();

    /**
     * The meta object literal for the '<em><b>Shift</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSCTRUCTION_SECTION_NOTATION__SHIFT = eINSTANCE.getInsctructionSectionNotation_Shift();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.LibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.LibraryImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLibrary()
     * @generated
     */
    EClass LIBRARY = eINSTANCE.getLibrary();

    /**
     * The meta object literal for the '<em><b>Use</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY__USE = eINSTANCE.getLibrary_Use();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIBRARY__ITEMS = eINSTANCE.getLibrary_Items();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.LibraryItemImpl <em>Library Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.LibraryItemImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLibraryItem()
     * @generated
     */
    EClass LIBRARY_ITEM = eINSTANCE.getLibraryItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIBRARY_ITEM__NAME = eINSTANCE.getLibraryItem_Name();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.TypeImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__DEF = eINSTANCE.getType_Def();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.TypeDefImpl <em>Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.TypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getTypeDef()
     * @generated
     */
    EClass TYPE_DEF = eINSTANCE.getTypeDef();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.UnspecifiedTypeDefImpl <em>Unspecified Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.UnspecifiedTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getUnspecifiedTypeDef()
     * @generated
     */
    EClass UNSPECIFIED_TYPE_DEF = eINSTANCE.getUnspecifiedTypeDef();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.PointerTypeDefImpl <em>Pointer Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.PointerTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getPointerTypeDef()
     * @generated
     */
    EClass POINTER_TYPE_DEF = eINSTANCE.getPointerTypeDef();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTER_TYPE_DEF__DEF = eINSTANCE.getPointerTypeDef_Def();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.ArrayTypeDefImpl <em>Array Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.ArrayTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getArrayTypeDef()
     * @generated
     */
    EClass ARRAY_TYPE_DEF = eINSTANCE.getArrayTypeDef();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE_DEF__DEF = eINSTANCE.getArrayTypeDef_Def();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE_DEF__SIZE = eINSTANCE.getArrayTypeDef_Size();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.RefTypeDefImpl <em>Ref Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.RefTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getRefTypeDef()
     * @generated
     */
    EClass REF_TYPE_DEF = eINSTANCE.getRefTypeDef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REF_TYPE_DEF__TYPE = eINSTANCE.getRefTypeDef_Type();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.DataTypeDefImpl <em>Data Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.DataTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getDataTypeDef()
     * @generated
     */
    EClass DATA_TYPE_DEF = eINSTANCE.getDataTypeDef();

    /**
     * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_DEF__BITS = eINSTANCE.getDataTypeDef_Bits();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.FixedDataTypeDefImpl <em>Fixed Data Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.FixedDataTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getFixedDataTypeDef()
     * @generated
     */
    EClass FIXED_DATA_TYPE_DEF = eINSTANCE.getFixedDataTypeDef();

    /**
     * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIXED_DATA_TYPE_DEF__SCALE = eINSTANCE.getFixedDataTypeDef_Scale();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.IntegerDataTypeDefImpl <em>Integer Data Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.IntegerDataTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getIntegerDataTypeDef()
     * @generated
     */
    EClass INTEGER_DATA_TYPE_DEF = eINSTANCE.getIntegerDataTypeDef();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_DATA_TYPE_DEF__KIND = eINSTANCE.getIntegerDataTypeDef_Kind();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl <em>Struct Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.StructTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getStructTypeDef()
     * @generated
     */
    EClass STRUCT_TYPE_DEF = eINSTANCE.getStructTypeDef();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT_TYPE_DEF__MEMBERS = eINSTANCE.getStructTypeDef_Members();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.VariableImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationStepImpl <em>Operation Step</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationStepImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationStep()
     * @generated
     */
    EClass OPERATION_STEP = eINSTANCE.getOperationStep();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.VariableReferenceImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REFERENCE__VAR = eINSTANCE.getVariableReference_Var();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationCallImpl <em>Operation Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationCallImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationCall()
     * @generated
     */
    EClass OPERATION_CALL = eINSTANCE.getOperationCall();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION_CALL__OPERATION = eINSTANCE.getOperationCall_Operation();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_CALL__PARAMS = eINSTANCE.getOperationCall_Params();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationCallParameterImpl <em>Operation Call Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationCallParameterImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationCallParameter()
     * @generated
     */
    EClass OPERATION_CALL_PARAMETER = eINSTANCE.getOperationCallParameter();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationTypeDefImpl <em>Operation Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationTypeDefImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationTypeDef()
     * @generated
     */
    EClass OPERATION_TYPE_DEF = eINSTANCE.getOperationTypeDef();

    /**
     * The meta object literal for the '<em><b>Result Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_TYPE_DEF__RESULT_TYPE = eINSTANCE.getOperationTypeDef_ResultType();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_TYPE_DEF__PARAMS = eINSTANCE.getOperationTypeDef_Params();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TYPE = eINSTANCE.getOperation_Type();

    /**
     * The meta object literal for the '<em><b>Overrides</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OVERRIDES = eINSTANCE.getOperation_Overrides();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__CONTENT = eINSTANCE.getOperation_Content();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationParameterImpl <em>Operation Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationParameterImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationParameter()
     * @generated
     */
    EClass OPERATION_PARAMETER = eINSTANCE.getOperationParameter();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.LazyParameterImpl <em>Lazy Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.LazyParameterImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLazyParameter()
     * @generated
     */
    EClass LAZY_PARAMETER = eINSTANCE.getLazyParameter();

    /**
     * The meta object literal for the '<em><b>Paramname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAZY_PARAMETER__PARAMNAME = eINSTANCE.getLazyParameter_Paramname();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAZY_PARAMETER__TYPE = eINSTANCE.getLazyParameter_Type();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpressionImpl <em>XExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression()
     * @generated
     */
    EClass XEXPRESSION = eINSTANCE.getXExpression();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpressionBlockImpl <em>XExpression Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpressionBlockImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpressionBlock()
     * @generated
     */
    EClass XEXPRESSION_BLOCK = eINSTANCE.getXExpressionBlock();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XPrimaryExpressionImpl <em>XPrimary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XPrimaryExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXPrimaryExpression()
     * @generated
     */
    EClass XPRIMARY_EXPRESSION = eINSTANCE.getXPrimaryExpression();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XSizeOfExpressionImpl <em>XSize Of Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XSizeOfExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXSizeOfExpression()
     * @generated
     */
    EClass XSIZE_OF_EXPRESSION = eINSTANCE.getXSizeOfExpression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSIZE_OF_EXPRESSION__TYPE = eINSTANCE.getXSizeOfExpression_Type();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XStructExpressionImpl <em>XStruct Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XStructExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXStructExpression()
     * @generated
     */
    EClass XSTRUCT_EXPRESSION = eINSTANCE.getXStructExpression();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XSTRUCT_EXPRESSION__VALUES = eINSTANCE.getXStructExpression_Values();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression1Impl <em>XExpression1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression1Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression1()
     * @generated
     */
    EClass XEXPRESSION1 = eINSTANCE.getXExpression1();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION1__OPERATOR = eINSTANCE.getXExpression1_Operator();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION1__A = eINSTANCE.getXExpression1_A();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression0Impl <em>XExpression0</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression0Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression0()
     * @generated
     */
    EClass XEXPRESSION0 = eINSTANCE.getXExpression0();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION0__A = eINSTANCE.getXExpression0_A();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION0__MEMBER = eINSTANCE.getXExpression0_Member();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpressionM1Impl <em>XExpression M1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpressionM1Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpressionM1()
     * @generated
     */
    EClass XEXPRESSION_M1 = eINSTANCE.getXExpressionM1();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION_M1__A = eINSTANCE.getXExpressionM1_A();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION_M1__INDEX = eINSTANCE.getXExpressionM1_Index();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression2Impl <em>XExpression2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression2Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression2()
     * @generated
     */
    EClass XEXPRESSION2 = eINSTANCE.getXExpression2();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION2__A = eINSTANCE.getXExpression2_A();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION2__OP = eINSTANCE.getXExpression2_Op();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION2__B = eINSTANCE.getXExpression2_B();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression3Impl <em>XExpression3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression3Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression3()
     * @generated
     */
    EClass XEXPRESSION3 = eINSTANCE.getXExpression3();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION3__A = eINSTANCE.getXExpression3_A();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION3__OP = eINSTANCE.getXExpression3_Op();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION3__B = eINSTANCE.getXExpression3_B();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression4Impl <em>XExpression4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression4Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression4()
     * @generated
     */
    EClass XEXPRESSION4 = eINSTANCE.getXExpression4();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION4__A = eINSTANCE.getXExpression4_A();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION4__OP = eINSTANCE.getXExpression4_Op();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION4__B = eINSTANCE.getXExpression4_B();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression5Impl <em>XExpression5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression5Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression5()
     * @generated
     */
    EClass XEXPRESSION5 = eINSTANCE.getXExpression5();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION5__A = eINSTANCE.getXExpression5_A();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION5__OP = eINSTANCE.getXExpression5_Op();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION5__B = eINSTANCE.getXExpression5_B();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpression6Impl <em>XExpression6</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpression6Impl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpression6()
     * @generated
     */
    EClass XEXPRESSION6 = eINSTANCE.getXExpression6();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION6__TYPE = eINSTANCE.getXExpression6_Type();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION6__REF = eINSTANCE.getXExpression6_Ref();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION6__OP = eINSTANCE.getXExpression6_Op();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XEXPRESSION6__A = eINSTANCE.getXExpression6_A();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XExpressionLiteralImpl <em>XExpression Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XExpressionLiteralImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXExpressionLiteral()
     * @generated
     */
    EClass XEXPRESSION_LITERAL = eINSTANCE.getXExpressionLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XEXPRESSION_LITERAL__VALUE = eINSTANCE.getXExpressionLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XTopLevelExpressionImpl <em>XTop Level Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XTopLevelExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXTopLevelExpression()
     * @generated
     */
    EClass XTOP_LEVEL_EXPRESSION = eINSTANCE.getXTopLevelExpression();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XErrorExpressionImpl <em>XError Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XErrorExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXErrorExpression()
     * @generated
     */
    EClass XERROR_EXPRESSION = eINSTANCE.getXErrorExpression();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XERROR_EXPRESSION__LEVEL = eINSTANCE.getXErrorExpression_Level();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XERROR_EXPRESSION__MSG = eINSTANCE.getXErrorExpression_Msg();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XIsLiteralExpressionImpl <em>XIs Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XIsLiteralExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXIsLiteralExpression()
     * @generated
     */
    EClass XIS_LITERAL_EXPRESSION = eINSTANCE.getXIsLiteralExpression();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XIS_LITERAL_EXPRESSION__REF = eINSTANCE.getXIsLiteralExpression_Ref();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.XParenthesizedExpressionImpl <em>XParenthesized Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.XParenthesizedExpressionImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getXParenthesizedExpression()
     * @generated
     */
    EClass XPARENTHESIZED_EXPRESSION = eINSTANCE.getXParenthesizedExpression();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPARENTHESIZED_EXPRESSION__A = eINSTANCE.getXParenthesizedExpression_A();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.StructTypeDefMemberImpl <em>Struct Type Def Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.StructTypeDefMemberImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getStructTypeDefMember()
     * @generated
     */
    EClass STRUCT_TYPE_DEF_MEMBER = eINSTANCE.getStructTypeDefMember();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.ConstantVariableImpl <em>Constant Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.ConstantVariableImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getConstantVariable()
     * @generated
     */
    EClass CONSTANT_VARIABLE = eINSTANCE.getConstantVariable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT_VARIABLE__VALUE = eINSTANCE.getConstantVariable_Value();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.RegisterVariableImpl <em>Register Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.RegisterVariableImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getRegisterVariable()
     * @generated
     */
    EClass REGISTER_VARIABLE = eINSTANCE.getRegisterVariable();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGISTER_VARIABLE__ADDR = eINSTANCE.getRegisterVariable_Addr();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.LabelImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.ParameterVariableImpl <em>Parameter Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.ParameterVariableImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getParameterVariable()
     * @generated
     */
    EClass PARAMETER_VARIABLE = eINSTANCE.getParameterVariable();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_VARIABLE__KIND = eINSTANCE.getParameterVariable_Kind();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_VARIABLE__DEFAULT = eINSTANCE.getParameterVariable_Default();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.impl.OperationBlockImpl <em>Operation Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.impl.OperationBlockImpl
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOperationBlock()
     * @generated
     */
    EClass OPERATION_BLOCK = eINSTANCE.getOperationBlock();

    /**
     * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION_BLOCK__STEPS = eINSTANCE.getOperationBlock_Steps();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.IntegerKind <em>Integer Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.IntegerKind
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getIntegerKind()
     * @generated
     */
    EEnum INTEGER_KIND = eINSTANCE.getIntegerKind();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.ParameterKind <em>Parameter Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.ParameterKind
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getParameterKind()
     * @generated
     */
    EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.UNARY_OPERATOR <em>UNARY OPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.UNARY_OPERATOR
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getUNARY_OPERATOR()
     * @generated
     */
    EEnum UNARY_OPERATOR = eINSTANCE.getUNARY_OPERATOR();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR <em>MULTIPLICATIVE OPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getMULTIPLICATIVE_OPERATOR()
     * @generated
     */
    EEnum MULTIPLICATIVE_OPERATOR = eINSTANCE.getMULTIPLICATIVE_OPERATOR();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.ADDITIVE_OPERATOR <em>ADDITIVE OPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.ADDITIVE_OPERATOR
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getADDITIVE_OPERATOR()
     * @generated
     */
    EEnum ADDITIVE_OPERATOR = eINSTANCE.getADDITIVE_OPERATOR();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.EQUALITY_OPERATOR <em>EQUALITY OPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.EQUALITY_OPERATOR
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getEQUALITY_OPERATOR()
     * @generated
     */
    EEnum EQUALITY_OPERATOR = eINSTANCE.getEQUALITY_OPERATOR();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.BOOLEAN_OPERATOR <em>BOOLEAN OPERATOR</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.BOOLEAN_OPERATOR
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getBOOLEAN_OPERATOR()
     * @generated
     */
    EEnum BOOLEAN_OPERATOR = eINSTANCE.getBOOLEAN_OPERATOR();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.ErrorLevels <em>Error Levels</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.ErrorLevels
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getErrorLevels()
     * @generated
     */
    EEnum ERROR_LEVELS = eINSTANCE.getErrorLevels();

    /**
     * The meta object literal for the '{@link hu.e.parser.eSyntax.OpSingleAssign <em>Op Single Assign</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.e.parser.eSyntax.OpSingleAssign
     * @see hu.e.parser.eSyntax.impl.ESyntaxPackageImpl#getOpSingleAssign()
     * @generated
     */
    EEnum OP_SINGLE_ASSIGN = eINSTANCE.getOpSingleAssign();

  }

} //ESyntaxPackage

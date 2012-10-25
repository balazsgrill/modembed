/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.e.parser.eSyntax.ESyntaxPackage
 * @generated
 */
public interface ESyntaxFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ESyntaxFactory eINSTANCE = hu.e.parser.eSyntax.impl.ESyntaxFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Compilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation Unit</em>'.
   * @generated
   */
  CompilationUnit createCompilationUnit();

  /**
   * Returns a new object of class '<em>Annotation Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Definition</em>'.
   * @generated
   */
  AnnotationDefinition createAnnotationDefinition();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Library</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library</em>'.
   * @generated
   */
  Library createLibrary();

  /**
   * Returns a new object of class '<em>Library Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Library Item</em>'.
   * @generated
   */
  LibraryItem createLibraryItem();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Def</em>'.
   * @generated
   */
  TypeDef createTypeDef();

  /**
   * Returns a new object of class '<em>Unspecified Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unspecified Type Def</em>'.
   * @generated
   */
  UnspecifiedTypeDef createUnspecifiedTypeDef();

  /**
   * Returns a new object of class '<em>Pointer Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointer Type Def</em>'.
   * @generated
   */
  PointerTypeDef createPointerTypeDef();

  /**
   * Returns a new object of class '<em>Array Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type Def</em>'.
   * @generated
   */
  ArrayTypeDef createArrayTypeDef();

  /**
   * Returns a new object of class '<em>Ref Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Type Def</em>'.
   * @generated
   */
  RefTypeDef createRefTypeDef();

  /**
   * Returns a new object of class '<em>Data Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Def</em>'.
   * @generated
   */
  DataTypeDef createDataTypeDef();

  /**
   * Returns a new object of class '<em>Fixed Data Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fixed Data Type Def</em>'.
   * @generated
   */
  FixedDataTypeDef createFixedDataTypeDef();

  /**
   * Returns a new object of class '<em>Integer Data Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Data Type Def</em>'.
   * @generated
   */
  IntegerDataTypeDef createIntegerDataTypeDef();

  /**
   * Returns a new object of class '<em>Struct Type Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Type Def</em>'.
   * @generated
   */
  StructTypeDef createStructTypeDef();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Operation Step</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Step</em>'.
   * @generated
   */
  OperationStep createOperationStep();

  /**
   * Returns a new object of class '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Reference</em>'.
   * @generated
   */
  VariableReference createVariableReference();

  /**
   * Returns a new object of class '<em>Operation Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Call</em>'.
   * @generated
   */
  OperationCall createOperationCall();

  /**
   * Returns a new object of class '<em>Operation Call Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Call Parameter</em>'.
   * @generated
   */
  OperationCallParameter createOperationCallParameter();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression</em>'.
   * @generated
   */
  XExpression createXExpression();

  /**
   * Returns a new object of class '<em>XExpression Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression Block</em>'.
   * @generated
   */
  XExpressionBlock createXExpressionBlock();

  /**
   * Returns a new object of class '<em>XPrimary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XPrimary Expression</em>'.
   * @generated
   */
  XPrimaryExpression createXPrimaryExpression();

  /**
   * Returns a new object of class '<em>XSize Of Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XSize Of Expression</em>'.
   * @generated
   */
  XSizeOfExpression createXSizeOfExpression();

  /**
   * Returns a new object of class '<em>XStruct Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XStruct Expression</em>'.
   * @generated
   */
  XStructExpression createXStructExpression();

  /**
   * Returns a new object of class '<em>XExpression1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression1</em>'.
   * @generated
   */
  XExpression1 createXExpression1();

  /**
   * Returns a new object of class '<em>XExpression0</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression0</em>'.
   * @generated
   */
  XExpression0 createXExpression0();

  /**
   * Returns a new object of class '<em>XExpression M1</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression M1</em>'.
   * @generated
   */
  XExpressionM1 createXExpressionM1();

  /**
   * Returns a new object of class '<em>XExpression2</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression2</em>'.
   * @generated
   */
  XExpression2 createXExpression2();

  /**
   * Returns a new object of class '<em>XExpression3</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression3</em>'.
   * @generated
   */
  XExpression3 createXExpression3();

  /**
   * Returns a new object of class '<em>XExpression4</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression4</em>'.
   * @generated
   */
  XExpression4 createXExpression4();

  /**
   * Returns a new object of class '<em>XExpression5</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression5</em>'.
   * @generated
   */
  XExpression5 createXExpression5();

  /**
   * Returns a new object of class '<em>XExpression6</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression6</em>'.
   * @generated
   */
  XExpression6 createXExpression6();

  /**
   * Returns a new object of class '<em>XExpression Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression Literal</em>'.
   * @generated
   */
  XExpressionLiteral createXExpressionLiteral();

  /**
   * Returns a new object of class '<em>XTop Level Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XTop Level Expression</em>'.
   * @generated
   */
  XTopLevelExpression createXTopLevelExpression();

  /**
   * Returns a new object of class '<em>XError Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XError Expression</em>'.
   * @generated
   */
  XErrorExpression createXErrorExpression();

  /**
   * Returns a new object of class '<em>XIs Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XIs Literal Expression</em>'.
   * @generated
   */
  XIsLiteralExpression createXIsLiteralExpression();

  /**
   * Returns a new object of class '<em>XParenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XParenthesized Expression</em>'.
   * @generated
   */
  XParenthesizedExpression createXParenthesizedExpression();

  /**
   * Returns a new object of class '<em>Struct Type Def Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Type Def Member</em>'.
   * @generated
   */
  StructTypeDefMember createStructTypeDefMember();

  /**
   * Returns a new object of class '<em>Constant Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Variable</em>'.
   * @generated
   */
  ConstantVariable createConstantVariable();

  /**
   * Returns a new object of class '<em>Register Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Register Variable</em>'.
   * @generated
   */
  RegisterVariable createRegisterVariable();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Parameter Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Variable</em>'.
   * @generated
   */
  ParameterVariable createParameterVariable();

  /**
   * Returns a new object of class '<em>Operation Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation Block</em>'.
   * @generated
   */
  OperationBlock createOperationBlock();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ESyntaxPackage getESyntaxPackage();

} //ESyntaxFactory

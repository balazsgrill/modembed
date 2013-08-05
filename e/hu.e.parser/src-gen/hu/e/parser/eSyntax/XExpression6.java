/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XExpression6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XExpression6#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression6#getRef <em>Ref</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression6#getOp <em>Op</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression6#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression6()
 * @model
 * @generated
 */
public interface XExpression6 extends XExpression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression6_Type()
   * @model containment="true"
   * @generated
   */
  TypeDef getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression6#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeDef value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(VariableReference)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression6_Ref()
   * @model containment="true"
   * @generated
   */
  VariableReference getRef();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression6#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(VariableReference value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.OpSingleAssign}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see hu.e.parser.eSyntax.OpSingleAssign
   * @see #setOp(OpSingleAssign)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression6_Op()
   * @model
   * @generated
   */
  OpSingleAssign getOp();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression6#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see hu.e.parser.eSyntax.OpSingleAssign
   * @see #getOp()
   * @generated
   */
  void setOp(OpSingleAssign value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(XExpression5)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression6_A()
   * @model containment="true"
   * @generated
   */
  XExpression5 getA();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression6#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(XExpression5 value);

} // XExpression6
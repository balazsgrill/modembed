/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XIs Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XIsLiteralExpression#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXIsLiteralExpression()
 * @model
 * @generated
 */
public interface XIsLiteralExpression extends XPrimaryExpression
{
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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXIsLiteralExpression_Ref()
   * @model containment="true"
   * @generated
   */
  VariableReference getRef();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XIsLiteralExpression#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(VariableReference value);

} // XIsLiteralExpression

/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XParenthesized Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XParenthesizedExpression#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXParenthesizedExpression()
 * @model
 * @generated
 */
public interface XParenthesizedExpression extends XPrimaryExpression
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXParenthesizedExpression_A()
   * @model containment="true"
   * @generated
   */
  XExpression getA();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XParenthesizedExpression#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(XExpression value);

} // XParenthesizedExpression

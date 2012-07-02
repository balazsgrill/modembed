/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XError Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XErrorExpression#getLevel <em>Level</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XErrorExpression#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXErrorExpression()
 * @model
 * @generated
 */
public interface XErrorExpression extends XTopLevelExpression
{
  /**
   * Returns the value of the '<em><b>Level</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.ErrorLevels}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' attribute.
   * @see hu.e.parser.eSyntax.ErrorLevels
   * @see #setLevel(ErrorLevels)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXErrorExpression_Level()
   * @model
   * @generated
   */
  ErrorLevels getLevel();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XErrorExpression#getLevel <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' attribute.
   * @see hu.e.parser.eSyntax.ErrorLevels
   * @see #getLevel()
   * @generated
   */
  void setLevel(ErrorLevels value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' attribute.
   * @see #setMsg(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXErrorExpression_Msg()
   * @model
   * @generated
   */
  String getMsg();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XErrorExpression#getMsg <em>Msg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg</em>' attribute.
   * @see #getMsg()
   * @generated
   */
  void setMsg(String value);

} // XErrorExpression

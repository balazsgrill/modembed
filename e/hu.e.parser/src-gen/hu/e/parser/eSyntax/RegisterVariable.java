/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.RegisterVariable#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getRegisterVariable()
 * @model
 * @generated
 */
public interface RegisterVariable extends Variable
{
  /**
   * Returns the value of the '<em><b>Addr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' containment reference.
   * @see #setAddr(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getRegisterVariable_Addr()
   * @model containment="true"
   * @generated
   */
  XExpression getAddr();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.RegisterVariable#getAddr <em>Addr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' containment reference.
   * @see #getAddr()
   * @generated
   */
  void setAddr(XExpression value);

} // RegisterVariable

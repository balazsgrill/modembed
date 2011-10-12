/**
 * <copyright>
 * </copyright>
 *
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
   * Returns the value of the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' attribute.
   * @see #setAddr(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getRegisterVariable_Addr()
   * @model
   * @generated
   */
  String getAddr();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.RegisterVariable#getAddr <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' attribute.
   * @see #getAddr()
   * @generated
   */
  void setAddr(String value);

} // RegisterVariable

/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ArrayRef#getV <em>V</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayRef()
 * @model
 * @generated
 */
public interface ArrayRef extends VariableRefSection
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayRef_V()
   * @model containment="true"
   * @generated
   */
  XExpression getV();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ArrayRef#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(XExpression value);

} // ArrayRef

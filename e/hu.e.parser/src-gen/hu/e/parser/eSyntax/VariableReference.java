/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.VariableReference#getVar <em>Var</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.VariableReference#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends WordSection, XPrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Variable)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getVariableReference_Var()
   * @model
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.VariableReference#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.VariableRefSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getVariableReference_Ref()
   * @model containment="true"
   * @generated
   */
  EList<VariableRefSection> getRef();

} // VariableReference
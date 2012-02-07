/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XExpression0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XExpression0#getA <em>A</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression0#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression0()
 * @model
 * @generated
 */
public interface XExpression0 extends EObject
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
   * @see #setA(XExpressionM1)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression0_A()
   * @model containment="true"
   * @generated
   */
  XExpressionM1 getA();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression0#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(XExpressionM1 value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' attribute list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression0_Member()
   * @model unique="false"
   * @generated
   */
  EList<String> getMember();

} // XExpression0

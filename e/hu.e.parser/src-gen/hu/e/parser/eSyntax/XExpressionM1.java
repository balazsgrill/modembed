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
 * A representation of the model object '<em><b>XExpression M1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XExpressionM1#getA <em>A</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpressionM1#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpressionM1()
 * @model
 * @generated
 */
public interface XExpressionM1 extends EObject
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
   * @see #setA(XPrimaryExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpressionM1_A()
   * @model containment="true"
   * @generated
   */
  XPrimaryExpression getA();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpressionM1#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(XPrimaryExpression value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpressionM1_Index()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getIndex();

} // XExpressionM1

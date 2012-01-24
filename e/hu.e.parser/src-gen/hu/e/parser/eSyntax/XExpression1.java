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
 * A representation of the model object '<em><b>XExpression1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XExpression1#getOperator <em>Operator</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression1#getA <em>A</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression1()
 * @model
 * @generated
 */
public interface XExpression1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link hu.e.parser.eSyntax.UNARY_OPERATOR}.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.UNARY_OPERATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see hu.e.parser.eSyntax.UNARY_OPERATOR
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression1_Operator()
   * @model unique="false"
   * @generated
   */
  EList<UNARY_OPERATOR> getOperator();

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(XExpression0)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression1_A()
   * @model containment="true"
   * @generated
   */
  XExpression0 getA();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression1#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(XExpression0 value);

} // XExpression1

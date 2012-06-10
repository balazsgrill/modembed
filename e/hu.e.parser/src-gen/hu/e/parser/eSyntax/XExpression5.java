/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XExpression5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XExpression5#getA <em>A</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression5#getOp <em>Op</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XExpression5#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression5()
 * @model
 * @generated
 */
public interface XExpression5 extends EObject
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
   * @see #setA(XExpression4)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression5_A()
   * @model containment="true"
   * @generated
   */
  XExpression4 getA();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XExpression5#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(XExpression4 value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute list.
   * The list contents are of type {@link hu.e.parser.eSyntax.BOOLEAN_OPERATOR}.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.BOOLEAN_OPERATOR}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute list.
   * @see hu.e.parser.eSyntax.BOOLEAN_OPERATOR
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression5_Op()
   * @model unique="false"
   * @generated
   */
  EList<BOOLEAN_OPERATOR> getOp();

  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.XExpression4}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXExpression5_B()
   * @model containment="true"
   * @generated
   */
  EList<XExpression4> getB();

} // XExpression5

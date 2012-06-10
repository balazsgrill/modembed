/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XStruct Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XStructExpression#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XStructExpression#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXStructExpression()
 * @model
 * @generated
 */
public interface XStructExpression extends XPrimaryExpression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXStructExpression_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XStructExpression#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXStructExpression_Values()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getValues();

} // XStructExpression

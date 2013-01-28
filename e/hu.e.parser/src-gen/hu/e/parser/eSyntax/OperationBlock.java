/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.OperationBlock#getSteps <em>Steps</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.OperationBlock#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationBlock()
 * @model
 * @generated
 */
public interface OperationBlock extends XExpressionBlock
{
  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.OperationStep}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationBlock_Steps()
   * @model containment="true"
   * @generated
   */
  EList<OperationStep> getSteps();

  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference.
   * @see #setResult(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationBlock_Result()
   * @model containment="true"
   * @generated
   */
  XExpression getResult();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.OperationBlock#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(XExpression value);

} // OperationBlock

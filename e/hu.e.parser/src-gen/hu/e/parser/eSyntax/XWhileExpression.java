/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XWhile Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XWhileExpression#getCond <em>Cond</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XWhileExpression#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXWhileExpression()
 * @model
 * @generated
 */
public interface XWhileExpression extends XTopLevelExpression
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXWhileExpression_Cond()
   * @model containment="true"
   * @generated
   */
  XExpression getCond();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XWhileExpression#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(XExpression value);

  /**
   * Returns the value of the '<em><b>Do</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do</em>' containment reference.
   * @see #setDo(OperationBlock)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXWhileExpression_Do()
   * @model containment="true"
   * @generated
   */
  OperationBlock getDo();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XWhileExpression#getDo <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do</em>' containment reference.
   * @see #getDo()
   * @generated
   */
  void setDo(OperationBlock value);

} // XWhileExpression

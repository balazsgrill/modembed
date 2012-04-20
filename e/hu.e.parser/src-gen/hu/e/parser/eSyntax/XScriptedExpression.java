/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XScripted Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XScriptedExpression#getScript <em>Script</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XScriptedExpression#getConditional <em>Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXScriptedExpression()
 * @model
 * @generated
 */
public interface XScriptedExpression extends XTopLevelExpression
{
  /**
   * Returns the value of the '<em><b>Script</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Script</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Script</em>' attribute.
   * @see #setScript(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXScriptedExpression_Script()
   * @model
   * @generated
   */
  String getScript();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XScriptedExpression#getScript <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Script</em>' attribute.
   * @see #getScript()
   * @generated
   */
  void setScript(String value);

  /**
   * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional</em>' containment reference.
   * @see #setConditional(OperationBlock)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXScriptedExpression_Conditional()
   * @model containment="true"
   * @generated
   */
  OperationBlock getConditional();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XScriptedExpression#getConditional <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional</em>' containment reference.
   * @see #getConditional()
   * @generated
   */
  void setConditional(OperationBlock value);

} // XScriptedExpression

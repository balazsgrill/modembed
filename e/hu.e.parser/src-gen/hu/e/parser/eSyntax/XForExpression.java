/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.XForExpression#getVar <em>Var</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XForExpression#getFrom <em>From</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XForExpression#getBy <em>By</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XForExpression#getTo <em>To</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.XForExpression#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getXForExpression()
 * @model
 * @generated
 */
public interface XForExpression extends XTopLevelExpression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXForExpression_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XForExpression#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXForExpression_From()
   * @model containment="true"
   * @generated
   */
  XExpression getFrom();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XForExpression#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(XExpression value);

  /**
   * Returns the value of the '<em><b>By</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By</em>' containment reference.
   * @see #setBy(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXForExpression_By()
   * @model containment="true"
   * @generated
   */
  XExpression getBy();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XForExpression#getBy <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By</em>' containment reference.
   * @see #getBy()
   * @generated
   */
  void setBy(XExpression value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXForExpression_To()
   * @model containment="true"
   * @generated
   */
  XExpression getTo();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XForExpression#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(XExpression value);

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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getXForExpression_Do()
   * @model containment="true"
   * @generated
   */
  OperationBlock getDo();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.XForExpression#getDo <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do</em>' containment reference.
   * @see #getDo()
   * @generated
   */
  void setDo(OperationBlock value);

} // XForExpression

/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getContent <em>Content</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getReturn <em>Return</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getReturnvar <em>Returnvar</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends LibraryItem
{
  /**
   * Returns the value of the '<em><b>Overrides</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overrides</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overrides</em>' attribute.
   * @see #setOverrides(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Overrides()
   * @model
   * @generated
   */
  String getOverrides();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getOverrides <em>Overrides</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overrides</em>' attribute.
   * @see #getOverrides()
   * @generated
   */
  void setOverrides(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Params()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getParams();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Content()
   * @model containment="true"
   * @generated
   */
  XExpression getContent();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(XExpression value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Return()
   * @model containment="true"
   * @generated
   */
  XExpression getReturn();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(XExpression value);

  /**
   * Returns the value of the '<em><b>Returnvar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returnvar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returnvar</em>' containment reference.
   * @see #setReturnvar(Variable)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Returnvar()
   * @model containment="true"
   * @generated
   */
  Variable getReturnvar();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getReturnvar <em>Returnvar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returnvar</em>' containment reference.
   * @see #getReturnvar()
   * @generated
   */
  void setReturnvar(Variable value);

} // Operation

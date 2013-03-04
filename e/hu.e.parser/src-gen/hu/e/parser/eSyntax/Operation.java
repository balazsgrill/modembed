/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Operation#getContent <em>Content</em>}</li>
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
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(OperationTypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperation_Type()
   * @model containment="true"
   * @generated
   */
  OperationTypeDef getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Operation#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(OperationTypeDef value);

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

} // Operation

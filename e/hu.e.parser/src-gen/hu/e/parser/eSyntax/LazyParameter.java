/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lazy Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.LazyParameter#getParamname <em>Paramname</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.LazyParameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getLazyParameter()
 * @model
 * @generated
 */
public interface LazyParameter extends OperationParameter
{
  /**
   * Returns the value of the '<em><b>Paramname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramname</em>' attribute.
   * @see #setParamname(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLazyParameter_Paramname()
   * @model
   * @generated
   */
  String getParamname();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LazyParameter#getParamname <em>Paramname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paramname</em>' attribute.
   * @see #getParamname()
   * @generated
   */
  void setParamname(String value);

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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLazyParameter_Type()
   * @model containment="true"
   * @generated
   */
  OperationTypeDef getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LazyParameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(OperationTypeDef value);

} // LazyParameter

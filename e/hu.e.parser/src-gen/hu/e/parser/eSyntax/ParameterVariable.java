/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ParameterVariable#getKind <em>Kind</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.ParameterVariable#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getParameterVariable()
 * @model
 * @generated
 */
public interface ParameterVariable extends Variable
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.ParameterKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see hu.e.parser.eSyntax.ParameterKind
   * @see #setKind(ParameterKind)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getParameterVariable_Kind()
   * @model
   * @generated
   */
  ParameterKind getKind();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ParameterVariable#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see hu.e.parser.eSyntax.ParameterKind
   * @see #getKind()
   * @generated
   */
  void setKind(ParameterKind value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getParameterVariable_Default()
   * @model
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ParameterVariable#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

} // ParameterVariable

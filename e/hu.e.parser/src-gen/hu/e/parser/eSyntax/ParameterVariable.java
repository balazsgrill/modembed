/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ParameterVariable#getKind <em>Kind</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.ParameterVariable#getVar <em>Var</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.ParameterVariable#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getParameterVariable()
 * @model
 * @generated
 */
public interface ParameterVariable extends EObject
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
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getParameterVariable_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ParameterVariable#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

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

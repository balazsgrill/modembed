/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.OperationTypeDef#getResultType <em>Result Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.OperationTypeDef#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationTypeDef()
 * @model
 * @generated
 */
public interface OperationTypeDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Result Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result Type</em>' containment reference.
   * @see #setResultType(TypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationTypeDef_ResultType()
   * @model containment="true"
   * @generated
   */
  TypeDef getResultType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.OperationTypeDef#getResultType <em>Result Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result Type</em>' containment reference.
   * @see #getResultType()
   * @generated
   */
  void setResultType(TypeDef value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.OperationParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperationTypeDef_Params()
   * @model containment="true"
   * @generated
   */
  EList<OperationParameter> getParams();

} // OperationTypeDef

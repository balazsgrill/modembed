/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.Variable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends ClassItem, LibraryItem, OperationStep
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
   * @see #setType(TypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getVariable_Type()
   * @model containment="true"
   * @generated
   */
  TypeDef getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.Variable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeDef value);

} // Variable

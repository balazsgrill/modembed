/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ArrayTypeDef#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.ArrayTypeDef#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayTypeDef()
 * @model
 * @generated
 */
public interface ArrayTypeDef extends TypeDef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayTypeDef_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ArrayTypeDef#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' containment reference.
   * @see #setLength(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayTypeDef_Length()
   * @model containment="true"
   * @generated
   */
  XExpression getLength();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ArrayTypeDef#getLength <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' containment reference.
   * @see #getLength()
   * @generated
   */
  void setLength(XExpression value);

} // ArrayTypeDef

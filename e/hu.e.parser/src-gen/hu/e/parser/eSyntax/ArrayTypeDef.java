/**
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
 *   <li>{@link hu.e.parser.eSyntax.ArrayTypeDef#getSize <em>Size</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.ArrayTypeDef#getDef <em>Def</em>}</li>
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
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayTypeDef_Size()
   * @model containment="true"
   * @generated
   */
  XExpression getSize();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ArrayTypeDef#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(XExpression value);

  /**
   * Returns the value of the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' containment reference.
   * @see #setDef(TypeDef)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getArrayTypeDef_Def()
   * @model containment="true"
   * @generated
   */
  TypeDef getDef();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ArrayTypeDef#getDef <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' containment reference.
   * @see #getDef()
   * @generated
   */
  void setDef(TypeDef value);

} // ArrayTypeDef

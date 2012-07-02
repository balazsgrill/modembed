/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Data Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.IntegerDataTypeDef#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getIntegerDataTypeDef()
 * @model
 * @generated
 */
public interface IntegerDataTypeDef extends DataTypeDef
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.IntegerKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see hu.e.parser.eSyntax.IntegerKind
   * @see #setKind(IntegerKind)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getIntegerDataTypeDef_Kind()
   * @model
   * @generated
   */
  IntegerKind getKind();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.IntegerDataTypeDef#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see hu.e.parser.eSyntax.IntegerKind
   * @see #getKind()
   * @generated
   */
  void setKind(IntegerKind value);

} // IntegerDataTypeDef

/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.DataTypeDef#getBits <em>Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getDataTypeDef()
 * @model
 * @generated
 */
public interface DataTypeDef extends TypeDef
{
  /**
   * Returns the value of the '<em><b>Bits</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bits</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bits</em>' attribute.
   * @see #setBits(int)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getDataTypeDef_Bits()
   * @model
   * @generated
   */
  int getBits();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.DataTypeDef#getBits <em>Bits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bits</em>' attribute.
   * @see #getBits()
   * @generated
   */
  void setBits(int value);

} // DataTypeDef

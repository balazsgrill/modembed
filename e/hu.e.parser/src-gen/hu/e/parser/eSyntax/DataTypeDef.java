/**
 * <copyright>
 * </copyright>
 *
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
 *   <li>{@link hu.e.parser.eSyntax.DataTypeDef#getKind <em>Kind</em>}</li>
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
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.PrimitiveKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see hu.e.parser.eSyntax.PrimitiveKind
   * @see #setKind(PrimitiveKind)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getDataTypeDef_Kind()
   * @model
   * @generated
   */
  PrimitiveKind getKind();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.DataTypeDef#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see hu.e.parser.eSyntax.PrimitiveKind
   * @see #getKind()
   * @generated
   */
  void setKind(PrimitiveKind value);

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

/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Data Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.FixedDataTypeDef#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getFixedDataTypeDef()
 * @model
 * @generated
 */
public interface FixedDataTypeDef extends DataTypeDef
{
  /**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #setScale(BigDecimal)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFixedDataTypeDef_Scale()
   * @model
   * @generated
   */
  BigDecimal getScale();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FixedDataTypeDef#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #getScale()
   * @generated
   */
  void setScale(BigDecimal value);

} // FixedDataTypeDef

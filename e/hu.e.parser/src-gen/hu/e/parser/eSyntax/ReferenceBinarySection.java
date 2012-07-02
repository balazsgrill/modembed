/**
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Binary Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ReferenceBinarySection#getInc <em>Inc</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getReferenceBinarySection()
 * @model
 * @generated
 */
public interface ReferenceBinarySection extends BinarySection
{
  /**
   * Returns the value of the '<em><b>Inc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc</em>' reference.
   * @see #setInc(LinkedBinary)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getReferenceBinarySection_Inc()
   * @model
   * @generated
   */
  LinkedBinary getInc();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ReferenceBinarySection#getInc <em>Inc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc</em>' reference.
   * @see #getInc()
   * @generated
   */
  void setInc(LinkedBinary value);

} // ReferenceBinarySection

/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Binary Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ConstantBinarySection#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getConstantBinarySection()
 * @model
 * @generated
 */
public interface ConstantBinarySection extends BinarySection
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getConstantBinarySection_Data()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getData();

} // ConstantBinarySection

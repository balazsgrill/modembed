/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Binary Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getMemwidth <em>Memwidth</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.FunctionBinarySection#getMems <em>Mems</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection()
 * @model
 * @generated
 */
public interface FunctionBinarySection extends BinarySection
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see #setOperation(Operation)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Operation()
   * @model
   * @generated
   */
  Operation getOperation();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getOperation <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(Operation value);

  /**
   * Returns the value of the '<em><b>Memwidth</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memwidth</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memwidth</em>' attribute.
   * @see #setMemwidth(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Memwidth()
   * @model
   * @generated
   */
  String getMemwidth();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.FunctionBinarySection#getMemwidth <em>Memwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memwidth</em>' attribute.
   * @see #getMemwidth()
   * @generated
   */
  void setMemwidth(String value);

  /**
   * Returns the value of the '<em><b>Mems</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.FunctionMemory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mems</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getFunctionBinarySection_Mems()
   * @model containment="true"
   * @generated
   */
  EList<FunctionMemory> getMems();

} // FunctionBinarySection

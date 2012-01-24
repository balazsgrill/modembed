/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.OperatorDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.OperatorDefinition#getCandidate <em>Candidate</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperatorDefinition()
 * @model
 * @generated
 */
public interface OperatorDefinition extends LibraryItem
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * The literals are from the enumeration {@link hu.e.parser.eSyntax.OperationRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see hu.e.parser.eSyntax.OperationRole
   * @see #setRole(OperationRole)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperatorDefinition_Role()
   * @model
   * @generated
   */
  OperationRole getRole();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.OperatorDefinition#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see hu.e.parser.eSyntax.OperationRole
   * @see #getRole()
   * @generated
   */
  void setRole(OperationRole value);

  /**
   * Returns the value of the '<em><b>Candidate</b></em>' reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Candidate</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Candidate</em>' reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOperatorDefinition_Candidate()
   * @model
   * @generated
   */
  EList<Operation> getCandidate();

} // OperatorDefinition

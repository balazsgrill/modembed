/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.WorkflowNotation#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getWorkflowNotation()
 * @model
 * @generated
 */
public interface WorkflowNotation extends CompilationUnit
{
  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.WorkflowStepNotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getWorkflowNotation_Steps()
   * @model containment="true"
   * @generated
   */
  EList<WorkflowStepNotation> getSteps();

} // WorkflowNotation

/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Step Parameter Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.WorkflowStepParameterNotation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.WorkflowStepParameterNotation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getWorkflowStepParameterNotation()
 * @model
 * @generated
 */
public interface WorkflowStepParameterNotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute.
   * @see #setParameter(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getWorkflowStepParameterNotation_Parameter()
   * @model
   * @generated
   */
  String getParameter();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.WorkflowStepParameterNotation#getParameter <em>Parameter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' attribute.
   * @see #getParameter()
   * @generated
   */
  void setParameter(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getWorkflowStepParameterNotation_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.WorkflowStepParameterNotation#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // WorkflowStepParameterNotation

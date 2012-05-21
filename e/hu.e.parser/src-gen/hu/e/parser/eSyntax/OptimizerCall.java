/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimizer Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.OptimizerCall#getOptimizer <em>Optimizer</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getOptimizerCall()
 * @model
 * @generated
 */
public interface OptimizerCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Optimizer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optimizer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optimizer</em>' attribute.
   * @see #setOptimizer(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getOptimizerCall_Optimizer()
   * @model
   * @generated
   */
  String getOptimizer();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.OptimizerCall#getOptimizer <em>Optimizer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optimizer</em>' attribute.
   * @see #getOptimizer()
   * @generated
   */
  void setOptimizer(String value);

} // OptimizerCall

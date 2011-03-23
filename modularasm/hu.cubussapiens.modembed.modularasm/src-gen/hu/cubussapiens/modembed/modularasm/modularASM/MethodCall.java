/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getMethod <em>Method</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodCall()
 * @model
 * @generated
 */
public interface MethodCall extends Step
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference.
   * @see #setMethod(QualifiedID)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodCall_Method()
   * @model containment="true"
   * @generated
   */
  QualifiedID getMethod();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCall#getMethod <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' containment reference.
   * @see #getMethod()
   * @generated
   */
  void setMethod(QualifiedID value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodCall_Params()
   * @model containment="true"
   * @generated
   */
  EList<MethodCallParam> getParams();

} // MethodCall

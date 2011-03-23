/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.Method#getParams <em>Params</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.Method#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends ModuleItem
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethod_Params()
   * @model containment="true"
   * @generated
   */
  EList<MethodParam> getParams();

  /**
   * Returns the value of the '<em><b>Step</b></em>' containment reference list.
   * The list contents are of type {@link hu.cubussapiens.modembed.modularasm.modularASM.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Step</em>' containment reference list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethod_Step()
   * @model containment="true"
   * @generated
   */
  EList<Step> getStep();

} // Method

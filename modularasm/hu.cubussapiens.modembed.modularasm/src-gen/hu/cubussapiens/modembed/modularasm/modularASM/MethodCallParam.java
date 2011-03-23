/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodCallParam()
 * @model
 * @generated
 */
public interface MethodCallParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(QualifiedID)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodCallParam_Ref()
   * @model containment="true"
   * @generated
   */
  QualifiedID getRef();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(QualifiedID value);

} // MethodCallParam

/**
 * <copyright>
 * </copyright>
 *
 */
package hu.cubussapiens.modembed.modularasm.modularASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.RefParam#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getRefParam()
 * @model
 * @generated
 */
public interface RefParam extends Param
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
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getRefParam_Ref()
   * @model containment="true"
   * @generated
   */
  QualifiedID getRef();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.RefParam#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(QualifiedID value);

} // RefParam

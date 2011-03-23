/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getIns <em>Ins</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends Step
{
  /**
   * Returns the value of the '<em><b>Ins</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ins</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ins</em>' attribute.
   * @see #setIns(String)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getInstruction_Ins()
   * @model
   * @generated
   */
  String getIns();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.Instruction#getIns <em>Ins</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ins</em>' attribute.
   * @see #getIns()
   * @generated
   */
  void setIns(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.cubussapiens.modembed.modularasm.modularASM.InsParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getInstruction_Params()
   * @model containment="true"
   * @generated
   */
  EList<InsParam> getParams();

} // Instruction

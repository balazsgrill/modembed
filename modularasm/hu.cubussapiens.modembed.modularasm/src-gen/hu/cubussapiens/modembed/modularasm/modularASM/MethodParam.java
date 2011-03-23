/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getType <em>Type</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodParam()
 * @model
 * @generated
 */
public interface MethodParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(QualifiedID)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodParam_Type()
   * @model containment="true"
   * @generated
   */
  QualifiedID getType();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(QualifiedID value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getMethodParam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.MethodParam#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // MethodParam

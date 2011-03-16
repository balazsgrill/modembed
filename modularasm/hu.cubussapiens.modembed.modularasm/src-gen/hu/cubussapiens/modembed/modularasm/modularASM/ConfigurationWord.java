/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getDefault <em>Default</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationWord()
 * @model
 * @generated
 */
public interface ConfigurationWord extends ModuleItem
{
  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(LiteralParam)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationWord_Default()
   * @model containment="true"
   * @generated
   */
  LiteralParam getDefault();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationWord#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(LiteralParam value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationWord_Fields()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationFieldPlace> getFields();

} // ConfigurationWord

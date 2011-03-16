/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Configuration Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getName <em>Name</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getEnumConfigurationField()
 * @model
 * @generated
 */
public interface EnumConfigurationField extends ConfigurationField
{
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
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getEnumConfigurationField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
   * The list contents are of type {@link hu.cubussapiens.modembed.modularasm.modularASM.EnumConfigurationFieldLiteral}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' containment reference list.
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getEnumConfigurationField_Literals()
   * @model containment="true"
   * @generated
   */
  EList<EnumConfigurationFieldLiteral> getLiterals();

} // EnumConfigurationField

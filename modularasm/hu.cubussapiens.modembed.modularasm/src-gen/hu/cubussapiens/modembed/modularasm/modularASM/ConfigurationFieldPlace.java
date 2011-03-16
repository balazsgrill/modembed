/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Field Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getBitNum <em>Bit Num</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getStartBit <em>Start Bit</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationFieldPlace()
 * @model
 * @generated
 */
public interface ConfigurationFieldPlace extends EObject
{
  /**
   * Returns the value of the '<em><b>Bit Num</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bit Num</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bit Num</em>' containment reference.
   * @see #setBitNum(LiteralParam)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationFieldPlace_BitNum()
   * @model containment="true"
   * @generated
   */
  LiteralParam getBitNum();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getBitNum <em>Bit Num</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bit Num</em>' containment reference.
   * @see #getBitNum()
   * @generated
   */
  void setBitNum(LiteralParam value);

  /**
   * Returns the value of the '<em><b>Start Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Bit</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Bit</em>' containment reference.
   * @see #setStartBit(LiteralParam)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationFieldPlace_StartBit()
   * @model containment="true"
   * @generated
   */
  LiteralParam getStartBit();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getStartBit <em>Start Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Bit</em>' containment reference.
   * @see #getStartBit()
   * @generated
   */
  void setStartBit(LiteralParam value);

  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(ConfigurationField)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getConfigurationFieldPlace_Field()
   * @model containment="true"
   * @generated
   */
  ConfigurationField getField();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(ConfigurationField value);

} // ConfigurationFieldPlace

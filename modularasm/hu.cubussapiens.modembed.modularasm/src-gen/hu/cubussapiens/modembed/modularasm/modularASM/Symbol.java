/**
 * <copyright>
 * </copyright>
 *
 */
package hu.cubussapiens.modembed.modularasm.modularASM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.Symbol#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends ModuleItem
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage#getSymbol_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link hu.cubussapiens.modembed.modularasm.modularASM.Symbol#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Symbol

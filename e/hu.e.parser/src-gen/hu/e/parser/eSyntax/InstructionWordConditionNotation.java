/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Word Condition Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.InstructionWordConditionNotation#getParam <em>Param</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.InstructionWordConditionNotation#getMask <em>Mask</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.InstructionWordConditionNotation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionWordConditionNotation()
 * @model
 * @generated
 */
public interface InstructionWordConditionNotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionWordConditionNotation_Param()
   * @model
   * @generated
   */
  String getParam();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstructionWordConditionNotation#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
  void setParam(String value);

  /**
   * Returns the value of the '<em><b>Mask</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mask</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' attribute.
   * @see #setMask(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionWordConditionNotation_Mask()
   * @model
   * @generated
   */
  String getMask();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstructionWordConditionNotation#getMask <em>Mask</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' attribute.
   * @see #getMask()
   * @generated
   */
  void setMask(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionWordConditionNotation_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstructionWordConditionNotation#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // InstructionWordConditionNotation

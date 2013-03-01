/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.InstructionNotation#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.InstructionNotation#getParams <em>Params</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.InstructionNotation#getWords <em>Words</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionNotation()
 * @model
 * @generated
 */
public interface InstructionNotation extends EObject
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
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionNotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstructionNotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.InstructionParameterNotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionNotation_Params()
   * @model containment="true"
   * @generated
   */
  EList<InstructionParameterNotation> getParams();

  /**
   * Returns the value of the '<em><b>Words</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.InstructionWordNotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Words</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionNotation_Words()
   * @model containment="true"
   * @generated
   */
  EList<InstructionWordNotation> getWords();

} // InstructionNotation

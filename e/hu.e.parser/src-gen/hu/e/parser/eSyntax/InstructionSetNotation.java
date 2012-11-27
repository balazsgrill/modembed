/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Set Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.InstructionSetNotation#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.InstructionSetNotation#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionSetNotation()
 * @model
 * @generated
 */
public interface InstructionSetNotation extends CompilationUnit
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' attribute.
   * @see #setExtends(String)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionSetNotation_Extends()
   * @model
   * @generated
   */
  String getExtends();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstructionSetNotation#getExtends <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' attribute.
   * @see #getExtends()
   * @generated
   */
  void setExtends(String value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.InstructionNotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionSetNotation_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<InstructionNotation> getInstructions();

} // InstructionSetNotation

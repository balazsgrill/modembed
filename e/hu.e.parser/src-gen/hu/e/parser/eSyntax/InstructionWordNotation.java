/**
 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Word Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.InstructionWordNotation#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionWordNotation()
 * @model
 * @generated
 */
public interface InstructionWordNotation extends EObject
{
  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.InsctructionSectionNotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstructionWordNotation_Sections()
   * @model containment="true"
   * @generated
   */
  EList<InsctructionSectionNotation> getSections();

} // InstructionWordNotation

/**
 * <copyright>
 * </copyright>
 *
 */
package hu.e.parser.eSyntax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.LabelReference#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getLabelReference()
 * @model
 * @generated
 */
public interface LabelReference extends WordSection, OperationCallParameter
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' reference.
   * @see #setLabel(Label)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLabelReference_Label()
   * @model
   * @generated
   */
  Label getLabel();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.LabelReference#getLabel <em>Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(Label value);

} // LabelReference

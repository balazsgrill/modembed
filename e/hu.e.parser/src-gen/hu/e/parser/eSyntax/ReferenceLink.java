/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.ReferenceLink#getRef <em>Ref</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.ReferenceLink#getInst <em>Inst</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getReferenceLink()
 * @model
 * @generated
 */
public interface ReferenceLink extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(InstanceReference)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getReferenceLink_Ref()
   * @model
   * @generated
   */
  InstanceReference getRef();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ReferenceLink#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(InstanceReference value);

  /**
   * Returns the value of the '<em><b>Inst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inst</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst</em>' reference.
   * @see #setInst(LinkedInstance)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getReferenceLink_Inst()
   * @model
   * @generated
   */
  LinkedInstance getInst();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.ReferenceLink#getInst <em>Inst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst</em>' reference.
   * @see #getInst()
   * @generated
   */
  void setInst(LinkedInstance value);

} // ReferenceLink

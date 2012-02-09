/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.Module#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Module#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends CompilationUnit
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Module}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getModule_Extends()
   * @model
   * @generated
   */
  EList<Module> getExtends();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.ModuleItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getModule_Items()
   * @model containment="true"
   * @generated
   */
  EList<ModuleItem> getItems();

} // Module

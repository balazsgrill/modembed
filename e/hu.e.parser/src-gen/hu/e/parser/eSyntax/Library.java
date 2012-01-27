/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.Library#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Library#getUse <em>Use</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.Library#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends CompilationUnit
{
  /**
   * Returns the value of the '<em><b>Overrides</b></em>' reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Library}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overrides</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overrides</em>' reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLibrary_Overrides()
   * @model
   * @generated
   */
  EList<Library> getOverrides();

  /**
   * Returns the value of the '<em><b>Use</b></em>' reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.Library}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use</em>' reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLibrary_Use()
   * @model
   * @generated
   */
  EList<Library> getUse();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link hu.e.parser.eSyntax.LibraryItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getLibrary_Items()
   * @model containment="true"
   * @generated
   */
  EList<LibraryItem> getItems();

} // Library

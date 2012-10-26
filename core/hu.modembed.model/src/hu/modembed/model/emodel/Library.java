/**
 */
package hu.modembed.model.emodel;

import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.Library#getUses <em>Uses</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.Library#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends RootElement {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see hu.modembed.model.emodel.EmodelPackage#getLibrary_Uses()
	 * @model
	 * @generated
	 */
	EList<Library> getUses();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.LibraryElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see hu.modembed.model.emodel.EmodelPackage#getLibrary_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<LibraryElement> getContent();

} // Library

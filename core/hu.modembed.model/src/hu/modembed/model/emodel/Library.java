/**
 */
package hu.modembed.model.emodel;

import hu.modembed.model.core.NamedElement;

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
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends hu.modembed.model.core.Package, NamedElement {
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

} // Library

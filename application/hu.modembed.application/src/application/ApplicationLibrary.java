/**
 */
package application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationLibrary#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationLibrary()
 * @model
 * @generated
 */
public interface ApplicationLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link application.LibraryElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationLibrary_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<LibraryElement> getElements();

} // ApplicationLibrary

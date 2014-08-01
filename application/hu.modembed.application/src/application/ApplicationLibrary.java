/**
 */
package application;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationLibrary#getElements <em>Elements</em>}</li>
 *   <li>{@link application.ApplicationLibrary#getQualifiedId <em>Qualified Id</em>}</li>
 *   <li>{@link application.ApplicationLibrary#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationLibrary()
 * @model
 * @generated
 */
public interface ApplicationLibrary extends EObject {
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

	/**
	 * Returns the value of the '<em><b>Qualified Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Id</em>' attribute.
	 * @see #setQualifiedId(String)
	 * @see application.ApplicationPackage#getApplicationLibrary_QualifiedId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getQualifiedId();

	/**
	 * Sets the value of the '{@link application.ApplicationLibrary#getQualifiedId <em>Qualified Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Id</em>' attribute.
	 * @see #getQualifiedId()
	 * @generated
	 */
	void setQualifiedId(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link application.ApplicationLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see application.ApplicationPackage#getApplicationLibrary_Uses()
	 * @model
	 * @generated
	 */
	EList<ApplicationLibrary> getUses();

} // ApplicationLibrary

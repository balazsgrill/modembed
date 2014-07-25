/**
 */
package application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationModuleType#getImplements <em>Implements</em>}</li>
 *   <li>{@link application.ApplicationModuleType#getExpects <em>Expects</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationModuleType()
 * @model
 * @generated
 */
public interface ApplicationModuleType extends LibraryElement {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference list.
	 * The list contents are of type {@link application.ApplicationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationModuleType_Implements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationInterface> getImplements();

	/**
	 * Returns the value of the '<em><b>Expects</b></em>' containment reference list.
	 * The list contents are of type {@link application.ApplicationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expects</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationModuleType_Expects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationInterface> getExpects();

} // ApplicationModuleType

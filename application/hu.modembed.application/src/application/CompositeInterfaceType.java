/**
 */
package application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.CompositeInterfaceType#getExpects <em>Expects</em>}</li>
 *   <li>{@link application.CompositeInterfaceType#getImplements <em>Implements</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getCompositeInterfaceType()
 * @model
 * @generated
 */
public interface CompositeInterfaceType extends ApplicationInterfaceType {
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
	 * @see application.ApplicationPackage#getCompositeInterfaceType_Expects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationInterface> getExpects();

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
	 * @see application.ApplicationPackage#getCompositeInterfaceType_Implements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationInterface> getImplements();

} // CompositeInterfaceType

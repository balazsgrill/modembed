/**
 */
package application;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Of Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.InterfaceOfModule#getModule <em>Module</em>}</li>
 *   <li>{@link application.InterfaceOfModule#getInterface <em>Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getInterfaceOfModule()
 * @model
 * @generated
 */
public interface InterfaceOfModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(ApplicationModule)
	 * @see application.ApplicationPackage#getInterfaceOfModule_Module()
	 * @model
	 * @generated
	 */
	ApplicationModule getModule();

	/**
	 * Sets the value of the '{@link application.InterfaceOfModule#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(ApplicationModule value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link application.ApplicationInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see application.ApplicationPackage#getInterfaceOfModule_Interface()
	 * @model required="true"
	 * @generated
	 */
	EList<ApplicationInterface> getInterface();

} // InterfaceOfModule

/**
 */
package hu.modembed.model.application;

import hu.modembed.model.application.interface_.Operation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.application.Application#getMainComp <em>Main Comp</em>}</li>
 *   <li>{@link hu.modembed.model.application.Application#getMainPort <em>Main Port</em>}</li>
 *   <li>{@link hu.modembed.model.application.Application#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.application.ApplicationPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Comp</em>' reference.
	 * @see #setMainComp(Component)
	 * @see hu.modembed.model.application.ApplicationPackage#getApplication_MainComp()
	 * @model
	 * @generated
	 */
	Component getMainComp();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.Application#getMainComp <em>Main Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Comp</em>' reference.
	 * @see #getMainComp()
	 * @generated
	 */
	void setMainComp(Component value);

	/**
	 * Returns the value of the '<em><b>Main Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Port</em>' reference.
	 * @see #setMainPort(Port)
	 * @see hu.modembed.model.application.ApplicationPackage#getApplication_MainPort()
	 * @model
	 * @generated
	 */
	Port getMainPort();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.Application#getMainPort <em>Main Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Port</em>' reference.
	 * @see #getMainPort()
	 * @generated
	 */
	void setMainPort(Port value);

	/**
	 * Returns the value of the '<em><b>Main</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' reference.
	 * @see #setMain(Operation)
	 * @see hu.modembed.model.application.ApplicationPackage#getApplication_Main()
	 * @model
	 * @generated
	 */
	Operation getMain();

	/**
	 * Sets the value of the '{@link hu.modembed.model.application.Application#getMain <em>Main</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Operation value);

} // Application

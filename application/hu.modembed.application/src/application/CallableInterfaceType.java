/**
 */
package application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.CallableInterfaceType#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getCallableInterfaceType()
 * @model
 * @generated
 */
public interface CallableInterfaceType extends ApplicationInterfaceType {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link application.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see application.ApplicationPackage#getCallableInterfaceType_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // CallableInterfaceType

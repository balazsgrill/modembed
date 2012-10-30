/**
 */
package hu.modembed.model.emodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.FunctionDeclaration#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.EmodelPackage#getFunctionDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface FunctionDeclaration extends Variable {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.FunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.modembed.model.emodel.EmodelPackage#getFunctionDeclaration_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionParameter> getArguments();

} // FunctionDeclaration

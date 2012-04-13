/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.ChoiceAlternative#getStep <em>Step</em>}</li>
 *   <li>{@link hu.e.compiler.list.ChoiceAlternative#getConnected <em>Connected</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getChoiceAlternative()
 * @model
 * @generated
 */
public interface ChoiceAlternative extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(ProgramStep)
	 * @see hu.e.compiler.list.ListPackage#getChoiceAlternative_Step()
	 * @model containment="true"
	 * @generated
	 */
	ProgramStep getStep();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.ChoiceAlternative#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(ProgramStep value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' reference list.
	 * The list contents are of type {@link hu.e.compiler.list.ChoiceAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' reference list.
	 * @see hu.e.compiler.list.ListPackage#getChoiceAlternative_Connected()
	 * @model
	 * @generated
	 */
	EList<ChoiceAlternative> getConnected();

} // ChoiceAlternative

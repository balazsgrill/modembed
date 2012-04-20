/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.ProgramStep#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getProgramStep()
 * @model abstract="true"
 * @generated
 */
public interface ProgramStep extends EObject {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see hu.e.compiler.list.ListPackage#getProgramStep_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.ProgramStep#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);
} // ProgramStep

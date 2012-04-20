/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.ScriptStep#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getScriptStep()
 * @model
 * @generated
 */
public interface ScriptStep extends ProgramStep {
	/**
	 * Returns the value of the '<em><b>Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' attribute.
	 * @see #setExecute(String)
	 * @see hu.e.compiler.list.ListPackage#getScriptStep_Execute()
	 * @model
	 * @generated
	 */
	String getExecute();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.ScriptStep#getExecute <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' attribute.
	 * @see #getExecute()
	 * @generated
	 */
	void setExecute(String value);

} // ScriptStep

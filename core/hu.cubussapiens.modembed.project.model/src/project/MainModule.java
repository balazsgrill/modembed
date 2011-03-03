/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link project.MainModule#getOutput <em>Output</em>}</li>
 *   <li>{@link project.MainModule#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see project.ProjectPackage#getMainModule()
 * @model
 * @generated
 */
public interface MainModule extends Module {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Directory)
	 * @see project.ProjectPackage#getMainModule_Output()
	 * @model containment="true"
	 * @generated
	 */
	Directory getOutput();

	/**
	 * Sets the value of the '{@link project.MainModule#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Directory value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see project.ProjectPackage#getMainModule_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link project.MainModule#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // MainModule

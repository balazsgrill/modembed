/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link memory.ProgModel#getStartAddr <em>Start Addr</em>}</li>
 *   <li>{@link memory.ProgModel#getSize <em>Size</em>}</li>
 *   <li>{@link memory.ProgModel#getResetVector <em>Reset Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @see memory.MemoryPackage#getProgModel()
 * @model
 * @generated
 */
public interface ProgModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Addr</em>' attribute.
	 * @see #setStartAddr(long)
	 * @see memory.MemoryPackage#getProgModel_StartAddr()
	 * @model
	 * @generated
	 */
	long getStartAddr();

	/**
	 * Sets the value of the '{@link memory.ProgModel#getStartAddr <em>Start Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Addr</em>' attribute.
	 * @see #getStartAddr()
	 * @generated
	 */
	void setStartAddr(long value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see memory.MemoryPackage#getProgModel_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link memory.ProgModel#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Reset Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Vector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Vector</em>' attribute.
	 * @see #setResetVector(long)
	 * @see memory.MemoryPackage#getProgModel_ResetVector()
	 * @model
	 * @generated
	 */
	long getResetVector();

	/**
	 * Sets the value of the '{@link memory.ProgModel#getResetVector <em>Reset Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Vector</em>' attribute.
	 * @see #getResetVector()
	 * @generated
	 */
	void setResetVector(long value);

} // ProgModel

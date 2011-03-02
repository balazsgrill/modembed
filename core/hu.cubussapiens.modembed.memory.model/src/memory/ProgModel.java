/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link memory.ProgModel#getResetVector <em>Reset Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @see memory.MemoryPackage#getProgModel()
 * @model
 * @generated
 */
public interface ProgModel extends MemSegment {
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

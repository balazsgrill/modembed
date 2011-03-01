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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link memory.MemoryModel#getRam <em>Ram</em>}</li>
 *   <li>{@link memory.MemoryModel#getProg <em>Prog</em>}</li>
 * </ul>
 * </p>
 *
 * @see memory.MemoryPackage#getMemoryModel()
 * @model
 * @generated
 */
public interface MemoryModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Ram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ram</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ram</em>' containment reference.
	 * @see #setRam(RAMModel)
	 * @see memory.MemoryPackage#getMemoryModel_Ram()
	 * @model containment="true"
	 * @generated
	 */
	RAMModel getRam();

	/**
	 * Sets the value of the '{@link memory.MemoryModel#getRam <em>Ram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' containment reference.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(RAMModel value);

	/**
	 * Returns the value of the '<em><b>Prog</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prog</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prog</em>' reference.
	 * @see #setProg(ProgModel)
	 * @see memory.MemoryPackage#getMemoryModel_Prog()
	 * @model
	 * @generated
	 */
	ProgModel getProg();

	/**
	 * Sets the value of the '{@link memory.MemoryModel#getProg <em>Prog</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prog</em>' reference.
	 * @see #getProg()
	 * @generated
	 */
	void setProg(ProgModel value);

} // MemoryModel

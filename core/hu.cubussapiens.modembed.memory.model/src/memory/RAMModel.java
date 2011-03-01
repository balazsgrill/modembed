/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package memory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link memory.RAMModel#getSegments <em>Segments</em>}</li>
 * </ul>
 * </p>
 *
 * @see memory.MemoryPackage#getRAMModel()
 * @model
 * @generated
 */
public interface RAMModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link memory.GenericRAMSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see memory.MemoryPackage#getRAMModel_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericRAMSegment> getSegments();

} // RAMModel

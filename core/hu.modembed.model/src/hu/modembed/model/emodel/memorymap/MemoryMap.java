/**
 */
package hu.modembed.model.emodel.memorymap;

import hu.modembed.model.core.RootElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.memorymap.MemoryMap#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getMemoryMap()
 * @model
 * @generated
 */
public interface MemoryMap extends RootElement {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(HeapLevel)
	 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getMemoryMap_Root()
	 * @model containment="true"
	 * @generated
	 */
	HeapLevel getRoot();

	/**
	 * Sets the value of the '{@link hu.modembed.model.emodel.memorymap.MemoryMap#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(HeapLevel value);

} // MemoryMap

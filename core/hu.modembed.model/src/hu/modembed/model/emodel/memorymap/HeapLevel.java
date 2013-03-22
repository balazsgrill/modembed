/**
 */
package hu.modembed.model.emodel.memorymap;

import hu.modembed.model.core.MODembedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heap Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.memorymap.HeapLevel#getMappings <em>Mappings</em>}</li>
 *   <li>{@link hu.modembed.model.emodel.memorymap.HeapLevel#getSubLevels <em>Sub Levels</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getHeapLevel()
 * @model
 * @generated
 */
public interface HeapLevel extends MODembedElement {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.memorymap.HeapVariableMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getHeapLevel_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeapVariableMapping> getMappings();

	/**
	 * Returns the value of the '<em><b>Sub Levels</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.memorymap.HeapLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Levels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Levels</em>' containment reference list.
	 * @see hu.modembed.model.emodel.memorymap.MemorymapPackage#getHeapLevel_SubLevels()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeapLevel> getSubLevels();

} // HeapLevel

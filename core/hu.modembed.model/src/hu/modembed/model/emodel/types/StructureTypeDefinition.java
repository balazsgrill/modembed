/**
 */
package hu.modembed.model.emodel.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.emodel.types.StructureTypeDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.emodel.types.TypesPackage#getStructureTypeDefinition()
 * @model
 * @generated
 */
public interface StructureTypeDefinition extends CompositeTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.emodel.types.StructureTypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see hu.modembed.model.emodel.types.TypesPackage#getStructureTypeDefinition_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureTypeElement> getElements();

} // StructureTypeDefinition

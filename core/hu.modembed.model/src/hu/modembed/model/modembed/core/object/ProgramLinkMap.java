/**
 */
package hu.modembed.model.modembed.core.object;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Link Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.core.object.ProgramLinkMap#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getProgramLinkMap()
 * @model
 * @generated
 */
public interface ProgramLinkMap extends RootElement {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.modembed.core.object.LinkMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference list.
	 * @see hu.modembed.model.modembed.core.object.ObjectPackage#getProgramLinkMap_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkMapping> getMapping();

} // ProgramLinkMap

/**
 */
package hu.modembed.model.platform;

import hu.modembed.model.core.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.platform.PlatformDefinition#getRefine <em>Refine</em>}</li>
 *   <li>{@link hu.modembed.model.platform.PlatformDefinition#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.platform.PlatformPackage#getPlatformDefinition()
 * @model
 * @generated
 */
public interface PlatformDefinition extends RootElement {
	/**
	 * Returns the value of the '<em><b>Refine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refine</em>' reference.
	 * @see #setRefine(PlatformDefinition)
	 * @see hu.modembed.model.platform.PlatformPackage#getPlatformDefinition_Refine()
	 * @model
	 * @generated
	 */
	PlatformDefinition getRefine();

	/**
	 * Sets the value of the '{@link hu.modembed.model.platform.PlatformDefinition#getRefine <em>Refine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refine</em>' reference.
	 * @see #getRefine()
	 * @generated
	 */
	void setRefine(PlatformDefinition value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.platform.OperationDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see hu.modembed.model.platform.PlatformPackage#getPlatformDefinition_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinition> getOperations();

} // PlatformDefinition

/**
 */
package hu.modembed.model.abstraction.behavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.abstraction.behavior.BehaviorCall#getArgumentMappings <em>Argument Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getBehaviorCall()
 * @model
 * @generated
 */
public interface BehaviorCall extends SequentialAction {
	/**
	 * Returns the value of the '<em><b>Argument Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.model.abstraction.behavior.SymbolMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Mappings</em>' containment reference list.
	 * @see hu.modembed.model.abstraction.behavior.BehaviorPackage#getBehaviorCall_ArgumentMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SymbolMapping> getArgumentMappings();

} // BehaviorCall

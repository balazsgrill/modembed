/**
 */
package application;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Module Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.CompositeModuleImplementation#getSubModules <em>Sub Modules</em>}</li>
 *   <li>{@link application.CompositeModuleImplementation#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getCompositeModuleImplementation()
 * @model
 * @generated
 */
public interface CompositeModuleImplementation extends ApplicationModuleImplementation {
	/**
	 * Returns the value of the '<em><b>Sub Modules</b></em>' containment reference list.
	 * The list contents are of type {@link application.ApplicationModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Modules</em>' containment reference list.
	 * @see application.ApplicationPackage#getCompositeModuleImplementation_SubModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationModule> getSubModules();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link application.InterfaceImplementationMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see application.ApplicationPackage#getCompositeModuleImplementation_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceImplementationMapping> getMappings();

} // CompositeModuleImplementation

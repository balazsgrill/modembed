/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modembedconfig.ParameterSet#getName <em>Name</em>}</li>
 *   <li>{@link modembedconfig.ParameterSet#getParameters <em>Parameters</em>}</li>
 *   <li>{@link modembedconfig.ParameterSet#getSubsets <em>Subsets</em>}</li>
 * </ul>
 * </p>
 *
 * @see modembedconfig.ModembedconfigPackage#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modembedconfig.ModembedconfigPackage#getParameterSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modembedconfig.ParameterSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link modembedconfig.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see modembedconfig.ModembedconfigPackage#getParameterSet_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Subsets</b></em>' containment reference list.
	 * The list contents are of type {@link modembedconfig.ParameterSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsets</em>' containment reference list.
	 * @see modembedconfig.ModembedconfigPackage#getParameterSet_Subsets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterSet> getSubsets();

} // ParameterSet

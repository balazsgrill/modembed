/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modembedconfig.EnumParam#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see modembedconfig.ModembedconfigPackage#getEnumParam()
 * @model
 * @generated
 */
public interface EnumParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link modembedconfig.EnumParamLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see modembedconfig.ModembedconfigPackage#getEnumParam_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumParamLiteral> getLiterals();

} // EnumParam

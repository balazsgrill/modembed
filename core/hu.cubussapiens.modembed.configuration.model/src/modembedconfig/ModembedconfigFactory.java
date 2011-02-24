/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modembedconfig.ModembedconfigPackage
 * @generated
 */
public interface ModembedconfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModembedconfigFactory eINSTANCE = modembedconfig.impl.ModembedconfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheme</em>'.
	 * @generated
	 */
	Scheme createScheme();

	/**
	 * Returns a new object of class '<em>Enum Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Param</em>'.
	 * @generated
	 */
	EnumParam createEnumParam();

	/**
	 * Returns a new object of class '<em>Enum Param Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Param Literal</em>'.
	 * @generated
	 */
	EnumParamLiteral createEnumParamLiteral();

	/**
	 * Returns a new object of class '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set</em>'.
	 * @generated
	 */
	ParameterSet createParameterSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModembedconfigPackage getModembedconfigPackage();

} //ModembedconfigFactory

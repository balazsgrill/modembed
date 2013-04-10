/**
 */
package hu.modembed.model.modembed.abstraction.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.modembed.model.modembed.abstraction.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = hu.modembed.model.modembed.abstraction.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unsigned Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unsigned Type Definition</em>'.
	 * @generated
	 */
	UnsignedTypeDefinition createUnsignedTypeDefinition();

	/**
	 * Returns a new object of class '<em>Reference Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Type Definition</em>'.
	 * @generated
	 */
	ReferenceTypeDefinition createReferenceTypeDefinition();

	/**
	 * Returns a new object of class '<em>Pointer Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointer Type Definition</em>'.
	 * @generated
	 */
	PointerTypeDefinition createPointerTypeDefinition();

	/**
	 * Returns a new object of class '<em>Array Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Definition</em>'.
	 * @generated
	 */
	ArrayDefinition createArrayDefinition();

	/**
	 * Returns a new object of class '<em>Structure Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Type Definition</em>'.
	 * @generated
	 */
	StructureTypeDefinition createStructureTypeDefinition();

	/**
	 * Returns a new object of class '<em>Structure Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure Type Element</em>'.
	 * @generated
	 */
	StructureTypeElement createStructureTypeElement();

	/**
	 * Returns a new object of class '<em>Code Label Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Label Type Definition</em>'.
	 * @generated
	 */
	CodeLabelTypeDefinition createCodeLabelTypeDefinition();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory

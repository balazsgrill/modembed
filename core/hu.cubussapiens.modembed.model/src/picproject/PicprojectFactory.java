/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package picproject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see picproject.PicprojectPackage
 * @generated
 */
public interface PicprojectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicprojectFactory eINSTANCE = picproject.impl.PicprojectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PIC Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PIC Settings</em>'.
	 * @generated
	 */
	PICSettings createPICSettings();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PicprojectPackage getPicprojectPackage();

} //PicprojectFactory

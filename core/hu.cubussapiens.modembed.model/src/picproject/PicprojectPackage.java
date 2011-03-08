/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package picproject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import project.ProjectPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see picproject.PicprojectFactory
 * @model kind="package"
 * @generated
 */
public interface PicprojectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "picproject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cubussapiens.hu/modembed/pic/project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "picproject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PicprojectPackage eINSTANCE = picproject.impl.PicprojectPackageImpl.init();

	/**
	 * The meta object id for the '{@link picproject.impl.PICSettingsImpl <em>PIC Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see picproject.impl.PICSettingsImpl
	 * @see picproject.impl.PicprojectPackageImpl#getPICSettings()
	 * @generated
	 */
	int PIC_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_SETTINGS__CPU = ProjectPackage.SETTINGS_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PIC Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_SETTINGS_FEATURE_COUNT = ProjectPackage.SETTINGS_EXTENSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link picproject.PICSettings <em>PIC Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIC Settings</em>'.
	 * @see picproject.PICSettings
	 * @generated
	 */
	EClass getPICSettings();

	/**
	 * Returns the meta object for the reference '{@link picproject.PICSettings#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cpu</em>'.
	 * @see picproject.PICSettings#getCpu()
	 * @see #getPICSettings()
	 * @generated
	 */
	EReference getPICSettings_Cpu();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PicprojectFactory getPicprojectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link picproject.impl.PICSettingsImpl <em>PIC Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see picproject.impl.PICSettingsImpl
		 * @see picproject.impl.PicprojectPackageImpl#getPICSettings()
		 * @generated
		 */
		EClass PIC_SETTINGS = eINSTANCE.getPICSettings();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIC_SETTINGS__CPU = eINSTANCE.getPICSettings_Cpu();

	}

} //PicprojectPackage

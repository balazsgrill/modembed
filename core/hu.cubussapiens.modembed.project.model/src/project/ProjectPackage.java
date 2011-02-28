/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package project;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see project.ProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "project";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cubusspiens.hu/modembed/project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectPackage eINSTANCE = project.impl.ProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link project.impl.ProjectConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.ProjectConfigImpl
	 * @see project.impl.ProjectPackageImpl#getProjectConfig()
	 * @generated
	 */
	int PROJECT_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Sourcedirs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG__SOURCEDIRS = 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link project.impl.SourceDirImpl <em>Source Dir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.SourceDirImpl
	 * @see project.impl.ProjectPackageImpl#getSourceDir()
	 * @generated
	 */
	int SOURCE_DIR = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DIR__PATH = 0;

	/**
	 * The number of structural features of the '<em>Source Dir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_DIR_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link project.ProjectConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see project.ProjectConfig
	 * @generated
	 */
	EClass getProjectConfig();

	/**
	 * Returns the meta object for the reference list '{@link project.ProjectConfig#getSourcedirs <em>Sourcedirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sourcedirs</em>'.
	 * @see project.ProjectConfig#getSourcedirs()
	 * @see #getProjectConfig()
	 * @generated
	 */
	EReference getProjectConfig_Sourcedirs();

	/**
	 * Returns the meta object for class '{@link project.SourceDir <em>Source Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Dir</em>'.
	 * @see project.SourceDir
	 * @generated
	 */
	EClass getSourceDir();

	/**
	 * Returns the meta object for the attribute '{@link project.SourceDir#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see project.SourceDir#getPath()
	 * @see #getSourceDir()
	 * @generated
	 */
	EAttribute getSourceDir_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectFactory getProjectFactory();

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
		 * The meta object literal for the '{@link project.impl.ProjectConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.ProjectConfigImpl
		 * @see project.impl.ProjectPackageImpl#getProjectConfig()
		 * @generated
		 */
		EClass PROJECT_CONFIG = eINSTANCE.getProjectConfig();

		/**
		 * The meta object literal for the '<em><b>Sourcedirs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_CONFIG__SOURCEDIRS = eINSTANCE.getProjectConfig_Sourcedirs();

		/**
		 * The meta object literal for the '{@link project.impl.SourceDirImpl <em>Source Dir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.SourceDirImpl
		 * @see project.impl.ProjectPackageImpl#getSourceDir()
		 * @generated
		 */
		EClass SOURCE_DIR = eINSTANCE.getSourceDir();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_DIR__PATH = eINSTANCE.getSourceDir_Path();

	}

} //ProjectPackage

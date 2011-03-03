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
	 * The feature id for the '<em><b>Sourcedirs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG__SOURCEDIRS = 0;

	/**
	 * The feature id for the '<em><b>Builds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG__BUILDS = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG__EXTENSIONS = 2;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link project.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.DirectoryImpl
	 * @see project.impl.ProjectPackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link project.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.ModuleImpl
	 * @see project.impl.ProjectPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 3;

	/**
	 * The feature id for the '<em><b>Qualified ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__QUALIFIED_ID = 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link project.impl.MainModuleImpl <em>Main Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.MainModuleImpl
	 * @see project.impl.ProjectPackageImpl#getMainModule()
	 * @generated
	 */
	int MAIN_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Qualified ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MODULE__QUALIFIED_ID = MODULE__QUALIFIED_ID;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MODULE__OUTPUT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MODULE__TARGET = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Main Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link project.impl.SettingsExtensionImpl <em>Settings Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see project.impl.SettingsExtensionImpl
	 * @see project.impl.ProjectPackageImpl#getSettingsExtension()
	 * @generated
	 */
	int SETTINGS_EXTENSION = 4;

	/**
	 * The number of structural features of the '<em>Settings Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_EXTENSION_FEATURE_COUNT = 0;


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
	 * Returns the meta object for the containment reference list '{@link project.ProjectConfig#getSourcedirs <em>Sourcedirs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sourcedirs</em>'.
	 * @see project.ProjectConfig#getSourcedirs()
	 * @see #getProjectConfig()
	 * @generated
	 */
	EReference getProjectConfig_Sourcedirs();

	/**
	 * Returns the meta object for the containment reference list '{@link project.ProjectConfig#getBuilds <em>Builds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Builds</em>'.
	 * @see project.ProjectConfig#getBuilds()
	 * @see #getProjectConfig()
	 * @generated
	 */
	EReference getProjectConfig_Builds();

	/**
	 * Returns the meta object for the containment reference list '{@link project.ProjectConfig#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see project.ProjectConfig#getExtensions()
	 * @see #getProjectConfig()
	 * @generated
	 */
	EReference getProjectConfig_Extensions();

	/**
	 * Returns the meta object for class '{@link project.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see project.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the attribute '{@link project.Directory#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see project.Directory#getPath()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Path();

	/**
	 * Returns the meta object for class '{@link project.MainModule <em>Main Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Module</em>'.
	 * @see project.MainModule
	 * @generated
	 */
	EClass getMainModule();

	/**
	 * Returns the meta object for the containment reference '{@link project.MainModule#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see project.MainModule#getOutput()
	 * @see #getMainModule()
	 * @generated
	 */
	EReference getMainModule_Output();

	/**
	 * Returns the meta object for the attribute '{@link project.MainModule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see project.MainModule#getTarget()
	 * @see #getMainModule()
	 * @generated
	 */
	EAttribute getMainModule_Target();

	/**
	 * Returns the meta object for class '{@link project.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see project.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link project.Module#getQualifiedID <em>Qualified ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified ID</em>'.
	 * @see project.Module#getQualifiedID()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_QualifiedID();

	/**
	 * Returns the meta object for class '{@link project.SettingsExtension <em>Settings Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Extension</em>'.
	 * @see project.SettingsExtension
	 * @generated
	 */
	EClass getSettingsExtension();

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
		 * The meta object literal for the '<em><b>Sourcedirs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_CONFIG__SOURCEDIRS = eINSTANCE.getProjectConfig_Sourcedirs();

		/**
		 * The meta object literal for the '<em><b>Builds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_CONFIG__BUILDS = eINSTANCE.getProjectConfig_Builds();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_CONFIG__EXTENSIONS = eINSTANCE.getProjectConfig_Extensions();

		/**
		 * The meta object literal for the '{@link project.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.DirectoryImpl
		 * @see project.impl.ProjectPackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTORY__PATH = eINSTANCE.getDirectory_Path();

		/**
		 * The meta object literal for the '{@link project.impl.MainModuleImpl <em>Main Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.MainModuleImpl
		 * @see project.impl.ProjectPackageImpl#getMainModule()
		 * @generated
		 */
		EClass MAIN_MODULE = eINSTANCE.getMainModule();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_MODULE__OUTPUT = eINSTANCE.getMainModule_Output();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_MODULE__TARGET = eINSTANCE.getMainModule_Target();

		/**
		 * The meta object literal for the '{@link project.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.ModuleImpl
		 * @see project.impl.ProjectPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Qualified ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__QUALIFIED_ID = eINSTANCE.getModule_QualifiedID();

		/**
		 * The meta object literal for the '{@link project.impl.SettingsExtensionImpl <em>Settings Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see project.impl.SettingsExtensionImpl
		 * @see project.impl.ProjectPackageImpl#getSettingsExtension()
		 * @generated
		 */
		EClass SETTINGS_EXTENSION = eINSTANCE.getSettingsExtension();

	}

} //ProjectPackage

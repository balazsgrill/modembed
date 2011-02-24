/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package modembedconfig;

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
 * @see modembedconfig.ModembedconfigFactory
 * @model kind="package"
 * @generated
 */
public interface ModembedconfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modembedconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cubussapiens.hu/modembed/config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mbconf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModembedconfigPackage eINSTANCE = modembedconfig.impl.ModembedconfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link modembedconfig.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modembedconfig.impl.ParameterSetImpl
	 * @see modembedconfig.impl.ModembedconfigPackageImpl#getParameterSet()
	 * @generated
	 */
	int PARAMETER_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Subsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__SUBSETS = 2;

	/**
	 * The number of structural features of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link modembedconfig.impl.SchemeImpl <em>Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modembedconfig.impl.SchemeImpl
	 * @see modembedconfig.impl.ModembedconfigPackageImpl#getScheme()
	 * @generated
	 */
	int SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__NAME = PARAMETER_SET__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__PARAMETERS = PARAMETER_SET__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Subsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME__SUBSETS = PARAMETER_SET__SUBSETS;

	/**
	 * The number of structural features of the '<em>Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEME_FEATURE_COUNT = PARAMETER_SET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modembedconfig.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modembedconfig.impl.ParameterImpl
	 * @see modembedconfig.impl.ModembedconfigPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link modembedconfig.impl.EnumParamImpl <em>Enum Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modembedconfig.impl.EnumParamImpl
	 * @see modembedconfig.impl.ModembedconfigPackageImpl#getEnumParam()
	 * @generated
	 */
	int ENUM_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM__DEFAULT = PARAMETER__DEFAULT;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM__LITERALS = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link modembedconfig.impl.EnumParamLiteralImpl <em>Enum Param Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modembedconfig.impl.EnumParamLiteralImpl
	 * @see modembedconfig.impl.ModembedconfigPackageImpl#getEnumParamLiteral()
	 * @generated
	 */
	int ENUM_PARAM_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM_LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM_LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Enum Param Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_PARAM_LITERAL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link modembedconfig.Scheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheme</em>'.
	 * @see modembedconfig.Scheme
	 * @generated
	 */
	EClass getScheme();

	/**
	 * Returns the meta object for class '{@link modembedconfig.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see modembedconfig.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link modembedconfig.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modembedconfig.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link modembedconfig.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see modembedconfig.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Default();

	/**
	 * Returns the meta object for class '{@link modembedconfig.EnumParam <em>Enum Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Param</em>'.
	 * @see modembedconfig.EnumParam
	 * @generated
	 */
	EClass getEnumParam();

	/**
	 * Returns the meta object for the containment reference list '{@link modembedconfig.EnumParam#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see modembedconfig.EnumParam#getLiterals()
	 * @see #getEnumParam()
	 * @generated
	 */
	EReference getEnumParam_Literals();

	/**
	 * Returns the meta object for class '{@link modembedconfig.EnumParamLiteral <em>Enum Param Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Param Literal</em>'.
	 * @see modembedconfig.EnumParamLiteral
	 * @generated
	 */
	EClass getEnumParamLiteral();

	/**
	 * Returns the meta object for the attribute '{@link modembedconfig.EnumParamLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modembedconfig.EnumParamLiteral#getName()
	 * @see #getEnumParamLiteral()
	 * @generated
	 */
	EAttribute getEnumParamLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link modembedconfig.EnumParamLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see modembedconfig.EnumParamLiteral#getValue()
	 * @see #getEnumParamLiteral()
	 * @generated
	 */
	EAttribute getEnumParamLiteral_Value();

	/**
	 * Returns the meta object for class '{@link modembedconfig.ParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set</em>'.
	 * @see modembedconfig.ParameterSet
	 * @generated
	 */
	EClass getParameterSet();

	/**
	 * Returns the meta object for the attribute '{@link modembedconfig.ParameterSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modembedconfig.ParameterSet#getName()
	 * @see #getParameterSet()
	 * @generated
	 */
	EAttribute getParameterSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link modembedconfig.ParameterSet#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see modembedconfig.ParameterSet#getParameters()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link modembedconfig.ParameterSet#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsets</em>'.
	 * @see modembedconfig.ParameterSet#getSubsets()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Subsets();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModembedconfigFactory getModembedconfigFactory();

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
		 * The meta object literal for the '{@link modembedconfig.impl.SchemeImpl <em>Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modembedconfig.impl.SchemeImpl
		 * @see modembedconfig.impl.ModembedconfigPackageImpl#getScheme()
		 * @generated
		 */
		EClass SCHEME = eINSTANCE.getScheme();

		/**
		 * The meta object literal for the '{@link modembedconfig.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modembedconfig.impl.ParameterImpl
		 * @see modembedconfig.impl.ModembedconfigPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '{@link modembedconfig.impl.EnumParamImpl <em>Enum Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modembedconfig.impl.EnumParamImpl
		 * @see modembedconfig.impl.ModembedconfigPackageImpl#getEnumParam()
		 * @generated
		 */
		EClass ENUM_PARAM = eINSTANCE.getEnumParam();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_PARAM__LITERALS = eINSTANCE.getEnumParam_Literals();

		/**
		 * The meta object literal for the '{@link modembedconfig.impl.EnumParamLiteralImpl <em>Enum Param Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modembedconfig.impl.EnumParamLiteralImpl
		 * @see modembedconfig.impl.ModembedconfigPackageImpl#getEnumParamLiteral()
		 * @generated
		 */
		EClass ENUM_PARAM_LITERAL = eINSTANCE.getEnumParamLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_PARAM_LITERAL__NAME = eINSTANCE.getEnumParamLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_PARAM_LITERAL__VALUE = eINSTANCE.getEnumParamLiteral_Value();

		/**
		 * The meta object literal for the '{@link modembedconfig.impl.ParameterSetImpl <em>Parameter Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modembedconfig.impl.ParameterSetImpl
		 * @see modembedconfig.impl.ModembedconfigPackageImpl#getParameterSet()
		 * @generated
		 */
		EClass PARAMETER_SET = eINSTANCE.getParameterSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SET__NAME = eINSTANCE.getParameterSet_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET__PARAMETERS = eINSTANCE.getParameterSet_Parameters();

		/**
		 * The meta object literal for the '<em><b>Subsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET__SUBSETS = eINSTANCE.getParameterSet_Subsets();

	}

} //ModembedconfigPackage

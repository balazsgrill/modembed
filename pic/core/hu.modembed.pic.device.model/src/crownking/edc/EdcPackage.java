/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

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
 * @see crownking.edc.EdcFactory
 * @model kind="package"
 * @generated
 */
public interface EdcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://crownking/edc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdcPackage eINSTANCE = crownking.edc.impl.EdcPackageImpl.init();

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AdjustPointTypeImpl <em>Adjust Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AdjustPointTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getAdjustPointType()
	 * @generated
	 */
	int ADJUST_POINT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__DCR_FIELD_SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ALIAS_LIST = 3;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__SFR_MODE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__STIM_INFO = 5;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__MODULE_MACRO = 6;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__MODULE_EXCLUDE = 7;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__SFR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>Adjust Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJUST_POINT_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListTypeImpl <em>Alias List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType()
	 * @generated
	 */
	int ALIAS_LIST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType1Impl <em>Alias List Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType1Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType1()
	 * @generated
	 */
	int ALIAS_LIST_TYPE1 = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE1_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType2Impl <em>Alias List Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType2Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType2()
	 * @generated
	 */
	int ALIAS_LIST_TYPE2 = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE2_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType3Impl <em>Alias List Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType3Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType3()
	 * @generated
	 */
	int ALIAS_LIST_TYPE3 = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE3_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType4Impl <em>Alias List Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType4Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType4()
	 * @generated
	 */
	int ALIAS_LIST_TYPE4 = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE4_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType5Impl <em>Alias List Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType5Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType5()
	 * @generated
	 */
	int ALIAS_LIST_TYPE5 = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE5_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType6Impl <em>Alias List Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType6Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType6()
	 * @generated
	 */
	int ALIAS_LIST_TYPE6 = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE6_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType7Impl <em>Alias List Type7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType7Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType7()
	 * @generated
	 */
	int ALIAS_LIST_TYPE7 = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__LEGACY_ALIAS = 2;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__MIGRATION_ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__CHECKSUM = 5;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__BEGINADDR = 6;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__CHECKSUMALGO = 7;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__CNAME = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__DESC = 9;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__ENDADDR = 10;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__ISHIDDEN = 11;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__ISLANGHIDDEN = 12;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__OSCMODEIDREF = 13;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7__WHEN = 14;

	/**
	 * The number of structural features of the '<em>Alias List Type7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE7_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.AliasListType8Impl <em>Alias List Type8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.AliasListType8Impl
	 * @see crownking.edc.impl.EdcPackageImpl#getAliasListType8()
	 * @generated
	 */
	int ALIAS_LIST_TYPE8 = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE8__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE8__LEGACY_ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Migration Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE8__MIGRATION_ALIAS = 2;

	/**
	 * The number of structural features of the '<em>Alias List Type8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_LIST_TYPE8_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ArchDefTypeImpl <em>Arch Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ArchDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getArchDefType()
	 * @generated
	 */
	int ARCH_DEF_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_DEF_TYPE__MEM_TRAITS = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_DEF_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_DEF_TYPE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Arch Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCH_DEF_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.BACKBUGVectorSectorTypeImpl <em>BACKBUG Vector Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.BACKBUGVectorSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getBACKBUGVectorSectorType()
	 * @generated
	 */
	int BACKBUG_VECTOR_SECTOR_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBUG_VECTOR_SECTOR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBUG_VECTOR_SECTOR_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBUG_VECTOR_SECTOR_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBUG_VECTOR_SECTOR_TYPE__REGIONID = 3;

	/**
	 * The number of structural features of the '<em>BACKBUG Vector Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKBUG_VECTOR_SECTOR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.BackgroundDebugMemTraitsTypeImpl <em>Background Debug Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.BackgroundDebugMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>Background Debug Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_DEBUG_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.BreakpointsTypeImpl <em>Breakpoints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.BreakpointsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getBreakpointsType()
	 * @generated
	 */
	int BREAKPOINTS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Hasdatacapture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS_TYPE__HASDATACAPTURE = 1;

	/**
	 * The feature id for the '<em><b>Hwbpcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS_TYPE__HWBPCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Idbyte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS_TYPE__IDBYTE = 3;

	/**
	 * The number of structural features of the '<em>Breakpoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAKPOINTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.CalDataMemTraitsTypeImpl <em>Cal Data Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.CalDataMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getCalDataMemTraitsType()
	 * @generated
	 */
	int CAL_DATA_MEM_TRAITS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>Cal Data Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.CalDataZoneTypeImpl <em>Cal Data Zone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.CalDataZoneTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getCalDataZoneType()
	 * @generated
	 */
	int CAL_DATA_ZONE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__ISSECTION = 3;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__REGIONID = 4;

	/**
	 * The feature id for the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__SECTIONDESC = 5;

	/**
	 * The feature id for the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE__SECTIONNAME = 6;

	/**
	 * The number of structural features of the '<em>Cal Data Zone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAL_DATA_ZONE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ChecksumTypeImpl <em>Checksum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ChecksumTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getChecksumType()
	 * @generated
	 */
	int CHECKSUM_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__ALIAS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__CHECKSUM = 2;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__BEGINADDR = 3;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__CHECKSUMALGO = 4;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__CNAME = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__DESC = 6;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__ENDADDR = 7;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__ISLANGHIDDEN = 8;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE__WHEN = 9;

	/**
	 * The number of structural features of the '<em>Checksum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.CodeMemTraitsTypeImpl <em>Code Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.CodeMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getCodeMemTraitsType()
	 * @generated
	 */
	int CODE_MEM_TRAITS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>Code Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.CodeSectorTypeImpl <em>Code Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.CodeSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getCodeSectorType()
	 * @generated
	 */
	int CODE_SECTOR_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__ISSECTION = 3;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__REGIONID = 4;

	/**
	 * The feature id for the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__SECTIONDESC = 5;

	/**
	 * The feature id for the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE__SECTIONNAME = 6;

	/**
	 * The number of structural features of the '<em>Code Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SECTOR_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ConfigFuseMemTraitsTypeImpl <em>Config Fuse Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ConfigFuseMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getConfigFuseMemTraitsType()
	 * @generated
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Unimplval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__UNIMPLVAL = 2;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__WORDIMPL = 3;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__WORDINIT = 4;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__WORDSAFE = 5;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE__WORDSIZE = 6;

	/**
	 * The number of structural features of the '<em>Config Fuse Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_MEM_TRAITS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ConfigFuseSectorTypeImpl <em>Config Fuse Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ConfigFuseSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getConfigFuseSectorType()
	 * @generated
	 */
	int CONFIG_FUSE_SECTOR_TYPE = 20;

	/**
	 * The feature id for the '<em><b>DCR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_SECTOR_TYPE__DCR_DEF = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_SECTOR_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_SECTOR_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_SECTOR_TYPE__REGIONID = 3;

	/**
	 * The number of structural features of the '<em>Config Fuse Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FUSE_SECTOR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DataMemTraitsTypeImpl <em>Data Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DataMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDataMemTraitsType()
	 * @generated
	 */
	int DATA_MEM_TRAITS_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>Data Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DataSpaceTypeImpl <em>Data Space Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DataSpaceTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDataSpaceType()
	 * @generated
	 */
	int DATA_SPACE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Regardless Of Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_TYPE__REGARDLESS_OF_MODE = 0;

	/**
	 * The feature id for the '<em><b>Traditional Mode Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_TYPE__TRADITIONAL_MODE_ONLY = 1;

	/**
	 * The feature id for the '<em><b>Extended Mode Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_TYPE__EXTENDED_MODE_ONLY = 2;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_TYPE__ENDADDR = 3;

	/**
	 * The number of structural features of the '<em>Data Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SPACE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DCRDefTypeImpl <em>DCR Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DCRDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDCRDefType()
	 * @generated
	 */
	int DCR_DEF_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__ALIAS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Illegal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__ILLEGAL = 1;

	/**
	 * The feature id for the '<em><b>DCR Mode List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__DCR_MODE_LIST = 2;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__ACCESS = 3;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__CNAME = 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__DEFAULT = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__DESC = 6;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__IMPL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__NZWIDTH = 9;

	/**
	 * The feature id for the '<em><b>Unimplval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__UNIMPLVAL = 10;

	/**
	 * The feature id for the '<em><b>Unused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__UNUSED = 11;

	/**
	 * The feature id for the '<em><b>Useinchecksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE__USEINCHECKSUM = 12;

	/**
	 * The number of structural features of the '<em>DCR Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_DEF_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DCRFieldDefTypeImpl <em>DCR Field Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DCRFieldDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDCRFieldDefType()
	 * @generated
	 */
	int DCR_FIELD_DEF_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ALIAS_LIST = 3;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__SFR_MODE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__STIM_INFO = 5;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__MODULE_MACRO = 6;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__MODULE_EXCLUDE = 7;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__SFR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>DCR Field Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_DEF_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DCRFieldSemanticTypeImpl <em>DCR Field Semantic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DCRFieldSemanticTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDCRFieldSemanticType()
	 * @generated
	 */
	int DCR_FIELD_SEMANTIC_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__ALIAS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__CHECKSUM = 2;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__BEGINADDR = 3;

	/**
	 * The feature id for the '<em><b>Checksumalgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__CHECKSUMALGO = 4;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__CNAME = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__DESC = 6;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__ENDADDR = 7;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__ISHIDDEN = 8;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__ISLANGHIDDEN = 9;

	/**
	 * The feature id for the '<em><b>Oscmodeidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__OSCMODEIDREF = 10;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE__WHEN = 11;

	/**
	 * The number of structural features of the '<em>DCR Field Semantic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_FIELD_SEMANTIC_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DCRModeListTypeImpl <em>DCR Mode List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DCRModeListTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDCRModeListType()
	 * @generated
	 */
	int DCR_MODE_LIST_TYPE = 26;

	/**
	 * The feature id for the '<em><b>DCR Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_LIST_TYPE__DCR_MODE = 0;

	/**
	 * The number of structural features of the '<em>DCR Mode List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DCRModeTypeImpl <em>DCR Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DCRModeTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDCRModeType()
	 * @generated
	 */
	int DCR_MODE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Adjust Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_TYPE__ADJUST_POINT = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_TYPE__DCR_FIELD_DEF = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>DCR Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DCR_MODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DeviceIDMemTraitsTypeImpl <em>Device ID Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DeviceIDMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDeviceIDMemTraitsType()
	 * @generated
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>Device ID Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DeviceIDSectorTypeImpl <em>Device ID Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DeviceIDSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDeviceIDSectorType()
	 * @generated
	 */
	int DEVICE_ID_SECTOR_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>DEVID To Rev</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__DEVID_TO_REV = 1;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__BEGINADDR = 2;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__ENDADDR = 3;

	/**
	 * The feature id for the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__ISSECTION = 4;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__MASK = 5;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__REGIONID = 6;

	/**
	 * The feature id for the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__SECTIONDESC = 7;

	/**
	 * The feature id for the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__SECTIONNAME = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE__VALUE = 9;

	/**
	 * The number of structural features of the '<em>Device ID Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_ID_SECTOR_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DEVIDToRevTypeImpl <em>DEVID To Rev Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DEVIDToRevTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDEVIDToRevType()
	 * @generated
	 */
	int DEVID_TO_REV_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVID_TO_REV_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Revlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVID_TO_REV_TYPE__REVLIST = 1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVID_TO_REV_TYPE__VALUE1 = 2;

	/**
	 * The number of structural features of the '<em>DEVID To Rev Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVID_TO_REV_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DocumentRootImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>PIC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PIC = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.DPRDataSectorTypeImpl <em>DPR Data Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.DPRDataSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getDPRDataSectorType()
	 * @generated
	 */
	int DPR_DATA_SECTOR_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__SFR_DEF = 2;

	/**
	 * The feature id for the '<em><b>Adjust Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__ADJUST_POINT = 3;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__BANK = 4;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__BEGINADDR = 5;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__ENDADDR = 6;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__REGIONID = 7;

	/**
	 * The feature id for the '<em><b>Shadowidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__SHADOWIDREF = 8;

	/**
	 * The feature id for the '<em><b>Shadowoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__SHADOWOFFSET = 9;

	/**
	 * The feature id for the '<em><b>Shadowoffset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE__SHADOWOFFSET1 = 10;

	/**
	 * The number of structural features of the '<em>DPR Data Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPR_DATA_SECTOR_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.EEDataMemTraitsTypeImpl <em>EE Data Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.EEDataMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getEEDataMemTraitsType()
	 * @generated
	 */
	int EE_DATA_MEM_TRAITS_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Magicoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_MEM_TRAITS_TYPE__MAGICOFFSET = 1;

	/**
	 * The number of structural features of the '<em>EE Data Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_MEM_TRAITS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.EEDataSectorTypeImpl <em>EE Data Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.EEDataSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getEEDataSectorType()
	 * @generated
	 */
	int EE_DATA_SECTOR_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__ISSECTION = 3;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__REGIONID = 4;

	/**
	 * The feature id for the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__SECTIONDESC = 5;

	/**
	 * The feature id for the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE__SECTIONNAME = 6;

	/**
	 * The number of structural features of the '<em>EE Data Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EE_DATA_SECTOR_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.EmulatorZoneTypeImpl <em>Emulator Zone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.EmulatorZoneTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getEmulatorZoneType()
	 * @generated
	 */
	int EMULATOR_ZONE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__SFR_DEF = 2;

	/**
	 * The feature id for the '<em><b>Adjust Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__ADJUST_POINT = 3;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__BANK = 4;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__BEGINADDR = 5;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__ENDADDR = 6;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__REGIONID = 7;

	/**
	 * The feature id for the '<em><b>Shadowidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__SHADOWIDREF = 8;

	/**
	 * The feature id for the '<em><b>Shadowoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__SHADOWOFFSET = 9;

	/**
	 * The feature id for the '<em><b>Shadowoffset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE__SHADOWOFFSET1 = 10;

	/**
	 * The number of structural features of the '<em>Emulator Zone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMULATOR_ZONE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.GPRDataSectorTypeImpl <em>GPR Data Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.GPRDataSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getGPRDataSectorType()
	 * @generated
	 */
	int GPR_DATA_SECTOR_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__SFR_DEF = 2;

	/**
	 * The feature id for the '<em><b>Adjust Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__ADJUST_POINT = 3;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__BANK = 4;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__BEGINADDR = 5;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__ENDADDR = 6;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__REGIONID = 7;

	/**
	 * The feature id for the '<em><b>Shadowidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__SHADOWIDREF = 8;

	/**
	 * The feature id for the '<em><b>Shadowoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__SHADOWOFFSET = 9;

	/**
	 * The feature id for the '<em><b>Shadowoffset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE__SHADOWOFFSET1 = 10;

	/**
	 * The number of structural features of the '<em>GPR Data Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPR_DATA_SECTOR_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.IllegalTypeImpl <em>Illegal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.IllegalTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getIllegalType()
	 * @generated
	 */
	int ILLEGAL_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_TYPE__WHEN = 2;

	/**
	 * The number of structural features of the '<em>Illegal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILLEGAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ImportTypeImpl <em>Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ImportTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getImportType()
	 * @generated
	 */
	int IMPORT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Module Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE__MODULE_IMPORT = 0;

	/**
	 * The number of structural features of the '<em>Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.JoinedSFRDefTypeImpl <em>Joined SFR Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.JoinedSFRDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getJoinedSFRDefType()
	 * @generated
	 */
	int JOINED_SFR_DEF_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ALIAS_LIST = 3;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__SFR_MODE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__STIM_INFO = 5;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__SFR_DEF = 6;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__MODULE_MACRO = 7;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__MODULE_EXCLUDE = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>Joined SFR Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINED_SFR_DEF_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.LatchesTypeImpl <em>Latches Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.LatchesTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getLatchesType()
	 * @generated
	 */
	int LATCHES_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE__CFG = 1;

	/**
	 * The feature id for the '<em><b>Eedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE__EEDATA = 2;

	/**
	 * The feature id for the '<em><b>Pgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE__PGM = 3;

	/**
	 * The feature id for the '<em><b>Rowerase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE__ROWERASE = 4;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE__USERID = 5;

	/**
	 * The number of structural features of the '<em>Latches Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATCHES_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.LCDTypeImpl <em>LCD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.LCDTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getLCDType()
	 * @generated
	 */
	int LCD_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCD_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Segcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCD_TYPE__SEGCOUNT = 1;

	/**
	 * The number of structural features of the '<em>LCD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.LegacyAliasTypeImpl <em>Legacy Alias Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.LegacyAliasTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getLegacyAliasType()
	 * @generated
	 */
	int LEGACY_ALIAS_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ALIAS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ALIAS_TYPE__CNAME = 1;

	/**
	 * The number of structural features of the '<em>Legacy Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGACY_ALIAS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.MemTraitsTypeImpl <em>Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.MemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getMemTraitsType()
	 * @generated
	 */
	int MEM_TRAITS_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Code Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__CODE_MEM_TRAITS = 0;

	/**
	 * The feature id for the '<em><b>Cal Data Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__CAL_DATA_MEM_TRAITS = 1;

	/**
	 * The feature id for the '<em><b>Background Debug Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__BACKGROUND_DEBUG_MEM_TRAITS = 2;

	/**
	 * The feature id for the '<em><b>Test Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__TEST_MEM_TRAITS = 3;

	/**
	 * The feature id for the '<em><b>User ID Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__USER_ID_MEM_TRAITS = 4;

	/**
	 * The feature id for the '<em><b>Config Fuse Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__CONFIG_FUSE_MEM_TRAITS = 5;

	/**
	 * The feature id for the '<em><b>Device ID Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__DEVICE_ID_MEM_TRAITS = 6;

	/**
	 * The feature id for the '<em><b>EE Data Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__EE_DATA_MEM_TRAITS = 7;

	/**
	 * The feature id for the '<em><b>Data Mem Traits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__DATA_MEM_TRAITS = 8;

	/**
	 * The feature id for the '<em><b>Bankcount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__BANKCOUNT = 9;

	/**
	 * The feature id for the '<em><b>Hwstackdepth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE__HWSTACKDEPTH = 10;

	/**
	 * The number of structural features of the '<em>Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEM_TRAITS_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.MigrationAliasTypeImpl <em>Migration Alias Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.MigrationAliasTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getMigrationAliasType()
	 * @generated
	 */
	int MIGRATION_ALIAS_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_ALIAS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_ALIAS_TYPE__CNAME = 1;

	/**
	 * The number of structural features of the '<em>Migration Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_ALIAS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.MirrorTypeImpl <em>Mirror Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.MirrorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getMirrorType()
	 * @generated
	 */
	int MIRROR_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__DCR_FIELD_SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ALIAS_LIST = 3;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__SFR_MODE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__STIM_INFO = 5;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__MODULE_MACRO = 6;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__MODULE_EXCLUDE = 7;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__SFR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>Mirror Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIRROR_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ModuleExcludeTypeImpl <em>Module Exclude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ModuleExcludeTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getModuleExcludeType()
	 * @generated
	 */
	int MODULE_EXCLUDE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXCLUDE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXCLUDE_TYPE__IMPL = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXCLUDE_TYPE__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXCLUDE_TYPE__REPLACE = 3;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXCLUDE_TYPE__WITH = 4;

	/**
	 * The number of structural features of the '<em>Module Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_EXCLUDE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ModuleImportTypeImpl <em>Module Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ModuleImportTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getModuleImportType()
	 * @generated
	 */
	int MODULE_IMPORT_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_TYPE__MODSRC = 1;

	/**
	 * The number of structural features of the '<em>Module Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_IMPORT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ModuleMacroTypeImpl <em>Module Macro Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ModuleMacroTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getModuleMacroType()
	 * @generated
	 */
	int MODULE_MACRO_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MACRO_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MACRO_TYPE__IMPL = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MACRO_TYPE__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MACRO_TYPE__REPLACE = 3;

	/**
	 * The feature id for the '<em><b>With</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MACRO_TYPE__WITH = 4;

	/**
	 * The number of structural features of the '<em>Module Macro Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_MACRO_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ModuleRefTypeImpl <em>Module Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ModuleRefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getModuleRefType()
	 * @generated
	 */
	int MODULE_REF_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__MODULE_MACRO = 2;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__MODULE_EXCLUDE = 3;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__DCR_FIELD_SEMANTIC = 4;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ALIAS_LIST = 5;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__SFR_MODE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__STIM_INFO = 7;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__SFR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>Module Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.MuxedSFRDefTypeImpl <em>Muxed SFR Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.MuxedSFRDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getMuxedSFRDefType()
	 * @generated
	 */
	int MUXED_SFR_DEF_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Select SFR</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__SELECT_SFR = 2;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC = 3;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ALIAS_LIST = 4;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__SFR_MODE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__STIM_INFO = 6;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__MODULE_MACRO = 7;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__MODULE_EXCLUDE = 8;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__SFR_DEF = 9;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__CHECKSUM = 10;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC = 11;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ACCESS = 12;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__BEGIN = 13;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__CNAME = 14;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__DESC = 15;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__END = 16;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__IMPL = 17;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ISHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ISIDEHIDDEN = 19;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ISINDIRECT = 20;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ISLANGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ISLNAGHIDDEN = 22;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__ISVOLATILE = 23;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__MASK = 24;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__MCLR = 25;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__MODSRC = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__NAME = 27;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__NZSIZE = 28;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__NZWIDTH = 29;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__OFFSET = 30;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__POR = 31;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE__REGIONIDREF = 32;

	/**
	 * The number of structural features of the '<em>Muxed SFR Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUXED_SFR_DEF_TYPE_FEATURE_COUNT = 33;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.NMMRPlaceTypeImpl <em>NMMR Place Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.NMMRPlaceTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getNMMRPlaceType()
	 * @generated
	 */
	int NMMR_PLACE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Module Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NMMR_PLACE_TYPE__MODULE_REF = 0;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NMMR_PLACE_TYPE__REGIONID = 1;

	/**
	 * The number of structural features of the '<em>NMMR Place Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NMMR_PLACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.OscillatorModeTypeImpl <em>Oscillator Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.OscillatorModeTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getOscillatorModeType()
	 * @generated
	 */
	int OSCILLATOR_MODE_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_MODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_MODE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_MODE_TYPE__MAX = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_MODE_TYPE__MIN = 3;

	/**
	 * The number of structural features of the '<em>Oscillator Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_MODE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.OscillatorTypeImpl <em>Oscillator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.OscillatorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getOscillatorType()
	 * @generated
	 */
	int OSCILLATOR_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Oscillator Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_TYPE__OSCILLATOR_MODE = 0;

	/**
	 * The number of structural features of the '<em>Oscillator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSCILLATOR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.PICTypeImpl <em>PIC Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.PICTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getPICType()
	 * @generated
	 */
	int PIC_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__POWER = 1;

	/**
	 * The feature id for the '<em><b>Programming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__PROGRAMMING = 2;

	/**
	 * The feature id for the '<em><b>Arch Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__ARCH_DEF = 3;

	/**
	 * The feature id for the '<em><b>Oscillator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__OSCILLATOR = 4;

	/**
	 * The feature id for the '<em><b>Watchdog Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__WATCHDOG_TIMER = 5;

	/**
	 * The feature id for the '<em><b>Breakpoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__BREAKPOINTS = 6;

	/**
	 * The feature id for the '<em><b>LCD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__LCD = 7;

	/**
	 * The feature id for the '<em><b>Program Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__PROGRAM_SPACE = 8;

	/**
	 * The feature id for the '<em><b>Data Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__DATA_SPACE = 9;

	/**
	 * The feature id for the '<em><b>Pin List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__PIN_LIST = 10;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__ARCH = 11;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__DESC = 12;

	/**
	 * The feature id for the '<em><b>Dsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__DSID = 13;

	/**
	 * The feature id for the '<em><b>Hasfreeze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__HASFREEZE = 14;

	/**
	 * The feature id for the '<em><b>Informedby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__INFORMEDBY = 15;

	/**
	 * The feature id for the '<em><b>Isextended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__ISEXTENDED = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__NAME = 17;

	/**
	 * The feature id for the '<em><b>Procid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE__PROCID = 18;

	/**
	 * The number of structural features of the '<em>PIC Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIC_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.PinListTypeImpl <em>Pin List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.PinListTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getPinListType()
	 * @generated
	 */
	int PIN_LIST_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LIST_TYPE__PIN = 0;

	/**
	 * The number of structural features of the '<em>Pin List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.PinTypeImpl <em>Pin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.PinTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getPinType()
	 * @generated
	 */
	int PIN_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Virtual Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_TYPE__VIRTUAL_PIN = 0;

	/**
	 * The number of structural features of the '<em>Pin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.PowerTypeImpl <em>Power Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.PowerTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getPowerType()
	 * @generated
	 */
	int POWER_TYPE = 57;

	/**
	 * The feature id for the '<em><b>VPP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE__VPP = 0;

	/**
	 * The feature id for the '<em><b>VDD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE__VDD = 1;

	/**
	 * The number of structural features of the '<em>Power Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ProgrammingTypeImpl <em>Programming Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ProgrammingTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getProgrammingType()
	 * @generated
	 */
	int PROGRAMMING_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__WAIT = 1;

	/**
	 * The feature id for the '<em><b>Latches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__LATCHES = 2;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__BOUNDARY = 3;

	/**
	 * The feature id for the '<em><b>Csumadd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__CSUMADD = 4;

	/**
	 * The feature id for the '<em><b>Erasealgo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__ERASEALGO = 5;

	/**
	 * The feature id for the '<em><b>Haschecksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__HASCHECKSUM = 6;

	/**
	 * The feature id for the '<em><b>Hasrowerasecmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__HASROWERASECMD = 7;

	/**
	 * The feature id for the '<em><b>Hasvppfirst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__HASVPPFIRST = 8;

	/**
	 * The feature id for the '<em><b>Lvpthresh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__LVPTHRESH = 9;

	/**
	 * The feature id for the '<em><b>Memtech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__MEMTECH = 10;

	/**
	 * The feature id for the '<em><b>Ovrpgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__OVRPGM = 11;

	/**
	 * The feature id for the '<em><b>Tries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE__TRIES = 12;

	/**
	 * The number of structural features of the '<em>Programming Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMING_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.ProgramSpaceTypeImpl <em>Program Space Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.ProgramSpaceTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getProgramSpaceType()
	 * @generated
	 */
	int PROGRAM_SPACE_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Code Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__CODE_SECTOR = 1;

	/**
	 * The feature id for the '<em><b>User ID Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__USER_ID_SECTOR = 2;

	/**
	 * The feature id for the '<em><b>Test Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__TEST_ZONE = 3;

	/**
	 * The feature id for the '<em><b>Device ID Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__DEVICE_ID_SECTOR = 4;

	/**
	 * The feature id for the '<em><b>Config Fuse Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__CONFIG_FUSE_SECTOR = 5;

	/**
	 * The feature id for the '<em><b>BACKBUG Vector Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__BACKBUG_VECTOR_SECTOR = 6;

	/**
	 * The feature id for the '<em><b>Cal Data Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__CAL_DATA_ZONE = 7;

	/**
	 * The feature id for the '<em><b>EE Data Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE__EE_DATA_SECTOR = 8;

	/**
	 * The number of structural features of the '<em>Program Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SPACE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.RegardlessOfModeTypeImpl <em>Regardless Of Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.RegardlessOfModeTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getRegardlessOfModeType()
	 * @generated
	 */
	int REGARDLESS_OF_MODE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>NMMR Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE__NMMR_PLACE = 1;

	/**
	 * The feature id for the '<em><b>SFR Data Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE__SFR_DATA_SECTOR = 2;

	/**
	 * The feature id for the '<em><b>DPR Data Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE__DPR_DATA_SECTOR = 3;

	/**
	 * The feature id for the '<em><b>GPR Data Sector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE__GPR_DATA_SECTOR = 4;

	/**
	 * The feature id for the '<em><b>Emulator Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE__EMULATOR_ZONE = 5;

	/**
	 * The number of structural features of the '<em>Regardless Of Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGARDLESS_OF_MODE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SelectSFRTypeImpl <em>Select SFR Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SelectSFRTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSelectSFRType()
	 * @generated
	 */
	int SELECT_SFR_TYPE = 61;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SFR_TYPE__SFR_DEF = 0;

	/**
	 * The number of structural features of the '<em>Select SFR Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_SFR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SFRDataSectorTypeImpl <em>SFR Data Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SFRDataSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSFRDataSectorType()
	 * @generated
	 */
	int SFR_DATA_SECTOR_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__SFR_DEF = 1;

	/**
	 * The feature id for the '<em><b>Joined SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__JOINED_SFR_DEF = 2;

	/**
	 * The feature id for the '<em><b>Adjust Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__ADJUST_POINT = 3;

	/**
	 * The feature id for the '<em><b>Mirror</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__MIRROR = 4;

	/**
	 * The feature id for the '<em><b>Module Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__MODULE_REF = 5;

	/**
	 * The feature id for the '<em><b>Muxed SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__MUXED_SFR_DEF = 6;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__BANK = 7;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__BEGINADDR = 8;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__ENDADDR = 9;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE__REGIONID = 10;

	/**
	 * The number of structural features of the '<em>SFR Data Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DATA_SECTOR_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SFRDefTypeImpl <em>SFR Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SFRDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSFRDefType()
	 * @generated
	 */
	int SFR_DEF_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__DCR_FIELD_SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ALIAS_LIST = 3;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__SFR_MODE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__STIM_INFO = 5;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__MODULE_MACRO = 6;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__MODULE_EXCLUDE = 7;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__SFR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>SFR Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_DEF_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SFRFieldDefTypeImpl <em>SFR Field Def Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SFRFieldDefTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSFRFieldDefType()
	 * @generated
	 */
	int SFR_FIELD_DEF_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC = 2;

	/**
	 * The feature id for the '<em><b>Alias List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ALIAS_LIST = 3;

	/**
	 * The feature id for the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__SFR_MODE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Stim Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__STIM_INFO = 5;

	/**
	 * The feature id for the '<em><b>Module Macro</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__MODULE_MACRO = 6;

	/**
	 * The feature id for the '<em><b>Module Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__MODULE_EXCLUDE = 7;

	/**
	 * The feature id for the '<em><b>SFR Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__SFR_DEF = 8;

	/**
	 * The feature id for the '<em><b>Checksum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__CHECKSUM = 9;

	/**
	 * The feature id for the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC = 10;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ACCESS = 11;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__BEGIN = 12;

	/**
	 * The feature id for the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__CNAME = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__DESC = 14;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__END = 15;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__IMPL = 16;

	/**
	 * The feature id for the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ISHIDDEN = 17;

	/**
	 * The feature id for the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ISIDEHIDDEN = 18;

	/**
	 * The feature id for the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ISINDIRECT = 19;

	/**
	 * The feature id for the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ISLANGHIDDEN = 20;

	/**
	 * The feature id for the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ISLNAGHIDDEN = 21;

	/**
	 * The feature id for the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__ISVOLATILE = 22;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__MASK = 23;

	/**
	 * The feature id for the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__MCLR = 24;

	/**
	 * The feature id for the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__MODSRC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__NAME = 26;

	/**
	 * The feature id for the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__NZSIZE = 27;

	/**
	 * The feature id for the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__NZWIDTH = 28;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__POR = 30;

	/**
	 * The feature id for the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE__REGIONIDREF = 31;

	/**
	 * The number of structural features of the '<em>SFR Field Def Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_DEF_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SFRFieldSemanticTypeImpl <em>SFR Field Semantic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SFRFieldSemanticTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSFRFieldSemanticType()
	 * @generated
	 */
	int SFR_FIELD_SEMANTIC_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_SEMANTIC_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_SEMANTIC_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_SEMANTIC_TYPE__WHEN = 2;

	/**
	 * The number of structural features of the '<em>SFR Field Semantic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_FIELD_SEMANTIC_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SFRModeListTypeImpl <em>SFR Mode List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SFRModeListTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSFRModeListType()
	 * @generated
	 */
	int SFR_MODE_LIST_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>SFR Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE__SFR_MODE = 1;

	/**
	 * The feature id for the '<em><b>Stimpcfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE__STIMPCFILES = 2;

	/**
	 * The feature id for the '<em><b>Stimregfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE__STIMREGFILES = 3;

	/**
	 * The feature id for the '<em><b>Stimscl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE__STIMSCL = 4;

	/**
	 * The feature id for the '<em><b>Stimtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE__STIMTYPE = 5;

	/**
	 * The number of structural features of the '<em>SFR Mode List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_LIST_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.SFRModeTypeImpl <em>SFR Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.SFRModeTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getSFRModeType()
	 * @generated
	 */
	int SFR_MODE_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Adjust Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_TYPE__ADJUST_POINT = 2;

	/**
	 * The feature id for the '<em><b>SFR Field Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_TYPE__SFR_FIELD_DEF = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>SFR Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFR_MODE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.StimInfoTypeImpl <em>Stim Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.StimInfoTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getStimInfoType()
	 * @generated
	 */
	int STIM_INFO_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIM_INFO_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Stimpcfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIM_INFO_TYPE__STIMPCFILES = 1;

	/**
	 * The feature id for the '<em><b>Stimregfiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIM_INFO_TYPE__STIMREGFILES = 2;

	/**
	 * The feature id for the '<em><b>Stimscl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIM_INFO_TYPE__STIMSCL = 3;

	/**
	 * The feature id for the '<em><b>Stimtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIM_INFO_TYPE__STIMTYPE = 4;

	/**
	 * The number of structural features of the '<em>Stim Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIM_INFO_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.TestMemTraitsTypeImpl <em>Test Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.TestMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getTestMemTraitsType()
	 * @generated
	 */
	int TEST_MEM_TRAITS_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>Test Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.TestZoneTypeImpl <em>Test Zone Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.TestZoneTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getTestZoneType()
	 * @generated
	 */
	int TEST_ZONE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ZONE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ZONE_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ZONE_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ZONE_TYPE__REGIONID = 3;

	/**
	 * The number of structural features of the '<em>Test Zone Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ZONE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.UserIDMemTraitsTypeImpl <em>User ID Mem Traits Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.UserIDMemTraitsTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getUserIDMemTraitsType()
	 * @generated
	 */
	int USER_ID_MEM_TRAITS_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Locsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE__LOCSIZE = 1;

	/**
	 * The feature id for the '<em><b>Wordimpl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE__WORDIMPL = 2;

	/**
	 * The feature id for the '<em><b>Wordinit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE__WORDINIT = 3;

	/**
	 * The feature id for the '<em><b>Wordsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE__WORDSAFE = 4;

	/**
	 * The feature id for the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE__WORDSIZE = 5;

	/**
	 * The number of structural features of the '<em>User ID Mem Traits Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_MEM_TRAITS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.UserIDSectorTypeImpl <em>User ID Sector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.UserIDSectorTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getUserIDSectorType()
	 * @generated
	 */
	int USER_ID_SECTOR_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Beginaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__BEGINADDR = 1;

	/**
	 * The feature id for the '<em><b>Endaddr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__ENDADDR = 2;

	/**
	 * The feature id for the '<em><b>Issection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__ISSECTION = 3;

	/**
	 * The feature id for the '<em><b>Regionid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__REGIONID = 4;

	/**
	 * The feature id for the '<em><b>Sectiondesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__SECTIONDESC = 5;

	/**
	 * The feature id for the '<em><b>Sectionname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE__SECTIONNAME = 6;

	/**
	 * The number of structural features of the '<em>User ID Sector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ID_SECTOR_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.VDDTypeImpl <em>VDD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.VDDTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getVDDType()
	 * @generated
	 */
	int VDD_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Maxdefaultvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE__MAXDEFAULTVOLTAGE = 1;

	/**
	 * The feature id for the '<em><b>Maxvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE__MAXVOLTAGE = 2;

	/**
	 * The feature id for the '<em><b>Mindefaultvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE__MINDEFAULTVOLTAGE = 3;

	/**
	 * The feature id for the '<em><b>Minvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE__MINVOLTAGE = 4;

	/**
	 * The feature id for the '<em><b>Nominalvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE__NOMINALVOLTAGE = 5;

	/**
	 * The number of structural features of the '<em>VDD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDD_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.VirtualPinTypeImpl <em>Virtual Pin Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.VirtualPinTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getVirtualPinType()
	 * @generated
	 */
	int VIRTUAL_PIN_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PIN_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PIN_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ppsval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PIN_TYPE__PPSVAL = 2;

	/**
	 * The number of structural features of the '<em>Virtual Pin Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_PIN_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.VPPTypeImpl <em>VPP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.VPPTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getVPPType()
	 * @generated
	 */
	int VPP_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Defaultvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP_TYPE__DEFAULTVOLTAGE = 1;

	/**
	 * The feature id for the '<em><b>Maxvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP_TYPE__MAXVOLTAGE = 2;

	/**
	 * The feature id for the '<em><b>Minvoltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP_TYPE__MINVOLTAGE = 3;

	/**
	 * The number of structural features of the '<em>VPP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPP_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.WaitTypeImpl <em>Wait Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.WaitTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getWaitType()
	 * @generated
	 */
	int WAIT_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__CFG = 1;

	/**
	 * The feature id for the '<em><b>Eedata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__EEDATA = 2;

	/**
	 * The feature id for the '<em><b>Erase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__ERASE = 3;

	/**
	 * The feature id for the '<em><b>Lverase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__LVERASE = 4;

	/**
	 * The feature id for the '<em><b>Lvpgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__LVPGM = 5;

	/**
	 * The feature id for the '<em><b>Pgm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__PGM = 6;

	/**
	 * The feature id for the '<em><b>Userid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE__USERID = 7;

	/**
	 * The number of structural features of the '<em>Wait Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link crownking.edc.impl.WatchdogTimerTypeImpl <em>Watchdog Timer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see crownking.edc.impl.WatchdogTimerTypeImpl
	 * @see crownking.edc.impl.EdcPackageImpl#getWatchdogTimerType()
	 * @generated
	 */
	int WATCHDOG_TIMER_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATCHDOG_TIMER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATCHDOG_TIMER_TYPE__MIN = 1;

	/**
	 * The number of structural features of the '<em>Watchdog Timer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATCHDOG_TIMER_TYPE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link crownking.edc.AdjustPointType <em>Adjust Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjust Point Type</em>'.
	 * @see crownking.edc.AdjustPointType
	 * @generated
	 */
	EClass getAdjustPointType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AdjustPointType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AdjustPointType#getMixed()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AdjustPointType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AdjustPointType#getGroup()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.AdjustPointType#getDCRFieldSemantic()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AdjustPointType#getAliasList()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.AdjustPointType#getSFRModeList()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.AdjustPointType#getStimInfo()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.AdjustPointType#getModuleMacro()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.AdjustPointType#getModuleExclude()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.AdjustPointType#getSFRDef()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AdjustPointType#getChecksum()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AdjustPointType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.AdjustPointType#getSFRFieldSemantic()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EReference getAdjustPointType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.AdjustPointType#getAccess()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.AdjustPointType#getBegin()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AdjustPointType#getCname()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AdjustPointType#getDesc()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.AdjustPointType#getEnd()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.AdjustPointType#getImpl()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AdjustPointType#getIshidden()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.AdjustPointType#getIsidehidden()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.AdjustPointType#getIsindirect()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AdjustPointType#getIslanghidden()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.AdjustPointType#getIslnaghidden()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.AdjustPointType#getIsvolatile()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.AdjustPointType#getMask()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.AdjustPointType#getMclr()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.AdjustPointType#getModsrc()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.AdjustPointType#getName()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.AdjustPointType#getNzsize()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.AdjustPointType#getNzwidth()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.AdjustPointType#getOffset()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.AdjustPointType#getPor()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AdjustPointType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.AdjustPointType#getRegionidref()
	 * @see #getAdjustPointType()
	 * @generated
	 */
	EAttribute getAdjustPointType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType <em>Alias List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type</em>'.
	 * @see crownking.edc.AliasListType
	 * @generated
	 */
	EClass getAliasListType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType#getMixed()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType#getGroup()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType#getLegacyAlias()
	 * @see #getAliasListType()
	 * @generated
	 */
	EReference getAliasListType_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType#getMigrationAlias()
	 * @see #getAliasListType()
	 * @generated
	 */
	EReference getAliasListType_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType#getAliasList()
	 * @see #getAliasListType()
	 * @generated
	 */
	EReference getAliasListType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType#getChecksum()
	 * @see #getAliasListType()
	 * @generated
	 */
	EReference getAliasListType_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType#getBeginaddr()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType#getChecksumalgo()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType#getCname()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType#getDesc()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType#getEndaddr()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType#getIshidden()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType#getIslanghidden()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType#getOscmodeidref()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType#getWhen()
	 * @see #getAliasListType()
	 * @generated
	 */
	EAttribute getAliasListType_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType1 <em>Alias List Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type1</em>'.
	 * @see crownking.edc.AliasListType1
	 * @generated
	 */
	EClass getAliasListType1();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType1#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType1#getMixed()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType1#getGroup()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType1#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType1#getLegacyAlias()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EReference getAliasListType1_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType1#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType1#getMigrationAlias()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EReference getAliasListType1_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType1#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType1#getAliasList()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EReference getAliasListType1_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType1#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType1#getChecksum()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EReference getAliasListType1_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType1#getBeginaddr()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType1#getChecksumalgo()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType1#getCname()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType1#getDesc()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType1#getEndaddr()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType1#getIshidden()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType1#getIslanghidden()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType1#getOscmodeidref()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType1#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType1#getWhen()
	 * @see #getAliasListType1()
	 * @generated
	 */
	EAttribute getAliasListType1_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType2 <em>Alias List Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type2</em>'.
	 * @see crownking.edc.AliasListType2
	 * @generated
	 */
	EClass getAliasListType2();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType2#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType2#getMixed()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType2#getGroup()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType2#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType2#getLegacyAlias()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EReference getAliasListType2_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType2#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType2#getMigrationAlias()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EReference getAliasListType2_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType2#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType2#getAliasList()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EReference getAliasListType2_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType2#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType2#getChecksum()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EReference getAliasListType2_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType2#getBeginaddr()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType2#getChecksumalgo()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType2#getCname()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType2#getDesc()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType2#getEndaddr()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType2#getIshidden()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType2#getIslanghidden()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType2#getOscmodeidref()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType2#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType2#getWhen()
	 * @see #getAliasListType2()
	 * @generated
	 */
	EAttribute getAliasListType2_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType3 <em>Alias List Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type3</em>'.
	 * @see crownking.edc.AliasListType3
	 * @generated
	 */
	EClass getAliasListType3();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType3#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType3#getMixed()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType3#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType3#getGroup()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType3#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType3#getLegacyAlias()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EReference getAliasListType3_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType3#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType3#getMigrationAlias()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EReference getAliasListType3_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType3#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType3#getAliasList()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EReference getAliasListType3_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType3#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType3#getChecksum()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EReference getAliasListType3_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType3#getBeginaddr()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType3#getChecksumalgo()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType3#getCname()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType3#getDesc()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType3#getEndaddr()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType3#getIshidden()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType3#getIslanghidden()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType3#getOscmodeidref()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType3#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType3#getWhen()
	 * @see #getAliasListType3()
	 * @generated
	 */
	EAttribute getAliasListType3_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType4 <em>Alias List Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type4</em>'.
	 * @see crownking.edc.AliasListType4
	 * @generated
	 */
	EClass getAliasListType4();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType4#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType4#getMixed()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType4#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType4#getGroup()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType4#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType4#getLegacyAlias()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EReference getAliasListType4_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType4#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType4#getMigrationAlias()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EReference getAliasListType4_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType4#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType4#getAliasList()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EReference getAliasListType4_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType4#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType4#getChecksum()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EReference getAliasListType4_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType4#getBeginaddr()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType4#getChecksumalgo()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType4#getCname()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType4#getDesc()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType4#getEndaddr()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType4#getIshidden()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType4#getIslanghidden()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType4#getOscmodeidref()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType4#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType4#getWhen()
	 * @see #getAliasListType4()
	 * @generated
	 */
	EAttribute getAliasListType4_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType5 <em>Alias List Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type5</em>'.
	 * @see crownking.edc.AliasListType5
	 * @generated
	 */
	EClass getAliasListType5();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType5#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType5#getMixed()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType5#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType5#getGroup()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType5#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType5#getLegacyAlias()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EReference getAliasListType5_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType5#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType5#getMigrationAlias()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EReference getAliasListType5_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType5#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType5#getAliasList()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EReference getAliasListType5_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType5#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType5#getChecksum()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EReference getAliasListType5_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType5#getBeginaddr()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType5#getChecksumalgo()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType5#getCname()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType5#getDesc()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType5#getEndaddr()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType5#getIshidden()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType5#getIslanghidden()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType5#getOscmodeidref()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType5#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType5#getWhen()
	 * @see #getAliasListType5()
	 * @generated
	 */
	EAttribute getAliasListType5_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType6 <em>Alias List Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type6</em>'.
	 * @see crownking.edc.AliasListType6
	 * @generated
	 */
	EClass getAliasListType6();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType6#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType6#getMixed()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType6#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType6#getGroup()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType6#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType6#getLegacyAlias()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EReference getAliasListType6_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType6#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType6#getMigrationAlias()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EReference getAliasListType6_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType6#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType6#getAliasList()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EReference getAliasListType6_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType6#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType6#getChecksum()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EReference getAliasListType6_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType6#getBeginaddr()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType6#getChecksumalgo()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType6#getCname()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType6#getDesc()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType6#getEndaddr()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType6#getIshidden()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType6#getIslanghidden()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType6#getOscmodeidref()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType6#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType6#getWhen()
	 * @see #getAliasListType6()
	 * @generated
	 */
	EAttribute getAliasListType6_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType7 <em>Alias List Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type7</em>'.
	 * @see crownking.edc.AliasListType7
	 * @generated
	 */
	EClass getAliasListType7();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType7#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.AliasListType7#getMixed()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType7#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType7#getGroup()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType7#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType7#getLegacyAlias()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EReference getAliasListType7_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType7#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType7#getMigrationAlias()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EReference getAliasListType7_MigrationAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType7#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.AliasListType7#getAliasList()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EReference getAliasListType7_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType7#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.AliasListType7#getChecksum()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EReference getAliasListType7_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.AliasListType7#getBeginaddr()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.AliasListType7#getChecksumalgo()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.AliasListType7#getCname()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.AliasListType7#getDesc()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.AliasListType7#getEndaddr()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.AliasListType7#getIshidden()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.AliasListType7#getIslanghidden()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.AliasListType7#getOscmodeidref()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.AliasListType7#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.AliasListType7#getWhen()
	 * @see #getAliasListType7()
	 * @generated
	 */
	EAttribute getAliasListType7_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.AliasListType8 <em>Alias List Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias List Type8</em>'.
	 * @see crownking.edc.AliasListType8
	 * @generated
	 */
	EClass getAliasListType8();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.AliasListType8#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.AliasListType8#getGroup()
	 * @see #getAliasListType8()
	 * @generated
	 */
	EAttribute getAliasListType8_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType8#getLegacyAlias <em>Legacy Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legacy Alias</em>'.
	 * @see crownking.edc.AliasListType8#getLegacyAlias()
	 * @see #getAliasListType8()
	 * @generated
	 */
	EReference getAliasListType8_LegacyAlias();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.AliasListType8#getMigrationAlias <em>Migration Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Migration Alias</em>'.
	 * @see crownking.edc.AliasListType8#getMigrationAlias()
	 * @see #getAliasListType8()
	 * @generated
	 */
	EReference getAliasListType8_MigrationAlias();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ArchDefType <em>Arch Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arch Def Type</em>'.
	 * @see crownking.edc.ArchDefType
	 * @generated
	 */
	EClass getArchDefType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.ArchDefType#getMemTraits <em>Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mem Traits</em>'.
	 * @see crownking.edc.ArchDefType#getMemTraits()
	 * @see #getArchDefType()
	 * @generated
	 */
	EReference getArchDefType_MemTraits();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ArchDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.ArchDefType#getDesc()
	 * @see #getArchDefType()
	 * @generated
	 */
	EAttribute getArchDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ArchDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.ArchDefType#getName()
	 * @see #getArchDefType()
	 * @generated
	 */
	EAttribute getArchDefType_Name();

	/**
	 * Returns the meta object for class '{@link crownking.edc.BACKBUGVectorSectorType <em>BACKBUG Vector Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BACKBUG Vector Sector Type</em>'.
	 * @see crownking.edc.BACKBUGVectorSectorType
	 * @generated
	 */
	EClass getBACKBUGVectorSectorType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BACKBUGVectorSectorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.BACKBUGVectorSectorType#getValue()
	 * @see #getBACKBUGVectorSectorType()
	 * @generated
	 */
	EAttribute getBACKBUGVectorSectorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BACKBUGVectorSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.BACKBUGVectorSectorType#getBeginaddr()
	 * @see #getBACKBUGVectorSectorType()
	 * @generated
	 */
	EAttribute getBACKBUGVectorSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BACKBUGVectorSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.BACKBUGVectorSectorType#getEndaddr()
	 * @see #getBACKBUGVectorSectorType()
	 * @generated
	 */
	EAttribute getBACKBUGVectorSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BACKBUGVectorSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.BACKBUGVectorSectorType#getRegionid()
	 * @see #getBACKBUGVectorSectorType()
	 * @generated
	 */
	EAttribute getBACKBUGVectorSectorType_Regionid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.BackgroundDebugMemTraitsType <em>Background Debug Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Debug Mem Traits Type</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType
	 * @generated
	 */
	EClass getBackgroundDebugMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BackgroundDebugMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType#getValue()
	 * @see #getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	EAttribute getBackgroundDebugMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BackgroundDebugMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType#getLocsize()
	 * @see #getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	EAttribute getBackgroundDebugMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BackgroundDebugMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType#getWordimpl()
	 * @see #getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	EAttribute getBackgroundDebugMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BackgroundDebugMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType#getWordinit()
	 * @see #getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	EAttribute getBackgroundDebugMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BackgroundDebugMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType#getWordsafe()
	 * @see #getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	EAttribute getBackgroundDebugMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BackgroundDebugMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.BackgroundDebugMemTraitsType#getWordsize()
	 * @see #getBackgroundDebugMemTraitsType()
	 * @generated
	 */
	EAttribute getBackgroundDebugMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.BreakpointsType <em>Breakpoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breakpoints Type</em>'.
	 * @see crownking.edc.BreakpointsType
	 * @generated
	 */
	EClass getBreakpointsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BreakpointsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.BreakpointsType#getValue()
	 * @see #getBreakpointsType()
	 * @generated
	 */
	EAttribute getBreakpointsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BreakpointsType#getHasdatacapture <em>Hasdatacapture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hasdatacapture</em>'.
	 * @see crownking.edc.BreakpointsType#getHasdatacapture()
	 * @see #getBreakpointsType()
	 * @generated
	 */
	EAttribute getBreakpointsType_Hasdatacapture();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BreakpointsType#getHwbpcount <em>Hwbpcount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwbpcount</em>'.
	 * @see crownking.edc.BreakpointsType#getHwbpcount()
	 * @see #getBreakpointsType()
	 * @generated
	 */
	EAttribute getBreakpointsType_Hwbpcount();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.BreakpointsType#getIdbyte <em>Idbyte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idbyte</em>'.
	 * @see crownking.edc.BreakpointsType#getIdbyte()
	 * @see #getBreakpointsType()
	 * @generated
	 */
	EAttribute getBreakpointsType_Idbyte();

	/**
	 * Returns the meta object for class '{@link crownking.edc.CalDataMemTraitsType <em>Cal Data Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cal Data Mem Traits Type</em>'.
	 * @see crownking.edc.CalDataMemTraitsType
	 * @generated
	 */
	EClass getCalDataMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.CalDataMemTraitsType#getValue()
	 * @see #getCalDataMemTraitsType()
	 * @generated
	 */
	EAttribute getCalDataMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.CalDataMemTraitsType#getLocsize()
	 * @see #getCalDataMemTraitsType()
	 * @generated
	 */
	EAttribute getCalDataMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.CalDataMemTraitsType#getWordimpl()
	 * @see #getCalDataMemTraitsType()
	 * @generated
	 */
	EAttribute getCalDataMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.CalDataMemTraitsType#getWordinit()
	 * @see #getCalDataMemTraitsType()
	 * @generated
	 */
	EAttribute getCalDataMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.CalDataMemTraitsType#getWordsafe()
	 * @see #getCalDataMemTraitsType()
	 * @generated
	 */
	EAttribute getCalDataMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.CalDataMemTraitsType#getWordsize()
	 * @see #getCalDataMemTraitsType()
	 * @generated
	 */
	EAttribute getCalDataMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.CalDataZoneType <em>Cal Data Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cal Data Zone Type</em>'.
	 * @see crownking.edc.CalDataZoneType
	 * @generated
	 */
	EClass getCalDataZoneType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.CalDataZoneType#getValue()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.CalDataZoneType#getBeginaddr()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.CalDataZoneType#getEndaddr()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getIssection <em>Issection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issection</em>'.
	 * @see crownking.edc.CalDataZoneType#getIssection()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Issection();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.CalDataZoneType#getRegionid()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getSectiondesc <em>Sectiondesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectiondesc</em>'.
	 * @see crownking.edc.CalDataZoneType#getSectiondesc()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Sectiondesc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CalDataZoneType#getSectionname <em>Sectionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectionname</em>'.
	 * @see crownking.edc.CalDataZoneType#getSectionname()
	 * @see #getCalDataZoneType()
	 * @generated
	 */
	EAttribute getCalDataZoneType_Sectionname();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ChecksumType <em>Checksum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum Type</em>'.
	 * @see crownking.edc.ChecksumType
	 * @generated
	 */
	EClass getChecksumType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.ChecksumType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.ChecksumType#getMixed()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.ChecksumType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias List</em>'.
	 * @see crownking.edc.ChecksumType#getAliasList()
	 * @see #getChecksumType()
	 * @generated
	 */
	EReference getChecksumType_AliasList();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.ChecksumType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checksum</em>'.
	 * @see crownking.edc.ChecksumType#getChecksum()
	 * @see #getChecksumType()
	 * @generated
	 */
	EReference getChecksumType_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.ChecksumType#getBeginaddr()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.ChecksumType#getChecksumalgo()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.ChecksumType#getCname()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.ChecksumType#getDesc()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.ChecksumType#getEndaddr()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.ChecksumType#getIslanghidden()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ChecksumType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.ChecksumType#getWhen()
	 * @see #getChecksumType()
	 * @generated
	 */
	EAttribute getChecksumType_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.CodeMemTraitsType <em>Code Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Mem Traits Type</em>'.
	 * @see crownking.edc.CodeMemTraitsType
	 * @generated
	 */
	EClass getCodeMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.CodeMemTraitsType#getValue()
	 * @see #getCodeMemTraitsType()
	 * @generated
	 */
	EAttribute getCodeMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.CodeMemTraitsType#getLocsize()
	 * @see #getCodeMemTraitsType()
	 * @generated
	 */
	EAttribute getCodeMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.CodeMemTraitsType#getWordimpl()
	 * @see #getCodeMemTraitsType()
	 * @generated
	 */
	EAttribute getCodeMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.CodeMemTraitsType#getWordinit()
	 * @see #getCodeMemTraitsType()
	 * @generated
	 */
	EAttribute getCodeMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.CodeMemTraitsType#getWordsafe()
	 * @see #getCodeMemTraitsType()
	 * @generated
	 */
	EAttribute getCodeMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.CodeMemTraitsType#getWordsize()
	 * @see #getCodeMemTraitsType()
	 * @generated
	 */
	EAttribute getCodeMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.CodeSectorType <em>Code Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Sector Type</em>'.
	 * @see crownking.edc.CodeSectorType
	 * @generated
	 */
	EClass getCodeSectorType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.CodeSectorType#getValue()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.CodeSectorType#getBeginaddr()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.CodeSectorType#getEndaddr()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getIssection <em>Issection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issection</em>'.
	 * @see crownking.edc.CodeSectorType#getIssection()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Issection();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.CodeSectorType#getRegionid()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getSectiondesc <em>Sectiondesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectiondesc</em>'.
	 * @see crownking.edc.CodeSectorType#getSectiondesc()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Sectiondesc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.CodeSectorType#getSectionname <em>Sectionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectionname</em>'.
	 * @see crownking.edc.CodeSectorType#getSectionname()
	 * @see #getCodeSectorType()
	 * @generated
	 */
	EAttribute getCodeSectorType_Sectionname();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ConfigFuseMemTraitsType <em>Config Fuse Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Fuse Mem Traits Type</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType
	 * @generated
	 */
	EClass getConfigFuseMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getValue()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getLocsize()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getUnimplval <em>Unimplval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unimplval</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getUnimplval()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Unimplval();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getWordimpl()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getWordinit()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getWordsafe()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.ConfigFuseMemTraitsType#getWordsize()
	 * @see #getConfigFuseMemTraitsType()
	 * @generated
	 */
	EAttribute getConfigFuseMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ConfigFuseSectorType <em>Config Fuse Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Fuse Sector Type</em>'.
	 * @see crownking.edc.ConfigFuseSectorType
	 * @generated
	 */
	EClass getConfigFuseSectorType();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ConfigFuseSectorType#getDCRDef <em>DCR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Def</em>'.
	 * @see crownking.edc.ConfigFuseSectorType#getDCRDef()
	 * @see #getConfigFuseSectorType()
	 * @generated
	 */
	EReference getConfigFuseSectorType_DCRDef();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.ConfigFuseSectorType#getBeginaddr()
	 * @see #getConfigFuseSectorType()
	 * @generated
	 */
	EAttribute getConfigFuseSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.ConfigFuseSectorType#getEndaddr()
	 * @see #getConfigFuseSectorType()
	 * @generated
	 */
	EAttribute getConfigFuseSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ConfigFuseSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.ConfigFuseSectorType#getRegionid()
	 * @see #getConfigFuseSectorType()
	 * @generated
	 */
	EAttribute getConfigFuseSectorType_Regionid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DataMemTraitsType <em>Data Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Mem Traits Type</em>'.
	 * @see crownking.edc.DataMemTraitsType
	 * @generated
	 */
	EClass getDataMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.DataMemTraitsType#getValue()
	 * @see #getDataMemTraitsType()
	 * @generated
	 */
	EAttribute getDataMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.DataMemTraitsType#getLocsize()
	 * @see #getDataMemTraitsType()
	 * @generated
	 */
	EAttribute getDataMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.DataMemTraitsType#getWordimpl()
	 * @see #getDataMemTraitsType()
	 * @generated
	 */
	EAttribute getDataMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.DataMemTraitsType#getWordinit()
	 * @see #getDataMemTraitsType()
	 * @generated
	 */
	EAttribute getDataMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.DataMemTraitsType#getWordsafe()
	 * @see #getDataMemTraitsType()
	 * @generated
	 */
	EAttribute getDataMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.DataMemTraitsType#getWordsize()
	 * @see #getDataMemTraitsType()
	 * @generated
	 */
	EAttribute getDataMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DataSpaceType <em>Data Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Space Type</em>'.
	 * @see crownking.edc.DataSpaceType
	 * @generated
	 */
	EClass getDataSpaceType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.DataSpaceType#getRegardlessOfMode <em>Regardless Of Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regardless Of Mode</em>'.
	 * @see crownking.edc.DataSpaceType#getRegardlessOfMode()
	 * @see #getDataSpaceType()
	 * @generated
	 */
	EReference getDataSpaceType_RegardlessOfMode();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataSpaceType#getTraditionalModeOnly <em>Traditional Mode Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traditional Mode Only</em>'.
	 * @see crownking.edc.DataSpaceType#getTraditionalModeOnly()
	 * @see #getDataSpaceType()
	 * @generated
	 */
	EAttribute getDataSpaceType_TraditionalModeOnly();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataSpaceType#getExtendedModeOnly <em>Extended Mode Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extended Mode Only</em>'.
	 * @see crownking.edc.DataSpaceType#getExtendedModeOnly()
	 * @see #getDataSpaceType()
	 * @generated
	 */
	EAttribute getDataSpaceType_ExtendedModeOnly();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DataSpaceType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.DataSpaceType#getEndaddr()
	 * @see #getDataSpaceType()
	 * @generated
	 */
	EAttribute getDataSpaceType_Endaddr();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DCRDefType <em>DCR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCR Def Type</em>'.
	 * @see crownking.edc.DCRDefType
	 * @generated
	 */
	EClass getDCRDefType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias List</em>'.
	 * @see crownking.edc.DCRDefType#getAliasList()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRDefType#getIllegal <em>Illegal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Illegal</em>'.
	 * @see crownking.edc.DCRDefType#getIllegal()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EReference getDCRDefType_Illegal();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.DCRDefType#getDCRModeList <em>DCR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DCR Mode List</em>'.
	 * @see crownking.edc.DCRDefType#getDCRModeList()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EReference getDCRDefType_DCRModeList();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.DCRDefType#getAccess()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.DCRDefType#getCname()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see crownking.edc.DCRDefType#getDefault()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Default();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.DCRDefType#getDesc()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.DCRDefType#getImpl()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.DCRDefType#getName()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.DCRDefType#getNzwidth()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getUnimplval <em>Unimplval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unimplval</em>'.
	 * @see crownking.edc.DCRDefType#getUnimplval()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Unimplval();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getUnused <em>Unused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unused</em>'.
	 * @see crownking.edc.DCRDefType#getUnused()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Unused();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRDefType#getUseinchecksum <em>Useinchecksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Useinchecksum</em>'.
	 * @see crownking.edc.DCRDefType#getUseinchecksum()
	 * @see #getDCRDefType()
	 * @generated
	 */
	EAttribute getDCRDefType_Useinchecksum();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DCRFieldDefType <em>DCR Field Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCR Field Def Type</em>'.
	 * @see crownking.edc.DCRFieldDefType
	 * @generated
	 */
	EClass getDCRFieldDefType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DCRFieldDefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.DCRFieldDefType#getMixed()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DCRFieldDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.DCRFieldDefType#getGroup()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.DCRFieldDefType#getDCRFieldSemantic()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.DCRFieldDefType#getAliasList()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.DCRFieldDefType#getSFRModeList()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.DCRFieldDefType#getStimInfo()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.DCRFieldDefType#getModuleMacro()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.DCRFieldDefType#getModuleExclude()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.DCRFieldDefType#getSFRDef()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.DCRFieldDefType#getChecksum()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRFieldDefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.DCRFieldDefType#getSFRFieldSemantic()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EReference getDCRFieldDefType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.DCRFieldDefType#getAccess()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.DCRFieldDefType#getBegin()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.DCRFieldDefType#getCname()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.DCRFieldDefType#getDesc()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.DCRFieldDefType#getEnd()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.DCRFieldDefType#getImpl()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.DCRFieldDefType#getIshidden()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.DCRFieldDefType#getIsidehidden()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.DCRFieldDefType#getIsindirect()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.DCRFieldDefType#getIslanghidden()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.DCRFieldDefType#getIslnaghidden()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.DCRFieldDefType#getIsvolatile()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.DCRFieldDefType#getMask()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.DCRFieldDefType#getMclr()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.DCRFieldDefType#getModsrc()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.DCRFieldDefType#getName()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.DCRFieldDefType#getNzsize()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.DCRFieldDefType#getNzwidth()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.DCRFieldDefType#getOffset()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.DCRFieldDefType#getPor()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldDefType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.DCRFieldDefType#getRegionidref()
	 * @see #getDCRFieldDefType()
	 * @generated
	 */
	EAttribute getDCRFieldDefType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DCRFieldSemanticType <em>DCR Field Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCR Field Semantic Type</em>'.
	 * @see crownking.edc.DCRFieldSemanticType
	 * @generated
	 */
	EClass getDCRFieldSemanticType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DCRFieldSemanticType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getMixed()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.DCRFieldSemanticType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias List</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getAliasList()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EReference getDCRFieldSemanticType_AliasList();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.DCRFieldSemanticType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Checksum</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getChecksum()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EReference getDCRFieldSemanticType_Checksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getBeginaddr()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getChecksumalgo <em>Checksumalgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksumalgo</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getChecksumalgo()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Checksumalgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getCname()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getDesc()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getEndaddr()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getIshidden()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getIslanghidden()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getOscmodeidref <em>Oscmodeidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oscmodeidref</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getOscmodeidref()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_Oscmodeidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRFieldSemanticType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.DCRFieldSemanticType#getWhen()
	 * @see #getDCRFieldSemanticType()
	 * @generated
	 */
	EAttribute getDCRFieldSemanticType_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DCRModeListType <em>DCR Mode List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCR Mode List Type</em>'.
	 * @see crownking.edc.DCRModeListType
	 * @generated
	 */
	EClass getDCRModeListType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.DCRModeListType#getDCRMode <em>DCR Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DCR Mode</em>'.
	 * @see crownking.edc.DCRModeListType#getDCRMode()
	 * @see #getDCRModeListType()
	 * @generated
	 */
	EReference getDCRModeListType_DCRMode();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DCRModeType <em>DCR Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DCR Mode Type</em>'.
	 * @see crownking.edc.DCRModeType
	 * @generated
	 */
	EClass getDCRModeType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DCRModeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.DCRModeType#getGroup()
	 * @see #getDCRModeType()
	 * @generated
	 */
	EAttribute getDCRModeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRModeType#getAdjustPoint <em>Adjust Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjust Point</em>'.
	 * @see crownking.edc.DCRModeType#getAdjustPoint()
	 * @see #getDCRModeType()
	 * @generated
	 */
	EReference getDCRModeType_AdjustPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DCRModeType#getDCRFieldDef <em>DCR Field Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Def</em>'.
	 * @see crownking.edc.DCRModeType#getDCRFieldDef()
	 * @see #getDCRModeType()
	 * @generated
	 */
	EReference getDCRModeType_DCRFieldDef();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DCRModeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see crownking.edc.DCRModeType#getId()
	 * @see #getDCRModeType()
	 * @generated
	 */
	EAttribute getDCRModeType_Id();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DeviceIDMemTraitsType <em>Device ID Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device ID Mem Traits Type</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType
	 * @generated
	 */
	EClass getDeviceIDMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType#getValue()
	 * @see #getDeviceIDMemTraitsType()
	 * @generated
	 */
	EAttribute getDeviceIDMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType#getLocsize()
	 * @see #getDeviceIDMemTraitsType()
	 * @generated
	 */
	EAttribute getDeviceIDMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType#getWordimpl()
	 * @see #getDeviceIDMemTraitsType()
	 * @generated
	 */
	EAttribute getDeviceIDMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType#getWordinit()
	 * @see #getDeviceIDMemTraitsType()
	 * @generated
	 */
	EAttribute getDeviceIDMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType#getWordsafe()
	 * @see #getDeviceIDMemTraitsType()
	 * @generated
	 */
	EAttribute getDeviceIDMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.DeviceIDMemTraitsType#getWordsize()
	 * @see #getDeviceIDMemTraitsType()
	 * @generated
	 */
	EAttribute getDeviceIDMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DeviceIDSectorType <em>Device ID Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device ID Sector Type</em>'.
	 * @see crownking.edc.DeviceIDSectorType
	 * @generated
	 */
	EClass getDeviceIDSectorType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DeviceIDSectorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getMixed()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DeviceIDSectorType#getDEVIDToRev <em>DEVID To Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DEVID To Rev</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getDEVIDToRev()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EReference getDeviceIDSectorType_DEVIDToRev();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getBeginaddr()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getEndaddr()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getIssection <em>Issection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issection</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getIssection()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Issection();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getMask()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getRegionid()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getSectiondesc <em>Sectiondesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectiondesc</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getSectiondesc()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Sectiondesc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getSectionname <em>Sectionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectionname</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getSectionname()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Sectionname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DeviceIDSectorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.DeviceIDSectorType#getValue()
	 * @see #getDeviceIDSectorType()
	 * @generated
	 */
	EAttribute getDeviceIDSectorType_Value();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DEVIDToRevType <em>DEVID To Rev Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEVID To Rev Type</em>'.
	 * @see crownking.edc.DEVIDToRevType
	 * @generated
	 */
	EClass getDEVIDToRevType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DEVIDToRevType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.DEVIDToRevType#getValue()
	 * @see #getDEVIDToRevType()
	 * @generated
	 */
	EAttribute getDEVIDToRevType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DEVIDToRevType#getRevlist <em>Revlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revlist</em>'.
	 * @see crownking.edc.DEVIDToRevType#getRevlist()
	 * @see #getDEVIDToRevType()
	 * @generated
	 */
	EAttribute getDEVIDToRevType_Revlist();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DEVIDToRevType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see crownking.edc.DEVIDToRevType#getValue1()
	 * @see #getDEVIDToRevType()
	 * @generated
	 */
	EAttribute getDEVIDToRevType_Value1();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see crownking.edc.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link crownking.edc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see crownking.edc.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link crownking.edc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see crownking.edc.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.DocumentRoot#getPIC <em>PIC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PIC</em>'.
	 * @see crownking.edc.DocumentRoot#getPIC()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PIC();

	/**
	 * Returns the meta object for class '{@link crownking.edc.DPRDataSectorType <em>DPR Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPR Data Sector Type</em>'.
	 * @see crownking.edc.DPRDataSectorType
	 * @generated
	 */
	EClass getDPRDataSectorType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DPRDataSectorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.DPRDataSectorType#getMixed()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.DPRDataSectorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.DPRDataSectorType#getGroup()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DPRDataSectorType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.DPRDataSectorType#getSFRDef()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EReference getDPRDataSectorType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.DPRDataSectorType#getAdjustPoint <em>Adjust Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjust Point</em>'.
	 * @see crownking.edc.DPRDataSectorType#getAdjustPoint()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EReference getDPRDataSectorType_AdjustPoint();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank</em>'.
	 * @see crownking.edc.DPRDataSectorType#getBank()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Bank();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.DPRDataSectorType#getBeginaddr()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.DPRDataSectorType#getEndaddr()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.DPRDataSectorType#getRegionid()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getShadowidref <em>Shadowidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowidref</em>'.
	 * @see crownking.edc.DPRDataSectorType#getShadowidref()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Shadowidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getShadowoffset <em>Shadowoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowoffset</em>'.
	 * @see crownking.edc.DPRDataSectorType#getShadowoffset()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Shadowoffset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.DPRDataSectorType#getShadowoffset1 <em>Shadowoffset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowoffset1</em>'.
	 * @see crownking.edc.DPRDataSectorType#getShadowoffset1()
	 * @see #getDPRDataSectorType()
	 * @generated
	 */
	EAttribute getDPRDataSectorType_Shadowoffset1();

	/**
	 * Returns the meta object for class '{@link crownking.edc.EEDataMemTraitsType <em>EE Data Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EE Data Mem Traits Type</em>'.
	 * @see crownking.edc.EEDataMemTraitsType
	 * @generated
	 */
	EClass getEEDataMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.EEDataMemTraitsType#getValue()
	 * @see #getEEDataMemTraitsType()
	 * @generated
	 */
	EAttribute getEEDataMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataMemTraitsType#getMagicoffset <em>Magicoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magicoffset</em>'.
	 * @see crownking.edc.EEDataMemTraitsType#getMagicoffset()
	 * @see #getEEDataMemTraitsType()
	 * @generated
	 */
	EAttribute getEEDataMemTraitsType_Magicoffset();

	/**
	 * Returns the meta object for class '{@link crownking.edc.EEDataSectorType <em>EE Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EE Data Sector Type</em>'.
	 * @see crownking.edc.EEDataSectorType
	 * @generated
	 */
	EClass getEEDataSectorType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.EEDataSectorType#getValue()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.EEDataSectorType#getBeginaddr()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.EEDataSectorType#getEndaddr()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getIssection <em>Issection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issection</em>'.
	 * @see crownking.edc.EEDataSectorType#getIssection()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Issection();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.EEDataSectorType#getRegionid()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getSectiondesc <em>Sectiondesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectiondesc</em>'.
	 * @see crownking.edc.EEDataSectorType#getSectiondesc()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Sectiondesc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EEDataSectorType#getSectionname <em>Sectionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectionname</em>'.
	 * @see crownking.edc.EEDataSectorType#getSectionname()
	 * @see #getEEDataSectorType()
	 * @generated
	 */
	EAttribute getEEDataSectorType_Sectionname();

	/**
	 * Returns the meta object for class '{@link crownking.edc.EmulatorZoneType <em>Emulator Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emulator Zone Type</em>'.
	 * @see crownking.edc.EmulatorZoneType
	 * @generated
	 */
	EClass getEmulatorZoneType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.EmulatorZoneType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.EmulatorZoneType#getMixed()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.EmulatorZoneType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.EmulatorZoneType#getGroup()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.EmulatorZoneType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.EmulatorZoneType#getSFRDef()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EReference getEmulatorZoneType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.EmulatorZoneType#getAdjustPoint <em>Adjust Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjust Point</em>'.
	 * @see crownking.edc.EmulatorZoneType#getAdjustPoint()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EReference getEmulatorZoneType_AdjustPoint();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank</em>'.
	 * @see crownking.edc.EmulatorZoneType#getBank()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Bank();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.EmulatorZoneType#getBeginaddr()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.EmulatorZoneType#getEndaddr()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.EmulatorZoneType#getRegionid()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getShadowidref <em>Shadowidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowidref</em>'.
	 * @see crownking.edc.EmulatorZoneType#getShadowidref()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Shadowidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getShadowoffset <em>Shadowoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowoffset</em>'.
	 * @see crownking.edc.EmulatorZoneType#getShadowoffset()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Shadowoffset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.EmulatorZoneType#getShadowoffset1 <em>Shadowoffset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowoffset1</em>'.
	 * @see crownking.edc.EmulatorZoneType#getShadowoffset1()
	 * @see #getEmulatorZoneType()
	 * @generated
	 */
	EAttribute getEmulatorZoneType_Shadowoffset1();

	/**
	 * Returns the meta object for class '{@link crownking.edc.GPRDataSectorType <em>GPR Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GPR Data Sector Type</em>'.
	 * @see crownking.edc.GPRDataSectorType
	 * @generated
	 */
	EClass getGPRDataSectorType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.GPRDataSectorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.GPRDataSectorType#getMixed()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.GPRDataSectorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.GPRDataSectorType#getGroup()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.GPRDataSectorType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.GPRDataSectorType#getSFRDef()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EReference getGPRDataSectorType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.GPRDataSectorType#getAdjustPoint <em>Adjust Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjust Point</em>'.
	 * @see crownking.edc.GPRDataSectorType#getAdjustPoint()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EReference getGPRDataSectorType_AdjustPoint();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank</em>'.
	 * @see crownking.edc.GPRDataSectorType#getBank()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Bank();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.GPRDataSectorType#getBeginaddr()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.GPRDataSectorType#getEndaddr()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.GPRDataSectorType#getRegionid()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getShadowidref <em>Shadowidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowidref</em>'.
	 * @see crownking.edc.GPRDataSectorType#getShadowidref()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Shadowidref();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getShadowoffset <em>Shadowoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowoffset</em>'.
	 * @see crownking.edc.GPRDataSectorType#getShadowoffset()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Shadowoffset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.GPRDataSectorType#getShadowoffset1 <em>Shadowoffset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadowoffset1</em>'.
	 * @see crownking.edc.GPRDataSectorType#getShadowoffset1()
	 * @see #getGPRDataSectorType()
	 * @generated
	 */
	EAttribute getGPRDataSectorType_Shadowoffset1();

	/**
	 * Returns the meta object for class '{@link crownking.edc.IllegalType <em>Illegal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Illegal Type</em>'.
	 * @see crownking.edc.IllegalType
	 * @generated
	 */
	EClass getIllegalType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.IllegalType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.IllegalType#getValue()
	 * @see #getIllegalType()
	 * @generated
	 */
	EAttribute getIllegalType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.IllegalType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.IllegalType#getDesc()
	 * @see #getIllegalType()
	 * @generated
	 */
	EAttribute getIllegalType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.IllegalType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.IllegalType#getWhen()
	 * @see #getIllegalType()
	 * @generated
	 */
	EAttribute getIllegalType_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Type</em>'.
	 * @see crownking.edc.ImportType
	 * @generated
	 */
	EClass getImportType();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ImportType#getModuleImport <em>Module Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Import</em>'.
	 * @see crownking.edc.ImportType#getModuleImport()
	 * @see #getImportType()
	 * @generated
	 */
	EReference getImportType_ModuleImport();

	/**
	 * Returns the meta object for class '{@link crownking.edc.JoinedSFRDefType <em>Joined SFR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joined SFR Def Type</em>'.
	 * @see crownking.edc.JoinedSFRDefType
	 * @generated
	 */
	EClass getJoinedSFRDefType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.JoinedSFRDefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getMixed()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.JoinedSFRDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getGroup()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getDCRFieldSemantic()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getAliasList()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getSFRModeList()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getStimInfo()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getSFRDef()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getModuleMacro()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getModuleExclude()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getChecksum()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.JoinedSFRDefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getSFRFieldSemantic()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EReference getJoinedSFRDefType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getAccess()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getBegin()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getCname()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getDesc()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getEnd()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getImpl()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getIshidden()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getIsidehidden()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getIsindirect()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getIslanghidden()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getIslnaghidden()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getIsvolatile()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getMask()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getMclr()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getModsrc()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getName()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getNzsize()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getNzwidth()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getOffset()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getPor()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.JoinedSFRDefType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.JoinedSFRDefType#getRegionidref()
	 * @see #getJoinedSFRDefType()
	 * @generated
	 */
	EAttribute getJoinedSFRDefType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.LatchesType <em>Latches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latches Type</em>'.
	 * @see crownking.edc.LatchesType
	 * @generated
	 */
	EClass getLatchesType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LatchesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.LatchesType#getValue()
	 * @see #getLatchesType()
	 * @generated
	 */
	EAttribute getLatchesType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LatchesType#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfg</em>'.
	 * @see crownking.edc.LatchesType#getCfg()
	 * @see #getLatchesType()
	 * @generated
	 */
	EAttribute getLatchesType_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LatchesType#getEedata <em>Eedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eedata</em>'.
	 * @see crownking.edc.LatchesType#getEedata()
	 * @see #getLatchesType()
	 * @generated
	 */
	EAttribute getLatchesType_Eedata();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LatchesType#getPgm <em>Pgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgm</em>'.
	 * @see crownking.edc.LatchesType#getPgm()
	 * @see #getLatchesType()
	 * @generated
	 */
	EAttribute getLatchesType_Pgm();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LatchesType#getRowerase <em>Rowerase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowerase</em>'.
	 * @see crownking.edc.LatchesType#getRowerase()
	 * @see #getLatchesType()
	 * @generated
	 */
	EAttribute getLatchesType_Rowerase();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LatchesType#getUserid <em>Userid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userid</em>'.
	 * @see crownking.edc.LatchesType#getUserid()
	 * @see #getLatchesType()
	 * @generated
	 */
	EAttribute getLatchesType_Userid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.LCDType <em>LCD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LCD Type</em>'.
	 * @see crownking.edc.LCDType
	 * @generated
	 */
	EClass getLCDType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LCDType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.LCDType#getValue()
	 * @see #getLCDType()
	 * @generated
	 */
	EAttribute getLCDType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LCDType#getSegcount <em>Segcount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segcount</em>'.
	 * @see crownking.edc.LCDType#getSegcount()
	 * @see #getLCDType()
	 * @generated
	 */
	EAttribute getLCDType_Segcount();

	/**
	 * Returns the meta object for class '{@link crownking.edc.LegacyAliasType <em>Legacy Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legacy Alias Type</em>'.
	 * @see crownking.edc.LegacyAliasType
	 * @generated
	 */
	EClass getLegacyAliasType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LegacyAliasType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.LegacyAliasType#getValue()
	 * @see #getLegacyAliasType()
	 * @generated
	 */
	EAttribute getLegacyAliasType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.LegacyAliasType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.LegacyAliasType#getCname()
	 * @see #getLegacyAliasType()
	 * @generated
	 */
	EAttribute getLegacyAliasType_Cname();

	/**
	 * Returns the meta object for class '{@link crownking.edc.MemTraitsType <em>Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mem Traits Type</em>'.
	 * @see crownking.edc.MemTraitsType
	 * @generated
	 */
	EClass getMemTraitsType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getCodeMemTraits <em>Code Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getCodeMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_CodeMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getCalDataMemTraits <em>Cal Data Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cal Data Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getCalDataMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_CalDataMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getBackgroundDebugMemTraits <em>Background Debug Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Debug Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getBackgroundDebugMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_BackgroundDebugMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getTestMemTraits <em>Test Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getTestMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_TestMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getUserIDMemTraits <em>User ID Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User ID Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getUserIDMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_UserIDMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getConfigFuseMemTraits <em>Config Fuse Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Fuse Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getConfigFuseMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_ConfigFuseMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getDeviceIDMemTraits <em>Device ID Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device ID Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getDeviceIDMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_DeviceIDMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getEEDataMemTraits <em>EE Data Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EE Data Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getEEDataMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_EEDataMemTraits();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.MemTraitsType#getDataMemTraits <em>Data Mem Traits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Mem Traits</em>'.
	 * @see crownking.edc.MemTraitsType#getDataMemTraits()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EReference getMemTraitsType_DataMemTraits();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MemTraitsType#getBankcount <em>Bankcount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bankcount</em>'.
	 * @see crownking.edc.MemTraitsType#getBankcount()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EAttribute getMemTraitsType_Bankcount();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MemTraitsType#getHwstackdepth <em>Hwstackdepth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hwstackdepth</em>'.
	 * @see crownking.edc.MemTraitsType#getHwstackdepth()
	 * @see #getMemTraitsType()
	 * @generated
	 */
	EAttribute getMemTraitsType_Hwstackdepth();

	/**
	 * Returns the meta object for class '{@link crownking.edc.MigrationAliasType <em>Migration Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Alias Type</em>'.
	 * @see crownking.edc.MigrationAliasType
	 * @generated
	 */
	EClass getMigrationAliasType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MigrationAliasType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.MigrationAliasType#getValue()
	 * @see #getMigrationAliasType()
	 * @generated
	 */
	EAttribute getMigrationAliasType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MigrationAliasType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.MigrationAliasType#getCname()
	 * @see #getMigrationAliasType()
	 * @generated
	 */
	EAttribute getMigrationAliasType_Cname();

	/**
	 * Returns the meta object for class '{@link crownking.edc.MirrorType <em>Mirror Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mirror Type</em>'.
	 * @see crownking.edc.MirrorType
	 * @generated
	 */
	EClass getMirrorType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.MirrorType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.MirrorType#getMixed()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.MirrorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.MirrorType#getGroup()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.MirrorType#getDCRFieldSemantic()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.MirrorType#getAliasList()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.MirrorType#getSFRModeList()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.MirrorType#getStimInfo()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.MirrorType#getModuleMacro()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.MirrorType#getModuleExclude()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.MirrorType#getSFRDef()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.MirrorType#getChecksum()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MirrorType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.MirrorType#getSFRFieldSemantic()
	 * @see #getMirrorType()
	 * @generated
	 */
	EReference getMirrorType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.MirrorType#getAccess()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.MirrorType#getBegin()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.MirrorType#getCname()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.MirrorType#getDesc()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.MirrorType#getEnd()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.MirrorType#getImpl()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.MirrorType#getIshidden()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.MirrorType#getIsidehidden()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.MirrorType#getIsindirect()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.MirrorType#getIslanghidden()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.MirrorType#getIslnaghidden()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.MirrorType#getIsvolatile()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.MirrorType#getMask()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.MirrorType#getMclr()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.MirrorType#getModsrc()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.MirrorType#getName()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.MirrorType#getNzsize()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.MirrorType#getNzwidth()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.MirrorType#getOffset()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.MirrorType#getPor()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MirrorType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.MirrorType#getRegionidref()
	 * @see #getMirrorType()
	 * @generated
	 */
	EAttribute getMirrorType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ModuleExcludeType <em>Module Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Exclude Type</em>'.
	 * @see crownking.edc.ModuleExcludeType
	 * @generated
	 */
	EClass getModuleExcludeType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleExcludeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.ModuleExcludeType#getValue()
	 * @see #getModuleExcludeType()
	 * @generated
	 */
	EAttribute getModuleExcludeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleExcludeType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.ModuleExcludeType#getImpl()
	 * @see #getModuleExcludeType()
	 * @generated
	 */
	EAttribute getModuleExcludeType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleExcludeType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.ModuleExcludeType#getOffset()
	 * @see #getModuleExcludeType()
	 * @generated
	 */
	EAttribute getModuleExcludeType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleExcludeType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see crownking.edc.ModuleExcludeType#getReplace()
	 * @see #getModuleExcludeType()
	 * @generated
	 */
	EAttribute getModuleExcludeType_Replace();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleExcludeType#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see crownking.edc.ModuleExcludeType#getWith()
	 * @see #getModuleExcludeType()
	 * @generated
	 */
	EAttribute getModuleExcludeType_With();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ModuleImportType <em>Module Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Import Type</em>'.
	 * @see crownking.edc.ModuleImportType
	 * @generated
	 */
	EClass getModuleImportType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleImportType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.ModuleImportType#getValue()
	 * @see #getModuleImportType()
	 * @generated
	 */
	EAttribute getModuleImportType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleImportType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.ModuleImportType#getModsrc()
	 * @see #getModuleImportType()
	 * @generated
	 */
	EAttribute getModuleImportType_Modsrc();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ModuleMacroType <em>Module Macro Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Macro Type</em>'.
	 * @see crownking.edc.ModuleMacroType
	 * @generated
	 */
	EClass getModuleMacroType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleMacroType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.ModuleMacroType#getValue()
	 * @see #getModuleMacroType()
	 * @generated
	 */
	EAttribute getModuleMacroType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleMacroType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.ModuleMacroType#getImpl()
	 * @see #getModuleMacroType()
	 * @generated
	 */
	EAttribute getModuleMacroType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleMacroType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.ModuleMacroType#getOffset()
	 * @see #getModuleMacroType()
	 * @generated
	 */
	EAttribute getModuleMacroType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleMacroType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see crownking.edc.ModuleMacroType#getReplace()
	 * @see #getModuleMacroType()
	 * @generated
	 */
	EAttribute getModuleMacroType_Replace();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleMacroType#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With</em>'.
	 * @see crownking.edc.ModuleMacroType#getWith()
	 * @see #getModuleMacroType()
	 * @generated
	 */
	EAttribute getModuleMacroType_With();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ModuleRefType <em>Module Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Ref Type</em>'.
	 * @see crownking.edc.ModuleRefType
	 * @generated
	 */
	EClass getModuleRefType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.ModuleRefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.ModuleRefType#getMixed()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.ModuleRefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.ModuleRefType#getGroup()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.ModuleRefType#getModuleMacro()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.ModuleRefType#getModuleExclude()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.ModuleRefType#getDCRFieldSemantic()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.ModuleRefType#getAliasList()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.ModuleRefType#getSFRModeList()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.ModuleRefType#getStimInfo()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.ModuleRefType#getSFRDef()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.ModuleRefType#getChecksum()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ModuleRefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.ModuleRefType#getSFRFieldSemantic()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EReference getModuleRefType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.ModuleRefType#getAccess()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.ModuleRefType#getBegin()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.ModuleRefType#getCname()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.ModuleRefType#getDesc()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.ModuleRefType#getEnd()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.ModuleRefType#getImpl()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.ModuleRefType#getIshidden()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.ModuleRefType#getIsidehidden()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.ModuleRefType#getIsindirect()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.ModuleRefType#getIslanghidden()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.ModuleRefType#getIslnaghidden()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.ModuleRefType#getIsvolatile()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.ModuleRefType#getMask()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.ModuleRefType#getMclr()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.ModuleRefType#getModsrc()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.ModuleRefType#getName()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.ModuleRefType#getNzsize()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.ModuleRefType#getNzwidth()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.ModuleRefType#getOffset()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.ModuleRefType#getPor()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ModuleRefType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.ModuleRefType#getRegionidref()
	 * @see #getModuleRefType()
	 * @generated
	 */
	EAttribute getModuleRefType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.MuxedSFRDefType <em>Muxed SFR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muxed SFR Def Type</em>'.
	 * @see crownking.edc.MuxedSFRDefType
	 * @generated
	 */
	EClass getMuxedSFRDefType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.MuxedSFRDefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getMixed()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.MuxedSFRDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getGroup()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getSelectSFR <em>Select SFR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Select SFR</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getSelectSFR()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_SelectSFR();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getDCRFieldSemantic()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getAliasList()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getSFRModeList()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getStimInfo()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getModuleMacro()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getModuleExclude()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getSFRDef()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getChecksum()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.MuxedSFRDefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getSFRFieldSemantic()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EReference getMuxedSFRDefType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getAccess()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getBegin()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getCname()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getDesc()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getEnd()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getImpl()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getIshidden()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getIsidehidden()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getIsindirect()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getIslanghidden()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getIslnaghidden()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getIsvolatile()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getMask()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getMclr()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getModsrc()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getName()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getNzsize()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getNzwidth()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getOffset()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getPor()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.MuxedSFRDefType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.MuxedSFRDefType#getRegionidref()
	 * @see #getMuxedSFRDefType()
	 * @generated
	 */
	EAttribute getMuxedSFRDefType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.NMMRPlaceType <em>NMMR Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NMMR Place Type</em>'.
	 * @see crownking.edc.NMMRPlaceType
	 * @generated
	 */
	EClass getNMMRPlaceType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.NMMRPlaceType#getModuleRef <em>Module Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module Ref</em>'.
	 * @see crownking.edc.NMMRPlaceType#getModuleRef()
	 * @see #getNMMRPlaceType()
	 * @generated
	 */
	EReference getNMMRPlaceType_ModuleRef();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.NMMRPlaceType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.NMMRPlaceType#getRegionid()
	 * @see #getNMMRPlaceType()
	 * @generated
	 */
	EAttribute getNMMRPlaceType_Regionid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.OscillatorModeType <em>Oscillator Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oscillator Mode Type</em>'.
	 * @see crownking.edc.OscillatorModeType
	 * @generated
	 */
	EClass getOscillatorModeType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.OscillatorModeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.OscillatorModeType#getValue()
	 * @see #getOscillatorModeType()
	 * @generated
	 */
	EAttribute getOscillatorModeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.OscillatorModeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see crownking.edc.OscillatorModeType#getId()
	 * @see #getOscillatorModeType()
	 * @generated
	 */
	EAttribute getOscillatorModeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.OscillatorModeType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see crownking.edc.OscillatorModeType#getMax()
	 * @see #getOscillatorModeType()
	 * @generated
	 */
	EAttribute getOscillatorModeType_Max();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.OscillatorModeType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see crownking.edc.OscillatorModeType#getMin()
	 * @see #getOscillatorModeType()
	 * @generated
	 */
	EAttribute getOscillatorModeType_Min();

	/**
	 * Returns the meta object for class '{@link crownking.edc.OscillatorType <em>Oscillator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Oscillator Type</em>'.
	 * @see crownking.edc.OscillatorType
	 * @generated
	 */
	EClass getOscillatorType();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.OscillatorType#getOscillatorMode <em>Oscillator Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oscillator Mode</em>'.
	 * @see crownking.edc.OscillatorType#getOscillatorMode()
	 * @see #getOscillatorType()
	 * @generated
	 */
	EReference getOscillatorType_OscillatorMode();

	/**
	 * Returns the meta object for class '{@link crownking.edc.PICType <em>PIC Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIC Type</em>'.
	 * @see crownking.edc.PICType
	 * @generated
	 */
	EClass getPICType();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.PICType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see crownking.edc.PICType#getImport()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_Import();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power</em>'.
	 * @see crownking.edc.PICType#getPower()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_Power();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getProgramming <em>Programming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programming</em>'.
	 * @see crownking.edc.PICType#getProgramming()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_Programming();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getArchDef <em>Arch Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arch Def</em>'.
	 * @see crownking.edc.PICType#getArchDef()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_ArchDef();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getOscillator <em>Oscillator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oscillator</em>'.
	 * @see crownking.edc.PICType#getOscillator()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_Oscillator();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getWatchdogTimer <em>Watchdog Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Watchdog Timer</em>'.
	 * @see crownking.edc.PICType#getWatchdogTimer()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_WatchdogTimer();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getBreakpoints <em>Breakpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Breakpoints</em>'.
	 * @see crownking.edc.PICType#getBreakpoints()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_Breakpoints();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getLCD <em>LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LCD</em>'.
	 * @see crownking.edc.PICType#getLCD()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_LCD();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getProgramSpace <em>Program Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Space</em>'.
	 * @see crownking.edc.PICType#getProgramSpace()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_ProgramSpace();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getDataSpace <em>Data Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Space</em>'.
	 * @see crownking.edc.PICType#getDataSpace()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_DataSpace();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PICType#getPinList <em>Pin List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pin List</em>'.
	 * @see crownking.edc.PICType#getPinList()
	 * @see #getPICType()
	 * @generated
	 */
	EReference getPICType_PinList();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see crownking.edc.PICType#getArch()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Arch();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.PICType#getDesc()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getDsid <em>Dsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dsid</em>'.
	 * @see crownking.edc.PICType#getDsid()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Dsid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getHasfreeze <em>Hasfreeze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hasfreeze</em>'.
	 * @see crownking.edc.PICType#getHasfreeze()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Hasfreeze();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getInformedby <em>Informedby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Informedby</em>'.
	 * @see crownking.edc.PICType#getInformedby()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Informedby();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getIsextended <em>Isextended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isextended</em>'.
	 * @see crownking.edc.PICType#getIsextended()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Isextended();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.PICType#getName()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.PICType#getProcid <em>Procid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Procid</em>'.
	 * @see crownking.edc.PICType#getProcid()
	 * @see #getPICType()
	 * @generated
	 */
	EAttribute getPICType_Procid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.PinListType <em>Pin List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin List Type</em>'.
	 * @see crownking.edc.PinListType
	 * @generated
	 */
	EClass getPinListType();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.PinListType#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin</em>'.
	 * @see crownking.edc.PinListType#getPin()
	 * @see #getPinListType()
	 * @generated
	 */
	EReference getPinListType_Pin();

	/**
	 * Returns the meta object for class '{@link crownking.edc.PinType <em>Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin Type</em>'.
	 * @see crownking.edc.PinType
	 * @generated
	 */
	EClass getPinType();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.PinType#getVirtualPin <em>Virtual Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Pin</em>'.
	 * @see crownking.edc.PinType#getVirtualPin()
	 * @see #getPinType()
	 * @generated
	 */
	EReference getPinType_VirtualPin();

	/**
	 * Returns the meta object for class '{@link crownking.edc.PowerType <em>Power Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Type</em>'.
	 * @see crownking.edc.PowerType
	 * @generated
	 */
	EClass getPowerType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PowerType#getVPP <em>VPP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VPP</em>'.
	 * @see crownking.edc.PowerType#getVPP()
	 * @see #getPowerType()
	 * @generated
	 */
	EReference getPowerType_VPP();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.PowerType#getVDD <em>VDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VDD</em>'.
	 * @see crownking.edc.PowerType#getVDD()
	 * @see #getPowerType()
	 * @generated
	 */
	EReference getPowerType_VDD();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ProgrammingType <em>Programming Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programming Type</em>'.
	 * @see crownking.edc.ProgrammingType
	 * @generated
	 */
	EClass getProgrammingType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.ProgrammingType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.ProgrammingType#getMixed()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.ProgrammingType#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wait</em>'.
	 * @see crownking.edc.ProgrammingType#getWait()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EReference getProgrammingType_Wait();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.ProgrammingType#getLatches <em>Latches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latches</em>'.
	 * @see crownking.edc.ProgrammingType#getLatches()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EReference getProgrammingType_Latches();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getBoundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary</em>'.
	 * @see crownking.edc.ProgrammingType#getBoundary()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Boundary();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getCsumadd <em>Csumadd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Csumadd</em>'.
	 * @see crownking.edc.ProgrammingType#getCsumadd()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Csumadd();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getErasealgo <em>Erasealgo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erasealgo</em>'.
	 * @see crownking.edc.ProgrammingType#getErasealgo()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Erasealgo();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getHaschecksum <em>Haschecksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Haschecksum</em>'.
	 * @see crownking.edc.ProgrammingType#getHaschecksum()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Haschecksum();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getHasrowerasecmd <em>Hasrowerasecmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hasrowerasecmd</em>'.
	 * @see crownking.edc.ProgrammingType#getHasrowerasecmd()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Hasrowerasecmd();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getHasvppfirst <em>Hasvppfirst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hasvppfirst</em>'.
	 * @see crownking.edc.ProgrammingType#getHasvppfirst()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Hasvppfirst();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getLvpthresh <em>Lvpthresh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvpthresh</em>'.
	 * @see crownking.edc.ProgrammingType#getLvpthresh()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Lvpthresh();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getMemtech <em>Memtech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memtech</em>'.
	 * @see crownking.edc.ProgrammingType#getMemtech()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Memtech();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getOvrpgm <em>Ovrpgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ovrpgm</em>'.
	 * @see crownking.edc.ProgrammingType#getOvrpgm()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Ovrpgm();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.ProgrammingType#getTries <em>Tries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tries</em>'.
	 * @see crownking.edc.ProgrammingType#getTries()
	 * @see #getProgrammingType()
	 * @generated
	 */
	EAttribute getProgrammingType_Tries();

	/**
	 * Returns the meta object for class '{@link crownking.edc.ProgramSpaceType <em>Program Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Space Type</em>'.
	 * @see crownking.edc.ProgramSpaceType
	 * @generated
	 */
	EClass getProgramSpaceType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.ProgramSpaceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.ProgramSpaceType#getGroup()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EAttribute getProgramSpaceType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getCodeSector <em>Code Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Sector</em>'.
	 * @see crownking.edc.ProgramSpaceType#getCodeSector()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_CodeSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getUserIDSector <em>User ID Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User ID Sector</em>'.
	 * @see crownking.edc.ProgramSpaceType#getUserIDSector()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_UserIDSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getTestZone <em>Test Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Zone</em>'.
	 * @see crownking.edc.ProgramSpaceType#getTestZone()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_TestZone();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getDeviceIDSector <em>Device ID Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device ID Sector</em>'.
	 * @see crownking.edc.ProgramSpaceType#getDeviceIDSector()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_DeviceIDSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getConfigFuseSector <em>Config Fuse Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Fuse Sector</em>'.
	 * @see crownking.edc.ProgramSpaceType#getConfigFuseSector()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_ConfigFuseSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getBACKBUGVectorSector <em>BACKBUG Vector Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BACKBUG Vector Sector</em>'.
	 * @see crownking.edc.ProgramSpaceType#getBACKBUGVectorSector()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_BACKBUGVectorSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getCalDataZone <em>Cal Data Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cal Data Zone</em>'.
	 * @see crownking.edc.ProgramSpaceType#getCalDataZone()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_CalDataZone();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.ProgramSpaceType#getEEDataSector <em>EE Data Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EE Data Sector</em>'.
	 * @see crownking.edc.ProgramSpaceType#getEEDataSector()
	 * @see #getProgramSpaceType()
	 * @generated
	 */
	EReference getProgramSpaceType_EEDataSector();

	/**
	 * Returns the meta object for class '{@link crownking.edc.RegardlessOfModeType <em>Regardless Of Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regardless Of Mode Type</em>'.
	 * @see crownking.edc.RegardlessOfModeType
	 * @generated
	 */
	EClass getRegardlessOfModeType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.RegardlessOfModeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.RegardlessOfModeType#getGroup()
	 * @see #getRegardlessOfModeType()
	 * @generated
	 */
	EAttribute getRegardlessOfModeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.RegardlessOfModeType#getNMMRPlace <em>NMMR Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>NMMR Place</em>'.
	 * @see crownking.edc.RegardlessOfModeType#getNMMRPlace()
	 * @see #getRegardlessOfModeType()
	 * @generated
	 */
	EReference getRegardlessOfModeType_NMMRPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.RegardlessOfModeType#getSFRDataSector <em>SFR Data Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Data Sector</em>'.
	 * @see crownking.edc.RegardlessOfModeType#getSFRDataSector()
	 * @see #getRegardlessOfModeType()
	 * @generated
	 */
	EReference getRegardlessOfModeType_SFRDataSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.RegardlessOfModeType#getDPRDataSector <em>DPR Data Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DPR Data Sector</em>'.
	 * @see crownking.edc.RegardlessOfModeType#getDPRDataSector()
	 * @see #getRegardlessOfModeType()
	 * @generated
	 */
	EReference getRegardlessOfModeType_DPRDataSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.RegardlessOfModeType#getGPRDataSector <em>GPR Data Sector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GPR Data Sector</em>'.
	 * @see crownking.edc.RegardlessOfModeType#getGPRDataSector()
	 * @see #getRegardlessOfModeType()
	 * @generated
	 */
	EReference getRegardlessOfModeType_GPRDataSector();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.RegardlessOfModeType#getEmulatorZone <em>Emulator Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emulator Zone</em>'.
	 * @see crownking.edc.RegardlessOfModeType#getEmulatorZone()
	 * @see #getRegardlessOfModeType()
	 * @generated
	 */
	EReference getRegardlessOfModeType_EmulatorZone();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SelectSFRType <em>Select SFR Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select SFR Type</em>'.
	 * @see crownking.edc.SelectSFRType
	 * @generated
	 */
	EClass getSelectSFRType();

	/**
	 * Returns the meta object for the containment reference '{@link crownking.edc.SelectSFRType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SFR Def</em>'.
	 * @see crownking.edc.SelectSFRType#getSFRDef()
	 * @see #getSelectSFRType()
	 * @generated
	 */
	EReference getSelectSFRType_SFRDef();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SFRDataSectorType <em>SFR Data Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR Data Sector Type</em>'.
	 * @see crownking.edc.SFRDataSectorType
	 * @generated
	 */
	EClass getSFRDataSectorType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRDataSectorType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.SFRDataSectorType#getGroup()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EAttribute getSFRDataSectorType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDataSectorType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.SFRDataSectorType#getSFRDef()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EReference getSFRDataSectorType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDataSectorType#getJoinedSFRDef <em>Joined SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joined SFR Def</em>'.
	 * @see crownking.edc.SFRDataSectorType#getJoinedSFRDef()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EReference getSFRDataSectorType_JoinedSFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDataSectorType#getAdjustPoint <em>Adjust Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjust Point</em>'.
	 * @see crownking.edc.SFRDataSectorType#getAdjustPoint()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EReference getSFRDataSectorType_AdjustPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDataSectorType#getMirror <em>Mirror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mirror</em>'.
	 * @see crownking.edc.SFRDataSectorType#getMirror()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EReference getSFRDataSectorType_Mirror();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDataSectorType#getModuleRef <em>Module Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Ref</em>'.
	 * @see crownking.edc.SFRDataSectorType#getModuleRef()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EReference getSFRDataSectorType_ModuleRef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDataSectorType#getMuxedSFRDef <em>Muxed SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Muxed SFR Def</em>'.
	 * @see crownking.edc.SFRDataSectorType#getMuxedSFRDef()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EReference getSFRDataSectorType_MuxedSFRDef();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDataSectorType#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank</em>'.
	 * @see crownking.edc.SFRDataSectorType#getBank()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EAttribute getSFRDataSectorType_Bank();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDataSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.SFRDataSectorType#getBeginaddr()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EAttribute getSFRDataSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDataSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.SFRDataSectorType#getEndaddr()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EAttribute getSFRDataSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDataSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.SFRDataSectorType#getRegionid()
	 * @see #getSFRDataSectorType()
	 * @generated
	 */
	EAttribute getSFRDataSectorType_Regionid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SFRDefType <em>SFR Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR Def Type</em>'.
	 * @see crownking.edc.SFRDefType
	 * @generated
	 */
	EClass getSFRDefType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRDefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.SFRDefType#getMixed()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.SFRDefType#getGroup()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.SFRDefType#getDCRFieldSemantic()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.SFRDefType#getAliasList()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.SFRDefType#getSFRModeList()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.SFRDefType#getStimInfo()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.SFRDefType#getModuleMacro()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.SFRDefType#getModuleExclude()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.SFRDefType#getSFRDef()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.SFRDefType#getChecksum()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRDefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.SFRDefType#getSFRFieldSemantic()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EReference getSFRDefType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.SFRDefType#getAccess()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.SFRDefType#getBegin()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.SFRDefType#getCname()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.SFRDefType#getDesc()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.SFRDefType#getEnd()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.SFRDefType#getImpl()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.SFRDefType#getIshidden()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.SFRDefType#getIsidehidden()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.SFRDefType#getIsindirect()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.SFRDefType#getIslanghidden()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.SFRDefType#getIslnaghidden()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.SFRDefType#getIsvolatile()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.SFRDefType#getMask()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.SFRDefType#getMclr()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.SFRDefType#getModsrc()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.SFRDefType#getName()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.SFRDefType#getNzsize()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.SFRDefType#getNzwidth()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.SFRDefType#getOffset()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.SFRDefType#getPor()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRDefType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.SFRDefType#getRegionidref()
	 * @see #getSFRDefType()
	 * @generated
	 */
	EAttribute getSFRDefType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SFRFieldDefType <em>SFR Field Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR Field Def Type</em>'.
	 * @see crownking.edc.SFRFieldDefType
	 * @generated
	 */
	EClass getSFRFieldDefType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRFieldDefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.SFRFieldDefType#getMixed()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRFieldDefType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.SFRFieldDefType#getGroup()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DCR Field Semantic</em>'.
	 * @see crownking.edc.SFRFieldDefType#getDCRFieldSemantic()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_DCRFieldSemantic();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getAliasList <em>Alias List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias List</em>'.
	 * @see crownking.edc.SFRFieldDefType#getAliasList()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_AliasList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getSFRModeList <em>SFR Mode List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode List</em>'.
	 * @see crownking.edc.SFRFieldDefType#getSFRModeList()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_SFRModeList();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getStimInfo <em>Stim Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stim Info</em>'.
	 * @see crownking.edc.SFRFieldDefType#getStimInfo()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_StimInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getModuleMacro <em>Module Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Macro</em>'.
	 * @see crownking.edc.SFRFieldDefType#getModuleMacro()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_ModuleMacro();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getModuleExclude <em>Module Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module Exclude</em>'.
	 * @see crownking.edc.SFRFieldDefType#getModuleExclude()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_ModuleExclude();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getSFRDef <em>SFR Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Def</em>'.
	 * @see crownking.edc.SFRFieldDefType#getSFRDef()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_SFRDef();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checksum</em>'.
	 * @see crownking.edc.SFRFieldDefType#getChecksum()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_Checksum();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRFieldDefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Semantic</em>'.
	 * @see crownking.edc.SFRFieldDefType#getSFRFieldSemantic()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EReference getSFRFieldDefType_SFRFieldSemantic();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see crownking.edc.SFRFieldDefType#getAccess()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Access();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see crownking.edc.SFRFieldDefType#getBegin()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getCname <em>Cname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cname</em>'.
	 * @see crownking.edc.SFRFieldDefType#getCname()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Cname();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.SFRFieldDefType#getDesc()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see crownking.edc.SFRFieldDefType#getEnd()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_End();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Impl</em>'.
	 * @see crownking.edc.SFRFieldDefType#getImpl()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Impl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getIshidden <em>Ishidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ishidden</em>'.
	 * @see crownking.edc.SFRFieldDefType#getIshidden()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Ishidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getIsidehidden <em>Isidehidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isidehidden</em>'.
	 * @see crownking.edc.SFRFieldDefType#getIsidehidden()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Isidehidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getIsindirect <em>Isindirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isindirect</em>'.
	 * @see crownking.edc.SFRFieldDefType#getIsindirect()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Isindirect();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getIslanghidden <em>Islanghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islanghidden</em>'.
	 * @see crownking.edc.SFRFieldDefType#getIslanghidden()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Islanghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getIslnaghidden <em>Islnaghidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Islnaghidden</em>'.
	 * @see crownking.edc.SFRFieldDefType#getIslnaghidden()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Islnaghidden();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getIsvolatile <em>Isvolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isvolatile</em>'.
	 * @see crownking.edc.SFRFieldDefType#getIsvolatile()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Isvolatile();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see crownking.edc.SFRFieldDefType#getMask()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Mask();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getMclr <em>Mclr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mclr</em>'.
	 * @see crownking.edc.SFRFieldDefType#getMclr()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Mclr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getModsrc <em>Modsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modsrc</em>'.
	 * @see crownking.edc.SFRFieldDefType#getModsrc()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Modsrc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.SFRFieldDefType#getName()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getNzsize <em>Nzsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzsize</em>'.
	 * @see crownking.edc.SFRFieldDefType#getNzsize()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Nzsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getNzwidth <em>Nzwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nzwidth</em>'.
	 * @see crownking.edc.SFRFieldDefType#getNzwidth()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Nzwidth();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see crownking.edc.SFRFieldDefType#getOffset()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getPor <em>Por</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Por</em>'.
	 * @see crownking.edc.SFRFieldDefType#getPor()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Por();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldDefType#getRegionidref <em>Regionidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionidref</em>'.
	 * @see crownking.edc.SFRFieldDefType#getRegionidref()
	 * @see #getSFRFieldDefType()
	 * @generated
	 */
	EAttribute getSFRFieldDefType_Regionidref();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SFRFieldSemanticType <em>SFR Field Semantic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR Field Semantic Type</em>'.
	 * @see crownking.edc.SFRFieldSemanticType
	 * @generated
	 */
	EClass getSFRFieldSemanticType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldSemanticType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.SFRFieldSemanticType#getValue()
	 * @see #getSFRFieldSemanticType()
	 * @generated
	 */
	EAttribute getSFRFieldSemanticType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldSemanticType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see crownking.edc.SFRFieldSemanticType#getDesc()
	 * @see #getSFRFieldSemanticType()
	 * @generated
	 */
	EAttribute getSFRFieldSemanticType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRFieldSemanticType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see crownking.edc.SFRFieldSemanticType#getWhen()
	 * @see #getSFRFieldSemanticType()
	 * @generated
	 */
	EAttribute getSFRFieldSemanticType_When();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SFRModeListType <em>SFR Mode List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR Mode List Type</em>'.
	 * @see crownking.edc.SFRModeListType
	 * @generated
	 */
	EClass getSFRModeListType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRModeListType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.SFRModeListType#getMixed()
	 * @see #getSFRModeListType()
	 * @generated
	 */
	EAttribute getSFRModeListType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRModeListType#getSFRMode <em>SFR Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Mode</em>'.
	 * @see crownking.edc.SFRModeListType#getSFRMode()
	 * @see #getSFRModeListType()
	 * @generated
	 */
	EReference getSFRModeListType_SFRMode();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRModeListType#getStimpcfiles <em>Stimpcfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimpcfiles</em>'.
	 * @see crownking.edc.SFRModeListType#getStimpcfiles()
	 * @see #getSFRModeListType()
	 * @generated
	 */
	EAttribute getSFRModeListType_Stimpcfiles();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRModeListType#getStimregfiles <em>Stimregfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimregfiles</em>'.
	 * @see crownking.edc.SFRModeListType#getStimregfiles()
	 * @see #getSFRModeListType()
	 * @generated
	 */
	EAttribute getSFRModeListType_Stimregfiles();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRModeListType#getStimscl <em>Stimscl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimscl</em>'.
	 * @see crownking.edc.SFRModeListType#getStimscl()
	 * @see #getSFRModeListType()
	 * @generated
	 */
	EAttribute getSFRModeListType_Stimscl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRModeListType#getStimtype <em>Stimtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimtype</em>'.
	 * @see crownking.edc.SFRModeListType#getStimtype()
	 * @see #getSFRModeListType()
	 * @generated
	 */
	EAttribute getSFRModeListType_Stimtype();

	/**
	 * Returns the meta object for class '{@link crownking.edc.SFRModeType <em>SFR Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFR Mode Type</em>'.
	 * @see crownking.edc.SFRModeType
	 * @generated
	 */
	EClass getSFRModeType();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRModeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see crownking.edc.SFRModeType#getMixed()
	 * @see #getSFRModeType()
	 * @generated
	 */
	EAttribute getSFRModeType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link crownking.edc.SFRModeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see crownking.edc.SFRModeType#getGroup()
	 * @see #getSFRModeType()
	 * @generated
	 */
	EAttribute getSFRModeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRModeType#getAdjustPoint <em>Adjust Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Adjust Point</em>'.
	 * @see crownking.edc.SFRModeType#getAdjustPoint()
	 * @see #getSFRModeType()
	 * @generated
	 */
	EReference getSFRModeType_AdjustPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link crownking.edc.SFRModeType#getSFRFieldDef <em>SFR Field Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SFR Field Def</em>'.
	 * @see crownking.edc.SFRModeType#getSFRFieldDef()
	 * @see #getSFRModeType()
	 * @generated
	 */
	EReference getSFRModeType_SFRFieldDef();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.SFRModeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see crownking.edc.SFRModeType#getId()
	 * @see #getSFRModeType()
	 * @generated
	 */
	EAttribute getSFRModeType_Id();

	/**
	 * Returns the meta object for class '{@link crownking.edc.StimInfoType <em>Stim Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stim Info Type</em>'.
	 * @see crownking.edc.StimInfoType
	 * @generated
	 */
	EClass getStimInfoType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.StimInfoType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.StimInfoType#getValue()
	 * @see #getStimInfoType()
	 * @generated
	 */
	EAttribute getStimInfoType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.StimInfoType#getStimpcfiles <em>Stimpcfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimpcfiles</em>'.
	 * @see crownking.edc.StimInfoType#getStimpcfiles()
	 * @see #getStimInfoType()
	 * @generated
	 */
	EAttribute getStimInfoType_Stimpcfiles();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.StimInfoType#getStimregfiles <em>Stimregfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimregfiles</em>'.
	 * @see crownking.edc.StimInfoType#getStimregfiles()
	 * @see #getStimInfoType()
	 * @generated
	 */
	EAttribute getStimInfoType_Stimregfiles();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.StimInfoType#getStimscl <em>Stimscl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimscl</em>'.
	 * @see crownking.edc.StimInfoType#getStimscl()
	 * @see #getStimInfoType()
	 * @generated
	 */
	EAttribute getStimInfoType_Stimscl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.StimInfoType#getStimtype <em>Stimtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stimtype</em>'.
	 * @see crownking.edc.StimInfoType#getStimtype()
	 * @see #getStimInfoType()
	 * @generated
	 */
	EAttribute getStimInfoType_Stimtype();

	/**
	 * Returns the meta object for class '{@link crownking.edc.TestMemTraitsType <em>Test Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Mem Traits Type</em>'.
	 * @see crownking.edc.TestMemTraitsType
	 * @generated
	 */
	EClass getTestMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.TestMemTraitsType#getValue()
	 * @see #getTestMemTraitsType()
	 * @generated
	 */
	EAttribute getTestMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.TestMemTraitsType#getLocsize()
	 * @see #getTestMemTraitsType()
	 * @generated
	 */
	EAttribute getTestMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.TestMemTraitsType#getWordimpl()
	 * @see #getTestMemTraitsType()
	 * @generated
	 */
	EAttribute getTestMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.TestMemTraitsType#getWordinit()
	 * @see #getTestMemTraitsType()
	 * @generated
	 */
	EAttribute getTestMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.TestMemTraitsType#getWordsafe()
	 * @see #getTestMemTraitsType()
	 * @generated
	 */
	EAttribute getTestMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.TestMemTraitsType#getWordsize()
	 * @see #getTestMemTraitsType()
	 * @generated
	 */
	EAttribute getTestMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.TestZoneType <em>Test Zone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Zone Type</em>'.
	 * @see crownking.edc.TestZoneType
	 * @generated
	 */
	EClass getTestZoneType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestZoneType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.TestZoneType#getValue()
	 * @see #getTestZoneType()
	 * @generated
	 */
	EAttribute getTestZoneType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestZoneType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.TestZoneType#getBeginaddr()
	 * @see #getTestZoneType()
	 * @generated
	 */
	EAttribute getTestZoneType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestZoneType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.TestZoneType#getEndaddr()
	 * @see #getTestZoneType()
	 * @generated
	 */
	EAttribute getTestZoneType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.TestZoneType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.TestZoneType#getRegionid()
	 * @see #getTestZoneType()
	 * @generated
	 */
	EAttribute getTestZoneType_Regionid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.UserIDMemTraitsType <em>User ID Mem Traits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User ID Mem Traits Type</em>'.
	 * @see crownking.edc.UserIDMemTraitsType
	 * @generated
	 */
	EClass getUserIDMemTraitsType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDMemTraitsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.UserIDMemTraitsType#getValue()
	 * @see #getUserIDMemTraitsType()
	 * @generated
	 */
	EAttribute getUserIDMemTraitsType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDMemTraitsType#getLocsize <em>Locsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locsize</em>'.
	 * @see crownking.edc.UserIDMemTraitsType#getLocsize()
	 * @see #getUserIDMemTraitsType()
	 * @generated
	 */
	EAttribute getUserIDMemTraitsType_Locsize();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDMemTraitsType#getWordimpl <em>Wordimpl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordimpl</em>'.
	 * @see crownking.edc.UserIDMemTraitsType#getWordimpl()
	 * @see #getUserIDMemTraitsType()
	 * @generated
	 */
	EAttribute getUserIDMemTraitsType_Wordimpl();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDMemTraitsType#getWordinit <em>Wordinit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordinit</em>'.
	 * @see crownking.edc.UserIDMemTraitsType#getWordinit()
	 * @see #getUserIDMemTraitsType()
	 * @generated
	 */
	EAttribute getUserIDMemTraitsType_Wordinit();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDMemTraitsType#getWordsafe <em>Wordsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsafe</em>'.
	 * @see crownking.edc.UserIDMemTraitsType#getWordsafe()
	 * @see #getUserIDMemTraitsType()
	 * @generated
	 */
	EAttribute getUserIDMemTraitsType_Wordsafe();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDMemTraitsType#getWordsize <em>Wordsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wordsize</em>'.
	 * @see crownking.edc.UserIDMemTraitsType#getWordsize()
	 * @see #getUserIDMemTraitsType()
	 * @generated
	 */
	EAttribute getUserIDMemTraitsType_Wordsize();

	/**
	 * Returns the meta object for class '{@link crownking.edc.UserIDSectorType <em>User ID Sector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User ID Sector Type</em>'.
	 * @see crownking.edc.UserIDSectorType
	 * @generated
	 */
	EClass getUserIDSectorType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.UserIDSectorType#getValue()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getBeginaddr <em>Beginaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginaddr</em>'.
	 * @see crownking.edc.UserIDSectorType#getBeginaddr()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Beginaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getEndaddr <em>Endaddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endaddr</em>'.
	 * @see crownking.edc.UserIDSectorType#getEndaddr()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Endaddr();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getIssection <em>Issection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issection</em>'.
	 * @see crownking.edc.UserIDSectorType#getIssection()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Issection();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getRegionid <em>Regionid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regionid</em>'.
	 * @see crownking.edc.UserIDSectorType#getRegionid()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Regionid();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getSectiondesc <em>Sectiondesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectiondesc</em>'.
	 * @see crownking.edc.UserIDSectorType#getSectiondesc()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Sectiondesc();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.UserIDSectorType#getSectionname <em>Sectionname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sectionname</em>'.
	 * @see crownking.edc.UserIDSectorType#getSectionname()
	 * @see #getUserIDSectorType()
	 * @generated
	 */
	EAttribute getUserIDSectorType_Sectionname();

	/**
	 * Returns the meta object for class '{@link crownking.edc.VDDType <em>VDD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDD Type</em>'.
	 * @see crownking.edc.VDDType
	 * @generated
	 */
	EClass getVDDType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VDDType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.VDDType#getValue()
	 * @see #getVDDType()
	 * @generated
	 */
	EAttribute getVDDType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VDDType#getMaxdefaultvoltage <em>Maxdefaultvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxdefaultvoltage</em>'.
	 * @see crownking.edc.VDDType#getMaxdefaultvoltage()
	 * @see #getVDDType()
	 * @generated
	 */
	EAttribute getVDDType_Maxdefaultvoltage();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VDDType#getMaxvoltage <em>Maxvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxvoltage</em>'.
	 * @see crownking.edc.VDDType#getMaxvoltage()
	 * @see #getVDDType()
	 * @generated
	 */
	EAttribute getVDDType_Maxvoltage();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VDDType#getMindefaultvoltage <em>Mindefaultvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mindefaultvoltage</em>'.
	 * @see crownking.edc.VDDType#getMindefaultvoltage()
	 * @see #getVDDType()
	 * @generated
	 */
	EAttribute getVDDType_Mindefaultvoltage();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VDDType#getMinvoltage <em>Minvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minvoltage</em>'.
	 * @see crownking.edc.VDDType#getMinvoltage()
	 * @see #getVDDType()
	 * @generated
	 */
	EAttribute getVDDType_Minvoltage();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VDDType#getNominalvoltage <em>Nominalvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominalvoltage</em>'.
	 * @see crownking.edc.VDDType#getNominalvoltage()
	 * @see #getVDDType()
	 * @generated
	 */
	EAttribute getVDDType_Nominalvoltage();

	/**
	 * Returns the meta object for class '{@link crownking.edc.VirtualPinType <em>Virtual Pin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Pin Type</em>'.
	 * @see crownking.edc.VirtualPinType
	 * @generated
	 */
	EClass getVirtualPinType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VirtualPinType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.VirtualPinType#getValue()
	 * @see #getVirtualPinType()
	 * @generated
	 */
	EAttribute getVirtualPinType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VirtualPinType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see crownking.edc.VirtualPinType#getName()
	 * @see #getVirtualPinType()
	 * @generated
	 */
	EAttribute getVirtualPinType_Name();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VirtualPinType#getPpsval <em>Ppsval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ppsval</em>'.
	 * @see crownking.edc.VirtualPinType#getPpsval()
	 * @see #getVirtualPinType()
	 * @generated
	 */
	EAttribute getVirtualPinType_Ppsval();

	/**
	 * Returns the meta object for class '{@link crownking.edc.VPPType <em>VPP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPP Type</em>'.
	 * @see crownking.edc.VPPType
	 * @generated
	 */
	EClass getVPPType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VPPType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.VPPType#getValue()
	 * @see #getVPPType()
	 * @generated
	 */
	EAttribute getVPPType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VPPType#getDefaultvoltage <em>Defaultvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultvoltage</em>'.
	 * @see crownking.edc.VPPType#getDefaultvoltage()
	 * @see #getVPPType()
	 * @generated
	 */
	EAttribute getVPPType_Defaultvoltage();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VPPType#getMaxvoltage <em>Maxvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxvoltage</em>'.
	 * @see crownking.edc.VPPType#getMaxvoltage()
	 * @see #getVPPType()
	 * @generated
	 */
	EAttribute getVPPType_Maxvoltage();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.VPPType#getMinvoltage <em>Minvoltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minvoltage</em>'.
	 * @see crownking.edc.VPPType#getMinvoltage()
	 * @see #getVPPType()
	 * @generated
	 */
	EAttribute getVPPType_Minvoltage();

	/**
	 * Returns the meta object for class '{@link crownking.edc.WaitType <em>Wait Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait Type</em>'.
	 * @see crownking.edc.WaitType
	 * @generated
	 */
	EClass getWaitType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.WaitType#getValue()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cfg</em>'.
	 * @see crownking.edc.WaitType#getCfg()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getEedata <em>Eedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eedata</em>'.
	 * @see crownking.edc.WaitType#getEedata()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Eedata();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getErase <em>Erase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erase</em>'.
	 * @see crownking.edc.WaitType#getErase()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Erase();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getLverase <em>Lverase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lverase</em>'.
	 * @see crownking.edc.WaitType#getLverase()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Lverase();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getLvpgm <em>Lvpgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lvpgm</em>'.
	 * @see crownking.edc.WaitType#getLvpgm()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Lvpgm();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getPgm <em>Pgm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgm</em>'.
	 * @see crownking.edc.WaitType#getPgm()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Pgm();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WaitType#getUserid <em>Userid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Userid</em>'.
	 * @see crownking.edc.WaitType#getUserid()
	 * @see #getWaitType()
	 * @generated
	 */
	EAttribute getWaitType_Userid();

	/**
	 * Returns the meta object for class '{@link crownking.edc.WatchdogTimerType <em>Watchdog Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Watchdog Timer Type</em>'.
	 * @see crownking.edc.WatchdogTimerType
	 * @generated
	 */
	EClass getWatchdogTimerType();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WatchdogTimerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see crownking.edc.WatchdogTimerType#getValue()
	 * @see #getWatchdogTimerType()
	 * @generated
	 */
	EAttribute getWatchdogTimerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link crownking.edc.WatchdogTimerType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see crownking.edc.WatchdogTimerType#getMin()
	 * @see #getWatchdogTimerType()
	 * @generated
	 */
	EAttribute getWatchdogTimerType_Min();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdcFactory getEdcFactory();

} //EdcPackage

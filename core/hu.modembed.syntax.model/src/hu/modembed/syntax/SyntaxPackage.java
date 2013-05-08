/**
 */
package hu.modembed.syntax;

import hu.modembed.model.modembed.infrastructure.InfrastructurePackage;
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
 * @see hu.modembed.syntax.SyntaxFactory
 * @model kind="package"
 * @generated
 */
public interface SyntaxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "syntax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modembed.hu/syntax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "syntax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SyntaxPackage eINSTANCE = hu.modembed.syntax.impl.SyntaxPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.SyntaxModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.SyntaxModelImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getSyntaxModel()
	 * @generated
	 */
	int SYNTAX_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__DESCRIPTION = InfrastructurePackage.ROOT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__ORIGINS = InfrastructurePackage.ROOT_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__NAME = InfrastructurePackage.ROOT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__TERMINALS = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__RULES = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__START_ITEM = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL__IMPORT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_MODEL_FEATURE_COUNT = InfrastructurePackage.ROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.TerminalImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__DESCRIPTION = InfrastructurePackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__ORIGINS = InfrastructurePackage.NAMED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = InfrastructurePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REGEX = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__HIDE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REPLACE = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = InfrastructurePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.ReplaceImpl <em>Replace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.ReplaceImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getReplace()
	 * @generated
	 */
	int REPLACE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__SEARCH = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__REPLACE = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.RuleImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The feature id for the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NON_TERMINAL = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__BODY = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.RuleItemImpl <em>Rule Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.RuleItemImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getRuleItem()
	 * @generated
	 */
	int RULE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ITEM__DESCRIPTION = InfrastructurePackage.MO_DEMBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ITEM__ORIGINS = InfrastructurePackage.MO_DEMBED_ELEMENT__ORIGINS;

	/**
	 * The number of structural features of the '<em>Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ITEM_FEATURE_COUNT = InfrastructurePackage.MO_DEMBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.SyntaxItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.SyntaxItemImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getSyntaxItem()
	 * @generated
	 */
	int SYNTAX_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM__DESCRIPTION = RULE_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM__ORIGINS = RULE_ITEM__ORIGINS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM__OPTIONAL = RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM__MANY = RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.TerminalItemImpl <em>Terminal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.TerminalItemImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getTerminalItem()
	 * @generated
	 */
	int TERMINAL_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__DESCRIPTION = SYNTAX_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__ORIGINS = SYNTAX_ITEM__ORIGINS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__OPTIONAL = SYNTAX_ITEM__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__MANY = SYNTAX_ITEM__MANY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__FEATURE_NAME = SYNTAX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__TERMINAL = SYNTAX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM_FEATURE_COUNT = SYNTAX_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.NonTerminalItemImpl <em>Non Terminal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.NonTerminalItemImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getNonTerminalItem()
	 * @generated
	 */
	int NON_TERMINAL_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__DESCRIPTION = SYNTAX_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__ORIGINS = SYNTAX_ITEM__ORIGINS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__OPTIONAL = SYNTAX_ITEM__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__MANY = SYNTAX_ITEM__MANY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__FEATURE_NAME = SYNTAX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__NON_TERMINAL = SYNTAX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Terminal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM_FEATURE_COUNT = SYNTAX_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.PushImpl <em>Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.PushImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getPush()
	 * @generated
	 */
	int PUSH = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__DESCRIPTION = RULE_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__ORIGINS = RULE_ITEM__ORIGINS;

	/**
	 * The feature id for the '<em><b>Eclass URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__ECLASS_URI = RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__FEATURE_NAME = RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.modembed.syntax.impl.PopImpl <em>Pop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.modembed.syntax.impl.PopImpl
	 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getPop()
	 * @generated
	 */
	int POP = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP__DESCRIPTION = RULE_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Origins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP__ORIGINS = RULE_ITEM__ORIGINS;

	/**
	 * The number of structural features of the '<em>Pop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.SyntaxModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hu.modembed.syntax.SyntaxModel
	 * @generated
	 */
	EClass getSyntaxModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.syntax.SyntaxModel#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminals</em>'.
	 * @see hu.modembed.syntax.SyntaxModel#getTerminals()
	 * @see #getSyntaxModel()
	 * @generated
	 */
	EReference getSyntaxModel_Terminals();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.syntax.SyntaxModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see hu.modembed.syntax.SyntaxModel#getRules()
	 * @see #getSyntaxModel()
	 * @generated
	 */
	EReference getSyntaxModel_Rules();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.SyntaxModel#getStartItem <em>Start Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Item</em>'.
	 * @see hu.modembed.syntax.SyntaxModel#getStartItem()
	 * @see #getSyntaxModel()
	 * @generated
	 */
	EAttribute getSyntaxModel_StartItem();

	/**
	 * Returns the meta object for the reference list '{@link hu.modembed.syntax.SyntaxModel#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see hu.modembed.syntax.SyntaxModel#getImport()
	 * @see #getSyntaxModel()
	 * @generated
	 */
	EReference getSyntaxModel_Import();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see hu.modembed.syntax.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Terminal#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see hu.modembed.syntax.Terminal#getRegex()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Regex();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Terminal#isHide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide</em>'.
	 * @see hu.modembed.syntax.Terminal#isHide()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Hide();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.syntax.Terminal#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace</em>'.
	 * @see hu.modembed.syntax.Terminal#getReplace()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Replace();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.Replace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace</em>'.
	 * @see hu.modembed.syntax.Replace
	 * @generated
	 */
	EClass getReplace();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Replace#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search</em>'.
	 * @see hu.modembed.syntax.Replace#getSearch()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_Search();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Replace#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see hu.modembed.syntax.Replace#getReplace()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_Replace();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see hu.modembed.syntax.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Rule#getNonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Terminal</em>'.
	 * @see hu.modembed.syntax.Rule#getNonTerminal()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_NonTerminal();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.modembed.syntax.Rule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see hu.modembed.syntax.Rule#getBody()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Body();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.RuleItem <em>Rule Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Item</em>'.
	 * @see hu.modembed.syntax.RuleItem
	 * @generated
	 */
	EClass getRuleItem();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.SyntaxItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see hu.modembed.syntax.SyntaxItem
	 * @generated
	 */
	EClass getSyntaxItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.SyntaxItem#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see hu.modembed.syntax.SyntaxItem#isOptional()
	 * @see #getSyntaxItem()
	 * @generated
	 */
	EAttribute getSyntaxItem_Optional();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.SyntaxItem#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see hu.modembed.syntax.SyntaxItem#isMany()
	 * @see #getSyntaxItem()
	 * @generated
	 */
	EAttribute getSyntaxItem_Many();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.TerminalItem <em>Terminal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Item</em>'.
	 * @see hu.modembed.syntax.TerminalItem
	 * @generated
	 */
	EClass getTerminalItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.TerminalItem#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.modembed.syntax.TerminalItem#getFeatureName()
	 * @see #getTerminalItem()
	 * @generated
	 */
	EAttribute getTerminalItem_FeatureName();

	/**
	 * Returns the meta object for the reference '{@link hu.modembed.syntax.TerminalItem#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see hu.modembed.syntax.TerminalItem#getTerminal()
	 * @see #getTerminalItem()
	 * @generated
	 */
	EReference getTerminalItem_Terminal();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.NonTerminalItem <em>Non Terminal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Terminal Item</em>'.
	 * @see hu.modembed.syntax.NonTerminalItem
	 * @generated
	 */
	EClass getNonTerminalItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.NonTerminalItem#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.modembed.syntax.NonTerminalItem#getFeatureName()
	 * @see #getNonTerminalItem()
	 * @generated
	 */
	EAttribute getNonTerminalItem_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.NonTerminalItem#getNonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Terminal</em>'.
	 * @see hu.modembed.syntax.NonTerminalItem#getNonTerminal()
	 * @see #getNonTerminalItem()
	 * @generated
	 */
	EAttribute getNonTerminalItem_NonTerminal();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push</em>'.
	 * @see hu.modembed.syntax.Push
	 * @generated
	 */
	EClass getPush();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Push#getEclassURI <em>Eclass URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eclass URI</em>'.
	 * @see hu.modembed.syntax.Push#getEclassURI()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_EclassURI();

	/**
	 * Returns the meta object for the attribute '{@link hu.modembed.syntax.Push#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.modembed.syntax.Push#getFeatureName()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_FeatureName();

	/**
	 * Returns the meta object for class '{@link hu.modembed.syntax.Pop <em>Pop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop</em>'.
	 * @see hu.modembed.syntax.Pop
	 * @generated
	 */
	EClass getPop();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SyntaxFactory getSyntaxFactory();

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
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.SyntaxModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.SyntaxModelImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getSyntaxModel()
		 * @generated
		 */
		EClass SYNTAX_MODEL = eINSTANCE.getSyntaxModel();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_MODEL__TERMINALS = eINSTANCE.getSyntaxModel_Terminals();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_MODEL__RULES = eINSTANCE.getSyntaxModel_Rules();

		/**
		 * The meta object literal for the '<em><b>Start Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_MODEL__START_ITEM = eINSTANCE.getSyntaxModel_StartItem();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNTAX_MODEL__IMPORT = eINSTANCE.getSyntaxModel_Import();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.TerminalImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__REGEX = eINSTANCE.getTerminal_Regex();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__HIDE = eINSTANCE.getTerminal_Hide();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__REPLACE = eINSTANCE.getTerminal_Replace();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.ReplaceImpl <em>Replace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.ReplaceImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getReplace()
		 * @generated
		 */
		EClass REPLACE = eINSTANCE.getReplace();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__SEARCH = eINSTANCE.getReplace_Search();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__REPLACE = eINSTANCE.getReplace_Replace();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.RuleImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Non Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NON_TERMINAL = eINSTANCE.getRule_NonTerminal();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__BODY = eINSTANCE.getRule_Body();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.RuleItemImpl <em>Rule Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.RuleItemImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getRuleItem()
		 * @generated
		 */
		EClass RULE_ITEM = eINSTANCE.getRuleItem();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.SyntaxItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.SyntaxItemImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getSyntaxItem()
		 * @generated
		 */
		EClass SYNTAX_ITEM = eINSTANCE.getSyntaxItem();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ITEM__OPTIONAL = eINSTANCE.getSyntaxItem_Optional();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ITEM__MANY = eINSTANCE.getSyntaxItem_Many();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.TerminalItemImpl <em>Terminal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.TerminalItemImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getTerminalItem()
		 * @generated
		 */
		EClass TERMINAL_ITEM = eINSTANCE.getTerminalItem();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_ITEM__FEATURE_NAME = eINSTANCE.getTerminalItem_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_ITEM__TERMINAL = eINSTANCE.getTerminalItem_Terminal();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.NonTerminalItemImpl <em>Non Terminal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.NonTerminalItemImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getNonTerminalItem()
		 * @generated
		 */
		EClass NON_TERMINAL_ITEM = eINSTANCE.getNonTerminalItem();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_TERMINAL_ITEM__FEATURE_NAME = eINSTANCE.getNonTerminalItem_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Non Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_TERMINAL_ITEM__NON_TERMINAL = eINSTANCE.getNonTerminalItem_NonTerminal();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.PushImpl <em>Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.PushImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getPush()
		 * @generated
		 */
		EClass PUSH = eINSTANCE.getPush();

		/**
		 * The meta object literal for the '<em><b>Eclass URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__ECLASS_URI = eINSTANCE.getPush_EclassURI();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__FEATURE_NAME = eINSTANCE.getPush_FeatureName();

		/**
		 * The meta object literal for the '{@link hu.modembed.syntax.impl.PopImpl <em>Pop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.modembed.syntax.impl.PopImpl
		 * @see hu.modembed.syntax.impl.SyntaxPackageImpl#getPop()
		 * @generated
		 */
		EClass POP = eINSTANCE.getPop();

	}

} //SyntaxPackage
